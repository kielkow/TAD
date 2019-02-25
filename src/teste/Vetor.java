package teste;

public class Vetor implements TADVetor{
    int vet[];
    
   public Vetor(int tamanho){
        vet = new int[tamanho];
    }
   
    @Override
   public void insereElemento(int indice, int valor){
       if(indice>=0 && indice < vet.length){
           vet[indice] = valor;
       }
       else{
           System.out.println("Indice inválido " + indice);
       }
   }
   
    @Override
   public int obterElemento(int indice) throws indiceInvalidoException{
       if(indice>=0 && indice < vet.length){
           return vet[indice];
       }
       throw new indiceInvalidoException("Indice inválido " + indice);
   }
}
