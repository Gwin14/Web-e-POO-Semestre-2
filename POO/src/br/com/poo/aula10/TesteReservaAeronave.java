package br.com.poo.aula10;

public class TesteReservaAeronave {

    public static void main(String[] args) {

        try {
            Aeronave atrAzul = new Aeronave();

            atrAzul.totalAssentos = 200;
            atrAzul.reservarAssentos(2);
            atrAzul.reservarAssentos(10);

            System.out.println("Total disponível: " + atrAzul.calcularAssentosDisponiveis());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Aeronave gol = new Aeronave();

        gol.totalAssentos = 250;
        gol.reservarAssentos(150);

    }

}
