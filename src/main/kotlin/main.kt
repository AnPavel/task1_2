fun main() {
    print("Введите номер задания или 0 для выхода: ")
    val nomerzadania: Int = readLine()!!.toInt()
    when (nomerzadania) {
        1 -> task1()
        2 -> task2()
        3 -> task3()
        else -> 0
    }
}

fun task1 () {
    val procentKomiss: Double = 0.75
    val summaMinKomiss: Int = 35

    println("Задание №1. Денежные переводы")
    print("Введите сумму перевода в рублях: ")
    val amount: Float = readLine()!!.toFloat()
    val summaKomiss = (amount / 100) * procentKomiss
    if (summaKomiss < summaMinKomiss) {
        println("Сумма комиссии: $summaMinKomiss руб.")
    } else {
        println("Сумма комиссии: $summaKomiss руб.")
    }
}

fun task2 () {
    println("Задание №2. Лайки")
    var solution = "человекам"

    print("Введите кол-во лайков: ")
    val likes = readLine()!!.toInt()

    if (likes < 10)  solution = if ((likes % 10) == 1) "человеку" else "человекам"
    if (likes > 10 && likes % 100 == 11)  "человекам" else "человеку"
    if (likes > 10 && likes % 100 != 11)  solution = if ((likes % 10 == 1 || likes % 100 == 11)) "человеку" else "человекам"

    println("Понравилось $likes $solution")

}

fun task3 () {
    println("Задание №3. Меломан")
    var userLevel = false  //покупатель (true - постоянный покупатель)
    val userDiscount = 1   // скидка для постоянных покупателей при покупках от 10_001 руб
    val skidkaSumma: Int = 100  //скидка для покупателя при покупках от 1_001 до 10_000 руб
    val skidkaProcent = 5   //скидка для покупателя при покупках более 10_001 руб
    var amountSkidka = 0.0  //скидка для покупателя без условий

    print("Введите сумму покупки в рублях: ")
    val amount: Int = readLine()!!.toInt()

    when (userLevel == false) {
        amount < 1_001 -> println("Скидка $amountSkidka%")
    else -> {
        if (amount < 10_001) {
            println("Скидка $skidkaSumma руб. Сумма с учетом скидки в рублях: " + (amount - skidkaSumma))
            println("Для постоянного покупателя:")
            amountSkidka = (amount - skidkaSumma).toDouble()
            println("Скидка $skidkaSumma плюс скидка постоянному покупателю " + userDiscount + "%. Сумма с учетом скидки в рублях: " + (amountSkidka - (amountSkidka / 100 * userDiscount)))
        }
        if (amount > 10_001) {
            println("Скидка $skidkaProcent%. Сумма с учетом скидки в рублях: " + (amount - amount / 100 * skidkaProcent))
            println("Для постоянного покупателя:")
            amountSkidka = (amount - amount / 100 * skidkaProcent).toDouble()
            println("Скидка $skidkaProcent% плюс скидка постоянному покупателю " + userDiscount + "%. Сумма с учетом скидки в рублях: " + (amountSkidka - (amountSkidka / 100 * userDiscount)))
        }

    }
    }
}