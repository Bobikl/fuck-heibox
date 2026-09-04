package androidx.p001datastore.migrations;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.annotation.u;
import androidx.annotation.w0;
import androidx.p001datastore.core.c;
import com.umeng.analytics.pro.ak;
import com.umeng.analytics.pro.d;
import dl.e;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.b0;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlin.z;
import xh.i;
import xh.m;
import yh.p;
import yh.q;

/* JADX INFO: compiled from: SharedPreferencesMigration.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u000fB\u008c\u0001\b\u0002\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160\u001e\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050 \u0012$\b\u0002\u0010%\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0#\u0012\u0006\u0012\u0004\u0018\u00010$0\"\u0012(\u0010(\u001a$\b\u0001\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#\u0012\u0006\u0012\u0004\u0018\u00010$0&\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005ø\u0001\u0000¢\u0006\u0004\b)\u0010*Bz\b\u0017\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160\u001e\u0012\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050 \u0012$\b\u0002\u0010%\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0#\u0012\u0006\u0012\u0004\u0018\u00010$0\"\u0012(\u0010(\u001a$\b\u0001\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#\u0012\u0006\u0012\u0004\u0018\u00010$0&ø\u0001\u0000¢\u0006\u0004\b)\u0010+B|\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010,\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050 \u0012$\b\u0002\u0010%\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0#\u0012\u0006\u0012\u0004\u0018\u00010$0\"\u0012(\u0010(\u001a$\b\u0001\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#\u0012\u0006\u0012\u0004\u0018\u00010$0&ø\u0001\u0000¢\u0006\u0004\b)\u0010-J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u001b\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"Landroidx/datastore/migrations/SharedPreferencesMigration;", androidx.exifinterface.media.a.f23244d5, "Landroidx/datastore/core/c;", "Landroid/content/Context;", d.R, "", "name", "Lkotlin/b2;", "d", "Ljava/io/File;", "g", "prefsFile", "f", "currentData", "", ak.av, "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", ak.aF, "b", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroid/content/Context;", "Ljava/lang/String;", "Landroid/content/SharedPreferences;", "e", "Lkotlin/z;", "()Landroid/content/SharedPreferences;", "sharedPrefs", "", "Ljava/util/Set;", "keySet", "Lkotlin/Function0;", "produceSharedPreferences", "", "keysToMigrate", "Lkotlin/Function2;", "Lkotlin/coroutines/c;", "", "shouldRunMigration", "Lkotlin/Function3;", "Landroidx/datastore/migrations/c;", "migrate", "<init>", "(Lyh/a;Ljava/util/Set;Lyh/p;Lyh/q;Landroid/content/Context;Ljava/lang/String;)V", "(Lyh/a;Ljava/util/Set;Lyh/p;Lyh/q;)V", "sharedPreferencesName", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;Lyh/p;Lyh/q;)V", "datastore_release"}, k = 1, mv = {1, 5, 1})
public final class SharedPreferencesMigration<T> implements c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final p<T, kotlin.coroutines.c<? super Boolean>, Object> f22180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final q<c, T, kotlin.coroutines.c<? super T>, Object> f22181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @e
    private final Context context;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @e
    private final String name;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final z sharedPrefs;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @e
    private final Set<String> keySet;

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$1, reason: invalid class name */
    /* JADX INFO: compiled from: SharedPreferencesMigration.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {androidx.exifinterface.media.a.f23244d5, "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.datastore.migrations.SharedPreferencesMigration$1", f = "SharedPreferencesMigration.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<T, kotlin.coroutines.c<? super Boolean>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f22186b;

        AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // yh.p
        @e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(T t10, @e kotlin.coroutines.c<? super Boolean> cVar) {
            return ((AnonymousClass1) create(t10, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            b.h();
            if (this.f22186b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
            return kotlin.coroutines.jvm.internal.a.a(true);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$2, reason: invalid class name */
    /* JADX INFO: compiled from: SharedPreferencesMigration.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {androidx.exifinterface.media.a.f23244d5, "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.datastore.migrations.SharedPreferencesMigration$2", f = "SharedPreferencesMigration.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements p<T, kotlin.coroutines.c<? super Boolean>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f22187b;

        AnonymousClass2(kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // yh.p
        @e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(T t10, @e kotlin.coroutines.c<? super Boolean> cVar) {
            return ((AnonymousClass2) create(t10, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass2(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            b.h();
            if (this.f22187b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
            return kotlin.coroutines.jvm.internal.a.a(true);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$3, reason: invalid class name */
    /* JADX INFO: compiled from: SharedPreferencesMigration.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {androidx.exifinterface.media.a.f23244d5, "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.datastore.migrations.SharedPreferencesMigration$3", f = "SharedPreferencesMigration.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3 extends SuspendLambda implements p<T, kotlin.coroutines.c<? super Boolean>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f22188b;

        AnonymousClass3(kotlin.coroutines.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
        }

        @Override // yh.p
        @e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(T t10, @e kotlin.coroutines.c<? super Boolean> cVar) {
            return ((AnonymousClass3) create(t10, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass3(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            b.h();
            if (this.f22188b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
            return kotlin.coroutines.jvm.internal.a.a(true);
        }
    }

    /* JADX INFO: compiled from: SharedPreferencesMigration.kt */
    @w0(24)
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Landroidx/datastore/migrations/SharedPreferencesMigration$a;", "", "Landroid/content/Context;", d.R, "", "name", "", ak.av, "<init>", "()V", "datastore_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final a f22191a = new a();

        private a() {
        }

        @u
        @m
        public static final boolean a(@dl.d Context context, @dl.d String name) {
            f0.p(context, "context");
            f0.p(name, "name");
            return context.deleteSharedPreferences(name);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public SharedPreferencesMigration(@dl.d final Context context, @dl.d final String sharedPreferencesName, @dl.d Set<String> keysToMigrate, @dl.d p<? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> shouldRunMigration, @dl.d q<? super c, ? super T, ? super kotlin.coroutines.c<? super T>, ? extends Object> migrate) {
        this(new yh.a<SharedPreferences>() { // from class: androidx.datastore.migrations.SharedPreferencesMigration.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SharedPreferences invoke() {
                SharedPreferences sharedPreferences = context.getSharedPreferences(sharedPreferencesName, 0);
                f0.o(sharedPreferences, "context.getSharedPreferences(sharedPreferencesName, Context.MODE_PRIVATE)");
                return sharedPreferences;
            }
        }, keysToMigrate, shouldRunMigration, migrate, context, sharedPreferencesName);
        f0.p(context, "context");
        f0.p(sharedPreferencesName, "sharedPreferencesName");
        f0.p(keysToMigrate, "keysToMigrate");
        f0.p(shouldRunMigration, "shouldRunMigration");
        f0.p(migrate, "migrate");
    }

    public /* synthetic */ SharedPreferencesMigration(Context context, String str, Set set, p pVar, q qVar, int i10, kotlin.jvm.internal.u uVar) {
        this(context, str, (i10 & 4) != 0 ? b.a() : set, (i10 & 8) != 0 ? new AnonymousClass3(null) : pVar, qVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public SharedPreferencesMigration(@dl.d Context context, @dl.d String sharedPreferencesName, @dl.d Set<String> keysToMigrate, @dl.d q<? super c, ? super T, ? super kotlin.coroutines.c<? super T>, ? extends Object> migrate) {
        this(context, sharedPreferencesName, keysToMigrate, null, migrate, 8, null);
        f0.p(context, "context");
        f0.p(sharedPreferencesName, "sharedPreferencesName");
        f0.p(keysToMigrate, "keysToMigrate");
        f0.p(migrate, "migrate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public SharedPreferencesMigration(@dl.d Context context, @dl.d String sharedPreferencesName, @dl.d q<? super c, ? super T, ? super kotlin.coroutines.c<? super T>, ? extends Object> migrate) {
        this(context, sharedPreferencesName, null, null, migrate, 12, null);
        f0.p(context, "context");
        f0.p(sharedPreferencesName, "sharedPreferencesName");
        f0.p(migrate, "migrate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public SharedPreferencesMigration(@dl.d yh.a<? extends SharedPreferences> produceSharedPreferences, @dl.d Set<String> keysToMigrate, @dl.d p<? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> shouldRunMigration, @dl.d q<? super c, ? super T, ? super kotlin.coroutines.c<? super T>, ? extends Object> migrate) {
        this(produceSharedPreferences, keysToMigrate, shouldRunMigration, migrate, (Context) null, (String) null);
        f0.p(produceSharedPreferences, "produceSharedPreferences");
        f0.p(keysToMigrate, "keysToMigrate");
        f0.p(shouldRunMigration, "shouldRunMigration");
        f0.p(migrate, "migrate");
    }

    public /* synthetic */ SharedPreferencesMigration(yh.a aVar, Set set, p pVar, q qVar, int i10, kotlin.jvm.internal.u uVar) {
        this((yh.a<? extends SharedPreferences>) aVar, (Set<String>) ((i10 & 2) != 0 ? b.a() : set), (i10 & 4) != 0 ? new AnonymousClass2(null) : pVar, qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SharedPreferencesMigration(yh.a<? extends SharedPreferences> aVar, Set<String> set, p<? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar, q<? super c, ? super T, ? super kotlin.coroutines.c<? super T>, ? extends Object> qVar, Context context, String str) {
        this.f22180a = pVar;
        this.f22181b = qVar;
        this.context = context;
        this.name = str;
        this.sharedPrefs = b0.c(aVar);
        this.keySet = set == b.a() ? null : CollectionsKt___CollectionsKt.U5(set);
    }

    /* synthetic */ SharedPreferencesMigration(yh.a aVar, Set set, p pVar, q qVar, Context context, String str, int i10, kotlin.jvm.internal.u uVar) {
        this((yh.a<? extends SharedPreferences>) aVar, (Set<String>) set, (i10 & 4) != 0 ? new AnonymousClass1(null) : pVar, qVar, context, str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public SharedPreferencesMigration(@dl.d yh.a<? extends SharedPreferences> produceSharedPreferences, @dl.d Set<String> keysToMigrate, @dl.d q<? super c, ? super T, ? super kotlin.coroutines.c<? super T>, ? extends Object> migrate) {
        this(produceSharedPreferences, keysToMigrate, (p) null, migrate, 4, (kotlin.jvm.internal.u) null);
        f0.p(produceSharedPreferences, "produceSharedPreferences");
        f0.p(keysToMigrate, "keysToMigrate");
        f0.p(migrate, "migrate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public SharedPreferencesMigration(@dl.d yh.a<? extends SharedPreferences> produceSharedPreferences, @dl.d q<? super c, ? super T, ? super kotlin.coroutines.c<? super T>, ? extends Object> migrate) {
        this(produceSharedPreferences, (Set) null, (p) null, migrate, 6, (kotlin.jvm.internal.u) null);
        f0.p(produceSharedPreferences, "produceSharedPreferences");
        f0.p(migrate, "migrate");
    }

    private final void d(Context context, String str) throws IOException {
        if (Build.VERSION.SDK_INT >= 24) {
            a aVar = a.f22191a;
            if (!a.a(context, str)) {
                throw new IOException(f0.C("Unable to delete SharedPreferences: ", str));
            }
        } else {
            File fileG = g(context, str);
            File fileF = f(fileG);
            fileG.delete();
            fileF.delete();
        }
    }

    private final SharedPreferences e() {
        return (SharedPreferences) this.sharedPrefs.getValue();
    }

    private final File f(File prefsFile) {
        return new File(f0.C(prefsFile.getPath(), ".bak"));
    }

    private final File g(Context context, String name) {
        return new File(new File(context.getApplicationInfo().dataDir, "shared_prefs"), f0.C(name, ".xml"));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.p001datastore.core.c
    @e
    public Object a(T t10, @dl.d kotlin.coroutines.c<? super Boolean> cVar) throws Throwable {
        SharedPreferencesMigration$shouldMigrate$1 sharedPreferencesMigration$shouldMigrate$1;
        SharedPreferencesMigration<T> sharedPreferencesMigration;
        if (cVar instanceof SharedPreferencesMigration$shouldMigrate$1) {
            sharedPreferencesMigration$shouldMigrate$1 = (SharedPreferencesMigration$shouldMigrate$1) cVar;
            int i10 = sharedPreferencesMigration$shouldMigrate$1.f22195e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                sharedPreferencesMigration$shouldMigrate$1.f22195e = i10 - Integer.MIN_VALUE;
            } else {
                sharedPreferencesMigration$shouldMigrate$1 = new SharedPreferencesMigration$shouldMigrate$1(this, cVar);
            }
        } else {
            sharedPreferencesMigration$shouldMigrate$1 = new SharedPreferencesMigration$shouldMigrate$1(this, cVar);
        }
        Object objInvoke = sharedPreferencesMigration$shouldMigrate$1.f22193c;
        Object objH = b.h();
        int i11 = sharedPreferencesMigration$shouldMigrate$1.f22195e;
        boolean z10 = true;
        if (i11 == 0) {
            t0.n(objInvoke);
            p<T, kotlin.coroutines.c<? super Boolean>, Object> pVar = this.f22180a;
            sharedPreferencesMigration$shouldMigrate$1.f22192b = this;
            sharedPreferencesMigration$shouldMigrate$1.f22195e = 1;
            objInvoke = pVar.invoke(t10, sharedPreferencesMigration$shouldMigrate$1);
            if (objInvoke == objH) {
                return objH;
            }
            sharedPreferencesMigration = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sharedPreferencesMigration = (SharedPreferencesMigration) sharedPreferencesMigration$shouldMigrate$1.f22192b;
            t0.n(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return kotlin.coroutines.jvm.internal.a.a(false);
        }
        Set<String> set = sharedPreferencesMigration.keySet;
        if (set == null) {
            Map<String, ?> all = sharedPreferencesMigration.e().getAll();
            f0.o(all, "sharedPrefs.all");
            if (all.isEmpty()) {
                z10 = false;
            }
        } else {
            SharedPreferences sharedPreferencesE = sharedPreferencesMigration.e();
            if ((set instanceof Collection) && set.isEmpty()) {
                z10 = false;
            } else {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    if (kotlin.coroutines.jvm.internal.a.a(sharedPreferencesE.contains((String) it.next())).booleanValue()) {
                    }
                }
                z10 = false;
            }
        }
        return kotlin.coroutines.jvm.internal.a.a(z10);
    }

    @Override // androidx.p001datastore.core.c
    @e
    public Object b(@dl.d kotlin.coroutines.c<? super b2> cVar) throws IOException {
        b2 b2Var;
        Context context;
        String str;
        SharedPreferences.Editor editorEdit = e().edit();
        Set<String> set = this.keySet;
        if (set == null) {
            editorEdit.clear();
        } else {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
        }
        if (!editorEdit.commit()) {
            throw new IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if (e().getAll().isEmpty() && (context = this.context) != null && (str = this.name) != null) {
            d(context, str);
        }
        Set<String> set2 = this.keySet;
        if (set2 == null) {
            b2Var = null;
        } else {
            set2.clear();
            b2Var = b2.f124493a;
        }
        return b2Var == b.h() ? b2Var : b2.f124493a;
    }

    @Override // androidx.p001datastore.core.c
    @e
    public Object c(T t10, @dl.d kotlin.coroutines.c<? super T> cVar) {
        return this.f22181b.invoke(new c(e(), this.keySet), t10, cVar);
    }
}
