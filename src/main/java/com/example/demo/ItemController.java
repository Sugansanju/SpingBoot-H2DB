package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ItemDto;
import com.example.demo.model.ItemModel;
import com.example.demo.repo.ItemRepo;

@RestController
@EnableAutoConfiguration
public class ItemController {
@Autowired private ItemRepo itemRe;
	@PostMapping("/add")
	public ResponseEntity<?> create(@RequestBody final ItemDto dto) {
		ItemModel item = new ItemModel();
		item.setDesc(dto.getDesc());
		item.setPrice(dto.getPrice());
		item.setQuantity(dto.getQuantity());
		itemRe.save(item);	
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(item);
	}
}
