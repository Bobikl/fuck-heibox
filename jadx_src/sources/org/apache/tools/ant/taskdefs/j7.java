package org.apache.tools.ant.taskdefs;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.StringTokenizer;
import java.util.TimeZone;
import java.util.Vector;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Location;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: Tstamp.java */
/* JADX INFO: loaded from: classes5.dex */
public class j7 extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f134348m = "SOURCE_DATE_EPOCH";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List<a> f134349k = new Vector();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f134350l = "";

    /* JADX INFO: compiled from: Tstamp.java */
    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private TimeZone f134351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f134352b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f134353c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f134354d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f134355e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f134356f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f134357g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f134358h = 5;

        public a() {
        }

        public void a(Project project, Date date, Location location) {
            SimpleDateFormat simpleDateFormat;
            if (this.f134352b == null) {
                throw new BuildException("property attribute must be provided", location);
            }
            if (this.f134353c == null) {
                throw new BuildException("pattern attribute must be provided", location);
            }
            if (this.f134354d == null) {
                simpleDateFormat = new SimpleDateFormat(this.f134353c);
            } else {
                simpleDateFormat = this.f134356f == null ? new SimpleDateFormat(this.f134353c, new Locale(this.f134354d, this.f134355e)) : new SimpleDateFormat(this.f134353c, new Locale(this.f134354d, this.f134355e, this.f134356f));
            }
            if (this.f134357g != 0) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);
                calendar.add(this.f134358h, this.f134357g);
                date = calendar.getTime();
            }
            TimeZone timeZone = this.f134351a;
            if (timeZone != null) {
                simpleDateFormat.setTimeZone(timeZone);
            }
            j7.this.x2(this.f134352b, simpleDateFormat.format(date));
        }

        public void b(String str) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, " \t\n\r\f,");
            try {
                this.f134354d = stringTokenizer.nextToken();
                if (!stringTokenizer.hasMoreElements()) {
                    this.f134355e = "";
                    return;
                }
                this.f134355e = stringTokenizer.nextToken();
                if (stringTokenizer.hasMoreElements()) {
                    this.f134356f = stringTokenizer.nextToken();
                    if (stringTokenizer.hasMoreElements()) {
                        throw new BuildException("bad locale format", j7.this.w1());
                    }
                }
            } catch (NoSuchElementException e10) {
                throw new BuildException("bad locale format", e10, j7.this.w1());
            }
        }

        public void c(int i10) {
            this.f134357g = i10;
        }

        public void d(String str) {
            this.f134353c = str;
        }

        public void e(String str) {
            this.f134352b = str;
        }

        public void f(String str) {
            this.f134351a = TimeZone.getTimeZone(str);
        }

        @Deprecated
        public void g(String str) {
            j7.this.log("DEPRECATED - The setUnit(String) method has been deprecated. Use setUnit(Tstamp.Unit) instead.");
            b bVar = new b();
            bVar.g(str);
            this.f134358h = bVar.h();
        }

        public void h(b bVar) {
            this.f134358h = bVar.h();
        }
    }

    /* JADX INFO: compiled from: Tstamp.java */
    public static class b extends org.apache.tools.ant.types.w {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final String f134360d = "millisecond";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f134361e = "second";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f134362f = "minute";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f134363g = "hour";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f134364h = "day";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f134365i = "week";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f134366j = "month";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f134367k = "year";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String[] f134368l = {"millisecond", "second", "minute", "hour", "day", "week", f134366j, f134367k};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Map<String, Integer> f134369c;

        public b() {
            HashMap map = new HashMap();
            this.f134369c = map;
            map.put("millisecond", 14);
            this.f134369c.put("second", 13);
            this.f134369c.put("minute", 12);
            this.f134369c.put("hour", 11);
            this.f134369c.put("day", 5);
            this.f134369c.put("week", 3);
            this.f134369c.put(f134366j, 2);
            this.f134369c.put(f134367k, 1);
        }

        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return f134368l;
        }

        public int h() {
            return this.f134369c.get(d().toLowerCase(Locale.ENGLISH)).intValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r2(Date date, a aVar) {
        aVar.a(b(), date, w1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Date s2(String str) {
        return Date.from(Instant.parse(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String t2(String str, String str2) {
        return "magic property " + str + " ignored as '" + str2 + "' is not in valid ISO pattern";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Date u2(String str) {
        return new Date(Long.parseLong(str) * 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String v2(String str, String str2) {
        return "magic property " + str + " ignored as " + str2 + " is not a valid number";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x2(String str, String str2) {
        b().n1(this.f134350l + str, str2);
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        try {
            final Date dateP2 = p2();
            String str = System.getenv(f134348m);
            if (str != null) {
                try {
                    Date date = new Date(Integer.parseInt(str) * 1000);
                    try {
                        log("Honouring environment variable SOURCE_DATE_EPOCH which has been set to " + str);
                        dateP2 = date;
                    } catch (NumberFormatException unused) {
                        dateP2 = date;
                        x1("Ignoring invalid value '" + str + "' for " + f134348m + " environment variable", 4);
                    }
                } catch (NumberFormatException unused2) {
                }
            }
            this.f134349k.forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.d7
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f134053b.r2(dateP2, (j7.a) obj);
                }
            });
            x2("DSTAMP", new SimpleDateFormat("yyyyMMdd").format(dateP2));
            x2("TSTAMP", new SimpleDateFormat("HHmm").format(dateP2));
            x2("TODAY", new SimpleDateFormat("MMMM d yyyy", Locale.US).format(dateP2));
        } catch (Exception e10) {
            throw new BuildException(e10);
        }
    }

    public a o2() {
        a aVar = new a();
        this.f134349k.add(aVar);
        return aVar;
    }

    protected Date p2() {
        Optional<Date> optionalQ2 = q2(org.apache.tools.ant.j1.N, new Function() { // from class: org.apache.tools.ant.taskdefs.e7
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return j7.s2((String) obj);
            }
        }, new BiFunction() { // from class: org.apache.tools.ant.taskdefs.f7
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return j7.t2((String) obj, (String) obj2);
            }
        });
        return optionalQ2.isPresent() ? optionalQ2.get() : q2(org.apache.tools.ant.j1.M, new Function() { // from class: org.apache.tools.ant.taskdefs.g7
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return j7.u2((String) obj);
            }
        }, new BiFunction() { // from class: org.apache.tools.ant.taskdefs.h7
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return j7.v2((String) obj, (String) obj2);
            }
        }).orElseGet(new Supplier() { // from class: org.apache.tools.ant.taskdefs.i7
            @Override // java.util.function.Supplier
            public final Object get() {
                return new Date();
            }
        });
    }

    protected Optional<Date> q2(String str, Function<String, Date> function, BiFunction<String, String, String> biFunction) {
        String strU0 = b().u0(str);
        if (strU0 != null && !strU0.isEmpty()) {
            try {
                return Optional.ofNullable(function.apply(strU0));
            } catch (Exception unused) {
                log(biFunction.apply(str, strU0));
            }
        }
        return Optional.empty();
    }

    public void w2(String str) {
        this.f134350l = str;
        if (str.endsWith(".")) {
            return;
        }
        this.f134350l += ".";
    }
}
