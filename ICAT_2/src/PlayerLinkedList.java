public class PlayerLinkedList extends ShellLinkedList {

    public PlayerLinkedList() {
        super();
    }
    
    public void insert(Player p) {
        super.head.setPlayer(p);         
    }
    
    public Player delete(int searchId) throws DataStructureException {
        return super.head.getPlayer();
    }
    
    public Player peek(int searchId) throws DataStructureException {
        while(super.head.getPlayer() != null) {
            
            
        } 
        
        return super.head.getPlayer();
    }
}

