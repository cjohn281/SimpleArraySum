object Solution {
    /*
     * Might as well keep this simple, right?
     */
    def simpleArraySum(ar: Array[Int]): Int = {
        ar.sum // refactored
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
