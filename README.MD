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


## References
 - https://github.com/springframeworkguru/spring-boot-apache-derby-example  

## License
MIT License

Copyright (c) 2020 AeAppLabs

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
