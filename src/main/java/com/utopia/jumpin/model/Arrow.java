package com.utopia.jumpin.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Arrow implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue 
	@Setter @Getter 
	private Long id;
	
	@Setter @Getter 
	private String arrow;
	 
	@Setter @Getter 
	private Date arrowDate;
	
	@Setter @Getter
	@ManyToOne
	@JoinColumn(name = "jumper_id")
	private Jumper jumper;
	
	@Setter @Getter
	@ManyToOne
	@JoinColumn(name = "mix_id")
	private Mix mix;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getArrow() {
		return arrow;
	}

	public void setArrow(String arrow) {
		this.arrow = arrow;
	}

	public Date getArrowDate() {
		return arrowDate;
	}

	public void setArrowDate(Date arrowDate) {
		this.arrowDate = arrowDate;
	}

	public Jumper getJumper() {
		return jumper;
	}

	public void setJumper(Jumper jumper) {
		this.jumper = jumper;
	}

	public Mix getMix() {
		return mix;
	}

	public void setMix(Mix mix) {
		this.mix = mix;
	}
	
	
}
