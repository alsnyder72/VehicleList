//final annotated ListItem POJO
package model;

//All these import statements came in by clicking the red X and using Import option from the javax.persistence package
//If you are asked to create a class, interface, constant, etc, you made a spelling or capitalization error!!
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author AlSnyder - asnyder7
 * CIS175 - SPRING 2022
 * Feb 02, 2022
 */

@Entity
@Table(name = "items")
public class ListItem {
	@Id
	@GeneratedValue
	@Column(name="ID")
	private int id;
	@Column(name="MANUFACTURER")
	private String manufacturer;
	@Column(name="MODEL")
	private String model;
	
	//Constructors
	public ListItem() {
		super();
	}

	public ListItem(String manufacturer, String model) {
		super();
		this.manufacturer = manufacturer;
		this.model = model;
	}

	//Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public String returnItemDetails() {
		return this.manufacturer + ": " + this.model;
	}
	
	
}
