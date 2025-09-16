public class SistemaOperacional {
    private Computador computador;

	public SistemaOperacional(Computador computador) {
        this.computador = computador;
    }

    public Boolean executarPrograma(Programas p){
        if (p.getSSDOcupado() > computador.getSSD()) {
            System.out.println("Erro de instalação: SSD insuficiente.");
            return false;    
        }
        if (p.getMemoriaRAMAlocada()> computador.getMemoriaRAM()) {
            System.out.println("Erro de instalação: Memória Insuficiente.");
            return false;
        }
        Integer tempoExecucao = calcularTempoExecucao(p);
        System.out.println("Programa inicializado com sucesso! Tempo de execução: " + tempoExecucao + " segundos.");
        return true;
    }

        private Integer calcularTempoExecucao(Programas p){
            float operacoesPorSegundo = computador.getOperacoesPorSegundo();
            Integer nucleos = computador.getNucleos();
            Integer quantidadeOperacoes = p.getQuantidadeOperacoes();
            return (int) (quantidadeOperacoes/ (operacoesPorSegundo*nucleos));
      }
    }