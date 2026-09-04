package com.vivo.push.c;

import android.content.Context;
import com.vivo.push.util.ContextDelegate;

/* JADX INFO: compiled from: PushSecurityManager.java */
/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile d f106510d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f106511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f106512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f106513c;

    private d(Context context) {
        if (this.f106511a == null) {
            this.f106513c = ContextDelegate.getContext(context.getApplicationContext());
            this.f106511a = new e(this.f106513c);
        }
        if (this.f106512b == null) {
            this.f106512b = new a();
        }
    }

    public static d a(Context context) {
        if (f106510d == null) {
            synchronized (d.class) {
                if (f106510d == null && context != null) {
                    f106510d = new d(context);
                }
            }
        }
        return f106510d;
    }

    public final b a() {
        return this.f106511a;
    }
}
