package af;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: CompletedCover.kt */
/* JADX INFO: loaded from: classes8.dex */
public interface c {

    /* JADX INFO: compiled from: CompletedCover.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        public static void a(@dl.d c cVar, @dl.e com.max.video.ui.widget.e eVar) {
            if (PatchProxy.proxy(new Object[]{cVar, eVar}, null, changeQuickRedirect, true, bb.c.m.aq, new Class[]{c.class, com.max.video.ui.widget.e.class}, Void.TYPE).isSupported) {
                return;
            }
            cVar.setCompletedPanel(eVar);
        }
    }

    void a();

    void f(@dl.e com.max.video.ui.widget.e eVar);

    @dl.e
    com.max.video.ui.widget.e getCompletedPanel();

    void p();

    void setCompletedPanel(@dl.e com.max.video.ui.widget.e eVar);
}
