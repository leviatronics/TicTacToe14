/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.booth.adv.tictactoe14;

import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author wyllie7127c
 */
public class ToeTreeNode {
    int value;
    Set<ToeTreeNode> pointers;
    
    public ToeTreeNode(int val){
        value = val;
        pointers = new HashSet<ToeTreeNode>();
    }
    
    public void addPointer(ToeTreeNode next){
        pointers.add(next);
    }
}
