package HW7.Controller;

import HW7.Model.Calculator;

public interface CalculateInterface {
    Calculator additionNumbers(Calculator numberNew);

    Calculator subtractNumbers(Calculator numberNew);

    Calculator multiplyNumbers(Calculator numberNew);

    Calculator divideNumbers(Calculator numberNew);

    String toString();
}