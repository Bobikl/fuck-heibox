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

/* JADX INFO: compiled from: ViewEpicGameItemContentBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class kf0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f112608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f112610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112613f;

    private kf0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3) {
        this.f112608a = linearLayout;
        this.f112609b = imageView;
        this.f112610c = progressBar;
        this.f112611d = textView;
        this.f112612e = textView2;
        this.f112613f = textView3;
    }

    @androidx.annotation.n0
    public static kf0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21662, new Class[]{View.class}, kf0.class);
        if (patchProxyResultProxy.isSupported) {
            return (kf0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_game_icon;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_game_icon);
        if (imageView != null) {
            i10 = R.id.f76248pb;
            ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.f76248pb);
            if (progressBar != null) {
                i10 = R.id.tv_free_get;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_free_get);
                if (textView != null) {
                    i10 = R.id.tv_game_name;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_game_name);
                    if (textView2 != null) {
                        i10 = R.id.tv_play_time;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_play_time);
                        if (textView3 != null) {
                            return new kf0((LinearLayout) view, imageView, progressBar, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static kf0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21660, new Class[]{LayoutInflater.class}, kf0.class);
        return patchProxyResultProxy.isSupported ? (kf0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static kf0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21661, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, kf0.class);
        if (patchProxyResultProxy.isSupported) {
            return (kf0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_epic_game_item_content, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f112608a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21663, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
