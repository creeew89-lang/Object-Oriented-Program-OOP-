package Vibe;

abstract class FrenchPerfume extends Prefume {
    class FloralfrenchPerfume extends FrenchPerfume {
        private String domainFlower;
        private String olfactoryFamily;

        @Override
        public String toString() {
            return "FloralfrenchPerfume{" +
                    "domainFlower='" + domainFlower + '\'' +
                    '}';
        }
    }

    class chypreFrenchPerfume extends FrenchPerfume {
        private double oakmossConcentration;
        private String topNotes;
        private double patchouliIntensity;

        @Override
        public String toString() {
            return "chypreFrenchPerfume{" +
                    "oakmossConcentration=" + oakmossConcentration +
                    '}';
        }
    }

    class GourmandFrenchPerfume extends FrenchPerfume {
        private String edibleNotes;
        private double projectionDistance;

        @Override
        public String toString() {
            return "GourmandFrenchPerfume{" +
                    "edibleNotes='" + edibleNotes + '\'' +
                    '}';
        }
    }

    abstract class ArabicPerfume extends Prefume {
    }

    class OudBasedArabicPerfume extends ArabicPerfume {
        private String ouOrigin;
        private boolean incenseNotes;
        private double oilConcentration;

        @Override
        public String toString() {
            return "OudBasedArabicPerfume{" +
                    "ouOrigin='" + ouOrigin + '\'' +
                    '}';
        }
    }

    class MuskBasedPerfume extends ArabicPerfume {
        private String muskType;
        private String animalicNotes;
        private String layeringRecommendation;

        @Override
        public String toString() {
            return "MuskBasedPerfume{" +
                    "muskType='" + muskType + '\'' +
                    '}';
        }
    }

    class SpicyArabicPerfume extends ArabicPerfume {
        private String dominantSpice;
        private String warmthLevel;
        private boolean attarPurity;

        @Override
        public String toString() {
            return "SpicyArabicPerfume{" +
                    "dominantSpice='" + dominantSpice + '\'' +
                    '}';
        }
    }
}
