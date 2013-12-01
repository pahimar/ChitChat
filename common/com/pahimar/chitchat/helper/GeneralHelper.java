package com.pahimar.chitchat.helper;

import com.pahimar.chitchat.lib.Reference;

import cpw.mods.fml.common.Loader;


public class GeneralHelper {
    
    public static boolean canFMLCancelChatMessages() {
        
        String fmlVersion = Loader.instance().getFMLVersionString();
        String[] fmlVersionComponents = fmlVersion.split("\\.");
        
        if (fmlVersionComponents.length == 4) {
            try {
                if (Integer.parseInt(fmlVersionComponents[3]) >= Reference.MIN_FML_BUILD_NUMBER) {
                    return true;
                }
            }
            catch (NumberFormatException e) {
                return false;
            }
        }
        
        return false;
    }
    
    public static String formatTimeFromTicks(int ticks) {
        
        // TODO Finish this for logging
        return "";
    }

}
