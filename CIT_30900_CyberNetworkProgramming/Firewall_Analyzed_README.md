# Firewall Log Analyzer

Command line tool that reads a firewall log CSV and reports on it.

## What it does
* Parses each log row into a LogEntry object (time, IPs, port, protocol, action, rule, country)
* Classifies source IPs as IPv4 class A, B, C or D
* Converts log times from UTC to Eastern
* Includes unit tests

## Usage
```
python main.py --filename sample_logs.csv --action head
python main.py --filename sample_logs.csv --action deny
python main.py --filename sample_logs.csv --action source --country US
python main.py --filename sample_logs.csv --action parse --month 4
```
Put the CSV in the same folder as main.py.

| Action | Result |
| head | Shows the first 5 entries |
| deny | Counts denied entries |
| source | Counts entries from a country code (needs --country) |
| parse | Counts entries in a month, 1 to 12 (needs --month) |

## Install and test
```
pip install -r requirements.txt
python test_log_analyzer.py
```

## Skills
Python, argparse, csv, datetime and pytz, regex, unittest, log analysis

## Data
sample_logs.csv uses made up entries. The real class data is not included.
