public class Main {
    public static void main(String[] args) {
        AudiS8 audiS8 = new AudiS8("XYZ354", 130, true);
        AudiS8 audiS8Masik = new AudiS8("ASD323", 120, false);

        System.out.println(audiS8.gyorshajtottE(100));
        System.out.println(audiS8Masik.gyorshajtottE(100));
        System.out.println(audiS8.toSting());
        System.out.println(audiS8Masik.toSting());


        Robogo robogo = new Robogo("JDK241", 65, 70);
        System.out.println(robogo.haladhatott(80));
        System.out.println(robogo.toString());
        System.out.println(robogo.gyorshajtottE(50));
    }
}
