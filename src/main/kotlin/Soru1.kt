fun main(args: Array<String>) {
    val arrayList = arrayListOf("ayşe,fatma,ibrahim,deniz,melek")
    println("Lütfen virgülle ayrılmış üç isim girin:")
    var input: String = readLine()!!
    val names = input?.split(",")?.map { it.trim() }?.toList()
    if (names != null && names.size == 3) {
        arrayList.add(names.toString())
        println(arrayList)
    } else {
        println("hatali")
    }
}