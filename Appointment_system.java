/**
 * Write a description of class: To make an appointment system for spa booking system
 *
 * Programmer: Haziq
 * Date: 14 June 2024
 */
//Scanner class
import java.util.Scanner; 

//Appointment class
public class Appointment_system
{
    private String custName, apptDate, apptTime, spaAttendantName;
    private int numAppointments = 1;

    //Appointment constuctor with parameter
    public Appointment_system(String custName, String apptDate, String apptTime, String spaAttendantName) {
        this.custName = custName;
        this.apptDate = apptDate;
        this.apptTime = apptTime;
        this.spaAttendantName = spaAttendantName;

    }

    public void setcustName(String custName) {//Mutators
        this.custName = custName;
    }

    public String getcustName() {//Accessors
        return custName;
    }

    public void setapptDate(String apptDate) {//Mutators
        this.apptDate = apptDate;
    }

    public String getapptDate() {//Accessors
        return apptDate;
    }    

    public void setapptTime(String apptTime) {//Mutators
        this.apptTime = apptTime;
    }

    public String getapptTime() {//Accessors
        return apptTime;
    }   

    public void setspaAttendantName(String spaAttendantName) {//Mutators
        this.spaAttendantName = spaAttendantName;
    }

    public String getspaAttendantName() {//Accessors
        return spaAttendantName;
    }

    //toString 
    @Override
    public String toString(){
        return "Customer Name: " + custName + "\n" + "Appointment Date: " + apptDate + "\n" + "Appointment Time: " + apptTime + "\n" + "Spa Attendant Name: " + spaAttendantName; 
    }  
}
