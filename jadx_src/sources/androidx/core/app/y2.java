package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: PendingIntentCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class y2 {

    /* JADX INFO: compiled from: PendingIntentCompat.java */
    @androidx.annotation.w0(16)
    public static class a {
        private a() {
        }

        @androidx.annotation.n0
        @androidx.annotation.u
        public static PendingIntent a(@androidx.annotation.n0 Context context, int i10, @androidx.annotation.n0 @SuppressLint({"ArrayReturn"}) Intent[] intentArr, int i11, @androidx.annotation.n0 Bundle bundle) {
            return PendingIntent.getActivities(context, i10, intentArr, i11, bundle);
        }

        @androidx.annotation.n0
        @androidx.annotation.u
        public static PendingIntent b(@androidx.annotation.n0 Context context, int i10, @androidx.annotation.n0 Intent intent, int i11, @androidx.annotation.n0 Bundle bundle) {
            return PendingIntent.getActivity(context, i10, intent, i11, bundle);
        }
    }

    /* JADX INFO: compiled from: PendingIntentCompat.java */
    @androidx.annotation.w0(26)
    public static class b {
        private b() {
        }

        @androidx.annotation.u
        public static PendingIntent a(Context context, int i10, Intent intent, int i11) {
            return PendingIntent.getForegroundService(context, i10, intent, i11);
        }
    }

    /* JADX INFO: compiled from: PendingIntentCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    private y2() {
    }

    private static int a(boolean z10, int i10) {
        int i11;
        if (!z10) {
            i11 = 67108864;
        } else {
            if (Build.VERSION.SDK_INT < 31) {
                return i10;
            }
            i11 = 33554432;
        }
        return i10 | i11;
    }

    @androidx.annotation.n0
    public static PendingIntent b(@androidx.annotation.n0 Context context, int i10, @androidx.annotation.n0 @SuppressLint({"ArrayReturn"}) Intent[] intentArr, int i11, @androidx.annotation.n0 Bundle bundle, boolean z10) {
        return a.a(context, i10, intentArr, a(z10, i11), bundle);
    }

    @androidx.annotation.n0
    public static PendingIntent c(@androidx.annotation.n0 Context context, int i10, @androidx.annotation.n0 @SuppressLint({"ArrayReturn"}) Intent[] intentArr, int i11, boolean z10) {
        return PendingIntent.getActivities(context, i10, intentArr, a(z10, i11));
    }

    @androidx.annotation.n0
    public static PendingIntent d(@androidx.annotation.n0 Context context, int i10, @androidx.annotation.n0 Intent intent, int i11, @androidx.annotation.n0 Bundle bundle, boolean z10) {
        return a.b(context, i10, intent, a(z10, i11), bundle);
    }

    @androidx.annotation.n0
    public static PendingIntent e(@androidx.annotation.n0 Context context, int i10, @androidx.annotation.n0 Intent intent, int i11, boolean z10) {
        return PendingIntent.getActivity(context, i10, intent, a(z10, i11));
    }

    @androidx.annotation.n0
    public static PendingIntent f(@androidx.annotation.n0 Context context, int i10, @androidx.annotation.n0 Intent intent, int i11, boolean z10) {
        return PendingIntent.getBroadcast(context, i10, intent, a(z10, i11));
    }

    @androidx.annotation.n0
    @androidx.annotation.w0(26)
    public static PendingIntent g(@androidx.annotation.n0 Context context, int i10, @androidx.annotation.n0 Intent intent, int i11, boolean z10) {
        return b.a(context, i10, intent, a(z10, i11));
    }

    @androidx.annotation.n0
    public static PendingIntent h(@androidx.annotation.n0 Context context, int i10, @androidx.annotation.n0 Intent intent, int i11, boolean z10) {
        return PendingIntent.getService(context, i10, intent, a(z10, i11));
    }
}
