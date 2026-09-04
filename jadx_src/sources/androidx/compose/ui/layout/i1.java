package androidx.compose.ui.layout;

import com.umeng.analytics.pro.ak;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: RelocationRequester.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.ui.g
@kotlin.k(level = DeprecationLevel.ERROR, message = "Please use BringIntoViewRequester instead.", replaceWith = @kotlin.s0(expression = "BringIntoViewRequester", imports = {"androidx.compose.foundation.relocation.BringIntoViewRequester"}))
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Landroidx/compose/ui/layout/i1;", "", "Lb1/i;", "rect", "Lkotlin/b2;", ak.av, "(Lb1/i;Lkotlin/coroutines/c;)Ljava/lang/Object;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f15021a = 0;

    public static /* synthetic */ Object b(i1 i1Var, b1.i iVar, kotlin.coroutines.c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            iVar = null;
        }
        return i1Var.a(iVar, cVar);
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "Please use BringIntoViewRequester instead.", replaceWith = @kotlin.s0(expression = "bringIntoView", imports = {"androidx.compose.foundation.relocation.BringIntoViewRequester"}))
    @dl.e
    public final Object a(@dl.e b1.i iVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        return b2.f124493a;
    }
}
