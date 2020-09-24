# Automation
System that implements automation of accounting.

##Problem statement:

There's a company with some staff (no matter big or small) and
 we want to calculate some parameters like surcharge, lunch 
 break duration and experience.
 
##Details

Each employee has a smart-card. This is the device
 that is used for entering and exiting. When an employee 
 enters or exits, a timestamp is created. It's uses for
  calculation of experience, surcharge (surcharge pays 
  if working time is bigger than some constant value). 
  Dinner time schedules in the middle of the working day.
  
Timestamps should be sent to a server that calculates the parameters,
but firstly it should be stored in the local database. It is used to prevent 
data loss when connection is collapsed. Then data transmits to the server
 from local database.
  
There's another database, which can receive
 data from HR department. 
 It is used to update information on the server.
 
##Composition of the repository:

mainLogic package consists of:
- controller - package with the class that
 implements facade pattern.
- dataBase - package with the "plugs" for databases.
- server - package that consists of server class that implements
template method.

outerClasses package consists of:
- hr - package consists of classes that implement factory method.
- staff - the package with staff classes.
- AcDepartment - class of accounting department which
prints all information received from controller.
- Data - data structure which stores data from server.



