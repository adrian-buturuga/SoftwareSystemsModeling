package com.singleton;

public class ClassA {

    private final Logger logger = Logger.getInstance();

    public void logInformation() {
        logger.info("Logging info from ClassA");
    }

}
