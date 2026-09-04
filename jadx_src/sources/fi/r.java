package fi;

import java.lang.Comparable;
import kotlin.jvm.internal.f0;
import kotlin.u0;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: Range.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = s0.f136932w)
@kotlin.q
public interface r<T extends Comparable<? super T>> {

    /* JADX INFO: compiled from: Range.kt */
    public static final class a {
        public static <T extends Comparable<? super T>> boolean a(@dl.d r<T> rVar, @dl.d T value) {
            f0.p(value, "value");
            return value.compareTo(rVar.D()) >= 0 && value.compareTo(rVar.g()) < 0;
        }

        public static <T extends Comparable<? super T>> boolean b(@dl.d r<T> rVar) {
            return rVar.D().compareTo(rVar.g()) >= 0;
        }
    }

    @dl.d
    T D();

    boolean a(@dl.d T t10);

    @dl.d
    T g();

    boolean isEmpty();
}
