package week2.task4;

import java.util.Comparator;

/**
 * Decided to implement a single comparator that uses a defined ENUM value as a sorting param
 * the construction that was specified in the task description ' devices.sort(Sorted.ByScreenSize) ' looks odd to me
 */
public class DeviceComparator implements Comparator<Phone> {
    private Sorted sortBy;

    DeviceComparator(Sorted sortBy) {
        this.sortBy = sortBy;
    }

    @Override
    public int compare(Phone phone1, Phone phone2) {
        switch (sortBy) {
            case BY_NAME:
                return compareByName(phone1, phone2);
            case BY_OS_VERSION:
                return compareByOsVersion(phone1, phone2);
            case BY_SCREEN_SIZE:
                return compareByDisplaySize(phone1, phone2);
            default:
                return 0;
        }

    }

    private int compareByDisplaySize(Phone phone1, Phone phone2) {
         return Double.compare(phone1.getDisplaySize(), phone2.getDisplaySize());
    }

    private int compareByName(Phone phone1, Phone phone2) {
        return phone1.getName().compareToIgnoreCase(phone2.getName());
    }

    private int compareByOsVersion(Phone phone1, Phone phone2) {
        return phone1.getOs().compareToIgnoreCase(phone2.getOs());
    }


}
