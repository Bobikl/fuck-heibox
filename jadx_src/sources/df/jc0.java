package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.PlatformDataView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutXboxGameDataCardV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class jc0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f112127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f112128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final PlatformDataView f112132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final PlatformDataView f112133g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final PlatformDataView f112134h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112135i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112136j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112137k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112138l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f112139m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f112140n;

    private jc0(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 PlatformDataView platformDataView, @androidx.annotation.n0 PlatformDataView platformDataView2, @androidx.annotation.n0 PlatformDataView platformDataView3, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 View view, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f112127a = cardView;
        this.f112128b = qMUIRadiusImageView;
        this.f112129c = imageView;
        this.f112130d = imageView2;
        this.f112131e = linearLayout;
        this.f112132f = platformDataView;
        this.f112133g = platformDataView2;
        this.f112134h = platformDataView3;
        this.f112135i = textView;
        this.f112136j = textView2;
        this.f112137k = textView3;
        this.f112138l = textView4;
        this.f112139m = view;
        this.f112140n = relativeLayout;
    }

    @androidx.annotation.n0
    public static jc0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21349, new Class[]{View.class}, jc0.class);
        if (patchProxyResultProxy.isSupported) {
            return (jc0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_avatar;
        QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_avatar);
        if (qMUIRadiusImageView != null) {
            i10 = R.id.iv_bg;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_bg);
            if (imageView != null) {
                i10 = R.id.iv_mask;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_mask);
                if (imageView2 != null) {
                    i10 = R.id.ll_friends;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_friends);
                    if (linearLayout != null) {
                        i10 = R.id.pdv0;
                        PlatformDataView platformDataView = (PlatformDataView) l3.d.a(view, R.id.pdv0);
                        if (platformDataView != null) {
                            i10 = R.id.pdv1;
                            PlatformDataView platformDataView2 = (PlatformDataView) l3.d.a(view, R.id.pdv1);
                            if (platformDataView2 != null) {
                                i10 = R.id.pdv2;
                                PlatformDataView platformDataView3 = (PlatformDataView) l3.d.a(view, R.id.pdv2);
                                if (platformDataView3 != null) {
                                    i10 = R.id.tv_account_state;
                                    TextView textView = (TextView) l3.d.a(view, R.id.tv_account_state);
                                    if (textView != null) {
                                        i10 = R.id.tv_nickname;
                                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_nickname);
                                        if (textView2 != null) {
                                            i10 = R.id.tv_no_friends_tips;
                                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_no_friends_tips);
                                            if (textView3 != null) {
                                                i10 = R.id.tv_online_state;
                                                TextView textView4 = (TextView) l3.d.a(view, R.id.tv_online_state);
                                                if (textView4 != null) {
                                                    i10 = R.id.v_placeholder;
                                                    View viewA = l3.d.a(view, R.id.v_placeholder);
                                                    if (viewA != null) {
                                                        i10 = R.id.vg_friends;
                                                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_friends);
                                                        if (relativeLayout != null) {
                                                            return new jc0((CardView) view, qMUIRadiusImageView, imageView, imageView2, linearLayout, platformDataView, platformDataView2, platformDataView3, textView, textView2, textView3, textView4, viewA, relativeLayout);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static jc0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21347, new Class[]{LayoutInflater.class}, jc0.class);
        return patchProxyResultProxy.isSupported ? (jc0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static jc0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21348, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, jc0.class);
        if (patchProxyResultProxy.isSupported) {
            return (jc0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_xbox_game_data_card_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f112127a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21350, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
