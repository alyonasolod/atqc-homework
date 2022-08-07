package week2.task3;

public class Cat extends Animal {
    private double distance = 0;
    private static int totalCats;

    public Cat() {
        this(0);
    }

    public Cat(double distance) {
        this.distance = distance;
        totalCats++;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    /* void move() не по условию дз - просто мне такая имплементация кажется красивее хД . все равно является примером override метода родительского класса
     если при инициализации объекта был вызван конструктор public Cat(double distance) и передано расстояние > 5 - чтож, тогда выведем первое сообщение :(
     если же был использован конструктор Cat() или в конструкторе public Cat(double distance) засетили дистанцию <=5- тогда выведем второе сообщение */
    public void move() {
        if (distance > 5) System.out.println("я устала :(");
        else System.out.println("мявкаю и бегаю");
    }

    public void move(double distance) {
        if (distance > 5)
            System.out.println("я устала :(");

    }

    public int getNumberOfCatsCreated() {
        return totalCats;
    }
}
