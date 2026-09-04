package com.google.android.material.bottomsheet;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.i0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.appcompat.app.j;

/* JADX INFO: compiled from: BottomSheetDialogFragment.java */
/* JADX INFO: loaded from: classes7.dex */
public class b extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f53342b;

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BottomSheetDialogFragment.java */
    public class C0418b extends BottomSheetBehavior.f {
        private C0418b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(@n0 View view, float f10) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void c(@n0 View view, int i10) {
            if (i10 == 5) {
                b.this.M3();
            }
        }
    }

    public b() {
    }

    @SuppressLint({"ValidFragment"})
    public b(@i0 int i10) {
        super(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M3() {
        if (this.f53342b) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    private void N3(@n0 BottomSheetBehavior<?> bottomSheetBehavior, boolean z10) {
        this.f53342b = z10;
        if (bottomSheetBehavior.getState() == 5) {
            M3();
            return;
        }
        if (getDialog() instanceof com.google.android.material.bottomsheet.a) {
            ((com.google.android.material.bottomsheet.a) getDialog()).s();
        }
        bottomSheetBehavior.d0(new C0418b());
        bottomSheetBehavior.c(5);
    }

    private boolean O3(boolean z10) {
        Dialog dialog = getDialog();
        if (!(dialog instanceof com.google.android.material.bottomsheet.a)) {
            return false;
        }
        com.google.android.material.bottomsheet.a aVar = (com.google.android.material.bottomsheet.a) dialog;
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorP = aVar.p();
        if (!bottomSheetBehaviorP.L0() || !aVar.q()) {
            return false;
        }
        N3(bottomSheetBehaviorP, z10);
        return true;
    }

    @Override // androidx.fragment.app.j
    public void dismiss() {
        if (O3(false)) {
            return;
        }
        super.dismiss();
    }

    @Override // androidx.fragment.app.j
    public void dismissAllowingStateLoss() {
        if (O3(true)) {
            return;
        }
        super.dismissAllowingStateLoss();
    }

    @Override // androidx.appcompat.app.j, androidx.fragment.app.j
    @n0
    public Dialog onCreateDialog(@p0 Bundle bundle) {
        return new com.google.android.material.bottomsheet.a(getContext(), getTheme());
    }
}
