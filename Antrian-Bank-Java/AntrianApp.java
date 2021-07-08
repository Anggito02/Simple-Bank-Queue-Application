
/**
 * Aplikasi Antrian
 *
 * @author Anggito Anju
 * @version 1.0 - 7 Mei 21
 */

import java.util.Scanner;

public class AntrianApp
{   
    public static void main(String[] args) {
        //Deklarasi Variabel 
        int layanan,
            keperluan,
            user,
            pengerjaan,
            jenisPegawai;
            
        String namaNasabah;


        //Deklarasi pelayanan di Customer Service
        String  keperluanCS_1 = "Pembukaan rekening bank",
                keperluanCS_2 = "Pelayanan masalah pada rekening nasabah",
                keperluanCS_3 = "Informasi saldo dan mutasi nasabah",
                keperluanCS_4 = "Administrasi buku cek dan buku tabungan";

        //Deklarasi pelayanan di Teller
        String  keperluanTeller_1 = "Penyetoran tabungan dan deposito",
                keperluanTeller_2 = "Pencatatan tabungan dan deposito",
                keperluanTeller_3 = "Pencatatan transaksi buku tabungan";

        //Buat input object user
        Scanner inputObject = new Scanner(System.in);
        Scanner nameObject = new Scanner(System.in);

        //Buat Queue
        Queue queueAntrianCS = new Queue();
        Queue queueAntrianTeller = new Queue();

        //Buat User Interface Program
        System.out.println("===== Aplikasi Antrian Bank =====");

        //Loop sampai program di terminate
        while(true) {
            //Masukkan user
            System.out.println("Pilih jenis user : ");
            System.out.println("1. Nasabah Bank");
            System.out.println("2. Pegawai Bank");
            System.out.println("3. Keluar");

            user = inputObject.nextInt();

//          Jika user merupakan nasabah bank
            if(user == 1) {
                //Membuat Loop jika nasabah salah memasukkan input
                while(true) {
                    System.out.println();
                    //Memasukkan layanan yang diperlukan nasabah
                    System.out.println("Pilih layanan : ");
                    System.out.println("1. Customer Service");
                    System.out.println("2. Teller");
                    System.out.println("3. Cek Antrian");
                    System.out.println("4. Kembali ke Menu");

                    layanan = inputObject.nextInt();

                //  Jika nasabah membutuhkan CS
                    if(layanan == 1) {
                        //Membuat loop jika nasabah salah memasukkann input
                        while(true) {
                            System.out.println();
                            System.out.println("Pilih keperluan : ");
                            System.out.println("1. " +keperluanCS_1);
                            System.out.println("2. " +keperluanCS_2);
                            System.out.println("3. " +keperluanCS_3);
                            System.out.println("4. " +keperluanCS_4);
                            System.out.println("5. Kembali");

                            keperluan = inputObject.nextInt();

                            if(keperluan >= 1 && keperluan <= 4) {
                                //Masukkan nama nasabah
                                System.out.println();
                                System.out.print("Masukkan nama Anda : ");
                                namaNasabah = nameObject.nextLine();

                                //Enqueue ke Queue yang tersedia sesuai keperluan
                                if(keperluan == 1) {
                                    queueAntrianCS.enqueue(namaNasabah, keperluanCS_1);
                                }
                                if(keperluan == 2) {
                                    queueAntrianCS.enqueue(namaNasabah, keperluanCS_2);
                                }
                                if(keperluan == 3) {
                                    queueAntrianCS.enqueue(namaNasabah, keperluanCS_3);
                                }
                                if(keperluan == 4) {
                                    queueAntrianCS.enqueue(namaNasabah, keperluanCS_4);
                                }

                                //User Interface untuk informasi nasabah
                                System.out.println();
                                System.out.println("== Customer Service ==");
                                System.out.println("Nomor antrian anda : " +queueAntrianCS.size);
                                System.out.print("Dengan keperluan : ");

                                if(keperluan == 1) {
                                    System.out.println(keperluanCS_1);
                                }
                                if(keperluan == 2) {
                                    System.out.println(keperluanCS_2);
                                }
                                if(keperluan == 3) {
                                    System.out.println(keperluanCS_3);
                                }
                                if(keperluan == 4) {
                                    System.out.println(keperluanCS_4);
                                }
                                break;
                            }
                            //Kembali ke pilih layanan
                            else if(keperluan == 5) {
                                break;
                            }
                            //user salah memasukkan input
                            else {
                                System.out.println("Nomor tidak valid!");
                            }
                        }
                    }
                //  Jika nasabah membutuhkan teller
                    else if(layanan == 2) {
                        //Membuat loop jika user salah memasukkan nomor
                        while(true) {
                            System.out.println();
                            System.out.println("Pilih keperluan : ");
                            System.out.println("1. " +keperluanTeller_1);
                            System.out.println("2. " +keperluanTeller_2);
                            System.out.println("3. " +keperluanTeller_3);
                            System.out.println("4. Kembali");

                            keperluan = inputObject.nextInt();

                            if(keperluan >= 1 && keperluan <= 3) {
                                //Masukkan nama nasabah
                                System.out.println();
                                System.out.print("Masukkan nama Anda : ");
                                namaNasabah = nameObject.nextLine();

                                //Enqueue ke Queue yang tersedia sesuai keperluan
                                if(keperluan == 1) {
                                    queueAntrianTeller.enqueue(namaNasabah, keperluanTeller_1);
                                }
                                if(keperluan == 2) {
                                    queueAntrianTeller.enqueue(namaNasabah, keperluanTeller_2);
                                }
                                if(keperluan == 3) {
                                    queueAntrianTeller.enqueue(namaNasabah, keperluanTeller_3);
                                }

                                //User Interface untuk informasi nasabah
                                System.out.println("== Teller ==");
                                System.out.println("Nomor antrian anda : " +queueAntrianTeller.size);
                                System.out.print("Dengan keperluan : ");
                                if(keperluan == 1) {
                                    System.out.println(keperluanTeller_1);
                                }
                                if(keperluan == 2) {
                                    System.out.println(keperluanTeller_2);
                                }
                                if(keperluan == 3) {
                                    System.out.println(keperluanTeller_3);
                                }
                                break;
                            }
                            //Kembali ke menu layanan
                            else if(keperluan == 4) {
                                break;
                            }
                            //user salah memasukkan input
                            else {
                                System.out.println("Nomor tidak valid!");
                            }
                        }
                    }
                //  Jika nasabah ingin melihat antrian
                    else if(layanan == 3) {
                        System.out.println();
                        System.out.println("===== ANTRIAN CUSTOMER SERVICE =====");
                        queueAntrianCS.queue_view();
                        System.out.println("=====      ANTRIAN TELLER      =====");
                        queueAntrianTeller.queue_view();
                    }
                //  Jika nasabah ingin kembali ke menu
                    else if(layanan == 4) {
                        break;
                    }
                //  Jika salah input
                    else {
                        System.out.println("Nomor tidak valid!");
                    }
                }
                
            }
//          Jika user merupakan pegawai bank
            else if(user == 2) {
                //Loop jika pegawai salah memasukkan input
                while(true) {
                    System.out.println();
                    //Output isi antrian
                    System.out.println("===== ANTRIAN CUSTOMER SERVICE =====");
                    queueAntrianCS.queue_view();
                    System.out.println("=====      ANTRIAN TELLER      =====");
                    queueAntrianTeller.queue_view();

                    //Memilih jenis pegawai
                    System.out.println();
                    System.out.println("Pilh jenis pegawai : ");
                    System.out.println("1. Customer Service");
                    System.out.println("2. Teller");
                    System.out.println("3. Kembali ke Menu Utama");

                    jenisPegawai = inputObject.nextInt();

                    if(jenisPegawai == 1) {
                        //loop jika pegawai salah memasukkan input
                        while(true) {
                            System.out.println();
                            //Memilih jenis pelayanan
                            System.out.println("Pilih jenis pengerjaan : ");
                            System.out.println("1. Layani");
                            System.out.println("2. Hapus");
                            System.out.println("3. Kembali ke menu pegawai");

                            pengerjaan = inputObject.nextInt();

                            if(pengerjaan == 1 || pengerjaan == 2) {
                                queueAntrianCS.dequeue();
                                //Output isi antrian
                                System.out.println();
                                System.out.println("===== ANTRIAN CUSTOMER SERVICE =====");
                                queueAntrianCS.queue_view();
                                break;
                            }
                            else if(pengerjaan == 3) {
                                break;
                            }
                            else {
                                System.out.println("Nomor tidak valid!");
                            }
                        }
                    }
                    if(jenisPegawai == 2) {
                        //loop jika pegawai salah memasukkan input
                        while(true) {
                            System.out.println();
                            //Memilih jenis pelayanan
                            System.out.println("Pilih jenis pengerjaan : ");
                            System.out.println("1. Layani");
                            System.out.println("2. Hapus");
                            System.out.println("3. Kembali ke menu pegawai");

                            pengerjaan = inputObject.nextInt();

                            if(pengerjaan == 1 || pengerjaan == 2) {
                                queueAntrianTeller.dequeue();
                                //Output isi antrian
                                System.out.println();
                                System.out.println("=====      ANTRIAN TELLER      =====");
                                queueAntrianTeller.queue_view();
                                break;
                            }
                            else if(pengerjaan == 3) {
                                break;
                            }
                            else {
                                System.out.println("Nomor tidak valid!");
                            }
                        }
                    }
                    if(jenisPegawai == 3) {
                        break;
                    }
                    else {
                        System.out.println("Nomor tidak valid!");
                    }
                }
            }
//          Jika user ingin menyelesaikan program
            else if(user == 3) {
                break;
            }
//          Jika user salah memasukkan nomor
            else {
                System.out.println("Nomor tidak valid!");
            }
        }

        inputObject.close();
        nameObject.close();
    }
}
