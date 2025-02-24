package med.voll.api.medico;

public class DadosCadastroMedico {
    public record DadosCadastroMedico(String nome,
                                      String email, String crm,
                                      Especialidade especialidade,
                                      DadosEndereco endereco) {
    }
}
