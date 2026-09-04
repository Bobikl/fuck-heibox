package androidx.compose.ui.text.platform;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Synchronization.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0000\u001a/\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/platform/s;", ak.av, "R", "lock", "Lkotlin/Function0;", "block", "b", "(Landroidx/compose/ui/text/platform/s;Lyh/a;)Ljava/lang/Object;", "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class r {
    @dl.d
    public static final s a() {
        return new s();
    }

    public static final <R> R b(@dl.d s lock, @dl.d yh.a<? extends R> block) {
        R rInvoke;
        f0.p(lock, "lock");
        f0.p(block, "block");
        synchronized (lock) {
            try {
                rInvoke = block.invoke();
                c0.d(1);
            } finally {
                c0.d(1);
                c0.c(1);
            }
        }
        return rInvoke;
    }
}
