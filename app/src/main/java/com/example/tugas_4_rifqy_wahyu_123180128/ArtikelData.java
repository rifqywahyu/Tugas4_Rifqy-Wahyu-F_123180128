package com.example.tugas_4_rifqy_wahyu_123180128;

import java.util.ArrayList;

public class ArtikelData {
    private  static String[] title = new String[]{
            "Berbisnis dengan Kuda",
            "Menjaga Kesehatan dengan Lemon",
            "Berolahraga Semalaman",
            "Opera Gang Saleman",
            "Pemimpin Kota yang Gagal"
    };

    private  static String[] detail = new String[]{
            "Berbisnis dengan kuda tidaklah mudah. Karena kuda perlu tenaga untuk berkuda maka disarankan untuk menjual makanan lunak seperti rerumputan maupun dedaunan. Agar kuda lebih ingin membeli makanan kita, maka diperlukan rerumputan dengan kualitas tinggi.",
            "Lemon adalah benda yang dimiliki semua orang. Seperti kata mereka, jika kehidupan memberimu lemon, maka jagalah kesehatan kita dengan lemon tersebut. Lemon mempunyai beberapa efek unik bagi kesehatan, yaitu dapat membuat mata merah, pembengkakan jika dilempar ke kepala orang lain, dan juga efek lembab jika diperas ke rambut orang lain.",
            "Kenapa orang lain selalu olahraga jika matahari sedang ada? Saya benci matahari dan disini saya akan memberikan alasan kenapa olahraga saat malam lebih menguntungkan seratus persen daripada olahraga saat pagi. Pertama, saat malam tidak ada macet jadi anda akan lancar berolahraga lari maupun bersepeda. Kedua, saat malam saya merasa lebih kuat dan energetik menjadikan malam waktu yang ideal untuk berolah raga. Terakhir, saya Dankula si gigi tajam, sekian dan terima kasih.",
            "Gang Saleman, terkenal akan perampokan dan penarkobaannya. Jauh didalam gang ini, ternyata memiliki sebuah opera yang dapat menarik perhatian anda. Walaupun aktornya lebih terlihat seperti perampok dan tukang mabuk, tetapi hiburan yang akan didapat sudah dapat dipastikan.",
            "Kenapa saya harus kerja? Saya tidak mau kerja untuk hidup. Apapun yang punya negara artinya itu punya kami, dan lihat para pemimpin negara malah lebih sukses daripada rakyatnya sendiri. Ini seratus persen bukan karena saya malas atau gagal mencari pekerjaan tapi sudah jelas ini adalah pertanda bahwa pemimpin kita sudah gagal!"
    };

    private static int[] thumbnail = new
            int[]{R.drawable.img_business,R.drawable.img_health,R.drawable.img_lifestyle,R.drawable.img_entertainment,R.drawable.img_opinion};

    public static ArrayList<ArtikelModel> getListData() {
        ArtikelModel artikelModel = null;
        ArrayList<ArtikelModel> list = new ArrayList<>();
        for (int i = 0; i < title.length; i++) {
            artikelModel = new ArtikelModel();
            artikelModel.setJudulArtikel(title[i]);
            artikelModel.setIsiArtikel(detail[i]);
            artikelModel.setGambarArtikel(thumbnail[i]);
            list.add(artikelModel);
        }
        return list;
    }
}
