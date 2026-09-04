package com.alipay.deviceid.module.x;

import com.alipay.deviceid.module.rpc.mrpc.core.HttpException;
import com.alipay.deviceid.module.rpc.mrpc.core.RpcException;
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
public final class au extends aq {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private as f38246g;

    public au(as asVar, Method method, int i10, String str, byte[] bArr, boolean z10) {
        super(method, i10, str, bArr, "application/x-www-form-urlencoded", z10);
        this.f38246g = asVar;
    }

    @Override // com.alipay.deviceid.module.x.be
    public final Object a() {
        ax axVar = new ax(this.f38246g.a());
        axVar.f38265b = this.f38225b;
        axVar.f38266c = this.f38228e;
        axVar.f38268e = this.f38229f;
        axVar.a("id", String.valueOf(this.f38227d));
        axVar.a("operationType", this.f38226c);
        axVar.a("gzip", String.valueOf(this.f38246g.d()));
        axVar.a(new BasicHeader("uuid", UUID.randomUUID().toString()));
        List<Header> list = this.f38246g.c().f38314b;
        if (list != null && !list.isEmpty()) {
            Iterator<Header> it = list.iterator();
            while (it.hasNext()) {
                axVar.a(it.next());
            }
        }
        Thread.currentThread().getId();
        axVar.toString();
        try {
            bd bdVar = this.f38246g.b().a(axVar).get();
            if (bdVar != null) {
                return bdVar.a();
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
            int code = httpException.getCode();
            switch (code) {
                case 1:
                    code = 2;
                    break;
                case 2:
                    code = 3;
                    break;
                case 3:
                    code = 4;
                    break;
                case 4:
                    code = 5;
                    break;
                case 5:
                    code = 6;
                    break;
                case 6:
                    code = 7;
                    break;
                case 7:
                    code = 8;
                    break;
                case 8:
                    code = 15;
                    break;
                case 9:
                    code = 16;
                    break;
            }
            throw new RpcException(Integer.valueOf(code), httpException.getMsg());
        }
    }
}
