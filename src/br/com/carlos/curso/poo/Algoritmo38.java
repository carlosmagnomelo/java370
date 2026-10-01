package br.com.carlos.curso.poo;
import javax.swing.JOptionPane;

public class Algoritmo38 {
    
    public void main()
    {
        JOptionPane.showMessageDialog(null, "Agencia SenaiCar");
        
        Carro c = new  Carro("PAXG", 120, "flex", "Azul", 4);
        JOptionPane.showMessageDialog(null, c.getPlaca());
        JOptionPane.showMessageDialog(null, c.getCor());
        JOptionPane.showMessageDialog(null, c.getTipoCombustivel());
        JOptionPane.showMessageDialog(null, c.getNumPortas());
        JOptionPane.showMessageDialog(null, c.getVelocidadeMax());
        
    }



}
