public class Algoritmo48 {
    //considere a matriz quadrada
    /*
        20,50,80
        45,60,90
        45,67,89
        
        faça um algoritmo que mostre apenas os valores da diagonal principal
    */
   public void main()
   {
        int[][] numeros = {
            {20, 50, 80},
            {45, 60, 90},
            {45, 57, 89}
        }; 

        for(int i=0; i<numeros.length; i++)
        {
                IO.println(numeros[i][i]);
        }         
   }
}
