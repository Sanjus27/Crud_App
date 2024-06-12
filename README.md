# Crud_App
This repository contains a simple CRUD application built using Spring Boot framework in Java. The application demonstrates basic Create, Read, Update, and Delete operations on a database.
Technologies Used:
Spring Boot: Provides a robust framework for building Java applications with minimal configuration.
Spring Data JPA: Simplifies the implementation of data access layers by providing repositories and entity management.
Hibernate: An ORM (Object-Relational Mapping) framework that provides mapping between Java objects and database tables.
H2 Database: Used as the backend database to store application data.
Maven: Used for project management and dependency management.
Features:
Create: Add new records to the database.(Post : http://localhost:9090/addProduct) 
Read: Retrieve records from the database based on various criteria.(Get : http://localhost:9090/getAllProducts)
Update: Modify existing records in the database.(post : http://localhost:9090/updateBookById/id)
Delete: Remove records from the database.(delete : http://localhost:9090/deleteProductById/id)
