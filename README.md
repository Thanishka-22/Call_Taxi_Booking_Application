Description  

This is a console-based Call Taxi Booking Application developed using Java.  
The application allows customers to book taxis that operate on a linear route with fixed pickup and drop points.  
  
The system automatically allocates taxis based on predefined rules such as:  
- Taxi availability  
- Nearest distance  
- Least total earnings  
The application is designed using a simple Entity – Service – Main structure, making it easy to understand and suitable for interview and learning purposes.

🧠 Problem Assumptions   
- Number of Taxis:4 (Scalable)  
- Route Points:A, B, C, D, E, F  
- Distance Between Points:15 km  
- Travel Time Between Points:60 minutes  
- Initial Taxi Position:All taxis start at point A  
- Fare Calculation:  
  - ₹100 for first 5 km  
  - ₹10 per km after 5 km

 📋 Booking Rules  
1. If a taxi is free at the pickup point, it is allocated first.  
2. If not, the **nearest free taxi** is allocated.  
3. If multiple taxis are at the same distance, the taxi with lower total earnings is chosen.  
4. Taxis charge only from pickup point to drop point.  
5. If no taxi is available, the booking is rejected.

🧩 Modules  
Module 1: Call Taxi Booking  
- Accepts customer booking details  
- Allocates taxi based on rules  
- Calculates fare and travel time  

Module 2: Display Taxi Details  
- Displays each taxi’s total earnings  
- Shows complete booking history for each taxi


✨ Features  

Console-based application  
Simple and clean Java code  
Follows OOP concepts  
Entity – Service – Main architecture  
Scalable taxi count  
Interview-friendly logic  

<img width="1535" height="378" alt="image" src="https://github.com/user-attachments/assets/670afb1f-04a1-4877-85ba-4e618128d447" />
