import java.util.Scanner;

public class DemoManusia {
    private String nama;
    private int umur;
    private int alamat;

    public Phone(String nama, int umur, int alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    public void lihatIdentitasUser() {
        System.out.println("");
        System.out.println("----------------------------------------------");
        System.out.println("                nama : " + nama);
        System.out.println("                umur : " + umur);
        System.out.println("                alamat : " + alamat);
    }

    public static void main (String args[]) {
        DemoManusia p1 = new Phone(phoneName, Integer.parseInt(phoneBuyQty), Integer.parseInt(phonePrice));
        p1.lihatPhone();
    }
}