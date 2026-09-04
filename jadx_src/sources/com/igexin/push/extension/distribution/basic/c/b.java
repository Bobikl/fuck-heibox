package com.igexin.push.extension.distribution.basic.c;

import com.igexin.push.core.CoreConsts;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f63952a = a();

    private static String a() {
        String str = "com.igexin.sdk.action.doaction";
        try {
            Method[] declaredMethods = CoreConsts.class.getDeclaredMethods();
            Object objNewInstance = CoreConsts.class.newInstance();
            for (Method method : declaredMethods) {
                method.setAccessible(true);
                if (method.isAnnotationPresent(Deprecated.class) && method.getParameterTypes().length == 0) {
                    str = (String) method.invoke(objNewInstance, new Object[0]);
                }
            }
        } catch (Exception unused) {
        }
        return str;
    }
}
