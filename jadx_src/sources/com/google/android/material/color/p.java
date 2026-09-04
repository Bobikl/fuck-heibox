package com.google.android.material.color;

import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import androidx.annotation.w0;
import java.util.Map;

/* JADX INFO: compiled from: ResourcesLoaderUtils.java */
/* JADX INFO: loaded from: classes7.dex */
@w0(api = 30)
public final class p {
    private p() {
    }

    static boolean a(Context context, Map<Integer, Integer> map) throws Throwable {
        ResourcesLoader resourcesLoaderA = b.a(context, map);
        if (resourcesLoaderA == null) {
            return false;
        }
        context.getResources().addLoaders(resourcesLoaderA);
        return true;
    }

    static boolean b(int i10) {
        return 28 <= i10 && i10 <= 31;
    }
}
