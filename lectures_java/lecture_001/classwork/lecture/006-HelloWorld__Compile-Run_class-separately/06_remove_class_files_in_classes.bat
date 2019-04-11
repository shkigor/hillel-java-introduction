ECHO -- Remove .class files in classes folder

del /Q classes\hello\HelloApp.class classes\com\company\lesson1\MyFirstApp.class
rem del classes\com\company\lesson1\MyFirstApp.class /Q

rmdir /Q classes\hello
rmdir /Q /S classes\com
