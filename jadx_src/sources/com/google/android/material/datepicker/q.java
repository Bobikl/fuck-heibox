package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: PickerFragment.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class q<S> extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final LinkedHashSet<p<S>> f54169b = new LinkedHashSet<>();

    q() {
    }

    boolean L3(p<S> pVar) {
        return this.f54169b.add(pVar);
    }

    void M3() {
        this.f54169b.clear();
    }

    abstract DateSelector<S> N3();

    boolean O3(p<S> pVar) {
        return this.f54169b.remove(pVar);
    }
}
