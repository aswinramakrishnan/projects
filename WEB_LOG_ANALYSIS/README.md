
### WEB LOG ANALYSIS:

Implemented data analysis on Historical weblogs. Performed data ingestion using SQOOP, data transformations to preprocess the unstructured data and then analyzing most visited URL based on different criteria like IP address and context of the page using MapReduce, HIVE, and PIG. Time comparison is made based on the performance of each tool

#### COMPARISION - MAP REDUCE, MYSQL, HIVE AND PIG

Ease of gathering, processing, and wrtting code to retrieve data

MAP_REDUCE:

1. _Gathering :_ 

> In _Map Reduce Job_, raw dataset can be processed. No need to have any structured data in order to process. So, data gathering is easier than hive, pig and sql since raw data can be processed directly.

1. _Processing :_

> Processing time for running the Map Reduce job is very high. One may alter the process time if the code is well written based on the best algorithim which would take more time on writting code. One may also think of decreasing the time by running  more maps, yet the processing time will be high compared to sql and pig.

1. _Writting code :_

> The code logic to write the code is very important for high performance. This requires high knowledge in _Java_ where the data structures needs to be implemented. Hence Writting code is difficult and requires lot of time comapred to sql , hive, scoop, and pig

Assumption for Item 1: As I assume the dataset is space seperated , i have used substring  and have eliminated lines with # value.

MY SQL:

1. _Gathering :_ 

> In _Structured_ Query Language, the dataset needs to be in structured. So, this is a greatest disadvantage of using SQL compared to mapreduce and pig. Also, as this is data on write, it takes more time to push into the database for processing. 

1. _Processing :_

> Processing time is very low for SQL. As we have insterted structured data in the database, the processing time is lower than Mapreduce. 

1. _Writting code :_

> The code requires SQL query language expertise and knowledge for high performance. This consumes time to perform the successfull query. Since most of the real data are unstructured, one need to check the pattern of each file and there may be some issues with missing data or unknown data which may result in job failure. This also consumes time and resources to program in SQL but comparatively less than MapReduce.

Assumption for Item 2: As far i have saw, the data is structured, i can execute the code in an efficient manner with no missing data.

SQOOP:


1. _Gathering :_ 

> In _SQOOP_, ease of gathering and processing will be easier if the data needs to be in structured. Here the level of abstraction is high. Here no need to check the field positions during the processing the file. 

1. _Processing :_

> Processing time is lower than SQL. Since there is both java and SQL involved in the execution, the processing time is better than MapReduce and SQL.

1. _Writting code :_

> The coding requires more of Java knowledge and small amount of SQL queries to process the data. This consumes more time for unstructured data and identify the fields to neglect. However the coding is better compared to Sql and Mapreduce.

Assumption for Item 3: In Sqoop, parallel processing is available in order to efficient run of the process.


HIVE:


1. _Gathering :_ 

> In _Hive_, unstructured data needs to be converted to structured data. If it is unstructured, then dealing with unstructured data with strucutred queries is time consuming. Hence gathering the structured data is main drawback compared to pig and mapreduce.

1. _Processing :_

>  Processing time is low as it is running on the top of MapReduce. As it runs with B Tree structure it takes more time on the strucutured data when compared to unstructured data. Here, level of abstraction is also very high. Hence the Processing time is low compared to MapReduce and SQOOP.

1. _Writting code :_

>  The code logic requires both java and SQL knowledge on this. As the hive queries are written on the top of the MapReduce job it increases the complexity of the program. The writting code logic is easier compared to the MapReduce and Sqoop.

Assumption for Item 4: In order to process the hive, we need to process SQL and then only we can execute Hive.

PIG:


> In _Pig_, data can be unstructured or well structured. Gathering of data is very well easier and user friendly than all other MapReduce or sqoop or hive or sql.

1. _Processing :_

> Processing time is more efficient and also very low time compared to all other process like MapReduce, Sqoop or hive.

1. _Writting code :_

> Here, one needs more script knowledge when compared to java or SQL. The coding is very efficient and more easier compared to SQL and MapReduce. Hence the writting code logic is best compared to all others. Also, the lines of codes are very low.

Assumption for Item 5: This needs knowledge on scripting. Also, one needs to have knowledge on sql as well on this. 

Personal Choice : The more efficient way to do this would be PIG compared to MapReduce and SQL as it consumes very less time to code and allocation of resources and low processing time.  



