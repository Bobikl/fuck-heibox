package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.max.hbcustomview.MarqueeTextView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.component.PostFormatView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentNewLinkEditBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ha implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @androidx.annotation.n0
    public final TextView A;

    @androidx.annotation.n0
    public final LinearLayout B;

    @androidx.annotation.n0
    public final o3 C;

    @androidx.annotation.n0
    public final LinearLayout D;

    @androidx.annotation.n0
    public final RelativeLayout E;

    @androidx.annotation.n0
    public final LinearLayout F;

    @androidx.annotation.n0
    public final RelativeLayout G;

    @androidx.annotation.n0
    public final LinearLayout H;

    @androidx.annotation.n0
    public final LinearLayout I;

    @androidx.annotation.n0
    public final FrameLayout J;

    @androidx.annotation.n0
    public final LinearLayout K;

    @androidx.annotation.n0
    public final WebView L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f111344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f111345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111350g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111351h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111352i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111353j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111354k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111355l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111356m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f111357n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111358o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final PostFormatView f111359p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final PostFormatView f111360q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final PostFormatView f111361r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final PostFormatView f111362s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final PostFormatView f111363t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final PostFormatView f111364u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f111365v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConsecutiveScrollerLayout f111366w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111367x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final MarqueeTextView f111368y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111369z;

    private ha(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 ImageView imageView6, @androidx.annotation.n0 ImageView imageView7, @androidx.annotation.n0 ImageView imageView8, @androidx.annotation.n0 ImageView imageView9, @androidx.annotation.n0 ImageView imageView10, @androidx.annotation.n0 ImageView imageView11, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 PostFormatView postFormatView, @androidx.annotation.n0 PostFormatView postFormatView2, @androidx.annotation.n0 PostFormatView postFormatView3, @androidx.annotation.n0 PostFormatView postFormatView4, @androidx.annotation.n0 PostFormatView postFormatView5, @androidx.annotation.n0 PostFormatView postFormatView6, @androidx.annotation.n0 ConstraintLayout constraintLayout2, @androidx.annotation.n0 ConsecutiveScrollerLayout consecutiveScrollerLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 MarqueeTextView marqueeTextView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 o3 o3Var, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 RelativeLayout relativeLayout3, @androidx.annotation.n0 LinearLayout linearLayout5, @androidx.annotation.n0 LinearLayout linearLayout6, @androidx.annotation.n0 FrameLayout frameLayout2, @androidx.annotation.n0 LinearLayout linearLayout7, @androidx.annotation.n0 WebView webView) {
        this.f111344a = constraintLayout;
        this.f111345b = frameLayout;
        this.f111346c = imageView;
        this.f111347d = imageView2;
        this.f111348e = imageView3;
        this.f111349f = imageView4;
        this.f111350g = imageView5;
        this.f111351h = imageView6;
        this.f111352i = imageView7;
        this.f111353j = imageView8;
        this.f111354k = imageView9;
        this.f111355l = imageView10;
        this.f111356m = imageView11;
        this.f111357n = relativeLayout;
        this.f111358o = linearLayout;
        this.f111359p = postFormatView;
        this.f111360q = postFormatView2;
        this.f111361r = postFormatView3;
        this.f111362s = postFormatView4;
        this.f111363t = postFormatView5;
        this.f111364u = postFormatView6;
        this.f111365v = constraintLayout2;
        this.f111366w = consecutiveScrollerLayout;
        this.f111367x = textView;
        this.f111368y = marqueeTextView;
        this.f111369z = textView2;
        this.A = textView3;
        this.B = linearLayout2;
        this.C = o3Var;
        this.D = linearLayout3;
        this.E = relativeLayout2;
        this.F = linearLayout4;
        this.G = relativeLayout3;
        this.H = linearLayout5;
        this.I = linearLayout6;
        this.J = frameLayout2;
        this.K = linearLayout7;
        this.L = webView;
    }

    @androidx.annotation.n0
    public static ha a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17412, new Class[]{View.class}, ha.class);
        if (patchProxyResultProxy.isSupported) {
            return (ha) patchProxyResultProxy.result;
        }
        int i10 = R.id.fl_expression;
        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.fl_expression);
        if (frameLayout != null) {
            i10 = R.id.iv_at;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_at);
            if (imageView != null) {
                i10 = R.id.iv_emoji;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_emoji);
                if (imageView2 != null) {
                    i10 = R.id.iv_format;
                    ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_format);
                    if (imageView3 != null) {
                        i10 = R.id.iv_hashtag;
                        ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_hashtag);
                        if (imageView4 != null) {
                            i10 = R.id.iv_horn;
                            ImageView imageView5 = (ImageView) l3.d.a(view, R.id.iv_horn);
                            if (imageView5 != null) {
                                i10 = R.id.iv_horn_arrow;
                                ImageView imageView6 = (ImageView) l3.d.a(view, R.id.iv_horn_arrow);
                                if (imageView6 != null) {
                                    i10 = R.id.iv_more;
                                    ImageView imageView7 = (ImageView) l3.d.a(view, R.id.iv_more);
                                    if (imageView7 != null) {
                                        i10 = R.id.iv_picture;
                                        ImageView imageView8 = (ImageView) l3.d.a(view, R.id.iv_picture);
                                        if (imageView8 != null) {
                                            i10 = R.id.iv_post_setting;
                                            ImageView imageView9 = (ImageView) l3.d.a(view, R.id.iv_post_setting);
                                            if (imageView9 != null) {
                                                i10 = R.id.iv_redo;
                                                ImageView imageView10 = (ImageView) l3.d.a(view, R.id.iv_redo);
                                                if (imageView10 != null) {
                                                    i10 = R.id.iv_undo;
                                                    ImageView imageView11 = (ImageView) l3.d.a(view, R.id.iv_undo);
                                                    if (imageView11 != null) {
                                                        i10 = R.id.ll_additon_card;
                                                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.ll_additon_card);
                                                        if (relativeLayout != null) {
                                                            i10 = R.id.ll_topic;
                                                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_topic);
                                                            if (linearLayout != null) {
                                                                i10 = R.id.pf_blockquote;
                                                                PostFormatView postFormatView = (PostFormatView) l3.d.a(view, R.id.pf_blockquote);
                                                                if (postFormatView != null) {
                                                                    i10 = R.id.pf_bold;
                                                                    PostFormatView postFormatView2 = (PostFormatView) l3.d.a(view, R.id.pf_bold);
                                                                    if (postFormatView2 != null) {
                                                                        i10 = R.id.pf_first_title;
                                                                        PostFormatView postFormatView3 = (PostFormatView) l3.d.a(view, R.id.pf_first_title);
                                                                        if (postFormatView3 != null) {
                                                                            i10 = R.id.pf_orderlist;
                                                                            PostFormatView postFormatView4 = (PostFormatView) l3.d.a(view, R.id.pf_orderlist);
                                                                            if (postFormatView4 != null) {
                                                                                i10 = R.id.pf_second_title;
                                                                                PostFormatView postFormatView5 = (PostFormatView) l3.d.a(view, R.id.pf_second_title);
                                                                                if (postFormatView5 != null) {
                                                                                    i10 = R.id.pf_unorderlist;
                                                                                    PostFormatView postFormatView6 = (PostFormatView) l3.d.a(view, R.id.pf_unorderlist);
                                                                                    if (postFormatView6 != null) {
                                                                                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                                                                        i10 = R.id.sv_container;
                                                                                        ConsecutiveScrollerLayout consecutiveScrollerLayout = (ConsecutiveScrollerLayout) l3.d.a(view, R.id.sv_container);
                                                                                        if (consecutiveScrollerLayout != null) {
                                                                                            i10 = R.id.tv_add_topics;
                                                                                            TextView textView = (TextView) l3.d.a(view, R.id.tv_add_topics);
                                                                                            if (textView != null) {
                                                                                                i10 = R.id.tv_horn;
                                                                                                MarqueeTextView marqueeTextView = (MarqueeTextView) l3.d.a(view, R.id.tv_horn);
                                                                                                if (marqueeTextView != null) {
                                                                                                    i10 = R.id.tv_post_setting_bubble;
                                                                                                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_post_setting_bubble);
                                                                                                    if (textView2 != null) {
                                                                                                        i10 = R.id.tv_total_text_num;
                                                                                                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_total_text_num);
                                                                                                        if (textView3 != null) {
                                                                                                            i10 = R.id.vg_add_topics;
                                                                                                            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_add_topics);
                                                                                                            if (linearLayout2 != null) {
                                                                                                                i10 = R.id.vg_article_preview;
                                                                                                                View viewA = l3.d.a(view, R.id.vg_article_preview);
                                                                                                                if (viewA != null) {
                                                                                                                    o3 o3VarA = o3.a(viewA);
                                                                                                                    i10 = R.id.vg_do_undo_setting;
                                                                                                                    LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_do_undo_setting);
                                                                                                                    if (linearLayout3 != null) {
                                                                                                                        i10 = R.id.vg_edit_bar;
                                                                                                                        RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_edit_bar);
                                                                                                                        if (relativeLayout2 != null) {
                                                                                                                            i10 = R.id.vg_element;
                                                                                                                            LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_element);
                                                                                                                            if (linearLayout4 != null) {
                                                                                                                                i10 = R.id.vg_horn;
                                                                                                                                RelativeLayout relativeLayout3 = (RelativeLayout) l3.d.a(view, R.id.vg_horn);
                                                                                                                                if (relativeLayout3 != null) {
                                                                                                                                    i10 = R.id.vg_menu_element;
                                                                                                                                    LinearLayout linearLayout5 = (LinearLayout) l3.d.a(view, R.id.vg_menu_element);
                                                                                                                                    if (linearLayout5 != null) {
                                                                                                                                        i10 = R.id.vg_menu_format;
                                                                                                                                        LinearLayout linearLayout6 = (LinearLayout) l3.d.a(view, R.id.vg_menu_format);
                                                                                                                                        if (linearLayout6 != null) {
                                                                                                                                            i10 = R.id.vg_post_setting_bubble;
                                                                                                                                            FrameLayout frameLayout2 = (FrameLayout) l3.d.a(view, R.id.vg_post_setting_bubble);
                                                                                                                                            if (frameLayout2 != null) {
                                                                                                                                                i10 = R.id.vg_topic;
                                                                                                                                                LinearLayout linearLayout7 = (LinearLayout) l3.d.a(view, R.id.vg_topic);
                                                                                                                                                if (linearLayout7 != null) {
                                                                                                                                                    i10 = R.id.webView;
                                                                                                                                                    WebView webView = (WebView) l3.d.a(view, R.id.webView);
                                                                                                                                                    if (webView != null) {
                                                                                                                                                        return new ha(constraintLayout, frameLayout, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10, imageView11, relativeLayout, linearLayout, postFormatView, postFormatView2, postFormatView3, postFormatView4, postFormatView5, postFormatView6, constraintLayout, consecutiveScrollerLayout, textView, marqueeTextView, textView2, textView3, linearLayout2, o3VarA, linearLayout3, relativeLayout2, linearLayout4, relativeLayout3, linearLayout5, linearLayout6, frameLayout2, linearLayout7, webView);
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
    public static ha c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17410, new Class[]{LayoutInflater.class}, ha.class);
        return patchProxyResultProxy.isSupported ? (ha) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ha d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17411, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ha.class);
        if (patchProxyResultProxy.isSupported) {
            return (ha) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_new_link_edit, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f111344a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17413, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
