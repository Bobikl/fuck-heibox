package com.huawei.hms.feature.dynamic;

import android.os.IBinder;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes7.dex */
public class ObjectWrapper<T> extends IObjectWrapper.Stub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f60671a;

    public ObjectWrapper(T t10) {
        this.f60671a = t10;
    }

    public static <T> T unwrap(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper instanceof ObjectWrapper) {
            return ((ObjectWrapper) iObjectWrapper).f60671a;
        }
        IBinder iBinderAsBinder = iObjectWrapper.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        int i10 = 0;
        for (Field field : declaredFields) {
            if (!field.isSynthetic()) {
                i10++;
            }
        }
        if (i10 == 1) {
            if (declaredFields[0].isAccessible()) {
                throw new IllegalArgumentException("The field is accessible.");
            }
            declaredFields[0].setAccessible(true);
            try {
                return (T) declaredFields[0].get(iBinderAsBinder);
            } catch (Exception unused) {
                throw new IllegalArgumentException("Get binder failed: null or not permitted.");
            }
        }
        throw new IllegalArgumentException("Got " + declaredFields.length + " fields, The number of field number should be 1.");
    }

    public static <T> IObjectWrapper wrap(T t10) {
        return new ObjectWrapper(t10);
    }
}
