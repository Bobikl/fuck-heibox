package com.tencent.liteav.txcvodplayer.c;

import android.text.TextUtils;
import com.tencent.liteav.base.storage.PersistStorage;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.txcvodplayer.hlsencoder.TXCHLSEncoder;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static a f100125d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PersistStorage f100126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f100127b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<String> f100128c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final PersistStorage f100129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile long f100130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final PersistStorage f100131g;

    private a() {
        PersistStorage persistStorage = new PersistStorage("v4_cache");
        this.f100129e = persistStorage;
        Long l10 = persistStorage.getLong("clean_time");
        this.f100130f = l10 == null ? 0L : l10.longValue();
        this.f100126a = new PersistStorage("v4_download");
        this.f100131g = new PersistStorage("v4_common");
        this.f100128c = new HashSet();
    }

    public static a a() {
        synchronized (a.class) {
            if (f100125d == null) {
                f100125d = new a();
            }
        }
        return f100125d;
    }

    static /* synthetic */ void a(a aVar, int i10, String str, com.tencent.liteav.txcvodplayer.b.c.b bVar) {
        String strB = b(i10, str);
        String strA = TXCHLSEncoder.a(i10, "default", str, 0);
        String strA2 = TXCHLSEncoder.a(strA, bVar.f100079a);
        String strA3 = TXCHLSEncoder.a(strA, bVar.f100080b);
        StringBuilder sb2 = new StringBuilder(strA2);
        sb2.append(lg.a.f131412e);
        sb2.append(strA3);
        sb2.append(lg.a.f131412e);
        sb2.append(bVar.f100081c);
        sb2.append(lg.a.f131412e);
        sb2.append(bVar.f100082d);
        aVar.f100126a.put(strB, sb2.toString());
        aVar.f100126a.commit();
        LiteavLog.i("PlayInfoProtocolV4Storage", "put download key: " + strB + " value:" + sb2.toString());
    }

    static /* synthetic */ void a(a aVar, int i10, String str, String str2, com.tencent.liteav.txcvodplayer.b.c.b bVar) {
        String strB = b(i10, str);
        String strD = com.tencent.liteav.txcplayer.a.a.d(str2);
        String strA = TXCHLSEncoder.a(i10, "default", str, 0);
        String strA2 = TXCHLSEncoder.a(strA, bVar.f100079a);
        String strA3 = TXCHLSEncoder.a(strA, bVar.f100080b);
        StringBuilder sb2 = new StringBuilder(strA2);
        sb2.append(lg.a.f131412e);
        sb2.append(strA3);
        sb2.append(lg.a.f131412e);
        sb2.append(strD);
        sb2.append(lg.a.f131412e);
        sb2.append(System.currentTimeMillis() / 3600000);
        sb2.append(lg.a.f131412e);
        sb2.append(bVar.f100081c);
        sb2.append(lg.a.f131412e);
        sb2.append(bVar.f100082d);
        aVar.f100129e.put(strB, sb2.toString());
        aVar.f100129e.commit();
        LiteavLog.i("PlayInfoProtocolV4Storage", "put cache key: " + strB + " value:" + sb2.toString());
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00f7  */
    /* JADX WARN: Instruction removed from duplicated block: B:38:0x00f7, please report this as an issue */
    static /* synthetic */ void a(a aVar, String str, long j10) {
        if (!str.endsWith("/")) {
            str = str + "/";
        }
        for (String str2 : aVar.f100129e.getAllKeys()) {
            String string = aVar.f100129e.getString(str2);
            if (string != null) {
                String[] strArrSplit = string.split(lg.a.f131412e);
                if (strArrSplit.length >= 4) {
                    try {
                        long j11 = j10 - Long.parseLong(strArrSplit[3]);
                        if (str2.startsWith("666_")) {
                            if (j11 >= 24) {
                                if (new File(str + "tp_dp_file/" + strArrSplit[2]).exists()) {
                                    continue;
                                } else {
                                    synchronized (aVar.f100127b) {
                                        if (!aVar.f100128c.contains(strArrSplit[2])) {
                                            aVar.f100129e.clear(str2);
                                            aVar.f100129e.commit();
                                            LiteavLog.i("PlayInfoProtocolV4Storage", "clean key: " + str2 + " value: " + string);
                                        }
                                    }
                                }
                            } else {
                                continue;
                            }
                        } else if (j11 >= 24) {
                            if (j11 < 72) {
                                if (!new File(str + strArrSplit[2]).exists()) {
                                    if (!new File(str + "." + strArrSplit[2] + ".m3u8").exists()) {
                                        aVar.f100129e.clear(str2);
                                        aVar.f100129e.commit();
                                        LiteavLog.i("PlayInfoProtocolV4Storage", "clean key: " + str2 + " value: " + string);
                                    }
                                }
                            } else {
                                aVar.f100129e.clear(str2);
                                aVar.f100129e.commit();
                                LiteavLog.i("PlayInfoProtocolV4Storage", "clean key: " + str2 + " value: " + string);
                            }
                        }
                    } catch (Exception unused) {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        aVar.f100129e.put("clean_time", aVar.f100130f);
        aVar.f100129e.commit();
    }

    public static String b(int i10, String str) {
        return i10 + lg.a.f131412e + str;
    }

    public final com.tencent.liteav.txcvodplayer.b.c.b a(int i10, String str) {
        boolean z10;
        String[] strArrSplit;
        com.tencent.liteav.txcvodplayer.b.c.b bVar = null;
        if (TextUtils.isEmpty(str)) {
            LiteavLog.w("PlayInfoProtocolV4Storage", "get fileId is empty");
            return null;
        }
        String strB = b(i10, str);
        String string = this.f100126a.getString(strB);
        if (TextUtils.isEmpty(string)) {
            string = this.f100129e.getString(strB);
            z10 = false;
        } else {
            z10 = true;
        }
        if (!TextUtils.isEmpty(string) && (strArrSplit = string.split(lg.a.f131412e)) != null && strArrSplit.length >= 2) {
            bVar = new com.tencent.liteav.txcvodplayer.b.c.b();
            String strA = TXCHLSEncoder.a(i10, "default", str, 0);
            bVar.f100079a = TXCHLSEncoder.b(strA, strArrSplit[0]);
            bVar.f100080b = TXCHLSEncoder.b(strA, strArrSplit[1]);
            if (z10) {
                if (strArrSplit.length >= 4) {
                    bVar.f100081c = strArrSplit[2];
                    bVar.f100082d = strArrSplit[3];
                }
            } else if (strArrSplit.length >= 6) {
                bVar.f100081c = strArrSplit[4];
                bVar.f100082d = strArrSplit[5];
            }
            LiteavLog.i("PlayInfoProtocolV4Storage", "get key: " + bVar.f100079a + " iv: " + bVar.f100080b);
        }
        return bVar;
    }

    public final void a(int i10, String str, com.tencent.liteav.txcvodplayer.b.c.b bVar) {
        if (TextUtils.isEmpty(str) || bVar == null || TextUtils.isEmpty(bVar.f100079a) || TextUtils.isEmpty(bVar.f100080b) || TextUtils.isEmpty(bVar.f100081c) || TextUtils.isEmpty(bVar.f100082d)) {
            LiteavLog.w("PlayInfoProtocolV4Storage", "put params empty fileId: ".concat(String.valueOf(str)));
        } else {
            com.tencent.liteav.txcplayer.common.a.a().execute(c.a(this, i10, str, bVar));
        }
    }

    public final void a(int i10, String str, com.tencent.liteav.txcvodplayer.b.c.b bVar, String str2) {
        if (!TextUtils.isEmpty(str) && bVar != null && !TextUtils.isEmpty(bVar.f100079a) && !TextUtils.isEmpty(bVar.f100080b) && !TextUtils.isEmpty(bVar.f100081c) && !TextUtils.isEmpty(bVar.f100082d) && !TextUtils.isEmpty(str2)) {
            com.tencent.liteav.txcplayer.common.a.a().execute(b.a(this, i10, str, str2, bVar));
            return;
        }
        LiteavLog.w("PlayInfoProtocolV4Storage", "put params empty fileId: " + str + " url:" + str2);
    }

    public final void a(String str) {
        if (str == null) {
            str = "";
        }
        if (str.equals(c())) {
            return;
        }
        this.f100131g.put("vld_host", str);
        this.f100131g.commit();
        LiteavLog.i("PlayInfoProtocolV4Storage", "save host: ".concat(str));
    }

    public final void b() {
        String strA = com.tencent.liteav.txcplayer.common.b.a();
        if (TextUtils.isEmpty(strA)) {
            LiteavLog.i("PlayInfoProtocolV4Storage", "clean cacheDir is empty");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / 3600000;
        if (this.f100130f <= 0 || jCurrentTimeMillis - this.f100130f >= 24) {
            this.f100130f = jCurrentTimeMillis;
            com.tencent.liteav.txcplayer.common.a.a().execute(d.a(this, strA, jCurrentTimeMillis));
        } else {
            LiteavLog.i("PlayInfoProtocolV4Storage", "clean mLastCacheCleanTime: " + this.f100130f + " not more than 24h");
        }
    }

    public final String c() {
        String string = this.f100131g.getString("vld_host");
        return string == null ? "" : string;
    }
}
