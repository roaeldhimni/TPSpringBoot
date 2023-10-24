# TP Spring Boot Readme

Follow the instructions below to run the project successfully.

## Exercise Steps

### Step 1: Create a Database
- Set up the required database for the project (dbName : boot). Ensure that the database is accessible and correctly configured.
  
### Step 2: Run the project
- Navigate to the project root and execute : mvn spring-boot:run
- The database should be created successfully

### Step 3: Test services of controller with Postman
- Test of each service :
  #### Save
  ![WhatsApp Image 2023-10-25 à 00 30 34_89b70e58](https://github.com/roaeldhimni/TPSpringBoot/assets/128164812/0f16765b-4cf4-4d3e-95fc-f63b7af9b095)
- The student was added successfully to the database.
- ![WhatsApp Image 2023-10-25 à 00 31 02_ae773be8](https://github.com/roaeldhimni/TPSpringBoot/assets/128164812/fe7c6de9-021a-418f-82d3-c0bb8ccaa432)
  #### All
- To show all students of the database
- ![WhatsApp Image 2023-10-25 à 00 31 37_de6a1fbc](https://github.com/roaeldhimni/TPSpringBoot/assets/128164812/48fdfaed-5307-4637-9196-1533c3dd6699)
  #### Delete
- To delete a specific student from the database
- ![WhatsApp Image 2023-10-25 à 00 32 08_c6b9e527](https://github.com/roaeldhimni/TPSpringBoot/assets/128164812/11a94ad5-8cc4-48c7-8307-2f7ad3f480e3)
- You can check the updated database after deleting the student.
- ![WhatsApp Image 2023-10-25 à 00 33 00_5b732f61](https://github.com/roaeldhimni/TPSpringBoot/assets/128164812/27707661-cc41-4479-997e-047ddea6d4d2)
  #### Count
- Count all students in the database (the count result is displayed at the bottom of the image)
- ![WhatsApp Image 2023-10-25 à 00 34 07_c64a339a](https://github.com/roaeldhimni/TPSpringBoot/assets/128164812/7b62274b-c24f-4d23-8123-5514ae2534cb)
  #### byYear
- To display number of students by year of birth 
![WhatsApp Image 2023-10-25 à 00 34 40_04ffc3d3](https://github.com/roaeldhimni/TPSpringBoot/assets/128164812/86600e04-b942-4302-875d-fae3dc3d45fa)

## Additional Notes
- Ensure that all required libraries and dependencies are added to the project.
- Double-check that the database connection details in the configuration file are accurate and match the configured database.
- Keep an eye on the console or logs for any error messages during the process.

