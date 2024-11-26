package inheritanceAndPolymorphism;

class LibraryItem {
    private String title;
    private String authorOrDirector;
    private int price;

    public LibraryItem(String title, String authorOrDirector, int price) {
        this.title = title;
        this.authorOrDirector = authorOrDirector;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author/Director: " + authorOrDirector);
        System.out.println("Price: " + price);
    }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAuthorOrDirector() {
		return authorOrDirector;
	}

	public void setAuthorOrDirector(String authorOrDirector) {
		this.authorOrDirector = authorOrDirector;
	}
}

class Book extends LibraryItem {
    public Book(String title, String author, int price) {
        super(title, author, price);
    }
}

class DVD extends LibraryItem {
    public DVD(String title, String director, int price) {
        super(title, director, price);
    }
}
