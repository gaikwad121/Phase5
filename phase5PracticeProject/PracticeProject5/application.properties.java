logging.file=elk-example.log
spring.application.name = elk-example
Logstash Configuration
input {
 file {
 type => "java"
 path => "F:/Study/eclipse_workspace_mars/elk-example-spring-boot/elkexample.log"
 codec => multiline {
 pattern => "^%{YEAR}-%{MONTHNUM}-%{MONTHDAY} %{TIME}.*"
 negate => "true"
 what => "previous"
 }
 }
}
filter {
 #If log line contains tab character followed by 'at' then we will tag that entry as
stacktrace
 if [message] =~ "\tat" {
 grok {
 match => ["message", "^(\tat)"]
 add_tag => ["stacktrace"]
 }
 }
grok {
 match => [ "message",
 "(?<timestamp>%{YEAR}-%{MONTHNUM}-%{MONTHDAY}
%{TIME}) %{LOGLEVEL:level} %{NUMBER:pid} --- \[(?<thread>[A-Za-z0-
9-]+)\] [A-Za-z0-9.]*\.(?<class>[A-Za-z0-9#_]+)\s*:\s+(?<logmessage>.*)",
 "message",
 "(?<timestamp>%{YEAR}-%{MONTHNUM}-%{MONTHDAY}
%{TIME}) %{LOGLEVEL:level} %{NUMBER:pid} --- .+?
:\s+(?<logmessage>.*)"
 ]
 }

 date {
 match => [ "timestamp" , "yyyy-MM-dd HH:mm:ss.SSS" ]
 }
}
output {

 stdout {
 codec => rubydebug
 }
 # Sending properly parsed log events to elasticsearch
 elasticsearch {
 hosts => ["localhost:9200"]
 }
}