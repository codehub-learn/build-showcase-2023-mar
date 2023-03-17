package gr.codelearn;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Main {

    private static Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.err.println("error");
        // logger <- faster, write to files
        logger.debug("Debug log message");
        logger.info("Info log message");
        logger.error("Error log message");
    }
}