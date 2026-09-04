package com.alibaba.sdk.android.utils.crashdefend;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: CrashDefendManager.java */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static b f38043b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.alibaba.sdk.android.utils.a f38044a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private c f59a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private ExecutorService f61a;
    private Context context;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private com.alibaba.sdk.android.utils.crashdefend.a f58a = new com.alibaba.sdk.android.utils.crashdefend.a();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final List<c> f60a = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, String> f38045d = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final int[] f62a = new int[5];

    /* JADX INFO: compiled from: CrashDefendManager.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private d f38046a;

        a(d dVar) {
            this.f38046a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar;
            int i10;
            do {
                try {
                    Thread.sleep(1000L);
                    dVar = this.f38046a;
                    i10 = dVar.f38052d - 1;
                    dVar.f38052d = i10;
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e10) {
                    Log.d("UtilsSDK", e10.getMessage(), e10);
                }
            } while (i10 > 0);
            if (i10 <= 0) {
                b.this.b(dVar.f38051b);
                e.a(b.this.context, b.this.f58a, (List<c>) b.this.f60a);
            }
        }
    }

    private b(Context context, com.alibaba.sdk.android.utils.a aVar) {
        this.f61a = null;
        this.context = context;
        this.f38044a = aVar;
        this.f61a = new f().a();
        for (int i10 = 0; i10 < 5; i10++) {
            this.f62a[i10] = (i10 * 5) + 5;
        }
        this.f38045d.put("sdkId", "utils");
        this.f38045d.put("sdkVersion", "2.0.0");
        try {
            a();
            b();
        } catch (Exception e10) {
            Log.d("UtilsSDK", e10.getMessage(), e10);
        }
    }

    public static synchronized b a(Context context, com.alibaba.sdk.android.utils.a aVar) {
        if (f38043b == null) {
            f38043b = new b(context, aVar);
        }
        return f38043b;
    }

    private c a(c cVar, SDKMessageCallback sDKMessageCallback) {
        synchronized (this.f60a) {
            List<c> list = this.f60a;
            c cVar2 = null;
            if (list != null && list.size() > 0) {
                for (c cVar3 : this.f60a) {
                    if (cVar3 != null && cVar3.f65a.equals(cVar.f65a)) {
                        if (!cVar3.f67b.equals(cVar.f67b)) {
                            cVar3.f67b = cVar.f67b;
                            cVar3.f38048a = cVar.f38048a;
                            cVar3.f38049b = cVar.f38049b;
                            cVar3.crashCount = 0;
                            cVar3.f38050c = 0;
                        }
                        if (!cVar3.f68c) {
                            cVar3.f68c = true;
                            cVar3.f64a = sDKMessageCallback;
                            cVar3.f66b = this.f58a.f38042a;
                            cVar2 = cVar3;
                            break;
                        }
                        Log.i("UtilsSDK", "SDK " + cVar.f65a + " has been registered");
                        return null;
                    }
                }
            }
            if (cVar2 == null) {
                cVar2 = (c) cVar.clone();
                cVar2.f68c = true;
                cVar2.f64a = sDKMessageCallback;
                cVar2.crashCount = 0;
                cVar2.f66b = this.f58a.f38042a;
                this.f60a.add(cVar2);
            }
            return cVar2;
        }
    }

    private void a() {
        if (!e.m36a(this.context, this.f58a, this.f60a)) {
            this.f58a.f38042a = 1L;
        } else {
            this.f58a.f38042a++;
        }
    }

    private void a(c cVar) {
        if (cVar == null) {
            return;
        }
        d dVar = new d();
        dVar.f38051b = cVar;
        dVar.f38052d = cVar.f38049b;
        a(dVar);
        SDKMessageCallback sDKMessageCallback = cVar.f64a;
        if (sDKMessageCallback != null) {
            sDKMessageCallback.crashDefendMessage(cVar.f38048a, cVar.crashCount - 1);
        }
    }

    private void a(d dVar) {
        if (dVar == null || dVar.f38051b == null) {
            return;
        }
        this.f61a.execute(new a(dVar));
    }

    private void a(String str, String str2, int i10, int i11) {
        if (this.f38044a == null) {
            return;
        }
        HashMap map = new HashMap();
        map.putAll(this.f38045d);
        map.put("crashSdkId", str);
        map.put("crashSdkVer", str2);
        map.put("curCrashCount", String.valueOf(i10));
        map.put("crashThreshold", String.valueOf(i11));
        this.f38044a.sendCustomHit("utils_biz_crash", 0L, map);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private boolean m33a(c cVar) {
        if (cVar.crashCount < cVar.f38048a) {
            cVar.f63a = cVar.f66b;
            return true;
        }
        c cVar2 = this.f59a;
        if (cVar2 == null || !cVar2.f65a.equals(cVar.f65a)) {
            return false;
        }
        cVar.crashCount = cVar.f38048a - 1;
        cVar.f63a = cVar.f66b;
        return true;
    }

    private void b() {
        this.f59a = null;
        ArrayList<c> arrayList = new ArrayList();
        synchronized (this.f60a) {
            for (c cVar : this.f60a) {
                if (cVar.crashCount >= cVar.f38048a) {
                    arrayList.add(cVar);
                }
            }
            for (c cVar2 : arrayList) {
                int i10 = cVar2.f38050c;
                if (i10 < 5) {
                    long j10 = this.f58a.f38042a - ((long) this.f62a[i10]);
                    g.a("UtilsSDK", "after restart " + ((cVar2.f63a - j10) + 1) + " times, sdk will be restore");
                    if (cVar2.f63a < j10) {
                        this.f59a = cVar2;
                        break;
                    }
                } else {
                    Log.i("UtilsSDK", "SDK " + cVar2.f65a + " has been closed");
                }
            }
            c cVar3 = this.f59a;
            if (cVar3 == null) {
                Log.i("UtilsSDK", "NO SDK restore");
            } else {
                cVar3.f38050c++;
                Log.i("UtilsSDK", this.f59a.f65a + " will restore --- startSerialNumber:" + this.f59a.f63a + "   crashCount:" + this.f59a.crashCount);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(c cVar) {
        if (cVar == null) {
            return;
        }
        int i10 = cVar.f38050c;
        if (i10 > 0) {
            b(cVar.f65a, cVar.f67b, i10, 5);
        }
        cVar.crashCount = 0;
        cVar.f38050c = 0;
    }

    private void b(String str, String str2, int i10, int i11) {
        if (this.f38044a == null) {
            return;
        }
        HashMap map = new HashMap();
        map.putAll(this.f38045d);
        map.put("crashSdkId", str);
        map.put("crashSdkVer", str2);
        map.put("recoverCount", String.valueOf(i10));
        map.put("recoverThreshold", String.valueOf(i11));
        this.f38044a.sendCustomHit("utils_biz_recover", 0L, map);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m34a(c cVar, SDKMessageCallback sDKMessageCallback) {
        c cVarA;
        if (cVar != null && sDKMessageCallback != null) {
            try {
                if (TextUtils.isEmpty(cVar.f67b) || TextUtils.isEmpty(cVar.f65a) || (cVarA = a(cVar, sDKMessageCallback)) == null) {
                    return false;
                }
                boolean zM33a = m33a(cVarA);
                int i10 = cVarA.crashCount;
                int i11 = cVarA.f38048a;
                if (i10 == i11) {
                    a(cVarA.f65a, cVarA.f67b, i10, i11);
                }
                cVarA.crashCount++;
                e.a(this.context, this.f58a, this.f60a);
                if (zM33a) {
                    a(cVarA);
                    Log.i("UtilsSDK", "START:" + cVarA.f65a + " --- limit:" + cVarA.f38048a + "  count:" + (cVarA.crashCount - 1) + "  restore:" + cVarA.f38050c + "  startSerialNumber:" + cVarA.f63a + "  registerSerialNumber:" + cVarA.f66b);
                } else {
                    sDKMessageCallback.crashDefendMessage(cVarA.f38048a, cVarA.crashCount - 1);
                    Log.i("UtilsSDK", "STOP:" + cVarA.f65a + " --- limit:" + cVarA.f38048a + "  count:" + (cVarA.crashCount - 1) + "  restore:" + cVarA.f38050c + "  startSerialNumber:" + cVarA.f63a + "  registerSerialNumber:" + cVarA.f66b);
                }
                return true;
            } catch (Exception e10) {
                Log.d("UtilsSDK", e10.getMessage(), e10);
            }
        }
        return false;
    }

    public void b(String str, String str2) {
    }
}
