# Parking Lot Management System

## Overview
The Parking Lot Management System is a Java Spring Boot application designed to manage parking slots in a parking lot. It allows users to park and unpark vehicles, keeping track of the availability of slots in real time using an in-memory database.

## Features
- *Park Vehicle:* Mark a specific slot as occupied.
- *Unpark Vehicle:* Mark a specific slot as available.
- *View All Slots:* Retrieve the status of all parking slots.
- *Exception Handling:* Prevent parking in an already occupied slot with appropriate error messages.

## Technologies Used
- *Java 17*
- *Spring Boot 3.x*
- *Spring Data JPA*
- *H2 In-Memory Database*
- *Maven* for project management and build

## Prerequisites
Before you begin, ensure you have the following installed:
- *Java 17* or later
- *Maven 3.6.3* or later

## Setup and Running the Application

### 1. Clone the Repository
bash
git clone https://github.com/yourusername/parking-lot-management-system.git
cd parking-lot-management-system


### 2. Build the Project
Use Maven to build the project and download all dependencies.
bash
mvn clean install


### 3. Run the Application
bash
mvn spring-boot:run


### 4. Access the Application
Once the application is running, you can interact with it via HTTP requests using tools like Postman or curl.

- *View All Slots*: GET /api/parking/slots
- *Park Vehicle*: POST /api/parking/park/{slotNumber}
- *Unpark Vehicle*: POST /api/parking/leave/{slotNumber}

### Example Requests
1. *Park a Car:*
    postman
    POST the request inside postman to park the car at
	http://localhost:8080/api/parking/park/A1
    
2. *Unpark a Car:*
    
	POST the request inside postman to unpark the car
	http://localhost:8080/api/parking/leave/A1
    
3. *Get All Slots:*
    GET request to all the slots including available and unavailable inside
	postman at http://localhost:8080/api/parking/slots
    

## Exception Handling
- *Slot Already Occupied*: If you attempt to park a vehicle in an already occupied slot, the application will return an HTTP 409 Conflict status with a message indicating that the slot is already taken.

## Project Structure
- */src/main/java*: Contains the main application code.
    - *controller*: REST controllers to handle HTTP requests.
    - *service*: Business logic and services.
    - *model*: Entity classes representing database tables.
    - *repository*: Repositories for data access.
    - *exception*: Custom exceptions for error handling.
    - *config*: Configuration classes, including database initialization.

- */src/main/resources*: Contains configuration files.
    - *application.properties*: Configuration for the Spring Boot application, including database settings.

## Future Improvements
- Add authentication and authorization.
- Integrate with a persistent database like MySQL or PostgreSQL.
- Implement advanced slot allocation algorithms.
- Add a frontend UI for better user interaction.

## Contributing
Contributions are welcome! Please submit a pull request or open an issue to discuss any changes or improvements.

## License
<!--This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.-->

## Contact
If you have any questions, feel free to reach out:
- *Email*:ak0980423@gmail.com
- *GitHub*: [AmarProjects](https://github.com/yourusername)
