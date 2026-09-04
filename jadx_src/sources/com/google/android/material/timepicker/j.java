package com.google.android.material.timepicker;

import androidx.annotation.d1;
import androidx.annotation.f0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: TimePickerControls.java */
/* JADX INFO: loaded from: classes7.dex */
public interface j {

    /* JADX INFO: compiled from: TimePickerControls.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* JADX INFO: compiled from: TimePickerControls.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    void a(int i10, int i11, @f0(from = 0) int i12);

    void setActiveSelection(int i10);

    void setHandRotation(float f10);

    void setValues(String[] strArr, @d1 int i10);
}
