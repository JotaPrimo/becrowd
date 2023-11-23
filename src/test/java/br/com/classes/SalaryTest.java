package br.com.classes;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class SalaryTest {
    public static Collection<Object[]> dataProvider() {
        return Arrays.asList(new Object[][]{
                {25, 100, 5.50, "NUMBER = 25\n SALARY = U$ 550.00"},
                {1, 200, 20.50, "NUMBER = 1\n SALARY = U$ 4100.00"},
                {6, 145, 15.55, "NUMBER = 6\n SALARY = U$ 2254.75"},
        });
    }

    @MethodSource("dataProvider")
    @ParameterizedTest
    public void its_should_be_equals(int employNumber, int hoursWorked, double valueForHourWorked, String resultExpected) {
        // cenario
        Salary salary = new Salary(employNumber, hoursWorked, valueForHourWorked);

        // acao
        String result = salary.calcularSalario();

        // asserção
        Assert.assertEquals(resultExpected, result);
    }
}