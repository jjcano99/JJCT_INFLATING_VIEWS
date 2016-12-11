package com.val.inflando;

/**
 * Created by vale on 11/05/16.
 */
public class StringUtil {

    public static String mensajeSalida (String nombre)
    {
        String mensaje = null;

            mensaje = "El nombre tiene " +nombre.length() + " letras";

        return mensaje;
    }
    public static String mensajeSalidaAlReves (String nombre)
    {
        String mensaje = "";

        for (int i=nombre.length()-1;i>=0;i--){
            mensaje+=nombre.charAt(i);
        };

        return mensaje;
    }






}
