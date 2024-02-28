
# Second Assignment: CineScribe 🎥
Welcome to your second assignment in the Advanced Programming course! In this project, you'll be tasked with building a Java application that acts as a simple movie aggregator, fetching data from both the IMDB and Actor API to provide information about movies and actors/actresses.

## Objectives ✏️
By completing this assignment, you will:

- Reinforce your understanding of Object-Oriented Programming (OOP) principles and apply them effectively.
- Gain familiarity with the process of issuing HTTP requests to APIs and parsing JSON data in Java.
- Learn to manage and track changes in your project using Git.
## Prerequisites ✅
Before getting started, ensure you have the following installed:

- Java 21
- Git
- Gradle as a package manager
## Tasks 📝
1. Fork this repository and clone it to your local machine.
2. Create a new branch named develop and switch to it. All development should be done in this branch.
3. et an API key from https://omdbapi.com (for Movie class) and https://api-ninjas.com/api/celebrity (for actor class). You need to sign up and verify your account.
4. Design Movie and Actor classes with appropriate methods and attributes. Complete the methods in the code and add at least one new attribute for each class, then write a new method to get the attribute proper value using json string.
5. Implement a menu in your Main class. This menu should allow users to:

 	- Enter the name of a movie and display information extracted from the JSON object in the console, including the list of actors.
	- Choose an actor from the displayed list and view their information in the console. If the actor is deceased, calculate their age at the time of death.

6. Add error handling to handle cases where the API returns an error or the movie/actor name is not found.
7. Write a comprehensive report detailing the tasks you have completed and any challenges you encountered. **Your report should be written in Markdown format.**
8. Commit your changes and push them to your GitHub repository.
9. Submit a pull request from your develop branch to your main branch. Your mentor will review the pull request and merge it upon approval.

## Evaluation 📃
Your submission will be evaluated based on the following criteria:

- Error-free compilation and execution of your code. 
- Accurate retrieval and presentation of movie and actor data through the methods written.
- Clear code structure, readability, thorough commenting, and adherence to clean code principles.

**Note: Usage of ChatGPT or any other AI generative model to complete any part of this assignment is strictly prohibited. Violation will result in a score of 0 without warnings.**

## Bonus Objectives ✒️
For additional challenges and learning opportunities, consider the following bonus objectives:

- Enhance your classes to display more comprehensive information about movies and actors.
- Revise your report to provide more detailed insights into your approach and challenges faced.
- Utilize Postman for API testing and exploration. Postman is a powerful API client that simplifies the process of testing, documenting, and sharing APIs. It provides an intuitive interface for sending HTTP requests, allowing developers to explore and interact with APIs effortlessly.

## Submission ⌛
The deadline for submitting your code is Wednesday, March 7 (17th of Esfand).

## Resources 📚
For assistance with this assignment, you may refer to the following resources:

🔗 [A Simple Readme Template](https://gist.github.com/DomPizzie/7a5ff55ffa9081f2de27c315f5018afc)

🔗 [Markdown Cheet Sheet](https://www.freecodecamp.org/news/markdown-cheat-sheet/)

🔗 [Getting Json Data From A RESTFUL API Using Java](https://medium.com/swlh/getting-json-data-from-a-restful-api-using-java-b327aafb3751)

🔗 [Uploading a File and JSON Data in Postman](https://www.baeldung.com/postman-upload-file-json)

🔗 [Send API requests and get response data in Postman](https://learning.postman.com/docs/sending-requests/requests/)