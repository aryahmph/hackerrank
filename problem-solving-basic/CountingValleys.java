package hackerrank;

public class CountingValleys {
  public static int countingValleys(int steps, String path) {
    int valleys = 0;
    int count = 0;

    for (int i = 0; i < steps; i++) {
      count = (path.charAt(i) == 'U') ? ++count : --count;

      if (path.charAt(i) == 'U' && count == 0)
        ++valleys;
    }

    return valleys;
  }
}
