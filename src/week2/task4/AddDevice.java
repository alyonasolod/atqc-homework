package week2.task4;

import java.util.Scanner;

public class AddDevice {

    public static void addDeviceAuto(Collection devices) {
        devices.add(new Iphone("Iphone X / Lolita", "F17*****LK", "", 5.8, "1125x2436", "15.5", null, City.KYIV));
        devices.add(new Android("Google Pixel 5a", "357*******02", 6.34, "1080x2400", "12", null, City.DNIPRO, false));
        devices.add(new Iphone("Iphone 12", "DX*******XP", "000081******E", 6.1, "1170x2532", "15", "Employee A", City.DNIPRO));
        devices.add(new Iphone("iPhone 12 Pro Max Lada", "3547416******1", "", 6.7, "1284x2778", "15.5", "Tester B", City.CHERNIVTSY));
        devices.add(new Android("Samsung Galaxy J6", "36688******1", 5.6, "720x1480", "10", "Developer A", City.KYIV, false));
        devices.add(new Android("Samsung Galaxy A51 / Minori", "350678892*****1", 6.5, "1080x2400", "12", null, City.KAMYANSKE, true));
        devices.add(new Iphone("iPhone 8 Plus / Spark", "someimei", "someudid", 5.5, "1080x1920", "14.2", "Tester A", City.KAMYANSKE));
        devices.add(new Android("Samsung galaxy S9 / Black Panther", "testimei", 5.8, "1440x2960", "10", null, City.LUTSK, false));
    }
    public static City setCity(String enteredCity) {
        City city;
        try {
            city = City.valueOf(enteredCity.toUpperCase());
        } catch (IllegalArgumentException e) {
            city = City.DNIPRO;
        }
        return city;
    }

    public static void addDeviceManually(Collection devices) {
//String name, String imei, double displaySize, String resolution, String osVersion, String assignee, City city)
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter platform name (IOS/ANDROID): ");
        String platform = scanner.nextLine();
        System.out.println("Enter device model/name: ");
        String name = scanner.nextLine();
        System.out.println("Enter device imei: ");
        String imei = scanner.nextLine();
        System.out.println("Enter device display size in inches using . as separator");

        double displaySize =  Double.parseDouble(scanner.nextLine());
        System.out.println("Enter device resolution");
        String resolution = scanner.nextLine();
        System.out.println("Enter device OS Version");
        String osVersion = scanner.nextLine();

        System.out.println("Enter name of assignee(if none - enter null)");
        String assigneeScanResult = scanner.nextLine();
        String assignee = assigneeScanResult.equalsIgnoreCase("null") ? null : assigneeScanResult;
        System.out.println("Enter city where device is located");
        City city = setCity(scanner.nextLine());
        if (platform.equalsIgnoreCase("android")) {
            System.out.println("Enter true if device is rooted or false if it is not");
            boolean isRooted = scanner.nextBoolean();
            scanner.nextLine();
            devices.add(new Android(name, imei, displaySize, resolution, osVersion, assignee, city, isRooted));
        } else {
            System.out.println("Enter device UDID: ");
            String udid = scanner.nextLine();
            devices.add(new Iphone(name, imei, udid, displaySize, resolution, osVersion, assignee, city));
        }
        System.out.println("Device was added");

    }




}
