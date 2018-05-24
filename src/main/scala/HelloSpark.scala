import org.apache.spark.{SparkContext, SparkConf}

object HelloSpark {
  def main(args: Array[String]) {
    val sc = new SparkContext(new SparkConf().setAppName("hello spark").setMaster("local"))

    val rdd = sc.parallelize(Array(1, 2, 3, 4, 5))

    println("count: ")
    println(rdd.count())

    sc.stop()
  }
}
