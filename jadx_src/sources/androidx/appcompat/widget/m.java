package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.j1;
import com.bytedance.bpea.entry.common.DataType;

/* JADX INFO: compiled from: AppCompatReceiveContentHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f2838a = "ReceiveContent";

    /* JADX INFO: compiled from: AppCompatReceiveContentHelper.java */
    @androidx.annotation.w0(24)
    public static final class a {
        private a() {
        }

        @androidx.annotation.u
        static boolean a(@androidx.annotation.n0 DragEvent dragEvent, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                j1.m1(textView, new androidx.core.view.e.b(dragEvent.getClipData(), 3).a());
                return true;
            } finally {
                textView.endBatchEdit();
            }
        }

        @androidx.annotation.u
        static boolean b(@androidx.annotation.n0 DragEvent dragEvent, @androidx.annotation.n0 View view, @androidx.annotation.n0 Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            j1.m1(view, new androidx.core.view.e.b(dragEvent.getClipData(), 3).a());
            return true;
        }
    }

    private m() {
    }

    static boolean a(@androidx.annotation.n0 View view, @androidx.annotation.n0 DragEvent dragEvent) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 31 && i10 >= 24 && dragEvent.getLocalState() == null && j1.h0(view) != null) {
            Activity activityC = c(view);
            if (activityC == null) {
                Log.i(f2838a, "Can't handle drop: no activity: view=" + view);
                return false;
            }
            if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            }
            if (dragEvent.getAction() == 3) {
                return view instanceof TextView ? a.a(dragEvent, (TextView) view, activityC) : a.b(dragEvent, view, activityC);
            }
        }
        return false;
    }

    static boolean b(@androidx.annotation.n0 TextView textView, int i10) {
        if (Build.VERSION.SDK_INT >= 31 || j1.h0(textView) == null || !(i10 == 16908322 || i10 == 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService(DataType.CLIPBOARD);
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            j1.m1(textView, new androidx.core.view.e.b(primaryClip, 1).d(i10 != 16908322 ? 1 : 0).a());
        }
        return true;
    }

    @androidx.annotation.p0
    static Activity c(@androidx.annotation.n0 View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
