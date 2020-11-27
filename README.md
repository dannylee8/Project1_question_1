## Project 1: Exploring Wikipedia Datasets 

- Project 1 will consist of using big data tools to answer questions about datasets from Wikipedia.  There are a series of basic analysis questions.
- The questions should be answered using Hive or MapReduce.  Feel free to use whichever tool seems best to you given the question or a combination of the two.  For each question you should have a repeatable process that would work on a larger dataset, not just an ad hoc calculation.
- You will have to make some assumptions and simplfications in order to answer these questions.  Make sure those assumptions/simplifications and the reasoning for them are included in your answer.  At the very least, restricting the time period of your analyses will make some of these questions easier to answer.
- You may find it useful to produce intermediate results from the input datasets.  Include a brief overview of these transformations and the intermediate results you produce in your presentation.

1. Which English wikipedia article got the most traffic on October 20?
2. What English wikipedia article has the largest fraction of its readers follow an internal link to another wikipedia article?
3. What series of wikipedia articles, starting with [Hotel California](https://en.wikipedia.org/wiki/Hotel_California), keeps the largest fraction of its readers clicking on internal links?  This is similar to (2), but you should continue the analysis past the first article.
4. Find an example of an English wikipedia article that is relatively more popular in the UK.  Find the same for the US and Australia.
5. Analyze how many users will see the average vandalized wikipedia page before the offending edit is reversed.
6. Run an analysis you find interesting on the wikipedia datasets we're using.

---

#### Technologies: 
- Apache Hadoop 3.2.1  
- Apache Hive 3.1.2
- Scala 2.13
- YARN
- HDFS
- Git + GitHub

---
#### Presentation Materials:  
1. Presentation: A Google Slides presentation for the project [URL](https://docs.google.com/presentation/d/1S7Oo5qgNKZHhJhsDdxU3qOv4UDvsLeQtx09d523eYlY/edit?usp=sharing)
2. Q4 Datasets processed with MR and divided into Countries: [Google drive link](https://drive.google.com/drive/folders/1O-XQm1UEbmJrad_IfJZs4rgr5yJsb6YF?usp=sharing)

---

#### Links for data
- [All Analytics](https://dumps.wikimedia.org/other/analytics/)
- [Pageviews Filtered to Human Traffic](https://dumps.wikimedia.org/other/pageviews/readme.html)
  - https://wikitech.wikimedia.org/wiki/Analytics/Data_Lake/Traffic/Pageviews
- [Page Revision and User History](https://dumps.wikimedia.org/other/mediawiki_history/readme.html)
  - https://wikitech.wikimedia.org/wiki/Analytics/Data_Lake/Edits/Mediawiki_history_dumps#Technical_Documentation
- [Monthly Clickstream](https://dumps.wikimedia.org/other/clickstream/readme.html)
  - https://meta.wikimedia.org/wiki/Research:Wikipedia_clickstream
