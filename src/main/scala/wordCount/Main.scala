package wordCount

import org.apache.hadoop.io.{IntWritable, Text}

object Main {
  var filename = "test.txt"

  // open file for test purposes, actual function will read from files in the input directory
  val bufferedSource = scala.io.Source.fromFile(filename)

  // need to adjust this expression to work on lines without bufferedSource
  val filteredPairs =
    bufferedSource
      .getLines()
      .map(line => line.trim.split("\\s+").toList)
        .collect {
          case "en" :: article :: requests :: _ :: Nil => (article, requests)
        }.toList

  // remove this line
  bufferedSource.close()

//  println("Results: ")
//  filteredPairs.foreach(println)
//  println(filteredPairs.getClass)

  // iterate through the filtered pairs and pass each one into the context
  filteredPairs.foreach(articleTuple => {
    println(articleTuple.getClass)
    println(articleTuple._1, articleTuple._2.toIntOption.getOrElse(1))
  })

//  line.split("\\n").filter(_.length > 0).map(_.toUpperCase).foreach(
//    (word:String) => { context.write(new Text(word), new IntWritable(1))}
//  )
}
