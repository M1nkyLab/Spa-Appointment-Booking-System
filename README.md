# 💆‍♀️ Spa Appointment Booking System (Java Console App)

A simple console-based Java application to manage spa appointment bookings. This system is designed to help spa staff efficiently add, display, and update customer appointments, ensuring smooth scheduling and service management.

---

## 📌 Key Features

- ✅ Book up to **20 spa appointments**
- ✅ Collect details: **Customer Name, Appointment Date, Time, Spa Attendant**
- ✅ Display **individual or all** appointment records
- ✅ **Update** existing appointments by appointment number
- ✅ **Input validation** to avoid crashes and maintain data accuracy

---

## 🧾 Technologies Used

- ☕ **Java SE (Standard Edition)**  
- 🖥️ Console-based I/O using `Scanner` class  

---

## 🧱 Program Structure

### 🔹 1. `Appointment_system.java`
A custom class representing a single appointment, with:

- **Fields:**
  - `custName` (String)
  - `apptDate` (String)
  - `apptTime` (String)
  - `spaAttendantName` (String)
- **Constructor** with parameters
- **Getter and Setter methods** (encapsulation)
- **`toString()` method** for formatted output

---

### 🔹 2. `DemoBookingSystem.java`
Main driver class responsible for:

- Creating an **array of `Appointment_system` objects** (max: 20)
- Repeatedly:
  - Accepting input for new appointments
  - Asking whether to add more entries
  - Displaying all existing appointments
  - Providing option to update a selected appointment
  - Showing the updated list afterward

---

## 🧪 Sample Workflow

```plaintext
Customer Name: Sarah
Appointment Date (YY/MM/DD): 24/07/15
Appointment Time (HH:MM)(AM/PM): 03:00PM
Spa Attendant Name: Lisa

Do you want to add another appointment? (Y/N): y
...

All Appointments:
Appointment 1:
Customer Name: Sarah
Appointment Date: 24/07/15
Appointment Time: 03:00PM
Spa Attendant Name: Lisa

Enter the appointment number to update (1-2): 1
Enter the new Customer Name: Sara Lee
