/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perkalian;

/**
 *
 * @author 680183
 */
public class Perkalian {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float a=3;
        float b=-4;
        perkalian(a,b);
        perkalianLoop(a,b);
        kaliLoopPJ1(a,b);
        kaliLoopPJ2(a,b);
    }
    
    public static void perkalian(float a,float b){
    float hasil;
            hasil=a*b;
        System.out.println("Hasil perkalian= "+hasil);
}
    public static void perkalianLoop(float a,float b){
    float hasilLoop=0;
          for (float i=0; i<=a; i++){
              hasilLoop=i*b;
          }
    
        System.out.println("Hasil perkalian Loop 1= "+hasilLoop);
}
    public static void kaliLoopPJ1(float a, float b){//void=prosedur
          float hasilLoop=0;
          for (int i=0; i<Math.abs(a); i++){
              hasilLoop=hasilLoop+b;
          }
          System.out.println("Hasil perkalian loop 2= "+hasilLoop);
      }
     public static void kaliLoopPJ2(float a, float b){//void=prosedur
          float hasilLoop=0;
          for (float i=b; i>0; i--){
              hasilLoop+=b;
          }
          
          System.out.println("Hasil perkalian loop 3 = "+hasilLoop);
      }
     public static void cbkaliLoop(float a, float b) {//void=prosedur
        float hasilLoop = 0;
        if (a < 0) {
            for (int i = 0; i < Math.abs(a); i++) {
                hasilLoop = hasilLoop + b;
            }
            hasilLoop = hasilLoop * -1;
            System.out.println("Hasil perkalian dengan loop = " + (hasilLoop));
        } else {
            for (int i = 0; i < a; i++) {
                hasilLoop = hasilLoop + b;
            }
            System.out.println("Hasil perkalian dengan loop = " + (hasilLoop));
        }
    }
    
}
