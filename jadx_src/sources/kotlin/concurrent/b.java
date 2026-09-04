package kotlin.concurrent;

import dl.d;
import dl.e;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import sh.f;
import xh.h;

/* JADX INFO: compiled from: Thread.kt */
/* JADX INFO: loaded from: classes5.dex */
@h(name = "ThreadsKt")
public final class b {

    /* JADX INFO: compiled from: Thread.kt */
    public static final class a extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f124684b;

        a(yh.a<b2> aVar) {
            this.f124684b = aVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f124684b.invoke();
        }
    }

    @f
    private static final <T> T a(ThreadLocal<T> threadLocal, yh.a<? extends T> aVar) {
        f0.p(threadLocal, "<this>");
        f0.p(aVar, "default");
        T t10 = threadLocal.get();
        if (t10 != null) {
            return t10;
        }
        T tInvoke = aVar.invoke();
        threadLocal.set(tInvoke);
        return tInvoke;
    }

    @d
    public static final Thread b(boolean z10, boolean z11, @e ClassLoader classLoader, @e String str, int i10, @d yh.a<b2> block) {
        f0.p(block, "block");
        a aVar = new a(block);
        if (z11) {
            aVar.setDaemon(true);
        }
        if (i10 > 0) {
            aVar.setPriority(i10);
        }
        if (str != null) {
            aVar.setName(str);
        }
        if (classLoader != null) {
            aVar.setContextClassLoader(classLoader);
        }
        if (z10) {
            aVar.start();
        }
        return aVar;
    }

    public static /* synthetic */ Thread c(boolean z10, boolean z11, ClassLoader classLoader, String str, int i10, yh.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        boolean z12 = z10;
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        boolean z13 = z11;
        ClassLoader classLoader2 = (i11 & 4) != 0 ? null : classLoader;
        String str2 = (i11 & 8) != 0 ? null : str;
        if ((i11 & 16) != 0) {
            i10 = -1;
        }
        return b(z12, z13, classLoader2, str2, i10, aVar);
    }
}
