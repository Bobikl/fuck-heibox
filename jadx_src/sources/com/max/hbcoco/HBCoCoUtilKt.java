package com.max.hbcoco;

import bb.c;
import com.max.hbmmkv.MMKVManager;
import com.max.hbutils.core.BaseApplication;
import com.max.heybox.hblog.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dalvik.system.DexFile;
import dl.d;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.h;
import kotlin.text.i;
import kotlin.text.k;
import kotlin.text.u;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.r0;
import xh.e;

/* JADX INFO: compiled from: HBCoCoUtil.kt */
/* JADX INFO: loaded from: classes9.dex */
@t0({"SMAP\nHBCoCoUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HBCoCoUtil.kt\ncom/max/hbcoco/HBCoCoUtilKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,198:1\n1#2:199\n*E\n"})
public final class HBCoCoUtilKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @e
    public static boolean f66169a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private static final String f66170b = "UN_COVERAGE";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final /* synthetic */ void a() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.b.Vp, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        h();
    }

    public static final /* synthetic */ boolean b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.b.Wp, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : i();
    }

    public static final /* synthetic */ List c(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, c.b.Xp, new Class[]{String.class}, List.class);
        return patchProxyResultProxy.isSupported ? (List) patchProxyResultProxy.result : j(str);
    }

    private static final String d(String str) {
        k kVarD;
        i iVarB;
        h hVar;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 1500, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (str == null || (kVarD = Regex.d(new Regex("<(.*?)>"), str, 0, 2, null)) == null || (iVarB = kVarD.b()) == null || (hVar = iVarB.get(1)) == null) {
            return null;
        }
        return hVar.f();
    }

    public static final void e() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.b.Mp, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        kotlinx.coroutines.k.f(r0.a(e1.c()), null, null, new HBCoCoUtilKt$fastLoadUnCoverageClass$1(null), 3, null);
    }

    private static final List<za.a> f() {
        DexFile dexFile;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.b.Pp, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        BaseApplication baseApplicationA = BaseApplication.a();
        f0.o(baseApplicationA, "getInstance(...)");
        ArrayList arrayList = new ArrayList();
        try {
            dexFile = new DexFile(baseApplicationA.getPackageCodePath());
        } catch (IOException unused) {
            dexFile = null;
        }
        if (dexFile != null) {
            String packageName = baseApplicationA.getPackageName();
            f0.o(packageName, "getPackageName(...)");
            String strH3 = CollectionsKt___CollectionsKt.h3(CollectionsKt___CollectionsKt.E5(StringsKt__StringsKt.T4(packageName, new char[]{lg.a.f131414g}, false, 0, 6, null), 2), ".", null, null, 0, null, null, 62, null);
            Enumeration<String> enumerationEntries = dexFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                String strNextElement = enumerationEntries.nextElement();
                if (strNextElement != null) {
                    f0.m(strNextElement);
                    if (u.v2(strNextElement, strH3, false, 2, null) && !StringsKt__StringsKt.W2(strNextElement, "$", false, 2, null)) {
                        arrayList.add(new za.a(strNextElement));
                    }
                }
            }
        }
        return arrayList;
    }

    private static final boolean g(long j10, long j11) {
        Object[] objArr = {new Long(j10), new Long(j11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, c.b.Up, new Class[]{cls, cls}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        return f0.g(simpleDateFormat.format(new Date(j10)), simpleDateFormat.format(new Date(j11)));
    }

    private static final void h() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.b.Qp, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        kotlinx.coroutines.k.f(r0.a(e1.c()), null, null, new HBCoCoUtilKt$loadCoverageClass$1(null), 3, null);
    }

    private static final boolean i() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.b.Tp, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : !g(MMKVManager.f71329a.g(ad.c.f1233m, ad.c.f1234n, 0L, false), System.currentTimeMillis());
    }

    private static final List<za.a> j(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, c.b.Rp, new Class[]{String.class}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        BaseApplication baseApplicationA = BaseApplication.a();
        f0.o(baseApplicationA, "getInstance(...)");
        File file = new File(str);
        if (!file.exists()) {
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                try {
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                    try {
                        ArrayList arrayList = new ArrayList();
                        String packageName = baseApplicationA.getPackageName();
                        f0.o(packageName, "getPackageName(...)");
                        String strH3 = CollectionsKt___CollectionsKt.h3(CollectionsKt___CollectionsKt.E5(StringsKt__StringsKt.T4(packageName, new char[]{lg.a.f131414g}, false, 0, 6, null), 2), ".", null, null, 0, null, null, 62, null);
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                kotlin.io.b.a(bufferedReader, null);
                                kotlin.io.b.a(inputStreamReader, null);
                                kotlin.io.b.a(fileInputStream, null);
                                return arrayList;
                            }
                            String strD = d(line);
                            if (strD != null) {
                                if (!(u.v2(strD, strH3, false, 2, null) && !StringsKt__StringsKt.W2(strD, "$", false, 2, null))) {
                                    strD = null;
                                }
                                if (strD != null) {
                                    arrayList.add(new za.a(strD));
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            kotlin.io.b.a(bufferedReader, th2);
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        kotlin.io.b.a(inputStreamReader, th4);
                        throw th5;
                    }
                }
            } catch (Throwable th6) {
                try {
                    throw th6;
                } catch (Throwable th7) {
                    kotlin.io.b.a(fileInputStream, th6);
                    throw th7;
                }
            }
        } catch (Throwable th8) {
            g.f74531b.v("UN_COVERAGE  readFileContent  error: " + th8.getMessage());
            return null;
        }
    }

    public static final void k() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.b.Op, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        List<za.a> all = ya.a.f141620b.a().c().getAll();
        com.max.hbcoco.room.dao.a aVarC = ya.b.f141624b.a().c();
        aVarC.clear();
        aVarC.c(all);
    }

    public static final void l() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.b.Np, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        kotlinx.coroutines.k.f(r0.a(e1.c()), null, null, new HBCoCoUtilKt$tryToReportUnCoverageClass$1(null), 3, null);
    }
}
