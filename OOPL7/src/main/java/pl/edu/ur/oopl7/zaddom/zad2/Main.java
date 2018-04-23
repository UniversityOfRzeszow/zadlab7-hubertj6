package pl.edu.ur.oopl7.zaddom.zad2;

public class Main {
    public static void main(String[] args){
 
       Punkt2D[] array2D = new Punkt2D[100];
       Punkt3D[] array3D = new Punkt3D[100];
        for(int i = 0; i<100;i++){
            array2D[i] = new Punkt2D().LPunkt();
           array3D[i] = new Punkt3D().LPunkt();
        }

        for(int i=0;i<100;i++){
            if (array2D[i].getX() == array3D[i].getX() && array2D[i].getY() == array3D[i].getY()){
                System.out.println(array2D[i].toString()+" | "+array3D[i].toString());
           }
       }
    }
}