package com.igexin.push.extension.distribution.basic.stub;

import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.igexin.push.core.bean.BaseAction;
import com.igexin.push.core.bean.PushTaskBean;
import com.igexin.push.core.c;
import com.igexin.push.core.d;
import com.igexin.push.extension.distribution.basic.a.e;
import com.igexin.push.extension.distribution.basic.a.g;
import com.igexin.push.extension.distribution.basic.a.h;
import com.igexin.push.extension.distribution.basic.a.i;
import com.igexin.push.extension.distribution.basic.d.b;
import com.igexin.push.extension.stub.IPushExtension;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class PushExtension implements IPushExtension {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, com.igexin.push.core.a.a.a> f64003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Set<String> f64004b;

    public PushExtension() {
        f64003a = new HashMap();
        HashSet hashSet = new HashSet();
        f64004b = hashSet;
        hashSet.add("notification");
        f64004b.add("terminatetask");
        f64004b.add("starthome");
        f64004b.add("startintent");
        f64004b.add("startmyactivity");
    }

    private com.igexin.push.core.a.a.a a(String str) {
        Map<String, com.igexin.push.core.a.a.a> map;
        com.igexin.push.core.a.a.a hVar;
        if (TextUtils.isEmpty(str) || !f64004b.contains(str)) {
            return null;
        }
        if (!f64003a.containsKey(str) || f64003a.get(str) == null) {
            String str2 = "notification";
            if (str.equals("notification")) {
                map = f64003a;
                hVar = new com.igexin.push.extension.distribution.basic.a.a();
            } else {
                str2 = "terminatetask";
                if (str.equals("terminatetask")) {
                    map = f64003a;
                    hVar = new i();
                } else {
                    str2 = "starthome";
                    if (str.equals("starthome")) {
                        map = f64003a;
                        hVar = new e();
                    } else {
                        str2 = "startintent";
                        if (str.equals("startintent")) {
                            map = f64003a;
                            hVar = new g();
                        } else {
                            str2 = "startmyactivity";
                            if (str.equals("startmyactivity")) {
                                map = f64003a;
                                hVar = new h();
                            }
                        }
                    }
                }
            }
            map.put(str2, hVar);
        }
        return f64003a.get(str);
    }

    private void a() {
        if (!com.igexin.push.extension.distribution.basic.g.e.a()) {
            com.igexin.push.extension.distribution.basic.c.e.f63971k = com.igexin.push.extension.distribution.basic.c.e.f63961a.getCacheDir() + "/ImgCache/";
        }
        com.igexin.push.extension.distribution.basic.c.e.f63965e = new com.igexin.push.extension.distribution.basic.e.a(com.igexin.push.extension.distribution.basic.c.e.f63961a);
        DisplayMetrics displayMetrics = com.igexin.push.extension.distribution.basic.c.e.f63961a.getResources().getDisplayMetrics();
        int i10 = displayMetrics.widthPixels;
        int i11 = displayMetrics.heightPixels;
        if (i11 > i10) {
            com.igexin.push.extension.distribution.basic.c.e.f63962b = i11;
            com.igexin.push.extension.distribution.basic.c.e.f63963c = i10;
        } else {
            com.igexin.push.extension.distribution.basic.c.e.f63962b = i10;
            com.igexin.push.extension.distribution.basic.c.e.f63963c = i11;
        }
        com.igexin.push.core.a.e.a().f();
        c.a().f();
    }

    private void b() {
        try {
            com.igexin.push.extension.distribution.basic.c.c.a().c();
            com.igexin.push.extension.distribution.basic.c.c.a().d();
        } catch (Throwable unused) {
        }
    }

    private void c() {
        b.a().b();
        if (com.igexin.push.extension.distribution.basic.c.e.f63964d == null) {
            com.igexin.push.extension.distribution.basic.c.e.f63964d = com.igexin.a.b.a.a(d.f63671e.getPackageName() + System.currentTimeMillis());
            b.a().a(4, com.igexin.push.extension.distribution.basic.c.e.f63964d);
        }
    }

    private void d() {
        boolean z10;
        try {
            com.igexin.push.extension.distribution.basic.c.e.f63972l = new com.igexin.push.extension.distribution.basic.e.b(com.igexin.push.extension.distribution.basic.c.e.f63961a);
            z10 = true;
        } catch (Throwable unused) {
            z10 = false;
        }
        new Thread(new a(this, z10)).start();
    }

    @Override // com.igexin.push.extension.stub.IPushExtension
    public boolean executeAction(PushTaskBean pushTaskBean, BaseAction baseAction) {
        com.igexin.push.core.a.a.a aVarA;
        if (pushTaskBean == null || baseAction == null || (aVarA = a(baseAction.getType())) == null || pushTaskBean.isStop()) {
            return false;
        }
        return aVarA.b(pushTaskBean, baseAction);
    }

    @Override // com.igexin.push.extension.stub.IPushExtension
    public boolean init(Context context) {
        com.igexin.a.a.c.b.a("EXT-PushExtension|ext init ###", new Object[0]);
        if (context == null) {
            com.igexin.a.a.c.b.a("EXT-PushExtension|context = null", new Object[0]);
            return false;
        }
        com.igexin.push.extension.distribution.basic.c.e.f63961a = context;
        a();
        b();
        c();
        d();
        return true;
    }

    @Override // com.igexin.push.extension.stub.IPushExtension
    public boolean isActionSupported(String str) {
        return str != null && f64004b.contains(str);
    }

    @Override // com.igexin.push.extension.stub.IPushExtension
    public void onDestroy() {
        com.igexin.push.extension.distribution.basic.c.c.a().f();
    }

    @Override // com.igexin.push.extension.stub.IPushExtension
    public BaseAction parseAction(JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has("type")) {
            return null;
        }
        try {
            com.igexin.push.core.a.a.a aVarA = a(jSONObject.getString("type"));
            if (aVarA != null) {
                return aVarA.a(jSONObject);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.igexin.push.extension.stub.IPushExtension
    public com.igexin.push.core.a prepareExecuteAction(PushTaskBean pushTaskBean, BaseAction baseAction) {
        com.igexin.push.core.a.a.a aVarA;
        return (pushTaskBean == null || baseAction == null || (aVarA = a(baseAction.getType())) == null) ? com.igexin.push.core.a.stop : aVarA.a(pushTaskBean, baseAction);
    }
}
