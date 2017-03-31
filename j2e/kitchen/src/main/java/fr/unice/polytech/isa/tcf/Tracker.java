package fr.unice.polytech.isa.tcf;

import fr.unice.polytech.isa.tcf.entities.OrderStatus;
import fr.unice.polytech.isa.tcf.exceptions.UnknownOrderId;

import javax.ejb.Local;

@Local
public interface Tracker {

	OrderStatus status(String orderId) throws UnknownOrderId;
	//Lol c'est un commentaire pour test ♥
	//WOHOH on fait un deuxième test !!!!!

}
