package com.magnaperitia.sicog.devices.weighing.domain.model;

//import javax.persistence.*;
import java.io.Serializable;

//@Entity
//@Table(name = "dev_permissions")
public class Permission implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -9186242108491569408L;

//	@Id
//  @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
//  @Column(name = "name")
    private String name;

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
	
}
