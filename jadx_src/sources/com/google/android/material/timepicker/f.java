package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;

/* JADX INFO: compiled from: MaxInputValidator.java */
/* JADX INFO: loaded from: classes7.dex */
public class f implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f55806a;

    public f(int i10) {
        this.f55806a = i10;
    }

    public int a() {
        return this.f55806a;
    }

    public void b(int i10) {
        this.f55806a = i10;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        try {
            StringBuilder sb2 = new StringBuilder(spanned);
            sb2.replace(i12, i13, charSequence.subSequence(i10, i11).toString());
            if (Integer.parseInt(sb2.toString()) <= this.f55806a) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }
}
