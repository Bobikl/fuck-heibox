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

/* JADX INFO: compiled from: ItemGameMonthlyPlayerStatBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class dl implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f109825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109830f;

    private dl(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5) {
        this.f109825a = linearLayout;
        this.f109826b = textView;
        this.f109827c = textView2;
        this.f109828d = textView3;
        this.f109829e = textView4;
        this.f109830f = textView5;
    }

    @androidx.annotation.n0
    public static dl a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18537, new Class[]{View.class}, dl.class);
        if (patchProxyResultProxy.isSupported) {
            return (dl) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_delta;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_delta);
        if (textView != null) {
            i10 = R.id.tv_delta_percent;
            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_delta_percent);
            if (textView2 != null) {
                i10 = R.id.tv_month;
                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_month);
                if (textView3 != null) {
                    i10 = R.id.tv_peak;
                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_peak);
                    if (textView4 != null) {
                        i10 = R.id.tv_player;
                        TextView textView5 = (TextView) l3.d.a(view, R.id.tv_player);
                        if (textView5 != null) {
                            return new dl((LinearLayout) view, textView, textView2, textView3, textView4, textView5);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static dl c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18535, new Class[]{LayoutInflater.class}, dl.class);
        return patchProxyResultProxy.isSupported ? (dl) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static dl d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18536, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, dl.class);
        if (patchProxyResultProxy.isSupported) {
            return (dl) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_monthly_player_stat, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f109825a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18538, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
