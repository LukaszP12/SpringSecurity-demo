package pl.bykowski.spring.security.sample.demo;

public class Quatation {

    private String content;
    private String author;

    public Quatation() {

    }

    public Quatation(String content, String author) {
        this.content = content;
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }



}
