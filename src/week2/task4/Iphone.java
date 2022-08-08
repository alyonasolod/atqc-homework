package week2.task4;

/**
 * Child that can not be inherited
 * Implements specific IOS device fields
 */
public final class Iphone extends Phone  {
    private String udid;


    public Iphone(String name, String imei,String udid, double displaySize, String resolution, String osVersion, String assignee, City city) {
        super(name, imei,  displaySize, resolution, osVersion, assignee, city);
        this.udid=udid;
    }
    public void print(){
        System.out.println("IPHONE:\t"+this.getName());
        super.print();
    }

    @Override
    protected void printSpecificData() {
        System.out.println("UDID:\t"+this.udid);
    }
    @Override
    public String toString(){
        return "IPHONE "+this.name+" OS "+this.osVersion+" DISPLAY "+this.displaySize+"\""+this.resolution;
    }
}