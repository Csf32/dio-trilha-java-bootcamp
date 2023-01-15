package DioBootcampDesafio;

public abstract class Conteudo {
    
    protected static final double XP_PADRAO = 10d;
    private String titulo, descricao;

    
    public static double getXpPadrao() {
        return XP_PADRAO;
    }


    public String getTitulo() {
        return titulo;
    }


    public String getDescricao() {
        return descricao;
    }


    public abstract double calcualarXp();


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    } 



    
}
