// cc MaxTemperatureMapper Mapper for maximum temperature example
// vv MaxTemperatureMapper
import java.io.IOException;
import com.cloudera.sqoop.lib.RecordParser.*;
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

if( value.toString().charAt(0) != '#' && !value.toString().contains("null") ){
        large lrg = new large();
        try {
            lrg.parse(value); 
          } catch (ParseError pe) {
             return;
          }
        String swebsite=lrg.get_cs_uri_stem();
        String sdate=lrg.get_date().substring(0, 10);
        String sstatus=lrg.get_sc_status();
 if(sstatus.equals("200")){
      context.write(new Text(sdate), new Text(value.toString()));
  }
}
}
}
// ^^ MaxTemperatureMapper
