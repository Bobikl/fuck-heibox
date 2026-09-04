package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcommon.component.MoreButton;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: MallComponentOrderActionBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class kc0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f112546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f112547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final MoreButton f112549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final Space f112550e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112551f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112552g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112553h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112554i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112555j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f112556k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f112557l;

    private kc0(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 View view, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 MoreButton moreButton, @androidx.annotation.n0 Space space, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 View view2, @androidx.annotation.n0 View view3) {
        this.f112546a = constraintLayout;
        this.f112547b = view;
        this.f112548c = imageView;
        this.f112549d = moreButton;
        this.f112550e = space;
        this.f112551f = textView;
        this.f112552g = textView2;
        this.f112553h = textView3;
        this.f112554i = textView4;
        this.f112555j = textView5;
        this.f112556k = view2;
        this.f112557l = view3;
    }

    @androidx.annotation.n0
    public static kc0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21353, new Class[]{View.class}, kc0.class);
        if (patchProxyResultProxy.isSupported) {
            return (kc0) patchProxyResultProxy.result;
        }
        int i10 = R.id.bottom_space;
        View viewA = l3.d.a(view, R.id.bottom_space);
        if (viewA != null) {
            i10 = R.id.iv_icon;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_icon);
            if (imageView != null) {
                i10 = R.id.mb_action;
                MoreButton moreButton = (MoreButton) l3.d.a(view, R.id.mb_action);
                if (moreButton != null) {
                    i10 = R.id.top_space;
                    Space space = (Space) l3.d.a(view, R.id.top_space);
                    if (space != null) {
                        i10 = R.id.tv_copy;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_copy);
                        if (textView != null) {
                            i10 = R.id.tv_desc;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_desc);
                            if (textView2 != null) {
                                i10 = R.id.tv_desc_old;
                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_desc_old);
                                if (textView3 != null) {
                                    i10 = R.id.tv_send_to_pc;
                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_send_to_pc);
                                    if (textView4 != null) {
                                        i10 = R.id.tv_title;
                                        TextView textView5 = (TextView) l3.d.a(view, R.id.tv_title);
                                        if (textView5 != null) {
                                            i10 = R.id.vertical_space;
                                            View viewA2 = l3.d.a(view, R.id.vertical_space);
                                            if (viewA2 != null) {
                                                i10 = R.id.view_cdk_bg;
                                                View viewA3 = l3.d.a(view, R.id.view_cdk_bg);
                                                if (viewA3 != null) {
                                                    return new kc0((ConstraintLayout) view, viewA, imageView, moreButton, space, textView, textView2, textView3, textView4, textView5, viewA2, viewA3);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static kc0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21351, new Class[]{LayoutInflater.class}, kc0.class);
        return patchProxyResultProxy.isSupported ? (kc0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static kc0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21352, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, kc0.class);
        if (patchProxyResultProxy.isSupported) {
            return (kc0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.mall_component_order_action, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f112546a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21354, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
