package Vibe;

abstract class CookBook extends Book{
}
class bakingCookBook extends CookBook{
    private String bakingTechnique;
    private String difficultyLevel;
    private String yeastType;

    @Override
    public String toString() {
        return "bakingCookBook{" +
                "difficultyLevel='" + difficultyLevel + '\'' +
                '}';
    }
}

