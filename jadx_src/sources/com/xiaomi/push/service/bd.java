package com.xiaomi.push.service;

import android.text.TextUtils;
import com.max.xiaoheihe.bean.BizMessageObj;
import com.max.xiaoheihe.module.mall.SteamStoreRedeemWalletCodeActivity;
import com.xiaomi.push.cz;
import com.xiaomi.push.dd;
import com.xiaomi.push.ef;
import com.xiaomi.push.ex;
import com.xiaomi.push.ge;
import com.xiaomi.push.go;
import com.xiaomi.push.gq;
import com.xiaomi.push.hc;
import com.xiaomi.push.hp;
import com.xiaomi.push.hq;
import com.xiaomi.push.hr;
import com.xiaomi.push.hs;
import com.xiaomi.push.ig;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public class bd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private XMPushService f107908a;

    bd(XMPushService xMPushService) {
        this.f107908a = xMPushService;
    }

    private void a(hp hpVar) {
        String strC = hpVar.c();
        if (TextUtils.isEmpty(strC)) {
            return;
        }
        String[] strArrSplit = strC.split(";");
        cz czVarA = dd.a().a(hc.a(), false);
        if (czVarA == null || strArrSplit.length <= 0) {
            return;
        }
        czVarA.a(strArrSplit);
        this.f107908a.a(20, (Exception) null);
        this.f107908a.a(true);
    }

    private void b(hs hsVar) {
        bf.b bVarA;
        String strL = hsVar.l();
        String strK = hsVar.k();
        if (TextUtils.isEmpty(strL) || TextUtils.isEmpty(strK) || (bVarA = bf.a().a(strK, strL)) == null) {
            return;
        }
        ig.a(this.f107908a, bVarA.f1043a, ig.a(hsVar.mo456a()), true, true, System.currentTimeMillis());
    }

    private void c(gq gqVar) {
        bf.b bVarA;
        String strG = gqVar.g();
        String string = Integer.toString(gqVar.a());
        if (TextUtils.isEmpty(strG) || TextUtils.isEmpty(string) || (bVarA = bf.a().a(string, strG)) == null) {
            return;
        }
        ig.a(this.f107908a, bVarA.f1043a, gqVar.c(), true, true, System.currentTimeMillis());
    }

    public void a(gq gqVar) {
        if (5 != gqVar.a()) {
            c(gqVar);
        }
        try {
            b(gqVar);
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.a("handle Blob chid = " + gqVar.a() + " cmd = " + gqVar.m415a() + " packetid = " + gqVar.e() + " failure ", e10);
        }
    }

    public void a(hs hsVar) {
        if (!"5".equals(hsVar.k())) {
            b(hsVar);
        }
        String strK = hsVar.k();
        if (TextUtils.isEmpty(strK)) {
            strK = "1";
            hsVar.l("1");
        }
        if (strK.equals("0")) {
            com.xiaomi.channel.commonutils.logger.b.m62a("Received wrong packet with chid = 0 : " + hsVar.mo456a());
        }
        if (hsVar instanceof hq) {
            hp hpVarA = hsVar.a("kick");
            if (hpVarA != null) {
                String strL = hsVar.l();
                String strA = hpVarA.a("type");
                String strA2 = hpVarA.a("reason");
                com.xiaomi.channel.commonutils.logger.b.m62a("kicked by server, chid=" + strK + " res=" + bf.b.a(strL) + " type=" + strA + " reason=" + strA2);
                if (!SteamStoreRedeemWalletCodeActivity.N3.equals(strA)) {
                    this.f107908a.a(strK, strL, 3, strA2, strA);
                    bf.a().m730a(strK, strL);
                    return;
                }
                bf.b bVarA = bf.a().a(strK, strL);
                if (bVarA != null) {
                    this.f107908a.a(bVarA);
                    bVarA.a(bf.c.unbind, 3, 0, strA2, strA);
                    return;
                }
                return;
            }
        } else if (hsVar instanceof hr) {
            hr hrVar = (hr) hsVar;
            if ("redir".equals(hrVar.b())) {
                hp hpVarA2 = hrVar.a("hosts");
                if (hpVarA2 != null) {
                    a(hpVarA2);
                    return;
                }
                return;
            }
        }
        this.f107908a.m684b().a(this.f107908a, strK, hsVar);
    }

    public void b(gq gqVar) {
        String strM415a = gqVar.m415a();
        if (gqVar.a() == 0) {
            if (BizMessageObj.TYPE_PING.equals(strM415a)) {
                byte[] bArrM419a = gqVar.m419a();
                if (bArrM419a != null && bArrM419a.length > 0) {
                    ex.j jVarA = ex.j.a(bArrM419a);
                    if (jVarA.m362b()) {
                        bw.a().a(jVarA.m360a());
                    }
                }
                if (!"com.xiaomi.xmsf".equals(this.f107908a.getPackageName())) {
                    this.f107908a.m681a();
                }
                if ("1".equals(gqVar.e())) {
                    com.xiaomi.channel.commonutils.logger.b.m62a("received a server ping");
                } else {
                    go.b();
                }
                this.f107908a.m685b();
                return;
            }
            if (!"SYNC".equals(strM415a)) {
                if ("NOTIFY".equals(gqVar.m415a())) {
                    ex.h hVarA = ex.h.a(gqVar.m419a());
                    com.xiaomi.channel.commonutils.logger.b.m62a("notify by server err = " + hVarA.c() + " desc = " + hVarA.m354a());
                    return;
                }
                return;
            }
            if ("CONF".equals(gqVar.m422b())) {
                bw.a().a(ex.b.a(gqVar.m419a()));
                return;
            }
            if (TextUtils.equals("U", gqVar.m422b())) {
                ex.k kVarA = ex.k.a(gqVar.m419a());
                ef.a(this.f107908a).a(kVarA.m364a(), kVarA.m367b(), new Date(kVarA.m363a()), new Date(kVarA.m366b()), kVarA.c() * 1024, kVarA.e());
                gq gqVar2 = new gq();
                gqVar2.a(0);
                gqVar2.a(gqVar.m415a(), "UCA");
                gqVar2.a(gqVar.e());
                XMPushService xMPushService = this.f107908a;
                xMPushService.a(new bu(xMPushService, gqVar2));
                return;
            }
            if (TextUtils.equals("P", gqVar.m422b())) {
                ex.i iVarA = ex.i.a(gqVar.m419a());
                gq gqVar3 = new gq();
                gqVar3.a(0);
                gqVar3.a(gqVar.m415a(), "PCA");
                gqVar3.a(gqVar.e());
                ex.i iVar = new ex.i();
                if (iVarA.m358a()) {
                    iVar.a(iVarA.m357a());
                }
                gqVar3.a(iVar.m274a(), (String) null);
                XMPushService xMPushService2 = this.f107908a;
                xMPushService2.a(new bu(xMPushService2, gqVar3));
                com.xiaomi.channel.commonutils.logger.b.m62a("ACK msgP: id = " + gqVar.e());
                return;
            }
            return;
        }
        String string = Integer.toString(gqVar.a());
        if ("SECMSG".equals(gqVar.m415a())) {
            if (!gqVar.m418a()) {
                this.f107908a.m684b().a(this.f107908a, string, gqVar);
                return;
            }
            com.xiaomi.channel.commonutils.logger.b.m62a("Recv SECMSG errCode = " + gqVar.b() + " errStr = " + gqVar.m425c());
            return;
        }
        if (!"BIND".equals(strM415a)) {
            if ("KICK".equals(strM415a)) {
                ex.g gVarA = ex.g.a(gqVar.m419a());
                String strG = gqVar.g();
                String strM349a = gVarA.m349a();
                String strM351b = gVarA.m351b();
                com.xiaomi.channel.commonutils.logger.b.m62a("kicked by server, chid=" + string + " res= " + bf.b.a(strG) + " type=" + strM349a + " reason=" + strM351b);
                if (!SteamStoreRedeemWalletCodeActivity.N3.equals(strM349a)) {
                    this.f107908a.a(string, strG, 3, strM351b, strM349a);
                    bf.a().m730a(string, strG);
                    return;
                }
                bf.b bVarA = bf.a().a(string, strG);
                if (bVarA != null) {
                    this.f107908a.a(bVarA);
                    bVarA.a(bf.c.unbind, 3, 0, strM351b, strM349a);
                    return;
                }
                return;
            }
            return;
        }
        ex.d dVarA = ex.d.a(gqVar.m419a());
        String strG2 = gqVar.g();
        bf.b bVarA2 = bf.a().a(string, strG2);
        if (bVarA2 == null) {
            return;
        }
        if (dVarA.m325a()) {
            com.xiaomi.channel.commonutils.logger.b.m62a("SMACK: channel bind succeeded, chid=" + gqVar.a());
            bVarA2.a(bf.c.binded, 1, 0, (String) null, (String) null);
            return;
        }
        String strM324a = dVarA.m324a();
        if ("auth".equals(strM324a)) {
            if ("invalid-sig".equals(dVarA.m326b())) {
                com.xiaomi.channel.commonutils.logger.b.m62a("SMACK: bind error invalid-sig token = " + bVarA2.f107913c + " sec = " + bVarA2.f107918h);
                go.a(0, ge.BIND_INVALID_SIG.a(), 1, null, 0);
            }
            bVarA2.a(bf.c.unbind, 1, 5, dVarA.m326b(), strM324a);
            bf.a().m730a(string, strG2);
        } else if ("cancel".equals(strM324a)) {
            bVarA2.a(bf.c.unbind, 1, 7, dVarA.m326b(), strM324a);
            bf.a().m730a(string, strG2);
        } else if (SteamStoreRedeemWalletCodeActivity.N3.equals(strM324a)) {
            this.f107908a.a(bVarA2);
            bVarA2.a(bf.c.unbind, 1, 7, dVarA.m326b(), strM324a);
        }
        com.xiaomi.channel.commonutils.logger.b.m62a("SMACK: channel bind failed, chid=" + string + " reason=" + dVarA.m326b());
    }
}
