package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemTradeProfileToolsBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c00 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f109092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f109093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109094c;

    private c00(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 TextView textView) {
        this.f109092a = linearLayout;
        this.f109093b = qMUIRadiusImageView;
        this.f109094c = textView;
    }

    @androidx.annotation.n0
    public static c00 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20084, new Class[]{View.class}, c00.class);
        if (patchProxyResultProxy.isSupported) {
            return (c00) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_icon;
        QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_icon);
        if (qMUIRadiusImageView != null) {
            i10 = R.id.tv_name;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_name);
            if (textView != null) {
                return new c00((LinearLayout) view, qMUIRadiusImageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static c00 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20082, new Class[]{LayoutInflater.class}, c00.class);
        return patchProxyResultProxy.isSupported ? (c00) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static c00 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20083, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, c00.class);
        if (patchProxyResultProxy.isSupported) {
            return (c00) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_trade_profile_tools, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f109092a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20085, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
