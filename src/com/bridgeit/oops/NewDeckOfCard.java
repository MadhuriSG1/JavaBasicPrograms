package com.bridgeit.oops;

import com.bridgeit.utility.Queue;
import com.bridgeit.utility.Utility1;

public class NewDeckOfCard {

	public static void main(String[] args) {
	String playercard[][]=Utility1.cardsDistribution();
	Queue<Queue<String>> sortedcard=Utility1.sortCards(playercard);
	
	String playername[]={"Player 1","Player 2","Player 3","Player 4"};
	int index=0;
	while(!sortedcard.isEmpty())
	{
		Queue<String> temp=sortedcard.dequeue();
		System.out.println(playername[index]+"===");
		while(!temp.isEmpty()){
			System.out.println(temp.dequeue()+" ");
		}
		System.out.println();
		index++;
	}
	

	}

}
