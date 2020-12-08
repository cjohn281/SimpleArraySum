object Solution {
    /*
     * Complete the simpleArraySum function below.
     */
    def simpleArraySum(ar: Array[Int]): Int = {
        return ar.sum
    }

    def main(args: Array[String]): Unit = {
        if (args.length == 0) {
            println("ERROR: Include integer arguments")
        }
        else {
            val ar = args.map(_.toInt).toArray
            println(simpleArraySum(ar))
        }
    }
}
