package rf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.x70;
import dl.d;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BuildSharePanelView.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    public static final x70 a(@d LayoutInflater inflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater}, null, changeQuickRedirect, true, 41192, new Class[]{LayoutInflater.class}, x70.class);
        if (patchProxyResultProxy.isSupported) {
            return (x70) patchProxyResultProxy.result;
        }
        f0.p(inflater, "inflater");
        x70 x70VarC = x70.c(inflater);
        f0.o(x70VarC, "inflate(inflater)");
        FrameLayout frameLayoutB = x70VarC.b();
        f0.o(frameLayoutB, "binding.root");
        b(frameLayoutB);
        return x70VarC;
    }

    private static final void b(View view) {
        if (PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 41193, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }
}
