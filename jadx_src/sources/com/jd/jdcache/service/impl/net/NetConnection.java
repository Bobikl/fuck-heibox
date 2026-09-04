package com.jd.jdcache.service.impl.net;

import androidx.annotation.Keep;
import com.jd.jdcache.service.base.JDCacheNetDelegate;
import com.jd.jdcache.service.base.NetState;
import com.jd.jdcache.util.JDCacheLog;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: NetConnection.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nNetConnection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetConnection.kt\ncom/jd/jdcache/service/impl/net/NetConnection\n+ 2 JDCacheLog.kt\ncom/jd/jdcache/util/JDCacheLogKt\n*L\n1#1,125:1\n9#2,4:126\n9#2,4:130\n9#2,4:134\n9#2,4:138\n*S KotlinDebug\n*F\n+ 1 NetConnection.kt\ncom/jd/jdcache/service/impl/net/NetConnection\n*L\n34#1:126,4\n62#1:130,4\n113#1:134,4\n117#1:138,4\n*E\n"})
@Keep
public class NetConnection extends JDCacheNetDelegate {

    @dl.d
    private final String name = "NetConnection";

    /* JADX INFO: compiled from: NetConnection.kt */
    public static final class a extends BaseRequest<InputStream> {

        /* JADX INFO: renamed from: com.jd.jdcache.service.impl.net.NetConnection$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: NetConnection.kt */
        public static final class C0517a implements b.a {
            C0517a() {
            }

            @Override // com.jd.jdcache.service.impl.net.b.a
            public void onClose() {
                a.this.d();
            }
        }

        a(String str) {
            super(str, null, null, null, null, null, null, false, null, 0, 0, bb.c.d.f31494r, null);
        }

        @Override // com.jd.jdcache.service.impl.net.BaseRequest
        @dl.d
        public String s() {
            return "InputStreamRequest";
        }

        @Override // com.jd.jdcache.service.impl.net.BaseRequest
        @dl.e
        protected Object z(int i10, @dl.e Map<String, ? extends List<String>> map, long j10, @dl.e InputStream inputStream, @dl.d kotlin.coroutines.c<? super NetState<InputStream>> cVar) {
            if (i10 == 200) {
                return new NetState.Complete(i10, map, j10, inputStream != null ? new b(inputStream, new C0517a()) : null);
            }
            return new NetState.Error(i10, new Exception("Net Error code = " + i10));
        }
    }

    @Override // com.jd.jdcache.service.base.JDCacheNetDelegate
    @dl.e
    public kotlinx.coroutines.flow.e<NetState<InputStream>> connectFlow(@dl.d String url, @dl.d String method, @dl.e Map<String, String> map, @dl.e String str, @dl.e String str2, @dl.e Map<String, String> map2, boolean z10) {
        f0.p(url, "url");
        f0.p(method, "method");
        if (url.length() == 0) {
            JDCacheLog jDCacheLog = JDCacheLog.INSTANCE;
            if (!jDCacheLog.getCanLog()) {
                return null;
            }
            jDCacheLog.e(getName(), "Cannot start network connection, because url is empty.");
            return null;
        }
        a aVar = new a(url);
        aVar.G(method);
        aVar.F(map);
        aVar.L(str);
        aVar.E(str2);
        aVar.B(map2);
        aVar.A(z10);
        return aVar.c();
    }

    @Override // com.jd.jdcache.service.base.JDCacheNetDelegate
    @dl.e
    public kotlinx.coroutines.flow.e<NetState<File>> downloadFlow(@dl.d String url, @dl.d String savePath, @dl.d String method, @dl.e Map<String, String> map, @dl.e String str, @dl.e String str2) {
        f0.p(url, "url");
        f0.p(savePath, "savePath");
        f0.p(method, "method");
        if (url.length() == 0) {
            JDCacheLog jDCacheLog = JDCacheLog.INSTANCE;
            if (jDCacheLog.getCanLog()) {
                jDCacheLog.e(getName(), "Cannot download file, because url is empty.");
            }
            return null;
        }
        if (!(savePath.length() == 0)) {
            FileRequest fileRequest = new FileRequest(url, savePath);
            fileRequest.G(method);
            return fileRequest.c();
        }
        JDCacheLog jDCacheLog2 = JDCacheLog.INSTANCE;
        if (jDCacheLog2.getCanLog()) {
            jDCacheLog2.e(getName(), "Cannot download file[" + url + "], because savePath is empty.");
        }
        return null;
    }

    @Override // com.jd.jdcache.service.base.AbstractDelegate
    @dl.d
    public String getName() {
        return this.name;
    }

    @Override // com.jd.jdcache.service.base.JDCacheNetDelegate
    @dl.e
    public kotlinx.coroutines.flow.e<NetState<String>> requestFlow(@dl.d String url, @dl.d String method, @dl.e Map<String, String> map, @dl.e String str, @dl.e String str2, @dl.e Map<String, String> map2, boolean z10) {
        f0.p(url, "url");
        f0.p(method, "method");
        if (url.length() == 0) {
            JDCacheLog jDCacheLog = JDCacheLog.INSTANCE;
            if (!jDCacheLog.getCanLog()) {
                return null;
            }
            jDCacheLog.e(getName(), "Cannot start network request, because url is empty.");
            return null;
        }
        d dVar = new d(url);
        dVar.G(method);
        dVar.F(map);
        dVar.L(str);
        dVar.E(str2);
        dVar.B(map2);
        dVar.A(z10);
        return dVar.c();
    }
}
