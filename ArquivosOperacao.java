
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
                            System.err.println(e.getMessage());
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
                            System.err.println(e.getMessage());
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
            } catch (IOException e) {
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

    public static ArrayList<Hospital> lerArquivoHospital() {
        System.out.println("Lendo arquivo: ");
        ArrayList<Hospital> listaHospitals = new ArrayList<Hospital>();
        String caminho = "arquivosCSV/Hospital.csv";

        try {
            // Instancia um objeto File com o caminho do arquivo CSV
            File file = new File(new File(".").getCanonicalFile(), caminho);
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String linha = br.readLine();

                while ((linha = br.readLine()) != null) {
                    String[] dados = linha.split(",");
                    int id = Integer.parseInt(dados[0]);
                    String cnpj = dados[1];
                    String nome = dados[2];
                    String tipo = dados[3];

                    Hospital hospital = new Hospital(tipo, nome, cnpj, id);

                    // Adiciona médicos ao hospital
                    int posicaoFinal = 4;
                    for (int i = posicaoFinal; i < dados.length; i++) {
                        if (dados[i].toString().equals("fim_medico")) {
                            break;
                        }

                        String cpf = dados[i];
                        // Procura medico com esse cpf em Medico.cpf e instancia na listaMedicos
                        String caminhoMedico = "arquivosCSV/Medico.csv";
                        File fileMedico = new File(new File(".").getCanonicalFile(), caminhoMedico);

                        try (BufferedReader brMedico = new BufferedReader(new FileReader(fileMedico))) {
                            // Ignora cabeçalho do arquivo CSV
                            String linhaMedico = brMedico.readLine();

                            while ((linhaMedico = brMedico.readLine()) != null) {
                                String[] dadosMedico = linhaMedico.split(",");

                                if (dadosMedico[0].equals(cpf)) {
                                    Medico medico = new Medico(dadosMedico[0], dadosMedico[1], dadosMedico[2],
                                            dadosMedico[3], dadosMedico[4], LocalDate.parse(dadosMedico[5]),
                                            dadosMedico[6], dadosMedico[7], dadosMedico[8]);
                                    hospital.getListaMedicos().add(medico);
                                    break;
                                }
                            }
                        } catch (IOException e) {
                            System.err.println(e.getMessage());
                        }
                        posicaoFinal++;
                    }

                    // Adiciona pacientes ao hospital
                    for (int i = posicaoFinal; i < dados.length; i++) {
                        if (dados[i].toString().equals("fim_paciente")) {
                            break;
                        }
                        String cpf = dados[i];
                        // Procura paciente com esse cpf em Paciente.cpf e instancia na listaPacientes
                        String caminhoPaciente = "arquivosCSV/Paciente.csv";
                        File filePaciente = new File(new File(".").getCanonicalFile(), caminhoPaciente);

                        try (BufferedReader brPaciente = new BufferedReader(new FileReader(filePaciente))) {
                            // Ignora cabeçalho do arquivo CSV
                            String linhaPaciente = brPaciente.readLine();
                            Boolean pacienteEncontrado = false;

                            while ((linhaPaciente = brPaciente.readLine()) != null && !pacienteEncontrado) {
                                String[] dadosPaciente = linhaPaciente.split(",");
                                if (dadosPaciente[0].equals(cpf)) {
                                    // Lê convenio do paciente e instancia na listaConvenios
                                    String caminhoConvenio = "arquivosCSV/Convenio.csv";
                                    File fileConvenio = new File(new File(".").getCanonicalFile(), caminhoConvenio);
                                    String codigoConvenioPaciente = dadosPaciente[10];

                                    try (BufferedReader brConvenio = new BufferedReader(new FileReader(fileConvenio))) {
                                        // Ignora cabeçalho do arquivo CSV
                                        String linhaConvenio = brConvenio.readLine();

                                        while ((linhaConvenio = brConvenio.readLine()) != null) {
                                            String[] dadosConvenio = linhaConvenio.split(",");

                                            if (dadosConvenio[0].equals(codigoConvenioPaciente)) {
                                                int codigoConvenio = Integer.parseInt(dadosConvenio[0]);
                                                Convenio convenio = new Convenio(codigoConvenio, dadosConvenio[1],
                                                        LocalDate.parse(dadosConvenio[2]),
                                                        Double.parseDouble(dadosConvenio[3]));
                                                Paciente paciente = new Paciente(dadosPaciente[0], dadosPaciente[1],
                                                        dadosPaciente[2], dadosPaciente[3], dadosPaciente[4],
                                                        LocalDate.parse(dadosPaciente[5]), dadosPaciente[6],
                                                        Double.parseDouble(dadosPaciente[7]),
                                                        Double.parseDouble(dadosPaciente[8]), dadosPaciente[9],
                                                        convenio);
                                                hospital.getListaPacientes().add(paciente);
                                                pacienteEncontrado = true;
                                                break;
                                            }
                                        }
                                    } catch (IOException e) {
                                        System.err.println(e.getMessage());
                                    }
                                }
                            }
                        } catch (IOException e) {
                            System.err.println(e.getMessage());
                        }
                        posicaoFinal++;
                    }

                    // Adiciona consultas ao hospital
                    for (int i = posicaoFinal; i < dados.length; i++) {
                        String idConsulta = dados[i];
                        // Procura consulta com esse id em Consulta.csv e instancia na listaConsultas
                        String caminhoConsulta = "arquivosCSV/Consulta.csv";
                        File fileConsulta = new File(new File(".").getCanonicalFile(), caminhoConsulta);

                        try (BufferedReader brConsulta = new BufferedReader(new FileReader(fileConsulta))) {
                            // Ignora cabeçalho do arquivo CSV
                            String linhaConsulta = brConsulta.readLine();

                            while (((linhaConsulta = brConsulta.readLine()) != null)) {
                                String dadosConsulta[] = linhaConsulta.split(",");

                                if (dadosConsulta[0].equals(idConsulta)) {
                                    // Consulta tem parametros: Paciente paciente, Medico medicoAtendimento,
                                    // LocalDate data
                                    // Paciente e Medico serão inicializados com null e instanciados posteriormente
                                    String cpfPaciente = dadosConsulta[1];
                                    Paciente pacienteConsulta = null;

                                    String cpfMedico = dadosConsulta[2];
                                    Medico medicoConsulta = null;
                                    LocalDate data = LocalDate.parse(dadosConsulta[3]);

                                    // Procura Paciente com esse cpf em Paciente.cpf e o instancia
                                    String caminhoPaciente = "arquivosCSV/Paciente.csv";
                                    File filePaciente = new File(new File(".").getCanonicalFile(), caminhoPaciente);

                                    try (BufferedReader brPaciente = new BufferedReader(new FileReader(filePaciente))) {
                                        // Ignora cabeçalho do arquivo CSV
                                        String linhaPaciente = brPaciente.readLine();
                                        Boolean pacienteEncontrado = false;

                                        while ((linhaPaciente = brPaciente.readLine()) != null && !pacienteEncontrado) {
                                            String[] dadosPaciente = linhaPaciente.split(",");
                                            if (dadosPaciente[0].equals(cpfPaciente)) {
                                                // Lê convenio do paciente e instancia na listaConvenios
                                                String caminhoConvenio = "arquivosCSV/Convenio.csv";
                                                File fileConvenio = new File(new File(".").getCanonicalFile(),
                                                        caminhoConvenio);
                                                String codigoConvenioPaciente = dadosPaciente[10];

                                                try (BufferedReader brConvenio = new BufferedReader(
                                                        new FileReader(fileConvenio))) {
                                                    // Ignora cabeçalho do arquivo CSV
                                                    String linhaConvenio = brConvenio.readLine();
                                                    Boolean convenioEncontrado = false;
                                                    while ((linhaConvenio = brConvenio.readLine()) != null
                                                            && !convenioEncontrado) {
                                                        String[] dadosConvenio = linhaConvenio.split(",");

                                                        if (dadosConvenio[0].equals(codigoConvenioPaciente)) {
                                                            int codigoConvenio = Integer.parseInt(dadosConvenio[0]);
                                                            Convenio convenio = new Convenio(codigoConvenio,
                                                                    dadosConvenio[1],
                                                                    LocalDate.parse(dadosConvenio[2]),
                                                                    Double.parseDouble(dadosConvenio[3]));
                                                            pacienteConsulta = new Paciente(dadosPaciente[0],
                                                                    dadosPaciente[1],
                                                                    dadosPaciente[2], dadosPaciente[3],
                                                                    dadosPaciente[4],
                                                                    LocalDate.parse(dadosPaciente[5]), dadosPaciente[6],
                                                                    Double.parseDouble(dadosPaciente[7]),
                                                                    Double.parseDouble(dadosPaciente[8]),
                                                                    dadosPaciente[9], convenio);
                                                            // Paciente já foi adicionado na listaPacientes
                                                            // anteriormente
                                                            pacienteEncontrado = true;
                                                            convenioEncontrado = true;
                                                            break;
                                                        }
                                                    }
                                                } catch (IOException e) {
                                                    System.err.println(e.getMessage());
                                                }
                                            }
                                        }
                                    } catch (IOException e) {
                                        System.err.println(e.getMessage());
                                    }

                                    // Procura Medico com esse cpf em Medico.cpf e o instancia
                                    String caminhoMedico = "arquivosCSV/Medico.csv";
                                    File fileMedico = new File(new File(".").getCanonicalFile(), caminhoMedico);

                                    try (BufferedReader brMedico = new BufferedReader(new FileReader(fileMedico))) {
                                        // Ignora cabeçalho do arquivo CSV
                                        String linhaMedico = brMedico.readLine();
                                        Boolean medicoEncontrado = false;

                                        while ((linhaMedico = brMedico.readLine()) != null && !medicoEncontrado) {
                                            String[] dadosMedico = linhaMedico.split(",");
                                            if (dadosMedico[0].equals(cpfMedico)) {
                                                medicoConsulta = new Medico(dadosMedico[0], dadosMedico[1],
                                                        dadosMedico[2],
                                                        dadosMedico[3], dadosMedico[4], LocalDate.parse(dadosMedico[5]),
                                                        dadosMedico[6], dadosMedico[7], dadosMedico[8]);
                                                // Medico já foi adicionado na listaMedicos anteriormente
                                                medicoEncontrado = true;
                                                break;
                                            }
                                        }
                                    } catch (IOException e) {
                                        System.err.println(e.getMessage());
                                    }

                                    // Instancia consulta e adiciona na listaConsultas
                                    Consulta consulta = new Consulta(pacienteConsulta, medicoConsulta, data);

                                    // Inicializa diagnóstico da consulta
                                    String doenca = dadosConsulta[4];
                                    String cpfMedicoProcedimento = dadosConsulta[5];
                                    LocalDate dataProcedimento = LocalDate.parse(dadosConsulta[6]);

                                    // Procura Medico com esse cpf em Medico.cpf e o instancia
                                    String caminhoMedicoProcedimento = "arquivosCSV/Medico.csv";
                                    File fileMedicoProcedimento = new File(new File(".").getCanonicalFile(),
                                            caminhoMedicoProcedimento);
                                    Medico medicoProcedimento = null;

                                    try (BufferedReader brMedicoProcedimento = new BufferedReader(
                                            new FileReader(fileMedicoProcedimento))) {
                                        // Ignora cabeçalho do arquivo CSV
                                        String linhaMedicoProcedimento = brMedicoProcedimento.readLine();
                                        Boolean medicoProcedimentoEncontrado = false;

                                        while ((linhaMedicoProcedimento = brMedicoProcedimento.readLine()) != null
                                                && !medicoProcedimentoEncontrado) {
                                            String[] dadosMedicoProcedimento = linhaMedicoProcedimento.split(",");
                                            if (dadosMedicoProcedimento[0].equals(cpfMedicoProcedimento)) {

                                                medicoProcedimento = new Medico(dadosMedicoProcedimento[0],
                                                        dadosMedicoProcedimento[1], dadosMedicoProcedimento[2],
                                                        dadosMedicoProcedimento[3], dadosMedicoProcedimento[4],
                                                        LocalDate.parse(dadosMedicoProcedimento[5]),
                                                        dadosMedicoProcedimento[6], dadosMedicoProcedimento[7],
                                                        dadosMedicoProcedimento[8]);
                                                // Medico já foi adicionado na listaMedicos anteriormente
                                                medicoProcedimentoEncontrado = true;
                                                break;
                                            }
                                        }
                                    } catch (IOException e) {
                                        System.err.println(e.getMessage());
                                    }

                                    int idConsultaInteger = Integer.parseInt(idConsulta);
                                    Diagnostico diagnostico = new Diagnostico(doenca, medicoProcedimento,
                                            idConsultaInteger);
                                    consulta.setDiagnostico(diagnostico);

                                    // Instancia diagnóstico da consulta procurando pelo id da consulta em Exame.csv
                                    // ou Cirurgia.csv
                                    int exame1Consulta2 = 0;
                                    String caminhoExame = "arquivosCSV/Exame.csv";
                                    File fileExame = new File(new File(".").getCanonicalFile(), caminhoExame);
                                    Exame exame;
                                    Cirurgia cirurgia;

                                    try (BufferedReader brExame = new BufferedReader(new FileReader(fileExame))) {
                                        // Ignora cabeçalho do arquivo CSV
                                        String linhaExame = brExame.readLine();

                                        while ((linhaExame = brExame.readLine()) != null) {
                                            String[] dadosExame = linhaExame.split(",");
                                            if (dadosExame[5].equals(idConsulta)) {
                                                String nomeExame = dadosExame[0];
                                                String salaExame = dadosExame[1];
                                                String laudoExame = dadosExame[4];
                                                exame = new Exame(nomeExame, salaExame, medicoProcedimento,
                                                        dataProcedimento, laudoExame, idConsultaInteger);
                                                exame1Consulta2 = 1;
                                                diagnostico.setProcedimento(exame);
                                                break;
                                            }
                                        }
                                    } catch (IOException e) {
                                        System.err.println(e.getMessage());
                                    }

                                    // Não encontrou exame, procura cirurgia
                                    if (exame1Consulta2 == 0) {
                                        String caminhoCirurgia = "arquivosCSV/Cirurgia.csv";
                                        File fileCirurgia = new File(new File(".").getCanonicalFile(), caminhoCirurgia);

                                        try (BufferedReader brCirurgia = new BufferedReader(
                                                new FileReader(fileCirurgia))) {
                                            // Ignora cabeçalho do arquivo CSV
                                            String linhaCirurgia = brCirurgia.readLine();

                                            while ((linhaCirurgia = brCirurgia.readLine()) != null) {
                                                String[] dadosCirurgia = linhaCirurgia.split(",");
                                                if (dadosCirurgia[5].equals(idConsulta)) {
                                                    String nomeCirurgia = dadosCirurgia[0];
                                                    String salaCirurgia = dadosCirurgia[1];
                                                    String tipoCirurgia = dadosCirurgia[4];
                                                    cirurgia = new Cirurgia(nomeCirurgia, salaCirurgia,
                                                            medicoProcedimento, dataProcedimento, tipoCirurgia,
                                                            idConsultaInteger);
                                                    diagnostico.setProcedimento(cirurgia);
                                                    break;
                                                }
                                            }
                                        } catch (IOException e) {
                                            System.err.println(e.getMessage());
                                        }
                                    }

                                    hospital.getListaConsultas().add(consulta);
                                    break;
                                }
                            }

                        }

                    }

                    // Adiciona hospital na ArrayList<Hospital>
                    listaHospitals.add(hospital);
                }
            } catch (IOException e) {
                e.printStackTrace(System.err);
            }
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
        return listaHospitals;
    }
}