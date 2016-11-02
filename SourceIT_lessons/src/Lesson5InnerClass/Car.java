package Lesson5InnerClass;

/**
 * Created by lobseer on 31.10.2016.
 */
public class Car {
    private String marka;
    private String nomerKuzove;
    private String nomerDvigatelya;
    private String svetVSalone;
    private String svetVBagagnike;
    private String rul;
    private String cvet;
    private String objemDvigatelya;
    private String kolichestvoCilindrov;
    private String svechi;
    private String raspologenieCilindrov;
    private String obivka;
    private String klimatKontrol;
    private String acustika;

    public Dvigatel getDvigatel() {
        return this.new Dvigatel();
    }

    public Salon getSalon() {
        return this.new Salon();
    }


    public Kuzov getKuzov() {
        return this.new Kuzov();
    }


    class Kuzov {
        public String getNomerKuzove() {
            return nomerKuzove;
        }

        public String getCvet() {
            return cvet;
        }
    }

    class Salon {
        public String getSvetVSalone() {
            return svetVSalone;
        }

        public String getSvetVBagagnike() {
            return svetVBagagnike;
        }

        public String getRul() {
            return rul;
        }

        public String getObivka() {
            return obivka;
        }

        public String getKlimatKontrol() {
            return klimatKontrol;
        }

        public String getAcustika() {
            return acustika;
        }

    }


    class Dvigatel {
        public String getNomerDvigatelya() {
            return nomerDvigatelya;
        }

        public String getObjemDvigatelya() {
            return objemDvigatelya;
        }

        public String getKolichestvoCilindrov() {
            return kolichestvoCilindrov;
        }

        public String getSvechi() {
            return svechi;
        }

        public String getRaspologenieCilindrov() {
            return raspologenieCilindrov;
        }
    }
}
