package DioBootcampDesafio;
import java.time.LocalDate;

public class Mentoria extends Conteudo{
    
    private LocalDate data;

    public Mentoria(){

    }
    
  
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcualarXp() {
        
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
    }

}
