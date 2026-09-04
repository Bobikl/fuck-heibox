package com.jd.jdcache.service.impl.net;

import com.jd.jdcache.service.base.NetState;
import com.jd.jdcache.util.JDCacheLog;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: HttpRequest.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nHttpRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpRequest.kt\ncom/jd/jdcache/service/impl/net/HttpRequest\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 JDCacheLog.kt\ncom/jd/jdcache/util/JDCacheLogKt\n*L\n1#1,61:1\n1#2:62\n9#3,4:63\n*S KotlinDebug\n*F\n+ 1 HttpRequest.kt\ncom/jd/jdcache/service/impl/net/HttpRequest\n*L\n55#1:63,4\n*E\n"})
public final class d extends BaseRequest<String> {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    private final String f64283x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@dl.d String url) {
        super(url, null, null, null, null, null, null, false, null, 0, 0, bb.c.d.f31494r, null);
        f0.p(url, "url");
        this.f64283x = "HttpRequest";
    }

    @Override // com.jd.jdcache.service.impl.net.BaseRequest
    @dl.d
    public String s() {
        return this.f64283x;
    }

    @Override // com.jd.jdcache.service.impl.net.BaseRequest
    @dl.e
    protected Object z(int i10, @dl.e Map<String, ? extends List<String>> map, long j10, @dl.e InputStream inputStream, @dl.d kotlin.coroutines.c<? super NetState<String>> cVar) {
        BufferedReader bufferedReader;
        Object error;
        String string;
        String string2;
        StringBuilder sb2 = null;
        if (f0.g(m(), "HEAD") || inputStream == null) {
            bufferedReader = null;
        } else {
            sb2 = new StringBuilder();
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                try {
                    String line = bufferedReader2.readLine();
                    if (line == null) {
                        break;
                    }
                    sb2.append(line);
                    sb2.append("\n");
                } catch (Exception e10) {
                    return new NetState.Error(-1, e10);
                }
            }
            bufferedReader = bufferedReader2;
        }
        String str = "";
        if (i10 == 200) {
            error = new NetState.Complete(i10, map, j10, (sb2 == null || (string2 = sb2.toString()) == null) ? "" : string2);
        } else {
            if (bufferedReader != null && (string = bufferedReader.toString()) != null) {
                str = string;
            }
            error = new NetState.Error(i10, new Exception(str));
        }
        try {
            if (bufferedReader == null) {
                if (inputStream != null) {
                    inputStream.close();
                }
                d();
                return error;
            }
            bufferedReader.close();
        } catch (IOException e11) {
            JDCacheLog jDCacheLog = JDCacheLog.INSTANCE;
            if (jDCacheLog.getCanLog()) {
                jDCacheLog.e(s(), e11);
            }
        }
        d();
        return error;
    }
}
