package balanco;

public class AtivoNC {
    private double imobilizado;
    private double depreciacao;
    private double agio;
    private double intangiveis;
    private double investimentos_LP;
    private double realizavel_LP;
    private double outros_AtivosLP;
    private double outros_Ativos;

    public AtivoNC() {
        this.imobilizado = 0;
        this.depreciacao = 0;
        this.agio = 0;
        this.intangiveis = 0;
        this.investimentos_LP = 0;
        this.realizavel_LP = 0;
        this.outros_AtivosLP = 0;
        this.outros_Ativos = 0;
    }

    public double getImobilizado() {
        return imobilizado;
    }

    public void setImobilizado(double imobilizado) {
        this.imobilizado = imobilizado;
    }

    public double getDepreciacao() {
        return depreciacao;
    }

    public void setDepreciacao(double depreciacao) {
        this.depreciacao = depreciacao;
    }

    public double getAgio() {
        return agio;
    }

    public void setAgio(double agio) {
        this.agio = agio;
    }

    public double getIntangiveis() {
        return intangiveis;
    }

    public void setIntangiveis(double intangiveis) {
        this.intangiveis = intangiveis;
    }

    public double getInvestimentos_LP() {
        return investimentos_LP;
    }

    public void setInvestimentos_LP(double investimentos_LP) {
        this.investimentos_LP = investimentos_LP;
    }

    public double getRealizavel_LP() {
        return realizavel_LP;
    }

    public void setRealizavel_LP(double realizavel_LP) {
        this.realizavel_LP = realizavel_LP;
    }

    public double getOutros_AtivosLP() {
        return outros_AtivosLP;
    }

    public void setOutros_AtivosLP(double outros_AtivosLP) {
        this.outros_AtivosLP = outros_AtivosLP;
    }

    public double getOutros_Ativos() {
        return outros_Ativos;
    }

    public void setOutros_Ativos(double outros_Ativos) {
        this.outros_Ativos = outros_Ativos;
    }
}
