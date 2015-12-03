/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lucleroy.fontawesome.palette;

import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;

/**
 *
 * @author Roberto C. Benitez
 */
public final class Utils
{
    public final static String VAR_NAME="names";
    public final static String DEFAULT_TEMPLATE="<span class=\"${" + VAR_NAME + "}\"></span>";
    
    public final static String APP_TITLE="Font Awesome";
    private Utils(){};
    
    public static void showErrorMessage(String message)
    {
            NotifyDescriptor descr= new NotifyDescriptor.Message(message,NotifyDescriptor.ERROR_MESSAGE);
            descr.setTitle(APP_TITLE);
            DialogDisplayer.getDefault().notify(descr);
    }
}
