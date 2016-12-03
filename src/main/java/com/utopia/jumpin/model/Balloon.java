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
public class Balloon implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Setter @Getter 
	private Long id;
	
	@Setter @Getter 
	private String balloonName;
	
	@Setter @Getter 
	private Date balloonCreatedDate;
	
	@Setter @Getter 
	private String balloonStatus;
	
	@Setter @Getter
	@ManyToOne
	@JoinColumn(name = "cloud_id")
	private Cloud cloud;
	
	@Setter @Getter
	@OneToMany(mappedBy = "balloon", targetEntity = Arrow.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Arrow> arrows;

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

	public Date getBalloonCreatedDate() {
		return balloonCreatedDate;
	}

	public void setBalloonCreatedDate(Date balloonCreatedDate) {
		this.balloonCreatedDate = balloonCreatedDate;
	}

	public String getBalloonStatus() {
		return balloonStatus;
	}

	public void setBalloonStatus(String balloonStatus) {
		this.balloonStatus = balloonStatus;
	}

	public Cloud getCloud() {
		return cloud;
	}

	public void setCloud(Cloud cloud) {
		this.cloud = cloud;
	}

	public List<Arrow> getArrows() {
		return arrows;
	}

	public void setArrows(List<Arrow> arrows) {
		this.arrows = arrows;
	}
	
	
}
