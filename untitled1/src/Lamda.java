interface Shubham{
    void me();
    void anotherme();
        }
public class Lamda {
    public static void main(String[] args) {
        Shubham sh=new Shubham() {
            @Override
            public void me() {
                System.out.println("hello");
            }

            @Override
            public void anotherme() {
                System.out.println("Bye");

            }
        };
        sh.me();
        sh.anotherme();
    }
}
