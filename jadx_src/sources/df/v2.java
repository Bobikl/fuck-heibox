package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcustomview.SwitchButton.SwitchButton;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityTradeSellSettingsBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class v2 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f116573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final SwitchButton f116574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final SwitchButton f116575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116577e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116578f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116579g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116580h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f116581i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f116582j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116583k;

    private v2(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 SwitchButton switchButton, @androidx.annotation.n0 SwitchButton switchButton2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f116573a = linearLayout;
        this.f116574b = switchButton;
        this.f116575c = switchButton2;
        this.f116576d = textView;
        this.f116577e = textView2;
        this.f116578f = textView3;
        this.f116579g = textView4;
        this.f116580h = textView5;
        this.f116581i = relativeLayout;
        this.f116582j = relativeLayout2;
        this.f116583k = linearLayout2;
    }

    @androidx.annotation.n0
    public static v2 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16636, new Class[]{View.class}, v2.class);
        if (patchProxyResultProxy.isSupported) {
            return (v2) patchProxyResultProxy.result;
        }
        int i10 = R.id.sb_sell_state;
        SwitchButton switchButton = (SwitchButton) l3.d.a(view, R.id.sb_sell_state);
        if (switchButton != null) {
            i10 = R.id.sb_timing_sell;
            SwitchButton switchButton2 = (SwitchButton) l3.d.a(view, R.id.sb_timing_sell);
            if (switchButton2 != null) {
                i10 = R.id.tv_sell_state;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_sell_state);
                if (textView != null) {
                    i10 = R.id.tv_sell_state_desc;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_sell_state_desc);
                    if (textView2 != null) {
                        i10 = R.id.tv_start_time;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_start_time);
                        if (textView3 != null) {
                            i10 = R.id.tv_stop_time;
                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_stop_time);
                            if (textView4 != null) {
                                i10 = R.id.tv_timing_sell;
                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_timing_sell);
                                if (textView5 != null) {
                                    i10 = R.id.vg_start_time;
                                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_start_time);
                                    if (relativeLayout != null) {
                                        i10 = R.id.vg_stop_time;
                                        RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_stop_time);
                                        if (relativeLayout2 != null) {
                                            i10 = R.id.vg_time_set;
                                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_time_set);
                                            if (linearLayout != null) {
                                                return new v2((LinearLayout) view, switchButton, switchButton2, textView, textView2, textView3, textView4, textView5, relativeLayout, relativeLayout2, linearLayout);
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
    public static v2 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16634, new Class[]{LayoutInflater.class}, v2.class);
        return patchProxyResultProxy.isSupported ? (v2) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static v2 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16635, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, v2.class);
        if (patchProxyResultProxy.isSupported) {
            return (v2) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_trade_sell_settings, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f116573a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16637, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
