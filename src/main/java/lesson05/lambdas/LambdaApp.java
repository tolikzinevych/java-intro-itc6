package lesson05.lambdas;

public class LambdaApp {

  public static void main(String[] args) {
    int[] array = {-6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6};

    Expression exp1 = el -> el%2 == 0;
    Expression exp2 = ExpressionUtils::isNegative;
    Expression exp3 = ExpressionUtils::isPositive;

    System.out.println(sumOf(array, exp1));
    System.out.println(sumOf(array, exp2));
    System.out.println(sumOf(array, exp3));
    System.out.println(sumOf(array, el -> el%2 != 0));

    // old implementation
    System.out.println(sumOf(array, new Expression() {
      @Override
      public boolean isTrue(int el) {
        return el > 5;
      }
    }));
  }

  private static int sumOf(int[] array, Expression criterion) {
    int sum = 0;
    for (int el : array) {
      if (criterion.isTrue(el)) {
        sum += el;
      }
    }
    return sum;
  }
}