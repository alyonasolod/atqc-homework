package week2.task4;
/**
 * Ancestor-class that implements basic Phone methods
 */

public abstract class Phone implements Vibrate, Printable, Comparable<Phone> {
    protected String name;
    protected String imei;

    protected double displaySize;
    protected String resolution;
    protected String osVersion;
    protected String assignee;
    protected City city;


    public Phone(String name, String imei, double displaySize, String resolution, String osVersion, String assignee, City city) {
        this.name = name;
        this.imei = imei;
        this.displaySize = displaySize;
        this.resolution = resolution;
        this.osVersion = osVersion;
        this.assignee = assignee;
        this.city = city;

    }

    public double getDisplaySize() {
        return this.displaySize;
    }

    public String getAssignee() {
        return this.assignee;
    }

    public String getImei() {
        return this.imei;
    }

    public String getName() {
        return this.name;
    }

    public City getCity() {
        return this.city;
    }

    public String getOs() {
        return this.osVersion;
    }
    //мне кажется, что логичнее не пихать эту проверку в отдельный интерфейс
    public boolean isAvailable() {
        return this.assignee == null;
    }

    // сортирует по типу девайса потом по имени девайса потом по операционной системе.
    // айос присваиваем индекс ниже андроида, он будет отображаться выше по списку
    //сортировка по имени будет от A-Z
    //сортировка  по оси - от старой к более новой, но сейчас это работает только с двухзначными значениями оси (10+), для mvp и так сойдет хД
    @Override
    public int compareTo(Phone another) {
        boolean thisDeviceIsAndroid = this instanceof Android;
        boolean anotherDeviceIsAndroid = another instanceof Android;

        if (thisDeviceIsAndroid && !anotherDeviceIsAndroid) {
            return 1;
        } else if (!thisDeviceIsAndroid && anotherDeviceIsAndroid) {
            return -1;
        }
        int compareByName = this.getName().compareToIgnoreCase(another.getName());
        if (compareByName != 0) {
            return compareByName;
        }
        return this.getOs().compareTo(another.getOs());

    }

    protected abstract void printSpecificData();

    public void print() {

        System.out.println("OS:\t" + this.osVersion);
        System.out.println("DISPLAY:\t" + this.displaySize + ", " + this.resolution);
        System.out.println("IMEI:\t" + this.imei);
        printSpecificData();
        System.out.println("ASSIGNED TO:\t" + (this.assignee != null ? this.assignee : "Unassigned"));
        System.out.println("IS AVAILABLE?\t" + isAvailable());
    }

}
