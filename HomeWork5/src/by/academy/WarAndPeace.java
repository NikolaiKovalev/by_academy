package by.academy;

import java.nio.file.Files;
import java.nio.file.Paths;

public class WarAndPeace {

    public static String readFileAsString(String fileName) throws Exception {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }
}
