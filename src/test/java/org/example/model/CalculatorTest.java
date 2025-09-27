package org.example.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    /*
    * Testes Desenvolvidos usando TDD, abaixo alguns links de apoio para conhecer mais sobre:
    * - TDD: https://www.youtube.com/watch?v=o_C_qxhPws4
    * - Given When Then e Arrange Act Assert: https://medium.com/@matheus.saraujo/testes-give-when-then-3bf3fef55f5e
    */

    private final Calculator calculator = new Calculator();

    @Test
    void givenTwoNumbers_whenAdd_thenReturnSum() {
        // Arrange
        double a = 2;
        double b = 3;

        // Act
        double result = calculator.add(a, b);

        // Assert
        assertEquals(5, result);
    }

    @Test
    void givenTwoNumbers_whenSubtract_thenReturnDifference() {
        assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    void givenTwoNumbers_whenMultiply_thenReturnProduct() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    // TODO: Implementar mais testes (divisão, divisão por zero, etc.
    /*
    // Teste para divisão

    // Teste para divisão por zero
    */
}
