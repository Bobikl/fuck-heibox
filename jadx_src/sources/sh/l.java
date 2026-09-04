package sh;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.regex.MatchResult;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.random.Random;

/* JADX INFO: compiled from: PlatformImplementations.kt */
/* JADX INFO: loaded from: classes5.dex */
public class l {

    /* JADX INFO: compiled from: PlatformImplementations.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final a f139397a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.e
        @xh.e
        public static final Method f139398b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.e
        @xh.e
        public static final Method f139399c;

        /* JADX WARN: Code duplicated, block: B:10:0x003b  */
        static {
            Method method;
            Method method2;
            boolean z10;
            Method[] throwableMethods = Throwable.class.getMethods();
            f0.o(throwableMethods, "throwableMethods");
            int length = throwableMethods.length;
            int i10 = 0;
            while (true) {
                method = null;
                if (i10 >= length) {
                    method2 = null;
                    break;
                }
                method2 = throwableMethods[i10];
                if (f0.g(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    f0.o(parameterTypes, "it.parameterTypes");
                    if (f0.g(ArraysKt___ArraysKt.bu(parameterTypes), Throwable.class)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
                if (z10) {
                    break;
                } else {
                    i10++;
                }
            }
            f139398b = method2;
            for (Method method3 : throwableMethods) {
                if (f0.g(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
            }
            f139399c = method;
        }

        private a() {
        }
    }

    public void a(@dl.d Throwable cause, @dl.d Throwable exception) throws IllegalAccessException, InvocationTargetException {
        f0.p(cause, "cause");
        f0.p(exception, "exception");
        Method method = a.f139398b;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    @dl.d
    public Random b() {
        return new kotlin.random.b();
    }

    @dl.e
    public kotlin.text.h c(@dl.d MatchResult matchResult, @dl.d String name) {
        f0.p(matchResult, "matchResult");
        f0.p(name, "name");
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }

    @dl.d
    public List<Throwable> d(@dl.d Throwable exception) {
        Object objInvoke;
        List<Throwable> listT;
        f0.p(exception, "exception");
        Method method = a.f139399c;
        return (method == null || (objInvoke = method.invoke(exception, new Object[0])) == null || (listT = kotlin.collections.m.t((Throwable[]) objInvoke)) == null) ? CollectionsKt__CollectionsKt.E() : listT;
    }
}
