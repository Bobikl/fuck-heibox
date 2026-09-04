package com.max.xiaoheihe.module.game.component.dota2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.base.router.b;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewHeroObj;
import com.max.xiaoheihe.bean.game.gameoverview.KDAObj;
import com.max.xiaoheihe.module.account.utils.l;
import com.max.xiaoheihe.module.game.component.KDAView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.u;

/* JADX INFO: compiled from: Dota2HeroItemView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class Dota2HeroItemView extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f87098j = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public QMUIRadiusImageView f87099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f87100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f87101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ProgressBar f87102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Dota2HeroMmrView f87103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f87104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public KDAView f87105h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f87106i;

    /* JADX INFO: compiled from: Dota2HeroItemView.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameOverviewHeroObj f87108c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f87109d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f87110e;

        a(GameOverviewHeroObj gameOverviewHeroObj, String str, String str2) {
            this.f87108c = gameOverviewHeroObj;
            this.f87109d = str;
            this.f87110e = str2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37180, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Context context = Dota2HeroItemView.this.getContext();
            f0.o(context, "context");
            b.q0(context, this.f87108c.getHero_id(), this.f87109d, this.f87110e);
        }
    }

    public Dota2HeroItemView(@e Context context) {
        this(context, null);
    }

    public Dota2HeroItemView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Dota2HeroItemView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public Dota2HeroItemView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a();
    }

    public final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37176, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.view_dota2_hero_item, (ViewGroup) null, false);
        viewInflate.setLayoutParams(new RelativeLayout.LayoutParams(-1, ViewUtils.f(getContext(), 56.0f)));
        addView(viewInflate);
        View viewFindViewById = findViewById(R.id.iv_hero);
        f0.o(viewFindViewById, "findViewById(R.id.iv_hero)");
        setIvHero((QMUIRadiusImageView) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.tv_win_rate);
        f0.o(viewFindViewById2, "findViewById(R.id.tv_win_rate)");
        setTvWinRate((TextView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.tv_num);
        f0.o(viewFindViewById3, "findViewById(R.id.tv_num)");
        setTvNum((TextView) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.pb_achievement);
        f0.o(viewFindViewById4, "findViewById(R.id.pb_achievement)");
        setPbAchievement((ProgressBar) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.v_dota2_mmr);
        f0.o(viewFindViewById5, "findViewById(R.id.v_dota2_mmr)");
        setVDota2Mmr((Dota2HeroMmrView) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.tv_kd);
        f0.o(viewFindViewById6, "findViewById(R.id.tv_kd)");
        setTvKd((TextView) viewFindViewById6);
        View viewFindViewById7 = findViewById(R.id.v_kda);
        f0.o(viewFindViewById7, "findViewById(R.id.v_kda)");
        setVKda((KDAView) viewFindViewById7);
        setVDiv(new View(getContext()));
        getVDiv().setBackgroundResource(R.color.white_alpha5);
        getVDiv().setLayoutParams(new RelativeLayout.LayoutParams(-1, ViewUtils.f(getContext(), 0.5f)));
        addView(getVDiv());
        setPbStyle(0);
    }

    @d
    public final String b(@e String str) {
        String strL2;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 37178, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return String.valueOf(n.p((str == null || (strL2 = u.l2(str, "%", "", false, 4, null)) == null) ? null : StringsKt__StringsKt.F5(strL2).toString()) / 100.0f);
    }

    @d
    public final QMUIRadiusImageView getIvHero() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37160, new Class[0], QMUIRadiusImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (QMUIRadiusImageView) patchProxyResultProxy.result;
        }
        QMUIRadiusImageView qMUIRadiusImageView = this.f87099b;
        if (qMUIRadiusImageView != null) {
            return qMUIRadiusImageView;
        }
        f0.S("ivHero");
        return null;
    }

    @d
    public final ProgressBar getPbAchievement() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37166, new Class[0], ProgressBar.class);
        if (patchProxyResultProxy.isSupported) {
            return (ProgressBar) patchProxyResultProxy.result;
        }
        ProgressBar progressBar = this.f87102e;
        if (progressBar != null) {
            return progressBar;
        }
        f0.S("pbAchievement");
        return null;
    }

    @d
    public final TextView getTvKd() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37170, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87104g;
        if (textView != null) {
            return textView;
        }
        f0.S("tvKd");
        return null;
    }

    @d
    public final TextView getTvNum() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37164, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87101d;
        if (textView != null) {
            return textView;
        }
        f0.S("tvNum");
        return null;
    }

    @d
    public final TextView getTvWinRate() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37162, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87100c;
        if (textView != null) {
            return textView;
        }
        f0.S("tvWinRate");
        return null;
    }

    @d
    public final View getVDiv() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37174, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.f87106i;
        if (view != null) {
            return view;
        }
        f0.S("vDiv");
        return null;
    }

    @d
    public final Dota2HeroMmrView getVDota2Mmr() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37168, new Class[0], Dota2HeroMmrView.class);
        if (patchProxyResultProxy.isSupported) {
            return (Dota2HeroMmrView) patchProxyResultProxy.result;
        }
        Dota2HeroMmrView dota2HeroMmrView = this.f87103f;
        if (dota2HeroMmrView != null) {
            return dota2HeroMmrView;
        }
        f0.S("vDota2Mmr");
        return null;
    }

    @d
    public final KDAView getVKda() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37172, new Class[0], KDAView.class);
        if (patchProxyResultProxy.isSupported) {
            return (KDAView) patchProxyResultProxy.result;
        }
        KDAView kDAView = this.f87105h;
        if (kDAView != null) {
            return kDAView;
        }
        f0.S("vKda");
        return null;
    }

    public final void setData(@e GameOverviewHeroObj gameOverviewHeroObj, @e String str, @e String str2) {
        if (PatchProxy.proxy(new Object[]{gameOverviewHeroObj, str, str2}, this, changeQuickRedirect, false, 37177, new Class[]{GameOverviewHeroObj.class, String.class, String.class}, Void.TYPE).isSupported || gameOverviewHeroObj == null) {
            return;
        }
        com.max.hbimage.b.d0(gameOverviewHeroObj.getHero_image(), getIvHero(), ViewUtils.o(getContext(), getIvHero()));
        getTvWinRate().setText(gameOverviewHeroObj.getWin_rate());
        getTvNum().setText(gameOverviewHeroObj.getMatch_num());
        getVDota2Mmr().setData(gameOverviewHeroObj.getHero_mmr());
        TextView tvKd = getTvKd();
        KDAObj kda = gameOverviewHeroObj.getKda();
        tvKd.setText(kda != null ? kda.getKd() : null);
        getVKda().setKDA(gameOverviewHeroObj.getKda());
        setPbStyle(com.max.xiaoheihe.utils.d.F(getContext(), R.color.dota2_tianhui));
        l.f0(b(gameOverviewHeroObj.getWin_rate()), getPbAchievement());
        setOnClickListener(new a(gameOverviewHeroObj, str, str2));
    }

    public final void setIvHero(@d QMUIRadiusImageView qMUIRadiusImageView) {
        if (PatchProxy.proxy(new Object[]{qMUIRadiusImageView}, this, changeQuickRedirect, false, 37161, new Class[]{QMUIRadiusImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(qMUIRadiusImageView, "<set-?>");
        this.f87099b = qMUIRadiusImageView;
    }

    public final void setPbAchievement(@d ProgressBar progressBar) {
        if (PatchProxy.proxy(new Object[]{progressBar}, this, changeQuickRedirect, false, 37167, new Class[]{ProgressBar.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(progressBar, "<set-?>");
        this.f87102e = progressBar;
    }

    public final void setPbStyle(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 37179, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        int iF = ViewUtils.f(getContext(), 2.0f);
        Drawable progressDrawable = getPbAchievement().getProgressDrawable();
        f0.n(progressDrawable, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        LayerDrawable layerDrawable = (LayerDrawable) progressDrawable;
        layerDrawable.setDrawableByLayerId(android.R.id.progress, new ScaleDrawable(ViewUtils.G(iF, i10), 3, 1.0f, -1.0f));
        layerDrawable.setDrawableByLayerId(android.R.id.background, ViewUtils.G(iF, com.max.xiaoheihe.utils.d.E(R.color.white_alpha10)));
    }

    public final void setTvKd(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37171, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87104g = textView;
    }

    public final void setTvNum(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37165, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87101d = textView;
    }

    public final void setTvWinRate(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37163, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87100c = textView;
    }

    public final void setVDiv(@d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37175, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<set-?>");
        this.f87106i = view;
    }

    public final void setVDota2Mmr(@d Dota2HeroMmrView dota2HeroMmrView) {
        if (PatchProxy.proxy(new Object[]{dota2HeroMmrView}, this, changeQuickRedirect, false, 37169, new Class[]{Dota2HeroMmrView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(dota2HeroMmrView, "<set-?>");
        this.f87103f = dota2HeroMmrView;
    }

    public final void setVKda(@d KDAView kDAView) {
        if (PatchProxy.proxy(new Object[]{kDAView}, this, changeQuickRedirect, false, 37173, new Class[]{KDAView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(kDAView, "<set-?>");
        this.f87105h = kDAView;
    }
}
