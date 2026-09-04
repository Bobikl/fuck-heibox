package af;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: FullScreenAware.kt */
/* JADX INFO: loaded from: classes8.dex */
public interface f {

    /* JADX INFO: compiled from: FullScreenAware.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        public static void a(@dl.d f fVar, boolean z10) {
            ze.a fullScreenAction;
            if (PatchProxy.proxy(new Object[]{fVar, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.m.bq, new Class[]{f.class, Boolean.TYPE}, Void.TYPE).isSupported || (fullScreenAction = fVar.getFullScreenAction()) == null) {
                return;
            }
            fullScreenAction.a(z10);
        }
    }

    void d(boolean z10);

    void f(boolean z10);

    @dl.e
    ze.a getFullScreenAction();

    void setFullScreenAction(@dl.e ze.a aVar);
}
