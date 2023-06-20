import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ArquivosOperacao implements Arquivos<Object> {
    @Override
    public void ler(Object objeto) {
        System.out.println("Lendo arquivo: ");
        String caminho = "arquivosCSV/" + objeto.getClass().getSimpleName() + ".csv";
        try {
            // Instancia um objeto File com o caminho do arquivo CSV
            File file = new File(new File(".").getCanonicalFile(), caminho);
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                // Ignora o cabeçalho do arquivo
                String linha = br.readLine();

                switch (objeto.getClass().getSimpleName()) {
                    case "Paciente":
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
                        break;

                    case "Medico":
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
                            System.out.println("CRM: " + dados[7]);
                            System.out.println("Especialidade: " + dados[8]);

                            if (dados.length >= 10) {
                                String[] pacientes = Arrays.copyOfRange(dados, 9, dados.length);
                                int numPaciente = 0;
                                for (String paciente : pacientes) {
                                    System.out.println("Paciente " + numPaciente + ": " + paciente);
                                    numPaciente++;
                                }
                            }
                            System.out.println();
                        }
                        break;
                    case "Consulta":

                        break;
                    case "Exame":

                        break;
                    case "Prontuario":

                        break;
                    default:
                        System.out.println("Objeto não encontrado");
                        break;
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
    public void escrever(Object objeto) {
        // TO DO
        // FALTA SEPARAR DE ACORDO COM A CLASSE DA MESMA FORMA E ESCREVER NO CSV
        System.out.println("Imprimindo objeto");
    }
}