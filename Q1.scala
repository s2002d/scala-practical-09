object Q1{
    def main(args:Array[String]):Unit={
        print("Enter Amount= ")
        val amount = scala.io.StdIn.readInt
        val interest = cal_inter(amount)
        println(s"Interest for deposit of Rs. $amount is Rs. $interest")
    }
    def cal_inter(deposit:Double):Double ={
        val intfun:Double=>Double=deposit match{
            case d if d <=20000 => (am:Double)=>am*0.02
            case d if d <=200000 => (am:Double)=>am*0.04
            case d if d <=2000000 => (am:Double)=>am*0.035
            case d if d > 2000000 => (am:Double)=>am*0.065
        }
        intfun(deposit)

    }
}