package com.loper7.date_time_picker.controller;

import com.loper7.date_time_picker.ext.CalendarExtKt;
import com.loper7.date_time_picker.number_picker.NumberPicker;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import dl.e;
import fi.o;
import fi.u;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: DateTimeController.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b8\u00109J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u001a\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0000H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J \u0010\u0017\u001a\u00020\u00022\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u001e\u0010\u001a\u001a\u00020\u00022\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0018H\u0016J\b\u0010\u001b\u001a\u00020\u000eH\u0016R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001dR\u0018\u0010$\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001dR\u0018\u0010%\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0018\u0010&\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001dR\u0016\u0010)\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010(R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010(R\u0016\u0010+\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0016\u0010\u000b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00100\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001e\u00103\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u0006:"}, d2 = {"Lcom/loper7/date_time_picker/controller/c;", "Lcom/loper7/date_time_picker/controller/a;", "Lkotlin/b2;", "f", "l", "j", "", "type", "Lcom/loper7/date_time_picker/number_picker/NumberPicker;", "picker", RXScreenCaptureService.KEY_HEIGHT, "global", "g", "i", "", "time", "setDefaultMillisecond", "setMinMillisecond", "setMaxMillisecond", "", "types", "", "wrapSelector", "setWrapSelectorWheel", "Lkotlin/Function1;", "callback", "setOnDateTimeChangedListener", "getMillisecond", "b", "Lcom/loper7/date_time_picker/number_picker/NumberPicker;", "mYearSpinner", ak.aF, "mMonthSpinner", "d", "mDaySpinner", "e", "mHourSpinner", "mMinuteSpinner", "mSecondSpinner", "Ljava/util/Calendar;", "Ljava/util/Calendar;", "calendar", "minCalendar", "maxCalendar", "k", "I", "m", "Z", "wrapSelectorWheel", "n", "Ljava/util/List;", "wrapSelectorWheelTypes", "Lcom/loper7/date_time_picker/number_picker/NumberPicker$h;", "o", "Lcom/loper7/date_time_picker/number_picker/NumberPicker$h;", "onChangeListener", "<init>", "()V", "date_time_picker_release"}, k = 1, mv = {1, 5, 1})
public class c extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @e
    private NumberPicker mYearSpinner;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @e
    private NumberPicker mMonthSpinner;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @e
    private NumberPicker mDaySpinner;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @e
    private NumberPicker mHourSpinner;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @e
    private NumberPicker mMinuteSpinner;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @e
    private NumberPicker mSecondSpinner;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Calendar calendar;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private Calendar minCalendar;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Calendar maxCalendar;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int global;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @e
    private l<? super Long, b2> f64429l;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @e
    private List<Integer> wrapSelectorWheelTypes;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean wrapSelectorWheel = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final NumberPicker.h onChangeListener = new NumberPicker.h() { // from class: com.loper7.date_time_picker.controller.b
        @Override // com.loper7.date_time_picker.number_picker.NumberPicker.h
        public final void a(NumberPicker numberPicker, int i10, int i11) {
            c.k(this.f64418a, numberPicker, i10, i11);
        }
    };

    private final void f() {
        NumberPicker numberPicker;
        Calendar calendar = this.calendar;
        if (calendar == null) {
            f0.S("calendar");
            throw null;
        }
        calendar.clear();
        NumberPicker numberPicker2 = this.mYearSpinner;
        if (numberPicker2 != null) {
            Calendar calendar2 = this.calendar;
            if (calendar2 == null) {
                f0.S("calendar");
                throw null;
            }
            calendar2.set(1, numberPicker2.getValue());
        }
        NumberPicker numberPicker3 = this.mMonthSpinner;
        if (numberPicker3 != null) {
            Calendar calendar3 = this.calendar;
            if (calendar3 == null) {
                f0.S("calendar");
                throw null;
            }
            calendar3.set(2, numberPicker3.getValue() - 1);
        }
        NumberPicker numberPicker4 = this.mYearSpinner;
        Integer numValueOf = numberPicker4 == null ? null : Integer.valueOf(numberPicker4.getValue());
        NumberPicker numberPicker5 = this.mMonthSpinner;
        int iD = d(numValueOf, Integer.valueOf((numberPicker5 == null ? 0 : numberPicker5.getValue()) - 1));
        NumberPicker numberPicker6 = this.mDaySpinner;
        if ((numberPicker6 != null ? numberPicker6.getValue() : 0) >= iD && (numberPicker = this.mDaySpinner) != null) {
            numberPicker.setValue(iD);
        }
        NumberPicker numberPicker7 = this.mDaySpinner;
        if (numberPicker7 != null) {
            Calendar calendar4 = this.calendar;
            if (calendar4 == null) {
                f0.S("calendar");
                throw null;
            }
            calendar4.set(5, numberPicker7.getValue());
        }
        NumberPicker numberPicker8 = this.mHourSpinner;
        if (numberPicker8 != null) {
            Calendar calendar5 = this.calendar;
            if (calendar5 == null) {
                f0.S("calendar");
                throw null;
            }
            calendar5.set(11, numberPicker8.getValue());
        }
        NumberPicker numberPicker9 = this.mMinuteSpinner;
        if (numberPicker9 != null) {
            Calendar calendar6 = this.calendar;
            if (calendar6 == null) {
                f0.S("calendar");
                throw null;
            }
            calendar6.set(12, numberPicker9.getValue());
        }
        NumberPicker numberPicker10 = this.mSecondSpinner;
        if (numberPicker10 == null) {
            return;
        }
        Calendar calendar7 = this.calendar;
        if (calendar7 != null) {
            calendar7.set(13, numberPicker10.getValue());
        } else {
            f0.S("calendar");
            throw null;
        }
    }

    private final void j() {
        NumberPicker numberPicker;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Calendar calendar = this.calendar;
        if (calendar == null) {
            f0.S("calendar");
            throw null;
        }
        long timeInMillis = calendar.getTimeInMillis();
        Calendar calendar2 = this.minCalendar;
        if (calendar2 == null) {
            f0.S("minCalendar");
            throw null;
        }
        if (timeInMillis < calendar2.getTimeInMillis()) {
            Calendar calendar3 = this.calendar;
            if (calendar3 == null) {
                f0.S("calendar");
                throw null;
            }
            calendar3.clear();
            Calendar calendar4 = this.calendar;
            if (calendar4 == null) {
                f0.S("calendar");
                throw null;
            }
            Calendar calendar5 = this.minCalendar;
            if (calendar5 == null) {
                f0.S("minCalendar");
                throw null;
            }
            calendar4.setTimeInMillis(calendar5.getTimeInMillis());
        }
        Calendar calendar6 = this.calendar;
        if (calendar6 == null) {
            f0.S("calendar");
            throw null;
        }
        long timeInMillis2 = calendar6.getTimeInMillis();
        Calendar calendar7 = this.maxCalendar;
        if (calendar7 == null) {
            f0.S("maxCalendar");
            throw null;
        }
        if (timeInMillis2 > calendar7.getTimeInMillis()) {
            Calendar calendar8 = this.calendar;
            if (calendar8 == null) {
                f0.S("calendar");
                throw null;
            }
            calendar8.clear();
            Calendar calendar9 = this.calendar;
            if (calendar9 == null) {
                f0.S("calendar");
                throw null;
            }
            Calendar calendar10 = this.maxCalendar;
            if (calendar10 == null) {
                f0.S("maxCalendar");
                throw null;
            }
            calendar9.setTimeInMillis(calendar10.getTimeInMillis());
        }
        Calendar calendar11 = this.calendar;
        if (calendar11 == null) {
            f0.S("calendar");
            throw null;
        }
        Integer numValueOf = Integer.valueOf(calendar11.get(1));
        Calendar calendar12 = this.calendar;
        if (calendar12 == null) {
            f0.S("calendar");
            throw null;
        }
        int iD = d(numValueOf, Integer.valueOf(calendar12.get(2)));
        NumberPicker numberPicker2 = this.mMonthSpinner;
        if (numberPicker2 != null) {
            Calendar calendar13 = this.calendar;
            if (calendar13 == null) {
                f0.S("calendar");
                throw null;
            }
            Calendar calendar14 = this.minCalendar;
            if (calendar14 == null) {
                f0.S("minCalendar");
                throw null;
            }
            if (CalendarExtKt.s(calendar13, calendar14)) {
                Calendar calendar15 = this.minCalendar;
                if (calendar15 == null) {
                    f0.S("minCalendar");
                    throw null;
                }
                i17 = calendar15.get(2) + 1;
            } else {
                i17 = 1;
            }
            numberPicker2.setMinValue(i17);
            Calendar calendar16 = this.calendar;
            if (calendar16 == null) {
                f0.S("calendar");
                throw null;
            }
            Calendar calendar17 = this.maxCalendar;
            if (calendar17 == null) {
                f0.S("maxCalendar");
                throw null;
            }
            if (CalendarExtKt.s(calendar16, calendar17)) {
                Calendar calendar18 = this.maxCalendar;
                if (calendar18 == null) {
                    f0.S("maxCalendar");
                    throw null;
                }
                i18 = calendar18.get(2) + 1;
            } else {
                i18 = 12;
            }
            numberPicker2.setMaxValue(i18);
            b2 b2Var = b2.f124493a;
        }
        NumberPicker numberPicker3 = this.mDaySpinner;
        if (numberPicker3 != null) {
            Calendar calendar19 = this.calendar;
            if (calendar19 == null) {
                f0.S("calendar");
                throw null;
            }
            Calendar calendar20 = this.minCalendar;
            if (calendar20 == null) {
                f0.S("minCalendar");
                throw null;
            }
            if (CalendarExtKt.q(calendar19, calendar20)) {
                Calendar calendar21 = this.minCalendar;
                if (calendar21 == null) {
                    f0.S("minCalendar");
                    throw null;
                }
                i15 = calendar21.get(5);
            } else {
                i15 = 1;
            }
            numberPicker3.setMinValue(i15);
            Calendar calendar22 = this.calendar;
            if (calendar22 == null) {
                f0.S("calendar");
                throw null;
            }
            Calendar calendar23 = this.maxCalendar;
            if (calendar23 == null) {
                f0.S("maxCalendar");
                throw null;
            }
            if (CalendarExtKt.q(calendar22, calendar23)) {
                Calendar calendar24 = this.maxCalendar;
                if (calendar24 == null) {
                    f0.S("maxCalendar");
                    throw null;
                }
                i16 = calendar24.get(5);
            } else {
                i16 = iD;
            }
            numberPicker3.setMaxValue(i16);
            b2 b2Var2 = b2.f124493a;
        }
        NumberPicker numberPicker4 = this.mHourSpinner;
        if (numberPicker4 != null) {
            Calendar calendar25 = this.calendar;
            if (calendar25 == null) {
                f0.S("calendar");
                throw null;
            }
            Calendar calendar26 = this.minCalendar;
            if (calendar26 == null) {
                f0.S("minCalendar");
                throw null;
            }
            if (CalendarExtKt.n(calendar25, calendar26)) {
                Calendar calendar27 = this.minCalendar;
                if (calendar27 == null) {
                    f0.S("minCalendar");
                    throw null;
                }
                i13 = calendar27.get(11);
            } else {
                i13 = 0;
            }
            numberPicker4.setMinValue(i13);
            Calendar calendar28 = this.calendar;
            if (calendar28 == null) {
                f0.S("calendar");
                throw null;
            }
            Calendar calendar29 = this.maxCalendar;
            if (calendar29 == null) {
                f0.S("maxCalendar");
                throw null;
            }
            if (CalendarExtKt.n(calendar28, calendar29)) {
                Calendar calendar30 = this.maxCalendar;
                if (calendar30 == null) {
                    f0.S("maxCalendar");
                    throw null;
                }
                i14 = calendar30.get(11);
            } else {
                i14 = 23;
            }
            numberPicker4.setMaxValue(i14);
            b2 b2Var3 = b2.f124493a;
        }
        NumberPicker numberPicker5 = this.mMinuteSpinner;
        int i19 = 59;
        if (numberPicker5 != null) {
            Calendar calendar31 = this.calendar;
            if (calendar31 == null) {
                f0.S("calendar");
                throw null;
            }
            Calendar calendar32 = this.minCalendar;
            if (calendar32 == null) {
                f0.S("minCalendar");
                throw null;
            }
            if (CalendarExtKt.o(calendar31, calendar32)) {
                Calendar calendar33 = this.minCalendar;
                if (calendar33 == null) {
                    f0.S("minCalendar");
                    throw null;
                }
                i11 = calendar33.get(12);
            } else {
                i11 = 0;
            }
            numberPicker5.setMinValue(i11);
            Calendar calendar34 = this.calendar;
            if (calendar34 == null) {
                f0.S("calendar");
                throw null;
            }
            Calendar calendar35 = this.maxCalendar;
            if (calendar35 == null) {
                f0.S("maxCalendar");
                throw null;
            }
            if (CalendarExtKt.o(calendar34, calendar35)) {
                Calendar calendar36 = this.maxCalendar;
                if (calendar36 == null) {
                    f0.S("maxCalendar");
                    throw null;
                }
                i12 = calendar36.get(12);
            } else {
                i12 = 59;
            }
            numberPicker5.setMaxValue(i12);
            b2 b2Var4 = b2.f124493a;
        }
        NumberPicker numberPicker6 = this.mSecondSpinner;
        if (numberPicker6 != null) {
            Calendar calendar37 = this.calendar;
            if (calendar37 == null) {
                f0.S("calendar");
                throw null;
            }
            Calendar calendar38 = this.minCalendar;
            if (calendar38 == null) {
                f0.S("minCalendar");
                throw null;
            }
            if (CalendarExtKt.p(calendar37, calendar38)) {
                Calendar calendar39 = this.minCalendar;
                if (calendar39 == null) {
                    f0.S("minCalendar");
                    throw null;
                }
                i10 = calendar39.get(13);
            } else {
                i10 = 0;
            }
            numberPicker6.setMinValue(i10);
            Calendar calendar40 = this.calendar;
            if (calendar40 == null) {
                f0.S("calendar");
                throw null;
            }
            Calendar calendar41 = this.maxCalendar;
            if (calendar41 == null) {
                f0.S("maxCalendar");
                throw null;
            }
            if (CalendarExtKt.p(calendar40, calendar41)) {
                Calendar calendar42 = this.maxCalendar;
                if (calendar42 == null) {
                    f0.S("maxCalendar");
                    throw null;
                }
                i19 = calendar42.get(13);
            }
            numberPicker6.setMaxValue(i19);
            b2 b2Var5 = b2.f124493a;
        }
        NumberPicker numberPicker7 = this.mYearSpinner;
        if (numberPicker7 != null) {
            Calendar calendar43 = this.calendar;
            if (calendar43 == null) {
                f0.S("calendar");
                throw null;
            }
            numberPicker7.setValue(calendar43.get(1));
        }
        NumberPicker numberPicker8 = this.mMonthSpinner;
        if (numberPicker8 != null) {
            Calendar calendar44 = this.calendar;
            if (calendar44 == null) {
                f0.S("calendar");
                throw null;
            }
            numberPicker8.setValue(calendar44.get(2) + 1);
        }
        NumberPicker numberPicker9 = this.mDaySpinner;
        if (numberPicker9 != null) {
            Calendar calendar45 = this.calendar;
            if (calendar45 == null) {
                f0.S("calendar");
                throw null;
            }
            numberPicker9.setValue(calendar45.get(5));
        }
        NumberPicker numberPicker10 = this.mHourSpinner;
        if (numberPicker10 != null) {
            Calendar calendar46 = this.calendar;
            if (calendar46 == null) {
                f0.S("calendar");
                throw null;
            }
            numberPicker10.setValue(calendar46.get(11));
        }
        NumberPicker numberPicker11 = this.mMinuteSpinner;
        if (numberPicker11 != null) {
            Calendar calendar47 = this.calendar;
            if (calendar47 == null) {
                f0.S("calendar");
                throw null;
            }
            numberPicker11.setValue(calendar47.get(12));
        }
        NumberPicker numberPicker12 = this.mSecondSpinner;
        if (numberPicker12 != null) {
            Calendar calendar48 = this.calendar;
            if (calendar48 == null) {
                f0.S("calendar");
                throw null;
            }
            numberPicker12.setValue(calendar48.get(13));
        }
        NumberPicker numberPicker13 = this.mDaySpinner;
        if ((numberPicker13 == null ? 0 : numberPicker13.getValue()) >= iD && (numberPicker = this.mDaySpinner) != null) {
            numberPicker.setValue(iD);
        }
        setWrapSelectorWheel(this.wrapSelectorWheelTypes, this.wrapSelectorWheel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(c this$0, NumberPicker numberPicker, int i10, int i11) {
        f0.p(this$0, "this$0");
        this$0.f();
        this$0.j();
        this$0.l();
    }

    private final void l() {
        l<? super Long, b2> lVar = this.f64429l;
        if (lVar == null || lVar == null) {
            return;
        }
        Calendar calendar = this.calendar;
        if (calendar != null) {
            lVar.invoke(Long.valueOf(calendar.getTimeInMillis()));
        } else {
            f0.S("calendar");
            throw null;
        }
    }

    @Override // com.loper7.date_time_picker.controller.a
    @dl.d
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public c a(int global) {
        this.global = global;
        return this;
    }

    @Override // com.loper7.date_time_picker.controller.d
    public long getMillisecond() {
        Calendar calendar = this.calendar;
        if (calendar != null) {
            return calendar.getTimeInMillis();
        }
        f0.S("calendar");
        throw null;
    }

    @Override // com.loper7.date_time_picker.controller.a
    @dl.d
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public c b(int type, @e NumberPicker picker) {
        if (type == 0) {
            this.mYearSpinner = picker;
        } else if (type == 1) {
            this.mMonthSpinner = picker;
        } else if (type == 2) {
            this.mDaySpinner = picker;
        } else if (type == 3) {
            this.mHourSpinner = picker;
        } else if (type == 4) {
            this.mMinuteSpinner = picker;
        } else if (type == 5) {
            this.mSecondSpinner = picker;
        }
        return this;
    }

    @Override // com.loper7.date_time_picker.controller.a
    @dl.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public c c() {
        Calendar calendar = Calendar.getInstance();
        f0.o(calendar, "getInstance()");
        this.calendar = calendar;
        if (calendar == null) {
            f0.S("calendar");
            throw null;
        }
        calendar.set(14, 0);
        Calendar calendar2 = Calendar.getInstance();
        f0.o(calendar2, "getInstance()");
        this.minCalendar = calendar2;
        if (calendar2 == null) {
            f0.S("minCalendar");
            throw null;
        }
        calendar2.set(1, bb.c.b.Dx);
        Calendar calendar3 = this.minCalendar;
        if (calendar3 == null) {
            f0.S("minCalendar");
            throw null;
        }
        calendar3.set(2, 0);
        Calendar calendar4 = this.minCalendar;
        if (calendar4 == null) {
            f0.S("minCalendar");
            throw null;
        }
        calendar4.set(5, 1);
        Calendar calendar5 = this.minCalendar;
        if (calendar5 == null) {
            f0.S("minCalendar");
            throw null;
        }
        calendar5.set(11, 0);
        Calendar calendar6 = this.minCalendar;
        if (calendar6 == null) {
            f0.S("minCalendar");
            throw null;
        }
        calendar6.set(12, 0);
        Calendar calendar7 = this.minCalendar;
        if (calendar7 == null) {
            f0.S("minCalendar");
            throw null;
        }
        calendar7.set(13, 0);
        Calendar calendar8 = Calendar.getInstance();
        f0.o(calendar8, "getInstance()");
        this.maxCalendar = calendar8;
        if (calendar8 == null) {
            f0.S("maxCalendar");
            throw null;
        }
        Calendar calendar9 = this.calendar;
        if (calendar9 == null) {
            f0.S("calendar");
            throw null;
        }
        calendar8.set(1, calendar9.get(1) + bb.c.b.Dx);
        Calendar calendar10 = this.maxCalendar;
        if (calendar10 == null) {
            f0.S("maxCalendar");
            throw null;
        }
        calendar10.set(2, 11);
        Calendar calendar11 = this.maxCalendar;
        if (calendar11 == null) {
            f0.S("maxCalendar");
            throw null;
        }
        if (calendar11 == null) {
            f0.S("maxCalendar");
            throw null;
        }
        calendar11.set(5, CalendarExtKt.d(calendar11));
        Calendar calendar12 = this.maxCalendar;
        if (calendar12 == null) {
            f0.S("maxCalendar");
            throw null;
        }
        calendar12.set(11, 23);
        Calendar calendar13 = this.maxCalendar;
        if (calendar13 == null) {
            f0.S("maxCalendar");
            throw null;
        }
        calendar13.set(12, 59);
        Calendar calendar14 = this.maxCalendar;
        if (calendar14 == null) {
            f0.S("maxCalendar");
            throw null;
        }
        calendar14.set(13, 59);
        NumberPicker numberPicker = this.mYearSpinner;
        if (numberPicker != null) {
            Calendar calendar15 = this.maxCalendar;
            if (calendar15 == null) {
                f0.S("maxCalendar");
                throw null;
            }
            numberPicker.setMaxValue(calendar15.get(1));
            Calendar calendar16 = this.minCalendar;
            if (calendar16 == null) {
                f0.S("minCalendar");
                throw null;
            }
            numberPicker.setMinValue(calendar16.get(1));
            Calendar calendar17 = this.calendar;
            if (calendar17 == null) {
                f0.S("calendar");
                throw null;
            }
            numberPicker.setValue(calendar17.get(1));
            numberPicker.setFocusable(true);
            numberPicker.setFocusableInTouchMode(true);
            numberPicker.setDescendantFocusability(393216);
            numberPicker.setOnValueChangedListener(this.onChangeListener);
            b2 b2Var = b2.f124493a;
        }
        NumberPicker numberPicker2 = this.mMonthSpinner;
        if (numberPicker2 != null) {
            Calendar calendar18 = this.maxCalendar;
            if (calendar18 == null) {
                f0.S("maxCalendar");
                throw null;
            }
            numberPicker2.setMaxValue(calendar18.get(2) + 1);
            Calendar calendar19 = this.minCalendar;
            if (calendar19 == null) {
                f0.S("minCalendar");
                throw null;
            }
            numberPicker2.setMinValue(calendar19.get(2) + 1);
            Calendar calendar20 = this.calendar;
            if (calendar20 == null) {
                f0.S("calendar");
                throw null;
            }
            numberPicker2.setValue(calendar20.get(2) + 1);
            numberPicker2.setFocusable(true);
            numberPicker2.setFocusableInTouchMode(true);
            ea.e eVar = ea.e.f118595a;
            numberPicker2.setFormatter(eVar.k(this.global) ? eVar.e() : eVar.f());
            numberPicker2.setDescendantFocusability(393216);
            numberPicker2.setOnValueChangedListener(this.onChangeListener);
            b2 b2Var2 = b2.f124493a;
        }
        NumberPicker numberPicker3 = this.mDaySpinner;
        if (numberPicker3 != null) {
            Calendar calendar21 = this.maxCalendar;
            if (calendar21 == null) {
                f0.S("maxCalendar");
                throw null;
            }
            numberPicker3.setMaxValue(calendar21.get(5));
            Calendar calendar22 = this.minCalendar;
            if (calendar22 == null) {
                f0.S("minCalendar");
                throw null;
            }
            numberPicker3.setMinValue(calendar22.get(5));
            Calendar calendar23 = this.calendar;
            if (calendar23 == null) {
                f0.S("calendar");
                throw null;
            }
            numberPicker3.setValue(calendar23.get(5));
            numberPicker3.setFocusable(true);
            numberPicker3.setFocusableInTouchMode(true);
            numberPicker3.setFormatter(ea.e.f118595a.e());
            numberPicker3.setDescendantFocusability(393216);
            numberPicker3.setOnValueChangedListener(this.onChangeListener);
            b2 b2Var3 = b2.f124493a;
        }
        NumberPicker numberPicker4 = this.mHourSpinner;
        if (numberPicker4 != null) {
            Calendar calendar24 = this.maxCalendar;
            if (calendar24 == null) {
                f0.S("maxCalendar");
                throw null;
            }
            numberPicker4.setMaxValue(calendar24.get(11));
            Calendar calendar25 = this.minCalendar;
            if (calendar25 == null) {
                f0.S("minCalendar");
                throw null;
            }
            numberPicker4.setMinValue(calendar25.get(11));
            numberPicker4.setFocusable(true);
            numberPicker4.setFocusableInTouchMode(true);
            Calendar calendar26 = this.calendar;
            if (calendar26 == null) {
                f0.S("calendar");
                throw null;
            }
            numberPicker4.setValue(calendar26.get(11));
            numberPicker4.setFormatter(ea.e.f118595a.e());
            numberPicker4.setDescendantFocusability(393216);
            numberPicker4.setOnValueChangedListener(this.onChangeListener);
            b2 b2Var4 = b2.f124493a;
        }
        NumberPicker numberPicker5 = this.mMinuteSpinner;
        if (numberPicker5 != null) {
            Calendar calendar27 = this.maxCalendar;
            if (calendar27 == null) {
                f0.S("maxCalendar");
                throw null;
            }
            numberPicker5.setMaxValue(calendar27.get(12));
            Calendar calendar28 = this.minCalendar;
            if (calendar28 == null) {
                f0.S("minCalendar");
                throw null;
            }
            numberPicker5.setMinValue(calendar28.get(12));
            numberPicker5.setFocusable(true);
            numberPicker5.setFocusableInTouchMode(true);
            Calendar calendar29 = this.calendar;
            if (calendar29 == null) {
                f0.S("calendar");
                throw null;
            }
            numberPicker5.setValue(calendar29.get(12));
            numberPicker5.setFormatter(ea.e.f118595a.e());
            numberPicker5.setDescendantFocusability(393216);
            numberPicker5.setOnValueChangedListener(this.onChangeListener);
            b2 b2Var5 = b2.f124493a;
        }
        NumberPicker numberPicker6 = this.mSecondSpinner;
        if (numberPicker6 != null) {
            Calendar calendar30 = this.maxCalendar;
            if (calendar30 == null) {
                f0.S("maxCalendar");
                throw null;
            }
            numberPicker6.setMaxValue(calendar30.get(13));
            Calendar calendar31 = this.minCalendar;
            if (calendar31 == null) {
                f0.S("minCalendar");
                throw null;
            }
            numberPicker6.setMinValue(calendar31.get(13));
            numberPicker6.setFocusable(true);
            numberPicker6.setFocusableInTouchMode(true);
            Calendar calendar32 = this.calendar;
            if (calendar32 == null) {
                f0.S("calendar");
                throw null;
            }
            numberPicker6.setValue(calendar32.get(13));
            numberPicker6.setFormatter(ea.e.f118595a.e());
            numberPicker6.setDescendantFocusability(393216);
            numberPicker6.setOnValueChangedListener(this.onChangeListener);
            b2 b2Var6 = b2.f124493a;
        }
        return this;
    }

    @Override // com.loper7.date_time_picker.controller.d
    public void setDefaultMillisecond(long j10) {
        if (j10 == 0) {
            return;
        }
        Calendar calendar = this.calendar;
        if (calendar == null) {
            f0.S("calendar");
            throw null;
        }
        calendar.clear();
        Calendar calendar2 = this.calendar;
        if (calendar2 == null) {
            f0.S("calendar");
            throw null;
        }
        calendar2.setTimeInMillis(j10);
        j();
        l();
    }

    @Override // com.loper7.date_time_picker.controller.d
    public void setMaxMillisecond(long j10) {
        if (j10 == 0) {
            return;
        }
        Calendar calendar = this.minCalendar;
        if (calendar == null) {
            f0.S("minCalendar");
            throw null;
        }
        if (calendar.getTimeInMillis() > 0) {
            Calendar calendar2 = this.minCalendar;
            if (calendar2 == null) {
                f0.S("minCalendar");
                throw null;
            }
            if (j10 < calendar2.getTimeInMillis()) {
                return;
            }
        }
        Calendar calendar3 = this.maxCalendar;
        if (calendar3 == null) {
            f0.S("maxCalendar");
            throw null;
        }
        if (calendar3 == null) {
            f0.S("maxCalendar");
            throw null;
        }
        calendar3.setTimeInMillis(j10);
        NumberPicker numberPicker = this.mYearSpinner;
        if (numberPicker != null) {
            Calendar calendar4 = this.maxCalendar;
            if (calendar4 == null) {
                f0.S("maxCalendar");
                throw null;
            }
            numberPicker.setMaxValue(calendar4.get(1));
        }
        Calendar calendar5 = this.calendar;
        if (calendar5 != null) {
            setDefaultMillisecond(calendar5.getTimeInMillis());
        } else {
            f0.S("calendar");
            throw null;
        }
    }

    @Override // com.loper7.date_time_picker.controller.d
    public void setMinMillisecond(long j10) {
        if (j10 == 0) {
            return;
        }
        o oVarC2 = u.c2(1, j10);
        Calendar calendar = this.maxCalendar;
        if (calendar == null) {
            f0.S("maxCalendar");
            throw null;
        }
        if (oVarC2.s(calendar.getTimeInMillis())) {
            return;
        }
        Calendar calendar2 = this.minCalendar;
        if (calendar2 == null) {
            f0.S("minCalendar");
            throw null;
        }
        if (calendar2 == null) {
            f0.S("minCalendar");
            throw null;
        }
        calendar2.setTimeInMillis(j10);
        NumberPicker numberPicker = this.mYearSpinner;
        if (numberPicker != null) {
            Calendar calendar3 = this.minCalendar;
            if (calendar3 == null) {
                f0.S("minCalendar");
                throw null;
            }
            numberPicker.setMinValue(calendar3.get(1));
        }
        Calendar calendar4 = this.calendar;
        if (calendar4 != null) {
            setDefaultMillisecond(calendar4.getTimeInMillis());
        } else {
            f0.S("calendar");
            throw null;
        }
    }

    @Override // com.loper7.date_time_picker.controller.d
    public void setOnDateTimeChangedListener(@e l<? super Long, b2> lVar) {
        this.f64429l = lVar;
        l();
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0014  */
    @Override // com.loper7.date_time_picker.controller.d
    public void setWrapSelectorWheel(@e List<Integer> list, boolean z10) {
        NumberPicker numberPicker;
        this.wrapSelectorWheelTypes = list;
        this.wrapSelectorWheel = z10;
        if (list != null) {
            f0.m(list);
            if (list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                this.wrapSelectorWheelTypes = arrayList;
                f0.m(arrayList);
                arrayList.add(0);
                List<Integer> list2 = this.wrapSelectorWheelTypes;
                f0.m(list2);
                list2.add(1);
                List<Integer> list3 = this.wrapSelectorWheelTypes;
                f0.m(list3);
                list3.add(2);
                List<Integer> list4 = this.wrapSelectorWheelTypes;
                f0.m(list4);
                list4.add(3);
                List<Integer> list5 = this.wrapSelectorWheelTypes;
                f0.m(list5);
                list5.add(4);
                List<Integer> list6 = this.wrapSelectorWheelTypes;
                f0.m(list6);
                list6.add(5);
            }
        } else {
            ArrayList arrayList2 = new ArrayList();
            this.wrapSelectorWheelTypes = arrayList2;
            f0.m(arrayList2);
            arrayList2.add(0);
            List<Integer> list7 = this.wrapSelectorWheelTypes;
            f0.m(list7);
            list7.add(1);
            List<Integer> list8 = this.wrapSelectorWheelTypes;
            f0.m(list8);
            list8.add(2);
            List<Integer> list9 = this.wrapSelectorWheelTypes;
            f0.m(list9);
            list9.add(3);
            List<Integer> list10 = this.wrapSelectorWheelTypes;
            f0.m(list10);
            list10.add(4);
            List<Integer> list11 = this.wrapSelectorWheelTypes;
            f0.m(list11);
            list11.add(5);
        }
        List<Integer> list12 = this.wrapSelectorWheelTypes;
        f0.m(list12);
        Iterator<Integer> it = list12.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (iIntValue == 0) {
                NumberPicker numberPicker2 = this.mYearSpinner;
                if (numberPicker2 != null) {
                    numberPicker2.setWrapSelectorWheel(z10);
                }
            } else if (iIntValue == 1) {
                NumberPicker numberPicker3 = this.mMonthSpinner;
                if (numberPicker3 != null) {
                    numberPicker3.setWrapSelectorWheel(z10);
                }
            } else if (iIntValue == 2) {
                NumberPicker numberPicker4 = this.mDaySpinner;
                if (numberPicker4 != null) {
                    numberPicker4.setWrapSelectorWheel(z10);
                }
            } else if (iIntValue == 3) {
                NumberPicker numberPicker5 = this.mHourSpinner;
                if (numberPicker5 != null) {
                    numberPicker5.setWrapSelectorWheel(z10);
                }
            } else if (iIntValue == 4) {
                NumberPicker numberPicker6 = this.mMinuteSpinner;
                if (numberPicker6 != null) {
                    numberPicker6.setWrapSelectorWheel(z10);
                }
            } else if (iIntValue == 5 && (numberPicker = this.mSecondSpinner) != null) {
                numberPicker.setWrapSelectorWheel(z10);
            }
        }
    }
}
