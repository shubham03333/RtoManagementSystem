package com.sunbeam.dtos;

import java.io.IOException;
//import java.util.List;
//import java.util.stream.Collectors;
import java.util.Date;

import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.stereotype.Component;
//import org.springframework.web.multipart.MultipartException;

import com.sunbeam.entities.User;

//private int id;
//private String name;
//private String email;
//private String password;
//private int aadhar_no;
//private String role;
//@Temporal(TemporalType.DATE)
//private Date dob;
//private String address;
//private String gender;
//private String blood_group;
//private int mobile_no ;
//@Lob
//private byte[] photo;



@Component
public class DtoEntityConverter {
	public UserDTO toUserDto(User entity) {
		UserDTO dto = new UserDTO();
		dto.setId(entity.getId());
		dto.setName(entity.getName());
		dto.setEmail(entity.getEmail());
		dto.setPassword(entity.getPassword());
		dto.setAadhar_no(entity.getAadhar_no());
		dto.setAddress(entity.getAddress());
		dto.setBlood_group(entity.getBlood_group());
		dto.setDob(entity.getDob());
		dto.setGender(entity.getGender());
		dto.setMobile_no(entity.getMobile_no());
		dto.setRole(entity.getRole());
		return dto;
	}

	public User toUserEntity(UserDTO dto) {
		User entity = new User();
		entity.setId(dto.getId());
		entity.setName(dto.getName());
		entity.setEmail(dto.getEmail());
		entity.setPassword(dto.getPassword());
		entity.setPassword(dto.getPassword());
		entity.setAadhar_no(dto.getAadhar_no());
		entity.setAddress(dto.getAddress());
		entity.setBlood_group(dto.getBlood_group());
		entity.setDob(dto.getDob());
		entity.setGender(dto.getGender());
		entity.setMobile_no(dto.getMobile_no());
		entity.setRole(dto.getRole());
		return entity;		
	}
//	
//	

//	public BlogAttachment toAttachmentEntity(BlogAttachmentFormDTO dto) {
//		if(dto == null)
//			return null;
//		BlogAttachment entity = new BlogAttachment();
//		entity.setId(dto.getId());
//		entity.setBlog(new Blog(dto.getBlogId()));
//		entity.setCreatedTimestamp(dto.getCreatedTimestamp());
//		try {
//			entity.setData(dto.getDataFile().getBytes());
//		} catch (Exception e) {
//			throw new MultipartException("Can't convert MultipartFile to bytes : " + dto.getDataFile(), e);
//		}
//		return entity;
//	}
}
