package com.google.common.base;

import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Defaults.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.c
@g
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Double f56732a = Double.valueOf(0.0d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Float f56733b = Float.valueOf(0.0f);

    private f() {
    }

    @CheckForNull
    public static <T> T a(Class<T> cls) {
        w.E(cls);
        if (!cls.isPrimitive()) {
            return null;
        }
        if (cls == Boolean.TYPE) {
            return (T) Boolean.FALSE;
        }
        if (cls == Character.TYPE) {
            return (T) (char) 0;
        }
        if (cls == Byte.TYPE) {
            return (T) (byte) 0;
        }
        if (cls == Short.TYPE) {
            return (T) (short) 0;
        }
        if (cls == Integer.TYPE) {
            return (T) 0;
        }
        if (cls == Long.TYPE) {
            return (T) 0L;
        }
        if (cls == Float.TYPE) {
            return (T) f56733b;
        }
        if (cls == Double.TYPE) {
            return (T) f56732a;
        }
        return null;
    }
}
