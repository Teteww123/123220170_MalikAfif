/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;


import javax.swing.*;

class hitungg extends JFrame {
    JLabel Teks1 = new JLabel("Welcome, [Mr/Mrs] [username]");
    JLabel Teks2 = new JLabel("Tentukan panjang, lebar, dan tinggi untuk menghitung balok");
    JLabel panjang = new JLabel("Panjang");
    JLabel lebar = new JLabel("Lebar");
    JLabel tinggi = new JLabel("Tinggi");
    JLabel hasil = new JLabel("Hasil");
    JLabel luasP = new JLabel("Luas Persegi");
    JLabel kelP = new JLabel("Keliling Persegi");
    JLabel volB = new JLabel("Volume Balok");
    JLabel luasPB = new JLabel("Luas Permukaan Balok");
    JLabel hasil1 = new JLabel("[Hasil berupa angka]");
    JLabel hasil2 = new JLabel("[Hasil berupa angka]");
    JLabel hasil3 = new JLabel("[Hasil berupa angka]");
    JLabel hasil4 = new JLabel("[Hasil berupa angka]");
    
   
    //tombol baru maniez
    JButton tombol = new  JButton ("Hitung");
    JButton tombol1 = new  JButton ("Reset");
    
    JTextField input = new JTextField();
    JTextField input1 = new JTextField();
    JTextField input2 = new JTextField();
    
    
    hitungg(){
        setVisible(true);
        setSize(450,480);
        setTitle("Buat Frame Baru");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Teks1.setFont(Teks1.getFont().deriveFont(17f));
        
        setLayout(null);
        add(Teks1);
        Teks1.setBounds(10,20,300,25);
        add(Teks2);
        Teks2.setBounds(10,38,400,25);
        
        
        add(panjang);
        panjang.setBounds(10,70,150,25);
        add(input);
        input.setBounds(70, 70, 190, 20);
        
        add(lebar);
        lebar.setBounds(10,100,150,25);
        add(input1);
        input1.setBounds(70, 100, 190, 20);
        
        add(tinggi);
        tinggi.setBounds(10,130,150,25);
        add(input2);
        input2.setBounds(70, 130, 190, 20);
        
        add(tombol);
        tombol.setBounds(90, 160, 280, 24);
        add(tombol1);
        tombol1.setBounds(90, 190, 280, 24);
        
         add(hasil);
        hasil.setBounds(215,220,180,25);
        
        add(luasP);
        luasP.setBounds(10,240,150,25);
        add(hasil1);
        hasil1.setBounds(190,240,150,25);
        
        add(kelP);
        kelP.setBounds(10,260,150,25);
        add(hasil2);
        hasil2.setBounds(190,260,150,25);
        
        add(volB);
        volB.setBounds(10,280,150,25);
        add(hasil3);
        hasil3.setBounds(190,280,150,25);
        
        add(luasPB);
        luasPB.setBounds(10,300,150,25);
        add(hasil4);
        hasil4.setBounds(190,300,150,25);
        
    }
}
public class hitung {
    public static void main(String[] args) {
    hitungg hi =new hitungg();
    }
}
