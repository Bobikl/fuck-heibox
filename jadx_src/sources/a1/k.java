package a1;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.annotation.u;
import androidx.annotation.w0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AndroidAutofill.android.kt */
/* JADX INFO: loaded from: classes.dex */
@w0(26)
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0006H\u0007J%\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¨\u0006\u001d"}, d2 = {"La1/k;", "", "Landroid/view/ViewStructure;", "structure", "Landroid/view/autofill/AutofillId;", "parent", "", "virtualId", "Lkotlin/b2;", "g", ak.av, "type", RXScreenCaptureService.KEY_HEIGHT, "", "", "hints", "f", "(Landroid/view/ViewStructure;[Ljava/lang/String;)V", "Landroid/view/autofill/AutofillValue;", "value", "", "d", "b", ak.aF, "e", "", "i", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final k f1155a = new k();

    private k() {
    }

    @u
    @w0(26)
    @dl.e
    public final AutofillId a(@dl.d ViewStructure structure) {
        f0.p(structure, "structure");
        return structure.getAutofillId();
    }

    @u
    @w0(26)
    public final boolean b(@dl.d AutofillValue value) {
        f0.p(value, "value");
        return value.isDate();
    }

    @u
    @w0(26)
    public final boolean c(@dl.d AutofillValue value) {
        f0.p(value, "value");
        return value.isList();
    }

    @u
    @w0(26)
    public final boolean d(@dl.d AutofillValue value) {
        f0.p(value, "value");
        return value.isText();
    }

    @u
    @w0(26)
    public final boolean e(@dl.d AutofillValue value) {
        f0.p(value, "value");
        return value.isToggle();
    }

    @u
    @w0(26)
    public final void f(@dl.d ViewStructure structure, @dl.d String[] hints) {
        f0.p(structure, "structure");
        f0.p(hints, "hints");
        structure.setAutofillHints(hints);
    }

    @u
    @w0(26)
    public final void g(@dl.d ViewStructure structure, @dl.d AutofillId parent, int i10) {
        f0.p(structure, "structure");
        f0.p(parent, "parent");
        structure.setAutofillId(parent, i10);
    }

    @u
    @w0(26)
    public final void h(@dl.d ViewStructure structure, int i10) {
        f0.p(structure, "structure");
        structure.setAutofillType(i10);
    }

    @u
    @dl.d
    @w0(26)
    public final CharSequence i(@dl.d AutofillValue value) {
        f0.p(value, "value");
        CharSequence textValue = value.getTextValue();
        f0.o(textValue, "value.textValue");
        return textValue;
    }
}
