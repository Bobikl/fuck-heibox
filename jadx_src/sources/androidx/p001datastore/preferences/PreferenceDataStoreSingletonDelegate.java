package androidx.p001datastore.preferences;

import android.content.Context;
import androidx.annotation.b0;
import androidx.p001datastore.core.c;
import androidx.p001datastore.core.d;
import androidx.p001datastore.preferences.core.PreferenceDataStoreFactory;
import androidx.p001datastore.preferences.core.a;
import com.umeng.analytics.pro.ak;
import d2.b;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.properties.e;
import kotlin.reflect.n;
import kotlinx.coroutines.q0;
import org.apache.tools.ant.taskdefs.condition.a0;
import yh.l;

/* JADX INFO: compiled from: PreferenceDataStoreDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001BI\b\u0000\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0017\u0012\u001e\u0010\u001c\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001b0\u001a0\u0019\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00022\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0096\u0002R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, d2 = {"Landroidx/datastore/preferences/PreferenceDataStoreSingletonDelegate;", "Lkotlin/properties/e;", "Landroid/content/Context;", "Landroidx/datastore/core/d;", "Landroidx/datastore/preferences/core/a;", "thisRef", "Lkotlin/reflect/n;", a0.f133862j, "d", "", ak.av, "Ljava/lang/String;", "name", "Lkotlinx/coroutines/q0;", "Lkotlinx/coroutines/q0;", "scope", "", "e", "Ljava/lang/Object;", "lock", "f", "Landroidx/datastore/core/d;", "INSTANCE", "Ld2/b;", "corruptionHandler", "Lkotlin/Function1;", "", "Landroidx/datastore/core/c;", "produceMigrations", "<init>", "(Ljava/lang/String;Ld2/b;Lyh/l;Lkotlinx/coroutines/q0;)V", "datastore-preferences_release"}, k = 1, mv = {1, 5, 1})
public final class PreferenceDataStoreSingletonDelegate implements e<Context, d<a>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private final b<a> f22201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final l<Context, List<c<a>>> f22202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final q0 scope;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Object lock;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @b0("lock")
    @dl.e
    private volatile d<a> INSTANCE;

    /* JADX WARN: Multi-variable type inference failed */
    public PreferenceDataStoreSingletonDelegate(@dl.d String name, @dl.e b<a> bVar, @dl.d l<? super Context, ? extends List<? extends c<a>>> produceMigrations, @dl.d q0 scope) {
        f0.p(name, "name");
        f0.p(produceMigrations, "produceMigrations");
        f0.p(scope, "scope");
        this.name = name;
        this.f22201b = bVar;
        this.f22202c = produceMigrations;
        this.scope = scope;
        this.lock = new Object();
    }

    @Override // kotlin.properties.e
    @dl.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public d<a> a(@dl.d Context thisRef, @dl.d n<?> property) {
        d<a> dVar;
        f0.p(thisRef, "thisRef");
        f0.p(property, "property");
        d<a> dVar2 = this.INSTANCE;
        if (dVar2 != null) {
            return dVar2;
        }
        synchronized (this.lock) {
            if (this.INSTANCE == null) {
                final Context applicationContext = thisRef.getApplicationContext();
                PreferenceDataStoreFactory preferenceDataStoreFactory = PreferenceDataStoreFactory.f22225a;
                b<a> bVar = this.f22201b;
                l<Context, List<c<a>>> lVar = this.f22202c;
                f0.o(applicationContext, "applicationContext");
                this.INSTANCE = preferenceDataStoreFactory.a(bVar, lVar.invoke(applicationContext), this.scope, new yh.a<File>() { // from class: androidx.datastore.preferences.PreferenceDataStoreSingletonDelegate$getValue$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // yh.a
                    @dl.d
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final File invoke() {
                        Context applicationContext2 = applicationContext;
                        f0.o(applicationContext2, "applicationContext");
                        return a.a(applicationContext2, this.name);
                    }
                });
            }
            dVar = this.INSTANCE;
            f0.m(dVar);
        }
        return dVar;
    }
}
