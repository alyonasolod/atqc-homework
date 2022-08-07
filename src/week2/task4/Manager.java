package week2.task4;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Scanner;

public class Manager {
    private static Collection deviceManager = new Collection();
    public static final String DEVICE_COUNTER = "CURRENTLY ADDED DEVICES NUMBER: ";

    public static void printTotalDevices() {
        System.out.println(DEVICE_COUNTER + '\t' + deviceManager.size());
    }

    private static StateMachine mainMenu = StateMachine.MAIN_MENU;

    public static void main(String[] args) {


        while (mainMenu != StateMachine.EXIT) {
            switch (mainMenu) {
                case MAIN_MENU:
                    if (deviceManager.size() == 0) Controls.printDefaultMenu();
                    else {
                        Controls.printMainMenu();
                        printTotalDevices();
                    }
                    mainMenu = Controls.selectCommand(Controls.parseCommand());
                    break;
                case ADD_DEVICE_MANUALLY:
                    AddDevice.addDeviceManually(deviceManager);
                    printTotalDevices();
                    mainMenu = StateMachine.MAIN_MENU;
                    break;
                case ADD_DEVICE_AUTO:
                    AddDevice.addDeviceAuto(deviceManager);
                    printTotalDevices();
                    mainMenu = StateMachine.MAIN_MENU;
                    break;
                case VIEW_DEVICE_LIST_MAIN:
                    deviceManager.print();
                    mainMenu = StateMachine.MAIN_MENU;
                    break;
                case VIEW_DEVICE_LIST_SORTED_BY_DEFAULT:
                    Collections.sort(deviceManager.getDeviceList());
                    deviceManager.print();
                    mainMenu = StateMachine.MAIN_MENU;
                    break;
                case VIEW_DEVICE_LIST_SORTED_BY:
                    Controls.printFilterMenu();
                    deviceManager.sort(Controls.setFilter());
                    deviceManager.print();
                    mainMenu = StateMachine.MAIN_MENU;
                    break;
                case GET_PHONE_DETAILS_BY_INDEX:
                    System.out.println("Enter index of the device that you want to reach :");
                    Scanner s = new Scanner(System.in);
                    Phone device = deviceManager.getDevice(s.nextInt());
                    device.print();
                    mainMenu = StateMachine.MAIN_MENU;
                    break;
                default:
                    AddDevice.addDeviceManually(deviceManager);
                    printTotalDevices();
                    deviceManager.sort(Sorted.BY_SCREEN_SIZE);
                    for (Phone phone : deviceManager.getDeviceList()) {
                        phone.print();
                    }
                    break;

            }
        }

    }
}
