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

/* JADX INFO: compiled from: LayoutEpicGameDataCardV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class k40 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f112411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final PlatformDataView f112415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final PlatformDataView f112416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final PlatformDataView f112417g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112418h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112419i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112420j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112421k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112422l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f112423m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f112424n;

    private k40(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 PlatformDataView platformDataView, @androidx.annotation.n0 PlatformDataView platformDataView2, @androidx.annotation.n0 PlatformDataView platformDataView3, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 View view, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f112411a = cardView;
        this.f112412b = imageView;
        this.f112413c = imageView2;
        this.f112414d = linearLayout;
        this.f112415e = platformDataView;
        this.f112416f = platformDataView2;
        this.f112417g = platformDataView3;
        this.f112418h = textView;
        this.f112419i = textView2;
        this.f112420j = textView3;
        this.f112421k = textView4;
        this.f112422l = textView5;
        this.f112423m = view;
        this.f112424n = relativeLayout;
    }

    @androidx.annotation.n0
    public static k40 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20528, new Class[]{View.class}, k40.class);
        if (patchProxyResultProxy.isSupported) {
            return (k40) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_bg;
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
                                    i10 = R.id.tv_avatar;
                                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_avatar);
                                    if (textView2 != null) {
                                        i10 = R.id.tv_nickname;
                                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_nickname);
                                        if (textView3 != null) {
                                            i10 = R.id.tv_no_friends;
                                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_no_friends);
                                            if (textView4 != null) {
                                                i10 = R.id.tv_online_state;
                                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_online_state);
                                                if (textView5 != null) {
                                                    i10 = R.id.v_placeholder;
                                                    View viewA = l3.d.a(view, R.id.v_placeholder);
                                                    if (viewA != null) {
                                                        i10 = R.id.vg_friends;
                                                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_friends);
                                                        if (relativeLayout != null) {
                                                            return new k40((CardView) view, imageView, imageView2, linearLayout, platformDataView, platformDataView2, platformDataView3, textView, textView2, textView3, textView4, textView5, viewA, relativeLayout);
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
    public static k40 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20526, new Class[]{LayoutInflater.class}, k40.class);
        return patchProxyResultProxy.isSupported ? (k40) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static k40 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20527, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, k40.class);
        if (patchProxyResultProxy.isSupported) {
            return (k40) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_epic_game_data_card_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f112411a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20529, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
