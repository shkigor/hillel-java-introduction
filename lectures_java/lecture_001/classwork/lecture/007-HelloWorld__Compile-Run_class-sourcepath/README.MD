Давайте попробуем скомпилировать HelloSecondApp.java так, как делали это ранее:
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

Ошибки произошли из-за того, что хотя javac и знал, где найти HelloSecondApp.java, но он не знал, где находится HelloFirstApp.java.

Для решения этой проблемы используется ключ sourcepath, который указывает каталоги, в которых компилятор должен искать иерархию исходных файлов.

В нашем случае это src/main/java

Перепишем строку компиляции:
```
javac -d classes -sourcepath src/main/java src/main/java/ua/ithillel/javabasic/lesson1/HelloSecondApp.java
```

Теперь программа компилируется без ошибок. Обратите внимание, что javac также скомпилировал файл HelloFirstApp.java, на который ссылается скомпилированный файл HelloSecondApp.java.
