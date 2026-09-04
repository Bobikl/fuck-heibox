package com.huawei.hms.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.UIUtil;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Activity f62714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AlertDialog f62715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Callback f62716c;

    public interface Callback {
        void onCancel(AbstractDialog abstractDialog);

        void onDoWork(AbstractDialog abstractDialog);
    }

    public class a implements DialogInterface.OnClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            AbstractDialog.this.fireDoWork();
        }
    }

    public class b implements DialogInterface.OnClickListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            AbstractDialog.this.cancel();
        }
    }

    public class c implements DialogInterface.OnCancelListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            AbstractDialog.this.fireCancel();
        }
    }

    public class d implements DialogInterface.OnKeyListener {
        d() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
            if (4 != i10 || keyEvent.getAction() != 1) {
                return false;
            }
            AbstractDialog.this.cancel();
            return true;
        }
    }

    public void cancel() {
        AlertDialog alertDialog = this.f62715b;
        if (alertDialog != null) {
            alertDialog.cancel();
        }
    }

    public void dismiss() {
        AlertDialog alertDialog = this.f62715b;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    protected void fireCancel() {
        Callback callback = this.f62716c;
        if (callback != null) {
            callback.onCancel(this);
        }
    }

    protected void fireDoWork() {
        Callback callback = this.f62716c;
        if (callback != null) {
            callback.onDoWork(this);
        }
    }

    protected Activity getActivity() {
        return this.f62714a;
    }

    protected int getDialogThemeId() {
        return UIUtil.getDialogThemeId(getActivity());
    }

    protected AlertDialog onCreateDialog(Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(), getDialogThemeId());
        String strOnGetTitleString = onGetTitleString(activity);
        if (strOnGetTitleString != null) {
            builder.setTitle(strOnGetTitleString);
        }
        String strOnGetMessageString = onGetMessageString(activity);
        if (strOnGetMessageString != null) {
            builder.setMessage(strOnGetMessageString);
        }
        String strOnGetPositiveButtonString = onGetPositiveButtonString(activity);
        if (strOnGetPositiveButtonString != null) {
            builder.setPositiveButton(strOnGetPositiveButtonString, new a());
        }
        String strOnGetNegativeButtonString = onGetNegativeButtonString(activity);
        if (strOnGetNegativeButtonString != null) {
            builder.setNegativeButton(strOnGetNegativeButtonString, new b());
        }
        return builder.create();
    }

    protected abstract String onGetMessageString(Context context);

    protected abstract String onGetNegativeButtonString(Context context);

    protected abstract String onGetPositiveButtonString(Context context);

    protected abstract String onGetTitleString(Context context);

    public void setMessage(CharSequence charSequence) {
        AlertDialog alertDialog = this.f62715b;
        if (alertDialog != null) {
            alertDialog.setMessage(charSequence);
        }
    }

    public void setTitle(CharSequence charSequence) {
        AlertDialog alertDialog = this.f62715b;
        if (alertDialog != null) {
            alertDialog.setTitle(charSequence);
        }
    }

    public void show(Activity activity, Callback callback) {
        this.f62714a = activity;
        this.f62716c = callback;
        if (activity == null || activity.isFinishing()) {
            HMSLog.e("AbstractDialog", "In show, The activity is null or finishing.");
            return;
        }
        AlertDialog alertDialogOnCreateDialog = onCreateDialog(this.f62714a);
        this.f62715b = alertDialogOnCreateDialog;
        alertDialogOnCreateDialog.setCanceledOnTouchOutside(false);
        this.f62715b.setOnCancelListener(new c());
        this.f62715b.setOnKeyListener(new d());
        this.f62715b.show();
    }
}
