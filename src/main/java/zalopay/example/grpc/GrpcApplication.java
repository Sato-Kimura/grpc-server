package zalopay.example.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zalopay.example.grpc.server.GrpcServiceImpl;

import java.io.IOException;

@SpringBootApplication
public class GrpcApplication {

    public static void main(String[] args) throws IOException, InterruptedException {
        SpringApplication.run(GrpcApplication.class, args);
        grpcServer();
    }
    public static void grpcServer() throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(9002)
                .addService(new GrpcServiceImpl()).build();
        System.out.println("Starting server...");
        server.start();
        System.out.println("Server started!");
        server.awaitTermination();

    }

}
