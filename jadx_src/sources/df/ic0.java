package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.PlatformDataView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutXboxGameDataCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ic0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f111756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111761f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final PlatformDataView f111762g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final PlatformDataView f111763h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final PlatformDataView f111764i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111765j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111766k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111767l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111768m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f111769n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f111770o;

    private ic0(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 PlatformDataView platformDataView, @androidx.annotation.n0 PlatformDataView platformDataView2, @androidx.annotation.n0 PlatformDataView platformDataView3, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 View view, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f111756a = cardView;
        this.f111757b = imageView;
        this.f111758c = imageView2;
        this.f111759d = imageView3;
        this.f111760e = imageView4;
        this.f111761f = linearLayout;
        this.f111762g = platformDataView;
        this.f111763h = platformDataView2;
        this.f111764i = platformDataView3;
        this.f111765j = textView;
        this.f111766k = textView2;
        this.f111767l = textView3;
        this.f111768m = textView4;
        this.f111769n = view;
        this.f111770o = relativeLayout;
    }

    @androidx.annotation.n0
    public static ic0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21345, new Class[]{View.class}, ic0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ic0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_avatar;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_avatar);
        if (imageView != null) {
            i10 = R.id.iv_bg;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_bg);
            if (imageView2 != null) {
                i10 = R.id.iv_icon;
                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_icon);
                if (imageView3 != null) {
                    i10 = R.id.iv_mask;
                    ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_mask);
                    if (imageView4 != null) {
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
                                                                return new ic0((CardView) view, imageView, imageView2, imageView3, imageView4, linearLayout, platformDataView, platformDataView2, platformDataView3, textView, textView2, textView3, textView4, viewA, relativeLayout);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ic0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21343, new Class[]{LayoutInflater.class}, ic0.class);
        return patchProxyResultProxy.isSupported ? (ic0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ic0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21344, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ic0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ic0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_xbox_game_data_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f111756a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21346, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
