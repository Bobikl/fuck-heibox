package com.google.android.exoplayer2.extractor.flv;

import androidx.annotation.p0;
import com.google.android.exoplayer2.extractor.j;
import com.google.android.exoplayer2.util.e0;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ScriptTagPayloadReader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class d extends TagPayloadReader {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f44961e = "onMetaData";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f44962f = "duration";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f44963g = "keyframes";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f44964h = "filepositions";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f44965i = "times";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f44966j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f44967k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f44968l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f44969m = 3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f44970n = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f44971o = 9;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f44972p = 10;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f44973q = 11;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f44974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long[] f44975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long[] f44976d;

    public d() {
        super(new j());
        this.f44974b = com.google.android.exoplayer2.j.f46377b;
        this.f44975c = new long[0];
        this.f44976d = new long[0];
    }

    private static Boolean h(e0 e0Var) {
        return Boolean.valueOf(e0Var.G() == 1);
    }

    @p0
    private static Object i(e0 e0Var, int i10) {
        if (i10 == 0) {
            return k(e0Var);
        }
        if (i10 == 1) {
            return h(e0Var);
        }
        if (i10 == 2) {
            return o(e0Var);
        }
        if (i10 == 3) {
            return m(e0Var);
        }
        if (i10 == 8) {
            return l(e0Var);
        }
        if (i10 == 10) {
            return n(e0Var);
        }
        if (i10 != 11) {
            return null;
        }
        return j(e0Var);
    }

    private static Date j(e0 e0Var) {
        Date date = new Date((long) k(e0Var).doubleValue());
        e0Var.T(2);
        return date;
    }

    private static Double k(e0 e0Var) {
        return Double.valueOf(Double.longBitsToDouble(e0Var.z()));
    }

    private static HashMap<String, Object> l(e0 e0Var) {
        int iK = e0Var.K();
        HashMap<String, Object> map = new HashMap<>(iK);
        for (int i10 = 0; i10 < iK; i10++) {
            String strO = o(e0Var);
            Object objI = i(e0Var, p(e0Var));
            if (objI != null) {
                map.put(strO, objI);
            }
        }
        return map;
    }

    private static HashMap<String, Object> m(e0 e0Var) {
        HashMap<String, Object> map = new HashMap<>();
        while (true) {
            String strO = o(e0Var);
            int iP = p(e0Var);
            if (iP == 9) {
                return map;
            }
            Object objI = i(e0Var, iP);
            if (objI != null) {
                map.put(strO, objI);
            }
        }
    }

    private static ArrayList<Object> n(e0 e0Var) {
        int iK = e0Var.K();
        ArrayList<Object> arrayList = new ArrayList<>(iK);
        for (int i10 = 0; i10 < iK; i10++) {
            Object objI = i(e0Var, p(e0Var));
            if (objI != null) {
                arrayList.add(objI);
            }
        }
        return arrayList;
    }

    private static String o(e0 e0Var) {
        int iM = e0Var.M();
        int iE = e0Var.e();
        e0Var.T(iM);
        return new String(e0Var.d(), iE, iM);
    }

    private static int p(e0 e0Var) {
        return e0Var.G();
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    protected boolean b(e0 e0Var) {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    protected boolean c(e0 e0Var, long j10) {
        if (p(e0Var) != 2 || !f44961e.equals(o(e0Var)) || p(e0Var) != 8) {
            return false;
        }
        HashMap<String, Object> mapL = l(e0Var);
        Object obj = mapL.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.f44974b = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapL.get(f44963g);
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get(f44964h);
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f44975c = new long[size];
                this.f44976d = new long[size];
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj5 = list.get(i10);
                    Object obj6 = list2.get(i10);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f44975c = new long[0];
                        this.f44976d = new long[0];
                        break;
                    }
                    this.f44975c[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f44976d[i10] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public void d() {
    }

    public long e() {
        return this.f44974b;
    }

    public long[] f() {
        return this.f44976d;
    }

    public long[] g() {
        return this.f44975c;
    }
}
