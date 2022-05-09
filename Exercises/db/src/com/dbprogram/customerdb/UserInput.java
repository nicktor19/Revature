package com.dbprogram.customerdb;

import java.util.Scanner;

public class UserInput {
    private Scanner scan = new Scanner(System.in); //create private scanner

    private Scanner getScan() {
        return scan;
    }

    /**
     * Can be used to return one word.
     * @return
     */
    public static String UserInputSingle() {
        return new UserInput().getScan().next();
    }

    //add additional methods for larger inputs needed for other programs.
}
