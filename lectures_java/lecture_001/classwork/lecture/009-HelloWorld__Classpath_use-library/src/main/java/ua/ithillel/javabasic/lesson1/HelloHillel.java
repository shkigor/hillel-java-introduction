package ua.ithillel.javabasic.lesson1;

import org.apache.commons.lang3.StringUtils;
import ua.ithillel.util.Utils;

public class HelloHillel {
    public static void main(String[] args) {
        Utils.println("Hello Hillel!");
        Utils.println("isEmpty = " + Boolean.toString(StringUtils.isEmpty("")));
    }
}
