package week2.task4;

import java.time.temporal.ValueRange;
import java.util.Scanner;

/*
    MAIN_MENU(0),
    ADD_DEVICE_MANUALLY(1),
    ADD_DEVICE_AUTO(2),
    VIEW_DEVICE_LIST_MAIN(3),
    VIEW_DEVICE_LIST_SORTED_BY_DEFAULT(4),
    VIEW_DEVICE_LIST_SORTED_BY(5),
    GET_PHONE_DETAILS_BY_INDEX(6),
    EXIT(7);

 */

public class Controls {
    public static final String MAIN_MENU_TITLE = "DEVICE MANAGER APP  :";

    public static final String MAIN_MENU_OPTION_1 = "Enter 1 to manually add new device to device collection";
    public static final String MAIN_MENU_OPTION_2 = "Enter 2 import test devices to the collection automatically ";
    public static final String MAIN_MENU_OPTION_3 = "Enter 3 to display list of devices ";
    public static final String MAIN_MENU_OPTION_4 = "Enter 4 to sort device list by default ";
    public static final String MAIN_MENU_OPTION_5 = "Enter 5 to sort device list by specific filter ";
    public static final String MAIN_MENU_OPTION_6 = "Enter 6 to display Phone details with a fancy styling ";
    public static final String MAIN_MENU_OPTION_7 = "Enter 7 to EXIT";

    public static final String SORT_OPTIONS_MENU_1 = "Enter BY_SCREEN_SIZE to display list sorted screen size ";
    public static final String SORT_OPTIONS_MENU_2 = "Enter BY_NAME to display list sorted by device name ";
    public static final String SORT_OPTIONS_MENU_3 = "Enter  BY_OS_VERSION to display list sorted by os version ";

    static void printDefaultMenu(){
        System.out.println(MAIN_MENU_TITLE);
        System.out.println(MAIN_MENU_OPTION_1);
        System.out.println(MAIN_MENU_OPTION_2);
    }

    static void printMainMenu() {
        System.out.println(MAIN_MENU_TITLE);
        System.out.println(MAIN_MENU_OPTION_1);
        System.out.println(MAIN_MENU_OPTION_2);
        System.out.println(MAIN_MENU_OPTION_3);
        System.out.println(MAIN_MENU_OPTION_4);
        System.out.println(MAIN_MENU_OPTION_5);
        System.out.println(MAIN_MENU_OPTION_6);
        System.out.println(MAIN_MENU_OPTION_7);
    }

    static void printFilterMenu(){
        System.out.println(SORT_OPTIONS_MENU_1);
        System.out.println(SORT_OPTIONS_MENU_2);
        System.out.println(SORT_OPTIONS_MENU_3);
    }

    public static int parseCommand() {
        ValueRange range = java.time.temporal.ValueRange.of(1, 8);
        while (true) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                int i =scanner.nextInt();
                if (range.isValidIntValue(i)) {
                    return i;
                } else {
                    printError();
                }
            } else {
                printError();
            }
        }
    }

    private static void printError() {
        System.out.println('\n' + "Please, type  number of the option you choose to proceed");
    }

    public static StateMachine selectCommand(int command) {

        for (StateMachine sm : StateMachine.values()) {
            if (sm.index == command) {
                return sm;
            }
        }
        return StateMachine.EXIT;
    }

    public static Sorted setFilter() {
        Sorted filterBy;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter index of desired element");
        String selectedOption = scanner.nextLine();
        try {
            filterBy = Sorted.valueOf(selectedOption.toUpperCase());
        } catch (IllegalArgumentException e) {
            filterBy = Sorted.BY_SCREEN_SIZE;
        }
        return filterBy;
    }





}
