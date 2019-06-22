package balanco;

public class AtivoC {
    private double caixa;
    private double investimentos_CP;
    private double contas_Receber;
    private double inventario;
    private double despesas_Antecipadas;
    private double outros_ativosCirculates;

    public AtivoC() {
    }

    public double getCaixa() {
        return caixa;
    }

    public void setCaixa(double caixa) {
        this.caixa = caixa;
    }

    public double getInvestimentos_CP() {
        return investimentos_CP;
    }

    public void setInvestimentos_CP(double investimentos_CP) {
        this.investimentos_CP = investimentos_CP;
    }

    public double getContas_Receber() {
        return contas_Receber;
    }

    public void setContas_Receber(double contas_Receber) {
        this.contas_Receber = contas_Receber;
    }

    public double getInventario() {
        return inventario;
    }

    public void setInventario(double inventario) {
        this.inventario = inventario;
    }

    public double getDespesas_Antecipadas() {
        return despesas_Antecipadas;
    }

    public void setDespesas_Antecipadas(double despesas_Antecipadas) {
        this.despesas_Antecipadas = despesas_Antecipadas;
    }

    public double getOutros_ativosCirculates() {
        return outros_ativosCirculates;
    }

    public void setOutros_ativosCirculates(double outros_ativosCirculates) {
        this.outros_ativosCirculates = outros_ativosCirculates;
    }
}