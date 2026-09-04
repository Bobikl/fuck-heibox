package com.max.xiaoheihe.module.story.widget.ui.video.widget;

import androidx.lifecycle.LifecycleCoroutineScope;
import com.max.xiaoheihe.network.CoroutineServiceGenerator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.util.Map;
import kotlin.Result;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.t0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.q0;
import yh.l;
import yh.p;

/* JADX INFO: compiled from: StoryBottomEditorBarWidget.kt */
/* JADX INFO: loaded from: classes12.dex */
@d(c = "com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryBottomEditorBarWidget$collectionLinkV2$1", f = "StoryBottomEditorBarWidget.kt", i = {}, l = {307, 315}, m = "invokeSuspend", n = {}, s = {})
public final class StoryBottomEditorBarWidget$collectionLinkV2$1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f92206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f92207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f92208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Map<String, String> f92209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ l<Boolean, b2> f92210f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ StoryBottomEditorBarWidget f92211g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ LifecycleCoroutineScope f92212h;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryBottomEditorBarWidget$collectionLinkV2$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: StoryBottomEditorBarWidget.kt */
    @d(c = "com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryBottomEditorBarWidget$collectionLinkV2$1$1", f = "StoryBottomEditorBarWidget.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f92213b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l<Boolean, b2> f92214c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f92215d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ StoryBottomEditorBarWidget f92216e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f92217f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Map<String, String> f92218g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ LifecycleCoroutineScope f92219h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(l<? super Boolean, b2> lVar, boolean z10, StoryBottomEditorBarWidget storyBottomEditorBarWidget, String str, Map<String, String> map, LifecycleCoroutineScope lifecycleCoroutineScope, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f92214c = lVar;
            this.f92215d = z10;
            this.f92216e = storyBottomEditorBarWidget;
            this.f92217f = str;
            this.f92218g = map;
            this.f92219h = lifecycleCoroutineScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 44052, new Class[]{Object.class, c.class}, c.class);
            return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new AnonymousClass1(this.f92214c, this.f92215d, this.f92216e, this.f92217f, this.f92218g, this.f92219h, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 44054, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 44053, new Class[]{q0.class, c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 44051, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            b.h();
            if (this.f92213b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
            this.f92214c.invoke(kotlin.coroutines.jvm.internal.a.a(this.f92215d));
            if (this.f92215d) {
                StoryBottomEditorBarWidget.u1(this.f92216e, this.f92217f, this.f92218g, this.f92219h);
            }
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    StoryBottomEditorBarWidget$collectionLinkV2$1(String str, Map<String, String> map, l<? super Boolean, b2> lVar, StoryBottomEditorBarWidget storyBottomEditorBarWidget, LifecycleCoroutineScope lifecycleCoroutineScope, c<? super StoryBottomEditorBarWidget$collectionLinkV2$1> cVar) {
        super(2, cVar);
        this.f92208d = str;
        this.f92209e = map;
        this.f92210f = lVar;
        this.f92211g = storyBottomEditorBarWidget;
        this.f92212h = lifecycleCoroutineScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 44048, new Class[]{Object.class, c.class}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        StoryBottomEditorBarWidget$collectionLinkV2$1 storyBottomEditorBarWidget$collectionLinkV2$1 = new StoryBottomEditorBarWidget$collectionLinkV2$1(this.f92208d, this.f92209e, this.f92210f, this.f92211g, this.f92212h, cVar);
        storyBottomEditorBarWidget$collectionLinkV2$1.f92207c = obj;
        return storyBottomEditorBarWidget$collectionLinkV2$1;
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 44050, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 44049, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((StoryBottomEditorBarWidget$collectionLinkV2$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objB;
        Object objMa;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 44047, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = b.h();
        int i10 = this.f92206b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    t0.n(obj);
                    objMa = obj;
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t0.n(obj);
                }
                return b2.f124493a;
            }
            t0.n(obj);
            String str = this.f92208d;
            Map<String, String> map = this.f92209e;
            Result.a aVar = Result.f124476c;
            com.max.xiaoheihe.network.b bVarA = CoroutineServiceGenerator.f94823a.a();
            this.f92206b = 1;
            objMa = bVarA.ma(str, "1", null, map, this);
            if (objMa == objH) {
                return objH;
            }
            objB = Result.b(kotlin.coroutines.jvm.internal.a.a(((com.max.hbutils.bean.Result) objMa).isOk()));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f124476c;
            objB = Result.b(t0.a(th2));
        }
        if (Result.i(objB)) {
            objB = null;
        }
        Boolean bool = (Boolean) objB;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        n2 n2VarE = e1.e();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f92210f, zBooleanValue, this.f92211g, this.f92208d, this.f92209e, this.f92212h, null);
        this.f92206b = 2;
        if (i.h(n2VarE, anonymousClass1, this) == objH) {
            return objH;
        }
        return b2.f124493a;
    }
}
