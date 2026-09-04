package androidx.room;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: compiled from: ColumnInfo.kt */
/* JADX INFO: loaded from: classes6.dex */
@Target({ElementType.FIELD, ElementType.METHOD})
@mh.c(AnnotationRetention.BINARY)
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\u0002\u0018\u0000 \r2\u00020\u0001:\u0003\u000e\u000f\u0010B2\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\t\u001a\u00020\b8\u0006¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00058\u0007¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\f\u0010\u0004¨\u0006\u0011"}, d2 = {"Landroidx/room/f;", "", "", "name", "()Ljava/lang/String;", "", "typeAffinity", "()I", "", UCropPlusActivity.ARG_INDEX, "()Z", "collate", "defaultValue", "j", ak.av, "b", ak.aF, "room-common"}, k = 1, mv = {1, 7, 1})
@Retention(RetentionPolicy.CLASS)
@mh.d(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.FUNCTION})
public @interface f {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = Companion.f27124a;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    public static final String f27111k = "[field-name]";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f27112l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f27113m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f27114n = 3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f27115o = 4;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f27116p = 5;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f27117q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f27118r = 2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f27119s = 3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f27120t = 4;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.w0(21)
    public static final int f27121u = 5;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.w0(21)
    public static final int f27122v = 6;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    public static final String f27123w = "[value-unspecified]";

    /* JADX INFO: compiled from: ColumnInfo.kt */
    @mh.c(AnnotationRetention.BINARY)
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/room/f$a;", "", "room-common"}, k = 1, mv = {1, 7, 1})
    @androidx.annotation.w0(21)
    @Retention(RetentionPolicy.CLASS)
    public @interface a {
    }

    /* JADX INFO: renamed from: androidx.room.f$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: ColumnInfo.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001c\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\r\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0014\u0010\u000f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u0014\u0010\u0011\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\bR\u0014\u0010\u0013\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\bR\u0014\u0010\u0015\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\bR\u0014\u0010\u0017\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\bR\u0014\u0010\u0019\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\bR\u0014\u0010\u001b\u001a\u00020\u00068\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001a\u0010\bR\u0014\u0010\u001d\u001a\u00020\u00068\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001c\u0010\bR\u0014\u0010\u001f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0004¨\u0006\""}, d2 = {"Landroidx/room/f$b;", "", "", "b", "Ljava/lang/String;", "INHERIT_FIELD_NAME", "", ak.aF, "I", "UNDEFINED", "d", "TEXT", "e", "INTEGER", "f", "REAL", "g", "BLOB", RXScreenCaptureService.KEY_HEIGHT, "UNSPECIFIED", "i", "BINARY", "j", "NOCASE", "k", "RTRIM", "l", "LOCALIZED", "m", "UNICODE", "n", "VALUE_UNSPECIFIED", "<init>", "()V", "room-common"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f27124a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        public static final String INHERIT_FIELD_NAME = "[field-name]";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final int UNDEFINED = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public static final int TEXT = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public static final int INTEGER = 3;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public static final int REAL = 4;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public static final int BLOB = 5;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        public static final int UNSPECIFIED = 1;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        public static final int BINARY = 2;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        public static final int NOCASE = 3;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        public static final int RTRIM = 4;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @androidx.annotation.w0(21)
        public static final int LOCALIZED = 5;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        @androidx.annotation.w0(21)
        public static final int UNICODE = 6;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        @dl.d
        public static final String VALUE_UNSPECIFIED = "[value-unspecified]";

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: ColumnInfo.kt */
    @mh.c(AnnotationRetention.BINARY)
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/room/f$c;", "", "room-common"}, k = 1, mv = {1, 7, 1})
    @Retention(RetentionPolicy.CLASS)
    public @interface c {
    }

    @a
    int collate() default 1;

    String defaultValue() default "[value-unspecified]";

    boolean index() default false;

    String name() default "[field-name]";

    @c
    int typeAffinity() default 1;
}
