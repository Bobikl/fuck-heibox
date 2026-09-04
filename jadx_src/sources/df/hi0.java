package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewXboxGameItemBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class hi0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f111465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f111467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111470f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111471g;

    private hi0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4) {
        this.f111465a = linearLayout;
        this.f111466b = imageView;
        this.f111467c = progressBar;
        this.f111468d = textView;
        this.f111469e = textView2;
        this.f111470f = textView3;
        this.f111471g = textView4;
    }

    @androidx.annotation.n0
    public static hi0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21954, new Class[]{View.class}, hi0.class);
        if (patchProxyResultProxy.isSupported) {
            return (hi0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_game_img;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_game_img);
        if (imageView != null) {
            i10 = R.id.pb_game;
            ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.pb_game);
            if (progressBar != null) {
                i10 = R.id.tv_achievement;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_achievement);
                if (textView != null) {
                    i10 = R.id.tv_g_point_count;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_g_point_count);
                    if (textView2 != null) {
                        i10 = R.id.tv_game_name;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_game_name);
                        if (textView3 != null) {
                            i10 = R.id.tv_time_played;
                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_time_played);
                            if (textView4 != null) {
                                return new hi0((LinearLayout) view, imageView, progressBar, textView, textView2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static hi0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21952, new Class[]{LayoutInflater.class}, hi0.class);
        return patchProxyResultProxy.isSupported ? (hi0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static hi0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21953, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, hi0.class);
        if (patchProxyResultProxy.isSupported) {
            return (hi0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_xbox_game_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f111465a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21955, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
