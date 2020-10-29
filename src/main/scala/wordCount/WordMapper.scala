package wordCount

import org.apache.hadoop.io.{IntWritable, LongWritable, Text}
import org.apache.hadoop.mapreduce.Mapper

class WordMapper extends Mapper[LongWritable, Text, Text, IntWritable] {
  override def map(key: LongWritable, value: Text, context: Mapper[LongWritable,Text, Text, IntWritable]#Context): Unit = {
    val line = value.toString

    line
      .split("\\n")
      .filter(_.length > 0)
      .map(line => line.toUpperCase().split("\\s+").toList)
      .collect { case "EN" :: article :: requests :: _ :: Nil => (article, requests) }
      .foreach(aTuple => context.write(new Text(aTuple._1), new IntWritable(aTuple._2.toIntOption.getOrElse(1))))
  }
}
