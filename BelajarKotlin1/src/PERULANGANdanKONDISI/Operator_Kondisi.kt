package PERULANGANdanKONDISI

fun main(){
    //OR AND NOT
    var kondisiA = true
    var kondisiB = true
    var kondisiC = true
    if (kondisiA == true ||kondisiB==true || kondisiC==true ){
        println("LOGIN")
    }else if (kondisiA==true && kondisiB==true && kondisiC==true){
        println("SEMUA OKE DAN")
    }else if (kondisiA!=true || kondisiB!=true && kondisiC!=true){
        println("Ada yang salah")
    }


}