package ru.netology.sqr;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldCalculate200and300() {
        SQRService service = new SQRService();
        int num1 = 200;
        int num2 = 300;
        int expected = 3;

        int actual = service.shouldQuantitySqr(num1, num2);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForDownMeaning() {

        SQRService service = new SQRService();
        int num1 = 100;
        int num2 = 200;
        int expected = 5;

        int actual = service.shouldQuantitySqr(num1, num2);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForUpMeaning() {
        SQRService service = new SQRService();
        int num1 = 9_500;
        int num2 = 10_000;
        int expected = 2;

        int actual = service.shouldQuantitySqr(num1, num2);

        assertEquals(expected, actual);
    }
}