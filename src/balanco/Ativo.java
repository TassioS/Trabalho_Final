package balanco;

public class Ativo {
    private AtivoC ativo_Circulante;
    private AtivoNC ativo_NaoCirculante;

    public Ativo() {
        ativo_Circulante = new AtivoC();
        ativo_NaoCirculante = new AtivoNC();
    }

    public AtivoC getAtivo_Circulante() {
        return ativo_Circulante;
    }

    public AtivoNC getAtivo_NaoCirculante() {
        return ativo_NaoCirculante;
    }
}