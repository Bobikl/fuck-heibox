package com.max.xiaoheihe.module.bbs.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.l;
import com.max.xiaoheihe.base.router.b;
import com.max.xiaoheihe.bean.bbs.LinkToolCardObj;
import com.max.xiaoheihe.utils.d;
import com.max.xiaoheihe.view.uikit.HBUiKitView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.hg0;
import dl.e;
import kb.c;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: LinkToolCardView.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nLinkToolCardView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkToolCardView.kt\ncom/max/xiaoheihe/module/bbs/component/LinkToolCardView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,90:1\n262#2,2:91\n262#2,2:93\n262#2,2:95\n262#2,2:97\n262#2,2:99\n262#2,2:101\n262#2,2:103\n*S KotlinDebug\n*F\n+ 1 LinkToolCardView.kt\ncom/max/xiaoheihe/module/bbs/component/LinkToolCardView\n*L\n55#1:91,2\n57#1:93,2\n70#1:95,2\n74#1:97,2\n76#1:99,2\n78#1:101,2\n80#1:103,2\n*E\n"})
@o(parameters = 0)
public final class LinkToolCardView extends LinearLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f80885c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public hg0 f80886b;

    /* JADX INFO: compiled from: LinkToolCardView.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ LinkToolCardObj f80888c;

        a(LinkToolCardObj linkToolCardObj) {
            this.f80888c = linkToolCardObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27758, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Context context = LinkToolCardView.this.getContext();
            f0.o(context, "context");
            b.j0(context, this.f80888c.getProtocol());
        }
    }

    public LinkToolCardView(@e Context context) {
        this(context, null);
    }

    public LinkToolCardView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinkToolCardView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public LinkToolCardView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27756, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setOrientation(1);
        Context context = getContext();
        f0.o(context, "context");
        hg0 hg0VarB = hg0.b(c.d(context), this);
        f0.o(hg0VarB, "inflate(context.layoutInflater(), this)");
        setBinding(hg0VarB);
        TextView textView = getBinding().f111434d;
        Context context2 = getContext();
        f0.o(context2, "context");
        textView.setBackground(ViewUtils.i(l.c(3.0f, context2), d.E(R.color.icon_gradient_dark_start_color), d.E(R.color.icon_gradient_dark_end_color)));
    }

    @dl.d
    public final hg0 getBinding() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27754, new Class[0], hg0.class);
        if (patchProxyResultProxy.isSupported) {
            return (hg0) patchProxyResultProxy.result;
        }
        hg0 hg0Var = this.f80886b;
        if (hg0Var != null) {
            return hg0Var;
        }
        f0.S("binding");
        return null;
    }

    public final void setBinding(@dl.d hg0 hg0Var) {
        if (PatchProxy.proxy(new Object[]{hg0Var}, this, changeQuickRedirect, false, 27755, new Class[]{hg0.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(hg0Var, "<set-?>");
        this.f80886b = hg0Var;
    }

    public final void setData(@e LinkToolCardObj linkToolCardObj) {
        if (PatchProxy.proxy(new Object[]{linkToolCardObj}, this, changeQuickRedirect, false, 27757, new Class[]{LinkToolCardObj.class}, Void.TYPE).isSupported || linkToolCardObj == null) {
            return;
        }
        ImageView setData$lambda$3$lambda$0 = getBinding().f111432b;
        if (com.max.hbcommon.utils.c.u(linkToolCardObj.getIcon())) {
            f0.o(setData$lambda$3$lambda$0, "setData$lambda$3$lambda$0");
            setData$lambda$3$lambda$0.setVisibility(8);
        } else {
            com.max.hbimage.b.K(linkToolCardObj.getIcon(), setData$lambda$3$lambda$0);
            f0.o(setData$lambda$3$lambda$0, "setData$lambda$3$lambda$0");
            setData$lambda$3$lambda$0.setVisibility(0);
        }
        getBinding().f111437g.setText(linkToolCardObj.getTitle());
        getBinding().f111436f.setText(linkToolCardObj.getDesc());
        setBackground(q.i(getContext(), R.color.divider_secondary_2_color, R.color.divider_secondary_1_color, 0.5f, 8.0f));
        getBinding().f111439i.setBackground(q.M(q.s(getContext(), R.color.background_card_1_color, 8.0f), getContext(), R.color.divider_secondary_1_color, 0.5f));
        if (linkToolCardObj.getRich_ui() == null) {
            RelativeLayout setData$lambda$3$lambda$1 = getBinding().f111440j;
            f0.o(setData$lambda$3$lambda$1, "setData$lambda$3$lambda$1");
            setData$lambda$3$lambda$1.setVisibility(0);
            com.max.hbimage.b.d0(linkToolCardObj.getImage(), getBinding().f111433c, ViewUtils.p(setData$lambda$3$lambda$1.getContext(), getBinding().f111433c, ViewUtils.ViewType.IMAGE));
            getBinding().f111435e.setText(linkToolCardObj.getText());
            getBinding().f111434d.setText(linkToolCardObj.getBtn());
            TextView textView = getBinding().f111435e;
            f0.o(textView, "binding.tvContent");
            textView.setVisibility(true ^ com.max.hbcommon.utils.c.u(linkToolCardObj.getBtn()) ? 0 : 8);
            HBUiKitView hBUiKitView = getBinding().f111438h;
            f0.o(hBUiKitView, "binding.vUikitContent");
            hBUiKitView.setVisibility(8);
        } else {
            RelativeLayout relativeLayout = getBinding().f111440j;
            f0.o(relativeLayout, "binding.vgNormalContent");
            relativeLayout.setVisibility(8);
            HBUiKitView setData$lambda$3$lambda$2 = getBinding().f111438h;
            f0.o(setData$lambda$3$lambda$2, "setData$lambda$3$lambda$2");
            setData$lambda$3$lambda$2.setVisibility(0);
            setData$lambda$3$lambda$2.setDataToCreate(linkToolCardObj.getRich_ui());
        }
        setOnClickListener(new a(linkToolCardObj));
    }
}
