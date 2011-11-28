/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import Controlador.TipoEvento;
import Modelo.MenuData;
import Modelo.MenuItemData;

/**
 *
 * @author nanohp
 */
public class Inicializador {

    public static MenuData inicializaMenu() {
        MenuData menu = new MenuData("Principal");
        menu.add(new MenuItemData('S', "Salir.", TipoEvento.SALIR));
        menu.add(new MenuItemData('X', "Logout.", TipoEvento.LOGOUT, false));
        menu.add(new MenuItemData('1', "Consulta Catalogo General.", TipoEvento.CONSULTA_CATALOGO_GENERAL, false));


        return menu;
    }
}
