package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
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
public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private CharSequence f54055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private Long f54056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private SimpleDateFormat f54057d;

    public class a extends e {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ p f54058i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ TextInputLayout f54059j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, p pVar, TextInputLayout textInputLayout2) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f54058i = pVar;
            this.f54059j = textInputLayout2;
        }

        @Override // com.google.android.material.datepicker.e
        void f() {
            SingleDateSelector.this.f54055b = this.f54059j.getError();
            this.f54058i.a();
        }

        @Override // com.google.android.material.datepicker.e
        void g(@p0 Long l10) {
            if (l10 == null) {
                SingleDateSelector.this.d();
            } else {
                SingleDateSelector.this.w0(l10.longValue());
            }
            SingleDateSelector.this.f54055b = null;
            this.f54058i.b(SingleDateSelector.this.t());
        }
    }

    public class b implements Parcelable.Creator<SingleDateSelector> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        @n0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SingleDateSelector createFromParcel(@n0 Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            singleDateSelector.f54056c = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        @n0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SingleDateSelector[] newArray(int i10) {
            return new SingleDateSelector[i10];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.f54056c = null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int Q() {
        return R.string.mtrl_picker_date_header_title;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int S(Context context) {
        return com.google.android.material.resources.b.g(context, R.attr.materialCalendarTheme, j.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @n0
    public String W0(@n0 Context context) {
        Resources resources = context.getResources();
        Long l10 = this.f54056c;
        return resources.getString(R.string.mtrl_picker_announce_current_selection, l10 == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : h.m(l10.longValue()));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @p0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Long t() {
        return this.f54056c;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void Z(@p0 Long l10) {
        this.f54056c = l10 == null ? null : Long.valueOf(s.a(l10.longValue()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View i0(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, @p0 Bundle bundle, CalendarConstraints calendarConstraints, @n0 p<Long> pVar) {
        View viewInflate = layoutInflater.inflate(R.layout.mtrl_picker_text_input_date, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(R.id.mtrl_picker_text_input_date);
        textInputLayout.setErrorAccessibilityLiveRegion(0);
        EditText editText = textInputLayout.getEditText();
        if (com.google.android.material.internal.l.a()) {
            editText.setInputType(17);
        }
        SimpleDateFormat simpleDateFormatG = this.f54057d;
        boolean z10 = simpleDateFormatG != null;
        if (!z10) {
            simpleDateFormatG = s.g();
        }
        SimpleDateFormat simpleDateFormat = simpleDateFormatG;
        String pattern = z10 ? simpleDateFormat.toPattern() : s.h(viewInflate.getResources(), simpleDateFormat);
        textInputLayout.setPlaceholderText(pattern);
        Long l10 = this.f54056c;
        if (l10 != null) {
            editText.setText(simpleDateFormat.format(l10));
        }
        editText.addTextChangedListener(new a(pattern, simpleDateFormat, textInputLayout, calendarConstraints, pVar, textInputLayout));
        g.b(editText);
        return viewInflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @p0
    public String q() {
        if (TextUtils.isEmpty(this.f54055b)) {
            return null;
        }
        return this.f54055b.toString();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void q0(@p0 SimpleDateFormat simpleDateFormat) {
        this.f54057d = simpleDateFormat;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @n0
    public String q1(@n0 Context context) {
        Resources resources = context.getResources();
        Long l10 = this.f54056c;
        if (l10 == null) {
            return resources.getString(R.string.mtrl_picker_date_header_unselected);
        }
        return resources.getString(R.string.mtrl_picker_date_header_selected, h.m(l10.longValue()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @n0
    public Collection<androidx.core.util.k<Long, Long>> r1() {
        return new ArrayList();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean s0() {
        return this.f54056c != null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @n0
    public Collection<Long> u0() {
        ArrayList arrayList = new ArrayList();
        Long l10 = this.f54056c;
        if (l10 != null) {
            arrayList.add(l10);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void w0(long j10) {
        this.f54056c = Long.valueOf(j10);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@n0 Parcel parcel, int i10) {
        parcel.writeValue(this.f54056c);
    }
}
