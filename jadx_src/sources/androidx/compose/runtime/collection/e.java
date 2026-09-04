package androidx.compose.runtime.collection;

import androidx.compose.runtime.internal.o;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.m;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t;
import kotlin.r0;
import yh.l;
import yh.p;
import yh.q;

/* JADX INFO: compiled from: MutableVector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003:\u0003\u000b\u0006\u0010B!\b\u0001\u0012\u000e\u0010p\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0013\u0012\u0006\u0010x\u001a\u00020\b¢\u0006\u0004\b~\u0010\u007fJ\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u000f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rJ\u001c\u0010\u0010\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0017\u0010\u0011\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0086\bJ\u0017\u0010\u0012\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0086\bJ\u001b\u0010\u0014\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0017\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016J\u0014\u0010\u0018\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016J+\u0010\u001b\u001a\u00020\u00052\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J+\u0010\u001c\u001a\u00020\u00052\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dJ\u0006\u0010\u001f\u001a\u00020\nJ\u0018\u0010 \u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b \u0010\u0007J\u0014\u0010!\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rJ\u0014\u0010\"\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016J\u0014\u0010#\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0014\u0010%\u001a\u00020\u00052\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u000e\u0010'\u001a\u00020\n2\u0006\u0010&\u001a\u00020\bJ\r\u0010(\u001a\u00028\u0000¢\u0006\u0004\b(\u0010)J2\u0010*\u001a\u00028\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0004\b,\u0010)J4\u0010-\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b-\u0010+JU\u00105\u001a\u00028\u0001\"\u0004\b\u0001\u0010.2\u0006\u0010/\u001a\u00028\u00012'\u00104\u001a#\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(3\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000100H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b5\u00106Jj\u00108\u001a\u00028\u0001\"\u0004\b\u0001\u0010.2\u0006\u0010/\u001a\u00028\u00012<\u00104\u001a8\u0012\u0013\u0012\u00110\b¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(3\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000107H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b8\u00109JU\u0010:\u001a\u00028\u0001\"\u0004\b\u0001\u0010.2\u0006\u0010/\u001a\u00028\u00012'\u00104\u001a#\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(3\u0012\u0004\u0012\u00028\u000100H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b:\u00106Jj\u0010;\u001a\u00028\u0001\"\u0004\b\u0001\u0010.2\u0006\u0010/\u001a\u00028\u00012<\u00104\u001a8\u0012\u0013\u0012\u00110\b¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(3\u0012\u0004\u0012\u00028\u000107H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b;\u00109J+\u0010=\u001a\u00020\n2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J1\u0010>\u001a\u00020\n2\u0018\u0010<\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n00H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J+\u0010?\u001a\u00020\n2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J1\u0010@\u001a\u00020\n2\u0018\u0010<\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n00H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0018\u0010A\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH\u0086\n¢\u0006\u0004\bA\u0010BJ\u0015\u0010C\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\bC\u0010DJ+\u0010E\u001a\u00020\b2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J+\u0010F\u001a\u00020\b2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0006\u0010G\u001a\u00020\u0005J\u0006\u0010H\u001a\u00020\u0005J\r\u0010.\u001a\u00028\u0000¢\u0006\u0004\b.\u0010)J2\u0010I\u001a\u00028\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bI\u0010+J\u0015\u0010\u0001\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0001\u0010DJ\u0012\u0010J\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0004\bJ\u0010)J4\u0010K\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bK\u0010+J@\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013\"\u0006\b\u0001\u0010.\u0018\u00012\u0012\u0010L\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bM\u0010NJU\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013\"\u0006\b\u0001\u0010.\u0018\u00012'\u0010L\u001a#\u0012\u0013\u0012\u00110\b¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000100H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bO\u0010PJP\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0006\b\u0001\u0010.\u0018\u00012)\u0010L\u001a%\u0012\u0013\u0012\u00110\b¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u000100H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J;\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0006\b\u0001\u0010.\u0018\u00012\u0014\u0010L\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0018\u0010S\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\bS\u0010TJ\u0018\u0010U\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\bU\u0010TJ\u0015\u0010V\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\bV\u0010\u0007J\u0014\u0010W\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rJ\u0014\u0010X\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0014\u0010Y\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016J\u0015\u0010Z\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\bZ\u0010BJ\u0016\u0010]\u001a\u00020\n2\u0006\u0010[\u001a\u00020\b2\u0006\u0010\\\u001a\u00020\bJ\u0014\u0010^\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016J \u0010_\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b_\u0010`J\u001e\u0010d\u001a\u00020\n2\u0016\u0010c\u001a\u0012\u0012\u0004\u0012\u00028\u00000aj\b\u0012\u0004\u0012\u00028\u0000`bJ+\u0010f\u001a\u00020\b2\u0012\u0010e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\b\u0010h\u001a\u00020gH\u0001R0\u0010p\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00138\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010i\u0012\u0004\bn\u0010o\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u001e\u0010r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010qR$\u0010x\u001a\u00020\b2\u0006\u0010s\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR\u0012\u0010z\u001a\u00020\b8Æ\u0002¢\u0006\u0006\u001a\u0004\by\u0010wR\u0012\u0010}\u001a\u00020{8Æ\u0002¢\u0006\u0006\u001a\u0004\bu\u0010|\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0080\u0001"}, d2 = {"Landroidx/compose/runtime/collection/e;", androidx.exifinterface.media.a.f23244d5, "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "element", "", "b", "(Ljava/lang/Object;)Z", "", UCropPlusActivity.ARG_INDEX, "Lkotlin/b2;", ak.av, "(ILjava/lang/Object;)V", "", "elements", "f", ak.aF, "i", "g", "", "j", "([Ljava/lang/Object;)Z", "", "e", RXScreenCaptureService.KEY_HEIGHT, "Lkotlin/Function1;", "predicate", "k", "k0", "", "l", "m", "n", "q", "p", "o", "other", "r", "capacity", ak.aB, "t", "()Ljava/lang/Object;", ak.aG, "(Lyh/l;)Ljava/lang/Object;", "v", RXScreenCaptureService.KEY_WIDTH, "R", "initial", "Lkotlin/Function2;", "Lkotlin/m0;", "name", "acc", "operation", "x", "(Ljava/lang/Object;Lyh/p;)Ljava/lang/Object;", "Lkotlin/Function3;", "y", "(Ljava/lang/Object;Lyh/q;)Ljava/lang/Object;", ak.aD, androidx.exifinterface.media.a.W4, "block", "B", "C", "D", androidx.exifinterface.media.a.S4, "F", "(I)Ljava/lang/Object;", "L", "(Ljava/lang/Object;)I", "N", "O", "P", "Q", androidx.exifinterface.media.a.R4, "U", androidx.exifinterface.media.a.X4, "transform", androidx.exifinterface.media.a.T4, "(Lyh/l;)[Ljava/lang/Object;", "X", "(Lyh/p;)[Ljava/lang/Object;", "Y", "Z", "b0", "(Ljava/lang/Object;)V", "a0", "c0", "f0", "d0", "e0", "g0", com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "h0", "i0", "l0", "(ILjava/lang/Object;)Ljava/lang/Object;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "n0", "selector", "o0", "", "q0", "[Ljava/lang/Object;", "G", "()[Ljava/lang/Object;", "m0", "([Ljava/lang/Object;)V", "getContent$annotations", "()V", "content", "Ljava/util/List;", "list", "<set-?>", "d", "I", "K", "()I", UiKitSpanObj.TYPE_SIZE, "J", "lastIndex", "Lfi/l;", "()Lfi/l;", "indices", "<init>", "([Ljava/lang/Object;I)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
@o(parameters = 0)
public final class e<T> implements RandomAccess {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f12643e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private T[] content;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private List<T> list;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* JADX INFO: compiled from: MutableVector.kt */
    @Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010+\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00010$¢\u0006\u0004\b*\u0010+J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0018\u0010\f\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0096\u0002J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0006J\u001f\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0016J\u001e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0016\u0010\u0017\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0019H\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u0006J\u0016\u0010\u001c\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0017\u0010\u001d\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\rJ\u0016\u0010\u001e\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J \u0010\u001f\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\nH\u0016R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00010$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010%R\u0014\u0010)\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"Landroidx/compose/runtime/collection/e$a;", androidx.exifinterface.media.a.f23244d5, "", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "", UCropPlusActivity.ARG_INDEX, "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "", "iterator", "lastIndexOf", "add", "Lkotlin/b2;", "(ILjava/lang/Object;)V", "addAll", "clear", "", "listIterator", "remove", "removeAll", "b", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "Landroidx/compose/runtime/collection/e;", "Landroidx/compose/runtime/collection/e;", "vector", ak.av, "()I", UiKitSpanObj.TYPE_SIZE, "<init>", "(Landroidx/compose/runtime/collection/e;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class a<T> implements List<T>, zh.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final e<T> vector;

        public a(@dl.d e<T> vector) {
            f0.p(vector, "vector");
            this.vector = vector;
        }

        public int a() {
            return this.vector.getSize();
        }

        @Override // java.util.List
        public void add(int index, T element) {
            this.vector.a(index, element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T element) {
            return this.vector.b(element);
        }

        @Override // java.util.List
        public boolean addAll(int index, @dl.d Collection<? extends T> elements) {
            f0.p(elements, "elements");
            return this.vector.e(index, elements);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(@dl.d Collection<? extends T> elements) {
            f0.p(elements, "elements");
            return this.vector.h(elements);
        }

        public T b(int index) {
            f.f(this, index);
            return this.vector.g0(index);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.vector.m();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object element) {
            return this.vector.n(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(@dl.d Collection<? extends Object> elements) {
            f0.p(elements, "elements");
            return this.vector.p(elements);
        }

        @Override // java.util.List
        public T get(int index) {
            f.f(this, index);
            return this.vector.G()[index];
        }

        @Override // java.util.List
        public int indexOf(Object element) {
            return this.vector.L(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.vector.P();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @dl.d
        public Iterator<T> iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object element) {
            return this.vector.T(element);
        }

        @Override // java.util.List
        @dl.d
        public ListIterator<T> listIterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        @dl.d
        public ListIterator<T> listIterator(int index) {
            return new c(this, index);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i10) {
            return b(i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object element) {
            return this.vector.c0(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(@dl.d Collection<? extends Object> elements) {
            f0.p(elements, "elements");
            return this.vector.e0(elements);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(@dl.d Collection<? extends Object> elements) {
            f0.p(elements, "elements");
            return this.vector.i0(elements);
        }

        @Override // java.util.List
        public T set(int index, T element) {
            f.f(this, index);
            return this.vector.l0(index, element);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return a();
        }

        @Override // java.util.List
        @dl.d
        public List<T> subList(int fromIndex, int toIndex) {
            f.g(this, fromIndex, toIndex);
            return new b(this, fromIndex, toIndex);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return t.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] array) {
            f0.p(array, "array");
            return (T[]) t.b(this, array);
        }
    }

    /* JADX INFO: compiled from: MutableVector.kt */
    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010+\n\u0002\b\u0017\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B%\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010(\u001a\u00020\n\u0012\u0006\u0010*\u001a\u00020\n¢\u0006\u0004\b.\u0010/J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0018\u0010\f\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0096\u0002J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0006J\u001f\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0016J\u001e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0016\u0010\u0017\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0019H\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u0006J\u0016\u0010\u001c\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0017\u0010\u001d\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\rJ\u0016\u0010\u001e\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J \u0010\u001f\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\nH\u0016R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010$R\u0014\u0010(\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010'R\u0014\u0010-\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Landroidx/compose/runtime/collection/e$b;", androidx.exifinterface.media.a.f23244d5, "", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "", UCropPlusActivity.ARG_INDEX, "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "", "iterator", "lastIndexOf", "add", "Lkotlin/b2;", "(ILjava/lang/Object;)V", "addAll", "clear", "", "listIterator", "remove", "removeAll", "b", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "Ljava/util/List;", "list", ak.aF, "I", com.google.android.exoplayer2.text.ttml.d.f49798o0, "d", com.google.android.exoplayer2.text.ttml.d.f49800p0, ak.av, "()I", UiKitSpanObj.TYPE_SIZE, "<init>", "(Ljava/util/List;II)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class b<T> implements List<T>, zh.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final List<T> list;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int start;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int end;

        public b(@dl.d List<T> list, int i10, int i11) {
            f0.p(list, "list");
            this.list = list;
            this.start = i10;
            this.end = i11;
        }

        public int a() {
            return this.end - this.start;
        }

        @Override // java.util.List
        public void add(int index, T element) {
            this.list.add(index + this.start, element);
            this.end++;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T element) {
            List<T> list = this.list;
            int i10 = this.end;
            this.end = i10 + 1;
            list.add(i10, element);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int index, @dl.d Collection<? extends T> elements) {
            f0.p(elements, "elements");
            this.list.addAll(index + this.start, elements);
            this.end += elements.size();
            return elements.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(@dl.d Collection<? extends T> elements) {
            f0.p(elements, "elements");
            this.list.addAll(this.end, elements);
            this.end += elements.size();
            return elements.size() > 0;
        }

        public T b(int index) {
            f.f(this, index);
            T tRemove = this.list.remove(index + this.start);
            this.end--;
            return tRemove;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i10 = this.end - 1;
            int i11 = this.start;
            if (i11 <= i10) {
                while (true) {
                    this.list.remove(i10);
                    if (i10 == i11) {
                        break;
                    } else {
                        i10--;
                    }
                }
            }
            this.end = this.start;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object element) {
            int i10 = this.end;
            for (int i11 = this.start; i11 < i10; i11++) {
                if (f0.g(this.list.get(i11), element)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(@dl.d Collection<? extends Object> elements) {
            f0.p(elements, "elements");
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public T get(int index) {
            f.f(this, index);
            return this.list.get(index + this.start);
        }

        @Override // java.util.List
        public int indexOf(Object element) {
            int i10 = this.end;
            for (int i11 = this.start; i11 < i10; i11++) {
                if (f0.g(this.list.get(i11), element)) {
                    return i11 - this.start;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.end == this.start;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @dl.d
        public Iterator<T> iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object element) {
            int i10 = this.end - 1;
            int i11 = this.start;
            if (i11 > i10) {
                return -1;
            }
            while (!f0.g(this.list.get(i10), element)) {
                if (i10 == i11) {
                    return -1;
                }
                i10--;
            }
            return i10 - this.start;
        }

        @Override // java.util.List
        @dl.d
        public ListIterator<T> listIterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        @dl.d
        public ListIterator<T> listIterator(int index) {
            return new c(this, index);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i10) {
            return b(i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object element) {
            int i10 = this.end;
            for (int i11 = this.start; i11 < i10; i11++) {
                if (f0.g(this.list.get(i11), element)) {
                    this.list.remove(i11);
                    this.end--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(@dl.d Collection<? extends Object> elements) {
            f0.p(elements, "elements");
            int i10 = this.end;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i10 != this.end;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(@dl.d Collection<? extends Object> elements) {
            f0.p(elements, "elements");
            int i10 = this.end;
            int i11 = i10 - 1;
            int i12 = this.start;
            if (i12 <= i11) {
                while (true) {
                    if (!elements.contains(this.list.get(i11))) {
                        this.list.remove(i11);
                        this.end--;
                    }
                    if (i11 == i12) {
                        break;
                    }
                    i11--;
                }
            }
            return i10 != this.end;
        }

        @Override // java.util.List
        public T set(int index, T element) {
            f.f(this, index);
            return this.list.set(index + this.start, element);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return a();
        }

        @Override // java.util.List
        @dl.d
        public List<T> subList(int fromIndex, int toIndex) {
            f.g(this, fromIndex, toIndex);
            return new b(this, fromIndex, toIndex);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return t.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] array) {
            f0.p(array, "array");
            return (T[]) t.b(this, array);
        }
    }

    /* JADX INFO: compiled from: MutableVector.kt */
    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001d\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\u0010\u0010\u0005\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u000f\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\f\u0010\u0006J\b\u0010\r\u001a\u00020\nH\u0016J\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/collection/e$c;", androidx.exifinterface.media.a.f23244d5, "", "", "hasNext", "next", "()Ljava/lang/Object;", "Lkotlin/b2;", "remove", "hasPrevious", "", "nextIndex", "previous", "previousIndex", "element", "add", "(Ljava/lang/Object;)V", "set", "", "b", "Ljava/util/List;", "list", ak.aF, "I", UCropPlusActivity.ARG_INDEX, "<init>", "(Ljava/util/List;I)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class c<T> implements ListIterator<T>, zh.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final List<T> list;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int index;

        public c(@dl.d List<T> list, int i10) {
            f0.p(list, "list");
            this.list = list;
            this.index = i10;
        }

        @Override // java.util.ListIterator
        public void add(T element) {
            this.list.add(this.index, element);
            this.index++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < this.list.size();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> list = this.list;
            int i10 = this.index;
            this.index = i10 + 1;
            return list.get(i10);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int i10 = this.index - 1;
            this.index = i10;
            return this.list.get(i10);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i10 = this.index - 1;
            this.index = i10;
            this.list.remove(i10);
        }

        @Override // java.util.ListIterator
        public void set(T element) {
            this.list.set(this.index, element);
        }
    }

    @r0
    public e(@dl.d T[] content, int i10) {
        f0.p(content, "content");
        this.content = content;
        this.size = i10;
    }

    @r0
    public static /* synthetic */ void H() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> R A(R initial, @dl.d q<? super Integer, ? super T, ? super R, ? extends R> operation) {
        f0.p(operation, "operation");
        int size = getSize();
        if (size > 0) {
            int i10 = size - 1;
            T[] tArrG = G();
            f0.n(tArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                initial = operation.invoke(Integer.valueOf(i10), tArrG[i10], initial);
                i10--;
            } while (i10 >= 0);
        }
        return initial;
    }

    public final void B(@dl.d l<? super T, b2> block) {
        f0.p(block, "block");
        int size = getSize();
        if (size > 0) {
            int i10 = 0;
            T[] tArrG = G();
            f0.n(tArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                block.invoke(tArrG[i10]);
                i10++;
            } while (i10 < size);
        }
    }

    public final void C(@dl.d p<? super Integer, ? super T, b2> block) {
        f0.p(block, "block");
        int size = getSize();
        if (size > 0) {
            int i10 = 0;
            T[] tArrG = G();
            f0.n(tArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                block.invoke(Integer.valueOf(i10), tArrG[i10]);
                i10++;
            } while (i10 < size);
        }
    }

    public final void D(@dl.d l<? super T, b2> block) {
        f0.p(block, "block");
        int size = getSize();
        if (size > 0) {
            int i10 = size - 1;
            T[] tArrG = G();
            f0.n(tArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                block.invoke(tArrG[i10]);
                i10--;
            } while (i10 >= 0);
        }
    }

    public final void E(@dl.d p<? super Integer, ? super T, b2> block) {
        f0.p(block, "block");
        if (getSize() > 0) {
            int size = getSize() - 1;
            T[] tArrG = G();
            f0.n(tArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                block.invoke(Integer.valueOf(size), tArrG[size]);
                size--;
            } while (size >= 0);
        }
    }

    public final T F(int index) {
        return G()[index];
    }

    @dl.d
    public final T[] G() {
        return this.content;
    }

    @dl.d
    public final fi.l I() {
        return new fi.l(0, getSize() - 1);
    }

    public final int J() {
        return getSize() - 1;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final int L(T element) {
        int i10 = this.size;
        if (i10 <= 0) {
            return -1;
        }
        int i11 = 0;
        T[] tArr = this.content;
        f0.n(tArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
        while (!f0.g(element, tArr[i11])) {
            i11++;
            if (i11 >= i10) {
                return -1;
            }
        }
        return i11;
    }

    public final int N(@dl.d l<? super T, Boolean> predicate) {
        f0.p(predicate, "predicate");
        int size = getSize();
        if (size <= 0) {
            return -1;
        }
        int i10 = 0;
        T[] tArrG = G();
        f0.n(tArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
        while (!predicate.invoke(tArrG[i10]).booleanValue()) {
            i10++;
            if (i10 >= size) {
                return -1;
            }
        }
        return i10;
    }

    public final int O(@dl.d l<? super T, Boolean> predicate) {
        f0.p(predicate, "predicate");
        int size = getSize();
        if (size <= 0) {
            return -1;
        }
        int i10 = size - 1;
        T[] tArrG = G();
        f0.n(tArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
        while (!predicate.invoke(tArrG[i10]).booleanValue()) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
        }
        return i10;
    }

    public final boolean P() {
        return this.size == 0;
    }

    public final boolean Q() {
        return this.size != 0;
    }

    public final T R() {
        if (P()) {
            throw new NoSuchElementException("MutableVector is empty.");
        }
        return G()[getSize() - 1];
    }

    public final T S(@dl.d l<? super T, Boolean> predicate) {
        f0.p(predicate, "predicate");
        int size = getSize();
        if (size > 0) {
            int i10 = size - 1;
            T[] tArrG = G();
            f0.n(tArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                T t10 = tArrG[i10];
                if (predicate.invoke(t10).booleanValue()) {
                    return t10;
                }
                i10--;
            } while (i10 >= 0);
        }
        q0();
        throw new KotlinNothingValueException();
    }

    public final int T(T element) {
        int i10 = this.size;
        if (i10 <= 0) {
            return -1;
        }
        int i11 = i10 - 1;
        T[] tArr = this.content;
        f0.n(tArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
        while (!f0.g(element, tArr[i11])) {
            i11--;
            if (i11 < 0) {
                return -1;
            }
        }
        return i11;
    }

    @dl.e
    public final T U() {
        if (P()) {
            return null;
        }
        return G()[getSize() - 1];
    }

    @dl.e
    public final T V(@dl.d l<? super T, Boolean> predicate) {
        f0.p(predicate, "predicate");
        int size = getSize();
        if (size <= 0) {
            return null;
        }
        int i10 = size - 1;
        T[] tArrG = G();
        f0.n(tArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
        do {
            T t10 = tArrG[i10];
            if (predicate.invoke(t10).booleanValue()) {
                return t10;
            }
            i10--;
        } while (i10 >= 0);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <R> R[] W(l<? super T, ? extends R> transform) {
        f0.p(transform, "transform");
        int size = getSize();
        f0.y(0, "R");
        R[] rArr = (R[]) new Object[size];
        for (int i10 = 0; i10 < size; i10++) {
            rArr[i10] = transform.invoke(G()[i10]);
        }
        return rArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <R> R[] X(p<? super Integer, ? super T, ? extends R> transform) {
        f0.p(transform, "transform");
        int size = getSize();
        f0.y(0, "R");
        R[] rArr = (R[]) new Object[size];
        for (int i10 = 0; i10 < size; i10++) {
            rArr[i10] = transform.invoke(Integer.valueOf(i10), G()[i10]);
        }
        return rArr;
    }

    public final /* synthetic */ <R> e<R> Y(p<? super Integer, ? super T, ? extends R> transform) {
        f0.p(transform, "transform");
        int size = getSize();
        int i10 = 0;
        f0.y(0, "R?");
        Object[] objArr = new Object[size];
        if (size > 0) {
            T[] tArrG = G();
            f0.n(tArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i11 = 0;
            do {
                R rInvoke = transform.invoke(Integer.valueOf(i10), tArrG[i10]);
                if (rInvoke != null) {
                    objArr[i11] = rInvoke;
                    i11++;
                }
                i10++;
            } while (i10 < size);
            i10 = i11;
        }
        return new e<>(objArr, i10);
    }

    public final /* synthetic */ <R> e<R> Z(l<? super T, ? extends R> transform) {
        f0.p(transform, "transform");
        int size = getSize();
        int i10 = 0;
        f0.y(0, "R?");
        Object[] objArr = new Object[size];
        if (size > 0) {
            T[] tArrG = G();
            f0.n(tArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i11 = 0;
            do {
                R rInvoke = transform.invoke(tArrG[i10]);
                if (rInvoke != null) {
                    objArr[i11] = rInvoke;
                    i11++;
                }
                i10++;
            } while (i10 < size);
            i10 = i11;
        }
        return new e<>(objArr, i10);
    }

    public final void a(int index, T element) {
        s(this.size + 1);
        T[] tArr = this.content;
        int i10 = this.size;
        if (index != i10) {
            m.c1(tArr, tArr, index + 1, index, i10);
        }
        tArr[index] = element;
        this.size++;
    }

    public final void a0(T element) {
        c0(element);
    }

    public final boolean b(T element) {
        s(this.size + 1);
        T[] tArr = this.content;
        int i10 = this.size;
        tArr[i10] = element;
        this.size = i10 + 1;
        return true;
    }

    public final void b0(T element) {
        b(element);
    }

    public final boolean c(int index, @dl.d e<T> elements) {
        f0.p(elements, "elements");
        if (elements.P()) {
            return false;
        }
        s(this.size + elements.size);
        T[] tArr = this.content;
        int i10 = this.size;
        if (index != i10) {
            m.c1(tArr, tArr, elements.size + index, index, i10);
        }
        m.c1(elements.content, tArr, index, 0, elements.size);
        this.size += elements.size;
        return true;
    }

    public final boolean c0(T element) {
        int iL = L(element);
        if (iL < 0) {
            return false;
        }
        g0(iL);
        return true;
    }

    public final boolean d0(@dl.d e<T> elements) {
        f0.p(elements, "elements");
        int i10 = this.size;
        int size = elements.getSize() - 1;
        if (size >= 0) {
            int i11 = 0;
            while (true) {
                c0(elements.G()[i11]);
                if (i11 == size) {
                    break;
                }
                i11++;
            }
        }
        return i10 != this.size;
    }

    public final boolean e(int index, @dl.d Collection<? extends T> elements) {
        f0.p(elements, "elements");
        int i10 = 0;
        if (elements.isEmpty()) {
            return false;
        }
        s(this.size + elements.size());
        T[] tArr = this.content;
        if (index != this.size) {
            m.c1(tArr, tArr, elements.size() + index, index, this.size);
        }
        for (T t10 : elements) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            tArr[i10 + index] = t10;
            i10 = i11;
        }
        this.size += elements.size();
        return true;
    }

    public final boolean e0(@dl.d Collection<? extends T> elements) {
        f0.p(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        int i10 = this.size;
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            c0(it.next());
        }
        return i10 != this.size;
    }

    public final boolean f(int index, @dl.d List<? extends T> elements) {
        f0.p(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        s(this.size + elements.size());
        T[] tArr = this.content;
        if (index != this.size) {
            m.c1(tArr, tArr, elements.size() + index, index, this.size);
        }
        int size = elements.size();
        for (int i10 = 0; i10 < size; i10++) {
            tArr[index + i10] = elements.get(i10);
        }
        this.size += elements.size();
        return true;
    }

    public final boolean f0(@dl.d List<? extends T> elements) {
        f0.p(elements, "elements");
        int i10 = this.size;
        int size = elements.size();
        for (int i11 = 0; i11 < size; i11++) {
            c0(elements.get(i11));
        }
        return i10 != this.size;
    }

    public final boolean g(@dl.d e<T> elements) {
        f0.p(elements, "elements");
        return c(getSize(), elements);
    }

    public final T g0(int index) {
        T[] tArr = this.content;
        T t10 = tArr[index];
        if (index != getSize() - 1) {
            m.c1(tArr, tArr, index, index + 1, this.size);
        }
        int i10 = this.size - 1;
        this.size = i10;
        tArr[i10] = null;
        return t10;
    }

    public final boolean h(@dl.d Collection<? extends T> elements) {
        f0.p(elements, "elements");
        return e(this.size, elements);
    }

    public final void h0(int i10, int i11) {
        if (i11 > i10) {
            int i12 = this.size;
            if (i11 < i12) {
                T[] tArr = this.content;
                m.c1(tArr, tArr, i10, i11, i12);
            }
            int i13 = this.size - (i11 - i10);
            int size = getSize() - 1;
            if (i13 <= size) {
                int i14 = i13;
                while (true) {
                    this.content[i14] = null;
                    if (i14 == size) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
            this.size = i13;
        }
    }

    public final boolean i(@dl.d List<? extends T> elements) {
        f0.p(elements, "elements");
        return f(getSize(), elements);
    }

    public final boolean i0(@dl.d Collection<? extends T> elements) {
        f0.p(elements, "elements");
        int i10 = this.size;
        for (int size = getSize() - 1; -1 < size; size--) {
            if (!elements.contains(G()[size])) {
                g0(size);
            }
        }
        return i10 != this.size;
    }

    public final boolean j(@dl.d T[] elements) {
        f0.p(elements, "elements");
        if (elements.length == 0) {
            return false;
        }
        s(this.size + elements.length);
        m.l1(elements, this.content, this.size, 0, 0, 12, null);
        this.size += elements.length;
        return true;
    }

    public final boolean k(@dl.d l<? super T, Boolean> predicate) {
        f0.p(predicate, "predicate");
        int size = getSize();
        if (size > 0) {
            T[] tArrG = G();
            f0.n(tArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i10 = 0;
            while (!predicate.invoke(tArrG[i10]).booleanValue()) {
                i10++;
                if (i10 >= size) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean k0(@dl.d l<? super T, Boolean> predicate) {
        f0.p(predicate, "predicate");
        int size = getSize();
        if (size <= 0) {
            return false;
        }
        int i10 = size - 1;
        T[] tArrG = G();
        f0.n(tArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
        while (!predicate.invoke(tArrG[i10]).booleanValue()) {
            i10--;
            if (i10 < 0) {
                return false;
            }
        }
        return true;
    }

    @dl.d
    public final List<T> l() {
        List<T> list = this.list;
        if (list != null) {
            return list;
        }
        a aVar = new a(this);
        this.list = aVar;
        return aVar;
    }

    public final T l0(int index, T element) {
        T[] tArr = this.content;
        T t10 = tArr[index];
        tArr[index] = element;
        return t10;
    }

    public final void m() {
        T[] tArr = this.content;
        int size = getSize();
        while (true) {
            size--;
            if (-1 >= size) {
                this.size = 0;
                return;
            }
            tArr[size] = null;
        }
    }

    public final void m0(@dl.d T[] tArr) {
        f0.p(tArr, "<set-?>");
        this.content = tArr;
    }

    public final boolean n(T element) {
        int size = getSize() - 1;
        if (size >= 0) {
            for (int i10 = 0; !f0.g(G()[i10], element); i10++) {
                if (i10 != size) {
                }
            }
            return true;
        }
        return false;
    }

    public final void n0(@dl.d Comparator<T> comparator) {
        f0.p(comparator, "comparator");
        T[] tArr = this.content;
        f0.n(tArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
        m.J4(tArr, comparator, 0, this.size);
    }

    public final boolean o(@dl.d e<T> elements) {
        f0.p(elements, "elements");
        fi.l lVar = new fi.l(0, elements.getSize() - 1);
        int iH = lVar.h();
        int i10 = lVar.i();
        if (iH <= i10) {
            while (n(elements.G()[iH])) {
                if (iH != i10) {
                    iH++;
                }
            }
            return false;
        }
        return true;
    }

    public final int o0(@dl.d l<? super T, Integer> selector) {
        f0.p(selector, "selector");
        int size = getSize();
        int iIntValue = 0;
        if (size > 0) {
            T[] tArrG = G();
            f0.n(tArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i10 = 0;
            do {
                iIntValue += selector.invoke(tArrG[i10]).intValue();
                i10++;
            } while (i10 < size);
        }
        return iIntValue;
    }

    public final boolean p(@dl.d Collection<? extends T> elements) {
        f0.p(elements, "elements");
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!n(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean q(@dl.d List<? extends T> elements) {
        f0.p(elements, "elements");
        int size = elements.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!n(elements.get(i10))) {
                return false;
            }
        }
        return true;
    }

    @dl.d
    @r0
    public final Void q0() {
        throw new NoSuchElementException("MutableVector contains no element matching the predicate.");
    }

    public final boolean r(@dl.d e<T> other) {
        f0.p(other, "other");
        if (other.size != this.size) {
            return false;
        }
        int size = getSize() - 1;
        if (size >= 0) {
            for (int i10 = 0; f0.g(other.G()[i10], G()[i10]); i10++) {
                if (i10 != size) {
                }
            }
            return false;
        }
        return true;
    }

    public final void s(int i10) {
        T[] tArr = this.content;
        if (tArr.length < i10) {
            T[] tArr2 = (T[]) Arrays.copyOf(tArr, Math.max(i10, tArr.length * 2));
            f0.o(tArr2, "copyOf(this, newSize)");
            this.content = tArr2;
        }
    }

    public final T t() {
        if (P()) {
            throw new NoSuchElementException("MutableVector is empty.");
        }
        return G()[0];
    }

    public final T u(@dl.d l<? super T, Boolean> predicate) {
        f0.p(predicate, "predicate");
        int size = getSize();
        if (size > 0) {
            int i10 = 0;
            T[] tArrG = G();
            f0.n(tArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                T t10 = tArrG[i10];
                if (predicate.invoke(t10).booleanValue()) {
                    return t10;
                }
                i10++;
            } while (i10 < size);
        }
        q0();
        throw new KotlinNothingValueException();
    }

    @dl.e
    public final T v() {
        if (P()) {
            return null;
        }
        return G()[0];
    }

    @dl.e
    public final T w(@dl.d l<? super T, Boolean> predicate) {
        f0.p(predicate, "predicate");
        int size = getSize();
        if (size <= 0) {
            return null;
        }
        int i10 = 0;
        T[] tArrG = G();
        f0.n(tArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
        do {
            T t10 = tArrG[i10];
            if (predicate.invoke(t10).booleanValue()) {
                return t10;
            }
            i10++;
        } while (i10 < size);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> R x(R initial, @dl.d p<? super R, ? super T, ? extends R> operation) {
        f0.p(operation, "operation");
        int size = getSize();
        if (size > 0) {
            int i10 = 0;
            T[] tArrG = G();
            f0.n(tArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                initial = operation.invoke(initial, tArrG[i10]);
                i10++;
            } while (i10 < size);
        }
        return initial;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> R y(R initial, @dl.d q<? super Integer, ? super R, ? super T, ? extends R> operation) {
        f0.p(operation, "operation");
        int size = getSize();
        if (size > 0) {
            int i10 = 0;
            T[] tArrG = G();
            f0.n(tArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                initial = operation.invoke(Integer.valueOf(i10), initial, tArrG[i10]);
                i10++;
            } while (i10 < size);
        }
        return initial;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> R z(R initial, @dl.d p<? super T, ? super R, ? extends R> operation) {
        f0.p(operation, "operation");
        int size = getSize();
        if (size > 0) {
            int i10 = size - 1;
            T[] tArrG = G();
            f0.n(tArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                initial = operation.invoke(tArrG[i10], initial);
                i10--;
            } while (i10 >= 0);
        }
        return initial;
    }
}
