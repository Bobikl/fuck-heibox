package android.view.autofill;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class AutofillManager {

    public /* synthetic */ class AutofillCallback {
        static {
            throw new NoClassDefFoundError();
        }

        public native /* synthetic */ void onAutofillEvent(@NonNull View view, int i10, int i11);
    }

    static {
        throw new NoClassDefFoundError();
    }

    public native /* synthetic */ void cancel();

    public native /* synthetic */ void commit();

    public native /* synthetic */ void notifyValueChanged(View view);

    public native /* synthetic */ void notifyValueChanged(View view, int i10, AutofillValue autofillValue);

    public native /* synthetic */ void notifyViewEntered(@NonNull View view, int i10, @NonNull Rect rect);

    public native /* synthetic */ void notifyViewExited(@NonNull View view, int i10);

    public native /* synthetic */ void registerCallback(@Nullable AutofillCallback autofillCallback);

    public native /* synthetic */ void unregisterCallback(@Nullable AutofillCallback autofillCallback);
}
