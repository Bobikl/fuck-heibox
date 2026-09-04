package androidx.p001datastore.core;

import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.sync.c;
import yh.p;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: SingleProcessDataStore.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001JF\u0010\t\u001a\u00028\u000021\u0010\b\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"androidx/datastore/core/SingleProcessDataStore$readAndInit$api$1", "Landroidx/datastore/core/g;", "Lkotlin/Function2;", "Lkotlin/m0;", "name", "t", "Lkotlin/coroutines/c;", "", "transform", ak.av, "(Lyh/p;Lkotlin/coroutines/c;)Ljava/lang/Object;", "datastore-core"}, k = 1, mv = {1, 5, 1})
public final class SingleProcessDataStore$readAndInit$api$1<T> implements g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f22126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Ref.BooleanRef f22127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Ref.ObjectRef<T> f22128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ SingleProcessDataStore<T> f22129d;

    SingleProcessDataStore$readAndInit$api$1(c cVar, Ref.BooleanRef booleanRef, Ref.ObjectRef<T> objectRef, SingleProcessDataStore<T> singleProcessDataStore) {
        this.f22126a = cVar;
        this.f22127b = booleanRef;
        this.f22128c = objectRef;
        this.f22129d = singleProcessDataStore;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ba A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:21:0x0052, B:36:0x00b2, B:38:0x00ba), top: B:53:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.p001datastore.core.g
    @e
    public Object a(@d p<? super T, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, @d kotlin.coroutines.c<? super T> cVar) throws Throwable {
        SingleProcessDataStore$readAndInit$api$1$updateData$1 singleProcessDataStore$readAndInit$api$1$updateData$1;
        c cVar2;
        SingleProcessDataStore singleProcessDataStore;
        Ref.BooleanRef booleanRef;
        Ref.ObjectRef<T> objectRef;
        c cVar3;
        c cVar4;
        SingleProcessDataStore singleProcessDataStore2;
        T t10;
        Ref.ObjectRef<T> objectRef2;
        if (cVar instanceof SingleProcessDataStore$readAndInit$api$1$updateData$1) {
            singleProcessDataStore$readAndInit$api$1$updateData$1 = (SingleProcessDataStore$readAndInit$api$1$updateData$1) cVar;
            int i10 = singleProcessDataStore$readAndInit$api$1$updateData$1.f22137i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readAndInit$api$1$updateData$1.f22137i = i10 - Integer.MIN_VALUE;
            } else {
                singleProcessDataStore$readAndInit$api$1$updateData$1 = new SingleProcessDataStore$readAndInit$api$1$updateData$1(this, cVar);
            }
        } else {
            singleProcessDataStore$readAndInit$api$1$updateData$1 = new SingleProcessDataStore$readAndInit$api$1$updateData$1(this, cVar);
        }
        Object obj = singleProcessDataStore$readAndInit$api$1$updateData$1.f22135g;
        Object objH = b.h();
        int i11 = singleProcessDataStore$readAndInit$api$1$updateData$1.f22137i;
        try {
            if (i11 == 0) {
                t0.n(obj);
                cVar2 = this.f22126a;
                Ref.BooleanRef booleanRef2 = this.f22127b;
                Ref.ObjectRef<T> objectRef3 = this.f22128c;
                singleProcessDataStore = this.f22129d;
                singleProcessDataStore$readAndInit$api$1$updateData$1.f22130b = pVar;
                singleProcessDataStore$readAndInit$api$1$updateData$1.f22131c = cVar2;
                singleProcessDataStore$readAndInit$api$1$updateData$1.f22132d = booleanRef2;
                singleProcessDataStore$readAndInit$api$1$updateData$1.f22133e = objectRef3;
                singleProcessDataStore$readAndInit$api$1$updateData$1.f22134f = singleProcessDataStore;
                singleProcessDataStore$readAndInit$api$1$updateData$1.f22137i = 1;
                if (cVar2.e(null, singleProcessDataStore$readAndInit$api$1$updateData$1) == objH) {
                    return objH;
                }
                booleanRef = booleanRef2;
                objectRef = objectRef3;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t10 = (T) singleProcessDataStore$readAndInit$api$1$updateData$1.f22132d;
                        objectRef2 = (Ref.ObjectRef) singleProcessDataStore$readAndInit$api$1$updateData$1.f22131c;
                        cVar3 = (c) singleProcessDataStore$readAndInit$api$1$updateData$1.f22130b;
                        try {
                            t0.n(obj);
                            objectRef2.f124891b = t10;
                            objectRef = objectRef2;
                            T t11 = objectRef.f124891b;
                            cVar3.f(null);
                            return t11;
                        } catch (Throwable th2) {
                            th = th2;
                            cVar3.f(null);
                            throw th;
                        }
                    }
                    SingleProcessDataStore singleProcessDataStore3 = (SingleProcessDataStore) singleProcessDataStore$readAndInit$api$1$updateData$1.f22132d;
                    objectRef = (Ref.ObjectRef) singleProcessDataStore$readAndInit$api$1$updateData$1.f22131c;
                    cVar4 = (c) singleProcessDataStore$readAndInit$api$1$updateData$1.f22130b;
                    try {
                        t0.n(obj);
                        singleProcessDataStore2 = singleProcessDataStore3;
                        if (f0.g(obj, objectRef.f124891b)) {
                            cVar3 = cVar4;
                        } else {
                            singleProcessDataStore$readAndInit$api$1$updateData$1.f22130b = cVar4;
                            singleProcessDataStore$readAndInit$api$1$updateData$1.f22131c = objectRef;
                            singleProcessDataStore$readAndInit$api$1$updateData$1.f22132d = obj;
                            singleProcessDataStore$readAndInit$api$1$updateData$1.f22137i = 3;
                            if (singleProcessDataStore2.A(obj, singleProcessDataStore$readAndInit$api$1$updateData$1) == objH) {
                                return objH;
                            }
                            t10 = (T) obj;
                            objectRef2 = objectRef;
                            cVar3 = cVar4;
                            objectRef2.f124891b = t10;
                            objectRef = objectRef2;
                        }
                        T t12 = objectRef.f124891b;
                        cVar3.f(null);
                        return t12;
                    } catch (Throwable th3) {
                        th = th3;
                        cVar3 = cVar4;
                        cVar3.f(null);
                        throw th;
                    }
                }
                SingleProcessDataStore singleProcessDataStore4 = (SingleProcessDataStore) singleProcessDataStore$readAndInit$api$1$updateData$1.f22134f;
                objectRef = (Ref.ObjectRef) singleProcessDataStore$readAndInit$api$1$updateData$1.f22133e;
                booleanRef = (Ref.BooleanRef) singleProcessDataStore$readAndInit$api$1$updateData$1.f22132d;
                c cVar5 = (c) singleProcessDataStore$readAndInit$api$1$updateData$1.f22131c;
                p<? super T, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar2 = (p) singleProcessDataStore$readAndInit$api$1$updateData$1.f22130b;
                t0.n(obj);
                cVar2 = cVar5;
                singleProcessDataStore = singleProcessDataStore4;
                pVar = pVar2;
            }
            if (booleanRef.f124884b) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            T t13 = objectRef.f124891b;
            singleProcessDataStore$readAndInit$api$1$updateData$1.f22130b = cVar2;
            singleProcessDataStore$readAndInit$api$1$updateData$1.f22131c = objectRef;
            singleProcessDataStore$readAndInit$api$1$updateData$1.f22132d = singleProcessDataStore;
            singleProcessDataStore$readAndInit$api$1$updateData$1.f22133e = null;
            singleProcessDataStore$readAndInit$api$1$updateData$1.f22134f = null;
            singleProcessDataStore$readAndInit$api$1$updateData$1.f22137i = 2;
            Object objInvoke = pVar.invoke(t13, singleProcessDataStore$readAndInit$api$1$updateData$1);
            if (objInvoke == objH) {
                return objH;
            }
            cVar4 = cVar2;
            obj = objInvoke;
            singleProcessDataStore2 = singleProcessDataStore;
            if (f0.g(obj, objectRef.f124891b)) {
                singleProcessDataStore$readAndInit$api$1$updateData$1.f22130b = cVar4;
                singleProcessDataStore$readAndInit$api$1$updateData$1.f22131c = objectRef;
                singleProcessDataStore$readAndInit$api$1$updateData$1.f22132d = obj;
                singleProcessDataStore$readAndInit$api$1$updateData$1.f22137i = 3;
                if (singleProcessDataStore2.A(obj, singleProcessDataStore$readAndInit$api$1$updateData$1) == objH) {
                    return objH;
                }
                t10 = (T) obj;
                objectRef2 = objectRef;
                cVar3 = cVar4;
                objectRef2.f124891b = t10;
                objectRef = objectRef2;
            } else {
                cVar3 = cVar4;
            }
            T t14 = objectRef.f124891b;
            cVar3.f(null);
            return t14;
        } catch (Throwable th4) {
            th = th4;
            cVar3 = cVar2;
            cVar3.f(null);
            throw th;
        }
    }
}
