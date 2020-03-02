package lesson05.lambdas;

public class ExpressionUtils {

  static boolean isPositive(int el) {
    return el >= 0;
  }

  static boolean isNegative(int el) {
    return !isPositive(el);
  }
}