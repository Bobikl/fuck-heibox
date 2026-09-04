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

/* JADX INFO: compiled from: GgccvSteamUnownedBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class hc implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f111394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111397d;

    private hc(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f111394a = linearLayout;
        this.f111395b = textView;
        this.f111396c = textView2;
        this.f111397d = linearLayout2;
    }

    @androidx.annotation.n0
    public static hc a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17620, new Class[]{View.class}, hc.class);
        if (patchProxyResultProxy.isSupported) {
            return (hc) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_comment_hint;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_comment_hint);
        if (textView != null) {
            i10 = R.id.tv_edit_hint;
            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_edit_hint);
            if (textView2 != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new hc(linearLayout, textView, textView2, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static hc c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17618, new Class[]{LayoutInflater.class}, hc.class);
        return patchProxyResultProxy.isSupported ? (hc) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static hc d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17619, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, hc.class);
        if (patchProxyResultProxy.isSupported) {
            return (hc) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.ggccv_steam_unowned, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f111394a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17621, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
