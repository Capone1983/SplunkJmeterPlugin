# SplunkJmeterPlugin
Import this plugin to jmeter to send reports to splunk. 

You need to have an HEC event collector setup on splunk

Step 1: Copy built jar into \apache-jmeter-5.1.1\jmeter\lib\ext <br />
Step 2: Add backend Listener in Jmeter <br />
Step 3: Config the backend Listener  

runId	${__UUID()} <br />
dateTimeAppendFormat	-yyyy-MM-DD <br />
normalizedTime	2015-01-01 00:00:00.000-00:00 <br />
splunkHost	 <br />
splunkPort	 <br />
splunkToken	 <br />
splunkIndex	 <br />
splunkSourceType	_json <br />
retentionPolicy	autogen <br />


Donate or gift a coffee :) <br />
Bitcoin - 1N1NX4XzMVkoeNXQj8Q7E7ehQmHZjsbzBt <br />
Cardano - DdzFFzCqrht3A5CJLQdZhZqksGdbcMWyZKMWRFFctDL5wFjMx8qjRnGMRFtUnUJJpzR581xMR5DWssxBqirZGH9anUAmeJyumt2JG4Ym <br />


