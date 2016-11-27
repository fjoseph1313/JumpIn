package com.utopia.jumpin.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Jumper implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Setter @Getter 
	private Long id;
	
	@Setter @Getter 
	private String jumperName;
	
	@Setter @Getter 
	private String firstName;
	
	@Setter @Getter 
	private String lastName;
	
	@Setter @Getter 
	private Date dateCreated;
	
	@Setter @Getter 
	private Date activeSince;
	
	
	@Setter @Getter 
	private String status;
	
	@Setter @Getter
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "balloon_jumper", joinColumns = {@JoinColumn(name = "jumper_id")}, inverseJoinColumns = {@JoinColumn(name="balloon_id")})
	private Set<Balloon> balloons;
	
	@Setter @Getter
	@OneToMany(mappedBy = "jumper",  targetEntity = Arrow.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Arrow> arrows;
	
	
	public Set<Balloon> getBalloons() {
		return balloons;
	}

	public void setBalloons(Set<Balloon> balloons) {
		this.balloons = balloons;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getJumperName() {
		return jumperName;
	}

	public void setJumperName(String jumperName) {
		this.jumperName = jumperName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getActiveSince() {
		return activeSince;
	}

	public void setActiveSince(Date activeSince) {
		this.activeSince = activeSince;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Arrow> getArrows() {
		return arrows;
	}

	public void setArrows(List<Arrow> arrows) {
		this.arrows = arrows;
	}

	public Jumper(){}

	public Jumper(String jumperName, String status){
		this.jumperName = jumperName;
		this.status = status;
	}
	
}
