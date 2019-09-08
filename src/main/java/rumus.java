class rumus {

    double VolumeKubus(double rusuk) { //rumus untuk volume kubus
        return rusuk * rusuk * rusuk;
    }

    double LuasPermKubus(double rusuk) { //rumus untuk luas permukaan kubus
        return rusuk * rusuk * 6;
    }

    double VolumeBola(double jari) { //rumus untuk volume bola
        return 4/3 * 3.14 * jari * jari * jari;
    }

    double LuasPermBola(double jari) { //rumus untuk luas permukaan bola
        return 4 * 3.14 * jari * jari;
    }
    double VolumeTabung(double jari1, double tinggi1){ //rumus untuk volume tabung
        return 3.14 * jari1 * jari1 * tinggi1;
    }
    double LuasPermTabung(double jari1, double tinggi1){ //rumus untuk luas permukaan tabung
        return 2 * 3.14 * jari1 * jari1 + 3.14 * 2 * jari1 * tinggi1;
    }
}