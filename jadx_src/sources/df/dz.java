package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemSubscribeAwardsBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class dz implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f109925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f109926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f109927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109930f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109931g;

    private dz(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 View view, @androidx.annotation.n0 View view2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3) {
        this.f109925a = linearLayout;
        this.f109926b = view;
        this.f109927c = view2;
        this.f109928d = imageView;
        this.f109929e = textView;
        this.f109930f = textView2;
        this.f109931g = textView3;
    }

    @androidx.annotation.n0
    public static dz a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19984, new Class[]{View.class}, dz.class);
        if (patchProxyResultProxy.isSupported) {
            return (dz) patchProxyResultProxy.result;
        }
        int i10 = R.id.indicator_bottom;
        View viewA = l3.d.a(view, R.id.indicator_bottom);
        if (viewA != null) {
            i10 = R.id.indicator_top;
            View viewA2 = l3.d.a(view, R.id.indicator_top);
            if (viewA2 != null) {
                i10 = R.id.iv_img;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_img);
                if (imageView != null) {
                    i10 = R.id.tv_desc;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_desc);
                    if (textView != null) {
                        i10 = R.id.tv_num;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_num);
                        if (textView2 != null) {
                            i10 = R.id.tv_title;
                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_title);
                            if (textView3 != null) {
                                return new dz((LinearLayout) view, viewA, viewA2, imageView, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static dz c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19982, new Class[]{LayoutInflater.class}, dz.class);
        return patchProxyResultProxy.isSupported ? (dz) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static dz d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19983, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, dz.class);
        if (patchProxyResultProxy.isSupported) {
            return (dz) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_subscribe_awards, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f109925a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19985, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
