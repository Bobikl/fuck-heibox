package com.google.android.gms.dynamic;

import android.os.IBinder;
import androidx.annotation.n0;
import com.google.android.gms.common.internal.p;
import java.lang.reflect.Field;
import z8.y;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
@y
public final class e<T> extends c.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f52673b;

    private e(Object obj) {
        this.f52673b = obj;
    }

    @n0
    @v8.a
    public static <T> c f1(@n0 T t10) {
        return new e(t10);
    }

    @n0
    @v8.a
    public static <T> T r0(@n0 c cVar) {
        if (cVar instanceof e) {
            return (T) ((e) cVar).f52673b;
        }
        IBinder iBinderAsBinder = cVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 != 1) {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        p.l(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(iBinderAsBinder);
        } catch (IllegalAccessException e10) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e10);
        } catch (NullPointerException e11) {
            throw new IllegalArgumentException("Binder object is null.", e11);
        }
    }
}
