package info.savaged;

public class Main {
    public static void main(String[] args) {
        if (args == null || args.length == 0) return;
        System.out.println(Rot13.encode(args[0]));
    }
}