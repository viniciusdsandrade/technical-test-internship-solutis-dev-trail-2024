package enums.tipoAnimal;

public enum AnimalAquatico {
    PEIXE_PALHACO,
    TUBARAO,
    BALEIA,
    GOLFINHO,
    POLVO,
    ESTRELA_DO_MAR,
    CARANGUEJO,
    LULA,
    PEIXE_BOI,
    MEDUSA;

    public String getTipoAnimal() {
        return this.toString();
    }
}
