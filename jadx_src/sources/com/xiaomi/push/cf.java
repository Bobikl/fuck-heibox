package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class cf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile cf f106905a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Context f231a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private cu f233a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private cv f234a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f106909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f106910f;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final String f235a = "push_stat_sp";

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private final String f236b = "upload_time";

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private final String f237c = "delete_time";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f106908d = "check_time";

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private ah.a f232a = new cg(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ah.a f106906b = new ch(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ah.a f106907c = new ci(this);

    private cf(Context context) {
        this.f231a = context;
    }

    public static cf a(Context context) {
        if (f106905a == null) {
            synchronized (cf.class) {
                if (f106905a == null) {
                    f106905a = new cf(context);
                }
            }
        }
        return f106905a;
    }

    private boolean a() {
        return com.xiaomi.push.service.az.a(this.f231a).a(is.StatDataSwitch.a(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        SharedPreferences.Editor editorEdit = this.f231a.getSharedPreferences("push_stat_sp", 0).edit();
        editorEdit.putLong(str, System.currentTimeMillis());
        p.a(editorEdit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c() {
        return this.f231a.getDatabasePath(cj.f239a).getAbsolutePath();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String m224a() {
        return this.f106909e;
    }

    public void a(cr.a aVar) {
        cr.a(this.f231a).a(aVar);
    }

    public void a(ir irVar) {
        if (a() && com.xiaomi.push.service.ca.a(irVar.e())) {
            a(co.a(this.f231a, c(), irVar));
        }
    }

    public void a(String str) {
        if (a() && !TextUtils.isEmpty(str)) {
            a(cw.a(this.f231a, str));
        }
    }

    public void a(String str, String str2, Boolean bool) {
        if (this.f233a != null) {
            if (bool.booleanValue()) {
                this.f233a.a(this.f231a, str2, str);
            } else {
                this.f233a.b(this.f231a, str2, str);
            }
        }
    }

    public String b() {
        return this.f106910f;
    }
}
