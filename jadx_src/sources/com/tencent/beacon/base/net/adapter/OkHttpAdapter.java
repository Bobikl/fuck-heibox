package com.tencent.beacon.base.net.adapter;

import androidx.annotation.p0;
import com.tencent.beacon.base.net.BodyType;
import com.tencent.beacon.base.net.a.m;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.a0;
import okhttp3.b0;
import okhttp3.s;
import okhttp3.v;
import okhttp3.z;

/* JADX INFO: loaded from: classes4.dex */
public class OkHttpAdapter extends a {
    private z client;
    private int failCount;

    private OkHttpAdapter() {
        z.a aVar = new z.a();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.client = aVar.k(30000L, timeUnit).j0(10000L, timeUnit).f();
    }

    private OkHttpAdapter(z zVar) {
        this.client = zVar;
    }

    static /* synthetic */ int access$008(OkHttpAdapter okHttpAdapter) {
        int i10 = okHttpAdapter.failCount;
        okHttpAdapter.failCount = i10 + 1;
        return i10;
    }

    private b0 buildBody(com.tencent.beacon.base.net.a.f fVar) {
        BodyType bodyTypeA = fVar.a();
        int i10 = f.f98905a[bodyTypeA.ordinal()];
        if (i10 == 1) {
            return b0.create(v.j(bodyTypeA.httpType), com.tencent.beacon.base.net.c.d.b(fVar.d()));
        }
        if (i10 == 2) {
            return b0.create(v.j(bodyTypeA.httpType), fVar.f());
        }
        if (i10 != 3) {
            return null;
        }
        return b0.create(v.j("multipart/form-data"), fVar.c());
    }

    public static a create(@p0 z zVar) {
        return zVar != null ? new OkHttpAdapter(zVar) : new OkHttpAdapter();
    }

    private s mapToHeaders(Map<String, String> map) {
        s.a aVar = new s.a();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue() != null) {
                aVar.b(entry.getKey(), entry.getValue());
            }
        }
        return aVar.i();
    }

    @Override // com.tencent.beacon.base.net.adapter.a
    public void request(com.tencent.beacon.base.net.a.f fVar, com.tencent.beacon.base.net.a.b<com.tencent.beacon.base.net.a> bVar) {
        String strH = fVar.h();
        this.client.a(new a0.a().B(fVar.i()).p(fVar.g().name(), buildBody(fVar)).o(mapToHeaders(fVar.e())).A(strH == null ? "beacon" : strH).b()).enqueue(new e(this, bVar, strH));
    }

    @Override // com.tencent.beacon.base.net.adapter.a
    public void request(m mVar, com.tencent.beacon.base.net.a.b<byte[]> bVar) {
        b0 b0VarCreate = b0.create(v.j("jce"), mVar.b());
        s sVarMapToHeaders = mapToHeaders(mVar.d());
        String strName = mVar.g().name();
        this.client.a(new a0.a().B(mVar.h()).A(strName).r(b0VarCreate).o(sVarMapToHeaders).b()).enqueue(new d(this, bVar, strName));
    }
}
