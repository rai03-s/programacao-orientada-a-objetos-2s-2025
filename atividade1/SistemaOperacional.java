public class SistemaOperacional extends Computador {

    private Boolean executarPrograma;

    public SistemaOperacional(Boolean executarPrograma) {
        this.executarPrograma = executarPrograma;
    }

    public SistemaOperacional(){
        super(getMemoriaRAM(), getSSD(), getNucleos(), getOperacoesPorSegundo())
    }
    public Boolean isExecutarPrograma() {
        return this.executarPrograma;
    }

    public Boolean getExecutarPrograma() {
        return this.executarPrograma;
    }

    public void setExecutarPrograma(Boolean executarPrograma) {
        this.executarPrograma = executarPrograma;
    }
}