package sistema_radar;

public class Simulacao {
    public static void main(String[] args) {
        Carro voyage = new Carro();
        voyage.ano = 07;
        voyage.modelo = "Comodoro";
        voyage.placa = "AUZ3R13";
        voyage.velocidade = 0;
        
        Carro opala = new Carro();
        opala.ano = 76;
        opala.modelo = "Comodoro";
        opala.placa = "JUS3T12";
        opala.velocidade = 0;

        Radar radar = new Radar();
        radar.localizacao = "Pistão Sul";
        radar.limiteVelocidade = 60;

        radar.avaliarVelocidade(voyage);

        voyage.acelerar(); //10
        voyage.acelerar();
        voyage.acelerar();
        voyage.acelerar();
        voyage.acelerar();
        voyage.acelerar();
        voyage.acelerar();
        voyage.acelerar(); //80
        voyage.freiar();

        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();

        radar.avaliarVelocidade(voyage);
        radar.avaliarVelocidade(opala);
    }
    
}
