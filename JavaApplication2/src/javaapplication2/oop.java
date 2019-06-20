package javaapplication2;
    class Manusia{
        String nama;
}
class Mahasiswa extends Manusia{
String nim;
String jurusan;
Mahasiswa(String nama,String nim, String jurusan){
    this.nama=nama;
    this.jurusan=jurusan;
    this.nim=nim;
}
String resume(){
    return nim+"-_-"+ nama + "-_- "+jurusan;
}
class Karyawan extends Manusia{
int nip;
String jabatan;
}
 public static void main(String[] args) {
        Mahasiswa robi = new Mahasiswa("asdada","s1121","dawda");
        System.out.println(robi.resume());
}
}
