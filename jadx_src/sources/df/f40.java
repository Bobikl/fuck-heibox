package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutDota2MatchTitleBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f40 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f110404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110409f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f110410g;

    private f40(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 View view) {
        this.f110404a = relativeLayout;
        this.f110405b = imageView;
        this.f110406c = textView;
        this.f110407d = textView2;
        this.f110408e = textView3;
        this.f110409f = textView4;
        this.f110410g = view;
    }

    @androidx.annotation.n0
    public static f40 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20510, new Class[]{View.class}, f40.class);
        if (patchProxyResultProxy.isSupported) {
            return (f40) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_title;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_title);
        if (imageView != null) {
            i10 = R.id.tv_gold;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_gold);
            if (textView != null) {
                i10 = R.id.tv_kill;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_kill);
                if (textView2 != null) {
                    i10 = R.id.tv_name;
                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_name);
                    if (textView3 != null) {
                        i10 = R.id.tv_win;
                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_win);
                        if (textView4 != null) {
                            i10 = R.id.v_top_line;
                            View viewA = l3.d.a(view, R.id.v_top_line);
                            if (viewA != null) {
                                return new f40((RelativeLayout) view, imageView, textView, textView2, textView3, textView4, viewA);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static f40 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20508, new Class[]{LayoutInflater.class}, f40.class);
        return patchProxyResultProxy.isSupported ? (f40) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static f40 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20509, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, f40.class);
        if (patchProxyResultProxy.isSupported) {
            return (f40) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_dota2_match_title, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f110404a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20511, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
