package com.max.xiaoheihe.module.game.component.dota2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.utils.c;
import com.max.hbimage.b;
import com.max.hbutils.utils.ViewUtils;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.gameoverview.KDAObj;
import com.max.xiaoheihe.bean.game.gameoverview.MatchObj;
import com.max.xiaoheihe.bean.game.gameoverview.Overlaymatch;
import com.max.xiaoheihe.module.game.component.KDAView;
import com.max.xiaoheihe.module.game.component.ShineMvpView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: Dota2MatchItemView.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nDota2MatchItemView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dota2MatchItemView.kt\ncom/max/xiaoheihe/module/game/component/dota2/Dota2MatchItemView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,163:1\n262#2,2:164\n262#2,2:166\n262#2,2:168\n262#2,2:170\n262#2,2:172\n262#2,2:174\n262#2,2:176\n262#2,2:178\n*S KotlinDebug\n*F\n+ 1 Dota2MatchItemView.kt\ncom/max/xiaoheihe/module/game/component/dota2/Dota2MatchItemView\n*L\n101#1:164,2\n102#1:166,2\n116#1:168,2\n117#1:170,2\n149#1:172,2\n150#1:174,2\n153#1:176,2\n154#1:178,2\n*E\n"})
@o(parameters = 0)
public final class Dota2MatchItemView extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f87152u = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Dota2MatchResultView f87153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Dota2HeroImageView f87154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f87155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f87156e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f87157f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ShineMvpView f87158g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f87159h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public KDAView f87160i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f87161j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ViewGroup f87162k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f87163l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f87164m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f87165n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView f87166o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f87167p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public View f87168q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ViewGroup f87169r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Dota2HeroMmrView f87170s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @d
    private Type f87171t;

    /* JADX INFO: compiled from: Dota2MatchItemView.kt */
    public enum Type {
        TYPE_DAN,
        TYPE_MMR;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static Type valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 37281, new Class[]{String.class}, Type.class);
            return (Type) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(Type.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static Type[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 37280, new Class[0], Type[].class);
            return (Type[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }
    }

    /* JADX INFO: compiled from: Dota2MatchItemView.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f87172a;

        static {
            int[] iArr = new int[Type.valuesCustom().length];
            try {
                iArr[Type.TYPE_DAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.TYPE_MMR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f87172a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Dota2MatchItemView(@d Context context) {
        this(context, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Dota2MatchItemView(@d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dota2MatchItemView(@d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        this.f87171t = Type.TYPE_DAN;
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37276, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.view_dota2_match, (ViewGroup) null, false);
        viewInflate.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(viewInflate);
        View viewFindViewById = findViewById(R.id.v_match_result);
        f0.o(viewFindViewById, "findViewById(R.id.v_match_result)");
        setVMatchResult((Dota2MatchResultView) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.v_dota2_hero);
        f0.o(viewFindViewById2, "findViewById(R.id.v_dota2_hero)");
        setVDota2Hero((Dota2HeroImageView) viewFindViewById2);
        setIvImage(getVDota2Hero().getIv_image());
        setTvLevel(getVDota2Hero().getTv_level());
        setIvHeroIcon(getVDota2Hero().getIv_icon());
        setVMvp(getVDota2Hero().getV_mvp());
        View viewFindViewById3 = findViewById(R.id.tv_kd);
        f0.o(viewFindViewById3, "findViewById(R.id.tv_kd)");
        setTvKd((TextView) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.v_kda);
        f0.o(viewFindViewById4, "findViewById(R.id.v_kda)");
        setVKda((KDAView) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.tv_module);
        f0.o(viewFindViewById5, "findViewById(R.id.tv_module)");
        setTvModule((TextView) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.vg_rank);
        f0.o(viewFindViewById6, "findViewById(R.id.vg_rank)");
        setVgRank((ViewGroup) viewFindViewById6);
        View viewFindViewById7 = findViewById(R.id.tv_rank);
        f0.o(viewFindViewById7, "findViewById(R.id.tv_rank)");
        setTvRank((TextView) viewFindViewById7);
        View viewFindViewById8 = findViewById(R.id.tv_delta);
        f0.o(viewFindViewById8, "findViewById(R.id.tv_delta)");
        setTvDelta((TextView) viewFindViewById8);
        View viewFindViewById9 = findViewById(R.id.tv_duration);
        f0.o(viewFindViewById9, "findViewById(R.id.tv_duration)");
        setTvDuration((TextView) viewFindViewById9);
        View viewFindViewById10 = findViewById(R.id.iv_dan_icon);
        f0.o(viewFindViewById10, "findViewById(R.id.iv_dan_icon)");
        setIvDanIcon((ImageView) viewFindViewById10);
        View viewFindViewById11 = findViewById(R.id.tv_dan_name);
        f0.o(viewFindViewById11, "findViewById(R.id.tv_dan_name)");
        setTvDanName((TextView) viewFindViewById11);
        View viewFindViewById12 = findViewById(R.id.vg_dan);
        f0.o(viewFindViewById12, "findViewById(R.id.vg_dan)");
        setVgDan((ViewGroup) viewFindViewById12);
        View viewFindViewById13 = findViewById(R.id.v_hero_mmr);
        f0.o(viewFindViewById13, "findViewById(R.id.v_hero_mmr)");
        setVHeroMmr((Dota2HeroMmrView) viewFindViewById13);
        setDiv(new View(getContext()));
        getDiv().setBackgroundResource(R.color.white_alpha5);
        getDiv().setLayoutParams(new RelativeLayout.LayoutParams(-1, ViewUtils.f(getContext(), 0.5f)));
        addView(getDiv());
    }

    private final void b(MatchObj matchObj) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{matchObj}, this, changeQuickRedirect, false, 37278, new Class[]{MatchObj.class}, Void.TYPE).isSupported) {
            return;
        }
        String hero_variant = matchObj.getHero_variant();
        if (hero_variant != null && hero_variant.length() != 0) {
            z10 = false;
        }
        if (z10) {
            getIvHeroIcon().setVisibility(8);
            g.f74531b.q("[Dota2MatchItemView#setMatch] hero_variant field is invalid");
        } else {
            getIvHeroIcon().setVisibility(0);
            b.g0(matchObj.getHero_variant(), getIvHeroIcon(), ViewUtils.f(getContext(), 3.0f), -1, null, 1);
        }
    }

    @d
    public final View getDiv() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37270, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.f87168q;
        if (view != null) {
            return view;
        }
        f0.S(com.google.android.exoplayer2.text.ttml.d.f49801q);
        return null;
    }

    @d
    public final ImageView getIvDanIcon() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37266, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f87166o;
        if (imageView != null) {
            return imageView;
        }
        f0.S("ivDanIcon");
        return null;
    }

    @d
    public final ImageView getIvHeroIcon() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37248, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f87157f;
        if (imageView != null) {
            return imageView;
        }
        f0.S("ivHeroIcon");
        return null;
    }

    @d
    public final ImageView getIvImage() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37244, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f87155d;
        if (imageView != null) {
            return imageView;
        }
        f0.S("ivImage");
        return null;
    }

    @d
    public final TextView getTvDanName() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37268, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87167p;
        if (textView != null) {
            return textView;
        }
        f0.S("tvDanName");
        return null;
    }

    @d
    public final TextView getTvDelta() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37262, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87164m;
        if (textView != null) {
            return textView;
        }
        f0.S("tvDelta");
        return null;
    }

    @d
    public final TextView getTvDuration() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37264, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87165n;
        if (textView != null) {
            return textView;
        }
        f0.S("tvDuration");
        return null;
    }

    @d
    public final TextView getTvKd() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37252, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87159h;
        if (textView != null) {
            return textView;
        }
        f0.S("tvKd");
        return null;
    }

    @d
    public final TextView getTvLevel() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37246, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87156e;
        if (textView != null) {
            return textView;
        }
        f0.S("tvLevel");
        return null;
    }

    @d
    public final TextView getTvModule() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37256, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87161j;
        if (textView != null) {
            return textView;
        }
        f0.S("tvModule");
        return null;
    }

    @d
    public final TextView getTvRank() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37260, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87163l;
        if (textView != null) {
            return textView;
        }
        f0.S("tvRank");
        return null;
    }

    @d
    public final Dota2HeroImageView getVDota2Hero() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37242, new Class[0], Dota2HeroImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (Dota2HeroImageView) patchProxyResultProxy.result;
        }
        Dota2HeroImageView dota2HeroImageView = this.f87154c;
        if (dota2HeroImageView != null) {
            return dota2HeroImageView;
        }
        f0.S("vDota2Hero");
        return null;
    }

    @d
    public final Dota2HeroMmrView getVHeroMmr() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37274, new Class[0], Dota2HeroMmrView.class);
        if (patchProxyResultProxy.isSupported) {
            return (Dota2HeroMmrView) patchProxyResultProxy.result;
        }
        Dota2HeroMmrView dota2HeroMmrView = this.f87170s;
        if (dota2HeroMmrView != null) {
            return dota2HeroMmrView;
        }
        f0.S("vHeroMmr");
        return null;
    }

    @d
    public final KDAView getVKda() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37254, new Class[0], KDAView.class);
        if (patchProxyResultProxy.isSupported) {
            return (KDAView) patchProxyResultProxy.result;
        }
        KDAView kDAView = this.f87160i;
        if (kDAView != null) {
            return kDAView;
        }
        f0.S("vKda");
        return null;
    }

    @d
    public final Dota2MatchResultView getVMatchResult() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37240, new Class[0], Dota2MatchResultView.class);
        if (patchProxyResultProxy.isSupported) {
            return (Dota2MatchResultView) patchProxyResultProxy.result;
        }
        Dota2MatchResultView dota2MatchResultView = this.f87153b;
        if (dota2MatchResultView != null) {
            return dota2MatchResultView;
        }
        f0.S("vMatchResult");
        return null;
    }

    @d
    public final ShineMvpView getVMvp() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37250, new Class[0], ShineMvpView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ShineMvpView) patchProxyResultProxy.result;
        }
        ShineMvpView shineMvpView = this.f87158g;
        if (shineMvpView != null) {
            return shineMvpView;
        }
        f0.S("vMvp");
        return null;
    }

    @d
    public final ViewGroup getVgDan() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37272, new Class[0], ViewGroup.class);
        if (patchProxyResultProxy.isSupported) {
            return (ViewGroup) patchProxyResultProxy.result;
        }
        ViewGroup viewGroup = this.f87169r;
        if (viewGroup != null) {
            return viewGroup;
        }
        f0.S("vgDan");
        return null;
    }

    @d
    public final ViewGroup getVgRank() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37258, new Class[0], ViewGroup.class);
        if (patchProxyResultProxy.isSupported) {
            return (ViewGroup) patchProxyResultProxy.result;
        }
        ViewGroup viewGroup = this.f87162k;
        if (viewGroup != null) {
            return viewGroup;
        }
        f0.S("vgRank");
        return null;
    }

    public final void setDiv(@d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37271, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<set-?>");
        this.f87168q = view;
    }

    public final void setIvDanIcon(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 37267, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f87166o = imageView;
    }

    public final void setIvHeroIcon(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 37249, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f87157f = imageView;
    }

    public final void setIvImage(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 37245, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f87155d = imageView;
    }

    public final void setMatch(@e MatchObj matchObj) {
        if (PatchProxy.proxy(new Object[]{matchObj}, this, changeQuickRedirect, false, 37277, new Class[]{MatchObj.class}, Void.TYPE).isSupported || matchObj == null) {
            return;
        }
        getVMatchResult().setColor(com.max.xiaoheihe.utils.d.e1(matchObj.getColor()));
        getVMatchResult().setWin(c.x(matchObj.getWin()));
        getVMatchResult().setTime(matchObj.getTime_desc());
        b.K(matchObj.getHero_image(), getIvImage());
        getTvLevel().setText(matchObj.getHero_level());
        b(matchObj);
        getVMvp().setVisibility(c.x(matchObj.is_mvp()) ? 0 : 8);
        TextView tvKd = getTvKd();
        KDAObj kda = matchObj.getKda();
        tvKd.setText(kda != null ? kda.getKd() : null);
        getVKda().setKDA(matchObj.getKda());
        if (matchObj.getMatch_rank_change() != null) {
            getVgRank().setVisibility(0);
            getTvModule().setVisibility(8);
            getTvDelta().setTypeface(bb.d.a().b(0));
            Overlaymatch match_rank_change = matchObj.getMatch_rank_change();
            int delta = match_rank_change != null ? match_rank_change.getDelta() : 0;
            TextView tvRank = getTvRank();
            Overlaymatch match_rank_change2 = matchObj.getMatch_rank_change();
            tvRank.setText(match_rank_change2 != null ? Integer.valueOf(match_rank_change2.getRank()).toString() : null);
            if (delta >= 0) {
                getTvDelta().setTextColor(com.max.xiaoheihe.utils.d.E(R.color.dota2_tianhui));
                getTvRank().setTextColor(com.max.xiaoheihe.utils.d.E(R.color.dota2_tianhui));
                TextView tvDelta = getTvDelta();
                StringBuilder sb2 = new StringBuilder();
                sb2.append((char) 61656);
                sb2.append(delta);
                tvDelta.setText(sb2.toString());
            } else {
                getTvDelta().setTextColor(com.max.xiaoheihe.utils.d.E(R.color.dota2_yemo));
                getTvRank().setTextColor(com.max.xiaoheihe.utils.d.E(R.color.dota2_yemo));
                TextView tvDelta2 = getTvDelta();
                StringBuilder sb3 = new StringBuilder();
                sb3.append((char) 61655);
                sb3.append(-delta);
                tvDelta2.setText(sb3.toString());
            }
        } else {
            getVgRank().setVisibility(8);
            getTvModule().setVisibility(0);
            getTvModule().setText(matchObj.getModule());
        }
        getTvDuration().setText(matchObj.getDuration());
        b.K(matchObj.getDan_icon(), getIvDanIcon());
        getTvDanName().setText(matchObj.getDan_desc());
        getVHeroMmr().setData(matchObj.getHero_mmr());
        setType(this.f87171t);
    }

    public final void setTvDanName(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37269, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87167p = textView;
    }

    public final void setTvDelta(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37263, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87164m = textView;
    }

    public final void setTvDuration(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37265, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87165n = textView;
    }

    public final void setTvKd(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37253, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87159h = textView;
    }

    public final void setTvLevel(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37247, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87156e = textView;
    }

    public final void setTvModule(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37257, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87161j = textView;
    }

    public final void setTvRank(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37261, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87163l = textView;
    }

    public final void setType(@d Type type) {
        if (PatchProxy.proxy(new Object[]{type}, this, changeQuickRedirect, false, 37279, new Class[]{Type.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(type, "type");
        this.f87171t = type;
        int i10 = a.f87172a[type.ordinal()];
        if (i10 == 1) {
            getVHeroMmr().setVisibility(8);
            getVgDan().setVisibility(0);
        } else {
            if (i10 != 2) {
                return;
            }
            getVHeroMmr().setVisibility(0);
            getVgDan().setVisibility(8);
        }
    }

    public final void setVDota2Hero(@d Dota2HeroImageView dota2HeroImageView) {
        if (PatchProxy.proxy(new Object[]{dota2HeroImageView}, this, changeQuickRedirect, false, 37243, new Class[]{Dota2HeroImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(dota2HeroImageView, "<set-?>");
        this.f87154c = dota2HeroImageView;
    }

    public final void setVHeroMmr(@d Dota2HeroMmrView dota2HeroMmrView) {
        if (PatchProxy.proxy(new Object[]{dota2HeroMmrView}, this, changeQuickRedirect, false, 37275, new Class[]{Dota2HeroMmrView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(dota2HeroMmrView, "<set-?>");
        this.f87170s = dota2HeroMmrView;
    }

    public final void setVKda(@d KDAView kDAView) {
        if (PatchProxy.proxy(new Object[]{kDAView}, this, changeQuickRedirect, false, 37255, new Class[]{KDAView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(kDAView, "<set-?>");
        this.f87160i = kDAView;
    }

    public final void setVMatchResult(@d Dota2MatchResultView dota2MatchResultView) {
        if (PatchProxy.proxy(new Object[]{dota2MatchResultView}, this, changeQuickRedirect, false, 37241, new Class[]{Dota2MatchResultView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(dota2MatchResultView, "<set-?>");
        this.f87153b = dota2MatchResultView;
    }

    public final void setVMvp(@d ShineMvpView shineMvpView) {
        if (PatchProxy.proxy(new Object[]{shineMvpView}, this, changeQuickRedirect, false, 37251, new Class[]{ShineMvpView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(shineMvpView, "<set-?>");
        this.f87158g = shineMvpView;
    }

    public final void setVgDan(@d ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{viewGroup}, this, changeQuickRedirect, false, 37273, new Class[]{ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewGroup, "<set-?>");
        this.f87169r = viewGroup;
    }

    public final void setVgRank(@d ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{viewGroup}, this, changeQuickRedirect, false, 37259, new Class[]{ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewGroup, "<set-?>");
        this.f87162k = viewGroup;
    }
}
