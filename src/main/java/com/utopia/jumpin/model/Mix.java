package com.utopia.jumpin.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Mix implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Setter @Getter 
	private Long id;
	
	@Setter @Getter 
	private String mixName;
	
	@Setter @Getter 
	private Date mixCreatedDate;
	
	@Setter @Getter 
	private String mixStatus;
	
	@Setter @Getter
	@ManyToOne
	@JoinColumn(name = "balloon_id")
	private Balloon balloon;
	
	@Setter @Getter
	@OneToMany(mappedBy = "mix", targetEntity = Arrow.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Arrow> arrows;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMixName() {
		return mixName;
	}

	public void setMixName(String mixName) {
		this.mixName = mixName;
	}

	public Date getMixCreatedDate() {
		return mixCreatedDate;
	}

	public void setMixCreatedDate(Date mixCreatedDate) {
		this.mixCreatedDate = mixCreatedDate;
	}

	public String getMixStatus() {
		return mixStatus;
	}

	public void setMixStatus(String mixStatus) {
		this.mixStatus = mixStatus;
	}

	public Balloon getBalloon() {
		return balloon;
	}

	public void setBalloon(Balloon balloon) {
		this.balloon = balloon;
	}

	public List<Arrow> getArrows() {
		return arrows;
	}

	public void setArrows(List<Arrow> arrows) {
		this.arrows = arrows;
	}
	
	
}
