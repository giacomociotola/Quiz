# Quiz
QI Test

This is a QI Test, realized following some real tests of Mensa International.

I created 10 questions, using the following views:
Question 1: the answer must be written in an EditText view, and confirmed with a Send button. The TextView type is "number".
Question 2: the answer must be written in an EditText view, and confirmed with a Send button. The TextView type is "text".
Questions 3, 4, 5, 6, 7, 10: the answer must be chosen between 4 radio buttons.
Questions 8, 9: you have to select 2 answer, among 5; so I used 5 CheckBoxes.

I defined a global variable (points), which will show the sum of all points.

I defined a method for every question. In question 1 and 2, I linked the method to the button Send.
Other methods are linked to the single view.

I created a button "View Results", where I defined the final message for the user, containing his results, and passing it to a printing method.

Finally, I create a "Restart test" button, that reset all the fields, and give focus to the first EditText.

I used "@string/..." format for hardcoded string I wanted to translate in italian, my native language.

