# Employee Exposure Checker

Final project for a fictional company called Strawbridge Industries, whose employee data was exposed on its website.

## What it does
1. Reads employee records from a CSV
2. Checks each record against the class exposure API and gets a risk level
3. Writes a results CSV
4. Drafts a breach notification email for each high risk employee
5. Prints a count of low, medium and high risk

## Setup
```
pip install -r requirements.txt
set STUDENT_USERNAME=your_username
python main.py
```
Needs an employee_data.csv in the same folder.

## Notes
All data and the API were part of a fictional class scenario. The employee CSV is not included. A real tool would never send SSNs in a URL or write them to a file. That was a class constraint.

## Skills
Python, csv, REST APIs, error handling, file generation, incident response workflow
