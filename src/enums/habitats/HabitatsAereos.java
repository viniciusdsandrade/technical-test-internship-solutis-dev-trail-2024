package enums.habitats;

public enum HabitatsAereos {
    URBANO,
    CEU_ABERTO,
    FLORESTAS,
    MONTANHAS,
    COSTAS,
    PANTANOS,
    CAVERNAS;

    public String getHabitat() {
        return this.toString();
    }
}