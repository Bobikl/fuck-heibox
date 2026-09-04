package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.umeng.analytics.pro.ak;
import com.umeng.analytics.pro.aw;
import com.umeng.analytics.pro.bc;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback;
import com.umeng.commonsdk.statistics.internal.UMImprintPreProcessCallback;
import com.umeng.commonsdk.utils.FileLockCallback;
import com.umeng.commonsdk.utils.FileLockUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public class ImprintHandler implements FileLockCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f105323a = "ImprintHandler";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f105325c = ".imprint";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Context f105330k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static FileLockUtil f105331l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f105332m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f105333n = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.umeng.commonsdk.statistics.internal.d f105336e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a f105337h = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.umeng.commonsdk.statistics.proto.d f105338i = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Object f105324b = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f105326d = "pbl0".getBytes();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Map<String, ArrayList<UMImprintChangeCallback>> f105327f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Object f105328g = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static ImprintHandler f105329j = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static Map<String, UMImprintPreProcessCallback> f105334o = new HashMap();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static Object f105335p = new Object();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map<String, String> f105339a = new HashMap();

        a() {
        }

        a(com.umeng.commonsdk.statistics.proto.d dVar) {
            a(dVar);
        }

        private synchronized void b(com.umeng.commonsdk.statistics.proto.d dVar) {
            com.umeng.commonsdk.statistics.proto.e eVar;
            if (dVar != null) {
                try {
                    if (dVar.e()) {
                        Map<String, com.umeng.commonsdk.statistics.proto.e> mapC = dVar.c();
                        for (String str : mapC.keySet()) {
                            if (!TextUtils.isEmpty(str) && (eVar = mapC.get(str)) != null) {
                                String strB = eVar.b();
                                if (TextUtils.isEmpty(strB)) {
                                    continue;
                                } else {
                                    this.f105339a.put(str, strB);
                                    if (AnalyticsConstants.UM_DEBUG) {
                                        Log.i(ImprintHandler.f105323a, "imKey is " + str + ", imValue is " + strB);
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }

        public synchronized String a(String str, String str2) {
            if (!TextUtils.isEmpty(str) && this.f105339a.size() > 0) {
                String str3 = this.f105339a.get(str);
                return !TextUtils.isEmpty(str3) ? str3 : str2;
            }
            return str2;
        }

        public void a(com.umeng.commonsdk.statistics.proto.d dVar) {
            if (dVar == null) {
                return;
            }
            b(dVar);
        }

        public synchronized void a(String str) {
            Map<String, String> map = this.f105339a;
            if (map != null && map.size() > 0 && !TextUtils.isEmpty(str) && this.f105339a.containsKey(str)) {
                this.f105339a.remove(str);
            }
        }
    }

    private ImprintHandler(Context context) {
        f105330k = context.getApplicationContext();
    }

    private com.umeng.commonsdk.statistics.proto.d a(com.umeng.commonsdk.statistics.proto.d dVar, com.umeng.commonsdk.statistics.proto.d dVar2, Map<String, String> map) {
        UMImprintPreProcessCallback uMImprintPreProcessCallback;
        ArrayList<UMImprintChangeCallback> arrayList;
        if (dVar2 == null) {
            return dVar;
        }
        Map<String, com.umeng.commonsdk.statistics.proto.e> mapC = dVar.c();
        for (Map.Entry<String, com.umeng.commonsdk.statistics.proto.e> entry : dVar2.c().entrySet()) {
            int i10 = 0;
            if (entry.getValue().d()) {
                String key = entry.getKey();
                String str = entry.getValue().f105485a;
                synchronized (f105335p) {
                    if (!TextUtils.isEmpty(key) && f105334o.containsKey(key) && (uMImprintPreProcessCallback = f105334o.get(key)) != null && uMImprintPreProcessCallback.onPreProcessImprintKey(key, str)) {
                        i10 = 1;
                    }
                }
                if (i10 == 0) {
                    mapC.put(entry.getKey(), entry.getValue());
                    synchronized (f105328g) {
                        if (!TextUtils.isEmpty(key) && f105327f.containsKey(key) && f105327f.get(key) != null) {
                            map.put(key, str);
                        }
                    }
                } else {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> merge: [" + key + "] should be ignored.");
                }
            } else {
                String key2 = entry.getKey();
                synchronized (f105328g) {
                    if (!TextUtils.isEmpty(key2) && f105327f.containsKey(key2) && (arrayList = f105327f.get(key2)) != null) {
                        while (i10 < arrayList.size()) {
                            arrayList.get(i10).onImprintValueChanged(key2, null);
                            i10++;
                        }
                    }
                }
                mapC.remove(key2);
                this.f105337h.a(key2);
            }
        }
        dVar.a(dVar2.f());
        dVar.a(a(dVar));
        return dVar;
    }

    private void a(File file) {
        if (this.f105338i == null) {
            return;
        }
        try {
            synchronized (f105324b) {
                byte[] bArrA = new bc().a(this.f105338i);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    fileOutputStream.write(bArrA);
                    fileOutputStream.flush();
                    HelperUtils.safeClose(fileOutputStream);
                } catch (Throwable th2) {
                    HelperUtils.safeClose(fileOutputStream);
                    throw th2;
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private static void a(String str, UMImprintChangeCallback uMImprintChangeCallback) {
        synchronized (f105328g) {
            try {
                int i10 = 0;
                if (f105327f.containsKey(str)) {
                    ArrayList<UMImprintChangeCallback> arrayList = f105327f.get(str);
                    int size = arrayList.size();
                    ULog.i("--->>> addCallback: before add: callbacks size is: " + size);
                    while (i10 < size) {
                        if (uMImprintChangeCallback == arrayList.get(i10)) {
                            ULog.i("--->>> addCallback: callback has exist, just exit");
                            return;
                        }
                        i10++;
                    }
                    arrayList.add(uMImprintChangeCallback);
                    ULog.i("--->>> addCallback: after add: callbacks size is: " + arrayList.size());
                } else {
                    ArrayList<UMImprintChangeCallback> arrayList2 = new ArrayList<>();
                    int size2 = arrayList2.size();
                    ULog.i("--->>> addCallback: before add: callbacks size is: " + size2);
                    while (i10 < size2) {
                        if (uMImprintChangeCallback == arrayList2.get(i10)) {
                            ULog.i("--->>> addCallback: callback has exist, just exit");
                            return;
                        }
                        i10++;
                    }
                    arrayList2.add(uMImprintChangeCallback);
                    ULog.i("--->>> addCallback: after add: callbacks size is: " + arrayList2.size());
                    f105327f.put(str, arrayList2);
                }
            } catch (Throwable th2) {
                UMCrashManager.reportCrash(f105330k, th2);
            }
        }
    }

    private boolean a(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    private static void b(String str, UMImprintChangeCallback uMImprintChangeCallback) {
        if (TextUtils.isEmpty(str) || uMImprintChangeCallback == null) {
            return;
        }
        synchronized (f105328g) {
            try {
                if (f105327f.containsKey(str)) {
                    ArrayList<UMImprintChangeCallback> arrayList = f105327f.get(str);
                    if (arrayList.size() > 0) {
                        int size = arrayList.size();
                        ULog.i("--->>> removeCallback: before remove: callbacks size is: " + size);
                        for (int i10 = 0; i10 < size; i10++) {
                            if (uMImprintChangeCallback == arrayList.get(i10)) {
                                ULog.i("--->>> removeCallback: remove index " + i10);
                                arrayList.remove(i10);
                                break;
                            }
                        }
                        ULog.i("--->>> removeCallback: after remove: callbacks size is: " + arrayList.size());
                        if (arrayList.size() == 0) {
                            ULog.i("--->>> removeCallback: remove key from map: key = " + str);
                            f105327f.remove(str);
                        }
                    }
                }
            } catch (Throwable th2) {
                UMCrashManager.reportCrash(f105330k, th2);
            }
        }
    }

    private boolean c(com.umeng.commonsdk.statistics.proto.d dVar) {
        if (!dVar.i().equals(a(dVar))) {
            return false;
        }
        for (com.umeng.commonsdk.statistics.proto.e eVar : dVar.c().values()) {
            byte[] bArrReverseHexString = DataHelper.reverseHexString(eVar.h());
            byte[] bArrA = a(eVar);
            for (int i10 = 0; i10 < 4; i10++) {
                if (bArrReverseHexString[i10] != bArrA[i10]) {
                    return false;
                }
            }
        }
        return true;
    }

    private com.umeng.commonsdk.statistics.proto.d d(com.umeng.commonsdk.statistics.proto.d dVar) {
        Map<String, com.umeng.commonsdk.statistics.proto.e> mapC = dVar.c();
        if (mapC.containsKey(ak.f104446f)) {
            mapC.remove(ak.f104446f);
            this.f105337h.a(ak.f104446f);
            dVar.a(dVar.f());
            dVar.a(a(dVar));
        }
        return dVar;
    }

    private com.umeng.commonsdk.statistics.proto.d e(com.umeng.commonsdk.statistics.proto.d dVar) {
        ArrayList<UMImprintChangeCallback> arrayList;
        boolean z10;
        ArrayList<UMImprintChangeCallback> arrayList2;
        UMImprintPreProcessCallback uMImprintPreProcessCallback;
        Map<String, com.umeng.commonsdk.statistics.proto.e> mapC = dVar.c();
        ArrayList<String> arrayList3 = new ArrayList(mapC.size() / 2);
        Iterator<Map.Entry<String, com.umeng.commonsdk.statistics.proto.e>> it = mapC.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, com.umeng.commonsdk.statistics.proto.e> next = it.next();
            if (next.getValue().d()) {
                String key = next.getKey();
                String str = next.getValue().f105485a;
                synchronized (f105335p) {
                    z10 = !TextUtils.isEmpty(key) && f105334o.containsKey(key) && (uMImprintPreProcessCallback = f105334o.get(key)) != null && uMImprintPreProcessCallback.onPreProcessImprintKey(key, str);
                }
                if (z10) {
                    arrayList3.add(key);
                }
                synchronized (f105328g) {
                    if (!TextUtils.isEmpty(key) && f105327f.containsKey(key) && (arrayList2 = f105327f.get(key)) != null) {
                        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                            arrayList2.get(i10).onImprintValueChanged(key, str);
                        }
                    }
                }
            } else {
                arrayList3.add(next.getKey());
            }
        }
        for (String str2 : arrayList3) {
            synchronized (f105328g) {
                if (!TextUtils.isEmpty(str2) && f105327f.containsKey(str2) && (arrayList = f105327f.get(str2)) != null) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        arrayList.get(i11).onImprintValueChanged(str2, null);
                    }
                }
            }
            mapC.remove(str2);
        }
        return dVar;
    }

    private void e() {
        FileInputStream fileInputStreamOpenFileInput;
        Throwable th2;
        File file = new File(f105330k.getFilesDir(), f105325c);
        synchronized (f105324b) {
            if (file.exists()) {
                byte[] streamToByteArray = null;
                try {
                    fileInputStreamOpenFileInput = f105330k.openFileInput(f105325c);
                    try {
                        try {
                            streamToByteArray = HelperUtils.readStreamToByteArray(fileInputStreamOpenFileInput);
                        } catch (Exception e10) {
                            e = e10;
                            e.printStackTrace();
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        HelperUtils.safeClose(fileInputStreamOpenFileInput);
                        throw th2;
                    }
                } catch (Exception e11) {
                    e = e11;
                    fileInputStreamOpenFileInput = null;
                } catch (Throwable th4) {
                    fileInputStreamOpenFileInput = null;
                    th2 = th4;
                    HelperUtils.safeClose(fileInputStreamOpenFileInput);
                    throw th2;
                }
                HelperUtils.safeClose(fileInputStreamOpenFileInput);
                if (streamToByteArray != null) {
                    try {
                        com.umeng.commonsdk.statistics.proto.d dVar = new com.umeng.commonsdk.statistics.proto.d();
                        new aw().a(dVar, streamToByteArray);
                        this.f105338i = dVar;
                        this.f105337h.a(dVar);
                        this.f105338i = d(this.f105338i);
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                }
            }
        }
    }

    public static synchronized ImprintHandler getImprintService(Context context) {
        if (f105329j == null) {
            f105329j = new ImprintHandler(context);
            f105331l = new FileLockUtil();
            f105331l.doFileOperateion(new File(f105330k.getFilesDir(), f105325c), f105329j, 0);
        }
        return f105329j;
    }

    public String a(com.umeng.commonsdk.statistics.proto.d dVar) {
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : new TreeMap(dVar.c()).entrySet()) {
            sb2.append((String) entry.getKey());
            if (((com.umeng.commonsdk.statistics.proto.e) entry.getValue()).d()) {
                sb2.append(((com.umeng.commonsdk.statistics.proto.e) entry.getValue()).b());
            }
            sb2.append(((com.umeng.commonsdk.statistics.proto.e) entry.getValue()).e());
            sb2.append(((com.umeng.commonsdk.statistics.proto.e) entry.getValue()).h());
        }
        sb2.append(dVar.f105467b);
        return HelperUtils.MD5(sb2.toString()).toLowerCase(Locale.US);
    }

    public void a(com.umeng.commonsdk.statistics.internal.d dVar) {
        this.f105336e = dVar;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (f105335p) {
            try {
                if (f105334o.containsKey(str)) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> unregistPreProcessCallback: unregist [" + str + "] success.");
                    f105327f.remove(str);
                } else {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> unregistPreProcessCallback: can't find [" + str + "], pls regist first.");
                }
            } catch (Throwable th2) {
                UMCrashManager.reportCrash(f105330k, th2);
            }
        }
    }

    public byte[] a() {
        try {
            synchronized (this) {
                com.umeng.commonsdk.statistics.proto.d dVar = this.f105338i;
                if (dVar == null) {
                    return null;
                }
                if (dVar.b() <= 0) {
                    return null;
                }
                return new bc().a(this.f105338i);
            }
        } catch (Throwable th2) {
            UMCrashManager.reportCrash(f105330k, th2);
            return null;
        }
    }

    public byte[] a(com.umeng.commonsdk.statistics.proto.e eVar) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(null);
        byteBufferAllocate.putLong(eVar.e());
        byte[] bArrArray = byteBufferAllocate.array();
        byte[] bArr = f105326d;
        byte[] bArr2 = new byte[4];
        for (int i10 = 0; i10 < 4; i10++) {
            bArr2[i10] = (byte) (bArrArray[i10] ^ bArr[i10]);
        }
        return bArr2;
    }

    public synchronized com.umeng.commonsdk.statistics.proto.d b() {
        return this.f105338i;
    }

    public void b(com.umeng.commonsdk.statistics.proto.d dVar) {
        boolean z10;
        if (dVar == null) {
            if (AnalyticsConstants.UM_DEBUG) {
                UMRTLog.d(UMRTLog.RTLOG_TAG, "Imprint is null");
                return;
            }
            return;
        }
        if (!c(dVar)) {
            if (AnalyticsConstants.UM_DEBUG) {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "Imprint is not valid");
                return;
            }
            return;
        }
        boolean z11 = AnalyticsConstants.UM_DEBUG;
        HashMap map = new HashMap();
        synchronized (this) {
            com.umeng.commonsdk.statistics.proto.d dVar2 = this.f105338i;
            com.umeng.commonsdk.statistics.proto.d dVarD = d(dVar);
            String strI = null;
            String strI2 = dVar2 == null ? null : dVar2.i();
            com.umeng.commonsdk.statistics.proto.d dVarE = dVar2 == null ? e(dVarD) : a(dVar2, dVarD, map);
            this.f105338i = dVarE;
            if (dVarE != null) {
                strI = dVarE.i();
            }
            z10 = !a(strI2, strI);
        }
        com.umeng.commonsdk.statistics.proto.d dVar3 = this.f105338i;
        if (dVar3 != null && z10) {
            this.f105337h.a(dVar3);
            com.umeng.commonsdk.statistics.internal.d dVar4 = this.f105336e;
            if (dVar4 != null) {
                dVar4.onImprintChanged(this.f105337h);
            }
        }
        if (map.size() > 0) {
            synchronized (f105328g) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key) && f105327f.containsKey(key)) {
                        ULog.i("--->>> target imprint key is: " + key + "; value is: " + value);
                        ArrayList<UMImprintChangeCallback> arrayList = f105327f.get(key);
                        if (arrayList != null) {
                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                arrayList.get(i10).onImprintValueChanged(key, value);
                            }
                        }
                    }
                }
            }
        }
    }

    public a c() {
        return this.f105337h;
    }

    public void d() {
        if (this.f105338i == null || f105331l == null) {
            return;
        }
        File file = new File(f105330k.getFilesDir(), f105325c);
        if (!file.exists()) {
            try {
                try {
                    file.createNewFile();
                } catch (IOException e10) {
                    UMCrashManager.reportCrash(f105330k, e10);
                }
            } catch (IOException unused) {
                file.createNewFile();
            }
        }
        f105331l.doFileOperateion(file, f105329j, 1);
    }

    @Override // com.umeng.commonsdk.utils.FileLockCallback
    public boolean onFileLock(File file, int i10) {
        if (i10 == 0) {
            f105329j.e();
        } else if (i10 == 1) {
            f105329j.a(file);
        }
        return true;
    }

    @Override // com.umeng.commonsdk.utils.FileLockCallback
    public boolean onFileLock(String str) {
        return false;
    }

    @Override // com.umeng.commonsdk.utils.FileLockCallback
    public boolean onFileLock(String str, Object obj) {
        return false;
    }

    public void registImprintCallback(String str, UMImprintChangeCallback uMImprintChangeCallback) {
        if (TextUtils.isEmpty(str) || uMImprintChangeCallback == null) {
            return;
        }
        a(str, uMImprintChangeCallback);
    }

    public void registPreProcessCallback(String str, UMImprintPreProcessCallback uMImprintPreProcessCallback) {
        if (TextUtils.isEmpty(str) || uMImprintPreProcessCallback == null) {
            return;
        }
        synchronized (f105335p) {
            try {
                if (f105334o.containsKey(str)) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> key : " + str + " PreProcesser has registed!");
                } else {
                    f105334o.put(str, uMImprintPreProcessCallback);
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> registPreProcessCallback: key : " + str + " regist success.");
                }
            } catch (Throwable th2) {
                UMCrashManager.reportCrash(f105330k, th2);
            }
        }
    }

    public void unregistImprintCallback(String str, UMImprintChangeCallback uMImprintChangeCallback) {
        if (TextUtils.isEmpty(str) || uMImprintChangeCallback == null) {
            return;
        }
        b(str, uMImprintChangeCallback);
    }
}
