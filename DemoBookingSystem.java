/**
 * Write a description of class DemoBookingSystem: to 
 *
 * Programmer: Haziq
 * Date: 14 June 2024
 */

import java.util.Scanner;

//Main method
public class DemoBookingSystem {
    public static void main (String[] args) {
        
        //Scanner 
        Scanner s = new Scanner(System.in);
        Appointment_system [] appoint = new Appointment_system[20];
        int numAppointments = 0;

        
        //preventing from infinite loops
        while (true) {

            // Add the appointments
            System.out.print("\nCustomer Name: ");
            String custName = s.nextLine();

            System.out.print("The Appointment Date (YY/MM/DD): ");
            String apptDate = s.nextLine();

            System.out.print("The Appointment Time (HH:MM)(AM/PM): ");
            String apptTime = s.nextLine();

            System.out.print("Spa Attendent Name: ");
            String spaAttendantName = s.nextLine();

            appoint[numAppointments] = new Appointment_system(custName, apptDate, apptTime, spaAttendantName);

            // Display all the appointment details 
            System.out.println("\nAppointment " + (numAppointments + 1) + " details:");
            System.out.println(appoint[numAppointments].toString());

            //will automatically put the number for appointments 
            numAppointments++;

            // Check if the maximum number of appointments has been reached or not
            if (numAppointments >= appoint.length) {
                System.out.println("\nMaximum number of appointments reached. No more appointments can be added.");
                break;
            }

            // asking to add new appointments
            System.out.println("\nDo you want to add another appointment? (Y/N): ");
            String continueAppointments = s.nextLine();
            if (!continueAppointments.equalsIgnoreCase("y")) {
                break;
            }
        }
        
        // Display all appointments
        System.out.println("\nAll Appointments: ");
        for (int i = 0; i < numAppointments; i++) {
            System.out.println("\nAppointment " + (i + 1) + ":");
            System.out.println(appoint[i].toString());
        }
            
        // preventing from infinite loops 
        while (true) {
            //asking for the number of appointments to be updated
            System.out.print("\nEnter the Appointments number to be updated(1-" + numAppointments + "): ");
            String updateAppointment = s.nextLine();  
        
            //to parsing and validate the number of appointments to proceed
            try {
                int appointNumber = Integer.parseInt(updateAppointment);
                if (appointNumber >= 1 && appointNumber< numAppointments){
                    
                    //asking for the details of new appointments
                    System.out.println("\nEnter the new Customer Name: ");
                    String newCustName = s.nextLine();

                    System.out.println("Enter the new Appointment date (YY/MM/DD): ");
                    String newApptDate = s.nextLine();

                    System.out.println("Enter the new Appointment Time (HH:MM)(AM/PM): ");
                    String newApptTime = s.nextLine();

                    System.out.println("Enter the new Attendant Name: ");
                    String newAttendantName = s.nextLine();

                    //updating appointments details 
                    appoint[appointNumber - 1].setcustName(newCustName);
                    appoint[appointNumber - 1].setapptDate(newApptDate);
                    appoint[appointNumber - 1].setapptTime(newApptTime);
                    appoint[appointNumber - 1].setspaAttendantName(newAttendantName);

                    //Display the update is successful
                    System.out.println("\nSuccessfully updated Appointments"+ appointNumber);

                    // Add a new option to the menu to display all appointments again
                    System.out.println("\nDo you want to see all appointments again? (Y/N): ");
                    String displayAppointments = s.nextLine();
                    if (displayAppointments.equalsIgnoreCase("y")) {
                        
                        // Display all appointments again
                        System.out.println("\nAll Appointments: ");
                        for (int i = 0; i < numAppointments; i++) {
                            System.out.println("\nAppointment " + (i + 1) + ":");
                            System.out.println(appoint[i].toString());
                        }
                    }
                    break;
                } else {
                    System.out.println("\nInvalid. Please try again,"); //handling the invalid input 
                }   
            } catch (NumberFormatException e) {
                System.out.println("\nInvalid input. Please enter a valid appointment number.");
                
                System.exit(0); // end of the code here

                }
            }
        }
    }
