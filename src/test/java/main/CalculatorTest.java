package main;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorTest {

  @Test(dataProvider = "calculatorValues")
  public void testAdd(String testName, int firstNumber, int secondNumber, int expectedResult) {

    Calculator calculator = new Calculator();
    int result = calculator.add(firstNumber, secondNumber);

    String message =
        String.format("wrong result of adding two numbers %d + %d", firstNumber, secondNumber);

    assertEquals(result, expectedResult, message);
  }

  @DataProvider(name = "calculatorValues")
  public Object[][] createCalculatorTestData() {
    return new Object[][] {
      {"Test case Id: 1.1", 0, 0, 0},
      {"Test case Id: 1.2", 3, 3, 6},
      {"Test case Id: 1.3", -3, -3, -6},
      {"Test case Id: 1.4", 3, -1, 2},
      {"Test case Id: 1.5", -3, 1, -2},
      {"Test case Id: 1.6", -2, -1, -3},
      {"Test case Id: 1.7", -1, -2, -3},
      {"Test case Id: 1.8", -3, 3, 0},
      {"Test case Id: 1.9", 3, 0, 3},
      {"Test case Id: 1.10", 0, 3, 3}
    };
  }
}
