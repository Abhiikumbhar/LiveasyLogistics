# LiveasyLogistics
Assesment for Liveasy Logistics 

Description

The Liveasy Transport API is a backend development project built using the Spring Boot framework and integrated with a PostgreSQL database. The API facilitates seamless communication between various components, serving as the backbone for the Liveasy Transport application.

Technologies Used

Spring Boot: The backend is developed using the Spring Boot framework, ensuring a robust and scalable architecture.

PostgreSQL: The database management system used for storing and retrieving data related to users, routes, bookings, and more.

Getting Started

Clone the Repository:

git clone https://github.com/Abhiikumbhar/liveasy-transport-api.git


Database Setup:

Create a PostgreSQL database and update the application.properties file with the database connection details.

Build and Run:

Use Maven or your preferred build tool to build the project.

mvn clean install

Run the application.

java -jar target/liveasy-transport-api.jar



To Test the Apis use POSTMAN 

create Load :
    method: post(/load)
    payload:
    {
	    "loadingPoint": "delhi",
	    "unloadingPoint": "jaipur",
	    "productType": "chemicals",
	    "truckType": "canter",
	    "noOfTrucks": "1",
	    "weight": "100",
      "comment": "Test load",
	    "shipperId" : "1001",
	    "date" : "05-02-2024"
    }

Read Load:
    method: get(/load?shipperId=1001)

Update Load:
    method: put(/load/{loadId})
    payload:
    {
	    "loadingPoint": "Mumbai",
	    "unloadingPoint": "Pune",
	    "productType": "wood",
	    "truckType": "canter",
	    "noOfTrucks": "2",
	    "weight": "150",
      "comment": "updated test load",
	    "shipperId" : "1001",
	    "date" : "05-02-2024"
     }

Delete Load: 
    method : delete(/load/{loadId})
    

