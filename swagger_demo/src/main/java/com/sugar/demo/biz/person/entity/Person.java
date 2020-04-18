package com.sugar.demo.biz.person.entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.CreditCardNumber;

import lombok.Data;

@XmlRootElement(name="person")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Person {
   //属性
   private long id;
   
   private String firstName;
   
   @NotNull
   @NotBlank
   @Size(max=10)
   private String lastName;
   
   //@Pattern(regexp = ".+@.+\\..+",message = "Please provide a valid email address")
   private String email;
   
   //@Email
   private String email2;
   
   @Min(18)
   @Max(30)
   private int age;
   
   @CreditCardNumber
   private String creditCardNumber;
}
