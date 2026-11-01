# Phone Finder

Cleans a messy list of phone numbers and lets you search it.

## What it does
* Removes symbols and keeps 10 digit numbers
* Rejects area codes and exchanges starting with 0 or 1
* Removes fake 555 exchanges
* Searches by full number, area code or exchange

## Usage
```
python main.py
```
Menu options: F (full number), A (area code), E (exchange), X (exit).

## Note
The original program reads customers from a Microsoft Access database with pyodbc. That database is class data and is not included, so main.py will not run as is. The cleaning logic is in phonephinder.py.

## Skills
Python, regex, list comprehensions, modules, pyodbc, input validation
