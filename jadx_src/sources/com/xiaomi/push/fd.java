package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class fd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile fd f107125a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private int f416a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Context f417a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private fh f418a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private String f419a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private HashMap<ff, fg> f420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f107126b;

    private fd(Context context) {
        HashMap<ff, fg> map = new HashMap<>();
        this.f420a = map;
        this.f417a = context;
        map.put(ff.SERVICE_ACTION, new fj());
        this.f420a.put(ff.SERVICE_COMPONENT, new fk());
        this.f420a.put(ff.ACTIVITY, new fb());
        this.f420a.put(ff.PROVIDER, new fi());
    }

    public static fd a(Context context) {
        if (f107125a == null) {
            synchronized (fd.class) {
                if (f107125a == null) {
                    f107125a = new fd(context);
                }
            }
        }
        return f107125a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ff ffVar, Context context, fc fcVar) {
        this.f420a.get(ffVar).a(context, fcVar);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m371a(Context context) {
        return com.xiaomi.push.service.al.m696a(context, context.getPackageName());
    }

    public int a() {
        return this.f416a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public fh m372a() {
        return this.f418a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String m373a() {
        return this.f419a;
    }

    public void a(int i10) {
        this.f416a = i10;
    }

    public void a(Context context, String str, int i10, String str2, String str3) {
        if (context != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            a(i10);
            ah.a(this.f417a).a(new fe(this, str, context, str2, str3));
        } else {
            ez.a(context, "" + str, 1008, "A receive a incorrect message");
        }
    }

    public void a(ff ffVar, Context context, Intent intent, String str) {
        if (ffVar != null) {
            this.f420a.get(ffVar).a(context, intent, str);
        } else {
            ez.a(context, "null", 1008, "A receive a incorrect message with empty type");
        }
    }

    public void a(fh fhVar) {
        this.f418a = fhVar;
    }

    public void a(String str) {
        this.f419a = str;
    }

    public void a(String str, String str2, int i10, fh fhVar) {
        a(str);
        b(str2);
        a(i10);
        a(fhVar);
    }

    public String b() {
        return this.f107126b;
    }

    public void b(String str) {
        this.f107126b = str;
    }
}
