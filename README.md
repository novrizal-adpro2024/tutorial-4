# Module 3: Maintainability & OO Principles

> #### Novrizal Airsyahputra - 2206081780 - Advance Programming B

---

### Reflection
**Apply the SOLID principles you have learned. 
You are allowed to modify the source code according to the principles you want to implement. 
Please answer the following questions:**

**1. Explain what principles you apply to your project!**

I tried to apply all the 5 principles that I learned at the class.
Here are those principles:

a. **Single Responsibility Principle (SRP)** --- Means that a class should have one and only one reason to change (should have only one job).
With this in mind, I have to separate `CarController`' from `ProductController`' so that each file will only focus on one job/responsibility. 
As for the `CarController.java` is to handle car related behaviors and properties, 
while the `ProductController.java` has the responsibility to handle product related behaviors and properties.

b. **Open-Closed Principle (OCP)** --- Means that objects or entities should be open for extension but closed for modification.
This implies that a class should be extendable without modifying the class itself.
I have incorporated the ability to set the ID in the constructor of the `Car` class, allowing for extension.
If there's a need to change the ID-setting mechanism, there's no requirement to alter the source code.
Moreover, introducing the update method that modifies the `Car` object as a whole, rather than individual attributes,
enhances the flexibility of the CarRepository class for extension without the necessity to make changes to the source code.

c. **Liskov Substitution Principle (LSP)** --- Means that every subclass or derived class should be substitutable for their base or parent class.
I have tried to make `CarController` not to extends `ProductController` because each of them are using different model.

d. **Interface Segregation Principle (ISP)** --- Means that a client should never be forced to implement an interface that it does not use,
or clients should not be forced to depend on methods they do not use.
I have tried to make 2 different interface, which called `CarService` and `ProductService`.

e. **Dependency Inversion Principle (DIP)** --- Means that entities must depend on abstractions, not on concretions.
It states that the high-level module must not depend on the low-level module, but they should depend on abstractions.
In my `CarController`, have tried to change the `CarServiceImpl` to `CarService`.

**2. Explain the advantages of applying SOLID principles to your project with examples.**

The SOLID principles aims to create more maintainable, scalable, and flexible program. 
Here are several advantages that I got from applying SOLID principles to my project:

a. **Single Responsibility Principle (SRP)** ---

Advantage: The code will be more maintainable and much easier to understand because each class has only one reason to change.

Example: Make separate `CarController` and `ProductController` classes, each with a single responsibility. 

b. **Open/Closed Principle (OCP)** ---

Advantage: Allows to add new functionality without altering existing code, promoting stability.

Example: `carData.set(i, updatedCar);` in the `CarRepository.java`.

c. **Liskov Substitution Principle (LSP)** ---

Advantage: This promotes code reusability and consistency.

Example: `CarController` not to extends `ProductController` because each of them are using different model.

d. **Interface Segregation Principle (ISP)** ---

Advantage: Prevents a class from being burdened with unnecessary methods and promotes a more modular design.

Example: 2 different interface, which called `CarService` and `ProductService`.

e. **Dependency Inversion Principle (DIP)** ---

Advantage: Flexibility, ease of testing, and maintaining the code.

Example: In my `CarController`, have tried to change the `CarServiceImpl` to `CarService`.

**3. Explain the disadvantages of not applying SOLID principles to your project with examples.**

Not applying SOLID principles can make the codebase less maintainable, harder to extend, and more error-prone. 
Here are the several disadvantages:

a. NOT APPLYING **Single Responsibility Principle (SRP)** ---

Disadvantage: The code will be difficult to maintain and understand.

Example: `ProductController` handles both `CarController` and `ProductController` itself. So it has more than one responsibility.

b. NOT APPLYING **Open/Closed Principle (OCP)** ---

Disadvantage: The code will be fragile and needs frequent changes.

Example: from `carData.set(i, updatedCar);` in the `CarRepository.java` to 
`car.setCarName(updatedCar.getCarName());`
`car.setCarColor(updatedCar.getCarColor());`
`car.setCarQuantity(updatedCar.getCarQuantity());`

c. NOT APPLYING **Liskov Substitution Principle (LSP)** ---

Disadvantage: The code will not be reusable and it has a low consistency.

Example: `class CarController extends ProductController`, meanwhile the `ProductController` and `CarController` each are using different model.

d. NOT APPLYING **Interface Segregation Principle (ISP)** ---

Disadvantage: A class is being burdened with unnecessary methods.

Example: If `ProductService` implements irrelevant method from `CarService` (or they combine it).

e. NOT APPLYING **Dependency Inversion Principle (DIP)** ---

Disadvantage: It will be harder to test and to maintain.

Example: `CarServiceImpl` is depend on the `CarRepository` than its interface 
or when `ProductServiceImpl`is depend on the `ProductRepository` than its interface.

---

### References
1. https://docs.google.com/document/d/1pVus4jkPJNfPBxAgZHrTVonw2Qxp001k/edit
2. https://www.digitalocean.com/community/conceptual-articles/s-o-l-i-d-the-first-five-principles-of-object-oriented-design