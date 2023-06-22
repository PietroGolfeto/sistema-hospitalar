import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;

public class ArquivosOperacao implements Arquivos<Object> {
    @Override
    public ArrayList<String> ler(Object objeto) {
        System.out.println("Lendo arquivo: ");
        ArrayList<String> dadosRetorno = new ArrayList<String>();
        String caminho = "arquivosCSV/" + objeto.getClass().getSimpleName() + ".csv";
        try {
            // Instancia um objeto File com o caminho do arquivo CSV
            File file = new File(new File(".").getCanonicalFile(), caminho);
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String linha = br.readLine();
                String linhaRetorno = "";

                switch (objeto.getClass().getSimpleName()) {
                    case "Paciente":
                        // Imprime o conteúdo de uma linha do arquivo
                        while ((linha = br.readLine()) != null) {
                            // TO DO
                            // Imprimir dados no menu, ao invés do terminal
                            String[] dados = linha.split(",");
                            linhaRetorno += " CPF: " + dados[0];
                            linhaRetorno += " Nome: " + dados[1];
                            linhaRetorno += " Telefone: " + dados[2];
                            linhaRetorno += " Email: " + dados[3];
                            linhaRetorno += " Endereco: " + dados[4];
                            linhaRetorno += " Data de Nascimento: " + dados[5];
                            linhaRetorno += " Genero: " + dados[6];
                            linhaRetorno += " Altura: " + dados[7];
                            linhaRetorno += " Peso: " + dados[8];
                            linhaRetorno += " Tipo Sanguinio: " + dados[9] + "\n";
                            dadosRetorno.add(linhaRetorno);
                        }
                        break;

                    case "Medico":
                        // Imprime o conteúdo de uma linha do arquivo
                        while ((linha = br.readLine()) != null) {
                            // TO DO
                            // Imprimir dados no menu, ao invés do terminal
                            String[] dados = linha.split(",");
                            linhaRetorno += " CPF: " + dados[0];
                            linhaRetorno += " Nome: " + dados[1];
                            linhaRetorno += " Telefone: " + dados[2];
                            linhaRetorno += " Email: " + dados[3];
                            linhaRetorno += " Endereco: " + dados[4];
                            linhaRetorno += " Data de Nascimento: " + dados[5];
                            linhaRetorno += " Genero: " + dados[6];
                            linhaRetorno += " CRM: " + dados[7];
                            linhaRetorno += " Especialidade: " + dados[8];

                            if (dados.length >= 10) {
                                String[] pacientes = Arrays.copyOfRange(dados, 9, dados.length);
                                int numPaciente = 0;
                                for (String paciente : pacientes) {
                                    linhaRetorno += " Paciente " + numPaciente + ": " + paciente;
                                    numPaciente++;
                                }
                            }
                            linhaRetorno += "\n";
                            dadosRetorno.add(linhaRetorno);
                        }
                        break;

                    case "Consulta":

                        break;

                    case "Exame":

                        break;

                    case "Prontuario":

                        break;

                    default:
                    // TO DO
                    // Tratar exceção; não pode só imprimir mensagem de erro
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
            // Tratar exceção; não pode só imprimir mensagem de erro
            e.printStackTrace();
        }
        return dadosRetorno;
    }

    @Override
    public Object escrever(Object objeto) {
        // TO DO
        // FALTA SEPARAR DE ACORDO COM A CLASSE DA MESMA FORMA E ESCREVER NO CSV
        System.out.println("retornando objeto");
        return objeto;
        // TO DO
        // FALTA IMPLEMENTAR ESCRITA
        
    }
}