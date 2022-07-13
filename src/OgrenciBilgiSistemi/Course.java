package OgrenciBilgiSistemi;

public class Course {

    //Sınıflar birbirlerinin nitelikleri olabilirler.
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    public Course(String name, String code, String prefix, Teacher teacher){
        this.code=code;
        this.name=name;
        this.prefix=prefix;
        this.teacher=teacher;
        this.note=0;
    }

    public void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        }else{
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor.");
        }
    }

    public void printTeacher(){
        this.teacher.print();
    }
}
