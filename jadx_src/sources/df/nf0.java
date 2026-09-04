package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewGameAchievementItemContentBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class nf0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f113819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f113821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113824f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113825g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113826h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f113827i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113828j;

    private nf0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 View view, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f113819a = linearLayout;
        this.f113820b = imageView;
        this.f113821c = progressBar;
        this.f113822d = textView;
        this.f113823e = textView2;
        this.f113824f = textView3;
        this.f113825g = textView4;
        this.f113826h = textView5;
        this.f113827i = view;
        this.f113828j = relativeLayout;
    }

    @androidx.annotation.n0
    public static nf0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21674, new Class[]{View.class}, nf0.class);
        if (patchProxyResultProxy.isSupported) {
            return (nf0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_trophy;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_trophy);
        if (imageView != null) {
            i10 = R.id.pb_item_single_achievement_x;
            ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.pb_item_single_achievement_x);
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
                            i10 = R.id.tv_percent_temp;
                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_percent_temp);
                            if (textView4 != null) {
                                i10 = R.id.tv_time;
                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_time);
                                if (textView5 != null) {
                                    i10 = R.id.v_item_single_achievement_x_divider;
                                    View viewA = l3.d.a(view, R.id.v_item_single_achievement_x_divider);
                                    if (viewA != null) {
                                        i10 = R.id.vg_item_single_achievement_x_wrapper;
                                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_item_single_achievement_x_wrapper);
                                        if (relativeLayout != null) {
                                            return new nf0((LinearLayout) view, imageView, progressBar, textView, textView2, textView3, textView4, textView5, viewA, relativeLayout);
                                        }
                                    }
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
    public static nf0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21672, new Class[]{LayoutInflater.class}, nf0.class);
        return patchProxyResultProxy.isSupported ? (nf0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static nf0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21673, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, nf0.class);
        if (patchProxyResultProxy.isSupported) {
            return (nf0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_game_achievement_item_content, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f113819a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21675, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
