package com.fm.restaurant.management.controller;

import com.fm.restaurant.management.dto.MenuDto;
import com.fm.restaurant.management.model.Menu;
import com.fm.restaurant.management.service.abstracts.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//MenuController postman ile başarıyla test edilmiştir.
@RestController
@RequestMapping("/api/v1/menu")
public class MenuController {

    private final MenuService menuService;

    @Autowired
    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }
    //Tüm menüleri getir
    @GetMapping
    public List<Menu> getAllMenu() {
        return menuService.getAllMenu();
    }

    //Id'ye göre menü getir
    @GetMapping("/{menuId}")
    public Menu getOneMenu(@PathVariable Long menuId){
        return menuService.getOneMenu(menuId);
    }

    //Menü Ekle
    @PostMapping()
    public Menu createOneMenu(@RequestBody Menu newMenu){
        return menuService.createOneMenu(newMenu);
    }
    //Id'ye göre menüyü güncelle
    @PutMapping("/update/{menuId}")
    public Menu updateOneMenu(@PathVariable Long menuId,@RequestBody Menu newUpdateMenu){
        return menuService.updateOneMenu(menuId,newUpdateMenu);
    }
    //Tüm menüleri sil
    @DeleteMapping
    public ResponseEntity<?> deleteAllMenu(){
        menuService.deleteAllMenu();
        return ResponseEntity.ok("Tüm menüler başarıyla silinmiştir");
    }
    //Id'ye göre menüyü sil
    @DeleteMapping("delete/{menuId}")
    public ResponseEntity<?> deleteOneMenu(@PathVariable Long menuId){
        menuService.deleteOneMenu(menuId);
        return ResponseEntity.ok(menuId + " numaralı id başarı ile silinmiştir");
    }

}
