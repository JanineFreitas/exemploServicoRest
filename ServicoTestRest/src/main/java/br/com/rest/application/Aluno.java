package br.com.rest.application;

public class Aluno {
	 
    private final long id;
    private final String content;
 
    public Aluno(long id, String content) {
        this.id = id;
        this.content = content;
    }
 
    public long getId() {
        return id;
    }
 
    public String getContent() {
        return content;
    }
}
