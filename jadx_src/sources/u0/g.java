package u0;

import com.umeng.analytics.pro.ak;
import java.util.Collection;
import kotlin.Metadata;
import yh.l;

/* JADX INFO: compiled from: ImmutableCollection.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0013J\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\u0005J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u000bH&J\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H&J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lu0/g;", androidx.exifinterface.media.a.S4, "Lu0/b;", "element", "add", "(Ljava/lang/Object;)Lu0/g;", "", "elements", "addAll", "remove", "removeAll", "Lkotlin/Function1;", "", "predicate", "f", "retainAll", "clear", "Lu0/g$a;", "builder", ak.av, "runtime_release"}, k = 1, mv = {1, 7, 1})
public interface g<E> extends b<E> {

    /* JADX INFO: compiled from: ImmutableCollection.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lu0/g$a;", androidx.exifinterface.media.a.S4, "", "Lu0/g;", "build", "runtime_release"}, k = 1, mv = {1, 7, 1})
    public interface a<E> extends Collection<E>, zh.b {
        @dl.d
        g<E> build();
    }

    @dl.d
    g<E> add(E element);

    @dl.d
    g<E> addAll(@dl.d Collection<? extends E> elements);

    @dl.d
    a<E> builder();

    @dl.d
    g<E> clear();

    @dl.d
    g<E> f(@dl.d l<? super E, Boolean> lVar);

    @dl.d
    g<E> remove(E element);

    @dl.d
    g<E> removeAll(@dl.d Collection<? extends E> elements);

    @dl.d
    g<E> retainAll(@dl.d Collection<? extends E> elements);
}
