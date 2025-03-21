package org.example.stringmanipulationservice;

import jakarta.xml.ws.Endpoint;

public class StringManipulationPublisher {
    public static void main(String[] args) {
//        String url = "http://localhost:8080/StringManipulationService";
        String url = "http://localhost:8081/StringManipulationService";

        Endpoint.publish(url, new StringManipulationService());
        System.out.println("SOAP Web Service running at " + url);
    }
}
