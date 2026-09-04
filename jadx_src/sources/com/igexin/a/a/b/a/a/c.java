package com.igexin.a.a.b.a.a;

import android.text.TextUtils;
import com.igexin.push.config.SDKUrlConfig;
import java.net.InetSocketAddress;
import java.net.Socket;
import org.android.spdy.TnetStatusCode;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.igexin.a.a.b.a.a.a.d f63142h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Socket f63143i;

    public c(com.igexin.a.a.b.a.a.a.d dVar) {
        super(TnetStatusCode.EASY_REASON_INVALID_DATA, null, null);
        this.f63142h = dVar;
    }

    @Override // com.igexin.a.a.d.e
    public void b() throws Exception {
        super.b();
        com.igexin.push.c.i.a().d().a();
        String cmAddress = SDKUrlConfig.getCmAddress();
        try {
            String[] strArrA = com.igexin.a.a.b.e.a(cmAddress);
            String str = strArrA[1];
            int i10 = Integer.parseInt(strArrA[2]);
            com.igexin.a.a.c.b.a("GS-C|start connect :  " + cmAddress + " *********", new Object[0]);
            com.igexin.a.a.b.a.a.a.d dVar = this.f63142h;
            if (dVar != null) {
                dVar.a(cmAddress);
            }
            Socket socket = new Socket();
            this.f63143i = socket;
            try {
                socket.connect(new InetSocketAddress(str, i10), 10000);
                com.igexin.a.a.c.b.a("GS-C|connected :  " + cmAddress + " #########", new Object[0]);
                com.igexin.a.a.c.b.a("GS-C|local-" + cmAddress + " port:" + i10, new Object[0]);
                if (this.f63135e != b.INTERRUPT) {
                    this.f63135e = b.NORMAL;
                }
            } catch (Exception e10) {
                if (this.f63135e != b.INTERRUPT) {
                    this.f63135e = b.EXCEPTION;
                    this.f63136f = e10.toString();
                }
            }
            ((a) this).f63134d = true;
        } catch (Exception e11) {
            com.igexin.a.a.c.b.a("GS-C|ips invalid, " + e11.toString(), new Object[0]);
            throw e11;
        }
    }

    @Override // com.igexin.a.a.d.a.e
    public final int b_() {
        return TnetStatusCode.EASY_REASON_INVALID_DATA;
    }

    @Override // com.igexin.a.a.b.d, com.igexin.a.a.d.e
    public void f() {
        Socket socket;
        super.f();
        com.igexin.a.a.c.b.a("GS-C|sc dispose", new Object[0]);
        if (this.f63142h != null) {
            if (this.f63135e == b.INTERRUPT) {
                this.f63142h.a(this);
            } else if (this.f63135e == b.EXCEPTION) {
                if (!TextUtils.isEmpty(this.f63136f)) {
                    this.f63142h.a(new Exception(this.f63136f));
                }
            } else if (this.f63135e == b.NORMAL && (socket = this.f63143i) != null) {
                this.f63142h.a(socket);
            }
        }
        this.f63142h = null;
    }

    public void j() {
        this.f63135e = b.INTERRUPT;
    }
}
