package fi;

import java.lang.Comparable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Range.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface g<T extends Comparable<? super T>> {

    /* JADX INFO: compiled from: Range.kt */
    public static final class a {
        public static <T extends Comparable<? super T>> boolean a(@dl.d g<T> gVar, @dl.d T value) {
            f0.p(value, "value");
            return value.compareTo(gVar.D()) >= 0 && value.compareTo(gVar.e()) <= 0;
        }

        public static <T extends Comparable<? super T>> boolean b(@dl.d g<T> gVar) {
            return gVar.D().compareTo(gVar.e()) > 0;
        }
    }

    @dl.d
    T D();

    boolean a(@dl.d T t10);

    @dl.d
    T e();

    boolean isEmpty();
}
