fun main() {

    var procentKomiss: Double = 0.75
    var summaMinKomiss: Int = 35

    print("������� ����� �������� � ������: ")
    val amount: Float = readLine()!!.toFloat()
    val summaKomiss = (amount / 100) * procentKomiss
    //println("����� ��������: $amount ���.")
    if (summaKomiss < summaMinKomiss) {
        println("����� ��������: $summaMinKomiss ���.")
    } else {
        println("����� ��������: $summaKomiss ���.")
    }


}
