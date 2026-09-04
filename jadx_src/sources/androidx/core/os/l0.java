package androidx.core.os;

import android.os.Build;
import android.os.UserHandle;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: UserHandleCompat.java */
/* JADX INFO: loaded from: classes.dex */
@w0(17)
public class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private static Method f20978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private static Constructor<UserHandle> f20979b;

    /* JADX INFO: compiled from: UserHandleCompat.java */
    @w0(24)
    public static class a {
        private a() {
        }

        @androidx.annotation.n0
        static UserHandle a(int i10) {
            return UserHandle.getUserHandleForUid(i10);
        }
    }

    private l0() {
    }

    private static Method a() throws NoSuchMethodException {
        if (f20978a == null) {
            Method declaredMethod = UserHandle.class.getDeclaredMethod("getUserId", Integer.TYPE);
            f20978a = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return f20978a;
    }

    private static Constructor<UserHandle> b() throws NoSuchMethodException {
        if (f20979b == null) {
            Constructor<UserHandle> declaredConstructor = UserHandle.class.getDeclaredConstructor(Integer.TYPE);
            f20979b = declaredConstructor;
            declaredConstructor.setAccessible(true);
        }
        return f20979b;
    }

    @androidx.annotation.n0
    public static UserHandle c(int i10) {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.a(i10);
        }
        try {
            return b().newInstance((Integer) a().invoke(null, Integer.valueOf(i10)));
        } catch (IllegalAccessException e10) {
            IllegalAccessError illegalAccessError = new IllegalAccessError();
            illegalAccessError.initCause(e10);
            throw illegalAccessError;
        } catch (InstantiationException e11) {
            InstantiationError instantiationError = new InstantiationError();
            instantiationError.initCause(e11);
            throw instantiationError;
        } catch (NoSuchMethodException e12) {
            NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
            noSuchMethodError.initCause(e12);
            throw noSuchMethodError;
        } catch (InvocationTargetException e13) {
            throw new RuntimeException(e13);
        }
    }
}
