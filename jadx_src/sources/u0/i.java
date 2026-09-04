package u0;

import com.umeng.analytics.pro.ak;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: ImmutableMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u0001\u0010J+\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H&¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\tJ+\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H&¢\u0006\u0004\b\b\u0010\u0007J*\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010\u000b\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH&J\u0014\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H&J\u0014\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lu0/i;", "K", androidx.exifinterface.media.a.X4, "Lu0/e;", "key", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Lu0/i;", "remove", "(Ljava/lang/Object;)Lu0/i;", "", "m", "putAll", "clear", "Lu0/i$a;", "builder", ak.av, "runtime_release"}, k = 1, mv = {1, 7, 1})
public interface i<K, V> extends e<K, V> {

    /* JADX INFO: compiled from: ImmutableMap.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lu0/i$a;", "K", androidx.exifinterface.media.a.X4, "", "Lu0/i;", "build", "runtime_release"}, k = 1, mv = {1, 7, 1})
    public interface a<K, V> extends Map<K, V>, zh.g {
        @dl.d
        i<K, V> build();
    }

    @dl.d
    a<K, V> builder();

    @dl.d
    i<K, V> clear();

    @dl.d
    i<K, V> put(K key, V value);

    @dl.d
    i<K, V> putAll(@dl.d Map<? extends K, ? extends V> m10);

    @dl.d
    i<K, V> remove(K key);

    @dl.d
    i<K, V> remove(K key, V value);
}
