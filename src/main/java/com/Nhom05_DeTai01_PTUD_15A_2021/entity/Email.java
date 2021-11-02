package com.Nhom05_DeTai01_PTUD_15A_2021.entity;

import java.util.regex.Pattern;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.springframework.util.Assert;

@Embeddable
public class Email {
	
	private static final String EMAIL_REGEX = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	private static final Pattern PATTERN = Pattern.compile(EMAIL_REGEX);
	
	@Column(name = "email", columnDefinition = "VARCHAR(50)")
	private String value;
	
	public Email(String emailAddress) {
		Assert.isTrue(isValid(emailAddress), "[*] Dia Chi Email Hop Le");
		this.value =emailAddress;
	}
	
//	Kiem tra email hop le khong
	public static boolean isValid(String email) {
		return email == null ? false : PATTERN.matcher(email).matches();
	}
	
	@Override
	public String toString() {
		return value;
	}
	
	public Email() {
		// TODO Auto-generated constructor stub
	}
}
