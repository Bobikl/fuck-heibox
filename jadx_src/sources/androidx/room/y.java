package androidx.room;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: compiled from: Fts4.kt */
/* JADX INFO: loaded from: classes6.dex */
@Target({ElementType.TYPE})
@mh.c(AnnotationRetention.BINARY)
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B`\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\f\b\u0002\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0015\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b8\u0006¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0004R\u0011\u0010\r\u001a\u00020\f8\u0006¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/room/y;", "", "", "tokenizer", "()Ljava/lang/String;", "", "tokenizerArgs", "()[Ljava/lang/String;", "Lkotlin/reflect/d;", "contentEntity", "()Ljava/lang/Class;", "languageId", "Landroidx/room/FtsOptions$MatchInfo;", "matchInfo", "()Landroidx/room/FtsOptions$MatchInfo;", "notIndexed", "", "prefix", "()[I", "Landroidx/room/FtsOptions$Order;", "order", "()Landroidx/room/FtsOptions$Order;", "room-common"}, k = 1, mv = {1, 7, 1})
@androidx.annotation.w0(16)
@Retention(RetentionPolicy.CLASS)
@mh.d(allowedTargets = {AnnotationTarget.CLASS})
public @interface y {
    Class<?> contentEntity() default Object.class;

    String languageId() default "";

    FtsOptions.MatchInfo matchInfo() default FtsOptions.MatchInfo.FTS4;

    String[] notIndexed() default {};

    FtsOptions.Order order() default FtsOptions.Order.ASC;

    int[] prefix() default {};

    String tokenizer() default "simple";

    String[] tokenizerArgs() default {};
}
