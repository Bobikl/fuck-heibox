package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemMallCatDescBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class xp implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f117605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117607c;

    private xp(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2) {
        this.f117605a = relativeLayout;
        this.f117606b = textView;
        this.f117607c = textView2;
    }

    @androidx.annotation.n0
    public static xp a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19032, new Class[]{View.class}, xp.class);
        if (patchProxyResultProxy.isSupported) {
            return (xp) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_desc;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_desc);
        if (textView != null) {
            i10 = R.id.tv_title;
            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_title);
            if (textView2 != null) {
                return new xp((RelativeLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static xp c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19030, new Class[]{LayoutInflater.class}, xp.class);
        return patchProxyResultProxy.isSupported ? (xp) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static xp d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19031, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, xp.class);
        if (patchProxyResultProxy.isSupported) {
            return (xp) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_mall_cat_desc, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f117605a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19033, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
