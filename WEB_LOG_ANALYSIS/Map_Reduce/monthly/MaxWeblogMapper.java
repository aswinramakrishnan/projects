// cc MaxTemperatureMapper Mapper for maximum temperature example
// vv MaxTemperatureMapper
import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class MaxWeblogMapper
  extends Mapper<LongWritable, Text, Text, Text> {

  private static final int MISSING = 9999;
  
  @Override
  public void map(LongWritable key, Text value, Context context)
      throws IOException, InterruptedException {
    
    String line = value.toString();
    String year = "null";
    String airTemperature = "null";
    if (line.charAt(0) != '#') { // parseInt doesn't like leading plus signs
      if(!line.contains("/index.")){
        if(line.contains(" 200 ")){
        year = line.substring(0, 7);      
	airTemperature = line.toString();
      context.write(new Text(year), new Text(airTemperature));
  }}}
}
}
// ^^ MaxTemperatureMapper
