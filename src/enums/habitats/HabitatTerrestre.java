package enums.habitats;

public enum HabitatTerrestre {
    FLORESTA_TROPICAL,
    SAVANAS,
    DESERTO,
    TAIGA,
    TUNDRA_ARTICA,
    PRADARIAS,
    MONTANHAS,
    PANTANO,
    FLORESTA_TEMPERADA,
    CAMPO_CULTIVO,
    FLORESTAS_DE_CONIFERAS;

    public String getHabitat() {
        return this.toString();
    }
}
