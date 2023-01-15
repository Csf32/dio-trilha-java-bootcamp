package DioBootcampDesafio;

public class Curso extends Conteudo{
   
    private int cargaHoraria;

    public Curso(){

    }


    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcualarXp() {
       
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
    }


}
