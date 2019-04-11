/*
«начени€ примитивных типов данных в большинстве случаев инициализируютс€ с помощью литералов.
“ипы целочисленных литералов в Java:
 - дес€тичные 
 - восьмеричные 
 - шестнадцатеричные  
 - двоичные - начина€ с Java 7
¬се целочисленные литералы представл€ют значени€ int. 
≈сли значение литерала лежит в диапазоне byte, short или char, то его можно присвоить переменной этого типа без приведени€ типов.
ƒл€ создани€ литерала типа long, необходимо €вно указать компил€тору, дополнив литерал буквой 'l' или 'L'
*/

// Java program to illustrate the application of Integer literals 
public class Test { 
	public static void main(String[] args) 
	{ 
		// Decimal literals (Base 10) : In this form the allowed digits are 0-9.
		int a = 101;

		// в JDK 7 можно вставл€ть символы подчЄркивани€ дл€ облегчени€ чтени€ больших числовых литералов
		int x = 123_456_789;
		
		// Octal literals (Base 8) : In this form the allowed digits are 0-7.
		int b = 0100; // The octal number should be prefix with 0.

		// Hexa-decimal literals (Base 16) : In this form the allowed digits are 0-9 and characters are a-f.
		int c = 0xFace; // We can use both uppercase and lowercase characters. The hexa-decimal number should be prefix with 0X or 0x.

		// ¬ JDK 7 можно использовать целочисленные литералы в двоичной системе. ƒл€ этого нужно использовать префикс 0b или 0B
		int d = 0b1111;

		System.out.println(a); 
		System.out.println(x); 
		System.out.println(b); 
		System.out.println(c); 
		System.out.println(d); 
	} 
} 
