import model.Conta;
import utils.ContaException;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.setNum(11);
        conta1.setNome("Ricardo Gomes");
        conta1.depositar(1500);
        try {
            conta1.sacar(300);
            conta1.sacar(1300);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(conta1.getSaldo());
    }
}