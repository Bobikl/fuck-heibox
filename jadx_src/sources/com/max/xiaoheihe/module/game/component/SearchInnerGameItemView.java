package com.max.xiaoheihe.module.game.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbutils.utils.n;
import com.max.hbutils.utils.q;
import com.max.hbwallet.bean.MallCouponGuideObj;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.game.GamePriceObj;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.uh0;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: SearchInnerGameItemView.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nSearchInnerGameItemView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchInnerGameItemView.kt\ncom/max/xiaoheihe/module/game/component/SearchInnerGameItemView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,113:1\n262#2,2:114\n262#2,2:116\n262#2,2:118\n262#2,2:120\n262#2,2:122\n262#2,2:124\n262#2,2:126\n*S KotlinDebug\n*F\n+ 1 SearchInnerGameItemView.kt\ncom/max/xiaoheihe/module/game/component/SearchInnerGameItemView\n*L\n78#1:114,2\n80#1:116,2\n83#1:118,2\n89#1:120,2\n90#1:122,2\n93#1:124,2\n94#1:126,2\n*E\n"})
@o(parameters = 0)
public final class SearchInnerGameItemView extends RelativeLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f86987c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public uh0 f86988b;

    /* JADX INFO: compiled from: SearchInnerGameItemView.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameObj f86990c;

        a(GameObj gameObj) {
            this.f86990c = gameObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37013, new Class[]{View.class}, Void.TYPE).isSupported && i0.e(SearchInnerGameItemView.this.getContext())) {
                String follow_state = this.f86990c.getFollow_state();
                String str = f0.g("unfollowing", follow_state) ? "following" : "unfollowing";
                if (f0.g("unfollowing", follow_state)) {
                    GameObj gameObj = this.f86990c;
                    gameObj.setFollow_num(String.valueOf(n.q(gameObj.getFollow_num()) + 1));
                } else {
                    GameObj gameObj2 = this.f86990c;
                    gameObj2.setFollow_num(String.valueOf(Math.max(0, n.q(gameObj2.getFollow_num()) - 1)));
                }
                this.f86990c.setFollow_state(str);
                SearchInnerGameItemView.this.getBinding().f116449h.i(str, this.f86990c.getFollow_num(), null);
                r1.D(this.f86990c.getAppid(), str, null);
            }
        }
    }

    public SearchInnerGameItemView(@e Context context) {
        this(context, null);
    }

    public SearchInnerGameItemView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SearchInnerGameItemView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SearchInnerGameItemView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37009, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Context context = getContext();
        f0.o(context, "context");
        uh0 uh0VarB = uh0.b(kb.c.d(context), this);
        f0.o(uh0VarB, "inflate(context.layoutInflater(), this)");
        setBinding(uh0VarB);
    }

    public final boolean b(@e GameObj gameObj, @d GamePriceView.ColorType colorType) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameObj, colorType}, this, changeQuickRedirect, false, 37010, new Class[]{GameObj.class, GamePriceView.ColorType.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(colorType, "colorType");
        GamePriceView setGamePrice$lambda$0 = getBinding().f116444c;
        if (gameObj == null) {
            setGamePrice$lambda$0.setVisibility(8);
            return false;
        }
        setGamePrice$lambda$0.setVisibility(0);
        f0.o(setGamePrice$lambda$0, "setGamePrice$lambda$0");
        return GamePriceView.k(setGamePrice$lambda$0, gameObj, false, colorType, true, false, 16, null);
    }

    @d
    public final uh0 getBinding() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37007, new Class[0], uh0.class);
        if (patchProxyResultProxy.isSupported) {
            return (uh0) patchProxyResultProxy.result;
        }
        uh0 uh0Var = this.f86988b;
        if (uh0Var != null) {
            return uh0Var;
        }
        f0.S("binding");
        return null;
    }

    public final void setBinding(@d uh0 uh0Var) {
        if (PatchProxy.proxy(new Object[]{uh0Var}, this, changeQuickRedirect, false, 37008, new Class[]{uh0.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(uh0Var, "<set-?>");
        this.f86988b = uh0Var;
    }

    public final void setData(@e GameObj gameObj) {
        MallCouponGuideObj coupon_info;
        String coupon_desc;
        if (PatchProxy.proxy(new Object[]{gameObj}, this, changeQuickRedirect, false, 37012, new Class[]{GameObj.class}, Void.TYPE).isSupported || gameObj == null) {
            return;
        }
        setGameName(gameObj.getName());
        String appicon = gameObj.getAppicon();
        if (appicon == null) {
            appicon = gameObj.getImage();
        }
        com.max.hbimage.b.K(appicon, getBinding().f116445d);
        if (!com.max.hbcommon.utils.c.w(gameObj.getPlatforms_icon())) {
            com.max.hbimage.b.K(gameObj.getPlatforms_icon().get(0), getBinding().f116446e);
        }
        TextView textView = getBinding().f116447f;
        f0.o(textView, "binding.tvCouponDesc");
        textView.setVisibility(8);
        b(gameObj, GamePriceView.ColorType.White);
        GamePriceView gamePriceView = getBinding().f116444c;
        f0.o(gamePriceView, "binding.gpv");
        gamePriceView.setVisibility(0);
        GamePriceObj heybox_price = gameObj.getHeybox_price();
        if (heybox_price != null && (coupon_info = heybox_price.getCoupon_info()) != null && (coupon_desc = coupon_info.getCoupon_desc()) != null) {
            TextView setData$lambda$2$lambda$1 = getBinding().f116447f;
            f0.o(setData$lambda$2$lambda$1, "setData$lambda$2$lambda$1");
            setData$lambda$2$lambda$1.setVisibility(0);
            setData$lambda$2$lambda$1.setText(coupon_desc);
            setData$lambda$2$lambda$1.setBackground(q.o(setData$lambda$2$lambda$1.getContext(), R.color.store_preferential_color, 2.0f));
        }
        if (n.p(gameObj.getScore()) > 0.0f) {
            GameScoreWithNumView gameScoreWithNumView = getBinding().f116443b;
            f0.o(gameScoreWithNumView, "binding.gameDetailScore");
            gameScoreWithNumView.setVisibility(0);
            GameFollowWithNumView gameFollowWithNumView = getBinding().f116449h;
            f0.o(gameFollowWithNumView, "binding.vGameFollow");
            gameFollowWithNumView.setVisibility(8);
            getBinding().f116443b.setData(null, gameObj.getScore(), null, gameObj.getScore_comment());
            return;
        }
        GameScoreWithNumView gameScoreWithNumView2 = getBinding().f116443b;
        f0.o(gameScoreWithNumView2, "binding.gameDetailScore");
        gameScoreWithNumView2.setVisibility(8);
        GameFollowWithNumView gameFollowWithNumView2 = getBinding().f116449h;
        f0.o(gameFollowWithNumView2, "binding.vGameFollow");
        gameFollowWithNumView2.setVisibility(0);
        getBinding().f116449h.i(gameObj.getFollow_state(), gameObj.getFollow_num(), null);
        getBinding().f116449h.setOnClickListener(new a(gameObj));
    }

    public final void setGameName(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 37011, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        getBinding().f116448g.setText(str);
    }
}
