fun main() {
    print("������� ����� ������� ��� 0 ��� ������: ")
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

    println("������� �1. �������� ��������")
    print("������� ����� �������� � ������: ")
    val amount: Float = readLine()!!.toFloat()
    val summaKomiss = (amount / 100) * procentKomiss
    if (summaKomiss < summaMinKomiss) {
        println("����� ��������: $summaMinKomiss ���.")
    } else {
        println("����� ��������: $summaKomiss ���.")
    }
}

fun task2 () {
    println("������� �2. �����")
    var solution = "���������"

    print("������� ���-�� ������: ")
    val likes = readLine()!!.toInt()

    if (likes < 10)  solution = if ((likes % 10) == 1) "��������" else "���������"
    if (likes > 10 && likes % 100 == 11)  "���������" else "��������"
    if (likes > 10 && likes % 100 != 11)  solution = if ((likes % 10 == 1 || likes % 100 == 11)) "��������" else "���������"

    println("����������� $likes $solution")

}

fun task3 () {
    println("������� �3. �������")
    var userLevel = false  //���������� (true - ���������� ����������)
    val userDiscount = 1   // ������ ��� ���������� ����������� ��� �������� �� 10_001 ���
    val skidkaSumma: Int = 100  //������ ��� ���������� ��� �������� �� 1_001 �� 10_000 ���
    val skidkaProcent = 5   //������ ��� ���������� ��� �������� ����� 10_001 ���
    var amountSkidka = 0.0  //������ ��� ���������� ��� �������

    print("������� ����� ������� � ������: ")
    val amount: Int = readLine()!!.toInt()

    when (userLevel == false) {
        amount < 1_001 -> println("������ $amountSkidka%")
    else -> {
        if (amount < 10_001) {
            println("������ $skidkaSumma ���. ����� � ������ ������ � ������: " + (amount - skidkaSumma))
            println("��� ����������� ����������:")
            amountSkidka = (amount - skidkaSumma).toDouble()
            println("������ $skidkaSumma ���� ������ ����������� ���������� " + userDiscount + "%. ����� � ������ ������ � ������: " + (amountSkidka - (amountSkidka / 100 * userDiscount)))
        }
        if (amount > 10_001) {
            println("������ $skidkaProcent%. ����� � ������ ������ � ������: " + (amount - amount / 100 * skidkaProcent))
            println("��� ����������� ����������:")
            amountSkidka = (amount - amount / 100 * skidkaProcent).toDouble()
            println("������ $skidkaProcent% ���� ������ ����������� ���������� " + userDiscount + "%. ����� � ������ ������ � ������: " + (amountSkidka - (amountSkidka / 100 * userDiscount)))
        }

    }
    }
}