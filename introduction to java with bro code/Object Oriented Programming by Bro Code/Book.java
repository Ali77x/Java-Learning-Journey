class Book{

    String title;
    int pages;

    Book(String title, int pages){
        this.pages = pages;
        this.title = title;
        
    }

    String displayInfo(){

        return "Title: " + this.title + "\nNumber of pages: " + this.pages;  
    }
    
}