public class ReadBook {
    public static void main(String[] args){
        Book myBook = new Book();
        myBook.name();
        System.out.println(myBook.name());
        myBook.book("Turn the next page", "Go to the previous page");
       // myBook.page(26);
        System.out.println(myBook.page(26));
        System.out.println(myBook.var('x'));

    }
}
