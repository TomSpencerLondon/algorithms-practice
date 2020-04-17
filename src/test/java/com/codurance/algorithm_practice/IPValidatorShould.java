package com.codurance.algorithm_practice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IPValidatorShould {
    @ParameterizedTest
    @CsvSource({
            "192.168.0.1, true",
            "12.34.5.6, true",
            "0.23.25.0, true",
            "0.0.0.0, true",
            "255.255.255.255, true",
            "123.24.59.99, true",
            "192.168.123.456, false",
            "012.23.21.1, false",
            "12.34.56.oops, false",
            "1.2.3.4.5, false",
            "123.235.153.425, false"
    })
    void return_correct_result_for_given_ip_address(String ip, boolean result) {
        IPValidator ipValidator = new IPValidator();
        assertEquals(result, ipValidator.validate(ip));
    }

}
