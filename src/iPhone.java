import AparelhoTelefonico.AparelhoTelefonico;
import ReprodutorMusical.ReprodutorMusical;
import NavegadorInternet.NavegadorInternet;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void tocar() {
        // Implementação do método tocar() para o reprodutor musical
    }

    @Override
    public void pausar() {
        // Implementação do método pausar() para o reprodutor musical
    }

    @Override
    public void selecionarMusica() {
        // Implementação do método selecionarMusica() para o reprodutor musical
    }

    @Override
    public void ligar() {
        // Implementação do método ligar() para o aparelho telefônico
    }

    @Override
    public void atender() {
        // Implementação do método atender() para o aparelho telefônico
    }

    @Override
    public void iniciarChamadaVoz() {
        // Implementação do método iniciarChamadaVoz() para o aparelho telefônico
    }

    @Override
    public void exibirPagina() {
        // Implementação do método exibirPagina() para o navegador de internet
    }

    @Override
    public void adicionarNovaAba() {
        // Implementação do método adicionarNovaAba() para o navegador de internet
    }

    @Override
    public void atualizarPagina() {
        // Implementação do método atualizarPagina() para o navegador de internet
    }
}