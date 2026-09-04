package com.google.android.material.datepicker;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.google.android.material.R;
import com.google.android.material.internal.b0;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import kotlin.text.y;

/* JADX INFO: compiled from: DateFormatTextWatcher.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class e extends b0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f54081h = 1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private final TextInputLayout f54082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DateFormat f54083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CalendarConstraints f54084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f54085e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Runnable f54086f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Runnable f54087g;

    e(final String str, DateFormat dateFormat, @n0 TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.f54083c = dateFormat;
        this.f54082b = textInputLayout;
        this.f54084d = calendarConstraints;
        this.f54085e = textInputLayout.getContext().getString(R.string.mtrl_picker_out_of_range);
        this.f54086f = new Runnable() { // from class: com.google.android.material.datepicker.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f54077b.e(str);
            }
        };
    }

    private Runnable c(final long j10) {
        return new Runnable() { // from class: com.google.android.material.datepicker.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f54079b.d(j10);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(long j10) {
        this.f54082b.setError(String.format(this.f54085e, i(h.c(j10))));
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(String str) {
        TextInputLayout textInputLayout = this.f54082b;
        DateFormat dateFormat = this.f54083c;
        Context context = textInputLayout.getContext();
        textInputLayout.setError(context.getString(R.string.mtrl_picker_invalid_format) + "\n" + String.format(context.getString(R.string.mtrl_picker_invalid_format_use), i(str)) + "\n" + String.format(context.getString(R.string.mtrl_picker_invalid_format_example), i(dateFormat.format(new Date(s.t().getTimeInMillis())))));
        f();
    }

    private String i(String str) {
        return str.replace(' ', y.f128598g);
    }

    void f() {
    }

    abstract void g(@p0 Long l10);

    public void h(View view, Runnable runnable) {
        view.postDelayed(runnable, 1000L);
    }

    @Override // com.google.android.material.internal.b0, android.text.TextWatcher
    public void onTextChanged(@n0 CharSequence charSequence, int i10, int i11, int i12) {
        this.f54082b.removeCallbacks(this.f54086f);
        this.f54082b.removeCallbacks(this.f54087g);
        this.f54082b.setError(null);
        g(null);
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        try {
            Date date = this.f54083c.parse(charSequence.toString());
            this.f54082b.setError(null);
            long time = date.getTime();
            if (this.f54084d.j().e(time) && this.f54084d.y(time)) {
                g(Long.valueOf(date.getTime()));
                return;
            }
            Runnable runnableC = c(time);
            this.f54087g = runnableC;
            h(this.f54082b, runnableC);
        } catch (ParseException unused) {
            h(this.f54082b, this.f54086f);
        }
    }
}
