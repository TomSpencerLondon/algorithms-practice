package com.codurance.algorithm_practice;

public class IPValidator {
    static boolean validate(String ip) {
        String[] array = ip.split("\\.");
        if (array.length != 4){
            return false;
        }

        for (String n : array){
            if(n.equals("")){
                return false;
            }
            if (n.charAt(0) == '0' && n.length() > 1) {
                return false;
            }

            if (n.matches("[0-9]*")){
                int number = Integer.parseInt(n);
                if (number > 255 || number < 0){
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;
    }
}
