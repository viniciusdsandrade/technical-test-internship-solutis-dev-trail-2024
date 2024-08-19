package enums.tipoAnimal;

public enum AnimalTerreste {
    CACHORRO,
    GATO,
    ELEFANTE,
    LEAO,
    TIGRE,
    GORILA,
    RINOCERONTE,
    CAVALO,
    CANGURU;

    public String getTipoAnimal() {
        return this.toString();
    }
}
