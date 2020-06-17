package VARIABEL

fun main(){
    var a = 10
    var b = 3
    var hasil_NOconvert = a/b
    println(hasil_NOconvert)

    //untuk convert tipe apapun tambahkan .toTipeData
    var hasil_convertSETIAP = a.toFloat()/b.toDouble()
    println(hasil_convertSETIAP)

    //kalau convertnya diakhir, maka yang dikonvert adalah setelah hasil var
    //10 bagi 3 tetap disimpan dalam integer 3 kemudian saat print baru diubah menjadi 3.0
    var hasil_conver_akhir = a/b
    println(hasil_conver_akhir.toFloat())
}