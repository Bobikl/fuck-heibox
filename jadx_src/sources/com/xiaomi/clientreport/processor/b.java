package com.xiaomi.clientreport.processor;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.clientreport.data.PerfClientReport;
import com.xiaomi.push.cb;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class b implements IPerfProcessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f106728a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private HashMap<String, HashMap<String, com.xiaomi.clientreport.data.a>> f100a;

    public b(Context context) {
        this.f106728a = context;
    }

    public static String a(com.xiaomi.clientreport.data.a aVar) {
        return String.valueOf(aVar.production) + "#" + aVar.clientInterfaceId;
    }

    private String b(com.xiaomi.clientreport.data.a aVar) {
        String str;
        int i10 = aVar.production;
        String str2 = aVar.clientInterfaceId;
        if (i10 <= 0 || TextUtils.isEmpty(str2)) {
            str = "";
        } else {
            str = String.valueOf(i10) + "#" + str2;
        }
        File externalFilesDir = this.f106728a.getExternalFilesDir("perf");
        if (externalFilesDir == null) {
            com.xiaomi.channel.commonutils.logger.b.d("cannot get folder when to write perf");
            return null;
        }
        if (!externalFilesDir.exists()) {
            externalFilesDir.mkdirs();
        }
        return new File(externalFilesDir, str).getAbsolutePath();
    }

    private String c(com.xiaomi.clientreport.data.a aVar) {
        String strB = b(aVar);
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        for (int i10 = 0; i10 < 20; i10++) {
            String str = strB + i10;
            if (cb.m218a(this.f106728a, str)) {
                return str;
            }
        }
        return null;
    }

    @Override // com.xiaomi.clientreport.processor.c
    public void a() throws Throwable {
        cb.a(this.f106728a, "perf", "perfUploading");
        File[] fileArrM219a = cb.m219a(this.f106728a, "perfUploading");
        if (fileArrM219a == null || fileArrM219a.length <= 0) {
            return;
        }
        for (File file : fileArrM219a) {
            if (file != null) {
                List<String> listA = e.a(this.f106728a, file.getAbsolutePath());
                file.delete();
                a(listA);
            }
        }
    }

    @Override // com.xiaomi.clientreport.processor.d
    /* JADX INFO: renamed from: a */
    public void mo75a(com.xiaomi.clientreport.data.a aVar) {
        if ((aVar instanceof PerfClientReport) && this.f100a != null) {
            PerfClientReport perfClientReport = (PerfClientReport) aVar;
            String strA = a((com.xiaomi.clientreport.data.a) perfClientReport);
            String strA2 = e.a(perfClientReport);
            HashMap<String, com.xiaomi.clientreport.data.a> map = this.f100a.get(strA);
            if (map == null) {
                map = new HashMap<>();
            }
            PerfClientReport perfClientReport2 = (PerfClientReport) map.get(strA2);
            if (perfClientReport2 != null) {
                perfClientReport.perfCounts += perfClientReport2.perfCounts;
                perfClientReport.perfLatencies += perfClientReport2.perfLatencies;
            }
            map.put(strA2, perfClientReport);
            this.f100a.put(strA, map);
        }
    }

    public void a(List<String> list) {
        cb.a(this.f106728a, list);
    }

    public void a(com.xiaomi.clientreport.data.a[] aVarArr) {
        String strC = c(aVarArr[0]);
        if (TextUtils.isEmpty(strC)) {
            return;
        }
        e.a(strC, aVarArr);
    }

    @Override // com.xiaomi.clientreport.processor.d
    public void b() {
        HashMap<String, HashMap<String, com.xiaomi.clientreport.data.a>> map = this.f100a;
        if (map == null) {
            return;
        }
        if (map.size() > 0) {
            Iterator<String> it = this.f100a.keySet().iterator();
            while (it.hasNext()) {
                HashMap<String, com.xiaomi.clientreport.data.a> map2 = this.f100a.get(it.next());
                if (map2 != null && map2.size() > 0) {
                    com.xiaomi.clientreport.data.a[] aVarArr = new com.xiaomi.clientreport.data.a[map2.size()];
                    map2.values().toArray(aVarArr);
                    a(aVarArr);
                }
            }
        }
        this.f100a.clear();
    }

    @Override // com.xiaomi.clientreport.processor.IPerfProcessor
    public void setPerfMap(HashMap<String, HashMap<String, com.xiaomi.clientreport.data.a>> map) {
        this.f100a = map;
    }
}
