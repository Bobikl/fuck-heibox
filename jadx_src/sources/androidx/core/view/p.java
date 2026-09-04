package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: KeyEventDispatcher.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f21774a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f21775b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f21776c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Field f21777d;

    /* JADX INFO: compiled from: KeyEventDispatcher.java */
    public interface a {
        boolean superDispatchKeyEvent(@androidx.annotation.n0 KeyEvent keyEvent);
    }

    private p() {
    }

    private static boolean a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f21774a) {
            try {
                f21775b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f21774a = true;
        }
        Method method = f21775b;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(actionBar, keyEvent);
                if (objInvoke == null) {
                    return false;
                }
                return ((Boolean) objInvoke).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    private static boolean b(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (j1.z(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    private static boolean c(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListenerF = f(dialog);
        if (onKeyListenerF != null && onKeyListenerF.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (j1.z(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }

    public static boolean d(@androidx.annotation.n0 View view, @androidx.annotation.n0 KeyEvent keyEvent) {
        return j1.A(view, keyEvent);
    }

    @SuppressLint({"LambdaLast"})
    public static boolean e(@androidx.annotation.n0 a aVar, @androidx.annotation.p0 View view, @androidx.annotation.p0 Window.Callback callback, @androidx.annotation.n0 KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return aVar.superDispatchKeyEvent(keyEvent);
        }
        if (callback instanceof Activity) {
            return b((Activity) callback, keyEvent);
        }
        if (callback instanceof Dialog) {
            return c((Dialog) callback, keyEvent);
        }
        return (view != null && j1.z(view, keyEvent)) || aVar.superDispatchKeyEvent(keyEvent);
    }

    private static DialogInterface.OnKeyListener f(Dialog dialog) {
        if (!f21776c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f21777d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f21776c = true;
        }
        Field field = f21777d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }
}
