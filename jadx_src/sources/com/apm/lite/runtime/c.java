package com.apm.lite.runtime;

import com.apm.lite.CrashInfoCallback;
import com.apm.lite.CrashType;
import com.apm.lite.ICrashCallback;
import com.apm.lite.IOOMCallback;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<ICrashCallback> f40169a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<ICrashCallback> f40170b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<ICrashCallback> f40171c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<ICrashCallback> f40172d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<IOOMCallback> f40173e = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<CrashInfoCallback> f40174f = new CopyOnWriteArrayList();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f40175a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f40175a = iArr;
            try {
                iArr[CrashType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40175a[CrashType.ANR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40175a[CrashType.JAVA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40175a[CrashType.LAUNCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f40175a[CrashType.NATIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public List<IOOMCallback> a() {
        return this.f40173e;
    }

    void b(ICrashCallback iCrashCallback, CrashType crashType) {
        List<ICrashCallback> list;
        int i10 = a.f40175a[crashType.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    list = this.f40170b;
                } else if (i10 == 4) {
                    list = this.f40169a;
                } else if (i10 != 5) {
                    return;
                } else {
                    list = this.f40171c;
                }
            }
            list.add(iCrashCallback);
        }
        this.f40169a.add(iCrashCallback);
        this.f40170b.add(iCrashCallback);
        this.f40171c.add(iCrashCallback);
        list = this.f40172d;
        list.add(iCrashCallback);
    }

    void c(IOOMCallback iOOMCallback) {
        this.f40173e.add(iOOMCallback);
    }

    public List<ICrashCallback> d() {
        return this.f40169a;
    }

    void e(ICrashCallback iCrashCallback, CrashType crashType) {
        List<ICrashCallback> list;
        int i10 = a.f40175a[crashType.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    list = this.f40170b;
                } else if (i10 == 4) {
                    list = this.f40169a;
                } else if (i10 != 5) {
                    return;
                } else {
                    list = this.f40171c;
                }
            }
            list.remove(iCrashCallback);
        }
        this.f40169a.remove(iCrashCallback);
        this.f40170b.remove(iCrashCallback);
        this.f40171c.remove(iCrashCallback);
        list = this.f40172d;
        list.remove(iCrashCallback);
    }

    void f(IOOMCallback iOOMCallback) {
        this.f40173e.remove(iOOMCallback);
    }

    public List<ICrashCallback> g() {
        return this.f40170b;
    }

    public List<ICrashCallback> h() {
        return this.f40171c;
    }

    public List<ICrashCallback> i() {
        return this.f40172d;
    }
}
