package com.kodilla.patterns.singleton;

public class Logger {
    private static Logger loggerInstance = null;
    private String lastLog = "";

    private Logger() {
    }

    public void log(String log) {
        this.lastLog = log;
        System.out.println("Log: [" + lastLog + "]");
    }

    public static Logger getInstance() {
        if (loggerInstance == null) {
            synchronized (Logger.class) {
                if (loggerInstance == null) {
                    loggerInstance = new Logger();
                }
            }
            loggerInstance = new Logger();
        }
        return loggerInstance;
    }

    public String getLastLog() {
        return lastLog;
    }
}
