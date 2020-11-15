CA3 backend
Link til frontend: https://github.com/Anne-Maj/ca3privatFrontend
Link til deployed side: http://annemajca3.surge.sh/jokes

Instructions for a quick start project

Link to frontend: https://github.com/jbndk/CA3-Frontend

Backend

Clone the project from GitHub

Delete the folder named ".git"

Make your own ".git" by typing "git init" in Git Bash

Create a new repository on GitHub

Rename the project in Netbeans and check that the war-file has the name that you would like the project to have after your domain.

Change the URL in pom.xml to: https://YOURDOMAIN.dk/manager/text

Set up two local databases in MySql ("DATABASE" and "DATABASE_TEST")

In the file, "persistence.xml", change the name of the database and the test database to the ones you just created in MySql

In Netbeans, run the file "SetupTestUsers.java", and check that the database now contains users and roles

Migrate the local database to the droplet database using the Migration Wizard in MySql

Push the project to your new GitHub repository

Log in to Travis-ci.com and change the environment variables, or type "mvn clean test -Dremote.user=USER -Dremote.password=PW tomcat7:deploy" in Git Bash

Trigger build and see that it passes

After making changes to the project, in Git Bash, type "mvn clean test" before pushing

Push the project to GitHub

Check that Travis has deployed it to your droplet.

Frontend

Clone the GitHub repo
Change the URL in the settings.js folder
In Git Bash, type "npm install"
Type "npm start" to see the project in your browser

