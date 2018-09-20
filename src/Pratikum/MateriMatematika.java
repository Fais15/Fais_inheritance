/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum;

/**
 *
 * @author Windows 10
 */
public class MateriMatematika {
 public static void main(String[] args) {
 Guru guru1 = new Guru();
 Pelajaran pelajaran1 = new Pelajaran();
 
 System.out.println("Jumlah Jam Pelajaran = " + guru1.JamPelajaran);
 guru1.Membimbing();
 
 System.out.println("Jumlah Materi Pelajaran = " + pelajaran1.MateriPelajaran+"bab");
 pelajaran1.Mengajar();
 }
}