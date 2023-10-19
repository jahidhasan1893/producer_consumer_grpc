import com.x.grpc.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;


import java.util.Scanner;
import java.util.logging.Logger;

public class grpcClient {

    private static final Logger logger = Logger.getLogger(grpcClient.class.getName());

    public static void main(String[] args) {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 5000).usePlaintext().build();
        UserServiceGrpc.UserServiceBlockingStub blockingStub = UserServiceGrpc.newBlockingStub(managedChannel);
        UserServiceGrpc.UserServiceStub asyncStub = UserServiceGrpc.newStub(managedChannel);

        Scanner scanner = new Scanner(System.in);
        int option;

        while (true) {
            displayMenu();
            option = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (option) {
                case 1:
                    registerUser(blockingStub, scanner);
                    break;
                case 2:
                    login(blockingStub, scanner);
                    break;
                case 3:
                    setProfile(asyncStub, scanner);
                    break;
                case 4:
                    viewProfile(blockingStub, scanner);
                    break;
                case 5:
                    updateProfile(asyncStub, scanner);
                    break;
                case 6:
                    // Exit the loop and stop the program
                    managedChannel.shutdown();
                    return;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }
    }

    public static void displayMenu() {
        System.out.println("ENTER YOUR CHOICE (1-6):");
        System.out.println("1. REGISTER");
        System.out.println("2. LOGIN");
        System.out.println("3. SET PROFILE");
        System.out.println("4. VIEW PROFILE");
        System.out.println("5. UPDATE PROFILE");
        System.out.println("6. EXIT");
        System.out.print("ENTER CHOICE >> ");
    }

    private static void registerUser(UserServiceGrpc.UserServiceBlockingStub blockingStub, Scanner scanner) {
        System.out.print("USERNAME: ");
        String username = scanner.nextLine();
        System.out.print("PASSWORD: ");
        String password = scanner.nextLine();
        System.out.print("EMAIL: ");
        String email = scanner.nextLine();

        User.RegisterRequest request = User.RegisterRequest.newBuilder()
                .setUsername(username)
                .setPassword(password)
                .setEmail(email)
                .build();

        User.RegisterResponse response = blockingStub.register(request);
        logger.info("Response Message: " + response.getMessage());
    }

    private static void login(UserServiceGrpc.UserServiceBlockingStub blockingStub, Scanner scanner) {
        System.out.print("USERNAME: ");
        String username = scanner.nextLine();
        System.out.print("PASSWORD: ");
        String password = scanner.nextLine();

        User.LoginRequest request = User.LoginRequest.newBuilder()
                .setUsername(username)
                .setPassword(password)
                .build();

        User.LoginResponse response = blockingStub.login(request);
        logger.info("Response Message: " + response.getMessage());
    }

    private static void setProfile(UserServiceGrpc.UserServiceStub asyncStub, Scanner scanner) {
        System.out.print("PROFILE DATA: ");
        String profileData = scanner.nextLine();

        User.SetProfileRequest request = User.SetProfileRequest.newBuilder()
                .setProfileData(profileData)
                .build();

        StreamObserver<User.SetProfileResponse> responseObserver = new StreamObserver<User.SetProfileResponse>() {
            @Override
            public void onNext(User.SetProfileResponse response) {
                logger.info("Response Message: " + response.getMessage());
            }

            @Override
            public void onError(Throwable throwable) {
                logger.severe("Error during profile setting: " + throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                logger.info("Profile setting completed.");
            }
        };

        asyncStub.setProfile(request, responseObserver);
    }


    private static void viewProfile(UserServiceGrpc.UserServiceBlockingStub blockingStub, Scanner scanner) {
        User.ViewProfileRequest request = User.ViewProfileRequest.newBuilder().build();
        User.ViewProfileResponse response = blockingStub.viewProfile(request);
        logger.info("Profile Data: " + response.getProfileData());
    }

    private static void updateProfile(UserServiceGrpc.UserServiceStub asyncStub, Scanner scanner) {
        System.out.print("UPDATED PROFILE DATA: ");
        String updatedProfileData = scanner.nextLine();

        User.UpdateProfileRequest request = User.UpdateProfileRequest.newBuilder()
                .setUpdatedProfileData(updatedProfileData)
                .build();

        StreamObserver<User.UpdateProfileResponse> responseObserver = new StreamObserver<User.UpdateProfileResponse>() {
            @Override
            public void onNext(User.UpdateProfileResponse response) {
                logger.info("Response Message: " + response.getMessage());
            }

            @Override
            public void onError(Throwable throwable) {
                logger.severe("Error during profile update: " + throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                logger.info("Profile update completed.");
            }
        };

        asyncStub.updateProfile(request, responseObserver);
    }
}
