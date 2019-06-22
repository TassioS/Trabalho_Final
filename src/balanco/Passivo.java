package balanco;

public class Passivo {
    private PassivoC passivo_Circulante;
    private PassivoNC passivo_NaoCirculante;
    private Patrimonio_Liquido PL;

    public Passivo() {
        this.passivo_Circulante = new PassivoC();
        this.passivo_NaoCirculante = new PassivoNC();
        this.PL = new Patrimonio_Liquido();
    }

    public PassivoC getPassivo_Circulante() {
        return passivo_Circulante;
    }

    public PassivoNC getPassivo_NaoCirculante() {
        return passivo_NaoCirculante;
    }

    public Patrimonio_Liquido getPL() {
        return PL;
    }
}
