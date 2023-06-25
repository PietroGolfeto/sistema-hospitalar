import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.time.LocalDate;
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
                String[] cabecalho = linha.split(",");

                String linhaRetorno = "";
                switch (objeto.getClass().getSimpleName()) {
                    case "Paciente":
                        // Imprime o conteúdo de Paciente.csv no menu
                        while ((linha = br.readLine()) != null) {
                            String[] dados = linha.split(",");
                            for (int i = 0; i < dados.length; i++) {
                                linhaRetorno += cabecalho[i] + ": " + dados[i] + "  ";
                            }
                            linhaRetorno += "\n";
                            dadosRetorno.add(linhaRetorno);
                        }
                        break;

                    case "Medico":
                        // Imprime o conteúdo de Medico.csv no menu
                        while ((linha = br.readLine()) != null) {
                            String[] dados = linha.split(",");
                            for (int i = 0; i < dados.length; i++) {
                                if (i < 9) {
                                    linhaRetorno += cabecalho[i] + ": " + dados[i];
                                } else {
                                    linhaRetorno += " Paciente " + (i - 9) + ": " + dados[i];
                                }
                                linhaRetorno += "  ";
                            }
                            linhaRetorno += "\n";
                            dadosRetorno.add(linhaRetorno);
                        }
                        break;

                    case "Consulta":
                        // Imprime o conteúdo de Consulta.csv no menu
                        while ((linha = br.readLine()) != null) {
                            String[] dados = linha.split(",");
                            for (int i = 0; i < dados.length; i++) {
                                linhaRetorno += cabecalho[i] + ": " + dados[i] + "  ";
                            }
                            linhaRetorno += "\n";
                            dadosRetorno.add(linhaRetorno);
                        }
                        break;

                    case "Convenio":
                        // Imprime o conteúdo de Convenio.csv no menu
                        while ((linha = br.readLine()) != null) {
                            String[] dados = linha.split(",");
                            for (int i = 0; i < dados.length; i++) {
                                linhaRetorno += cabecalho[i] + ": " + dados[i] + "  ";
                            }
                            linhaRetorno += "\n";
                            dadosRetorno.add(linhaRetorno);
                        }
                        break;

                    case "Hospital":
                        // Lê CPF de todos os médicos de Medico.csv
                        ArrayList<String> listaMedicos = new ArrayList<String>();
                        String caminhoMedico = "arquivosCSV/Medico.csv";
                        File fileMedico = new File(new File(".").getCanonicalFile(), caminhoMedico);
                        try (BufferedReader brMedico = new BufferedReader(new FileReader(fileMedico))) {
                            String linhaMedico = brMedico.readLine();
                            while ((linhaMedico = brMedico.readLine()) != null) {
                                String[] dadosMedico = linhaMedico.split(",");
                                listaMedicos.add(dadosMedico[0]);
                            }
                        } catch (IOException e) {
                            // TO DO
                            // Tratar exceção; não pode só imprimir mensagem de erro
                            System.out.println(e.getMessage());
                        }

                        // Lê CPF de todos os pacientes de Paciente.csv
                        ArrayList<String> listaPacientes = new ArrayList<String>();
                        String caminhoPaciente = "arquivosCSV/Paciente.csv";
                        File filePaciente = new File(new File(".").getCanonicalFile(), caminhoPaciente);
                        try (BufferedReader brPaciente = new BufferedReader(new FileReader(filePaciente))) {
                            String linhaPaciente = brPaciente.readLine();
                            while ((linhaPaciente = brPaciente.readLine()) != null) {
                                String[] dadosPaciente = linhaPaciente.split(",");
                                listaPacientes.add(dadosPaciente[0]);
                            }
                        } catch (IOException e) {
                            // TO DO
                            // Tratar exceção; não pode só imprimir mensagem de erro
                            System.out.println(e.getMessage());
                        }

                        // Imprime o conteúdo de Hospital.csv no menu
                        while ((linha = br.readLine()) != null) {
                            String[] dados = linha.split(",");
                            for (int i = 0; i < 2; i++) {
                                linhaRetorno += cabecalho[i] + ": " + dados[i] + "  ";
                            }

                            int posicaoFinal = 2;
                            for (int i = posicaoFinal; i < dados.length; i++) {
                                if (!(listaMedicos.contains(dados[i]))) {
                                    break;
                                }
                                linhaRetorno += " Medico " + (i - 2) + ": " + dados[i] + "  ";
                                posicaoFinal++;
                            }

                            for (int i = posicaoFinal; i < dados.length; i++) {
                                if (!(listaPacientes.contains(dados[i]))) {
                                    break;
                                }
                                linhaRetorno += " Paciente " + (i - posicaoFinal) + ": " + dados[i] + "  ";
                                posicaoFinal++;
                            }

                            for (int i = posicaoFinal; i < dados.length; i++) {
                                linhaRetorno += "Convenio: " + dados[i] + "  ";
                            }
                            linhaRetorno += "\n";
                            dadosRetorno.add(linhaRetorno);
                        }
                        break;

                    case "Exame":
                        // Imprime o conteúdo de Exame.csv no menu
                        while ((linha = br.readLine()) != null) {
                            String[] dados = linha.split(",");
                            for (int i = 0; i < dados.length; i++) {
                                linhaRetorno += cabecalho[i] + ": " + dados[i] + "  ";
                            }
                            linhaRetorno += "\n";
                            dadosRetorno.add(linhaRetorno);
                        }
                        break;

                    case "Cirurgia":
                        // Imprime o conteúdo de Cirurgia.csv no menu
                        while ((linha = br.readLine()) != null) {
                            String[] dados = linha.split(",");
                            for (int i = 0; i < dados.length; i++) {
                                linhaRetorno += cabecalho[i] + ": " + dados[i] + "  ";
                            }
                            linhaRetorno += "\n";
                            dadosRetorno.add(linhaRetorno);
                        }
                        break;

                    default:
                        // TO DO
                        // CRIAR UM TIPO DE ERRO PARA QUANDO O OBJETO NÃO FOR ENCONTRADO
                        throw new ObjectNotFoundException("Objeto não encontrado");
                        System.out.println("Objeto não encontrado");
                        break;
                }
            } catch (IOException e) {
                // TO DO
                // Tratar exceção; não pode só imprimir mensagem de erro
                System.out.println(e.getMessage());
            }
        } catch (

        Exception e) {
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

        System.out.println("Escrevendo arquivo: ");
        String caminho = "arquivosCSV/" + objeto.getClass().getSimpleName() + ".csv";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminho,
                true))) {
            StringBuilder sb = new StringBuilder();

            switch (objeto.getClass().getSimpleName()) {
                case "Paciente":
                    Paciente paciente = (Paciente) objeto;

                    sb.append(paciente.getCpf() + "," + paciente.getNome() + "," + paciente.getTelefone() + ","
                            + paciente.getEndereco() + "," + paciente.getEmail() + "," + paciente.getDataNascimento()
                            + "," + paciente.getGenero() + "," + paciente.getProntuario().getAltura() + ","
                            + paciente.getProntuario().getPeso() + "," + paciente.getProntuario().getTipoSanguinio());

                    writer.write(sb.toString());
                    writer.newLine();
                    break;

                case "Medico":
                    Medico medico = (Medico) objeto;
                    sb.append(medico.getCpf() + "," + medico.getNome() + "," + medico.getTelefone() + ","
                            + medico.getEndereco() + "," + medico.getEmail() + "," + medico.getDataNascimento()
                            + "," + medico.getGenero() + "," + medico.getCRM() + "," + medico.getAreaAtuacao() + ",");

                    for (int i = 0; i < medico.getListaConsultas().size(); i++) {
                        sb.append(medico.getListaConsultas().get(i).getPaciente() + ",");
                    }

                    writer.write(sb.toString());
                    writer.newLine();
                    break;

                case "Consulta":
                    // TO DO
                    // Escrever no arquivo CSV
                    break;

                case "Convenio":
                    // TO DO
                    // Escrever no arquivo CSV
                    break;

                case "Hospital":
                    // TO DO
                    // Escrever no arquivo CSV
                    break;

                case "Exame":
                    // TO DO
                    // Escrever no arquivo CSV
                    break;

                case "Cirurgia":
                    // TO DO
                    // Escrever no arquivo CSV
                    break;

                default:
                    // TO DO
                    // Tratar exceção; não pode só imprimir mensagem de erro
                    System.out.println("Objeto não encontrado");
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return objeto;
    }
}