package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewSteamValueCardXBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class wh0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f117190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f117194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117195f;

    private wh0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f117190a = linearLayout;
        this.f117191b = linearLayout2;
        this.f117192c = imageView;
        this.f117193d = textView;
        this.f117194e = relativeLayout;
        this.f117195f = linearLayout3;
    }

    @androidx.annotation.n0
    public static wh0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21912, new Class[]{View.class}, wh0.class);
        if (patchProxyResultProxy.isSupported) {
            return (wh0) patchProxyResultProxy.result;
        }
        int i10 = R.id.gl_steam_value_card_x;
        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.gl_steam_value_card_x);
        if (linearLayout != null) {
            i10 = R.id.iv_steam_value_card_sign;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_steam_value_card_sign);
            if (imageView != null) {
                i10 = R.id.tv_steam_value_card_text;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_steam_value_card_text);
                if (textView != null) {
                    i10 = R.id.vg_steam_value_card_operator_panel;
                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_steam_value_card_operator_panel);
                    if (relativeLayout != null) {
                        LinearLayout linearLayout2 = (LinearLayout) view;
                        return new wh0(linearLayout2, linearLayout, imageView, textView, relativeLayout, linearLayout2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static wh0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21910, new Class[]{LayoutInflater.class}, wh0.class);
        return patchProxyResultProxy.isSupported ? (wh0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static wh0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21911, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, wh0.class);
        if (patchProxyResultProxy.isSupported) {
            return (wh0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_steam_value_card_x, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f117190a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21913, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
