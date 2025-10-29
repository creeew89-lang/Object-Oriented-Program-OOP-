package Vibe;

abstract class DesignBook {
    class interiorDesignBook extends DesignBook {
        private String designStyle;
        private String romeFocus;
        private String materialPalette;

        @Override
        public String toString() {
            return "interiorDesignBook{" +
                    "romeFocus='" + romeFocus + '\'' +
                    '}';
        }
    }
}
