fun main() {
    data class Student(val name: String, val age: Int, val school: String)

    val students = arrayListOf(
        Student("Ahmet", 20, "Üniversite A"),
        Student("Ayşe", 27, "Üniversite B"),
        Student("Mehmet", 22, "Üniversite C"),
        Student("Fatma", 28, "Üniversite A"),
        Student("Ali", 29, "Üniversite B"),
        Student("Feyza", 24, "Üniversite A"),
        Student("Berkay", 22, "Üniversite B"),
        Student("Caner", 26, "Üniversite A")
    )
    val maxOgrenci = students.maxByOrNull { it.age }
    val minOgrenci = students.minByOrNull { it.age }
    if (maxOgrenci != null && minOgrenci != null) {
        println(
            "en büyük öğrenci: ${maxOgrenci.name},${students.indexOf(maxOgrenci)},en küçük öğrenci:${minOgrenci.name},${
                students.indexOf(
                    minOgrenci
                )
            }"
        )
    }
    val listele = students.filter { it.school == "Üniversite A" }
    val buyukler = listele.filter { it.age > 25 }
    val kucukler = listele.filter { it.age < 25 }
    println("Yaşı 25'ten büyük olan öğrenciler:\n${buyukler}\n")
    println("Yaşı 25'ten küçük veya eşit olan öğrenciler:\n${kucukler}\n")
}