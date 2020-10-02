# message-scheduler-service
A Simple Spring Boot app that uses an embedded database

## Note
This is a work-in-progress for a concept and may not be optimum!

## Usage
1. Clone this repository 
2. Open up the project in an IDE
3. Launch the class MessageSchedulerApplication
4. Navigate to the path http://localhost:8000/schedule/02-10-2020-11-10/hello

## Main Todos
1. Change the controller method to POST since it will be persisting an entry to the database
2. Use the Quartz Scheduler? to process messages when the app is running
3. Ensure the data is persisted when the app is restarted
4. Add validations

## License
