package com.loper7.date_time_picker.ext;

import bb.c;
import com.lzy.okgo.model.Progress;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import dl.d;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b0;
import kotlin.jvm.internal.f0;
import kotlin.z;
import org.apache.tools.ant.taskdefs.p7;
import x9.b;

/* JADX INFO: compiled from: CalendarExt.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u001a\"\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000\u001a@\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003*\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0000\u001a\u0016\u0010\f\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u000f\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0000\u001a$\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0013\u001a\u00020\u0001*\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\f\u0010\u0014\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\u0014\u0010\u0016\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000H\u0000\u001a\u0014\u0010\u0017\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000H\u0000\u001a\u0014\u0010\u0018\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000H\u0000\u001a\u0014\u0010\u0019\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000H\u0000\u001a\u0014\u0010\u001a\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000H\u0000\u001a\u0014\u0010\u001b\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000H\u0000¨\u0006\u001e²\u0006\f\u0010\u001c\u001a\u00020\u00018\nX\u008a\u0084\u0002²\u0006\f\u0010\u001d\u001a\u00020\u00018\nX\u008a\u0084\u0002"}, d2 = {"Ljava/util/Calendar;", "", "year", "", "", "l", b.f141154s, b.f141155t, "", "startContain", "endContain", RXScreenCaptureService.KEY_HEIGHT, "e", "Ljava/util/Date;", Progress.L, "g", p7.a.f135571i, ak.av, "Ljava/util/GregorianCalendar;", ak.aF, "d", "calendar", ak.aB, "q", "n", "o", "p", "r", "startYear", "endYear", "date_time_picker_release"}, k = 2, mv = {1, 5, 1})
public final class CalendarExtKt {
    @d
    public static final List<Long> a(@d Calendar calendar, int i10, int i11) {
        f0.p(calendar, "<this>");
        if (i10 < 1900 || i10 > 9999) {
            throw new NullPointerException("The year must be within 1900-9999");
        }
        calendar.setFirstDayOfWeek(2);
        calendar.set(7, 2);
        calendar.setMinimalDaysInFirstWeek(7);
        calendar.set(1, i10);
        calendar.set(3, i11);
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            arrayList.add(Long.valueOf(calendar.getTimeInMillis() + ((long) (i12 * 86400000))));
            if (i13 >= 7) {
                return arrayList;
            }
            i12 = i13;
        }
    }

    public static /* synthetic */ List b(Calendar calendar, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = Calendar.getInstance().get(1);
        }
        return a(calendar, i10, i11);
    }

    public static final int c(@d GregorianCalendar gregorianCalendar, int i10) {
        f0.p(gregorianCalendar, "<this>");
        gregorianCalendar.set(1, i10);
        return (gregorianCalendar.isLeapYear(i10) ? 1 : 0) + c.b.f30532b4;
    }

    public static final int d(@d Calendar calendar) {
        f0.p(calendar, "<this>");
        return calendar.getActualMaximum(5);
    }

    public static final int e(@d Calendar calendar, int i10) {
        f0.p(calendar, "<this>");
        calendar.set(i10, 11, 31, 0, 0, 0);
        Date time = calendar.getTime();
        f0.o(time, "time");
        return g(calendar, time);
    }

    public static /* synthetic */ int f(Calendar calendar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = Calendar.getInstance().get(1);
        }
        return e(calendar, i10);
    }

    public static final int g(@d Calendar calendar, @d Date date) {
        f0.p(calendar, "<this>");
        f0.p(date, "date");
        calendar.setFirstDayOfWeek(2);
        calendar.setMinimalDaysInFirstWeek(7);
        calendar.setTime(date);
        return calendar.get(3);
    }

    @d
    public static final List<List<Long>> h(@d final Calendar calendar, final long j10, final long j11, boolean z10, boolean z11) throws Exception {
        f0.p(calendar, "<this>");
        if (j10 != 0 && j11 != 0 && j10 > j11) {
            throw new Exception("startDate > endDate");
        }
        z zVarC = b0.c(new yh.a<Integer>() { // from class: com.loper7.date_time_picker.ext.CalendarExtKt$getWeeks$startYear$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            public final int a() {
                long j12 = j10;
                if (j12 <= 0) {
                    return Calendar.getInstance().get(1);
                }
                calendar.setTimeInMillis(j12);
                return calendar.get(1);
            }

            @Override // yh.a
            public /* bridge */ /* synthetic */ Integer invoke() {
                return Integer.valueOf(a());
            }
        });
        z zVarC2 = b0.c(new yh.a<Integer>() { // from class: com.loper7.date_time_picker.ext.CalendarExtKt$getWeeks$endYear$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            public final int a() {
                long j12 = j11;
                if (j12 <= 0) {
                    return Calendar.getInstance().get(1);
                }
                calendar.setTimeInMillis(j12);
                return calendar.get(1);
            }

            @Override // yh.a
            public /* bridge */ /* synthetic */ Integer invoke() {
                return Integer.valueOf(a());
            }
        });
        ArrayList arrayList = new ArrayList();
        int iJ = j(zVarC);
        int iK = k(zVarC2);
        if (iJ <= iK) {
            while (true) {
                int i10 = iJ + 1;
                arrayList.addAll(l(calendar, iJ));
                if (iJ == iK) {
                    break;
                }
                iJ = i10;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            List list = (List) it.next();
            if ((j10 > 0 && ((Number) list.get(list.size() - 1)).longValue() < j10) || (j11 > 0 && ((Number) list.get(0)).longValue() > j11)) {
                it.remove();
            }
            if (!z10 && a.a(list, j10)) {
                it.remove();
            }
            if (!z11 && a.a(list, j11)) {
                it.remove();
            }
        }
        return arrayList;
    }

    public static /* synthetic */ List i(Calendar calendar, long j10, long j11, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        if ((i10 & 2) != 0) {
            j11 = 0;
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        return h(calendar, j10, j11, z10, z11);
    }

    private static final int j(z<Integer> zVar) {
        return zVar.getValue().intValue();
    }

    private static final int k(z<Integer> zVar) {
        return zVar.getValue().intValue();
    }

    @d
    public static final List<List<Long>> l(@d Calendar calendar, int i10) {
        f0.p(calendar, "<this>");
        if (i10 < 1900 || i10 > 9999) {
            throw new NullPointerException("The year must be within 1900-9999");
        }
        calendar.setFirstDayOfWeek(2);
        calendar.set(7, 2);
        calendar.setMinimalDaysInFirstWeek(7);
        int i11 = 1;
        calendar.set(1, i10);
        ArrayList arrayList = new ArrayList();
        int iE = e(calendar, i10);
        if (1 <= iE) {
            while (true) {
                int i12 = i11 + 1;
                arrayList.add(a(calendar, i10, i11));
                if (i11 == iE) {
                    break;
                }
                i11 = i12;
            }
        }
        return arrayList;
    }

    public static /* synthetic */ List m(Calendar calendar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = Calendar.getInstance().get(1);
        }
        return l(calendar, i10);
    }

    public static final boolean n(@d Calendar calendar, @d Calendar calendar2) {
        f0.p(calendar, "<this>");
        f0.p(calendar2, "calendar");
        return s(calendar, calendar2) && calendar.get(6) == calendar2.get(6);
    }

    public static final boolean o(@d Calendar calendar, @d Calendar calendar2) {
        f0.p(calendar, "<this>");
        f0.p(calendar2, "calendar");
        return n(calendar, calendar2) && calendar.get(11) == calendar2.get(11);
    }

    public static final boolean p(@d Calendar calendar, @d Calendar calendar2) {
        f0.p(calendar, "<this>");
        f0.p(calendar2, "calendar");
        return o(calendar, calendar2) && calendar.get(12) == calendar2.get(12);
    }

    public static final boolean q(@d Calendar calendar, @d Calendar calendar2) {
        f0.p(calendar, "<this>");
        f0.p(calendar2, "calendar");
        return s(calendar, calendar2) && calendar.get(2) == calendar2.get(2);
    }

    public static final boolean r(@d Calendar calendar, @d Calendar calendar2) {
        f0.p(calendar, "<this>");
        f0.p(calendar2, "calendar");
        return p(calendar, calendar2) && calendar.get(13) == calendar2.get(13);
    }

    public static final boolean s(@d Calendar calendar, @d Calendar calendar2) {
        f0.p(calendar, "<this>");
        f0.p(calendar2, "calendar");
        return calendar.get(1) == calendar2.get(1);
    }
}
