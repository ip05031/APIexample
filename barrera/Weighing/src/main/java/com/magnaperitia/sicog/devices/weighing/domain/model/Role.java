package com.magnaperitia.sicog.devices.weighing.domain.model;

import javax.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "DISPOSITIVOS_ROLES")
public class Role implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 3444309232855912419L;

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "name")
    private String name;

//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(name = "dev_permissions_dev_roles", joinColumns = {
//            @JoinColumn(name = "role_id", referencedColumnName = "id")}, inverseJoinColumns = {
//            @JoinColumn(name = "permission_id", referencedColumnName = "id")})
//    private List<Permission> permissions;

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

//	public List<Permission> getPermissions() {
//		return permissions;
//	}
//
//	public void setPermissions(List<Permission> permissions) {
//		this.permissions = permissions;
//	}
    
}