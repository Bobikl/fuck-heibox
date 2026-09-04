package com.apm.lite.i;

import android.content.Context;
import android.os.Handler;
import com.apm.lite.k.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<a> f39972a = new ArrayList(3);

    private d(Handler handler, Context context) {
        if (com.apm.lite.k.a.k(context)) {
            this.f39972a.add(new c(handler, 0L, 15000L));
        }
    }

    public static d a(Handler handler, Context context) {
        return new d(handler, context);
    }

    public void b() {
        q.a("[ScheduleTaskManager] execute, task size=" + this.f39972a.size());
        Iterator<a> it = this.f39972a.iterator();
        while (it.hasNext()) {
            try {
                it.next().a();
            } catch (Throwable unused) {
            }
        }
    }
}
