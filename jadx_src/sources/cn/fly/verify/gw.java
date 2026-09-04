package cn.fly.verify;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class gw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile gw f36853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BroadcastReceiver f36854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ConcurrentHashMap<String, a> f36855c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile long f36856d = 0;

    public interface a {
        void a();
    }

    private gw() {
        this.f36854b = null;
        if (dt.c() || dt.d()) {
            this.f36854b = new BroadcastReceiver() { // from class: cn.fly.verify.gw.1
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    gw.a().a(context, intent);
                }
            };
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(ec.a("029bc*babhbibgbabjUcdg8bjdebgcdbgbjcjdadbdaegbfcbdidbcegbeg"));
            el.a(this.f36854b, intentFilter);
        }
    }

    public static gw a() {
        if (f36853a == null) {
            synchronized (gw.class) {
                if (f36853a == null) {
                    f36853a = new gw();
                }
            }
        }
        return f36853a;
    }

    public void a(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            if (!ec.a("029bc!babhbibgbabj^cdgIbjdebgcdbgbjcjdadbdaegbfcbdidbcegbeg").equals(intent.getAction()) || intent.getParcelableExtra(ec.a("011cdg5debibhcfcc)cIcdbi")) == null) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.f36856d > 2000) {
                this.f36856d = jCurrentTimeMillis;
                bq.a().d(2500L, new gu() { // from class: cn.fly.verify.gw.2
                    @Override // cn.fly.verify.gu
                    protected void a() {
                        if (dt.j()) {
                            fz.a(ax.g()).d(true).a(new fz.a() { // from class: cn.fly.verify.gw.2.1
                                @Override // cn.fly.verify.fz.a
                                public void a(fz.b bVar) {
                                    HashMap<String, Object> mapJ = bVar.j(new int[0]);
                                    if (mapJ == null) {
                                        return;
                                    }
                                    String str = (String) mapJ.get("ssmt");
                                    String str2 = (String) mapJ.get("bsmt");
                                    es.a().a("[MCM] cdi " + str + " bcdi " + str2 + " len " + gw.a().f36855c.size(), new Object[0]);
                                    if (TextUtils.isEmpty(str2) && (TextUtils.isEmpty(str) || ec.a("0144gcbeUcZcf@c)bideGc=gddgdgbgbage").equalsIgnoreCase(str))) {
                                        return;
                                    }
                                    TreeMap treeMap = new TreeMap();
                                    treeMap.put("ssmt", str);
                                    treeMap.put("bsmt", str2);
                                    String strB = ga.b(new JSONObject(treeMap).toString());
                                    String strB2 = bv.a().b(bv.f35913i, (String) null);
                                    if (strB2 == null || !strB2.equals(strB)) {
                                        Iterator it = gw.this.f36855c.values().iterator();
                                        while (it.hasNext()) {
                                            ((a) it.next()).a();
                                        }
                                    }
                                }
                            });
                        }
                    }
                });
            }
        } catch (Throwable th2) {
            es.a().a(th2);
        }
    }

    public void a(String str, a aVar) {
        if (aVar == null || str == null || this.f36855c.containsKey(str)) {
            return;
        }
        this.f36855c.put(str, aVar);
    }
}
