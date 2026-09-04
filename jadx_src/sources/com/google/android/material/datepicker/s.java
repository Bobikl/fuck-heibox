package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.google.android.material.R;
import com.xiaomi.mipush.sdk.Constants;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: UtcDates.java */
/* JADX INFO: loaded from: classes7.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f54173a = "UTC";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static AtomicReference<r> f54174b = new AtomicReference<>();

    private s() {
    }

    @n0
    private static String A(@n0 String str) {
        int iB = b(str, "yY", 1, 0);
        if (iB >= str.length()) {
            return str;
        }
        String str2 = "EMd";
        int iB2 = b(str, "EMd", 1, iB);
        if (iB2 < str.length()) {
            str2 = "EMd" + Constants.ACCEPT_TIME_SEPARATOR_SP;
        }
        return str.replace(str.substring(b(str, str2, -1, iB) + 1, iB2), " ").trim();
    }

    static void B(@p0 r rVar) {
        f54174b.set(rVar);
    }

    static long a(long j10) {
        Calendar calendarV = v();
        calendarV.setTimeInMillis(j10);
        return f(calendarV).getTimeInMillis();
    }

    private static int b(@n0 String str, @n0 String str2, int i10, int i11) {
        while (i11 >= 0 && i11 < str.length() && str2.indexOf(str.charAt(i11)) == -1) {
            if (str.charAt(i11) == '\'') {
                do {
                    i11 += i10;
                    if (i11 < 0 || i11 >= str.length()) {
                        break;
                    }
                } while (str.charAt(i11) != '\'');
            }
            i11 += i10;
        }
        return i11;
    }

    @TargetApi(24)
    static DateFormat c(Locale locale) {
        return e("MMMd", locale);
    }

    @TargetApi(24)
    static DateFormat d(Locale locale) {
        return e("MMMEd", locale);
    }

    @TargetApi(24)
    private static DateFormat e(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(u());
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton;
    }

    static Calendar f(Calendar calendar) {
        Calendar calendarW = w(calendar);
        Calendar calendarV = v();
        calendarV.set(calendarW.get(1), calendarW.get(2), calendarW.get(5));
        return calendarV;
    }

    static SimpleDateFormat g() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) java.text.DateFormat.getDateInstance(3, Locale.getDefault())).toPattern().replaceAll("\\s+", ""), Locale.getDefault());
        simpleDateFormat.setTimeZone(s());
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    static String h(Resources resources, SimpleDateFormat simpleDateFormat) {
        String pattern = simpleDateFormat.toPattern();
        String string = resources.getString(R.string.mtrl_picker_text_input_year_abbr);
        String string2 = resources.getString(R.string.mtrl_picker_text_input_month_abbr);
        String string3 = resources.getString(R.string.mtrl_picker_text_input_day_abbr);
        if (pattern.replaceAll("[^y]", "").length() == 1) {
            pattern = pattern.replace("y", "yyyy");
        }
        return pattern.replace("d", string3).replace("M", string2).replace("y", string);
    }

    private static java.text.DateFormat i(int i10, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i10, locale);
        dateInstance.setTimeZone(s());
        return dateInstance;
    }

    static java.text.DateFormat j() {
        return k(Locale.getDefault());
    }

    static java.text.DateFormat k(Locale locale) {
        return i(0, locale);
    }

    static java.text.DateFormat l() {
        return m(Locale.getDefault());
    }

    static java.text.DateFormat m(Locale locale) {
        return i(2, locale);
    }

    static java.text.DateFormat n() {
        return o(Locale.getDefault());
    }

    static java.text.DateFormat o(Locale locale) {
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) m(locale);
        simpleDateFormat.applyPattern(A(simpleDateFormat.toPattern()));
        return simpleDateFormat;
    }

    static SimpleDateFormat p(String str) {
        return q(str, Locale.getDefault());
    }

    private static SimpleDateFormat q(String str, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(s());
        return simpleDateFormat;
    }

    static r r() {
        r rVar = f54174b.get();
        return rVar == null ? r.e() : rVar;
    }

    private static TimeZone s() {
        return TimeZone.getTimeZone(f54173a);
    }

    static Calendar t() {
        Calendar calendarC = r().c();
        calendarC.set(11, 0);
        calendarC.set(12, 0);
        calendarC.set(13, 0);
        calendarC.set(14, 0);
        calendarC.setTimeZone(s());
        return calendarC;
    }

    @TargetApi(24)
    private static android.icu.util.TimeZone u() {
        return android.icu.util.TimeZone.getTimeZone(f54173a);
    }

    static Calendar v() {
        return w(null);
    }

    static Calendar w(@p0 Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(s());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    @TargetApi(24)
    static DateFormat x(Locale locale) {
        return e("yMMMd", locale);
    }

    @TargetApi(24)
    static DateFormat y(Locale locale) {
        return e("yMMMEd", locale);
    }

    @TargetApi(24)
    static DateFormat z(Locale locale) {
        return e("yMMMM", locale);
    }
}
