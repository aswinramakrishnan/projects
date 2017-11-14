
### WEEK 13

#### ITEM FOUR

Execution SQL :
Login to HIVE and execute the below code:

LARGE FILE- DAILY

select modified_year, modified_month, modified_day,cs_uri_stem_dummy,max(modified_count)
from
(select year(date) as modified_year, month(date) as modified_month, day(date) as modified_day, cs_uri_stem as cs_uri_stem_dummy, count(cs_uri_stem) as modified_count
from large
where cs_uri_stem is not null and year(date) is not null and month(date) is not null and day(date) is not null
group by cs_uri_stem, year(date),month(date),day(date)
order by count(cs_uri_stem) desc) as abc
group by modified_year, modified_month, modified_day
order by modified_year, modified_month, modified_day;

<pre>
2014	10	28	/xmlrpc.php	5036
2014	10	31	/xmlrpc.php	7215
2014	11	3	/xmlrpc.php	8082
2014	11	6	/xmlrpc.php	91725
2014	11	9	/xmlrpc.php	959
2014	11	12	/xmlrpc.php	202
2014	11	15	/xmlrpc.php	2136
2014	11	18	/xmlrpc.php	537
2014	11	21	/xmlrpc.php	750
2014	11	24	/xmlrpc.php	402
2014	11	27	/xmlrpc.php	6835
2014	11	30	/xmlrpc.php	1225
2014	12	2	/xmlrpc.php	2769
2014	12	5	/xmlrpc.php	1745
2014	12	8	/xmlrpc.php	2502
2014	12	11	/xmlrpc.php	10931
2014	12	14	/xmlrpc.php	30229
2014	12	17	/xmlrpc.php	1998
2014	12	20	/xmlrpc.php	40492
2014	12	23	/xmlrpc.php	38153
2014	12	26	/xmlrpc.php	54120
2014	12	29	/xmlrpc.php	1082237
2015	1	2	/xmlrpc.php	533591
2015	1	5	/xmlrpc.php	124
2015	1	8	/xmlrpc.php	177
2015	1	11	/xmlrpc.php	2048
2015	1	14	/xmlrpc.php	175
2015	1	17	/xmlrpc.php	127
2015	1	20	/xmlrpc.php	133
2015	1	23	/xmlrpc.php	824
2015	1	26	/xmlrpc.php	406
2015	1	29	/xmlrpc.php	145
2015	2	1	/xmlrpc.php	152
2015	2	4	/xmlrpc.php	91
2015	2	7	/xmlrpc.php	162
2015	2	10	/xmlrpc.php	466
2015	2	13	/xmlrpc.php	247
2015	2	16	/	83
2015	2	19	/xmlrpc.php	211
2015	2	22	/	85
2015	2	25	/	89
2015	2	28	/xmlrpc.php	620
2015	3	3	/xmlrpc.php	1086
2015	3	6	/xmlrpc.php	865
2015	3	9	/xmlrpc.php	5075
2015	3	12	/	96
2015	3	15	/	110
2015	3	18	/	98
2015	3	21	/	92
2015	3	24	/xmlrpc.php	351
2015	3	27	/	90
2015	3	30	/	94
2015	4	2	/xmlrpc.php	263
2015	4	5	/	80
2015	4	8	/	85
2015	4	11	/xmlrpc.php	1029
2015	4	14	/wp	
2015	4	17	/xmlrpc.php	2031
2015	4	20	/	93
2015	4	23	/	93
2015	4	26	/xmlrpc.php	312
2015	4	29	/xmlrpc.php	952
2015	5	1	/	104
2015	5	4	/xmlrpc.php	142
2015	5	7	/xmlrpc.php	143
2015	5	10	/xmlrpc.php	186
2015	5	13	/xmlrpc.php	112
2015	5	16	/	107
2015	5	19	/xmlrpc.php	223
2015	5	22	/xmlrpc.php	101
2015	5	25	/xmlrpc.php	209
2015	5	28	/xmlrpc.php	323
2015	5	31	/	80
2015	6	3	/wp	
2015	6	6	/xmlrpc.php	148
2015	6	9	/	87
2015	6	12	/	68
2015	6	15	/	70
2015	6	18	/	109
2014	10	29	/xmlrpc.php	6470
2014	11	1	/xmlrpc.php	7675
2014	11	4	/xmlrpc.php	10801
2014	11	7	/xmlrpc.php	63048
2014	11	13	/xmlrpc.php	270
2014	11	16	/xmlrpc.php	2685
2014	11	19	/xmlrpc.php	816
2014	11	22	/xmlrpc.php	320
2014	11	25	/xmlrpc.php	3377
2014	11	28	/xmlrpc.php	1160
2014	12	3	/xmlrpc.php	1852
2014	12	6	/xmlrpc.php	536
2014	12	9	/xmlrpc.php	8861
2014	12	12	/xmlrpc.php	448590
2014	12	15	/xmlrpc.php	3080
2014	12	18	/xmlrpc.php	53978
2014	12	21	/xmlrpc.php	109320
2014	12	24	/xmlrpc.php	13885
2014	12	27	/xmlrpc.php	26996
2014	12	30	/xmlrpc.php	1138359
2015	1	3	/xmlrpc.php	46466
2015	1	6	/	119
2015	1	9	/xmlrpc.php	217
2015	1	12	/xmlrpc.php	296
2015	1	15	/xmlrpc.php	384
2015	1	18	/xmlrpc.php	197
2015	1	21	/xmlrpc.php	275
2015	1	24	/xmlrpc.php	343
2015	1	27	/xmlrpc.php	534
2015	1	30	/wp	
2015	2	2	/xmlrpc.php	104
2015	2	5	/	116
2015	2	8	/xmlrpc.php	288
2015	2	11	/xmlrpc.php	224
2015	2	14	/xmlrpc.php	259
2015	2	17	/	57
2015	2	17	/xmlrpc.php	57
2015	2	20	/	92
2015	2	23	/xmlrpc.php	120
2015	2	26	/xmlrpc.php	315
2015	3	1	/xmlrpc.php	1256
2015	3	4	/xmlrpc.php	1054
2015	3	7	/xmlrpc.php	1493
2015	3	10	/xmlrpc.php	515
2015	3	13	/xmlrpc.php	144
2015	3	16	/xmlrpc.php	704
2015	3	19	/	91
2015	3	22	/xmlrpc.php	906
2015	3	25	/	92
2015	3	28	/	92
2015	3	31	/	103
2015	4	3	/wp	
2015	4	6	/	89
2015	4	9	/	107
2015	4	12	/xmlrpc.php	1811
2015	4	15	/xmlrpc.php	1085
2015	4	18	/xmlrpc.php	7397
2015	4	21	/xmlrpc.php	820
2015	4	24	/	88
2015	4	24	/xmlrpc.php	88
2015	4	27	/	87
2015	4	30	/	93
2015	5	2	/xmlrpc.php	540
2015	5	5	/xmlrpc.php	263
2015	5	8	/xmlrpc.php	117
2015	5	11	/xmlrpc.php	133
2015	5	14	/	125
2015	5	14	/xmlrpc.php	125
2015	5	17	/	96
2015	5	20	/xmlrpc.php	318
2015	5	23	/xmlrpc.php	142
2015	5	26	/xmlrpc.php	312
2015	5	29	/xmlrpc.php	189
2015	6	1	/wp	
2015	6	4	/wp	
2015	6	7	/xmlrpc.php	114
2015	6	10	/	75
2015	6	13	/	59
2015	6	16	/	114
2015	6	19	/wp	
2014	10	30	/xmlrpc.php	6352
2014	11	2	/xmlrpc.php	7726
2014	11	5	/xmlrpc.php	85363
2014	11	8	/xmlrpc.php	5797
2014	11	10	/wp	
2014	11	11	/xmlrpc.php	227
2014	11	14	/xmlrpc.php	1523
2014	11	17	/xmlrpc.php	872
2014	11	20	/xmlrpc.php	16434
2014	11	23	/xmlrpc.php	608
2014	11	26	/xmlrpc.php	520
2014	11	29	/xmlrpc.php	942
2014	12	1	/xmlrpc.php	76136
2014	12	4	/xmlrpc.php	3473
2014	12	7	/xmlrpc.php	1442
2014	12	10	/xmlrpc.php	23063
2014	12	13	/xmlrpc.php	1754
2014	12	16	/xmlrpc.php	6463
2014	12	19	/xmlrpc.php	7648
2014	12	22	/xmlrpc.php	25466
2014	12	25	/xmlrpc.php	18191
2014	12	28	/xmlrpc.php	412004
2014	12	31	/xmlrpc.php	518412
2015	1	1	/xmlrpc.php	527292
2015	1	4	/	107
2015	1	7	/xmlrpc.php	200
2015	1	10	/xmlrpc.php	299
2015	1	13	/xmlrpc.php	293
2015	1	16	/xmlrpc.php	128
2015	1	19	/xmlrpc.php	176
2015	1	22	/xmlrpc.php	473
2015	1	25	/xmlrpc.php	652
2015	1	28	/	121
2015	1	31	/xmlrpc.php	162
2015	2	3	/xmlrpc.php	101
2015	2	6	/xmlrpc.php	111
2015	2	9	/xmlrpc.php	514
2015	2	12	/xmlrpc.php	135
2015	2	15	/	102
2015	2	18	/xmlrpc.php	62
2015	2	21	/	88
2015	2	24	/	96
2015	2	27	/xmlrpc.php	1020
2015	3	2	/xmlrpc.php	925
2015	3	5	/xmlrpc.php	2034
2015	3	8	/xmlrpc.php	2850
2015	3	11	/xmlrpc.php	897
2015	3	14	/xmlrpc.php	301
2015	3	17	/	98
2015	3	20	/	80
2015	3	23	/xmlrpc.php	1290
2015	3	26	/	74
2015	3	29	/xmlrpc.php	180
2015	4	1	/	111
2015	4	4	/	71
2015	4	7	/	97
2015	4	10	/	86
2015	4	13	/xmlrpc.php	1028
2015	4	16	/wp	
2015	4	19	/	100
2015	4	22	/xmlrpc.php	1321
2015	4	25	/xmlrpc.php	388
2015	4	28	/	99
2015	5	3	/xmlrpc.php	1224
2015	5	6	/xmlrpc.php	2872
2015	5	9	/xmlrpc.php	162
2015	5	12	/	90
2015	5	15	/	105
2015	5	18	/xmlrpc.php	110
2015	5	21	/xmlrpc.php	160
2015	5	24	/xmlrpc.php	131
2015	5	27	/xmlrpc.php	252
2015	5	30	/	67
2015	6	2	/wp	
2015	6	5	/xmlrpc.php	123
2015	6	8	/	68
2015	6	11	/wp	
2015	6	14	/	70
2015	6	17	/	108
2015	6	20	/	19
</pre>


SMALL FILE- DAILY 

select modified_year, modified_month, modified_day,cs_uri_stem_dummy,max(modified_count)
     from
     (select year(date) as modified_year, month(date) as modified_month, day(date) as modified_day, cs_uri_stem as cs_uri_stem_dummy, count(cs_uri_stem) as modified_count
     from small
     where cs_uri_stem is not null and year(date) is not null and month(date) is not null and day(date) is not null
     group by cs_uri_stem, year(date),month(date),day(date)
     order by count(cs_uri_stem) desc) as abc
     group by modified_year, modified_month, modified_day
     order by modified_year, modified_month, modified_day;

<pre>
2016	8	19	/xmlrpc.php	278976
2016	8	22	/xmlrpc.php	167758
2016	8	26	/xmlrpc.php	279996
2016	9	1	/xmlrpc.php	300461
2016	9	5	/xmlrpc.php	313829
2016	9	9	/xmlrpc.php	354453
2016	9	12	/xmlrpc.php	348363
2016	8	21	/xmlrpc.php	196934
2016	8	25	/xmlrpc.php	345653
2016	8	29	/xmlrpc.php	290312
2016	9	4	/xmlrpc.php	294540
2016	9	8	/xmlrpc.php	318352
2016	9	11	/xmlrpc.php	332302
2016	8	20	/xmlrpc.php	297850
2016	8	24	/xmlrpc.php	365472
2016	8	28	/xmlrpc.php	294098
2016	8	31	/xmlrpc.php	319254
2016	9	3	/xmlrpc.php	329314
2016	9	7	/xmlrpc.php	321395
2016	9	10	/xmlrpc.php	330338
2016	9	14	/xmlrpc.php	67914
2016	8	23	/xmlrpc.php	31241
2016	8	27	/xmlrpc.php	330206
2016	8	30	/xmlrpc.php	316894
2016	9	2	/xmlrpc.php	310214
2016	9	6	/xmlrpc.php	314557
2016	9	13	/xmlrpc.php	275177

</pre>


LARGE FILE - MONTHLY

select MAX(sub.count1) as RESULT, sub.url_stem2 , sub.date as modified_date from (
select date, count(cs_uri_stem) as count1, cs_uri_stem as url_stem2 from large where sc_STATUS = '200' and cs_uri_stem NOT LIKE '%index%' and cs_uri_stem NOT LIKE '/'
group by cs_uri_stem,date
order by count1 desc
) sub
group by month(modified_date);

OUTPUT: 

<pre>
4164685	xmlrpc.php		2014-12
5677	xmlrpc.php		2015-02
8776	xmlrpc.php		2015-05
25073	xmlrpc.php		2014-10
22166	xmlrpc.php		2015-03
1740	wp-admin/admin-ajax.php	2015-06	
323282	xmlrpc.php		2014-11
1116619	xmlrpc.php		2015-01
18975	xmlrpc.php		2015-04
</pre>


SMALL FILE -MONTHLY

select MAX(sub.count1) as RESULT, sub.url_stem2 , sub.date as modified_date from (
select date, count(cs_uri_stem) as count1, cs_uri_stem as url_stem2 from small where sc_STATUS = '200' and cs_uri_stem NOT LIKE '%index%' and cs_uri_stem NOT LIKE '/'
group by cs_uri_stem,date
order by count1 desc
) sub
group by month(modified_date);


OUTPUT: 

<pre>
4211209 /xmlrpc.php 2016-09
3514644 /xmlrpc.php 2016-08
</pre>


