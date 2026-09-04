package androidx.core.view;

import android.view.ViewParent;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewKt$ancestors$1 extends FunctionReferenceImpl implements yh.l<ViewParent, ViewParent> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ViewKt$ancestors$1 f21318d = new ViewKt$ancestors$1();

    ViewKt$ancestors$1() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    @Override // yh.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final ViewParent invoke(@dl.d ViewParent p10) {
        kotlin.jvm.internal.f0.p(p10, "p0");
        return p10.getParent();
    }
}
