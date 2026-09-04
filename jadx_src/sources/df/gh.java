package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemDacFollowMatchesPreviewBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class gh implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f110989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f110990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110993e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f110994f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110995g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f110996h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110997i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110998j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110999k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111000l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111001m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f111002n;

    private gh(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout3, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 View view) {
        this.f110989a = relativeLayout;
        this.f110990b = relativeLayout2;
        this.f110991c = imageView;
        this.f110992d = linearLayout;
        this.f110993e = linearLayout2;
        this.f110994f = relativeLayout3;
        this.f110995g = textView;
        this.f110996h = oVar;
        this.f110997i = imageView2;
        this.f110998j = textView2;
        this.f110999k = textView3;
        this.f111000l = textView4;
        this.f111001m = textView5;
        this.f111002n = view;
    }

    @androidx.annotation.n0
    public static gh a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18135, new Class[]{View.class}, gh.class);
        if (patchProxyResultProxy.isSupported) {
            return (gh) patchProxyResultProxy.result;
        }
        int i10 = R.id.cell0;
        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.cell0);
        if (relativeLayout != null) {
            i10 = R.id.cell1;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.cell1);
            if (imageView != null) {
                i10 = R.id.cell2;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.cell2);
                if (linearLayout != null) {
                    i10 = R.id.cell3;
                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.cell3);
                    if (linearLayout2 != null) {
                        i10 = R.id.cell4;
                        RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.cell4);
                        if (relativeLayout2 != null) {
                            i10 = R.id.cell5;
                            TextView textView = (TextView) l3.d.a(view, R.id.cell5);
                            if (textView != null) {
                                i10 = R.id.divider;
                                View viewA = l3.d.a(view, R.id.divider);
                                if (viewA != null) {
                                    mb.o oVarA = mb.o.a(viewA);
                                    i10 = R.id.iv_level_img;
                                    ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_level_img);
                                    if (imageView2 != null) {
                                        i10 = R.id.tv_level;
                                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_level);
                                        if (textView2 != null) {
                                            i10 = R.id.tv_rank;
                                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_rank);
                                            if (textView3 != null) {
                                                i10 = R.id.tv_user_name;
                                                TextView textView4 = (TextView) l3.d.a(view, R.id.tv_user_name);
                                                if (textView4 != null) {
                                                    i10 = R.id.tv_user_status;
                                                    TextView textView5 = (TextView) l3.d.a(view, R.id.tv_user_status);
                                                    if (textView5 != null) {
                                                        i10 = R.id.view_rank_highlight;
                                                        View viewA2 = l3.d.a(view, R.id.view_rank_highlight);
                                                        if (viewA2 != null) {
                                                            return new gh((RelativeLayout) view, relativeLayout, imageView, linearLayout, linearLayout2, relativeLayout2, textView, oVarA, imageView2, textView2, textView3, textView4, textView5, viewA2);
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
    public static gh c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18133, new Class[]{LayoutInflater.class}, gh.class);
        return patchProxyResultProxy.isSupported ? (gh) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static gh d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18134, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, gh.class);
        if (patchProxyResultProxy.isSupported) {
            return (gh) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_dac_follow_matches_preview, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f110989a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18136, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
