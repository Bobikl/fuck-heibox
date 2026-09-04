package com.permissionx.guolindev.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.List;

/* JADX INFO: compiled from: RationaleDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends Dialog {
    public c(@n0 Context context) {
        super(context);
    }

    public c(@n0 Context context, int i10) {
        super(context, i10);
    }

    protected c(@n0 Context context, boolean z10, @p0 DialogInterface.OnCancelListener onCancelListener) {
        super(context, z10, onCancelListener);
    }

    @p0
    public abstract View a();

    @n0
    public abstract List<String> b();

    @n0
    public abstract View c();
}
