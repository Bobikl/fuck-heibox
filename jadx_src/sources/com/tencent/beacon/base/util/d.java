package com.tencent.beacon.base.util;

import android.os.Build;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: compiled from: RootUtil.java */
/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f98951a;

    public static boolean a() {
        ArrayList<String> arrayListE = e();
        if (arrayListE == null || arrayListE.size() <= 0) {
            c.a("[core] no response}", new Object[0]);
            return false;
        }
        for (String str : arrayListE) {
            c.a(str, new Object[0]);
            if (str.contains("not found")) {
                return false;
            }
        }
        c.a("[core] sufile}", new Object[0]);
        return true;
    }

    public static boolean b() {
        try {
            if (new File("/system/app/Superuser.apk").exists()) {
                c.a("[core] super_apk", new Object[0]);
                return true;
            }
        } catch (Exception e10) {
            c.a(e10);
        }
        return false;
    }

    public static boolean c() {
        String str = Build.TAGS;
        if (str == null || !str.contains("test-keys")) {
            return false;
        }
        c.a("[core] test-keys", new Object[0]);
        return true;
    }

    public static boolean d() {
        boolean z10 = true;
        if (f98951a) {
            return true;
        }
        if (!c() && !b() && !a()) {
            z10 = false;
        }
        f98951a = z10;
        return z10;
    }

    private static ArrayList<String> e() {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            Process processExec = Runtime.getRuntime().exec(new String[]{"/system/bin/sh", "-c", "type su"});
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream(), Charset.forName("UTF-8")));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                arrayList.add(line);
            }
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(processExec.getErrorStream(), Charset.forName("UTF-8")));
            while (true) {
                String line2 = bufferedReader2.readLine();
                if (line2 == null) {
                    return arrayList;
                }
                arrayList.add(line2);
            }
        } catch (Throwable th2) {
            c.a(th2);
            return null;
        }
    }
}
