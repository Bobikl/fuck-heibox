package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemXboxAchievementBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a20 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f108324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f108326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108330g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108331h;

    private a20(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5) {
        this.f108324a = relativeLayout;
        this.f108325b = imageView;
        this.f108326c = progressBar;
        this.f108327d = textView;
        this.f108328e = textView2;
        this.f108329f = textView3;
        this.f108330g = textView4;
        this.f108331h = textView5;
    }

    @androidx.annotation.n0
    public static a20 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20284, new Class[]{View.class}, a20.class);
        if (patchProxyResultProxy.isSupported) {
            return (a20) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_img;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_img);
        if (imageView != null) {
            i10 = R.id.f76248pb;
            ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.f76248pb);
            if (progressBar != null) {
                i10 = R.id.tv_desc;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_desc);
                if (textView != null) {
                    i10 = R.id.tv_name;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_name);
                    if (textView2 != null) {
                        i10 = R.id.tv_percent;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_percent);
                        if (textView3 != null) {
                            i10 = R.id.tv_point;
                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_point);
                            if (textView4 != null) {
                                i10 = R.id.tv_time;
                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_time);
                                if (textView5 != null) {
                                    return new a20((RelativeLayout) view, imageView, progressBar, textView, textView2, textView3, textView4, textView5);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static a20 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20282, new Class[]{LayoutInflater.class}, a20.class);
        return patchProxyResultProxy.isSupported ? (a20) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static a20 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20283, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, a20.class);
        if (patchProxyResultProxy.isSupported) {
            return (a20) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_xbox_achievement, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f108324a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20285, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
