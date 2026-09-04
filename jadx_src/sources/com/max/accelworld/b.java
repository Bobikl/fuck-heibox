package com.max.accelworld;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.bpea.entry.common.DataType;
import com.max.hbutils.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AccelWorldCopyText.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class b {
    public static ChangeQuickRedirect changeQuickRedirect;

    private static final void a(String str, String str2, Context context) {
        if (PatchProxy.proxy(new Object[]{str, str2, context}, null, changeQuickRedirect, true, bb.c.b.f30820nf, new Class[]{String.class, String.class, Context.class}, Void.TYPE).isSupported) {
            return;
        }
        Object systemService = context.getSystemService(DataType.CLIPBOARD);
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText(str, str2));
        }
        x.p("Copied");
    }

    public static final void b(@dl.d Activity activity, @dl.d String label, @dl.d String text) {
        if (PatchProxy.proxy(new Object[]{activity, label, text}, null, changeQuickRedirect, true, bb.c.b.f30682hf, new Class[]{Activity.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "<this>");
        f0.p(label, "label");
        f0.p(text, "text");
        a(label, text, activity);
    }

    public static final void c(@dl.d View view, @dl.d String label, @dl.d String text) {
        if (PatchProxy.proxy(new Object[]{view, label, text}, null, changeQuickRedirect, true, bb.c.b.f30774lf, new Class[]{View.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<this>");
        f0.p(label, "label");
        f0.p(text, "text");
        Context context = view.getContext();
        if (context == null) {
            return;
        }
        a(label, text, context);
    }

    public static final void d(@dl.d Fragment fragment, @dl.d String label, @dl.d String text) {
        if (PatchProxy.proxy(new Object[]{fragment, label, text}, null, changeQuickRedirect, true, bb.c.b.f30728jf, new Class[]{Fragment.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(fragment, "<this>");
        f0.p(label, "label");
        f0.p(text, "text");
        FragmentActivity activity = fragment.getActivity();
        if (activity == null) {
            return;
        }
        a(label, text, activity);
    }

    public static final void e(@dl.d String label, @dl.d String text, @dl.d Activity activity) {
        if (PatchProxy.proxy(new Object[]{label, text, activity}, null, changeQuickRedirect, true, bb.c.b.f1if, new Class[]{String.class, String.class, Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(label, "label");
        f0.p(text, "text");
        f0.p(activity, "activity");
        a(label, text, activity);
    }

    public static final void f(@dl.d String label, @dl.d String text, @dl.d View view) {
        if (PatchProxy.proxy(new Object[]{label, text, view}, null, changeQuickRedirect, true, bb.c.b.f30797mf, new Class[]{String.class, String.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(label, "label");
        f0.p(text, "text");
        f0.p(view, "view");
        Context context = view.getContext();
        if (context == null) {
            return;
        }
        a(label, text, context);
    }

    public static final void g(@dl.d String label, @dl.d String text, @dl.d Fragment fragment) {
        if (PatchProxy.proxy(new Object[]{label, text, fragment}, null, changeQuickRedirect, true, bb.c.b.f30751kf, new Class[]{String.class, String.class, Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(label, "label");
        f0.p(text, "text");
        f0.p(fragment, "fragment");
        FragmentActivity activity = fragment.getActivity();
        if (activity == null) {
            return;
        }
        a(label, text, activity);
    }
}
