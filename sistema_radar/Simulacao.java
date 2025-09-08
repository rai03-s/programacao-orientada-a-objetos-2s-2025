package sistema_radar;

public class Simulacao {
    public static void main(String[] args) {
        
        Carro opala = new Carro("JUS3T12", 0, 76, "Comodoro");

        Radar radar = new Radar("Pistão Sul", 60);

        radar.avaliarVelocidade(opala);

        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();

        radar.avaliarVelocidade(opala);
    }
    
}
