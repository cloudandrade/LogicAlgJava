package srcPontos;

public class FilaLogicAlg {
    
    private int[] vetorfila;
    private int inicio;
    private int fim;
    private int valor;

    public FilaLogicAlg() {
    vetorfila = new int [100];
    inicio = 0;
    fim = 0;
    valor = 0;
}

public void inserir(int x){  // Método criado para inserir um valor na fila
    if(filaCheia()){
    throw new RuntimeException("Fila CHEIA");
    }
    vetorfila[fim] = x;
    fim=(fim+1)% vetorfila.length;
    valor++;
}

public int retirar(){ // Método criado para retirar um valor da fila
    if(filaVazia()){
    throw new RuntimeException("Fila VAZIA");
    }         
    int x = vetorfila[inicio];
    inicio = (inicio+1)% vetorfila.length;
    valor--;
    return x;
    }

    public boolean filaVazia(){ // Método criado para verificar se a fila esta vazia
    return valor==0;
}  

public boolean filaCheia(){ // Método criado para verificar se a fila esta cheia
    return valor==vetorfila.length;
}

public void imprimirFila(){ // Método criado para imprimir o valor da fila
    while(!filaVazia()){
    int x = retirar();
    System.out.println("Você entro na casa: "+x);
    } 
}

public void ordenarFilaInsertionSort () { // Método criado para ordena os valores da fila
    int  cont1, cont2, num_atual;
    for (cont1 = 1; cont1 < vetorfila.length; cont1++) {
    num_atual = vetorfila[cont1];
    cont2 = cont1 - 1;
    
    while((cont2 >= 0) && (num_atual < vetorfila[cont2])){

    vetorfila[cont2 + 1] = vetorfila[cont2];
    cont2--;
    }
    vetorfila[cont2+1] = num_atual;	
    }
    for (cont1 = 0; cont1 < vetorfila.length; cont1++) {
    
    }
    }

public void QuantidadeAcessoCasasFila(){ // Método criado para verificar quantas vezes as casas foram acessadas
        try {
        int contacessos,casaum=0,casadois=0, casatres=0, casaquatro=0;       
        
        for(contacessos=0;contacessos<vetorfila.length;contacessos++){ 
        
        if(vetorfila[contacessos]==1){
        casaum++;
        }
        if(vetorfila[contacessos]==2){
        casadois++;
        }
        if(vetorfila[contacessos]==3){
        casatres++;
        }
        if(vetorfila[contacessos]==4){
        casaquatro++;
        }        
        }
        System.out.println("Casa 1 foi acessada "+casaum+" vezes.");
        System.out.println("Casa 2 foi acessada "+casadois+" vezes.");
        System.out.println("Casa 3 foi acessada "+casatres+" vezes.");
        System.out.println("Casa 4 foi acessada "+casaquatro+" vezes.");

        } catch (Exception e) {
        System.out.println("Erro no metodo de contagem de repetição");
        }
        }

    public int[] getVetorfila() {
        return vetorfila;
    }

}
