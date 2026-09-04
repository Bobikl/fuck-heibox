package com.elvishew.xlog.flattener;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import z5.g;

/* JADX INFO: compiled from: PatternFlattener.java */
/* JADX INFO: loaded from: classes6.dex */
public class e implements com.elvishew.xlog.flattener.d, com.elvishew.xlog.flattener.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f42886c = "[^{}]*";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f42887d = Pattern.compile("\\{([^{}]*)\\}");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f42888e = "d";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f42889f = "l";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f42890g = "L";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f42891h = "t";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f42892i = "m";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final String f42893j = "yyyy-MM-dd HH:mm:ss.SSS";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f42894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<d> f42895b;

    /* JADX INFO: compiled from: PatternFlattener.java */
    public static class a extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f42896c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ThreadLocal<SimpleDateFormat> f42897d;

        /* JADX INFO: renamed from: com.elvishew.xlog.flattener.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: PatternFlattener.java */
        public class C0358a extends ThreadLocal<SimpleDateFormat> {
            C0358a() {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SimpleDateFormat initialValue() {
                return new SimpleDateFormat(a.this.f42896c, Locale.US);
            }
        }

        a(String str, String str2, String str3) {
            super(str, str2);
            C0358a c0358a = new C0358a();
            this.f42897d = c0358a;
            this.f42896c = str3;
            try {
                c0358a.get().format(new Date());
            } catch (Exception e10) {
                throw new IllegalArgumentException("Bad date pattern: " + str3, e10);
            }
        }

        @Override // com.elvishew.xlog.flattener.e.d
        protected String a(String str, long j10, int i10, String str2, String str3) {
            return str.replace(this.f42900a, this.f42897d.get().format(new Date(j10)));
        }
    }

    /* JADX INFO: compiled from: PatternFlattener.java */
    public static class b extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f42899c;

        b(String str, String str2, boolean z10) {
            super(str, str2);
            this.f42899c = z10;
        }

        @Override // com.elvishew.xlog.flattener.e.d
        protected String a(String str, long j10, int i10, String str2, String str3) {
            return this.f42899c ? str.replace(this.f42900a, com.elvishew.xlog.d.a(i10)) : str.replace(this.f42900a, com.elvishew.xlog.d.b(i10));
        }
    }

    /* JADX INFO: compiled from: PatternFlattener.java */
    public static class c extends d {
        c(String str, String str2) {
            super(str, str2);
        }

        @Override // com.elvishew.xlog.flattener.e.d
        protected String a(String str, long j10, int i10, String str2, String str3) {
            return str.replace(this.f42900a, str3);
        }
    }

    /* JADX INFO: compiled from: PatternFlattener.java */
    public static abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f42900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f42901b;

        d(String str, String str2) {
            this.f42900a = str;
            this.f42901b = str2;
        }

        protected abstract String a(String str, long j10, int i10, String str2, String str3);
    }

    /* JADX INFO: renamed from: com.elvishew.xlog.flattener.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PatternFlattener.java */
    public static class C0359e extends d {
        C0359e(String str, String str2) {
            super(str, str2);
        }

        @Override // com.elvishew.xlog.flattener.e.d
        protected String a(String str, long j10, int i10, String str2, String str3) {
            return str.replace(this.f42900a, str2);
        }
    }

    public e(String str) {
        if (str == null) {
            throw new NullPointerException("Pattern should not be null");
        }
        this.f42894a = str;
        List<d> listG = g(h(str));
        this.f42895b = listG;
        if (listG.size() != 0) {
            return;
        }
        throw new IllegalArgumentException("No recognizable parameter found in the pattern " + str);
    }

    static a c(String str, String str2) {
        if (str2.startsWith("d ") && str2.length() > 2) {
            return new a(str, str2, str2.substring(2));
        }
        if (str2.equals(f42888e)) {
            return new a(str, str2, f42893j);
        }
        return null;
    }

    static b d(String str, String str2) {
        if (str2.equals(f42889f)) {
            return new b(str, str2, false);
        }
        if (str2.equals(f42890g)) {
            return new b(str, str2, true);
        }
        return null;
    }

    static c e(String str, String str2) {
        if (str2.equals(f42892i)) {
            return new c(str, str2);
        }
        return null;
    }

    private static d f(String str) {
        String str2 = "{" + str + g.f141884d;
        String strTrim = str.trim();
        a aVarC = c(str2, strTrim);
        if (aVarC != null) {
            return aVarC;
        }
        b bVarD = d(str2, strTrim);
        if (bVarD != null) {
            return bVarD;
        }
        C0359e c0359eI = i(str2, strTrim);
        if (c0359eI != null) {
            return c0359eI;
        }
        c cVarE = e(str2, strTrim);
        if (cVarE != null) {
            return cVarE;
        }
        return null;
    }

    private static List<d> g(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            d dVarF = f(it.next());
            if (dVarF != null) {
                arrayList.add(dVarF);
            }
        }
        return arrayList;
    }

    static List<String> h(String str) {
        ArrayList arrayList = new ArrayList(4);
        Matcher matcher = f42887d.matcher(str);
        while (matcher.find()) {
            arrayList.add(matcher.group(1));
        }
        return arrayList;
    }

    static C0359e i(String str, String str2) {
        if (str2.equals("t")) {
            return new C0359e(str, str2);
        }
        return null;
    }

    @Override // com.elvishew.xlog.flattener.c
    public CharSequence a(long j10, int i10, String str, String str2) {
        String str3 = this.f42894a;
        Iterator<d> it = this.f42895b.iterator();
        String strA = str3;
        while (it.hasNext()) {
            strA = it.next().a(strA, j10, i10, str, str2);
        }
        return strA;
    }

    @Override // com.elvishew.xlog.flattener.d
    public CharSequence b(int i10, String str, String str2) {
        return a(System.currentTimeMillis(), i10, str, str2);
    }
}
