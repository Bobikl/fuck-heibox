package com.huawei.hms.scankit;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.p.j0;
import com.huawei.hms.scankit.p.k1;
import com.huawei.hms.scankit.p.l1;
import com.huawei.hms.scankit.p.o4;
import com.huawei.hms.scankit.p.v6;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: DecodeThread.java */
/* JADX INFO: loaded from: classes7.dex */
public final class d extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f61423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j0 f61424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<l1, Object> f61425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Handler f61426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f61427e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Rect f61429g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f61430h = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CountDownLatch f61428f = new CountDownLatch(1);

    d(Context context, j0 j0Var, a aVar, Collection<BarcodeFormat> collection, Map<l1, ?> map, String str, v6 v6Var) {
        this.f61423a = context;
        this.f61427e = aVar;
        this.f61424b = j0Var;
        EnumMap enumMap = new EnumMap(l1.class);
        this.f61425c = enumMap;
        if (map != null) {
            enumMap.putAll(map);
        }
        if (collection == null || collection.isEmpty()) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            collection = EnumSet.noneOf(BarcodeFormat.class);
            if (defaultSharedPreferences.getBoolean("preferences_decode_1D_product", true)) {
                collection.addAll(k1.f62027a);
            }
            if (defaultSharedPreferences.getBoolean("preferences_decode_1D_industrial", true)) {
                collection.addAll(k1.f62029c);
            }
            if (defaultSharedPreferences.getBoolean("preferences_decode_QR", true)) {
                collection.addAll(k1.f62030d);
            }
            if (defaultSharedPreferences.getBoolean("preferences_decode_Data_Matrix", true)) {
                collection.addAll(k1.f62032f);
            }
            if (defaultSharedPreferences.getBoolean("preferences_decode_Aztec", false)) {
                collection.addAll(k1.f62031e);
            }
            if (defaultSharedPreferences.getBoolean("preferences_decode_PDF417", false)) {
                collection.addAll(k1.f62033g);
            }
        }
        enumMap.put(l1.POSSIBLE_FORMATS, collection);
        if (str != null) {
            enumMap.put(l1.CHARACTER_SET, str);
        }
        enumMap.put(l1.NEED_RESULT_POINT_CALLBACK, v6Var);
        o4.d("DecodeThread", "Hints: " + enumMap);
    }

    Handler a() {
        try {
            this.f61428f.await();
        } catch (InterruptedException unused) {
            o4.b("exception", "InterruptedException");
        }
        return this.f61426d;
    }

    public void a(Rect rect) {
        this.f61429g = rect;
    }

    public void a(boolean z10) {
        this.f61430h = z10;
    }

    public void b() {
        this.f61423a = null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Looper.prepare();
        this.f61426d = new c(this.f61423a, this.f61424b, this.f61427e, this.f61425c, this.f61429g, this.f61430h);
        this.f61428f.countDown();
        Looper.loop();
    }
}
