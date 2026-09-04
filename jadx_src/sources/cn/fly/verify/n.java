package cn.fly.verify;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import cn.fly.verify.common.callback.OperationCallback;
import cn.fly.verify.common.exception.VerifyErr;
import cn.fly.verify.common.exception.VerifyException;
import cn.fly.verify.pure.entity.PreVerifyResult;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f36886a;

    public static SparseArray<l> a(long j10, long j11, e eVar) {
        SparseArray<l> sparseArrayA = a(j10, true);
        if (sparseArrayA != null) {
            f.a().b("[FlyVerify] ==>%s", "get first config");
            if (eVar != null) {
                eVar.a((String) null, (String) null, "use_sync_cdn", "1");
            }
            return sparseArrayA;
        }
        a(false);
        f.a().b("[FlyVerify] ==>%s", "retry config");
        SparseArray<l> sparseArrayA2 = a(j11, false);
        if (sparseArrayA2 != null && eVar != null) {
            eVar.a((String) null, (String) null, "use_sync_cdn", l.b() ? "2" : "3");
        }
        return sparseArrayA2;
    }

    private static SparseArray<l> a(long j10, boolean z10) {
        int i10 = (int) (j10 / 50);
        int i11 = 0;
        while (l.a() == null && (!z10 || f36886a)) {
            try {
                Thread.sleep(50L);
            } catch (InterruptedException unused) {
            }
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return l.a();
    }

    private static Integer a(HashMap map, String str) {
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        try {
            return (Integer) map.get(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:96:0x02af  */
    private static void a(HashMap map) {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        Object obj = map.get("cacheType");
        int iIntValue = obj != null ? ((Integer) obj).intValue() : -1;
        f.a().b("[FlyVerify] ==>%s", "cacheType = " + obj);
        aq.c(iIntValue);
        Object obj2 = map.get("cdnKey");
        String strI = obj2 != null ? (String) obj2 : ai.a().i();
        ai.a().c(strI);
        aq.c(strI);
        Object obj3 = map.get("useWocucc");
        boolean zBooleanValue = obj3 != null ? ((Boolean) obj3).booleanValue() : false;
        f.a().b("[FlyVerify] ==>%s", "usewo = " + zBooleanValue);
        aq.b(zBooleanValue);
        HashMap map2 = (HashMap) map.get("clientConfig");
        if (map2 == null || map2.isEmpty()) {
            return;
        }
        Object obj4 = map2.get("oppoNet");
        int iIntValue2 = obj4 != null ? ((Integer) obj4).intValue() : 0;
        ai.a().c(iIntValue2);
        aq.b(iIntValue2);
        Object obj5 = map2.get("autoPre");
        boolean zBooleanValue2 = obj5 != null ? ((Boolean) obj5).booleanValue() : false;
        f.a().b("[FlyVerify] ==>%s", "autoPre = " + zBooleanValue2);
        ai.a().a(zBooleanValue2);
        aq.c(zBooleanValue2);
        ArrayList arrayList = (ArrayList) map2.get("notUpload");
        if (arrayList != null && !arrayList.isEmpty()) {
            ai.a().a(arrayList);
            aq.a((ArrayList<String>) arrayList);
        }
        if (map2.containsKey("unknownTry")) {
            try {
                int iIntValue3 = ((Integer) map2.get("unknownTry")).intValue();
                ai.a().a(Boolean.valueOf(iIntValue3 == 1));
                aq.a(iIntValue3 == 1);
            } catch (Throwable unused) {
            }
        }
        if (map2.containsKey("autoRefresh")) {
            try {
                int iIntValue4 = ((Integer) map2.get("autoRefresh")).intValue();
                ai.a().d(iIntValue4);
                aq.d(iIntValue4);
            } catch (Throwable unused2) {
            }
        }
        int iIntValue5 = map2.containsKey("logSwitch") ? ((Integer) map2.get("logSwitch")).intValue() : 1;
        ai.a().e(iIntValue5);
        aq.a(iIntValue5);
        if (map2.containsKey("cmSwitchData")) {
            int iIntValue6 = ((Integer) map2.get("cmSwitchData")).intValue();
            ai.a().f(iIntValue6);
            aq.e(iIntValue6);
        }
        if (map2.containsKey("cuSwitchData")) {
            int iIntValue7 = ((Integer) map2.get("cuSwitchData")).intValue();
            ai.a().g(iIntValue7);
            aq.f(iIntValue7);
        }
        if (map2.containsKey("subIdEnable")) {
            int iIntValue8 = ((Integer) map2.get("subIdEnable")).intValue();
            ai.a().h(iIntValue8);
            aq.g(iIntValue8);
        }
        if (map2.containsKey("subIdsEnable")) {
            int iIntValue9 = ((Integer) map2.get("subIdsEnable")).intValue();
            ai.a().i(iIntValue9);
            aq.h(iIntValue9);
        }
        if (map2.containsKey("slotsEnable")) {
            int iIntValue10 = ((Integer) map2.get("slotsEnable")).intValue();
            ai.a().j(iIntValue10);
            aq.i(iIntValue10);
        }
        if (map2.containsKey("factoryBlst")) {
            String str = (String) map2.get("factoryBlst");
            ai.a().d(str);
            aq.d(str);
        }
        if (map2.containsKey("isOperatorCode")) {
            int iIntValue11 = ((Integer) map2.get("isOperatorCode")).intValue();
            ai.a().k(iIntValue11);
            aq.j(iIntValue11);
        }
        if (map2.containsKey("switchTimeout")) {
            int iIntValue12 = ((Integer) map2.get("switchTimeout")).intValue();
            ai.a().l(iIntValue12);
            aq.k(iIntValue12);
        }
        if (map2.containsKey("ignoreSwitchError")) {
            int iIntValue13 = ((Integer) map2.get("ignoreSwitchError")).intValue();
            ai.a().m(iIntValue13);
            aq.l(iIntValue13);
        }
        if (map2.containsKey("defaultCmccLogin")) {
            try {
                HashMap map3 = (HashMap) map2.get("defaultCmccLogin");
                if (map3 != null) {
                    l lVar = new l(1, map3.containsKey("clientId") ? String.valueOf(map3.get("clientId")) : null, map3.containsKey("clientSecret") ? String.valueOf(map3.get("clientSecret")) : null, false);
                    lVar.a(a(map3, "channel"));
                    lVar.a(b(map3, "channelAccount"));
                    sparseArray2 = new SparseArray();
                    try {
                        sparseArray2.append(1, lVar);
                    } catch (Throwable th2) {
                        sparseArray = sparseArray2;
                        th = th2;
                        f.a().a(th);
                        sparseArray2 = sparseArray;
                    }
                } else {
                    sparseArray2 = null;
                }
            } catch (Throwable th3) {
                th = th3;
                sparseArray = null;
            }
        } else {
            sparseArray2 = null;
        }
        if (map2.containsKey("defaultCuccLogin")) {
            try {
                HashMap map4 = (HashMap) map2.get("defaultCuccLogin");
                l lVar2 = new l(2, map4.containsKey("clientId") ? String.valueOf(map4.get("clientId")) : null, map4.containsKey("clientSecret") ? String.valueOf(map4.get("clientSecret")) : null, false);
                lVar2.a(a(map4, "channel"));
                lVar2.a(b(map4, "channelAccount"));
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                }
                sparseArray2.append(2, lVar2);
            } catch (Throwable th4) {
                f.a().a(th4);
            }
        }
    }

    public static void a(final boolean z10) {
        if (z10) {
            f36886a = true;
        }
        new ar() { // from class: cn.fly.verify.n.1
            @Override // cn.fly.verify.ar
            public void a() {
                if (ax.h()) {
                    Log.e("[FlyVerify] ==>%s", "privacy is forb");
                    boolean unused = n.f36886a = false;
                } else if (fz.d.b()) {
                    final e eVar = new e(g.INIT);
                    al.a(new ar() { // from class: cn.fly.verify.n.1.1
                        @Override // cn.fly.verify.ar
                        public void a() {
                            boolean z11;
                            try {
                                HashMap mapB = null;
                                eVar.a((String) null, (String) null, com.google.android.exoplayer2.text.ttml.d.f49798o0);
                                long jUptimeMillis = SystemClock.uptimeMillis();
                                try {
                                    f.a().b("[FlyVerify] ==>%s", "cdn start");
                                    String strJ = al.j();
                                    if ((TextUtils.isEmpty(strJ) || "none".equalsIgnoreCase(strJ)) && !TextUtils.isEmpty(al.m())) {
                                        eVar.a((String) null, (String) null, "dh_network_error");
                                    }
                                    if (!as.c()) {
                                        VerifyException verifyException = new VerifyException(VerifyErr.C_Init_No_Net);
                                        f.a().c("[FlyVerify] ==>%s", "init failure " + verifyException);
                                        eVar.a(new VerifyException(VerifyErr.C_INIT_UNEXPECTED_ERROR), verifyException);
                                        boolean unused2 = n.f36886a = false;
                                        return;
                                    }
                                    mapB = C1293r.a().a(eVar);
                                    c cVarB = eVar.b(lg.a.f131415h);
                                    cVarB.c(true);
                                    cVarB.c(String.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
                                    cVarB.a(200);
                                    eVar.a(cVarB);
                                    z11 = true;
                                    if (mapB != null) {
                                        n.b(mapB, z10);
                                        f.a().b("[FlyVerify] ==>%s", "cdn or init complete");
                                        if (z10) {
                                            ap.a();
                                            if (ai.a().j()) {
                                                p.a().a(new OperationCallback<PreVerifyResult>() { // from class: cn.fly.verify.n.1.1.1
                                                    @Override // cn.fly.verify.common.callback.OperationCallback
                                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                                    public void onComplete(PreVerifyResult preVerifyResult) {
                                                    }

                                                    @Override // cn.fly.verify.common.callback.OperationCallback
                                                    public void onFailure(VerifyException verifyException2) {
                                                    }
                                                }, true, true);
                                            }
                                        }
                                    }
                                    if (z11) {
                                        eVar.c();
                                    }
                                } catch (VerifyException e10) {
                                    f.a().c("[FlyVerify] ==>%s", "cdn failure " + e10);
                                    c cVarB2 = eVar.b("cdn_failure");
                                    cVarB2.c(String.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
                                    cVarB2.b(e10.getCode());
                                    cVarB2.d(e10.getMessage());
                                    eVar.a(cVarB2);
                                    long jUptimeMillis2 = SystemClock.uptimeMillis();
                                    try {
                                        mapB = C1293r.a().b();
                                        eVar.a(String.valueOf(SystemClock.uptimeMillis() - jUptimeMillis2));
                                    } catch (VerifyException e11) {
                                        f.a().c("[FlyVerify] ==>%s", "init failure " + e10);
                                        eVar.a(new VerifyException(VerifyErr.C_INIT_UNEXPECTED_ERROR.getCode(), String.valueOf(SystemClock.uptimeMillis() - jUptimeMillis2)), e11);
                                    }
                                    z11 = false;
                                }
                            } catch (Throwable th2) {
                                try {
                                    String strA = as.a(th2);
                                    e eVar2 = eVar;
                                    VerifyErr verifyErr = VerifyErr.C_INIT_UNEXPECTED_ERROR;
                                    eVar2.a(new VerifyException(verifyErr), new VerifyException(verifyErr.getCode(), strA));
                                } finally {
                                    boolean unused3 = n.f36886a = false;
                                }
                            }
                        }
                    }, true, eVar);
                } else {
                    Log.e("[FlyVerify] ==>%s", "not main process");
                    boolean unused2 = n.f36886a = false;
                }
            }
        }.b();
    }

    private static String b(HashMap map, String str) {
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        try {
            return (String) map.get(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(HashMap map, boolean z10) {
        if (map == null) {
            return;
        }
        a(map);
        c(map, z10);
    }

    private static void c(HashMap map, boolean z10) {
        int iIntValue;
        int iIntValue2;
        HashMap map2;
        HashMap map3;
        SparseArray sparseArray = new SparseArray();
        int iIntValue3 = 0;
        try {
            HashMap map4 = (HashMap) map.get("loginSwitch");
            iIntValue = a(map4, "cucc").intValue();
            try {
                iIntValue2 = a(map4, "ctcc").intValue();
                try {
                    iIntValue3 = a(map4, "cmcc").intValue();
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                iIntValue2 = 0;
            }
        } catch (Throwable unused3) {
            iIntValue = 0;
            iIntValue2 = 0;
        }
        HashMap map5 = (HashMap) map.get("multiLogin");
        if (map5 != null && map5.containsKey("clientId") && map5.containsKey("clientSecret")) {
            String strB = b(map5, "clientId");
            String strB2 = b(map5, "clientSecret");
            Integer numA = a(map5, "channel");
            String strB3 = b(map5, "channelAccount");
            if (iIntValue == 1) {
                sparseArray.append(2, new l(2, strB, strB2, false, 1, numA, strB3));
                sparseArray.append(3, new l(3, strB, strB2, false, 1, numA, strB3));
            }
            if (iIntValue3 == 1) {
                sparseArray.append(1, new l(1, strB, strB2, false, 1, numA, strB3));
            }
            if (iIntValue2 == 1) {
                sparseArray.append(4, new l(4, strB, strB2, false, 1, numA, strB3));
            }
        }
        if (iIntValue == 0) {
            HashMap map6 = (HashMap) map.get("cuccLogin");
            if (map6 != null && map6.containsKey("clientId") && map6.containsKey("clientSecret")) {
                sparseArray.append(2, new l(2, b(map6, "clientId"), b(map6, "clientSecret"), false, 0, a(map6, "channel"), b(map6, "channelAccount")));
            }
            HashMap map7 = (HashMap) map.get("woCuccLogin");
            if (map7 != null && map7.containsKey("clientId") && map7.containsKey("clientSecret")) {
                sparseArray.append(3, new l(3, b(map7, "clientId"), b(map7, "clientSecret"), true, 0, a(map7, "channel"), b(map7, "channelAccount")));
            }
        }
        if (iIntValue2 == 0 && (map3 = (HashMap) map.get("ctccLogin")) != null && map3.containsKey("clientId") && map3.containsKey("clientSecret")) {
            sparseArray.append(4, new l(4, b(map3, "clientId"), b(map3, "clientSecret"), false, 0, a(map3, "channel"), b(map3, "channelAccount")));
        }
        if (iIntValue3 == 0 && (map2 = (HashMap) map.get("cmccLogin")) != null && map2.containsKey("clientId") && map2.containsKey("clientSecret")) {
            sparseArray.append(1, new l(1, b(map2, "clientId"), b(map2, "clientSecret"), false, 0, a(map2, "channel"), b(map2, "channelAccount")));
        }
        l.a(sparseArray, z10);
        m.a((SparseArray<l>) sparseArray);
    }
}
