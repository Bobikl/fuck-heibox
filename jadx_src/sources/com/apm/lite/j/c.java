package com.apm.lite.j;

import com.apm.lite.CrashType;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ConcurrentLinkedQueue<c> f40004a = new ConcurrentLinkedQueue<>();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f40005a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f40005a = iArr;
            try {
                iArr[CrashType.JAVA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40005a[CrashType.LAUNCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40005a[CrashType.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private JSONObject f40006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private JSONObject f40007b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CrashType f40008c;

        b(JSONObject jSONObject, CrashType crashType) {
            this.f40008c = crashType;
            if (crashType == CrashType.LAUNCH) {
                this.f40006a = ((JSONArray) jSONObject.opt("data")).optJSONObject(0);
            } else {
                this.f40006a = jSONObject;
            }
            this.f40007b = jSONObject.optJSONObject("header");
        }

        public String a() {
            return this.f40006a.optString("crash_thread_name", null);
        }

        public long b() {
            return this.f40006a.optLong("app_start_time", -1L);
        }

        public String c() {
            int i10 = a.f40005a[this.f40008c.ordinal()];
            if (i10 == 1) {
                return this.f40006a.optString("data", null);
            }
            if (i10 == 2) {
                return this.f40006a.optString("stack", null);
            }
            if (i10 != 3) {
                return null;
            }
            return this.f40006a.optString("data", null);
        }
    }

    static void b(CrashType crashType, JSONObject jSONObject) {
        ConcurrentLinkedQueue<c> concurrentLinkedQueue = f40004a;
        if (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
            return;
        }
        b bVar = new b(jSONObject, crashType);
        while (!f40004a.isEmpty()) {
            c cVarPoll = f40004a.poll();
            if (cVarPoll != null) {
                cVarPoll.a(crashType, bVar);
            }
        }
        f40004a = null;
    }

    public abstract void a(CrashType crashType, b bVar);
}
