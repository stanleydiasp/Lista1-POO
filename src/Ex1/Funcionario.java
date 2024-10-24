package Ex1;

public class Funcionario {

    public double calculaSalario(double vendas) {

        double salario;

        if (vendas > 8000) {
            salario = 382.33 + (vendas * 0.08675);
        }
        else {
            salario = 177.12 + (vendas * 0.0387);
        }

        return salario;
    }
}
