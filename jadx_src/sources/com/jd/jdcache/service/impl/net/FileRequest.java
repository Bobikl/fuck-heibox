package com.jd.jdcache.service.impl.net;

import java.io.File;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: FileRequest.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nFileRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileRequest.kt\ncom/jd/jdcache/service/impl/net/FileRequest\n+ 2 JDCacheLog.kt\ncom/jd/jdcache/util/JDCacheLogKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n9#2,4:72\n9#2,4:77\n9#2,4:81\n1#3:76\n*S KotlinDebug\n*F\n+ 1 FileRequest.kt\ncom/jd/jdcache/service/impl/net/FileRequest\n*L\n56#1:72,4\n50#1:77,4\n65#1:81,4\n*E\n"})
public final class FileRequest extends BaseRequest<File> {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    private final String f64265x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    private final String f64266y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileRequest(@dl.d String url, @dl.d String targetPath) {
        super(url, null, null, null, null, null, null, false, null, 0, 0, bb.c.d.f31494r, null);
        f0.p(url, "url");
        f0.p(targetPath, "targetPath");
        this.f64265x = targetPath;
        this.f64266y = "FileRequest";
    }

    @dl.d
    public final String N() {
        return this.f64265x;
    }

    @Override // com.jd.jdcache.service.impl.net.BaseRequest
    @dl.d
    public String s() {
        return this.f64266y;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0155 -> B:52:0x015f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 6141. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // com.jd.jdcache.service.impl.net.BaseRequest
    @dl.e
    protected java.lang.Object z(int r29, @dl.e java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r30, long r31, @dl.e java.io.InputStream r33, @dl.d kotlin.coroutines.c<? super com.jd.jdcache.service.base.NetState<java.io.File>> r34) {
        /*
            Method dump skipped, instruction units count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jd.jdcache.service.impl.net.FileRequest.z(int, java.util.Map, long, java.io.InputStream, kotlin.coroutines.c):java.lang.Object");
    }
}
