package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcustomview.MarqueeTextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityItemPutOnBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b1 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f108704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CheckBox f108705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final MarqueeTextView f108709f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108710g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108711h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f108712i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108713j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f108714k;

    private b1(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 CheckBox checkBox, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 MarqueeTextView marqueeTextView, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 FrameLayout frameLayout) {
        this.f108704a = linearLayout;
        this.f108705b = checkBox;
        this.f108706c = textView;
        this.f108707d = textView2;
        this.f108708e = textView3;
        this.f108709f = marqueeTextView;
        this.f108710g = textView4;
        this.f108711h = textView5;
        this.f108712i = relativeLayout;
        this.f108713j = linearLayout2;
        this.f108714k = frameLayout;
    }

    @androidx.annotation.n0
    public static b1 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16452, new Class[]{View.class}, b1.class);
        if (patchProxyResultProxy.isSupported) {
            return (b1) patchProxyResultProxy.result;
        }
        int i10 = R.id.cb_merge;
        CheckBox checkBox = (CheckBox) l3.d.a(view, R.id.cb_merge);
        if (checkBox != null) {
            i10 = R.id.tv_btn_confirm;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_btn_confirm);
            if (textView != null) {
                i10 = R.id.tv_fee_rate;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_fee_rate);
                if (textView2 != null) {
                    i10 = R.id.tv_merge;
                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_merge);
                    if (textView3 != null) {
                        i10 = R.id.tv_message;
                        MarqueeTextView marqueeTextView = (MarqueeTextView) l3.d.a(view, R.id.tv_message);
                        if (marqueeTextView != null) {
                            i10 = R.id.tv_price_symbol;
                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_price_symbol);
                            if (textView4 != null) {
                                i10 = R.id.tv_profit;
                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_profit);
                                if (textView5 != null) {
                                    i10 = R.id.vg_bottom_bar;
                                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_bottom_bar);
                                    if (relativeLayout != null) {
                                        i10 = R.id.vg_merge;
                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_merge);
                                        if (linearLayout != null) {
                                            i10 = R.id.vg_message;
                                            FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_message);
                                            if (frameLayout != null) {
                                                return new b1((LinearLayout) view, checkBox, textView, textView2, textView3, marqueeTextView, textView4, textView5, relativeLayout, linearLayout, frameLayout);
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
    public static b1 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16450, new Class[]{LayoutInflater.class}, b1.class);
        return patchProxyResultProxy.isSupported ? (b1) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static b1 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16451, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, b1.class);
        if (patchProxyResultProxy.isSupported) {
            return (b1) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_item_put_on, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f108704a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16453, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
