public class FormattedPrint {

    public static void main(String[] args) {
        String name = "Ainsley Smith";
        double salary = 12345.12345;
        int age = 18;

        for(int x = 0; x < 10; x++)
            System.out.printf("\n%-16s%-5d%-15.2f", name, age, salary);

        System.out.println(String.format("\n%15.2f", salary));
    }
}
