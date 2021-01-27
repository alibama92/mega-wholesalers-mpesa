package com.otblabs.mpesa.stkpush.db;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StkDataRepo extends JpaRepository<StkResponseData, Integer> {
}
