package exercicios.Exercicio_StringBuilder.Entidade;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date momento;
    private String titulo;
    private String Conteudo;
    private Integer likes;
    
    private List<comentario> comentarios = new ArrayList<>();

    public Post() {
    }

    public Post(Date momento, String titulo, String conteudo, Integer likes) {
        this.momento = momento;
        this.titulo = titulo;
        Conteudo = conteudo;
        this.likes = likes;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return Conteudo;
    }

    public void setConteudo(String conteudo) {
        Conteudo = conteudo;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<comentario> getComentarios() {
        return comentarios;
    }

    public void addComentario(comentario comentario){
        comentarios.add(comentario);
    }
    public void removeComentario(comentario comentario){
        comentarios.remove(comentario);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(titulo + "\n");
        sb.append(likes);
        sb.append(" likes - ");
        sb.append(sdf.format(momento) + "\n");
        sb.append(Conteudo + "\n");
        sb.append("Comments: \n");
        for (comentario c : comentarios) {
            sb.append(c.getTexto() + "\n");
        }
        return sb.toString();
    }
    
    
}
