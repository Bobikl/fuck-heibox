package kotlin.jvm.internal;

import com.tencent.qcloud.core.util.IOUtils;
import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;

/* JADX INFO: compiled from: Intrinsics.java */
/* JADX INFO: loaded from: classes5.dex */
public class f0 {

    /* JADX INFO: compiled from: Intrinsics.java */
    @kotlin.u0(version = "1.4")
    public static class a {
        private a() {
        }
    }

    private f0() {
    }

    private static <T extends Throwable> T A(T t10) {
        return (T) B(t10, f0.class.getName());
    }

    static <T extends Throwable> T B(T t10, String str) {
        StackTraceElement[] stackTrace = t10.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(stackTrace[i11].getClassName())) {
                i10 = i11;
            }
        }
        t10.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10 + 1, length));
        return t10;
    }

    public static String C(String str, Object obj) {
        return str + obj;
    }

    public static void D() {
        throw ((AssertionError) A(new AssertionError()));
    }

    public static void E(String str) {
        throw ((AssertionError) A(new AssertionError(str)));
    }

    public static void F() {
        throw ((IllegalArgumentException) A(new IllegalArgumentException()));
    }

    public static void G(String str) {
        throw ((IllegalArgumentException) A(new IllegalArgumentException(str)));
    }

    public static void H() {
        throw ((IllegalStateException) A(new IllegalStateException()));
    }

    public static void I(String str) {
        throw ((IllegalStateException) A(new IllegalStateException(str)));
    }

    @kotlin.u0(version = "1.4")
    public static void J() {
        throw ((NullPointerException) A(new NullPointerException()));
    }

    @kotlin.u0(version = "1.4")
    public static void K(String str) {
        throw ((NullPointerException) A(new NullPointerException(str)));
    }

    public static void L() {
        throw ((KotlinNullPointerException) A(new KotlinNullPointerException()));
    }

    public static void M(String str) {
        throw ((KotlinNullPointerException) A(new KotlinNullPointerException(str)));
    }

    private static void N(String str) {
        throw ((IllegalArgumentException) A(new IllegalArgumentException(v(str))));
    }

    private static void O(String str) {
        throw ((NullPointerException) A(new NullPointerException(v(str))));
    }

    public static void P() {
        Q("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void Q(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void R(String str) {
        throw ((UninitializedPropertyAccessException) A(new UninitializedPropertyAccessException(str)));
    }

    public static void S(String str) {
        R("lateinit property " + str + " has not been initialized");
    }

    @kotlin.u0(version = "1.1")
    public static boolean a(double d10, Double d11) {
        return d11 != null && d10 == d11.doubleValue();
    }

    @kotlin.u0(version = "1.1")
    public static boolean b(float f10, Float f11) {
        return f11 != null && f10 == f11.floatValue();
    }

    @kotlin.u0(version = "1.1")
    public static boolean c(Double d10, double d11) {
        return d10 != null && d10.doubleValue() == d11;
    }

    @kotlin.u0(version = "1.1")
    public static boolean d(Double d10, Double d11) {
        if (d10 == null) {
            if (d11 == null) {
                return true;
            }
        } else if (d11 != null && d10.doubleValue() == d11.doubleValue()) {
            return true;
        }
        return false;
    }

    @kotlin.u0(version = "1.1")
    public static boolean e(Float f10, float f11) {
        return f10 != null && f10.floatValue() == f11;
    }

    @kotlin.u0(version = "1.1")
    public static boolean f(Float f10, Float f11) {
        if (f10 == null) {
            if (f11 == null) {
                return true;
            }
        } else if (f11 != null && f10.floatValue() == f11.floatValue()) {
            return true;
        }
        return false;
    }

    public static boolean g(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static void h(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) A(new IllegalStateException(str + " must not be null")));
    }

    public static void i(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) A(new IllegalStateException(str)));
        }
    }

    public static void j(Object obj, String str, String str2) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) A(new IllegalStateException("Field specified as non-null is null: " + str + "." + str2)));
    }

    public static void k(String str) throws ClassNotFoundException {
        String strReplace = str.replace(IOUtils.DIR_SEPARATOR_UNIX, lg.a.f131414g);
        try {
            Class.forName(strReplace);
        } catch (ClassNotFoundException e10) {
            throw ((ClassNotFoundException) A(new ClassNotFoundException("Class " + strReplace + " is not found. Please update the Kotlin runtime to the latest version", e10)));
        }
    }

    public static void l(String str, String str2) throws ClassNotFoundException {
        String strReplace = str.replace(IOUtils.DIR_SEPARATOR_UNIX, lg.a.f131414g);
        try {
            Class.forName(strReplace);
        } catch (ClassNotFoundException e10) {
            throw ((ClassNotFoundException) A(new ClassNotFoundException("Class " + strReplace + " is not found: this code requires the Kotlin runtime of version at least " + str2, e10)));
        }
    }

    public static void m(Object obj) {
        if (obj == null) {
            J();
        }
    }

    public static void n(Object obj, String str) {
        if (obj == null) {
            K(str);
        }
    }

    public static void o(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) A(new NullPointerException(str + " must not be null")));
    }

    public static void p(Object obj, String str) {
        if (obj == null) {
            O(str);
        }
    }

    public static void q(Object obj, String str) {
        if (obj == null) {
            N(str);
        }
    }

    public static void r(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) A(new IllegalStateException(str)));
        }
    }

    public static void s(Object obj, String str, String str2) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) A(new IllegalStateException("Method specified as non-null returned null: " + str + "." + str2)));
    }

    public static int t(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 == i11 ? 0 : 1;
    }

    public static int u(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    private static String v(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = f0.class.getName();
        int i10 = 0;
        while (!stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        while (stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        StackTraceElement stackTraceElement = stackTrace[i10];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    public static void w() {
        P();
    }

    public static void x(String str) {
        Q(str);
    }

    public static void y(int i10, String str) {
        P();
    }

    public static void z(int i10, String str, String str2) {
        Q(str2);
    }
}
