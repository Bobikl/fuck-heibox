package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.expression.widget.HeyBoxEditText;
import com.max.xiaoheihe.view.slicegradeview.SliceGradeView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityWriteGameCommentBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class j3 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f111975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final HeyBoxEditText f111976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f111980f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f111981g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final SliceGradeView f111982h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111983i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111984j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111985k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111986l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111987m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111988n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111989o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111990p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111991q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111992r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111993s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111994t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111995u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111996v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111997w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111998x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111999y;

    private j3(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 HeyBoxEditText heyBoxEditText, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 SliceGradeView sliceGradeView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 LinearLayout linearLayout5, @androidx.annotation.n0 LinearLayout linearLayout6, @androidx.annotation.n0 LinearLayout linearLayout7, @androidx.annotation.n0 LinearLayout linearLayout8, @androidx.annotation.n0 LinearLayout linearLayout9) {
        this.f111975a = relativeLayout;
        this.f111976b = heyBoxEditText;
        this.f111977c = imageView;
        this.f111978d = imageView2;
        this.f111979e = imageView3;
        this.f111980f = relativeLayout2;
        this.f111981g = recyclerView;
        this.f111982h = sliceGradeView;
        this.f111983i = textView;
        this.f111984j = textView2;
        this.f111985k = textView3;
        this.f111986l = textView4;
        this.f111987m = textView5;
        this.f111988n = linearLayout;
        this.f111989o = textView6;
        this.f111990p = textView7;
        this.f111991q = textView8;
        this.f111992r = linearLayout2;
        this.f111993s = linearLayout3;
        this.f111994t = linearLayout4;
        this.f111995u = linearLayout5;
        this.f111996v = linearLayout6;
        this.f111997w = linearLayout7;
        this.f111998x = linearLayout8;
        this.f111999y = linearLayout9;
    }

    @androidx.annotation.n0
    public static j3 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16692, new Class[]{View.class}, j3.class);
        if (patchProxyResultProxy.isSupported) {
            return (j3) patchProxyResultProxy.result;
        }
        int i10 = R.id.et_content;
        HeyBoxEditText heyBoxEditText = (HeyBoxEditText) l3.d.a(view, R.id.et_content);
        if (heyBoxEditText != null) {
            i10 = R.id.iv_expand;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_expand);
            if (imageView != null) {
                i10 = R.id.iv_follow_game;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_follow_game);
                if (imageView2 != null) {
                    i10 = R.id.iv_game_logo;
                    ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_game_logo);
                    if (imageView3 != null) {
                        RelativeLayout relativeLayout = (RelativeLayout) view;
                        i10 = R.id.rv_multi_dimension;
                        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_multi_dimension);
                        if (recyclerView != null) {
                            i10 = R.id.sgv;
                            SliceGradeView sliceGradeView = (SliceGradeView) l3.d.a(view, R.id.sgv);
                            if (sliceGradeView != null) {
                                i10 = R.id.tv_cancel;
                                TextView textView = (TextView) l3.d.a(view, R.id.tv_cancel);
                                if (textView != null) {
                                    i10 = R.id.tv_game_name;
                                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_game_name);
                                    if (textView2 != null) {
                                        i10 = R.id.tv_game_rating_detail;
                                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_game_rating_detail);
                                        if (textView3 != null) {
                                            i10 = R.id.tv_import;
                                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_import);
                                            if (textView4 != null) {
                                                i10 = R.id.tv_played;
                                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_played);
                                                if (textView5 != null) {
                                                    i10 = R.id.tv_ratting_role_faq;
                                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.tv_ratting_role_faq);
                                                    if (linearLayout != null) {
                                                        i10 = R.id.tv_steam_comment;
                                                        TextView textView6 = (TextView) l3.d.a(view, R.id.tv_steam_comment);
                                                        if (textView6 != null) {
                                                            i10 = R.id.tv_tips;
                                                            TextView textView7 = (TextView) l3.d.a(view, R.id.tv_tips);
                                                            if (textView7 != null) {
                                                                i10 = R.id.tv_want_to_play;
                                                                TextView textView8 = (TextView) l3.d.a(view, R.id.tv_want_to_play);
                                                                if (textView8 != null) {
                                                                    i10 = R.id.vg_content_card;
                                                                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_content_card);
                                                                    if (linearLayout2 != null) {
                                                                        i10 = R.id.vg_follow_game;
                                                                        LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_follow_game);
                                                                        if (linearLayout3 != null) {
                                                                            i10 = R.id.vg_game_rating;
                                                                            LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_game_rating);
                                                                            if (linearLayout4 != null) {
                                                                                i10 = R.id.vg_header;
                                                                                LinearLayout linearLayout5 = (LinearLayout) l3.d.a(view, R.id.vg_header);
                                                                                if (linearLayout5 != null) {
                                                                                    i10 = R.id.vg_import_from_steam;
                                                                                    LinearLayout linearLayout6 = (LinearLayout) l3.d.a(view, R.id.vg_import_from_steam);
                                                                                    if (linearLayout6 != null) {
                                                                                        i10 = R.id.vg_import_rule;
                                                                                        LinearLayout linearLayout7 = (LinearLayout) l3.d.a(view, R.id.vg_import_rule);
                                                                                        if (linearLayout7 != null) {
                                                                                            i10 = R.id.vg_multi_dimension;
                                                                                            LinearLayout linearLayout8 = (LinearLayout) l3.d.a(view, R.id.vg_multi_dimension);
                                                                                            if (linearLayout8 != null) {
                                                                                                i10 = R.id.vg_multi_dimension_expand;
                                                                                                LinearLayout linearLayout9 = (LinearLayout) l3.d.a(view, R.id.vg_multi_dimension_expand);
                                                                                                if (linearLayout9 != null) {
                                                                                                    return new j3(relativeLayout, heyBoxEditText, imageView, imageView2, imageView3, relativeLayout, recyclerView, sliceGradeView, textView, textView2, textView3, textView4, textView5, linearLayout, textView6, textView7, textView8, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, linearLayout9);
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
    public static j3 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16690, new Class[]{LayoutInflater.class}, j3.class);
        return patchProxyResultProxy.isSupported ? (j3) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static j3 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16691, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, j3.class);
        if (patchProxyResultProxy.isSupported) {
            return (j3) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_write_game_comment, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f111975a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16693, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
