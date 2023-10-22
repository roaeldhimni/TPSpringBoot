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
  <img width="960" alt="Creation" src="https://github.com/roaeldhimni/TPSpringBoot/assets/128164812/6a646546-bc73-45c3-b9ae-8c5f7ed688f5">
- The student was added successfully to the database.
  <img width="936" alt="ROA" src="https://github.com/roaeldhimni/TPSpringBoot/assets/128164812/082959b6-a20b-48e6-8111-93e2c87c5f36">
  #### All
- To show all students of the database 
  <img width="928" alt="all" src="https://github.com/roaeldhimni/TPSpringBoot/assets/128164812/b24e8831-55b4-443b-9f05-889997f19f4d">
  #### Delete
- To delete a specific student from the database 
  <img width="923" alt="delete" src="https://github.com/roaeldhimni/TPSpringBoot/assets/128164812/4c7734ef-9e4b-43ea-9154-af7d1492d761">
- You can check the updated database after deleting the student.
  <img width="682" alt="TableDeleted" src="https://github.com/roaeldhimni/TPSpringBoot/assets/128164812/4d5bfad7-d3bd-47af-8547-d3ab4a3322b7">
  #### Count
- Count all students in the database (the count result is displayed at the bottom of the image)
  <img width="929" alt="count" src="https://github.com/roaeldhimni/TPSpringBoot/assets/128164812/584c201a-27b5-4531-b053-b4ed29e02f4a">
  #### byYear
- To display number of students by year of birth 
  <img width="922" alt="byYear" src="https://github.com/roaeldhimni/TPSpringBoot/assets/128164812/d1cabd66-eba4-438a-8644-2360ab1e8669">

## Additional Notes
- Ensure that all required libraries and dependencies are added to the project.
- Double-check that the database connection details in the configuration file are accurate and match the configured database.
- Keep an eye on the console or logs for any error messages during the process.

