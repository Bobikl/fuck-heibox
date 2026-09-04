package androidx.room;

import android.content.Context;
import androidx.annotation.RestrictTo;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Room.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ.\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\b\b\u0000\u0010\u0002*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007J8\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\b\b\u0000\u0010\u0002*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0007R\u0014\u0010\u0012\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011¨\u0006\u0018"}, d2 = {"Landroidx/room/t1;", "", androidx.exifinterface.media.a.f23244d5, "C", "Ljava/lang/Class;", "klass", "", "suffix", "b", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "Landroidx/room/RoomDatabase;", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Landroidx/room/RoomDatabase$a;", ak.aF, "name", ak.av, "Ljava/lang/String;", "LOG_TAG", "MASTER_TABLE_NAME", "d", "CURSOR_CONV_SUFFIX", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final t1 f27262a = new t1();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final String LOG_TAG = "ROOM";

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final String MASTER_TABLE_NAME = "room_master_table";

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final String CURSOR_CONV_SUFFIX = "_CursorConverter";

    private t1() {
    }

    @dl.d
    @xh.m
    public static final <T extends RoomDatabase> RoomDatabase.a<T> a(@dl.d Context context, @dl.d Class<T> klass, @dl.e String name) {
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(klass, "klass");
        if (true ^ (name == null || kotlin.text.u.V1(name))) {
            return new RoomDatabase.a<>(context, klass, name);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder".toString());
    }

    @xh.m
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <T, C> T b(@dl.d Class<C> klass, @dl.d String suffix) {
        String str;
        kotlin.jvm.internal.f0.p(klass, "klass");
        kotlin.jvm.internal.f0.p(suffix, "suffix");
        Package r10 = klass.getPackage();
        kotlin.jvm.internal.f0.m(r10);
        String fullPackage = r10.getName();
        String canonicalName = klass.getCanonicalName();
        kotlin.jvm.internal.f0.m(canonicalName);
        kotlin.jvm.internal.f0.o(fullPackage, "fullPackage");
        if (!(fullPackage.length() == 0)) {
            canonicalName = canonicalName.substring(fullPackage.length() + 1);
            kotlin.jvm.internal.f0.o(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String str2 = kotlin.text.u.k2(canonicalName, lg.a.f131414g, '_', false, 4, null) + suffix;
        try {
            if (fullPackage.length() == 0) {
                str = str2;
            } else {
                str = fullPackage + lg.a.f131414g + str2;
            }
            Class<?> cls = Class.forName(str, true, klass.getClassLoader());
            kotlin.jvm.internal.f0.n(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            return (T) cls.newInstance();
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + klass.getCanonicalName() + ". " + str2 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + klass + ".canonicalName");
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + klass + ".canonicalName");
        }
    }

    @dl.d
    @xh.m
    public static final <T extends RoomDatabase> RoomDatabase.a<T> c(@dl.d Context context, @dl.d Class<T> klass) {
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(klass, "klass");
        return new RoomDatabase.a<>(context, klass, null);
    }
}
