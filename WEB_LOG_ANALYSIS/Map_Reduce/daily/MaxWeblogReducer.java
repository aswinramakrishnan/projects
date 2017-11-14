// cc MaxTemperatureReducer Reducer for maximum temperature example
// vv MaxTemperatureReducer
import java.io.IOException;
import java.util.*;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Reducer;

public class MaxWeblogReducer
  extends Reducer<Text, Text, Text, Text> {

//  @Override
public void reduce(Text key, Iterable<Text>  values,
      Context context)
      throws IOException, InterruptedException {

java.util.HashMap<String,Integer> hmaptry3 = new java.util.HashMap<String,Integer>();
   int count = 1;
int count2=0;
String txtkey="";
    for (Text in : values) {
      String value = in.toString();

String starturl = value.substring(value.indexOf("/"));
      String url = starturl.substring(0,(starturl.indexOf(" - ")));


if(url.length() != 0)
{
      if(hmaptry3.containsKey(url)){
		 hmaptry3.put(url.toString(),hmaptry3.get(url)+1);
		} else{
        hmaptry3.put(url.toString(),1);
         }
 }
   }

java.util.Iterator ite =  hmaptry3.entrySet().iterator();
    
    while(ite.hasNext()) {
       java.util.Map.Entry advalues = (java.util.Map.Entry)ite.next();
       String temp_key= advalues.getKey().toString();
       int b = Integer.parseInt(advalues.getValue().toString());
      if(b> count2){
count2 = b;        
txtkey= temp_key;
       }

      }
context.write(new Text(txtkey), new Text(key));
}
}


// ^^ MaxTemperatureReducer
