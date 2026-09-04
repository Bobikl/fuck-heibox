package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: HeaderGamePreviewListBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class kc implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f112541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f112542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f112545e;

    private kc(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f112541a = linearLayout;
        this.f112542b = editText;
        this.f112543c = textView;
        this.f112544d = textView2;
        this.f112545e = relativeLayout;
    }

    @androidx.annotation.n0
    public static kc a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17632, new Class[]{View.class}, kc.class);
        if (patchProxyResultProxy.isSupported) {
            return (kc) patchProxyResultProxy.result;
        }
        int i10 = R.id.et_search_game;
        EditText editText = (EditText) l3.d.a(view, R.id.et_search_game);
        if (editText != null) {
            i10 = R.id.tv_filter;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_filter);
            if (textView != null) {
                i10 = R.id.tv_my;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_my);
                if (textView2 != null) {
                    i10 = R.id.vg_search_game;
                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_search_game);
                    if (relativeLayout != null) {
                        return new kc((LinearLayout) view, editText, textView, textView2, relativeLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static kc c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17630, new Class[]{LayoutInflater.class}, kc.class);
        return patchProxyResultProxy.isSupported ? (kc) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static kc d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17631, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, kc.class);
        if (patchProxyResultProxy.isSupported) {
            return (kc) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.header_game_preview_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f112541a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17633, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
