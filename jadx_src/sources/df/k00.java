package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemUpdateaccountDialogBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class k00 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f112366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112367b;

    private k00(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView) {
        this.f112366a = linearLayout;
        this.f112367b = textView;
    }

    @androidx.annotation.n0
    public static k00 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20116, new Class[]{View.class}, k00.class);
        if (patchProxyResultProxy.isSupported) {
            return (k00) patchProxyResultProxy.result;
        }
        TextView textView = (TextView) l3.d.a(view, R.id.item_updateaccount);
        if (textView != null) {
            return new k00((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.item_updateaccount)));
    }

    @androidx.annotation.n0
    public static k00 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20114, new Class[]{LayoutInflater.class}, k00.class);
        return patchProxyResultProxy.isSupported ? (k00) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static k00 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20115, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, k00.class);
        if (patchProxyResultProxy.isSupported) {
            return (k00) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_updateaccount_dialog, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f112366a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20117, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
