package first;

public class Donut {
    public static void main(String[] args) {
        Person sherlock = new Person("Шерлок", "Холмс", false, 70);
        Person lestrade = new Person("Грегори", "Лестрейд", true, 99);
        Person mycroft = new Person("Майкрофт", "Холмс", true, 100);
        sherlock.eatDonat();
        mycroft.eatDonat();
        sherlock.eatPermission();
        mycroft.eatPermission();
        lestrade.eatPermission();
        int donut = 5;
        while (donut > -1) {
            System.out.println("Пончиков в комнате: " + donut);
            --donut;
        }
        if (donut < 1 ){
            System.out.println("Майкрофт: ...");
        }
    }
}