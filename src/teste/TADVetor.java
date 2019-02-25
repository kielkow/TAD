package teste;

public interface TADVetor {
    
    public void insereElemento(int indice, int valor);
    public int obterElemento(int indice) throws indiceInvalidoException;
    
}
