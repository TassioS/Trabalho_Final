package balanco;

public class PassivoNC {
    private double endividamento_LP;
    private double obrigacoes_ArrendamentoMercantil;
    private double imposto_RendaDiferido;
    private double participação_Acionistas;
    private double outros_Passivos;

    public PassivoNC() {
    }

    public double getEndividamento_LP() {
        return endividamento_LP;
    }

    public void setEndividamento_LP(double endividamento_LP) {
        this.endividamento_LP = endividamento_LP;
    }

    public double getObrigacoes_ArrendamentoMercantil() {
        return obrigacoes_ArrendamentoMercantil;
    }

    public void setObrigacoes_ArrendamentoMercantil(double obrigacoes_ArrendamentoMercantil) {
        this.obrigacoes_ArrendamentoMercantil = obrigacoes_ArrendamentoMercantil;
    }

    public double getImposto_RendaDiferido() {
        return imposto_RendaDiferido;
    }

    public void setImposto_RendaDiferido(double imposto_RendaDiferido) {
        this.imposto_RendaDiferido = imposto_RendaDiferido;
    }

    public double getParticipação_Acionistas() {
        return participação_Acionistas;
    }

    public void setParticipação_Acionistas(double participação_Acionistas) {
        this.participação_Acionistas = participação_Acionistas;
    }

    public double getOutros_Passivos() {
        return outros_Passivos;
    }

    public void setOutros_Passivos(double outros_Passivos) {
        this.outros_Passivos = outros_Passivos;
    }
}
