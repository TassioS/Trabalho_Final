package balanco;

public class Balanco_Patrimonial {
    private Ativo ativo;
    private Passivo passivo;

    public Balanco_Patrimonial() {
        ativo = new Ativo();
        passivo = new Passivo();
    }

    public Ativo getAtivo() {
        return ativo;
    }

    public Passivo getPassivo() {
        return passivo;
    }
}
