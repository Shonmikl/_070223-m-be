package org.example._2023_10_10;

import org.apache.logging.log4j.*;

public class LogClass {
    private static final Logger logger = LogManager.getLogger(LogClass.class);
    public static void main(String[] args) {
        logger.info("INFO Yaml");
        logger.warn("WARN Yaml");
        logger.error("ERROR Yaml");
    }
}