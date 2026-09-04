package com.xiaomi.push;

import android.util.Log;
import android.util.Pair;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public class ek implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ej f107039a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ String f334a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ Throwable f335a;

    ek(ej ejVar, String str, Throwable th2) {
        this.f107039a = ejVar;
        this.f334a = str;
        this.f335a = th2;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        ej.f331a.add(new Pair(String.format("%1$s %2$s %3$s ", ej.f330a.format(new Date()), this.f107039a.f107037b, this.f334a), this.f335a));
        if (ej.f331a.size() > 20000) {
            int size = (ej.f331a.size() - 20000) + 50;
            for (int i10 = 0; i10 < size; i10++) {
                try {
                    if (ej.f331a.size() > 0) {
                        ej.f331a.remove(0);
                    }
                } catch (IndexOutOfBoundsException unused) {
                }
            }
            ej.f331a.add(new Pair(String.format("%1$s %2$s %3$s ", ej.f330a.format(new Date()), this.f107039a.f107037b, "flush " + size + " lines logs."), null));
        }
        try {
            if (z.d()) {
                this.f107039a.m281a();
            } else {
                Log.w(this.f107039a.f107037b, "SDCard is unavailable.");
            }
        } catch (Exception e10) {
            Log.e(this.f107039a.f107037b, "", e10);
        }
    }
}
