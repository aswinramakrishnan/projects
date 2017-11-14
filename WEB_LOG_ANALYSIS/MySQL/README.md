
### WEEK - 13

#### ITEM - TWO

_Go to unziped folder of small and large files and please concatenate the logs file in local system using "cat * .log > merged.log"_

_Login to mysql using "mysql -u root -p" and create a database:_

1. create database logs;
1. use logs;
1. create table large ( date varchar(50), time varchar(50), IP_ADD varchar(50),cs_method varchar(50), cs_uri_stem varchar(50), cs_uri_query varchar(50), s_port int, cs_username varchar(50), c_ip varchar(50), cs_user_agent varchar(50), sc_status varchar(50), sc_substatus varchar(50), sc_win_status varchar(50), time_taken varchar(50) );
1. create table small ( date varchar(50), time varchar(50), s_ip varchar(50),cs_method varchar(50), cs_uri_stem varchar(50), cs_uri_query varchar(50), s_port int, cs_username varchar(50), c_ip varchar(50), cs_user_agent varchar(50), sc_status varchar(50), sc_substatus varchar(50), sc_win_status varchar(50), time_taken varchar(50) );

_In order to load from local infile, we need to login through "mysql -u root -p --local-infile":_

1. use logs;
1. load data local infile '/vagrant/large/merged.log' into table large columns terminated by ' ' lines terminated by '\n';
1. load data local infile '/vagrant/small/merged.log' into table small columns terminated by ' ' lines terminated by '\n';

_Execute the following codes for the output:_

__Large File - per day__

select modified_year, modified_month, modified_day,cs_uri_stem_dummy,max(modified_count)
from
(select year(date) as modified_year, month(date) as modified_month, day(date) as modified_day, cs_uri_stem as cs_uri_stem_dummy, count(cs_uri_stem) as modified_count
from large
where cs_uri_stem is not null and year(date) is not null and month(date) is not null and day(date) is not null
group by cs_uri_stem, year(date),month(date),day(date)
order by count(cs_uri_stem) desc) as abc
group by modified_year, modified_month, modified_day
order by modified_year, modified_month, modified_day;

Output:

![largedailyfile](https://github.com/illinoistech-itm/aramakrishnan/blob/master/itmd521/week-13/item-two/dlarge2.png)


__Small File - per day__

select modified_year, modified_month, modified_day,cs_uri_stem_dummy,max(modified_count)
     from
     (select year(date) as modified_year, month(date) as modified_month, day(date) as modified_day, cs_uri_stem as cs_uri_stem_dummy, count(cs_uri_stem) as modified_count
     from small
     where cs_uri_stem is not null and year(date) is not null and month(date) is not null and day(date) is not null
     group by cs_uri_stem, year(date),month(date),day(date)
     order by count(cs_uri_stem) desc) as abc
     group by modified_year, modified_month, modified_day
     order by modified_year, modified_month, modified_day;

Output:

![smalldailyfile](https://github.com/illinoistech-itm/aramakrishnan/blob/master/itmd521/week-13/item-two/dsmall2.png)

__Large File - per Month__

select MAX(sub.count1) as RESULT, sub.url_stem2 , sub.date as modified_date from (
select date, count(cs_uri_stem) as count1, cs_uri_stem as url_stem2 from large where sc_STATUS = '200' and cs_uri_stem NOT LIKE '%index%' and cs_uri_stem NOT LIKE '/' 
group by cs_uri_stem,date 
order by count1 desc
) sub
group by month(modified_date);


Output:

![largemonthlyfile](https://github.com/illinoistech-itm/aramakrishnan/blob/master/itmd521/week-13/item-two/mlarge2.png)


__Small File - per Month__


select MAX(sub.count1) as RESULT, sub.url_stem2 , sub.date as modified_date from (
select date, count(cs_uri_stem) as count1, cs_uri_stem as url_stem2 from small where sc_STATUS = '200' and cs_uri_stem NOT LIKE '%index%' and cs_uri_stem NOT LIKE '/' 
group by cs_uri_stem,date 
order by count1 desc
) sub
group by month(modified_date);

Output:

![smallmonthlyfile](https://github.com/illinoistech-itm/aramakrishnan/blob/master/itmd521/week-13/item-two/msmall2.png)

