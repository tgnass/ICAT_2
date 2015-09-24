public class PlayerNode {
    private Player player;
    private PlayerNode next;

    public PlayerNode(Player player, PlayerNode next) {
        this.player = player;
        this.next = next;
    }

    public Player getPlayer() {
        return player;
    }

    public PlayerNode getNext() {
        return next;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setNext(PlayerNode next) {
        this.next = next;
    }
}
