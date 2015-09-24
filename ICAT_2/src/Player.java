public class Player {
    private int id;
    private String name;
    private String game;

    public Player(int id, String name, String game) {
        this.id = id;
        this.name = name;
        this.game = game;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGame() {
        return game;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGame(String game) {
        this.game = game;
    }
    
    
}
