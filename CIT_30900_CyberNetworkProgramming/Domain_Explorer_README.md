# Domain Explorer

Takes a domain name, finds its IP address, then looks up what is known about that server using the free Shodan InternetDB API. No API key is needed.

## Usage
```
pip install -r requirements.txt
python main.py --domain purdue.edu
```

## Output
IP address, hostnames, CPEs (software and hardware identifiers), tags, open ports and known vulnerabilities.

## Skills
Python, DNS lookups with socket, REST APIs with requests, error handling, argparse, basic reconnaissance

## Note
Only look up domains you are allowed to research. InternetDB uses public data and sends no probes.
