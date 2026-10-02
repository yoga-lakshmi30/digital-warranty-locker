package com.digitalwarranty.digital_warranty_locker;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WarrantyRepository extends JpaRepository<Warranty, Long> {

}