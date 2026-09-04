package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.view.BoxAutoPlayView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemSteamAchievementDataBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class uy implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f116538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final BoxAutoPlayView f116543f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f116544g;

    private uy(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 BoxAutoPlayView boxAutoPlayView, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f116538a = linearLayout;
        this.f116539b = imageView;
        this.f116540c = textView;
        this.f116541d = textView2;
        this.f116542e = textView3;
        this.f116543f = boxAutoPlayView;
        this.f116544g = relativeLayout;
    }

    @androidx.annotation.n0
    public static uy a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19948, new Class[]{View.class}, uy.class);
        if (patchProxyResultProxy.isSupported) {
            return (uy) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_cleared;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_cleared);
        if (imageView != null) {
            i10 = R.id.tv_cleared_num;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_cleared_num);
            if (textView != null) {
                i10 = R.id.tv_name;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_name);
                if (textView2 != null) {
                    i10 = R.id.tv_value;
                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_value);
                    if (textView3 != null) {
                        i10 = R.id.v_auto_play;
                        BoxAutoPlayView boxAutoPlayView = (BoxAutoPlayView) l3.d.a(view, R.id.v_auto_play);
                        if (boxAutoPlayView != null) {
                            i10 = R.id.vg_cleared;
                            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_cleared);
                            if (relativeLayout != null) {
                                return new uy((LinearLayout) view, imageView, textView, textView2, textView3, boxAutoPlayView, relativeLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static uy c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19946, new Class[]{LayoutInflater.class}, uy.class);
        return patchProxyResultProxy.isSupported ? (uy) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static uy d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19947, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, uy.class);
        if (patchProxyResultProxy.isSupported) {
            return (uy) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_steam_achievement_data, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f116538a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19949, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
