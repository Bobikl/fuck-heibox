package tf;

import com.max.hbshare.c;
import com.max.xiaoheihe.bean.ShareInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Reporter.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final void a(@d ShareInfoObj shareInfoObj, @d String plat) {
        if (PatchProxy.proxy(new Object[]{shareInfoObj, plat}, null, changeQuickRedirect, true, 41201, new Class[]{ShareInfoObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(shareInfoObj, "shareInfoObj");
        f0.p(plat, "plat");
        c.a(c.f72545a, "1", plat, shareInfoObj.getExtra_data());
    }
}
