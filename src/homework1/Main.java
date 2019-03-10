package homework1;

public class Main {
    public static void main(String[] args){
    Author au1=new Author("AAA","mail1",'f');
    Author au2=new Author("BBB","mail2",'m');
    Author au3=new Author("CCC","mail3",'f');
    Author[] auu = {au1,au2,au3};

    Book book1 = new Book("Book",auu,1000,300 );
    System.out.println(book1.getAuthorNames());

    /*Employee emp1 = new Employee(1, "Art","Art",1000);
    Rectangle rec1 = new Rectangle(20,20);
    Circle cir1 = new Circle(5,"blue");
    MyPoint mp1= new MyPoint(4,3);
    MyPoint mp2= new MyPoint(3,4);
    MyPoint mp3 = new MyPoint(0,0);

    MyTriangle tr1 = new MyTriangle(0,0,7,5,4,10);

    System.out.println(tr1.toString());*/

    }
}
