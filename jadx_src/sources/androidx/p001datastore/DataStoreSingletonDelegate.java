package androidx.p001datastore;

import android.content.Context;
import androidx.annotation.b0;
import androidx.exifinterface.media.a;
import androidx.p001datastore.core.c;
import androidx.p001datastore.core.d;
import androidx.p001datastore.core.i;
import com.lzy.okgo.model.Progress;
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

/* JADX INFO: compiled from: DataStoreDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0002BW\b\u0000\u0012\u0006\u0010\f\u001a\u00020\t\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001c\u0012\u001e\u0010!\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 0\u001f0\u001e\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\"\u0010#J#\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0005\u001a\u00020\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0096\u0002R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006$"}, d2 = {"Landroidx/datastore/DataStoreSingletonDelegate;", a.f23244d5, "Lkotlin/properties/e;", "Landroid/content/Context;", "Landroidx/datastore/core/d;", "thisRef", "Lkotlin/reflect/n;", a0.f133862j, "d", "", ak.av, "Ljava/lang/String;", Progress.F, "Landroidx/datastore/core/i;", "b", "Landroidx/datastore/core/i;", "serializer", "Lkotlinx/coroutines/q0;", "e", "Lkotlinx/coroutines/q0;", "scope", "", "f", "Ljava/lang/Object;", "lock", "g", "Landroidx/datastore/core/d;", "INSTANCE", "Ld2/b;", "corruptionHandler", "Lkotlin/Function1;", "", "Landroidx/datastore/core/c;", "produceMigrations", "<init>", "(Ljava/lang/String;Landroidx/datastore/core/i;Ld2/b;Lyh/l;Lkotlinx/coroutines/q0;)V", "datastore_release"}, k = 1, mv = {1, 5, 1})
public final class DataStoreSingletonDelegate<T> implements e<Context, d<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final String fileName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final i<T> serializer;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final b<T> f22039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final l<Context, List<c<T>>> f22040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final q0 scope;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Object lock;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @b0("lock")
    @dl.e
    private volatile d<T> INSTANCE;

    /* JADX WARN: Multi-variable type inference failed */
    public DataStoreSingletonDelegate(@dl.d String fileName, @dl.d i<T> serializer, @dl.e b<T> bVar, @dl.d l<? super Context, ? extends List<? extends c<T>>> produceMigrations, @dl.d q0 scope) {
        f0.p(fileName, "fileName");
        f0.p(serializer, "serializer");
        f0.p(produceMigrations, "produceMigrations");
        f0.p(scope, "scope");
        this.fileName = fileName;
        this.serializer = serializer;
        this.f22039c = bVar;
        this.f22040d = produceMigrations;
        this.scope = scope;
        this.lock = new Object();
    }

    @Override // kotlin.properties.e
    @dl.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public d<T> a(@dl.d Context thisRef, @dl.d n<?> property) {
        d<T> dVar;
        f0.p(thisRef, "thisRef");
        f0.p(property, "property");
        d<T> dVar2 = this.INSTANCE;
        if (dVar2 != null) {
            return dVar2;
        }
        synchronized (this.lock) {
            if (this.INSTANCE == null) {
                final Context applicationContext = thisRef.getApplicationContext();
                i<T> iVar = this.serializer;
                b<T> bVar = this.f22039c;
                l<Context, List<c<T>>> lVar = this.f22040d;
                f0.o(applicationContext, "applicationContext");
                this.INSTANCE = androidx.p001datastore.core.e.f22176a.a(iVar, bVar, lVar.invoke(applicationContext), this.scope, new yh.a<File>() { // from class: androidx.datastore.DataStoreSingletonDelegate$getValue$1$1
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
                        return Context.a(applicationContext2, ((DataStoreSingletonDelegate) this).fileName);
                    }
                });
            }
            dVar = this.INSTANCE;
            f0.m(dVar);
        }
        return dVar;
    }
}
