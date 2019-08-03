package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.ItemModel;

public interface ItemRepo extends  JpaRepository<ItemModel, String>{

}
