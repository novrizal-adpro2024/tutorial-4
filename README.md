# Module 4: Refactoring & TDD

> #### Novrizal Airsyahputra - 2206081780 - Advance Programming B

---

### Reflection

---

**1. Reflect based on Percival (2017) proposed self-reflective questions (in “Principles and Best Practice of Testing” submodule, 
chapter “Evaluating Your Testing Objectives”), whether this TDD flow is useful enough for you or not. 
If not, explain things that you need to do next time you make more tests.**

Percival (2017) proposes three main objectives that we need to constantly evaluate on our tests: 

**a. Correctness**

- Do I have enough functional tests to reassure myself that my application really works, from point of view of the user?
From the user's POV, i think i already have enough functional tests. 
So, i can reassure myself that my app is working fine.

- Am I testing all edge cases thoroughly?
Yes, though i think there are lots of improvements that can be done.

- Do I have tests that check whether all my components fit together properly? Could some integrated tests do this, or are functional tests enough?
I believe my  functional tests should be enough to check whether all my components fit together properly.
However, if any gaps persist, integrated tests could potentially offer additional assistance.

**b. Maintainability**

- Are my tests giving me the confidence to refactor my code, fearlessly and frequently?
Yes, my tests giving me the confidence to refactor my code.
I have implemented comprehensive tests, including acceptance tests, and ensured thorough coverage of edge cases.

- Are my tests helping me to drive out a good design? If I have a lot of integration tests but less unit tests, do I need to make more unit tests to get better feedback on my code design?
Effective tests not only verify that the code functions but also guide its design. 
Tests can compel us to think about organizing code for testability, often leading to better design. 
While integration tests are crucial to ensure different parts of the code work well together, 
unit tests remain essential for individually testing components.

**c. Productive Workflow**

- Are my feedback cycles as fast as I would like them? When do I get warned about bugs, and is there any practical way to make that happen sooner?
Yes, it is pretty much as fast as i would like them.
I believe it is enough to ensure that my tests can detect errors, 
and the corresponding feedback clearly indicates the specific test.

- Is there some way that I could write faster integration tests that would give me feedback quicker?
Yes, by limiting the scope (focus on testing only the components that interact with some parts).

- Can I run a subset of the full test suite when I need to?
Yes, i can. Mark an important tests and set the test suite to only run the specific test.

- Am I spending to much time waiting for tests to run, and thus less time in a productive flow state?
No, i am not. 
While waiting for the tests to run, with Test-Driven Development i can do multitask and work on the other tasks

---

**2. You have created unit tests in Tutorial. 
Now reflect whether your tests have successfully followed F.I.R.S.T. principle or not. 
If not, explain things that you need to do the next time you create more tests.**

The F.I.R.S.T. principle is a set of guidelines for writing effective unit tests.

**Fast (F)**

Reflection: The unit tests I create run swiftly, allowing them to be executed more frequently 
and providing immediate feedback on whether recent changes impact the code's functionality.

**Isolated/Independent (I)**

Reflection: Each test I develop can run independently of others. 
They are not reliant on shared states or the sequence in which they are executed.

**Repeatable (R)**

Reflection: Tests that i created produce consistent results regardless of when or where they are run.

**Self-Validating (S)**

Reflection: Tests that i created has a clear output (PASSED/FAILED). 
With this, there is no need for human interpretation of the outputs.

**Timely (T)**

Reflection: The tests I create are written just before the production code that makes them pass.

In conclusion, it is crucial for code to adhere to the FIRST principles. 
Prioritizing those aspects not only ensures effective test suites but also supports sustainable software development 
by minimizing risks, improving readability, and facilitating smooth integration of changes. 

---

### References
1. https://docs.google.com/document/d/1-fsOyyajozE2QSV-QBEA_YR_ZZn9yhKr/edit
2. https://chat.openai.com/