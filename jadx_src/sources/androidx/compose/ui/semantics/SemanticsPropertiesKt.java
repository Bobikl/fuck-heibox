package androidx.compose.ui.semantics;

import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.o0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.model.puzzle.BasePuzzleInfo;
import com.umeng.analytics.pro.ak;
import io.flutter.plugin.editing.SpellCheckPlugin;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.u;

/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000¾\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\u001a\u0015\u0010\u0001\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\u001a-\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0082\b\u001a\n\u0010\f\u001a\u00020\u000b*\u00020\n\u001a\n\u0010\r\u001a\u00020\u000b*\u00020\n\u001a\f\u0010\u000e\u001a\u00020\u000b*\u00020\nH\u0007\u001a\n\u0010\u000f\u001a\u00020\u000b*\u00020\n\u001a\n\u0010\u0010\u001a\u00020\u000b*\u00020\n\u001a\n\u0010\u0011\u001a\u00020\u000b*\u00020\n\u001a\u0012\u0010\u0013\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0005\u001a\u001e\u0010\u0018\u001a\u00020\u000b*\u00020\n2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014\u001a\n\u0010\u0019\u001a\u00020\u000b*\u00020\n\u001a2\u0010\u001e\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u001a\u0010\u001d\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0014\u001a&\u0010 \u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001f\u001a&\u0010!\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001f\u001aP\u0010'\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000528\u0010\u001d\u001a4\u0012\u0013\u0012\u00110#¢\u0006\f\b$\u0012\b\b\u0006\u0012\u0004\b\b(%\u0012\u0013\u0012\u00110#¢\u0006\f\b$\u0012\b\b\u0006\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u0004\u0018\u00010\"\u001a*\u0010(\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00040\u0014\u001a,\u0010)\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0014\u001a,\u0010+\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0014\u001ae\u00100\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052M\u0010\u001d\u001aI\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b$\u0012\b\b\u0006\u0012\u0004\b\b(-\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b$\u0012\b\b\u0006\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b$\u0012\b\b\u0006\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u0004\u0018\u00010,\u001a&\u00101\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001f\u001a&\u00102\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001f\u001a&\u00103\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001f\u001a&\u00104\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001f\u001a&\u00105\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001f\u001a&\u00106\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001f\u001a&\u00107\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001f\"/\u0010?\u001a\u00020\u0005*\u00020\n2\u0006\u00108\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>\"/\u0010E\u001a\u00020@*\u00020\n2\u0006\u00108\u001a\u00020@8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010:\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D\"/\u0010H\u001a\u00020\u0005*\u00020\n2\u0006\u00108\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bF\u0010:\u001a\u0004\b&\u0010<\"\u0004\bG\u0010>\"2\u0010M\u001a\u00020I*\u00020\n2\u0006\u00108\u001a\u00020I8F@FX\u0086\u008e\u0002ø\u0001\u0000¢\u0006\u0012\n\u0004\b1\u0010:\u001a\u0004\b%\u0010J\"\u0004\bK\u0010L\"/\u0010S\u001a\u00020\u0004*\u00020\n2\u0006\u00108\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bN\u0010:\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010R\"/\u0010Y\u001a\u00020T*\u00020\n2\u0006\u00108\u001a\u00020T8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010:\u001a\u0004\bU\u0010V\"\u0004\bW\u0010X\"/\u0010]\u001a\u00020T*\u00020\n2\u0006\u00108\u001a\u00020T8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bZ\u0010:\u001a\u0004\b[\u0010V\"\u0004\b\\\u0010X\"2\u0010a\u001a\u00020^*\u00020\n2\u0006\u00108\u001a\u00020^8F@FX\u0086\u008e\u0002ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u0010\u0010:\u001a\u0004\b_\u0010J\"\u0004\b`\u0010L\"/\u0010d\u001a\u00020\u0005*\u00020\n2\u0006\u00108\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010:\u001a\u0004\bb\u0010<\"\u0004\bc\u0010>\"/\u0010i\u001a\u00020**\u00020\n2\u0006\u00108\u001a\u00020*8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b6\u0010:\u001a\u0004\be\u0010f\"\u0004\bg\u0010h\"2\u0010p\u001a\u00020j*\u00020\n2\u0006\u00108\u001a\u00020j8F@FX\u0086\u008e\u0002ø\u0001\u0000¢\u0006\u0012\n\u0004\bk\u0010:\u001a\u0004\bl\u0010m\"\u0004\bn\u0010o\"2\u0010t\u001a\u00020q*\u00020\n2\u0006\u00108\u001a\u00020q8F@FX\u0086\u008e\u0002ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u0013\u0010:\u001a\u0004\br\u0010J\"\u0004\bs\u0010L\"/\u0010w\u001a\u00020\u0004*\u00020\n2\u0006\u00108\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010:\u001a\u0004\bu\u0010P\"\u0004\bv\u0010R\"/\u0010~\u001a\u00020x*\u00020\n2\u0006\u00108\u001a\u00020x8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\by\u0010:\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}\"4\u0010\u0084\u0001\u001a\u00020\u007f*\u00020\n2\u0006\u00108\u001a\u00020\u007f8F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0004\bz\u0010:\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001\"7\u0010\u008a\u0001\u001a\u00030\u0085\u0001*\u00020\n2\u0007\u00108\u001a\u00030\u0085\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b\u0080\u0001\u0010:\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001\"E\u0010\u0092\u0001\u001a\n\u0012\u0005\u0012\u00030\u008c\u00010\u008b\u0001*\u00020\n2\u000e\u00108\u001a\n\u0012\u0005\u0012\u00030\u008c\u00010\u008b\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b\u008d\u0001\u0010:\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001\",\u0010\u0095\u0001\u001a\u00020\u0005*\u00020\n2\u0007\u0010\u0093\u0001\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u008d\u0001\u0010<\"\u0005\b\u0094\u0001\u0010>\",\u0010\u0098\u0001\u001a\u00020**\u00020\n2\u0007\u0010\u0093\u0001\u001a\u00020*8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0096\u0001\u0010f\"\u0005\b\u0097\u0001\u0010h\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0099\u0001"}, d2 = {androidx.exifinterface.media.a.f23244d5, "B0", "()Ljava/lang/Object;", "Lkotlin/u;", "", "", "name", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/compose/ui/semantics/a;", ak.av, "Landroidx/compose/ui/semantics/r;", "Lkotlin/b2;", "K", "j", "M", "U", "i", "R", "description", "m", "Lkotlin/Function1;", "", "", "mapping", "L", "b0", BasePuzzleInfo.PUZZLE_TYPE_LABEL, "", "Landroidx/compose/ui/text/i0;", "action", "F", "Lkotlin/Function0;", "N", "P", "Lkotlin/Function2;", "", "Lkotlin/m0;", "x", "y", "X", "Z", "m0", "Landroidx/compose/ui/text/d;", "w0", "Lkotlin/Function3;", SpellCheckPlugin.START_INDEX_KEY, SpellCheckPlugin.END_INDEX_KEY, "traversalMode", "r0", "e", "g", androidx.exifinterface.media.a.R4, "n", ak.aF, "k", androidx.exifinterface.media.a.X4, "<set-?>", "b", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "C", "(Landroidx/compose/ui/semantics/r;)Ljava/lang/String;", "t0", "(Landroidx/compose/ui/semantics/r;Ljava/lang/String;)V", "stateDescription", "Landroidx/compose/ui/semantics/f;", ak.aD, "(Landroidx/compose/ui/semantics/r;)Landroidx/compose/ui/semantics/f;", "o0", "(Landroidx/compose/ui/semantics/r;Landroidx/compose/ui/semantics/f;)V", "progressBarRangeInfo", "d", "l0", "paneTitle", "Landroidx/compose/ui/semantics/e;", "(Landroidx/compose/ui/semantics/r;)I", "k0", "(Landroidx/compose/ui/semantics/r;I)V", "liveRegion", "f", ak.aG, "(Landroidx/compose/ui/semantics/r;)Z", "h0", "(Landroidx/compose/ui/semantics/r;Z)V", "focused", "Landroidx/compose/ui/semantics/h;", "v", "(Landroidx/compose/ui/semantics/r;)Landroidx/compose/ui/semantics/h;", "i0", "(Landroidx/compose/ui/semantics/r;Landroidx/compose/ui/semantics/h;)V", "horizontalScrollAxisRange", RXScreenCaptureService.KEY_HEIGHT, "J", "A0", "verticalScrollAxisRange", "Landroidx/compose/ui/semantics/g;", androidx.exifinterface.media.a.W4, "p0", "role", "D", "u0", "testTag", "t", "(Landroidx/compose/ui/semantics/r;)Landroidx/compose/ui/text/d;", "g0", "(Landroidx/compose/ui/semantics/r;Landroidx/compose/ui/text/d;)V", "editableText", "Landroidx/compose/ui/text/o0;", "l", "H", "(Landroidx/compose/ui/semantics/r;)J", "y0", "(Landroidx/compose/ui/semantics/r;J)V", "textSelectionRange", "Landroidx/compose/ui/text/input/o;", RXScreenCaptureService.KEY_WIDTH, "j0", "imeAction", "B", "q0", "selected", "Landroidx/compose/ui/semantics/b;", "o", "p", "(Landroidx/compose/ui/semantics/r;)Landroidx/compose/ui/semantics/b;", "c0", "(Landroidx/compose/ui/semantics/r;Landroidx/compose/ui/semantics/b;)V", "collectionInfo", "Landroidx/compose/ui/semantics/c;", "q", "(Landroidx/compose/ui/semantics/r;)Landroidx/compose/ui/semantics/c;", "d0", "(Landroidx/compose/ui/semantics/r;Landroidx/compose/ui/semantics/c;)V", "collectionItemInfo", "Landroidx/compose/ui/state/ToggleableState;", "I", "(Landroidx/compose/ui/semantics/r;)Landroidx/compose/ui/state/ToggleableState;", "z0", "(Landroidx/compose/ui/semantics/r;Landroidx/compose/ui/state/ToggleableState;)V", "toggleableState", "", "Landroidx/compose/ui/semantics/d;", "r", ak.aB, "(Landroidx/compose/ui/semantics/r;)Ljava/util/List;", "f0", "(Landroidx/compose/ui/semantics/r;Ljava/util/List;)V", "customActions", "value", "e0", "contentDescription", androidx.exifinterface.media.a.S4, "v0", "text", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class SemanticsPropertiesKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.n<Object>[] f16070a = {n0.k(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), n0.k(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1)), n0.k(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), n0.k(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), n0.k(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), n0.k(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), n0.k(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), n0.k(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), n0.k(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), n0.k(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), n0.k(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1)), n0.k(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), n0.k(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), n0.k(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1)), n0.k(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1)), n0.k(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1)), n0.k(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final SemanticsPropertyKey f16071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final SemanticsPropertyKey f16072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final SemanticsPropertyKey f16073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final SemanticsPropertyKey f16074e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final SemanticsPropertyKey f16075f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final SemanticsPropertyKey f16076g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final SemanticsPropertyKey f16077h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final SemanticsPropertyKey f16078i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private static final SemanticsPropertyKey f16079j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private static final SemanticsPropertyKey f16080k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private static final SemanticsPropertyKey f16081l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private static final SemanticsPropertyKey f16082m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private static final SemanticsPropertyKey f16083n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private static final SemanticsPropertyKey f16084o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private static final SemanticsPropertyKey f16085p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private static final SemanticsPropertyKey f16086q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private static final SemanticsPropertyKey f16087r;

    static {
        SemanticsProperties semanticsProperties = SemanticsProperties.f16032a;
        f16071b = semanticsProperties.w();
        f16072c = semanticsProperties.s();
        f16073d = semanticsProperties.q();
        f16074e = semanticsProperties.p();
        f16075f = semanticsProperties.g();
        f16076g = semanticsProperties.i();
        f16077h = semanticsProperties.B();
        f16078i = semanticsProperties.t();
        f16079j = semanticsProperties.x();
        f16080k = semanticsProperties.e();
        f16081l = semanticsProperties.z();
        f16082m = semanticsProperties.j();
        f16083n = semanticsProperties.v();
        f16084o = semanticsProperties.a();
        f16085p = semanticsProperties.b();
        f16086q = semanticsProperties.A();
        f16087r = i.f16129a.c();
    }

    public static final int A(@dl.d r rVar) {
        f0.p(rVar, "<this>");
        return ((g) f16078i.c(rVar, f16070a[7])).getValue();
    }

    public static final void A0(@dl.d r rVar, @dl.d ScrollAxisRange hVar) {
        f0.p(rVar, "<this>");
        f0.p(hVar, "<set-?>");
        f16077h.e(rVar, f16070a[6], hVar);
    }

    public static final boolean B(@dl.d r rVar) {
        f0.p(rVar, "<this>");
        return ((Boolean) f16083n.c(rVar, f16070a[12])).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T B0() {
        throw new UnsupportedOperationException("You cannot retrieve a semantics property directly - use one of the SemanticsConfiguration.getOr* methods instead");
    }

    @dl.d
    public static final String C(@dl.d r rVar) {
        f0.p(rVar, "<this>");
        return (String) f16071b.c(rVar, f16070a[0]);
    }

    @dl.d
    public static final String D(@dl.d r rVar) {
        f0.p(rVar, "<this>");
        return (String) f16079j.c(rVar, f16070a[8]);
    }

    @dl.d
    public static final androidx.compose.ui.text.d E(@dl.d r rVar) {
        f0.p(rVar, "<this>");
        return (androidx.compose.ui.text.d) B0();
    }

    public static final void F(@dl.d r rVar, @dl.e String str, @dl.e yh.l<? super List<TextLayoutResult>, Boolean> lVar) {
        f0.p(rVar, "<this>");
        rVar.a(i.f16129a.g(), new AccessibilityAction(str, lVar));
    }

    public static /* synthetic */ void G(r rVar, String str, yh.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        F(rVar, str, lVar);
    }

    public static final long H(@dl.d r rVar) {
        f0.p(rVar, "<this>");
        return ((o0) f16081l.c(rVar, f16070a[10])).getPackedValue();
    }

    @dl.d
    public static final ToggleableState I(@dl.d r rVar) {
        f0.p(rVar, "<this>");
        return (ToggleableState) f16086q.c(rVar, f16070a[15]);
    }

    @dl.d
    public static final ScrollAxisRange J(@dl.d r rVar) {
        f0.p(rVar, "<this>");
        return (ScrollAxisRange) f16077h.c(rVar, f16070a[6]);
    }

    public static final void K(@dl.d r rVar) {
        f0.p(rVar, "<this>");
        rVar.a(SemanticsProperties.f16032a.h(), b2.f124493a);
    }

    public static final void L(@dl.d r rVar, @dl.d yh.l<Object, Integer> mapping) {
        f0.p(rVar, "<this>");
        f0.p(mapping, "mapping");
        rVar.a(SemanticsProperties.f16032a.k(), mapping);
    }

    @androidx.compose.ui.g
    public static final void M(@dl.d r rVar) {
        f0.p(rVar, "<this>");
        rVar.a(SemanticsProperties.f16032a.l(), b2.f124493a);
    }

    public static final void N(@dl.d r rVar, @dl.e String str, @dl.e yh.a<Boolean> aVar) {
        f0.p(rVar, "<this>");
        rVar.a(i.f16129a.h(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void O(r rVar, String str, yh.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        N(rVar, str, aVar);
    }

    public static final void P(@dl.d r rVar, @dl.e String str, @dl.e yh.a<Boolean> aVar) {
        f0.p(rVar, "<this>");
        rVar.a(i.f16129a.i(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void Q(r rVar, String str, yh.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        P(rVar, str, aVar);
    }

    public static final void R(@dl.d r rVar) {
        f0.p(rVar, "<this>");
        rVar.a(SemanticsProperties.f16032a.r(), b2.f124493a);
    }

    public static final void S(@dl.d r rVar, @dl.e String str, @dl.e yh.a<Boolean> aVar) {
        f0.p(rVar, "<this>");
        rVar.a(i.f16129a.j(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void T(r rVar, String str, yh.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        S(rVar, str, aVar);
    }

    public static final void U(@dl.d r rVar) {
        f0.p(rVar, "<this>");
        rVar.a(SemanticsProperties.f16032a.o(), b2.f124493a);
    }

    public static final void V(@dl.d r rVar, @dl.e String str, @dl.e yh.a<Boolean> aVar) {
        f0.p(rVar, "<this>");
        rVar.a(i.f16129a.k(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void W(r rVar, String str, yh.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        V(rVar, str, aVar);
    }

    public static final void X(@dl.d r rVar, @dl.e String str, @dl.e yh.p<? super Float, ? super Float, Boolean> pVar) {
        f0.p(rVar, "<this>");
        rVar.a(i.f16129a.l(), new AccessibilityAction(str, pVar));
    }

    public static /* synthetic */ void Y(r rVar, String str, yh.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        X(rVar, str, pVar);
    }

    public static final void Z(@dl.d r rVar, @dl.e String str, @dl.d yh.l<? super Integer, Boolean> action) {
        f0.p(rVar, "<this>");
        f0.p(action, "action");
        rVar.a(i.f16129a.m(), new AccessibilityAction(str, action));
    }

    private static final <T extends u<? extends Boolean>> SemanticsPropertyKey<AccessibilityAction<T>> a(String str) {
        return new SemanticsPropertyKey<>(str, SemanticsPropertiesKt$ActionPropertyKey$1.f16088b);
    }

    public static /* synthetic */ void a0(r rVar, String str, yh.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        Z(rVar, str, lVar);
    }

    public static final void b0(@dl.d r rVar) {
        f0.p(rVar, "<this>");
        rVar.a(SemanticsProperties.f16032a.u(), b2.f124493a);
    }

    public static final void c(@dl.d r rVar, @dl.e String str, @dl.e yh.a<Boolean> aVar) {
        f0.p(rVar, "<this>");
        rVar.a(i.f16129a.a(), new AccessibilityAction(str, aVar));
    }

    public static final void c0(@dl.d r rVar, @dl.d b bVar) {
        f0.p(rVar, "<this>");
        f0.p(bVar, "<set-?>");
        f16084o.e(rVar, f16070a[13], bVar);
    }

    public static /* synthetic */ void d(r rVar, String str, yh.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        c(rVar, str, aVar);
    }

    public static final void d0(@dl.d r rVar, @dl.d c cVar) {
        f0.p(rVar, "<this>");
        f0.p(cVar, "<set-?>");
        f16085p.e(rVar, f16070a[14], cVar);
    }

    public static final void e(@dl.d r rVar, @dl.e String str, @dl.e yh.a<Boolean> aVar) {
        f0.p(rVar, "<this>");
        rVar.a(i.f16129a.b(), new AccessibilityAction(str, aVar));
    }

    public static final void e0(@dl.d r rVar, @dl.d String value) {
        f0.p(rVar, "<this>");
        f0.p(value, "value");
        rVar.a(SemanticsProperties.f16032a.c(), kotlin.collections.s.k(value));
    }

    public static /* synthetic */ void f(r rVar, String str, yh.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        e(rVar, str, aVar);
    }

    public static final void f0(@dl.d r rVar, @dl.d List<CustomAccessibilityAction> list) {
        f0.p(rVar, "<this>");
        f0.p(list, "<set-?>");
        f16087r.e(rVar, f16070a[16], list);
    }

    public static final void g(@dl.d r rVar, @dl.e String str, @dl.e yh.a<Boolean> aVar) {
        f0.p(rVar, "<this>");
        rVar.a(i.f16129a.d(), new AccessibilityAction(str, aVar));
    }

    public static final void g0(@dl.d r rVar, @dl.d androidx.compose.ui.text.d dVar) {
        f0.p(rVar, "<this>");
        f0.p(dVar, "<set-?>");
        f16080k.e(rVar, f16070a[9], dVar);
    }

    public static /* synthetic */ void h(r rVar, String str, yh.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        g(rVar, str, aVar);
    }

    public static final void h0(@dl.d r rVar, boolean z10) {
        f0.p(rVar, "<this>");
        f16075f.e(rVar, f16070a[4], Boolean.valueOf(z10));
    }

    public static final void i(@dl.d r rVar) {
        f0.p(rVar, "<this>");
        rVar.a(SemanticsProperties.f16032a.n(), b2.f124493a);
    }

    public static final void i0(@dl.d r rVar, @dl.d ScrollAxisRange hVar) {
        f0.p(rVar, "<this>");
        f0.p(hVar, "<set-?>");
        f16076g.e(rVar, f16070a[5], hVar);
    }

    public static final void j(@dl.d r rVar) {
        f0.p(rVar, "<this>");
        rVar.a(SemanticsProperties.f16032a.d(), b2.f124493a);
    }

    public static final void j0(@dl.d r imeAction, int i10) {
        f0.p(imeAction, "$this$imeAction");
        f16082m.e(imeAction, f16070a[11], androidx.compose.ui.text.input.o.i(i10));
    }

    public static final void k(@dl.d r rVar, @dl.e String str, @dl.e yh.a<Boolean> aVar) {
        f0.p(rVar, "<this>");
        rVar.a(i.f16129a.e(), new AccessibilityAction(str, aVar));
    }

    public static final void k0(@dl.d r liveRegion, int i10) {
        f0.p(liveRegion, "$this$liveRegion");
        f16074e.e(liveRegion, f16070a[3], e.c(i10));
    }

    public static /* synthetic */ void l(r rVar, String str, yh.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        k(rVar, str, aVar);
    }

    public static final void l0(@dl.d r rVar, @dl.d String str) {
        f0.p(rVar, "<this>");
        f0.p(str, "<set-?>");
        f16073d.e(rVar, f16070a[2], str);
    }

    public static final void m(@dl.d r rVar, @dl.d String description) {
        f0.p(rVar, "<this>");
        f0.p(description, "description");
        rVar.a(SemanticsProperties.f16032a.f(), description);
    }

    public static final void m0(@dl.d r rVar, @dl.e String str, @dl.e yh.l<? super Float, Boolean> lVar) {
        f0.p(rVar, "<this>");
        rVar.a(i.f16129a.n(), new AccessibilityAction(str, lVar));
    }

    public static final void n(@dl.d r rVar, @dl.e String str, @dl.e yh.a<Boolean> aVar) {
        f0.p(rVar, "<this>");
        rVar.a(i.f16129a.f(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void n0(r rVar, String str, yh.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        m0(rVar, str, lVar);
    }

    public static /* synthetic */ void o(r rVar, String str, yh.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        n(rVar, str, aVar);
    }

    public static final void o0(@dl.d r rVar, @dl.d ProgressBarRangeInfo fVar) {
        f0.p(rVar, "<this>");
        f0.p(fVar, "<set-?>");
        f16072c.e(rVar, f16070a[1], fVar);
    }

    @dl.d
    public static final b p(@dl.d r rVar) {
        f0.p(rVar, "<this>");
        return (b) f16084o.c(rVar, f16070a[13]);
    }

    public static final void p0(@dl.d r role, int i10) {
        f0.p(role, "$this$role");
        f16078i.e(role, f16070a[7], g.g(i10));
    }

    @dl.d
    public static final c q(@dl.d r rVar) {
        f0.p(rVar, "<this>");
        return (c) f16085p.c(rVar, f16070a[14]);
    }

    public static final void q0(@dl.d r rVar, boolean z10) {
        f0.p(rVar, "<this>");
        f16083n.e(rVar, f16070a[12], Boolean.valueOf(z10));
    }

    @dl.d
    public static final String r(@dl.d r rVar) {
        f0.p(rVar, "<this>");
        return (String) B0();
    }

    public static final void r0(@dl.d r rVar, @dl.e String str, @dl.e yh.q<? super Integer, ? super Integer, ? super Boolean, Boolean> qVar) {
        f0.p(rVar, "<this>");
        rVar.a(i.f16129a.o(), new AccessibilityAction(str, qVar));
    }

    @dl.d
    public static final List<CustomAccessibilityAction> s(@dl.d r rVar) {
        f0.p(rVar, "<this>");
        return (List) f16087r.c(rVar, f16070a[16]);
    }

    public static /* synthetic */ void s0(r rVar, String str, yh.q qVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        r0(rVar, str, qVar);
    }

    @dl.d
    public static final androidx.compose.ui.text.d t(@dl.d r rVar) {
        f0.p(rVar, "<this>");
        return (androidx.compose.ui.text.d) f16080k.c(rVar, f16070a[9]);
    }

    public static final void t0(@dl.d r rVar, @dl.d String str) {
        f0.p(rVar, "<this>");
        f0.p(str, "<set-?>");
        f16071b.e(rVar, f16070a[0], str);
    }

    public static final boolean u(@dl.d r rVar) {
        f0.p(rVar, "<this>");
        return ((Boolean) f16075f.c(rVar, f16070a[4])).booleanValue();
    }

    public static final void u0(@dl.d r rVar, @dl.d String str) {
        f0.p(rVar, "<this>");
        f0.p(str, "<set-?>");
        f16079j.e(rVar, f16070a[8], str);
    }

    @dl.d
    public static final ScrollAxisRange v(@dl.d r rVar) {
        f0.p(rVar, "<this>");
        return (ScrollAxisRange) f16076g.c(rVar, f16070a[5]);
    }

    public static final void v0(@dl.d r rVar, @dl.d androidx.compose.ui.text.d value) {
        f0.p(rVar, "<this>");
        f0.p(value, "value");
        rVar.a(SemanticsProperties.f16032a.y(), kotlin.collections.s.k(value));
    }

    public static final int w(@dl.d r rVar) {
        f0.p(rVar, "<this>");
        return ((androidx.compose.ui.text.input.o) f16082m.c(rVar, f16070a[11])).getValue();
    }

    public static final void w0(@dl.d r rVar, @dl.e String str, @dl.e yh.l<? super androidx.compose.ui.text.d, Boolean> lVar) {
        f0.p(rVar, "<this>");
        rVar.a(i.f16129a.p(), new AccessibilityAction(str, lVar));
    }

    public static final int x(@dl.d r rVar) {
        f0.p(rVar, "<this>");
        return ((e) f16074e.c(rVar, f16070a[3])).getValue();
    }

    public static /* synthetic */ void x0(r rVar, String str, yh.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        w0(rVar, str, lVar);
    }

    @dl.d
    public static final String y(@dl.d r rVar) {
        f0.p(rVar, "<this>");
        return (String) f16073d.c(rVar, f16070a[2]);
    }

    public static final void y0(@dl.d r textSelectionRange, long j10) {
        f0.p(textSelectionRange, "$this$textSelectionRange");
        f16081l.e(textSelectionRange, f16070a[10], o0.b(j10));
    }

    @dl.d
    public static final ProgressBarRangeInfo z(@dl.d r rVar) {
        f0.p(rVar, "<this>");
        return (ProgressBarRangeInfo) f16072c.c(rVar, f16070a[1]);
    }

    public static final void z0(@dl.d r rVar, @dl.d ToggleableState toggleableState) {
        f0.p(rVar, "<this>");
        f0.p(toggleableState, "<set-?>");
        f16086q.e(rVar, f16070a[15], toggleableState);
    }
}
