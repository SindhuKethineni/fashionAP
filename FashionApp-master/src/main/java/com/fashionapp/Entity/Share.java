package com.fashionapp.Entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name = "Share")
public class Share implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(unique = true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private long userId;
	private long videoId;
	private long sharedId;
	private String email;
	private String filename;
	@Column(name = "shared_time", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	public Date shared_time;
	
	
	@PrePersist
	protected void onCreate() {
		shared_time = new Date();
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}


	public long getVideoId() {
		return videoId;
	}

	public void setVideoId(long fileId) {
		this.videoId = fileId;
	}

	public void setShared_time(Date shared_time) {
		this.shared_time = shared_time;
	}

	public long getSharedId() {
		return sharedId;
	}

	public void setSharedId(long sharedId) {
		this.sharedId = sharedId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public MultipartFile setFile(MultipartFile file) {
		return file;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}
	
}
