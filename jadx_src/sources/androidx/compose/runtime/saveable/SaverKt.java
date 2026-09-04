package androidx.compose.runtime.saveable;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import yh.l;
import yh.p;

/* JADX INFO: compiled from: Saver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aw\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012.\u0010\t\u001a*\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0003¢\u0006\u0002\b\b2#\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0006\u0012\u0004\u0018\u00018\u00000\n\u001a\u0018\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\f\"\u0004\b\u0000\u0010\u000e\"\"\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010¨\u0006\u0012"}, d2 = {"Original", "", "Saveable", "Lkotlin/Function2;", "Landroidx/compose/runtime/saveable/f;", "Lkotlin/m0;", "name", "value", "Lkotlin/t;", "save", "Lkotlin/Function1;", "restore", "Landroidx/compose/runtime/saveable/e;", ak.av, androidx.exifinterface.media.a.f23244d5, "b", "Landroidx/compose/runtime/saveable/e;", "AutoSaver", "runtime-saveable_release"}, k = 2, mv = {1, 7, 1})
public final class SaverKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final e<Object, Object> f13132a = a(new p<f, Object, Object>() { // from class: androidx.compose.runtime.saveable.SaverKt$AutoSaver$1
        @Override // yh.p
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@dl.d f Saver, @dl.e Object obj) {
            f0.p(Saver, "$this$Saver");
            return obj;
        }
    }, new l<Object, Object>() { // from class: androidx.compose.runtime.saveable.SaverKt$AutoSaver$2
        @Override // yh.l
        @dl.e
        public final Object invoke(@dl.d Object it) {
            f0.p(it, "it");
            return it;
        }
    });

    /* JADX INFO: Add missing generic type declarations: [Saveable, Original] */
    /* JADX INFO: compiled from: Saver.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u001d\u0010\u0004\u001a\u0004\u0018\u00018\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"androidx/compose/runtime/saveable/SaverKt$a", "Landroidx/compose/runtime/saveable/e;", "Landroidx/compose/runtime/saveable/f;", "value", ak.av, "(Landroidx/compose/runtime/saveable/f;Ljava/lang/Object;)Ljava/lang/Object;", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "runtime-saveable_release"}, k = 1, mv = {1, 7, 1})
    public static final class a<Original, Saveable> implements e<Original, Saveable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p<f, Original, Saveable> f13135a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<Saveable, Original> f13136b;

        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super f, ? super Original, ? extends Saveable> pVar, l<? super Saveable, ? extends Original> lVar) {
            this.f13135a = pVar;
            this.f13136b = lVar;
        }

        @Override // androidx.compose.runtime.saveable.e
        @dl.e
        public Saveable a(@dl.d f fVar, Original original) {
            f0.p(fVar, "<this>");
            return this.f13135a.invoke(fVar, original);
        }

        @Override // androidx.compose.runtime.saveable.e
        @dl.e
        public Original b(@dl.d Saveable value) {
            f0.p(value, "value");
            return this.f13136b.invoke(value);
        }
    }

    @dl.d
    public static final <Original, Saveable> e<Original, Saveable> a(@dl.d p<? super f, ? super Original, ? extends Saveable> save, @dl.d l<? super Saveable, ? extends Original> restore) {
        f0.p(save, "save");
        f0.p(restore, "restore");
        return new a(save, restore);
    }

    @dl.d
    public static final <T> e<T, Object> b() {
        e<T, Object> eVar = (e<T, Object>) f13132a;
        f0.n(eVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>");
        return eVar;
    }
}
