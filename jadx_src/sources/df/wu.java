package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemR6MatchesBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class wu implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f117253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final Guideline f117255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117259g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117260h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117261i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117262j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117263k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f117264l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f117265m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f117266n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f117267o;

    private wu(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 Guideline guideline, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 View view, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout3) {
        this.f117253a = constraintLayout;
        this.f117254b = imageView;
        this.f117255c = guideline;
        this.f117256d = textView;
        this.f117257e = textView2;
        this.f117258f = textView3;
        this.f117259g = textView4;
        this.f117260h = textView5;
        this.f117261i = textView6;
        this.f117262j = textView7;
        this.f117263k = textView8;
        this.f117264l = view;
        this.f117265m = relativeLayout;
        this.f117266n = relativeLayout2;
        this.f117267o = relativeLayout3;
    }

    @androidx.annotation.n0
    public static wu a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19544, new Class[]{View.class}, wu.class);
        if (patchProxyResultProxy.isSupported) {
            return (wu) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_arrow;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_arrow);
        if (imageView != null) {
            i10 = R.id.line_guide;
            Guideline guideline = (Guideline) l3.d.a(view, R.id.line_guide);
            if (guideline != null) {
                i10 = R.id.tv_item_matches_count;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_item_matches_count);
                if (textView != null) {
                    i10 = R.id.tv_item_matches_kd;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_item_matches_kd);
                    if (textView2 != null) {
                        i10 = R.id.tv_item_matches_kd_hint;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_item_matches_kd_hint);
                        if (textView3 != null) {
                            i10 = R.id.tv_item_matches_rating;
                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_item_matches_rating);
                            if (textView4 != null) {
                                i10 = R.id.tv_item_matches_rating_diff;
                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_item_matches_rating_diff);
                                if (textView5 != null) {
                                    i10 = R.id.tv_item_matches_region;
                                    TextView textView6 = (TextView) l3.d.a(view, R.id.tv_item_matches_region);
                                    if (textView6 != null) {
                                        i10 = R.id.tv_item_matches_score;
                                        TextView textView7 = (TextView) l3.d.a(view, R.id.tv_item_matches_score);
                                        if (textView7 != null) {
                                            i10 = R.id.tv_item_matches_time;
                                            TextView textView8 = (TextView) l3.d.a(view, R.id.tv_item_matches_time);
                                            if (textView8 != null) {
                                                i10 = R.id.v_item_matches_divider;
                                                View viewA = l3.d.a(view, R.id.v_item_matches_divider);
                                                if (viewA != null) {
                                                    i10 = R.id.vg_kd;
                                                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_kd);
                                                    if (relativeLayout != null) {
                                                        i10 = R.id.vg_mode;
                                                        RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_mode);
                                                        if (relativeLayout2 != null) {
                                                            i10 = R.id.vg_rating;
                                                            RelativeLayout relativeLayout3 = (RelativeLayout) l3.d.a(view, R.id.vg_rating);
                                                            if (relativeLayout3 != null) {
                                                                return new wu((ConstraintLayout) view, imageView, guideline, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, viewA, relativeLayout, relativeLayout2, relativeLayout3);
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
    public static wu c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19542, new Class[]{LayoutInflater.class}, wu.class);
        return patchProxyResultProxy.isSupported ? (wu) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static wu d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19543, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, wu.class);
        if (patchProxyResultProxy.isSupported) {
            return (wu) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_r6_matches, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f117253a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19545, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
