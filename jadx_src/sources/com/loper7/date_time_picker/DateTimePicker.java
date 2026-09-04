package com.loper7.date_time_picker;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.l;
import androidx.annotation.r;
import com.google.android.exoplayer2.text.ttml.d;
import com.loper7.date_time_picker.controller.a;
import com.loper7.date_time_picker.controller.c;
import com.loper7.date_time_picker.number_picker.NumberPicker;
import com.max.hblogistics.AddressListActivity;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import dl.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.f0;
import org.apache.tools.ant.taskdefs.p7;
import org.apache.tools.ant.types.selectors.o;

/* JADX INFO: compiled from: DateTimePicker.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B#\b\u0016\u0012\u0006\u0010b\u001a\u00020a\u0012\b\u0010d\u001a\u0004\u0018\u00010c\u0012\u0006\u0010e\u001a\u00020\b¢\u0006\u0004\bf\u0010gB\u001b\b\u0016\u0012\u0006\u0010b\u001a\u00020a\u0012\b\u0010d\u001a\u0004\u0018\u00010c¢\u0006\u0004\bf\u0010hB\u0011\b\u0016\u0012\u0006\u0010b\u001a\u00020a¢\u0006\u0004\bf\u0010iJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\f\u001a\u00020\u00032\b\b\u0001\u0010\u000b\u001a\u00020\bJ\u0010\u0010\u000f\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u000e\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0010J\u0010\u0010\u0013\u001a\u00020\u00032\b\b\u0001\u0010\u0012\u001a\u00020\bJ\u0010\u0010\u0014\u001a\u00020\u00032\b\b\u0001\u0010\u0012\u001a\u00020\bJ\u0010\u0010\u0015\u001a\u00020\u00032\b\b\u0001\u0010\u0012\u001a\u00020\bJ\u001a\u0010\u0018\u001a\u00020\u00032\b\b\u0001\u0010\u0016\u001a\u00020\b2\b\b\u0001\u0010\u0017\u001a\u00020\bJB\u0010 \u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010\u001e\u001a\u00020\u00192\b\b\u0002\u0010\u001f\u001a\u00020\u0019J\u001a\u0010\"\u001a\u00020\u00032\n\u0010\u000e\u001a\u00020\r\"\u00020\b2\u0006\u0010!\u001a\u00020\u0010J\u000e\u0010\"\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0010J\u0010\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010#\u001a\u00020\bJ\u000e\u0010'\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0010J\u000e\u0010)\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0010J\u0010\u0010,\u001a\u00020\u00032\u0006\u0010+\u001a\u00020*H\u0016J\u0010\u0010-\u001a\u00020\u00032\u0006\u0010+\u001a\u00020*H\u0016J\u0010\u0010.\u001a\u00020\u00032\u0006\u0010+\u001a\u00020*H\u0016J \u0010\"\u001a\u00020\u00032\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010/2\u0006\u0010!\u001a\u00020\u0010H\u0016J\u001e\u00102\u001a\u00020\u00032\u0014\u00101\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0003\u0018\u000100H\u0016J\b\u00103\u001a\u00020*H\u0016R\u0018\u00105\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u00104R\u0018\u00106\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00104R\u0018\u00107\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u00104R\u0018\u00108\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u00104R\u0018\u0010:\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00104R\u0018\u0010<\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00104R\u0016\u0010#\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010A\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010D\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010F\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010CR\u0016\u0010H\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010CR\u0016\u0010J\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010CR\u0016\u0010L\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010CR\u0016\u0010O\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010Q\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010NR\u0016\u0010S\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010NR\u0016\u0010U\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010NR\u0016\u0010W\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010NR\u0016\u0010Y\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010NR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010CR\u0016\u0010\\\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010CR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010&\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010@R\u0016\u0010(\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010@¨\u0006j"}, d2 = {"Lcom/loper7/date_time_picker/DateTimePicker;", "Landroid/widget/FrameLayout;", "Lcom/loper7/date_time_picker/controller/d;", "Lkotlin/b2;", "d", "Lcom/loper7/date_time_picker/controller/a;", "controller", "b", "", "global", "setGlobal", d.f49813w, "setLayout", "", "types", "setDisplayType", "", "e", "color", "setThemeColor", "setTextColor", "setDividerColor", "normal", AddressListActivity.N, "setTextSize", "", "year", "month", p7.a.f135570h, p7.a.f135569g, o.f136588l, p7.a.f135567e, "setLabelText", "wrapSelector", "setWrapSelectorWheel", "displayType", "Lcom/loper7/date_time_picker/number_picker/NumberPicker;", ak.aF, "textBold", "setTextBold", "selectedTextBold", "setSelectedTextBold", "", "time", "setDefaultMillisecond", "setMinMillisecond", "setMaxMillisecond", "", "Lkotlin/Function1;", "callback", "setOnDateTimeChangedListener", "getMillisecond", "Lcom/loper7/date_time_picker/number_picker/NumberPicker;", "mYearSpinner", "mMonthSpinner", "mDaySpinner", "mHourSpinner", "f", "mMinuteSpinner", "g", "mSecondSpinner", RXScreenCaptureService.KEY_HEIGHT, "[I", "i", "Z", "showLabel", "j", "I", "themeColor", "k", "textColor", "l", "dividerColor", "m", "selectTextSize", "n", "normalTextSize", "o", "Ljava/lang/String;", "yearLabel", "p", "monthLabel", "q", "dayLabel", "r", "hourLabel", ak.aB, "minLabel", "t", "secondLabel", ak.aG, "v", "layoutResId", RXScreenCaptureService.KEY_WIDTH, "Lcom/loper7/date_time_picker/controller/a;", "x", "y", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "date_time_picker_release"}, k = 1, mv = {1, 5, 1})
public class DateTimePicker extends FrameLayout implements com.loper7.date_time_picker.controller.d {

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
    @dl.d
    private int[] displayType;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean showLabel;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int themeColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int textColor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int dividerColor;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int selectTextSize;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int normalTextSize;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private String yearLabel;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private String monthLabel;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private String dayLabel;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private String hourLabel;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private String minLabel;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private String secondLabel;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private int global;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private int layoutResId;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @e
    private a controller;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private boolean textBold;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private boolean selectedTextBold;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateTimePicker(@dl.d Context context) throws Exception {
        super(context);
        f0.p(context, "context");
        this.displayType = new int[]{0, 1, 2, 3, 4, 5};
        this.showLabel = true;
        this.yearLabel = "年";
        this.monthLabel = "月";
        this.dayLabel = "日";
        this.hourLabel = "时";
        this.minLabel = "分";
        this.secondLabel = "秒";
        this.layoutResId = R.layout.dt_layout_date_picker;
        this.textBold = true;
        this.selectedTextBold = true;
        d();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateTimePicker(@dl.d Context context, @e AttributeSet attributeSet) throws Exception {
        super(context, attributeSet);
        f0.p(context, "context");
        this.displayType = new int[]{0, 1, 2, 3, 4, 5};
        this.showLabel = true;
        this.yearLabel = "年";
        this.monthLabel = "月";
        this.dayLabel = "日";
        this.hourLabel = "时";
        this.minLabel = "分";
        this.secondLabel = "秒";
        int i10 = R.layout.dt_layout_date_picker;
        this.layoutResId = i10;
        this.textBold = true;
        this.selectedTextBold = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.P);
        this.showLabel = typedArrayObtainStyledAttributes.getBoolean(R.styleable.DateTimePicker_dt_showLabel, true);
        this.themeColor = typedArrayObtainStyledAttributes.getColor(R.styleable.DateTimePicker_dt_themeColor, androidx.core.content.d.f(context, R.color.colorAccent));
        this.textColor = typedArrayObtainStyledAttributes.getColor(R.styleable.DateTimePicker_dt_textColor, androidx.core.content.d.f(context, R.color.colorTextGray));
        this.dividerColor = typedArrayObtainStyledAttributes.getColor(R.styleable.DateTimePicker_dt_dividerColor, androidx.core.content.d.f(context, R.color.colorDivider));
        this.selectTextSize = ha.a.b(context, typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.DateTimePicker_dt_selectTextSize, ha.a.a(context, 0.0f)));
        this.normalTextSize = ha.a.b(context, typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.DateTimePicker_dt_normalTextSize, ha.a.a(context, 0.0f)));
        this.layoutResId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.DateTimePicker_dt_layout, i10);
        this.textBold = typedArrayObtainStyledAttributes.getBoolean(R.styleable.DateTimePicker_dt_textBold, this.textBold);
        this.selectedTextBold = typedArrayObtainStyledAttributes.getBoolean(R.styleable.DateTimePicker_dt_selectedTextBold, this.selectedTextBold);
        typedArrayObtainStyledAttributes.recycle();
        d();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DateTimePicker(@dl.d Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet);
        f0.p(context, "context");
    }

    private final void d() throws Exception {
        removeAllViews();
        try {
            if (ea.e.f118595a.k(this.global) || this.layoutResId != R.layout.dt_layout_date_picker) {
                View.inflate(getContext(), this.layoutResId, this);
            } else {
                View.inflate(getContext(), R.layout.dt_layout_date_picker_globalization, this);
            }
            NumberPicker numberPicker = (NumberPicker) findViewById(R.id.np_datetime_year);
            this.mYearSpinner = numberPicker;
            if (numberPicker == null) {
                this.mYearSpinner = (NumberPicker) findViewWithTag("np_datetime_year");
            }
            NumberPicker numberPicker2 = (NumberPicker) findViewById(R.id.np_datetime_month);
            this.mMonthSpinner = numberPicker2;
            if (numberPicker2 == null) {
                this.mMonthSpinner = (NumberPicker) findViewWithTag("np_datetime_month");
            }
            NumberPicker numberPicker3 = (NumberPicker) findViewById(R.id.np_datetime_day);
            this.mDaySpinner = numberPicker3;
            if (numberPicker3 == null) {
                this.mDaySpinner = (NumberPicker) findViewWithTag("np_datetime_day");
            }
            NumberPicker numberPicker4 = (NumberPicker) findViewById(R.id.np_datetime_hour);
            this.mHourSpinner = numberPicker4;
            if (numberPicker4 == null) {
                this.mHourSpinner = (NumberPicker) findViewWithTag("np_datetime_hour");
            }
            NumberPicker numberPicker5 = (NumberPicker) findViewById(R.id.np_datetime_minute);
            this.mMinuteSpinner = numberPicker5;
            if (numberPicker5 == null) {
                this.mMinuteSpinner = (NumberPicker) findViewWithTag("np_datetime_minute");
            }
            NumberPicker numberPicker6 = (NumberPicker) findViewById(R.id.np_datetime_second);
            this.mSecondSpinner = numberPicker6;
            if (numberPicker6 == null) {
                this.mSecondSpinner = (NumberPicker) findViewWithTag("np_datetime_second");
            }
            setThemeColor(this.themeColor);
            setTextSize(this.normalTextSize, this.selectTextSize);
            e(this.showLabel);
            setDisplayType(this.displayType);
            setSelectedTextBold(this.selectedTextBold);
            setTextBold(this.textBold);
            setTextColor(this.textColor);
            setDividerColor(this.dividerColor);
            a cVar = this.controller;
            if (cVar == null) {
                cVar = new c();
            }
            b(cVar);
        } catch (Exception unused) {
            throw new Exception("layoutResId is it right or not?");
        }
    }

    public static /* synthetic */ void setLabelText$default(DateTimePicker dateTimePicker, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setLabelText");
        }
        if ((i10 & 1) != 0) {
            str = dateTimePicker.yearLabel;
        }
        if ((i10 & 2) != 0) {
            str2 = dateTimePicker.monthLabel;
        }
        String str7 = str2;
        if ((i10 & 4) != 0) {
            str3 = dateTimePicker.dayLabel;
        }
        String str8 = str3;
        if ((i10 & 8) != 0) {
            str4 = dateTimePicker.hourLabel;
        }
        String str9 = str4;
        if ((i10 & 16) != 0) {
            str5 = dateTimePicker.minLabel;
        }
        String str10 = str5;
        if ((i10 & 32) != 0) {
            str6 = dateTimePicker.secondLabel;
        }
        dateTimePicker.setLabelText(str, str7, str8, str9, str10, str6);
    }

    public void a() {
    }

    public final void b(@e a aVar) {
        a aVarB;
        a aVarB2;
        a aVarB3;
        a aVarB4;
        a aVarB5;
        a aVarB6;
        a aVarA;
        this.controller = aVar;
        if (aVar == null) {
            c cVarA = new c().b(0, this.mYearSpinner).b(1, this.mMonthSpinner).b(2, this.mDaySpinner).b(3, this.mHourSpinner).b(4, this.mMinuteSpinner).b(5, this.mSecondSpinner).a(this.global);
            this.controller = cVarA == null ? null : cVarA.c();
        } else {
            if (aVar == null || (aVarB = aVar.b(0, this.mYearSpinner)) == null || (aVarB2 = aVarB.b(1, this.mMonthSpinner)) == null || (aVarB3 = aVarB2.b(2, this.mDaySpinner)) == null || (aVarB4 = aVarB3.b(3, this.mHourSpinner)) == null || (aVarB5 = aVarB4.b(4, this.mMinuteSpinner)) == null || (aVarB6 = aVarB5.b(5, this.mSecondSpinner)) == null || (aVarA = aVarB6.a(this.global)) == null) {
                return;
            }
            aVarA.c();
        }
    }

    @e
    public final NumberPicker c(int displayType) {
        if (displayType == 0) {
            return this.mYearSpinner;
        }
        if (displayType == 1) {
            return this.mMonthSpinner;
        }
        if (displayType == 2) {
            return this.mDaySpinner;
        }
        if (displayType == 3) {
            return this.mHourSpinner;
        }
        if (displayType == 4) {
            return this.mMinuteSpinner;
        }
        if (displayType != 5) {
            return null;
        }
        return this.mSecondSpinner;
    }

    public final void e(boolean z10) {
        this.showLabel = z10;
        if (z10) {
            NumberPicker numberPicker = this.mYearSpinner;
            if (numberPicker != null) {
                numberPicker.setLabel(this.yearLabel);
            }
            NumberPicker numberPicker2 = this.mMonthSpinner;
            if (numberPicker2 != null) {
                numberPicker2.setLabel(this.monthLabel);
            }
            NumberPicker numberPicker3 = this.mDaySpinner;
            if (numberPicker3 != null) {
                numberPicker3.setLabel(this.dayLabel);
            }
            NumberPicker numberPicker4 = this.mHourSpinner;
            if (numberPicker4 != null) {
                numberPicker4.setLabel(this.hourLabel);
            }
            NumberPicker numberPicker5 = this.mMinuteSpinner;
            if (numberPicker5 != null) {
                numberPicker5.setLabel(this.minLabel);
            }
            NumberPicker numberPicker6 = this.mSecondSpinner;
            if (numberPicker6 == null) {
                return;
            }
            numberPicker6.setLabel(this.secondLabel);
            return;
        }
        NumberPicker numberPicker7 = this.mYearSpinner;
        if (numberPicker7 != null) {
            numberPicker7.setLabel("");
        }
        NumberPicker numberPicker8 = this.mMonthSpinner;
        if (numberPicker8 != null) {
            numberPicker8.setLabel("");
        }
        NumberPicker numberPicker9 = this.mDaySpinner;
        if (numberPicker9 != null) {
            numberPicker9.setLabel("");
        }
        NumberPicker numberPicker10 = this.mHourSpinner;
        if (numberPicker10 != null) {
            numberPicker10.setLabel("");
        }
        NumberPicker numberPicker11 = this.mMinuteSpinner;
        if (numberPicker11 != null) {
            numberPicker11.setLabel("");
        }
        NumberPicker numberPicker12 = this.mSecondSpinner;
        if (numberPicker12 == null) {
            return;
        }
        numberPicker12.setLabel("");
    }

    @Override // com.loper7.date_time_picker.controller.d
    public long getMillisecond() {
        a aVar = this.controller;
        if (aVar == null) {
            return 0L;
        }
        return aVar.getMillisecond();
    }

    @Override // com.loper7.date_time_picker.controller.d
    public void setDefaultMillisecond(long j10) {
        a aVar = this.controller;
        if (aVar == null) {
            return;
        }
        aVar.setDefaultMillisecond(j10);
    }

    public final void setDisplayType(@e int[] iArr) {
        NumberPicker numberPicker;
        NumberPicker numberPicker2;
        NumberPicker numberPicker3;
        NumberPicker numberPicker4;
        NumberPicker numberPicker5;
        NumberPicker numberPicker6;
        if (iArr != null) {
            if (iArr.length == 0) {
                return;
            }
            this.displayType = iArr;
            if (!ArraysKt___ArraysKt.R8(iArr, 0) && (numberPicker6 = this.mYearSpinner) != null) {
                numberPicker6.setVisibility(8);
            }
            if (!ArraysKt___ArraysKt.R8(this.displayType, 1) && (numberPicker5 = this.mMonthSpinner) != null) {
                numberPicker5.setVisibility(8);
            }
            if (!ArraysKt___ArraysKt.R8(this.displayType, 2) && (numberPicker4 = this.mDaySpinner) != null) {
                numberPicker4.setVisibility(8);
            }
            if (!ArraysKt___ArraysKt.R8(this.displayType, 3) && (numberPicker3 = this.mHourSpinner) != null) {
                numberPicker3.setVisibility(8);
            }
            if (!ArraysKt___ArraysKt.R8(this.displayType, 4) && (numberPicker2 = this.mMinuteSpinner) != null) {
                numberPicker2.setVisibility(8);
            }
            if (ArraysKt___ArraysKt.R8(this.displayType, 5) || (numberPicker = this.mSecondSpinner) == null) {
                return;
            }
            numberPicker.setVisibility(8);
        }
    }

    public final void setDividerColor(@l int i10) {
        if (i10 == 0) {
            return;
        }
        this.dividerColor = i10;
        NumberPicker numberPicker = this.mYearSpinner;
        if (numberPicker != null) {
            numberPicker.setDividerColor(i10);
        }
        NumberPicker numberPicker2 = this.mMonthSpinner;
        if (numberPicker2 != null) {
            numberPicker2.setDividerColor(i10);
        }
        NumberPicker numberPicker3 = this.mDaySpinner;
        if (numberPicker3 != null) {
            numberPicker3.setDividerColor(i10);
        }
        NumberPicker numberPicker4 = this.mHourSpinner;
        if (numberPicker4 != null) {
            numberPicker4.setDividerColor(i10);
        }
        NumberPicker numberPicker5 = this.mMinuteSpinner;
        if (numberPicker5 != null) {
            numberPicker5.setDividerColor(i10);
        }
        NumberPicker numberPicker6 = this.mSecondSpinner;
        if (numberPicker6 == null) {
            return;
        }
        numberPicker6.setDividerColor(i10);
    }

    public final void setGlobal(int i10) throws Exception {
        this.global = i10;
        d();
    }

    public final void setLabelText(@dl.d String year, @dl.d String month, @dl.d String day, @dl.d String hour, @dl.d String min, @dl.d String second) {
        f0.p(year, "year");
        f0.p(month, "month");
        f0.p(day, "day");
        f0.p(hour, "hour");
        f0.p(min, "min");
        f0.p(second, "second");
        this.yearLabel = year;
        this.monthLabel = month;
        this.dayLabel = day;
        this.hourLabel = hour;
        this.minLabel = min;
        this.secondLabel = second;
        e(this.showLabel);
    }

    public final void setLayout(@dl.d int i10) throws Exception {
        if (i10 == 0) {
            return;
        }
        this.layoutResId = i10;
        d();
    }

    @Override // com.loper7.date_time_picker.controller.d
    public void setMaxMillisecond(long j10) {
        a aVar = this.controller;
        if (aVar == null) {
            return;
        }
        aVar.setMaxMillisecond(j10);
    }

    @Override // com.loper7.date_time_picker.controller.d
    public void setMinMillisecond(long j10) {
        a aVar = this.controller;
        if (aVar == null) {
            return;
        }
        aVar.setMinMillisecond(j10);
    }

    @Override // com.loper7.date_time_picker.controller.d
    public void setOnDateTimeChangedListener(@e yh.l<? super Long, b2> lVar) {
        a aVar = this.controller;
        if (aVar == null) {
            return;
        }
        aVar.setOnDateTimeChangedListener(lVar);
    }

    public final void setSelectedTextBold(boolean z10) {
        this.selectedTextBold = z10;
        NumberPicker numberPicker = this.mYearSpinner;
        if (numberPicker != null) {
            numberPicker.setSelectedTextBold(z10);
        }
        NumberPicker numberPicker2 = this.mMonthSpinner;
        if (numberPicker2 != null) {
            numberPicker2.setSelectedTextBold(z10);
        }
        NumberPicker numberPicker3 = this.mDaySpinner;
        if (numberPicker3 != null) {
            numberPicker3.setSelectedTextBold(z10);
        }
        NumberPicker numberPicker4 = this.mHourSpinner;
        if (numberPicker4 != null) {
            numberPicker4.setSelectedTextBold(z10);
        }
        NumberPicker numberPicker5 = this.mMinuteSpinner;
        if (numberPicker5 != null) {
            numberPicker5.setSelectedTextBold(z10);
        }
        NumberPicker numberPicker6 = this.mSecondSpinner;
        if (numberPicker6 == null) {
            return;
        }
        numberPicker6.setSelectedTextBold(z10);
    }

    public final void setTextBold(boolean z10) {
        this.textBold = z10;
        NumberPicker numberPicker = this.mYearSpinner;
        if (numberPicker != null) {
            numberPicker.setTextBold(z10);
        }
        NumberPicker numberPicker2 = this.mMonthSpinner;
        if (numberPicker2 != null) {
            numberPicker2.setTextBold(z10);
        }
        NumberPicker numberPicker3 = this.mDaySpinner;
        if (numberPicker3 != null) {
            numberPicker3.setTextBold(z10);
        }
        NumberPicker numberPicker4 = this.mHourSpinner;
        if (numberPicker4 != null) {
            numberPicker4.setTextBold(z10);
        }
        NumberPicker numberPicker5 = this.mMinuteSpinner;
        if (numberPicker5 != null) {
            numberPicker5.setTextBold(z10);
        }
        NumberPicker numberPicker6 = this.mSecondSpinner;
        if (numberPicker6 == null) {
            return;
        }
        numberPicker6.setTextBold(z10);
    }

    public final void setTextColor(@l int i10) {
        if (i10 == 0) {
            return;
        }
        this.textColor = i10;
        NumberPicker numberPicker = this.mYearSpinner;
        if (numberPicker != null) {
            numberPicker.setTextColor(i10);
        }
        NumberPicker numberPicker2 = this.mMonthSpinner;
        if (numberPicker2 != null) {
            numberPicker2.setTextColor(this.textColor);
        }
        NumberPicker numberPicker3 = this.mDaySpinner;
        if (numberPicker3 != null) {
            numberPicker3.setTextColor(this.textColor);
        }
        NumberPicker numberPicker4 = this.mHourSpinner;
        if (numberPicker4 != null) {
            numberPicker4.setTextColor(this.textColor);
        }
        NumberPicker numberPicker5 = this.mMinuteSpinner;
        if (numberPicker5 != null) {
            numberPicker5.setTextColor(this.textColor);
        }
        NumberPicker numberPicker6 = this.mSecondSpinner;
        if (numberPicker6 == null) {
            return;
        }
        numberPicker6.setTextColor(this.textColor);
    }

    public final void setTextSize(@r int i10, @r int i11) {
        if (i10 == 0 || i11 == 0) {
            return;
        }
        Context context = getContext();
        f0.m(context);
        int iA = ha.a.a(context, i11);
        Context context2 = getContext();
        f0.m(context2);
        int iA2 = ha.a.a(context2, i10);
        NumberPicker numberPicker = this.mYearSpinner;
        if (numberPicker != null) {
            numberPicker.setTextSize(iA2);
        }
        NumberPicker numberPicker2 = this.mMonthSpinner;
        if (numberPicker2 != null) {
            numberPicker2.setTextSize(iA2);
        }
        NumberPicker numberPicker3 = this.mDaySpinner;
        if (numberPicker3 != null) {
            numberPicker3.setTextSize(iA2);
        }
        NumberPicker numberPicker4 = this.mHourSpinner;
        if (numberPicker4 != null) {
            numberPicker4.setTextSize(iA2);
        }
        NumberPicker numberPicker5 = this.mMinuteSpinner;
        if (numberPicker5 != null) {
            numberPicker5.setTextSize(iA2);
        }
        NumberPicker numberPicker6 = this.mSecondSpinner;
        if (numberPicker6 != null) {
            numberPicker6.setTextSize(iA2);
        }
        NumberPicker numberPicker7 = this.mYearSpinner;
        if (numberPicker7 != null) {
            numberPicker7.setSelectedTextSize(iA);
        }
        NumberPicker numberPicker8 = this.mMonthSpinner;
        if (numberPicker8 != null) {
            numberPicker8.setSelectedTextSize(iA);
        }
        NumberPicker numberPicker9 = this.mDaySpinner;
        if (numberPicker9 != null) {
            numberPicker9.setSelectedTextSize(iA);
        }
        NumberPicker numberPicker10 = this.mHourSpinner;
        if (numberPicker10 != null) {
            numberPicker10.setSelectedTextSize(iA);
        }
        NumberPicker numberPicker11 = this.mMinuteSpinner;
        if (numberPicker11 != null) {
            numberPicker11.setSelectedTextSize(iA);
        }
        NumberPicker numberPicker12 = this.mSecondSpinner;
        if (numberPicker12 == null) {
            return;
        }
        numberPicker12.setSelectedTextSize(iA);
    }

    public final void setThemeColor(@l int i10) {
        if (i10 == 0) {
            return;
        }
        this.themeColor = i10;
        NumberPicker numberPicker = this.mYearSpinner;
        if (numberPicker != null) {
            numberPicker.setSelectedTextColor(i10);
        }
        NumberPicker numberPicker2 = this.mMonthSpinner;
        if (numberPicker2 != null) {
            numberPicker2.setSelectedTextColor(this.themeColor);
        }
        NumberPicker numberPicker3 = this.mDaySpinner;
        if (numberPicker3 != null) {
            numberPicker3.setSelectedTextColor(this.themeColor);
        }
        NumberPicker numberPicker4 = this.mHourSpinner;
        if (numberPicker4 != null) {
            numberPicker4.setSelectedTextColor(this.themeColor);
        }
        NumberPicker numberPicker5 = this.mMinuteSpinner;
        if (numberPicker5 != null) {
            numberPicker5.setSelectedTextColor(this.themeColor);
        }
        NumberPicker numberPicker6 = this.mSecondSpinner;
        if (numberPicker6 == null) {
            return;
        }
        numberPicker6.setSelectedTextColor(this.themeColor);
    }

    @Override // com.loper7.date_time_picker.controller.d
    public void setWrapSelectorWheel(@e List<Integer> list, boolean z10) {
        a aVar = this.controller;
        if (aVar == null) {
            return;
        }
        aVar.setWrapSelectorWheel(list, z10);
    }

    public final void setWrapSelectorWheel(boolean z10) {
        setWrapSelectorWheel((List<Integer>) null, z10);
    }

    public final void setWrapSelectorWheel(@dl.d int[] types, boolean z10) {
        f0.p(types, "types");
        setWrapSelectorWheel(ArraysKt___ArraysKt.sz(types), z10);
    }
}
