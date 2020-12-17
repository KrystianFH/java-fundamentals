# Java Fundamentals - Labs 1 - 10

##### *Special thank you to Jack Nelson for helping guide me through my challenges with this lab. Check out some of the cool things he is up to [here!](https://github.com/jnelsonjava)*

## Lab 1 - Java Primitives and Control Flow | basics/Main.java

1. Feature Task : Pluralize

  - Write a function that accepts a word and a number and returns a string with the word pluralized with an "s" if the number is zero, or greater than 1

2. Feature Task : Flipping Coins

  - Write a function that accepts an integer 'n' and flips coins until 'n' heads are flipped in a row

3. Feature Task : Command Line Clock 

  - Write a method 'clock' that uses Java's built-in LocalDateTime object to constantly print out the current time to the console, second-by-second. The program should run until someone manually kills it 

## Lab 2 - Arrays, for loops, testing

1. Feature Task : Rolling Dice

  - Write a method called 'roll' that accepts an integer and rolls a six-sided dice 'n' times. The method should return an array containing the values of the rolls

2. Feature Task : Contains Duplicates

  - Write a method that returns 'true' or 'false' depending on whether the array contains duplicate values

3. Feature Task : Calculating Averages

  - Write a method that accepts an array of integers and calculates and returns the average of all the values in the array

4. Feature Task : Arrays of Arrays

  - Given an array of arrays, calculate the average value for each array and return the array with the lowest average

## Lab 3 - Maps and File I/O

1. Feature Task : Analyzing Weather Data

  - Using given weather data, iterate through all of the data to find the minimum and maximum values. Use a 'HashSet' of type 'Integer' to keep track of all of the unique temperatures seen. Lastly, iterate from the minimum temperature to the maximum temperature and create a String containing any temperature not seen during the month. Return that String 

2. Feature Task : Tallying Election

  - Write a function called 'tally' that accepts a list of Strings representing votes and returns one string to show what got the most votes

3. Feature Task : JavaScript Linter

  - Write a method that reads a JavaScript file with a given 'Path' and generates an error message whenever it finds a line that doesn't end in a semi-colon. Call the method in the 'main' method on the file 'gates.js' and pring out the resulting error message

## Lab 6 - Composition and Inheritance, Part One

1. Feature Task : Restaurant Class

  - Create a class to represent a 'Restaurant'
  - Each restaurant should have a name, a number of stars between 0 and 5, and a price category represented by number of '$' signs
    - Implement a 'Restaurant' constructor
    - Test the constructor
    - Implement a 'toString' method for Restaurants
    - Write a test to create an instance of 'Restaurant' and ensure that its 'toString' is working properly

2. Feature Task : Create Review Class
  - Create a class to represent a 'Review'
  - Each review should have a body, an author, and a number of stars
    - Write a 'Review' constructor
    - Test the constructor
    - Implement a 'toString' method for Reviews
    - Write a test to create an instance of 'Review' and ensure that its 'toString' is working properly

3. Feature Task : Relationships of Reviews and Restaurants
  - A review should be about a single restaurant
  - Update 'toString', constructor methods, and tests to reflect their relationship 

4. Feature Task: addReview method
  - Add an instance method 'addReview' to the restaurant class 
    - this method should take in a 'Review' instance and associate that review with 'this Restaurant'
    - add tests to ensure that when 'addReview' is called, the association is created between the Restaurant and the Review

5. Feature Task: Star Ratings
  - When a review is associated with a restaurant, the star rating should update
  - Ensure that 'addRating' updates the Restaurants star rating appropriately
  - Add tests to ensure that if 'addReview' is called when the restaurant and review are already associated, that the star rating does not update

## Lab 7 - Composition and Inheritance, Part Two

1. Feature Task : Shops

  - Create a Shop class
    - shops should have a name, description, and number of dollar signs
  - Implement a constructor for a shop
  - Implement a toString method for 'Shop's
  - Add tests for 'Shop's

2. Feature Task : Shop Reviews

  - Create a relationship between reviews that link them to shops or restaurants
  - Ensure that 'Shop' class has an instance method to add a review about that shop
  - Add tests

3. Feature Task : Theaters

  - Create a 'Theater' class
    - theaters should have a name and all of the movies currently showing there
  - Implement a 'Theater' constructor
  - Write 'addMovie' and 'removeMovie' instance methods to allow the theater to update which movies are being shown
  - Implement a 'toString' method for 'Theater's
  - Add tests

4. Feature Task : Theater Review

  - Allow theaters to be reviewed
  - Add tests

5. Feature Task : Movie Review

  - Allow for some reviews to have a 'String movie' instance variable to hold which movie that reviewer is referencing
  - Ensure that those who are reviewing 'Restaurants' or 'Shops'
  - Ensure that including a movie is optional for users
  - Add tests

## Lab 11 - Spring for Full-Stack Web Apps

1. Feature Task : Successfully Run Spring App
  
  - Ensure that you can run the Spring app

2. Feature Task : Hello World Route

  - Create a Hello World route at `/hello`
  - Ensure that you can visit that route in your browser and see a rendered template come back

3. Feature Task : UpperCase

  - Create a route that turns words into UPPER CASE

4. Feature Task : Splash Page

  - Create a basic splash page for the Songr app, available at the root route, and style it appropriately with CSS

5. Feature Task : Album Class

  - Create an `Album` class to act as a model in the app.
      - Albums should have a title, artist, songCount, length, and imageUrl

6. Feature Task : Album Route

  - create a route at `/albums` that shows three album instances


