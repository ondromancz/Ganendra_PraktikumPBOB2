public class Main {
    public static void main(String[] args) {
        Person p;
        p = new Student("Sally");
        p.status(1);
    }
}

//1. Maka output yang didapat adalah: Now online: Sally
//2. Diskusikan bagaimana hasil tersebut didapatkan (hint: apakah “this” pada kelas person dalam method status dieksekusi ketika compile time atau runtime)
//Jawab:
//Output "Now online: Sally" didapat karena:
//  -Method status milik Person dipanggil (karena p bertipe Person).
//  -Di dalam status, dipanggil this.isAsleep(hr).
//  -this menunjuk ke objek Student, jadi method override isAsleep milik Student yang dijalankan.
//  -isAsleep(1) pada Student = false, maka output: "Now online: Sally".

