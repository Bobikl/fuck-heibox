package androidx.paging.multicast;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.t0;
import kotlinx.coroutines.channels.b0;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.y;
import yh.p;

/* JADX INFO: compiled from: ChannelManager.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003&\r\u0011B`\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0018\u0012\"\u0010#\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\"\u0012\u0006\u0012\u0004\u0018\u00010\u00020!\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0018\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001eø\u0001\u0000¢\u0006\u0004\b$\u0010%J'\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\t\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\bJ\u0013\u0010\n\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u001e\u0010\u000f\u001a\f0\fR\b\u0012\u0004\u0012\u00028\u00000\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"Landroidx/paging/multicast/ChannelManager;", androidx.exifinterface.media.a.f23244d5, "", "Lkotlinx/coroutines/channels/b0;", "Landroidx/paging/multicast/ChannelManager$b$b$c;", "channel", "Lkotlin/b2;", "g", "(Lkotlinx/coroutines/channels/b0;Lkotlin/coroutines/c;)Ljava/lang/Object;", "i", RXScreenCaptureService.KEY_HEIGHT, "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/paging/multicast/ChannelManager$Actor;", ak.av, "Landroidx/paging/multicast/ChannelManager$Actor;", "actor", "Lkotlinx/coroutines/q0;", "b", "Lkotlinx/coroutines/q0;", "scope", "", ak.aF, "I", "bufferSize", "", "d", "Z", "piggybackingDownstream", "f", "keepUpstreamAlive", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/e;", "upstream", "Lkotlin/Function2;", "Lkotlin/coroutines/c;", "onEach", "<init>", "(Lkotlinx/coroutines/q0;IZLyh/p;ZLkotlinx/coroutines/flow/e;)V", "Actor", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class ChannelManager<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ChannelManager<T>.Actor actor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q0 scope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int bufferSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean piggybackingDownstream;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p<T, kotlin.coroutines.c<? super b2>, Object> f26474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean keepUpstreamAlive;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final e<T> upstream;

    /* JADX INFO: compiled from: ChannelManager.kt */
    @Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001B\u0007¢\u0006\u0004\b+\u0010,J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002J\u0018\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H\u0002J\u0016\u0010\n\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0002J!\u0010\f\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0006H\u0016J!\u0010\u0010\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0014\u001a\u00020\u00062\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u0012H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u00020\u00062\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010#R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010&R \u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00190(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010)\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"Landroidx/paging/multicast/ChannelManager$Actor;", "Landroidx/paging/multicast/StoreRealActor;", "Landroidx/paging/multicast/ChannelManager$b;", "Landroidx/paging/multicast/SharedFlowProducer;", "p", "producer", "Lkotlin/b2;", "m", "Landroidx/paging/multicast/ChannelManager$b$b$a;", "msg", "k", RXScreenCaptureService.KEY_HEIGHT, "o", "(Landroidx/paging/multicast/ChannelManager$b;Lkotlin/coroutines/c;)Ljava/lang/Object;", "f", "Landroidx/paging/multicast/ChannelManager$b$b$c;", "l", "(Landroidx/paging/multicast/ChannelManager$b$b$c;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/b0;", "channel", "n", "(Lkotlinx/coroutines/channels/b0;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/paging/multicast/ChannelManager$b$a;", "j", "(Landroidx/paging/multicast/ChannelManager$b$a;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/paging/multicast/ChannelManager$a;", "entry", "i", "(Landroidx/paging/multicast/ChannelManager$a;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/paging/multicast/a;", "Landroidx/paging/multicast/a;", "buffer", "g", "Landroidx/paging/multicast/SharedFlowProducer;", "", "Z", "dispatchedValue", "Lkotlinx/coroutines/y;", "Lkotlinx/coroutines/y;", "lastDeliveryAck", "", "Ljava/util/List;", com.max.xiaoheihe.module.bbs.utils.b.f83401f, "<init>", "(Landroidx/paging/multicast/ChannelManager;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
    public final class Actor extends StoreRealActor<b<T>> {

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final a<T> buffer;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private SharedFlowProducer<T> producer;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private boolean dispatchedValue;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private y<b2> lastDeliveryAck;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final List<ChannelEntry<T>> channels;

        public Actor() {
            super(ChannelManager.this.scope);
            this.buffer = c.a(ChannelManager.this.bufferSize);
            this.channels = new ArrayList();
        }

        private final void h() {
            if (this.producer == null) {
                SharedFlowProducer<T> sharedFlowProducerP = p();
                this.producer = sharedFlowProducerP;
                this.dispatchedValue = false;
                f0.m(sharedFlowProducerP);
                sharedFlowProducerP.f();
            }
        }

        private final void k(b.AbstractC0200b.a<T> aVar) {
            this.dispatchedValue = true;
            Iterator<T> it = this.channels.iterator();
            while (it.hasNext()) {
                ((ChannelEntry) it.next()).f(aVar.getError());
            }
        }

        private final void m(SharedFlowProducer<T> sharedFlowProducer) {
            if (this.producer != sharedFlowProducer) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = this.channels.iterator();
            while (it.hasNext()) {
                ChannelEntry channelEntry = (ChannelEntry) it.next();
                if (channelEntry.h()) {
                    if (ChannelManager.this.piggybackingDownstream) {
                        arrayList.add(channelEntry);
                    } else {
                        channelEntry.a();
                    }
                } else if (this.dispatchedValue) {
                    arrayList2.add(channelEntry);
                } else if (ChannelManager.this.piggybackingDownstream) {
                    arrayList.add(channelEntry);
                } else {
                    channelEntry.a();
                }
            }
            this.channels.clear();
            this.channels.addAll(arrayList2);
            this.channels.addAll(arrayList);
            this.producer = null;
            if (!arrayList2.isEmpty()) {
                h();
            }
        }

        private final SharedFlowProducer<T> p() {
            return new SharedFlowProducer<>(ChannelManager.this.scope, ChannelManager.this.upstream, new ChannelManager$Actor$newProducer$1(this));
        }

        @Override // androidx.paging.multicast.StoreRealActor
        public void f() {
            Iterator<T> it = this.channels.iterator();
            while (it.hasNext()) {
                ((ChannelEntry) it.next()).a();
            }
            this.channels.clear();
            SharedFlowProducer<T> sharedFlowProducer = this.producer;
            if (sharedFlowProducer != null) {
                sharedFlowProducer.d();
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        final /* synthetic */ Object i(ChannelEntry<T> channelEntry, kotlin.coroutines.c<? super b2> cVar) throws Throwable {
            ChannelManager$Actor$addEntry$1 channelManager$Actor$addEntry$1;
            boolean z10;
            ChannelEntry channelEntry2;
            Iterator<T> it;
            if (cVar instanceof ChannelManager$Actor$addEntry$1) {
                channelManager$Actor$addEntry$1 = (ChannelManager$Actor$addEntry$1) cVar;
                int i10 = channelManager$Actor$addEntry$1.f26484c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    channelManager$Actor$addEntry$1.f26484c = i10 - Integer.MIN_VALUE;
                } else {
                    channelManager$Actor$addEntry$1 = new ChannelManager$Actor$addEntry$1(this, cVar);
                }
            } else {
                channelManager$Actor$addEntry$1 = new ChannelManager$Actor$addEntry$1(this, cVar);
            }
            Object obj = channelManager$Actor$addEntry$1.f26483b;
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i11 = channelManager$Actor$addEntry$1.f26484c;
            if (i11 == 0) {
                t0.n(obj);
                List<ChannelEntry<T>> list = this.channels;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z10 = true;
                            break;
                        }
                        if (kotlin.coroutines.jvm.internal.a.a(((ChannelEntry) it2.next()).i(channelEntry)).booleanValue()) {
                            z10 = false;
                            break;
                        }
                    }
                } else {
                    z10 = true;
                    break;
                }
                if (!z10) {
                    throw new IllegalStateException((channelEntry + " is already in the list.").toString());
                }
                if (!(!channelEntry.h())) {
                    throw new IllegalStateException((channelEntry + " already received a value").toString());
                }
                this.channels.add(channelEntry);
                if (!this.buffer.a().isEmpty()) {
                    channelEntry2 = channelEntry;
                    it = this.buffer.a().iterator();
                } else {
                    y<b2> yVar = this.lastDeliveryAck;
                    if (yVar != null) {
                        kotlin.coroutines.jvm.internal.a.a(yVar.A(b2.f124493a));
                    }
                }
                return b2.f124493a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) channelManager$Actor$addEntry$1.f26487f;
            ChannelEntry channelEntry3 = (ChannelEntry) channelManager$Actor$addEntry$1.f26486e;
            t0.n(obj);
            channelEntry2 = channelEntry3;
            while (it.hasNext()) {
                b.AbstractC0200b.c<T> cVar2 = (b.AbstractC0200b.c) it.next();
                channelManager$Actor$addEntry$1.f26486e = channelEntry2;
                channelManager$Actor$addEntry$1.f26487f = it;
                channelManager$Actor$addEntry$1.f26484c = 1;
                if (channelEntry2.g(cVar2, channelManager$Actor$addEntry$1) == objH) {
                    return objH;
                }
            }
            return b2.f124493a;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        final /* synthetic */ Object j(b.a<T> aVar, kotlin.coroutines.c<? super b2> cVar) throws Throwable {
            ChannelManager$Actor$doAdd$1 channelManager$Actor$doAdd$1;
            Actor actor;
            if (cVar instanceof ChannelManager$Actor$doAdd$1) {
                channelManager$Actor$doAdd$1 = (ChannelManager$Actor$doAdd$1) cVar;
                int i10 = channelManager$Actor$doAdd$1.f26489c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    channelManager$Actor$doAdd$1.f26489c = i10 - Integer.MIN_VALUE;
                } else {
                    channelManager$Actor$doAdd$1 = new ChannelManager$Actor$doAdd$1(this, cVar);
                }
            } else {
                channelManager$Actor$doAdd$1 = new ChannelManager$Actor$doAdd$1(this, cVar);
            }
            Object obj = channelManager$Actor$doAdd$1.f26488b;
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i11 = channelManager$Actor$doAdd$1.f26489c;
            if (i11 == 0) {
                t0.n(obj);
                ChannelEntry<T> channelEntry = new ChannelEntry<>(aVar.a(), false, 2, null);
                channelManager$Actor$doAdd$1.f26491e = this;
                channelManager$Actor$doAdd$1.f26489c = 1;
                if (i(channelEntry, channelManager$Actor$doAdd$1) == objH) {
                    return objH;
                }
                actor = this;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                actor = (Actor) channelManager$Actor$doAdd$1.f26491e;
                t0.n(obj);
            }
            actor.h();
            return b2.f124493a;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0086  */
        /* JADX WARN: Code duplicated, block: B:32:0x0098 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:34:? A[LOOP:0: B:24:0x0080->B:34:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        final /* synthetic */ Object l(b.AbstractC0200b.c<T> cVar, kotlin.coroutines.c<? super b2> cVar2) throws Throwable {
            ChannelManager$Actor$doDispatchValue$1 channelManager$Actor$doDispatchValue$1;
            Actor actor;
            b.AbstractC0200b.c<T> cVar3;
            Iterator<T> it;
            ChannelEntry channelEntry;
            if (cVar2 instanceof ChannelManager$Actor$doDispatchValue$1) {
                channelManager$Actor$doDispatchValue$1 = (ChannelManager$Actor$doDispatchValue$1) cVar2;
                int i10 = channelManager$Actor$doDispatchValue$1.f26493c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    channelManager$Actor$doDispatchValue$1.f26493c = i10 - Integer.MIN_VALUE;
                } else {
                    channelManager$Actor$doDispatchValue$1 = new ChannelManager$Actor$doDispatchValue$1(this, cVar2);
                }
            } else {
                channelManager$Actor$doDispatchValue$1 = new ChannelManager$Actor$doDispatchValue$1(this, cVar2);
            }
            Object obj = channelManager$Actor$doDispatchValue$1.f26492b;
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i11 = channelManager$Actor$doDispatchValue$1.f26493c;
            if (i11 != 0) {
                if (i11 == 1) {
                    cVar = (b.AbstractC0200b.c) channelManager$Actor$doDispatchValue$1.f26496f;
                    actor = (Actor) channelManager$Actor$doDispatchValue$1.f26495e;
                    t0.n(obj);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) channelManager$Actor$doDispatchValue$1.f26496f;
                    cVar3 = (b.AbstractC0200b.c) channelManager$Actor$doDispatchValue$1.f26495e;
                    t0.n(obj);
                }
                while (it.hasNext()) {
                    channelEntry = (ChannelEntry) it.next();
                    channelManager$Actor$doDispatchValue$1.f26495e = cVar3;
                    channelManager$Actor$doDispatchValue$1.f26496f = it;
                    channelManager$Actor$doDispatchValue$1.f26493c = 2;
                    if (channelEntry.g(cVar3, channelManager$Actor$doDispatchValue$1) == objH) {
                        return objH;
                    }
                }
                return b2.f124493a;
            }
            t0.n(obj);
            p pVar = ChannelManager.this.f26474e;
            T tB = cVar.b();
            channelManager$Actor$doDispatchValue$1.f26495e = this;
            channelManager$Actor$doDispatchValue$1.f26496f = cVar;
            channelManager$Actor$doDispatchValue$1.f26493c = 1;
            if (pVar.invoke(tB, channelManager$Actor$doDispatchValue$1) == objH) {
                return objH;
            }
            actor = this;
            actor.buffer.b(cVar);
            actor.dispatchedValue = true;
            if (actor.buffer.isEmpty()) {
                actor.lastDeliveryAck = cVar.a();
            }
            Iterator<T> it2 = actor.channels.iterator();
            cVar3 = cVar;
            it = it2;
            while (it.hasNext()) {
                channelEntry = (ChannelEntry) it.next();
                channelManager$Actor$doDispatchValue$1.f26495e = cVar3;
                channelManager$Actor$doDispatchValue$1.f26496f = it;
                channelManager$Actor$doDispatchValue$1.f26493c = 2;
                if (channelEntry.g(cVar3, channelManager$Actor$doDispatchValue$1) == objH) {
                    return objH;
                }
            }
            return b2.f124493a;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        final /* synthetic */ Object n(b0<? super b.AbstractC0200b.c<T>> b0Var, kotlin.coroutines.c<? super b2> cVar) throws Throwable {
            ChannelManager$Actor$doRemove$1 channelManager$Actor$doRemove$1;
            SharedFlowProducer<T> sharedFlowProducer;
            if (cVar instanceof ChannelManager$Actor$doRemove$1) {
                channelManager$Actor$doRemove$1 = (ChannelManager$Actor$doRemove$1) cVar;
                int i10 = channelManager$Actor$doRemove$1.f26498c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    channelManager$Actor$doRemove$1.f26498c = i10 - Integer.MIN_VALUE;
                } else {
                    channelManager$Actor$doRemove$1 = new ChannelManager$Actor$doRemove$1(this, cVar);
                }
            } else {
                channelManager$Actor$doRemove$1 = new ChannelManager$Actor$doRemove$1(this, cVar);
            }
            Object obj = channelManager$Actor$doRemove$1.f26497b;
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i11 = channelManager$Actor$doRemove$1.f26498c;
            if (i11 == 0) {
                t0.n(obj);
                int i12 = 0;
                Iterator<ChannelEntry<T>> it = this.channels.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i12 = -1;
                        break;
                    }
                    if (kotlin.coroutines.jvm.internal.a.a(it.next().j(b0Var)).booleanValue()) {
                        break;
                    }
                    i12++;
                }
                if (i12 >= 0) {
                    this.channels.remove(i12);
                    if (this.channels.isEmpty() && !ChannelManager.this.keepUpstreamAlive && (sharedFlowProducer = this.producer) != null) {
                        channelManager$Actor$doRemove$1.f26498c = 1;
                        if (sharedFlowProducer.e(channelManager$Actor$doRemove$1) == objH) {
                            return objH;
                        }
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            return b2.f124493a;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // androidx.paging.multicast.StoreRealActor
        @dl.e
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public Object e(@dl.d b<T> bVar, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
            ChannelManager$Actor$handle$1 channelManager$Actor$handle$1;
            if (cVar instanceof ChannelManager$Actor$handle$1) {
                channelManager$Actor$handle$1 = (ChannelManager$Actor$handle$1) cVar;
                int i10 = channelManager$Actor$handle$1.f26501c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    channelManager$Actor$handle$1.f26501c = i10 - Integer.MIN_VALUE;
                } else {
                    channelManager$Actor$handle$1 = new ChannelManager$Actor$handle$1(this, cVar);
                }
            } else {
                channelManager$Actor$handle$1 = new ChannelManager$Actor$handle$1(this, cVar);
            }
            Object obj = channelManager$Actor$handle$1.f26500b;
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i11 = channelManager$Actor$handle$1.f26501c;
            if (i11 == 0) {
                t0.n(obj);
                if (bVar instanceof b.a) {
                    channelManager$Actor$handle$1.f26501c = 1;
                    if (j((b.a) bVar, channelManager$Actor$handle$1) == objH) {
                        return objH;
                    }
                } else if (bVar instanceof b.c) {
                    b0<b.AbstractC0200b.c<T>> b0VarA = ((b.c) bVar).a();
                    channelManager$Actor$handle$1.f26501c = 2;
                    if (n(b0VarA, channelManager$Actor$handle$1) == objH) {
                        return objH;
                    }
                } else if (bVar instanceof b.AbstractC0200b.c) {
                    channelManager$Actor$handle$1.f26501c = 3;
                    if (l((b.AbstractC0200b.c) bVar, channelManager$Actor$handle$1) == objH) {
                        return objH;
                    }
                } else if (bVar instanceof b.AbstractC0200b.a) {
                    k((b.AbstractC0200b.a) bVar);
                } else if (bVar instanceof b.AbstractC0200b.C0201b) {
                    m(((b.AbstractC0200b.C0201b) bVar).a());
                }
            } else {
                if (i11 != 1 && i11 != 2 && i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            return b2.f124493a;
        }
    }

    /* JADX INFO: renamed from: androidx.paging.multicast.ChannelManager$a, reason: from toString */
    /* JADX INFO: compiled from: ChannelManager.kt */
    @Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B%\u0012\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"J\u0015\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003HÂ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÂ\u0003J!\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\tJ\u001a\u0010\u0011\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003J\u0014\u0010\u0013\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000J/\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0018HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÖ\u0003R \u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\u0016\u0010\u0014\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0011\u0010 \u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Landroidx/paging/multicast/ChannelManager$a;", androidx.exifinterface.media.a.f23244d5, "", "Lkotlinx/coroutines/channels/b0;", "Landroidx/paging/multicast/ChannelManager$b$b$c;", "b", "", ak.aF, "value", "Lkotlin/b2;", "g", "(Landroidx/paging/multicast/ChannelManager$b$b$c;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "error", "f", ak.av, "channel", "j", "entry", "i", "_receivedValue", "d", "", "toString", "", "hashCode", "other", "equals", "Lkotlinx/coroutines/channels/b0;", "Z", RXScreenCaptureService.KEY_HEIGHT, "()Z", "receivedValue", "<init>", "(Lkotlinx/coroutines/channels/b0;Z)V", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final /* data */ class ChannelEntry<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0<b.AbstractC0200b.c<T>> channel;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private boolean _receivedValue;

        /* JADX WARN: Multi-variable type inference failed */
        public ChannelEntry(@dl.d b0<? super b.AbstractC0200b.c<T>> channel, boolean z10) {
            f0.p(channel, "channel");
            this.channel = channel;
            this._receivedValue = z10;
        }

        public /* synthetic */ ChannelEntry(b0 b0Var, boolean z10, int i10, u uVar) {
            this(b0Var, (i10 & 2) != 0 ? false : z10);
        }

        private final b0<b.AbstractC0200b.c<T>> b() {
            return this.channel;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        private final boolean get_receivedValue() {
            return this._receivedValue;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ChannelEntry e(ChannelEntry channelEntry, b0 b0Var, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                b0Var = channelEntry.channel;
            }
            if ((i10 & 2) != 0) {
                z10 = channelEntry._receivedValue;
            }
            return channelEntry.d(b0Var, z10);
        }

        public final void a() {
            b0.a.a(this.channel, null, 1, null);
        }

        @dl.d
        public final ChannelEntry<T> d(@dl.d b0<? super b.AbstractC0200b.c<T>> channel, boolean _receivedValue) {
            f0.p(channel, "channel");
            return new ChannelEntry<>(channel, _receivedValue);
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChannelEntry)) {
                return false;
            }
            ChannelEntry channelEntry = (ChannelEntry) other;
            return f0.g(this.channel, channelEntry.channel) && this._receivedValue == channelEntry._receivedValue;
        }

        public final void f(@dl.d Throwable error) {
            f0.p(error, "error");
            this._receivedValue = true;
            this.channel.U(error);
        }

        @dl.e
        public final Object g(@dl.d b.AbstractC0200b.c<T> cVar, @dl.d kotlin.coroutines.c<? super b2> cVar2) {
            this._receivedValue = true;
            Object objX = this.channel.X(cVar, cVar2);
            return objX == kotlin.coroutines.intrinsics.b.h() ? objX : b2.f124493a;
        }

        public final boolean h() {
            return this._receivedValue;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        public int hashCode() {
            b0<b.AbstractC0200b.c<T>> b0Var = this.channel;
            int iHashCode = (b0Var != null ? b0Var.hashCode() : 0) * 31;
            boolean z10 = this._receivedValue;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return iHashCode + r10;
        }

        public final boolean i(@dl.d ChannelEntry<T> entry) {
            f0.p(entry, "entry");
            return this.channel == entry.channel;
        }

        public final boolean j(@dl.d b0<? super b.AbstractC0200b.c<T>> channel) {
            f0.p(channel, "channel");
            return this.channel == channel;
        }

        @dl.d
        public String toString() {
            return "ChannelEntry(channel=" + this.channel + ", _receivedValue=" + this._receivedValue + ")";
        }
    }

    /* JADX INFO: compiled from: ChannelManager.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Landroidx/paging/multicast/ChannelManager$b;", androidx.exifinterface.media.a.f23244d5, "", "<init>", "()V", ak.av, "b", ak.aF, "Landroidx/paging/multicast/ChannelManager$b$a;", "Landroidx/paging/multicast/ChannelManager$b$c;", "Landroidx/paging/multicast/ChannelManager$b$b;", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static abstract class b<T> {

        /* JADX INFO: compiled from: ChannelManager.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u001b\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00040\u0003¢\u0006\u0004\b\t\u0010\nR#\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Landroidx/paging/multicast/ChannelManager$b$a;", androidx.exifinterface.media.a.f23244d5, "Landroidx/paging/multicast/ChannelManager$b;", "Lkotlinx/coroutines/channels/b0;", "Landroidx/paging/multicast/ChannelManager$b$b$c;", ak.av, "Lkotlinx/coroutines/channels/b0;", "()Lkotlinx/coroutines/channels/b0;", "channel", "<init>", "(Lkotlinx/coroutines/channels/b0;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
        public static final class a<T> extends b<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @dl.d
            private final b0<AbstractC0200b.c<T>> channel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(@dl.d b0<? super AbstractC0200b.c<T>> channel) {
                super(null);
                f0.p(channel, "channel");
                this.channel = channel;
            }

            @dl.d
            public final b0<AbstractC0200b.c<T>> a() {
                return this.channel;
            }
        }

        /* JADX INFO: renamed from: androidx.paging.multicast.ChannelManager$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ChannelManager.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002:\u0003\u0005\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Landroidx/paging/multicast/ChannelManager$b$b;", androidx.exifinterface.media.a.f23244d5, "Landroidx/paging/multicast/ChannelManager$b;", "<init>", "()V", ak.av, "b", ak.aF, "Landroidx/paging/multicast/ChannelManager$b$b$c;", "Landroidx/paging/multicast/ChannelManager$b$b$a;", "Landroidx/paging/multicast/ChannelManager$b$b$b;", "paging-common"}, k = 1, mv = {1, 4, 2})
        public static abstract class AbstractC0200b<T> extends b<T> {

            /* JADX INFO: renamed from: androidx.paging.multicast.ChannelManager$b$b$a */
            /* JADX INFO: compiled from: ChannelManager.kt */
            @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0003\u0010\u00012\b\u0012\u0004\u0012\u00028\u00030\u0002B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/paging/multicast/ChannelManager$b$b$a;", androidx.exifinterface.media.a.f23244d5, "Landroidx/paging/multicast/ChannelManager$b$b;", "", ak.av, "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "error", "<init>", "(Ljava/lang/Throwable;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
            public static final class a<T> extends AbstractC0200b<T> {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                @dl.d
                private final Throwable error;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(@dl.d Throwable error) {
                    super(null);
                    f0.p(error, "error");
                    this.error = error;
                }

                @dl.d
                /* JADX INFO: renamed from: a, reason: from getter */
                public final Throwable getError() {
                    return this.error;
                }
            }

            /* JADX INFO: renamed from: androidx.paging.multicast.ChannelManager$b$b$b, reason: collision with other inner class name */
            /* JADX INFO: compiled from: ChannelManager.kt */
            @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0003\u0010\u00012\b\u0012\u0004\u0012\u00028\u00030\u0002B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00030\u0003¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00030\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/paging/multicast/ChannelManager$b$b$b;", androidx.exifinterface.media.a.f23244d5, "Landroidx/paging/multicast/ChannelManager$b$b;", "Landroidx/paging/multicast/SharedFlowProducer;", ak.av, "Landroidx/paging/multicast/SharedFlowProducer;", "()Landroidx/paging/multicast/SharedFlowProducer;", "producer", "<init>", "(Landroidx/paging/multicast/SharedFlowProducer;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
            public static final class C0201b<T> extends AbstractC0200b<T> {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                @dl.d
                private final SharedFlowProducer<T> producer;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0201b(@dl.d SharedFlowProducer<T> producer) {
                    super(null);
                    f0.p(producer, "producer");
                    this.producer = producer;
                }

                @dl.d
                public final SharedFlowProducer<T> a() {
                    return this.producer;
                }
            }

            /* JADX INFO: renamed from: androidx.paging.multicast.ChannelManager$b$b$c */
            /* JADX INFO: compiled from: ChannelManager.kt */
            @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0003\u0010\u00012\b\u0012\u0004\u0012\u00028\u00030\u0002B\u001d\u0012\u0006\u0010\u0007\u001a\u00028\u0003\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\u00028\u00038\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u0003\u0010\u000b¨\u0006\u000f"}, d2 = {"Landroidx/paging/multicast/ChannelManager$b$b$c;", androidx.exifinterface.media.a.f23244d5, "Landroidx/paging/multicast/ChannelManager$b$b;", ak.av, "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "value", "Lkotlinx/coroutines/y;", "Lkotlin/b2;", "Lkotlinx/coroutines/y;", "()Lkotlinx/coroutines/y;", "delivered", "<init>", "(Ljava/lang/Object;Lkotlinx/coroutines/y;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
            public static final class c<T> extends AbstractC0200b<T> {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final T value;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                @dl.d
                private final y<b2> delivered;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(T t10, @dl.d y<b2> delivered) {
                    super(null);
                    f0.p(delivered, "delivered");
                    this.value = t10;
                    this.delivered = delivered;
                }

                @dl.d
                public final y<b2> a() {
                    return this.delivered;
                }

                public final T b() {
                    return this.value;
                }
            }

            private AbstractC0200b() {
                super(null);
            }

            public /* synthetic */ AbstractC0200b(u uVar) {
                this();
            }
        }

        /* JADX INFO: compiled from: ChannelManager.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u001b\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00040\u0003¢\u0006\u0004\b\t\u0010\nR#\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Landroidx/paging/multicast/ChannelManager$b$c;", androidx.exifinterface.media.a.f23244d5, "Landroidx/paging/multicast/ChannelManager$b;", "Lkotlinx/coroutines/channels/b0;", "Landroidx/paging/multicast/ChannelManager$b$b$c;", ak.av, "Lkotlinx/coroutines/channels/b0;", "()Lkotlinx/coroutines/channels/b0;", "channel", "<init>", "(Lkotlinx/coroutines/channels/b0;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
        public static final class c<T> extends b<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @dl.d
            private final b0<AbstractC0200b.c<T>> channel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(@dl.d b0<? super AbstractC0200b.c<T>> channel) {
                super(null);
                f0.p(channel, "channel");
                this.channel = channel;
            }

            @dl.d
            public final b0<AbstractC0200b.c<T>> a() {
                return this.channel;
            }
        }

        private b() {
        }

        public /* synthetic */ b(u uVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelManager(@dl.d q0 scope, int i10, boolean z10, @dl.d p<? super T, ? super kotlin.coroutines.c<? super b2>, ? extends Object> onEach, boolean z11, @dl.d e<? extends T> upstream) {
        f0.p(scope, "scope");
        f0.p(onEach, "onEach");
        f0.p(upstream, "upstream");
        this.scope = scope;
        this.bufferSize = i10;
        this.piggybackingDownstream = z10;
        this.f26474e = onEach;
        this.keepUpstreamAlive = z11;
        this.upstream = upstream;
        this.actor = new Actor();
    }

    public /* synthetic */ ChannelManager(q0 q0Var, int i10, boolean z10, p pVar, boolean z11, e eVar, int i11, u uVar) {
        this(q0Var, i10, (i11 & 4) != 0 ? false : z10, pVar, (i11 & 16) != 0 ? false : z11, eVar);
    }

    @dl.e
    public final Object g(@dl.d b0<? super b.AbstractC0200b.c<T>> b0Var, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objG = this.actor.g((T) new b.a(b0Var), cVar);
        return objG == kotlin.coroutines.intrinsics.b.h() ? objG : b2.f124493a;
    }

    @dl.e
    public final Object h(@dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        Object objC = this.actor.c(cVar);
        return objC == kotlin.coroutines.intrinsics.b.h() ? objC : b2.f124493a;
    }

    @dl.e
    public final Object i(@dl.d b0<? super b.AbstractC0200b.c<T>> b0Var, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objG = this.actor.g((T) new b.c(b0Var), cVar);
        return objG == kotlin.coroutines.intrinsics.b.h() ? objG : b2.f124493a;
    }
}
