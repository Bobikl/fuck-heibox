package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewUserItemContentBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class gi0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f111013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f111014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111016d;

    private gi0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2) {
        this.f111013a = relativeLayout;
        this.f111014b = relativeLayout2;
        this.f111015c = textView;
        this.f111016d = textView2;
    }

    @androidx.annotation.n0
    public static gi0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21950, new Class[]{View.class}, gi0.class);
        if (patchProxyResultProxy.isSupported) {
            return (gi0) patchProxyResultProxy.result;
        }
        int i10 = R.id.rl_medal_level;
        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.rl_medal_level);
        if (relativeLayout != null) {
            i10 = R.id.tv_desc;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_desc);
            if (textView != null) {
                i10 = R.id.tv_name;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_name);
                if (textView2 != null) {
                    return new gi0((RelativeLayout) view, relativeLayout, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static gi0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21948, new Class[]{LayoutInflater.class}, gi0.class);
        return patchProxyResultProxy.isSupported ? (gi0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static gi0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21949, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, gi0.class);
        if (patchProxyResultProxy.isSupported) {
            return (gi0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_user_item_content, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f111013a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21951, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
