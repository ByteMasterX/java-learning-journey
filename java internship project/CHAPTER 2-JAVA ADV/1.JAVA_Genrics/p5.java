public class p5{
    public static <T> void printData(T data){
        System.out.println(data);
    }
    public static void main(String[] args) {
        printData(100);
        printData("Hello");
        printData(10.5);
    }
}