package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import fi.u;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: PersistentVectorBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010*\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010)\n\u0000\n\u0002\u0010+\n\u0002\b\u0012\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003BB\u0012\r\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000d\u0012\u0010\u0010w\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t\u0012\u000e\u0010y\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\u0006\u0010}\u001a\u00020\u0004¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\u001f\u0010\r\u001a\u00020\f2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018JA\u0010\u001d\u001a\u00020\u001c2\u0010\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t2\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u000e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJA\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0010\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t2\u000e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\"J?\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010#\u001a\u00020\u00042\u000e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0$H\u0002¢\u0006\u0004\b&\u0010'JG\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0010\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t2\u0006\u0010(\u001a\u00020\u00042\u0014\u0010)\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0\tH\u0002¢\u0006\u0004\b*\u0010+JO\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0010\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0014\u0010,\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0$H\u0002¢\u0006\u0004\b-\u0010.J1\u00100\u001a\u00020\u001c2\u0010\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t2\u0006\u0010/\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00028\u0000H\u0002¢\u0006\u0004\b0\u00101JI\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\n2\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b4\u00105J]\u0010;\u001a\u00020\u001c2\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u0000062\u0006\u0010/\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u00042\u0016\u0010)\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t0\t2\u0006\u00109\u001a\u00020\u00042\u000e\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0002¢\u0006\u0004\b;\u0010<JW\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010=\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u00042\u0016\u0010)\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t0\t2\u0006\u00109\u001a\u00020\u00042\u000e\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0002¢\u0006\u0004\b>\u0010?Jm\u0010B\u001a\u00020\u001c2\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u0000062\u0006\u0010/\u001a\u00020\u00042\u000e\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010A\u001a\u00020\u00042\u0016\u0010)\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t0\t2\u0006\u00109\u001a\u00020\u00042\u000e\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0002¢\u0006\u0004\bB\u0010CJ\u001f\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010/\u001a\u00020\u0004H\u0002¢\u0006\u0004\bD\u0010EJ;\u0010F\u001a\u0004\u0018\u00010\n2\u0010\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u0004H\u0002¢\u0006\u0004\bF\u0010GJ?\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00042\u0006\u0010H\u001a\u000202H\u0002¢\u0006\u0004\bI\u0010JJ1\u0010K\u001a\u00020\u001c2\u0010\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\bK\u0010LJA\u0010\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t2\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00042\u0006\u0010H\u001a\u000202H\u0002¢\u0006\u0004\b\u0001\u0010JJ\u001c\u0010O\u001a\u00020\f2\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0MH\u0002J1\u0010P\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t2\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\bP\u0010\u0013J7\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010/\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\bQ\u0010RJ,\u0010U\u001a\u00020\u00042\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0M2\u0006\u0010S\u001a\u00020\u00042\u0006\u0010T\u001a\u000202H\u0002JC\u0010W\u001a\u00020\u00042\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0M2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010V\u001a\u00020\u00042\u0006\u0010T\u001a\u000202H\u0002¢\u0006\u0004\bW\u0010XJw\u0010\\\u001a\u00020\u00042\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0M2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010V\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020\u00042\u0006\u0010T\u001a\u0002022\u0014\u0010[\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0Z2\u0014\u0010)\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0ZH\u0002¢\u0006\u0004\b\\\u0010]JG\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00042\u0006\u0010D\u001a\u00028\u00002\u0006\u0010^\u001a\u000202H\u0002¢\u0006\u0004\b_\u00105J\u001e\u0010a\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0`2\u0006\u0010/\u001a\u00020\u0004H\u0002J\u000f\u0010b\u001a\u00020\u0004H\u0000¢\u0006\u0004\bb\u0010cJ\u000e\u0010e\u001a\b\u0012\u0004\u0012\u00028\u00000dH\u0016J\u0017\u0010f\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\bf\u0010gJ\u0016\u0010h\u001a\u00020\f2\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u000006H\u0016J\u001f\u0010f\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\bf\u0010iJ\u001e\u0010h\u001a\u00020\f2\u0006\u0010/\u001a\u00020\u00042\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u000006H\u0016J\u0018\u0010j\u001a\u00028\u00002\u0006\u0010/\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\bj\u0010kJ\u0017\u0010l\u001a\u00028\u00002\u0006\u0010/\u001a\u00020\u0004H\u0016¢\u0006\u0004\bl\u0010kJ\u0016\u0010m\u001a\u00020\f2\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u000006H\u0016J\u001a\u0010n\u001a\u00020\f2\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0MJ \u0010o\u001a\u00028\u00002\u0006\u0010/\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\bo\u0010pJ\u000f\u0010r\u001a\b\u0012\u0004\u0012\u00028\u00000qH\u0096\u0002J\u000e\u0010t\u001a\b\u0012\u0004\u0012\u00028\u00000sH\u0016J\u0016\u0010t\u001a\b\u0012\u0004\u0012\u00028\u00000s2\u0006\u0010/\u001a\u00020\u0004H\u0016R \u0010w\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u001e\u0010y\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010vR\"\u0010}\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bD\u0010\u001d\u001a\u0004\bz\u0010c\"\u0004\b{\u0010|R8\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t2\u0010\u0010~\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b&\u0010v\u001a\u0004\b\u007f\u0010\u0018R5\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u000e\u0010~\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0000@BX\u0080\u000e¢\u0006\r\n\u0004\bb\u0010v\u001a\u0005\b\u0080\u0001\u0010\u0018R%\u0010\u0006\u001a\u00020\u00042\u0006\u0010~\u001a\u00020\u00048\u0016@RX\u0096\u000e¢\u0006\r\n\u0004\b\u007f\u0010\u001d\u001a\u0005\b\u0081\u0001\u0010c¨\u0006\u0085\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", androidx.exifinterface.media.a.S4, "Lkotlin/collections/d;", "Lu0/h$a;", "", "X", UiKitSpanObj.TYPE_SIZE, "h0", "d0", "", "", "buffer", "", "v", "([Ljava/lang/Object;)Z", "x", "([Ljava/lang/Object;)[Ljava/lang/Object;", "distance", "y", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "element", "B", "(Ljava/lang/Object;)[Ljava/lang/Object;", androidx.exifinterface.media.a.W4, "()[Ljava/lang/Object;", "root", "filledTail", "newTail", "Lkotlin/b2;", "I", "([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)V", "tail", "shift", "J", "([Ljava/lang/Object;[Ljava/lang/Object;I)[Ljava/lang/Object;", "bufferIndex", "", "sourceIterator", "g", "([Ljava/lang/Object;ILjava/util/Iterator;)[Ljava/lang/Object;", "rootSize", "buffers", "H", "([Ljava/lang/Object;I[[Ljava/lang/Object;)[Ljava/lang/Object;", "buffersIterator", "G", "([Ljava/lang/Object;IILjava/util/Iterator;)[Ljava/lang/Object;", UCropPlusActivity.ARG_INDEX, ak.aG, "([Ljava/lang/Object;ILjava/lang/Object;)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/c;", "elementCarry", ak.aB, "([Ljava/lang/Object;IILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/c;)[Ljava/lang/Object;", "", "elements", "rightShift", "nullBuffers", "nextBuffer", "o", "(Ljava/util/Collection;II[[Ljava/lang/Object;I[Ljava/lang/Object;)V", "startLeafIndex", "a0", "(II[[Ljava/lang/Object;I[Ljava/lang/Object;)[Ljava/lang/Object;", "startBuffer", "startBufferSize", "b0", "(Ljava/util/Collection;I[Ljava/lang/Object;I[[Ljava/lang/Object;I[Ljava/lang/Object;)V", "e", "(I)[Ljava/lang/Object;", androidx.exifinterface.media.a.X4, "([Ljava/lang/Object;III)Ljava/lang/Object;", "tailCarry", "U", "([Ljava/lang/Object;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/c;)[Ljava/lang/Object;", "F", "([Ljava/lang/Object;II)V", "Lkotlin/Function1;", "predicate", "Q", androidx.exifinterface.media.a.T4, "D", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "tailSize", "bufferRef", "R", "bufferSize", "N", "(Lyh/l;[Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/c;)I", "toBufferSize", "", "recyclableBuffers", "L", "(Lyh/l;[Ljava/lang/Object;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/c;Ljava/util/List;Ljava/util/List;)I", "oldElementCarry", "Y", "", RXScreenCaptureService.KEY_WIDTH, RXScreenCaptureService.KEY_HEIGHT, "()I", "Lu0/h;", "build", "add", "(Ljava/lang/Object;)Z", "addAll", "(ILjava/lang/Object;)V", "get", "(I)Ljava/lang/Object;", "b", "removeAll", androidx.exifinterface.media.a.f23244d5, "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "", "iterator", "", "listIterator", ak.aF, "[Ljava/lang/Object;", "vectorRoot", "d", "vectorTail", "j", "Z", "(I)V", "rootShift", "<set-?>", "i", "l", ak.av, "vector", "<init>", "(Lu0/h;[Ljava/lang/Object;[Ljava/lang/Object;I)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class PersistentVectorBuilder<E> extends kotlin.collections.d<E> implements u0.h.a<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private u0.h<? extends E> f12660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Object[] vectorRoot;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private Object[] vectorTail;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int rootShift;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private y0.f f12664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Object[] root;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private Object[] tail;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int size;

    public PersistentVectorBuilder(@dl.d u0.h<? extends E> vector, @dl.e Object[] objArr, @dl.d Object[] vectorTail, int i10) {
        f0.p(vector, "vector");
        f0.p(vectorTail, "vectorTail");
        this.f12660b = vector;
        this.vectorRoot = objArr;
        this.vectorTail = vectorTail;
        this.rootShift = i10;
        this.f12664f = new y0.f();
        this.root = this.vectorRoot;
        this.tail = this.vectorTail;
        this.size = this.f12660b.size();
    }

    private final Object[] A() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f12664f;
        return objArr;
    }

    private final Object[] B(Object element) {
        Object[] objArr = new Object[33];
        objArr[0] = element;
        objArr[32] = this.f12664f;
        return objArr;
    }

    private final Object[] D(Object[] root, int index, int shift) {
        if (!(shift >= 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (shift == 0) {
            return root;
        }
        int iA = j.a(index, shift);
        Object obj = root[iA];
        f0.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objD = D((Object[]) obj, index, shift - 5);
        if (iA < 31) {
            int i10 = iA + 1;
            if (root[i10] != null) {
                if (v(root)) {
                    m.n2(root, null, i10, 32);
                }
                root = m.c1(root, A(), 0, 0, i10);
            }
        }
        if (objD == root[iA]) {
            return root;
        }
        Object[] objArrX = x(root);
        objArrX[iA] = objD;
        return objArrX;
    }

    private final Object[] E(Object[] root, int shift, int rootSize, c tailCarry) {
        Object[] objArrE;
        int iA = j.a(rootSize - 1, shift);
        if (shift == 5) {
            tailCarry.b(root[iA]);
            objArrE = null;
        } else {
            Object obj = root[iA];
            f0.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrE = E((Object[]) obj, shift - 5, rootSize, tailCarry);
        }
        if (objArrE == null && iA == 0) {
            return null;
        }
        Object[] objArrX = x(root);
        objArrX[iA] = objArrE;
        return objArrX;
    }

    private final void F(Object[] root, int rootSize, int shift) {
        if (shift == 0) {
            this.root = null;
            if (root == null) {
                root = new Object[0];
            }
            this.tail = root;
            this.size = rootSize;
            this.rootShift = shift;
            return;
        }
        c cVar = new c(null);
        f0.m(root);
        Object[] objArrE = E(root, shift, rootSize, cVar);
        f0.m(objArrE);
        Object value = cVar.getValue();
        f0.n(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.tail = (Object[]) value;
        this.size = rootSize;
        if (objArrE[1] == null) {
            this.root = (Object[]) objArrE[0];
            this.rootShift = shift - 5;
        } else {
            this.root = objArrE;
            this.rootShift = shift;
        }
    }

    private final Object[] G(Object[] root, int rootSize, int shift, Iterator<Object[]> buffersIterator) {
        if (!buffersIterator.hasNext()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(shift >= 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (shift == 0) {
            return buffersIterator.next();
        }
        Object[] objArrX = x(root);
        int iA = j.a(rootSize, shift);
        int i10 = shift - 5;
        objArrX[iA] = G((Object[]) objArrX[iA], rootSize, i10, buffersIterator);
        while (true) {
            iA++;
            if (iA >= 32 || !buffersIterator.hasNext()) {
                break;
            }
            objArrX[iA] = G((Object[]) objArrX[iA], 0, i10, buffersIterator);
        }
        return objArrX;
    }

    private final Object[] H(Object[] root, int rootSize, Object[][] buffers) {
        Iterator<Object[]> itA = kotlin.jvm.internal.h.a(buffers);
        int i10 = rootSize >> 5;
        int i11 = this.rootShift;
        Object[] objArrG = i10 < (1 << i11) ? G(root, rootSize, i11, itA) : x(root);
        while (itA.hasNext()) {
            this.rootShift += 5;
            objArrG = B(objArrG);
            int i12 = this.rootShift;
            G(objArrG, 1 << i12, i12, itA);
        }
        return objArrG;
    }

    private final void I(Object[] root, Object[] filledTail, Object[] newTail) {
        int size = size() >> 5;
        int i10 = this.rootShift;
        if (size > (1 << i10)) {
            this.root = J(B(root), filledTail, this.rootShift + 5);
            this.tail = newTail;
            this.rootShift += 5;
            this.size = size() + 1;
            return;
        }
        if (root == null) {
            this.root = filledTail;
            this.tail = newTail;
            this.size = size() + 1;
        } else {
            this.root = J(root, filledTail, i10);
            this.tail = newTail;
            this.size = size() + 1;
        }
    }

    private final Object[] J(Object[] root, Object[] tail, int shift) {
        int iA = j.a(size() - 1, shift);
        Object[] objArrX = x(root);
        if (shift == 5) {
            objArrX[iA] = tail;
        } else {
            objArrX[iA] = J((Object[]) objArrX[iA], tail, shift - 5);
        }
        return objArrX;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int L(l<? super E, Boolean> predicate, Object[] buffer, int bufferSize, int toBufferSize, c bufferRef, List<Object[]> recyclableBuffers, List<Object[]> buffers) {
        if (v(buffer)) {
            recyclableBuffers.add(buffer);
        }
        Object value = bufferRef.getValue();
        f0.n(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        Object[] objArrRemove = objArr;
        for (int i10 = 0; i10 < bufferSize; i10++) {
            Object obj = buffer[i10];
            if (!predicate.invoke(obj).booleanValue()) {
                if (toBufferSize == 32) {
                    objArrRemove = recyclableBuffers.isEmpty() ^ true ? recyclableBuffers.remove(recyclableBuffers.size() - 1) : A();
                    toBufferSize = 0;
                }
                objArrRemove[toBufferSize] = obj;
                toBufferSize++;
            }
        }
        bufferRef.b(objArrRemove);
        if (objArr != bufferRef.getValue()) {
            buffers.add(objArr);
        }
        return toBufferSize;
    }

    private final int N(l<? super E, Boolean> predicate, Object[] buffer, int bufferSize, c bufferRef) {
        Object[] objArrX = buffer;
        int i10 = bufferSize;
        boolean z10 = false;
        for (int i11 = 0; i11 < bufferSize; i11++) {
            Object obj = buffer[i11];
            if (predicate.invoke(obj).booleanValue()) {
                if (!z10) {
                    objArrX = x(buffer);
                    z10 = true;
                    i10 = i11;
                }
            } else if (z10) {
                objArrX[i10] = obj;
                i10++;
            }
        }
        bufferRef.b(objArrX);
        return i10;
    }

    private final boolean Q(l<? super E, Boolean> lVar) {
        Object[] objArrG;
        int iD0 = d0();
        c cVar = new c(null);
        if (this.root == null) {
            return R(lVar, iD0, cVar) != iD0;
        }
        ListIterator<Object[]> listIteratorW = w(0);
        int iN = 32;
        while (iN == 32 && listIteratorW.hasNext()) {
            iN = N(lVar, listIteratorW.next(), 32, cVar);
        }
        if (iN == 32) {
            y0.a.a(!listIteratorW.hasNext());
            int iR = R(lVar, iD0, cVar);
            if (iR == 0) {
                F(this.root, size(), this.rootShift);
            }
            return iR != iD0;
        }
        int iPreviousIndex = listIteratorW.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iL = iN;
        while (listIteratorW.hasNext()) {
            iL = L(lVar, listIteratorW.next(), 32, iL, cVar, arrayList2, arrayList);
            iPreviousIndex = iPreviousIndex;
        }
        int i10 = iPreviousIndex;
        int iL2 = L(lVar, this.tail, iD0, iL, cVar, arrayList2, arrayList);
        Object value = cVar.getValue();
        f0.n(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        m.n2(objArr, null, iL2, 32);
        if (arrayList.isEmpty()) {
            objArrG = this.root;
            f0.m(objArrG);
        } else {
            objArrG = G(this.root, i10, this.rootShift, arrayList.iterator());
        }
        int size = i10 + (arrayList.size() << 5);
        this.root = W(objArrG, size);
        this.tail = objArr;
        this.size = size + iL2;
        return true;
    }

    private final int R(l<? super E, Boolean> lVar, int i10, c cVar) {
        int iN = N(lVar, this.tail, i10, cVar);
        if (iN == i10) {
            y0.a.a(cVar.getValue() == this.tail);
            return i10;
        }
        Object value = cVar.getValue();
        f0.n(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        m.n2(objArr, null, iN, i10);
        this.tail = objArr;
        this.size = size() - (i10 - iN);
        return iN;
    }

    private final Object[] U(Object[] root, int shift, int index, c tailCarry) {
        int iA = j.a(index, shift);
        if (shift == 0) {
            Object obj = root[iA];
            Object[] objArrC1 = m.c1(root, x(root), iA, iA + 1, 32);
            objArrC1[31] = tailCarry.getValue();
            tailCarry.b(obj);
            return objArrC1;
        }
        int iA2 = root[31] == null ? j.a(X() - 1, shift) : 31;
        Object[] objArrX = x(root);
        int i10 = shift - 5;
        int i11 = iA + 1;
        if (i11 <= iA2) {
            while (true) {
                Object obj2 = objArrX[iA2];
                f0.n(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrX[iA2] = U((Object[]) obj2, i10, 0, tailCarry);
                if (iA2 == i11) {
                    break;
                }
                iA2--;
            }
        }
        Object obj3 = objArrX[iA];
        f0.n(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrX[iA] = U((Object[]) obj3, i10, index, tailCarry);
        return objArrX;
    }

    private final Object V(Object[] root, int rootSize, int shift, int index) {
        int size = size() - rootSize;
        y0.a.a(index < size);
        if (size == 1) {
            Object obj = this.tail[0];
            F(root, rootSize, shift);
            return obj;
        }
        Object[] objArr = this.tail;
        Object obj2 = objArr[index];
        Object[] objArrC1 = m.c1(objArr, x(objArr), index, index + 1, size);
        objArrC1[size - 1] = null;
        this.root = root;
        this.tail = objArrC1;
        this.size = (rootSize + size) - 1;
        this.rootShift = shift;
        return obj2;
    }

    private final Object[] W(Object[] root, int size) {
        if (!((size & 31) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (size == 0) {
            this.rootShift = 0;
            return null;
        }
        int i10 = size - 1;
        while (true) {
            int i11 = this.rootShift;
            if ((i10 >> i11) != 0) {
                return D(root, i10, i11);
            }
            this.rootShift = i11 - 5;
            Object[] objArr = root[0];
            f0.n(objArr, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            root = objArr;
        }
    }

    private final int X() {
        if (size() <= 32) {
            return 0;
        }
        return j.d(size());
    }

    private final Object[] Y(Object[] root, int shift, int index, E e10, c oldElementCarry) {
        int iA = j.a(index, shift);
        Object[] objArrX = x(root);
        if (shift != 0) {
            Object obj = objArrX[iA];
            f0.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrX[iA] = Y((Object[]) obj, shift - 5, index, e10, oldElementCarry);
            return objArrX;
        }
        if (objArrX != root) {
            ((AbstractList) this).modCount++;
        }
        oldElementCarry.b(objArrX[iA]);
        objArrX[iA] = e10;
        return objArrX;
    }

    private final Object[] a0(int startLeafIndex, int rightShift, Object[][] buffers, int nullBuffers, Object[] nextBuffer) {
        if (this.root == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        ListIterator<Object[]> listIteratorW = w(X() >> 5);
        while (listIteratorW.previousIndex() != startLeafIndex) {
            Object[] objArrPrevious = listIteratorW.previous();
            m.c1(objArrPrevious, nextBuffer, 0, 32 - rightShift, 32);
            nextBuffer = y(objArrPrevious, rightShift);
            nullBuffers--;
            buffers[nullBuffers] = nextBuffer;
        }
        return listIteratorW.previous();
    }

    private final void b0(Collection<? extends E> elements, int index, Object[] startBuffer, int startBufferSize, Object[][] buffers, int nullBuffers, Object[] nextBuffer) {
        Object[] objArrA;
        if (!(nullBuffers >= 1)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Object[] objArrX = x(startBuffer);
        buffers[0] = objArrX;
        int i10 = index & 31;
        int size = ((index + elements.size()) - 1) & 31;
        int i11 = (startBufferSize - i10) + size;
        if (i11 < 32) {
            m.c1(objArrX, nextBuffer, size + 1, i10, startBufferSize);
        } else {
            int i12 = (i11 - 32) + 1;
            if (nullBuffers == 1) {
                objArrA = objArrX;
            } else {
                objArrA = A();
                nullBuffers--;
                buffers[nullBuffers] = objArrA;
            }
            int i13 = startBufferSize - i12;
            m.c1(objArrX, nextBuffer, 0, i13, startBufferSize);
            m.c1(objArrX, objArrA, size + 1, i10, i13);
            nextBuffer = objArrA;
        }
        Iterator<? extends E> it = elements.iterator();
        g(objArrX, i10, it);
        for (int i14 = 1; i14 < nullBuffers; i14++) {
            buffers[i14] = g(A(), 0, it);
        }
        g(nextBuffer, 0, it);
    }

    private final int d0() {
        return h0(size());
    }

    private final Object[] e(int index) {
        if (X() <= index) {
            return this.tail;
        }
        Object[] objArr = this.root;
        f0.m(objArr);
        for (int i10 = this.rootShift; i10 > 0; i10 -= 5) {
            Object[] objArr2 = objArr[j.a(index, i10)];
            f0.n(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] g(Object[] buffer, int bufferIndex, Iterator<? extends Object> sourceIterator) {
        while (bufferIndex < 32 && sourceIterator.hasNext()) {
            buffer[bufferIndex] = sourceIterator.next();
            bufferIndex++;
        }
        return buffer;
    }

    private final int h0(int size) {
        return size <= 32 ? size : size - j.d(size);
    }

    private final void o(Collection<? extends E> elements, int index, int rightShift, Object[][] buffers, int nullBuffers, Object[] nextBuffer) {
        if (this.root == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        int i10 = index >> 5;
        Object[] objArrA0 = a0(i10, rightShift, buffers, nullBuffers, nextBuffer);
        int iX = nullBuffers - (((X() >> 5) - 1) - i10);
        if (iX < nullBuffers) {
            nextBuffer = buffers[iX];
            f0.m(nextBuffer);
        }
        b0(elements, index, objArrA0, 32, buffers, iX, nextBuffer);
    }

    private final Object[] s(Object[] root, int shift, int index, Object element, c elementCarry) {
        Object obj;
        int iA = j.a(index, shift);
        if (shift == 0) {
            elementCarry.b(root[31]);
            Object[] objArrC1 = m.c1(root, x(root), iA + 1, iA, 31);
            objArrC1[iA] = element;
            return objArrC1;
        }
        Object[] objArrX = x(root);
        int i10 = shift - 5;
        Object obj2 = objArrX[iA];
        f0.n(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrX[iA] = s((Object[]) obj2, i10, index, element, elementCarry);
        while (true) {
            iA++;
            if (iA >= 32 || (obj = objArrX[iA]) == null) {
                break;
            }
            f0.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrX[iA] = s((Object[]) obj, i10, 0, elementCarry.getValue(), elementCarry);
        }
        return objArrX;
    }

    private final void u(Object[] root, int index, E element) {
        int iD0 = d0();
        Object[] objArrX = x(this.tail);
        if (iD0 < 32) {
            m.c1(this.tail, objArrX, index + 1, index, iD0);
            objArrX[index] = element;
            this.root = root;
            this.tail = objArrX;
            this.size = size() + 1;
            return;
        }
        Object[] objArr = this.tail;
        Object obj = objArr[31];
        m.c1(objArr, objArrX, index + 1, index, 31);
        objArrX[index] = element;
        I(root, objArrX, B(obj));
    }

    private final boolean v(Object[] buffer) {
        return buffer.length == 33 && buffer[32] == this.f12664f;
    }

    private final ListIterator<Object[]> w(int index) {
        if (this.root == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        int iX = X() >> 5;
        y0.e.b(index, iX);
        int i10 = this.rootShift;
        if (i10 == 0) {
            Object[] objArr = this.root;
            f0.m(objArr);
            return new g(objArr, index);
        }
        Object[] objArr2 = this.root;
        f0.m(objArr2);
        return new i(objArr2, index, iX, i10 / 5);
    }

    private final Object[] x(Object[] buffer) {
        if (buffer == null) {
            return A();
        }
        return v(buffer) ? buffer : m.l1(buffer, A(), 0, 0, u.B(buffer.length, 32), 6, null);
    }

    private final Object[] y(Object[] buffer, int distance) {
        return v(buffer) ? m.c1(buffer, buffer, distance, 0, 32 - distance) : m.c1(buffer, A(), distance, 0, 32 - distance);
    }

    public final boolean T(@dl.d l<? super E, Boolean> predicate) {
        f0.p(predicate, "predicate");
        boolean zQ = Q(predicate);
        if (zQ) {
            ((AbstractList) this).modCount++;
        }
        return zQ;
    }

    public final void Z(int i10) {
        this.rootShift = i10;
    }

    @Override // kotlin.collections.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public int getSize() {
        return this.size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.d, java.util.AbstractList, java.util.List
    public void add(int index, E element) {
        y0.e.b(index, size());
        if (index == size()) {
            add(element);
            return;
        }
        ((AbstractList) this).modCount++;
        int iX = X();
        if (index >= iX) {
            u(this.root, index - iX, element);
            return;
        }
        c cVar = new c(null);
        Object[] objArr = this.root;
        f0.m(objArr);
        u(s(objArr, this.rootShift, index, element, cVar), 0, cVar.getValue());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E element) {
        ((AbstractList) this).modCount++;
        int iD0 = d0();
        if (iD0 < 32) {
            Object[] objArrX = x(this.tail);
            objArrX[iD0] = element;
            this.tail = objArrX;
            this.size = size() + 1;
        } else {
            I(this.root, this.tail, B(element));
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, @dl.d Collection<? extends E> elements) {
        Object[] objArrC1;
        f0.p(elements, "elements");
        y0.e.b(index, size());
        if (index == size()) {
            return addAll(elements);
        }
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i10 = (index >> 5) << 5;
        int size = (((size() - i10) + elements.size()) - 1) / 32;
        if (size == 0) {
            y0.a.a(index >= X());
            int i11 = index & 31;
            int size2 = ((index + elements.size()) - 1) & 31;
            Object[] objArr = this.tail;
            Object[] objArrC2 = m.c1(objArr, x(objArr), size2 + 1, i11, d0());
            g(objArrC2, i11, elements.iterator());
            this.tail = objArrC2;
            this.size = size() + elements.size();
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iD0 = d0();
        int iH0 = h0(size() + elements.size());
        if (index >= X()) {
            objArrC1 = A();
            b0(elements, index, this.tail, iD0, objArr2, size, objArrC1);
        } else if (iH0 > iD0) {
            int i12 = iH0 - iD0;
            objArrC1 = y(this.tail, i12);
            o(elements, index, i12, objArr2, size, objArrC1);
        } else {
            int i13 = iD0 - iH0;
            objArrC1 = m.c1(this.tail, A(), 0, i13, iD0);
            int i14 = 32 - i13;
            Object[] objArrY = y(this.tail, i14);
            int i15 = size - 1;
            objArr2[i15] = objArrY;
            o(elements, index, i14, objArr2, i15, objArrY);
        }
        this.root = H(this.root, i10, objArr2);
        this.tail = objArrC1;
        this.size = size() + elements.size();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@dl.d Collection<? extends E> elements) {
        f0.p(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iD0 = d0();
        Iterator<? extends E> it = elements.iterator();
        if (32 - iD0 >= elements.size()) {
            this.tail = g(x(this.tail), iD0, it);
            this.size = size() + elements.size();
        } else {
            int size = ((elements.size() + iD0) - 1) / 32;
            Object[][] objArr = new Object[size][];
            objArr[0] = g(x(this.tail), iD0, it);
            for (int i10 = 1; i10 < size; i10++) {
                objArr[i10] = g(A(), 0, it);
            }
            this.root = H(this.root, X(), objArr);
            this.tail = g(A(), 0, it);
            this.size = size() + elements.size();
        }
        return true;
    }

    @Override // kotlin.collections.d
    public E b(int index) {
        y0.e.a(index, size());
        ((AbstractList) this).modCount++;
        int iX = X();
        if (index >= iX) {
            return (E) V(this.root, iX, this.rootShift, index - iX);
        }
        c cVar = new c(this.tail[0]);
        Object[] objArr = this.root;
        f0.m(objArr);
        V(U(objArr, this.rootShift, index, cVar), iX, this.rootShift, 0);
        return (E) cVar.getValue();
    }

    @Override // u0.g.a
    @dl.d
    public u0.h<E> build() {
        d dVar;
        if (this.root == this.vectorRoot && this.tail == this.vectorTail) {
            dVar = this.f12660b;
        } else {
            this.f12664f = new y0.f();
            Object[] objArr = this.root;
            this.vectorRoot = objArr;
            Object[] objArr2 = this.tail;
            this.vectorTail = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    dVar = j.b();
                } else {
                    Object[] objArrCopyOf = Arrays.copyOf(this.tail, size());
                    f0.o(objArrCopyOf, "copyOf(this, newSize)");
                    dVar = new h(objArrCopyOf);
                }
            } else {
                Object[] objArr3 = this.root;
                f0.m(objArr3);
                dVar = new d(objArr3, this.tail, size(), this.rootShift);
            }
        }
        this.f12660b = dVar;
        return (u0.h<E>) dVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        y0.e.a(index, size());
        return (E) e(index)[index & 31];
    }

    public final int h() {
        return ((AbstractList) this).modCount;
    }

    @dl.e
    /* JADX INFO: renamed from: i, reason: from getter */
    public final Object[] getRoot() {
        return this.root;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @dl.d
    public Iterator<E> iterator() {
        return listIterator();
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getRootShift() {
        return this.rootShift;
    }

    @dl.d
    /* JADX INFO: renamed from: l, reason: from getter */
    public final Object[] getTail() {
        return this.tail;
    }

    @Override // java.util.AbstractList, java.util.List
    @dl.d
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    @dl.d
    public ListIterator<E> listIterator(int index) {
        y0.e.b(index, size());
        return new f(this, index);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@dl.d final Collection<? extends Object> elements) {
        f0.p(elements, "elements");
        return T(new l<E, Boolean>() { // from class: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder.removeAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(E e10) {
                return Boolean.valueOf(elements.contains(e10));
            }
        });
    }

    @Override // kotlin.collections.d, java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        y0.e.a(index, size());
        if (X() > index) {
            c cVar = new c(null);
            Object[] objArr = this.root;
            f0.m(objArr);
            this.root = Y(objArr, this.rootShift, index, element, cVar);
            return (E) cVar.getValue();
        }
        Object[] objArrX = x(this.tail);
        if (objArrX != this.tail) {
            ((AbstractList) this).modCount++;
        }
        int i10 = index & 31;
        E e10 = (E) objArrX[i10];
        objArrX[i10] = element;
        this.tail = objArrX;
        return e10;
    }
}
