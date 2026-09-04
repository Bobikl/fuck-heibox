package androidx.p001datastore.core;

import androidx.exifinterface.media.a;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.c;

/* JADX INFO: compiled from: Serializer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001b\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u0007\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u000bR\u0014\u0010\u000e\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Landroidx/datastore/core/i;", a.f23244d5, "", "Ljava/io/InputStream;", "input", ak.aG, "(Ljava/io/InputStream;Lkotlin/coroutines/c;)Ljava/lang/Object;", "t", "Ljava/io/OutputStream;", "output", "Lkotlin/b2;", "(Ljava/lang/Object;Ljava/io/OutputStream;Lkotlin/coroutines/c;)Ljava/lang/Object;", ak.aB, "()Ljava/lang/Object;", "defaultValue", "datastore-core"}, k = 1, mv = {1, 5, 1})
public interface i<T> {
    T s();

    @e
    Object t(T t10, @d OutputStream outputStream, @d c<? super b2> cVar);

    @e
    Object u(@d InputStream inputStream, @d c<? super T> cVar);
}
