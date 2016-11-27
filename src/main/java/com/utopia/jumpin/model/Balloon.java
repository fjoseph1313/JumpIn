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
public class Balloon implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Setter @Getter 
	private Long id;
	
	@Setter @Getter 
	private String balloonName;
	
	@Setter @Getter 
	private String balloonStatus;
	
	@Setter @Getter 
	private Date balloonCreatedDate;
	
	@Setter @Getter
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name="balloon_jumper", joinColumns = {@JoinColumn(name = "balloon_id")}, inverseJoinColumns = {@JoinColumn(name="jumper_id")})
	private Set<Jumper> jumpers;
	
	@Setter @Getter
	@OneToMany(mappedBy = "balloon", targetEntity = Mix.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Mix> mix;

	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBalloonName() {
		return balloonName;
	}

	public void setBalloonName(String balloonName) {
		this.balloonName = balloonName;
	}

	public String getBalloonStatus() {
		return balloonStatus;
	}

	public void setBalloonStatus(String balloonStatus) {
		this.balloonStatus = balloonStatus;
	}

	public Date getBalloonCreatedDate() {
		return balloonCreatedDate;
	}

	public void setBalloonCreatedDate(Date balloonCreatedDate) {
		this.balloonCreatedDate = balloonCreatedDate;
	}

	public Set<Mix> getMix() {
		return mix;
	}

	public void setMix(Set<Mix> mix) {
		this.mix = mix;
	}

	public Set<Jumper> getJumpers(){
		return jumpers;
	}
	
	public void setJumpers(Set<Jumper> jumpers){
		this.jumpers = jumpers;
	}
}
