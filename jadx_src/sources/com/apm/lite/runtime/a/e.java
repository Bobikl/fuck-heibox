package com.apm.lite.runtime.a;

import android.annotation.SuppressLint;
import android.content.Context;
import com.apm.lite.CrashType;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile e f40161e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f40162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<CrashType, c> f40163b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f40164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f40165d;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f40166a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f40166a = iArr;
            try {
                iArr[CrashType.JAVA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40166a[CrashType.LAUNCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40166a[CrashType.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40166a[CrashType.ANR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f40166a[CrashType.DART.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f40166a[CrashType.ENSURE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private e(Context context) {
        this.f40162a = context;
        try {
            this.f40164c = b.y();
            this.f40165d = new d(this.f40162a);
        } catch (Throwable th2) {
            com.apm.lite.c.a();
            com.apm.lite.c.b("NPTH_CATCH", th2);
        }
    }

    private c c(CrashType crashType) {
        c hVar = this.f40163b.get(crashType);
        if (hVar != null) {
            return hVar;
        }
        switch (a.f40166a[crashType.ordinal()]) {
            case 1:
                hVar = new h(this.f40162a, this.f40164c, this.f40165d);
                break;
            case 2:
                hVar = new i(this.f40162a, this.f40164c, this.f40165d);
                break;
            case 3:
                hVar = new j(this.f40162a, this.f40164c, this.f40165d);
                break;
            case 4:
                hVar = new com.apm.lite.runtime.a.a(this.f40162a, this.f40164c, this.f40165d);
                break;
            case 5:
                hVar = new f(this.f40162a, this.f40164c, this.f40165d);
                break;
            case 6:
                hVar = new g(this.f40162a, this.f40164c, this.f40165d);
                break;
        }
        if (hVar != null) {
            this.f40163b.put(crashType, hVar);
        }
        return hVar;
    }

    public static e d() {
        if (f40161e == null) {
            Context contextM = com.apm.lite.e.m();
            if (contextM == null) {
                throw new IllegalArgumentException("NpthBus not init");
            }
            f40161e = new e(contextM);
        }
        return f40161e;
    }

    public com.apm.lite.d.a a(CrashType crashType, com.apm.lite.d.a aVar) {
        c cVarC;
        return (crashType == null || (cVarC = c(crashType)) == null) ? aVar : cVarC.c(aVar, null, false);
    }

    public com.apm.lite.d.a b(CrashType crashType, com.apm.lite.d.a aVar, c.a aVar2, boolean z10) {
        c cVarC;
        return (crashType == null || (cVarC = c(crashType)) == null) ? aVar : cVarC.c(aVar, aVar2, z10);
    }
}
