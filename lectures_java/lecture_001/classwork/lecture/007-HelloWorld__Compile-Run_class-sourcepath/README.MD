������� ��������� �������������� HelloSecondApp.java ���, ��� ������ ��� �����:
```
006-HelloWorld__Compile-Run_class-sourcepath>javac -d classes src/main/java/ua/ithillel/javabasic/lesson1/HelloSecondApp.java
src\main\java\ua\ithillel\javabasic\lesson1\HelloSecondApp.java:2: error: package hello does not exist
import hello.HelloFirstApp;
            ^
src\main\java\ua\ithillel\javabasic\lesson1\HelloSecondApp.java:6: error: cannot find symbol
        HelloFirstApp.main(new String[0]);
        ^
  symbol:   variable HelloFirstApp
  location: class HelloSecondApp
2 errors
```

������ ��������� ��-�� ����, ��� ���� javac � ����, ��� ����� HelloSecondApp.java, �� �� �� ����, ��� ��������� HelloFirstApp.java.

��� ������� ���� �������� ������������ ���� sourcepath, ������� ��������� ��������, � ������� ���������� ������ ������ �������� �������� ������.

� ����� ������ ��� src/main/java

��������� ������ ����������:
```
javac -d classes -sourcepath src/main/java src/main/java/ua/ithillel/javabasic/lesson1/HelloSecondApp.java
```

������ ��������� ������������� ��� ������. �������� ��������, ��� javac ����� ������������� ���� HelloFirstApp.java, �� ������� ��������� ���������������� ���� HelloSecondApp.java.
