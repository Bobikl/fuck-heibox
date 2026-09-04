package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutPlayerLeaderboardsHeaderEclipseBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class w80 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f117081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117085e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117086f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117087g;

    private w80(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5) {
        this.f117081a = linearLayout;
        this.f117082b = imageView;
        this.f117083c = textView;
        this.f117084d = textView2;
        this.f117085e = textView3;
        this.f117086f = textView4;
        this.f117087g = textView5;
    }

    @androidx.annotation.n0
    public static w80 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20990, new Class[]{View.class}, w80.class);
        if (patchProxyResultProxy.isSupported) {
            return (w80) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_more;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_more);
        if (imageView != null) {
            i10 = R.id.tv_nickname;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_nickname);
            if (textView != null) {
                i10 = R.id.tv_rank;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_rank);
                if (textView2 != null) {
                    i10 = R.id.tv_value0;
                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_value0);
                    if (textView3 != null) {
                        i10 = R.id.tv_value1;
                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_value1);
                        if (textView4 != null) {
                            i10 = R.id.tv_value2;
                            TextView textView5 = (TextView) l3.d.a(view, R.id.tv_value2);
                            if (textView5 != null) {
                                return new w80((LinearLayout) view, imageView, textView, textView2, textView3, textView4, textView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static w80 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20988, new Class[]{LayoutInflater.class}, w80.class);
        return patchProxyResultProxy.isSupported ? (w80) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static w80 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20989, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, w80.class);
        if (patchProxyResultProxy.isSupported) {
            return (w80) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_player_leaderboards_header_eclipse, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f117081a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20991, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
