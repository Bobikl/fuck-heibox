package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemDestinyGuardianBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class uh implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f116426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f116431f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116432g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116433h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116434i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116435j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116436k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f116437l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f116438m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f116439n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116440o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f116441p;

    private uh(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 View view, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 FrameLayout frameLayout2) {
        this.f116426a = relativeLayout;
        this.f116427b = imageView;
        this.f116428c = imageView2;
        this.f116429d = imageView3;
        this.f116430e = imageView4;
        this.f116431f = progressBar;
        this.f116432g = textView;
        this.f116433h = textView2;
        this.f116434i = textView3;
        this.f116435j = textView4;
        this.f116436k = textView5;
        this.f116437l = view;
        this.f116438m = frameLayout;
        this.f116439n = relativeLayout2;
        this.f116440o = linearLayout;
        this.f116441p = frameLayout2;
    }

    @androidx.annotation.n0
    public static uh a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18191, new Class[]{View.class}, uh.class);
        if (patchProxyResultProxy.isSupported) {
            return (uh) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_arrow;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_arrow);
        if (imageView != null) {
            i10 = R.id.iv_branch;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_branch);
            if (imageView2 != null) {
                i10 = R.id.iv_icon;
                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_icon);
                if (imageView3 != null) {
                    i10 = R.id.iv_skill;
                    ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_skill);
                    if (imageView4 != null) {
                        i10 = R.id.pb_level;
                        ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.pb_level);
                        if (progressBar != null) {
                            i10 = R.id.tv_branch;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_branch);
                            if (textView != null) {
                                i10 = R.id.tv_level;
                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_level);
                                if (textView2 != null) {
                                    i10 = R.id.tv_light;
                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_light);
                                    if (textView3 != null) {
                                        i10 = R.id.tv_name;
                                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_name);
                                        if (textView4 != null) {
                                            i10 = R.id.tv_skill;
                                            TextView textView5 = (TextView) l3.d.a(view, R.id.tv_skill);
                                            if (textView5 != null) {
                                                i10 = R.id.v_divider;
                                                View viewA = l3.d.a(view, R.id.v_divider);
                                                if (viewA != null) {
                                                    i10 = R.id.vg_branch;
                                                    FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_branch);
                                                    if (frameLayout != null) {
                                                        i10 = R.id.vg_name;
                                                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_name);
                                                        if (relativeLayout != null) {
                                                            i10 = R.id.vg_skill;
                                                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_skill);
                                                            if (linearLayout != null) {
                                                                i10 = R.id.vg_skill_2;
                                                                FrameLayout frameLayout2 = (FrameLayout) l3.d.a(view, R.id.vg_skill_2);
                                                                if (frameLayout2 != null) {
                                                                    return new uh((RelativeLayout) view, imageView, imageView2, imageView3, imageView4, progressBar, textView, textView2, textView3, textView4, textView5, viewA, frameLayout, relativeLayout, linearLayout, frameLayout2);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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
    public static uh c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18189, new Class[]{LayoutInflater.class}, uh.class);
        return patchProxyResultProxy.isSupported ? (uh) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static uh d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18190, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, uh.class);
        if (patchProxyResultProxy.isSupported) {
            return (uh) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_destiny_guardian, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f116426a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18192, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
