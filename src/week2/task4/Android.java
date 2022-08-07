package week2.task4;

public class Android extends Phone {
    private boolean isRooted;

    public Android(String name, String imei, double displaySize, String resolution, String osVersion, String assignee, City city) {
        this(name, imei, displaySize, resolution, osVersion, assignee, city, false);
    }

    public Android(String name, String imei, double displaySize, String resolution, String osVersion, String assignee, City city, boolean isRooted) {
        super(name, imei, displaySize, resolution, osVersion, assignee, city);
        this.isRooted = isRooted;
    }

    public void print(){
        System.out.println("ANDROID:\t"+this.getName());
        super.print();
    }

    @Override
    protected void printSpecificData() {
        System.out.println("IS_ROOTED?:\t"+(this.isRooted?"IS ROOTED":"IS NOT ROOTED"));
    }
    @Override
    public String toString(){
         return "ANDROID "+this.name+" OS "+this.osVersion+" DISPLAY "+this.displaySize+"\""+this.resolution;
    }
}
