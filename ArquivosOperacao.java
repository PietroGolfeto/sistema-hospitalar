import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
                        // Erro customizado caso o objeto não seja encontrado
                        throw new ObjectNotFoundException("Objeto não encontrado");
                }
            } catch (ObjectNotFoundException e) {
                System.err.println("Objeto não encontrado");                    
            } catch(IOException e) {
                System.err.println(e.getMessage());
            }
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
        return dadosRetorno;
    }

    @Override
    public Object escrever(Object objeto) {

        System.out.println("Escrevendo arquivo: ");
        String caminho = "arquivosCSV/" + objeto.getClass().getSimpleName() + ".csv";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminho,
                true))) {
            StringBuilder sb = new StringBuilder();

            switch (objeto.getClass().getSimpleName()) {
                case "Paciente":
                    // CPF_PESSOA,NOME_PESSOA,TELEFONE,ENDERECO,EMAIL,DATA_NASCIMENTO,GENERO,ALTURA,PESO,TIPO_SANGUINEO,CODIGO_CONVENIO
                    Paciente paciente = (Paciente) objeto;

                    sb.append(paciente.getCpf() + "," + paciente.getNome() + "," + paciente.getTelefone() + ","
                            + paciente.getEndereco() + "," + paciente.getEmail() + "," + paciente.getDataNascimento()
                            + "," + paciente.getGenero() + "," + paciente.getProntuario().getAltura() + ","
                            + paciente.getProntuario().getPeso() + "," + paciente.getProntuario().getTipoSanguinio());

                    writer.write(sb.toString());
                    writer.newLine();
                    break;

                case "Medico":
                    // CPF_PESSOA,NOME_PESSOA,TELEFONE,ENDERECO,EMAIL,DATA_NASCIMENTO,GENERO,CRM,AREA_ATUACAO,LISTA_ID_CONSULTAS_PROCEDIMENTO
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
                    // ID,CPF_PACIENTE,CPF_MEDICO_CONSULTA,DATA_CONSULTA,DOENCA,CPF_MEDICO_PROCEDIMENTO,DATA_PROCEDIMENTO,VALOR
                    Consulta consulta = (Consulta) objeto;
                    sb.append(consulta.getId() + "," + consulta.getPaciente().getCpf() + ","
                            + consulta.getMedicoAtendimento().getCpf() + "," + consulta.getData().toString() + ","
                            + consulta.getDiagnostico().getDoenca() + ","
                            + consulta.getDiagnostico().getProcedimento().getMedicoProcedimento().getCpf() + ","
                            + consulta.getDiagnostico().getProcedimento().getData().toString() + ","
                            + consulta.getValor());
                    writer.write(sb.toString());
                    writer.newLine();
                    break;

                case "Convenio":
                    // CODIGO,NOME,DATA_VALIDADE,MULTIPLICADOR_DESCONTO
                    Convenio convenio = (Convenio) objeto;
                    sb.append(convenio.getCodigo() + "," + convenio.getNome() + "," + convenio.getDataValidade()
                            + "," + convenio.getMultiplicadorDesconto());
                    writer.write(sb.toString());
                    writer.newLine();
                    break;

                case "Hospital":
                    // ID,CNPJ,NOME,TIPO,LISTA_CPF_MEDICOS,LISTA_CPF_PACIENTES,LISTA_ID_CONSULTAS
                    Hospital hospital = (Hospital) objeto;
                    sb.append(hospital.getId() + "," + hospital.getCnpj() + "," + hospital.getNome() + ","
                            + hospital.getTipo() + ",");
                    for (int i = 0; i < hospital.getListaMedicos().size(); i++) {
                        sb.append(hospital.getListaMedicos().get(i).getCpf() + ",");
                    }
                    for (int i = 0; i < hospital.getListaPacientes().size(); i++) {
                        sb.append(hospital.getListaPacientes().get(i).getCpf() + ",");
                    }
                    for (int i = 0; i < hospital.getListaConsultas().size(); i++) {
                        sb.append(hospital.getListaConsultas().get(i).getId() + ",");
                    }
                    writer.write(sb.toString());
                    writer.newLine();
                    break;

                case "Exame":
                    // NOME,SALA,MEDICO_EXAME,DATA,LAUDO,ID_CONSULTA
                    Exame exame = (Exame) objeto;
                    sb.append(exame.getNome() + "," + exame.getSala() + ","
                            + exame.getMedicoProcedimento().getCpf() + "," + exame.getData().toString() + ","
                            + exame.getLaudo() + "," + exame.getIdConsulta());
                    break;

                case "Cirurgia":
                    // NOME,SALA,MEDICO,DATA,TIPO_CIRURGIA,ID_CONSULTA
                    Cirurgia cirurgia = (Cirurgia) objeto;
                    sb.append(cirurgia.getNome() + "," + cirurgia.getSala() + ","
                            + cirurgia.getMedicoProcedimento().getCpf() + "," + cirurgia.getData().toString() + ","
                            + cirurgia.getTipoCirurgia() + "," + cirurgia.getIdConsulta());
                    break;

                default:
                    // Erro customizado caso o objeto não seja encontrado
                    throw new ObjectNotFoundException("Objeto não encontrado");
            }
        } catch (ObjectNotFoundException e) {
            System.err.println("Objeto não encontrado");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return objeto;
    }
}