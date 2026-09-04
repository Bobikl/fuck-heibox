package androidx.room.util;

import android.annotation.SuppressLint;
import androidx.annotation.RestrictTo;
import androidx.annotation.j1;
import androidx.room.Index;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.collections.d1;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.k;
import kotlin.text.StringsKt__StringsKt;
import xh.m;

/* JADX INFO: compiled from: TableInfo.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0006\t\u000e\u0013\u0017\u001c\u001dBC\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0011¢\u0006\u0004\b\u0019\u0010\u001aB3\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0019\u0010\u001bJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014¨\u0006\u001e"}, d2 = {"Landroidx/room/util/f;", "", "other", "", "equals", "", "hashCode", "", "toString", ak.av, "Ljava/lang/String;", "name", "", "Landroidx/room/util/f$a;", "b", "Ljava/util/Map;", com.tekartik.sqflite.b.f98606y, "", "Landroidx/room/util/f$d;", ak.aF, "Ljava/util/Set;", "foreignKeys", "Landroidx/room/util/f$f;", "d", "indices", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;)V", "e", "f", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class f {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f27288f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f27289g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f27290h = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    public final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    @xh.e
    public final Map<String, a> columns;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    @xh.e
    public final Set<d> foreignKeys;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    @xh.e
    public final Set<C0217f> indices;

    /* JADX INFO: compiled from: TableInfo.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\u0018\u0000 !2\u00020\u0001:\u0001\u000bB9\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fB)\b\u0017\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010 J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0003J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u001a\u0010\u001b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u0012\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u001c¨\u0006\""}, d2 = {"Landroidx/room/util/f$a;", "", "", "type", "", "b", "other", "", "equals", "hashCode", "toString", ak.av, "Ljava/lang/String;", "name", ak.aF, "Z", "notNull", "d", "I", "primaryKeyPosition", "e", "defaultValue", "f", "createdFrom", "g", "getAffinity$annotations", "()V", "affinity", "()Z", "isPrimaryKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V", "(Ljava/lang/String;Ljava/lang/String;ZI)V", RXScreenCaptureService.KEY_HEIGHT, "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @dl.d
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        @xh.e
        public final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        @xh.e
        public final String type;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public final boolean notNull;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public final int primaryKeyPosition;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @dl.e
        @xh.e
        public final String defaultValue;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public final int createdFrom;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public final int affinity;

        /* JADX INFO: renamed from: androidx.room.util.f$a$a, reason: collision with other inner class name and from kotlin metadata */
        /* JADX INFO: compiled from: TableInfo.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0007¨\u0006\n"}, d2 = {"Landroidx/room/util/f$a$a;", "", "", org.apache.tools.ant.taskdefs.optional.vss.g.H2, "", ak.av, "other", "b", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(u uVar) {
                this();
            }

            private final boolean a(String current) {
                if (current.length() == 0) {
                    return false;
                }
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (i10 < current.length()) {
                    char cCharAt = current.charAt(i10);
                    int i13 = i12 + 1;
                    if (i12 == 0 && cCharAt != '(') {
                        return false;
                    }
                    if (cCharAt == '(') {
                        i11++;
                    } else if (cCharAt == ')' && (i11 = i11 - 1) == 0 && i12 != current.length() - 1) {
                        return false;
                    }
                    i10++;
                    i12 = i13;
                }
                return i11 == 0;
            }

            @j1
            @m
            @SuppressLint({"SyntheticAccessor"})
            public final boolean b(@dl.d String current, @dl.e String other) {
                f0.p(current, "current");
                if (f0.g(current, other)) {
                    return true;
                }
                if (!a(current)) {
                    return false;
                }
                String strSubstring = current.substring(1, current.length() - 1);
                f0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return f0.g(StringsKt__StringsKt.F5(strSubstring).toString(), other);
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @k(message = "Use {@link Column#Column(String, String, boolean, int, String, int)} instead.")
        public a(@dl.d String name, @dl.d String type, boolean z10, int i10) {
            this(name, type, z10, i10, null, 0);
            f0.p(name, "name");
            f0.p(type, "type");
        }

        public a(@dl.d String name, @dl.d String type, boolean z10, int i10, @dl.e String str, int i11) {
            f0.p(name, "name");
            f0.p(type, "type");
            this.name = name;
            this.type = type;
            this.notNull = z10;
            this.primaryKeyPosition = i10;
            this.defaultValue = str;
            this.createdFrom = i11;
            this.affinity = b(type);
        }

        @j1
        @m
        @SuppressLint({"SyntheticAccessor"})
        public static final boolean a(@dl.d String str, @dl.e String str2) {
            return INSTANCE.b(str, str2);
        }

        @androidx.room.f.c
        private final int b(String type) {
            if (type == null) {
                return 5;
            }
            Locale US = Locale.US;
            f0.o(US, "US");
            String upperCase = type.toUpperCase(US);
            f0.o(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (StringsKt__StringsKt.W2(upperCase, "INT", false, 2, null)) {
                return 3;
            }
            if (StringsKt__StringsKt.W2(upperCase, "CHAR", false, 2, null) || StringsKt__StringsKt.W2(upperCase, "CLOB", false, 2, null) || StringsKt__StringsKt.W2(upperCase, "TEXT", false, 2, null)) {
                return 2;
            }
            if (StringsKt__StringsKt.W2(upperCase, "BLOB", false, 2, null)) {
                return 5;
            }
            return (StringsKt__StringsKt.W2(upperCase, "REAL", false, 2, null) || StringsKt__StringsKt.W2(upperCase, "FLOA", false, 2, null) || StringsKt__StringsKt.W2(upperCase, "DOUB", false, 2, null)) ? 4 : 1;
        }

        @androidx.room.f.c
        public static /* synthetic */ void c() {
        }

        public final boolean d() {
            return this.primaryKeyPosition > 0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:46:0x0072, code lost:
        
            r1 = true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean equals(@dl.e java.lang.Object r7) {
            /*
                r6 = this;
                r0 = 1
                if (r6 != r7) goto L4
                return r0
            L4:
                boolean r1 = r7 instanceof androidx.room.util.f.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                int r1 = r6.primaryKeyPosition
                r3 = r7
                androidx.room.util.f$a r3 = (androidx.room.util.f.a) r3
                int r3 = r3.primaryKeyPosition
                if (r1 == r3) goto L14
                return r2
            L14:
                java.lang.String r1 = r6.name
                androidx.room.util.f$a r7 = (androidx.room.util.f.a) r7
                java.lang.String r3 = r7.name
                boolean r1 = kotlin.jvm.internal.f0.g(r1, r3)
                if (r1 != 0) goto L21
                return r2
            L21:
                boolean r1 = r6.notNull
                boolean r3 = r7.notNull
                if (r1 == r3) goto L28
                return r2
            L28:
                int r1 = r6.createdFrom
                r3 = 2
                if (r1 != r0) goto L40
                int r1 = r7.createdFrom
                if (r1 != r3) goto L40
                java.lang.String r1 = r6.defaultValue
                if (r1 == 0) goto L40
                androidx.room.util.f$a$a r4 = androidx.room.util.f.a.INSTANCE
                java.lang.String r5 = r7.defaultValue
                boolean r1 = r4.b(r1, r5)
                if (r1 != 0) goto L40
                return r2
            L40:
                int r1 = r6.createdFrom
                if (r1 != r3) goto L57
                int r1 = r7.createdFrom
                if (r1 != r0) goto L57
                java.lang.String r1 = r7.defaultValue
                if (r1 == 0) goto L57
                androidx.room.util.f$a$a r3 = androidx.room.util.f.a.INSTANCE
                java.lang.String r4 = r6.defaultValue
                boolean r1 = r3.b(r1, r4)
                if (r1 != 0) goto L57
                return r2
            L57:
                int r1 = r6.createdFrom
                if (r1 == 0) goto L78
                int r3 = r7.createdFrom
                if (r1 != r3) goto L78
                java.lang.String r1 = r6.defaultValue
                if (r1 == 0) goto L6e
                androidx.room.util.f$a$a r3 = androidx.room.util.f.a.INSTANCE
                java.lang.String r4 = r7.defaultValue
                boolean r1 = r3.b(r1, r4)
                if (r1 != 0) goto L74
                goto L72
            L6e:
                java.lang.String r1 = r7.defaultValue
                if (r1 == 0) goto L74
            L72:
                r1 = r0
                goto L75
            L74:
                r1 = r2
            L75:
                if (r1 == 0) goto L78
                return r2
            L78:
                int r1 = r6.affinity
                int r7 = r7.affinity
                if (r1 != r7) goto L7f
                goto L80
            L7f:
                r0 = r2
            L80:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.f.a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            return (((((this.name.hashCode() * 31) + this.affinity) * 31) + (this.notNull ? 1231 : bb.c.b.Pk)) * 31) + this.primaryKeyPosition;
        }

        @dl.d
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Column{name='");
            sb2.append(this.name);
            sb2.append("', type='");
            sb2.append(this.type);
            sb2.append("', affinity='");
            sb2.append(this.affinity);
            sb2.append("', notNull=");
            sb2.append(this.notNull);
            sb2.append(", primaryKeyPosition=");
            sb2.append(this.primaryKeyPosition);
            sb2.append(", defaultValue='");
            String str = this.defaultValue;
            if (str == null) {
                str = "undefined";
            }
            sb2.append(str);
            sb2.append("'}");
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: androidx.room.util.f$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: TableInfo.kt */
    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000f"}, d2 = {"Landroidx/room/util/f$b;", "", "Lj3/g;", "database", "", "tableName", "Landroidx/room/util/f;", ak.av, "", "CREATED_FROM_DATABASE", "I", "CREATED_FROM_ENTITY", "CREATED_FROM_UNKNOWN", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @dl.d
        @m
        public final f a(@dl.d j3.g database, @dl.d String tableName) {
            f0.p(database, "database");
            f0.p(tableName, "tableName");
            return g.f(database, tableName);
        }
    }

    /* JADX INFO: compiled from: TableInfo.kt */
    @mh.c(AnnotationRetention.SOURCE)
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/room/util/f$c;", "", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    /* JADX INFO: compiled from: TableInfo.kt */
    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0018"}, d2 = {"Landroidx/room/util/f$d;", "", "other", "", "equals", "", "hashCode", "", "toString", ak.av, "Ljava/lang/String;", "referenceTable", "b", "onDelete", ak.aF, "onUpdate", "", "d", "Ljava/util/List;", "columnNames", "e", "referenceColumnNames", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        @xh.e
        public final String referenceTable;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        @dl.d
        @xh.e
        public final String onDelete;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @dl.d
        @xh.e
        public final String onUpdate;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @dl.d
        @xh.e
        public final List<String> columnNames;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @dl.d
        @xh.e
        public final List<String> referenceColumnNames;

        public d(@dl.d String referenceTable, @dl.d String onDelete, @dl.d String onUpdate, @dl.d List<String> columnNames, @dl.d List<String> referenceColumnNames) {
            f0.p(referenceTable, "referenceTable");
            f0.p(onDelete, "onDelete");
            f0.p(onUpdate, "onUpdate");
            f0.p(columnNames, "columnNames");
            f0.p(referenceColumnNames, "referenceColumnNames");
            this.referenceTable = referenceTable;
            this.onDelete = onDelete;
            this.onUpdate = onUpdate;
            this.columnNames = columnNames;
            this.referenceColumnNames = referenceColumnNames;
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            if (f0.g(this.referenceTable, dVar.referenceTable) && f0.g(this.onDelete, dVar.onDelete) && f0.g(this.onUpdate, dVar.onUpdate) && f0.g(this.columnNames, dVar.columnNames)) {
                return f0.g(this.referenceColumnNames, dVar.referenceColumnNames);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.referenceTable.hashCode() * 31) + this.onDelete.hashCode()) * 31) + this.onUpdate.hashCode()) * 31) + this.columnNames.hashCode()) * 31) + this.referenceColumnNames.hashCode();
        }

        @dl.d
        public String toString() {
            return "ForeignKey{referenceTable='" + this.referenceTable + "', onDelete='" + this.onDelete + " +', onUpdate='" + this.onUpdate + "', columnNames=" + this.columnNames + ", referenceColumnNames=" + this.referenceColumnNames + '}';
        }
    }

    /* JADX INFO: compiled from: TableInfo.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0096\u0002R\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u0005\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0014"}, d2 = {"Landroidx/room/util/f$e;", "", "other", "", ak.av, "b", "I", ak.aF, "()I", "id", "d", "sequence", "", "Ljava/lang/String;", "()Ljava/lang/String;", "from", "e", "to", "<init>", "(IILjava/lang/String;Ljava/lang/String;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class e implements Comparable<e> {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int id;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int sequence;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final String from;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final String to;

        public e(int i10, int i11, @dl.d String from, @dl.d String to) {
            f0.p(from, "from");
            f0.p(to, "to");
            this.id = i10;
            this.sequence = i11;
            this.from = from;
            this.to = to;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(@dl.d e other) {
            f0.p(other, "other");
            int i10 = this.id - other.id;
            return i10 == 0 ? this.sequence - other.sequence : i10;
        }

        @dl.d
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFrom() {
            return this.from;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getSequence() {
            return this.sequence;
        }

        @dl.d
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getTo() {
            return this.to;
        }
    }

    /* JADX INFO: renamed from: androidx.room.util.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: TableInfo.kt */
    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\n\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\tB3\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f¢\u0006\u0004\b\u0015\u0010\u0016B'\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f¢\u0006\u0004\b\u0015\u0010\u0017J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0019"}, d2 = {"Landroidx/room/util/f$f;", "", "other", "", "equals", "", "hashCode", "", "toString", ak.av, "Ljava/lang/String;", "name", "b", "Z", "unique", "", ak.aF, "Ljava/util/List;", com.tekartik.sqflite.b.f98606y, "d", "orders", "<init>", "(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V", "(Ljava/lang/String;ZLjava/util/List;)V", "e", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final class C0217f {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @dl.d
        public static final String f27313f = "index_";

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        @xh.e
        public final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        @xh.e
        public final boolean unique;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @dl.d
        @xh.e
        public final List<String> columns;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @dl.d
        @xh.e
        public List<String> orders;

        @k(message = "Use {@link #Index(String, boolean, List, List)}")
        public C0217f(@dl.d String name, boolean z10, @dl.d List<String> columns) {
            f0.p(name, "name");
            f0.p(columns, "columns");
            int size = columns.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(Index.Order.ASC.name());
            }
            this(name, z10, columns, arrayList);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Collection, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
        public C0217f(@dl.d String name, boolean z10, @dl.d List<String> columns, @dl.d List<String> orders) {
            f0.p(name, "name");
            f0.p(columns, "columns");
            f0.p(orders, "orders");
            this.name = name;
            this.unique = z10;
            this.columns = columns;
            this.orders = orders;
            if (orders.isEmpty()) {
                int size = columns.size();
                orders = new ArrayList<>(size);
                for (int i10 = 0; i10 < size; i10++) {
                    orders.add(Index.Order.ASC.name());
                }
            }
            this.orders = orders;
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C0217f)) {
                return false;
            }
            C0217f c0217f = (C0217f) other;
            if (this.unique == c0217f.unique && f0.g(this.columns, c0217f.columns) && f0.g(this.orders, c0217f.orders)) {
                return kotlin.text.u.v2(this.name, f27313f, false, 2, null) ? kotlin.text.u.v2(c0217f.name, f27313f, false, 2, null) : f0.g(this.name, c0217f.name);
            }
            return false;
        }

        public int hashCode() {
            return ((((((kotlin.text.u.v2(this.name, f27313f, false, 2, null) ? -1184239155 : this.name.hashCode()) * 31) + (this.unique ? 1 : 0)) * 31) + this.columns.hashCode()) * 31) + this.orders.hashCode();
        }

        @dl.d
        public String toString() {
            return "Index{name='" + this.name + "', unique=" + this.unique + ", columns=" + this.columns + ", orders=" + this.orders + "'}";
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(@dl.d String name, @dl.d Map<String, a> columns, @dl.d Set<d> foreignKeys) {
        this(name, columns, foreignKeys, d1.k());
        f0.p(name, "name");
        f0.p(columns, "columns");
        f0.p(foreignKeys, "foreignKeys");
    }

    public f(@dl.d String name, @dl.d Map<String, a> columns, @dl.d Set<d> foreignKeys, @dl.e Set<C0217f> set) {
        f0.p(name, "name");
        f0.p(columns, "columns");
        f0.p(foreignKeys, "foreignKeys");
        this.name = name;
        this.columns = columns;
        this.foreignKeys = foreignKeys;
        this.indices = set;
    }

    public /* synthetic */ f(String str, Map map, Set set, Set set2, int i10, u uVar) {
        this(str, map, set, (i10 & 8) != 0 ? null : set2);
    }

    @dl.d
    @m
    public static final f a(@dl.d j3.g gVar, @dl.d String str) {
        return INSTANCE.a(gVar, str);
    }

    public boolean equals(@dl.e Object other) {
        Set<C0217f> set;
        if (this == other) {
            return true;
        }
        if (!(other instanceof f)) {
            return false;
        }
        f fVar = (f) other;
        if (!f0.g(this.name, fVar.name) || !f0.g(this.columns, fVar.columns) || !f0.g(this.foreignKeys, fVar.foreignKeys)) {
            return false;
        }
        Set<C0217f> set2 = this.indices;
        if (set2 == null || (set = fVar.indices) == null) {
            return true;
        }
        return f0.g(set2, set);
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.columns.hashCode()) * 31) + this.foreignKeys.hashCode();
    }

    @dl.d
    public String toString() {
        return "TableInfo{name='" + this.name + "', columns=" + this.columns + ", foreignKeys=" + this.foreignKeys + ", indices=" + this.indices + '}';
    }
}
