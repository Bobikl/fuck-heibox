package com.ishumei.smantifraud.l1111l111111Il;

import android.content.Context;
import android.net.TrafficStats;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.text.ttml.d;
import com.ishumei.smantifraud.SmAntiFraud;
import com.ishumei.smantifraud.dfp.SMSDK;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class l1111l111111Il {
    private static final String l1111l111111Il = "Smlog";
    private static int l111l11111I1l = 2;
    private static final String l111l11111Il = "network";
    private static int l111l11111lIl = 1;
    private static final String l111l1111l1Il = "operator";
    private static final String l111l1111lI1l = "bssid";
    private static final String l111l1111lIl = "wifiip";
    private static final String l111l1111llIl = "ssid";
    private static l1111l111111Il l111l11IlIlIl = null;
    private static final String l11l1111I11l = "ainfo";
    private static final String l11l1111I1l = "props_sn";
    private static final String l11l1111I1ll = "simCountryISO";
    private static final String l11l1111Il = "networkCountryIso";
    private static final String l11l1111Il1l = "oaid";
    private static final String l11l1111Ill = "launcherInfo";
    private static final String l11l1111lIIl = "adid";
    private static final String l11l111l11Il = "screenRecord";
    private static final String l11l111l1lll = "hookJava";
    private static final String l11l11IlIIll = "logcatHits";
    private String l11l111l1I1l;
    private boolean l11l111l1Il;
    private long l11l111ll11l;

    public static synchronized l1111l111111Il l1111l111111Il() {
        if (l111l11IlIlIl == null) {
            l111l11IlIlIl = new l1111l111111Il();
        }
        return l111l11IlIlIl;
    }

    private static void l111l11111Il() {
        if (l111l11111I1l.class.getDeclaredFields().length < 94) {
            Log.e(l1111l111111Il, "missing core fields, check proguard file");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, Object> l111l11111lIl(Map<String, l111l11111Il.l1111l111111Il> map) {
        HashMap map2 = new HashMap();
        if (map != null && map.size() != 0) {
            for (Map.Entry<String, l111l11111Il.l1111l111111Il> entry : map.entrySet()) {
                try {
                    String key = entry.getKey();
                    l111l11111Il.l1111l111111Il value = entry.getValue();
                    if (value.l111l11111I1l() == 0) {
                        if (com.ishumei.smantifraud.l111l1111llIl.l111l1111llIl.l1111l111111Il(value.l111l11111lIl())) {
                            map2.put(key, 1);
                        }
                    } else if (1 == value.l111l11111I1l() && com.ishumei.smantifraud.l111l1111llIl.l111l1111llIl.l111l11111I1l(value.l111l11111lIl())) {
                        map2.put(key, 1);
                    }
                } catch (Exception unused) {
                }
            }
        }
        return map2;
    }

    /* JADX WARN: Code duplicated, block: B:84:0x02b9  */
    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized String l1111l111111Il(final int i10) {
        boolean zContains;
        int i11;
        l111l11111Il l111l11111il;
        int i12;
        JSONObject jSONObjectL1111l111111Il;
        Set<String> set;
        int i13;
        if (com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l111l1111l1Il) {
            return null;
        }
        if (this.l11l111l1I1l != null && System.currentTimeMillis() - this.l11l111ll11l < 1000) {
            try {
                return new String(com.ishumei.smantifraud.l111l1111llIl.l111l1111llIl.l111l1111llIl(this.l11l111l1I1l));
            } catch (Exception unused) {
            }
        }
        final l111l11111I1l l111l11111i1l = new l111l11111I1l();
        long jCurrentTimeMillis = System.currentTimeMillis();
        l111l11111i1l.l11l1111I11l(com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l111l11111lIl);
        final l111l11111Il l111l11111ilL111l11111lIl = l111l1111l1Il.l1111l111111Il().l111l11111lIl();
        SmAntiFraud.SmOption smOption = SmAntiFraud.option;
        Set<String> setEmptySet = smOption.l11l1111Ill() == null ? Collections.emptySet() : smOption.l11l1111Ill();
        try {
            if (l111l11111I1l.class.getDeclaredFields().length < 94) {
                Log.e(l1111l111111Il, "missing core fields, check proguard file");
            }
            l111l11111i1l.l1111l111111Il(setEmptySet);
            l111l11111i1l.l111l1111lIl(smOption.l1111l111111Il());
            List<String> listL11l1111Il1l = com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l11l1111Il1l();
            if (!listL11l1111Il1l.isEmpty()) {
                l111l11111i1l.l111l11111Il(listL11l1111Il1l);
            }
            Set<String> setL111l11111Il = l111l11111ilL111l11111lIl == null ? null : l111l11111ilL111l11111lIl.l111l11111Il();
            l111l11111i1l.l11l1111I1l("all");
            final com.ishumei.smantifraud.l111l11111I1l.l111l1111lI1l l111l1111li1l = new com.ishumei.smantifraud.l111l11111I1l.l111l1111lI1l();
            final com.ishumei.smantifraud.l111l11111lIl.l1111l111111Il.l111l11111Il l111l11111ilL1111l111111Il = com.ishumei.smantifraud.l111l11111lIl.l1111l111111Il.l111l11111Il.l1111l111111Il();
            final Set<String> set2 = setEmptySet;
            final Set<String> set3 = setL111l11111Il;
            l111l11111il = l111l11111ilL111l11111lIl;
            i11 = 0;
            try {
                Thread thread = new Thread(new Runnable() { // from class: com.ishumei.smantifraud.l1111l111111Il.l1111l111111Il.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        l111l11111Il l111l11111il2;
                        if (!set2.contains(l1111l111111Il.l11l1111Il1l)) {
                            l111l11111i1l.l111l111III1l(new com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l111l1111llIl(com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il).l1111l111111Il());
                        }
                        l111l11111i1l.l1111l111111Il(com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l11l1111I1ll());
                        if (!set2.contains(l1111l111111Il.l11l111l1lll) && (l111l11111il2 = l111l11111ilL111l11111lIl) != null && l111l11111il2.l111l1111lIl()) {
                            l111l11111i1l.l111l1111lI1l(com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l1111l111111Il());
                        }
                        l111l11111Il l111l11111il3 = l111l11111ilL111l11111lIl;
                        l111l11111i1l.l111l11111I1l(l1111l111111Il.l111l11111lIl(l111l11111il3 == null ? null : l111l11111il3.l111l11111I1l()));
                        Set set4 = set3;
                        if (set4 == null || !set4.contains("bssid") || set2.contains("bssid")) {
                            return;
                        }
                        if ((i10 & 1) == 1) {
                            l111l11111i1l.l11l111l1I1l(com.ishumei.smantifraud.l111l1111llIl.l111l1111llIl.l111l1111l1Il(l111l1111li1l.l111l11111lIl()));
                        } else {
                            l111l11111i1l.l11l111l1I1l(l111l1111li1l.l111l11111lIl());
                        }
                    }
                });
                Thread thread2 = new Thread(new Runnable() { // from class: com.ishumei.smantifraud.l1111l111111Il.l1111l111111Il.2
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        com.ishumei.smantifraud.l111l11111I1l.l11l1111I1ll.l1111l111111Il(l111l11111i1l);
                        Context context = com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il;
                        if (context != null) {
                            l111l11111i1l.l111l111I1l(context.getFilesDir().toString());
                        }
                        l111l11111i1l.l111l11111Il(com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l111l1111llIl());
                        l111l11111i1l.l11l1111Il(com.ishumei.smantifraud.l111l11111lIl.l111l11111I1l.l1111l111111Il().l111l11111lIl());
                        l111l11111i1l.l111l1111l1Il(l111l11111ilL1111l111111Il.l111l11111Il());
                        l111l11111i1l.l11l11l111Il(l111l11111ilL1111l111111Il.l111l1111l1Il());
                        l111l11111i1l.l11IIIlIll(l111l11111ilL1111l111111Il.l111l1111llIl());
                        List<String> listL11l1111Ill = com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l11l1111Ill();
                        if (listL11l1111Ill == null || listL11l1111Ill.isEmpty()) {
                            return;
                        }
                        l111l11111i1l.l111l1111l1Il(listL11l1111Ill);
                    }
                });
                thread.start();
                thread2.start();
                l111l11111i1l.l111l11111Il(smOption.l11l1111I1l());
                l111l11111i1l.l11l1111I1ll(l111l11111ilL1111l111111Il.l111l11111I1l());
                l111l11111i1l.l11l1111Il1l(smOption.l11l1111I1ll());
                l111l11111i1l.l11l1111Ill("android");
                l111l11111i1l.l11l11IlIIll("3.8.0");
                l111l11111i1l.l11l11l1l1Il("build1");
                l111l11111i1l.l1111l111111Il(Long.valueOf(System.currentTimeMillis()));
                Context context = com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il;
                l111l11111i1l.l1111l111111Il(Integer.valueOf(context == null ? 0 : context.getApplicationInfo().targetSdkVersion));
                l111l11111i1l.l11l111l11Il(Build.VERSION.RELEASE);
                l111l11111i1l.l11l111l1lll(smOption.l11l11IlIIll());
                if (!setEmptySet.contains(l11l111l11Il)) {
                    com.ishumei.smantifraud.l111l11111I1l.l111l1111lIl l111l1111lil = new com.ishumei.smantifraud.l111l11111I1l.l111l1111lIl();
                    if (l111l1111lil.l1111l111111Il(com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il, false)) {
                        l111l11111i1l.l11l1111I1l(l111l1111lil.l1111l111111Il());
                        l111l11111i1l.l111l1111lI1l(l111l1111lil.l111l11111lIl());
                    }
                }
                if (set3 != null) {
                    set = set3;
                    if (set.contains(l11l1111I11l)) {
                        l111l11111i1l.l111l11IlIlIl(String.valueOf(com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l111l11111I1l()));
                    }
                } else {
                    set = set3;
                }
                com.ishumei.smantifraud.l111l11111I1l.l11l1111I1l l11l1111i1l = new com.ishumei.smantifraud.l111l11111I1l.l11l1111I1l();
                if (!setEmptySet.contains(l111l1111l1Il)) {
                    l111l11111i1l.l111l111lIlll(l11l1111i1l.l1111l111111Il());
                }
                if (set != null && set.contains("ssid") && !setEmptySet.contains("ssid")) {
                    l111l11111i1l.l11l111ll1Il(l111l1111li1l.l1111l111111Il());
                }
                if (!setEmptySet.contains(l111l1111lIl)) {
                    l111l11111i1l.l11l111lll(l111l1111li1l.l111l11111I1l());
                }
                if (!setEmptySet.contains("network")) {
                    l111l11111i1l.l11l111lIll(l111l1111li1l.l111l11111Il());
                }
                setEmptySet.contains(l11l1111I1l);
                l111l11111i1l.l1111l111111Il(com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111llIl.l1111l111111Il());
                zContains = setEmptySet.contains(l11l1111lIIl);
                try {
                    if (zContains) {
                        zContains = true;
                    } else {
                        zContains = true;
                        l111l11111i1l.l11l111l1Il((i10 & 1) == 1 ? com.ishumei.smantifraud.l111l1111llIl.l111l1111llIl.l111l1111l1Il(com.ishumei.smantifraud.l111l11111I1l.l11l1111lIIl.l1111l111111Il()) : com.ishumei.smantifraud.l111l11111I1l.l11l1111lIIl.l1111l111111Il());
                    }
                    l111l11111i1l.l11l111ll11l(Build.getRadioVersion());
                    l111l11111i1l.l111l1111lI1l(com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l111l1111lIl());
                    com.ishumei.smantifraud.l111l11111I1l.l111l1111l1Il.l1111l111111Il l1111l111111Il2 = com.ishumei.smantifraud.l111l11111I1l.l111l1111l1Il.l1111l111111Il();
                    l111l11111i1l.l11l111lllIl(l1111l111111Il2.l1111l111111Il);
                    l111l11111i1l.l11l111llI1l(l1111l111111Il2.l111l11111lIl);
                    l111l11111i1l.l111l11111I1l(Integer.valueOf(com.ishumei.smantifraud.l111l11111I1l.l111l1111l1Il.l111l11111lIl()));
                    l111l11111i1l.l111l11111Il(Integer.valueOf(com.ishumei.smantifraud.l111l11111I1l.l111l1111l1Il.l111l11111I1l()));
                    l111l11111i1l.l111l11111I1l(Long.valueOf(com.ishumei.smantifraud.l111l11111I1l.l111l1111l1Il.l111l11111Il()));
                    l111l11111i1l.l111l111llIl(com.ishumei.smantifraud.l111l11111I1l.l111l1111llIl.l1111l111111Il());
                    l111l11111i1l.l111l11111lIl(Integer.valueOf(com.ishumei.smantifraud.l111l11111I1l.l111l1111llIl.l111l11111I1l()));
                    l111l11111i1l.l111l1111llIl(com.ishumei.smantifraud.l111l11111I1l.l111l1111llIl.l111l11111lIl());
                    l111l11111i1l.l111l1111l1Il(Integer.valueOf(com.ishumei.smantifraud.l111l11111I1l.l11l1111lIIl.l111l11111I1l()));
                    l111l11111i1l.l11l111lI1l(com.ishumei.smantifraud.l111l11111I1l.l111l11111lIl.l111l11111lIl());
                    l111l11111i1l.l11l11l1lIl(com.ishumei.smantifraud.l111l11111I1l.l111l11111lIl.l111l11111I1l());
                    l111l11111i1l.l111l11111lIl(Long.valueOf(com.ishumei.smantifraud.l111l11111I1l.l11l1111lIIl.l111l11111lIl()));
                    l111l11111i1l.l111l11111I1l(com.ishumei.smantifraud.l111l11111I1l.l11l1111lIIl.l111l1111l1Il());
                    l111l11111i1l.l111l11111lIl(com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l11111lIl());
                    Object objL111l11111Il = com.ishumei.smantifraud.l111l11111I1l.l111l11111lIl.l111l11111Il();
                    if (objL111l11111Il != null) {
                        l111l11111i1l.l11l111I111l(com.ishumei.smantifraud.l111l11111I1l.l111l11111lIl.l1111l111111Il(objL111l11111Il));
                        l111l11111i1l.l111l1111llIl(Integer.valueOf(objL111l11111Il.hashCode()));
                    }
                    l111l11111i1l.l111l11111lIl(com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l111l11111lIl());
                    l111l11111i1l.l111l11111I1l(com.ishumei.smantifraud.l111l11111lIl.l111l11111Il.l1111l111111Il().l111l11111I1l());
                    StatFs statFsL111l11111Il = com.ishumei.smantifraud.l111l11111I1l.l111l1111llIl.l111l11111Il();
                    if (statFsL111l11111Il != null) {
                        l111l11111i1l.l111l11111Il(Long.valueOf(statFsL111l11111Il.getAvailableBytes()));
                        l111l11111i1l.l111l1111l1Il(Long.valueOf(statFsL111l11111Il.getFreeBytes()));
                        l111l11111i1l.l111l1111llIl(Long.valueOf(statFsL111l11111Il.getTotalBytes()));
                    }
                    l111l11111i1l.l111l1111l1Il(com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.AnonymousClass1.l1111l111111Il());
                    Context context2 = com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il;
                    if (context2 == null) {
                        i13 = 0;
                    } else {
                        if (Settings.Secure.getInt(context2.getContentResolver(), "mock_location", 0) != 0 ? zContains ? 1 : 0 : false) {
                            i13 = zContains ? 1 : 0;
                        } else {
                            i13 = 0;
                        }
                    }
                    l111l11111i1l.l111l1111lI1l(Integer.valueOf(i13));
                    l111l11111i1l.l111l1111lIl(Integer.valueOf(Debug.isDebuggerConnected() ? zContains ? 1 : 0 : 0));
                    l111l11111i1l.l11l1111lIIl(Integer.valueOf((com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il.getApplicationInfo().flags & 2) > 0 ? zContains ? 1 : 0 : 0));
                    l111l11111i1l.l11l111Il(com.ishumei.smantifraud.l111l11111I1l.l111l1111lI1l.l111l1111l1Il());
                    l111l11111i1l.l111l1111llIl(com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l111l1111l1Il());
                    l111l11111i1l.l111l11111lIl(com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l111l11111Il());
                    l111l11111i1l.l11l1111lIIl(com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l111l1111lI1l());
                    l111l11111i1l.l1111l111111Il(com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l11l1111lIIl());
                    l111l11111i1l.l111l11111lIl(com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l11l1111I11l());
                    l111l11111i1l.l111l11111I1l(com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l11l1111I1l());
                    if (com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l11l1111Il() == zContains) {
                        l111l11111i1l.l1111l111111Il(zContains ? 1 : 0);
                    }
                    l111l11111i1l.l111l11111Il(com.ishumei.smantifraud.l111l11111I1l.l111l1111llIl.l111l1111l1Il());
                    l111l11111i1l.l111l1111l1Il(com.ishumei.smantifraud.l111l11111lIl.l1111l111111Il.l1111l111111Il(com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il));
                    if (!setEmptySet.contains(l11l1111I1ll)) {
                        l111l11111i1l.l11l11l11Il(l11l1111i1l.l111l11111lIl());
                    }
                    if (!setEmptySet.contains(l11l1111Il)) {
                        l111l11111i1l.l111l11l11Ill(l11l1111i1l.l111l11111I1l());
                    }
                    Map<String, Object> mapL11l11IlIIll = com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l11l11IlIIll();
                    if (mapL11l11IlIIll != null) {
                        l111l11111i1l.l111l1111lIl(mapL11l11IlIIll);
                    }
                    if (com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l11l111l11Il()) {
                        l111l11111i1l.l1111l111111Il(zContains);
                    }
                    Map<String, Long> map = new HashMap<>(5);
                    map.put("mr", Long.valueOf(TrafficStats.getMobileRxBytes()));
                    map.put("mt", Long.valueOf(TrafficStats.getMobileTxBytes()));
                    map.put("tr", Long.valueOf(TrafficStats.getTotalRxBytes()));
                    map.put(d.f49795n, Long.valueOf(TrafficStats.getTotalTxBytes()));
                    l111l11111i1l.l11l1111lIIl(map);
                    l111l11111i1l.l111l11111lIl(Settings.Secure.getInt(com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il.getContentResolver(), "adb_enabled", 0));
                    l111l11111i1l.l11l11l11lIl(smOption.l11l111l11Il());
                    Map<String, Long> mapL111l1111llIl = com.ishumei.smantifraud.l111l11111I1l.l111l11111lIl.l111l1111llIl();
                    if (mapL111l1111llIl != null && !mapL111l1111llIl.isEmpty()) {
                        l111l11111i1l.l11l1111I11l(mapL111l1111llIl);
                    }
                    this.l11l111l1Il = zContains;
                    String deviceId = SmAntiFraud.getDeviceId();
                    if (deviceId != null && !deviceId.startsWith("D")) {
                        l111l11111i1l.l11l11l11I1l(deviceId);
                    }
                    this.l11l111l1Il = false;
                    if (SMSDK.ma()) {
                        l111l11111i1l.l111l1111lI1l(zContains ? 1 : 0);
                    }
                    File parentFile = new File(com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il.getApplicationInfo().dataDir).getParentFile();
                    if (parentFile != null && parentFile.canRead()) {
                        l111l11111i1l.l111l1111lIl(zContains ? 1 : 0);
                    }
                    l111l11111i1l.l11l1111lIIl(com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111llIl.l1111l111111Il(com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il));
                    Map<String, String> mapL111l1111lI1l = com.ishumei.smantifraud.l111l11111I1l.l111l11111lIl.l111l1111lI1l();
                    if (mapL111l1111lI1l != null) {
                        l111l11111i1l.l11l1111I1l(mapL111l1111lI1l);
                    }
                    if (!setEmptySet.contains(l11l1111Ill)) {
                        l111l11111i1l.l11l1111I1ll(com.ishumei.smantifraud.l111l11111I1l.l111l11111lIl.l1111l111111Il(com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il));
                    }
                    if (!setEmptySet.contains(l11l11IlIIll)) {
                        List<String> arrayList = new ArrayList<>();
                        if (!arrayList.isEmpty()) {
                            l111l11111i1l.l111l1111llIl(arrayList);
                        }
                    }
                    thread.join(2000L);
                    thread2.join();
                    l111l11111i1l.l111l1111llIl((int) (System.currentTimeMillis() - jCurrentTimeMillis));
                    i12 = zContains;
                } catch (Throwable th2) {
                    th = th2;
                    l111l11111i1l.l111l111Il1l(Log.getStackTraceString(th));
                    i12 = zContains;
                }
            } catch (Throwable th3) {
                th = th3;
                zContains = true;
            }
        } catch (Throwable th4) {
            th = th4;
            zContains = true;
            i11 = 0;
            l111l11111il = l111l11111ilL111l11111lIl;
        }
        JSONObject jSONObjectL1111l111111Il2 = com.ishumei.smantifraud.l111l1111llIl.l111l1111llIl.l1111l111111Il(l111l11111i1l, (Set<String>) null);
        if (smOption.l111l1111lIl() && TextUtils.isEmpty(com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l111l11111Il)) {
            l111l11111i1l.l11l1111I11l(i12);
            jSONObjectL1111l111111Il = com.ishumei.smantifraud.l111l1111llIl.l111l1111llIl.l1111l111111Il(l111l11111i1l, l111l11111lIl.l1111l111111Il);
            l111l11111lIl.l1111l111111Il(jSONObjectL1111l111111Il);
        } else {
            jSONObjectL1111l111111Il = null;
        }
        String strV1 = SMSDK.v1(com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il, jSONObjectL1111l111111Il2.toString(), jSONObjectL1111l111111Il == null ? null : jSONObjectL1111l111111Il.toString(), (l111l11111il == null || !l111l11111il.l111l1111llIl()) ? null : l111l11111il.l11l1111I1l(), smOption.l111l11111Il(), smOption.l11l1111I1l(), smOption.l11l11IlIIll(), smOption.l11l1111I1ll(), com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l111l11111I1l);
        if (TextUtils.isEmpty(strV1) || !strV1.startsWith("{")) {
            throw new Exception("error ret: " + strV1);
        }
        int iIndexOf = strV1.indexOf("}{") + i12;
        if (iIndexOf > 0) {
            String strSubstring = strV1.substring(i11, iIndexOf);
            this.l11l111l1I1l = com.ishumei.smantifraud.l111l1111llIl.l111l1111llIl.l1111l111111Il(strV1.substring(iIndexOf).getBytes());
            strV1 = strSubstring;
        } else {
            this.l11l111l1I1l = com.ishumei.smantifraud.l111l1111llIl.l111l1111llIl.l1111l111111Il(strV1.getBytes());
        }
        this.l11l111ll11l = System.currentTimeMillis();
        return strV1;
    }

    public final synchronized String l111l11111I1l() {
        return this.l11l111l1I1l;
    }

    public final boolean l111l11111lIl() {
        return this.l11l111l1Il;
    }
}
