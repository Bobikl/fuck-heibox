package com.max.xiaoheihe.module.game.component.dota2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.utils.c;
import com.max.hbutils.utils.ViewUtils;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.base.router.b;
import com.max.xiaoheihe.bean.game.gameoverview.MatchObj;
import com.max.xiaoheihe.module.game.component.KDAView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Dota2FollowMatchItemView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class Dota2FollowMatchItemView extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f87058m = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f87059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f87060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TextView f87061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TextView f87062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private LinearLayout f87063f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private TextView f87064g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private KDAView f87065h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Dota2HeroImageView f87066i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ImageView f87067j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ImageView f87068k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f87069l;

    /* JADX INFO: compiled from: Dota2FollowMatchItemView.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MatchObj f87070b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Dota2FollowMatchItemView f87071c;

        a(MatchObj matchObj, Dota2FollowMatchItemView dota2FollowMatchItemView) {
            this.f87070b = matchObj;
            this.f87071c = dota2FollowMatchItemView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String steam_id;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37113, new Class[]{View.class}, Void.TYPE).isSupported || (steam_id = this.f87070b.getSteam_id()) == null) {
                return;
            }
            Context context = this.f87071c.getContext();
            f0.o(context, "context");
            b.p0(context, null, steam_id);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Dota2FollowMatchItemView(@d Context context) {
        this(context, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Dota2FollowMatchItemView(@d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dota2FollowMatchItemView(@d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37110, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.view_dota2_follow_match, (ViewGroup) null, false);
        viewInflate.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(viewInflate);
        View viewFindViewById = findViewById(R.id.iv_avatar);
        f0.o(viewFindViewById, "findViewById(R.id.iv_avatar)");
        this.f87059b = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.tv_name);
        f0.o(viewFindViewById2, "findViewById(R.id.tv_name)");
        this.f87060c = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.tv_result);
        f0.o(viewFindViewById3, "findViewById(R.id.tv_result)");
        this.f87061d = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.tv_duration);
        f0.o(viewFindViewById4, "findViewById(R.id.tv_duration)");
        this.f87062e = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.vg_kda);
        f0.o(viewFindViewById5, "findViewById(R.id.vg_kda)");
        this.f87063f = (LinearLayout) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.tv_dan_name);
        f0.o(viewFindViewById6, "findViewById(R.id.tv_dan_name)");
        this.f87064g = (TextView) viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.v_kda);
        f0.o(viewFindViewById7, "findViewById(R.id.v_kda)");
        this.f87065h = (KDAView) viewFindViewById7;
        View viewFindViewById8 = findViewById(R.id.v_dota2_hero);
        f0.o(viewFindViewById8, "findViewById(R.id.v_dota2_hero)");
        this.f87066i = (Dota2HeroImageView) viewFindViewById8;
        View viewFindViewById9 = findViewById(R.id.iv_arrow);
        f0.o(viewFindViewById9, "findViewById(R.id.iv_arrow)");
        this.f87067j = (ImageView) viewFindViewById9;
        View viewFindViewById10 = findViewById(R.id.iv_authentication);
        f0.o(viewFindViewById10, "findViewById(R.id.iv_authentication)");
        this.f87068k = (ImageView) viewFindViewById10;
        setDiv(new View(getContext()));
        getDiv().setBackgroundResource(R.color.white_alpha5);
        getDiv().setLayoutParams(new RelativeLayout.LayoutParams(-1, ViewUtils.f(getContext(), 0.5f)));
        addView(getDiv());
    }

    @d
    public final View getDiv() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37108, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.f87069l;
        if (view != null) {
            return view;
        }
        f0.S(com.google.android.exoplayer2.text.ttml.d.f49801q);
        return null;
    }

    public final void setDiv(@d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37109, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<set-?>");
        this.f87069l = view;
    }

    public final void setLightStyle() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37112, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        getDiv().setBackgroundResource(R.color.divider_secondary_1_color);
        TextView textView = this.f87060c;
        TextView textView2 = null;
        if (textView == null) {
            f0.S("tvName");
            textView = null;
        }
        textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
        TextView textView3 = this.f87062e;
        if (textView3 == null) {
            f0.S("tvDuration");
            textView3 = null;
        }
        textView3.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
        TextView textView4 = this.f87064g;
        if (textView4 == null) {
            f0.S("tvDanName");
            textView4 = null;
        }
        textView4.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
        KDAView kDAView = this.f87065h;
        if (kDAView == null) {
            f0.S("vKda");
            kDAView = null;
        }
        kDAView.setLightStyle();
        ImageView imageView = this.f87067j;
        if (imageView == null) {
            f0.S("ivArrow");
            imageView = null;
        }
        imageView.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
        TextView textView5 = this.f87061d;
        if (textView5 == null) {
            f0.S("tvResult");
        } else {
            textView2 = textView5;
        }
        textView2.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.white));
    }

    public final void setMatch(@e MatchObj matchObj) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{matchObj}, this, changeQuickRedirect, false, 37111, new Class[]{MatchObj.class}, Void.TYPE).isSupported || matchObj == null) {
            return;
        }
        TextView textView = this.f87061d;
        ImageView imageView = null;
        if (textView == null) {
            f0.S("tvResult");
            textView = null;
        }
        textView.setBackground(ViewUtils.G(ViewUtils.f(getContext(), 2.0f), com.max.xiaoheihe.utils.d.e1(matchObj.getColor())));
        TextView textView2 = this.f87061d;
        if (textView2 == null) {
            f0.S("tvResult");
            textView2 = null;
        }
        textView2.setText(c.x(matchObj.getWin()) ? "胜利" : "失败");
        TextView textView3 = this.f87062e;
        if (textView3 == null) {
            f0.S("tvDuration");
            textView3 = null;
        }
        textView3.setText(matchObj.getTime_desc());
        String hero_image = matchObj.getHero_image();
        Dota2HeroImageView dota2HeroImageView = this.f87066i;
        if (dota2HeroImageView == null) {
            f0.S("vDota2Hero");
            dota2HeroImageView = null;
        }
        com.max.hbimage.b.K(hero_image, dota2HeroImageView.getIv_image());
        Dota2HeroImageView dota2HeroImageView2 = this.f87066i;
        if (dota2HeroImageView2 == null) {
            f0.S("vDota2Hero");
            dota2HeroImageView2 = null;
        }
        dota2HeroImageView2.getTv_level().setText(matchObj.getHero_level());
        Dota2HeroImageView dota2HeroImageView3 = this.f87066i;
        if (dota2HeroImageView3 == null) {
            f0.S("vDota2Hero");
            dota2HeroImageView3 = null;
        }
        dota2HeroImageView3.getV_mvp().setVisibility(c.x(matchObj.is_mvp()) ? 0 : 8);
        String hero_variant = matchObj.getHero_variant();
        if (hero_variant != null && hero_variant.length() != 0) {
            z10 = false;
        }
        if (z10) {
            Dota2HeroImageView dota2HeroImageView4 = this.f87066i;
            if (dota2HeroImageView4 == null) {
                f0.S("vDota2Hero");
                dota2HeroImageView4 = null;
            }
            dota2HeroImageView4.setVisibility(8);
            g.f74531b.q("[Dota2FollowMatchItemView#setMatch] hero_variant field is invalid");
        } else {
            Dota2HeroImageView dota2HeroImageView5 = this.f87066i;
            if (dota2HeroImageView5 == null) {
                f0.S("vDota2Hero");
                dota2HeroImageView5 = null;
            }
            dota2HeroImageView5.getIv_icon().setVisibility(0);
            String hero_variant2 = matchObj.getHero_variant();
            Dota2HeroImageView dota2HeroImageView6 = this.f87066i;
            if (dota2HeroImageView6 == null) {
                f0.S("vDota2Hero");
                dota2HeroImageView6 = null;
            }
            com.max.hbimage.b.g0(hero_variant2, dota2HeroImageView6.getIv_icon(), ViewUtils.f(getContext(), 3.0f), -1, null, 1);
        }
        KDAView kDAView = this.f87065h;
        if (kDAView == null) {
            f0.S("vKda");
            kDAView = null;
        }
        kDAView.setKDA(matchObj.getKda());
        String avatar = matchObj.getAvatar();
        ImageView imageView2 = this.f87059b;
        if (imageView2 == null) {
            f0.S("ivAvatar");
            imageView2 = null;
        }
        com.max.hbimage.b.L(avatar, imageView2, R.drawable.common_default_game_avatar_74x74);
        TextView textView4 = this.f87064g;
        if (textView4 == null) {
            f0.S("tvDanName");
            textView4 = null;
        }
        textView4.setText(matchObj.getDan_desc());
        TextView textView5 = this.f87060c;
        if (textView5 == null) {
            f0.S("tvName");
            textView5 = null;
        }
        textView5.setText(matchObj.getName());
        ImageView imageView3 = this.f87068k;
        if (imageView3 == null) {
            f0.S("ivAuthentication");
            imageView3 = null;
        }
        imageView3.setVisibility(c.x(matchObj.is_verified()) ? 0 : 8);
        ImageView imageView4 = this.f87059b;
        if (imageView4 == null) {
            f0.S("ivAvatar");
        } else {
            imageView = imageView4;
        }
        imageView.setOnClickListener(new a(matchObj, this));
    }
}
