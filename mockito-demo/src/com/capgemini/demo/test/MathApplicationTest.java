
package com.capgemini.demo.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.capgemini.demo.MathApplication;
import com.capgemini.demo.service.CalculatorService;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTest {

@Mock
private CalculatorService service;

@InjectMocks
MathApplication application = new MathApplication(service);
@Before
public void setUp() {
MockitoAnnotations.initMocks(this);
}
@Test
public void testPerformAdditionWithTwoPositiveIntegers() {
when(service.addition(6, 4)).thenReturn(10);
assertEquals(10, application.performAddition(6, 4));
}
@Test
public void testPerformAdditionWithTwoNegativeIntegers() {
when(service.addition(-6, -4)).thenReturn(-10);
assertEquals(-10, application.performAddition(-6, -4));
}
@Test
public void testPerformAdditionWithOnePositiveOneNegativeIntegers() {
when(service.addition(6, -4)).thenReturn(2);
assertEquals(2, application.performAddition(6, -4));
}
@Test
public void testPerformAdditionWithOnePositiveOneZeroIntegers() {
when(service.addition(2,0)).thenReturn(2);
assertEquals(2, application.performAddition(2, 0));
}
@Test
public void testPerformAdditionWithOneNegativeOneZeroIntegers() {
when(service.addition(-2,0)).thenReturn(-2);
assertEquals(-2, application.performAddition(-2, 0));
}
@Test
public void testPerformSubtractionWithTwoPositiveIntegers() {
when(service.subtraction(10,8)).thenReturn(2);
assertEquals(2, application.performSubtraction(10, 8));
}
@Test
public void testPerformSubtractionWithTWoNegativeIntegers() {
when(service.subtraction(-2,-2)).thenReturn(-4);
assertEquals(-4, application.performSubtraction(-2, -2));
}
@Test
public void testPerformSubtractionWithOnePositiveOneNegativeIntegers() {
when(service.subtraction(6,-2)).thenReturn(-4);
assertEquals(-4, application.performSubtraction(6, -2));
}
@Test
public void testPerformSubtractionWithOneNegativeOneZeroIntegers() {
when(service.subtraction(-4,0)).thenReturn(-4);
assertEquals(-4, application.performSubtraction(-4, 0));
}
@Test
public void testPerformSubtractionWithOnePositiveOneZeroIntegers() {
when(service.subtraction(14,0)).thenReturn(14);
assertEquals(14, application.performSubtraction(14, 0));
}
@Test
public void testPerformMultiplicationTwoPositiveIntegers() {
when(service.multiplication(3,2)).thenReturn(6);
assertEquals(6, application.performMultiplication(3, 2));
}
@Test
public void testPerformMultiplicationTwoNegativeIntegers() {
when(service.multiplication(-3,-2)).thenReturn(6);
assertEquals(6, application.performMultiplication(-3, -2));
}
@Test
public void testPerformMultiplicationOnePositiveOneNegativeIntegers() {
when(service.multiplication(3,-2)).thenReturn(-6);
assertEquals(-6, application.performMultiplication(3, -2));
}
@Test
public void testPerformDivisionTwoPositiveIntegers() {
when(service.division(10,5)).thenReturn(0);
assertEquals(0, application.performDivision(10, 5));
}
@Test
public void testPerformDivisionTwoNegativeIntegers() {
when(service.division(-10,-5)).thenReturn(0);
assertEquals(0, application.performDivision(-10, -5));
}
@Test
public void testPerformDivisionOnePositiveOneNegativeIntegers() {
when(service.division(10,-5)).thenReturn(-0);
assertEquals(-0, application.performDivision(10, -5));
}

@Test(expected = ArithmeticException.class)
public void testPerformDivisionWithDivisorZero() {
doThrow(new ArithmeticException("/ by zero")).when(service).division(10, 0);
application.performDivision(10, 0); 
}
@Test
public void testPerformSquarePositiveIntegers() {
when(service.square(2)).thenReturn(4L);
assertEquals(4L, application.findSquare(2));
}
@Test
public void testPerformSquareNegativeIntegers() {
when(service.square(-2)).thenReturn(4L);
assertEquals(4L, application.findSquare(-2));
}
@Test
public void testFindFactorialWithPositiveInteger() throws InvalidInputException {
when(service.factorial(5)).thenReturn(120L);
assertEquals(120, application.findFactorial(5));
}
@Test(expected = InvalidInputException.class)
public void testFindFactorialWithNegativeeInteger() throws InvalidInputException {

doThrow(new InvalidInputException("invalid negative")).when(service).factorial(-5);
application.findFactorial(-5);
}
}
