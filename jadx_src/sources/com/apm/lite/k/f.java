package com.apm.lite.k;

import com.apm.lite.nativecrash.NativeImpl;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class f {
    public static File a(String str, int i10, int i11) {
        File file = new File(o.c(com.apm.lite.e.m(), str), "logcat.txt");
        if (file.exists() && file.length() > 0) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.dumpLogcat(file.getAbsolutePath(), String.valueOf(i10), String.valueOf(i11));
        return file;
    }

    public static void b() {
        try {
            a(com.apm.lite.e.l(), com.apm.lite.e.o().getLogcatDumpCount(), com.apm.lite.e.o().getLogcatLevel());
            if (com.apm.lite.e.y()) {
                c();
                e();
                d();
                f();
            }
        } catch (Throwable unused) {
        }
    }

    public static File c() {
        File file = new File(o.r(com.apm.lite.e.m()), "maps.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.dumpMaps(file.getAbsolutePath());
        return file;
    }

    public static File d() {
        File file = new File(o.r(com.apm.lite.e.m()), "meminfo.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.dumpMemInfo(file.getAbsolutePath());
        return file;
    }

    public static File e() {
        File file = new File(o.r(com.apm.lite.e.m()), "fds.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.dumpFds(file.getAbsolutePath());
        return file;
    }

    public static File f() {
        File file = new File(o.r(com.apm.lite.e.m()), "threads.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.dumpThreads(file.getAbsolutePath());
        return file;
    }

    public static File g() throws Throwable {
        BufferedWriter bufferedWriter;
        File file = new File(o.r(com.apm.lite.e.m()), "anr_trace.txt");
        if (file.exists() || !com.apm.lite.runtime.a.n()) {
            return file;
        }
        File file2 = new File("/data/anr/traces.txt");
        if (!file2.exists()) {
            return file;
        }
        BufferedReader bufferedReader = null;
        try {
            file.getParentFile().mkdirs();
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file2));
            try {
                bufferedWriter = new BufferedWriter(new FileWriter(file));
                int length = 0;
                do {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            break;
                        }
                        bufferedWriter.write(line);
                        bufferedWriter.write(10);
                        length += line.length();
                    } catch (IOException unused) {
                        bufferedReader = bufferedReader2;
                        k.a(bufferedReader);
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader2;
                        k.a(bufferedReader);
                        k.a(bufferedWriter);
                        throw th;
                    }
                } while (length < 1048576);
                k.a(bufferedReader2);
            } catch (IOException unused2) {
                bufferedWriter = null;
            } catch (Throwable th3) {
                th = th3;
                bufferedWriter = null;
            }
        } catch (IOException unused3) {
            bufferedWriter = null;
        } catch (Throwable th4) {
            th = th4;
            bufferedWriter = null;
        }
        k.a(bufferedWriter);
        return file;
    }
}
