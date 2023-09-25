# spring-oauth-server

User and Role Management Spring Boot Project
Overview
This Spring Boot project is designed to manage users and their roles. It provides endpoints to create new users and assign roles to them, making it useful for applications that require user authentication and authorization.

Features
User Management: Create new users with details like username, password, and email.
Role Management: Assign roles to users, allowing you to control their access to different parts of your application.
Security: Utilizes Spring Security for authentication and authorization.
RESTful API: Exposes a set of RESTful API endpoints for easy integration into your application.
Database Storage: Stores user and role information in a relational database (e.g., MySQL, PostgreSQL).


INSERT INTO roles(name) VALUES('ROLE_USER');
INSERT INTO roles(name) VALUES('ROLE_MODERATOR');
INSERT INTO roles(name) VALUES('ROLE_ADMIN');
