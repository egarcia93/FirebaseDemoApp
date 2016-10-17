package mx.itesm.a01333060.firebasedemoapp;

/**
 * Created by enriquegarciaalcala on 13/10/16.
 */

public class MessageToFirebase

{


    String message;
    String author;

    public MessageToFirebase() {
    }

    public MessageToFirebase(String message, String author) {
        this.message = message;
        this.author = author;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
