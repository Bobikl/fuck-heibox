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

/* JADX INFO: compiled from: ItemR6HistoryRanksBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ru implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f115305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115310f;

    private ru(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4) {
        this.f115305a = relativeLayout;
        this.f115306b = imageView;
        this.f115307c = textView;
        this.f115308d = textView2;
        this.f115309e = textView3;
        this.f115310f = textView4;
    }

    @androidx.annotation.n0
    public static ru a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19524, new Class[]{View.class}, ru.class);
        if (patchProxyResultProxy.isSupported) {
            return (ru) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_medal;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_medal);
        if (imageView != null) {
            i10 = R.id.tv_medal;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_medal);
            if (textView != null) {
                i10 = R.id.tv_mmr;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_mmr);
                if (textView2 != null) {
                    i10 = R.id.tv_season;
                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_season);
                    if (textView3 != null) {
                        i10 = R.id.tv_season_name;
                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_season_name);
                        if (textView4 != null) {
                            return new ru((RelativeLayout) view, imageView, textView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ru c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19522, new Class[]{LayoutInflater.class}, ru.class);
        return patchProxyResultProxy.isSupported ? (ru) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ru d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19523, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ru.class);
        if (patchProxyResultProxy.isSupported) {
            return (ru) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_r6_history_ranks, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f115305a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19525, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
