package fe;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.j;
import bb.c;
import com.max.hbwidget.hbdilog.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: UIBottomDialogFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public class a extends j {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onCreate(@e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, c.l.H6, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        setStyle(0, R.style.FullScreenDialog);
    }

    @Override // androidx.fragment.app.Fragment
    @e
    public View onCreateView(@d LayoutInflater inflater, @e ViewGroup viewGroup, @e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, c.l.I6, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(inflater, "inflater");
        return inflater.inflate(R.layout.bottom_dialog_fragment, viewGroup, false);
    }
}
