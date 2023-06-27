 ArrayList<Hospital> hospitais = ArquivosOperacao.lerArquivoHospital();
        System.out.println("Hospitais cadastrados: ");
        for (Hospital hospital : hospitais) {
            System.out.println(hospital.getNome());
        }