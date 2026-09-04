package com.max.xiaoheihe.module.game.component;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.google.gson.JsonObject;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.hbutils.utils.w;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.l;
import com.max.xiaoheihe.bean.game.calendar.GameEventObj;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.h60;
import dl.d;
import dl.e;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: GameEventItemView.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nGameEventItemView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameEventItemView.kt\ncom/max/xiaoheihe/module/game/component/GameEventItemView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,147:1\n262#2,2:148\n262#2,2:150\n262#2,2:152\n262#2,2:154\n262#2,2:156\n262#2,2:158\n262#2,2:160\n*S KotlinDebug\n*F\n+ 1 GameEventItemView.kt\ncom/max/xiaoheihe/module/game/component/GameEventItemView\n*L\n54#1:148,2\n65#1:150,2\n89#1:152,2\n103#1:154,2\n112#1:156,2\n118#1:158,2\n124#1:160,2\n*E\n"})
@o(parameters = 0)
public final class GameEventItemView extends FrameLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f86728c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h60 f86729b;

    /* JADX INFO: compiled from: GameEventItemView.kt */
    public static final class a implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WeakReference<View> f86730b;

        a(WeakReference<View> weakReference) {
            this.f86730b = weakReference;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@d ValueAnimator it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 36547, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            View view = this.f86730b.get();
            if (view == null) {
                return;
            }
            Object animatedValue = it.getAnimatedValue();
            f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            view.setAlpha(((Float) animatedValue).floatValue());
        }
    }

    /* JADX INFO: compiled from: GameEventItemView.kt */
    public static final class b implements l0.g {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ GameEventObj f86731a;

        b(GameEventObj gameEventObj) {
            this.f86731a = gameEventObj;
        }

        @Override // com.max.xiaoheihe.utils.l0.g
        public final void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36548, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("event_id", this.f86731a.getEvent_id());
            com.max.hbcommon.analytics.d.e("4", lb.d.f131146d4, null, null, jsonObject, null, true);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GameEventItemView(@d Context context) {
        this(context, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GameEventItemView(@d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GameEventItemView(@d Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameEventItemView(@d Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        f0.p(context, "context");
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36545, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Context context = getContext();
        f0.o(context, "context");
        h60 h60VarC = h60.c(kb.c.d(context));
        f0.o(h60VarC, "inflate(context.layoutInflater())");
        setBinding(h60VarC);
        addView(getBinding().b());
    }

    @d
    public final h60 getBinding() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36543, new Class[0], h60.class);
        if (patchProxyResultProxy.isSupported) {
            return (h60) patchProxyResultProxy.result;
        }
        h60 h60Var = this.f86729b;
        if (h60Var != null) {
            return h60Var;
        }
        f0.S("binding");
        return null;
    }

    public final void setBinding(@d h60 h60Var) {
        if (PatchProxy.proxy(new Object[]{h60Var}, this, changeQuickRedirect, false, 36544, new Class[]{h60.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(h60Var, "<set-?>");
        this.f86729b = h60Var;
    }

    public final void setData(@e GameEventObj gameEventObj) {
        if (PatchProxy.proxy(new Object[]{gameEventObj}, this, changeQuickRedirect, false, 36546, new Class[]{GameEventObj.class}, Void.TYPE).isSupported || gameEventObj == null) {
            return;
        }
        if (f0.g(gameEventObj.getNeed_shine_bg(), Boolean.TRUE)) {
            gameEventObj.setNeed_shine_bg(Boolean.FALSE);
            View view = getBinding().f111289k;
            f0.o(view, "binding.vShineBg");
            view.setVisibility(0);
            WeakReference weakReference = new WeakReference(getBinding().f111289k);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f, 0.5f, 0.0f, 0.5f, 1.0f, 0.0f);
            valueAnimatorOfFloat.setDuration(1000L);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new a(weakReference));
            valueAnimatorOfFloat.start();
        } else {
            View view2 = getBinding().f111289k;
            f0.o(view2, "binding.vShineBg");
            view2.setVisibility(8);
        }
        com.max.hbimage.b.K(gameEventObj.getImage(), getBinding().f111281c);
        LinearLayout linearLayout = getBinding().f111282d;
        List<String> platforms_icon = gameEventObj.getPlatforms_icon();
        if (platforms_icon == null || platforms_icon.size() <= 0) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
            linearLayout.removeAllViews();
            Iterator<String> it = platforms_icon.iterator();
            while (it.hasNext()) {
                ImageView iconImageView = r1.n0(linearLayout.getContext(), it.next(), ViewUtils.f(linearLayout.getContext(), 14.0f));
                if (iconImageView != null) {
                    f0.o(iconImageView, "iconImageView");
                    linearLayout.addView(iconImageView);
                }
            }
        }
        getBinding().f111287i.setText(gameEventObj.getTitle());
        TextView setData$lambda$4$lambda$3 = getBinding().f111286h;
        if (com.max.hbcommon.utils.c.u(gameEventObj.getDesc())) {
            f0.o(setData$lambda$4$lambda$3, "setData$lambda$4$lambda$3");
            setData$lambda$4$lambda$3.setVisibility(8);
        } else {
            f0.o(setData$lambda$4$lambda$3, "setData$lambda$4$lambda$3");
            setData$lambda$4$lambda$3.setVisibility(0);
            setData$lambda$4$lambda$3.setText(gameEventObj.getDesc());
            if (gameEventObj.isNormalEvent()) {
                setData$lambda$4$lambda$3.setTextColor(l.h(setData$lambda$4$lambda$3.getContext(), R.color.click_blue));
                l.q(setData$lambda$4$lambda$3, R.color.click_blue_alpha10, 2.0f);
            } else {
                setData$lambda$4$lambda$3.setTextColor(l.h(setData$lambda$4$lambda$3.getContext(), R.color.white));
                Context context = setData$lambda$4$lambda$3.getContext();
                f0.o(context, "context");
                setData$lambda$4$lambda$3.setBackground(ViewUtils.i((int) com.max.accelworld.c.a(2.0f, context), l.h(setData$lambda$4$lambda$3.getContext(), R.color.game_gradient_ultra_lowest_price_start_color), l.h(setData$lambda$4$lambda$3.getContext(), R.color.game_gradient_ultra_lowest_price_end_color)));
            }
        }
        l.q(getBinding().f111290l, R.color.background_card_1_color, 2.0f);
        long j10 = 1000;
        long jR = n.r(gameEventObj.getStart_timestamp()) * j10;
        long jR2 = n.r(gameEventObj.getEnd_timestamp()) * j10;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < jR) {
            LinearLayout linearLayout2 = getBinding().f111290l;
            f0.o(linearLayout2, "binding.vgCountDown");
            linearLayout2.setVisibility(0);
            String[] strArrJ = w.j(getContext(), jR2 - jR);
            getBinding().f111284f.setText("持续");
            getBinding().f111283e.setText(strArrJ[0]);
            getBinding().f111285g.setText(strArrJ[1]);
        } else {
            if (jR <= jCurrentTimeMillis && jCurrentTimeMillis <= jR2) {
                LinearLayout linearLayout3 = getBinding().f111290l;
                f0.o(linearLayout3, "binding.vgCountDown");
                linearLayout3.setVisibility(0);
                String[] strArrJ2 = w.j(getContext(), jR2 - jCurrentTimeMillis);
                getBinding().f111284f.setText("剩余");
                getBinding().f111283e.setText(strArrJ2[0]);
                getBinding().f111285g.setText(strArrJ2[1]);
            } else {
                LinearLayout linearLayout4 = getBinding().f111290l;
                f0.o(linearLayout4, "binding.vgCountDown");
                linearLayout4.setVisibility(8);
            }
        }
        getBinding().f111288j.setTime(jR, jR2, gameEventObj.getTitle(), gameEventObj.getDesc(), new b(gameEventObj));
    }
}
