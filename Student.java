public class Student extends Person {

    String Studiengang;

    public Student(String name, int alter, String Studiengang){
        super(name,alter,Studiengang);
        this.Studiengang=Studiengang;
    }

    public void introduceYourself(){
        System.out.println("Hallo mein Name ist "+ name+ " und ich bin "+alter+" Jahre alt");
    }
    
}
