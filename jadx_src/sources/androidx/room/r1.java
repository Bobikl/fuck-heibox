package androidx.room;

import com.umeng.analytics.pro.ak;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: compiled from: RenameTable.kt */
/* JADX INFO: loaded from: classes6.dex */
@Target({ElementType.TYPE})
@mh.c(AnnotationRetention.BINARY)
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0006B\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/room/r1;", "", "", "fromTableName", "()Ljava/lang/String;", "toTableName", ak.av, "room-common"}, k = 1, mv = {1, 7, 1})
@Repeatable(a.class)
@Retention(RetentionPolicy.CLASS)
@mh.d(allowedTargets = {AnnotationTarget.CLASS})
public @interface r1 {

    /* JADX INFO: compiled from: RenameTable.kt */
    @Target({ElementType.TYPE})
    @mh.c(AnnotationRetention.BINARY)
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0014\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003R\u0019\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/room/r1$a;", "", "", "Landroidx/room/r1;", "value", "()[Landroidx/room/r1;", "room-common"}, k = 1, mv = {1, 7, 1})
    @Retention(RetentionPolicy.CLASS)
    @mh.d(allowedTargets = {AnnotationTarget.CLASS})
    public @interface a {
        r1[] value();
    }

    String fromTableName();

    String toTableName();
}
