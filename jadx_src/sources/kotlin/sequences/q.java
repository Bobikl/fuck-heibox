package kotlin.sequences;

import java.util.Iterator;
import kotlin.b2;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.f0;
import kotlin.u0;

/* JADX INFO: compiled from: SequenceBuilder.kt */
/* JADX INFO: loaded from: classes5.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f128479a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f128480b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f128481c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f128482d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f128483e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f128484f = 5;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a<T> implements m<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ yh.p f128485a;

        public a(yh.p pVar) {
            this.f128485a = pVar;
        }

        @Override // kotlin.sequences.m
        @dl.d
        public Iterator<T> iterator() {
            return q.a(this.f128485a);
        }
    }

    @u0(version = "1.3")
    @dl.d
    public static final <T> Iterator<T> a(@kotlin.b @dl.d yh.p<? super o<? super T>, ? super kotlin.coroutines.c<? super b2>, ? extends Object> block) {
        f0.p(block, "block");
        n nVar = new n();
        nVar.n(IntrinsicsKt__IntrinsicsJvmKt.c(block, nVar, nVar));
        return nVar;
    }

    @u0(version = "1.3")
    @dl.d
    public static final <T> m<T> b(@kotlin.b @dl.d yh.p<? super o<? super T>, ? super kotlin.coroutines.c<? super b2>, ? extends Object> block) {
        f0.p(block, "block");
        return new a(block);
    }
}
