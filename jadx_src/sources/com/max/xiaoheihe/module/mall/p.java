package com.max.xiaoheihe.module.mall;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbcommon.component.bottomsheet.t;
import com.max.hbcustomview.GradientTextView;
import com.max.hbutils.bean.Result;
import com.max.hbutils.core.BaseApplication;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.bean.mall.MemberBulletinResultObj;
import com.max.xiaoheihe.bean.mall.MemberCardInfoObj;
import com.max.xiaoheihe.bean.mall.ProgressBarObj;
import com.max.xiaoheihe.bean.rich.RichAttributeModelObj;
import com.max.xiaoheihe.utils.viewprioritymanager.ViewPriority;
import com.max.xiaoheihe.view.richtext.RichViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import df.b80;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.s;

/* JADX INFO: compiled from: MemberCardManager.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nMemberCardManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemberCardManager.kt\ncom/max/xiaoheihe/module/mall/MemberCardManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,234:1\n1549#2:235\n1620#2,3:236\n*S KotlinDebug\n*F\n+ 1 MemberCardManager.kt\ncom/max/xiaoheihe/module/mall/MemberCardManager\n*L\n144#1:235\n144#1:236,3\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final p f90999a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f91000b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: MemberCardManager.kt */
    public static final class a extends com.max.hbcommon.network.d<Result<MemberBulletinResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 40834, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
        }

        public void onNext(@dl.d Result<MemberBulletinResultObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40835, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            MemberBulletinResultObj result2 = result.getResult();
            if (result2 != null) {
                p.a(p.f90999a, result2);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40836, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MemberBulletinResultObj>) obj);
        }
    }

    /* JADX INFO: compiled from: MemberCardManager.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MemberCardInfoObj f91001b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BaseApplication f91002c;

        b(MemberCardInfoObj memberCardInfoObj, BaseApplication baseApplication) {
            this.f91001b = memberCardInfoObj;
            this.f91002c = baseApplication;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            KeyDescObj button;
            String protocol;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40837, new Class[]{View.class}, Void.TYPE).isSupported || (button = this.f91001b.getButton()) == null || (protocol = button.getProtocol()) == null) {
                return;
            }
            BaseApplication context = this.f91002c;
            f0.o(context, "context");
            com.max.xiaoheihe.base.router.b.k0(context, protocol);
        }
    }

    /* JADX INFO: compiled from: MemberCardManager.kt */
    public static final class c implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f91003b = new c();
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    }

    /* JADX INFO: compiled from: MemberCardManager.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.bottomsheet.q f91004b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MemberBulletinResultObj f91005c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<Activity> f91006d;

        d(com.max.hbcommon.component.bottomsheet.q qVar, MemberBulletinResultObj memberBulletinResultObj, Ref.ObjectRef<Activity> objectRef) {
            this.f91004b = qVar;
            this.f91005c = memberBulletinResultObj;
            this.f91006d = objectRef;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40838, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f91004b.dismiss();
            KeyDescObj button = this.f91005c.getButton();
            if (com.max.hbcommon.utils.c.u(button != null ? button.getProtocol() : null)) {
                return;
            }
            Activity activity = this.f91006d.f124891b;
            KeyDescObj button2 = this.f91005c.getButton();
            com.max.xiaoheihe.base.router.b.k0(activity, button2 != null ? button2.getProtocol() : null);
        }
    }

    /* JADX INFO: compiled from: MemberCardManager.kt */
    public static final class e implements t {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.hbcommon.component.bottomsheet.t
        public void onDismiss() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40839, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.viewprioritymanager.a.f95777a.b(ViewPriority.LOW.getValue());
        }
    }

    private p() {
    }

    public static final /* synthetic */ void a(p pVar, MemberBulletinResultObj memberBulletinResultObj) {
        if (PatchProxy.proxy(new Object[]{pVar, memberBulletinResultObj}, null, changeQuickRedirect, true, 40833, new Class[]{p.class, MemberBulletinResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        pVar.f(memberBulletinResultObj);
    }

    private final void d(b80 b80Var, int i10, int i11, float f10) {
        Object[] objArr = {b80Var, new Integer(i10), new Integer(i11), new Float(f10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 40832, new Class[]{b80.class, cls, cls, Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        Context context = b80Var.b().getContext();
        f0.o(context, "root.context");
        float fC = com.max.xiaoheihe.accelworld.l.c(2.0f, context);
        com.max.xiaoheihe.accelworld.l.s(b80Var.f108868i, i10, fC);
        int iL = ViewUtils.L(b80Var.b().getContext());
        ViewGroup.LayoutParams layoutParams = b80Var.f108867h.getLayoutParams();
        f0.o(layoutParams, "vVipLevelProgress.layoutParams");
        Context context2 = b80Var.b().getContext();
        f0.o(context2, "root.context");
        layoutParams.width = (int) ((iL - com.max.xiaoheihe.accelworld.l.d(50, context2)) * f10);
        b80Var.f108867h.setLayoutParams(layoutParams);
        com.max.xiaoheihe.accelworld.l.s(b80Var.f108867h, i11, fC);
    }

    private final void e(b80 b80Var, ProgressBarObj progressBarObj) {
        Float fK0;
        if (PatchProxy.proxy(new Object[]{b80Var, progressBarObj}, this, changeQuickRedirect, false, 40831, new Class[]{b80.class, ProgressBarObj.class}, Void.TYPE).isSupported) {
            return;
        }
        String progress = progressBarObj.getProgress();
        float fFloatValue = (progress == null || (fK0 = s.K0(progress)) == null) ? 0.0f : fK0.floatValue();
        String progress_tinted_color = progressBarObj.getProgress_tinted_color();
        if (progress_tinted_color != null) {
            int iD = com.max.hbutils.utils.a.d(progress_tinted_color);
            String progress_bg_color = progressBarObj.getProgress_bg_color();
            if (progress_bg_color != null) {
                f90999a.d(b80Var, com.max.hbutils.utils.a.d(progress_bg_color), iD, fFloatValue);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, android.app.Activity] */
    private final void f(MemberBulletinResultObj memberBulletinResultObj) {
        if (PatchProxy.proxy(new Object[]{memberBulletinResultObj}, this, changeQuickRedirect, false, 40829, new Class[]{MemberBulletinResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? E = HeyBoxApplication.C().E();
        objectRef.f124891b = E;
        if (E == 0 || E.isFinishing() || !(objectRef.f124891b instanceof FragmentActivity)) {
            return;
        }
        com.max.xiaoheihe.utils.viewprioritymanager.a aVar = com.max.xiaoheihe.utils.viewprioritymanager.a.f95777a;
        ViewPriority viewPriority = ViewPriority.LOW;
        if (aVar.c(viewPriority.getValue())) {
            Activity activity = (Activity) objectRef.f124891b;
            com.max.hbcommon.component.bottomsheet.a aVar2 = new com.max.hbcommon.component.bottomsheet.a();
            View viewInflate = LayoutInflater.from((Context) objectRef.f124891b).inflate(R.layout.layout_member_card_bulletin_dialog, (ViewGroup) null);
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_title);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_card_desc);
            TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_card_tips);
            textView.setText(memberBulletinResultObj.getTitle());
            textView2.setText(memberBulletinResultObj.getDesc());
            textView3.setText(memberBulletinResultObj.getTips());
            viewInflate.setOnClickListener(c.f91003b);
            ViewGroup cv_card = (ViewGroup) viewInflate.findViewById(R.id.cv_card);
            MemberCardInfoObj card = memberBulletinResultObj.getCard();
            if (card != null) {
                p pVar = f90999a;
                f0.o(cv_card, "cv_card");
                pVar.c(card, cv_card, 156.0f, 27.0f);
            }
            viewInflate.setBackground(com.max.hbutils.utils.q.E(activity, R.color.divider_secondary_2_color, 12.0f));
            BottomButtonLeftItemView bottomButtonLeftItemView = (BottomButtonLeftItemView) viewInflate.findViewById(R.id.btn_action);
            bottomButtonLeftItemView.setBackgroundResource(R.color.divider_secondary_2_color);
            aVar2.h(R.drawable.bottom_sheets_key_discount_red_28x28).n(R.drawable.common_mall_equity_44x44).y(true).x(true).r(viewInflate);
            com.max.hbcommon.component.bottomsheet.q qVarA = aVar2.a();
            KeyDescObj button = memberBulletinResultObj.getButton();
            bottomButtonLeftItemView.setRightText(button != null ? button.getDesc() : null);
            bottomButtonLeftItemView.setOnClickListener(new d(qVarA, memberBulletinResultObj, objectRef));
            qVarA.y4(new e());
            aVar.a(viewPriority.getValue());
            qVarA.M3(((FragmentActivity) objectRef.f124891b).getSupportFragmentManager(), "stack_coupon_bottom_dialog");
            com.max.xiaoheihe.network.i.a().o5().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.p());
            if (qVarA.isViewCreated()) {
                View viewD4 = qVarA.d4();
                f0.n(viewD4, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                ViewGroup.LayoutParams layoutParams = ((ConstraintLayout) viewD4).getLayoutParams();
                f0.n(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) layoutParams2).height = -2;
                layoutParams2.T = (int) (ViewUtils.J(activity) * 0.85f);
                qVarA.m4().setVisibility(8);
                qVarA.e4().setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_2_color));
            }
        }
    }

    public final void b() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40828, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.i.a().I7().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a());
    }

    public final void c(@dl.d MemberCardInfoObj cardInfo, @dl.d View cardview, float f10, float f11) {
        Object[] objArr = {cardInfo, cardview, new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 40830, new Class[]{MemberCardInfoObj.class, View.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(cardInfo, "cardInfo");
        f0.p(cardview, "cardview");
        b80 b80VarA = b80.a(cardview);
        f0.o(b80VarA, "bind(cardview)");
        com.max.hbimage.b.K(cardInfo.getBackground(), b80VarA.f108862c);
        ArrayList<String> title_color = cardInfo.getTitle_color();
        if (title_color != null && title_color.size() > 0) {
            if (title_color.size() == 1) {
                GradientTextView gradientTextView = b80VarA.f108866g;
                gradientTextView.f68498j = false;
                gradientTextView.setTextColor(com.max.xiaoheihe.utils.d.e1(title_color.get(0)));
            } else {
                ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(title_color, 10));
                Iterator<T> it = title_color.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(com.max.xiaoheihe.utils.d.e1((String) it.next())));
                }
                b80VarA.f108866g.setColors(CollectionsKt___CollectionsKt.P5(arrayList), GradientDrawable.Orientation.TL_BR);
            }
        }
        b80VarA.f108866g.setText(cardInfo.getTitle());
        b80VarA.f108865f.setText(cardInfo.getSub_title());
        b80VarA.f108865f.setTextColor(com.max.hbcommon.utils.l.g(cardInfo.getSub_title_color()));
        BaseApplication baseApplicationA = BaseApplication.a();
        float fL = ViewUtils.L(baseApplicationA) / ViewUtils.f(baseApplicationA, 375.0f);
        float f12 = 15.0f * fL;
        float f13 = 10.0f * fL;
        float f14 = f11 * fL;
        float f15 = ViewUtils.f(baseApplicationA, f10) * fL;
        ViewGroup.LayoutParams layoutParams = b80VarA.b().getLayoutParams();
        layoutParams.height = (int) f15;
        b80VarA.b().setLayoutParams(layoutParams);
        b80VarA.f108866g.setTextSize(1, f12);
        b80VarA.f108865f.setTextSize(1, f13);
        ViewGroup.LayoutParams layoutParams2 = b80VarA.f108866g.getLayoutParams();
        f0.n(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = ViewUtils.f(baseApplicationA, f14);
        RichAttributeModelObj sub_title_attr = cardInfo.getSub_title_attr();
        if (sub_title_attr == null) {
            b80VarA.f108864e.setVisibility(8);
            b80VarA.f108865f.setVisibility(0);
        } else {
            RichViewGroup llSubTitleRichText = b80VarA.f108864e;
            f0.o(llSubTitleRichText, "llSubTitleRichText");
            RichViewGroup.setRichText$default(llSubTitleRichText, sub_title_attr, false, 2, null);
            b80VarA.f108865f.setVisibility(8);
            b80VarA.f108864e.setVisibility(0);
        }
        ProgressBarObj progress_bar = cardInfo.getProgress_bar();
        if (progress_bar == null) {
            b80VarA.f108861b.setVisibility(8);
            b80VarA.f108863d.setVisibility(8);
        } else {
            b80VarA.f108861b.setVisibility(0);
            f90999a.e(b80VarA, progress_bar);
            RichAttributeModelObj attr_text = progress_bar.getAttr_text();
            if (attr_text == null) {
                b80VarA.f108863d.setVisibility(8);
            } else {
                RichViewGroup llProgressRichText = b80VarA.f108863d;
                f0.o(llProgressRichText, "llProgressRichText");
                RichViewGroup.setRichText$default(llProgressRichText, attr_text, false, 2, null);
                b80VarA.f108863d.setVisibility(0);
            }
        }
        b80VarA.b().setOnClickListener(new b(cardInfo, baseApplicationA));
    }
}
