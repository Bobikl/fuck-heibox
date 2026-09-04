package com.max.xiaoheihe.utils.imageviewer.ui;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.widget.TextView;
import bb.c;
import com.heybox.imageviewer.core.Components;
import com.max.xiaoheihe.utils.imageviewer.ImageViewerHelper;
import com.max.xiaoheihe.utils.imageviewer.MediaData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.b2;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: BaseResUICustomizer.kt */
/* JADX INFO: loaded from: classes13.dex */
@d(c = "com.max.xiaoheihe.utils.imageviewer.ui.BaseResUICustomizer$onPageSelected$2$onNext$1", f = "BaseResUICustomizer.kt", i = {}, l = {c.b.f30808n3, c.b.f30965u3}, m = "invokeSuspend", n = {}, s = {})
public final class BaseResUICustomizer$onPageSelected$2$onNext$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f95578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f95579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ MediaData f95580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f95581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ BaseResUICustomizer f95582f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ TextView f95583g;

    /* JADX INFO: renamed from: com.max.xiaoheihe.utils.imageviewer.ui.BaseResUICustomizer$onPageSelected$2$onNext$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseResUICustomizer.kt */
    @d(c = "com.max.xiaoheihe.utils.imageviewer.ui.BaseResUICustomizer$onPageSelected$2$onNext$1$1", f = "BaseResUICustomizer.kt", i = {}, l = {c.b.f30987v3}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super Boolean>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f95584b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BaseResUICustomizer f95585c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ MediaData f95586d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BaseResUICustomizer baseResUICustomizer, MediaData mediaData, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f95585c = baseResUICustomizer;
            this.f95586d = mediaData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 49280, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass1(this.f95585c, this.f95586d, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super Boolean> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 49282, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super Boolean> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 49281, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 49279, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = b.h();
            int i10 = this.f95584b;
            if (i10 == 0) {
                t0.n(obj);
                ImageViewerHelper.Companion companion = ImageViewerHelper.f95500a;
                Context contextQ = this.f95585c.q();
                String strD = this.f95586d.D();
                this.f95584b = 1;
                obj = companion.c(contextQ, strD, this);
                if (obj == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseResUICustomizer$onPageSelected$2$onNext$1(MediaData mediaData, int i10, BaseResUICustomizer baseResUICustomizer, TextView textView, kotlin.coroutines.c<? super BaseResUICustomizer$onPageSelected$2$onNext$1> cVar) {
        super(2, cVar);
        this.f95580d = mediaData;
        this.f95581e = i10;
        this.f95582f = baseResUICustomizer;
        this.f95583g = textView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 49276, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new BaseResUICustomizer$onPageSelected$2$onNext$1(this.f95580d, this.f95581e, this.f95582f, this.f95583g, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 49278, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 49277, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((BaseResUICustomizer$onPageSelected$2$onNext$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        MediaData mediaData;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 49275, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = b.h();
        int i10 = this.f95579c;
        if (i10 != 0) {
            if (i10 == 1) {
                t0.n(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mediaData = (MediaData) this.f95578b;
                t0.n(obj);
            }
            mediaData.F(((Boolean) obj).booleanValue());
            this.f95580d.G(false);
            Message messageObtainMessage = this.f95582f.s().obtainMessage(1, (int) this.f95580d.A(), (int) this.f95580d.A());
            f0.o(messageObtainMessage, "handler.obtainMessage(\n …                        )");
            this.f95582f.s().sendMessageDelayed(messageObtainMessage, 500L);
            this.f95582f.K(this.f95580d, this.f95583g);
            return b2.f124493a;
        }
        t0.n(obj);
        com.heybox.imageviewer.core.b bVarF = Components.f59730a.f();
        if (this.f95580d.A() == this.f95581e) {
            if (!TextUtils.isEmpty(this.f95580d.g())) {
                Context contextQ = this.f95582f.q();
                String strG = this.f95580d.g();
                f0.m(strG);
                this.f95579c = 1;
                obj = bVarF.d(contextQ, strG, this);
                if (obj == objH) {
                    return objH;
                }
            }
            this.f95582f.K(this.f95580d, this.f95583g);
        }
        return b2.f124493a;
        if (((Boolean) obj).booleanValue()) {
            this.f95580d.a(true);
            MediaData mediaData2 = this.f95580d;
            String strG2 = mediaData2.g();
            f0.m(strG2);
            mediaData2.H(strG2);
            MediaData mediaData3 = this.f95580d;
            CoroutineDispatcher coroutineDispatcherC = e1.c();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f95582f, this.f95580d, null);
            this.f95578b = mediaData3;
            this.f95579c = 2;
            Object objH2 = i.h(coroutineDispatcherC, anonymousClass1, this);
            if (objH2 == objH) {
                return objH;
            }
            mediaData = mediaData3;
            obj = objH2;
            mediaData.F(((Boolean) obj).booleanValue());
            this.f95580d.G(false);
            Message messageObtainMessage2 = this.f95582f.s().obtainMessage(1, (int) this.f95580d.A(), (int) this.f95580d.A());
            f0.o(messageObtainMessage2, "handler.obtainMessage(\n …                        )");
            this.f95582f.s().sendMessageDelayed(messageObtainMessage2, 500L);
        }
        this.f95582f.K(this.f95580d, this.f95583g);
        return b2.f124493a;
    }
}
