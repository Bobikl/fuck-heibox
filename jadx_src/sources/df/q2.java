package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.hbcustomview.MarqueeTextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: ActivityTradeAccountSettingBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class q2 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final SmartRefreshLayout f114661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final m70 f114662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final m70 f114663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final m70 f114664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f114667g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114668h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114669i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114670j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final MarqueeTextView f114671k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114672l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114673m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114674n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114675o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114676p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f114677q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f114678r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114679s;

    private q2(@androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 m70 m70Var, @androidx.annotation.n0 m70 m70Var2, @androidx.annotation.n0 m70 m70Var3, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 MarqueeTextView marqueeTextView, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 FrameLayout frameLayout2, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f114661a = smartRefreshLayout;
        this.f114662b = m70Var;
        this.f114663c = m70Var2;
        this.f114664d = m70Var3;
        this.f114665e = imageView;
        this.f114666f = imageView2;
        this.f114667g = smartRefreshLayout2;
        this.f114668h = textView;
        this.f114669i = textView2;
        this.f114670j = textView3;
        this.f114671k = marqueeTextView;
        this.f114672l = textView4;
        this.f114673m = textView5;
        this.f114674n = textView6;
        this.f114675o = textView7;
        this.f114676p = textView8;
        this.f114677q = frameLayout;
        this.f114678r = frameLayout2;
        this.f114679s = linearLayout;
    }

    @androidx.annotation.n0
    public static q2 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16616, new Class[]{View.class}, q2.class);
        if (patchProxyResultProxy.isSupported) {
            return (q2) patchProxyResultProxy.result;
        }
        int i10 = R.id.item_setting_1;
        View viewA = l3.d.a(view, R.id.item_setting_1);
        if (viewA != null) {
            m70 m70VarA = m70.a(viewA);
            i10 = R.id.item_setting_2;
            View viewA2 = l3.d.a(view, R.id.item_setting_2);
            if (viewA2 != null) {
                m70 m70VarA2 = m70.a(viewA2);
                i10 = R.id.item_setting_3;
                View viewA3 = l3.d.a(view, R.id.item_setting_3);
                if (viewA3 != null) {
                    m70 m70VarA3 = m70.a(viewA3);
                    i10 = R.id.iv_avartar;
                    ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_avartar);
                    if (imageView != null) {
                        i10 = R.id.iv_trade_state;
                        ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_trade_state);
                        if (imageView2 != null) {
                            SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) view;
                            i10 = R.id.tv_change_bind;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_change_bind);
                            if (textView != null) {
                                i10 = R.id.tv_join_date;
                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_join_date);
                                if (textView2 != null) {
                                    i10 = R.id.tv_join_desc;
                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_join_desc);
                                    if (textView3 != null) {
                                        i10 = R.id.tv_message;
                                        MarqueeTextView marqueeTextView = (MarqueeTextView) l3.d.a(view, R.id.tv_message);
                                        if (marqueeTextView != null) {
                                            i10 = R.id.tv_name;
                                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_name);
                                            if (textView4 != null) {
                                                i10 = R.id.tv_steam_id;
                                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_steam_id);
                                                if (textView5 != null) {
                                                    i10 = R.id.tv_trade_state;
                                                    TextView textView6 = (TextView) l3.d.a(view, R.id.tv_trade_state);
                                                    if (textView6 != null) {
                                                        i10 = R.id.tv_unbind;
                                                        TextView textView7 = (TextView) l3.d.a(view, R.id.tv_unbind);
                                                        if (textView7 != null) {
                                                            i10 = R.id.tv_update;
                                                            TextView textView8 = (TextView) l3.d.a(view, R.id.tv_update);
                                                            if (textView8 != null) {
                                                                i10 = R.id.vg_avartar;
                                                                FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_avartar);
                                                                if (frameLayout != null) {
                                                                    i10 = R.id.vg_message;
                                                                    FrameLayout frameLayout2 = (FrameLayout) l3.d.a(view, R.id.vg_message);
                                                                    if (frameLayout2 != null) {
                                                                        i10 = R.id.vg_state;
                                                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_state);
                                                                        if (linearLayout != null) {
                                                                            return new q2(smartRefreshLayout, m70VarA, m70VarA2, m70VarA3, imageView, imageView2, smartRefreshLayout, textView, textView2, textView3, marqueeTextView, textView4, textView5, textView6, textView7, textView8, frameLayout, frameLayout2, linearLayout);
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
    public static q2 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16614, new Class[]{LayoutInflater.class}, q2.class);
        return patchProxyResultProxy.isSupported ? (q2) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static q2 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16615, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, q2.class);
        if (patchProxyResultProxy.isSupported) {
            return (q2) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_trade_account_setting, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public SmartRefreshLayout b() {
        return this.f114661a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16617, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
