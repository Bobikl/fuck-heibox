package s4;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f139275a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f139276b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f139277c = "";

    public static synchronized void a(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        d(arrayList);
    }

    public static synchronized void b(String str, String str2, String str3) {
        f139275a = str;
        f139276b = str2;
        f139277c = str3;
    }

    public static synchronized void c(Throwable th2) {
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
        d(arrayList);
    }

    public static synchronized void d(List<String> list) {
        if (!e6.a.c(f139276b) && !e6.a.c(f139277c)) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(f139277c);
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                stringBuffer.append(", " + it.next());
            }
            stringBuffer.append("\n");
            try {
                File file = new File(f139275a);
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(f139275a, f139276b);
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
