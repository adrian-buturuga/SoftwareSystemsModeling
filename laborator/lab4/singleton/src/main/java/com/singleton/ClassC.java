package com.singleton;

public class ClassC {

    private final Logger logger = Logger.getInstance();

    public void logInformation() {
        logger.info("Logging info from ClassC");
    }

}
