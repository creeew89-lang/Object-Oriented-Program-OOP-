package Vibe;

public class Prefume {
    private String brand;
    private int volumeM1;
}

abstract class ItilianPerfume extends Prefume {

    class CitrusBasedItalianPerfume extends ItilianPerfume {
        private String citrusVariety;
        private int longevityHours;
        private String sillageIntensity;

        @Override
        public String toString() {
            return "CitrusBasedItalianPerfume{" +
                    "citrusVariety='" + citrusVariety + '\'' +
                    '}';
        }
    }

    class LeatherBasedItalianPerfume extends ItilianPerfume {
        private String leatherTypeAccent;
        private String baseNotes;
        private String occasionSuitability;

        @Override
        public String toString() {
            return "LeatherBasedItalianPerfume{" +
                    "leatherTypeAccent='" + leatherTypeAccent + '\'' +
                    '}';
        }
    }

    class AquaticItalianPerfume extends ItilianPerfume {
        private String marineAccordType;
        private String freshnessLevel;
        private String inspirationRegion;

        @Override
        public String toString() {
            return "AquaticItalianPerfume{" +
                    "inspirationRegion='" + inspirationRegion + '\'' +
                    '}';
        }
    }
}