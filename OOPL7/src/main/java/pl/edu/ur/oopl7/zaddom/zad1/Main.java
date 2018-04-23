package pl.edu.ur.oopl7.zaddom.zad1;

public class Main {
  public static void main(String[] args){

        Osoba o1 = new Osoba("Jacek","Kłoda","10-10-1911");
        Student s1 = new Student("Jacek","Kłoda","10-10-1911",1651646511,"Magister","informatyka",1);
        Wykladowca w1 = new Wykladowca("Biedroń","Kamyk","01-01-1900","mgr inz", "Infromatyki","WDI","Tak");

        System.out.println(o1+"\n\n");
        System.out.println(s1+"\n\n");
        System.out.println(w1);

    }
}