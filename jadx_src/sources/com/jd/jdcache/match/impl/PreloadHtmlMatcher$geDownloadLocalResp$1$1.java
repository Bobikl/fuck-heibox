package com.jd.jdcache.match.impl;

import com.jd.jdcache.entity.JDCacheLocalResp;
import com.jd.jdcache.util.JDCacheLog;
import dl.e;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.k;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: PreloadHtmlMatcher.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nPreloadHtmlMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloadHtmlMatcher.kt\ncom/jd/jdcache/match/impl/PreloadHtmlMatcher$geDownloadLocalResp$1$1\n+ 2 JDCacheLog.kt\ncom/jd/jdcache/util/JDCacheLogKt\n*L\n1#1,232:1\n9#2,4:233\n9#2,4:237\n9#2,4:241\n*S KotlinDebug\n*F\n+ 1 PreloadHtmlMatcher.kt\ncom/jd/jdcache/match/impl/PreloadHtmlMatcher$geDownloadLocalResp$1$1\n*L\n208#1:233,4\n214#1:237,4\n217#1:241,4\n*E\n"})
@d(c = "com.jd.jdcache.match.impl.PreloadHtmlMatcher$geDownloadLocalResp$1$1", f = "PreloadHtmlMatcher.kt", i = {}, l = {210}, m = "invokeSuspend", n = {}, s = {})
public final class PreloadHtmlMatcher$geDownloadLocalResp$1$1 extends SuspendLambda implements p<q0, c<? super JDCacheLocalResp>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f64174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ PreloadHtmlMatcher f64175c;

    /* JADX INFO: renamed from: com.jd.jdcache.match.impl.PreloadHtmlMatcher$geDownloadLocalResp$1$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: PreloadHtmlMatcher.kt */
    @d(c = "com.jd.jdcache.match.impl.PreloadHtmlMatcher$geDownloadLocalResp$1$1$2", f = "PreloadHtmlMatcher.kt", i = {}, l = {211}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements p<q0, c<? super JDCacheLocalResp>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f64176b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PreloadHtmlMatcher f64177c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PreloadHtmlMatcher preloadHtmlMatcher, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.f64177c = preloadHtmlMatcher;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
            return new AnonymousClass2(this.f64177c, cVar);
        }

        @Override // yh.p
        @e
        public final Object invoke(@dl.d q0 q0Var, @e c<? super JDCacheLocalResp> cVar) {
            return ((AnonymousClass2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            Object objH = b.h();
            int i10 = this.f64176b;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                k<JDCacheLocalResp> waitingChannel = this.f64177c.getWaitingChannel();
                if (waitingChannel == null) {
                    return null;
                }
                this.f64176b = 1;
                obj = waitingChannel.h(this);
                if (obj == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
            return (JDCacheLocalResp) obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PreloadHtmlMatcher$geDownloadLocalResp$1$1(PreloadHtmlMatcher preloadHtmlMatcher, c<? super PreloadHtmlMatcher$geDownloadLocalResp$1$1> cVar) {
        super(2, cVar);
        this.f64175c = preloadHtmlMatcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        return new PreloadHtmlMatcher$geDownloadLocalResp$1$1(this.f64175c, cVar);
    }

    @Override // yh.p
    @e
    public final Object invoke(@dl.d q0 q0Var, @e c<? super JDCacheLocalResp> cVar) {
        return ((PreloadHtmlMatcher$geDownloadLocalResp$1$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = b.h();
        int i10 = this.f64174b;
        try {
            if (i10 == 0) {
                kotlin.t0.n(obj);
                PreloadHtmlMatcher preloadHtmlMatcher = this.f64175c;
                JDCacheLog jDCacheLog = JDCacheLog.INSTANCE;
                if (jDCacheLog.getCanLog()) {
                    jDCacheLog.d(preloadHtmlMatcher.getName(), "Waiting for receiving pre-download html file.");
                }
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f64175c, null);
                this.f64174b = 1;
                obj = TimeoutKt.c(2000L, anonymousClass2, this);
                if (obj == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
            return (JDCacheLocalResp) obj;
        } catch (TimeoutCancellationException unused) {
            PreloadHtmlMatcher preloadHtmlMatcher2 = this.f64175c;
            JDCacheLog jDCacheLog2 = JDCacheLog.INSTANCE;
            if (!jDCacheLog2.getCanLog()) {
                return null;
            }
            jDCacheLog2.d(preloadHtmlMatcher2.getName(), "Timeout in receiving pre-download html file.");
            return null;
        } catch (Exception e10) {
            PreloadHtmlMatcher preloadHtmlMatcher3 = this.f64175c;
            JDCacheLog jDCacheLog3 = JDCacheLog.INSTANCE;
            if (!jDCacheLog3.getCanLog()) {
                return null;
            }
            jDCacheLog3.e(preloadHtmlMatcher3.getName(), "Error in receiving pre-download html file, e = " + e10);
            return null;
        }
    }
}
