package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivitySetTradeUrlBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class z1 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f118131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f118132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final WebView f118135e;

    private z1(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 WebView webView) {
        this.f118131a = linearLayout;
        this.f118132b = editText;
        this.f118133c = textView;
        this.f118134d = textView2;
        this.f118135e = webView;
    }

    @androidx.annotation.n0
    public static z1 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16548, new Class[]{View.class}, z1.class);
        if (patchProxyResultProxy.isSupported) {
            return (z1) patchProxyResultProxy.result;
        }
        int i10 = R.id.et_info;
        EditText editText = (EditText) l3.d.a(view, R.id.et_info);
        if (editText != null) {
            i10 = R.id.tv_auto_fetch;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_auto_fetch);
            if (textView != null) {
                i10 = R.id.tv_btn_confirm;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_btn_confirm);
                if (textView2 != null) {
                    i10 = R.id.tv_desc;
                    WebView webView = (WebView) l3.d.a(view, R.id.tv_desc);
                    if (webView != null) {
                        return new z1((LinearLayout) view, editText, textView, textView2, webView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static z1 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16546, new Class[]{LayoutInflater.class}, z1.class);
        return patchProxyResultProxy.isSupported ? (z1) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static z1 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16547, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, z1.class);
        if (patchProxyResultProxy.isSupported) {
            return (z1) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_set_trade_url, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f118131a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16549, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
