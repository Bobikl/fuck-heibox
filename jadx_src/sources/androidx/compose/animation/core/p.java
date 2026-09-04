package androidx.compose.animation.core;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AnimationVectors.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H ¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0000H ¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H \u0002¢\u0006\u0004\b\n\u0010\u000bJ \u0010\r\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tH \u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00078 X \u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0004\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/animation/core/p;", "", "Lkotlin/b2;", "d", "()V", ak.aF, "()Landroidx/compose/animation/core/p;", "", UCropPlusActivity.ARG_INDEX, "", ak.av, "(I)F", "value", "e", "(IF)V", "b", "()I", UiKitSpanObj.TYPE_SIZE, "<init>", "Landroidx/compose/animation/core/l;", "Landroidx/compose/animation/core/m;", "Landroidx/compose/animation/core/n;", "Landroidx/compose/animation/core/o;", "animation-core_release"}, k = 1, mv = {1, 7, 1})
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f4478a = 0;

    private p() {
    }

    public /* synthetic */ p(kotlin.jvm.internal.u uVar) {
        this();
    }

    public abstract float a(int index);

    public abstract int b();

    @dl.d
    public abstract p c();

    public abstract void d();

    public abstract void e(int index, float value);
}
