package utils;

import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class DataGenerator {
    private static final String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrsqtuvwxyz";
    private static final String NUMBER = "1234567890";

    private DataGenerator() {
    }

    public static String generateString(int length) {
        StringBuilder stringBuilder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            stringBuilder.append(CHARS.charAt(randomInteger(CHARS.length())));
        }
        return stringBuilder.toString();
    }

    public static String generateNumberString(int length) {
        StringBuilder stringBuilder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            stringBuilder.append(NUMBER.charAt(randomInteger(NUMBER.length())));
        }
        return stringBuilder.toString();
    }

    public static int randomInteger(int fromInclusive, int toExclusive) {
        return ThreadLocalRandom.current().nextInt(fromInclusive, toExclusive);
    }

    public static int randomInteger() {
        return ThreadLocalRandom.current().nextInt();
    }

    public static int randomInteger(int toExclusive) {
        return randomInteger(0, toExclusive);
    }

    public static <T> T getRandomElement(List<T> list) {
        return list.get(randomInteger(list.size()));
    }

    public static String getRandomIntegerToString(int fromInclusive, int toExclusive) {
        return String.valueOf(randomInteger(fromInclusive, toExclusive));
    }

    public static String getRandomIntegerToString(int toExclusive) {
        return String.valueOf(randomInteger(0, toExclusive));
    }

    public static String emailGenerator(int length) {
        return email("user", length);
    }

    public static String email(String prefix, int length) {
        return prefix + "-" + generateNumberString(length) + "@example.com";
    }

    public static String email(int length) {
        return email("user", length);
    }

    public static String email(String prefix) {
        return email(prefix, 8);
    }

    public static String email() {
        return email(8);
    }

    public static String generateMailTemplate() {
        return """
                     <html lang="en">
                     <title>qa</title>
                <body>""" + generateUuid() + "</body></html>";
    }

    public static String generateIpAddress() {
        return random3DigitNumber() + "." + random3DigitNumber() +
                "." + random3DigitNumber() + "." + random3DigitNumber();
    }

    public static int random3DigitNumber() {
        return new Random().nextInt((255 - 1) + 1) + 1;
    }

    public static String generateUuid() {
        return UUID.randomUUID().toString();
    }

    public static String generateRandomUserId() {
        return "UA" + generateString(10);
    }

    public static <T extends Enum<?>> T randomEnum(Class<T> clazz) {
        return clazz.getEnumConstants()[randomInteger(clazz.getEnumConstants().length)];
    }
}
