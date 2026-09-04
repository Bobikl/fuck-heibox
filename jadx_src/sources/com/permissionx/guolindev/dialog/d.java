package com.permissionx.guolindev.dialog;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.fragment.app.j;
import java.util.List;

/* JADX INFO: compiled from: RationaleDialogFragment.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d extends j {
    @p0
    public abstract View L3();

    @n0
    public abstract List<String> M3();

    @n0
    public abstract View N3();

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onCreate(@p0 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            dismiss();
        }
    }
}
