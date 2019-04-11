package hello;
// import ua.ithillel.javabasic.lesson1.HelloSecondApp;

public class HelloFirstApp {
    public static void main(String[] args) {
        System.out.println("Hello from First App!");

        // как ужасно выгдядят наши классы без import-a
	ua.ithillel.javabasic.lesson1.HelloSecondApp.main(new String[0]);
	ua.ithillel.javabasic.lesson1.HelloSecondApp helloSecondApp = new ua.ithillel.javabasic.lesson1.HelloSecondApp();

	// HelloSecondApp.main(new String[0]);
	// HelloSecondApp helloSecondApp = new HelloSecondApp();
    }
}
