
package com.mycompany.resolucaodosistema;

import java.util.Locale;

public class ResolucaoDoSistema {

    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.println(loc.getDisplayLanguage());
        System.out.println(loc.getLanguage());
    }
}