package VARIABEL

fun main(){
    //untuk data kosong sementara, bisa pakai {var NAMAVAR : TIPEVAR}
    var nama1 = ""
    var nama2:String
    var nama3:Char
    var angka:Int
    var angkakoma:Double
    var angkakoma1:Float
    var keputusan:Boolean

    //untuk angka kosong sementara bisa juga pakai 0
    var jumlah = 0

    //untuk null kasih ? setelah tipe data
    var kata:String?
    kata = null

    //ngisi nilai late init
    nama_baru = "mari berbagi"

} //------BATAS FUNGSI MAIN--------

    //atau bisa pakai LATEINIT untuk lintas lingkup
    lateinit var nama_baru : String

    //var nama_baru:String (kalau lintas lingkup tanpa lateinit maka eror)

