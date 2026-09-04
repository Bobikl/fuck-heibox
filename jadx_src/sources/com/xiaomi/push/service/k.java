package com.xiaomi.push.service;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.xiaomi.push.gq;
import com.xiaomi.push.hq;
import com.xiaomi.push.hr;
import com.xiaomi.push.hs;
import com.xiaomi.push.hu;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private z f108013a = new z();

    public static String a(bf.b bVar) {
        if ("9".equals(bVar.f107917g)) {
            return bVar.f1043a + ".permission.MIMC_RECEIVE";
        }
        return bVar.f1043a + ".permission.MIPUSH_RECEIVE";
    }

    private static void a(Context context, Intent intent, bf.b bVar) {
        if ("com.xiaomi.xmsf".equals(context.getPackageName())) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, a(bVar));
        }
    }

    bf.b a(gq gqVar) {
        Collection<bf.b> collectionM726a = bf.a().m726a(Integer.toString(gqVar.a()));
        if (collectionM726a.isEmpty()) {
            return null;
        }
        Iterator<bf.b> it = collectionM726a.iterator();
        if (collectionM726a.size() == 1) {
            return it.next();
        }
        String strG = gqVar.g();
        while (it.hasNext()) {
            bf.b next = it.next();
            if (TextUtils.equals(strG, next.f1046b)) {
                return next;
            }
        }
        return null;
    }

    bf.b a(hs hsVar) {
        Collection<bf.b> collectionM726a = bf.a().m726a(hsVar.k());
        if (collectionM726a.isEmpty()) {
            return null;
        }
        Iterator<bf.b> it = collectionM726a.iterator();
        if (collectionM726a.size() == 1) {
            return it.next();
        }
        String strM = hsVar.m();
        String strL = hsVar.l();
        while (it.hasNext()) {
            bf.b next = it.next();
            if (TextUtils.equals(strM, next.f1046b) || TextUtils.equals(strL, next.f1046b)) {
                return next;
            }
        }
        return null;
    }

    @SuppressLint({"WrongConstant"})
    public void a(Context context) {
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.service_started");
        if (com.xiaomi.push.j.m525c()) {
            intent.addFlags(16777216);
        }
        com.xiaomi.channel.commonutils.logger.b.m62a("[Bcst] send ***.push.service_started broadcast to inform push service has started.");
        context.sendBroadcast(intent);
    }

    @SuppressLint({"DefaultLocale"})
    public void a(Context context, bf.b bVar, int i10) {
        if ("5".equalsIgnoreCase(bVar.f107917g)) {
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.channel_closed");
        intent.setPackage(bVar.f1043a);
        intent.putExtra(bj.f107952v, bVar.f107917g);
        intent.putExtra("ext_reason", i10);
        intent.putExtra(bj.f107949s, bVar.f1046b);
        intent.putExtra(bj.J, bVar.f107919i);
        if (bVar.f1037a == null || !"9".equals(bVar.f107917g)) {
            com.xiaomi.channel.commonutils.logger.b.m62a(String.format("[Bcst] notify channel closed. %s,%s,%d", bVar.f107917g, bVar.f1043a, Integer.valueOf(i10)));
            a(context, intent, bVar);
            return;
        }
        try {
            bVar.f1037a.send(Message.obtain(null, 17, intent));
        } catch (RemoteException unused) {
            bVar.f1037a = null;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("peer may died: ");
            String str = bVar.f1046b;
            sb2.append(str.substring(str.lastIndexOf(64)));
            com.xiaomi.channel.commonutils.logger.b.m62a(sb2.toString());
        }
    }

    public void a(Context context, bf.b bVar, String str, String str2) {
        if (bVar == null) {
            com.xiaomi.channel.commonutils.logger.b.d("error while notify kick by server!");
            return;
        }
        if ("5".equalsIgnoreCase(bVar.f107917g)) {
            com.xiaomi.channel.commonutils.logger.b.d("mipush kicked by server");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.kicked");
        intent.setPackage(bVar.f1043a);
        intent.putExtra("ext_kick_type", str);
        intent.putExtra("ext_kick_reason", str2);
        intent.putExtra("ext_chid", bVar.f107917g);
        intent.putExtra(bj.f107949s, bVar.f1046b);
        intent.putExtra(bj.J, bVar.f107919i);
        com.xiaomi.channel.commonutils.logger.b.m62a(String.format("[Bcst] notify packet(blob) arrival. %s,%s,%s", bVar.f107917g, bVar.f1043a, str2));
        a(context, intent, bVar);
    }

    @SuppressLint({"DefaultLocale"})
    public void a(Context context, bf.b bVar, boolean z10, int i10, String str) {
        if ("5".equalsIgnoreCase(bVar.f107917g)) {
            this.f108013a.a(context, bVar, z10, i10, str);
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.channel_opened");
        intent.setPackage(bVar.f1043a);
        intent.putExtra("ext_succeeded", z10);
        if (!z10) {
            intent.putExtra("ext_reason", i10);
        }
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("ext_reason_msg", str);
        }
        intent.putExtra("ext_chid", bVar.f107917g);
        intent.putExtra(bj.f107949s, bVar.f1046b);
        intent.putExtra(bj.J, bVar.f107919i);
        com.xiaomi.channel.commonutils.logger.b.m62a(String.format("[Bcst] notify channel open result. %s,%s,%b,%d", bVar.f107917g, bVar.f1043a, Boolean.valueOf(z10), Integer.valueOf(i10)));
        a(context, intent, bVar);
    }

    public void a(XMPushService xMPushService, String str, gq gqVar) {
        bf.b bVarA = a(gqVar);
        if (bVarA == null) {
            com.xiaomi.channel.commonutils.logger.b.d("error while notify channel closed! channel " + str + " not registered");
            return;
        }
        if ("5".equalsIgnoreCase(str)) {
            this.f108013a.a(xMPushService, gqVar, bVarA);
            return;
        }
        String str2 = bVarA.f1043a;
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.new_msg");
        intent.setPackage(str2);
        intent.putExtra("ext_rcv_timestamp", SystemClock.elapsedRealtime());
        intent.putExtra("ext_chid", str);
        intent.putExtra("ext_raw_packet", gqVar.m420a(bVarA.f107918h));
        intent.putExtra(bj.J, bVarA.f107919i);
        intent.putExtra(bj.B, bVarA.f107918h);
        if (e.a(gqVar)) {
            intent.putExtra("ext_downward_pkt_id", gqVar.e());
        }
        if (bVarA.f1037a != null) {
            try {
                bVarA.f1037a.send(Message.obtain(null, 17, intent));
                com.xiaomi.channel.commonutils.logger.b.m62a("message was sent by messenger for chid=" + str);
                return;
            } catch (RemoteException unused) {
                bVarA.f1037a = null;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("peer may died: ");
                String str3 = bVarA.f1046b;
                sb2.append(str3.substring(str3.lastIndexOf(64)));
                com.xiaomi.channel.commonutils.logger.b.m62a(sb2.toString());
            }
        }
        if ("com.xiaomi.xmsf".equals(str2)) {
            return;
        }
        com.xiaomi.channel.commonutils.logger.b.m62a(String.format("[Bcst] notify packet(blob) arrival. %s,%s,%s", bVarA.f107917g, bVarA.f1043a, gqVar.e()));
        if (e.a(gqVar)) {
            bq.a().a(gqVar.e(), SystemClock.elapsedRealtime());
        }
        a(xMPushService, intent, bVarA);
    }

    public void a(XMPushService xMPushService, String str, hs hsVar) {
        String str2;
        bf.b bVarA = a(hsVar);
        if (bVarA == null) {
            com.xiaomi.channel.commonutils.logger.b.d("error while notify channel closed! channel " + str + " not registered");
            return;
        }
        if ("5".equalsIgnoreCase(str)) {
            this.f108013a.a(xMPushService, hsVar, bVarA);
            return;
        }
        String str3 = bVarA.f1043a;
        if (hsVar instanceof hr) {
            str2 = "com.xiaomi.push.new_msg";
        } else if (hsVar instanceof hq) {
            str2 = "com.xiaomi.push.new_iq";
        } else {
            if (!(hsVar instanceof hu)) {
                com.xiaomi.channel.commonutils.logger.b.d("unknown packet type, drop it");
                return;
            }
            str2 = "com.xiaomi.push.new_pres";
        }
        Intent intent = new Intent();
        intent.setAction(str2);
        intent.setPackage(str3);
        intent.putExtra("ext_chid", str);
        intent.putExtra("ext_packet", hsVar.a());
        intent.putExtra(bj.J, bVarA.f107919i);
        intent.putExtra(bj.B, bVarA.f107918h);
        com.xiaomi.channel.commonutils.logger.b.m62a(String.format("[Bcst] notify packet arrival. %s,%s,%s", bVarA.f107917g, bVarA.f1043a, hsVar.j()));
        if ("3".equalsIgnoreCase(str)) {
            intent.putExtra(bj.f107953w, hsVar.f554a);
            intent.putExtra(bj.f107954x, System.currentTimeMillis());
        }
        a(xMPushService, intent, bVarA);
    }
}
