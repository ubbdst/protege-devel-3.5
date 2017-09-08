package edu.stanford.smi.protege.util;

import java.awt.*;

import javax.swing.*;
import javax.swing.plaf.*;

import com.jgoodies.looks.plastic.theme.*;
import edu.stanford.smi.protege.resource.*;

/**
 *  @author Ray Fergerson
 *  
 */
public class ProtegePlasticTheme extends SkyBluer /*ExperienceBlue*/ {
	
	public final static int DEFAULT_FONT_SIZE = 12;
	public final static Font DEFAULT_FONT = new Font("Dialog", Font.PLAIN, DEFAULT_FONT_SIZE);
    private static final ColorUIResource SECONDARY3 = new ColorUIResource(225, 225, 225);
    protected static final ColorUIResource LUNA_BACKGROUND_DARKER = new ColorUIResource(189, 190, 176);

    public void addCustomEntriesToTable(UIDefaults table) {
        super.addCustomEntriesToTable(table);
        Object[] uiDefaults = { 
        		"Tree.expandedIcon", Icons.getHierarchyExpandedIcon(), 
        		"Tree.collapsedIcon", Icons.getHierarchyCollapsedIcon(), 
        		"Table.selectionForeground", getMenuItemSelectedForeground(),
                "Table.selectionBackground", getMenuItemSelectedBackground(), 
                "List.selectionForeground", getMenuItemSelectedForeground(),
                "List.selectionBackground", getMenuItemSelectedBackground(),
                "Tree.selectionForeground", getMenuItemSelectedForeground(), 
                "Tree.selectionBackground", getMenuItemSelectedBackground(), 
        };
        table.putDefaults(uiDefaults);
    }

    public ColorUIResource getMenuItemSelectedBackground() {
        return getPrimary3();
    }

    public ColorUIResource getMenuItemSelectedForeground() {
        return new ColorUIResource(Color.BLUE);
    }

    public ColorUIResource getMenuSelectedBackground() {
        return getMenuItemSelectedBackground();
    }

    public ColorUIResource getMenuSelectedForeground() {
       return getMenuItemSelectedForeground();
    }

}