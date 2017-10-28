package com.taotao.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.taotao.admin.pojo.ItemCat;
import com.taotao.admin.service.ItemCatService;

@RestController
@RequestMapping("/itemcat")
public class ItemCatController {

	@Autowired
	private ItemCatService itemCatService;
	
	@GetMapping("/{page}")
	public List<ItemCat> findAll(@PathVariable("page")Integer page,
			@RequestParam(value="rows",defaultValue="10")Integer rows){
		
		
		return itemCatService.findAll(page,rows);
	}
	
	
}
