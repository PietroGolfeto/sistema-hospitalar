package ArquivosOperacao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PacienteArquivos implements Arquivos {
    @Override
    public void ler() {
        System.out.println("Lendo arquivo: ");
        try {
            // Instancia um objeto File com o caminho do arquivo CSV
            File file = new File(new File(".").getCanonicalFile(), "arquivosCSV/Paciente.csv");

            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                // Ignora o cabeçalho do arquivo
                String linha = br.readLine();

                // Imprime o conteúdo de uma linha do arquivo
                while ((linha = br.readLine()) != null) {
                    // TO DO
                    // Imprimir dados no menu, ao invés do terminal
                    System.out.println(linha);
                    String[] dados = linha.split(",");
                    System.out.println("CPF: " + dados[0]);
                    System.out.println("Nome: " + dados[1]);
                    System.out.println("Telefone: " + dados[2]);
                    System.out.println("Email: " + dados[3]);
                    System.out.println("Endereco: " + dados[4]);
                    System.out.println("Data de Nascimento: " + dados[5]);
                    System.out.println("Genero: " + dados[6]);
                    System.out.println("Altura: " + dados[7]);
                    System.out.println("Peso: " + dados[8]);
                    System.out.println("Tipo Sanguinio: " + dados[9]);
                    System.out.println();
                }
            } catch (IOException e) {
                // TO DO
                // Tratar exceção; não pode só imprimir mensagem de erro
                System.out.println(e.getMessage());
            }
        } catch (Exception e) {
            // TO DO
            e.printStackTrace();
        }
    }

    @Override
    public void escrever() {
        // TO DO
        System.out.println("");
    }
}