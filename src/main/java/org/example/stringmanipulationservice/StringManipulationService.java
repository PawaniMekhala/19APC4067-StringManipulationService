package org.example.stringmanipulationservice;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public class StringManipulationService {
    @WebMethod
    public String reverseText(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    @WebMethod
    public int countCharacters(@WebParam(name = "input") String input) {
        if (input == null) {
            return 0;  // Avoid NullPointerException
        }
        return input.length();
    }

}
