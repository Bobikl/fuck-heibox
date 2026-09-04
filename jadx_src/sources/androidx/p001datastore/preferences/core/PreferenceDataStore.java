package androidx.p001datastore.preferences.core;

import androidx.p001datastore.core.d;
import com.umeng.analytics.pro.ak;
import dl.e;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.jvm.internal.f0;
import yh.p;

/* JADX INFO: compiled from: PreferenceDataStoreFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0012\u0010\u0013JF\u0010\n\u001a\u00020\u000221\u0010\t\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Landroidx/datastore/preferences/core/PreferenceDataStore;", "Landroidx/datastore/core/d;", "Landroidx/datastore/preferences/core/a;", "Lkotlin/Function2;", "Lkotlin/m0;", "name", "t", "Lkotlin/coroutines/c;", "", "transform", ak.av, "(Lyh/p;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/datastore/core/d;", "delegate", "Lkotlinx/coroutines/flow/e;", "getData", "()Lkotlinx/coroutines/flow/e;", "data", "<init>", "(Landroidx/datastore/core/d;)V", "datastore-preferences-core"}, k = 1, mv = {1, 5, 1})
public final class PreferenceDataStore implements d<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final d<a> delegate;

    public PreferenceDataStore(@dl.d d<a> delegate) {
        f0.p(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // androidx.p001datastore.core.d
    @e
    public Object a(@dl.d p<? super a, ? super c<? super a>, ? extends Object> pVar, @dl.d c<? super a> cVar) {
        return this.delegate.a(new PreferenceDataStore$updateData$2(pVar, null), cVar);
    }

    @Override // androidx.p001datastore.core.d
    @dl.d
    public kotlinx.coroutines.flow.e<a> getData() {
        return this.delegate.getData();
    }
}
