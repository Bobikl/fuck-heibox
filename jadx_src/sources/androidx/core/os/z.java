package androidx.core.os;

import android.os.PersistableBundle;
import androidx.annotation.w0;

/* JADX INFO: compiled from: PersistableBundle.kt */
/* JADX INFO: loaded from: classes.dex */
@w0(21)
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final z f20995a = new z();

    private z() {
    }

    @androidx.annotation.u
    @dl.d
    @xh.m
    public static final PersistableBundle a(int i10) {
        return new PersistableBundle(i10);
    }

    @androidx.annotation.u
    @xh.m
    public static final void b(@dl.d PersistableBundle persistableBundle, @dl.e String str, @dl.e Object obj) {
        kotlin.jvm.internal.f0.p(persistableBundle, "persistableBundle");
        if (obj == null) {
            persistableBundle.putString(str, null);
            return;
        }
        if (obj instanceof Boolean) {
            a0.a(persistableBundle, str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Double) {
            persistableBundle.putDouble(str, ((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof Integer) {
            persistableBundle.putInt(str, ((Number) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            persistableBundle.putLong(str, ((Number) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            persistableBundle.putString(str, (String) obj);
            return;
        }
        if (obj instanceof boolean[]) {
            a0.b(persistableBundle, str, (boolean[]) obj);
            return;
        }
        if (obj instanceof double[]) {
            persistableBundle.putDoubleArray(str, (double[]) obj);
            return;
        }
        if (obj instanceof int[]) {
            persistableBundle.putIntArray(str, (int[]) obj);
            return;
        }
        if (obj instanceof long[]) {
            persistableBundle.putLongArray(str, (long[]) obj);
            return;
        }
        if (!(obj instanceof Object[])) {
            throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + kotlin.text.y.f128593b);
        }
        Class<?> componentType = obj.getClass().getComponentType();
        kotlin.jvm.internal.f0.m(componentType);
        if (String.class.isAssignableFrom(componentType)) {
            kotlin.jvm.internal.f0.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            persistableBundle.putStringArray(str, (String[]) obj);
            return;
        }
        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + kotlin.text.y.f128593b);
    }
}
