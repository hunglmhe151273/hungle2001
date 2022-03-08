package model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author PCDELL
 */
public class Validation {

    public static String getString(int min, int max, String mess) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println(mess);
            String value;
            try {
                value = sc.nextLine();
                if (value.length() > min && value.length() < max) {
                    return value;
                } else {
                    throw new Exception("Nhap qua gioi han chuoi");
                }
            } catch (Exception e) {
                System.out.println("Nhap sai format chuoi");
            }
        }
    }

    public static Date getDate(String format, String mess) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println(mess);
            String value;
            try {
                value = sc.nextLine();
                Date date1 = new SimpleDateFormat(format).parse(value);
                return date1;
            } catch (Exception e) {
                System.out.println("Nhap sai format chuoi ngay!");
            }
        }
    }

    public static int getInt(int min, int max, String mess) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println(mess);
            int value;
            try {
                value = sc.nextInt();
                if (value < min || value > max) {
                    throw new Exception();
                } else {
                    return value;
                }
            } catch (Exception e) {
                System.out.println("Nhap sai format Available");
            }
        }
    }

    public static String getpatternAddress(String pattern, String mess) {

        while (true) {
            System.out.println(mess);
            Scanner sc = new Scanner(System.in);
            String emailAddress = sc.nextLine();
            Pattern regexPattern = Pattern.compile(pattern);
            Matcher regMatcher = regexPattern.matcher(emailAddress);
            if (regMatcher.matches()) {
                return emailAddress;
            } else {
                System.out.println("Nhap sai format. Hay nhap lai");
            }
        }
    }
    public static Date getDate2(String format, String input) {
        while (true) {
            String value = input;
            try {
                Date date1 = new SimpleDateFormat(format).parse(value);
                return date1;
            } catch (Exception e) {
                System.out.println("Nhap sai format chuoi ngay!");
            }
        }
    }
}
