package cb;

import com.max.hbcommon.base.adapter.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ViewHolderBinder.kt */
/* JADX INFO: loaded from: classes9.dex */
public abstract class c<T> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public abstract void b(@d s.e eVar, T t10);

    public void c(@d s.e viewHolder, T t10) {
        if (PatchProxy.proxy(new Object[]{viewHolder, t10}, this, changeQuickRedirect, false, bb.c.d.M1, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
    }

    public void d(@d s.e viewHolder, T t10) {
        if (PatchProxy.proxy(new Object[]{viewHolder, t10}, this, changeQuickRedirect, false, bb.c.d.K1, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
    }

    public void e(@d s.e viewHolder, T t10) {
        if (PatchProxy.proxy(new Object[]{viewHolder, t10}, this, changeQuickRedirect, false, 2170, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
    }
}
