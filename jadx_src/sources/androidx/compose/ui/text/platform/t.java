package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.runtime.m2;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AndroidParagraphIntrinsics.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\u0003\u0010\tR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/platform/t;", "", "Landroidx/compose/runtime/m2;", ak.av, "Landroidx/compose/runtime/m2;", "b", "()Landroidx/compose/runtime/m2;", "resolveResult", "Ljava/lang/Object;", "()Ljava/lang/Object;", "initial", "Landroid/graphics/Typeface;", ak.aF, "()Landroid/graphics/Typeface;", "typeface", "", "d", "()Z", "isStaleResolvedFont", "<init>", "(Landroidx/compose/runtime/m2;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final m2<Object> resolveResult;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Object initial;

    public t(@dl.d m2<? extends Object> resolveResult) {
        f0.p(resolveResult, "resolveResult");
        this.resolveResult = resolveResult;
        this.initial = resolveResult.getValue();
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Object getInitial() {
        return this.initial;
    }

    @dl.d
    public final m2<Object> b() {
        return this.resolveResult;
    }

    @dl.d
    public final Typeface c() {
        Object obj = this.initial;
        f0.n(obj, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) obj;
    }

    public final boolean d() {
        return this.resolveResult.getValue() != this.initial;
    }
}
