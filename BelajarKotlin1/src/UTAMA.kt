//cara import class yg ada di pack lain, tulis nama Package.NamaClass
import VARIABEL.Global_dan_Lokal
import VARIABEL.angkaA
import VARIABEL.angkaB

fun main(){
    //inisialisasi kelas
    val variabel = Global_dan_Lokal()

    //manggil fungsi di kelasnya
    val fungsi = variabel.hasil
    print("Hasil dari "+ angkaA +" ditambah "+ angkaB +" adalah "+fungsi)
}