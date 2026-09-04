package com.max.hbcommon.component.card;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import bb.c;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.LazyThreadSafetyMode;
import kotlin.b0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.z;
import xh.m;

/* JADX INFO: compiled from: CardViewGenerator.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class CardViewGenerator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    public static final a f67433b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private static final z<CardViewGenerator> f67434c = b0.b(LazyThreadSafetyMode.SYNCHRONIZED, new yh.a<CardViewGenerator>() { // from class: com.max.hbcommon.component.card.CardViewGenerator$Companion$instance$2
        public static ChangeQuickRedirect changeQuickRedirect;

        @d
        public final CardViewGenerator a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.Jm, new Class[0], CardViewGenerator.class);
            return patchProxyResultProxy.isSupported ? (CardViewGenerator) patchProxyResultProxy.result : new CardViewGenerator(null);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.max.hbcommon.component.card.CardViewGenerator, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ CardViewGenerator invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.Km, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }
    });
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @e
    private com.max.hbcommon.component.card.a f67435a;

    /* JADX INFO: compiled from: CardViewGenerator.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @m
        public static /* synthetic */ void b() {
        }

        @d
        public final CardViewGenerator a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.Im, new Class[0], CardViewGenerator.class);
            return patchProxyResultProxy.isSupported ? (CardViewGenerator) patchProxyResultProxy.result : (CardViewGenerator) CardViewGenerator.f67434c.getValue();
        }
    }

    private CardViewGenerator() {
    }

    public /* synthetic */ CardViewGenerator(u uVar) {
        this();
    }

    private final void b(ViewGroup viewGroup, CardParam<?> cardParam) {
        if (PatchProxy.proxy(new Object[]{viewGroup, cardParam}, this, changeQuickRedirect, false, c.d.Fm, new Class[]{ViewGroup.class, CardParam.class}, Void.TYPE).isSupported) {
            return;
        }
        LinearLayout linearLayout = new LinearLayout(cardParam.c());
        linearLayout.setOrientation(0);
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new LinearLayout.LayoutParams(new LinearLayout.LayoutParams(-2, -2));
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = cardParam.l();
        viewGroup.addView(linearLayout, layoutParams2);
        int size = cardParam.d().size();
        int iW = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            if (!cardParam.n(i11)) {
                com.max.hbcommon.component.card.a aVar = this.f67435a;
                View viewA = aVar != null ? aVar.a(viewGroup, i11, cardParam) : null;
                int iW2 = ViewUtils.W(viewA) + cardParam.f();
                if (cardParam.p()) {
                    iW += iW2;
                    if (iW > cardParam.g()) {
                        i10++;
                        if (cardParam.q(i10)) {
                            return;
                        }
                        linearLayout = f(cardParam);
                        if (viewA != null) {
                            viewA.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                        }
                        linearLayout.addView(viewA);
                        viewGroup.addView(linearLayout);
                        iW = ViewUtils.W(viewA) + cardParam.f();
                    } else {
                        linearLayout.addView(viewA);
                    }
                } else {
                    linearLayout.addView(viewA);
                }
            }
        }
    }

    private final void d(CardParam<?> cardParam) {
        if (PatchProxy.proxy(new Object[]{cardParam}, this, changeQuickRedirect, false, c.d.Dm, new Class[]{CardParam.class}, Void.TYPE).isSupported) {
            return;
        }
        if (true ^ cardParam.d().isEmpty()) {
            this.f67435a = ob.a.b().E(cardParam.d().get(0), cardParam);
        } else {
            this.f67435a = null;
        }
    }

    @d
    public static final CardViewGenerator e() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.d.Hm, new Class[0], CardViewGenerator.class);
        return patchProxyResultProxy.isSupported ? (CardViewGenerator) patchProxyResultProxy.result : f67433b.a();
    }

    private final LinearLayout f(CardParam<?> cardParam) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cardParam}, this, changeQuickRedirect, false, c.d.Gm, new Class[]{CardParam.class}, LinearLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearLayout) patchProxyResultProxy.result;
        }
        LinearLayout linearLayout = new LinearLayout(cardParam.c());
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(cardParam.f(), cardParam.f(), 0, 0);
        linearLayout.setLayoutParams(layoutParams);
        return linearLayout;
    }

    public final <T> void c(@d ViewGroup layout, @d CardParam<T> param) {
        if (PatchProxy.proxy(new Object[]{layout, param}, this, changeQuickRedirect, false, c.d.Em, new Class[]{ViewGroup.class, CardParam.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(layout, "layout");
        f0.p(param, "param");
        d(param);
        if (this.f67435a != null) {
            b(layout, param);
        } else {
            com.max.hbcommon.utils.d.b("CardViewGenerator", "null Creator");
        }
    }
}
