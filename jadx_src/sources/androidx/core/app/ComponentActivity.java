package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ReportFragment;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ComponentActivity extends Activity implements androidx.lifecycle.y, androidx.core.view.p.a {
    private androidx.collection.j2<Class<? extends a>, a> mExtraDataMap = new androidx.collection.j2<>();
    private androidx.lifecycle.a0 mLifecycleRegistry = new androidx.lifecycle.a0(this);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static class a {
    }

    @androidx.annotation.r0(markerClass = {androidx.core.os.a.b.class})
    private static boolean shouldSkipDump(@androidx.annotation.p0 String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return false;
        }
        String str = strArr[0];
        str.hashCode();
        switch (str) {
            case "--translation":
                return Build.VERSION.SDK_INT >= 31;
            case "--dump-dumpable":
            case "--list-dumpables":
                return androidx.core.os.a.k();
            case "--contentcapture":
                return Build.VERSION.SDK_INT >= 29;
            case "--autofill":
                return Build.VERSION.SDK_INT >= 26;
            default:
                return false;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !androidx.core.view.p.d(decorView, keyEvent)) {
            return androidx.core.view.p.e(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !androidx.core.view.p.d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public <T extends a> T getExtraData(Class<T> cls) {
        return (T) this.mExtraDataMap.get(cls);
    }

    @androidx.annotation.n0
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    protected void onCreate(@androidx.annotation.p0 Bundle bundle) {
        super.onCreate(bundle);
        ReportFragment.g(this);
    }

    @Override // android.app.Activity
    @androidx.annotation.i
    protected void onSaveInstanceState(@androidx.annotation.n0 Bundle bundle) {
        this.mLifecycleRegistry.n(Lifecycle.State.CREATED);
        super.onSaveInstanceState(bundle);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public void putExtraData(a aVar) {
        this.mExtraDataMap.put((Class<? extends a>) aVar.getClass(), aVar);
    }

    protected final boolean shouldDumpInternalState(@androidx.annotation.p0 String[] strArr) {
        return !shouldSkipDump(strArr);
    }

    @Override // androidx.core.view.p.a
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean superDispatchKeyEvent(@androidx.annotation.n0 KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
