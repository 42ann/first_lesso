package first;

public class Person {
    String firstName;
    String lastName;
    boolean jobType; // гос.служащий
    int weight;

    public Person(String firstName, String lastName, boolean jobType, int weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobType = jobType;
        this.weight = weight;
    }


    void eatDonat() {
        if (lastName == "Холмс" && firstName != "Майкрофт" || firstName == "Грегори")
            System.out.println("Угощайтесь пончиками, Шерлок, Грег!");
        else System.out.println("Майк, тебе не предлагаю.");
    }

    void eatPermission() {
        if (jobType == false)
            System.out.println("Шерлок: Я не ем во время расследований.");
        else if (jobType == true && weight >= 100)
            System.out.println("Майкрофт: Может со шпинатом есть?");
        else
            System.out.println("Грегори: *самозабвенные звуки жевания*");
    }

}

