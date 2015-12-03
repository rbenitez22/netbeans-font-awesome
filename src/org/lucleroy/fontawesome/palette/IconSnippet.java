package org.lucleroy.fontawesome.palette;

import java.util.prefs.Preferences;
import org.openide.util.NbPreferences;

public abstract class IconSnippet extends AbstractSnippet {

    @Override
    protected String createBody() {
        Preferences pref = NbPreferences.forModule(FontAwesomePalettePanel.class);
        String tag = pref.get("template", Utils.DEFAULT_TEMPLATE);
        String var="${" + Utils.VAR_NAME + "}";
        if(!tag.contains(var))
        {
            Utils.showErrorMessage("Invalid template");
            return "";
        }

        return tag.replace(var, getClasses());
    }

    private String quote(String string) {
        return "\"" + string + "\"";
    }

    protected abstract String getClasses();
}
