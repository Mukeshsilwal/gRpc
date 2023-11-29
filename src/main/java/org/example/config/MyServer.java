package org.example.config;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.example.endPoint.EmployeeEndPoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class MyServer {

    @Bean
    public Server server(EmployeeEndPoint service) throws IOException {
        Server server= ServerBuilder.forPort(8087).addService(service).build();
        server.start();
        return server;
    }

}
