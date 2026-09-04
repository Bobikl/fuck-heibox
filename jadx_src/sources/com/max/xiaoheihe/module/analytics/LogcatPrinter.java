package com.max.xiaoheihe.module.analytics;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Iterator;
import java.util.List;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import xh.m;
import yh.l;

/* JADX INFO: compiled from: LogcatPrinter.kt */
/* JADX INFO: loaded from: classes9.dex */
@t0({"SMAP\nLogcatPrinter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LogcatPrinter.kt\ncom/max/xiaoheihe/module/analytics/LogcatPrinter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,44:1\n1855#2,2:45\n*S KotlinDebug\n*F\n+ 1 LogcatPrinter.kt\ncom/max/xiaoheihe/module/analytics/LogcatPrinter\n*L\n32#1:45,2\n*E\n"})
@o(parameters = 0)
public final class LogcatPrinter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private static Process f79494c;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final LogcatPrinter f79492a = new LogcatPrinter();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final q0 f79493b = r0.a(e1.c());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f79495d = 8;

    private LogcatPrinter() {
    }

    public static final /* synthetic */ String a(LogcatPrinter logcatPrinter, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{logcatPrinter, str}, null, changeQuickRedirect, true, 25626, new Class[]{LogcatPrinter.class, String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : logcatPrinter.d(str);
    }

    @m
    public static final void c(@dl.d String tag, @dl.d l<? super String, b2> callback) {
        if (PatchProxy.proxy(new Object[]{tag, callback}, null, changeQuickRedirect, true, 25624, new Class[]{String.class, l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(tag, "tag");
        f0.p(callback, "callback");
        k.f(f79493b, null, null, new LogcatPrinter$print$1(tag, callback, null), 3, null);
    }

    private final String d(String str) {
        Process process;
        InputStream inputStream;
        List listF5;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 25625, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String string = null;
        try {
            try {
                StringBuilder sb2 = new StringBuilder();
                Process processExec = Runtime.getRuntime().exec(" logcat -d -s " + str);
                f79494c = processExec;
                if (processExec != null && (inputStream = processExec.getInputStream()) != null) {
                    Reader inputStreamReader = new InputStreamReader(inputStream, kotlin.text.d.f128566b);
                    List<String> listJ = TextStreamsKt.j(inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192));
                    if (listJ != null && (listF5 = CollectionsKt___CollectionsKt.F5(listJ, 4)) != null) {
                        Iterator it = listF5.iterator();
                        while (it.hasNext()) {
                            sb2.append((String) it.next());
                        }
                    }
                }
                string = sb2.toString();
                process = f79494c;
                if (process != null) {
                    process.destroy();
                }
            } catch (Exception e10) {
                com.max.hbcommon.utils.d.b("LogcatPrinter", "printLog error: " + e10.getMessage());
                process = f79494c;
                if (process != null) {
                }
            }
            return string;
        } catch (Throwable th2) {
            Process process2 = f79494c;
            if (process2 != null) {
                process2.destroy();
            }
            throw th2;
        }
    }

    @e
    public final Process b() {
        return f79494c;
    }

    public final void e(@e Process process) {
        f79494c = process;
    }
}
