package org.example.stringmanipulationservice;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public class StringManipulationService {
    @WebMethod
    public String reverseText(@WebParam(name = "input") String input) {
        if (input == null || input.isEmpty()) {
            return "";  // Prevent null errors
        }
        return new StringBuilder(input).reverse().toString();
    }

    @WebMethod
    public int countCharacters(@WebParam(name = "input") String input) {
        if (input == null || input.isEmpty()) {
            return 0;  // Avoid NullPointerException
        }
        return input.length();
    }

}
