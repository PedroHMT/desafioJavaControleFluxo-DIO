import java.util.*;

public class Contador {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.print("Insira o primeiro parâmetro: ");
        int p1 = r.nextInt();
        System.out.print("Insira o segundo parâmetro: ");
        int p2 = r.nextInt();

        try{
            contar(p1, p2);
        }catch(ParametrosInvalidosException e1){
            System.out.println(e1.getMessage());
        }
    }

    public static void contar(int p1, int p2) throws ParametrosInvalidosException{
        if(p1 > p2){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }else{
            int r = p2 - p1;
            for(int i = 1; i <= r; i++){
                System.out.println("Imprimindo o número "+i);
            }
        }
    }
}
