package com.jd.jdcache.match.impl;

import com.jd.jdcache.JDCacheParamsProvider;
import com.jd.jdcache.entity.JDCacheLocalResp;
import com.jd.jdcache.match.PreReadInputStream;
import com.jd.jdcache.service.base.FileRequestOption;
import com.jd.jdcache.service.base.InputStreamState;
import com.jd.jdcache.service.base.JDCacheFileRepoDelegate;
import com.jd.jdcache.util.JDCacheLog;
import com.jd.jdcache.util.UrlHelper;
import com.max.xiaoheihe.bean.bbs.LinkDraftObj;
import dl.e;
import java.io.BufferedInputStream;
import java.util.List;
import java.util.Map;
import kotlin.b2;
import kotlin.collections.s0;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.channels.k;
import yh.l;

/* JADX INFO: compiled from: PreloadHtmlMatcher.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nPreloadHtmlMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloadHtmlMatcher.kt\ncom/jd/jdcache/match/impl/PreloadHtmlMatcher$downloadHtmlStream$job$1\n+ 2 JDCacheLog.kt\ncom/jd/jdcache/util/JDCacheLogKt\n*L\n1#1,232:1\n9#2,4:233\n9#2,4:237\n9#2,4:241\n*S KotlinDebug\n*F\n+ 1 PreloadHtmlMatcher.kt\ncom/jd/jdcache/match/impl/PreloadHtmlMatcher$downloadHtmlStream$job$1\n*L\n75#1:233,4\n81#1:237,4\n92#1:241,4\n*E\n"})
@d(c = "com.jd.jdcache.match.impl.PreloadHtmlMatcher$downloadHtmlStream$job$1", f = "PreloadHtmlMatcher.kt", i = {1}, l = {76, 89}, m = "invokeSuspend", n = {"stream"}, s = {"L$0"})
public final class PreloadHtmlMatcher$downloadHtmlStream$job$1 extends SuspendLambda implements l<c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f64168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f64169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Map<String, String> f64170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f64171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ PreloadHtmlMatcher f64172f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PreloadHtmlMatcher$downloadHtmlStream$job$1(Map<String, String> map, String str, PreloadHtmlMatcher preloadHtmlMatcher, c<? super PreloadHtmlMatcher$downloadHtmlStream$job$1> cVar) {
        super(1, cVar);
        this.f64170d = map;
        this.f64171e = str;
        this.f64172f = preloadHtmlMatcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@dl.d c<?> cVar) {
        return new PreloadHtmlMatcher$downloadHtmlStream$job$1(this.f64170d, this.f64171e, this.f64172f, cVar);
    }

    @Override // yh.l
    @e
    public final Object invoke(@e c<? super b2> cVar) {
        return ((PreloadHtmlMatcher$downloadHtmlStream$job$1) create(cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:44:0x011b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0125 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x0126  */
    /* JADX WARN: Code duplicated, block: B:50:0x012c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0130  */
    /* JADX WARN: Code duplicated, block: B:54:0x013a  */
    /* JADX WARN: Instruction removed from duplicated block: B:36:0x00b4, please report this as an issue */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        InputStreamState inputStreamState;
        Object inputStreamFromNet;
        PreloadHtmlMatcher preloadHtmlMatcher;
        JDCacheLog jDCacheLog;
        PreloadHtmlMatcher preloadHtmlMatcher2;
        String str;
        JDCacheLog jDCacheLog2;
        PreReadInputStream preReadInputStream;
        JDCacheLocalResp jDCacheLocalResp;
        Map<String, List<String>> headers;
        k<JDCacheLocalResp> waitingChannel;
        PreReadInputStream preReadInputStream2;
        Map<String, String> mapConvertHeader;
        Object objH = b.h();
        int i10 = this.f64169c;
        Map<String, String> mapJ0 = null;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.t0.n(obj);
                inputStreamFromNet = obj;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                preReadInputStream2 = (PreReadInputStream) this.f64168b;
                kotlin.t0.n(obj);
            }
            preReadInputStream = preReadInputStream2;
            preReadInputStream.startPreRead();
            return b2.f124493a;
        }
        kotlin.t0.n(obj);
        Map<String, String> map = this.f64170d;
        com.jd.jdcache.c cVar = com.jd.jdcache.c.f64138a;
        JDCacheParamsProvider jDCacheParamsProviderD = cVar.d();
        String userAgent = jDCacheParamsProviderD != null ? jDCacheParamsProviderD.getUserAgent(this.f64171e) : null;
        JDCacheParamsProvider jDCacheParamsProviderD2 = cVar.d();
        FileRequestOption fileRequestOption = new FileRequestOption(null, map, userAgent, jDCacheParamsProviderD2 != null ? jDCacheParamsProviderD2.getCookie(this.f64171e) : null, 1, null);
        PreloadHtmlMatcher preloadHtmlMatcher3 = this.f64172f;
        String str2 = this.f64171e;
        JDCacheLog jDCacheLog3 = JDCacheLog.INSTANCE;
        if (jDCacheLog3.getCanLog()) {
            jDCacheLog3.d(preloadHtmlMatcher3.getName(), "Starting pre-download html(" + str2 + ')');
        }
        JDCacheFileRepoDelegate fileRepo = this.f64172f.getFileRepo();
        if (fileRepo != null) {
            String str3 = this.f64171e;
            this.f64169c = 1;
            inputStreamFromNet = fileRepo.getInputStreamFromNet(str3, fileRequestOption, this);
            if (inputStreamFromNet == objH) {
                return objH;
            }
        } else {
            inputStreamState = null;
        }
        if (this.f64172f.getDestroyed().get()) {
            return b2.f124493a;
        }
        if (inputStreamState instanceof InputStreamState.Connected) {
            preloadHtmlMatcher2 = this.f64172f;
            str = this.f64171e;
            jDCacheLog2 = JDCacheLog.INSTANCE;
            if (jDCacheLog2.getCanLog()) {
                jDCacheLog2.d(preloadHtmlMatcher2.getName(), "The pre-downloading html can be read now(" + str + ')');
            }
            InputStreamState.Connected connected = (InputStreamState.Connected) inputStreamState;
            preReadInputStream = new PreReadInputStream(new BufferedInputStream(connected.getData()));
            this.f64172f.saveCookieFromRespHeaders(this.f64171e, connected.getHeaders());
            jDCacheLocalResp = new JDCacheLocalResp(this.f64171e, LinkDraftObj.DRAFT_TYPE_HTML, null, null, null, false, 60, null);
            jDCacheLocalResp.setFileStream(preReadInputStream);
            headers = connected.getHeaders();
            if (headers != null && (mapConvertHeader = UrlHelper.INSTANCE.convertHeader(headers)) != null) {
                mapJ0 = s0.J0(mapConvertHeader);
            }
            jDCacheLocalResp.header = mapJ0;
            waitingChannel = this.f64172f.getWaitingChannel();
            if (waitingChannel != null) {
                this.f64168b = preReadInputStream;
                this.f64169c = 2;
                if (waitingChannel.X(jDCacheLocalResp, this) == objH) {
                    return objH;
                }
                preReadInputStream2 = preReadInputStream;
                preReadInputStream = preReadInputStream2;
            }
            preReadInputStream.startPreRead();
        } else if (inputStreamState instanceof InputStreamState.Error) {
            preloadHtmlMatcher = this.f64172f;
            jDCacheLog = JDCacheLog.INSTANCE;
            if (jDCacheLog.getCanLog()) {
                String name = preloadHtmlMatcher.getName();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Fail pre-downloading html, code=");
                InputStreamState.Error error = (InputStreamState.Error) inputStreamState;
                sb2.append(error.getCode());
                sb2.append(", exception=");
                sb2.append(error.getThrowable());
                jDCacheLog.e(name, sb2.toString());
            }
        }
        return b2.f124493a;
        inputStreamState = (InputStreamState) inputStreamFromNet;
        if (this.f64172f.getDestroyed().get()) {
            return b2.f124493a;
        }
        if (inputStreamState instanceof InputStreamState.Connected) {
            preloadHtmlMatcher2 = this.f64172f;
            str = this.f64171e;
            jDCacheLog2 = JDCacheLog.INSTANCE;
            if (jDCacheLog2.getCanLog()) {
                jDCacheLog2.d(preloadHtmlMatcher2.getName(), "The pre-downloading html can be read now(" + str + ')');
            }
            InputStreamState.Connected connected2 = (InputStreamState.Connected) inputStreamState;
            preReadInputStream = new PreReadInputStream(new BufferedInputStream(connected2.getData()));
            this.f64172f.saveCookieFromRespHeaders(this.f64171e, connected2.getHeaders());
            jDCacheLocalResp = new JDCacheLocalResp(this.f64171e, LinkDraftObj.DRAFT_TYPE_HTML, null, null, null, false, 60, null);
            jDCacheLocalResp.setFileStream(preReadInputStream);
            headers = connected2.getHeaders();
            if (headers != null) {
                mapJ0 = s0.J0(mapConvertHeader);
            }
            jDCacheLocalResp.header = mapJ0;
            waitingChannel = this.f64172f.getWaitingChannel();
            if (waitingChannel != null) {
                this.f64168b = preReadInputStream;
                this.f64169c = 2;
                if (waitingChannel.X(jDCacheLocalResp, this) == objH) {
                    return objH;
                }
                preReadInputStream2 = preReadInputStream;
                preReadInputStream = preReadInputStream2;
            }
            preReadInputStream.startPreRead();
        } else if (inputStreamState instanceof InputStreamState.Error) {
            preloadHtmlMatcher = this.f64172f;
            jDCacheLog = JDCacheLog.INSTANCE;
            if (jDCacheLog.getCanLog()) {
                String name2 = preloadHtmlMatcher.getName();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Fail pre-downloading html, code=");
                InputStreamState.Error error2 = (InputStreamState.Error) inputStreamState;
                sb3.append(error2.getCode());
                sb3.append(", exception=");
                sb3.append(error2.getThrowable());
                jDCacheLog.e(name2, sb3.toString());
            }
        }
        return b2.f124493a;
    }
}
