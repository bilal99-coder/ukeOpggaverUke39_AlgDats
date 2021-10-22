public class Oppgave1 {
    public static void main(String[] args) {
        int [] a = {1,2,10,2,15,98,12,6,5,9};
        int antall = 0;
        for(int k : a) if (k> 10) antall++;
        System.out.println(antall);
    }
}
