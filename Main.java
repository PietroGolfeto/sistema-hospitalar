class Main {
    // Sistema de gerenciamento hospitalar
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        ArquivosOperacao admin = new ArquivosOperacao();
        admin.ler(new Paciente());
        System.out.println();
        admin.ler(new Paciente());
    }
}
