package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.annotation.e1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.Iterator;

/* JADX INFO: compiled from: MaterialTextInputPicker.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class m<S> extends q<S> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f54144f = "THEME_RES_ID_KEY";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f54145g = "DATE_SELECTOR_KEY";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f54146h = "CALENDAR_CONSTRAINTS_KEY";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e1
    private int f54147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private DateSelector<S> f54148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private CalendarConstraints f54149e;

    /* JADX INFO: compiled from: MaterialTextInputPicker.java */
    public class a extends p<S> {
        a() {
        }

        @Override // com.google.android.material.datepicker.p
        public void a() {
            Iterator<p<S>> it = m.this.f54169b.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }

        @Override // com.google.android.material.datepicker.p
        public void b(S s10) {
            Iterator<p<S>> it = m.this.f54169b.iterator();
            while (it.hasNext()) {
                it.next().b(s10);
            }
        }
    }

    @n0
    static <T> m<T> P3(DateSelector<T> dateSelector, @e1 int i10, @n0 CalendarConstraints calendarConstraints) {
        m<T> mVar = new m<>();
        Bundle bundle = new Bundle();
        bundle.putInt(f54144f, i10);
        bundle.putParcelable(f54145g, dateSelector);
        bundle.putParcelable(f54146h, calendarConstraints);
        mVar.setArguments(bundle);
        return mVar;
    }

    @Override // com.google.android.material.datepicker.q
    @n0
    public DateSelector<S> N3() {
        DateSelector<S> dateSelector = this.f54148d;
        if (dateSelector != null) {
            return dateSelector;
        }
        throw new IllegalStateException("dateSelector should not be null. Use MaterialTextInputPicker#newInstance() to create this fragment with a DateSelector, and call this method after the fragment has been created.");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@p0 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f54147c = bundle.getInt(f54144f);
        this.f54148d = (DateSelector) bundle.getParcelable(f54145g);
        this.f54149e = (CalendarConstraints) bundle.getParcelable(f54146h);
    }

    @Override // androidx.fragment.app.Fragment
    @n0
    public View onCreateView(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, @p0 Bundle bundle) {
        return this.f54148d.i0(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f54147c)), viewGroup, bundle, this.f54149e, new a());
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@n0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(f54144f, this.f54147c);
        bundle.putParcelable(f54145g, this.f54148d);
        bundle.putParcelable(f54146h, this.f54149e);
    }
}
