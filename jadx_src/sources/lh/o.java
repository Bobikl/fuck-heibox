package lh;

/* JADX INFO: compiled from: SimpleQueue.java */
/* JADX INFO: loaded from: classes9.dex */
public interface o<T> {
    void clear();

    boolean isEmpty();

    boolean offer(@jh.e T t10);

    boolean offer(@jh.e T t10, @jh.e T t11);

    @jh.f
    T poll() throws Exception;
}
