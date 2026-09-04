package com.bun.miitmdid.provider.xiaomi;

import android.content.Context;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public class IdentifierManager {
    private static Class<?> sClass;
    private static Method sGetAAID;
    private static Method sGetOAID;
    private static Method sGetUDID;
    private static Method sGetVAID;
    private static Object sIdProivderImpl;

    static {
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            sClass = cls;
            sIdProivderImpl = cls.newInstance();
            sGetUDID = sClass.getMethod("getUDID", Context.class);
            sGetOAID = sClass.getMethod("getOAID", Context.class);
            sGetVAID = sClass.getMethod("getVAID", Context.class);
            sGetAAID = sClass.getMethod("getAAID", Context.class);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static native String getAAID(Context context);

    public static native String getOAID(Context context);

    public static native String getUDID(Context context);

    public static native String getVAID(Context context);

    private static native String invokeMethod(Context context, Method method);

    public static native boolean isSupported();
}
