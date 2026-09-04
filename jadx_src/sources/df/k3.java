package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcommon.component.QuestionView;
import com.max.hbcommon.component.segmentfilters.SegmentFilterView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.expression.widget.HeyBoxEditText;
import com.max.xiaoheihe.view.slicegradeview.SliceGradeView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityWriteGameCommentImpressionsBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class k3 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f112378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final HeyBoxEditText f112379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final SegmentFilterView f112380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final QuestionView f112383f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f112384g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final SliceGradeView f112385h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112386i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112387j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112388k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112389l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112390m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112391n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112392o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112393p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112394q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112395r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112396s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112397t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112398u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112399v;

    private k3(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 HeyBoxEditText heyBoxEditText, @androidx.annotation.n0 SegmentFilterView segmentFilterView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 QuestionView questionView, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 SliceGradeView sliceGradeView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 LinearLayout linearLayout5, @androidx.annotation.n0 LinearLayout linearLayout6) {
        this.f112378a = relativeLayout;
        this.f112379b = heyBoxEditText;
        this.f112380c = segmentFilterView;
        this.f112381d = imageView;
        this.f112382e = imageView2;
        this.f112383f = questionView;
        this.f112384g = relativeLayout2;
        this.f112385h = sliceGradeView;
        this.f112386i = textView;
        this.f112387j = textView2;
        this.f112388k = textView3;
        this.f112389l = textView4;
        this.f112390m = textView5;
        this.f112391n = linearLayout;
        this.f112392o = textView6;
        this.f112393p = textView7;
        this.f112394q = textView8;
        this.f112395r = linearLayout2;
        this.f112396s = linearLayout3;
        this.f112397t = linearLayout4;
        this.f112398u = linearLayout5;
        this.f112399v = linearLayout6;
    }

    @androidx.annotation.n0
    public static k3 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16696, new Class[]{View.class}, k3.class);
        if (patchProxyResultProxy.isSupported) {
            return (k3) patchProxyResultProxy.result;
        }
        int i10 = R.id.et_content;
        HeyBoxEditText heyBoxEditText = (HeyBoxEditText) l3.d.a(view, R.id.et_content);
        if (heyBoxEditText != null) {
            i10 = R.id.filter_tab;
            SegmentFilterView segmentFilterView = (SegmentFilterView) l3.d.a(view, R.id.filter_tab);
            if (segmentFilterView != null) {
                i10 = R.id.iv_follow_game;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_follow_game);
                if (imageView != null) {
                    i10 = R.id.iv_game_logo;
                    ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_game_logo);
                    if (imageView2 != null) {
                        i10 = R.id.question_view;
                        QuestionView questionView = (QuestionView) l3.d.a(view, R.id.question_view);
                        if (questionView != null) {
                            RelativeLayout relativeLayout = (RelativeLayout) view;
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
                                                                    i10 = R.id.vg_follow_game;
                                                                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_follow_game);
                                                                    if (linearLayout2 != null) {
                                                                        i10 = R.id.vg_game_rating;
                                                                        LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_game_rating);
                                                                        if (linearLayout3 != null) {
                                                                            i10 = R.id.vg_header;
                                                                            LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_header);
                                                                            if (linearLayout4 != null) {
                                                                                i10 = R.id.vg_import_from_steam;
                                                                                LinearLayout linearLayout5 = (LinearLayout) l3.d.a(view, R.id.vg_import_from_steam);
                                                                                if (linearLayout5 != null) {
                                                                                    i10 = R.id.vg_import_rule;
                                                                                    LinearLayout linearLayout6 = (LinearLayout) l3.d.a(view, R.id.vg_import_rule);
                                                                                    if (linearLayout6 != null) {
                                                                                        return new k3(relativeLayout, heyBoxEditText, segmentFilterView, imageView, imageView2, questionView, relativeLayout, sliceGradeView, textView, textView2, textView3, textView4, textView5, linearLayout, textView6, textView7, textView8, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6);
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
    public static k3 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16694, new Class[]{LayoutInflater.class}, k3.class);
        return patchProxyResultProxy.isSupported ? (k3) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static k3 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16695, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, k3.class);
        if (patchProxyResultProxy.isSupported) {
            return (k3) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_write_game_comment_impressions, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f112378a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16697, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
