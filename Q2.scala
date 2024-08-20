object Q2{
    def main(args:Array[String]):Unit={
        print("Enter an Integer = ")
        val int = scala.io.StdIn.readInt
        Number(int)
    }
    def Number(num:Int):Unit={
        val classify:Int=>String = num match{
            case n if n <0 =>_=>"Negative number."
            case n if n ==0 =>_=>"Zero number."
            case n if n %2 ==0 =>_=>"Even number."
            case n if n %2 !=0 =>_=>"Odd number."
        }
        println(classify(num))
    }
}