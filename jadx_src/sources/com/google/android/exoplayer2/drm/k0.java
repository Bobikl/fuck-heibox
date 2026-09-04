package com.google.android.exoplayer2.drm;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.r0;
import com.google.android.exoplayer2.util.u0;
import com.google.common.collect.ImmutableMap;
import com.tencent.cos.xml.common.COSRequestHeaderKey;
import com.tencent.qcloud.core.http.HttpConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: HttpMediaDrmCallback.java */
/* JADX INFO: loaded from: classes7.dex */
public final class k0 implements m0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f44724e = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HttpDataSource.b f44725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private final String f44726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f44727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, String> f44728d;

    public k0(@androidx.annotation.p0 String str, HttpDataSource.b bVar) {
        this(str, false, bVar);
    }

    public k0(@androidx.annotation.p0 String str, boolean z10, HttpDataSource.b bVar) {
        com.google.android.exoplayer2.util.a.a((z10 && TextUtils.isEmpty(str)) ? false : true);
        this.f44725a = bVar;
        this.f44726b = str;
        this.f44727c = z10;
        this.f44728d = new HashMap();
    }

    private static byte[] e(HttpDataSource.b bVar, String str, @androidx.annotation.p0 byte[] bArr, Map<String, String> map) throws MediaDrmCallbackException {
        r0 r0Var = new r0(bVar.a());
        com.google.android.exoplayer2.upstream.r rVarA = new com.google.android.exoplayer2.upstream.r.b().k(str).f(map).e(2).d(bArr).c(1).a();
        int i10 = 0;
        com.google.android.exoplayer2.upstream.r rVarA2 = rVarA;
        while (true) {
            try {
                com.google.android.exoplayer2.upstream.p pVar = new com.google.android.exoplayer2.upstream.p(r0Var, rVarA2);
                try {
                    try {
                        byte[] bArrV1 = u0.v1(pVar);
                        u0.p(pVar);
                        return bArrV1;
                    } catch (HttpDataSource.InvalidResponseCodeException e10) {
                        String strF = f(e10, i10);
                        if (strF == null) {
                            throw e10;
                        }
                        i10++;
                        rVarA2 = rVarA2.a().k(strF).a();
                        u0.p(pVar);
                    }
                } catch (Throwable th2) {
                    u0.p(pVar);
                    throw th2;
                }
            } catch (Exception e11) {
                throw new MediaDrmCallbackException(rVarA, (Uri) com.google.android.exoplayer2.util.a.g(r0Var.w()), r0Var.b(), r0Var.p(), e11);
            }
        }
    }

    @androidx.annotation.p0
    private static String f(HttpDataSource.InvalidResponseCodeException invalidResponseCodeException, int i10) {
        Map<String, List<String>> map;
        List<String> list;
        int i11 = invalidResponseCodeException.f50871i;
        if (!((i11 == 307 || i11 == 308) && i10 < 5) || (map = invalidResponseCodeException.f50873k) == null || (list = map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override // com.google.android.exoplayer2.drm.m0
    public byte[] a(UUID uuid, b0.b bVar) throws MediaDrmCallbackException {
        String str;
        String strB = bVar.b();
        if (this.f44727c || TextUtils.isEmpty(strB)) {
            strB = this.f44726b;
        }
        if (TextUtils.isEmpty(strB)) {
            throw new MediaDrmCallbackException(new com.google.android.exoplayer2.upstream.r.b().j(Uri.EMPTY).a(), Uri.EMPTY, ImmutableMap.v(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = com.google.android.exoplayer2.j.Y1;
        if (uuid2.equals(uuid)) {
            str = "text/xml";
        } else {
            str = com.google.android.exoplayer2.j.W1.equals(uuid) ? HttpConstants.ContentType.JSON : COSRequestHeaderKey.APPLICATION_OCTET_STREAM;
        }
        map.put("Content-Type", str);
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f44728d) {
            map.putAll(this.f44728d);
        }
        return e(this.f44725a, strB, bVar.a(), map);
    }

    @Override // com.google.android.exoplayer2.drm.m0
    public byte[] b(UUID uuid, b0.h hVar) throws MediaDrmCallbackException {
        String strB = hVar.b();
        String strI = u0.I(hVar.a());
        StringBuilder sb2 = new StringBuilder(String.valueOf(strB).length() + 15 + String.valueOf(strI).length());
        sb2.append(strB);
        sb2.append("&signedRequest=");
        sb2.append(strI);
        return e(this.f44725a, sb2.toString(), null, Collections.emptyMap());
    }

    public void c() {
        synchronized (this.f44728d) {
            this.f44728d.clear();
        }
    }

    public void d(String str) {
        com.google.android.exoplayer2.util.a.g(str);
        synchronized (this.f44728d) {
            this.f44728d.remove(str);
        }
    }

    public void g(String str, String str2) {
        com.google.android.exoplayer2.util.a.g(str);
        com.google.android.exoplayer2.util.a.g(str2);
        synchronized (this.f44728d) {
            this.f44728d.put(str, str2);
        }
    }
}
