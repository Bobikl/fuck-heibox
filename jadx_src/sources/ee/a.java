package ee;

import androidx.fragment.app.FragmentManager;
import bb.c;
import com.max.hbwidget.hbdialog.gesture.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CustomDialogFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public class a extends b {
    public static ChangeQuickRedirect changeQuickRedirect;

    public final void X3(@d FragmentManager manager, @d String tag) {
        if (PatchProxy.proxy(new Object[]{manager, tag}, this, changeQuickRedirect, false, c.l.Z5, new Class[]{FragmentManager.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(manager, "manager");
        f0.p(tag, "tag");
        try {
            showNow(manager, tag);
        } catch (Exception unused) {
        }
    }
}
