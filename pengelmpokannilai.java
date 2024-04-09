public class pengelmpokannilai {
    public static void main(String[] args) {
        int nilai = 80;
        if (nilai>100||nilai<0) {
            System.out.println("Nilai INVALID");
        }
        else if (nilai>=75) {
            System.out.println("Nilai : A");
        }
        else if (75>nilai&&nilai>=70) {
            System.out.println("Nilai : B");
        }
        else if (nilai>60&&nilai<70) {
            System.out.println("Nilai : C");
        }
    }
}
