package com.vivo.push.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import bb.c;
import com.vivo.push.b.x;
import com.vivo.push.c.d;
import com.vivo.push.e;
import com.vivo.push.q;
import com.vivo.push.util.ContextDelegate;
import com.vivo.push.util.p;
import com.vivo.push.util.t;
import com.vivo.push.util.u;
import com.vivo.push.util.z;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import x9.b;

/* JADX INFO: compiled from: CommandWorker.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a f106639c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final List<Integer> f106640e = Arrays.asList(3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f106641d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f106642f = "";

    private a() {
    }

    public static synchronized a a() {
        if (f106639c == null) {
            f106639c = new a();
        }
        return f106639c;
    }

    private static String a(Context context, String str, String str2) {
        List<ResolveInfo> listQueryBroadcastReceivers;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        Intent intent = new Intent(str2);
        intent.setPackage(str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 64)) == null || listQueryBroadcastReceivers.size() <= 0) {
                return null;
            }
            return listQueryBroadcastReceivers.get(0).activityInfo.name;
        } catch (Exception e10) {
            p.a("CommandWorker", "error  " + e10.getMessage());
            return null;
        }
    }

    private boolean b(Intent intent) {
        String stringExtra = intent.getStringExtra("security_avoid_pull");
        if (TextUtils.isEmpty(stringExtra)) {
            p.a("CommandWorker", "checkIntentIsSecurityTextUtils.isEmpty");
            return true;
        }
        try {
            String strB = com.vivo.push.util.a.a(this.f106630a).b(stringExtra);
            if ("com.vivo.pushservice".equals(strB)) {
                return true;
            }
            p.a("CommandWorker", "!decrypt.equals, so decrypt == ".concat(String.valueOf(strB)));
            return false;
        } catch (Exception e10) {
            p.a("CommandWorker", "checkIntentIsSecurity Exception: " + e10.getMessage());
            return false;
        }
    }

    private boolean c(Intent intent) {
        String strC = z.c(this.f106630a, "com.vivo.pushservice");
        p.d("CommandWorker", " 配置的验签参数 = ".concat(String.valueOf(strC)));
        if (!TextUtils.equals(strC, "1")) {
            return true;
        }
        String stringExtra = intent.getStringExtra("security_avoid_pull_rsa");
        String stringExtra2 = intent.getStringExtra("security_avoid_rsa_public_key");
        if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2)) {
            p.a("CommandWorker", "!decrypt.equals, so securityContent == " + stringExtra + " or publickKey isempty ");
            return false;
        }
        try {
            if (d.a(this.f106630a).a().a("com.vivo.pushservice".getBytes("UTF-8"), u.a(stringExtra2), Base64.decode(stringExtra, 2))) {
                p.d("CommandWorker", " RSA验签通过  ");
                return true;
            }
        } catch (Exception e10) {
            p.a("CommandWorker", "checkIntentIsSecurity Exception: " + e10.getMessage());
        }
        p.d("CommandWorker", " RSA验签 不通过  ");
        return false;
    }

    private int d(Intent intent) {
        if (!TextUtils.isEmpty(this.f106642f) && this.f106642f.contains("CommandService")) {
            if (!(intent != null && b(intent) && c(intent))) {
                p.a("CommandWorker", " !checkIntentIsSecurity(intent)");
                return c.d.f31518s1;
            }
        }
        String packageName = this.f106630a.getPackageName();
        try {
            String stringExtra = intent.getStringExtra("command_type");
            if (!TextUtils.isEmpty(stringExtra) && stringExtra.equals("reflect_receiver")) {
                int intExtra = intent.getIntExtra("command", -1);
                if (intExtra < 0) {
                    intExtra = intent.getIntExtra("method", -1);
                }
                if (f106640e.contains(Integer.valueOf(intExtra)) && t.c(this.f106630a, packageName) && !t.c(this.f106630a)) {
                    p.a("CommandWorker", "METHOD_ON_MESSAGE is not support");
                    return c.d.f31562u1;
                }
                String action = intent.getAction();
                if (TextUtils.isEmpty(this.f106641d)) {
                    String strA = a(this.f106630a, packageName, action);
                    this.f106641d = strA;
                    if (TextUtils.isEmpty(strA)) {
                        p.d("CommandWorker", " reflectReceiver error: receiver for: " + action + " not found, package: " + packageName);
                        intent.setPackage(packageName);
                        this.f106630a.sendBroadcast(intent);
                        return c.d.f31540t1;
                    }
                }
                return 0;
            }
            p.a("CommandWorker", "commandTypeStr is not satisfy == ".concat(String.valueOf(stringExtra)));
            return c.d.f31518s1;
        } catch (Exception e10) {
            p.a("CommandWorker", e10);
        }
    }

    public final void a(Intent intent) {
        if (intent != null && this.f106630a != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            a(messageObtain);
        } else {
            p.d("CommandWorker", " sendMessage error: intent : " + intent + ", mContext: " + this.f106630a);
        }
    }

    public final void a(String str) {
        this.f106642f = str;
    }

    public final void b() {
        this.f106641d = null;
    }

    @Override // com.vivo.push.q
    public final void b(Message message) {
        Context context;
        Intent intent = (Intent) message.obj;
        if (intent == null || (context = this.f106630a) == null) {
            p.d("CommandWorker", " handleMessage error: intent : " + intent + ", mContext: " + this.f106630a);
            return;
        }
        String packageName = context.getPackageName();
        int iD = d(intent);
        if (iD <= 0) {
            try {
                Class<?> cls = Class.forName(this.f106641d);
                Object objNewInstance = cls.getConstructor(new Class[0]).newInstance(new Object[0]);
                Method method = cls.getMethod("onReceive", Context.class, Intent.class);
                intent.setClassName(packageName, this.f106641d);
                method.invoke(objNewInstance, ContextDelegate.getContext(this.f106630a).getApplicationContext(), intent);
                return;
            } catch (Exception e10) {
                p.b("CommandWorker", "reflect e: ", e10);
                return;
            }
        }
        x xVar = new x(iD);
        HashMap<String, String> map = new HashMap<>();
        Bundle extras = intent.getExtras();
        map.put(b.f141138c, String.valueOf(extras != null ? extras.getLong("notify_id", 404000044642424832L) : 404000044642424832L));
        String strB = z.b(this.f106630a, packageName);
        if (!TextUtils.isEmpty(strB)) {
            map.put("remoteAppId", strB);
        }
        xVar.a(map);
        e.a().a(xVar);
    }
}
