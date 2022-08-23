package Exercises23;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerClass {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger(LoggerClass.class.getName());

        logger.setLevel(Level.FINE);

        logger.log(Level.INFO, "This is INFO log level message");
    }
}
