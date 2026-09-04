package kotlinx.coroutines.flow;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.DeprecationLevel;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.s0;

/* JADX INFO: compiled from: Migration.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0082\u0001\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0000\u001a&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u001a&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u001a&\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u001a,\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u001a,\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u001a\u0018\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u001aF\u0010\u0012\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001aj\u0010\u0016\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000e2\"\u0010\u0015\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001aX\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00032(\u0010\u0019\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a>\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u001cH\u0007\u001a$\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0003H\u0007\u001a$\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0003H\u0007\u001aI\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00032#\u0010!\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u001c¢\u0006\u0002\b H\u0007\u001a&\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010$\u001a\u00020#H\u0007\u001aU\u0010*\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u000321\u0010)\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010\u0013\u001a\u0080\u0001\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010+\u001a\u00028\u00012H\b\u0001\u0010.\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(-\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100,H\u0007ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001a-\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\t\u001a\u00028\u0000H\u0007¢\u0006\u0004\b1\u00102\u001aC\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\t\u001a\u00028\u00002\u0014\b\u0002\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u0002030\u001cH\u0007¢\u0006\u0004\b5\u00106\u001a-\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010(\u001a\u00028\u0000H\u0007¢\u0006\u0004\b7\u00102\u001a,\u00109\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u001a-\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010(\u001a\u00028\u0000H\u0007¢\u0006\u0004\b:\u00102\u001a,\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u001al\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010<\"\u0004\b\u0001\u0010=\"\u0004\b\u0002\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032(\u0010>\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100,H\u0007ø\u0001\u0000¢\u0006\u0004\b?\u0010@\u001a\u0086\u0001\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00030\u0003\"\u0004\b\u0000\u0010<\"\u0004\b\u0001\u0010=\"\u0004\b\u0002\u0010A\"\u0004\b\u0003\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032.\u0010>\u001a*\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100CH\u0007ø\u0001\u0000¢\u0006\u0004\bD\u0010E\u001a \u0001\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00040\u0003\"\u0004\b\u0000\u0010<\"\u0004\b\u0001\u0010=\"\u0004\b\u0002\u0010A\"\u0004\b\u0003\u0010F\"\u0004\b\u0004\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00030\u000324\u0010>\u001a0\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100HH\u0007ø\u0001\u0000¢\u0006\u0004\bI\u0010J\u001aº\u0001\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00050\u0003\"\u0004\b\u0000\u0010<\"\u0004\b\u0001\u0010=\"\u0004\b\u0002\u0010A\"\u0004\b\u0003\u0010F\"\u0004\b\u0004\u0010K\"\u0004\b\u0005\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00030\u00032\f\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00040\u00032:\u0010>\u001a6\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00050\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100MH\u0007ø\u0001\u0000¢\u0006\u0004\bN\u0010O\u001a&\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010Q\u001a\u00020PH\u0007\u001a&\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010Q\u001a\u00020PH\u0007\u001ag\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u000327\u0010>\u001a3\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\bT\u0010\u001b\u001ap\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032F\u0010.\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(-\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100,H\u0007ø\u0001\u0000¢\u0006\u0004\bU\u0010V\u001a\u001e\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u001a&\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010X\u001a\u00020#H\u0007\u001a\u001e\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u001a&\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010X\u001a\u00020#H\u0007\u001a\u001e\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006]"}, d2 = {"", "p", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/e;", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "q", "y", "J", "fallback", "r", ak.aB, "Lkotlin/b2;", "G", "Lkotlin/Function2;", "Lkotlin/coroutines/c;", "", "onEach", "H", "(Lkotlinx/coroutines/flow/e;Lyh/p;)V", "", "onError", "I", "(Lkotlinx/coroutines/flow/e;Lyh/p;Lyh/p;)V", "R", "mapper", "l", "(Lkotlinx/coroutines/flow/e;Lyh/p;)Lkotlinx/coroutines/flow/e;", "Lkotlin/Function1;", "g", "o", "m", "Lkotlin/t;", "transformer", "f", "", "count", "D", "Lkotlin/m0;", "name", "value", "action", "n", "initial", "Lkotlin/Function3;", "accumulator", "operation", "B", "(Lkotlinx/coroutines/flow/e;Ljava/lang/Object;Lyh/q;)Lkotlinx/coroutines/flow/e;", "t", "(Lkotlinx/coroutines/flow/e;Ljava/lang/Object;)Lkotlinx/coroutines/flow/e;", "", "predicate", ak.aG, "(Lkotlinx/coroutines/flow/e;Ljava/lang/Object;Lyh/l;)Lkotlinx/coroutines/flow/e;", androidx.exifinterface.media.a.S4, "other", "F", RXScreenCaptureService.KEY_HEIGHT, "i", "T1", "T2", "transform", "e", "(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lyh/q;)Lkotlinx/coroutines/flow/e;", "T3", "other2", "Lkotlin/Function4;", "d", "(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lyh/r;)Lkotlinx/coroutines/flow/e;", "T4", "other3", "Lkotlin/Function5;", ak.aF, "(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lyh/s;)Lkotlinx/coroutines/flow/e;", "T5", "other4", "Lkotlin/Function6;", "b", "(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lyh/t;)Lkotlinx/coroutines/flow/e;", "", "timeMillis", "k", "j", "K", "C", "(Lkotlinx/coroutines/flow/e;Lyh/q;)Lkotlinx/coroutines/flow/e;", RXScreenCaptureService.KEY_WIDTH, "bufferSize", "x", ak.aD, androidx.exifinterface.media.a.W4, ak.av, "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class FlowKt__MigrationKt {
    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'replay(bufferSize)' is 'shareIn' with the specified replay parameter. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @s0(expression = "this.shareIn(scope, bufferSize)", imports = {}))
    public static final <T> e<T> A(@dl.d e<? extends T> eVar, int i10) {
        g.b1();
        throw new KotlinNothingValueException();
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow has less verbose 'scan' shortcut", replaceWith = @s0(expression = "scan(initial, operation)", imports = {}))
    public static final <T, R> e<R> B(@dl.d e<? extends T> eVar, R r10, @kotlin.b @dl.d yh.q<? super R, ? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar) {
        g.b1();
        throw new KotlinNothingValueException();
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "'scanReduce' was renamed to 'runningReduce' to be consistent with Kotlin standard library", replaceWith = @s0(expression = "runningReduce(operation)", imports = {}))
    public static final <T> e<T> C(@dl.d e<? extends T> eVar, @dl.d yh.q<? super T, ? super T, ? super kotlin.coroutines.c<? super T>, ? extends Object> qVar) {
        return g.z1(eVar, qVar);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'skip' is 'drop'", replaceWith = @s0(expression = "drop(count)", imports = {}))
    public static final <T> e<T> D(@dl.d e<? extends T> eVar, int i10) {
        g.b1();
        throw new KotlinNothingValueException();
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emit(value) }'", replaceWith = @s0(expression = "onStart { emit(value) }", imports = {}))
    public static final <T> e<T> E(@dl.d e<? extends T> eVar, T t10) {
        g.b1();
        throw new KotlinNothingValueException();
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emitAll(other) }'", replaceWith = @s0(expression = "onStart { emitAll(other) }", imports = {}))
    public static final <T> e<T> F(@dl.d e<? extends T> eVar, @dl.d e<? extends T> eVar2) {
        g.b1();
        throw new KotlinNothingValueException();
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void G(@dl.d e<? extends T> eVar) {
        g.b1();
        throw new KotlinNothingValueException();
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void H(@dl.d e<? extends T> eVar, @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar) {
        g.b1();
        throw new KotlinNothingValueException();
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void I(@dl.d e<? extends T> eVar, @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar, @dl.d yh.p<? super Throwable, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar2) {
        g.b1();
        throw new KotlinNothingValueException();
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Use 'flowOn' instead")
    public static final <T> e<T> J(@dl.d e<? extends T> eVar, @dl.d CoroutineContext coroutineContext) {
        g.b1();
        throw new KotlinNothingValueException();
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogues of 'switchMap' are 'transformLatest', 'flatMapLatest' and 'mapLatest'", replaceWith = @s0(expression = "this.flatMapLatest(transform)", imports = {}))
    public static final <T, R> e<R> K(@dl.d e<? extends T> eVar, @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super e<? extends R>>, ? extends Object> pVar) {
        return g.b2(eVar, new FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1(pVar, null));
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'cache()' is 'shareIn' with unlimited replay and 'started = SharingStared.Lazily' argument'", replaceWith = @s0(expression = "this.shareIn(scope, Int.MAX_VALUE, started = SharingStared.Lazily)", imports = {}))
    public static final <T> e<T> a(@dl.d e<? extends T> eVar) {
        g.b1();
        throw new KotlinNothingValueException();
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @s0(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    public static final <T1, T2, T3, T4, T5, R> e<R> b(@dl.d e<? extends T1> eVar, @dl.d e<? extends T2> eVar2, @dl.d e<? extends T3> eVar3, @dl.d e<? extends T4> eVar4, @dl.d e<? extends T5> eVar5, @dl.d yh.t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.c<? super R>, ? extends Object> tVar) {
        return g.D(eVar, eVar2, eVar3, eVar4, eVar5, tVar);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @s0(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    public static final <T1, T2, T3, T4, R> e<R> c(@dl.d e<? extends T1> eVar, @dl.d e<? extends T2> eVar2, @dl.d e<? extends T3> eVar3, @dl.d e<? extends T4> eVar4, @dl.d yh.s<? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.c<? super R>, ? extends Object> sVar) {
        return g.E(eVar, eVar2, eVar3, eVar4, sVar);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @s0(expression = "combine(this, other, other2, transform)", imports = {}))
    public static final <T1, T2, T3, R> e<R> d(@dl.d e<? extends T1> eVar, @dl.d e<? extends T2> eVar2, @dl.d e<? extends T3> eVar3, @dl.d yh.r<? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.c<? super R>, ? extends Object> rVar) {
        return g.F(eVar, eVar2, eVar3, rVar);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @s0(expression = "this.combine(other, transform)", imports = {}))
    public static final <T1, T2, R> e<R> e(@dl.d e<? extends T1> eVar, @dl.d e<? extends T2> eVar2, @dl.d yh.q<? super T1, ? super T2, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar) {
        return g.G(eVar, eVar2, qVar);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'compose' is 'let'", replaceWith = @s0(expression = "let(transformer)", imports = {}))
    public static final <T, R> e<R> f(@dl.d e<? extends T> eVar, @dl.d yh.l<? super e<? extends T>, ? extends e<? extends R>> lVar) {
        g.b1();
        throw new KotlinNothingValueException();
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'concatMap' is 'flatMapConcat'", replaceWith = @s0(expression = "flatMapConcat(mapper)", imports = {}))
    public static final <T, R> e<R> g(@dl.d e<? extends T> eVar, @dl.d yh.l<? super T, ? extends e<? extends R>> lVar) {
        g.b1();
        throw new KotlinNothingValueException();
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { emit(value) }'", replaceWith = @s0(expression = "onCompletion { emit(value) }", imports = {}))
    public static final <T> e<T> h(@dl.d e<? extends T> eVar, T t10) {
        g.b1();
        throw new KotlinNothingValueException();
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { if (it == null) emitAll(other) }'", replaceWith = @s0(expression = "onCompletion { if (it == null) emitAll(other) }", imports = {}))
    public static final <T> e<T> i(@dl.d e<? extends T> eVar, @dl.d e<? extends T> eVar2) {
        g.b1();
        throw new KotlinNothingValueException();
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Use 'onEach { delay(timeMillis) }'", replaceWith = @s0(expression = "onEach { delay(timeMillis) }", imports = {}))
    public static final <T> e<T> j(@dl.d e<? extends T> eVar, long j10) {
        return g.e1(eVar, new FlowKt__MigrationKt$delayEach$1(j10, null));
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Use 'onStart { delay(timeMillis) }'", replaceWith = @s0(expression = "onStart { delay(timeMillis) }", imports = {}))
    public static final <T> e<T> k(@dl.d e<? extends T> eVar, long j10) {
        return g.l1(eVar, new FlowKt__MigrationKt$delayFlow$1(j10, null));
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue is 'flatMapConcat'", replaceWith = @s0(expression = "flatMapConcat(mapper)", imports = {}))
    public static final <T, R> e<R> l(@dl.d e<? extends T> eVar, @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super e<? extends R>>, ? extends Object> pVar) {
        g.b1();
        throw new KotlinNothingValueException();
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'flatten' is 'flattenConcat'", replaceWith = @s0(expression = "flattenConcat()", imports = {}))
    public static final <T> e<T> m(@dl.d e<? extends e<? extends T>> eVar) {
        g.b1();
        throw new KotlinNothingValueException();
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'forEach' is 'collect'", replaceWith = @s0(expression = "collect(action)", imports = {}))
    public static final <T> void n(@dl.d e<? extends T> eVar, @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar) {
        g.b1();
        throw new KotlinNothingValueException();
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'merge' is 'flattenConcat'", replaceWith = @s0(expression = "flattenConcat()", imports = {}))
    public static final <T> e<T> o(@dl.d e<? extends e<? extends T>> eVar) {
        g.b1();
        throw new KotlinNothingValueException();
    }

    @dl.d
    public static final Void p() {
        throw new UnsupportedOperationException("Not implemented, should not be called");
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Collect flow in the desired context instead")
    public static final <T> e<T> q(@dl.d e<? extends T> eVar, @dl.d CoroutineContext coroutineContext) {
        g.b1();
        throw new KotlinNothingValueException();
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @s0(expression = "catch { emitAll(fallback) }", imports = {}))
    public static final <T> e<T> r(@dl.d e<? extends T> eVar, @dl.d e<? extends T> eVar2) {
        g.b1();
        throw new KotlinNothingValueException();
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @s0(expression = "catch { emitAll(fallback) }", imports = {}))
    public static final <T> e<T> s(@dl.d e<? extends T> eVar, @dl.d e<? extends T> eVar2) {
        g.b1();
        throw new KotlinNothingValueException();
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emit(fallback) }'", replaceWith = @s0(expression = "catch { emit(fallback) }", imports = {}))
    public static final <T> e<T> t(@dl.d e<? extends T> eVar, T t10) {
        g.b1();
        throw new KotlinNothingValueException();
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { e -> if (predicate(e)) emit(fallback) else throw e }'", replaceWith = @s0(expression = "catch { e -> if (predicate(e)) emit(fallback) else throw e }", imports = {}))
    public static final <T> e<T> u(@dl.d e<? extends T> eVar, T t10, @dl.d yh.l<? super Throwable, Boolean> lVar) {
        return g.u(eVar, new FlowKt__MigrationKt$onErrorReturn$2(lVar, t10, null));
    }

    public static /* synthetic */ e v(e eVar, Object obj, yh.l lVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            lVar = new yh.l<Throwable, Boolean>() { // from class: kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$1
                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(@dl.d Throwable th2) {
                    return Boolean.TRUE;
                }
            };
        }
        return g.j1(eVar, obj, lVar);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'publish()' is 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @s0(expression = "this.shareIn(scope, 0)", imports = {}))
    public static final <T> e<T> w(@dl.d e<? extends T> eVar) {
        g.b1();
        throw new KotlinNothingValueException();
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'publish(bufferSize)' is 'buffer' followed by 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @s0(expression = "this.buffer(bufferSize).shareIn(scope, 0)", imports = {}))
    public static final <T> e<T> x(@dl.d e<? extends T> eVar, int i10) {
        g.b1();
        throw new KotlinNothingValueException();
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Collect flow in the desired context instead")
    public static final <T> e<T> y(@dl.d e<? extends T> eVar, @dl.d CoroutineContext coroutineContext) {
        g.b1();
        throw new KotlinNothingValueException();
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'replay()' is 'shareIn' with unlimited replay. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @s0(expression = "this.shareIn(scope, Int.MAX_VALUE)", imports = {}))
    public static final <T> e<T> z(@dl.d e<? extends T> eVar) {
        g.b1();
        throw new KotlinNothingValueException();
    }
}
