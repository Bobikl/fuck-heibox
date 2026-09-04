package androidx.compose.ui.platform;

import com.umeng.analytics.pro.ak;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: compiled from: JvmActuals.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0000*\u00020\u0000H\u0000\u001a/\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0080\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b*\f\b\u0000\u0010\r\"\u00020\f2\u00020\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, d2 = {"", "obj", "", "name", "b", ak.av, "R", "lock", "Lkotlin/Function0;", "block", ak.aF, "(Ljava/lang/Object;Lyh/a;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicInteger;", "AtomicInt", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class a1 {
    @dl.d
    public static final Object a(@dl.d Object obj) {
        kotlin.jvm.internal.f0.p(obj, "<this>");
        return obj.getClass();
    }

    @dl.d
    public static final String b(@dl.d Object obj, @dl.e String str) {
        kotlin.jvm.internal.f0.p(obj, "obj");
        if (str == null) {
            str = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append('@');
        kotlin.jvm.internal.v0 v0Var = kotlin.jvm.internal.v0.f124986a;
        String str2 = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        kotlin.jvm.internal.f0.o(str2, "format(format, *args)");
        sb2.append(str2);
        return sb2.toString();
    }

    public static final <R> R c(@dl.d Object lock, @dl.d yh.a<? extends R> block) {
        R rInvoke;
        kotlin.jvm.internal.f0.p(lock, "lock");
        kotlin.jvm.internal.f0.p(block, "block");
        synchronized (lock) {
            try {
                rInvoke = block.invoke();
                kotlin.jvm.internal.c0.d(1);
            } finally {
                kotlin.jvm.internal.c0.d(1);
                kotlin.jvm.internal.c0.c(1);
            }
        }
        return rInvoke;
    }
}
