package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogTradeNotifyTipsBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class s6 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f115478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115481d;

    private s6(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3) {
        this.f115478a = linearLayout;
        this.f115479b = textView;
        this.f115480c = textView2;
        this.f115481d = textView3;
    }

    @androidx.annotation.n0
    public static s6 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17040, new Class[]{View.class}, s6.class);
        if (patchProxyResultProxy.isSupported) {
            return (s6) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_push_app;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_push_app);
        if (textView != null) {
            i10 = R.id.tv_push_note;
            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_push_note);
            if (textView2 != null) {
                i10 = R.id.tv_push_wechat;
                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_push_wechat);
                if (textView3 != null) {
                    return new s6((LinearLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static s6 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17038, new Class[]{LayoutInflater.class}, s6.class);
        return patchProxyResultProxy.isSupported ? (s6) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static s6 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17039, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, s6.class);
        if (patchProxyResultProxy.isSupported) {
            return (s6) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_trade_notify_tips, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f115478a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17041, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
