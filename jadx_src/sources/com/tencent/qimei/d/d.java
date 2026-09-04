package com.tencent.qimei.d;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import androidx.annotation.p0;
import com.tencent.qimei.beaconid.U;
import com.tencent.qimei.l.f;
import com.tencent.qmsp.oaid2.VendorManager;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/* JADX INFO: compiled from: DeviceInfo.java */
/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"MissingPermission"})
public class d implements com.tencent.qimei.h.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f101227a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f101228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f101229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f101230d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f101231e = new f();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f101232f = new f();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f101233g = new f();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f101234h = new f();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f f101235i = new f();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f101236j = new f();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f f101237k = new f();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f f101238l = new f();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f f101239m = new f();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f f101240n = new f();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final f f101241o = new f();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Enumeration<NetworkInterface> f101242p = null;

    public d() {
        Context contextF = com.tencent.qimei.u.d.b().F();
        this.f101228b = contextF;
        com.tencent.qimei.h.a.a(contextF, this);
        F();
    }

    public static synchronized d l() {
        return f101227a;
    }

    public byte A() {
        return (byte) 1;
    }

    public String B() {
        return U.b();
    }

    public boolean C() {
        return Process.myUid() / 100000 != 0;
    }

    public boolean D() {
        String str = (String) com.tencent.qimei.l.d.a("com.huawei.system.BuildEx", "getOsBrand", new Class[0], new Object[0]);
        if (str == null) {
            return false;
        }
        return "harmony".equalsIgnoreCase(str);
    }

    public boolean E() {
        try {
            if (((UiModeManager) this.f101228b.getSystemService("uimode")).getCurrentModeType() == 4) {
                return true;
            }
            return this.f101228b.getPackageManager().hasSystemFeature("android.hardware.type.television") || this.f101228b.getPackageManager().hasSystemFeature("android.software.leanback");
        } catch (Throwable th2) {
            com.tencent.qimei.n.a.a(th2);
            return false;
        }
    }

    public void F() {
        this.f101236j.a(G());
    }

    public final String G() {
        String strS = "unknown";
        try {
            NetworkInfo networkInfoV = v();
            if (networkInfoV == null) {
                return "unknown";
            }
            if (networkInfoV.getType() == 1) {
                strS = "wifi";
            } else if (networkInfoV.getType() == 0) {
                strS = s();
            }
        } catch (Exception e10) {
            com.tencent.qimei.n.a.a(e10);
        }
        com.tencent.qimei.n.a.a("[DeviceInfo] NetWork Type:" + strS, new Object[0]);
        return strS;
    }

    public final StringBuilder a(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            sb2.append(String.format("%02X:", Byte.valueOf(b10)));
        }
        if (sb2.length() > 0) {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        return sb2;
    }

    @Override // com.tencent.qimei.h.b
    public void a() {
        F();
    }

    public void a(e eVar) {
        b(eVar);
        com.tencent.qimei.n.a.b("SDK_INIT ｜ DeviceInfo", " 初始化完成 ", new Object[0]);
    }

    @Override // com.tencent.qimei.h.b
    public void b() {
        F();
    }

    public final void b(e eVar) {
        if (this.f101228b == null) {
            eVar.a(3);
        } else {
            if (this.f101237k.a()) {
                return;
            }
            this.f101229c = SystemClock.elapsedRealtime();
            new VendorManager().getVendorInfo(this.f101228b, new c(this, eVar));
        }
    }

    @SuppressLint({"HardwareIds"})
    public synchronized String c() {
        String strB = this.f101231e.b();
        String string = "";
        if (this.f101228b == null) {
            return strB;
        }
        if (this.f101231e.a()) {
            return strB;
        }
        try {
            string = Settings.Secure.getString(this.f101228b.getContentResolver(), SocializeProtocolConstants.PROTOCOL_KEY_ANDROID_ID);
        } catch (Exception e10) {
            com.tencent.qimei.n.a.a(e10);
        }
        String lowerCase = string != null ? string.toLowerCase() : "";
        this.f101231e.a(lowerCase);
        com.tencent.qimei.n.a.d("[DeviceInfo] Android ID:" + lowerCase, new Object[0]);
        return lowerCase;
    }

    public synchronized String d() {
        if (!this.f101240n.a()) {
            this.f101240n.a(b.a(Build.VERSION.SDK_INT));
        }
        return this.f101240n.b();
    }

    public synchronized String e() {
        if (this.f101241o.a()) {
            return this.f101241o.b();
        }
        String str = Build.MODEL;
        this.f101241o.a(str);
        com.tencent.qimei.n.a.a("[DeviceInfo] build model: %s", str);
        return str;
    }

    public final String f() throws Throwable {
        String strD = com.tencent.qimei.l.a.d("/proc/self/mountinfo");
        if (strD.isEmpty()) {
            return "";
        }
        if (strD.contains("/lxc_container/")) {
            return "lxc";
        }
        String strReplaceAll = com.tencent.qimei.l.a.d("/proc/self/cpuset").replaceAll("[\\t\\n\\r]", "");
        return (strReplaceAll.contains("/docker") && strD.contains(strReplaceAll)) ? "docker" : "";
    }

    public final String g() {
        int iIndexOf;
        File file = new File("/");
        if (file.listFiles() == null) {
            return "";
        }
        for (File file2 : file.listFiles()) {
            String name = file2.getName();
            if (name.startsWith("init.") && name.endsWith(".environment.rc") && (iIndexOf = name.indexOf(".environment.rc")) > 5) {
                return name.substring(5, iIndexOf);
            }
        }
        return "";
    }

    public String h() {
        String string = "";
        try {
            String strG = g();
            String strF = f();
            if (!strG.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("");
                sb2.append("1#");
                sb2.append(strG);
                string = sb2.toString();
            }
            if (strF.isEmpty()) {
                return string;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(string);
            sb3.append("2#");
            sb3.append(strF);
            return sb3.toString();
        } catch (Throwable th2) {
            com.tencent.qimei.n.a.a(th2);
            return "";
        }
    }

    public String i() {
        try {
            int currentModeType = ((UiModeManager) this.f101228b.getSystemService("uimode")).getCurrentModeType();
            if (E()) {
                return "TV";
            }
            if (currentModeType == 6) {
                return "WATCH";
            }
            if (currentModeType == 3) {
                return "CAR";
            }
            return (this.f101228b.getResources().getConfiguration().screenLayout & 15) >= 3 ? "Pad" : "Phone";
        } catch (Throwable th2) {
            com.tencent.qimei.n.a.a(th2);
            return "Phone";
        }
    }

    public synchronized String j() {
        TelephonyManager telephonyManager;
        String strB = this.f101233g.b();
        String lowerCase = "";
        if (this.f101228b == null) {
            com.tencent.qimei.n.a.b("[DeviceInfo] getImei but context is null!", new Object[0]);
            return strB;
        }
        if (this.f101233g.a()) {
            return strB;
        }
        if (this.f101228b.getApplicationInfo().targetSdkVersion >= 29 && Build.VERSION.SDK_INT >= 29) {
            return strB;
        }
        if (a.c(this.f101228b) && (telephonyManager = (TelephonyManager) this.f101228b.getSystemService(g0.a.f118921e)) != null) {
            try {
                String deviceId = telephonyManager.getDeviceId();
                lowerCase = deviceId != null ? deviceId.toLowerCase() : "";
            } catch (Throwable th2) {
                com.tencent.qimei.n.a.d("[DeviceInfo] getDeviceId error!", new Object[0]);
                com.tencent.qimei.n.a.a(th2);
            }
        }
        this.f101233g.a(lowerCase);
        com.tencent.qimei.n.a.d("[DeviceInfo] IMEI:" + lowerCase, new Object[0]);
        return lowerCase;
    }

    public synchronized String k() {
        TelephonyManager telephonyManager;
        String strB = this.f101234h.b();
        String lowerCase = "";
        if (this.f101228b == null) {
            com.tencent.qimei.n.a.b("[DeviceInfo] getImsi but context == null!", new Object[0]);
            return strB;
        }
        if (this.f101234h.a()) {
            return strB;
        }
        if (this.f101228b.getApplicationInfo().targetSdkVersion >= 29 && Build.VERSION.SDK_INT >= 29) {
            return strB;
        }
        if (a.c(this.f101228b) && (telephonyManager = (TelephonyManager) this.f101228b.getSystemService(g0.a.f118921e)) != null) {
            try {
                String subscriberId = telephonyManager.getSubscriberId();
                lowerCase = subscriberId != null ? subscriberId.toLowerCase() : "";
            } catch (Throwable th2) {
                com.tencent.qimei.n.a.d("[DeviceInfo] getSubscriberId error!", new Object[0]);
                com.tencent.qimei.n.a.a(th2);
            }
        }
        this.f101234h.a(lowerCase);
        com.tencent.qimei.n.a.a("[DeviceInfo] imsi:" + lowerCase, new Object[0]);
        return lowerCase;
    }

    public synchronized String m() {
        if (!this.f101239m.a()) {
            this.f101239m.a(n());
        }
        return this.f101239m.b();
    }

    public final String n() {
        Enumeration<NetworkInterface> enumerationW = w();
        if (enumerationW == null) {
            return "0.0.0.0";
        }
        while (enumerationW.hasMoreElements()) {
            Enumeration<InetAddress> inetAddresses = enumerationW.nextElement().getInetAddresses();
            while (inetAddresses.hasMoreElements()) {
                InetAddress inetAddressNextElement = inetAddresses.nextElement();
                if (!inetAddressNextElement.isLoopbackAddress() && (inetAddressNextElement instanceof Inet4Address)) {
                    return inetAddressNextElement.getHostAddress();
                }
            }
        }
        return "0.0.0.0";
    }

    public synchronized String o() {
        String strP = "";
        if (this.f101235i.a()) {
            return this.f101235i.b();
        }
        try {
            int i10 = Build.VERSION.SDK_INT;
            strP = (i10 <= 23 || i10 >= 29) ? p() : r();
        } catch (Throwable th2) {
            com.tencent.qimei.n.a.a(th2);
        }
        this.f101235i.a(strP);
        com.tencent.qimei.n.a.a("[DeviceInfo] Mac Address:" + strP, new Object[0]);
        return strP;
    }

    public final String p() throws Exception {
        byte[] hardwareAddress;
        Enumeration<NetworkInterface> enumerationW = w();
        if (enumerationW == null) {
            return "";
        }
        while (enumerationW.hasMoreElements()) {
            NetworkInterface networkInterfaceNextElement = enumerationW.nextElement();
            if ("wlan0".equals(networkInterfaceNextElement.getName()) && (hardwareAddress = networkInterfaceNextElement.getHardwareAddress()) != null && hardwareAddress.length != 0) {
                return a(hardwareAddress).toString();
            }
        }
        return "";
    }

    public final String q() {
        WifiInfo connectionInfo;
        WifiManager wifiManager = (WifiManager) this.f101228b.getApplicationContext().getSystemService("wifi");
        return (wifiManager == null || (connectionInfo = wifiManager.getConnectionInfo()) == null) ? "" : connectionInfo.getMacAddress().toLowerCase();
    }

    public final String r() {
        String[] strArr = {"/sys/class/net/wlan0/address", "/sys/devices/virtual/net/wlan0/address"};
        String strTrim = "";
        for (int i10 = 0; i10 < 2; i10++) {
            strTrim = com.tencent.qimei.l.a.c(strArr[i10]).trim();
            if (strTrim.length() > 0) {
                return strTrim.toLowerCase();
            }
        }
        return strTrim;
    }

    public final String s() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f101228b.getSystemService(g0.a.f118921e);
        if (telephonyManager == null) {
            return "unknown";
        }
        int networkType = telephonyManager.getNetworkType();
        switch (networkType) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return d4.d.f108135c;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return d4.d.f108136d;
            case 13:
                return d4.d.f108137e;
            default:
                return "unknown_" + networkType;
        }
    }

    public synchronized String t() {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        if (this.f101238l.a()) {
            return this.f101238l.b();
        }
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader3 = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(new File("/sys/block/mmcblk0/device/type")));
            try {
                sb2.append(bufferedReader.readLine());
                com.tencent.qimei.l.a.a(bufferedReader);
            } catch (Throwable unused) {
                try {
                    com.tencent.qimei.n.a.b("getNandInfo error", new Object[0]);
                    com.tencent.qimei.l.a.a(bufferedReader);
                } catch (Throwable th2) {
                    com.tencent.qimei.l.a.a(bufferedReader);
                    throw th2;
                }
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
        }
        sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        try {
            bufferedReader2 = new BufferedReader(new FileReader(new File("/sys/block/mmcblk0/device/name")));
            try {
                sb2.append(bufferedReader2.readLine());
                com.tencent.qimei.l.a.a(bufferedReader2);
            } catch (Throwable unused3) {
                try {
                    com.tencent.qimei.n.a.b("getNandInfo error", new Object[0]);
                    com.tencent.qimei.l.a.a(bufferedReader2);
                } catch (Throwable th3) {
                    com.tencent.qimei.l.a.a(bufferedReader2);
                    throw th3;
                }
            }
        } catch (Throwable unused4) {
            bufferedReader2 = null;
        }
        sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        try {
            BufferedReader bufferedReader4 = new BufferedReader(new FileReader(new File("/sys/block/mmcblk0/device/cid")));
            try {
                sb2.append(bufferedReader4.readLine());
                com.tencent.qimei.l.a.a(bufferedReader4);
            } catch (Throwable unused5) {
                bufferedReader3 = bufferedReader4;
                try {
                    com.tencent.qimei.n.a.b("getNandInfo error", new Object[0]);
                    com.tencent.qimei.l.a.a(bufferedReader3);
                } catch (Throwable th4) {
                    com.tencent.qimei.l.a.a(bufferedReader3);
                    throw th4;
                }
            }
        } catch (Throwable unused6) {
        }
        String string = sb2.toString();
        this.f101238l.a(string);
        com.tencent.qimei.n.a.a("[DeviceInfo] Nand Info:" + string, new Object[0]);
        return string;
    }

    public String u() {
        return this.f101236j.b();
    }

    @p0
    public final NetworkInfo v() {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        Context context = this.f101228b;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return null;
        }
        return activeNetworkInfo;
    }

    public final synchronized Enumeration<NetworkInterface> w() {
        if (this.f101242p == null) {
            try {
                this.f101242p = NetworkInterface.getNetworkInterfaces();
            } catch (SocketException e10) {
                com.tencent.qimei.n.a.a(e10);
            }
        }
        return this.f101242p;
    }

    public String x() {
        return this.f101237k.b();
    }

    public synchronized String y() {
        if (this.f101232f.a()) {
            return this.f101232f.b();
        }
        String str = "Android " + Build.VERSION.RELEASE + ",level " + Build.VERSION.SDK;
        this.f101232f.a(str);
        com.tencent.qimei.n.a.a("[DeviceInfo] os version: %s", str);
        return str;
    }

    public String z() {
        Context context = this.f101228b;
        return context == null ? "" : context.getPackageName();
    }
}
