package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcommon.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemTextView2PaddingBinding.java */
/* JADX INFO: loaded from: classes9.dex */
public final class h0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f131561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f131562b;

    private h0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 TextView textView) {
        this.f131561a = relativeLayout;
        this.f131562b = textView;
    }

    @androidx.annotation.n0
    public static h0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.e.X7, new Class[]{View.class}, h0.class);
        if (patchProxyResultProxy.isSupported) {
            return (h0) patchProxyResultProxy.result;
        }
        int i10 = R.id.text1;
        TextView textView = (TextView) l3.d.a(view, i10);
        if (textView != null) {
            return new h0((RelativeLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static h0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.e.V7, new Class[]{LayoutInflater.class}, h0.class);
        return patchProxyResultProxy.isSupported ? (h0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static h0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.e.W7, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, h0.class);
        if (patchProxyResultProxy.isSupported) {
            return (h0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_text_view_2_padding, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f131561a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.Y7, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
