package Hospital.utils;

import java.time.LocalDate;
import java.util.UUID;
import java.util.regex.Pattern;

public final class HelperUtils {

    private HelperUtils() {}

    public static boolean isNull(Object obj) { return obj == null; }
    public static boolean isNull(String str) { return str == null || str.trim().isEmpty(); }
    public static boolean isNotNull(Object obj) { return !isNull(obj); }
    public static boolean isNotNull(String str) { return !isNull(str); }

    public static boolean isValidString(String str) { return !isNull(str); }
    public static boolean isValidString(String str, int min) { return !isNull(str) && str.length() >= min; }
    public static boolean isValidString(String str, int min, int max) { return !isNull(str) && str.length() >= min && str.length() <= max; }
    public static boolean isValidString(String str, String regex) { return !isNull(str) && Pattern.compile(regex).matcher(str).matches(); }

    public static String generateId() { return UUID.randomUUID().toString(); }
    public static String generateId(String prefix) { return prefix + "-" + UUID.randomUUID().toString().substring(0, 8); }
    public static String generateId(String prefix, int length) { return prefix + "-" + UUID.randomUUID().toString().substring(0, Math.min(length, 36)); }
    public static String generateId(String prefix, String suffix) { return prefix + "-" + UUID.randomUUID().toString().substring(0, 8) + "-" + suffix; }

    public static boolean isValidDate(LocalDate date) { return date != null; }
    public static boolean isValidDate(String dateStr) { try { LocalDate.parse(dateStr); return true; } catch (Exception e) { return false; } }
    public static boolean isValidDate(LocalDate date, LocalDate min, LocalDate max) { return date != null && !date.isBefore(min) && !date.isAfter(max); }
    public static boolean isFutureDate(LocalDate date) { return date != null && date.isAfter(LocalDate.now()); }
    public static boolean isPastDate(LocalDate date) { return date != null && date.isBefore(LocalDate.now()); }
    public static boolean isToday(LocalDate date) { return date != null && date.equals(LocalDate.now()); }

    public static boolean isValidNumber(int num, int min, int max) { return num >= min && num <= max; }
    public static boolean isValidNumber(double num, double min, double max) { return num >= min && num <= max; }
    public static boolean isPositive(int num) { return num > 0; }
    public static boolean isPositive(double num) { return num > 0; }
    public static boolean isNegative(int num) { return num < 0; }
    public static boolean isNegative(double num) { return num < 0; }

    public static boolean isValidAge(int age) { return age >= 0 && age <= 120; }
    public static boolean isValidAge(LocalDate dob) { return dob != null && !dob.isAfter(LocalDate.now()); }
}