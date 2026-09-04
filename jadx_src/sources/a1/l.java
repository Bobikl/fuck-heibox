package a1;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.annotation.u;
import androidx.annotation.w0;
import androidx.core.app.o0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AutofillCallback.android.kt */
/* JADX INFO: loaded from: classes.dex */
@w0(26)
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¨\u0006\u000f"}, d2 = {"La1/l;", "Landroid/view/autofill/AutofillManager$AutofillCallback;", "Landroid/view/View;", sd.b.f139384b, "", "virtualId", o0.I0, "Lkotlin/b2;", "onAutofillEvent", "La1/b;", "autofill", ak.av, "b", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class l extends AutofillManager.AutofillCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final l f1156a = new l();

    private l() {
    }

    @u
    @androidx.compose.ui.g
    public final void a(@dl.d b autofill) {
        f0.p(autofill, "autofill");
        autofill.getF1152c().registerCallback(this);
    }

    @u
    @androidx.compose.ui.g
    public final void b(@dl.d b autofill) {
        f0.p(autofill, "autofill");
        autofill.getF1152c().unregisterCallback(this);
    }

    @Override // android.view.autofill.AutofillManager.AutofillCallback
    public void onAutofillEvent(@dl.d View view, int i10, int i11) {
        String str;
        f0.p(view, "view");
        super.onAutofillEvent(view, i10, i11);
        if (i11 == 1) {
            str = "Autofill popup was shown.";
        } else if (i11 != 2) {
            str = i11 != 3 ? "Unknown status event." : "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account";
        } else {
            str = "Autofill popup was hidden.";
        }
        Log.d("Autofill Status", str);
    }
}
