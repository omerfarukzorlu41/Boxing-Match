public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("OMAR",15,100,90,28);
        Fighter f2 = new Fighter("FARUK",20,85,95,35);

        Match match = new Match(f1,f2,80,100);
        match.run();
    }
}
