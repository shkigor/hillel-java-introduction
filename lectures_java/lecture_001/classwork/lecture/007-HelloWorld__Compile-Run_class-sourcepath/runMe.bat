ECHO Remove .class files
rem del classes\hello\HelloFirstApp.class
rem del classes\ua\ithillel\javabasic\lesson1\HelloSecondApp.class

del classes\hello /Q
del classes\ua /Q

rem ECHO Compile and run HelloFirstApp
rem javac -d classes hello/HelloFirstApp.java
rem java hello.HelloFirstApp

ECHO Compile and run HelloSecondApp
javac -d classes -sourcepath src/main/java src/main/java/ua/ithillel/javabasic/lesson1/HelloSecondApp.java

cd classes
java ua.ithillel.javabasic.lesson1.HelloSecondApp