package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGameOverviewRecentMatchsBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class km implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f112656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f112657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112661f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f112662g;

    private km(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f112656a = linearLayout;
        this.f112657b = recyclerView;
        this.f112658c = textView;
        this.f112659d = textView2;
        this.f112660e = textView3;
        this.f112661f = textView4;
        this.f112662g = relativeLayout;
    }

    @androidx.annotation.n0
    public static km a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18668, new Class[]{View.class}, km.class);
        if (patchProxyResultProxy.isSupported) {
            return (km) patchProxyResultProxy.result;
        }
        int i10 = R.id.rv;
        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv);
        if (recyclerView != null) {
            i10 = R.id.tv_kd;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_kd);
            if (textView != null) {
                i10 = R.id.tv_lose;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_lose);
                if (textView2 != null) {
                    i10 = R.id.tv_title;
                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_title);
                    if (textView3 != null) {
                        i10 = R.id.tv_win;
                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_win);
                        if (textView4 != null) {
                            i10 = R.id.vg_recently_20_title;
                            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_recently_20_title);
                            if (relativeLayout != null) {
                                return new km((LinearLayout) view, recyclerView, textView, textView2, textView3, textView4, relativeLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static km c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18666, new Class[]{LayoutInflater.class}, km.class);
        return patchProxyResultProxy.isSupported ? (km) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static km d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18667, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, km.class);
        if (patchProxyResultProxy.isSupported) {
            return (km) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_overview_recent_matchs, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f112656a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18669, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
