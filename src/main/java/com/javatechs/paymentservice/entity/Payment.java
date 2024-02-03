package com.javatechs.paymentservice.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PAYMENT_TB")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class Payment  {
@Id
@GeneratedValue
  private int paymentId;
  private String paymentStatus;
  private String transcationId;
  private int ordetId;
  private double amount;

}
