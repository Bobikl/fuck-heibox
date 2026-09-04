package com.sankuai.waimai.router.components;

import android.app.Activity;
import java.lang.reflect.Modifier;

/* JADX INFO: compiled from: UriTargetTools.java */
/* JADX INFO: loaded from: classes8.dex */
public class j {
    private static boolean a(Class cls) {
        return (cls == null || !Activity.class.isAssignableFrom(cls) || Modifier.isAbstract(cls.getModifiers())) ? false : true;
    }

    public static com.sankuai.waimai.router.core.g b(Object obj, boolean z10, com.sankuai.waimai.router.core.h... hVarArr) {
        com.sankuai.waimai.router.core.g gVarC = c(obj);
        if (gVarC != null) {
            if (!z10) {
                gVarC.a(com.sankuai.waimai.router.common.i.f96428a);
            }
            gVarC.b(hVarArr);
        }
        return gVarC;
    }

    private static com.sankuai.waimai.router.core.g c(Object obj) {
        if (obj instanceof com.sankuai.waimai.router.core.g) {
            return (com.sankuai.waimai.router.core.g) obj;
        }
        if (obj instanceof String) {
            return new com.sankuai.waimai.router.activity.b((String) obj);
        }
        if (!(obj instanceof Class)) {
            return null;
        }
        Class cls = (Class) obj;
        if (a(cls)) {
            return new com.sankuai.waimai.router.activity.c(cls);
        }
        return null;
    }
}
