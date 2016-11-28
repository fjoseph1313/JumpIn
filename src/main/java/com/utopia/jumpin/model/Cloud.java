package com.utopia.jumpin.model;

import java.io.Serializable;
import java.util.Date;
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
public class Cloud implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Setter @Getter 
	private Long id;
	
	@Setter @Getter 
	private String cloudName;
	
	@Setter @Getter 
	private String cloudStatus;
	
	@Setter @Getter 
	private Date cloudCreatedDate;
	
	@Setter @Getter
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name="cloud_jumper", joinColumns = {@JoinColumn(name = "cloud_id")}, inverseJoinColumns = {@JoinColumn(name="jumper_id")})
	private Set<Jumper> jumpers;
	
	@Setter @Getter
	@OneToMany(mappedBy = "cloud", targetEntity = Balloon.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Balloon> balloons;

	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCloudName() {
		return cloudName;
	}

	public void setCloudName(String cloudName) {
		this.cloudName = cloudName;
	}

	public String getCloudStatus() {
		return cloudStatus;
	}

	public void setCloudStatus(String cloudStatus) {
		this.cloudStatus = cloudStatus;
	}

	public Date getCloudCreatedDate() {
		return cloudCreatedDate;
	}

	public void setCloudCreatedDate(Date cloudCreatedDate) {
		this.cloudCreatedDate = cloudCreatedDate;
	}

	public Set<Balloon> getBalloons() {
		return balloons;
	}

	public void setBalloons(Set<Balloon> balloons) {
		this.balloons = balloons;
	}

	public Set<Jumper> getJumpers(){
		return jumpers;
	}
	
	public void setJumpers(Set<Jumper> jumpers){
		this.jumpers = jumpers;
	}
}
