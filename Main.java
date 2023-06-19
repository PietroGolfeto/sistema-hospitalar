import java.time.LocalDate;

class Main {
    // Sistema de gerenciamento hospitalar
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Paciente admin = new Paciente("00000000000", "Admin", "(00)00000-0000",
                "N/A",
                "M/A", LocalDate.now(), "M", 1.80, 80, "N/A");
        admin.ler();
    }
}
