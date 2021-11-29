/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import com.formdev.flatlaf.*;
import com.formdev.flatlaf.intellijthemes.*;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.Icon;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import jiconfont.IconCode;
import jiconfont.icons.font_awesome.FontAwesome;
import jiconfont.swing.IconFontSwing;

/**
 *
 * @author galdi
 */
public class TelaUtils {
   
    public static Icon getIconFontAwesome(IconCode iconCode, int size) {
        IconFontSwing.register(FontAwesome.getIconFont());
        Icon icon = IconFontSwing.buildIcon(iconCode, size, UIManager.getDefaults().getColor("Label.foreground"));
        return icon;
    }
    
    public static LookAndFeel getLookAndFeel(String name) {
        ArrayList<LookAndFeel> temas = new ArrayList<>(Arrays.asList(
            new FlatDarkLaf(),
            new FlatLightLaf(),
            new FlatNordIJTheme(),
            new FlatDraculaIJTheme(),
            new FlatSpacegrayIJTheme(),
            new FlatOneDarkIJTheme(),
            new FlatGruvboxDarkSoftIJTheme()    
        ));
        
        for (LookAndFeel tema : temas) {
            if (tema.getName().equals(name)) {
                
                return tema;
            }
        }
        
        return null;
    }
}
