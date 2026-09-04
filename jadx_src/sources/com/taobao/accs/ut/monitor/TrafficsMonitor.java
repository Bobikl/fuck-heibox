package com.taobao.accs.ut.monitor;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.Dimension;
import anet.channel.statist.Measure;
import anet.channel.statist.Monitor;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UtilityImpl;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.android.agoo.common.AgooConstants;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class TrafficsMonitor {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f98446d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, List<a>> f98443a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f98444b = new HashMap<String, String>() { // from class: com.taobao.accs.ut.monitor.TrafficsMonitor.1
        {
            put("im", "512");
            put("motu", "513");
            put("acds", "514");
            put(GlobalClientInfo.AGOO_SERVICE_ID, "515");
            put(AgooConstants.AGOO_SERVICE_AGOOACK, "515");
            put("agooTokenReport", "515");
            put("accsSelf", Constants.DEFAULT_UIN);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f98445c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f98447e = "";

    /* JADX INFO: compiled from: Taobao */
    @Monitor(module = "NetworkSDK", monitorPoint = "TrafficStats")
    public static class StatTrafficMonitor extends BaseMonitor {

        @Dimension
        public String bizId;

        @Dimension
        public String date;

        @Dimension
        public String host;

        @Dimension
        public boolean isBackground;

        @Dimension
        public String serviceId;

        @Measure
        public long size;
    }

    /* JADX INFO: compiled from: Taobao */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f98449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f98450b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f98451c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f98452d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f98453e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f98454f;

        public a(String str, String str2, String str3, boolean z10, String str4, long j10) {
            this.f98449a = str;
            this.f98450b = str2;
            this.f98451c = str3;
            this.f98452d = z10;
            this.f98453e = str4;
            this.f98454f = j10;
        }

        public a(String str, boolean z10, String str2, long j10) {
            this.f98451c = str;
            this.f98452d = z10;
            this.f98453e = str2;
            this.f98454f = j10;
        }

        public String toString() {
            return "date:" + this.f98449a + " bizId:" + this.f98450b + " serviceId:" + this.f98451c + " host:" + this.f98453e + " isBackground:" + this.f98452d + " size:" + this.f98454f;
        }
    }

    public TrafficsMonitor(Context context) {
        this.f98446d = context;
    }

    private void b() {
        String str;
        boolean z10;
        synchronized (this.f98443a) {
            String strA = UtilityImpl.a(System.currentTimeMillis());
            if (TextUtils.isEmpty(this.f98447e) || this.f98447e.equals(strA)) {
                str = strA;
                z10 = false;
            } else {
                str = this.f98447e;
                z10 = true;
            }
            Iterator<String> it = this.f98443a.keySet().iterator();
            while (it.hasNext()) {
                for (a aVar : this.f98443a.get(it.next())) {
                    if (aVar != null) {
                        com.taobao.accs.b.a aVarA = com.taobao.accs.b.a.a(this.f98446d);
                        String str2 = aVar.f98453e;
                        String str3 = aVar.f98451c;
                        aVarA.a(str2, str3, this.f98444b.get(str3), aVar.f98452d, aVar.f98454f, str);
                    }
                }
            }
            ALog.Level level = ALog.Level.D;
            if (ALog.isPrintLog(level)) {
                ALog.d("TrafficsMonitor", "savetoDay:" + str + " saveTraffics" + this.f98443a.toString(), new Object[0]);
            }
            if (z10) {
                this.f98443a.clear();
                c();
            } else if (ALog.isPrintLog(level)) {
                ALog.d("TrafficsMonitor", "no need commit lastsaveDay:" + this.f98447e + " currday:" + strA, new Object[0]);
            }
            this.f98447e = strA;
            this.f98445c = 0;
        }
    }

    private void c() {
        List<a> listA = com.taobao.accs.b.a.a(this.f98446d).a(false);
        if (listA == null) {
            return;
        }
        try {
            for (a aVar : listA) {
                if (aVar != null) {
                    StatTrafficMonitor statTrafficMonitor = new StatTrafficMonitor();
                    statTrafficMonitor.bizId = aVar.f98450b;
                    statTrafficMonitor.date = aVar.f98449a;
                    statTrafficMonitor.host = aVar.f98453e;
                    statTrafficMonitor.isBackground = aVar.f98452d;
                    statTrafficMonitor.size = aVar.f98454f;
                    AppMonitor.getInstance().commitStat(statTrafficMonitor);
                }
            }
            com.taobao.accs.b.a.a(this.f98446d).a();
        } catch (Throwable th2) {
            ALog.e("", th2.toString(), new Object[0]);
            th2.printStackTrace();
        }
    }

    public void a() {
        try {
            synchronized (this.f98443a) {
                this.f98443a.clear();
            }
            List<a> listA = com.taobao.accs.b.a.a(this.f98446d).a(true);
            if (listA == null) {
                return;
            }
            Iterator<a> it = listA.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
        } catch (Exception e10) {
            ALog.w("TrafficsMonitor", e10.toString(), new Object[0]);
        }
    }

    public void a(a aVar) {
        boolean z10;
        String str;
        if (aVar == null || aVar.f98453e == null || aVar.f98454f <= 0) {
            return;
        }
        aVar.f98451c = TextUtils.isEmpty(aVar.f98451c) ? "accsSelf" : aVar.f98451c;
        synchronized (this.f98443a) {
            String str2 = this.f98444b.get(aVar.f98451c);
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            aVar.f98450b = str2;
            ALog.isPrintLog(ALog.Level.D);
            List<a> arrayList = this.f98443a.get(str2);
            if (arrayList != null) {
                Iterator<a> it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = true;
                        break;
                    }
                    a next = it.next();
                    if (next.f98452d == aVar.f98452d && (str = next.f98453e) != null && str.equals(aVar.f98453e)) {
                        next.f98454f += aVar.f98454f;
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    arrayList.add(aVar);
                }
            } else {
                arrayList = new ArrayList<>();
                arrayList.add(aVar);
            }
            this.f98443a.put(str2, arrayList);
            int i10 = this.f98445c + 1;
            this.f98445c = i10;
            if (i10 >= 10) {
                b();
            }
        }
    }
}
