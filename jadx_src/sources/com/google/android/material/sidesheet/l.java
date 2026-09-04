package com.google.android.material.sidesheet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.d0;
import androidx.annotation.e1;
import androidx.annotation.i0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.google.android.material.R;

/* JADX INFO: compiled from: SideSheetDialog.java */
/* JADX INFO: loaded from: classes7.dex */
public class l extends f<k> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f55263p = R.attr.sideSheetDialogTheme;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f55264q = R.style.Theme_Material3_Light_SideSheetDialog;

    /* JADX INFO: compiled from: SideSheetDialog.java */
    public class a extends k {
        a() {
        }

        @Override // com.google.android.material.sidesheet.k, com.google.android.material.sidesheet.c
        public void a(@n0 View view, int i10) {
            if (i10 == 5) {
                l.this.cancel();
            }
        }

        @Override // com.google.android.material.sidesheet.k, com.google.android.material.sidesheet.c
        public void b(@n0 View view, float f10) {
        }
    }

    public l(@n0 Context context) {
        this(context, 0);
    }

    public l(@n0 Context context, @e1 int i10) {
        super(context, i10, f55263p, f55264q);
    }

    @Override // com.google.android.material.sidesheet.f
    @n0
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public SideSheetBehavior<? extends View> n() {
        b bVarN = super.n();
        if (bVarN instanceof SideSheetBehavior) {
            return (SideSheetBehavior) bVarN;
        }
        throw new IllegalStateException("The view is not associated with SideSheetBehavior");
    }

    @Override // com.google.android.material.sidesheet.f, android.app.Dialog, android.content.DialogInterface
    public /* bridge */ /* synthetic */ void cancel() {
        super.cancel();
    }

    @Override // com.google.android.material.sidesheet.f
    void l(b<k> bVar) {
        bVar.a(new a());
    }

    @Override // com.google.android.material.sidesheet.f
    @n0
    b<k> o(@n0 FrameLayout frameLayout) {
        return SideSheetBehavior.c0(frameLayout);
    }

    @Override // com.google.android.material.sidesheet.f
    @d0
    int q() {
        return R.id.m3_side_sheet;
    }

    @Override // com.google.android.material.sidesheet.f
    @i0
    int r() {
        return R.layout.m3_side_sheet_dialog;
    }

    @Override // com.google.android.material.sidesheet.f, android.app.Dialog
    public /* bridge */ /* synthetic */ void setCancelable(boolean z10) {
        super.setCancelable(z10);
    }

    @Override // com.google.android.material.sidesheet.f, android.app.Dialog
    public /* bridge */ /* synthetic */ void setCanceledOnTouchOutside(boolean z10) {
        super.setCanceledOnTouchOutside(z10);
    }

    @Override // com.google.android.material.sidesheet.f, androidx.appcompat.app.i, androidx.activity.k, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(@i0 int i10) {
        super.setContentView(i10);
    }

    @Override // com.google.android.material.sidesheet.f, androidx.appcompat.app.i, androidx.activity.k, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(@p0 View view) {
        super.setContentView(view);
    }

    @Override // com.google.android.material.sidesheet.f, androidx.appcompat.app.i, androidx.activity.k, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(@p0 View view, @p0 ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
    }

    @Override // com.google.android.material.sidesheet.f
    int t() {
        return 3;
    }

    @Override // com.google.android.material.sidesheet.f
    public /* bridge */ /* synthetic */ boolean v() {
        return super.v();
    }

    @Override // com.google.android.material.sidesheet.f
    public /* bridge */ /* synthetic */ void x(boolean z10) {
        super.x(z10);
    }
}
