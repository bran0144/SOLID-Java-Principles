package hr.logging;

import java.io.IOException;

public class ConsoleLogger {
    public void writeInfo(String msg) {
        System.out.println("Info: " + msg);
    }
    public void writeError(String msg, IOException e) {
        System.out.println("Error: " + msg + ";" + e);
    }
}
