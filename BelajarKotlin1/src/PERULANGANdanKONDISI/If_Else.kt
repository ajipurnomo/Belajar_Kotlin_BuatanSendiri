package PERULANGANdanKONDISI

fun main(){
    //IF ELSE sederhana
    val nama="bayu"
    if (nama != "aji"){
        println("INI BUKAN Aji")
    }else{
        println("Halooo Aji")
    }

    //IF ELSE dimasukkan FOR, dimasukkan IF lagi
    var keterangan:Boolean = false
    if (keterangan==false){
        println("akses diTUTUP")
        var jumlah:Int = 3
        for (scan:Int in 1..jumlah){
            println("Tadi sudah ada percobaan ke-$scan")
            if (scan==jumlah){
                println("sudah $jumlah kali mencoba")
            }
        }
    }else{
        print("akses DIBUKA")
    }

    //IF ELSE dengan kondisi banyak
    var siswa1 = 6
    var siswa2 = 5
    var siswa3 = 2
    var rata = (siswa1+siswa2+siswa3)/3
    println("rata-rata nilai adalah ${rata.toFloat()} ,maka")
    if (rata <= 5 && siswa1<7 && siswa2<7 && siswa3<7){
        print("guru salah")
    }else{
        print("murid pemalas")
    }
}