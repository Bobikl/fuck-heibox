package com.huawei.hms.scankit.p;

import com.huawei.hms.ml.scan.HmsScan;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: CalendarDateTimeParser.java */
/* JADX INFO: loaded from: classes7.dex */
public final class d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f61665a = Pattern.compile("(\\d{4})(\\d{2})(\\d{2})T(\\d{2})(\\d{2})(\\d{2})Z");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f61666b = Pattern.compile("(\\d{4})(\\d{2})(\\d{2})T(\\d{2})(\\d{2})(\\d{2})");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f61667c = Pattern.compile("(\\d{4})(\\d{2})(\\d{2})");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f61668d = Pattern.compile("(\\d{4})(\\d{2})(\\d{2})\\d{6}Z");

    private static void a(HmsScan.EventTime eventTime, int i10, int i11, int i12) {
        eventTime.year = i10;
        eventTime.month = i11;
        eventTime.day = i12;
    }

    static void a(String str, HmsScan.EventTime eventTime) {
        Matcher matcher = f61665a.matcher(str);
        Matcher matcher2 = f61666b.matcher(str);
        Matcher matcher3 = f61667c.matcher(str);
        Matcher matcher4 = f61668d.matcher(str);
        try {
            if (matcher.matches()) {
                a(eventTime, Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)), Integer.parseInt(matcher.group(3)));
                b(eventTime, Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
                eventTime.isUTCTime = true;
                eventTime.originalValue = str;
            } else if (matcher2.matches()) {
                a(eventTime, Integer.parseInt(matcher2.group(1)), Integer.parseInt(matcher2.group(2)), Integer.parseInt(matcher2.group(3)));
                b(eventTime, Integer.parseInt(matcher2.group(4)), Integer.parseInt(matcher2.group(5)), Integer.parseInt(matcher2.group(6)));
                eventTime.originalValue = str;
            } else if (matcher3.matches()) {
                a(eventTime, Integer.parseInt(matcher3.group(1)), Integer.parseInt(matcher3.group(2)), Integer.parseInt(matcher3.group(3)));
                eventTime.originalValue = str;
            } else if (matcher4.matches()) {
                a(eventTime, Integer.parseInt(matcher4.group(1)), Integer.parseInt(matcher4.group(2)), Integer.parseInt(matcher4.group(3)));
            }
        } catch (NullPointerException unused) {
            o4.b("exception", "NullPointerException");
        }
    }

    private static void b(HmsScan.EventTime eventTime, int i10, int i11, int i12) {
        eventTime.hours = i10;
        eventTime.minutes = i11;
        eventTime.seconds = i12;
    }
}
