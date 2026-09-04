package com.apm.lite.k;

import android.text.TextUtils;
import com.apm.lite.nativecrash.NativeImpl;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final StackTraceElement f40080a = new StackTraceElement("", "", "", 0);

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f40081a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f40082b;

        public a(int i10, int i11) {
            this.f40081a = i10;
            this.f40082b = i11;
        }

        public JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(com.google.android.exoplayer2.text.ttml.d.f49798o0, this.f40081a);
                jSONObject.put(com.google.android.exoplayer2.text.ttml.d.f49800p0, this.f40082b);
            } catch (Throwable unused) {
            }
            return jSONObject;
        }
    }

    public static String a(String str) {
        BufferedReader bufferedReader = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (!file.exists()) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            int i11 = 0;
            while (true) {
                try {
                    String line = bufferedReader2.readLine();
                    if (line == null) {
                        break;
                    }
                    if (i11 <= 256) {
                        linkedList.add(line);
                        sb2.append(line);
                        sb2.append('\n');
                    } else {
                        linkedList2.add(line);
                        if (linkedList2.size() > 256) {
                            linkedList2.poll();
                            i10++;
                        }
                    }
                    i11++;
                } catch (Throwable unused) {
                    bufferedReader = bufferedReader2;
                    k.a(bufferedReader);
                }
            }
            k.a(bufferedReader2);
        } catch (Throwable unused2) {
        }
        if (!linkedList2.isEmpty()) {
            if (i10 != 0) {
                sb2.append("\t... skip ");
                sb2.append(i10);
                sb2.append(" lines\n");
            }
            Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                sb2.append((String) it.next());
                sb2.append('\n');
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    public static String b(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            m(th2, printWriter);
            String string = stringWriter.toString();
            printWriter.close();
            return string;
        } catch (Throwable unused) {
            printWriter.close();
            return "";
        }
    }

    public static String c(Throwable th2, Thread thread, PrintStream printStream, e.a aVar) throws IOException {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (Throwable unused) {
            messageDigest = null;
        }
        e eVar = new e(printStream, messageDigest, aVar);
        try {
            m(th2, eVar);
        } catch (Throwable unused2) {
        }
        eVar.close();
        if (messageDigest != null) {
            return d(messageDigest.digest());
        }
        return null;
    }

    private static String d(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            cArr2[i10] = cArr[(b10 >>> 4) & 15];
            i10 = i11 + 1;
            cArr2[i11] = cArr[b10 & 15];
        }
        return new String(cArr2);
    }

    public static String e(StackTraceElement[] stackTraceElementArr) {
        StringBuilder sb2 = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            f(stackTraceElement, sb2);
        }
        return sb2.toString();
    }

    public static StringBuilder f(StackTraceElement stackTraceElement, StringBuilder sb2) {
        String className = stackTraceElement.getClassName();
        sb2.append("  at ");
        sb2.append(className);
        sb2.append(".");
        sb2.append(stackTraceElement.getMethodName());
        sb2.append("(");
        sb2.append(stackTraceElement.getFileName());
        sb2.append(":");
        sb2.append(stackTraceElement.getLineNumber());
        sb2.append(")\n");
        return sb2;
    }

    public static JSONArray g(StackTraceElement[] stackTraceElementArr, String[] strArr) {
        a aVar = new a(-1, -1);
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < stackTraceElementArr.length; i10++) {
            if (aVar.f40081a == -1) {
                if (q(stackTraceElementArr[i10].getClassName(), strArr)) {
                    aVar.f40081a = i10;
                    aVar.f40082b = i10;
                }
            } else if (!q(stackTraceElementArr[i10].getClassName(), strArr)) {
                aVar.f40082b = i10;
                jSONArray.put(aVar.a());
                aVar = new a(-1, -1);
            }
        }
        if (aVar.f40081a != -1) {
            aVar.f40082b = stackTraceElementArr.length;
            jSONArray.put(aVar.a());
        }
        return jSONArray;
    }

    public static JSONArray h(String[] strArr, String[] strArr2) {
        a aVar = new a(-1, -1);
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (aVar.f40081a == -1) {
                if (q(strArr[i10], strArr2)) {
                    aVar.f40081a = i10;
                    aVar.f40082b = i10;
                }
            } else if (!q(strArr[i10], strArr2)) {
                aVar.f40082b = i10;
                jSONArray.put(aVar.a());
                aVar = new a(-1, -1);
            }
        }
        if (aVar.f40081a != -1) {
            aVar.f40082b = strArr.length;
            jSONArray.put(aVar.a());
        }
        return jSONArray;
    }

    private static void i(StackTraceElement stackTraceElement, int i10) {
        String str;
        String strValueOf;
        try {
            j("\tat ", i10);
            j(stackTraceElement.getClassName(), i10);
            j(".", i10);
            j(stackTraceElement.getMethodName(), i10);
            if (!stackTraceElement.isNativeMethod()) {
                if (stackTraceElement.getFileName() != null) {
                    if (stackTraceElement.getLineNumber() >= 0) {
                        j("(", i10);
                        j(stackTraceElement.getFileName(), i10);
                        j(":", i10);
                        strValueOf = String.valueOf(stackTraceElement.getLineNumber());
                    } else {
                        j("(", i10);
                        strValueOf = stackTraceElement.getFileName();
                    }
                } else if (stackTraceElement.getLineNumber() >= 0) {
                    j("(Unknown Source:", i10);
                    strValueOf = String.valueOf(stackTraceElement.getLineNumber());
                } else {
                    str = "(Unknown Source)";
                }
                j(strValueOf, i10);
                j(")", i10);
                j("\n", i10);
            }
            str = "(Native Method)";
            j(str, i10);
            j("\n", i10);
        } catch (Throwable unused) {
        }
    }

    private static void j(String str, int i10) {
        NativeImpl.writeFile(i10, str);
    }

    public static void k(Throwable th2, int i10) {
        try {
            u(th2, i10);
        } catch (Throwable unused) {
        }
    }

    private static void l(Throwable th2, int i10, String str, String str2) {
        StackTraceElement[] stackTrace = th2.getStackTrace();
        try {
            NativeImpl.writeFile(i10, str2);
            NativeImpl.writeFile(i10, str);
        } catch (Throwable unused) {
        }
        s(th2, i10);
        for (StackTraceElement stackTraceElement : stackTrace) {
            i(stackTraceElement, i10);
        }
        for (Throwable th3 : th2.getSuppressed()) {
            l(th3, i10, "Suppressed: ", str2 + "\t");
        }
        Throwable cause = th2.getCause();
        if (cause != null) {
            l(cause, i10, "Caused by: ", str2);
        }
    }

    private static void m(Throwable th2, PrintWriter printWriter) {
        if (th2 == null || printWriter == null) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        setNewSetFromMap.add(th2);
        printWriter.println(th2);
        StackTraceElement[] stackTrace = th2.getStackTrace();
        boolean z10 = stackTrace.length > 384;
        int i10 = 0;
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (z10 && i10 > 256) {
                printWriter.println("\t... skip " + ((stackTrace.length - i10) + n5.a.f132012g) + " lines");
                break;
            }
            printWriter.println("\tat " + stackTraceElement);
            i10++;
        }
        if (z10) {
            for (int length = stackTrace.length + n5.a.f132012g; length < stackTrace.length; length++) {
                printWriter.println("\tat " + stackTrace[length]);
            }
        }
        for (Throwable th3 : th2.getSuppressed()) {
            n(th3, printWriter, stackTrace, "Suppressed: ", "\t", setNewSetFromMap, 128);
        }
        Throwable cause = th2.getCause();
        if (cause != null) {
            n(cause, printWriter, stackTrace, "Caused by: ", "", setNewSetFromMap, 128);
        }
    }

    private static void n(Throwable th2, PrintWriter printWriter, StackTraceElement[] stackTraceElementArr, String str, String str2, Set<Throwable> set, int i10) {
        if (set.contains(th2)) {
            printWriter.println("\t[CIRCULAR REFERENCE:" + th2 + "]");
            return;
        }
        set.add(th2);
        StackTraceElement[] stackTrace = th2.getStackTrace();
        boolean z10 = stackTrace.length > i10;
        printWriter.println(str2 + str + th2);
        int length = stackTrace.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            StackTraceElement stackTraceElement = stackTrace[i12];
            if (z10 && i11 > i10) {
                printWriter.println("\t... skip " + ((stackTrace.length - i11) - (i10 / 2)) + " lines");
                break;
            }
            printWriter.println("\tat " + stackTraceElement);
            i11++;
        }
        if (z10) {
            for (int length2 = stackTrace.length - (i10 / 2); length2 < stackTrace.length; length2++) {
                printWriter.println("\tat " + stackTrace[length2]);
            }
        }
        for (Throwable th3 : th2.getSuppressed()) {
            int i13 = i10 / 2;
            n(th3, printWriter, stackTrace, "Suppressed: ", str2 + "\t", set, i13 > 10 ? i13 : 10);
        }
        Throwable cause = th2.getCause();
        if (cause != null) {
            int i14 = i10 / 2;
            n(cause, printWriter, stackTrace, "Caused by: ", str2, set, i14 > 10 ? i14 : 10);
        }
    }

    private static void o(Throwable th2, List<StackTraceElement> list) {
        if (th2 == null || list == null) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        setNewSetFromMap.add(th2);
        list.add(f40080a);
        StackTraceElement[] stackTrace = th2.getStackTrace();
        boolean z10 = stackTrace.length > 384;
        int i10 = 0;
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (z10 && i10 > 256) {
                list.add(f40080a);
                break;
            } else {
                list.add(stackTraceElement);
                i10++;
            }
        }
        if (z10) {
            for (int length = stackTrace.length + n5.a.f132012g; length < stackTrace.length; length++) {
                list.add(stackTrace[length]);
            }
        }
        for (Throwable th3 : th2.getSuppressed()) {
            p(th3, list, stackTrace, "Suppressed: ", "\t", setNewSetFromMap, 128);
        }
        Throwable cause = th2.getCause();
        if (cause != null) {
            p(cause, list, stackTrace, "Caused by: ", "", setNewSetFromMap, 128);
        }
    }

    private static void p(Throwable th2, List<StackTraceElement> list, StackTraceElement[] stackTraceElementArr, String str, String str2, Set<Throwable> set, int i10) {
        if (set.contains(th2)) {
            list.add(f40080a);
            return;
        }
        set.add(th2);
        StackTraceElement[] stackTrace = th2.getStackTrace();
        boolean z10 = stackTrace.length > i10;
        list.add(f40080a);
        int i11 = 0;
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (z10 && i11 > i10) {
                list.add(f40080a);
                break;
            } else {
                list.add(stackTraceElement);
                i11++;
            }
        }
        if (z10) {
            for (int length = stackTrace.length - (i10 / 2); length < stackTrace.length; length++) {
                list.add(stackTrace[length]);
            }
        }
        for (Throwable th3 : th2.getSuppressed()) {
            int i12 = i10 / 2;
            p(th3, list, stackTrace, "Suppressed: ", str2 + "\t", set, i12 > 10 ? i12 : 10);
        }
        Throwable cause = th2.getCause();
        if (cause != null) {
            int i13 = i10 / 2;
            p(cause, list, stackTrace, "Caused by: ", str2, set, i13 > 10 ? i13 : 10);
        }
    }

    public static boolean q(String str, String[] strArr) {
        if (strArr != null && !TextUtils.isEmpty(str)) {
            for (String str2 : strArr) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static JSONObject r(String str) {
        boolean z10;
        try {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            JSONObject jSONObject = new JSONObject();
            if (allStackTraces == null) {
                return null;
            }
            jSONObject.put("thread_all_count", allStackTraces.size());
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
                JSONObject jSONObject2 = new JSONObject();
                Thread key = entry.getKey();
                String name = key.getName();
                if (!v(name) && (str == null || (!str.equals(name) && !name.startsWith(str) && !name.endsWith(str)))) {
                    jSONObject2.put(CrashHianalyticsData.THREAD_NAME, key.getName() + "(" + key.getId() + ")");
                    StackTraceElement[] value = entry.getValue();
                    if (value != null) {
                        JSONArray jSONArray2 = new JSONArray();
                        for (StackTraceElement stackTraceElement : value) {
                            jSONArray2.put(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + "(" + stackTraceElement.getLineNumber() + ")");
                        }
                        jSONObject2.put("thread_stack", jSONArray2);
                        z10 = jSONArray2.length() > 0;
                    }
                    if (z10) {
                        jSONArray.put(jSONObject2);
                    }
                }
            }
            jSONObject.put("thread_stacks", jSONArray);
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void s(Throwable th2, int i10) {
        th2.getClass();
        String localizedMessage = th2.getLocalizedMessage();
        try {
            j(th2.getClass().getName(), i10);
            if (localizedMessage != null) {
                j(": ", i10);
                j(localizedMessage, i10);
            }
            j("\n", i10);
        } catch (Throwable unused) {
        }
    }

    public static StackTraceElement[] t(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        try {
            o(th2, arrayList);
        } catch (Throwable unused) {
        }
        return (StackTraceElement[]) arrayList.toArray(new StackTraceElement[arrayList.size()]);
    }

    private static void u(Throwable th2, int i10) {
        if (th2 == null || i10 <= 0) {
            return;
        }
        s(th2, i10);
        for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
            i(stackTraceElement, i10);
        }
        for (Throwable th3 : th2.getSuppressed()) {
            l(th3, i10, "Suppressed: ", "\t");
        }
        Throwable cause = th2.getCause();
        if (cause != null) {
            l(cause, i10, "Caused by: ", "");
        }
    }

    private static boolean v(String str) {
        Set<String> setA = j.a();
        if (setA.contains(str)) {
            return true;
        }
        for (String str2 : setA) {
            if (!TextUtils.isEmpty(str) && str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean w(Throwable th2) {
        if (th2 == null) {
            return false;
        }
        int i10 = 0;
        while (th2 != null) {
            try {
                if (th2 instanceof OutOfMemoryError) {
                    return true;
                }
                if (i10 > 20) {
                    return false;
                }
                i10++;
                th2 = th2.getCause();
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static boolean x(Throwable th2) {
        if (th2 == null) {
            return false;
        }
        int i10 = 0;
        while (th2 != null) {
            try {
                if ((th2 instanceof OutOfMemoryError) && (th2.getMessage().contains("allocate") || th2.getMessage().contains("thrown"))) {
                    return true;
                }
                if (i10 > 20) {
                    return false;
                }
                i10++;
                th2 = th2.getCause();
            } catch (Throwable unused) {
                return true;
            }
        }
        return false;
    }
}
