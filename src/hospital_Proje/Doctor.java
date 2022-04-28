package hospital_Proje;

public class Doctor {
    private String doctorName;
    private String doctorSurName;
    private String degree;
    private String situation;
    private String urgency;

    public Doctor(String doctorName, String doctorSurName, String degree, String situation, String urgency) {
        this.doctorName = doctorName;
        this.doctorSurName = doctorSurName;
        this.degree = degree;
        this.situation = situation;
        this.urgency = urgency;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public String getUrgency() {
        return urgency;
    }

    public void setUrgency(String urgency) {
        this.urgency = urgency;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorSurName() {
        return doctorSurName;
    }

    public void setDoctorSurName(String doctorSurName) {
        this.doctorSurName = doctorSurName;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return
                "doctorName='" + doctorName + '\'' +
                ", doctorSurName='" + doctorSurName + '\'' +
                ", degree='" + degree + '\'' +
                ", situation='" + situation + '\'' +
                ", urgency='" + urgency + '\'' ;
    }


}
