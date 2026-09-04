package androidx.core.util;

import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.util.Objects;

/* JADX INFO: compiled from: ObjectsCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: compiled from: ObjectsCompat.java */
    @w0(19)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static boolean a(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }

        @androidx.annotation.u
        static int b(Object... objArr) {
            return Objects.hash(objArr);
        }
    }

    private j() {
    }

    public static boolean a(@p0 Object obj, @p0 Object obj2) {
        return a.a(obj, obj2);
    }

    public static int b(@p0 Object... objArr) {
        return a.b(objArr);
    }

    public static int c(@p0 Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    @n0
    public static <T> T d(@p0 T t10) {
        t10.getClass();
        return t10;
    }

    @n0
    public static <T> T e(@p0 T t10, @n0 String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    @p0
    public static String f(@p0 Object obj, @p0 String str) {
        return obj != null ? obj.toString() : str;
    }
}
