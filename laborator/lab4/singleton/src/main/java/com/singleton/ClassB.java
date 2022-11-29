package com.singleton;

public class ClassB {

    private final Logger logger = Logger.getInstance();

    public void logInformation() {
        logger.info("Logging info from ClassB");
    }

}
