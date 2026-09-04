package org.apache.tools.ant.taskdefs.cvslib;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TimeZone;
import java.util.function.Function;
import org.apache.tools.ant.taskdefs.x;

/* JADX INFO: compiled from: ChangeLogParser.java */
/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f133990n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f133991o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f133992p = 3;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f133993q = 4;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f133994r = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SimpleDateFormat f133995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SimpleDateFormat f133996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f133997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f133998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f133999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f134000f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f134001g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f134002h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f134003i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map<String, a> f134004j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f134005k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String[] f134006l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int[] f134007m;

    public d() {
        this(false, "", Collections.emptyList());
    }

    public d(boolean z10, String str, List<org.apache.tools.ant.taskdefs.c.a> list) {
        Locale locale = Locale.US;
        this.f133995a = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.f133996b = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z", locale);
        this.f134003i = 1;
        this.f134004j = new Hashtable();
        this.f134005k = z10;
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str);
            while (stringTokenizer.hasMoreTokens()) {
                arrayList.add(stringTokenizer.nextToken());
            }
        }
        list.stream().map(new Function() { // from class: org.apache.tools.ant.taskdefs.cvslib.b
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((org.apache.tools.ant.taskdefs.c.a) obj).a();
            }
        }).forEach(new x(arrayList));
        String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        this.f134006l = strArr;
        this.f134007m = new int[strArr.length];
        int i10 = 0;
        while (true) {
            String[] strArr2 = this.f134006l;
            if (i10 >= strArr2.length) {
                TimeZone timeZone = TimeZone.getTimeZone("UTC");
                this.f133995a.setTimeZone(timeZone);
                this.f133996b.setTimeZone(timeZone);
                return;
            }
            this.f134007m[i10] = strArr2[i10].length();
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ a c(String str) {
        return new a(d(this.f133998d), this.f133999e, this.f134000f);
    }

    private Date d(String str) {
        try {
            try {
                return this.f133995a.parse(str);
            } catch (ParseException unused) {
                return this.f133996b.parse(str);
            }
        } catch (ParseException unused2) {
            throw new IllegalStateException("Invalid date format: " + str);
        }
    }

    private void e(String str) {
        if ("=============================================================================".equals(str)) {
            this.f134000f = this.f134000f.substring(0, this.f134000f.length() - System.lineSeparator().length());
            k();
            this.f134003i = 1;
            return;
        }
        if ("----------------------------".equals(str)) {
            this.f134000f = this.f134000f.substring(0, this.f134000f.length() - System.lineSeparator().length());
            this.f134003i = 5;
        } else {
            this.f134000f += str + System.lineSeparator();
        }
    }

    private void f(String str) {
        if (str.startsWith("date:")) {
            int iIndexOf = str.indexOf(59);
            this.f133998d = str.substring(6, iIndexOf);
            int iIndexOf2 = str.indexOf("author: ", iIndexOf + 1);
            this.f133999e = str.substring(8 + iIndexOf2, str.indexOf(59, iIndexOf2 + 1));
            this.f134003i = 3;
            this.f134000f = "";
        }
    }

    private void g(String str) {
        if (!this.f134005k && str.startsWith("Working file:")) {
            this.f133997c = str.substring(14);
            this.f134003i = 4;
            return;
        }
        if (this.f134005k && str.startsWith("RCS file:")) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                String[] strArr = this.f134006l;
                if (i11 >= strArr.length) {
                    break;
                }
                int iIndexOf = str.indexOf(strArr[i11]);
                if (iIndexOf >= 0) {
                    i10 = iIndexOf + this.f134007m[i11] + 1;
                    break;
                }
                i11++;
            }
            int iIndexOf2 = str.indexOf(",v");
            if (iIndexOf2 == -1) {
                this.f133997c = str.substring(i10);
            } else {
                this.f133997c = str.substring(i10, iIndexOf2);
            }
            this.f134003i = 4;
        }
    }

    private void h(String str) {
        if (!str.startsWith("revision ")) {
            throw new IllegalStateException("Unexpected line from CVS: " + str);
        }
        this.f134002h = str.substring(9);
        k();
        this.f134001g = this.f134002h;
        this.f134003i = 2;
    }

    private void i(String str) {
        if (str.startsWith("revision")) {
            this.f134001g = str.substring(9);
            this.f134003i = 2;
        } else if (str.startsWith("======")) {
            this.f134003i = 1;
        }
    }

    private void k() {
        ((a) this.f134004j.computeIfAbsent(this.f133998d + this.f133999e + this.f134000f, new Function() { // from class: org.apache.tools.ant.taskdefs.cvslib.c
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f133989a.c((String) obj);
            }
        })).b(this.f133997c, this.f134001g, this.f134002h);
    }

    public a[] b() {
        return (a[]) this.f134004j.values().toArray(new a[this.f134004j.size()]);
    }

    public void j() {
        this.f133997c = null;
        this.f133998d = null;
        this.f133999e = null;
        this.f134000f = null;
        this.f134001g = null;
        this.f134002h = null;
    }

    public void l(String str) {
        int i10 = this.f134003i;
        if (i10 == 1) {
            j();
            g(str);
            return;
        }
        if (i10 == 2) {
            f(str);
            return;
        }
        if (i10 == 3) {
            e(str);
        } else if (i10 == 4) {
            i(str);
        } else {
            if (i10 != 5) {
                return;
            }
            h(str);
        }
    }
}
