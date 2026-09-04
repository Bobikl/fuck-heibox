package com.alipay.deviceid.module.x;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: Logger.java */
/* JADX INFO: loaded from: classes6.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f38377a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f38378b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f38379c = "";

    public static synchronized void a(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        a(arrayList);
    }

    public static synchronized void a(String str, String str2, String str3) {
        f38377a = str;
        f38378b = str2;
        f38379c = str3;
    }

    public static synchronized void a(Throwable th2) {
        String string;
        ArrayList arrayList = new ArrayList();
        if (th2 != null) {
            StringWriter stringWriter = new StringWriter();
            th2.printStackTrace(new PrintWriter(stringWriter));
            string = stringWriter.toString();
        } else {
            string = "";
        }
        arrayList.add(string);
        a(arrayList);
    }

    private static synchronized void a(List<String> list) {
        if (!e.a(f38378b) && !e.a(f38379c)) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(f38379c);
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                stringBuffer.append(", " + it.next());
            }
            stringBuffer.append("\n");
            try {
                File file = new File(f38377a);
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(f38377a, f38378b);
                if (!file2.exists()) {
                    file2.createNewFile();
                }
                FileWriter fileWriter = ((long) stringBuffer.length()) + file2.length() <= 51200 ? new FileWriter(file2, true) : new FileWriter(file2);
                fileWriter.write(stringBuffer.toString());
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception unused) {
            }
        }
    }
}
