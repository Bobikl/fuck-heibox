package com.google.android.play.core.splitinstall.internal;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f56293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Field f56294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class f56295c;

    j0(Object obj, Field field, Class cls) {
        this.f56293a = obj;
        this.f56294b = field;
        this.f56295c = cls;
    }

    public final Object a() {
        try {
            return this.f56295c.cast(this.f56294b.get(this.f56293a));
        } catch (Exception e10) {
            throw new zzbl(String.format("Failed to get value of field %s of type %s on object of type %s", this.f56294b.getName(), this.f56293a.getClass().getName(), this.f56295c.getName()), e10);
        }
    }

    protected final Field b() {
        return this.f56294b;
    }

    public final void c(Object obj) {
        try {
            this.f56294b.set(this.f56293a, obj);
        } catch (Exception e10) {
            throw new zzbl(String.format("Failed to set value of field %s of type %s on object of type %s", this.f56294b.getName(), this.f56293a.getClass().getName(), this.f56295c.getName()), e10);
        }
    }
}
