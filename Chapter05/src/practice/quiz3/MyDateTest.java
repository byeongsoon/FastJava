package practice.quiz3;

public class MyDateTest {

  public static void main(String[] args) {
    MyDate date1 = new MyDate(30,2,2020);
    System.out.println(date1.isValid());
    MyDate date2 = new MyDate(2,10,2020);
    System.out.println(date2.isValid());
  }

}
