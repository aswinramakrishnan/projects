### WEEK 13

#### ITEM - FIVE


Execution Steps:

Small File:
Get into the downloaded folder and perform the following commands

unzip small-logs-08-09-2016.zip
1. hadoop fs -mkdir /user/$USER/smallfileinput
1. hadoop fs -copyFromLocal ./*.log /user/$USER/smallfileinput/
1. hadoop fs -cat /user/$USER/smallfileinput/*.log | hadoop fs -put - /user/$USER/slogs.txt

(or)

1. awk '{print $1,$2,$3,$4,$5,$6,$7,$8,$9,$10,$11,$12,$13,$14}' *.log >> slogs.txt
1. grep -v '^#' slogs.txt >> slogs2.txt
1. rm ./slogs.txt


Large File:
Get into the downloaded folder and perform the following commands

1. hadoop fs -mkdir /user/$USER/largefileinput
1. hadoop fs -copyFromLocal ./*.log /user/$USER/largefileinput/
1. hadoop fs -cat /user/$USER/largefileinput/*.log | hadoop fs -put - /user/$USER/llogs2.txt

(or)

1. awk '{print $1,$2,$3,$4,$5,$6,$7,$8,$9,$10,$11,$12,$13,$14}' *.log >> llogs.txt
1. grep -v '^#' llogs.txt >> llogs2.txt
1. rm ./llogs.txt

Execution:

lodeddatafromtable = LOAD 'llogs.txt' USING PigStorage(' ') AS (date:chararray, time:chararray , s_ip:chararray, cs_method:chararray, cs_uri_stem:chararray, cs_uri_query:chararray, s_port:chararray ,cs_username:chararray, c_ip:chararray, cs_User_Agent:chararray, sc_status:int , sc_substatus:chararray, sc_win32_status:chararray, time_taken:chararray);


filter_data = FILTER trial BY sc_status == 200 AND cs_uri_stem != '.*index.*' AND cs_uri_stem != 'null' AND date != 'null';

groupByDateURIStream = GROUP filtered_trial BY (date,cs_uri_stem);

grouped_count = FOREACH groupByDateURIStream GENERATE FLATTEN(group) AS (date,cs_uri_stem), COUNT(filtered_data.sc_status) AS count;

ORDER_BY = grouped_count ORDER_BY groupByDateURIStream.count DESC;

groupedCountDate = GROUP grouped_count ORDER BY (date);

maxValue = FOREACH groupedCountDate generate group, MAX(grouped_count.DateWebsitecount) as maximumCount;

Full_Join = join grouped_count by (date,count), maxValue by (group,maximumCount);

Filter_output = FOREACH records GENERATE date, cs_uri_stem, maximumCount;

DUMP Filter_output;

Output:

SMALL FILE - MONTH

<pre>
(2016-08,/xmlrpc.php,3514644)
(2016-09,/xmlrpc.php,4211209)
</pre>

LARGE FILE - MONTH
<pre>
(2014-10,/xmlrpc.php,25073)
(2014-11,/xmlrpc.php,323282)
(2014-12,/xmlrpc.php,4164685)
(2015-01,/xmlrpc.php,1116619)
(2015-02,/xmlrpc.php,5677)
(2015-03,/xmlrpc.php,22166)
(2015-04,/xmlrpc.php,18975)
(2015-05,/xmlrpc.php,8776)
(2015-06,/wp-admin/admin-ajax.php,1740)
</pre>


LARGE FILE - DAY

<pre>
(2014-10-28,/xmlrpc.php,5036)
(2014-10-29,/xmlrpc.php,6470)
(2014-10-30,/xmlrpc.php,6352)
(2014-10-31,/xmlrpc.php,7215)
(2014-11-01,/xmlrpc.php,7675)
(2014-11-02,/xmlrpc.php,7726)
(2014-11-03,/xmlrpc.php,8082)
(2014-11-04,/xmlrpc.php,10801)
(2014-11-05,/xmlrpc.php,85363)
(2014-11-06,/xmlrpc.php,91725)
(2014-11-07,/xmlrpc.php,63048)
(2014-11-08,/xmlrpc.php,5797)
(2014-11-09,/xmlrpc.php,959)
(2014-11-10,/wp-login.php,471)
(2014-11-11,/xmlrpc.php,227)
(2014-11-12,/xmlrpc.php,202)
(2014-11-13,/xmlrpc.php,270)
(2014-11-14,/xmlrpc.php,1523)
(2014-11-15,/xmlrpc.php,2136)
(2014-11-16,/xmlrpc.php,2685)
(2014-11-17,/xmlrpc.php,872)
(2014-11-18,/xmlrpc.php,537)
(2014-11-19,/xmlrpc.php,816)
(2014-11-20,/xmlrpc.php,16434)
(2014-11-21,/xmlrpc.php,750)
(2014-11-22,/xmlrpc.php,320)
(2014-11-23,/xmlrpc.php,608)
(2014-11-24,/xmlrpc.php,402)
(2014-11-25,/xmlrpc.php,3377)
(2014-11-26,/xmlrpc.php,520)
(2014-11-27,/xmlrpc.php,6835)
(2014-11-28,/xmlrpc.php,1160)
(2014-11-29,/xmlrpc.php,942)
(2014-11-30,/xmlrpc.php,1225)
(2014-12-01,/xmlrpc.php,76136)
(2014-12-02,/xmlrpc.php,2769)
(2014-12-03,/xmlrpc.php,1852)
(2014-12-04,/xmlrpc.php,3473)
(2014-12-05,/xmlrpc.php,1745)
(2014-12-06,/xmlrpc.php,536)
(2014-12-07,/xmlrpc.php,1442)
(2014-12-08,/xmlrpc.php,2502)
(2014-12-09,/xmlrpc.php,8861)
(2014-12-10,/xmlrpc.php,23063)
(2014-12-11,/xmlrpc.php,10931)
(2014-12-12,/xmlrpc.php,448590)
(2014-12-13,/xmlrpc.php,1754)
(2014-12-14,/xmlrpc.php,30229)
(2014-12-15,/xmlrpc.php,3080)
(2014-12-16,/xmlrpc.php,6463)
(2014-12-17,/xmlrpc.php,1998)
(2014-12-18,/xmlrpc.php,53978)
(2014-12-19,/xmlrpc.php,7648)
(2014-12-20,/xmlrpc.php,40492)
(2014-12-21,/xmlrpc.php,109320)
(2014-12-22,/xmlrpc.php,25466)
(2014-12-23,/xmlrpc.php,38153)
(2014-12-24,/xmlrpc.php,13885)
(2014-12-25,/xmlrpc.php,18191)
(2014-12-26,/xmlrpc.php,54120)
(2014-12-27,/xmlrpc.php,26996)
(2014-12-28,/xmlrpc.php,412004)
(2014-12-29,/xmlrpc.php,1082237)
(2014-12-30,/xmlrpc.php,1138359)
(2014-12-31,/xmlrpc.php,518412)
(2015-01-01,/xmlrpc.php,527292)
(2015-01-02,/xmlrpc.php,533591)
(2015-01-03,/xmlrpc.php,46466)
(2015-01-04,/,107)
(2015-01-05,/xmlrpc.php,124)
(2015-01-06,/,119)
(2015-01-07,/xmlrpc.php,200)
(2015-01-08,/xmlrpc.php,177)
(2015-01-09,/xmlrpc.php,217)
(2015-01-10,/xmlrpc.php,299)
(2015-01-11,/xmlrpc.php,2048)
(2015-01-12,/xmlrpc.php,296)
(2015-01-13,/xmlrpc.php,293)
(2015-01-14,/xmlrpc.php,175)
(2015-01-15,/xmlrpc.php,384)
(2015-01-16,/xmlrpc.php,128)
(2015-01-17,/xmlrpc.php,127)
(2015-01-18,/xmlrpc.php,197)
(2015-01-19,/xmlrpc.php,176)
(2015-01-20,/xmlrpc.php,133)
(2015-01-21,/xmlrpc.php,275)
(2015-01-22,/xmlrpc.php,473)
(2015-01-23,/xmlrpc.php,824)
(2015-01-24,/xmlrpc.php,343)
(2015-01-25,/xmlrpc.php,652)
(2015-01-26,/xmlrpc.php,406)
(2015-01-27,/xmlrpc.php,534)
(2015-01-28,/,121)
(2015-01-29,/xmlrpc.php,145)
(2015-01-30,/wp-login.php,2202)
(2015-01-31,/xmlrpc.php,162)
(2015-02-01,/xmlrpc.php,152)
(2015-02-02,/xmlrpc.php,104)
(2015-02-03,/xmlrpc.php,101)
(2015-02-04,/xmlrpc.php,91)
(2015-02-05,/,116)
(2015-02-06,/xmlrpc.php,111)
(2015-02-07,/xmlrpc.php,162)
(2015-02-08,/xmlrpc.php,288)
(2015-02-09,/xmlrpc.php,514)
(2015-02-10,/xmlrpc.php,466)
(2015-02-11,/xmlrpc.php,224)
(2015-02-12,/xmlrpc.php,135)
(2015-02-13,/xmlrpc.php,247)
(2015-02-14,/xmlrpc.php,259)
(2015-02-15,/,102)
(2015-02-16,/,83)
(2015-02-17,/,57)
(2015-02-17,/xmlrpc.php,57)
(2015-02-18,/xmlrpc.php,62)
(2015-02-19,/xmlrpc.php,211)
(2015-02-20,/,92)
(2015-02-21,/,88)
(2015-02-22,/,85)
(2015-02-23,/xmlrpc.php,120)
(2015-02-24,/,96)
(2015-02-25,/,89)
(2015-02-26,/xmlrpc.php,315)
(2015-02-27,/xmlrpc.php,1020)
(2015-02-28,/xmlrpc.php,620)
(2015-03-01,/xmlrpc.php,1256)
(2015-03-02,/xmlrpc.php,925)
(2015-03-03,/xmlrpc.php,1086)
(2015-03-04,/xmlrpc.php,1054)
(2015-03-05,/xmlrpc.php,2034)
(2015-03-06,/xmlrpc.php,865)
(2015-03-07,/xmlrpc.php,1493)
(2015-03-08,/xmlrpc.php,2850)
(2015-03-09,/xmlrpc.php,5075)
(2015-03-10,/xmlrpc.php,515)
(2015-03-11,/xmlrpc.php,897)
(2015-03-12,/,96)
(2015-03-13,/xmlrpc.php,144)
(2015-03-14,/xmlrpc.php,301)
(2015-03-15,/,110)
(2015-03-16,/xmlrpc.php,704)
(2015-03-17,/,98)
(2015-03-18,/,98)
(2015-03-19,/,91)
(2015-03-20,/,80)
(2015-03-21,/,92)
(2015-03-22,/xmlrpc.php,906)
(2015-03-23,/xmlrpc.php,1290)
(2015-03-24,/xmlrpc.php,351)
(2015-03-25,/,92)
(2015-03-26,/,74)
(2015-03-27,/,90)
(2015-03-28,/,92)
(2015-03-29,/xmlrpc.php,180)
(2015-03-30,/,94)
(2015-03-31,/,103)
(2015-04-01,/,111)
(2015-04-02,/xmlrpc.php,263)
(2015-04-03,/wp-login.php,2172)
(2015-04-04,/,71)
(2015-04-05,/,80)
(2015-04-06,/,89)
(2015-04-07,/,97)
(2015-04-08,/,85)
(2015-04-09,/,107)
(2015-04-10,/,86)
(2015-04-11,/xmlrpc.php,1029)
(2015-04-12,/xmlrpc.php,1811)
(2015-04-13,/xmlrpc.php,1028)
(2015-04-14,/wp-login.php,778)
(2015-04-15,/xmlrpc.php,1085)
(2015-04-16,/wp-login.php,815)
(2015-04-17,/xmlrpc.php,2031)
(2015-04-18,/xmlrpc.php,7397)
(2015-04-19,/,100)
(2015-04-20,/,93)
(2015-04-21,/xmlrpc.php,820)
(2015-04-22,/xmlrpc.php,1321)
(2015-04-23,/,93)
(2015-04-24,/,88)
(2015-04-24,/xmlrpc.php,88)
(2015-04-25,/xmlrpc.php,388)
(2015-04-26,/xmlrpc.php,312)
(2015-04-27,/,87)
(2015-04-28,/,99)
(2015-04-29,/xmlrpc.php,952)
(2015-04-30,/,93)
(2015-05-01,/,104)
(2015-05-02,/xmlrpc.php,540)
(2015-05-03,/xmlrpc.php,1224)
(2015-05-04,/xmlrpc.php,142)
(2015-05-05,/xmlrpc.php,263)
(2015-05-06,/xmlrpc.php,2872)
(2015-05-07,/xmlrpc.php,143)
(2015-05-08,/xmlrpc.php,117)
(2015-05-09,/xmlrpc.php,162)
(2015-05-10,/xmlrpc.php,186)
(2015-05-11,/xmlrpc.php,133)
(2015-05-12,/,90)
(2015-05-13,/xmlrpc.php,112)
(2015-05-14,/xmlrpc.php,125)
(2015-05-14,/,125)
(2015-05-15,/,105)
(2015-05-16,/,107)
(2015-05-17,/,96)
(2015-05-18,/xmlrpc.php,110)
(2015-05-19,/xmlrpc.php,223)
(2015-05-20,/xmlrpc.php,318)
(2015-05-21,/xmlrpc.php,160)
(2015-05-22,/xmlrpc.php,101)
(2015-05-23,/xmlrpc.php,142)
(2015-05-24,/xmlrpc.php,131)
(2015-05-25,/xmlrpc.php,209)
(2015-05-26,/xmlrpc.php,312)
(2015-05-27,/xmlrpc.php,252)
(2015-05-28,/xmlrpc.php,323)
(2015-05-29,/xmlrpc.php,189)
(2015-05-30,/,67)
(2015-05-31,/,80)
(2015-06-01,/wp-admin/admin-ajax.php,206)
(2015-06-02,/wp-admin/admin-ajax.php,272)
(2015-06-03,/wp-admin/admin-ajax.php,385)
(2015-06-04,/wp-admin/admin-ajax.php,487)
(2015-06-05,/xmlrpc.php,123)
(2015-06-06,/xmlrpc.php,148)
(2015-06-07,/xmlrpc.php,114)
(2015-06-08,/,68)
(2015-06-09,/,87)
(2015-06-10,/,75)
(2015-06-11,/wp-admin/admin-ajax.php,116)
(2015-06-12,/,68)
(2015-06-13,/,59)
(2015-06-14,/,70)
(2015-06-15,/,70)
(2015-06-16,/,114)
(2015-06-17,/,108)
(2015-06-18,/,109)
(2015-06-19,/wp-admin/admin-ajax.php,157)
(2015-06-20,/,19)
</pre>

SMALL FILE - DAY

<pre>
(2016-08-19,/xmlrpc.php,278976)
(2016-08-20,/xmlrpc.php,297850)
(2016-08-21,/xmlrpc.php,196934)
(2016-08-22,/xmlrpc.php,167758)
(2016-08-23,/xmlrpc.php,31241)
(2016-08-24,/xmlrpc.php,365472)
(2016-08-25,/xmlrpc.php,345653)
(2016-08-26,/xmlrpc.php,279996)
(2016-08-27,/xmlrpc.php,330206)
(2016-08-28,/xmlrpc.php,294098)
(2016-08-29,/xmlrpc.php,290312)
(2016-08-30,/xmlrpc.php,316894)
(2016-08-31,/xmlrpc.php,319254)
(2016-09-01,/xmlrpc.php,300461)
(2016-09-02,/xmlrpc.php,310214)
(2016-09-03,/xmlrpc.php,329314)
(2016-09-04,/xmlrpc.php,294540)
(2016-09-05,/xmlrpc.php,313829)
(2016-09-06,/xmlrpc.php,314557)
(2016-09-07,/xmlrpc.php,321395)
(2016-09-08,/xmlrpc.php,318352)
(2016-09-09,/xmlrpc.php,354453)
(2016-09-10,/xmlrpc.php,330338)
(2016-09-11,/xmlrpc.php,332302)
(2016-09-12,/xmlrpc.php,348363)
(2016-09-13,/xmlrpc.php,275177)
(2016-09-14,/xmlrpc.php,67914)
</pre>

