package com.xiaomi.push.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.ft;
import com.xiaomi.push.hp;
import com.xiaomi.push.hq;
import com.xiaomi.push.hr;
import com.xiaomi.push.hu;
import com.xiaomi.push.id;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.NameValuePair;

/* JADX INFO: loaded from: classes4.dex */
public class ServiceClient {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static ServiceClient f944a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static String f945a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Context f946a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private boolean f949a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private Messenger f950b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f107829b = id.a(5) + Constants.ACCEPT_TIME_SEPARATOR_SERVER;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f107828a = 0;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Messenger f947a = null;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private List<Message> f948a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private boolean f951b = false;

    private ServiceClient(Context context) {
        this.f949a = false;
        this.f946a = context.getApplicationContext();
        if (m664a()) {
            com.xiaomi.channel.commonutils.logger.b.c("use miui push service");
            this.f949a = true;
        }
    }

    private Intent a() {
        if (!isMiuiPushServiceEnabled()) {
            Intent intent = new Intent(this.f946a, (Class<?>) XMPushService.class);
            intent.putExtra(bj.F, this.f946a.getPackageName());
            b();
            return intent;
        }
        Intent intent2 = new Intent();
        intent2.setPackage("com.xiaomi.xmsf");
        intent2.setClassName("com.xiaomi.xmsf", m660a());
        intent2.putExtra(bj.F, this.f946a.getPackageName());
        m662a();
        return intent2;
    }

    private Message a(Intent intent) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 17;
        messageObtain.obj = intent;
        return messageObtain;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private String m660a() {
        try {
            return this.f946a.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4).versionCode >= 106 ? "com.xiaomi.push.service.XMPushService" : "com.xiaomi.xmsf.push.service.XMPushService";
        } catch (Exception unused) {
            return "com.xiaomi.xmsf.push.service.XMPushService";
        }
    }

    private String a(Map<String, String> map) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 1;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append(":");
            sb2.append(entry.getValue());
            if (i10 < map.size()) {
                sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            i10++;
        }
        return sb2.toString();
    }

    private Map<String, String> a(List<NameValuePair> list) {
        HashMap map = new HashMap();
        if (list != null && list.size() > 0) {
            for (NameValuePair nameValuePair : list) {
                if (nameValuePair != null) {
                    map.put(nameValuePair.getName(), nameValuePair.getValue());
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private void m662a() {
        this.f946a.getPackageManager().setComponentEnabledSetting(new ComponentName(this.f946a, (Class<?>) XMPushService.class), 2, 1);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private synchronized void m663a(Intent intent) {
        try {
            if (this.f951b) {
                Message messageA = a(intent);
                if (this.f948a.size() >= 50) {
                    this.f948a.remove(0);
                }
                this.f948a.add(messageA);
                return;
            }
            if (this.f950b == null) {
                this.f946a.bindService(intent, new bv(this), 1);
                this.f951b = true;
                this.f948a.clear();
                this.f948a.add(a(intent));
            } else {
                try {
                    this.f950b.send(a(intent));
                } catch (RemoteException unused) {
                    this.f950b = null;
                    this.f951b = false;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void a(Intent intent, String str, String str2, String str3, String str4, String str5, boolean z10, Map<String, String> map, Map<String, String> map2) {
        intent.putExtra(bj.f107949s, str);
        intent.putExtra(bj.f107952v, str2);
        intent.putExtra(bj.f107956z, str3);
        intent.putExtra(bj.B, str5);
        intent.putExtra(bj.A, str4);
        intent.putExtra(bj.C, z10);
        intent.putExtra(bj.J, f945a);
        intent.putExtra(bj.N, this.f947a);
        if (map != null && map.size() > 0) {
            String strA = a(map);
            if (!TextUtils.isEmpty(strA)) {
                intent.putExtra(bj.D, strA);
            }
        }
        if (map2 == null || map2.size() <= 0) {
            return;
        }
        String strA2 = a(map2);
        if (TextUtils.isEmpty(strA2)) {
            return;
        }
        intent.putExtra(bj.E, strA2);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private boolean m664a() {
        if (com.xiaomi.push.aa.f165a) {
            return false;
        }
        try {
            PackageInfo packageInfo = this.f946a.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4);
            return packageInfo != null && packageInfo.versionCode >= 104;
        } catch (Exception unused) {
            return false;
        }
    }

    private void b() {
        this.f946a.getPackageManager().setComponentEnabledSetting(new ComponentName(this.f946a, (Class<?>) XMPushService.class), 1, 1);
    }

    public static ServiceClient getInstance(Context context) {
        if (f944a == null) {
            f944a = new ServiceClient(context);
        }
        return f944a;
    }

    public static String getSession() {
        return f945a;
    }

    public static void setSession(String str) {
        f945a = str;
    }

    public boolean batchSendMessage(hr[] hrVarArr, boolean z10) {
        if (!com.xiaomi.push.bg.b(this.f946a)) {
            return false;
        }
        Intent intentA = a();
        int length = hrVarArr.length;
        Bundle[] bundleArr = new Bundle[length];
        for (int i10 = 0; i10 < hrVarArr.length; i10++) {
            String strA = ft.a();
            if (!TextUtils.isEmpty(strA)) {
                hp hpVar = new hp("pf", null, null, null);
                hp hpVar2 = new hp("sent", null, null, null);
                hpVar2.m454a(strA);
                hpVar.a(hpVar2);
                hrVarArr[i10].a(hpVar);
            }
            com.xiaomi.channel.commonutils.logger.b.c("SEND:" + hrVarArr[i10].mo456a());
            bundleArr[i10] = hrVarArr[i10].a();
        }
        if (length <= 0) {
            return false;
        }
        intentA.setAction(bj.f107937g);
        intentA.putExtra(bj.J, f945a);
        intentA.putExtra("ext_packets", bundleArr);
        intentA.putExtra("ext_encrypt", z10);
        return startServiceSafely(intentA);
    }

    public void checkAlive() {
        Intent intentA = a();
        intentA.setAction("com.xiaomi.push.check_alive");
        startServiceSafely(intentA);
    }

    public boolean closeChannel() {
        Intent intentA = a();
        intentA.setAction(bj.f107939i);
        return startServiceSafely(intentA);
    }

    public boolean closeChannel(String str) {
        Intent intentA = a();
        intentA.setAction(bj.f107939i);
        intentA.putExtra(bj.f107952v, str);
        return startServiceSafely(intentA);
    }

    public boolean closeChannel(String str, String str2) {
        Intent intentA = a();
        intentA.setAction(bj.f107939i);
        intentA.putExtra(bj.f107952v, str);
        intentA.putExtra(bj.f107949s, str2);
        return startServiceSafely(intentA);
    }

    @Deprecated
    public boolean forceReconnection(String str, String str2, String str3, String str4, String str5, boolean z10, List<NameValuePair> list, List<NameValuePair> list2) {
        return forceReconnection(str, str2, str3, str4, str5, z10, a(list), a(list2));
    }

    public boolean forceReconnection(String str, String str2, String str3, String str4, String str5, boolean z10, Map<String, String> map, Map<String, String> map2) {
        Intent intentA = a();
        intentA.setAction(bj.f107940j);
        a(intentA, str, str2, str3, str4, str5, z10, map, map2);
        return startServiceSafely(intentA);
    }

    public boolean isMiuiPushServiceEnabled() {
        return this.f949a;
    }

    public boolean notifyMessage(Bundle bundle, String str, String str2) {
        if (bundle == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            com.xiaomi.channel.commonutils.logger.b.m62a("Failed to notify message: bundle|userId|chid may be empty");
            return false;
        }
        Intent intentA = a();
        intentA.setAction(bj.f107945o);
        intentA.putExtras(bundle);
        com.xiaomi.channel.commonutils.logger.b.e("notify: chid=" + str2 + " bundle:" + bundle);
        return startServiceSafely(intentA);
    }

    public int openChannel(String str, String str2, String str3, String str4, String str5, Map<String, String> map, Map<String, String> map2, boolean z10) {
        Intent intentA = a();
        intentA.setAction(bj.f107934d);
        a(intentA, str, str2, str3, str4, str5, z10, map, map2);
        startServiceSafely(intentA);
        return 0;
    }

    @Deprecated
    public int openChannel(String str, String str2, String str3, String str4, String str5, boolean z10, List<NameValuePair> list, List<NameValuePair> list2) {
        return openChannel(str, str2, str3, str4, str5, a(list), a(list2), z10);
    }

    @Deprecated
    public void resetConnection(String str, String str2, String str3, String str4, String str5, boolean z10, List<NameValuePair> list, List<NameValuePair> list2) {
        resetConnection(str, str2, str3, str4, str5, z10, a(list), a(list2));
    }

    public void resetConnection(String str, String str2, String str3, String str4, String str5, boolean z10, Map<String, String> map, Map<String, String> map2) {
        Intent intentA = a();
        intentA.setAction(bj.f107941k);
        a(intentA, str, str2, str3, str4, str5, z10, map, map2);
        startServiceSafely(intentA);
    }

    public boolean sendIQ(hq hqVar) {
        if (!com.xiaomi.push.bg.b(this.f946a)) {
            return false;
        }
        Intent intentA = a();
        Bundle bundleA = hqVar.a();
        if (bundleA == null) {
            return false;
        }
        com.xiaomi.channel.commonutils.logger.b.c("SEND:" + hqVar.mo456a());
        intentA.setAction(bj.f107936f);
        intentA.putExtra(bj.J, f945a);
        intentA.putExtra("ext_packet", bundleA);
        return startServiceSafely(intentA);
    }

    public boolean sendMessage(hr hrVar, boolean z10) {
        if (!com.xiaomi.push.bg.b(this.f946a)) {
            return false;
        }
        Intent intentA = a();
        String strA = ft.a();
        if (!TextUtils.isEmpty(strA)) {
            hp hpVar = new hp("pf", null, null, null);
            hp hpVar2 = new hp("sent", null, null, null);
            hpVar2.m454a(strA);
            hpVar.a(hpVar2);
            hrVar.a(hpVar);
        }
        Bundle bundleA = hrVar.a();
        if (bundleA == null) {
            return false;
        }
        com.xiaomi.channel.commonutils.logger.b.c("SEND:" + hrVar.mo456a());
        intentA.setAction(bj.f107935e);
        intentA.putExtra(bj.J, f945a);
        intentA.putExtra("ext_packet", bundleA);
        intentA.putExtra("ext_encrypt", z10);
        return startServiceSafely(intentA);
    }

    public boolean sendMessage(byte[] bArr, String str, String str2) {
        String strSubstring;
        if (!com.xiaomi.push.bg.b(this.f946a) || bArr == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            com.xiaomi.channel.commonutils.logger.b.m62a("Failed to send message: message|userId|chid may be empty, or the network is unavailable.");
            return false;
        }
        Intent intentA = a();
        intentA.setAction(bj.f107935e);
        intentA.putExtra(bj.J, f945a);
        intentA.putExtra("ext_raw_packet", bArr);
        int iIndexOf = str.indexOf("@");
        String strSubstring2 = null;
        String strSubstring3 = iIndexOf != -1 ? str.substring(0, iIndexOf) : null;
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf != -1) {
            strSubstring2 = str.substring(iIndexOf + 1, iLastIndexOf);
            strSubstring = str.substring(iLastIndexOf + 1);
        } else {
            strSubstring = null;
        }
        intentA.putExtra(bj.f107949s, strSubstring3);
        intentA.putExtra(bj.f107950t, strSubstring2);
        intentA.putExtra(bj.f107951u, strSubstring);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f107829b);
        long j10 = f107828a;
        f107828a = 1 + j10;
        sb2.append(j10);
        String string = sb2.toString();
        intentA.putExtra("ext_pkt_id", string);
        intentA.putExtra("ext_chid", str2);
        com.xiaomi.channel.commonutils.logger.b.e("SEND: chid=" + str2 + ", packetId=" + string);
        return startServiceSafely(intentA);
    }

    public boolean sendPresence(hu huVar) {
        if (!com.xiaomi.push.bg.b(this.f946a)) {
            return false;
        }
        Intent intentA = a();
        Bundle bundleA = huVar.a();
        if (bundleA == null) {
            return false;
        }
        com.xiaomi.channel.commonutils.logger.b.c("SEND:" + huVar.mo456a());
        intentA.setAction(bj.f107938h);
        intentA.putExtra(bj.J, f945a);
        intentA.putExtra("ext_packet", bundleA);
        return startServiceSafely(intentA);
    }

    public void setMessenger(Messenger messenger) {
        this.f947a = messenger;
    }

    public boolean startServiceSafely(Intent intent) {
        try {
            if (com.xiaomi.push.j.m520a() || Build.VERSION.SDK_INT < 26) {
                this.f946a.startService(intent);
                return true;
            }
            m663a(intent);
            return true;
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.a(e10);
            return false;
        }
    }

    @Deprecated
    public void updateChannelInfo(String str, List<NameValuePair> list, List<NameValuePair> list2) {
        updateChannelInfo(str, a(list), a(list2));
    }

    public void updateChannelInfo(String str, Map<String, String> map, Map<String, String> map2) {
        Intent intentA = a();
        intentA.setAction(bj.f107942l);
        if (map != null) {
            String strA = a(map);
            if (!TextUtils.isEmpty(strA)) {
                intentA.putExtra(bj.D, strA);
            }
        }
        if (map2 != null) {
            String strA2 = a(map2);
            if (!TextUtils.isEmpty(strA2)) {
                intentA.putExtra(bj.E, strA2);
            }
        }
        intentA.putExtra(bj.f107952v, str);
        startServiceSafely(intentA);
    }
}
