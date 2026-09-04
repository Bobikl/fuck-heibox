package com.huawei.hms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: loaded from: classes7.dex */
public class ErrorDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Dialog f60452a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DialogInterface.OnCancelListener f60453b = null;

    public static ErrorDialogFragment newInstance(Dialog dialog) {
        return newInstance(dialog, null);
    }

    public static ErrorDialogFragment newInstance(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        com.huawei.hms.common.internal.Preconditions.checkNotNull(dialog, "Dialog cannot be null!");
        ErrorDialogFragment errorDialogFragment = new ErrorDialogFragment();
        errorDialogFragment.f60452a = dialog;
        dialog.setOnCancelListener(null);
        errorDialogFragment.f60452a.setOnDismissListener(null);
        if (onCancelListener != null) {
            errorDialogFragment.f60453b = onCancelListener;
        }
        return errorDialogFragment;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f60453b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f60452a == null) {
            setShowsDialog(false);
        }
        return this.f60452a;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        com.huawei.hms.common.internal.Preconditions.checkNotNull(fragmentManager, "FragmentManager cannot be null!");
        super.show(fragmentManager, str);
    }
}
