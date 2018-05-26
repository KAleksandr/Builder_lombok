public class Main {
    public static void main(String[] args) {
        Student student = Student.builder()
                .firstname("Nikolay")
                .lastname("Makluha").age(25).build();
        System.out.println(student);
        Student student1 = Student.builder().firstname("Karina").lastname("").build();
        System.out.println(student1);
    }
}
