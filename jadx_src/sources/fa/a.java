package fa;

import android.os.Build;
import android.text.format.DateFormat;
import com.max.hbutils.utils.w;
import com.umeng.analytics.pro.ak;
import dl.d;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: StringUtils.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00052\b\b\u0002\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lfa/a;", "", "", "time", "format", "", ak.av, "b", "e", "<init>", "()V", "date_time_picker_release"}, k = 1, mv = {1, 5, 1})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final a f118821a = new a();

    private a() {
    }

    public static /* synthetic */ long c(a aVar, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = w.f73604k;
        }
        return aVar.a(str, str2);
    }

    public static /* synthetic */ String d(a aVar, long j10, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = w.f73604k;
        }
        return aVar.b(j10, str);
    }

    public final long a(@d String time, @d String format) {
        f0.p(time, "time");
        f0.p(format, "format");
        if (Build.VERSION.SDK_INT >= 26) {
            return LocalDateTime.parse(time, DateTimeFormatter.ofPattern(format)).toInstant(ZoneOffset.ofHours(8)).toEpochMilli();
        }
        try {
            Date date = new SimpleDateFormat(format, Locale.getDefault()).parse(time);
            if (date == null) {
                return 0L;
            }
            return date.getTime();
        } catch (ParseException e10) {
            e10.printStackTrace();
            return 0L;
        }
    }

    @d
    public final String b(long time, @d String format) {
        f0.p(format, "format");
        return DateFormat.format(format, time).toString();
    }

    @d
    public final String e(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        switch (calendar.get(7)) {
            case 1:
                return "周日";
            case 2:
                return "周一";
            case 3:
                return "周二";
            case 4:
                return "周三";
            case 5:
                return "周四";
            case 6:
                return "周五";
            case 7:
                return "周六";
            default:
                return "";
        }
    }
}
