import java.util.Scanner;

public class Grade {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("masukkan nilai anda");
    int Nilai = input.nextInt();

    System.out.println("apakah mahasiswa hadir? Ya/Tidak");
    String hadirInput = input.next();
    boolean hadir = hadirInput.equalsIgnoreCase("Ya");

  String Grade;
  String Status;

  if (!hadir) {
    Grade = "E";
    Status = "Tidak Lulus (Tidak hadir ujian)";
  } else if (Nilai >= 90) {
      if (Nilai >= 95) {
        Grade = "A+";
      } else {
        Grade = "A";
      }
    } else if (Nilai >= 80) {
      if (Nilai >= 85) {
        Grade = "B+";
      } else {
        Grade = "B";
    }
  } else if (Nilai >= 70) {
      if (Nilai >= 75 ) {
        Grade = "C+";
      } else {
        Grade = "C";
    }
  } else if (Nilai >= 60) {
      if (Nilai >= 65) {
        Grade = "D+";
      } else {
        Grade = "D";
      }
  } else {
    Grade = "E";
  }

  // status lulus atau tidak`
  if (Nilai >= 60) {
    Status = "Lulus";
  } else {
    Status = "Tidak Lulus";
  }

  // output hasil
  System.out.println ("Nilai anda adalah : " + Nilai );
  System.out.println ("Grade anda adalah : " + Grade);
  System.out.println ("Status kehadiran anda : " + (hadir ? "hadir" : "tidak hadir") );
  System.out.println ("Status kelulusan anda : " + Status);
  }
}