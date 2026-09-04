package com.jd.jdcache.service.impl.net;

import com.lzy.okgo.model.Progress;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: FileRequest.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.jd.jdcache.service.impl.net.FileRequest", f = "FileRequest.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {30, 40}, m = "parseData", n = {"this", "responseHeaders", "inputStream", "responseCode", "contentLength", "this", "responseHeaders", "inputStream", "bufferedOutputStream", "buffer", "hasRead", "responseCode", "contentLength", Progress.I}, s = {"L$0", "L$1", "L$2", "I$0", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "J$0", "J$1"})
public final class FileRequest$parseData$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f64267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f64268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f64269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f64270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Object f64271f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Object f64272g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f64273h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    long f64274i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    long f64275j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    /* synthetic */ Object f64276k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final /* synthetic */ FileRequest f64277l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f64278m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileRequest$parseData$1(FileRequest fileRequest, kotlin.coroutines.c<? super FileRequest$parseData$1> cVar) {
        super(cVar);
        this.f64277l = fileRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f64276k = obj;
        this.f64278m |= Integer.MIN_VALUE;
        return this.f64277l.z(0, null, 0L, null, this);
    }
}
