package okio;

import dl.d;
import kotlin.Metadata;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.f0;
import xh.h;
import yh.a;

/* JADX INFO: renamed from: okio.-Platform, reason: invalid class name */
/* JADX INFO: compiled from: -Platform.kt */
/* JADX INFO: loaded from: classes5.dex */
@h(name = "-Platform")
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0000*\u00020\u0001H\u0000\u001a/\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0080\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n*\n\u0010\f\"\u00020\u000b2\u00020\u000b*\n\u0010\u000e\"\u00020\r2\u00020\r*\n\u0010\u0010\"\u00020\u000f2\u00020\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0011"}, d2 = {"", "", "toUtf8String", "asUtf8ToByteArray", "R", "", "lock", "Lkotlin/Function0;", "block", "synchronized", "(Ljava/lang/Object;Lyh/a;)Ljava/lang/Object;", "Ljava/lang/ArrayIndexOutOfBoundsException;", "ArrayIndexOutOfBoundsException", "Ljava/io/EOFException;", "EOFException", "Ljava/io/IOException;", "IOException", "okio"}, k = 2, mv = {1, 4, 0})
public final class Platform {
    @d
    public static final byte[] asUtf8ToByteArray(@d String asUtf8ToByteArray) {
        f0.p(asUtf8ToByteArray, "$this$asUtf8ToByteArray");
        byte[] bytes = asUtf8ToByteArray.getBytes(kotlin.text.d.f128566b);
        f0.o(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static final <R> R m794synchronized(@d Object lock, @d a<? extends R> block) {
        R rInvoke;
        f0.p(lock, "lock");
        f0.p(block, "block");
        synchronized (lock) {
            try {
                rInvoke = block.invoke();
                c0.d(1);
            } finally {
                c0.d(1);
                c0.c(1);
            }
        }
        return rInvoke;
    }

    @d
    public static final String toUtf8String(@d byte[] toUtf8String) {
        f0.p(toUtf8String, "$this$toUtf8String");
        return new String(toUtf8String, kotlin.text.d.f128566b);
    }
}
