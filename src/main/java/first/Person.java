package first;

public class Person {
    String firstName;
    String lastName;
    boolean isCivServ; // гос.служащий
    int weight;

    public Person(String firstName, String lastName, boolean isCivServ, int weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isCivServ = isCivServ;
        this.weight = weight;
    }


    void eatDonat() {
        if (lastName == "Холмс" && firstName != "Майкрофт" || firstName == "Грегори")
            System.out.println("Угощайтесь пончиками, Шерлок, Грег!");
        else System.out.println("Майк, тебе не предлагаю.");
    }

    void eatPermission() {
        if (isCivServ == false)
            System.out.println("Шерлок: Я не ем во время расследований.");
        else if (isCivServ == true && weight >= 100)
            System.out.println("Майкрофт: Может со шпинатом есть?");
        else
            System.out.println("Грегори: *самозабвенные звуки жевания*");
    }



}

