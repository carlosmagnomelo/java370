public class Algoritmo44 {
    public void main()
    {
        //matriz unidimensional 1d
        //matriz bidimensional 2d
        //matriz tridimensional 3d
        //tensores (N dimensões - Redes Neurais)

        // matriz i, j:
        double[][] notas = {
            {100, 80, 40, 30}, 
            {78, 87, 55, 90}, 
            {67, 78, 34, 56},
            {50, 56, 55, 22}

        };
        for(int i=0; i<notas.length; i++)
        {
            for(int j=0; j<notas[i].length; j++)
            {
                IO.println(notas[i][j]);
            }
        }
        
        

        
    }
}
