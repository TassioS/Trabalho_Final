package balanco;

public class Patrimonio_Liquido {
    private double acoes_PreferenciaisResgataveis;
    private double agio;
    private double acoes_Ordinarias;
    private double capital_Social;
    private double lucros_Retidos;
    private double acoes_Tesouraria;
    private double garantia_Divida;
    private double ganho_Naorealizado;
    private double outros_PatrimoniosLiquidos;

    public Patrimonio_Liquido() {
        this.acoes_PreferenciaisResgataveis = 0;
        this.agio = 0;
        this.acoes_Ordinarias = 0;
        this.capital_Social = 0;
        this.lucros_Retidos = 0;
        this.acoes_Tesouraria = 0;
        this.garantia_Divida = 0;
        this.ganho_Naorealizado = 0;
        this.outros_PatrimoniosLiquidos = 0;
    }

    public double getAcoes_PreferenciaisResgataveis() {
        return acoes_PreferenciaisResgataveis;
    }

    public void setAcoes_PreferenciaisResgataveis(double acoes_PreferenciaisResgataveis) {
        this.acoes_PreferenciaisResgataveis = acoes_PreferenciaisResgataveis;
    }

    public double getAgio() {
        return agio;
    }

    public void setAgio(double agio) {
        this.agio = agio;
    }

    public double getAcoes_Ordinarias() {
        return acoes_Ordinarias;
    }

    public void setAcoes_Ordinarias(double acoes_Ordinarias) {
        this.acoes_Ordinarias = acoes_Ordinarias;
    }

    public double getCapital_Social() {
        return capital_Social;
    }

    public void setCapital_Social(double capital_Social) {
        this.capital_Social = capital_Social;
    }

    public double getLucros_Retidos() {
        return lucros_Retidos;
    }

    public void setLucros_Retidos(double lucros_Retidos) {
        this.lucros_Retidos = lucros_Retidos;
    }

    public double getAcoes_Tesouraria() {
        return acoes_Tesouraria;
    }

    public void setAcoes_Tesouraria(double acoes_Tesouraria) {
        this.acoes_Tesouraria = acoes_Tesouraria;
    }

    public double getGarantia_Divida() {
        return garantia_Divida;
    }

    public void setGarantia_Divida(double garantia_Divida) {
        this.garantia_Divida = garantia_Divida;
    }

    public double getGanho_Naorealizado() {
        return ganho_Naorealizado;
    }

    public void setGanho_Naorealizado(double ganho_Naorealizado) {
        this.ganho_Naorealizado = ganho_Naorealizado;
    }

    public double getOutros_PatrimoniosLiquidos() {
        return outros_PatrimoniosLiquidos;
    }

    public void setOutros_PatrimoniosLiquidos(double outros_PatrimoniosLiquidos) {
        this.outros_PatrimoniosLiquidos = outros_PatrimoniosLiquidos;
    }
}
