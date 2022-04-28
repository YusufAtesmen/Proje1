package hospital_Proje;

import java.util.*;

public class HospitalRunner {
static List<Doctor> informations1=new ArrayList<>();

static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {

        Doctor doctor1 = new Doctor("Nilson", "Avery", "Allergist", "Allergy", "Not Urgent");
        Doctor doctor2 = new Doctor("John", "Abel", "Neurologist", "Headhache", "Not Urgent");
        Doctor doctor3 = new Doctor("Robert", "Eric", "General Surgeon", "Diabetes", "Not Urgan");
        Doctor doctor4 = new Doctor("Marry", "Jacob", "Child Doctor", "Flu", "Not Urgent");
        Doctor doctor5 = new Doctor("Alan", "Pedro", "Internal Medicine", "Migraine", "Urgent");
        Doctor doctor6 = new Doctor("Mahesh", "Tristen", "Cardiologist", "Heart Diseases", "Urgent");

        informations1.add(doctor1);
        informations1.add(doctor2);
        informations1.add(doctor3);
        informations1.add(doctor4);
        informations1.add(doctor5);
        informations1.add(doctor6);


        System.out.println("Welcome to Universal Hospital");
        System.out.println("Please Enter Your Name And Surname");
        String nameSurname =TryCatch.stringGirisi();
        System.out.println("Please Enter Your Disease");
        String disease=TryCatch.stringGirisi();

        control(disease);

        for (int i = 0; i <informations1.size() ; i++) {
            if(informations1.get(i).getSituation().contains(disease)){
                System.out.println(informations1.get(i).getUrgency());
            }
        }

    }

    private static void control(String disease) {
       informations1.
               stream().
               filter(t->t.getSituation().
                       contains(disease)).
               forEach(HospitalRunner::yazdir);

    }
    public static void yazdir(Doctor a){
        System.out.println("Doctor name and Surname : "+a.getDoctorName()+ " "+a.getDoctorSurName()+"\n"+a.getDegree()+"\n"+a.getSituation());
    }
}
