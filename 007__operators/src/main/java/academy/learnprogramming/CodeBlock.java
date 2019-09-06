package academy.learnprogramming;

public class CodeBlock {

    public static void main(String[] args) {
        // доступен только x
        int x = 5;
        {
            // доступны x и y
            int y = 7;
            y += x;
        }

//        ++y; // Error: cannot find symbol y

        ++x; //x тут доступен






        int z = 22;

        {
//            int z = 33; // Error: variable z is already defined in method main(java.lang.String[])
        }

        ++z;
    }
}
