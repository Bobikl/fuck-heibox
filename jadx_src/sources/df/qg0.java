package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewNewStyleBannerBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class qg0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f114886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final Group f114887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f114889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final Space f114890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114893h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f114894i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f114895j;

    private qg0(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 Group group, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 Space space, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 View view, @androidx.annotation.n0 View view2) {
        this.f114886a = constraintLayout;
        this.f114887b = group;
        this.f114888c = imageView;
        this.f114889d = qMUIRadiusImageView;
        this.f114890e = space;
        this.f114891f = textView;
        this.f114892g = textView2;
        this.f114893h = textView3;
        this.f114894i = view;
        this.f114895j = view2;
    }

    @androidx.annotation.n0
    public static qg0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21786, new Class[]{View.class}, qg0.class);
        if (patchProxyResultProxy.isSupported) {
            return (qg0) patchProxyResultProxy.result;
        }
        int i10 = R.id.group_close;
        Group group = (Group) l3.d.a(view, R.id.group_close);
        if (group != null) {
            i10 = R.id.iv_banner_close;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_banner_close);
            if (imageView != null) {
                i10 = R.id.iv_banner_icon;
                QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_banner_icon);
                if (qMUIRadiusImageView != null) {
                    i10 = R.id.space_banner_close;
                    Space space = (Space) l3.d.a(view, R.id.space_banner_close);
                    if (space != null) {
                        i10 = R.id.tv_banner_action;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_banner_action);
                        if (textView != null) {
                            i10 = R.id.tv_banner_desc;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_banner_desc);
                            if (textView2 != null) {
                                i10 = R.id.tv_banner_title;
                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_banner_title);
                                if (textView3 != null) {
                                    i10 = R.id.v_banner_close;
                                    View viewA = l3.d.a(view, R.id.v_banner_close);
                                    if (viewA != null) {
                                        i10 = R.id.v_bg;
                                        View viewA2 = l3.d.a(view, R.id.v_bg);
                                        if (viewA2 != null) {
                                            return new qg0((ConstraintLayout) view, group, imageView, qMUIRadiusImageView, space, textView, textView2, textView3, viewA, viewA2);
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
    public static qg0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21784, new Class[]{LayoutInflater.class}, qg0.class);
        return patchProxyResultProxy.isSupported ? (qg0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static qg0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21785, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, qg0.class);
        if (patchProxyResultProxy.isSupported) {
            return (qg0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_new_style_banner, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f114886a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21787, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
