package a1;

import android.graphics.Rect;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.annotation.w0;
import androidx.compose.ui.graphics.w1;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AndroidAutofill.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.ui.g
@w0(26)
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"La1/b;", "La1/e;", "La1/m;", "autofillNode", "Lkotlin/b2;", ak.av, "b", "Landroid/view/View;", sd.b.f139384b, "Landroid/view/View;", "e", "()Landroid/view/View;", "La1/n;", "autofillTree", "La1/n;", "d", "()La1/n;", "Landroid/view/autofill/AutofillManager;", "autofillManager", "Landroid/view/autofill/AutofillManager;", ak.aF, "()Landroid/view/autofill/AutofillManager;", "<init>", "(Landroid/view/View;La1/n;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final View f1150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final n f1151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final AutofillManager f1152c;

    public b(@dl.d View view, @dl.d n autofillTree) {
        f0.p(view, "view");
        f0.p(autofillTree, "autofillTree");
        this.f1150a = view;
        this.f1151b = autofillTree;
        AutofillManager autofillManager = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw new IllegalStateException("Autofill service could not be located.".toString());
        }
        this.f1152c = autofillManager;
        view.setImportantForAutofill(1);
    }

    @Override // a1.e
    public void a(@dl.d m autofillNode) {
        Rect rectA;
        f0.p(autofillNode, "autofillNode");
        AutofillManager autofillManager = this.f1152c;
        View view = this.f1150a;
        int f1163d = autofillNode.getF1163d();
        b1.i f1161b = autofillNode.getF1161b();
        if (f1161b == null || (rectA = w1.a(f1161b)) == null) {
            throw new IllegalStateException("requestAutofill called before onChildPositioned()".toString());
        }
        autofillManager.notifyViewEntered(view, f1163d, rectA);
    }

    @Override // a1.e
    public void b(@dl.d m autofillNode) {
        f0.p(autofillNode, "autofillNode");
        this.f1152c.notifyViewExited(this.f1150a, autofillNode.getF1163d());
    }

    @dl.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public final AutofillManager getF1152c() {
        return this.f1152c;
    }

    @dl.d
    /* JADX INFO: renamed from: d, reason: from getter */
    public final n getF1151b() {
        return this.f1151b;
    }

    @dl.d
    /* JADX INFO: renamed from: e, reason: from getter */
    public final View getF1150a() {
        return this.f1150a;
    }
}
