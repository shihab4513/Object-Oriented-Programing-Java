public class Ebook extends Book {
    public String format;
    public Ebook(int chapters,int pages,String format)
    {
        super(chapters,pages);
        this.format=format;

    }

    public Ebook() {
        super();
    }


    public void printSummery()
    {

        System.out.println("Chapters: "+chapters);
        System.out.println("Pages: "+pages);
        System.out.println("Pdf: "+format);
    }
}
