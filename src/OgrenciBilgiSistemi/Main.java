package OgrenciBilgiSistemi;

public class Main {
    public static void main(String[] args){

        Teacher t1 = new Teacher("Kemal","90555555","TRH");
        Teacher t2 = new Teacher("Melike Hoca","9055551755","FZK");
        Teacher t3 = new Teacher("Melike Hoca","9055551755","MTM");

        Course tarih = new Course("Tarih","101","TRH",t1);
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik","101","FZK",t1);
        fizik.addTeacher(t2);

        Course matematik = new Course("Matematik","101","MTM",t1);
        matematik.addTeacher(t3);

        Student s1 = new Student("Burcu L", "2017", "4", tarih, fizik, matematik);
        s1.addBulkExamNote(50,75,75);
        s1.isPass();

        Student s2 = new Student("Burcu L", "2016", "4", tarih, fizik, matematik);
        s2.addBulkExamNote(35,50,50);
        s2.isPass();
    }
}
