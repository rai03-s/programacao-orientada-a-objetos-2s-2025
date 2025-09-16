public class Main {
    public static void main(String[] args) {
        Computador computador = new Computador(12, 500, 4, 3.5f);

        Programas programa1 = new Programas(14, 450, 2, 3);
        Programas programa2 = new Programas(8, 600, 2, 3);
        Programas programa3 = new Programas(8, 300, 2, 2);

        SistemaOperacional sistemaOperacional = new SistemaOperacional(computador);

        System.out.println("Teste 1");
        sistemaOperacional.executarPrograma(programa1);
        
    }
    
}