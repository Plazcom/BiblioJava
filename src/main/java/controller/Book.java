package controller;

class Book {
    private int idbook;
    private String title;
    private String first_sentence;
    private String image_url;
    private boolean is_loan;
    private int price;

    public Book(int idbook, String title, String first_sentence, String image_url, boolean is_loan, int price) {
        this.idbook = idbook;
        this.title = title;
        this.first_sentence = first_sentence;
        this.image_url = image_url;
        this.is_loan = is_loan;
        this.price = price;
    }

    public Book(String title, String first_sentence, String image_url, int price) {
        this.idbook = 0;
        this.title = title;
        this.first_sentence = first_sentence;
        this.image_url = image_url;
        this.is_loan = false;
        this.price = price;
    }

    public int getIdbook() {
        return idbook;
    }

    public void setIdbook(int idbook) {
        this.idbook = idbook;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirst_sentence() {
        return first_sentence;
    }

    public void setFirst_sentence(String first_sentence) {
        this.first_sentence = first_sentence;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public boolean isIs_loan() {
        return is_loan;
    }

    public void setIs_loan(boolean is_loan) {
        this.is_loan = is_loan;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
