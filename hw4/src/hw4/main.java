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
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class main {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            throw new IllegalArgumentException("Не задан аргумент");
        }

        Path a = Paths.get(args[0]);

        try {
            final List<String> lines = Files.readAllLines(a, StandardCharsets.UTF_8);
            int count = 0;
            for (String line : lines) {
                Pattern ptrn = Pattern.compile("\\w+", Pattern.UNICODE_CHARACTER_CLASS);
                Matcher mtch = ptrn.matcher(line);
                while (mtch.find()) {
                    count++;
                }

            }
            System.out.println("Ans: " + count);
        } catch (IOException e){
            System.out.println("Ошибка доступа к файлу");
        }


    }
}
