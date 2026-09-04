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

/* JADX INFO: compiled from: ViewDota2UserTitleBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class jf0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f112174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112178e;

    private jf0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4) {
        this.f112174a = relativeLayout;
        this.f112175b = textView;
        this.f112176c = textView2;
        this.f112177d = textView3;
        this.f112178e = textView4;
    }

    @androidx.annotation.n0
    public static jf0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21658, new Class[]{View.class}, jf0.class);
        if (patchProxyResultProxy.isSupported) {
            return (jf0) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_match_num;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_match_num);
        if (textView != null) {
            i10 = R.id.tv_mmr;
            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_mmr);
            if (textView2 != null) {
                i10 = R.id.tv_user;
                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_user);
                if (textView3 != null) {
                    i10 = R.id.tv_win_rate;
                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_win_rate);
                    if (textView4 != null) {
                        return new jf0((RelativeLayout) view, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static jf0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21656, new Class[]{LayoutInflater.class}, jf0.class);
        return patchProxyResultProxy.isSupported ? (jf0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static jf0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21657, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, jf0.class);
        if (patchProxyResultProxy.isSupported) {
            return (jf0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_dota2_user_title, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f112174a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21659, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
