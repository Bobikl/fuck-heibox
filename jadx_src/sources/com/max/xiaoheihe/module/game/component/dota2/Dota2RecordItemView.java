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
import com.max.xiaoheihe.bean.game.gameoverview.MatchObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Dota2RecordItemView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class Dota2RecordItemView extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f87207l = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Dota2MatchResultView f87208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Dota2HeroImageView f87209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f87210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f87211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f87212f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f87213g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f87214h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f87215i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f87216j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f87217k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Dota2RecordItemView(@d Context context) {
        this(context, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Dota2RecordItemView(@d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dota2RecordItemView(@d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37373, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.view_dota2_record, (ViewGroup) null, false);
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
        View viewFindViewById3 = findViewById(R.id.tv_data_desc);
        f0.o(viewFindViewById3, "findViewById(R.id.tv_data_desc)");
        setTvDataDesc((TextView) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.tv_data);
        f0.o(viewFindViewById4, "findViewById(R.id.tv_data)");
        setTvData((TextView) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.iv_dan_icon);
        f0.o(viewFindViewById5, "findViewById(R.id.iv_dan_icon)");
        setIvDanIcon((ImageView) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.tv_dan_name);
        f0.o(viewFindViewById6, "findViewById(R.id.tv_dan_name)");
        setTvDanName((TextView) viewFindViewById6);
        setDiv(new View(getContext()));
        getDiv().setBackgroundResource(R.color.white_alpha5);
        getDiv().setLayoutParams(new RelativeLayout.LayoutParams(-1, ViewUtils.f(getContext(), 0.5f)));
        addView(getDiv());
    }

    @d
    public final View getDiv() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37371, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.f87217k;
        if (view != null) {
            return view;
        }
        f0.S(com.google.android.exoplayer2.text.ttml.d.f49801q);
        return null;
    }

    @d
    public final ImageView getIvDanIcon() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37367, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f87215i;
        if (imageView != null) {
            return imageView;
        }
        f0.S("ivDanIcon");
        return null;
    }

    @d
    public final ImageView getIvHeroIcon() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37361, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f87212f;
        if (imageView != null) {
            return imageView;
        }
        f0.S("ivHeroIcon");
        return null;
    }

    @d
    public final ImageView getIvImage() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37357, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f87210d;
        if (imageView != null) {
            return imageView;
        }
        f0.S("ivImage");
        return null;
    }

    @d
    public final TextView getTvDanName() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37369, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87216j;
        if (textView != null) {
            return textView;
        }
        f0.S("tvDanName");
        return null;
    }

    @d
    public final TextView getTvData() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37365, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87214h;
        if (textView != null) {
            return textView;
        }
        f0.S("tvData");
        return null;
    }

    @d
    public final TextView getTvDataDesc() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37363, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87213g;
        if (textView != null) {
            return textView;
        }
        f0.S("tvDataDesc");
        return null;
    }

    @d
    public final TextView getTvLevel() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37359, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87211e;
        if (textView != null) {
            return textView;
        }
        f0.S("tvLevel");
        return null;
    }

    @d
    public final Dota2HeroImageView getVDota2Hero() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37355, new Class[0], Dota2HeroImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (Dota2HeroImageView) patchProxyResultProxy.result;
        }
        Dota2HeroImageView dota2HeroImageView = this.f87209c;
        if (dota2HeroImageView != null) {
            return dota2HeroImageView;
        }
        f0.S("vDota2Hero");
        return null;
    }

    @d
    public final Dota2MatchResultView getVMatchResult() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37353, new Class[0], Dota2MatchResultView.class);
        if (patchProxyResultProxy.isSupported) {
            return (Dota2MatchResultView) patchProxyResultProxy.result;
        }
        Dota2MatchResultView dota2MatchResultView = this.f87208b;
        if (dota2MatchResultView != null) {
            return dota2MatchResultView;
        }
        f0.S("vMatchResult");
        return null;
    }

    public final void setData(@e MatchObj matchObj) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{matchObj}, this, changeQuickRedirect, false, 37374, new Class[]{MatchObj.class}, Void.TYPE).isSupported || matchObj == null) {
            return;
        }
        getVMatchResult().setColor(com.max.xiaoheihe.utils.d.e1(matchObj.getColor()));
        getVMatchResult().setWin(c.x(matchObj.getWin()));
        getVMatchResult().setTime(matchObj.getTime_desc());
        b.K(matchObj.getHero_image(), getIvImage());
        getTvLevel().setText(matchObj.getHero_level());
        String hero_variant = matchObj.getHero_variant();
        if (hero_variant != null && hero_variant.length() != 0) {
            z10 = false;
        }
        if (z10) {
            getIvHeroIcon().setVisibility(8);
            g.f74531b.q("[Dota2RecordItemView#setMatch] hero_variant field is invalid");
        } else {
            getIvHeroIcon().setVisibility(0);
            b.g0(matchObj.getHero_variant(), getIvHeroIcon(), ViewUtils.f(getContext(), 3.0f), -1, null, 1);
        }
        getVDota2Hero().getV_mvp().setVisibility(c.x(matchObj.is_mvp()) ? 0 : 8);
        b.K(matchObj.getDan_icon(), getIvDanIcon());
        getTvDanName().setText(matchObj.getDan_desc());
        getTvData().setText(matchObj.getValue());
        getTvDataDesc().setText(matchObj.getDesc());
    }

    public final void setDiv(@d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37372, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<set-?>");
        this.f87217k = view;
    }

    public final void setIvDanIcon(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 37368, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f87215i = imageView;
    }

    public final void setIvHeroIcon(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 37362, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f87212f = imageView;
    }

    public final void setIvImage(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 37358, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f87210d = imageView;
    }

    public final void setTvDanName(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37370, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87216j = textView;
    }

    public final void setTvData(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37366, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87214h = textView;
    }

    public final void setTvDataDesc(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37364, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87213g = textView;
    }

    public final void setTvLevel(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37360, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87211e = textView;
    }

    public final void setVDota2Hero(@d Dota2HeroImageView dota2HeroImageView) {
        if (PatchProxy.proxy(new Object[]{dota2HeroImageView}, this, changeQuickRedirect, false, 37356, new Class[]{Dota2HeroImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(dota2HeroImageView, "<set-?>");
        this.f87209c = dota2HeroImageView;
    }

    public final void setVMatchResult(@d Dota2MatchResultView dota2MatchResultView) {
        if (PatchProxy.proxy(new Object[]{dota2MatchResultView}, this, changeQuickRedirect, false, 37354, new Class[]{Dota2MatchResultView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(dota2MatchResultView, "<set-?>");
        this.f87208b = dota2MatchResultView;
    }
}
