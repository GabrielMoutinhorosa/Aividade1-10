package org.example.ATV01;

public class Robo {
    String nome;
    int energia = 100;
    boolean ligado = false;

    public void ligar() { ligado = true; System.out.println("Robô ligado!"); }
    public void desligar() { ligado = false; System.out.println("Robô desligado!"); }

    private void consumirEnergia(int valor) {
        energia -= valor;
        System.out.println("Energia atual: " + energia);
        if (energia <= 0) {
            System.out.println("Energia esgotada!");
            desligar();
        }
    }

    public void andar() { System.out.println("Andando..."); consumirEnergia(20); }
    public void virarEsquerda() { System.out.println("Virou à esquerda."); consumirEnergia(10); }
    public void virarDireita() { System.out.println("Virou à direita."); consumirEnergia(10); }
}