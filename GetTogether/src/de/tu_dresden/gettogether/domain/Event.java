package de.tu_dresden.gettogether.domain;

import java.util.Date;

/**
 * @author Markus Frank
 * 
 * Class that represents the actual event or status message
 *
 */
public class Event {

	private int ID;
	private Topic topic;
	private String description;
	private Place place;
	private Date date;
	private Date creationDate;
	private int participant;
	private Contact owner;
	
	
	
}
