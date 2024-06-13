import java.util.ArrayList;
import java.util.Scanner;

import core.Translator;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> program = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String lines = scanner.nextLine();
            program.add(lines);
        }

        String stringProgram = String.join("\n", program);

        Translator lppInterpreter = new Translator(stringProgram);

        System.out.println(
                lppInterpreter.translate()
        );

        scanner.close();
        program.clear();
    }
}