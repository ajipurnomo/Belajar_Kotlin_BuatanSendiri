package VARIABEL

//var global bisa dipakai di lingkup mana pun
val angkaA = 1
val angkaB = 2

class Global_dan_Lokal {
//val "hasil" adalah var lokal hanya bisa digunakan dalam class{} ini
    val hasil = angkaA + angkaB
    fun cetak(){
        print(hasil)
    }

}

