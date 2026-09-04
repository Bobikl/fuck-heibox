package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.hbcommon.component.QRCodeShareView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutShareSteamFriendCodeBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class sa0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f115521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f115522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115526f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115527g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115528h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115529i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115530j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115531k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115532l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115533m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115534n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final QRCodeShareView f115535o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115536p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f115537q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115538r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115539s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f115540t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final wh0 f115541u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f115542v;

    private sa0(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 QRCodeShareView qRCodeShareView, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 wh0 wh0Var, @androidx.annotation.n0 RelativeLayout relativeLayout3) {
        this.f115521a = cardView;
        this.f115522b = frameLayout;
        this.f115523c = imageView;
        this.f115524d = imageView2;
        this.f115525e = linearLayout;
        this.f115526f = textView;
        this.f115527g = textView2;
        this.f115528h = textView3;
        this.f115529i = textView4;
        this.f115530j = imageView3;
        this.f115531k = textView5;
        this.f115532l = textView6;
        this.f115533m = textView7;
        this.f115534n = textView8;
        this.f115535o = qRCodeShareView;
        this.f115536p = linearLayout2;
        this.f115537q = relativeLayout;
        this.f115538r = imageView4;
        this.f115539s = linearLayout3;
        this.f115540t = relativeLayout2;
        this.f115541u = wh0Var;
        this.f115542v = relativeLayout3;
    }

    @androidx.annotation.n0
    public static sa0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21182, new Class[]{View.class}, sa0.class);
        if (patchProxyResultProxy.isSupported) {
            return (sa0) patchProxyResultProxy.result;
        }
        int i10 = R.id.ctl_toolbar_wrapper;
        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.ctl_toolbar_wrapper);
        if (frameLayout != null) {
            i10 = R.id.iv_steam_detail_activity_head;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_steam_detail_activity_head);
            if (imageView != null) {
                i10 = R.id.iv_steam_detail_update_icon;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_steam_detail_update_icon);
                if (imageView2 != null) {
                    i10 = R.id.ll_info_wrapper;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_info_wrapper);
                    if (linearLayout != null) {
                        i10 = R.id.tv_friend_code;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_friend_code);
                        if (textView != null) {
                            i10 = R.id.tv_inviter_msg;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_inviter_msg);
                            if (textView2 != null) {
                                i10 = R.id.tv_signature;
                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_signature);
                                if (textView3 != null) {
                                    i10 = R.id.tv_steam_detail_activity_update_time;
                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_steam_detail_activity_update_time);
                                    if (textView4 != null) {
                                        i10 = R.id.tv_steam_detail_avatar;
                                        ImageView imageView3 = (ImageView) l3.d.a(view, R.id.tv_steam_detail_avatar);
                                        if (imageView3 != null) {
                                            i10 = R.id.tv_steam_detail_level;
                                            TextView textView5 = (TextView) l3.d.a(view, R.id.tv_steam_detail_level);
                                            if (textView5 != null) {
                                                i10 = R.id.tv_steam_detail_level_text;
                                                TextView textView6 = (TextView) l3.d.a(view, R.id.tv_steam_detail_level_text);
                                                if (textView6 != null) {
                                                    i10 = R.id.tv_steam_detail_nickname;
                                                    TextView textView7 = (TextView) l3.d.a(view, R.id.tv_steam_detail_nickname);
                                                    if (textView7 != null) {
                                                        i10 = R.id.tv_steam_detail_update_text;
                                                        TextView textView8 = (TextView) l3.d.a(view, R.id.tv_steam_detail_update_text);
                                                        if (textView8 != null) {
                                                            i10 = R.id.v_qr_code;
                                                            QRCodeShareView qRCodeShareView = (QRCodeShareView) l3.d.a(view, R.id.v_qr_code);
                                                            if (qRCodeShareView != null) {
                                                                i10 = R.id.vg_account_info;
                                                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_account_info);
                                                                if (linearLayout2 != null) {
                                                                    i10 = R.id.vg_avatar;
                                                                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_avatar);
                                                                    if (relativeLayout != null) {
                                                                        i10 = R.id.vg_avatar_frame;
                                                                        ImageView imageView4 = (ImageView) l3.d.a(view, R.id.vg_avatar_frame);
                                                                        if (imageView4 != null) {
                                                                            i10 = R.id.vg_friend_code;
                                                                            LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_friend_code);
                                                                            if (linearLayout3 != null) {
                                                                                i10 = R.id.vg_steam_detail_update;
                                                                                RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_steam_detail_update);
                                                                                if (relativeLayout2 != null) {
                                                                                    i10 = R.id.vg_steam_detail_value;
                                                                                    View viewA = l3.d.a(view, R.id.vg_steam_detail_value);
                                                                                    if (viewA != null) {
                                                                                        wh0 wh0VarA = wh0.a(viewA);
                                                                                        i10 = R.id.vg_steam_level_icon;
                                                                                        RelativeLayout relativeLayout3 = (RelativeLayout) l3.d.a(view, R.id.vg_steam_level_icon);
                                                                                        if (relativeLayout3 != null) {
                                                                                            return new sa0((CardView) view, frameLayout, imageView, imageView2, linearLayout, textView, textView2, textView3, textView4, imageView3, textView5, textView6, textView7, textView8, qRCodeShareView, linearLayout2, relativeLayout, imageView4, linearLayout3, relativeLayout2, wh0VarA, relativeLayout3);
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
    public static sa0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21180, new Class[]{LayoutInflater.class}, sa0.class);
        return patchProxyResultProxy.isSupported ? (sa0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static sa0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21181, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, sa0.class);
        if (patchProxyResultProxy.isSupported) {
            return (sa0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_share_steam_friend_code, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f115521a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21183, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
