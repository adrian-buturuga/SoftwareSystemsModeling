package com.singleton;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.time.Instant;

public class Logger {

    private static Logger instance = null;
    private PrintWriter printWriter;

    private Logger() {
        System.out.println("Creating first instance");
        final URL fileURL = Logger.class.getClassLoader().getResource("log.txt");
        try {
            final FileWriter fw = new FileWriter(fileURL.getPath());
            printWriter = new PrintWriter(fw, true);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        } else {
            System.out.println("Reuse existing instance");
        }
        return instance;
    }

    public synchronized void info(String info) {
        String line = "[Timestamp: " + getTime() + "] " + "[Info: " + info + "]";
        printWriter.println(line);
    }

    private Instant getTime() {
        return Instant.now();
    }

}
