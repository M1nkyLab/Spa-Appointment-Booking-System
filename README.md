# 💆‍♀️ Spa Appointment Booking System (Java Console App)

A simple console-based **appointment booking system** for a spa. This program allows users (staff) to add, display, and update customer appointments with details like date, time, and spa attendant name.

---

## 🧑‍💻 Programmer Info

- **Name:** Haziq  
- **Created On:** 14 June 2024

---

## 📌 Features

- ✅ Book up to 20 spa appointments
- ✅ Collect customer name, date, time, and spa attendant
- ✅ Display individual and all appointment details
- ✅ Update an existing appointment by number
- ✅ Validate user input to prevent crashes

---

## 🧾 Technologies Used

- Java SE (Standard Edition)
- Console-based input/output with `Scanner`

---

## 🧱 Class Breakdown

### 1. `Appointment_system.java`

A custom class that contains:

- Fields: `custName`, `apptDate`, `apptTime`, `spaAttendantName`
- Constructor with parameters
- Getter & Setter methods (Encapsulation)
- `toString()` method for formatted output

### 2. `DemoBookingSystem.java`

The main class that:

- Uses an array of `Appointment_system` objects (max size: 20)
- Provides a loop to:
  - Input appointment details
  - Ask if the user wants to add more
  - Display all appointments
  - Optionally update an existing appointment
  - View updated list

---

## 🧪 Sample Workflow

```bash
Customer Name: Sarah
The Appointment Date (YY/MM/DD): 24/07/15
The Appointment Time (HH:MM)(AM/PM): 03:00PM
Spa Attendent Name: Lisa

Do you want to add another appointment? (Y/N): y
...

All Appointments:
Appointment 1:
Customer Name: Sarah
Appointment Date: 24/07/15
Appointment Time: 03:00PM
Spa Attendant Name: Lisa
...

Enter the Appointments number to be updated(1-2): 1
Enter the new Customer Name: Sara Lee
...
