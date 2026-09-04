package com.huawei.hms.feature.dynamic.e;

import android.util.Log;
import dalvik.system.PathClassLoader;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends PathClassLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f60713a = a.class.getSimpleName();

    public a(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    @Override // java.lang.ClassLoader
    public Class<?> loadClass(String str, boolean z10) throws ClassNotFoundException {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
                Log.w(f60713a, "Cannot find The class:" + str);
            }
        }
        return super.loadClass(str, z10);
    }
}
