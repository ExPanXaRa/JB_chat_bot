package JetBrains;

import JetBrains.bot.AidBot;
import JetBrains.bot.Bot;
import JetBrains.quiz.IndexQuizService;
import JetBrains.quiz.QuizService;

import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final Consumer<String> output = System.out::println;
        final String name = "Aid";
        final int birthYear = 2018;
        final QuizService service = new IndexQuizService();


        Bot bot = new AidBot(scanner, output, name, birthYear, service);
        bot.run();

        scanner.close();
    }
}