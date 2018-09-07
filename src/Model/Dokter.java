/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Ryan
 */
public class Dokter {


        private String nomorPegawai;
        private String nama;
        private String alamat;
        private String tempatLahir;
        private int tanggalLahirDok;
        private int bulanLahirDok;
        private int tahunLahirDok;

        /**
         * membuat constuctor kosong pada kelas Dokter
         */
        public Dokter() {
        }

        /**
         * membuat constuctor Dokter dengan parameter String nama
         *
         * @param nama
         */
        public Dokter(String nama) {
            //nama dari variabel global sama dengan nama dari variabel lokal
            this.nama = nama;
        }

        /**
         * membuat method public String dengan nama getNomorPegawai()
         *
         * @return
         */
        public String getNomorPegawai() {
            //pengembalian nilai dari nomorPegawai
            return nomorPegawai;
        }

        /**
         * membuat method public dengan variabel void dengan nama nomorPegawai
         * ditambah dengan throws Exception
         *
         * @param nomorPegawai
         * @throws Exception
         */
        public void setNomorPegawai(String nomorPegawai) throws Exception {
            //membandingkan jika nomorPegawai.length() sama dengan 6

            if (nomorPegawai.length() == 6) {
                // nomorPegawai dari variabel global sama dengan nomorPegawai dari variabel lokal

                this.nomorPegawai = nomorPegawai;
            } else {
                //jika tidak sesuai akan menampilkan "nomor pegawai salah"

                throw new Exception("nomor pegawai salah");
            }

        }

        /**
         * membuat method public String dengan nama getNama()
         *
         * @return
         */
        public String getNama() {
            //pengembalian nilai dari nama
            return nama;
        }

        /**
         * membuat method public void dengan nama setNama()
         *
         * @param nama
         */
        public void setNama(String nama) {
            //nama dari variabel global sama dengan nama dari variabel lokal
            this.nama = nama;
        }

        /**
         * membuat method public dengan variabel String dengan nama getAlamat()
         *
         * @return
         */
        public String getAlamat() {
            //pengembalian nilai dari alamat
            return alamat;
        }

        /**
         * membuat method public dengan variabel void dengan nama setNama()
         *
         * @param alamat
         */
        public void setAlamat(String alamat) {
            //alamat dari variabel global sama dengan alamat dari variabel lokal
            this.alamat = alamat;
        }

        /**
         * membuat method public dengan variabel String dengan nama
         * getTempatLahir()
         *
         * @return
         */
        public String getTempatLahir() {
            //pengembalian nilai dari tempatlahir
            return tempatLahir;
        }

        /**
         * membuat method public dengan variabel void dengan nama
         * setTempatlahir()
         *
         * @param tempatLahir
         */
        public void setTempatLahir(String tempatLahir) {
            //tempatLahir dari variabel global sama dengan tempatLahir dari variabel lokal
            this.tempatLahir = tempatLahir;
        }

        /**
         * membuat method public dengan variabel String dengan nama
         * getTanggalLahirDok()
         *
         * @return
         */
        public int getTanggalLahirDok() {
            //pengembalian nilai dari tanggalLahirDok
            return tanggalLahirDok;
        }

        /**
         * membuat method public dengan variabel void dengan nama
         * setTanggalLahirDok
         *
         * @param tanggalLahir
         * @throws Exception
         */
        public void setTanggalLahirDok(int tanggalLahir) throws Exception {
            //membandingkan jika tanggalLahirDok lebih dari 0

            if (tanggalLahir > 0) {
                //membandingkan jika tanggalLahirDok kurangdari atau samadengan 31

                if (tanggalLahir <= 31) {
                    //tanggalLahirDok dari variabel global sama dengan tanggalLahirDok dari variabel lokal

                    this.tanggalLahirDok = tanggalLahir;
                } else {
                    //jika tidak sesuai akan menampilkan "tanggal lahir lebih dari 31"

                    throw new Exception("tanggal lahir lebih dari 31");
                }
            } else {
                //jika tidak sesuai akan menampilkan "tanggal lahir kurang dari 1"

                throw new Exception("tanggal lahir kurang dari 1");
            }
        }

        /**
         * membuat method public dengan variabel String dengan nama
         * getBulanLahirDok()
         *
         * @return
         */
        public int getBulanLahirDok() {
            //pengembalian nilai dari bulanLahirDok
            return bulanLahirDok;
        }

        /**
         * membuat method public dengan variabel void dengan nama
         * setBulanLahirDok
         *
         * @param bulanLahirDok
         * @throws Exception
         */
        public void setBulanLahirDok(int bulanLahirDok) throws Exception {
            //membandingkan jika bulanLahirDok lebih dari 0

            if (bulanLahirDok > 0) {
                //membandingkan jika bulanLahirDok kurangdari atau sama dengan 12

                if (bulanLahirDok <= 12) {
                    //bulanLahirDok dari variabel global sama dengan bulanLahirDok dari variabel lokal

                    this.bulanLahirDok = bulanLahirDok;
                } else {
                    //jika tidak sesuai akan menampilkan "bulan lahir lebih dari 12"

                    throw new Exception("bulan lahir lebih dari 12");
                }
            } else {
                //jika tidak sesuai akan menampilkan "bulan lahir kurang dari 0"

                throw new Exception("bulan lahir kurang dari 1");
            }
        }

        /**
         * membuat method public dengan variabel String dengan nama
         * getTahunLahirDok()
         *
         * @return
         */
        public int getTahunLahirDok() {
            //pengembalian nilai dari tahunLahirDok
            return tahunLahirDok;
        }

        /**
         * membuat method public dengan variabel void dengan nama
         * setTahunLahirDok
         *
         * @param tahunLahirDok
         * @throws Exception
         */
        public void setTahunLahirDok(int tahunLahirDok) throws Exception {
            //membandingkan jika tahunLahirDok lebih dari 0

            if (tahunLahirDok > 0) {
                //tahunLahirDok dari variabel global sama dengan tahunLahirDok dari variabel lokal

                this.tahunLahirDok = tahunLahirDok;
            } else {
                //jika tidak sesuai maka akan mencetak "tahun lahir kurang dari 1"

                throw new Exception("tahun lahir kurang dari 1");
            }
//tahunLahirDok dari variabel global sama dengan tahunLahirDok dari variabel lokal
            this.tahunLahirDok = tahunLahirDok;

        }

        /**
         * membuat method public dengan variabel void dengan nama
         * aturNomorPegawai()
         *
         */
        public void aturNomorPegawai() {
            //membuat objek baru tgl dengan tipe Date
            Date tgl = new Date();
            //membuat objek ft bertipe SimpleDateFormat
            SimpleDateFormat ft = new SimpleDateFormat("yyyMMdd");
            //menampilkan objek ft ditambah 3 huruf pertama dari nama
            System.out.println(ft.format(tgl) + nama.substring(0, 3));
        }
    }

