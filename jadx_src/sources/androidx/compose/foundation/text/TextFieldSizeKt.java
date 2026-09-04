package androidx.compose.foundation.text;

import androidx.compose.runtime.m2;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.text.TextStyle;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TextFieldSize.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/n;", "Landroidx/compose/ui/text/q0;", "style", ak.av, "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class TextFieldSizeKt {
    @dl.d
    public static final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n nVar, @dl.d final TextStyle style) {
        f0.p(nVar, "<this>");
        f0.p(style, "style");
        return ComposedModifierKt.l(nVar, null, new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.foundation.text.TextFieldSizeKt$textFieldMinSize$1
            {
                super(3);
            }

            public static final /* synthetic */ Object a(m2 m2Var) {
                return c(m2Var);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Object c(m2<? extends Object> m2Var) {
                return m2Var.getValue();
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v2 ??, still in use, count: 1, list:
                  (r9v2 ?? I:java.lang.Object) from 0x00dc: INVOKE (r12v0 ?? I:androidx.compose.runtime.p), (r9v2 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.p.N(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
                	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
                	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
                	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
                */
            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n b(
            /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v2 ??, still in use, count: 1, list:
                  (r9v2 ?? I:java.lang.Object) from 0x00dc: INVOKE (r12v0 ?? I:androidx.compose.runtime.p), (r9v2 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.p.N(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
                	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
                	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
                */
            /*  JADX ERROR: Method generation error
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r11v0 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                */

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, androidx.compose.runtime.p pVar, Integer num) {
                return b(nVar2, pVar, num.intValue());
            }
        }, 1, null);
    }
}
