package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcustomview.MarqueeTextView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.post_edit.RecommendTopicContainer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityConceptWritePostBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class o implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @androidx.annotation.n0
    public final TextView A;

    @androidx.annotation.n0
    public final TextView B;

    @androidx.annotation.n0
    public final MarqueeTextView C;

    @androidx.annotation.n0
    public final TextView D;

    @androidx.annotation.n0
    public final TextView E;

    @androidx.annotation.n0
    public final TextView F;

    @androidx.annotation.n0
    public final TextView G;

    @androidx.annotation.n0
    public final TextView H;

    @androidx.annotation.n0
    public final View I;

    @androidx.annotation.n0
    public final View J;

    @androidx.annotation.n0
    public final LinearLayout K;

    @androidx.annotation.n0
    public final LinearLayout L;

    @androidx.annotation.n0
    public final LinearLayout M;

    @androidx.annotation.n0
    public final LinearLayout N;

    @androidx.annotation.n0
    public final RelativeLayout O;

    @androidx.annotation.n0
    public final FrameLayout P;

    @androidx.annotation.n0
    public final RecommendTopicContainer Q;

    @androidx.annotation.n0
    public final LinearLayout R;

    @androidx.annotation.n0
    public final RelativeLayout S;

    @androidx.annotation.n0
    public final ViewStub T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f113981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f113982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f113983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f113984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f113985e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f113986f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113987g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113988h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113989i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113990j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113991k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113992l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113993m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113994n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113995o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113996p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113997q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113998r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113999s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f114000t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f114001u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f114002v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f114003w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f114004x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final ScrollView f114005y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114006z;

    private o(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 EditText editText2, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 ImageView imageView6, @androidx.annotation.n0 ImageView imageView7, @androidx.annotation.n0 ImageView imageView8, @androidx.annotation.n0 ImageView imageView9, @androidx.annotation.n0 ImageView imageView10, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 ConstraintLayout constraintLayout2, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView recyclerView2, @androidx.annotation.n0 ScrollView scrollView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 MarqueeTextView marqueeTextView, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 View view, @androidx.annotation.n0 View view2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 LinearLayout linearLayout5, @androidx.annotation.n0 LinearLayout linearLayout6, @androidx.annotation.n0 RelativeLayout relativeLayout3, @androidx.annotation.n0 FrameLayout frameLayout2, @androidx.annotation.n0 RecommendTopicContainer recommendTopicContainer, @androidx.annotation.n0 LinearLayout linearLayout7, @androidx.annotation.n0 RelativeLayout relativeLayout4, @androidx.annotation.n0 ViewStub viewStub) {
        this.f113981a = constraintLayout;
        this.f113982b = cardView;
        this.f113983c = oVar;
        this.f113984d = editText;
        this.f113985e = editText2;
        this.f113986f = frameLayout;
        this.f113987g = imageView;
        this.f113988h = imageView2;
        this.f113989i = imageView3;
        this.f113990j = imageView4;
        this.f113991k = imageView5;
        this.f113992l = imageView6;
        this.f113993m = imageView7;
        this.f113994n = imageView8;
        this.f113995o = imageView9;
        this.f113996p = imageView10;
        this.f113997q = relativeLayout;
        this.f113998r = linearLayout;
        this.f113999s = linearLayout2;
        this.f114000t = progressBar;
        this.f114001u = relativeLayout2;
        this.f114002v = constraintLayout2;
        this.f114003w = recyclerView;
        this.f114004x = recyclerView2;
        this.f114005y = scrollView;
        this.f114006z = textView;
        this.A = textView2;
        this.B = textView3;
        this.C = marqueeTextView;
        this.D = textView4;
        this.E = textView5;
        this.F = textView6;
        this.G = textView7;
        this.H = textView8;
        this.I = view;
        this.J = view2;
        this.K = linearLayout3;
        this.L = linearLayout4;
        this.M = linearLayout5;
        this.N = linearLayout6;
        this.O = relativeLayout3;
        this.P = frameLayout2;
        this.Q = recommendTopicContainer;
        this.R = linearLayout7;
        this.S = relativeLayout4;
        this.T = viewStub;
    }

    @androidx.annotation.n0
    public static o a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16296, new Class[]{View.class}, o.class);
        if (patchProxyResultProxy.isSupported) {
            return (o) patchProxyResultProxy.result;
        }
        int i10 = R.id.card_video;
        CardView cardView = (CardView) l3.d.a(view, R.id.card_video);
        if (cardView != null) {
            i10 = R.id.edit_bar_divider;
            View viewA = l3.d.a(view, R.id.edit_bar_divider);
            if (viewA != null) {
                mb.o oVarA = mb.o.a(viewA);
                i10 = R.id.et_content;
                EditText editText = (EditText) l3.d.a(view, R.id.et_content);
                if (editText != null) {
                    i10 = R.id.et_title;
                    EditText editText2 = (EditText) l3.d.a(view, R.id.et_title);
                    if (editText2 != null) {
                        i10 = R.id.fl_toolbar_popup_box;
                        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.fl_toolbar_popup_box);
                        if (frameLayout != null) {
                            i10 = R.id.iv_add_topic_new;
                            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_add_topic_new);
                            if (imageView != null) {
                                i10 = R.id.iv_at;
                                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_at);
                                if (imageView2 != null) {
                                    i10 = R.id.iv_emoji;
                                    ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_emoji);
                                    if (imageView3 != null) {
                                        i10 = R.id.iv_game;
                                        ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_game);
                                        if (imageView4 != null) {
                                            i10 = R.id.iv_hashtag_entry;
                                            ImageView imageView5 = (ImageView) l3.d.a(view, R.id.iv_hashtag_entry);
                                            if (imageView5 != null) {
                                                i10 = R.id.iv_hashtag_template;
                                                ImageView imageView6 = (ImageView) l3.d.a(view, R.id.iv_hashtag_template);
                                                if (imageView6 != null) {
                                                    i10 = R.id.iv_horn;
                                                    ImageView imageView7 = (ImageView) l3.d.a(view, R.id.iv_horn);
                                                    if (imageView7 != null) {
                                                        i10 = R.id.iv_horn_arrow;
                                                        ImageView imageView8 = (ImageView) l3.d.a(view, R.id.iv_horn_arrow);
                                                        if (imageView8 != null) {
                                                            i10 = R.id.iv_setting;
                                                            ImageView imageView9 = (ImageView) l3.d.a(view, R.id.iv_setting);
                                                            if (imageView9 != null) {
                                                                i10 = R.id.iv_video_thumb;
                                                                ImageView imageView10 = (ImageView) l3.d.a(view, R.id.iv_video_thumb);
                                                                if (imageView10 != null) {
                                                                    i10 = R.id.ll_additon_card;
                                                                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.ll_additon_card);
                                                                    if (relativeLayout != null) {
                                                                        i10 = R.id.ll_button_container;
                                                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_button_container);
                                                                        if (linearLayout != null) {
                                                                            i10 = R.id.ll_topic_new;
                                                                            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.ll_topic_new);
                                                                            if (linearLayout2 != null) {
                                                                                i10 = R.id.pb_upload;
                                                                                ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.pb_upload);
                                                                                if (progressBar != null) {
                                                                                    i10 = R.id.rl_et_container;
                                                                                    RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.rl_et_container);
                                                                                    if (relativeLayout2 != null) {
                                                                                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                                                                        i10 = R.id.rv_game_preview;
                                                                                        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_game_preview);
                                                                                        if (recyclerView != null) {
                                                                                            i10 = R.id.rv_img_preview;
                                                                                            RecyclerView recyclerView2 = (RecyclerView) l3.d.a(view, R.id.rv_img_preview);
                                                                                            if (recyclerView2 != null) {
                                                                                                i10 = R.id.sv_container;
                                                                                                ScrollView scrollView = (ScrollView) l3.d.a(view, R.id.sv_container);
                                                                                                if (scrollView != null) {
                                                                                                    i10 = R.id.tv_add_topics_new;
                                                                                                    TextView textView = (TextView) l3.d.a(view, R.id.tv_add_topics_new);
                                                                                                    if (textView != null) {
                                                                                                        i10 = R.id.tv_duration;
                                                                                                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_duration);
                                                                                                        if (textView2 != null) {
                                                                                                            i10 = R.id.tv_hashtag_template;
                                                                                                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_hashtag_template);
                                                                                                            if (textView3 != null) {
                                                                                                                i10 = R.id.tv_horn;
                                                                                                                MarqueeTextView marqueeTextView = (MarqueeTextView) l3.d.a(view, R.id.tv_horn);
                                                                                                                if (marqueeTextView != null) {
                                                                                                                    i10 = R.id.tv_post_setting_bubble;
                                                                                                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_post_setting_bubble);
                                                                                                                    if (textView4 != null) {
                                                                                                                        i10 = R.id.tv_tip;
                                                                                                                        TextView textView5 = (TextView) l3.d.a(view, R.id.tv_tip);
                                                                                                                        if (textView5 != null) {
                                                                                                                            i10 = R.id.tv_title_status;
                                                                                                                            TextView textView6 = (TextView) l3.d.a(view, R.id.tv_title_status);
                                                                                                                            if (textView6 != null) {
                                                                                                                                i10 = R.id.tv_total_text_num;
                                                                                                                                TextView textView7 = (TextView) l3.d.a(view, R.id.tv_total_text_num);
                                                                                                                                if (textView7 != null) {
                                                                                                                                    i10 = R.id.tv_upload_progress;
                                                                                                                                    TextView textView8 = (TextView) l3.d.a(view, R.id.tv_upload_progress);
                                                                                                                                    if (textView8 != null) {
                                                                                                                                        i10 = R.id.v_divider_title_content;
                                                                                                                                        View viewA2 = l3.d.a(view, R.id.v_divider_title_content);
                                                                                                                                        if (viewA2 != null) {
                                                                                                                                            i10 = R.id.v_mask;
                                                                                                                                            View viewA3 = l3.d.a(view, R.id.v_mask);
                                                                                                                                            if (viewA3 != null) {
                                                                                                                                                i10 = R.id.vg_add_topics_new;
                                                                                                                                                LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_add_topics_new);
                                                                                                                                                if (linearLayout3 != null) {
                                                                                                                                                    i10 = R.id.vg_add_video;
                                                                                                                                                    LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_add_video);
                                                                                                                                                    if (linearLayout4 != null) {
                                                                                                                                                        i10 = R.id.vg_change_thump;
                                                                                                                                                        LinearLayout linearLayout5 = (LinearLayout) l3.d.a(view, R.id.vg_change_thump);
                                                                                                                                                        if (linearLayout5 != null) {
                                                                                                                                                            i10 = R.id.vg_hashtag_template_info;
                                                                                                                                                            LinearLayout linearLayout6 = (LinearLayout) l3.d.a(view, R.id.vg_hashtag_template_info);
                                                                                                                                                            if (linearLayout6 != null) {
                                                                                                                                                                i10 = R.id.vg_horn;
                                                                                                                                                                RelativeLayout relativeLayout3 = (RelativeLayout) l3.d.a(view, R.id.vg_horn);
                                                                                                                                                                if (relativeLayout3 != null) {
                                                                                                                                                                    i10 = R.id.vg_post_setting_bubble;
                                                                                                                                                                    FrameLayout frameLayout2 = (FrameLayout) l3.d.a(view, R.id.vg_post_setting_bubble);
                                                                                                                                                                    if (frameLayout2 != null) {
                                                                                                                                                                        i10 = R.id.vg_recommend_topic;
                                                                                                                                                                        RecommendTopicContainer recommendTopicContainer = (RecommendTopicContainer) l3.d.a(view, R.id.vg_recommend_topic);
                                                                                                                                                                        if (recommendTopicContainer != null) {
                                                                                                                                                                            i10 = R.id.vg_topic_new;
                                                                                                                                                                            LinearLayout linearLayout7 = (LinearLayout) l3.d.a(view, R.id.vg_topic_new);
                                                                                                                                                                            if (linearLayout7 != null) {
                                                                                                                                                                                i10 = R.id.vg_video;
                                                                                                                                                                                RelativeLayout relativeLayout4 = (RelativeLayout) l3.d.a(view, R.id.vg_video);
                                                                                                                                                                                if (relativeLayout4 != null) {
                                                                                                                                                                                    i10 = R.id.view_stub_topic_hashtag_new_entry;
                                                                                                                                                                                    ViewStub viewStub = (ViewStub) l3.d.a(view, R.id.view_stub_topic_hashtag_new_entry);
                                                                                                                                                                                    if (viewStub != null) {
                                                                                                                                                                                        return new o(constraintLayout, cardView, oVarA, editText, editText2, frameLayout, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10, relativeLayout, linearLayout, linearLayout2, progressBar, relativeLayout2, constraintLayout, recyclerView, recyclerView2, scrollView, textView, textView2, textView3, marqueeTextView, textView4, textView5, textView6, textView7, textView8, viewA2, viewA3, linearLayout3, linearLayout4, linearLayout5, linearLayout6, relativeLayout3, frameLayout2, recommendTopicContainer, linearLayout7, relativeLayout4, viewStub);
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
    public static o c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16294, new Class[]{LayoutInflater.class}, o.class);
        return patchProxyResultProxy.isSupported ? (o) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static o d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16295, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, o.class);
        if (patchProxyResultProxy.isSupported) {
            return (o) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_concept_write_post, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f113981a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16297, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
