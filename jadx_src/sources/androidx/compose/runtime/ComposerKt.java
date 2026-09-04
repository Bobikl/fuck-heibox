package androidx.compose.runtime;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.DeprecationLevel;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b:\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0080\u0001\u0010\t\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00030\u0000j\u0002`\u0004*\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00030\u0000j\u0002`\u00042.\u0010\b\u001a*\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00030\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000\u001a@\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00030\u0000j\u0002`\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000\u001aG\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n*\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00030\u0000j\u0002`\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001ak\u0010\u0014\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00030\u0000j\u0002`\u00042\u0012\u0010\u0012\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00110\u00102&\u0010\u0013\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00030\u0000j\u0002`\u0004H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a8\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\f2\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0002\b\u0019H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0018\u0010 \u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001eH\u0007\u001a \u0010\"\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001eH\u0007\u001a\b\u0010#\u001a\u00020\fH\u0007\u001a\u0018\u0010%\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020!2\u0006\u0010$\u001a\u00020\u001eH\u0007\u001a(\u0010(\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020!2\u0006\u0010&\u001a\u00020!2\u0006\u0010'\u001a\u00020!2\u0006\u0010$\u001a\u00020\u001eH\u0007\u001a\b\u0010)\u001a\u00020\u0007H\u0007\u001a\u0010\u0010*\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0016H\u0007\u001a\u0014\u0010.\u001a\u00020\u0007*\u00020+2\u0006\u0010-\u001a\u00020,H\u0000\u001aP\u00105\u001a>\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u000102j\b\u0012\u0004\u0012\u00028\u0001`301j\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u000102j\b\u0012\u0004\u0012\u00028\u0001`3`4\"\u0004\b\u0000\u0010/\"\u0004\b\u0001\u00100H\u0002\u001aa\u00107\u001a\u00020\f\"\u0004\b\u0000\u0010/\"\u0004\b\u0001\u00100*4\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010201j\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u000102j\b\u0012\u0004\u0012\u00028\u0001`3`42\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u00106\u001a\u00028\u0001H\u0002¢\u0006\u0004\b7\u00108\u001ac\u00109\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010/\"\u0004\b\u0001\u00100*4\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010201j\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u000102j\b\u0012\u0004\u0012\u00028\u0001`3`42\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u00106\u001a\u00028\u0001H\u0002¢\u0006\u0004\b9\u0010:\u001a[\u0010;\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010/\"\u0004\b\u0001\u00100*4\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010201j\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u000102j\b\u0012\u0004\u0012\u00028\u0001`3`42\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b;\u0010<\u001a(\u0010?\u001a\u0004\u0018\u00010\u00022\b\u00106\u001a\u0004\u0018\u00010\u00022\b\u0010=\u001a\u0004\u0018\u00010\u00022\b\u0010>\u001a\u0004\u0018\u00010\u0002H\u0002\u001a\u001a\u0010C\u001a\u00020!*\b\u0012\u0004\u0012\u00020A0@2\u0006\u0010B\u001a\u00020!H\u0002\u001a\u001a\u0010D\u001a\u00020!*\b\u0012\u0004\u0012\u00020A0@2\u0006\u0010B\u001a\u00020!H\u0002\u001a,\u0010H\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020A0@2\u0006\u0010B\u001a\u00020!2\u0006\u0010F\u001a\u00020E2\b\u0010G\u001a\u0004\u0018\u00010\u0002H\u0002\u001a$\u0010K\u001a\u0004\u0018\u00010A*\b\u0012\u0004\u0012\u00020A0@2\u0006\u0010I\u001a\u00020!2\u0006\u0010J\u001a\u00020!H\u0002\u001a\u001c\u0010L\u001a\u0004\u0018\u00010A*\b\u0012\u0004\u0012\u00020A0@2\u0006\u0010B\u001a\u00020!H\u0002\u001a\"\u0010M\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020A0@2\u0006\u0010I\u001a\u00020!2\u0006\u0010J\u001a\u00020!H\u0002\u001a(\u0010N\u001a\b\u0012\u0004\u0012\u00020A0@*\b\u0012\u0004\u0012\u00020A0@2\u0006\u0010I\u001a\u00020!2\u0006\u0010J\u001a\u00020!H\u0002\u001a\f\u0010O\u001a\u00020!*\u00020\fH\u0002\u001a\f\u0010P\u001a\u00020\f*\u00020!H\u0002\u001a\u001c\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020T*\u00020Q2\u0006\u0010S\u001a\u00020RH\u0002\u001a\u001c\u0010Y\u001a\u00020!*\u00020V2\u0006\u0010W\u001a\u00020!2\u0006\u0010X\u001a\u00020!H\u0002\u001a$\u0010]\u001a\u00020!*\u00020V2\u0006\u0010Z\u001a\u00020!2\u0006\u0010[\u001a\u00020!2\u0006\u0010\\\u001a\u00020!H\u0002\u001a\"\u0010_\u001a\u00020\u00072\u0006\u00106\u001a\u00020\f2\f\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0080\bø\u0001\u0000\u001a\u0010\u0010`\u001a\u00020\u00072\u0006\u00106\u001a\u00020\fH\u0000\u001a\u0010\u0010c\u001a\u00020b2\u0006\u0010a\u001a\u00020\u001eH\u0000\"\u001e\u0010h\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bZ\u0010e\u0012\u0004\bf\u0010g\"\u0014\u0010k\u001a\u00020!8\u0002X\u0082T¢\u0006\u0006\n\u0004\bi\u0010j\"\u0014\u0010m\u001a\u00020!8\u0002X\u0082T¢\u0006\u0006\n\u0004\bl\u0010j\"\u0014\u0010o\u001a\u00020!8\u0002X\u0082T¢\u0006\u0006\n\u0004\bn\u0010j\"\u0014\u0010q\u001a\u00020!8\u0002X\u0082T¢\u0006\u0006\n\u0004\bp\u0010j\"\u001a\u0010t\u001a\u00020!8\u0000X\u0081T¢\u0006\f\n\u0004\br\u0010j\u0012\u0004\bs\u0010g\" \u0010z\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bu\u0010v\u0012\u0004\by\u0010g\u001a\u0004\bw\u0010x\"\u001a\u0010}\u001a\u00020!8\u0000X\u0081T¢\u0006\f\n\u0004\b{\u0010j\u0012\u0004\b|\u0010g\"\"\u0010\u0081\u0001\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0013\n\u0004\b~\u0010v\u0012\u0005\b\u0080\u0001\u0010g\u001a\u0004\b\u007f\u0010x\"\u001d\u0010\u0084\u0001\u001a\u00020!8\u0000X\u0081T¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010j\u0012\u0005\b\u0083\u0001\u0010g\"#\u0010\u0087\u0001\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0014\n\u0005\b\u0085\u0001\u0010v\u0012\u0005\b\u0086\u0001\u0010g\u001a\u0004\bj\u0010x\"\u001d\u0010\u008a\u0001\u001a\u00020!8\u0000X\u0081T¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010j\u0012\u0005\b\u0089\u0001\u0010g\"$\u0010\u008e\u0001\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0015\n\u0005\b\u008b\u0001\u0010v\u0012\u0005\b\u008d\u0001\u0010g\u001a\u0005\b\u008c\u0001\u0010x\"\u001d\u0010\u0091\u0001\u001a\u00020!8\u0000X\u0081T¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010j\u0012\u0005\b\u0090\u0001\u0010g\"$\u0010\u0095\u0001\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0015\n\u0005\b\u0092\u0001\u0010v\u0012\u0005\b\u0094\u0001\u0010g\u001a\u0005\b\u0093\u0001\u0010x\"\u001d\u0010\u0098\u0001\u001a\u00020!8\u0000X\u0081T¢\u0006\u000e\n\u0005\b\u0096\u0001\u0010j\u0012\u0005\b\u0097\u0001\u0010g\"#\u0010\u009b\u0001\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0014\n\u0004\bP\u0010v\u0012\u0005\b\u009a\u0001\u0010g\u001a\u0005\b\u0099\u0001\u0010x\"\u001c\u0010\u009d\u0001\u001a\u00020!8\u0000X\u0081T¢\u0006\r\n\u0004\bO\u0010j\u0012\u0005\b\u009c\u0001\u0010g\"\u0015\u0010\u009e\u0001\u001a\u00020!8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010j\"\u001c\u0010¢\u0001\u001a\u00020\u0002*\u00030\u009f\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b \u0001\u0010¡\u0001*³\u0001\b\u0000\u0010©\u0001\"U\u0012\u001b\u0012\u0019\u0012\u0002\b\u00030¤\u0001¢\u0006\u000f\b¥\u0001\u0012\n\b¦\u0001\u0012\u0005\b\b(§\u0001\u0012\u0016\u0012\u00140+¢\u0006\u000f\b¥\u0001\u0012\n\b¦\u0001\u0012\u0005\b\b(¨\u0001\u0012\u0015\u0012\u00130,¢\u0006\u000e\b¥\u0001\u0012\t\b¦\u0001\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\u00070£\u00012U\u0012\u001b\u0012\u0019\u0012\u0002\b\u00030¤\u0001¢\u0006\u000f\b¥\u0001\u0012\n\b¦\u0001\u0012\u0005\b\b(§\u0001\u0012\u0016\u0012\u00140+¢\u0006\u000f\b¥\u0001\u0012\n\b¦\u0001\u0012\u0005\b\b(¨\u0001\u0012\u0015\u0012\u00130,¢\u0006\u000e\b¥\u0001\u0012\t\b¦\u0001\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\u00070£\u0001*E\b\u0000\u0010ª\u0001\"\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00030\u00002\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00030\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006«\u0001"}, d2 = {"Lu0/i;", "Landroidx/compose/runtime/v;", "", "Landroidx/compose/runtime/m2;", "Landroidx/compose/runtime/CompositionLocalMap;", "Lkotlin/Function1;", "", "Lkotlin/b2;", "mutator", "i0", androidx.exifinterface.media.a.f23244d5, "key", "", "C", "e0", "(Lu0/i;Landroidx/compose/runtime/v;)Ljava/lang/Object;", "", "Landroidx/compose/runtime/k1;", "values", "parentScope", "B", "([Landroidx/compose/runtime/k1;Lu0/i;Landroidx/compose/runtime/p;I)Lu0/i;", "Landroidx/compose/runtime/p;", "invalid", "Lkotlin/Function0;", "Landroidx/compose/runtime/c0;", "block", "x", "(Landroidx/compose/runtime/p;ZLyh/a;)Ljava/lang/Object;", "composer", "", "sourceInformation", "s0", "", "u0", "g0", "info", "x0", "dirty1", "dirty2", "w0", "v0", "t0", "Landroidx/compose/runtime/a2;", "Landroidx/compose/runtime/s1;", "rememberManager", "n0", "K", androidx.exifinterface.media.a.X4, "Ljava/util/HashMap;", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "Lkotlin/collections/HashMap;", "h0", "value", "l0", "(Ljava/util/HashMap;Ljava/lang/Object;Ljava/lang/Object;)Z", "m0", "(Ljava/util/HashMap;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/b2;", "k0", "(Ljava/util/HashMap;Ljava/lang/Object;)Ljava/lang/Object;", com.google.android.exoplayer2.text.ttml.d.f49793l0, com.google.android.exoplayer2.text.ttml.d.f49796n0, "Q", "", "Landroidx/compose/runtime/q0;", "location", "G", "F", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "instance", "f0", com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "H", "o0", "p0", androidx.exifinterface.media.a.S4, RXScreenCaptureService.KEY_WIDTH, "v", "Landroidx/compose/runtime/x1;", "Landroidx/compose/runtime/c;", "anchor", "", "y", "Landroidx/compose/runtime/w1;", UCropPlusActivity.ARG_INDEX, "root", "D", ak.av, "b", "common", "j0", "lazyMessage", "r0", "q0", "message", "", androidx.exifinterface.media.a.W4, "Landroidx/compose/runtime/y;", "Landroidx/compose/runtime/y;", "getCompositionTracer$annotations", "()V", "compositionTracer", "g", "I", "rootKey", RXScreenCaptureService.KEY_HEIGHT, "nodeKey", "i", "nodeKeyReplace", "j", "defaultsKey", "k", "getInvocationKey$annotations", "invocationKey", "l", "Ljava/lang/Object;", "M", "()Ljava/lang/Object;", "getInvocation$annotations", "invocation", "m", "getProviderKey$annotations", "providerKey", "n", "R", "getProvider$annotations", com.umeng.analytics.pro.d.M, "o", "getCompositionLocalMapKey$annotations", "compositionLocalMapKey", "p", "getCompositionLocalMap$annotations", "compositionLocalMap", "q", "getProviderValuesKey$annotations", "providerValuesKey", "r", "X", "getProviderValues$annotations", "providerValues", ak.aB, "getProviderMapsKey$annotations", "providerMapsKey", "t", "U", "getProviderMaps$annotations", "providerMaps", ak.aG, "getReferenceKey$annotations", "referenceKey", "a0", "getReference$annotations", "reference", "getReuseKey$annotations", "reuseKey", "invalidGroupLocation", "Landroidx/compose/runtime/s0;", "P", "(Landroidx/compose/runtime/s0;)Ljava/lang/Object;", "joinedKey", "Lkotlin/Function3;", "Landroidx/compose/runtime/e;", "Lkotlin/m0;", "name", "applier", "slots", "Change", "CompositionLocalMap", "runtime_release"}, k = 2, mv = {1, 7, 1})
public final class ComposerKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private static y f12320a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f12326g = 100;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f12327h = 125;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f12328i = 126;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f12329j = -127;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f12330k = 200;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f12332m = 201;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f12334o = 202;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f12336q = 203;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f12338s = 204;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f12340u = 206;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f12342w = 207;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f12343x = -2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final yh.q<e<?>, SlotWriter, s1, kotlin.b2> f12321b = new yh.q<e<?>, SlotWriter, s1, kotlin.b2>() { // from class: androidx.compose.runtime.ComposerKt$removeCurrentGroupInstance$1
        public final void a(@dl.d e<?> eVar, @dl.d SlotWriter slots, @dl.d s1 rememberManager) {
            kotlin.jvm.internal.f0.p(eVar, "<anonymous parameter 0>");
            kotlin.jvm.internal.f0.p(slots, "slots");
            kotlin.jvm.internal.f0.p(rememberManager, "rememberManager");
            ComposerKt.n0(slots, rememberManager);
        }

        @Override // yh.q
        public /* bridge */ /* synthetic */ kotlin.b2 invoke(e<?> eVar, SlotWriter slotWriter, s1 s1Var) {
            a(eVar, slotWriter, s1Var);
            return kotlin.b2.f124493a;
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final yh.q<e<?>, SlotWriter, s1, kotlin.b2> f12322c = new yh.q<e<?>, SlotWriter, s1, kotlin.b2>() { // from class: androidx.compose.runtime.ComposerKt$skipToGroupEndInstance$1
        public final void a(@dl.d e<?> eVar, @dl.d SlotWriter slots, @dl.d s1 s1Var) {
            kotlin.jvm.internal.f0.p(eVar, "<anonymous parameter 0>");
            kotlin.jvm.internal.f0.p(slots, "slots");
            kotlin.jvm.internal.f0.p(s1Var, "<anonymous parameter 2>");
            slots.b1();
        }

        @Override // yh.q
        public /* bridge */ /* synthetic */ kotlin.b2 invoke(e<?> eVar, SlotWriter slotWriter, s1 s1Var) {
            a(eVar, slotWriter, s1Var);
            return kotlin.b2.f124493a;
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final yh.q<e<?>, SlotWriter, s1, kotlin.b2> f12323d = new yh.q<e<?>, SlotWriter, s1, kotlin.b2>() { // from class: androidx.compose.runtime.ComposerKt$endGroupInstance$1
        public final void a(@dl.d e<?> eVar, @dl.d SlotWriter slots, @dl.d s1 s1Var) {
            kotlin.jvm.internal.f0.p(eVar, "<anonymous parameter 0>");
            kotlin.jvm.internal.f0.p(slots, "slots");
            kotlin.jvm.internal.f0.p(s1Var, "<anonymous parameter 2>");
            slots.R();
        }

        @Override // yh.q
        public /* bridge */ /* synthetic */ kotlin.b2 invoke(e<?> eVar, SlotWriter slotWriter, s1 s1Var) {
            a(eVar, slotWriter, s1Var);
            return kotlin.b2.f124493a;
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final yh.q<e<?>, SlotWriter, s1, kotlin.b2> f12324e = new yh.q<e<?>, SlotWriter, s1, kotlin.b2>() { // from class: androidx.compose.runtime.ComposerKt$startRootGroup$1
        public final void a(@dl.d e<?> eVar, @dl.d SlotWriter slots, @dl.d s1 s1Var) {
            kotlin.jvm.internal.f0.p(eVar, "<anonymous parameter 0>");
            kotlin.jvm.internal.f0.p(slots, "slots");
            kotlin.jvm.internal.f0.p(s1Var, "<anonymous parameter 2>");
            slots.T(0);
        }

        @Override // yh.q
        public /* bridge */ /* synthetic */ kotlin.b2 invoke(e<?> eVar, SlotWriter slotWriter, s1 s1Var) {
            a(eVar, slotWriter, s1Var);
            return kotlin.b2.f124493a;
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final yh.q<e<?>, SlotWriter, s1, kotlin.b2> f12325f = new yh.q<e<?>, SlotWriter, s1, kotlin.b2>() { // from class: androidx.compose.runtime.ComposerKt$resetSlotsInstance$1
        public final void a(@dl.d e<?> eVar, @dl.d SlotWriter slots, @dl.d s1 s1Var) {
            kotlin.jvm.internal.f0.p(eVar, "<anonymous parameter 0>");
            kotlin.jvm.internal.f0.p(slots, "slots");
            kotlin.jvm.internal.f0.p(s1Var, "<anonymous parameter 2>");
            slots.T0();
        }

        @Override // yh.q
        public /* bridge */ /* synthetic */ kotlin.b2 invoke(e<?> eVar, SlotWriter slotWriter, s1 s1Var) {
            a(eVar, slotWriter, s1Var);
            return kotlin.b2.f124493a;
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private static final Object f12331l = new OpaqueKey(com.umeng.analytics.pro.d.M);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private static final Object f12333n = new OpaqueKey(com.umeng.analytics.pro.d.M);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private static final Object f12335p = new OpaqueKey("compositionLocalMap");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private static final Object f12337r = new OpaqueKey("providerValues");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    private static final Object f12339t = new OpaqueKey("providers");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private static final Object f12341v = new OpaqueKey("reference");

    @dl.d
    public static final Void A(@dl.d String message) {
        kotlin.jvm.internal.f0.p(message, "message");
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + message + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @h
    public static final u0.i<v<Object>, m2<Object>> B(k1<?>[] k1VarArr, u0.i<v<Object>, ? extends m2<? extends Object>> iVar, p pVar, int i10) {
        pVar.T(721128344);
        if (g0()) {
            w0(721128344, i10, -1, "androidx.compose.runtime.compositionLocalMapOf (Composer.kt:307)");
        }
        u0.i.a aVarBuilder = u0.a.C().builder();
        for (k1<?> k1Var : k1VarArr) {
            pVar.T(680852989);
            if (k1Var.getCanOverride() || !C(iVar, k1Var.b())) {
                v<?> vVarB = k1Var.b();
                kotlin.jvm.internal.f0.n(vVarB, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
                aVarBuilder.put(vVarB, k1Var.b().e(k1Var.c(), pVar, 72));
            }
            pVar.c0();
        }
        u0.i<v<Object>, m2<Object>> iVarBuild = aVarBuilder.build();
        if (g0()) {
            v0();
        }
        pVar.c0();
        return iVarBuild;
    }

    public static final <T> boolean C(@dl.d u0.i<v<Object>, ? extends m2<? extends Object>> iVar, @dl.d v<T> key) {
        kotlin.jvm.internal.f0.p(iVar, "<this>");
        kotlin.jvm.internal.f0.p(key, "key");
        return iVar.containsKey(key);
    }

    private static final int D(SlotReader w1Var, int i10, int i11) {
        int i12 = 0;
        while (i10 > 0 && i10 != i11) {
            i10 = w1Var.V(i10);
            i12++;
        }
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<q0> E(List<q0> list, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        for (int iF = F(list, i10); iF < list.size(); iF++) {
            q0 q0Var = list.get(iF);
            if (q0Var.getLocation() >= i11) {
                break;
            }
            arrayList.add(q0Var);
        }
        return arrayList;
    }

    private static final int F(List<q0> list, int i10) {
        int iG = G(list, i10);
        return iG < 0 ? -(iG + 1) : iG;
    }

    private static final int G(List<q0> list, int i10) {
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int iT = kotlin.jvm.internal.f0.t(list.get(i12).getLocation(), i10);
            if (iT < 0) {
                i11 = i12 + 1;
            } else {
                if (iT <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q0 H(List<q0> list, int i10, int i11) {
        int iF = F(list, i10);
        if (iF >= list.size()) {
            return null;
        }
        q0 q0Var = list.get(iF);
        if (q0Var.getLocation() < i11) {
            return q0Var;
        }
        return null;
    }

    @dl.d
    public static final Object I() {
        return f12335p;
    }

    @kotlin.r0
    public static /* synthetic */ void J() {
    }

    @kotlin.r0
    public static /* synthetic */ void K() {
    }

    private static /* synthetic */ void L() {
    }

    @dl.d
    public static final Object M() {
        return f12331l;
    }

    @kotlin.r0
    public static /* synthetic */ void N() {
    }

    @kotlin.r0
    public static /* synthetic */ void O() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object P(s0 s0Var) {
        return s0Var.getObjectKey() != null ? new JoinedKey(Integer.valueOf(s0Var.getKey()), s0Var.getObjectKey()) : Integer.valueOf(s0Var.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object Q(Object obj, Object obj2, Object obj3) {
        JoinedKey joinedKey = obj instanceof JoinedKey ? (JoinedKey) obj : null;
        if (joinedKey == null) {
            return null;
        }
        if ((!kotlin.jvm.internal.f0.g(joinedKey.e(), obj2) || !kotlin.jvm.internal.f0.g(joinedKey.f(), obj3)) && (obj = Q(joinedKey.e(), obj2, obj3)) == null) {
            obj = Q(joinedKey.f(), obj2, obj3);
        }
        return obj;
    }

    @dl.d
    public static final Object R() {
        return f12333n;
    }

    @kotlin.r0
    public static /* synthetic */ void S() {
    }

    @kotlin.r0
    public static /* synthetic */ void T() {
    }

    @dl.d
    public static final Object U() {
        return f12339t;
    }

    @kotlin.r0
    public static /* synthetic */ void V() {
    }

    @kotlin.r0
    public static /* synthetic */ void W() {
    }

    @dl.d
    public static final Object X() {
        return f12337r;
    }

    @kotlin.r0
    public static /* synthetic */ void Y() {
    }

    @kotlin.r0
    public static /* synthetic */ void Z() {
    }

    @dl.d
    public static final Object a0() {
        return f12341v;
    }

    @kotlin.r0
    public static /* synthetic */ void b0() {
    }

    @kotlin.r0
    public static /* synthetic */ void c0() {
    }

    @kotlin.r0
    public static /* synthetic */ void d0() {
    }

    public static final <T> T e0(@dl.d u0.i<v<Object>, ? extends m2<? extends Object>> iVar, @dl.d v<T> key) {
        kotlin.jvm.internal.f0.p(iVar, "<this>");
        kotlin.jvm.internal.f0.p(key, "key");
        m2<? extends Object> m2Var = iVar.get(key);
        if (m2Var != null) {
            return (T) m2Var.getValue();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f0(List<q0> list, int i10, RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        int iG = G(list, i10);
        androidx.compose.runtime.collection.c cVar = null;
        if (iG < 0) {
            int i11 = -(iG + 1);
            if (obj != null) {
                cVar = new androidx.compose.runtime.collection.c();
                cVar.add(obj);
            }
            list.add(i11, new q0(recomposeScopeImpl, i10, cVar));
            return;
        }
        if (obj == null) {
            list.get(iG).e(null);
            return;
        }
        androidx.compose.runtime.collection.c<Object> cVarA = list.get(iG).a();
        if (cVarA != null) {
            cVarA.add(obj);
        }
    }

    @m
    public static final boolean g0() {
        y yVar = f12320a;
        return yVar != null && yVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> HashMap<K, LinkedHashSet<V>> h0() {
        return new HashMap<>();
    }

    @dl.d
    public static final u0.i<v<Object>, m2<Object>> i0(@dl.d u0.i<v<Object>, ? extends m2<? extends Object>> iVar, @dl.d yh.l<? super Map<v<Object>, m2<Object>>, kotlin.b2> mutator) {
        kotlin.jvm.internal.f0.p(iVar, "<this>");
        kotlin.jvm.internal.f0.p(mutator, "mutator");
        u0.i.a<v<Object>, ? extends m2<? extends Object>> aVarBuilder = iVar.builder();
        mutator.invoke(aVarBuilder);
        return aVarBuilder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int j0(SlotReader w1Var, int i10, int i11, int i12) {
        if (i10 == i11) {
            return i10;
        }
        if (i10 == i12 || i11 == i12) {
            return i12;
        }
        if (w1Var.V(i10) == i11) {
            return i11;
        }
        if (w1Var.V(i11) == i10) {
            return i10;
        }
        if (w1Var.V(i10) == w1Var.V(i11)) {
            return w1Var.V(i10);
        }
        int iD = D(w1Var, i10, i12);
        int iD2 = D(w1Var, i11, i12);
        int i13 = iD - iD2;
        for (int i14 = 0; i14 < i13; i14++) {
            i10 = w1Var.V(i10);
        }
        int i15 = iD2 - iD;
        for (int i16 = 0; i16 < i15; i16++) {
            i11 = w1Var.V(i11);
        }
        while (i10 != i11) {
            i10 = w1Var.V(i10);
            i11 = w1Var.V(i11);
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> V k0(HashMap<K, LinkedHashSet<V>> map, K k10) {
        V v10;
        LinkedHashSet<V> linkedHashSet = map.get(k10);
        if (linkedHashSet == null || (v10 = (V) CollectionsKt___CollectionsKt.z2(linkedHashSet)) == null) {
            return null;
        }
        m0(map, k10, v10);
        return v10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> boolean l0(HashMap<K, LinkedHashSet<V>> map, K k10, V v10) {
        LinkedHashSet<V> linkedHashSet = map.get(k10);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet<>();
            map.put(k10, linkedHashSet);
        }
        return linkedHashSet.add(v10);
    }

    private static final <K, V> kotlin.b2 m0(HashMap<K, LinkedHashSet<V>> map, K k10, V v10) {
        LinkedHashSet<V> linkedHashSet = map.get(k10);
        if (linkedHashSet == null) {
            return null;
        }
        linkedHashSet.remove(v10);
        if (linkedHashSet.isEmpty()) {
            map.remove(k10);
        }
        return kotlin.b2.f124493a;
    }

    public static final void n0(@dl.d SlotWriter a2Var, @dl.d s1 rememberManager) {
        RecomposeScopeImpl recomposeScopeImpl;
        t tVarL;
        kotlin.jvm.internal.f0.p(a2Var, "<this>");
        kotlin.jvm.internal.f0.p(rememberManager, "rememberManager");
        Iterator<Object> itJ0 = a2Var.j0();
        while (itJ0.hasNext()) {
            Object next = itJ0.next();
            if (next instanceof t1) {
                rememberManager.a((t1) next);
            } else if ((next instanceof RecomposeScopeImpl) && (tVarL = (recomposeScopeImpl = (RecomposeScopeImpl) next).getComposition()) != null) {
                tVarL.S(true);
                recomposeScopeImpl.x();
            }
        }
        a2Var.Q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q0 o0(List<q0> list, int i10) {
        int iG = G(list, i10);
        if (iG >= 0) {
            return list.remove(iG);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p0(List<q0> list, int i10, int i11) {
        int iF = F(list, i10);
        while (iF < list.size() && list.get(iF).getLocation() < i11) {
            list.remove(iF);
        }
    }

    public static final void q0(boolean z10) {
        if (z10) {
            return;
        }
        A("Check failed".toString());
        throw new KotlinNothingValueException();
    }

    public static final void r0(boolean z10, @dl.d yh.a<? extends Object> lazyMessage) {
        kotlin.jvm.internal.f0.p(lazyMessage, "lazyMessage");
        if (z10) {
            return;
        }
        A(lazyMessage.invoke().toString());
        throw new KotlinNothingValueException();
    }

    @m
    public static final void s0(@dl.d p composer, @dl.d String sourceInformation) {
        kotlin.jvm.internal.f0.p(composer, "composer");
        kotlin.jvm.internal.f0.p(sourceInformation, "sourceInformation");
        composer.k(sourceInformation);
    }

    @m
    public static final void t0(@dl.d p composer) {
        kotlin.jvm.internal.f0.p(composer, "composer");
        composer.r();
    }

    @m
    public static final void u0(@dl.d p composer, int i10, @dl.d String sourceInformation) {
        kotlin.jvm.internal.f0.p(composer, "composer");
        kotlin.jvm.internal.f0.p(sourceInformation, "sourceInformation");
        composer.m(i10, sourceInformation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean v(int i10) {
        return i10 != 0;
    }

    @m
    public static final void v0() {
        y yVar = f12320a;
        if (yVar != null) {
            yVar.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int w(boolean z10) {
        return z10 ? 1 : 0;
    }

    @m
    public static final void w0(int i10, int i11, int i12, @dl.d String info) {
        kotlin.jvm.internal.f0.p(info, "info");
        y yVar = f12320a;
        if (yVar != null) {
            yVar.b(i10, i11, i12, info);
        }
    }

    @m
    public static final <T> T x(@dl.d p pVar, boolean z10, @dl.d yh.a<? extends T> block) {
        kotlin.jvm.internal.f0.p(pVar, "<this>");
        kotlin.jvm.internal.f0.p(block, "block");
        T t10 = (T) pVar.U();
        if (!z10 && t10 != p.INSTANCE.a()) {
            return t10;
        }
        T tInvoke = block.invoke();
        pVar.N(tInvoke);
        return tInvoke;
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Use the overload with $dirty metadata instead", replaceWith = @kotlin.s0(expression = "traceEventStart(key, dirty1, dirty2, info)", imports = {}))
    @m
    public static final /* synthetic */ void x0(int i10, String info) {
        kotlin.jvm.internal.f0.p(info, "info");
        w0(i10, -1, -1, info);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Object> y(x1 x1Var, c cVar) {
        ArrayList arrayList = new ArrayList();
        SlotReader w1VarU = x1Var.U();
        try {
            z(w1VarU, arrayList, x1Var.j(cVar));
            kotlin.b2 b2Var = kotlin.b2.f124493a;
            return arrayList;
        } finally {
            w1VarU.e();
        }
    }

    private static final void z(SlotReader w1Var, List<Object> list, int i10) {
        if (w1Var.P(i10)) {
            list.add(w1Var.R(i10));
            return;
        }
        int iK = i10 + 1;
        int iK2 = i10 + w1Var.K(i10);
        while (iK < iK2) {
            z(w1Var, list, iK);
            iK += w1Var.K(iK);
        }
    }
}
