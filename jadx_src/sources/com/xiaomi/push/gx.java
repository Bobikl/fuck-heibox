package com.xiaomi.push;

import android.os.SystemClock;
import android.text.TextUtils;
import com.max.xiaoheihe.bean.BizMessageObj;
import com.xiaomi.push.service.XMPushService;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class gx extends hi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private gs f107237a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private gt f509a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Thread f510a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private byte[] f511a;

    public gx(XMPushService xMPushService, hc hcVar) {
        super(xMPushService, hcVar);
    }

    private gq a(boolean z10) {
        gw gwVar = new gw();
        if (z10) {
            gwVar.a("1");
        }
        byte[] bArrM413a = go.m413a();
        if (bArrM413a != null) {
            ex.j jVar = new ex.j();
            jVar.a(a.a(bArrM413a));
            gwVar.a(jVar.m274a(), (String) null);
        }
        return gwVar;
    }

    private void h() throws hm {
        try {
            this.f107237a = new gs(((hi) this).f539a.getInputStream(), this);
            this.f509a = new gt(((hi) this).f539a.getOutputStream(), this);
            gy gyVar = new gy(this, "Blob Reader (" + ((hb) this).f107245b + ")");
            this.f510a = gyVar;
            gyVar.start();
        } catch (Exception e10) {
            throw new hm("Error to init reader and writer", e10);
        }
    }

    @Override // com.xiaomi.push.hi
    /* JADX INFO: renamed from: a */
    protected synchronized void mo451a() {
        h();
        this.f509a.a();
    }

    @Override // com.xiaomi.push.hi
    protected synchronized void a(int i10, Exception exc) {
        gs gsVar = this.f107237a;
        if (gsVar != null) {
            gsVar.b();
            this.f107237a = null;
        }
        gt gtVar = this.f509a;
        if (gtVar != null) {
            try {
                gtVar.b();
            } catch (Exception e10) {
                com.xiaomi.channel.commonutils.logger.b.d("SlimConnection shutdown cause exception: " + e10);
            }
            this.f509a = null;
        }
        this.f511a = null;
        super.a(i10, exc);
    }

    void a(gq gqVar) {
        if (gqVar == null) {
            return;
        }
        if (com.xiaomi.push.service.e.a(gqVar)) {
            gq gqVar2 = new gq();
            gqVar2.a(gqVar.a());
            gqVar2.a("SYNC", "ACK_RTT");
            gqVar2.a(gqVar.e());
            gqVar2.b(gqVar.m421b());
            gqVar2.a(gqVar.m424c());
            XMPushService xMPushService = ((hb) this).f524a;
            xMPushService.a(new com.xiaomi.push.service.bu(xMPushService, gqVar2));
        }
        if (gqVar.m418a()) {
            com.xiaomi.channel.commonutils.logger.b.m62a("[Slim] RCV blob chid=" + gqVar.a() + "; id=" + gqVar.e() + "; errCode=" + gqVar.b() + "; err=" + gqVar.m425c());
        }
        if (gqVar.a() == 0) {
            if (BizMessageObj.TYPE_PING.equals(gqVar.m415a())) {
                com.xiaomi.channel.commonutils.logger.b.m62a("[Slim] RCV ping id=" + gqVar.e());
                g();
            } else if ("CLOSE".equals(gqVar.m415a())) {
                c(13, null);
            }
        }
        Iterator<hb.a> it = ((hb) this).f528a.values().iterator();
        while (it.hasNext()) {
            it.next().a(gqVar);
        }
    }

    @Override // com.xiaomi.push.hb
    @Deprecated
    public void a(hs hsVar) throws hm {
        b(gq.a(hsVar, (String) null));
    }

    @Override // com.xiaomi.push.hb
    public synchronized void a(com.xiaomi.push.service.bf.b bVar) {
        gp.a(bVar, c(), this);
    }

    @Override // com.xiaomi.push.hb
    public synchronized void a(String str, String str2) {
        gp.a(str, str2, this);
    }

    @Override // com.xiaomi.push.hi
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    protected void mo431a(boolean z10) throws hm {
        if (this.f509a == null) {
            throw new hm("The BlobWriter is null.");
        }
        gq gqVarA = a(z10);
        com.xiaomi.channel.commonutils.logger.b.m62a("[Slim] SND ping id=" + gqVarA.e());
        b(gqVarA);
        f();
    }

    @Override // com.xiaomi.push.hi, com.xiaomi.push.hb
    public void a(gq[] gqVarArr) throws hm {
        for (gq gqVar : gqVarArr) {
            b(gqVar);
        }
    }

    @Override // com.xiaomi.push.hb
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean mo432a() {
        return true;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    synchronized byte[] m433a() {
        if (this.f511a == null && !TextUtils.isEmpty(((hb) this).f525a)) {
            String strM738a = com.xiaomi.push.service.bw.m738a();
            StringBuilder sb2 = new StringBuilder();
            String str = ((hb) this).f525a;
            sb2.append(str.substring(str.length() / 2));
            sb2.append(strM738a.substring(strM738a.length() / 2));
            this.f511a = com.xiaomi.push.service.bo.a(((hb) this).f525a.getBytes(), sb2.toString().getBytes());
        }
        return this.f511a;
    }

    @Override // com.xiaomi.push.hb
    public void b(gq gqVar) throws hm {
        gt gtVar = this.f509a;
        if (gtVar == null) {
            throw new hm("the writer is null.");
        }
        try {
            int iA = gtVar.a(gqVar);
            ((hb) this).f107247d = SystemClock.elapsedRealtime();
            String strF = gqVar.f();
            if (!TextUtils.isEmpty(strF)) {
                ig.a(((hb) this).f524a, strF, iA, false, true, System.currentTimeMillis());
            }
            Iterator<hb.a> it = ((hb) this).f531b.values().iterator();
            while (it.hasNext()) {
                it.next().a(gqVar);
            }
        } catch (Exception e10) {
            throw new hm(e10);
        }
    }

    void b(hs hsVar) {
        if (hsVar == null) {
            return;
        }
        Iterator<hb.a> it = ((hb) this).f528a.values().iterator();
        while (it.hasNext()) {
            it.next().a(hsVar);
        }
    }
}
