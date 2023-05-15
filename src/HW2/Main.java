package HW2;

public class Main {
    public static void main(String[] args) {
        Author tolstoi = new Author("Лев", "Толстой");
        Author pushkin = new Author("Александр", "Пушкин");

        Book warAndPis = new Book("Война и мир", tolstoi, 1967);
        Book evgenOneg = new Book("Евге́ний Оне́гин", pushkin, 1833);
        Book warAndPis2 = new Book("Война и мир", tolstoi, 1967);


        System.out.println(pushkin );
        System.out.println(tolstoi);
        System.out.println(warAndPis);
        System.out.println(evgenOneg);
        System.out.println(warAndPis.equals(evgenOneg) );
        System.out.println(warAndPis.equals(warAndPis2));
        System.out.println(warAndPis.hashCode());
        System.out.println(pushkin.hashCode());


    }
}
