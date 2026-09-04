package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.google.android.material.R;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class RangeDateSelector implements DateSelector<androidx.core.util.k<Long, Long>> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private CharSequence f54039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f54040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f54041d = " ";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private Long f54042e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private Long f54043f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private Long f54044g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private Long f54045h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private SimpleDateFormat f54046i;

    public class a extends e {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ TextInputLayout f54047i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ TextInputLayout f54048j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ p f54049k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, p pVar) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f54047i = textInputLayout2;
            this.f54048j = textInputLayout3;
            this.f54049k = pVar;
        }

        @Override // com.google.android.material.datepicker.e
        void f() {
            RangeDateSelector.this.f54044g = null;
            RangeDateSelector.this.p(this.f54047i, this.f54048j, this.f54049k);
        }

        @Override // com.google.android.material.datepicker.e
        void g(@p0 Long l10) {
            RangeDateSelector.this.f54044g = l10;
            RangeDateSelector.this.p(this.f54047i, this.f54048j, this.f54049k);
        }
    }

    public class b extends e {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ TextInputLayout f54051i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ TextInputLayout f54052j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ p f54053k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, p pVar) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f54051i = textInputLayout2;
            this.f54052j = textInputLayout3;
            this.f54053k = pVar;
        }

        @Override // com.google.android.material.datepicker.e
        void f() {
            RangeDateSelector.this.f54045h = null;
            RangeDateSelector.this.p(this.f54051i, this.f54052j, this.f54053k);
        }

        @Override // com.google.android.material.datepicker.e
        void g(@p0 Long l10) {
            RangeDateSelector.this.f54045h = l10;
            RangeDateSelector.this.p(this.f54051i, this.f54052j, this.f54053k);
        }
    }

    public class c implements Parcelable.Creator<RangeDateSelector> {
        c() {
        }

        @Override // android.os.Parcelable.Creator
        @n0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RangeDateSelector createFromParcel(@n0 Parcel parcel) {
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            rangeDateSelector.f54042e = (Long) parcel.readValue(Long.class.getClassLoader());
            rangeDateSelector.f54043f = (Long) parcel.readValue(Long.class.getClassLoader());
            return rangeDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        @n0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RangeDateSelector[] newArray(int i10) {
            return new RangeDateSelector[i10];
        }
    }

    private void h(@n0 TextInputLayout textInputLayout, @n0 TextInputLayout textInputLayout2) {
        if (textInputLayout.getError() != null && this.f54040c.contentEquals(textInputLayout.getError())) {
            textInputLayout.setError(null);
        }
        if (textInputLayout2.getError() == null || !" ".contentEquals(textInputLayout2.getError())) {
            return;
        }
        textInputLayout2.setError(null);
    }

    private boolean k(long j10, long j11) {
        return j10 <= j11;
    }

    private void l(@n0 TextInputLayout textInputLayout, @n0 TextInputLayout textInputLayout2) {
        textInputLayout.setError(this.f54040c);
        textInputLayout2.setError(" ");
    }

    private void o(@n0 TextInputLayout textInputLayout, @n0 TextInputLayout textInputLayout2) {
        if (!TextUtils.isEmpty(textInputLayout.getError())) {
            this.f54039b = textInputLayout.getError();
        } else if (TextUtils.isEmpty(textInputLayout2.getError())) {
            this.f54039b = null;
        } else {
            this.f54039b = textInputLayout2.getError();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(@n0 TextInputLayout textInputLayout, @n0 TextInputLayout textInputLayout2, @n0 p<androidx.core.util.k<Long, Long>> pVar) {
        Long l10 = this.f54044g;
        if (l10 == null || this.f54045h == null) {
            h(textInputLayout, textInputLayout2);
            pVar.a();
        } else if (k(l10.longValue(), this.f54045h.longValue())) {
            this.f54042e = this.f54044g;
            this.f54043f = this.f54045h;
            pVar.b(t());
        } else {
            l(textInputLayout, textInputLayout2);
            pVar.a();
        }
        o(textInputLayout, textInputLayout2);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int Q() {
        return R.string.mtrl_picker_range_header_title;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int S(@n0 Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return com.google.android.material.resources.b.g(context, Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(R.dimen.mtrl_calendar_maximum_default_fullscreen_minor_axis) ? R.attr.materialCalendarTheme : R.attr.materialCalendarFullscreenTheme, j.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @n0
    public String W0(@n0 Context context) {
        Resources resources = context.getResources();
        androidx.core.util.k<String, String> kVarA = h.a(this.f54042e, this.f54043f);
        String str = kVarA.f21263a;
        String string = str == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : str;
        String str2 = kVarA.f21264b;
        return resources.getString(R.string.mtrl_picker_announce_current_range_selection, string, str2 == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View i0(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, @p0 Bundle bundle, CalendarConstraints calendarConstraints, @n0 p<androidx.core.util.k<Long, Long>> pVar) {
        View viewInflate = layoutInflater.inflate(R.layout.mtrl_picker_text_input_date_range, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(R.id.mtrl_picker_text_input_range_start);
        TextInputLayout textInputLayout2 = (TextInputLayout) viewInflate.findViewById(R.id.mtrl_picker_text_input_range_end);
        textInputLayout.setErrorAccessibilityLiveRegion(0);
        textInputLayout2.setErrorAccessibilityLiveRegion(0);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        if (com.google.android.material.internal.l.a()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.f54040c = viewInflate.getResources().getString(R.string.mtrl_picker_invalid_range);
        SimpleDateFormat simpleDateFormatG = this.f54046i;
        boolean z10 = simpleDateFormatG != null;
        if (!z10) {
            simpleDateFormatG = s.g();
        }
        SimpleDateFormat simpleDateFormat = simpleDateFormatG;
        Long l10 = this.f54042e;
        if (l10 != null) {
            editText.setText(simpleDateFormat.format(l10));
            this.f54044g = this.f54042e;
        }
        Long l11 = this.f54043f;
        if (l11 != null) {
            editText2.setText(simpleDateFormat.format(l11));
            this.f54045h = this.f54043f;
        }
        String pattern = z10 ? simpleDateFormat.toPattern() : s.h(viewInflate.getResources(), simpleDateFormat);
        textInputLayout.setPlaceholderText(pattern);
        textInputLayout2.setPlaceholderText(pattern);
        editText.addTextChangedListener(new a(pattern, simpleDateFormat, textInputLayout, calendarConstraints, textInputLayout, textInputLayout2, pVar));
        editText2.addTextChangedListener(new b(pattern, simpleDateFormat, textInputLayout2, calendarConstraints, textInputLayout, textInputLayout2, pVar));
        g.b(editText, editText2);
        return viewInflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @n0
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public androidx.core.util.k<Long, Long> t() {
        return new androidx.core.util.k<>(this.f54042e, this.f54043f);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void Z(@n0 androidx.core.util.k<Long, Long> kVar) {
        Long l10 = kVar.f21263a;
        if (l10 != null && kVar.f21264b != null) {
            androidx.core.util.o.a(k(l10.longValue(), kVar.f21264b.longValue()));
        }
        Long l11 = kVar.f21263a;
        this.f54042e = l11 == null ? null : Long.valueOf(s.a(l11.longValue()));
        Long l12 = kVar.f21264b;
        this.f54043f = l12 != null ? Long.valueOf(s.a(l12.longValue())) : null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @p0
    public String q() {
        if (TextUtils.isEmpty(this.f54039b)) {
            return null;
        }
        return this.f54039b.toString();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void q0(@p0 SimpleDateFormat simpleDateFormat) {
        this.f54046i = simpleDateFormat;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @n0
    public String q1(@n0 Context context) {
        Resources resources = context.getResources();
        Long l10 = this.f54042e;
        if (l10 == null && this.f54043f == null) {
            return resources.getString(R.string.mtrl_picker_range_header_unselected);
        }
        Long l11 = this.f54043f;
        if (l11 == null) {
            return resources.getString(R.string.mtrl_picker_range_header_only_start_selected, h.c(l10.longValue()));
        }
        if (l10 == null) {
            return resources.getString(R.string.mtrl_picker_range_header_only_end_selected, h.c(l11.longValue()));
        }
        androidx.core.util.k<String, String> kVarA = h.a(l10, l11);
        return resources.getString(R.string.mtrl_picker_range_header_selected, kVarA.f21263a, kVarA.f21264b);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @n0
    public Collection<androidx.core.util.k<Long, Long>> r1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new androidx.core.util.k(this.f54042e, this.f54043f));
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean s0() {
        Long l10 = this.f54042e;
        return (l10 == null || this.f54043f == null || !k(l10.longValue(), this.f54043f.longValue())) ? false : true;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @n0
    public Collection<Long> u0() {
        ArrayList arrayList = new ArrayList();
        Long l10 = this.f54042e;
        if (l10 != null) {
            arrayList.add(l10);
        }
        Long l11 = this.f54043f;
        if (l11 != null) {
            arrayList.add(l11);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void w0(long j10) {
        Long l10 = this.f54042e;
        if (l10 == null) {
            this.f54042e = Long.valueOf(j10);
        } else if (this.f54043f == null && k(l10.longValue(), j10)) {
            this.f54043f = Long.valueOf(j10);
        } else {
            this.f54043f = null;
            this.f54042e = Long.valueOf(j10);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@n0 Parcel parcel, int i10) {
        parcel.writeValue(this.f54042e);
        parcel.writeValue(this.f54043f);
    }
}
