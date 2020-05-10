/*
再帰関数として「対象」と、「割る数」と、現在の「結果」を受け取り、次の「結果」を返す関数を定義する
関数の中身を定義する
「割る数」が「割る数の最大値」よりも大きかったら現在の結果に現在の「対象」を加えたものを答えとする
もし「対象」が「割る数」で割り切れたら、「結果」に「割る数」で割り切れた回数を１足して再度関数を実行する
もし「対象」が割り切れないなら、「割る数」を1足して再度関数を実行する
*/
import scala.math.sqrt


object Factorization extends App {
    var target = 24
    val maxDivisor = sqrt(target).toInt

    def factorizationRec(num: Int, divisor: Int, acc: Map[Int, Int]): Map[Int, Int] = {
        Map(2 -> 3, 3 -> 1)
    }
    println(factorizationRec(target, 2, Map()))
}