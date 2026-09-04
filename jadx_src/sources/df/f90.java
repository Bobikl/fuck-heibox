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

/* JADX INFO: compiled from: LayoutPsnPlayerGamesHeaderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f90 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f110497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110501e;

    private f90(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4) {
        this.f110497a = relativeLayout;
        this.f110498b = textView;
        this.f110499c = textView2;
        this.f110500d = textView3;
        this.f110501e = textView4;
    }

    @androidx.annotation.n0
    public static f90 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21026, new Class[]{View.class}, f90.class);
        if (patchProxyResultProxy.isSupported) {
            return (f90) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_count;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_count);
        if (textView != null) {
            i10 = R.id.tv_my_game;
            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_my_game);
            if (textView2 != null) {
                i10 = R.id.tv_progress;
                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_progress);
                if (textView3 != null) {
                    i10 = R.id.tv_trophy_count;
                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_trophy_count);
                    if (textView4 != null) {
                        return new f90((RelativeLayout) view, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static f90 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21024, new Class[]{LayoutInflater.class}, f90.class);
        return patchProxyResultProxy.isSupported ? (f90) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static f90 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21025, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, f90.class);
        if (patchProxyResultProxy.isSupported) {
            return (f90) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_psn_player_games_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f110497a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21027, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
