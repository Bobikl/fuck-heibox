package kotlinx.coroutines.debug.internal;

import com.google.common.util.concurrent.r1;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.taobao.aranger.constant.Constants;
import com.umeng.analytics.pro.ak;
import fi.u;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import yh.p;

/* JADX INFO: compiled from: ConcurrentWeakMap.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0003\"\u0017\u001bB\u0011\u0012\b\b\u0002\u0010\u0019\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\n\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u00002\b\u0010\t\u001a\u0004\u0018\u00018\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\u00052\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u000bJ\u0019\u0010\u0013\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0007J\r\u0010\u0015\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0007R\u001c\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001fR&\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!0\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001f¨\u0006'"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "", "K", androidx.exifinterface.media.a.X4, "Lkotlin/collections/e;", "Lkotlin/b2;", "i", "()V", "key", "value", "j", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/debug/internal/g;", RXScreenCaptureService.KEY_WIDTH, RXScreenCaptureService.KEY_HEIGHT, "(Lkotlinx/coroutines/debug/internal/g;)V", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "remove", "clear", "l", "Ljava/lang/ref/ReferenceQueue;", "b", "Ljava/lang/ref/ReferenceQueue;", "weakRefQueue", "", ak.aF, "()I", UiKitSpanObj.TYPE_SIZE, "", "()Ljava/util/Set;", Constants.PARAM_KEYS, "", ak.av, "entries", "", "<init>", "(Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class ConcurrentWeakMap<K, V> extends kotlin.collections.e<K, V> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f129092c = AtomicIntegerFieldUpdater.newUpdater(ConcurrentWeakMap.class, "_size");

    @dl.d
    private volatile /* synthetic */ int _size;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final ReferenceQueue<K> weakRefQueue;

    @dl.d
    volatile /* synthetic */ Object core;

    /* JADX INFO: compiled from: ConcurrentWeakMap.kt */
    @Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\b\n\b\u0082\u0004\u0018\u00002\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010 \u001a\u00020\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\n\u001a\u00028\u00002\b\u0010\r\u001a\u0004\u0018\u00018\u00012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u00120\u0000R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u00072\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u000e¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00020\u001b\"\u0004\b\u0002\u0010\u00182\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001f¨\u0006%"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$a;", "", "", "hash", "d", "(I)I", UCropPlusActivity.ARG_INDEX, "Lkotlin/b2;", "i", "(I)V", "key", ak.aF, "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "Lkotlinx/coroutines/debug/internal/g;", "weakKey0", "f", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlinx/coroutines/debug/internal/g;)Ljava/lang/Object;", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", RXScreenCaptureService.KEY_HEIGHT, "()Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$a;", "weakRef", "b", "(Lkotlinx/coroutines/debug/internal/g;)V", androidx.exifinterface.media.a.S4, "Lkotlin/Function2;", "factory", "", "e", "(Lyh/p;)Ljava/util/Iterator;", ak.av, "I", "allocated", "shift", "threshold", "<init>", "(Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public final class a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f129094g = AtomicIntegerFieldUpdater.newUpdater(a.class, "load");

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int allocated;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int shift;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int threshold;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.d
        /* synthetic */ AtomicReferenceArray f129098d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @dl.d
        /* synthetic */ AtomicReferenceArray f129099e;

        @dl.d
        private volatile /* synthetic */ int load = 0;

        /* JADX INFO: renamed from: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ConcurrentWeakMap.kt */
        @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B!\u0012\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\t\u0010\u0006\u001a\u00020\u0005H\u0096\u0002J\u0010\u0010\u0007\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\tH\u0016R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00028\u00018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$a$a;", androidx.exifinterface.media.a.S4, "", "Lkotlin/b2;", ak.av, "", "hasNext", "next", "()Ljava/lang/Object;", "", "b", "", ak.aF, "I", UCropPlusActivity.ARG_INDEX, "d", "Ljava/lang/Object;", "key", "e", "value", "Lkotlin/Function2;", "factory", "<init>", "(Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$a;Lyh/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
        public final class C1189a<E> implements Iterator<E>, zh.d {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @dl.d
            private final p<K, V, E> f129101b;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private int index = -1;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            private K key;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            private V value;

            /* JADX WARN: Multi-variable type inference failed */
            public C1189a(p<? super K, ? super V, ? extends E> pVar) {
                this.f129101b = pVar;
                a();
            }

            private final void a() {
                K k10;
                while (true) {
                    int i10 = this.index + 1;
                    this.index = i10;
                    if (i10 >= ((a) a.this).allocated) {
                        return;
                    }
                    g gVar = (g) a.this.f129098d.get(this.index);
                    if (gVar != null && (k10 = (K) gVar.get()) != null) {
                        this.key = k10;
                        Object obj = (V) a.this.f129099e.get(this.index);
                        if (obj instanceof h) {
                            obj = (V) ((h) obj).ref;
                        }
                        if (obj != null) {
                            this.value = (V) obj;
                            return;
                        }
                    }
                }
            }

            @Override // java.util.Iterator
            @dl.d
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Void remove() {
                kotlinx.coroutines.debug.internal.b.e();
                throw new KotlinNothingValueException();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < ((a) a.this).allocated;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // java.util.Iterator
            public E next() {
                if (this.index >= ((a) a.this).allocated) {
                    throw new NoSuchElementException();
                }
                p<K, V, E> pVar = this.f129101b;
                K k10 = this.key;
                if (k10 == false) {
                    f0.S("key");
                    k10 = (K) b2.f124493a;
                }
                V v10 = this.value;
                if (v10 == false) {
                    f0.S("value");
                    v10 = (V) b2.f124493a;
                }
                E e10 = (E) pVar.invoke(k10, v10);
                a();
                return e10;
            }
        }

        public a(int i10) {
            this.allocated = i10;
            this.shift = Integer.numberOfLeadingZeros(i10) + 1;
            this.threshold = (i10 * 2) / 3;
            this.f129098d = new AtomicReferenceArray(i10);
            this.f129099e = new AtomicReferenceArray(i10);
        }

        private final int d(int hash) {
            return (hash * (-1640531527)) >>> this.shift;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object g(a aVar, Object obj, Object obj2, g gVar, int i10, Object obj3) {
            if ((i10 & 4) != 0) {
                gVar = null;
            }
            return aVar.f(obj, obj2, gVar);
        }

        private final void i(int index) {
            Object obj;
            do {
                obj = this.f129099e.get(index);
                if (obj == null || (obj instanceof h)) {
                    return;
                }
            } while (!r1.a(this.f129099e, index, obj, null));
            ConcurrentWeakMap.this.i();
        }

        public final void b(@dl.d g<?> weakRef) {
            int iD = d(weakRef.hash);
            while (true) {
                g<?> gVar = (g) this.f129098d.get(iD);
                if (gVar == null) {
                    return;
                }
                if (gVar == weakRef) {
                    i(iD);
                    return;
                } else {
                    if (iD == 0) {
                        iD = this.allocated;
                    }
                    iD--;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @dl.e
        public final V c(@dl.d K key) {
            int iD = d(key.hashCode());
            while (true) {
                g gVar = (g) this.f129098d.get(iD);
                if (gVar == null) {
                    return null;
                }
                T t10 = gVar.get();
                if (f0.g(key, t10)) {
                    V v10 = (V) this.f129099e.get(iD);
                    return v10 instanceof h ? (V) ((h) v10).ref : v10;
                }
                if (t10 == 0) {
                    i(iD);
                }
                if (iD == 0) {
                    iD = this.allocated;
                }
                iD--;
            }
        }

        @dl.d
        public final <E> Iterator<E> e(@dl.d p<? super K, ? super V, ? extends E> factory) {
            return new C1189a(factory);
        }

        @dl.e
        public final Object f(@dl.d K key, @dl.e V value, @dl.e g<K> weakKey0) {
            int i10;
            Object obj;
            int iD = d(key.hashCode());
            boolean z10 = false;
            while (true) {
                g gVar = (g) this.f129098d.get(iD);
                if (gVar != null) {
                    T t10 = gVar.get();
                    if (f0.g(key, t10)) {
                        if (!z10) {
                            break;
                        }
                        f129094g.decrementAndGet(this);
                        break;
                    }
                    if (t10 == 0) {
                        i(iD);
                    }
                    if (iD == 0) {
                        iD = this.allocated;
                    }
                    iD--;
                } else if (value != null) {
                    if (!z10) {
                        do {
                            i10 = this.load;
                            if (i10 >= this.threshold) {
                                return kotlinx.coroutines.debug.internal.b.f129158c;
                            }
                        } while (!f129094g.compareAndSet(this, i10, i10 + 1));
                        z10 = true;
                    }
                    if (weakKey0 == null) {
                        weakKey0 = new g<>(key, ((ConcurrentWeakMap) ConcurrentWeakMap.this).weakRefQueue);
                    }
                    if (r1.a(this.f129098d, iD, null, weakKey0)) {
                        break;
                    }
                } else {
                    return null;
                }
            }
            do {
                obj = this.f129099e.get(iD);
                if (obj instanceof h) {
                    return kotlinx.coroutines.debug.internal.b.f129158c;
                }
            } while (!r1.a(this.f129099e, iD, obj, value));
            return obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @dl.d
        public final ConcurrentWeakMap<K, V>.a h() {
            Object obj;
            while (true) {
                ConcurrentWeakMap<K, V>.a aVar = (ConcurrentWeakMap<K, V>.a) ConcurrentWeakMap.this.new a(Integer.highestOneBit(u.u(ConcurrentWeakMap.this.size(), 4)) * 4);
                int i10 = this.allocated;
                for (int i11 = 0; i11 < i10; i11++) {
                    g gVar = (g) this.f129098d.get(i11);
                    Object obj2 = gVar != null ? gVar.get() : null;
                    if (gVar != null && obj2 == null) {
                        i(i11);
                    }
                    do {
                        obj = this.f129099e.get(i11);
                        if (obj instanceof h) {
                            obj = ((h) obj).ref;
                            break;
                        }
                    } while (!r1.a(this.f129099e, i11, obj, kotlinx.coroutines.debug.internal.b.d(obj)));
                    if (obj2 == null || obj == null || aVar.f(obj2, obj, gVar) != kotlinx.coroutines.debug.internal.b.f129158c) {
                    }
                }
                return aVar;
            }
        }
    }

    /* JADX INFO: compiled from: ConcurrentWeakMap.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\b\u000e\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B\u0017\u0012\u0006\u0010\u000b\u001a\u00028\u0002\u0012\u0006\u0010\u000e\u001a\u00028\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0005\u001a\u00028\u00032\u0006\u0010\u0004\u001a\u00028\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00028\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\u00028\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\n¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$b;", "K", androidx.exifinterface.media.a.X4, "", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "b", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "key", ak.aF, "getValue", "value", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class b<K, V> implements Map.Entry<K, V>, zh.g.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final K key;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final V value;

        public b(K k10, V v10) {
            this.key = k10;
            this.value = v10;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public V setValue(V newValue) {
            kotlinx.coroutines.debug.internal.b.e();
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: compiled from: ConcurrentWeakMap.kt */
    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010)\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B!\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0007H\u0096\u0002R\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$c;", androidx.exifinterface.media.a.S4, "Lkotlin/collections/f;", "element", "", "add", "(Ljava/lang/Object;)Z", "", "iterator", "", ak.av, "()I", UiKitSpanObj.TYPE_SIZE, "Lkotlin/Function2;", "factory", "<init>", "(Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;Lyh/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public final class c<E> extends kotlin.collections.f<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final p<K, V, E> f129108b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(p<? super K, ? super V, ? extends E> pVar) {
            this.f129108b = pVar;
        }

        @Override // kotlin.collections.f
        /* JADX INFO: renamed from: a */
        public int getSize() {
            return ConcurrentWeakMap.this.size();
        }

        @Override // kotlin.collections.f, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(E element) {
            kotlinx.coroutines.debug.internal.b.e();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        @dl.d
        public Iterator<E> iterator() {
            return ((a) ConcurrentWeakMap.this.core).e(this.f129108b);
        }
    }

    public ConcurrentWeakMap() {
        this(false, 1, null);
    }

    public ConcurrentWeakMap(boolean z10) {
        this._size = 0;
        this.core = new a(16);
        this.weakRefQueue = z10 ? new ReferenceQueue<>() : null;
    }

    public /* synthetic */ ConcurrentWeakMap(boolean z10, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? false : z10);
    }

    private final void h(g<?> w10) {
        ((a) this.core).b(w10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        f129092c.decrementAndGet(this);
    }

    private final synchronized V j(K key, V value) {
        V v10;
        a aVarH = (a) this.core;
        while (true) {
            v10 = (V) a.g(aVarH, key, value, null, 4, null);
            if (v10 == kotlinx.coroutines.debug.internal.b.f129158c) {
                aVarH = aVarH.h();
                this.core = aVarH;
            }
        }
        return v10;
    }

    @Override // kotlin.collections.e
    @dl.d
    public Set<Map.Entry<K, V>> a() {
        return new c(new p<K, V, Map.Entry<K, V>>() { // from class: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$entries$1
            @Override // yh.p
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Map.Entry<K, V> invoke(@dl.d K k10, @dl.d V v10) {
                return new ConcurrentWeakMap.b(k10, v10);
            }
        });
    }

    @Override // kotlin.collections.e
    @dl.d
    public Set<K> b() {
        return new c(new p<K, V, K>() { // from class: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$keys$1
            @Override // yh.p
            @dl.d
            public final K invoke(@dl.d K k10, @dl.d V v10) {
                return k10;
            }
        });
    }

    @Override // kotlin.collections.e
    /* JADX INFO: renamed from: c, reason: from getter */
    public int get_size() {
        return this._size;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Iterator<K> it = keySet().iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    @dl.e
    public V get(@dl.e Object key) {
        if (key == null) {
            return null;
        }
        return (V) ((a) this.core).c(key);
    }

    public final void l() {
        if (!(this.weakRefQueue != null)) {
            throw new IllegalStateException("Must be created with weakRefQueue = true".toString());
        }
        while (true) {
            try {
                Reference<? extends K> referenceRemove = this.weakRefQueue.remove();
                if (referenceRemove == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.debug.internal.HashedWeakRef<*>");
                }
                h((g) referenceRemove);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    @Override // kotlin.collections.e, java.util.AbstractMap, java.util.Map
    @dl.e
    public V put(@dl.d K key, @dl.d V value) {
        V vJ = (V) a.g((a) this.core, key, value, null, 4, null);
        if (vJ == kotlinx.coroutines.debug.internal.b.f129158c) {
            vJ = j(key, value);
        }
        if (vJ == null) {
            f129092c.incrementAndGet(this);
        }
        return vJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    @dl.e
    public V remove(@dl.e Object key) {
        if (key == 0) {
            return null;
        }
        V vJ = (V) a.g((a) this.core, key, null, null, 4, null);
        if (vJ == kotlinx.coroutines.debug.internal.b.f129158c) {
            vJ = j(key, null);
        }
        if (vJ != null) {
            f129092c.decrementAndGet(this);
        }
        return vJ;
    }
}
