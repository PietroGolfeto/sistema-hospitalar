import java.util.ArrayList;
public class Validacao {
    public static boolean validarCPF(String cpf_entrada) {

        // Remove caracteres nao numericos
        String cpf = cpf_entrada.replaceAll("[^0-9]", "");

        // Testa numero de caracteres
        if (cpf.length() != 11) {
            return false;
        }

        // Testa se todos caracteres sao iguais
        char c0 = cpf.charAt(0);
        int ocorrencias = 1;

        for (int i = 1; i < cpf.length(); i++) {
            if (cpf.charAt(i) == c0) {
                ocorrencias++;
            }
        }

        if (ocorrencias == cpf.length()) {
            return false;
        }

        // Testa digitos verificadores
        // i=0 representa penultimo digito do CPF
        // i=1 representa ultimo digito do CPF
        for (int i = 0; i < 2; i++) {
            int soma = 0;
            for (int j = 10 + i; j > 1; j--) {
                int c = Character.getNumericValue(cpf.charAt(10 - j + i));
                soma += (c * j);
            }

            int digito_verificador = Character.getNumericValue(cpf.charAt(9 + i));

            // Testa se digito verificador eh valido
            if ((soma % 11) <= 1) {
                if (digito_verificador != 0) {
                    return false;
                }
            } else {
                if (digito_verificador != (11 - (soma % 11))) {
                    return false;
                }
            }

            // Verifica se digitos verificadores sao iguais
            if (digito_verificador != Character.getNumericValue(cpf.charAt(9 + i))) {
                return false;
            }
        }

        // Testa se CPF já existe no CSV
        ArquivosOperacao admin = new ArquivosOperacao();
        ArrayList<String> listaCpfPaciente = admin.ler(new Paciente());
        if (listaCpfPaciente.contains(cpf)) {
            return false;
        }

        // CPF é válido e único
        return true;
    }
}
