# BMICalculator

This Java program calculates the **Body Mass Index (BMI)** of multiple individuals based on their height and weight. It then classifies each person's weight status (Underweight, Normal, Overweight, or Obese) based on standard BMI ranges.


# Purpose

This project aims to raise awareness about personal health by helping users understand their BMI and what it means for their overall well-being. It can be used by teams, organizations, or individuals as part of wellness and fitness initiatives.


# Features

- Input for **multiple individuals**
- Calculates and displays:
  - Height
  - Weight
  - BMI
  - Weight status
- Uses arrays to store and manage all data
- Uses standard BMI categories:
  - **BMI < 18.5**: Underweight
  - **18.5 ≤ BMI < 24.9**: Normal weight
  - **25.0 ≤ BMI < 29.9**: Overweight
  - **BMI ≥ 30.0**: Obese
- Clean and organized output


# How It Works

1. User enters the number of people.
2. For each person:
   - Inputs height (in meters) and weight (in kg).
3. The program calculates BMI using the formula:
   BMI = weight / (height * height)

   
4. It stores and displays each person’s:
- Height
- Weight
- Calculated BMI
- Weight status


# Example Output

Enter number of persons: 4
Enter height (in cm) of person 1: 190
Enter weight (in kg) of person 1: 45
Enter height (in cm) of person 2: 163
Enter weight (in kg) of person 2: 59
Enter height (in cm) of person 3: 187
Enter weight (in kg) of person 3: 70
Enter height (in cm) of person 4: 170
Enter weight (in kg) of person 4: 90

Height	Weight	BMI		Status
190	45.0	12.47		Underweight
163	59.0	22.21		Normal
187	70.0	20.02		Normal
170	90.0	31.14		Overweight


# Social Impact

- Promotes **health awareness** in workplaces and communities
- Encourages people to track their **BMI regularly**
- Helps identify people who may be at risk for **health issues** due to weight
- Can be used by **HR teams, wellness programs, schools, clinics**, etc.


# Concepts Used

- Arrays
- Loops
- Conditional logic (if-else)
- BMI formula
- Formatted console output
