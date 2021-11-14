import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);


        int qtdVendedores = sc.nextInt();
        int qtdLigacoes = sc.nextInt();
        ArrayList duracaoLigacao = new ArrayList();
        ArrayList Vendedores = new ArrayList();
        ArrayList tempVendedores = new ArrayList();
 


        for (int i=0; i<qtdLigacoes; i++){
            duracaoLigacao.add(sc.nextInt());
        }

        for (int i=0; i<qtdVendedores; i++){
            tempVendedores.add(-1);
        }

        for (int i=0; i<qtdVendedores; i++){
            Vendedores.add(0);
        }
      
        while (qtdLigacoes > 0){
            for (int i=0; i<qtdVendedores; i++){
                if (qtdLigacoes > 0){ 
            
                    int aux = (Integer)tempVendedores.get(i);
                    int duracao = (Integer)duracaoLigacao.get(i);
                    int vendedores = (Integer)Vendedores.get(i);

                    if (aux == -1){
                        tempVendedores.set(i,duracao);
                        Vendedores.set(i,vendedores+1);
                        qtdLigacoes=qtdLigacoes-1;
                    } else if(aux == 0){
                        tempVendedores.set(i,-1);
                    }else if(aux>0){
                        tempVendedores.set(i, aux-1);
                    }
                }
            }
            
        }
        

        for (int i=0; i<qtdVendedores; i++){
            System.out.print(i+1 + " " + Vendedores.get(i) + "\n" );
        }




        sc.close();
  }
}





