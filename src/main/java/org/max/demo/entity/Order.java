package org.max.demo.entity;

import java.time.OffsetDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.max.demo.enums.OrderStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="order")
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="customer_id", nullable=false)
	private Customer customer;
	
	@Column(name="order_number")
	private String orderNumber;
	
	@Column(name="total")
	private Double total;
	
	@Enumerated(EnumType.STRING)
	@Column(name="status")
	private OrderStatus status;
	
	@CreationTimestamp
	@Column(name="create_time")
	private OffsetDateTime createTime;
	
	@UpdateTimestamp
	@Column(name="last_modify_time")
	private OffsetDateTime lastModifyTime;
}
