package org.apache.tools.ant.util;

/* JADX INFO: compiled from: ReflectWrapper.java */
/* JADX INFO: loaded from: classes5.dex */
public class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f136857a;

    public l1(ClassLoader classLoader, String str) {
        try {
            this.f136857a = Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e10) {
            k1.h(e10);
        }
    }

    public l1(Object obj) {
        this.f136857a = obj;
    }

    public <T> T a() {
        return (T) this.f136857a;
    }

    public <T> T b(String str) {
        return (T) k1.b(this.f136857a, str);
    }

    public <T> T c(String str, Class<?> cls, Object obj) {
        return (T) k1.c(this.f136857a, str, cls, obj);
    }

    public <T> T d(String str, Class<?> cls, Object obj, Class<?> cls2, Object obj2) {
        return (T) k1.d(this.f136857a, str, cls, obj, cls2, obj2);
    }
}
