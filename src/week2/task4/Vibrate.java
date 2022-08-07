package week2.task4;
// пример имплементации интерфейса
public interface Vibrate {
    default void vibrate(boolean value){
        System.out.println(value==true?"Is vibrating":"Is not vibrating");
    }


}
