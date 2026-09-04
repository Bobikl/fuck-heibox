package kb;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Once.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class b {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private final AtomicBoolean f124462a = new AtomicBoolean(false);

    public final void a(@d yh.a<b2> block) {
        if (PatchProxy.proxy(new Object[]{block}, this, changeQuickRedirect, false, bb.c.e.X0, new Class[]{yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(block, "block");
        if (this.f124462a.compareAndSet(false, true)) {
            block.invoke();
        }
    }
}
