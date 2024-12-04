# Simple Spring Batch Application

This is a simple Spring Batch application that demonstrates how to read data from a CSV file, process it, and write the output to the console. The application is configured to read `input.csv`, which contains details about persons, and it prints each person's details to the console.

## Table of Contents

- [Technologies Used](#technologies-used)
- [Setup Instructions](#setup-instructions)
- [CSV Input File](#csv-input-file)
- [How to Run the Application](#how-to-run-the-application)
- [Job Configuration](#job-configuration)
- [License](#license)

## Technologies Used

- Java 17
- Spring Boot 3.0.0
- Spring Batch 5.0.0
- Maven
- H2 database
  
## Setup Instructions

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/yourusername/SimpleSpringBatch.git
   cd SimpleSpringBatch
   
2. **Build the Project**:
   
   Make sure you have Maven installed. Run the following command to build the project.
   
   ```bash
   mvn clean install

## CSV Input File
   
 1. **input.csv file is in the src/main/resources directory with the following sample content.**
   
   ```csv
   id,name,age
   1,Kasun,34
   2,Iyona,33
   3,Kamal,28
  ```

## How to Run the Application

**Run the application using your IDE or by executing the following command in your terminal.**

```bash
   mvn spring-boot:run
```

## Job Configuration
  **The application is configured with a Spring Batch job that performs the following tasks**

  - Read: Reads data from the input.csv file.
  - Write: Outputs the processed data to the console.

## License
  **This project is licensed under the MIT License. Feel free to use, modify, and distribute this application as per the terms of the license.**


