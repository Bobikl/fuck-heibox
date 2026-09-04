package com.huawei.hms.scankit.p;

import android.os.Bundle;
import android.util.SparseArray;
import com.huawei.hms.feature.DynamicModuleInitializer;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.huawei.hms.hmsscankit.DetailRect;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.utils.FileUtil;
import com.xiaomi.mipush.sdk.Constants;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: HaLog60001.java */
/* JADX INFO: loaded from: classes7.dex */
public final class w3 extends u3 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile String f62478h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile String f62479i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f62480j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile long f62481k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d f62482l;

    /* JADX INFO: compiled from: HaLog60001.java */
    public class a extends SimpleDateFormat {
        a(String str) {
            super(str);
            setTimeZone(TimeZone.getTimeZone("UTC"));
        }
    }

    /* JADX INFO: compiled from: HaLog60001.java */
    public class b extends SimpleDateFormat {
        b(String str) {
            super(str);
            setTimeZone(TimeZone.getTimeZone("UTC"));
        }
    }

    /* JADX INFO: compiled from: HaLog60001.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f62485a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f62486b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f62487c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f62488d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f62489e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f62490f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f62491g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f62492h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f62493i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f62494j;

        private c(long j10, String str, String str2, boolean z10, int i10, int i11) {
            this.f62488d = j10;
            this.f62486b = str;
            this.f62487c = str2;
            this.f62492h = z10;
            this.f62493i = i10;
            this.f62485a = i11;
        }

        /* synthetic */ c(long j10, String str, String str2, boolean z10, int i10, int i11, a aVar) {
            this(j10, str, str2, z10, i10, i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public c a(long j10) {
            this.f62489e = j10;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public c a(String str) {
            this.f62490f = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public c a(boolean z10) {
            this.f62494j = z10;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public c b(String str) {
            this.f62491g = str;
            return this;
        }

        public c a(int i10) {
            this.f62485a = i10;
            return this;
        }
    }

    /* JADX INFO: compiled from: HaLog60001.java */
    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f62495a = d.class.getSimpleName();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Timer f62496b = new Timer();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile boolean f62497c = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List<c> f62498d = new ArrayList(10);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List<c> f62499e = new ArrayList(10);

        /* JADX INFO: compiled from: HaLog60001.java */
        public class a extends TimerTask {
            a() {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                try {
                    d.this.f62497c = true;
                    d.this.a();
                } catch (Exception unused) {
                    o4.b(d.this.f62495a, "onLog Exception");
                }
            }
        }

        /* JADX INFO: compiled from: HaLog60001.java */
        public class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private StringBuilder f62502a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private AtomicInteger[] f62503b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private String[] f62504c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private long[] f62505d;

            private b() {
                this.f62502a = new StringBuilder(100);
                this.f62503b = new AtomicInteger[]{new AtomicInteger(), new AtomicInteger(), new AtomicInteger(), new AtomicInteger(), new AtomicInteger(), new AtomicInteger(), new AtomicInteger()};
                this.f62504c = new String[]{"lt10K:", "lt100K:", "lt1M:", "lt3M:", "lt10M:", "lt40M:", "gt40M:"};
                this.f62505d = new long[]{FileUtil.LOCAL_REPORT_FILE_MAX_SIZE, 102400, 1048576, 3145728, 10485760, 41943040, Long.MAX_VALUE};
            }

            /* synthetic */ b(d dVar, a aVar) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public String a() {
                StringBuilder sb2 = this.f62502a;
                sb2.delete(0, sb2.length());
                this.f62502a.append("{");
                for (int i10 = 0; i10 < this.f62503b.length; i10++) {
                    this.f62502a.append(this.f62504c[i10]);
                    this.f62502a.append(this.f62503b[i10]);
                    this.f62502a.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                StringBuilder sb3 = this.f62502a;
                sb3.replace(sb3.length() - 1, this.f62502a.length(), z5.g.f141884d);
                return this.f62502a.toString();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void a(int i10) {
                int i11 = 0;
                while (true) {
                    AtomicInteger[] atomicIntegerArr = this.f62503b;
                    if (i11 >= atomicIntegerArr.length) {
                        return;
                    }
                    if (i10 <= this.f62505d[i11]) {
                        atomicIntegerArr[i11].addAndGet(1);
                        return;
                    }
                    i11++;
                }
            }
        }

        /* JADX INFO: compiled from: HaLog60001.java */
        public class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private StringBuilder f62507a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private SparseArray<AtomicInteger> f62508b;

            /* JADX INFO: compiled from: HaLog60001.java */
            public class a extends SparseArray<AtomicInteger> {
                a() {
                    put(0, new AtomicInteger());
                }
            }

            /* JADX INFO: compiled from: HaLog60001.java */
            public class b extends AtomicInteger {
                b() {
                    addAndGet(1);
                }
            }

            private c() {
                this.f62507a = new StringBuilder(60);
                this.f62508b = new a();
            }

            /* synthetic */ c(d dVar, a aVar) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public String a() {
                StringBuilder sb2 = this.f62507a;
                sb2.delete(0, sb2.length());
                this.f62507a.append("{");
                for (int i10 = 0; i10 < this.f62508b.size(); i10++) {
                    this.f62507a.append(this.f62508b.keyAt(i10));
                    this.f62507a.append(":");
                    this.f62507a.append(this.f62508b.valueAt(i10));
                    this.f62507a.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                StringBuilder sb3 = this.f62507a;
                sb3.replace(sb3.length() - 1, this.f62507a.length(), z5.g.f141884d);
                return this.f62507a.toString();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void a(int i10) {
                if (this.f62508b.get(i10) == null) {
                    this.f62508b.put(i10, new b());
                } else {
                    this.f62508b.get(i10).addAndGet(1);
                }
            }
        }

        public d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            if (this.f62498d.size() > 0) {
                synchronized (this) {
                    List<c> list = this.f62498d;
                    List<c> list2 = this.f62499e;
                    this.f62498d = list2;
                    this.f62499e = list;
                    list2.clear();
                }
                a(this.f62499e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(c cVar) {
            if (this.f62498d.size() > 100) {
                return;
            }
            synchronized (this) {
                this.f62498d.add(cVar);
                if (this.f62497c) {
                    this.f62497c = false;
                    this.f62496b.schedule(new a(), 1000L);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void a(List<c> list) {
            HashSet<String> hashSet = new HashSet();
            Iterator<c> it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().f62487c);
            }
            for (String str : hashSet) {
                Boolean bool = null;
                c cVar = new c(this, 0 == true ? 1 : 0);
                b bVar = new b(this, 0 == true ? 1 : 0);
                long j10 = Long.MAX_VALUE;
                long j11 = Long.MIN_VALUE;
                String str2 = "";
                String str3 = "";
                String str4 = str3;
                long j12 = 0;
                long j13 = 0;
                long j14 = 0;
                long j15 = 0;
                for (c cVar2 : list) {
                    str2 = cVar2.f62486b;
                    str3 = cVar2.f62490f;
                    str4 = cVar2.f62491g;
                    Boolean boolValueOf = Boolean.valueOf(cVar2.f62492h);
                    j13 += cVar2.f62489e - cVar2.f62488d;
                    cVar.a(cVar2.f62485a);
                    bVar.a(cVar2.f62493i);
                    j12++;
                    if (cVar2.f62494j) {
                        j15++;
                    }
                    if (cVar2.f62485a != 0) {
                        j14++;
                    }
                    if (cVar2.f62489e - cVar2.f62488d < j10) {
                        j10 = cVar2.f62489e - cVar2.f62488d;
                    }
                    if (cVar2.f62489e - cVar2.f62488d > j11) {
                        j11 = cVar2.f62489e - cVar2.f62488d;
                    }
                    bool = boolValueOf;
                }
                LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
                w3.this.g();
                linkedHashMap.putAll(w3.this.f62406b);
                linkedHashMap.put("result", cVar.a());
                linkedHashMap.put("imgSizeHistogram", bVar.a());
                linkedHashMap.put("callTime", str2);
                linkedHashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_TRANSID, str);
                if (j12 != 0) {
                    j13 /= j12;
                }
                linkedHashMap.put(WiseOpenHianalyticsData.UNION_COSTTIME, String.valueOf(j13));
                linkedHashMap.put("allCnt", String.valueOf(j12));
                linkedHashMap.put("failCnt", String.valueOf(j14));
                linkedHashMap.put("codeCnt", String.valueOf(j15));
                linkedHashMap.put("scanType", str3);
                linkedHashMap.put("sceneType", str4);
                linkedHashMap.put(org.apache.tools.ant.types.selectors.o.f136588l, String.valueOf(j10));
                linkedHashMap.put(org.apache.tools.ant.types.selectors.o.f136589m, String.valueOf(j11));
                linkedHashMap.put("algPhotoMode", String.valueOf(bool));
                a4.b().b("60001", linkedHashMap);
            }
        }

        public void b() {
            Timer timer = this.f62496b;
            if (timer != null) {
                timer.cancel();
            }
        }
    }

    public w3(Bundle bundle, String str) {
        super(bundle, DynamicModuleInitializer.getContext().getApplicationContext());
        this.f62480j = false;
        this.f62482l = new d();
        this.f62406b.put("apiName", str);
        if (DetailRect.PHOTO_MODE.equals(str)) {
            this.f62480j = true;
        }
    }

    public c a(boolean z10, int i10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            if (this.f62480j) {
                return new c(jCurrentTimeMillis, new a("yyyyMMddHHmmss.SSS").format(Long.valueOf(jCurrentTimeMillis)), UUID.randomUUID().toString(), z10, i10, 0, null);
            }
            if (jCurrentTimeMillis - this.f62481k > 1500) {
                String str = new b("yyyyMMddHHmmss.SSS").format(Long.valueOf(jCurrentTimeMillis));
                String string = UUID.randomUUID().toString();
                if (jCurrentTimeMillis - this.f62481k > 1500) {
                    this.f62478h = str;
                    this.f62479i = string;
                    this.f62481k = jCurrentTimeMillis;
                }
            }
            return new c(jCurrentTimeMillis, this.f62478h, this.f62479i, z10, i10, 0, null);
        } catch (Exception unused) {
            o4.b("HaLog6001", "exception happens");
            return new c(jCurrentTimeMillis, this.f62478h, this.f62479i, z10, i10, 0, null);
        }
    }

    public void a(String str) {
        this.f62406b.put("algapi", str);
    }

    public void a(HmsScan[] hmsScanArr, c cVar) {
        try {
            String str = u3.f62401d;
            String strB = u3.f62402e;
            if (a()) {
                boolean z10 = false;
                int i10 = 0;
                z10 = false;
                if (hmsScanArr != null && hmsScanArr.length > 0) {
                    int length = hmsScanArr.length;
                    while (i10 < length) {
                        HmsScan hmsScan = hmsScanArr[i10];
                        String strA = u3.a(hmsScan.scanType);
                        i10++;
                        strB = u3.b(hmsScan.scanTypeForm);
                        str = strA;
                    }
                    z10 = true;
                }
                this.f62482l.a(cVar.a(System.currentTimeMillis()).a(z10).a(str).b(strB));
                this.f62481k = cVar.f62489e;
            }
        } catch (NullPointerException unused) {
            o4.b("HaLog60001", "nullPoint");
        } catch (Exception unused2) {
            o4.b("HaLog60001", "logEnd Exception");
        }
    }
}
