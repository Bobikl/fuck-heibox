package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.annotation.i0;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: AppCompatDialogFragment.java */
/* JADX INFO: loaded from: classes.dex */
public class j extends androidx.fragment.app.j {
    public j() {
    }

    public j(@i0 int i10) {
        super(i10);
    }

    @Override // androidx.fragment.app.j
    @n0
    public Dialog onCreateDialog(@p0 Bundle bundle) {
        return new i(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.j
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setupDialog(@n0 Dialog dialog, int i10) {
        if (!(dialog instanceof i)) {
            super.setupDialog(dialog, i10);
            return;
        }
        i iVar = (i) dialog;
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        iVar.j(1);
    }
}
