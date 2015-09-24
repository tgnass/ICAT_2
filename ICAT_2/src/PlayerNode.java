/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Malik
 */
public class PlayerNode 
{
    private Player player;
    private PlayerNode next;
    

    public PlayerNode(Player player, PlayerNode next) 
    {
        this.player = player;
        this.next = next;
    }

    public Player getPlayer() 
    {
        return player;
    }

    public PlayerNode getNext() 
    {
        return next;
    }

    public void setPlayer(Player player) 
    {
        this.player = player;
    }

    public void setNext(PlayerNode next) 
    {
        this.next = next;
    }
    
    
    
}
