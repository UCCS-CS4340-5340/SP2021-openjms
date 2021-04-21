###### Project: openjms
###### Class: CS5340 (Software Maintenance) 
###### Name: Kathryn Hines

#### INTRO

This is a legacy code project for the purpose of software maintenance and testing. openjms was an open source messaging service, according to the project website, listed below in the artifacts section.  See Word Document uploaded in Canvas for relevant screenshots.


#### SETUP

1. Import the code into an IDE workspace (in this project Eclipse was used)

2. Add src/main & src/test to the buildpath

3. Exclude in src/test file: org.exolab.jms.tools.admin, db, & migration (These files are duplicates of those found in main. If left in they will result in "type ___ has already been defined" errors)

4. Add JUnit 4 jars, as well as DBunit jar, to Libraries (this is in the same window as the Source tab where files are added to buildpath)

5. Run tests (as of yet, there are errors and failures, see "KNOWN ERRORS" section below). This is done by right-clicking on the project, then click "Run As..." and then click "JUnit Test." 


#### ARTIFACTS

Listed below are artifacts found to be helpful for getting this project to run:

1. Importing a project to Eclipse: http://people.cs.uchicago.edu/~kaharris/10200/tutorials/eclipse/import.html

2. Adding files to buildpath: https://stackoverflow.com/questions/11537201/include-files-in-eclipse-build-path

3. Website for the openjms project: http://openjms.sourceforge.net/

4. Downloading JUnit: https://github.com/junit-team/junit4/wiki/Download-and-Install

5. Downloading DBUnit: https://search.maven.org/search?q=g:org.dbunit

#### INITIAL ANALYSIS

Three different code analysis tools were run: Pitclipse, EclEmma, and CodeMR. The analysis as of 3/3/2021 will be skewed because of known issues with the code. The initial results are discussed below:

1) EclEmma runs a coverage analysis. It was shown that the tests cover 10.8% of the project instructions and 11.8% branch coverage. Again, these results are skewed because of the connection issues. It's hard to say, at this point, which classes are the most tested since all results are skewed. However, some of the most successfully tested packages are org.exolab.jms.net.multiplexer, .connector, .common.security. Common classes and methods tested have to do with connections.

2) CodeMR runs a code quality analysis, mostly based on cohesion, complexity, and coupling. CodeMR identified 1 "highly problematic" class, "jmsSession," because it had high coupling, high complexity, and low cohesion. This may be a candidate for refactoring later in the project. There were three more problematic classes, "AdminMgr," "Importer," and "Exporter." Those had high coupling and complexity. It seems there is a lot of coupling within classes in this project.

3) Pitest is currently not running correctly. The test is terminated with this message: "Exception in thread "main" org.pitest.help.PitHelpError: 173 tests did not pass without mutation when calculating line coverage. Mutation testing requires a green suite."


#### TEST PLAN

##### Scenario 1: Don't Lose Messages

Since openjms is a messaging service, one important aspect to test will be the integrity of messages in the system. For example, don't lose the message in-transit due to unexpected errors. An input required would be a message, and various classes and methods will be called that have to do with sending the actual message from one machine to another. Various issues would need to be introduced to test whether or not the program keeps the message intact. The implementation of this testing scenario will develop as the code is studied  more. 

##### Scenario 2: Security

Since I'm a cybersecurity major, I'd like to focus on the security aspect of openjms. For example, making sure that messages can't be intercepted and tampered with. This may entail testing all methods that have to do with encryption and the way the messages are sent, attempting to find a security loophole in the code. 

#### KNOWN ISSUES

1. The openjms project contains many "raw data types" that trigger a warning when building with Eclipse. This does not cause issues with compilation but may cause issues later. (3/2/2021)

2. Running all JUnint tests in src/test folder causes 118 errors and 82 failures. The large bulk of these appear to be issues with connecting to a localhost and establishing a server socket. Cause of these errors and failures are as of yet unknown but will continue to be investigated. (3/2/2021)

3. Evosuite tests are not up and running. (3/2/2021)

4. Pitest not functioning correctly. (3/3/2021)
