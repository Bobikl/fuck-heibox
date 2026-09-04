package com.apm.lite.nativecrash;

import com.apm.lite.k.k;
import com.apm.lite.k.o;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f40109i = Pattern.compile("^pid:\\s(.*),\\stid:\\s(.*),\\sname:\\s(.*)\\s+>>>\\s(.*)\\s<<<$");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f40110j = Pattern.compile("^signal\\s(.*),\\scode\\s(.*),\\sfault\\saddr\\s(.*)$");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f40111k = Pattern.compile("^Abort message: (.*)$");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f40112l = Pattern.compile("^Crash message: (.*)$");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f40113m = Pattern.compile("^    \\/(\\w*)\\/.*\\/(.*\\.so)\\s\\(BuildId: ([a-f0-9]*)\\)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f40114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f40115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f40116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f40117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f40118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f40119f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f40120g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map<String, String> f40121h = new HashMap();

    public e(File file) {
        f(o.i(file));
    }

    private void f(File file) {
        String str;
        if (!file.exists() || file.length() == 0) {
            return;
        }
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            int i10 = 0;
            while (true) {
                try {
                    String line = bufferedReader2.readLine();
                    if (line == null || i10 >= 64) {
                        break;
                    }
                    if (this.f40114a == null && line.startsWith("pid: ")) {
                        Matcher matcher = f40109i.matcher(line);
                        if (matcher.find() && matcher.groupCount() == 4) {
                            this.f40114a = matcher.group(1);
                            this.f40115b = matcher.group(2);
                            this.f40117d = matcher.group(3);
                            this.f40116c = matcher.group(4);
                        }
                    } else if (this.f40118e == null && line.startsWith("signal ")) {
                        Matcher matcher2 = f40110j.matcher(line);
                        if (matcher2.find() && matcher2.groupCount() == 3) {
                            String strReplace = matcher2.group(1).replace(" ", "");
                            String strReplace2 = matcher2.group(2).replace(" ", "");
                            int iIndexOf = strReplace2.indexOf("frompid");
                            if (iIndexOf > 0) {
                                strReplace2 = strReplace2.substring(0, iIndexOf) + ")";
                            }
                            this.f40118e = "Signal " + strReplace + ", Code " + strReplace2 + "\n";
                        }
                    } else if (this.f40119f == null && line.startsWith("Abort ")) {
                        Matcher matcher3 = f40111k.matcher(line);
                        if (matcher3.find() && matcher3.groupCount() == 1) {
                            str = "abort message: " + matcher3.group(1) + "\n";
                            this.f40119f = str;
                        }
                    } else if (this.f40119f == null && line.startsWith("Crash ")) {
                        Matcher matcher4 = f40112l.matcher(line);
                        if (matcher4.find() && matcher4.groupCount() == 1) {
                            str = "crash message: " + matcher4.group(1) + "\n";
                            this.f40119f = str;
                        }
                    } else if (this.f40120g != null || !line.startsWith("backtrace:")) {
                        if (this.f40121h.isEmpty() && line.startsWith("build id:")) {
                            while (true) {
                                String line2 = bufferedReader2.readLine();
                                if (line2 == null || !line2.contains("BuildId:")) {
                                    break;
                                    break;
                                }
                                Matcher matcher5 = f40113m.matcher(line2);
                                if (matcher5.find()) {
                                    String strGroup = matcher5.group(1);
                                    String strGroup2 = matcher5.group(2);
                                    String strGroup3 = matcher5.group(3);
                                    if (strGroup.equals("data")) {
                                        this.f40121h.put(strGroup2, strGroup3);
                                    }
                                }
                            }
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        while (true) {
                            String line3 = bufferedReader2.readLine();
                            if (line3 == null || !line3.startsWith("    #")) {
                                break;
                            }
                            sb2.append(line3.substring(4));
                            sb2.append('\n');
                        }
                        i10++;
                        this.f40120g = sb2.toString();
                    }
                    i10++;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    try {
                        com.apm.lite.c.a();
                        com.apm.lite.c.b("NPTH_CATCH", th);
                        return;
                    } finally {
                        k.a(bufferedReader);
                    }
                }
            }
            k.a(bufferedReader2);
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public String a() {
        return this.f40120g;
    }

    public void b(File file) {
        File fileI = o.i(file);
        if (fileI.exists()) {
            fileI.renameTo(new File(fileI.getAbsoluteFile() + ".old"));
        }
        NativeImpl.rebuildTombstone(file);
        f(o.i(file));
    }

    public Map<String, String> c() {
        return this.f40121h;
    }

    public void d(File file) {
        f(o.i(file));
    }

    public String e() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.f40118e;
        if (str != null) {
            sb2.append(str);
        }
        String str2 = this.f40119f;
        if (str2 != null) {
            sb2.append(str2);
        }
        String str3 = this.f40120g;
        if (str3 != null) {
            sb2.append(str3);
        }
        return sb2.toString();
    }
}
