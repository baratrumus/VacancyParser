call mvn clean package -Plocal
call java -cp target/vacancy_parser-2.0.jar;target/lib/* parser.RunParsing --port 8082
