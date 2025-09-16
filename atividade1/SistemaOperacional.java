public class SistemaOperacional {
    private Computador computador;

	public SistemaOperacional(Computador computador) {
    }

    public Boolean executarPrograma(Programa p){
        if (p.getSSDOcupado() > computador.getSSD()) {
            System.out.println("Erro de instalação: SSD insuficiente.");
            return false;    
        }
        if (p.getMemoriaRAMAlocada()> computador.getMemoriaRAM()) {
            System.out.println("Erro de instalação: Memória Insuficiente.");
            return false;
        }
        Integer tempoExecucao = calcularTempoExecucao(p);
        System.out.println("Tempo de execução: " + tempoExecucao + " segundos.");
        return true;
    }

        private Integer calcularTempoExecucao(Programa p){
            float operacoesPorSegundo = computador.getOperacoesPorSegundo();
            Integer nucleos = computador.getNucleos();
            Integer quantidadeOperacoes = p.getQuantidadeOperacoes();
            return (int) (quantidadeOperacoes/ (operacoesPorSegundo*nucleos));
      }
    }