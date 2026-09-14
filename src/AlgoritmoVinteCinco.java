public class AlgoritmoVinteCinco {
    public void main(){
        // definindo o vetor de 5 posições
        int[] numeros = new int[5];

        // preenchendo o vetor com os números digitados pelo usuário
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = Integer.parseInt(IO.readln("entre com o número: "));
        }

        // exibindo o dobro de cada número
        for(int i = 0; i < numeros.length; i++){
            IO.println("O dobro da posição " + (i+1) + " = " + (numeros[i] * 2));
        }

    }

}
