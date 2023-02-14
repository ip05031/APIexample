package com.magnaperitia.sicog.devices.weighing.domain.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "DISPOSITIVOS_USUARIOS")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1195510715973565563L;

	public User() {
	}

	public User(User user) {
		this.username = user.getUsername();
		this.password = user.getPassword();
		this.email = user.getEmail();
		this.enabled = user.isEnabled();
		this.accountNonExpired = user.isAccountNonExpired();
		this.credentialsNonExpired = user.isCredentialsNonExpired();
		this.accountNonLocked = user.isAccountNonLocked();
		this.roles = user.getRoles();
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@NotBlank
	@Column(name = "username", unique = true, nullable = false)
	private String username;

	@NotBlank
	@Column(name = "password", nullable = false)
	private String password;

	@Column(name = "email")
	private String email;

	@org.hibernate.annotations.Type(type="org.hibernate.type.YesNoType")
	@Column(name = "enabled")
	private boolean enabled;

	@org.hibernate.annotations.Type(type="org.hibernate.type.YesNoType")
	@Column(name = "account_non_expired")
	private boolean accountNonExpired;

	@org.hibernate.annotations.Type(type="org.hibernate.type.YesNoType")
	@Column(name = "credentials_non_expired")
	private boolean credentialsNonExpired;

	@org.hibernate.annotations.Type(type="org.hibernate.type.YesNoType")
	@Column(name = "account_non_locked")
	private boolean accountNonLocked;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "dispositivos_roles_usarios", joinColumns = {
			@JoinColumn(name = "usuario_id", referencedColumnName = "id") }, inverseJoinColumns = {
			@JoinColumn(name = "rol_id", referencedColumnName = "id") })
	private List<Role> roles;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public boolean isAccountNonExpired() {
		return accountNonExpired;
	}

	public void setAccountNonExpired(boolean accountNonExpired) {
		this.accountNonExpired = accountNonExpired;
	}

	public boolean isCredentialsNonExpired() {
		return credentialsNonExpired;
	}

	public void setCredentialsNonExpired(boolean credentialsNonExpired) {
		this.credentialsNonExpired = credentialsNonExpired;
	}

	public boolean isAccountNonLocked() {
		return accountNonLocked;
	}

	public void setAccountNonLocked(boolean accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

}