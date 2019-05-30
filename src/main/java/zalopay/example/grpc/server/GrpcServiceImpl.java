package zalopay.example.grpc.server;

import io.grpc.stub.StreamObserver;
import zalopay.example.grpc.*;

public class GrpcServiceImpl extends GreetServiceGrpc.GreetServiceImplBase {

    @Override
    public void registerGreet(registerRequest request, StreamObserver<registerResponse> responseObserver){
        System.out.println(request);
        registerResponse.Builder response = registerResponse.newBuilder();
        response.setUsername(request.getUsername());
        response.setToken("ancnshskjshaushs");
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}
