fun main() {
    val names = arrayListOf("Sinem", "Ali", "Hümeyra", "Cem", "Gizem")
    names.sortedBy { it }
    println("Lütfen bir isim girin")
    var input : String = readLine()!!
    if(input !=null && names.contains(input)){
        println(input.toUpperCase().reversed())
    }else{
        println("listede yok")
    }
}