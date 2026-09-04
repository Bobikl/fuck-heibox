package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemSearchToolCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ey implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f110318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f110319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110323f;

    private ey(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4) {
        this.f110318a = frameLayout;
        this.f110319b = qMUIRadiusImageView;
        this.f110320c = textView;
        this.f110321d = textView2;
        this.f110322e = textView3;
        this.f110323f = textView4;
    }

    @androidx.annotation.n0
    public static ey a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19884, new Class[]{View.class}, ey.class);
        if (patchProxyResultProxy.isSupported) {
            return (ey) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_image;
        QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_image);
        if (qMUIRadiusImageView != null) {
            i10 = R.id.tv_button;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_button);
            if (textView != null) {
                i10 = R.id.tv_desc;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_desc);
                if (textView2 != null) {
                    i10 = R.id.tv_tag;
                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_tag);
                    if (textView3 != null) {
                        i10 = R.id.tv_title;
                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_title);
                        if (textView4 != null) {
                            return new ey((FrameLayout) view, qMUIRadiusImageView, textView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ey c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19882, new Class[]{LayoutInflater.class}, ey.class);
        return patchProxyResultProxy.isSupported ? (ey) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ey d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19883, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ey.class);
        if (patchProxyResultProxy.isSupported) {
            return (ey) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_search_tool_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f110318a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19885, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
