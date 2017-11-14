### WEEK - 13

#### ITEM THREE

Execution Steps:

Import the files from sqoop and execute the commands:

1. sqoop import --connect jdbc:mysql://localhost/logs --table large -m 1 --username root --password safestsystemever
1. sqoop import --connect jdbc:mysql://localhost/logs --table small -m 1 --username root --password safestsystemever

(or) Download the files from respective folders and execute:

1. hadoop com.sun.tools.javac.Main *.java
1. jar cf mt.jar *.class
1. hadoop jar  mt.jar MaxWeblog -libjars $SQOOP_HOME/sqoop-1.4.6.jar

Outputs:

DAILY - LARGE

![largedailyfile](https://github.com/illinoistech-itm/aramakrishnan/blob/master/itmd521/week-13/item-three/dlarge3.png)


DAILY - SMALL

![smalldailyfile](https://github.com/illinoistech-itm/aramakrishnan/blob/master/itmd521/week-13/item-three/dsmall3.png)

MONTHLY - LARGE

![largemonthlyfile](https://github.com/illinoistech-itm/aramakrishnan/blob/master/itmd521/week-13/item-three/mlarge3.png)

MONTHLY - SMALL

![smallmonthlyfile](https://github.com/illinoistech-itm/aramakrishnan/blob/master/itmd521/week-13/item-three/msmall3.png)


