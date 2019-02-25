package teste;

public class Teste {

    public static void main(String[] args) {
        
        int vet[] = new int[5];
        try{
            vet[-1] = 5;
            System.out.println(vet[1]);
        }
        catch(ArrayIndexOutOfBoundsException ex){
            Vetor tadVetor = new Vetor(5);
            System.out.println("Indice inválido " + ex.getMessage());
        }
        Vetor tadVetor = new Vetor(5);
        tadVetor.insereElemento(-1, 5);
        try{
            System.out.println(tadVetor.obterElemento(-1));
        }
        catch(indiceInvalidoException ex){
            System.out.println(ex.getMessage());
        }
        
        TADVetor v1 = new Vetor(100);
        
    }
    
}
