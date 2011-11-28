/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author nanohp
 */
public class MenuData {

    private String nombreMenu;
    private Map<Character, MenuItemData> menuItems;

    public MenuData(String nombreMenu) {
        this.nombreMenu = nombreMenu;
        menuItems = new TreeMap<Character, MenuItemData>();
    }

    public void add(MenuItemData menuItem) {
        menuItems.put(new Character(menuItem.getOpcion()), menuItem);
    }

    public String getNombreMenu() {
        return nombreMenu;
    }

    public Map<Character, MenuItemData> getMenuItems() {
        return menuItems;
    }
}
