package kotlin.reflect.full;

import kotlin.jvm.internal.f0;
import kotlin.u0;

/* JADX INFO: compiled from: exceptions.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = "1.1")
public final class IllegalPropertyDelegateAccessException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IllegalPropertyDelegateAccessException(@dl.d IllegalAccessException cause) {
        super("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", cause);
        f0.p(cause, "cause");
    }
}
