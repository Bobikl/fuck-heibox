package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcustomview.SwitchButton.SwitchButton;
import com.max.hbcustomview.tickerview.TickerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemAvatarDecorListHeaderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ld implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f113003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final SwitchButton f113006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TickerView f113008f;

    private ld(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 SwitchButton switchButton, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TickerView tickerView) {
        this.f113003a = relativeLayout;
        this.f113004b = textView;
        this.f113005c = linearLayout;
        this.f113006d = switchButton;
        this.f113007e = textView2;
        this.f113008f = tickerView;
    }

    @androidx.annotation.n0
    public static ld a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17740, new Class[]{View.class}, ld.class);
        if (patchProxyResultProxy.isSupported) {
            return (ld) patchProxyResultProxy.result;
        }
        int i10 = R.id.desc;
        TextView textView = (TextView) l3.d.a(view, R.id.desc);
        if (textView != null) {
            i10 = R.id.ll_subscribe;
            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_subscribe);
            if (linearLayout != null) {
                i10 = R.id.switch_subscribe;
                SwitchButton switchButton = (SwitchButton) l3.d.a(view, R.id.switch_subscribe);
                if (switchButton != null) {
                    i10 = R.id.title;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.title);
                    if (textView2 != null) {
                        i10 = R.id.tv_time;
                        TickerView tickerView = (TickerView) l3.d.a(view, R.id.tv_time);
                        if (tickerView != null) {
                            return new ld((RelativeLayout) view, textView, linearLayout, switchButton, textView2, tickerView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ld c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17738, new Class[]{LayoutInflater.class}, ld.class);
        return patchProxyResultProxy.isSupported ? (ld) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ld d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17739, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ld.class);
        if (patchProxyResultProxy.isSupported) {
            return (ld) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_avatar_decor_list_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f113003a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17741, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
