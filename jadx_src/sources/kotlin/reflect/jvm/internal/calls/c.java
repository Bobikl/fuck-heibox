package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Caller.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface c<M extends Member> {

    /* JADX INFO: compiled from: Caller.kt */
    public static final class a {
        public static <M extends Member> void a(@dl.d c<? extends M> cVar, @dl.d Object[] args) {
            f0.p(args, "args");
            if (e.a(cVar) == args.length) {
                return;
            }
            throw new IllegalArgumentException("Callable expects " + e.a(cVar) + " arguments, but " + args.length + " were provided.");
        }
    }

    @dl.d
    List<Type> c();

    @dl.e
    Object call(@dl.d Object[] objArr);

    M d();

    @dl.d
    Type getReturnType();
}
