package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Build;
import android.text.format.DateUtils;
import androidx.annotation.p0;
import com.google.android.material.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: DateStrings.java */
/* JADX INFO: loaded from: classes7.dex */
public class h {
    private h() {
    }

    static androidx.core.util.k<String, String> a(@p0 Long l10, @p0 Long l11) {
        return b(l10, l11, null);
    }

    static androidx.core.util.k<String, String> b(@p0 Long l10, @p0 Long l11, @p0 SimpleDateFormat simpleDateFormat) {
        if (l10 == null && l11 == null) {
            return androidx.core.util.k.a(null, null);
        }
        if (l10 == null) {
            return androidx.core.util.k.a(null, d(l11.longValue(), simpleDateFormat));
        }
        if (l11 == null) {
            return androidx.core.util.k.a(d(l10.longValue(), simpleDateFormat), null);
        }
        Calendar calendarT = s.t();
        Calendar calendarV = s.v();
        calendarV.setTimeInMillis(l10.longValue());
        Calendar calendarV2 = s.v();
        calendarV2.setTimeInMillis(l11.longValue());
        if (simpleDateFormat != null) {
            return androidx.core.util.k.a(simpleDateFormat.format(new Date(l10.longValue())), simpleDateFormat.format(new Date(l11.longValue())));
        }
        if (calendarV.get(1) == calendarV2.get(1)) {
            return calendarV.get(1) == calendarT.get(1) ? androidx.core.util.k.a(g(l10.longValue(), Locale.getDefault()), g(l11.longValue(), Locale.getDefault())) : androidx.core.util.k.a(g(l10.longValue(), Locale.getDefault()), n(l11.longValue(), Locale.getDefault()));
        }
        return androidx.core.util.k.a(n(l10.longValue(), Locale.getDefault()), n(l11.longValue(), Locale.getDefault()));
    }

    static String c(long j10) {
        return d(j10, null);
    }

    static String d(long j10, @p0 SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat != null) {
            return simpleDateFormat.format(new Date(j10));
        }
        return q(j10) ? f(j10) : m(j10);
    }

    static String e(Context context, long j10, boolean z10, boolean z11, boolean z12) {
        String strJ = j(j10);
        if (z10) {
            strJ = String.format(context.getString(R.string.mtrl_picker_today_description), strJ);
        }
        if (z11) {
            return String.format(context.getString(R.string.mtrl_picker_start_date_description), strJ);
        }
        return z12 ? String.format(context.getString(R.string.mtrl_picker_end_date_description), strJ) : strJ;
    }

    static String f(long j10) {
        return g(j10, Locale.getDefault());
    }

    static String g(long j10, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? s.c(locale).format(new Date(j10)) : s.o(locale).format(new Date(j10));
    }

    static String h(long j10) {
        return i(j10, Locale.getDefault());
    }

    static String i(long j10, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? s.d(locale).format(new Date(j10)) : s.k(locale).format(new Date(j10));
    }

    static String j(long j10) {
        return q(j10) ? h(j10) : o(j10);
    }

    static String k(Context context, int i10) {
        return s.t().get(1) == i10 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i10)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i10));
    }

    static String l(long j10) {
        return Build.VERSION.SDK_INT >= 24 ? s.z(Locale.getDefault()).format(new Date(j10)) : DateUtils.formatDateTime(null, j10, bb.c.k.f33818r6);
    }

    static String m(long j10) {
        return n(j10, Locale.getDefault());
    }

    static String n(long j10, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? s.x(locale).format(new Date(j10)) : s.m(locale).format(new Date(j10));
    }

    static String o(long j10) {
        return p(j10, Locale.getDefault());
    }

    static String p(long j10, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? s.y(locale).format(new Date(j10)) : s.k(locale).format(new Date(j10));
    }

    private static boolean q(long j10) {
        Calendar calendarT = s.t();
        Calendar calendarV = s.v();
        calendarV.setTimeInMillis(j10);
        return calendarT.get(1) == calendarV.get(1);
    }
}
