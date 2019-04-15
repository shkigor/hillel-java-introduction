rem https://stackoverflow.com/questions/21044898/jar-c-option-does-not-seem-to-work
rem jar -cvf utils.jar -C src/main/java ua/ithillel/util/Utils.java

cd classes
jar -cfe ../hello1.jar ua.ithillel.javabasic.lesson1.HelloHillel ua/ithillel/javabasic/lesson1/HelloHillel.class ua/ithillel/util/Utils.class
rem jar -cfe ../hello1.jar ua.ithillel.javabasic.lesson1.HelloHillel *

cd ..
jar -cfe hello2.jar ua.ithillel.javabasic.lesson1.HelloHillel -C classes .