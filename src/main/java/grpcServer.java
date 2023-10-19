import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class grpcServer {

    private static final Logger logger = Logger.getLogger(grpcServer.class.getName());

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(5000)
                .addService(new UserServiceImpl())
                .build();

        server.start();

        logger.info("Server Started at port no : " + server.getPort());

        // Gracefully shut down the server when the JVM is terminated
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                logger.info("Shutting down server...");
                server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                logger.warning("Server shutdown interrupted.");
            }
        }));

        server.awaitTermination();
    }
}
