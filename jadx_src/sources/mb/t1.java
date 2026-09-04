package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcommon.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewSegmentFilterSelectedBinding.java */
/* JADX INFO: loaded from: classes9.dex */
public final class t1 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f131766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final HorizontalScrollView f131767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f131768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f131769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f131770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f131771f;

    private t1(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 HorizontalScrollView horizontalScrollView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 View view, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f131766a = relativeLayout;
        this.f131767b = horizontalScrollView;
        this.f131768c = textView;
        this.f131769d = view;
        this.f131770e = linearLayout;
        this.f131771f = relativeLayout2;
    }

    @androidx.annotation.n0
    public static t1 a(@androidx.annotation.n0 View view) {
        View viewA;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.e.Ta, new Class[]{View.class}, t1.class);
        if (patchProxyResultProxy.isSupported) {
            return (t1) patchProxyResultProxy.result;
        }
        int i10 = R.id.hsv_checked_filter;
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) l3.d.a(view, i10);
        if (horizontalScrollView != null) {
            i10 = R.id.tv_reset_btn;
            TextView textView = (TextView) l3.d.a(view, i10);
            if (textView != null && (viewA = l3.d.a(view, (i10 = R.id.v_shadow))) != null) {
                i10 = R.id.vg_checked_filter;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, i10);
                if (linearLayout != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    return new t1(relativeLayout, horizontalScrollView, textView, viewA, linearLayout, relativeLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static t1 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.e.Ra, new Class[]{LayoutInflater.class}, t1.class);
        return patchProxyResultProxy.isSupported ? (t1) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static t1 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.e.Sa, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, t1.class);
        if (patchProxyResultProxy.isSupported) {
            return (t1) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_segment_filter_selected, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f131766a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.Ua, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
