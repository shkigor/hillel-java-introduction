package academy.learnprogramming.recursion;

public class FindSolutionRecursion {

    static int target = 31;

    public static void main(String[] args) {
        System.out.println(find(1, "1"));
    }

    public static String find(int current, String history) {
        if (current == target) {
            return history;
        } else if (current > target) {
            return null;
        } else {
            String found = find(current + 5, "(" + history + " + 5)");
            if (found == null) {
                return find(current * 3 , "(" + history + " * 3)");
            } else {
                return find(current + 5, "(" + history + " + 5)");
            }
        }
    }
}
