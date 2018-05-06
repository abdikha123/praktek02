package praktek02;
public class SquareAksi {
    public static void main(String[] args) {
        Square s1 = new Square();
        s1.sisi1 = 8;
        s1.sisi2 = 8;
        
        s1.cetakInfo();
        System.out.println("Luas Square = "+s1.hitungluas());
        s1.cetakLuas();
        
        Square s2 = new Square();
        s2.cetakInfo();
        
        Square s3 = new Square(15,15);
        s3.cetakInfo();
    }
}
