package OgrenciBilgiSistemi;

public class Teacher {

    String name;
    String mpno;
    String branch;

    public Teacher(String name, String mpno, String branch){
        this.branch=branch;
        this.mpno=mpno;
        this.name=name;
    }

    public void print(){
        System.out.println("Adı: " + this.name);
        System.out.println("Tel: " + this.mpno);
        System.out.println("Branş: " + this.branch);
    }
}
