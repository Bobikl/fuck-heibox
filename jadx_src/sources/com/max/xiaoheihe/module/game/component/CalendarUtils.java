package com.max.xiaoheihe.module.game.component;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CalendarContract;
import android.util.Log;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.FragmentActivity;
import com.max.hbpermission.PermissionManager;
import com.max.hbutils.utils.k;
import com.max.xiaoheihe.bean.game.calendar.DayObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.analytics.pro.ao;
import dl.d;
import dl.e;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.t;
import xh.m;
import yh.l;

/* JADX INFO: compiled from: CalendarUtils.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nCalendarUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarUtils.kt\ncom/max/xiaoheihe/module/game/component/CalendarUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,494:1\n1#2:495\n*E\n"})
@o(parameters = 0)
public final class CalendarUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final CalendarUtils f86571a = new CalendarUtils();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    public static final String f86572b = "CalendarUtils";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f86573c = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: CalendarUtils.kt */
    public enum MonthPosition {
        BEFORE_MONTH,
        IN_MONTH,
        AFTER_MONTH;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static MonthPosition valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 36280, new Class[]{String.class}, MonthPosition.class);
            return (MonthPosition) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(MonthPosition.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static MonthPosition[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 36279, new Class[0], MonthPosition[].class);
            return (MonthPosition[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }
    }

    /* JADX INFO: compiled from: CalendarUtils.kt */
    public static final class a implements com.max.hbpermission.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f86574a;

        a(yh.a<b2> aVar) {
            this.f86574a = aVar;
        }

        @Override // com.max.hbpermission.c
        public final void onResult() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36281, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            this.f86574a.invoke();
        }
    }

    private CalendarUtils() {
    }

    public static final /* synthetic */ long a(CalendarUtils calendarUtils, Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{calendarUtils, context}, null, changeQuickRedirect, true, 36278, new Class[]{CalendarUtils.class, Context.class}, Long.TYPE);
        return patchProxyResultProxy.isSupported ? ((Long) patchProxyResultProxy.result).longValue() : calendarUtils.c(context);
    }

    public static final /* synthetic */ int b(CalendarUtils calendarUtils, Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{calendarUtils, context}, null, changeQuickRedirect, true, 36277, new Class[]{CalendarUtils.class, Context.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : calendarUtils.v(context);
    }

    private final long c(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 36273, new Class[]{Context.class}, Long.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Long) patchProxyResultProxy.result).longValue();
        }
        TimeZone timeZone = TimeZone.getDefault();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", com.max.xiaoheihe.utils.d.A());
        contentValues.put("account_name", com.max.xiaoheihe.utils.d.A());
        contentValues.put("account_type", "heybox");
        contentValues.put("calendar_displayName", com.max.xiaoheihe.utils.d.A());
        contentValues.put("visible", (Integer) 1);
        contentValues.put("calendar_color", (Integer) (-16776961));
        contentValues.put("calendar_access_level", (Integer) 700);
        contentValues.put("sync_events", (Integer) 1);
        contentValues.put("calendar_timezone", timeZone.getID());
        contentValues.put("ownerAccount", "heybox");
        contentValues.put("canOrganizerRespond", (Integer) 0);
        contentValues.put("caller_is_syncadapter", Boolean.TRUE);
        ContentResolver contentResolver = context.getContentResolver();
        f0.o(contentResolver, "context.contentResolver");
        Uri uriInsert = contentResolver.insert(CalendarContract.Calendars.CONTENT_URI, contentValues);
        if (uriInsert == null) {
            return -1L;
        }
        return ContentUris.parseId(uriInsert);
    }

    @m
    public static final int p(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 36258, new Class[]{cls, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(i10, i11, 1);
        return calendar.getActualMaximum(5);
    }

    @m
    public static final int q(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 36257, new Class[]{cls, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(i10, i11, 1);
        return calendar.get(7);
    }

    private final int v(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 36272, new Class[]{Context.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        ContentResolver contentResolver = context.getContentResolver();
        f0.o(contentResolver, "context.contentResolver");
        Cursor cursorQuery = contentResolver.query(CalendarContract.Calendars.CONTENT_URI, null, null, null, null);
        int i10 = -1;
        if (cursorQuery != null && cursorQuery.getCount() != 0) {
            try {
                cursorQuery.moveToFirst();
                int columnIndex = cursorQuery.getColumnIndex(ao.f104522d);
                if (columnIndex >= 0) {
                    i10 = cursorQuery.getInt(columnIndex);
                }
            } catch (Throwable unused) {
            }
            cursorQuery.close();
        }
        return i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(@d final Context context, @e final String str, @e final String str2, final long j10, final long j11, final boolean z10, final boolean z11, @e final Integer num, @d final l<? super Integer, b2> callback) {
        FragmentActivity fragmentActivity;
        Object[] objArr = {context, str, str2, new Long(j10), new Long(j11), new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), num, callback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        Class cls2 = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 36274, new Class[]{Context.class, String.class, String.class, cls, cls, cls2, cls2, Integer.class, l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(callback, "callback");
        yh.a<b2> aVar = new yh.a<b2>() { // from class: com.max.xiaoheihe.module.game.component.CalendarUtils$addCalendarEvent$createEvent$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36283, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                String lastPathSegment;
                Long lA1;
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36282, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                CalendarUtils calendarUtils = CalendarUtils.f86571a;
                if (calendarUtils.e(context, str, j10, j11)) {
                    callback.invoke(2);
                    return;
                }
                ContentResolver contentResolver = context.getContentResolver();
                f0.o(contentResolver, "context.contentResolver");
                ContentValues contentValues = new ContentValues();
                int iB = CalendarUtils.b(calendarUtils, context);
                if (iB == -1) {
                    CalendarUtils.a(calendarUtils, context);
                    iB = CalendarUtils.b(calendarUtils, context);
                }
                contentValues.put("calendar_id", Integer.valueOf(iB));
                contentValues.put("title", str);
                contentValues.put("description", str2);
                long j12 = j10;
                if (j12 > 0) {
                    contentValues.put("dtstart", Long.valueOf(j12));
                }
                long j13 = j11;
                if (j13 > 0) {
                    contentValues.put("dtend", Long.valueOf(j13));
                }
                contentValues.put("allDay", Boolean.valueOf(z10));
                contentValues.put("eventTimezone", TimeZone.getDefault().getID());
                contentValues.put("hasAlarm", Boolean.valueOf(z11));
                Uri uriInsert = contentResolver.insert(CalendarContract.Events.CONTENT_URI, contentValues);
                long jLongValue = (uriInsert == null || (lastPathSegment = uriInsert.getLastPathSegment()) == null || (lA1 = t.a1(lastPathSegment)) == null) ? -1L : lA1.longValue();
                if (!(jLongValue != -1)) {
                    callback.invoke(0);
                    return;
                }
                Integer num2 = num;
                if (num2 != null && num2.intValue() > 0) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("event_id", Long.valueOf(jLongValue));
                    contentValues2.put("minutes", num);
                    contentValues2.put("method", (Integer) 1);
                    context.getContentResolver().insert(CalendarContract.Reminders.CONTENT_URI, contentValues2);
                }
                callback.invoke(1);
            }
        };
        try {
            if (context instanceof FragmentActivity) {
                fragmentActivity = (FragmentActivity) context;
            } else {
                CalendarUtils$addCalendarEvent$fragmentActivity$1 calendarUtils$addCalendarEvent$fragmentActivity$1 = new yh.a<Activity>() { // from class: com.max.xiaoheihe.module.game.component.CalendarUtils$addCalendarEvent$fragmentActivity$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    public final Activity a() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36284, new Class[0], Activity.class);
                        return patchProxyResultProxy.isSupported ? (Activity) patchProxyResultProxy.result : com.max.hbutils.utils.e.b().a();
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [android.app.Activity, java.lang.Object] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ Activity invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36285, new Class[0], Object.class);
                        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
                    }
                };
                f0.n(calendarUtils$addCalendarEvent$fragmentActivity$1, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                fragmentActivity = (FragmentActivity) calendarUtils$addCalendarEvent$fragmentActivity$1;
            }
            PermissionManager.f71603a.L(fragmentActivity, new a(aVar));
        } catch (Throwable unused) {
            callback.invoke(0);
        }
    }

    public final boolean e(@e Context context, @e String str, long j10, long j11) {
        Cursor cursorQuery;
        Object[] objArr = {context, str, new Long(j10), new Long(j11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 36275, new Class[]{Context.class, String.class, cls, cls}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (context == null || !PermissionManager.f71603a.m(context, "android.permission.WRITE_CALENDAR", "android.permission.READ_CALENDAR") || (cursorQuery = context.getContentResolver().query(CalendarContract.Events.CONTENT_URI, null, null, null, null)) == null) {
            return false;
        }
        try {
            if (cursorQuery.getCount() > 0) {
                String string = "";
                Long lValueOf = null;
                Long lValueOf2 = null;
                while (cursorQuery.moveToNext()) {
                    int columnIndex = cursorQuery.getColumnIndex("title");
                    if (columnIndex >= 0) {
                        string = cursorQuery.getString(columnIndex);
                        f0.o(string, "eventCursor.getString(titleIndex)");
                    }
                    int columnIndex2 = cursorQuery.getColumnIndex("dtstart");
                    if (columnIndex2 > 0) {
                        String string2 = cursorQuery.getString(columnIndex2);
                        f0.o(string2, "eventCursor.getString(startIndex)");
                        lValueOf = Long.valueOf(Long.parseLong(string2));
                    }
                    int columnIndex3 = cursorQuery.getColumnIndex("dtend");
                    if (columnIndex3 > 0) {
                        String string3 = cursorQuery.getString(columnIndex3);
                        f0.o(string3, "eventCursor.getString(endIndex)");
                        lValueOf2 = Long.valueOf(Long.parseLong(string3));
                    }
                    if (str != null && f0.g(str, string) && lValueOf != null && j10 == lValueOf.longValue() && lValueOf2 != null && j11 == lValueOf2.longValue()) {
                        cursorQuery.close();
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        cursorQuery.close();
        return false;
    }

    public final int f(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 36263, new Class[]{cls, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(i10, i11, 1);
        int i12 = calendar.get(7);
        int actualMaximum = calendar.getActualMaximum(5);
        int i13 = (i12 - 1) + actualMaximum;
        int i14 = (i13 / 7) + (i13 % 7 != 0 ? 1 : 0);
        Log.d(f86572b, "getCalendarRowCount  " + i10 + " 年 " + (i11 + 1) + " 月  daysInMonth: " + actualMaximum + "  rowCount: " + i14);
        return i14;
    }

    public final long g() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36270, new Class[0], Long.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Long) patchProxyResultProxy.result).longValue();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis() / ((long) 1000);
    }

    @d
    public final MonthPosition h(long j10, long j11) {
        Object[] objArr = {new Long(j10), new Long(j11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 36269, new Class[]{cls, cls}, MonthPosition.class);
        if (patchProxyResultProxy.isSupported) {
            return (MonthPosition) patchProxyResultProxy.result;
        }
        Calendar calendar = Calendar.getInstance();
        long j12 = 1000;
        calendar.setTimeInMillis(j10 * j12);
        int i10 = calendar.get(2);
        int i11 = calendar.get(1);
        calendar.setTimeInMillis(j11 * j12);
        int i12 = calendar.get(2);
        int i13 = calendar.get(1);
        if (i13 < i11 || (i13 == i11 && i12 < i10)) {
            return MonthPosition.BEFORE_MONTH;
        }
        return (i13 == i11 && i12 == i10) ? MonthPosition.IN_MONTH : MonthPosition.AFTER_MONTH;
    }

    public final int i(long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, 36261, new Class[]{Long.TYPE}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Date date = new Date(j10 * ((long) 1000));
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            return calendar.get(5);
        } catch (Exception e10) {
            Log.e(f86572b, "getDay " + e10.getMessage());
            return 0;
        }
    }

    public final int j(long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, 36271, new Class[]{Long.TYPE}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j10 * ((long) 1000));
        return calendar.get(5);
    }

    public final int k(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 36267, new Class[]{cls, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, i10);
        calendar.set(2, i11);
        calendar.set(5, 1);
        int firstDayOfWeek = 7 - (((((calendar.get(7) - calendar.getFirstDayOfWeek()) + 7) % 7) + calendar.getActualMaximum(5)) % 7);
        Log.d(f86572b, "getDaysAfterMonth " + i10 + " 年 " + (i11 + 1) + " 月  days: " + firstDayOfWeek);
        return firstDayOfWeek;
    }

    public final int l(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 36265, new Class[]{cls, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, i10);
        calendar.set(2, i11);
        calendar.set(5, 1);
        int firstDayOfWeek = ((calendar.get(7) - calendar.getFirstDayOfWeek()) + 7) % 7;
        Log.d(f86572b, "getDaysBeforeMonth " + i10 + " 年 " + (i11 + 1) + " 月  days: " + firstDayOfWeek);
        return firstDayOfWeek;
    }

    @e
    public final Date m(@e Date date) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{date}, this, changeQuickRedirect, false, 36262, new Class[]{Date.class}, Date.class);
        if (patchProxyResultProxy.isSupported) {
            return (Date) patchProxyResultProxy.result;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(calendar.get(1), calendar.get(2), 1);
        return calendar.getTime();
    }

    public final long n(long j10) {
        Object[] objArr = {new Long(j10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 36276, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Long) patchProxyResultProxy.result).longValue();
        }
        Calendar calendar = Calendar.getInstance();
        long j11 = 1000;
        calendar.setTimeInMillis(j10 * j11);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis() / j11;
    }

    public final int o(long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, 36260, new Class[]{Long.TYPE}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Date date = new Date(j10 * ((long) 1000));
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            return calendar.get(2);
        } catch (Exception e10) {
            Log.e(f86572b, "getMonth " + e10.getMessage());
            return 0;
        }
    }

    @d
    public final List<DayObj> r(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 36266, new Class[]{cls, cls}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(i10, i11, 1);
        calendar.set(5, calendar.getActualMaximum(5));
        int firstDayOfWeek = (7 - (((calendar.get(7) - calendar.getFirstDayOfWeek()) + 7) % 7)) % 7;
        ArrayList arrayList = new ArrayList();
        int i12 = i11 != 11 ? i11 + 1 : 0;
        int i13 = i11 == 11 ? i10 + 1 : i10;
        if (1 <= firstDayOfWeek) {
            int i14 = 1;
            while (true) {
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(i13, i12, i14, 0, 0, 0);
                arrayList.add(new DayObj(String.valueOf(calendar2.getTimeInMillis() / ((long) 1000)), null, null, 6, null));
                if (i14 == firstDayOfWeek) {
                    break;
                }
                i14++;
            }
        }
        Log.d(f86572b, "getNextMonthExtraDates " + i10 + " 年 " + (i11 + 1) + " 月  dates: " + k.p(arrayList));
        return arrayList;
    }

    @d
    public final List<DayObj> s(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 36264, new Class[]{cls, cls}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, i10);
        calendar.set(2, i11);
        calendar.set(5, 1);
        int firstDayOfWeek = ((calendar.get(7) - calendar.getFirstDayOfWeek()) + 7) % 7;
        ArrayList arrayList = new ArrayList();
        int i12 = i11 == 0 ? 11 : i11 - 1;
        int i13 = i11 == 0 ? i10 - 1 : i10;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(1, i13);
        calendar2.set(2, i12);
        calendar2.set(5, 1);
        int actualMaximum = calendar2.getActualMaximum(5);
        int i14 = actualMaximum + 1;
        for (int i15 = (actualMaximum - firstDayOfWeek) + 1; i15 < i14; i15++) {
            Calendar calendar3 = Calendar.getInstance();
            calendar3.set(1, i13);
            calendar3.set(2, i12);
            calendar3.set(5, i15);
            calendar3.set(11, 0);
            calendar3.set(12, 0);
            calendar3.set(13, 0);
            arrayList.add(new DayObj(String.valueOf(calendar3.getTimeInMillis() / ((long) 1000)), null, null, 6, null));
        }
        Log.d(f86572b, "getPreviousMonthExtraDates " + i10 + " 年 " + (i11 + 1) + " 月  dates: " + k.p(arrayList));
        return arrayList;
    }

    public final int t(long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, 36259, new Class[]{Long.TYPE}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Date date = new Date(j10 * ((long) 1000));
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            return calendar.get(1);
        } catch (Exception e10) {
            Log.e(f86572b, "getYear " + e10.getMessage());
            return 0;
        }
    }

    public final boolean u(long j10, long j11) {
        Object[] objArr = {new Long(j10), new Long(j11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 36268, new Class[]{cls, cls}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        Calendar calendar = Calendar.getInstance();
        long j12 = 1000;
        calendar.setTimeInMillis(j10 * j12);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j11 * j12);
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        return calendar2.get(1) == calendar.get(1) && calendar2.get(2) == calendar.get(2);
    }
}
