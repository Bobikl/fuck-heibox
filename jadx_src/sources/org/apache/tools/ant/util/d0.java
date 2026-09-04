package org.apache.tools.ant.util;

import com.xiaomi.mipush.sdk.Constants;
import java.text.ChoiceFormat;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: DateUtils.java */
/* JADX INFO: loaded from: classes5.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f136740a = 1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f136741b = 60;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f136742c = 60;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f136743d = 10;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f136744e = "yyyy-MM-dd'T'HH:mm:ss";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f136745f = "yyyy-MM-dd";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f136746g = "HH:mm:ss";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final DateFormat f136747h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final DateFormat f136748i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final MessageFormat f136749j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final double[] f136750k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String[] f136751l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String[] f136752m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ChoiceFormat f136753n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final ChoiceFormat f136754o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final ThreadLocal<DateFormat> f136755p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final ThreadLocal<DateFormat> f136756q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final ThreadLocal<DateFormat> f136757r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Pattern f136758s;

    static {
        Locale locale = Locale.US;
        f136747h = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss ", locale);
        f136748i = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss ", locale);
        MessageFormat messageFormat = new MessageFormat("{0}{1}");
        f136749j = messageFormat;
        double[] dArr = {0.0d, 1.0d, 2.0d};
        f136750k = dArr;
        String[] strArr = {"", "1 minute ", "{0,number,###############} minutes "};
        f136751l = strArr;
        String[] strArr2 = {"0 seconds", "1 second", "{1,number} seconds"};
        f136752m = strArr2;
        ChoiceFormat choiceFormat = new ChoiceFormat(dArr, strArr);
        f136753n = choiceFormat;
        ChoiceFormat choiceFormat2 = new ChoiceFormat(dArr, strArr2);
        f136754o = choiceFormat2;
        f136755p = ThreadLocal.withInitial(new Supplier() { // from class: org.apache.tools.ant.util.a0
            @Override // java.util.function.Supplier
            public final Object get() {
                return d0.j();
            }
        });
        f136756q = ThreadLocal.withInitial(new Supplier() { // from class: org.apache.tools.ant.util.b0
            @Override // java.util.function.Supplier
            public final Object get() {
                return d0.k();
            }
        });
        messageFormat.setFormat(0, choiceFormat);
        messageFormat.setFormat(1, choiceFormat2);
        f136757r = ThreadLocal.withInitial(new Supplier() { // from class: org.apache.tools.ant.util.c0
            @Override // java.util.function.Supplier
            public final Object get() {
                return d0.l();
            }
        });
        f136758s = Pattern.compile("^(\\d{4,}-\\d{2}-\\d{2})[Tt ](\\d{2}:\\d{2}(:\\d{2}(\\.\\d{3})?)?) ?(?:Z|([+-]\\d{2})(?::?(\\d{2}))?)?$");
    }

    private d0() {
    }

    private static DateFormat d(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        simpleDateFormat.setLenient(true);
        return simpleDateFormat;
    }

    public static String e(long j10, String str) {
        return f(new Date(j10), str);
    }

    public static String f(Date date, String str) {
        return d(str).format(date);
    }

    public static String g(long j10) {
        long j11 = j10 / 1000;
        return f136749j.format(new Object[]{Long.valueOf(j11 / 60), Long.valueOf(j11 % 60)});
    }

    public static String h() {
        String str;
        Calendar calendar = Calendar.getInstance();
        int offset = calendar.getTimeZone().getOffset(calendar.get(0), calendar.get(1), calendar.get(2), calendar.get(5), calendar.get(7), calendar.get(14));
        StringBuilder sb2 = new StringBuilder(offset < 0 ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : "+");
        int iAbs = Math.abs(offset);
        int i10 = iAbs / 3600000;
        int i11 = (iAbs / 60000) - (i10 * 60);
        if (i10 < 10) {
            sb2.append("0");
        }
        sb2.append(i10);
        if (i11 < 10) {
            sb2.append("0");
        }
        sb2.append(i11);
        DateFormat dateFormat = f136748i;
        synchronized (dateFormat) {
            str = dateFormat.format(calendar.getTime()) + sb2.toString();
        }
        return str;
    }

    public static int i(Calendar calendar) {
        int i10 = calendar.get(6);
        int i11 = ((calendar.get(1) - 1900) % 19) + 1;
        int i12 = ((i11 * 11) + 18) % 30;
        if ((i12 == 25 && i11 > 11) || i12 == 24) {
            i12++;
        }
        return (((((i10 + i12) * 6) + 11) % 177) / 22) & 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DateFormat j() {
        return new SimpleDateFormat("MM/dd/yyyy hh:mm a", Locale.US);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DateFormat k() {
        return new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a", Locale.US);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DateFormat l() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS Z");
    }

    public static Date m(String str) throws ParseException {
        Date date;
        DateFormat dateFormat = f136748i;
        synchronized (dateFormat) {
            date = dateFormat.parse(str);
        }
        return date;
    }

    public static Date n(String str) throws ParseException {
        return new SimpleDateFormat("yyyy-MM-dd").parse(str);
    }

    public static Date o(String str) throws ParseException {
        return new SimpleDateFormat(f136744e).parse(str);
    }

    public static Date p(String str) throws ParseException {
        try {
            return o(str);
        } catch (ParseException unused) {
            return n(str);
        }
    }

    public static Date q(String str) throws ParseException {
        String strGroup;
        try {
            try {
                try {
                    return new Date(Long.parseLong(str));
                } catch (ParseException unused) {
                    Matcher matcher = f136758s.matcher(str);
                    if (!matcher.find()) {
                        throw new ParseException(str, 0);
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(matcher.group(1));
                    sb2.append(" ");
                    if (matcher.group(3) == null) {
                        strGroup = matcher.group(2) + ":00";
                    } else {
                        strGroup = matcher.group(2);
                    }
                    sb2.append(strGroup);
                    sb2.append(matcher.group(4) == null ? ".000 " : " ");
                    sb2.append(matcher.group(5) == null ? "+00" : matcher.group(5));
                    sb2.append(matcher.group(6) == null ? org.apache.tools.tar.c.V : matcher.group(6));
                    return f136757r.get().parse(sb2.toString());
                }
            } catch (ParseException unused2) {
                return f136756q.get().parse(str);
            }
        } catch (NumberFormatException unused3) {
            return f136755p.get().parse(str);
        }
    }
}
