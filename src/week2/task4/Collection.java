package week2.task4;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection  {
    private final List<Phone> devices= new ArrayList<>();
    public void add(Phone phone){
        devices.add(phone);
    }
    public List<Phone> getDeviceList() {
        return devices;
    }

    //дефолтная сортировка, реализованная в абастрактном родительском классе
    public void sort() {
        Collections.sort(devices);
    }
    // сортировка с использованием компаратора
    public void sort(Sorted sorted){
        devices.sort(new DeviceComparator(sorted));
    }
    public void print(){
        int i=1;
        for (Phone p: devices){
            System.out.println("#  "+i+" "  +p.toString());
            i++;
        }
        System.out.println("TOTAL:\t"+devices.size());
    }

    public int size(){
        return devices.size();
    }

    public Phone getDevice(int index){

        return devices.get(index);
    }
}
