package androidx.compose.runtime.internal;

import androidx.compose.runtime.j2;
import androidx.compose.runtime.n1;
import androidx.compose.runtime.u1;
import com.umeng.analytics.pro.ak;
import fi.u;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u0;
import yh.x;

/* JADX INFO: compiled from: ComposableLambdaN.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ*\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\r\"\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Landroidx/compose/runtime/internal/ComposableLambdaNImpl;", "Landroidx/compose/runtime/internal/c;", "Lkotlin/b2;", "d", "Landroidx/compose/runtime/p;", "composer", ak.aF, "", "params", "b", "", "block", "e", "", "args", com.alipay.sdk.m.x.c.f39529d, "([Ljava/lang/Object;)Ljava/lang/Object;", "I", ak.av, "()I", "key", "", "Z", "tracked", "getArity", "arity", "Ljava/lang/Object;", "_block", "Landroidx/compose/runtime/n1;", "f", "Landroidx/compose/runtime/n1;", "scope", "", "g", "Ljava/util/List;", i7.a.i.f119321p, "<init>", "(IZI)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class ComposableLambdaNImpl implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int key;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean tracked;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int arity;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Object _block;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private n1 scope;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private List<n1> scopes;

    public ComposableLambdaNImpl(int i10, boolean z10, int i11) {
        this.key = i10;
        this.tracked = z10;
        this.arity = i11;
    }

    private final int b(int params) {
        int i10 = (params - 1) - 1;
        for (int i11 = 1; i11 * 10 < i10; i11++) {
            i10--;
        }
        return i10;
    }

    private final void c(androidx.compose.runtime.p pVar) {
        n1 n1VarR;
        if (!this.tracked || (n1VarR = pVar.R()) == null) {
            return;
        }
        pVar.p(n1VarR);
        if (b.e(this.scope, n1VarR)) {
            this.scope = n1VarR;
            return;
        }
        List<n1> list = this.scopes;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.scopes = arrayList;
            arrayList.add(n1VarR);
            return;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (b.e(list.get(i10), n1VarR)) {
                list.set(i10, n1VarR);
                return;
            }
        }
        list.add(n1VarR);
    }

    private final void d() {
        if (this.tracked) {
            n1 n1Var = this.scope;
            if (n1Var != null) {
                n1Var.invalidate();
                this.scope = null;
            }
            List<n1> list = this.scopes;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.get(i10).invalidate();
                }
                list.clear();
            }
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getKey() {
        return this.key;
    }

    public final void e(@dl.d Object block) {
        f0.p(block, "block");
        if (f0.g(block, this._block)) {
            return;
        }
        boolean z10 = this._block == null;
        this._block = (x) block;
        if (z10) {
            return;
        }
        d();
    }

    @Override // yh.x, kotlin.jvm.internal.b0
    public int getArity() {
        return this.arity;
    }

    @Override // yh.x
    @dl.e
    public Object v1(@dl.d final Object... args) {
        f0.p(args, "args");
        final int iB = b(args.length);
        Object obj = args[iB];
        f0.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.Composer");
        Object[] array = ArraysKt___ArraysKt.ru(args, u.W1(0, args.length - 1)).toArray(new Object[0]);
        f0.n(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Object obj2 = args[args.length - 1];
        f0.n(obj2, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj2).intValue();
        androidx.compose.runtime.p pVarF = ((androidx.compose.runtime.p) obj).F(this.key);
        c(pVarF);
        int iD = iIntValue | (pVarF.s(this) ? b.d(iB) : b.f(iB));
        Object obj3 = this._block;
        f0.n(obj3, "null cannot be cast to non-null type kotlin.jvm.functions.FunctionN<*>");
        u0 u0Var = new u0(2);
        u0Var.b(array);
        u0Var.a(Integer.valueOf(iD));
        Object objV1 = ((x) obj3).v1(u0Var.d(new Object[u0Var.c()]));
        u1 u1VarH = pVarF.H();
        if (u1VarH != null) {
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.runtime.internal.ComposableLambdaNImpl$invoke$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(@dl.d androidx.compose.runtime.p nc2, int i10) {
                    f0.p(nc2, "nc");
                    Object[] array2 = ArraysKt___ArraysKt.ru(args, u.W1(0, iB)).toArray(new Object[0]);
                    f0.n(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    Object obj4 = args[iB + 1];
                    f0.n(obj4, "null cannot be cast to non-null type kotlin.Int");
                    int iIntValue2 = ((Integer) obj4).intValue();
                    Object[] objArr = args;
                    Object[] array3 = ArraysKt___ArraysKt.ru(objArr, u.W1(iB + 2, objArr.length)).toArray(new Object[0]);
                    f0.n(array3, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    ComposableLambdaNImpl composableLambdaNImpl = this;
                    u0 u0Var2 = new u0(4);
                    u0Var2.b(array2);
                    u0Var2.a(nc2);
                    u0Var2.a(Integer.valueOf(iIntValue2 | 1));
                    u0Var2.b(array3);
                    composableLambdaNImpl.v1(u0Var2.d(new Object[u0Var2.c()]));
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar, Integer num) {
                    a(pVar, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        return objV1;
    }
}
