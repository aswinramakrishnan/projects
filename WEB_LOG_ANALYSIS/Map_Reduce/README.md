
## Week - 13
### ITEM - ONE

#### Preparing the input files:

_Make sure hadoop cluster is running_

Small File: 
Get into the downloaded folder and perform the following commands

unzip small-logs-08-09-2016.zip
1. hadoop fs -mkdir /user/$USER/smallfileinput
1. hadoop fs -copyFromLocal ./*.log /user/$USER/smallfileinput/
1. hadoop fs -cat /user/$USER/smallfileinput/*.log | hadoop fs -put - /user/$USER/smallfileinput/merged.log

Large File:
Get into the downloaded folder and perform the following commands

1. hadoop fs -mkdir /user/$USER/largefileinput
1. hadoop fs -copyFromLocal ./*.log /user/$USER/largefileinput/
1. hadoop fs -cat /user/$USER/largefileinput/*.log | hadoop fs -put - /user/$USER/largefileinput/merged.log

#### Downloading and running the JAR file:

To run the Daily file: Download the java files in daily folder and execute the following commands:

1. hadoop com.sun.tools.javac.Main MaxWeb*.java
1. jar cf mt.jar MaxWeb*.class
1. hadoop jar mt.jar MaxWeblog /user/$USER/smallfilenput/merged.log /user/$USER/output/1
1. hadoop jar mt.jar MaxWeblog /user/$USER/largefileinput/merged.log /user/$USER/output/2


To run the Monthly file: Download the java files in monthly folder and execute the following commands:

1. hadoop com.sun.tools.javac.Main MaxWeb*.java
1. jar cf mt.jar MaxWeb*.class
1. hadoop jar mt.jar MaxWeblog /user/$USER/smallfileinput/merged.log /user/$USER/output/3
1. hadoop jar mt.jar MaxWeblog /user/$USER/largefileinput/merged.log /user/$USER/output/4

SMALL - per day output

![smalldailyfile](https://github.com/illinoistech-itm/aramakrishnan/blob/master/itmd521/week-13/item-one/dsmall.png)

LARGE - per day output

![largedailyfile](https://github.com/illinoistech-itm/aramakrishnan/blob/master/itmd521/week-13/item-one/dlarge.png)

SMALL - per month output

![smallmonthlyfile](https://github.com/illinoistech-itm/aramakrishnan/blob/master/itmd521/week-13/item-one/msmall.png)

LARGE - per month output

![largemonthlyfile](https://github.com/illinoistech-itm/aramakrishnan/blob/master/itmd521/week-13/item-one/mlarge.png)


