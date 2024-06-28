public class Curso extends Conteudo {
    @Override
    public String toString() {
        return "CURSO=" + getTitulo() + 
        ", DESCRIÇÃO=" + getDescricao() + 
        ", CARGA HORÁRIA=" + cargahoraria + "]";
    }
    @Override
    public double calcularXp() {
        return XP_PADRAO = cargahoraria;
    }   
    private int cargahoraria;
 
    public Curso(){

    }
    public int getCargahoraria() {
        return cargahoraria;
    }
    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

}
