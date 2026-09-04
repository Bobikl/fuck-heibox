package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutBottomExpandBarBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c30 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f109138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f109142e;

    private c30(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f109138a = relativeLayout;
        this.f109139b = linearLayout;
        this.f109140c = textView;
        this.f109141d = textView2;
        this.f109142e = relativeLayout2;
    }

    @androidx.annotation.n0
    public static c30 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20394, new Class[]{View.class}, c30.class);
        if (patchProxyResultProxy.isSupported) {
            return (c30) patchProxyResultProxy.result;
        }
        int i10 = R.id.ll_my_game_card_all_action;
        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_my_game_card_all_action);
        if (linearLayout != null) {
            i10 = R.id.tv_layout_all_action_text;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_layout_all_action_text);
            if (textView != null) {
                i10 = R.id.tv_layout_all_arrow;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_layout_all_arrow);
                if (textView2 != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    return new c30(relativeLayout, linearLayout, textView, textView2, relativeLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static c30 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20392, new Class[]{LayoutInflater.class}, c30.class);
        return patchProxyResultProxy.isSupported ? (c30) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static c30 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20393, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, c30.class);
        if (patchProxyResultProxy.isSupported) {
            return (c30) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_bottom_expand_bar, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f109138a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20395, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
