import ArquivosOperacao.MedicoArquivos;
import ArquivosOperacao.PacienteArquivos;

class Main {
    // Sistema de gerenciamento hospitalar
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        PacienteArquivos adminPaciente = new PacienteArquivos();
        MedicoArquivos adminMedico = new MedicoArquivos();
        adminPaciente.ler();
        System.out.println();
        adminMedico.ler();
    }
}
