# Modul 1 : Coding Standards

> #### Novrizal Airsyahputra - 2206081780 - Advance Programming B

---

### Reflection 1
**You already implemented two new features using Spring Boot. 
Check again your source code and evaluate the coding standards that you have learned in this module. 
Write clean code principles and secure coding practices that have been applied to your code.**

In order to make my code looks more readable and maintainable, there are some coding standards that i tried to apply in my works. 
These are some of it:

a. **Indentations and Spacing.** To improve my code's readability, i have to use consistent indentation and spacing.

b. **Descriptive Variable Names.** With this, other developers will also be able to read the code clearly.

c. **Code Testing.** I tried to make unit test and functional test.
The goal of unit testing is to verify the correctness of the individual unit.

Moreover, it appears to me that there is a need for enhancing the security of my code. 
I must ensure its resilience against cyberattacks and unwanted intrusions.
There are some ways i can take to improve my code's security, such as:

a. **Multi Factor Authentication.** This is a strong authentication mechanism to verify the identity of users.

b. **More specific input validations.** So far, i have only validate the negative input for product's quantity.

---

### Reflection 2
**1. After writing the unit test, how do you feel? How many unit tests should be made in a class?
How to make sure that our unit tests are enough to verify our program?
It would be good if you learned about code coverage.
Code coverage is a metric that can help you understand how much of your source is tested.
If you have 100% code coverage, does that mean your code has no bugs or errors?**

I feel relieved for being able to finish this tutorial.

The numbers of unit tests that should be made in a class depends on the: class' complexity, number of methods, various scenarios. It would be great if the unit tests able to cover different and edge cases.

The disadvantage of using unit testing is that it cannot be expected to be able to catch all the error in a program. It is not possible to evaluate all execution paths.

And then, to make sure that the unit tests are enough to verify the program is by:

a. **Try Every Scenarios**

b. **Check The Edge Cases**

c. **Negative Testing**

d. **Code Coverage**

If the code coverage is 100%, it is not a guarantee that a bug or errors is not there. It is also not a guarantee that the code is correct. Code coverage can only be used to validate the test cases that are run on the source code.

Additional notes, here are some critical coverage criteria:

a. **Function Coverage**

b. **Statement Coverage**

c. **Path Coverage**

d. **Branch or Decision Coverage**

e. **Condition Coverage**

**2. Suppose that after writing the CreateProductFunctionalTest.java along with the corresponding test case,
you were asked to create another functional test suite that verifies the number of items in the product list. 
You decided to create a new Java class similar to the prior functional test suites 
with the same setup procedures and instance variables.
What do you think about the cleanliness of the code of the new functional test suite?
Will the new code reduce the code quality?
Identify the potential clean code issues, explain the reasons,
and suggest possible improvements to make the code cleaner!**

The cleanliness of the code of the new functional test suite may will be reduced as well as the 
code quality. The reason is because of the duplicated code from another functional test file.
In my opinion, in order to improve the code quality, i have to avoid the code duplication.
By making a new base case that consists of the same code duplication,
i will be able to reuse it anywhere without the fear of code duplication.

---

### References
1. https://docs.google.com/document/d/13HMjgP7kLACLx7i3p7oCVlhV58ZkGZMf/edit
2. https://chat.openai.com
3. https://www.guru99.com/unit-testing-guide.html
4. https://www.codegrip.tech/productivity/everything-you-need-to-know-about-code-coverage/