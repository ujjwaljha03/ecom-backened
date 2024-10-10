package com.ujjwal.ecom_proj.Model;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
//import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	private String description;
	private String brand;
	private BigDecimal price;
	private String category;
	
//	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
	private Date releaseDate;
	private boolean productAvailable;
	private int stockQuantity;
	
	private String imageName;
	private String imageType;
	@Lob
	@Column(name = "image_data", columnDefinition = "LONGBLOB")
	private byte[] imageData;

	
	
}
