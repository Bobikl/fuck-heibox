package fi;

import java.lang.Comparable;
import kotlin.jvm.internal.f0;
import kotlin.u0;

/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = "1.1")
public interface f<T extends Comparable<? super T>> extends g<T> {

    /* JADX INFO: compiled from: Ranges.kt */
    public static final class a {
        public static <T extends Comparable<? super T>> boolean a(@dl.d f<T> fVar, @dl.d T value) {
            f0.p(value, "value");
            return fVar.b(fVar.D(), value) && fVar.b(value, fVar.e());
        }

        public static <T extends Comparable<? super T>> boolean b(@dl.d f<T> fVar) {
            return !fVar.b(fVar.D(), fVar.e());
        }
    }

    @Override // fi.g
    boolean a(@dl.d T t10);

    boolean b(@dl.d T t10, @dl.d T t11);

    @Override // fi.g
    boolean isEmpty();
}
