package org.example.config;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.example.endPoint.DepartmentEndPoint;
import org.example.endPoint.EmployeeEndPoint;
import org.example.endPoint.ProjectEndPoint;
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
    @Bean
    public Server server1 (DepartmentEndPoint service) throws IOException {
        Server server= ServerBuilder.forPort(8088).addService(service).build();
        server.start();
        return server;
    }
    @Bean
    public Server server2 (ProjectEndPoint service) throws IOException {
        Server server= ServerBuilder.forPort(8089).addService(service).build();
        server.start();
        return server;
    }

}
