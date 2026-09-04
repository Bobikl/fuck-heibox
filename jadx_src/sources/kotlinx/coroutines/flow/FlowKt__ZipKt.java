package kotlinx.coroutines.flow;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.flow.internal.CombineKt;

/* JADX INFO: compiled from: Zip.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000l\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0006\u001a\u008a\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032F\u0010\f\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u008c\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032F\u0010\f\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u009d\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032Y\b\u0001\u0010\f\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0012\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0011¢\u0006\u0002\b\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u009f\u0001\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032Y\b\u0001\u0010\f\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0012\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0011¢\u0006\u0002\b\u0014ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0016\u001a\u008a\u0001\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00030\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u000320\b\u0001\u0010\f\u001a*\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0011ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u009b\u0001\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00030\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032A\b\u0001\u0010\f\u001a;\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001c¢\u0006\u0002\b\u0014ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a¢\u0001\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00040\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u001f\"\u0004\b\u0004\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00030\u000324\u0010\f\u001a0\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001cø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001aµ\u0001\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00040\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u001f\"\u0004\b\u0004\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00030\u00032G\b\u0001\u0010\f\u001aA\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0#¢\u0006\u0002\b\u0014ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a¼\u0001\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00050\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u001f\"\u0004\b\u0004\u0010&\"\u0004\b\u0005\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00030\u00032\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00040\u00032:\u0010\f\u001a6\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0#ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001aÏ\u0001\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00050\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u001f\"\u0004\b\u0004\u0010&\"\u0004\b\u0005\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00030\u00032\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00040\u00032M\b\u0001\u0010\f\u001aG\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00050\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0*¢\u0006\u0002\b\u0014ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001as\u00101\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010/\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030.\"\b\u0012\u0004\u0012\u00028\u00000\u00032*\b\u0004\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b00H\u0086\bø\u0001\u0000¢\u0006\u0004\b1\u00102\u001a\u0084\u0001\u00103\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010/\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030.\"\b\u0012\u0004\u0012\u00028\u00000\u00032;\b\u0005\u0010\f\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005¢\u0006\u0002\b\u0014H\u0086\bø\u0001\u0000¢\u0006\u0004\b3\u00104\u001as\u00105\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010/\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030.\"\b\u0012\u0004\u0012\u00028\u00000\u00032*\b\u0004\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b00H\u0082\bø\u0001\u0000¢\u0006\u0004\b5\u00102\u001a\u0084\u0001\u00106\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010/\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030.\"\b\u0012\u0004\u0012\u00028\u00000\u00032;\b\u0005\u0010\f\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005¢\u0006\u0002\b\u0014H\u0082\bø\u0001\u0000¢\u0006\u0004\b6\u00104\u001a#\u00108\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010.07\"\u0004\b\u0000\u0010-H\u0002¢\u0006\u0004\b8\u00109\u001ag\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u0012\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030:2*\b\u0004\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b00H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010;\u001ax\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u0012\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030:2;\b\u0005\u0010\f\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005¢\u0006\u0002\b\u0014H\u0086\bø\u0001\u0000¢\u0006\u0004\b<\u0010=\u001aj\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032(\u0010\f\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005ø\u0001\u0000¢\u0006\u0004\b?\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006@"}, d2 = {"T1", "T2", "R", "Lkotlinx/coroutines/flow/e;", "flow", "Lkotlin/Function3;", "Lkotlin/m0;", "name", ak.av, "b", "Lkotlin/coroutines/c;", "", "transform", "p", "(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lyh/q;)Lkotlinx/coroutines/flow/e;", "flow2", "f", "Lkotlin/Function4;", "Lkotlinx/coroutines/flow/f;", "Lkotlin/b2;", "Lkotlin/t;", "q", "(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lyh/r;)Lkotlinx/coroutines/flow/e;", "l", "T3", "flow3", "e", "(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lyh/r;)Lkotlinx/coroutines/flow/e;", "Lkotlin/Function5;", "k", "(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lyh/s;)Lkotlinx/coroutines/flow/e;", "T4", "flow4", "d", "(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lyh/s;)Lkotlinx/coroutines/flow/e;", "Lkotlin/Function6;", "j", "(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lyh/t;)Lkotlinx/coroutines/flow/e;", "T5", "flow5", ak.aF, "(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lyh/t;)Lkotlinx/coroutines/flow/e;", "Lkotlin/Function7;", "i", "(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lyh/u;)Lkotlinx/coroutines/flow/e;", androidx.exifinterface.media.a.f23244d5, "", "flows", "Lkotlin/Function2;", "g", "([Lkotlinx/coroutines/flow/e;Lyh/p;)Lkotlinx/coroutines/flow/e;", "m", "([Lkotlinx/coroutines/flow/e;Lyh/q;)Lkotlinx/coroutines/flow/e;", "o", "n", "Lkotlin/Function0;", "r", "()Lyh/a;", "", "(Ljava/lang/Iterable;Lyh/p;)Lkotlinx/coroutines/flow/e;", RXScreenCaptureService.KEY_HEIGHT, "(Ljava/lang/Iterable;Lyh/q;)Lkotlinx/coroutines/flow/e;", "other", ak.aB, "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class FlowKt__ZipKt {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/f;", "collector", "Lkotlin/b2;", ak.av, "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a<R> implements e<R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f129751b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f129752c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ yh.q f129753d;

        public a(e eVar, e eVar2, yh.q qVar) {
            this.f129751b = eVar;
            this.f129752c = eVar2;
            this.f129753d = qVar;
        }

        @Override // kotlinx.coroutines.flow.e
        @dl.e
        public Object a(@dl.d f<? super R> fVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            Object objA = CombineKt.a(fVar, new e[]{this.f129751b, this.f129752c}, FlowKt__ZipKt.r(), new FlowKt__ZipKt$combine$1$1(this.f129753d, null), cVar);
            return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
        }
    }

    public static final /* synthetic */ <T, R> e<R> b(Iterable<? extends e<? extends T>> iterable, yh.p<? super T[], ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
        Object[] array = CollectionsKt___CollectionsKt.Q5(iterable).toArray(new e[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        f0.w();
        return new FlowKt__ZipKt$combine$$inlined$unsafeFlow$3((e[]) array, pVar);
    }

    @dl.d
    public static final <T1, T2, T3, T4, T5, R> e<R> c(@dl.d e<? extends T1> eVar, @dl.d e<? extends T2> eVar2, @dl.d e<? extends T3> eVar3, @dl.d e<? extends T4> eVar4, @dl.d e<? extends T5> eVar5, @dl.d final yh.t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.c<? super R>, ? extends Object> tVar) {
        final e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5};
        return new e<R>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2, reason: invalid class name */
            /* JADX INFO: compiled from: Zip.kt */
            @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¨\u0006\u0006"}, d2 = {androidx.exifinterface.media.a.f23244d5, "R", "Lkotlinx/coroutines/flow/f;", "", "it", "Lkotlin/b2;", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2", f = "Zip.kt", i = {}, l = {bb.c.b.f30987v3, bb.c.b.f30987v3}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass2 extends SuspendLambda implements yh.q<f<? super R>, Object[], kotlin.coroutines.c<? super b2>, Object> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f129768b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private /* synthetic */ Object f129769c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f129770d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ yh.t f129771e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(kotlin.coroutines.c cVar, yh.t tVar) {
                    super(3, cVar);
                    this.f129771e = tVar;
                }

                @Override // yh.q
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@dl.d f<? super R> fVar, @dl.d Object[] objArr, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(cVar, this.f129771e);
                    anonymousClass2.f129769c = fVar;
                    anonymousClass2.f129770d = objArr;
                    return anonymousClass2.invokeSuspend(b2.f124493a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.e
                public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                    f fVar;
                    Object objH = kotlin.coroutines.intrinsics.b.h();
                    int i10 = this.f129768b;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            fVar = (f) this.f129769c;
                            t0.n(obj);
                        } else {
                            if (i10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            t0.n(obj);
                        }
                        return b2.f124493a;
                    }
                    t0.n(obj);
                    fVar = (f) this.f129769c;
                    Object[] objArr = (Object[]) this.f129770d;
                    yh.t tVar = this.f129771e;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    this.f129769c = fVar;
                    this.f129768b = 1;
                    c0.e(6);
                    obj = tVar.Z0(obj2, obj3, obj4, obj5, obj6, this);
                    c0.e(7);
                    if (obj == objH) {
                        return objH;
                    }
                    this.f129769c = null;
                    this.f129768b = 2;
                    if (fVar.emit(obj, this) == objH) {
                        return objH;
                    }
                    return b2.f124493a;
                }
            }

            @Override // kotlinx.coroutines.flow.e
            @dl.e
            public Object a(@dl.d f fVar, @dl.d kotlin.coroutines.c cVar) {
                Object objA = CombineKt.a(fVar, eVarArr, FlowKt__ZipKt.r(), new AnonymousClass2(null, tVar), cVar);
                return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
            }
        };
    }

    @dl.d
    public static final <T1, T2, T3, T4, R> e<R> d(@dl.d e<? extends T1> eVar, @dl.d e<? extends T2> eVar2, @dl.d e<? extends T3> eVar3, @dl.d e<? extends T4> eVar4, @dl.d final yh.s<? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.c<? super R>, ? extends Object> sVar) {
        final e[] eVarArr = {eVar, eVar2, eVar3, eVar4};
        return new e<R>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2, reason: invalid class name */
            /* JADX INFO: compiled from: Zip.kt */
            @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¨\u0006\u0006"}, d2 = {androidx.exifinterface.media.a.f23244d5, "R", "Lkotlinx/coroutines/flow/f;", "", "it", "Lkotlin/b2;", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", f = "Zip.kt", i = {}, l = {bb.c.b.f30987v3, bb.c.b.f30987v3}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass2 extends SuspendLambda implements yh.q<f<? super R>, Object[], kotlin.coroutines.c<? super b2>, Object> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f129762b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private /* synthetic */ Object f129763c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f129764d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ yh.s f129765e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(kotlin.coroutines.c cVar, yh.s sVar) {
                    super(3, cVar);
                    this.f129765e = sVar;
                }

                @Override // yh.q
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@dl.d f<? super R> fVar, @dl.d Object[] objArr, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(cVar, this.f129765e);
                    anonymousClass2.f129763c = fVar;
                    anonymousClass2.f129764d = objArr;
                    return anonymousClass2.invokeSuspend(b2.f124493a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.e
                public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                    f fVar;
                    Object objH = kotlin.coroutines.intrinsics.b.h();
                    int i10 = this.f129762b;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            fVar = (f) this.f129763c;
                            t0.n(obj);
                        } else {
                            if (i10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            t0.n(obj);
                        }
                        return b2.f124493a;
                    }
                    t0.n(obj);
                    fVar = (f) this.f129763c;
                    Object[] objArr = (Object[]) this.f129764d;
                    yh.s sVar = this.f129765e;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    this.f129763c = fVar;
                    this.f129762b = 1;
                    c0.e(6);
                    obj = sVar.N0(obj2, obj3, obj4, obj5, this);
                    c0.e(7);
                    if (obj == objH) {
                        return objH;
                    }
                    this.f129763c = null;
                    this.f129762b = 2;
                    if (fVar.emit(obj, this) == objH) {
                        return objH;
                    }
                    return b2.f124493a;
                }
            }

            @Override // kotlinx.coroutines.flow.e
            @dl.e
            public Object a(@dl.d f fVar, @dl.d kotlin.coroutines.c cVar) {
                Object objA = CombineKt.a(fVar, eVarArr, FlowKt__ZipKt.r(), new AnonymousClass2(null, sVar), cVar);
                return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
            }
        };
    }

    @dl.d
    public static final <T1, T2, T3, R> e<R> e(@dl.d e<? extends T1> eVar, @dl.d e<? extends T2> eVar2, @dl.d e<? extends T3> eVar3, @kotlin.b @dl.d final yh.r<? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.c<? super R>, ? extends Object> rVar) {
        final e[] eVarArr = {eVar, eVar2, eVar3};
        return new e<R>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Zip.kt */
            @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¨\u0006\u0006"}, d2 = {androidx.exifinterface.media.a.f23244d5, "R", "Lkotlinx/coroutines/flow/f;", "", "it", "Lkotlin/b2;", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", f = "Zip.kt", i = {}, l = {bb.c.b.f30987v3, bb.c.b.f30987v3}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass2 extends SuspendLambda implements yh.q<f<? super R>, Object[], kotlin.coroutines.c<? super b2>, Object> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f129756b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private /* synthetic */ Object f129757c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f129758d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ yh.r f129759e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(kotlin.coroutines.c cVar, yh.r rVar) {
                    super(3, cVar);
                    this.f129759e = rVar;
                }

                @Override // yh.q
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@dl.d f<? super R> fVar, @dl.d Object[] objArr, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(cVar, this.f129759e);
                    anonymousClass2.f129757c = fVar;
                    anonymousClass2.f129758d = objArr;
                    return anonymousClass2.invokeSuspend(b2.f124493a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.e
                public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                    f fVar;
                    Object objH = kotlin.coroutines.intrinsics.b.h();
                    int i10 = this.f129756b;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            fVar = (f) this.f129757c;
                            t0.n(obj);
                        } else {
                            if (i10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            t0.n(obj);
                        }
                        return b2.f124493a;
                    }
                    t0.n(obj);
                    fVar = (f) this.f129757c;
                    Object[] objArr = (Object[]) this.f129758d;
                    yh.r rVar = this.f129759e;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    this.f129757c = fVar;
                    this.f129756b = 1;
                    c0.e(6);
                    obj = rVar.U0(obj2, obj3, obj4, this);
                    c0.e(7);
                    if (obj == objH) {
                        return objH;
                    }
                    this.f129757c = null;
                    this.f129756b = 2;
                    if (fVar.emit(obj, this) == objH) {
                        return objH;
                    }
                    return b2.f124493a;
                }
            }

            @Override // kotlinx.coroutines.flow.e
            @dl.e
            public Object a(@dl.d f fVar, @dl.d kotlin.coroutines.c cVar) {
                Object objA = CombineKt.a(fVar, eVarArr, FlowKt__ZipKt.r(), new AnonymousClass2(null, rVar), cVar);
                return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
            }
        };
    }

    @dl.d
    public static final <T1, T2, R> e<R> f(@dl.d e<? extends T1> eVar, @dl.d e<? extends T2> eVar2, @dl.d yh.q<? super T1, ? super T2, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar) {
        return g.J0(eVar, eVar2, qVar);
    }

    public static final /* synthetic */ <T, R> e<R> g(e<? extends T>[] eVarArr, yh.p<? super T[], ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
        f0.w();
        return new FlowKt__ZipKt$combine$$inlined$unsafeFlow$2(eVarArr, pVar);
    }

    public static final /* synthetic */ <T, R> e<R> h(Iterable<? extends e<? extends T>> iterable, @kotlin.b yh.q<? super f<? super R>, ? super T[], ? super kotlin.coroutines.c<? super b2>, ? extends Object> qVar) {
        Object[] array = CollectionsKt___CollectionsKt.Q5(iterable).toArray(new e[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        f0.w();
        return g.I0(new FlowKt__ZipKt$combineTransform$7((e[]) array, qVar, null));
    }

    @dl.d
    public static final <T1, T2, T3, T4, T5, R> e<R> i(@dl.d e<? extends T1> eVar, @dl.d e<? extends T2> eVar2, @dl.d e<? extends T3> eVar3, @dl.d e<? extends T4> eVar4, @dl.d e<? extends T5> eVar5, @kotlin.b @dl.d yh.u<? super f<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.c<? super b2>, ? extends Object> uVar) {
        return g.I0(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5(new e[]{eVar, eVar2, eVar3, eVar4, eVar5}, null, uVar));
    }

    @dl.d
    public static final <T1, T2, T3, T4, R> e<R> j(@dl.d e<? extends T1> eVar, @dl.d e<? extends T2> eVar2, @dl.d e<? extends T3> eVar3, @dl.d e<? extends T4> eVar4, @kotlin.b @dl.d yh.t<? super f<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.c<? super b2>, ? extends Object> tVar) {
        return g.I0(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4(new e[]{eVar, eVar2, eVar3, eVar4}, null, tVar));
    }

    @dl.d
    public static final <T1, T2, T3, R> e<R> k(@dl.d e<? extends T1> eVar, @dl.d e<? extends T2> eVar2, @dl.d e<? extends T3> eVar3, @kotlin.b @dl.d yh.s<? super f<? super R>, ? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.c<? super b2>, ? extends Object> sVar) {
        return g.I0(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3(new e[]{eVar, eVar2, eVar3}, null, sVar));
    }

    @dl.d
    public static final <T1, T2, R> e<R> l(@dl.d e<? extends T1> eVar, @dl.d e<? extends T2> eVar2, @kotlin.b @dl.d yh.r<? super f<? super R>, ? super T1, ? super T2, ? super kotlin.coroutines.c<? super b2>, ? extends Object> rVar) {
        return g.I0(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2(new e[]{eVar, eVar2}, null, rVar));
    }

    public static final /* synthetic */ <T, R> e<R> m(e<? extends T>[] eVarArr, @kotlin.b yh.q<? super f<? super R>, ? super T[], ? super kotlin.coroutines.c<? super b2>, ? extends Object> qVar) {
        f0.w();
        return g.I0(new FlowKt__ZipKt$combineTransform$6(eVarArr, qVar, null));
    }

    private static final /* synthetic */ <T, R> e<R> n(e<? extends T>[] eVarArr, @kotlin.b yh.q<? super f<? super R>, ? super T[], ? super kotlin.coroutines.c<? super b2>, ? extends Object> qVar) {
        f0.w();
        return g.I0(new FlowKt__ZipKt$combineTransformUnsafe$1(eVarArr, qVar, null));
    }

    private static final /* synthetic */ <T, R> e<R> o(e<? extends T>[] eVarArr, yh.p<? super T[], ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
        f0.w();
        return new FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1(eVarArr, pVar);
    }

    @dl.d
    @xh.h(name = "flowCombine")
    public static final <T1, T2, R> e<R> p(@dl.d e<? extends T1> eVar, @dl.d e<? extends T2> eVar2, @dl.d yh.q<? super T1, ? super T2, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar) {
        return new a(eVar, eVar2, qVar);
    }

    @dl.d
    @xh.h(name = "flowCombineTransform")
    public static final <T1, T2, R> e<R> q(@dl.d e<? extends T1> eVar, @dl.d e<? extends T2> eVar2, @kotlin.b @dl.d yh.r<? super f<? super R>, ? super T1, ? super T2, ? super kotlin.coroutines.c<? super b2>, ? extends Object> rVar) {
        return g.I0(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1(new e[]{eVar, eVar2}, null, rVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> yh.a<T[]> r() {
        return new yh.a() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
            @Override // yh.a
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Void invoke() {
                return null;
            }
        };
    }

    @dl.d
    public static final <T1, T2, R> e<R> s(@dl.d e<? extends T1> eVar, @dl.d e<? extends T2> eVar2, @dl.d yh.q<? super T1, ? super T2, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar) {
        return CombineKt.b(eVar, eVar2, qVar);
    }
}
