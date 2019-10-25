package com.example.indonesianfood;

import java.util.ArrayList;

public class FoodData {
    private static String[] foodNames = {
            "Soto Lamongan",
            "Rujak Cingur",
            "Rawon",
            "Gado-Gado",
            "Lontong Balap",
            "Pecel",
            "Tahu Tek",
            "Nasi Tumpang",
            "Rujak Soto",
            "Lodho Ayam"
    };

    private static String[] foodOrigins = {
            "Jawa Timur",
            "Jawa Barat",
            "Jawa Timur",
            "Jawa Barat",
            "Jawa Timur",
            "Jawa Barat",
            "Jawa Timur",
            "Jawa Barat",
            "Jawa Timur",
            "Jawa Barat"
    };

    private static String[] foodDetails = {
            "Soto Lamongan menjadi salah satu makanan khas Jawa Timur yang saat sangat mudah ditemukan di berbagai daerah lainnya. Namun, terdapat perbedaan antara soto Lamongan dengan soto lainnya, yakni koya, tahukah Anda apa itu koya? Koya merupakan sejenis bubuk gurih dengan bahan dasar pembuatannya berasal dari kerupuk udang dan bawang putih.",
            "Nah, jika kuliner Rujak Cingur pastinya sebagian besar dari kita pernah mendengar tentangnya bukan? Berbeda dari rujak biasanya yang berisikan irisan buah-buahan dan sambel, Rujak Cingur menjadi kesukaan para pecinta kuliner karena berisikan rujak mulut sapi, cingur, sayuran dan berbagai bahan pelengkap lainnya.",
            "Wisata kuliner khas Jawa Timur berikutnya yang wajib Anda coba ialah Rawon, sebagian dari kita pasti telah sering mendengarnya. Rawon merupakan sebuah makanan dengan kuah yang berwarna coklat kehitam-hitaman.",
            "Kuliner khas Jawa Timur selanjutnya ialah gado-gado yang memang telah terkenal dengan kelezatan citarasanya di lidah para penikmat wisata kuliner. Tidak hanya masyarakat Indonesia, bahkan wisatawan mancanegara pun telah membuktikan dan mengakui sendiri kelezatan dan kenikmatan kuliner unik yang satu ini.",
            "Namanya saja sudah sangat unik, namun jangan berpikir jika kuliner lontong yang satu ini digunakan untuk ajang perlombaan, kompetisi atau sejenisnya ya. Lontong Balap merupakan salah satu kuliner khas Jawa Timur dan Anda bisa menemukannya dengan mudah di sekitaran Jalanan Jawa Timur.",
            "Pecel merupakan salah satu kuliner yang sangat mudah ditemukan di berbagai kota di Indonesia, termasuk di Jawa Timur dengan cita rasa yang tidak diragukan lagi. Makanan khas Jawa Timur ini hampur digemari semua kalangan, dari muda hingga tua, baik pria maupun wanita memiliki selera yangs ama dalam menilai sebuah masakan terbaik.",
            "Kuliner khas Jawa Timur yang wajib Anda coba dengan cita rasa yang dijamin bikin nagih ialah Tahu Tek. Seperti namanya, jelas saja kuliner yang satu terbuat dari bahan utama berupa tahu.",
            "Nasi Tumpang khas Jawa Timur juga sering disebut dengan nama sego tumpang dan menjadi salah satu makanan terbaik khas Kediri, Jawa Timur. Kuliner menarik yang satu ini wajib dicoba oleh Anda para pecinta dan pemburu kuliner terbaik.",
            "Rujak soto menjadi menu khas Jawa Timur selanjutnya yang tidak boleh dilewatkan saat Anda berkunjung kesana. Menu yang satu ini bisa ditemukan di Banyuwangi dengan soto yang berbeda dari yang biasanya pastinya Anda akan dibuat ketagihan.",
            "Menu khas Jawa Timur selanjutnya ialah Lodho Ayam yang telah sangat populer dengan kelezatannya di seluruh Jawa. Lodho ayam menjadi menu terbaik khasi Tulungagung, Jawa Timur. Bahkan para pengunjung bisa menemukan menu yang satu ini dengan mudah saat menginjakkan kaki ke Tulungagung."
    };

    private static int[] foodImages = {
            R.drawable.soto_lamongan,
            R.drawable.rujak_cingur,
            R.drawable.rawon,
            R.drawable.gado_gado,
            R.drawable.lontong_balap,
            R.drawable.pecel,
            R.drawable.tahu_tek,
            R.drawable.nasi_tumpang,
            R.drawable.rujak_soto,
            R.drawable.lodho_ayam
    };

    static ArrayList<Food> getListData(){
        ArrayList<Food> list = new ArrayList<>();
        for (int position = 0; position < foodNames.length; position++){
            Food food = new Food();
            food.setName(foodNames[position]);
            food.setOrigin(foodOrigins[position]);
            food.setDetail(foodDetails[position]);
            food.setPhoto(foodImages[position]);
            list.add(food);
        }
        return list;
    }
}
