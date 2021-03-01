package com.spark.practice
import org.apache.spark.sql._

object SparkTest extends App {
  val spark = SparkSession
    .builder
    .appName("SparkTest")
    .master("local")
    .getOrCreate()

  val df = spark.read.format("text").load("src/main/resources/text.txt")
  df.show

}
