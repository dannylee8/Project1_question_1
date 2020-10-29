package wordCount

import org.apache.hadoop.conf.Configuration
import org.apache.hadoop.fs.Path
import org.apache.hadoop.io.{IntWritable, Text}
import org.apache.hadoop.mapreduce.Job
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat

/**
 * WordDriver is the eentry point for our MapReduce job.
 * In this class we configure input and output data formats, configure Mapper
 * and Reducer classes, and specify intermediate data formats
 *
 * We're going to make use of command line arguments here which can be accessed
 * in the args array
 * */
object WordDriver extends App {

  if (args.length != 2) {
    println("Usage: WordDriver <input dir> <output dir>")
    System.exit(-1)
  }
  val conf : Configuration = new Configuration();
  // instantiating a Job object we can configure
  val job = Job.getInstance(conf, "word count")

  // Set the jar file that contains driver, mapper, and reducer.
  // This jar file will be transferred to nodes that run tasks.
  job.setJarByClass(WordDriver.getClass)

  job.setJobName("Word Count")

  // Specify input and output paths based on the command line arts
  // this line sets the input to be from files specified in the first arg received
  FileInputFormat.addInputPath(job, new Path(args(0)))

  // this line sets output path based on the second arg
  FileOutputFormat.setOutputPath(job, new Path(args(1)))

  job.setMapperClass(classOf[WordMapper])
  println("Mapper class ", classOf[WordMapper])
  job.setReducerClass(classOf[WordReducer])
  println("Reducer class ", classOf[WordReducer])

  // Specify the job's output key and value classes.  We're making use of some defaults to
  // not have to specify input and intermediate
  job.setOutputKeyClass(classOf[Text])
  job.setOutputValueClass(classOf[IntWritable])

  val success = job.waitForCompletion(true)
  System.exit(if (success) {0} else {1})
}
