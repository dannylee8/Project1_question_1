package wordCount

import org.apache.hadoop.io.{IntWritable, Text}
import org.apache.hadoop.mapreduce.Mapper

class KeyValueSwappingMapper extends Mapper[Text, IntWritable, IntWritable, Text] {
  override def map(key: Text, value: IntWritable, context: Mapper[Text, IntWritable, IntWritable, Text]#Context): Unit = {
    context.write(value, key)
  }
}
