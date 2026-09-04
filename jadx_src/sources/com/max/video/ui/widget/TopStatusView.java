package com.max.video.ui.widget;

import af.g;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.max.hbvideo.R;
import com.max.video.player.VideoPlayerManager;
import com.max.video.player.info.NetworkType;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.KotlinNothingValueException;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.flow.u;
import kotlinx.coroutines.q0;
import xd.h;
import yh.p;

/* JADX INFO: compiled from: TopStatusView.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class TopStatusView extends FrameLayout implements af.a, g {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f76112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f76113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f76114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final h f76115e;

    /* JADX INFO: renamed from: com.max.video.ui.widget.TopStatusView$1, reason: invalid class name */
    /* JADX INFO: compiled from: TopStatusView.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.video.ui.widget.TopStatusView$1", f = "TopStatusView.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f76116b;

        /* JADX INFO: renamed from: com.max.video.ui.widget.TopStatusView$1$a */
        /* JADX INFO: compiled from: TopStatusView.kt */
        public static final class a<T> implements kotlinx.coroutines.flow.f {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TopStatusView f76118b;

            a(TopStatusView topStatusView) {
                this.f76118b = topStatusView;
            }

            @dl.e
            public final Object a(boolean z10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), cVar}, this, changeQuickRedirect, false, bb.c.m.Kq, new Class[]{Boolean.TYPE, kotlin.coroutines.c.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                this.f76118b.b(z10);
                return b2.f124493a;
            }

            @Override // kotlinx.coroutines.flow.f
            public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.c cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.Lq, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(((Boolean) obj).booleanValue(), cVar);
            }
        }

        AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.Hq, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : TopStatusView.this.new AnonymousClass1(cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.Jq, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.Iq, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.Gq, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f76116b;
            if (i10 == 0) {
                t0.n(obj);
                u<Boolean> uVarH = VideoPlayerManager.f76079a.h();
                a aVar = new a(TopStatusView.this);
                this.f76116b = 1;
                if (uVarH.a(aVar, this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.max.video.ui.widget.TopStatusView$2, reason: invalid class name */
    /* JADX INFO: compiled from: TopStatusView.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.video.ui.widget.TopStatusView$2", f = "TopStatusView.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f76119b;

        /* JADX INFO: renamed from: com.max.video.ui.widget.TopStatusView$2$a */
        /* JADX INFO: compiled from: TopStatusView.kt */
        public static final class a<T> implements kotlinx.coroutines.flow.f {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TopStatusView f76121b;

            a(TopStatusView topStatusView) {
                this.f76121b = topStatusView;
            }

            @dl.e
            public final Object a(int i10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), cVar}, this, changeQuickRedirect, false, bb.c.m.Qq, new Class[]{Integer.TYPE, kotlin.coroutines.c.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                this.f76121b.c(i10);
                return b2.f124493a;
            }

            @Override // kotlinx.coroutines.flow.f
            public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.c cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.Rq, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(((Number) obj).intValue(), cVar);
            }
        }

        AnonymousClass2(kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.Nq, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : TopStatusView.this.new AnonymousClass2(cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.Pq, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.Oq, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.Mq, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f76119b;
            if (i10 == 0) {
                t0.n(obj);
                u<Integer> uVarI = VideoPlayerManager.f76079a.i();
                a aVar = new a(TopStatusView.this);
                this.f76119b = 1;
                if (uVarI.a(aVar, this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.max.video.ui.widget.TopStatusView$3, reason: invalid class name */
    /* JADX INFO: compiled from: TopStatusView.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.video.ui.widget.TopStatusView$3", f = "TopStatusView.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f76122b;

        /* JADX INFO: renamed from: com.max.video.ui.widget.TopStatusView$3$a */
        /* JADX INFO: compiled from: TopStatusView.kt */
        public static final class a<T> implements kotlinx.coroutines.flow.f {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TopStatusView f76124b;

            a(TopStatusView topStatusView) {
                this.f76124b = topStatusView;
            }

            @dl.e
            public final Object a(@dl.d NetworkType networkType, @dl.d kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{networkType, cVar}, this, changeQuickRedirect, false, bb.c.m.Wq, new Class[]{NetworkType.class, kotlin.coroutines.c.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                this.f76124b.a(networkType);
                return b2.f124493a;
            }

            @Override // kotlinx.coroutines.flow.f
            public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.c cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.Xq, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a((NetworkType) obj, cVar);
            }
        }

        AnonymousClass3(kotlin.coroutines.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.Tq, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : TopStatusView.this.new AnonymousClass3(cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.Vq, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.Uq, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass3) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.Sq, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f76122b;
            if (i10 == 0) {
                t0.n(obj);
                u<NetworkType> uVarN = VideoPlayerManager.f76079a.n();
                a aVar = new a(TopStatusView.this);
                this.f76122b = 1;
                if (uVarN.a(aVar, this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: compiled from: TopStatusView.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f76125a;

        static {
            int[] iArr = new int[NetworkType.valuesCustom().length];
            try {
                iArr[NetworkType.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NetworkType.MOBILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NetworkType.GEN5.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NetworkType.GEN4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NetworkType.GEN3.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[NetworkType.GEN2.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f76125a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopStatusView(@dl.d Context context) {
        super(context);
        f0.p(context, "context");
        this.f76112b = R.color.white;
        this.f76114d = 100;
        h hVarD = h.d(LayoutInflater.from(getContext()), this, true);
        f0.o(hVarD, "inflate(...)");
        this.f76115e = hVarD;
        LifecycleCoroutineScope lifecycleCoroutineScopeC = ye.a.f141789a.c(getContext());
        if (lifecycleCoroutineScopeC != null) {
            lifecycleCoroutineScopeC.f(new AnonymousClass1(null));
        }
        if (lifecycleCoroutineScopeC != null) {
            lifecycleCoroutineScopeC.f(new AnonymousClass2(null));
        }
        if (lifecycleCoroutineScopeC != null) {
            lifecycleCoroutineScopeC.f(new AnonymousClass3(null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopStatusView(@dl.d Context context, @dl.e AttributeSet attributeSet) {
        super(context, attributeSet);
        f0.p(context, "context");
        this.f76112b = R.color.white;
        this.f76114d = 100;
        h hVarD = h.d(LayoutInflater.from(getContext()), this, true);
        f0.o(hVarD, "inflate(...)");
        this.f76115e = hVarD;
        LifecycleCoroutineScope lifecycleCoroutineScopeC = ye.a.f141789a.c(getContext());
        if (lifecycleCoroutineScopeC != null) {
            lifecycleCoroutineScopeC.f(new AnonymousClass1(null));
        }
        if (lifecycleCoroutineScopeC != null) {
            lifecycleCoroutineScopeC.f(new AnonymousClass2(null));
        }
        if (lifecycleCoroutineScopeC != null) {
            lifecycleCoroutineScopeC.f(new AnonymousClass3(null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopStatusView(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        this.f76112b = R.color.white;
        this.f76114d = 100;
        h hVarD = h.d(LayoutInflater.from(getContext()), this, true);
        f0.o(hVarD, "inflate(...)");
        this.f76115e = hVarD;
        LifecycleCoroutineScope lifecycleCoroutineScopeC = ye.a.f141789a.c(getContext());
        if (lifecycleCoroutineScopeC != null) {
            lifecycleCoroutineScopeC.f(new AnonymousClass1(null));
        }
        if (lifecycleCoroutineScopeC != null) {
            lifecycleCoroutineScopeC.f(new AnonymousClass2(null));
        }
        if (lifecycleCoroutineScopeC != null) {
            lifecycleCoroutineScopeC.f(new AnonymousClass3(null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopStatusView(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        f0.p(context, "context");
        this.f76112b = R.color.white;
        this.f76114d = 100;
        h hVarD = h.d(LayoutInflater.from(getContext()), this, true);
        f0.o(hVarD, "inflate(...)");
        this.f76115e = hVarD;
        LifecycleCoroutineScope lifecycleCoroutineScopeC = ye.a.f141789a.c(getContext());
        if (lifecycleCoroutineScopeC != null) {
            lifecycleCoroutineScopeC.f(new AnonymousClass1(null));
        }
        if (lifecycleCoroutineScopeC != null) {
            lifecycleCoroutineScopeC.f(new AnonymousClass2(null));
        }
        if (lifecycleCoroutineScopeC != null) {
            lifecycleCoroutineScopeC.f(new AnonymousClass3(null));
        }
    }

    private final void d() {
        int i10;
        String string;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Eq, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f76113c) {
            this.f76112b = R.color.battery_charging;
            this.f76115e.f141288b.setVisibility(0);
            string = "正在充电";
        } else {
            int i11 = this.f76114d;
            if (i11 < 10) {
                i10 = R.color.battery_warning;
            } else {
                i10 = i11 < 20 ? R.color.battery_low : R.color.white;
            }
            this.f76112b = i10;
            this.f76115e.f141288b.setVisibility(8);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f76114d);
            sb2.append('%');
            string = sb2.toString();
        }
        View view = this.f76115e.f141293g;
        ye.d dVar = ye.d.f141796a;
        Context context = getContext();
        f0.o(context, "getContext(...)");
        view.setBackground(dVar.a(context, this.f76112b, 1.0f));
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f76115e.f141293g.getLayoutParams();
        ye.b bVar = ye.b.f141790a;
        Context context2 = getContext();
        f0.o(context2, "getContext(...)");
        int iA = bVar.a(context2, 2.0f);
        if (layoutParams != null) {
            float f10 = this.f76114d / 100.0f;
            Context context3 = getContext();
            f0.o(context3, "getContext(...)");
            layoutParams.width = (int) (f10 * bVar.a(context3, 18.0f));
        } else {
            float f11 = this.f76114d / 100.0f;
            Context context4 = getContext();
            f0.o(context4, "getContext(...)");
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) (f11 * bVar.a(context4, 18.0f)), -1);
            layoutParams2.addRule(21);
            layoutParams2.topMargin = iA;
            layoutParams2.bottomMargin = iA;
            Context context5 = getContext();
            f0.o(context5, "getContext(...)");
            layoutParams2.setMarginEnd(bVar.a(context5, 4.0f));
            this.f76115e.f141293g.setLayoutParams(layoutParams2);
        }
        this.f76115e.f141291e.setText(string);
        this.f76115e.f141291e.requestLayout();
        this.f76115e.f141295i.requestLayout();
    }

    @Override // af.g
    public void a(@dl.d NetworkType type) {
        if (PatchProxy.proxy(new Object[]{type}, this, changeQuickRedirect, false, bb.c.m.Fq, new Class[]{NetworkType.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(type, "type");
        switch (a.f76125a[type.ordinal()]) {
            case 1:
                this.f76115e.f141289c.setImageResource(R.drawable.video_wifi_filled_24x24);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                this.f76115e.f141289c.setImageResource(R.drawable.video_signal_filled_24x24);
                break;
            default:
                this.f76115e.f141289c.setImageResource(R.color.transparent);
                break;
        }
        this.f76115e.f141289c.requestLayout();
    }

    @Override // af.a
    public void b(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.m.Dq, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f76113c = z10;
        d();
    }

    @Override // af.a
    public void c(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.Cq, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f76114d = i10;
        d();
    }

    @dl.d
    public final h getBinding() {
        return this.f76115e;
    }
}
