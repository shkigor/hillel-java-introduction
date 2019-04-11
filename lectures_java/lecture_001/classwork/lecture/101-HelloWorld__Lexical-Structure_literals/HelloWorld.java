public class HelloWorld {

	public static void main(String[] args) {
		int iSimpeInt; // объявили идентификатор iSimpleInt
		short _demoShort; //идентификатор _demoShort
		//int 5Int; не правильный идентификатор int
		boolean истина; // объявили идентификатор истина
		double demo_Double; //идиентификатор demo_Double
		float demoFloat; //идентификатор demoFloat
		char om; //объявили идентификатор om
		String myString; //идентификатор myString
		
		//инициализируем переменные допустимыми значениями
		//при помощи литералов Java
		iSimpeInt = 55;
		_demoShort = 32_000;
		истина = true;
		demo_Double = 55_555.55_555;
		demoFloat = 77.77f; //инициализация float
		om = '\u0950';
		myString = "Привет Мир!";

		//выводим значения переменных на консоль
		System.out.println("iSimpleInt="+iSimpeInt);
		System.out.println("_demoShort="+_demoShort);
		System.out.println("истина="+истина);
		System.out.println("demo_Double="+demo_Double);
		System.out.println("demoFloat="+demoFloat);
		System.out.println("om="+om);
		System.out.println("myString="+myString);
	}
}
