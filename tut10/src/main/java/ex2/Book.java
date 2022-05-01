package ex2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        if (title.length() < 3) {
            throw new IllegalArgumentException("Title not valid!");
        }
        if (!validateAuthor(author)) {
            throw new IllegalArgumentException("Author not valid!");
        }
        if (price < 1) {
            throw new IllegalArgumentException("Price not valid!");
        }
        this.title = title;
        this.author = author;
        this.price = price;
    }

    /**
     * @effects return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws IllegalArgumentException {
        if (title.length() < 3) {
            throw new IllegalArgumentException("Title not valid!");
        }
        this.title = title;
    }

    private boolean validateAuthor(String author) {
        Pattern p = Pattern.compile("^(.+)(\\s[0-9])([^\\s]*)$");
        Matcher m = p.matcher(author);
        return !m.find();
    }

    /**
     * @effects return author
     */
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) throws IllegalArgumentException {
        if (!validateAuthor(author)) {
            throw new IllegalArgumentException("Author not valid!");
        }
        this.author = author;
    }

    /**
     * @effects return price
     */
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws IllegalArgumentException {
        if (price < 1) {
            throw new IllegalArgumentException("Price not valid!");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Type: ").append(this.getClass().getSimpleName())
                .append(System.lineSeparator())
                .append("Title: ").append(this.getTitle())
                .append(System.lineSeparator())
                .append("Author: ").append(this.getAuthor())
                .append(System.lineSeparator())
                .append("Price: ").append(this.getPrice()).append(System.lineSeparator());
        return sb.toString();
    }
}
