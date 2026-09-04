package c6;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.KeyEvent;
import z5.e;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    public static final class a implements DialogInterface.OnKeyListener {
        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
            return i10 == 4;
        }
    }

    public static AlertDialog.Builder a(Context context, String str, String str2, DialogInterface.OnClickListener onClickListener, String str3, DialogInterface.OnClickListener onClickListener2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        if (!TextUtils.isEmpty(str3) && onClickListener2 != null) {
            builder.setPositiveButton(str3, onClickListener2);
        }
        if (!TextUtils.isEmpty(str2) && onClickListener != null) {
            builder.setNegativeButton(str2, onClickListener);
        }
        return builder;
    }

    public static Dialog b(Context context, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2) {
        AlertDialog.Builder builderA = a(context, str, str3, onClickListener, str4, onClickListener2);
        builderA.setTitle(str);
        builderA.setMessage(str2);
        AlertDialog alertDialogCreate = builderA.create();
        alertDialogCreate.setCanceledOnTouchOutside(false);
        alertDialogCreate.setOnKeyListener(new a());
        try {
            alertDialogCreate.show();
        } catch (Throwable th2) {
            e.c(j5.a.f124275z, "showDialog ", th2);
        }
        return alertDialogCreate;
    }
}
