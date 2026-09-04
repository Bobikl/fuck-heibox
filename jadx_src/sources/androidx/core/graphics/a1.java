package androidx.core.graphics;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: TypefaceCompatApi28Impl.java */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(28)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class a1 extends z0 {
    private static final String B = "createFromFamiliesWithDefault";
    private static final int C = -1;
    private static final String D = "sans-serif";

    @Override // androidx.core.graphics.z0
    protected Method B(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod(B, Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // androidx.core.graphics.z0, androidx.core.graphics.x0, androidx.core.graphics.c1
    @androidx.annotation.n0
    Typeface g(@androidx.annotation.n0 Context context, @androidx.annotation.n0 Typeface typeface, int i10, boolean z10) {
        return Typeface.create(typeface, i10, z10);
    }

    @Override // androidx.core.graphics.z0
    protected Typeface p(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.f20788m, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f20794s.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }
}
