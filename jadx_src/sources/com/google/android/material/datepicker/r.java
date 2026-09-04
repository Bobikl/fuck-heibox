package com.google.android.material.datepicker;

import androidx.annotation.p0;
import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: compiled from: TimeSource.java */
/* JADX INFO: loaded from: classes7.dex */
public class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final r f54170c = new r(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private final Long f54171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final TimeZone f54172b;

    private r(@p0 Long l10, @p0 TimeZone timeZone) {
        this.f54171a = l10;
        this.f54172b = timeZone;
    }

    static r a(long j10) {
        return new r(Long.valueOf(j10), null);
    }

    static r b(long j10, @p0 TimeZone timeZone) {
        return new r(Long.valueOf(j10), timeZone);
    }

    static r e() {
        return f54170c;
    }

    Calendar c() {
        return d(this.f54172b);
    }

    Calendar d(@p0 TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l10 = this.f54171a;
        if (l10 != null) {
            calendar.setTimeInMillis(l10.longValue());
        }
        return calendar;
    }
}
