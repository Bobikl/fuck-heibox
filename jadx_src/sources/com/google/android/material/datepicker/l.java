package com.google.android.material.datepicker;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.annotation.e1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.google.android.material.R;

/* JADX INFO: compiled from: MaterialStyledDatePickerDialog.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP, RestrictTo.Scope.TESTS})
public class l extends DatePickerDialog {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.f
    private static final int f54140d = 16843612;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @e1
    private static final int f54141e = R.style.MaterialAlertDialog_MaterialComponents_Picker_Date_Spinner;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private final Drawable f54142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    private final Rect f54143c;

    public l(@n0 Context context) {
        this(context, 0);
    }

    public l(@n0 Context context, int i10) {
        this(context, i10, null, -1, -1, -1);
    }

    public l(@n0 Context context, int i10, @p0 DatePickerDialog.OnDateSetListener onDateSetListener, int i11, int i12, int i13) {
        super(context, i10, onDateSetListener, i11, i12, i13);
        Context context2 = getContext();
        int iG = com.google.android.material.resources.b.g(getContext(), R.attr.colorSurface, getClass().getCanonicalName());
        int i14 = f54141e;
        com.google.android.material.shape.k kVar = new com.google.android.material.shape.k(context2, null, 16843612, i14);
        kVar.o0(ColorStateList.valueOf(iG));
        Rect rectA = d9.c.a(context2, 16843612, i14);
        this.f54143c = rectA;
        this.f54142b = d9.c.b(kVar, rectA);
    }

    public l(@n0 Context context, @p0 DatePickerDialog.OnDateSetListener onDateSetListener, int i10, int i11, int i12) {
        this(context, 0, onDateSetListener, i10, i11, i12);
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(this.f54142b);
        getWindow().getDecorView().setOnTouchListener(new d9.a(this, this.f54143c));
    }
}
