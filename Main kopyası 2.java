public class Main {
    public static void main(String[] args) {
        // Çalışan nesnesi oluşturuluyor
        Employee employee = new Employee("Efe Uğur", 45000, 40, 2015);

        // Vergi bilgisi hesaplanıyor ve ekrana yazdırılıyor
        double tax = employee.tax();
        System.out.println("Vergi: " + tax);

        // Bonus hesaplanıyor ve ekrana yazdırılıyor
        double bonus = employee.bonus();
        System.out.println("Bonus: " + bonus);

        // Zam hesaplanıyor ve ekrana yazdırılıyor
        double raise = employee.raiseSalary();
        System.out.println("Zam: " + raise);

        // Çalışan bilgileri ekrana yazdırılıyor
        System.out.println(employee);
    }
}
