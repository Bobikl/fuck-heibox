package th;

import dl.d;
import dl.e;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.collections.m;
import kotlin.jvm.internal.f0;
import sh.l;

/* JADX INFO: compiled from: JDK7PlatformImplementations.kt */
/* JADX INFO: loaded from: classes5.dex */
public class a extends l {

    /* JADX INFO: renamed from: th.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: JDK7PlatformImplementations.kt */
    public static final class C1268a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @d
        public static final C1268a f140722a = new C1268a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @e
        @xh.e
        public static final Integer f140723b;

        static {
            Integer num;
            Integer num2 = null;
            try {
                Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
                num = obj instanceof Integer ? (Integer) obj : null;
            } catch (Throwable unused) {
            }
            if (num != null) {
                if (num.intValue() > 0) {
                    num2 = num;
                }
            }
            f140723b = num2;
        }

        private C1268a() {
        }
    }

    private final boolean e(int i10) {
        Integer num = C1268a.f140723b;
        return num == null || num.intValue() >= i10;
    }

    @Override // sh.l
    public void a(@d Throwable cause, @d Throwable exception) throws IllegalAccessException, InvocationTargetException {
        f0.p(cause, "cause");
        f0.p(exception, "exception");
        if (e(19)) {
            cause.addSuppressed(exception);
        } else {
            super.a(cause, exception);
        }
    }

    @Override // sh.l
    @d
    public List<Throwable> d(@d Throwable exception) {
        f0.p(exception, "exception");
        if (!e(19)) {
            return super.d(exception);
        }
        Throwable[] suppressed = exception.getSuppressed();
        f0.o(suppressed, "exception.suppressed");
        return m.t(suppressed);
    }
}
