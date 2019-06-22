package balanco;

public class PassivoC {
    private double contas_Pagar;
    private double a_Recolher;
    private double investimentos_CP;
    private double emprestimo_CP;
    private double parcela_Circulante;
    private double outros_Passivos;

    public PassivoC() {
    }

    public double getContas_Pagar() {
        return contas_Pagar;
    }

    public void setContas_Pagar(double contas_Pagar) {
        this.contas_Pagar = contas_Pagar;
    }

    public double getA_Recolher() {
        return a_Recolher;
    }

    public void setA_Recolher(double a_Recolher) {
        this.a_Recolher = a_Recolher;
    }

    public double getInvestimentos_CP() {
        return investimentos_CP;
    }

    public void setInvestimentos_CP(double investimentos_CP) {
        this.investimentos_CP = investimentos_CP;
    }

    public double getEmprestimo_CP() {
        return emprestimo_CP;
    }

    public void setEmprestimo_CP(double emprestimo_CP) {
        this.emprestimo_CP = emprestimo_CP;
    }

    public double getParcela_Circulante() {
        return parcela_Circulante;
    }

    public void setParcela_Circulante(double parcela_Circulante) {
        this.parcela_Circulante = parcela_Circulante;
    }

    public double getOutros_Passivos() {
        return outros_Passivos;
    }

    public void setOutros_Passivos(double outros_Passivos) {
        this.outros_Passivos = outros_Passivos;
    }
}
