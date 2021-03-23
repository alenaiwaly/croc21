package hw4;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;


public class main {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            throw new IllegalArgumentException("Не задан аргумент");
        }

        Path a = Paths.get(args[0]);

        try {
            final List<String> lines = Files.readAllLines(a, StandardCharsets.UTF_8);
            int count = 0;
            boolean isW = false;
            for (String line : lines) {
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) >= 1040 && line.charAt(i) <= 1103 || line.charAt(i) >= 65 && line.charAt(i) <= 90 || line.charAt(i) >= 97 && line.charAt(i) <= 122  ) {
                        if (!isW)
                            count++;
                        isW = true;
                    }
                    else {
                        isW = false;
                    }
                }
                isW = false;
            }
            System.out.println("Ans: " + count);
        } catch (IllegalArgumentException e){
            System.out.println("Ошибка доступа к файлу");
        }


    }
}
