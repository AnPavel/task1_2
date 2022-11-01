fun main() {

    var procentKomiss: Double = 0.75
    var summaMinKomiss: Int = 35

    print("Введите сумму перевода в рублях: ")
    val amount: Float = readLine()!!.toFloat()
    val summaKomiss = (amount / 100) * procentKomiss
    //println("Сумма перевода: $amount руб.")
    if (summaKomiss < summaMinKomiss) {
        println("Сумма комиссии: $summaMinKomiss руб.")
    } else {
        println("Сумма комиссии: $summaKomiss руб.")
    }


}
