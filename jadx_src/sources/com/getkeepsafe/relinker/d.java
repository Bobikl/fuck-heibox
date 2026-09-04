package com.getkeepsafe.relinker;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: ReLinker.java */
/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: compiled from: ReLinker.java */
    public interface a {
        void a(Context context, String[] strArr, String str, File file, e eVar);
    }

    /* JADX INFO: compiled from: ReLinker.java */
    public interface b {
        String a(String str);

        String[] b();

        void c(String str);

        String d(String str);

        void loadLibrary(String str);
    }

    /* JADX INFO: compiled from: ReLinker.java */
    public interface c {
        void a(Throwable th2);

        void success();
    }

    /* JADX INFO: renamed from: com.getkeepsafe.relinker.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ReLinker.java */
    public interface InterfaceC0363d {
        void log(String str);
    }

    private d() {
    }

    public static e a() {
        return new e().c();
    }

    public static void b(Context context, String str) {
        e(context, str, null, null);
    }

    public static void c(Context context, String str, c cVar) {
        e(context, str, null, cVar);
    }

    public static void d(Context context, String str, String str2) {
        e(context, str, str2, null);
    }

    public static void e(Context context, String str, String str2, c cVar) {
        new e().i(context, str, str2, cVar);
    }

    public static e f(InterfaceC0363d interfaceC0363d) {
        return new e().k(interfaceC0363d);
    }

    public static e g() {
        return new e().n();
    }
}
