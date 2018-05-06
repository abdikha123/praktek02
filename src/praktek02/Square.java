package praktek02;
public class Square {
    double sisi1;
    double sisi2;

    public Square() {
        sisi1=10;
        sisi2=10;
    }

    public Square(double sisi1, double sisi2) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
    }

    
    
   void cetakInfo(){
        System.out.println("===============");
        System.out.println("Sisi : "+sisi1);
        System.out.println("Sisi : "+sisi2);
        System.out.println("===============");
    }
   
   
   double hitungluas(){
       double luas;
       luas = sisi1*sisi2;
       return luas;
   }
   void cetakLuas(){
       System.out.println("Luasnya Adalah: "+hitungluas());
   }
}
