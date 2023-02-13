package com.example.myapplication;

public class QuranCla
{
    int number;
    String ayat;
    String noInSurah;
    String juz;
    String manzil;
    String page;
    String hizbQuater;
    String sajda;
    String surahNo;
    String surahName;
    String EnglishName;
    String EnglishNameTranslation;
    String revealationType;
    String translation;
    String tafseer;

    public QuranCla()
    {
        
    }

    public QuranCla(int number, String ayat, String noInSurah, String juz, String manzil, String page, String hizbQuater, String sajda, String surahNo, String surahName, String englishName, String englishNameTranslation, String revealationType, String translation, String tafseer) {
        this.number = number;
        this.ayat = ayat;
        this.noInSurah = noInSurah;
        this.juz = juz;
        this.manzil = manzil;
        this.page = page;
        this.hizbQuater = hizbQuater;
        this.sajda = sajda;
        this.surahNo = surahNo;
        this.surahName = surahName;
        EnglishName = englishName;
        EnglishNameTranslation = englishNameTranslation;
        this.revealationType = revealationType;
        this.translation = translation;
        this.tafseer = tafseer;
    }


    public int getNumber() {
        return number;
    }

    public String getAyat() {
        return ayat;
    }

    public String getNoInSurah() {
        return noInSurah;
    }

    public String getJuz() {
        return juz;
    }

    public String getManzil() {
        return manzil;
    }

    public String getPage() {
        return page;
    }

    public String getHizbQuater() {
        return hizbQuater;
    }

    public String getSajda() {
        return sajda;
    }

    public String getSurahNo() {
        return surahNo;
    }

    public String getSurahName() {
        return surahName;
    }

    public String getEnglishName() {
        return EnglishName;
    }

    public String getEnglishNameTranslation() {
        return EnglishNameTranslation;
    }

    public String getRevealationType() {
        return revealationType;
    }

    public String getTranslation() {
        return translation;
    }

    public String getTafseer() {
        return tafseer;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }

    public void setNoInSurah(String noInSurah) {
        this.noInSurah = noInSurah;
    }

    public void setJuz(String juz) {
        this.juz = juz;
    }

    public void setManzil(String manzil) {
        this.manzil = manzil;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public void setHizbQuater(String hizbQuater) {
        this.hizbQuater = hizbQuater;
    }

    public void setSajda(String sajda) {
        this.sajda = sajda;
    }

    public void setSurahNo(String surahNo) {
        this.surahNo = surahNo;
    }

    public void setSurahName(String surahName) {
        this.surahName = surahName;
    }

    public void setEnglishName(String englishName) {
        EnglishName = englishName;
    }

    public void setEnglishNameTranslation(String englishNameTranslation) {
        EnglishNameTranslation = englishNameTranslation;
    }

    public void setRevealationType(String revealationType) {
        this.revealationType = revealationType;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public void setTafseer(String tafseer) {
        this.tafseer = tafseer;
    }
}
