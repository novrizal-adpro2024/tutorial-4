# Modul 2: CI/CD & DevOps

> #### Novrizal Airsyahputra - 2206081780 - Advance Programming B

Link: https://tutorial-adpro2024.koyeb.app/product/list

---

### Reflection
**You have implemented a CI/CD process that automatically runs the test suites, analyzes code quality, and deploys to a PaaS. 
Try to answer the following questions in order to reflect on your attempt completing the tutorial and exercise.**

**1. List the code quality issue(s) that you fixed during the exercise and explain your strategy on fixing them.**

There are 2 code quality issues that PMD workflow checked on my program.
Here is those issues and the strategies that i used to fix the issues:

a. **Unused Imports**. It means that i used some imports that i don't need. 
In the `HomePageController.java` and `ProductController.java` i had those issues. 
So, i had to remove the unused import and change it to another import that i actually need in the program.

b. **Unnecessary Modifiers**. There were some public modifiers i used that actually unnecessary.
I had to remove the public modifiers that were located in the `ProductService.java`. 

**2. Look at your CI/CD workflows (GitHub)/pipelines (GitLab). 
Do you think the current implementation has met the definition of Continuous Integration and Continuous Deployment? 
Explain the reasons (minimum 3 sentences)!**

In my personal opinion, my current CI/CD workflows has already met 
the definition of Continuous Integration and Continuous Deployment.
These are some of my reasons:

- My Continuous Integration (CI) implementation: I use the `ci.yml` workflow.
Everytime i push or pull my work with GitHub,`ci.yml` workflow will automatically run the test cases that i implemented.
This workflow contains test that runs on a Linux-based server using Ubuntu distribution.

- My Continuous Deployment (CD) implementation: I tried to use the Koyeb free PaaS, which either a push or pull-based approach.
As the deployment platform, Koyeb will automatically re-deploy every changes that i made in my main branch.

By using the CI/CD, it will help the development teams to reduce risks and detect
any issues earlier, and improve the code quality-efficiency.

---

### References
1. https://docs.google.com/document/d/1W-pCNwl7fHSAF_0laidjKYBN-Yr7xDIK/edit2