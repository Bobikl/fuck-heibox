package com.jd.jdcache.match.impl;

import com.jd.jdcache.entity.JDCacheLocalResp;
import com.jd.jdcache.service.base.FileState;
import com.jd.jdcache.util.UrlHelper;
import com.max.xiaoheihe.bean.bbs.LinkDraftObj;
import dl.e;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.b2;
import kotlin.collections.s0;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.t0;
import kotlinx.coroutines.channels.k;
import yh.p;

/* JADX INFO: compiled from: PreloadHtmlMatcher.kt */
/* JADX INFO: loaded from: classes6.dex */
@d(c = "com.jd.jdcache.match.impl.PreloadHtmlMatcher$downloadHtmlFile$flow$2", f = "PreloadHtmlMatcher.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
public final class PreloadHtmlMatcher$downloadHtmlFile$flow$2 extends SuspendLambda implements p<Pair<? extends Boolean, ? extends FileState.Complete>, c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f64164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f64165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ PreloadHtmlMatcher f64166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f64167e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PreloadHtmlMatcher$downloadHtmlFile$flow$2(PreloadHtmlMatcher preloadHtmlMatcher, String str, c<? super PreloadHtmlMatcher$downloadHtmlFile$flow$2> cVar) {
        super(2, cVar);
        this.f64166d = preloadHtmlMatcher;
        this.f64167e = str;
    }

    @Override // yh.p
    @e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d Pair<Boolean, FileState.Complete> pair, @e c<? super b2> cVar) {
        return ((PreloadHtmlMatcher$downloadHtmlFile$flow$2) create(pair, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PreloadHtmlMatcher$downloadHtmlFile$flow$2 preloadHtmlMatcher$downloadHtmlFile$flow$2 = new PreloadHtmlMatcher$downloadHtmlFile$flow$2(this.f64166d, this.f64167e, cVar);
        preloadHtmlMatcher$downloadHtmlFile$flow$2.f64165c = obj;
        return preloadHtmlMatcher$downloadHtmlFile$flow$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Map<String, String> mapConvertHeader;
        Object objH = b.h();
        int i10 = this.f64164b;
        if (i10 == 0) {
            t0.n(obj);
            Pair pair = (Pair) this.f64165c;
            boolean zBooleanValue = ((Boolean) pair.a()).booleanValue();
            FileState.Complete complete = (FileState.Complete) pair.b();
            Map<String, String> mapJ0 = null;
            if (zBooleanValue) {
                this.f64166d.setDownloadTask(null);
            }
            if (complete != null) {
                this.f64166d.saveCookieFromRespHeaders(this.f64167e, complete.getHeaders());
                JDCacheLocalResp jDCacheLocalResp = new JDCacheLocalResp(this.f64167e, LinkDraftObj.DRAFT_TYPE_HTML, null, null, null, false, 60, null);
                jDCacheLocalResp.setFilename(complete.getData().getAbsolutePath());
                Map<String, List<String>> headers = complete.getHeaders();
                if (headers != null && (mapConvertHeader = UrlHelper.INSTANCE.convertHeader(headers)) != null) {
                    mapJ0 = s0.J0(mapConvertHeader);
                }
                jDCacheLocalResp.header = mapJ0;
                k<JDCacheLocalResp> waitingChannel = this.f64166d.getWaitingChannel();
                if (waitingChannel != null) {
                    this.f64164b = 1;
                    if (waitingChannel.X(jDCacheLocalResp, this) == objH) {
                        return objH;
                    }
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        return b2.f124493a;
    }
}
