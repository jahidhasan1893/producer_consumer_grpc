import com.x.grpc.*;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.bouncycastle.crypto.generators.BCrypt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserServiceImpl extends UserServiceGrpc.UserServiceImplBase {

    private static final String DB_URL = "jdbc:mysql://localhost/your_database_name";
    private static final String DB_USERNAME = "your_database_username";
    private static final String DB_PASSWORD = "your_database_password";

    @Override
    public void register(User.RegisterRequest request, StreamObserver<User.RegisterResponse> responseObserver) {
        String username = request.getUsername();
        String password = request.getPassword();
        String email = request.getEmail();

        // Connect to the MySQL database
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD)) {
            // Check if the username is already taken
            String checkUserQuery = "SELECT username FROM user_authentication WHERE username=?";
            PreparedStatement checkUserStatement = connection.prepareStatement(checkUserQuery);
            checkUserStatement.setString(1, username);
            ResultSet checkUserResultSet = checkUserStatement.executeQuery();

            if (checkUserResultSet.next()) {
                // Username already taken
                responseObserver.onError(Status.ALREADY_EXISTS
                        .withDescription("Username already taken")
                        .asRuntimeException());
                return;
            }

            // Insert the new user into the database
            String registerQuery = "INSERT INTO user_authentication(username, password, email) VALUES(?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(registerQuery);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password); // You may want to hash the password
            preparedStatement.setString(3, email);

            int insertedRows = preparedStatement.executeUpdate();

            if (insertedRows == 1) {
                User.RegisterResponse response = User.RegisterResponse.newBuilder()
                        .setMessage("Registration successful")
                        .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            } else {
                // Registration failed
                responseObserver.onError(Status.INTERNAL
                        .withDescription("Registration failed")
                        .asRuntimeException());
            }
        } catch (Exception ex) {
            // Handle database connection or other exceptions
            responseObserver.onError(Status.INTERNAL
                    .withDescription("Internal Server Error")
                    .asRuntimeException());
        }
    }

    @Override
    public void login(User.LoginRequest request, StreamObserver<User.LoginResponse> responseObserver) {
        String username = request.getUsername();
        String password = request.getPassword();

        // Connect to the MySQL database
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD)) {
            String loginQuery = "SELECT password_hash FROM user_authentication WHERE username=?";
            PreparedStatement preparedStatement = connection.prepareStatement(loginQuery);
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String storedPassword = resultSet.getString("password");

                // Verify the password using BCrypt
                if (password.equals(storedPassword)) {
                    User.LoginResponse response = User.LoginResponse.newBuilder()
                            .setMessage("Login successful")
                            .build();
                    responseObserver.onNext(response);
                    responseObserver.onCompleted();
                } else {
                    // Password does not match
                    responseObserver.onError(Status.INVALID_ARGUMENT
                            .withDescription("Invalid username or password")
                            .asRuntimeException());
                }
            } else {
                // User not found
                responseObserver.onError(Status.NOT_FOUND
                        .withDescription("User not found")
                        .asRuntimeException());
            }
        } catch (Exception ex) {
            // Handle database connection or other exceptions
            responseObserver.onError(Status.INTERNAL
                    .withDescription("Internal Server Error")
                    .asRuntimeException());
        }
    }

    @Override
    public void setProfile(User.SetProfileRequest request, StreamObserver<User.SetProfileResponse> responseObserver) {
        // Implement the set profile logic here
        String username = request.getUsername();
        String profileData = request.getProfileData();

        // You can add your code to set or update the user's profile data here

        User.SetProfileResponse response = User.SetProfileResponse.newBuilder()
                .setMessage("Profile data set successfully")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void viewProfile(User.ViewProfileRequest request, StreamObserver<User.ViewProfileResponse> responseObserver) {
        // Implement the view profile logic here
        String username = request.getUsername();

        // You can add your code to retrieve the user's profile data here

        User.ViewProfileResponse response = User.ViewProfileResponse.newBuilder()
                .setProfileData("User's profile data goes here")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void updateProfile(User.UpdateProfileRequest request, StreamObserver<User.UpdateProfileResponse> responseObserver) {
        // Implement the update profile logic here
        String username = request.getUsername();
        String updatedProfileData = request.getUpdatedProfileData();

        // You can add your code to update the user's profile data here

        User.UpdateProfileResponse response = User.UpdateProfileResponse.newBuilder()
                .setMessage("Profile data updated successfully")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
