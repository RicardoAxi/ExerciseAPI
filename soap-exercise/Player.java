/**
 * Clase que representa a un jugador en el juego de Dungeons and Dragons.
 */
public class Player {
    private Integer id;
    private String name;
    private String race;
    private String playerClass;
    private int level;
    private int hitPoints;
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    /**
     * Constructor por defecto de la clase Player.
     */
    public Player() { }

    /**
     * Constructor de la clase Player.
     *
     * @param name         Nombre del jugador.
     * @param race         Raza del jugador.
     * @param playerClass  Clase del jugador.
     * @param level        Nivel del jugador.
     * @param hitPoints    Puntos de vida del jugador.
     * @param strength     Puntuación de fuerza del jugador.
     * @param dexterity    Puntuación de destreza del jugador.
     * @param constitution Puntuación de constitución del jugador.
     * @param intelligence Puntuación de inteligencia del jugador.
     * @param wisdom       Puntuación de sabiduría del jugador.
     * @param charisma     Puntuación de carisma del jugador.
     */
    public Player(String name, String race, String playerClass, int level, int hitPoints, int strength,
                  int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        this.name = name;
        this.race = race;
        this.playerClass = playerClass;
        this.level = level;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }

    /**
     * Constructor de la clase Player.
     *
     * @param id           Identificador del jugador
     * @param name         Nombre del jugador.
     * @param race         Raza del jugador.
     * @param playerClass  Clase del jugador.
     * @param level        Nivel del jugador.
     * @param hitPoints    Puntos de vida del jugador.
     * @param strength     Puntuación de fuerza del jugador.
     * @param dexterity    Puntuación de destreza del jugador.
     * @param constitution Puntuación de constitución del jugador.
     * @param intelligence Puntuación de inteligencia del jugador.
     * @param wisdom       Puntuación de sabiduría del jugador.
     * @param charisma     Puntuación de carisma del jugador.
     */
    public Player(Integer id, String name, String race, String playerClass, int level, int hitPoints, int strength,
                  int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        this.id = id;
        this.name = name;
        this.race = race;
        this.playerClass = playerClass;
        this.level = level;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getPlayerClass() {
        return playerClass;
    }

    public void setPlayerClass(String playerClass) {
        this.playerClass = playerClass;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    /**
     * Obtiene la puntuación de carisma del jugador.
     *
     * @return Puntuación de carisma del jugador.
     */
    public int getCharisma() {
        return charisma;
    }

    /**
     * Establece la puntuación de carisma del jugador.
     *
     * @param charisma Puntuación de carisma del jugador.
     */
    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }
}
