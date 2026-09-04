package r1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;

/* JADX INFO: compiled from: PreviewParameter.kt */
/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.RUNTIME)
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0002\u0018\u00002\u00020\u0001B\u001e\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006R\u001d\u0010\u0004\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lr1/d;", "", "Lkotlin/reflect/d;", "Lr1/f;", com.umeng.analytics.pro.d.M, "()Ljava/lang/Class;", "", "limit", "()I", "ui-tooling-preview_release"}, k = 1, mv = {1, 7, 1})
public @interface d {
    int limit() default Integer.MAX_VALUE;

    Class<? extends f<?>> provider();
}
