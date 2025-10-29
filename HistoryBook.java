package Vibe;

abstract class HistoryBook extends Book{
    class BiographyHisstoryBook extends HistoryBook {
        private String subjectPerson;
        private String historicalPeriod;
        private boolean primarySourceExcerpts;

        @Override
        public String toString() {
            return "BiographyHisstoryBook{" +
                    "subjectPerson='" + subjectPerson + '\'' +
                    '}';
        }
    }
}

