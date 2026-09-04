package com.alipay.zoloz.android.phone.mrpc.core;

import android.util.Log;
import com.alipay.zoloz.mobile.common.rpc.RpcException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;

/* JADX INFO: compiled from: HttpCaller.java */
/* JADX INFO: loaded from: classes6.dex */
public class g extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f39685h = "application/x-www-form-urlencoded";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d f39686g;

    public g(d dVar, Method method, int i10, String str, byte[] bArr, boolean z10) {
        super(method, i10, str, bArr, "application/x-www-form-urlencoded", z10);
        this.f39686g = dVar;
    }

    private void a(j jVar) {
        jVar.e(new BasicHeader("uuid", UUID.randomUUID().toString()));
        List<Header> listB = this.f39686g.f().b();
        if (listB == null || listB.isEmpty()) {
            return;
        }
        Iterator<Header> it = listB.iterator();
        while (it.hasNext()) {
            jVar.e(it.next());
        }
    }

    private y b() throws RpcException {
        return this.f39686g.d();
    }

    private int c(int i10) {
        switch (i10) {
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 15;
            case 9:
                return 16;
            default:
                return i10;
        }
    }

    @Override // com.alipay.zoloz.android.phone.mrpc.core.r
    public Object call() throws RpcException {
        j jVar = new j(this.f39686g.getUrl());
        jVar.p(this.f39612b);
        jVar.n(this.f39615e);
        jVar.q(this.f39616f);
        jVar.f("id", String.valueOf(this.f39614d));
        jVar.f("operationType", this.f39613c);
        jVar.f("gzip", String.valueOf(this.f39686g.e()));
        a(jVar);
        Log.i("HttpCaller", "threadid = " + Thread.currentThread().getId() + "; " + jVar.toString());
        try {
            q qVar = b().a(jVar).get();
            if (qVar != null) {
                return qVar.b();
            }
            throw new RpcException((Integer) 9, "response is null");
        } catch (InterruptedException e10) {
            throw new RpcException(13, "", e10);
        } catch (CancellationException e11) {
            throw new RpcException(13, "", e11);
        } catch (ExecutionException e12) {
            Throwable cause = e12.getCause();
            if (cause == null || !(cause instanceof HttpException)) {
                throw new RpcException(9, "", e12);
            }
            HttpException httpException = (HttpException) cause;
            throw new RpcException(Integer.valueOf(c(httpException.b())), httpException.c());
        }
    }
}
