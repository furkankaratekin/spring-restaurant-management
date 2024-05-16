package com.fm.restaurant.management.service.concretes;

import com.fm.restaurant.management.dto.MenuDto;
import com.fm.restaurant.management.model.Menu;
import com.fm.restaurant.management.repository.MenuRepo;
import com.fm.restaurant.management.service.abstracts.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MenuManager implements MenuService {

    private final MenuRepo menuRepo;

    @Autowired
    public MenuManager(MenuRepo menuRepo) {
        this.menuRepo = menuRepo;
    }

    //Bütün Menüleri çeken fonksiyon
    @Override
    public List<Menu> getAllMenu() {
        return menuRepo.findAll() ;

    }


    @Override
    public Menu getOneMenu(Long menuId) {
        return menuRepo.findById(menuId).orElse(null);
    }

    @Override
    public Menu createOneMenu(Menu newMenu) {
        return menuRepo.save(newMenu);
    }

    @Override
    public Menu updateOneMenu(Long menuId, Menu newUpdateMenu) {
        Optional<Menu> menu = menuRepo.findById(menuId);
        if(menu.isPresent()){  //isPresent() => obje var olması durumu
            Menu foundMenu = menu.get();
            foundMenu.setName(newUpdateMenu.getName());
            foundMenu.setDescription(newUpdateMenu.getDescription());
            foundMenu.setPrice(newUpdateMenu.getPrice());
            menuRepo.save(foundMenu);
            return foundMenu;
        }else{
            return null;
        }
    }

    @Override
    public void deleteAllMenu() {
        menuRepo.deleteAll();

    }

    @Override
    public void deleteOneMenu(Long menuId) {
        menuRepo.deleteById(menuId);
    }



}
