package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.compose.ui.R;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.platform.accessibility.CollectionInfoKt;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesAndroid;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.lifecycle.Lifecycle;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0096\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\b\u0000\u0018\u0000 l2\u00020\u0001:\f\u0083\u0001\u0089\u0001\u008c\u0001\u0093\u0001\u0096\u0001\u0099\u0001B\u0012\u0012\u0007\u0010\u0082\u0001\u001a\u00020}¢\u0006\u0006\bÁ\u0001\u0010Â\u0001J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J=\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J?\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\"\u0010$\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002J*\u0010&\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00132\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002J\u001c\u0010+\u001a\u0004\u0018\u00010*2\b\u0010'\u001a\u0004\u0018\u00010\u00062\u0006\u0010)\u001a\u00020(H\u0002J\u0010\u0010,\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J/\u00100\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010.*\u00020-2\b\u0010\u001d\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010/\u001a\u00020\u0002H\u0002¢\u0006\u0004\b0\u00101J\u0010\u00104\u001a\u00020\n2\u0006\u00103\u001a\u000202H\u0002J\u001e\u00107\u001a\u00020\n2\u0006\u00103\u001a\u0002022\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000205H\u0002J\b\u00108\u001a\u00020\nH\u0002J\b\u00109\u001a\u00020\nH\u0002J\u001e\u0010=\u001a\u00020\r2\u0006\u0010:\u001a\u00020\u00022\f\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u0012H\u0002J\u0010\u0010?\u001a\u00020\n2\u0006\u0010>\u001a\u00020;H\u0002J\"\u0010B\u001a\u00020\n2\u0006\u0010@\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010A\u001a\u0004\u0018\u00010\u0013H\u0002J\u0018\u0010F\u001a\u00020\n2\u0006\u0010C\u001a\u00020\u00062\u0006\u0010E\u001a\u00020DH\u0002J\u0010\u0010G\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\u0002H\u0002J(\u0010K\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010H\u001a\u00020\u00022\u0006\u0010I\u001a\u00020\r2\u0006\u0010J\u001a\u00020\rH\u0002J\u0010\u0010L\u001a\u00020\n2\u0006\u0010@\u001a\u00020\u0002H\u0002J(\u0010P\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\u00022\u0006\u0010N\u001a\u00020\u00022\u0006\u0010O\u001a\u00020\rH\u0002J\u0010\u0010Q\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010R\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010S\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001c\u0010U\u001a\u0004\u0018\u00010T2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010H\u001a\u00020\u0002H\u0002J\u0014\u0010V\u001a\u0004\u0018\u00010\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u000e\u0010Y\u001a\u0004\u0018\u00010X*\u00020WH\u0002J-\u0010^\u001a\u00020\r2\u0006\u0010Z\u001a\u00020\r2\u0006\u0010[\u001a\u00020\u00022\u0006\u0010]\u001a\u00020\\H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b^\u0010_J;\u0010c\u001a\u00020\r2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020a0`2\u0006\u0010Z\u001a\u00020\r2\u0006\u0010[\u001a\u00020\u00022\u0006\u0010]\u001a\u00020\\H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bc\u0010dJ \u0010f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010e\u001a\u00020\u0006H\u0007J\u001f\u0010g\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0001¢\u0006\u0004\bg\u0010hJ\u000e\u0010j\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020iJ\u001f\u0010m\u001a\u00020\u00022\u0006\u0010l\u001a\u00020k2\u0006\u0010V\u001a\u00020kH\u0001¢\u0006\u0004\bm\u0010nJ\u0010\u0010r\u001a\u00020q2\u0006\u0010p\u001a\u00020oH\u0016J\u000f\u0010s\u001a\u00020\nH\u0000¢\u0006\u0004\bs\u0010tJ\u0013\u0010u\u001a\u00020\nH\u0086@ø\u0001\u0001¢\u0006\u0004\bu\u0010vJ\u0017\u0010w\u001a\u00020\n2\u0006\u00103\u001a\u000202H\u0000¢\u0006\u0004\bw\u0010xJ#\u0010{\u001a\u00020\n2\u0012\u0010z\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020a0yH\u0001¢\u0006\u0004\b{\u0010|R\u001a\u0010\u0082\u0001\u001a\u00020}8\u0006¢\u0006\u000e\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R'\u0010\u0087\u0001\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b\u0083\u0001\u00104\u001a\u0005\bl\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R(\u0010\u0091\u0001\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u008c\u0001\u0010L\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0018\u0010\u0095\u0001\u001a\u00030\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0019\u0010\u0098\u0001\u001a\u00020q8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0018\u0010\u009a\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0099\u0001\u00104R'\u0010\u009e\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020-0\u009b\u00010\u009b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R,\u0010 \u0001\u001a\u0015\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00020y0\u009b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u009d\u0001R\u0017\u0010¡\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u00104R\u001a\u0010£\u0001\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bu\u0010¢\u0001R\u001c\u0010¥\u0001\u001a\b\u0012\u0004\u0012\u000202058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b^\u0010¤\u0001R\u001d\u0010¨\u0001\u001a\t\u0012\u0004\u0012\u00020\n0¦\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bc\u0010§\u0001R\u0017\u0010©\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010LR\u001b\u0010¬\u0001\u001a\u0005\u0018\u00010ª\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b \u0010«\u0001R+\u0010b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020a0y8B@\u0002X\u0082\u000e¢\u0006\u000f\n\u0005\bg\u0010\u00ad\u0001\u001a\u0006\b®\u0001\u0010¯\u0001R\u001e\u0010°\u0001\u001a\b\u0012\u0004\u0012\u00020\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0005\u0010¤\u0001R;\u0010µ\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020D0±\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u001d\n\u0005\b\u001e\u0010\u00ad\u0001\u0012\u0005\b´\u0001\u0010t\u001a\u0006\b²\u0001\u0010¯\u0001\"\u0005\b³\u0001\u0010|R\u0018\u0010·\u0001\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bj\u0010¶\u0001R\u0018\u0010¸\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010LR\u0017\u0010»\u0001\u001a\u00030¹\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bR\u0010º\u0001R\u001d\u0010¾\u0001\u001a\t\u0012\u0004\u0012\u00020;0¼\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bQ\u0010½\u0001R\u0017\u0010À\u0001\u001a\u00020\r8BX\u0082\u0004¢\u0006\b\u001a\u0006\b¿\u0001\u0010\u008e\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006Ã\u0001"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "Landroidx/core/view/a;", "", "virtualViewId", "Landroid/view/accessibility/AccessibilityNodeInfo;", "q", "Landroidx/compose/ui/semantics/SemanticsNode;", "node", "Landroidx/core/view/accessibility/a0;", "info", "Lkotlin/b2;", "g0", "j0", "", "G", androidx.exifinterface.media.a.R4, "eventType", "contentChangeType", "", "", "contentDescription", androidx.exifinterface.media.a.T4, "(IILjava/lang/Integer;Ljava/util/List;)Z", "Landroid/view/accessibility/AccessibilityEvent;", androidx.core.app.o0.I0, androidx.exifinterface.media.a.X4, "fromIndex", "toIndex", "itemCount", "text", "r", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityEvent;", "o", "action", "Landroid/os/Bundle;", com.tekartik.sqflite.b.f98603v, "L", "extraDataKey", "j", "textNode", "Lb1/i;", "bounds", "Landroid/graphics/RectF;", "k0", "n0", "", androidx.exifinterface.media.a.f23244d5, UiKitSpanObj.TYPE_SIZE, "m0", "(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "I", "Landroidx/collection/c;", "subtreeChangedSemanticsNodesIds", "d0", "n", "o0", "id", "Landroidx/compose/ui/platform/q1;", "oldScrollObservationScopes", "R", "scrollObservationScope", "a0", "semanticsNodeId", "title", "Y", "newNode", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$g;", "oldNode", "c0", "U", org.apache.tools.ant.types.selectors.m.f136544s, "forward", "extendSelection", "l0", "Z", com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "traversalMode", "f0", "v", ak.aG, "H", "Landroidx/compose/ui/platform/a$f;", ak.aD, "y", "Landroidx/compose/ui/semantics/j;", "Landroidx/compose/ui/text/d;", "C", "vertical", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "Lb1/f;", CommonNetImpl.POSITION, "l", "(ZIJ)Z", "", "Landroidx/compose/ui/platform/r1;", "currentSemanticsNodes", "m", "(Ljava/util/Collection;ZIJ)Z", "semanticsNode", "O", "p", "(II)Landroid/view/accessibility/AccessibilityEvent;", "Landroid/view/MotionEvent;", ak.aB, "", "x", androidx.exifinterface.media.a.S4, "(FF)I", "Landroid/view/View;", "host", "Landroidx/core/view/accessibility/c0;", "getAccessibilityNodeProvider", "K", "()V", "k", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "J", "(Landroidx/compose/ui/node/LayoutNode;)V", "", "newSemanticsNodes", "b0", "(Ljava/util/Map;)V", "Landroidx/compose/ui/platform/AndroidComposeView;", ak.av, "Landroidx/compose/ui/platform/AndroidComposeView;", "D", "()Landroidx/compose/ui/platform/AndroidComposeView;", sd.b.f139384b, "b", "()I", "h0", "(I)V", "hoveredVirtualViewId", "Landroid/view/accessibility/AccessibilityManager;", ak.aF, "Landroid/view/accessibility/AccessibilityManager;", "accessibilityManager", "d", "t", "()Z", "e0", "(Z)V", "accessibilityForceEnabledForTesting", "Landroid/os/Handler;", "e", "Landroid/os/Handler;", "handler", "f", "Landroidx/core/view/accessibility/c0;", "nodeProvider", "g", "focusedVirtualViewId", "Landroidx/collection/l2;", RXScreenCaptureService.KEY_HEIGHT, "Landroidx/collection/l2;", "actionIdToLabel", "i", "labelToActionId", "accessibilityCursorPosition", "Ljava/lang/Integer;", "previousTraversedNode", "Landroidx/collection/c;", "subtreeChangedLayoutNodes", "Lkotlinx/coroutines/channels/k;", "Lkotlinx/coroutines/channels/k;", "boundsUpdateChannel", "currentSemanticsNodesInvalidated", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$f;", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$f;", "pendingTextTraversedEvent", "Ljava/util/Map;", RXScreenCaptureService.KEY_WIDTH, "()Ljava/util/Map;", "paneDisplayed", "", androidx.exifinterface.media.a.W4, "i0", "getPreviousSemanticsNodes$ui_release$annotations", "previousSemanticsNodes", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$g;", "previousSemanticsRoot", "checkingForSemanticsChanges", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "semanticsChangeChecker", "", "Ljava/util/List;", "scrollObservationScopes", "F", "isAccessibilityEnabled", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class AndroidComposeViewAccessibilityDelegateCompat extends androidx.core.view.a {

    @dl.d
    public static final String A = "AccessibilityDelegate";

    @dl.d
    public static final String B = "androidx.compose.ui.semantics.testTag";
    public static final int C = 100000;
    public static final int D = -1;
    public static final int E = 20;
    public static final long F = 100;
    public static final long G = 1000;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f15474y = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.d
    public static final String f15475z = "android.view.View";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final AndroidComposeView view;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int hoveredVirtualViewId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final AccessibilityManager accessibilityManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean accessibilityForceEnabledForTesting;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Handler handler;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private androidx.core.view.accessibility.c0 nodeProvider;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int focusedVirtualViewId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private androidx.collection.l2<androidx.collection.l2<CharSequence>> actionIdToLabel;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private androidx.collection.l2<Map<CharSequence, Integer>> labelToActionId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int accessibilityCursorPosition;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Integer previousTraversedNode;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.collection.c<LayoutNode> subtreeChangedLayoutNodes;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlinx.coroutines.channels.k<kotlin.b2> boundsUpdateChannel;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean currentSemanticsNodesInvalidated;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private f pendingTextTraversedEvent;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private Map<Integer, r1> currentSemanticsNodes;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private androidx.collection.c<Integer> paneDisplayed;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private Map<Integer, g> previousSemanticsNodes;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private g previousSemanticsRoot;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean checkingForSemanticsChanges;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Runnable semanticsChangeChecker;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<q1> scrollObservationScopes;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    private final yh.l<q1, kotlin.b2> f15498w;

    @dl.d
    private static final int[] H = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"androidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", sd.b.f139384b, "Lkotlin/b2;", "onViewAttachedToWindow", "onViewDetachedFromWindow", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@dl.d View view) {
            kotlin.jvm.internal.f0.p(view, "view");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@dl.d View view) {
            kotlin.jvm.internal.f0.p(view, "view");
            AndroidComposeViewAccessibilityDelegateCompat.this.handler.removeCallbacks(AndroidComposeViewAccessibilityDelegateCompat.this.semanticsChangeChecker);
        }
    }

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @androidx.annotation.w0(24)
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$b;", "", "Landroidx/core/view/accessibility/a0;", "info", "Landroidx/compose/ui/semantics/SemanticsNode;", "semanticsNode", "Lkotlin/b2;", ak.av, "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final b f15500a = new b();

        private b() {
        }

        @androidx.annotation.u
        @xh.m
        public static final void a(@dl.d androidx.core.view.accessibility.a0 info, @dl.d SemanticsNode semanticsNode) {
            AccessibilityAction accessibilityAction;
            kotlin.jvm.internal.f0.p(info, "info");
            kotlin.jvm.internal.f0.p(semanticsNode, "semanticsNode");
            if (!AndroidComposeViewAccessibilityDelegateCompat_androidKt.k(semanticsNode) || (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.i.f16129a.n())) == null) {
                return;
            }
            info.b(new androidx.core.view.accessibility.a0.a(android.R.id.accessibilityActionSetProgress, accessibilityAction.getLabel()));
        }
    }

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @androidx.annotation.w0(28)
    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$c;", "", "Landroid/view/accessibility/AccessibilityEvent;", androidx.core.app.o0.I0, "", "deltaX", "deltaY", "Lkotlin/b2;", ak.av, "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final c f15507a = new c();

        private c() {
        }

        @androidx.annotation.u
        @xh.m
        public static final void a(@dl.d AccessibilityEvent event, int i10, int i11) {
            kotlin.jvm.internal.f0.p(event, "event");
            event.setScrollDeltaX(i10);
            event.setScrollDeltaY(i11);
        }
    }

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\"\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J*\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$e;", "Landroid/view/accessibility/AccessibilityNodeProvider;", "", "virtualViewId", "Landroid/view/accessibility/AccessibilityNodeInfo;", "createAccessibilityNodeInfo", "action", "Landroid/os/Bundle;", com.tekartik.sqflite.b.f98603v, "", "performAction", "info", "", "extraDataKey", "Lkotlin/b2;", "addExtraDataToAccessibilityNodeInfo", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public final class e extends AccessibilityNodeProvider {
        public e() {
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i10, @dl.d AccessibilityNodeInfo info, @dl.d String extraDataKey, @dl.e Bundle bundle) {
            kotlin.jvm.internal.f0.p(info, "info");
            kotlin.jvm.internal.f0.p(extraDataKey, "extraDataKey");
            AndroidComposeViewAccessibilityDelegateCompat.this.j(i10, info, extraDataKey, bundle);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        @dl.e
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int virtualViewId) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.q(virtualViewId);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int virtualViewId, int action, @dl.e Bundle arguments) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.L(virtualViewId, action, arguments);
        }
    }

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0010\u0010\u000bR\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$f;", "", "Landroidx/compose/ui/semantics/SemanticsNode;", ak.av, "Landroidx/compose/ui/semantics/SemanticsNode;", "d", "()Landroidx/compose/ui/semantics/SemanticsNode;", "node", "", "b", "I", "()I", "action", ak.aF, org.apache.tools.ant.types.selectors.m.f136544s, "fromIndex", "e", "toIndex", "", "f", "J", "()J", "traverseTime", "<init>", "(Landroidx/compose/ui/semantics/SemanticsNode;IIIIJ)V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final SemanticsNode node;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int action;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int granularity;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int fromIndex;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final int toIndex;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final long traverseTime;

        public f(@dl.d SemanticsNode node, int i10, int i11, int i12, int i13, long j10) {
            kotlin.jvm.internal.f0.p(node, "node");
            this.node = node;
            this.action = i10;
            this.granularity = i11;
            this.fromIndex = i12;
            this.toIndex = i13;
            this.traverseTime = j10;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getFromIndex() {
            return this.fromIndex;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getGranularity() {
            return this.granularity;
        }

        @dl.d
        /* JADX INFO: renamed from: d, reason: from getter */
        public final SemanticsNode getNode() {
            return this.node;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getToIndex() {
            return this.toIndex;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final long getTraverseTime() {
            return this.traverseTime;
        }
    }

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0005\u0010\r¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$g;", "", "", ak.aF, "Landroidx/compose/ui/semantics/j;", ak.av, "Landroidx/compose/ui/semantics/j;", "b", "()Landroidx/compose/ui/semantics/j;", "unmergedConfig", "", "", "Ljava/util/Set;", "()Ljava/util/Set;", "children", "Landroidx/compose/ui/semantics/SemanticsNode;", "semanticsNode", "", "Landroidx/compose/ui/platform/r1;", "currentSemanticsNodes", "<init>", "(Landroidx/compose/ui/semantics/SemanticsNode;Ljava/util/Map;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
    @androidx.annotation.j1
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final androidx.compose.ui.semantics.j unmergedConfig;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final Set<Integer> children;

        public g(@dl.d SemanticsNode semanticsNode, @dl.d Map<Integer, r1> currentSemanticsNodes) {
            kotlin.jvm.internal.f0.p(semanticsNode, "semanticsNode");
            kotlin.jvm.internal.f0.p(currentSemanticsNodes, "currentSemanticsNodes");
            this.unmergedConfig = semanticsNode.getUnmergedConfig();
            this.children = new LinkedHashSet();
            List<SemanticsNode> listT = semanticsNode.t();
            int size = listT.size();
            for (int i10 = 0; i10 < size; i10++) {
                SemanticsNode semanticsNode2 = listT.get(i10);
                if (currentSemanticsNodes.containsKey(Integer.valueOf(semanticsNode2.getId()))) {
                    this.children.add(Integer.valueOf(semanticsNode2.getId()));
                }
            }
        }

        @dl.d
        public final Set<Integer> a() {
            return this.children;
        }

        @dl.d
        /* JADX INFO: renamed from: b, reason: from getter */
        public final androidx.compose.ui.semantics.j getUnmergedConfig() {
            return this.unmergedConfig;
        }

        public final boolean c() {
            return this.unmergedConfig.e(SemanticsProperties.f16032a.q());
        }
    }

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15517a;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            iArr[ToggleableState.On.ordinal()] = 1;
            iArr[ToggleableState.Off.ordinal()] = 2;
            iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            f15517a = iArr;
        }
    }

    public AndroidComposeViewAccessibilityDelegateCompat(@dl.d AndroidComposeView view) {
        kotlin.jvm.internal.f0.p(view, "view");
        this.view = view;
        this.hoveredVirtualViewId = Integer.MIN_VALUE;
        Object systemService = view.getContext().getSystemService("accessibility");
        kotlin.jvm.internal.f0.n(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.accessibilityManager = (AccessibilityManager) systemService;
        this.handler = new Handler(Looper.getMainLooper());
        this.nodeProvider = new androidx.core.view.accessibility.c0(new e());
        this.focusedVirtualViewId = Integer.MIN_VALUE;
        this.actionIdToLabel = new androidx.collection.l2<>();
        this.labelToActionId = new androidx.collection.l2<>();
        this.accessibilityCursorPosition = -1;
        this.subtreeChangedLayoutNodes = new androidx.collection.c<>();
        this.boundsUpdateChannel = kotlinx.coroutines.channels.m.d(-1, null, null, 6, null);
        this.currentSemanticsNodesInvalidated = true;
        this.currentSemanticsNodes = kotlin.collections.s0.z();
        this.paneDisplayed = new androidx.collection.c<>();
        this.previousSemanticsNodes = new LinkedHashMap();
        this.previousSemanticsRoot = new g(view.getSemanticsOwner().b(), kotlin.collections.s0.z());
        view.addOnAttachStateChangeListener(new a());
        this.semanticsChangeChecker = new Runnable() { // from class: androidx.compose.ui.platform.n
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeViewAccessibilityDelegateCompat.T(this.f15934b);
            }
        };
        this.scrollObservationScopes = new ArrayList();
        this.f15498w = new yh.l<q1, kotlin.b2>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendScrollEventIfNeededLambda$1
            {
                super(1);
            }

            public final void a(@dl.d q1 it) {
                kotlin.jvm.internal.f0.p(it, "it");
                this.f15521b.a0(it);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(q1 q1Var) {
                a(q1Var);
                return kotlin.b2.f124493a;
            }
        };
    }

    @androidx.annotation.j1
    public static /* synthetic */ void B() {
    }

    private final androidx.compose.ui.text.d C(androidx.compose.ui.semantics.j jVar) {
        return (androidx.compose.ui.text.d) SemanticsConfigurationKt.a(jVar, SemanticsProperties.f16032a.e());
    }

    private final boolean F() {
        return this.accessibilityForceEnabledForTesting || (this.accessibilityManager.isEnabled() && this.accessibilityManager.isTouchExplorationEnabled());
    }

    private final boolean G(int virtualViewId) {
        return this.focusedVirtualViewId == virtualViewId;
    }

    private final boolean H(SemanticsNode node) {
        androidx.compose.ui.semantics.j unmergedConfig = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.f16032a;
        return !unmergedConfig.e(semanticsProperties.c()) && node.getUnmergedConfig().e(semanticsProperties.e());
    }

    private final void I(LayoutNode layoutNode) {
        if (this.subtreeChangedLayoutNodes.add(layoutNode)) {
            this.boundsUpdateChannel.v(kotlin.b2.f124493a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r13v61 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v43 */
    /* JADX WARN: Type inference failed for: r14v44 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x00e6 -> B:59:0x00e7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:59:0x00e7
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:127)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:75)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final boolean L(int r13, int r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instruction units count: 1444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.L(int, int, android.os.Bundle):boolean");
    }

    private static final boolean M(ScrollAxisRange scrollAxisRange, float f10) {
        return (f10 < 0.0f && scrollAxisRange.c().invoke().floatValue() > 0.0f) || (f10 > 0.0f && scrollAxisRange.c().invoke().floatValue() < scrollAxisRange.a().invoke().floatValue());
    }

    private static final float N(float f10, float f11) {
        if (Math.signum(f10) == Math.signum(f11)) {
            return Math.abs(f10) < Math.abs(f11) ? f10 : f11;
        }
        return 0.0f;
    }

    private static final boolean P(ScrollAxisRange scrollAxisRange) {
        return (scrollAxisRange.c().invoke().floatValue() > 0.0f && !scrollAxisRange.getReverseScrolling()) || (scrollAxisRange.c().invoke().floatValue() < scrollAxisRange.a().invoke().floatValue() && scrollAxisRange.getReverseScrolling());
    }

    private static final boolean Q(ScrollAxisRange scrollAxisRange) {
        return (scrollAxisRange.c().invoke().floatValue() < scrollAxisRange.a().invoke().floatValue() && !scrollAxisRange.getReverseScrolling()) || (scrollAxisRange.c().invoke().floatValue() > 0.0f && scrollAxisRange.getReverseScrolling());
    }

    private final boolean R(int id2, List<q1> oldScrollObservationScopes) {
        boolean z10;
        q1 q1VarM = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m(oldScrollObservationScopes, id2);
        if (q1VarM != null) {
            z10 = false;
        } else {
            q1 q1Var = new q1(id2, this.scrollObservationScopes, null, null, null, null);
            z10 = true;
            q1VarM = q1Var;
        }
        this.scrollObservationScopes.add(q1VarM);
        return z10;
    }

    private final boolean S(int virtualViewId) {
        if (!F() || G(virtualViewId)) {
            return false;
        }
        int i10 = this.focusedVirtualViewId;
        if (i10 != Integer.MIN_VALUE) {
            X(this, i10, 65536, null, null, 12, null);
        }
        this.focusedVirtualViewId = virtualViewId;
        this.view.invalidate();
        X(this, virtualViewId, 32768, null, null, 12, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(AndroidComposeViewAccessibilityDelegateCompat this$0) {
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        androidx.compose.ui.node.a1.d(this$0.view, false, 1, null);
        this$0.n();
        this$0.checkingForSemanticsChanges = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int U(int id2) {
        if (id2 == this.view.getSemanticsOwner().b().getId()) {
            return -1;
        }
        return id2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean V(AccessibilityEvent event) {
        if (F()) {
            return this.view.getParent().requestSendAccessibilityEvent(this.view, event);
        }
        return false;
    }

    private final boolean W(int virtualViewId, int eventType, Integer contentChangeType, List<String> contentDescription) {
        if (virtualViewId == Integer.MIN_VALUE || !F()) {
            return false;
        }
        AccessibilityEvent accessibilityEventP = p(virtualViewId, eventType);
        if (contentChangeType != null) {
            accessibilityEventP.setContentChangeTypes(contentChangeType.intValue());
        }
        if (contentDescription != null) {
            accessibilityEventP.setContentDescription(androidx.compose.ui.s.f(contentDescription, Constants.ACCEPT_TIME_SEPARATOR_SP, null, null, 0, null, null, 62, null));
        }
        return V(accessibilityEventP);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean X(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i10, int i11, Integer num, List list, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            num = null;
        }
        if ((i12 & 8) != 0) {
            list = null;
        }
        return androidComposeViewAccessibilityDelegateCompat.W(i10, i11, num, list);
    }

    private final void Y(int i10, int i11, String str) {
        AccessibilityEvent accessibilityEventP = p(U(i10), 32);
        accessibilityEventP.setContentChangeTypes(i11);
        if (str != null) {
            accessibilityEventP.getText().add(str);
        }
        V(accessibilityEventP);
    }

    private final void Z(int i10) {
        f fVar = this.pendingTextTraversedEvent;
        if (fVar != null) {
            if (i10 != fVar.getNode().getId()) {
                return;
            }
            if (SystemClock.uptimeMillis() - fVar.getTraverseTime() <= 1000) {
                AccessibilityEvent accessibilityEventP = p(U(fVar.getNode().getId()), 131072);
                accessibilityEventP.setFromIndex(fVar.getFromIndex());
                accessibilityEventP.setToIndex(fVar.getToIndex());
                accessibilityEventP.setAction(fVar.getAction());
                accessibilityEventP.setMovementGranularity(fVar.getGranularity());
                accessibilityEventP.getText().add(y(fVar.getNode()));
                V(accessibilityEventP);
            }
        }
        this.pendingTextTraversedEvent = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0(final q1 q1Var) {
        if (q1Var.isValid()) {
            this.view.getSnapshotObserver().i(q1Var, this.f15498w, new yh.a<kotlin.b2>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendScrollEventIfNeeded$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                    invoke2();
                    return kotlin.b2.f124493a;
                }

                /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                /* JADX WARN: Code duplicated, block: B:22:0x0083  */
                /* JADX WARN: Code duplicated, block: B:24:0x00a9  */
                /* JADX WARN: Code duplicated, block: B:27:0x00d3  */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    AccessibilityEvent accessibilityEventP;
                    ScrollAxisRange horizontalScrollAxisRange = q1Var.getHorizontalScrollAxisRange();
                    ScrollAxisRange verticalScrollAxisRange = q1Var.getVerticalScrollAxisRange();
                    Float oldXValue = q1Var.getOldXValue();
                    Float oldYValue = q1Var.getOldYValue();
                    float fFloatValue = (horizontalScrollAxisRange == null || oldXValue == null) ? 0.0f : horizontalScrollAxisRange.c().invoke().floatValue() - oldXValue.floatValue();
                    float fFloatValue2 = (verticalScrollAxisRange == null || oldYValue == null) ? 0.0f : verticalScrollAxisRange.c().invoke().floatValue() - oldYValue.floatValue();
                    if (fFloatValue == 0.0f) {
                        if (!(fFloatValue2 == 0.0f)) {
                            int iU = this.U(q1Var.getSemanticsNodeId());
                            AndroidComposeViewAccessibilityDelegateCompat.X(this, iU, 2048, 1, null, 8, null);
                            accessibilityEventP = this.p(iU, 4096);
                            if (horizontalScrollAxisRange != null) {
                                accessibilityEventP.setScrollX((int) horizontalScrollAxisRange.c().invoke().floatValue());
                                accessibilityEventP.setMaxScrollX((int) horizontalScrollAxisRange.a().invoke().floatValue());
                            }
                            if (verticalScrollAxisRange != null) {
                                accessibilityEventP.setScrollY((int) verticalScrollAxisRange.c().invoke().floatValue());
                                accessibilityEventP.setMaxScrollY((int) verticalScrollAxisRange.a().invoke().floatValue());
                            }
                            if (Build.VERSION.SDK_INT >= 28) {
                                AndroidComposeViewAccessibilityDelegateCompat.c.a(accessibilityEventP, (int) fFloatValue, (int) fFloatValue2);
                            }
                            this.V(accessibilityEventP);
                        }
                    } else {
                        int iU2 = this.U(q1Var.getSemanticsNodeId());
                        AndroidComposeViewAccessibilityDelegateCompat.X(this, iU2, 2048, 1, null, 8, null);
                        accessibilityEventP = this.p(iU2, 4096);
                        if (horizontalScrollAxisRange != null) {
                            accessibilityEventP.setScrollX((int) horizontalScrollAxisRange.c().invoke().floatValue());
                            accessibilityEventP.setMaxScrollX((int) horizontalScrollAxisRange.a().invoke().floatValue());
                        }
                        if (verticalScrollAxisRange != null) {
                            accessibilityEventP.setScrollY((int) verticalScrollAxisRange.c().invoke().floatValue());
                            accessibilityEventP.setMaxScrollY((int) verticalScrollAxisRange.a().invoke().floatValue());
                        }
                        if (Build.VERSION.SDK_INT >= 28) {
                            AndroidComposeViewAccessibilityDelegateCompat.c.a(accessibilityEventP, (int) fFloatValue, (int) fFloatValue2);
                        }
                        this.V(accessibilityEventP);
                    }
                    if (horizontalScrollAxisRange != null) {
                        q1Var.h(horizontalScrollAxisRange.c().invoke());
                    }
                    if (verticalScrollAxisRange != null) {
                        q1Var.i(verticalScrollAxisRange.c().invoke());
                    }
                }
            });
        }
    }

    private final void c0(SemanticsNode semanticsNode, g gVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<SemanticsNode> listT = semanticsNode.t();
        int size = listT.size();
        for (int i10 = 0; i10 < size; i10++) {
            SemanticsNode semanticsNode2 = listT.get(i10);
            if (w().containsKey(Integer.valueOf(semanticsNode2.getId()))) {
                if (!gVar.a().contains(Integer.valueOf(semanticsNode2.getId()))) {
                    I(semanticsNode.getLayoutNode());
                    return;
                }
                linkedHashSet.add(Integer.valueOf(semanticsNode2.getId()));
            }
        }
        Iterator<Integer> it = gVar.a().iterator();
        while (it.hasNext()) {
            if (!linkedHashSet.contains(Integer.valueOf(it.next().intValue()))) {
                I(semanticsNode.getLayoutNode());
                return;
            }
        }
        List<SemanticsNode> listT2 = semanticsNode.t();
        int size2 = listT2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            SemanticsNode semanticsNode3 = listT2.get(i11);
            if (w().containsKey(Integer.valueOf(semanticsNode3.getId()))) {
                g gVar2 = this.previousSemanticsNodes.get(Integer.valueOf(semanticsNode3.getId()));
                kotlin.jvm.internal.f0.m(gVar2);
                c0(semanticsNode3, gVar2);
            }
        }
    }

    private final void d0(LayoutNode layoutNode, androidx.collection.c<Integer> cVar) {
        LayoutNode layoutNodeN;
        androidx.compose.ui.node.j1 j1VarK;
        if (layoutNode.p() && !this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            androidx.compose.ui.node.j1 j1VarK2 = androidx.compose.ui.semantics.n.k(layoutNode);
            if (j1VarK2 == null) {
                LayoutNode layoutNodeN2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.n(layoutNode, new yh.l<LayoutNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsWrapper$1
                    @Override // yh.l
                    @dl.d
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke(@dl.d LayoutNode it) {
                        kotlin.jvm.internal.f0.p(it, "it");
                        return Boolean.valueOf(androidx.compose.ui.semantics.n.k(it) != null);
                    }
                });
                j1VarK2 = layoutNodeN2 != null ? androidx.compose.ui.semantics.n.k(layoutNodeN2) : null;
                if (j1VarK2 == null) {
                    return;
                }
            }
            if (!androidx.compose.ui.node.k1.a(j1VarK2).getIsMergingSemanticsOfDescendants() && (layoutNodeN = AndroidComposeViewAccessibilityDelegateCompat_androidKt.n(layoutNode, new yh.l<LayoutNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1
                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(@dl.d LayoutNode it) {
                    androidx.compose.ui.semantics.j jVarA;
                    kotlin.jvm.internal.f0.p(it, "it");
                    androidx.compose.ui.node.j1 j1VarK3 = androidx.compose.ui.semantics.n.k(it);
                    return Boolean.valueOf((j1VarK3 == null || (jVarA = androidx.compose.ui.node.k1.a(j1VarK3)) == null || !jVarA.getIsMergingSemanticsOfDescendants()) ? false : true);
                }
            })) != null && (j1VarK = androidx.compose.ui.semantics.n.k(layoutNodeN)) != null) {
                j1VarK2 = j1VarK;
            }
            int semanticsId = androidx.compose.ui.node.d.k(j1VarK2).getSemanticsId();
            if (cVar.add(Integer.valueOf(semanticsId))) {
                X(this, U(semanticsId), 2048, 1, null, 8, null);
            }
        }
    }

    private final boolean f0(SemanticsNode node, int start, int end, boolean traversalMode) {
        String strY;
        androidx.compose.ui.semantics.j unmergedConfig = node.getUnmergedConfig();
        androidx.compose.ui.semantics.i iVar = androidx.compose.ui.semantics.i.f16129a;
        if (unmergedConfig.e(iVar.o()) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.k(node)) {
            yh.q qVar = (yh.q) ((AccessibilityAction) node.getUnmergedConfig().h(iVar.o())).a();
            if (qVar != null) {
                return ((Boolean) qVar.invoke(Integer.valueOf(start), Integer.valueOf(end), Boolean.valueOf(traversalMode))).booleanValue();
            }
            return false;
        }
        if ((start == end && end == this.accessibilityCursorPosition) || (strY = y(node)) == null) {
            return false;
        }
        if (start < 0 || start != end || end > strY.length()) {
            start = -1;
        }
        this.accessibilityCursorPosition = start;
        boolean z10 = strY.length() > 0;
        V(r(U(node.getId()), z10 ? Integer.valueOf(this.accessibilityCursorPosition) : null, z10 ? Integer.valueOf(this.accessibilityCursorPosition) : null, z10 ? Integer.valueOf(strY.length()) : null, strY));
        Z(node.getId());
        return true;
    }

    private final void g0(SemanticsNode semanticsNode, androidx.core.view.accessibility.a0 a0Var) {
        androidx.compose.ui.semantics.j unmergedConfig = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.f16032a;
        if (unmergedConfig.e(semanticsProperties.f())) {
            a0Var.g1(true);
            a0Var.m1((CharSequence) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties.f()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        SemanticsNode semanticsNode;
        String str2;
        r1 r1Var = w().get(Integer.valueOf(i10));
        if (r1Var == null || (semanticsNode = r1Var.getSemanticsNode()) == null) {
            return;
        }
        String strY = y(semanticsNode);
        androidx.compose.ui.semantics.j unmergedConfig = semanticsNode.getUnmergedConfig();
        androidx.compose.ui.semantics.i iVar = androidx.compose.ui.semantics.i.f16129a;
        if (!unmergedConfig.e(iVar.g()) || bundle == null || !kotlin.jvm.internal.f0.g(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            androidx.compose.ui.semantics.j unmergedConfig2 = semanticsNode.getUnmergedConfig();
            SemanticsProperties semanticsProperties = SemanticsProperties.f16032a;
            if (!unmergedConfig2.e(semanticsProperties.x()) || bundle == null || !kotlin.jvm.internal.f0.g(str, B) || (str2 = (String) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties.x())) == null) {
                return;
            }
            accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
            return;
        }
        int i11 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i12 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i12 > 0 && i11 >= 0) {
            if (i11 < (strY != null ? strY.length() : Integer.MAX_VALUE)) {
                ArrayList arrayList = new ArrayList();
                yh.l lVar = (yh.l) ((AccessibilityAction) semanticsNode.getUnmergedConfig().h(iVar.g())).a();
                if (kotlin.jvm.internal.f0.g(lVar != null ? (Boolean) lVar.invoke(arrayList) : null, Boolean.TRUE)) {
                    TextLayoutResult textLayoutResult = (TextLayoutResult) arrayList.get(0);
                    ArrayList arrayList2 = new ArrayList();
                    for (int i13 = 0; i13 < i12; i13++) {
                        int i14 = i11 + i13;
                        if (i14 >= textLayoutResult.getLayoutInput().getText().length()) {
                            arrayList2.add(null);
                        } else {
                            arrayList2.add(k0(semanticsNode, textLayoutResult.d(i14)));
                        }
                    }
                    Bundle extras = accessibilityNodeInfo.getExtras();
                    Object[] array = arrayList2.toArray(new RectF[0]);
                    kotlin.jvm.internal.f0.n(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    extras.putParcelableArray(str, (Parcelable[]) array);
                    return;
                }
                return;
            }
        }
        Log.e(A, "Invalid arguments for accessibility character locations");
    }

    private final void j0(SemanticsNode semanticsNode, androidx.core.view.accessibility.a0 a0Var) {
        androidx.compose.ui.text.d dVar;
        androidx.compose.ui.text.font.v.b fontFamilyResolver = this.view.getFontFamilyResolver();
        androidx.compose.ui.text.d dVarC = C(semanticsNode.getUnmergedConfig());
        SpannableString spannableStringC = null;
        SpannableString spannableString = (SpannableString) m0(dVarC != null ? androidx.compose.ui.text.platform.a.c(dVarC, this.view.getF15427e(), fontFamilyResolver) : null, 100000);
        List list = (List) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), SemanticsProperties.f16032a.y());
        if (list != null && (dVar = (androidx.compose.ui.text.d) CollectionsKt___CollectionsKt.B2(list)) != null) {
            spannableStringC = androidx.compose.ui.text.platform.a.c(dVar, this.view.getF15427e(), fontFamilyResolver);
        }
        SpannableString spannableString2 = (SpannableString) m0(spannableStringC, 100000);
        if (spannableString == null) {
            spannableString = spannableString2;
        }
        a0Var.S1(spannableString);
    }

    private final RectF k0(SemanticsNode textNode, b1.i bounds) {
        if (textNode == null) {
            return null;
        }
        b1.i iVarS = bounds.S(textNode.r());
        b1.i iVarG = textNode.g();
        b1.i iVarJ = iVarS.Q(iVarG) ? iVarS.J(iVarG) : null;
        if (iVarJ == null) {
            return null;
        }
        long jZ = this.view.z(b1.g.a(iVarJ.t(), iVarJ.getF30372b()));
        long jZ2 = this.view.z(b1.g.a(iVarJ.x(), iVarJ.j()));
        return new RectF(b1.f.p(jZ), b1.f.r(jZ), b1.f.p(jZ2), b1.f.r(jZ2));
    }

    private final boolean l0(SemanticsNode node, int granularity, boolean forward, boolean extendSelection) {
        androidx.compose.ui.platform.a.f fVarZ;
        int iV;
        int i10;
        int id2 = node.getId();
        Integer num = this.previousTraversedNode;
        if (num == null || id2 != num.intValue()) {
            this.accessibilityCursorPosition = -1;
            this.previousTraversedNode = Integer.valueOf(node.getId());
        }
        String strY = y(node);
        if ((strY == null || strY.length() == 0) || (fVarZ = z(node, granularity)) == null) {
            return false;
        }
        int iU = u(node);
        if (iU == -1) {
            iU = forward ? 0 : strY.length();
        }
        int[] iArrA = forward ? fVarZ.a(iU) : fVarZ.b(iU);
        if (iArrA == null) {
            return false;
        }
        int i11 = iArrA[0];
        int i12 = iArrA[1];
        if (extendSelection && H(node)) {
            iV = v(node);
            if (iV == -1) {
                iV = forward ? i11 : i12;
            }
            i10 = forward ? i12 : i11;
        } else {
            iV = forward ? i12 : i11;
            i10 = iV;
        }
        this.pendingTextTraversedEvent = new f(node, forward ? 256 : 512, granularity, i11, i12, SystemClock.uptimeMillis());
        f0(node, iV, i10, true);
        return true;
    }

    private final <T extends CharSequence> T m0(T text, @androidx.annotation.f0(from = 1) int size) {
        boolean z10 = true;
        if (!(size > 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (text != null && text.length() != 0) {
            z10 = false;
        }
        if (z10 || text.length() <= size) {
            return text;
        }
        int i10 = size - 1;
        if (Character.isHighSurrogate(text.charAt(i10)) && Character.isLowSurrogate(text.charAt(size))) {
            size = i10;
        }
        T t10 = (T) text.subSequence(0, size);
        kotlin.jvm.internal.f0.n(t10, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
        return t10;
    }

    private final void n() {
        c0(this.view.getSemanticsOwner().b(), this.previousSemanticsRoot);
        b0(w());
        o0();
    }

    private final void n0(int i10) {
        int i11 = this.hoveredVirtualViewId;
        if (i11 == i10) {
            return;
        }
        this.hoveredVirtualViewId = i10;
        X(this, i10, 128, null, null, 12, null);
        X(this, i11, 256, null, null, 12, null);
    }

    private final boolean o(int virtualViewId) {
        if (!G(virtualViewId)) {
            return false;
        }
        this.focusedVirtualViewId = Integer.MIN_VALUE;
        this.view.invalidate();
        X(this, virtualViewId, 65536, null, null, 12, null);
        return true;
    }

    private final void o0() {
        androidx.compose.ui.semantics.j unmergedConfig;
        for (Integer id2 : this.paneDisplayed) {
            r1 r1Var = w().get(id2);
            String str = null;
            SemanticsNode semanticsNode = r1Var != null ? r1Var.getSemanticsNode() : null;
            if (semanticsNode == null || !AndroidComposeViewAccessibilityDelegateCompat_androidKt.q(semanticsNode)) {
                this.paneDisplayed.remove(id2);
                kotlin.jvm.internal.f0.o(id2, "id");
                int iIntValue = id2.intValue();
                g gVar = this.previousSemanticsNodes.get(id2);
                if (gVar != null && (unmergedConfig = gVar.getUnmergedConfig()) != null) {
                    str = (String) SemanticsConfigurationKt.a(unmergedConfig, SemanticsProperties.f16032a.q());
                }
                Y(iIntValue, 32, str);
            }
        }
        this.previousSemanticsNodes.clear();
        for (Map.Entry<Integer, r1> entry : w().entrySet()) {
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.q(entry.getValue().getSemanticsNode()) && this.paneDisplayed.add(entry.getKey())) {
                Y(entry.getKey().intValue(), 16, (String) entry.getValue().getSemanticsNode().getUnmergedConfig().h(SemanticsProperties.f16032a.q()));
            }
            this.previousSemanticsNodes.put(entry.getKey(), new g(entry.getValue().getSemanticsNode(), w()));
        }
        this.previousSemanticsRoot = new g(this.view.getSemanticsOwner().b(), w());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AccessibilityNodeInfo q(int virtualViewId) {
        androidx.lifecycle.y lifecycleOwner;
        Lifecycle lifecycle;
        AndroidComposeView.b viewTreeOwners = this.view.getViewTreeOwners();
        if (((viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) ? null : lifecycle.b()) == Lifecycle.State.DESTROYED) {
            return null;
        }
        androidx.core.view.accessibility.a0 a0VarH0 = androidx.core.view.accessibility.a0.H0();
        kotlin.jvm.internal.f0.o(a0VarH0, "obtain()");
        r1 r1Var = w().get(Integer.valueOf(virtualViewId));
        if (r1Var == null) {
            a0VarH0.N0();
            return null;
        }
        SemanticsNode semanticsNode = r1Var.getSemanticsNode();
        if (virtualViewId == -1) {
            Object objL0 = androidx.core.view.j1.l0(this.view);
            a0VarH0.F1(objL0 instanceof View ? (View) objL0 : null);
        } else {
            if (semanticsNode.q() == null) {
                throw new IllegalStateException("semanticsNode " + virtualViewId + " has null parent");
            }
            SemanticsNode semanticsNodeQ = semanticsNode.q();
            kotlin.jvm.internal.f0.m(semanticsNodeQ);
            int id2 = semanticsNodeQ.getId();
            a0VarH0.G1(this.view, id2 != this.view.getSemanticsOwner().b().getId() ? id2 : -1);
        }
        a0VarH0.Q1(this.view, virtualViewId);
        Rect adjustedBounds = r1Var.getAdjustedBounds();
        long jZ = this.view.z(b1.g.a(adjustedBounds.left, adjustedBounds.top));
        long jZ2 = this.view.z(b1.g.a(adjustedBounds.right, adjustedBounds.bottom));
        a0VarH0.X0(new Rect((int) Math.floor(b1.f.p(jZ)), (int) Math.floor(b1.f.r(jZ)), (int) Math.ceil(b1.f.p(jZ2)), (int) Math.ceil(b1.f.r(jZ2))));
        O(virtualViewId, a0VarH0, semanticsNode);
        return a0VarH0.f2();
    }

    private final AccessibilityEvent r(int virtualViewId, Integer fromIndex, Integer toIndex, Integer itemCount, String text) {
        AccessibilityEvent accessibilityEventP = p(virtualViewId, 8192);
        if (fromIndex != null) {
            accessibilityEventP.setFromIndex(fromIndex.intValue());
        }
        if (toIndex != null) {
            accessibilityEventP.setToIndex(toIndex.intValue());
        }
        if (itemCount != null) {
            accessibilityEventP.setItemCount(itemCount.intValue());
        }
        if (text != null) {
            accessibilityEventP.getText().add(text);
        }
        return accessibilityEventP;
    }

    private final int u(SemanticsNode node) {
        androidx.compose.ui.semantics.j unmergedConfig = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.f16032a;
        return (unmergedConfig.e(semanticsProperties.c()) || !node.getUnmergedConfig().e(semanticsProperties.z())) ? this.accessibilityCursorPosition : androidx.compose.ui.text.o0.i(((androidx.compose.ui.text.o0) node.getUnmergedConfig().h(semanticsProperties.z())).getPackedValue());
    }

    private final int v(SemanticsNode node) {
        androidx.compose.ui.semantics.j unmergedConfig = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.f16032a;
        return (unmergedConfig.e(semanticsProperties.c()) || !node.getUnmergedConfig().e(semanticsProperties.z())) ? this.accessibilityCursorPosition : androidx.compose.ui.text.o0.n(((androidx.compose.ui.text.o0) node.getUnmergedConfig().h(semanticsProperties.z())).getPackedValue());
    }

    private final Map<Integer, r1> w() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodes = AndroidComposeViewAccessibilityDelegateCompat_androidKt.o(this.view.getSemanticsOwner());
            this.currentSemanticsNodesInvalidated = false;
        }
        return this.currentSemanticsNodes;
    }

    private final String y(SemanticsNode node) {
        androidx.compose.ui.text.d dVar;
        if (node == null) {
            return null;
        }
        androidx.compose.ui.semantics.j unmergedConfig = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.f16032a;
        if (unmergedConfig.e(semanticsProperties.c())) {
            return androidx.compose.ui.s.f((List) node.getUnmergedConfig().h(semanticsProperties.c()), Constants.ACCEPT_TIME_SEPARATOR_SP, null, null, 0, null, null, 62, null);
        }
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.t(node)) {
            androidx.compose.ui.text.d dVarC = C(node.getUnmergedConfig());
            if (dVarC != null) {
                return dVarC.getText();
            }
            return null;
        }
        List list = (List) SemanticsConfigurationKt.a(node.getUnmergedConfig(), semanticsProperties.y());
        if (list == null || (dVar = (androidx.compose.ui.text.d) CollectionsKt___CollectionsKt.B2(list)) == null) {
            return null;
        }
        return dVar.getText();
    }

    private final androidx.compose.ui.platform.a.f z(SemanticsNode node, int granularity) {
        if (node == null) {
            return null;
        }
        String strY = y(node);
        if (strY == null || strY.length() == 0) {
            return null;
        }
        if (granularity == 1) {
            androidx.compose.ui.platform.a.b.Companion companion = androidx.compose.ui.platform.a.b.INSTANCE;
            Locale locale = this.view.getContext().getResources().getConfiguration().locale;
            kotlin.jvm.internal.f0.o(locale, "view.context.resources.configuration.locale");
            androidx.compose.ui.platform.a.b bVarA = companion.a(locale);
            bVarA.e(strY);
            return bVarA;
        }
        if (granularity == 2) {
            androidx.compose.ui.platform.a.g.Companion companion2 = androidx.compose.ui.platform.a.g.INSTANCE;
            Locale locale2 = this.view.getContext().getResources().getConfiguration().locale;
            kotlin.jvm.internal.f0.o(locale2, "view.context.resources.configuration.locale");
            androidx.compose.ui.platform.a.g gVarA = companion2.a(locale2);
            gVarA.e(strY);
            return gVarA;
        }
        if (granularity != 4) {
            if (granularity == 8) {
                androidx.compose.ui.platform.a.e eVarA = androidx.compose.ui.platform.a.e.INSTANCE.a();
                eVarA.e(strY);
                return eVarA;
            }
            if (granularity != 16) {
                return null;
            }
        }
        androidx.compose.ui.semantics.j unmergedConfig = node.getUnmergedConfig();
        androidx.compose.ui.semantics.i iVar = androidx.compose.ui.semantics.i.f16129a;
        if (!unmergedConfig.e(iVar.g())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        yh.l lVar = (yh.l) ((AccessibilityAction) node.getUnmergedConfig().h(iVar.g())).a();
        if (!kotlin.jvm.internal.f0.g(lVar != null ? (Boolean) lVar.invoke(arrayList) : null, Boolean.TRUE)) {
            return null;
        }
        TextLayoutResult textLayoutResult = (TextLayoutResult) arrayList.get(0);
        if (granularity == 4) {
            androidx.compose.ui.platform.a.c cVarA = androidx.compose.ui.platform.a.c.INSTANCE.a();
            cVarA.j(strY, textLayoutResult);
            return cVarA;
        }
        androidx.compose.ui.platform.a.d dVarA = androidx.compose.ui.platform.a.d.INSTANCE.a();
        dVarA.j(strY, textLayoutResult, node);
        return dVarA;
    }

    @dl.d
    public final Map<Integer, g> A() {
        return this.previousSemanticsNodes;
    }

    @dl.d
    /* JADX INFO: renamed from: D, reason: from getter */
    public final AndroidComposeView getView() {
        return this.view;
    }

    @androidx.annotation.j1
    public final int E(float x10, float y10) {
        LayoutNode layoutNodeK;
        androidx.compose.ui.node.j1 j1VarK = null;
        androidx.compose.ui.node.a1.d(this.view, false, 1, null);
        androidx.compose.ui.node.k kVar = new androidx.compose.ui.node.k();
        this.view.getRoot().E0(b1.g.a(x10, y10), kVar, (12 & 4) != 0, (12 & 8) != 0);
        androidx.compose.ui.node.j1 j1Var = (androidx.compose.ui.node.j1) CollectionsKt___CollectionsKt.q3(kVar);
        if (j1Var != null && (layoutNodeK = androidx.compose.ui.node.d.k(j1Var)) != null) {
            j1VarK = androidx.compose.ui.semantics.n.k(layoutNodeK);
        }
        if (j1VarK == null) {
            return Integer.MIN_VALUE;
        }
        SemanticsNode semanticsNode = new SemanticsNode(j1VarK, false, null, 4, null);
        NodeCoordinator nodeCoordinatorC = semanticsNode.c();
        if (semanticsNode.getUnmergedConfig().e(SemanticsProperties.f16032a.l()) || nodeCoordinatorC.i3()) {
            return Integer.MIN_VALUE;
        }
        LayoutNode layoutNodeK2 = androidx.compose.ui.node.d.k(j1VarK);
        if (this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(layoutNodeK2) == null) {
            return U(layoutNodeK2.getSemanticsId());
        }
        return Integer.MIN_VALUE;
    }

    public final void J(@dl.d LayoutNode layoutNode) {
        kotlin.jvm.internal.f0.p(layoutNode, "layoutNode");
        this.currentSemanticsNodesInvalidated = true;
        if (F()) {
            I(layoutNode);
        }
    }

    public final void K() {
        this.currentSemanticsNodesInvalidated = true;
        if (!F() || this.checkingForSemanticsChanges) {
            return;
        }
        this.checkingForSemanticsChanges = true;
        this.handler.post(this.semanticsChangeChecker);
    }

    @androidx.annotation.j1
    public final void O(int i10, @dl.d androidx.core.view.accessibility.a0 info, @dl.d SemanticsNode semanticsNode) {
        NodeCoordinator nodeCoordinatorC;
        boolean zBooleanValue;
        String str;
        kotlin.jvm.internal.f0.p(info, "info");
        kotlin.jvm.internal.f0.p(semanticsNode, "semanticsNode");
        boolean z10 = !semanticsNode.getIsFake() && semanticsNode.t().isEmpty() && AndroidComposeViewAccessibilityDelegateCompat_androidKt.n(semanticsNode.getLayoutNode(), new yh.l<LayoutNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$populateAccessibilityNodeInfoProperties$isUnmergedLeafNode$1
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@dl.d LayoutNode it) {
                androidx.compose.ui.semantics.j jVarA;
                kotlin.jvm.internal.f0.p(it, "it");
                androidx.compose.ui.node.j1 j1VarK = androidx.compose.ui.semantics.n.k(it);
                return Boolean.valueOf((j1VarK == null || (jVarA = androidx.compose.ui.node.k1.a(j1VarK)) == null || !jVarA.getIsMergingSemanticsOfDescendants()) ? false : true);
            }
        }) == null;
        info.b1(f15475z);
        androidx.compose.ui.semantics.j unmergedConfig = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.f16032a;
        androidx.compose.ui.semantics.g gVar = (androidx.compose.ui.semantics.g) SemanticsConfigurationKt.a(unmergedConfig, semanticsProperties.t());
        if (gVar != null) {
            int value = gVar.getValue();
            if (semanticsNode.getIsFake() || semanticsNode.t().isEmpty()) {
                androidx.compose.ui.semantics.g.Companion companion = androidx.compose.ui.semantics.g.INSTANCE;
                if (androidx.compose.ui.semantics.g.j(gVar.getValue(), companion.f())) {
                    info.K1(this.view.getContext().getResources().getString(R.string.tab));
                } else {
                    if (androidx.compose.ui.semantics.g.j(value, companion.a())) {
                        str = "android.widget.Button";
                    } else if (androidx.compose.ui.semantics.g.j(value, companion.b())) {
                        str = "android.widget.CheckBox";
                    } else if (androidx.compose.ui.semantics.g.j(value, companion.e())) {
                        str = "android.widget.Switch";
                    } else if (androidx.compose.ui.semantics.g.j(value, companion.d())) {
                        str = "android.widget.RadioButton";
                    } else {
                        str = androidx.compose.ui.semantics.g.j(value, companion.c()) ? "android.widget.ImageView" : null;
                    }
                    if (!androidx.compose.ui.semantics.g.j(gVar.getValue(), companion.c()) || z10 || semanticsNode.getUnmergedConfig().getIsMergingSemanticsOfDescendants()) {
                        info.b1(str);
                    }
                }
            }
            kotlin.b2 b2Var = kotlin.b2.f124493a;
        }
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.t(semanticsNode)) {
            info.b1("android.widget.EditText");
        }
        if (semanticsNode.k().e(semanticsProperties.y())) {
            info.b1("android.widget.TextView");
        }
        info.D1(this.view.getContext().getPackageName());
        info.r1(true);
        List<SemanticsNode> listU = semanticsNode.u();
        int size = listU.size();
        for (int i11 = 0; i11 < size; i11++) {
            SemanticsNode semanticsNode2 = listU.get(i11);
            if (w().containsKey(Integer.valueOf(semanticsNode2.getId()))) {
                AndroidViewHolder androidViewHolder = this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(semanticsNode2.getLayoutNode());
                if (androidViewHolder != null) {
                    info.c(androidViewHolder);
                } else {
                    info.d(this.view, semanticsNode2.getId());
                }
            }
        }
        if (this.focusedVirtualViewId == i10) {
            info.T0(true);
            info.b(androidx.core.view.accessibility.a0.a.f21383m);
        } else {
            info.T0(false);
            info.b(androidx.core.view.accessibility.a0.a.f21382l);
        }
        j0(semanticsNode, info);
        g0(semanticsNode, info);
        androidx.compose.ui.semantics.j unmergedConfig2 = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties2 = SemanticsProperties.f16032a;
        info.R1((CharSequence) SemanticsConfigurationKt.a(unmergedConfig2, semanticsProperties2.w()));
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties2.A());
        if (toggleableState != null) {
            info.Z0(true);
            int i12 = h.f15517a[toggleableState.ordinal()];
            if (i12 == 1) {
                info.a1(true);
                if ((gVar == null ? false : androidx.compose.ui.semantics.g.j(gVar.getValue(), androidx.compose.ui.semantics.g.INSTANCE.e())) && info.V() == null) {
                    info.R1(this.view.getContext().getResources().getString(R.string.on));
                }
            } else if (i12 == 2) {
                info.a1(false);
                if ((gVar == null ? false : androidx.compose.ui.semantics.g.j(gVar.getValue(), androidx.compose.ui.semantics.g.INSTANCE.e())) && info.V() == null) {
                    info.R1(this.view.getContext().getResources().getString(R.string.off));
                }
            } else if (i12 == 3 && info.V() == null) {
                info.R1(this.view.getContext().getResources().getString(R.string.indeterminate));
            }
            kotlin.b2 b2Var2 = kotlin.b2.f124493a;
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties2.v());
        if (bool != null) {
            boolean zBooleanValue2 = bool.booleanValue();
            if (gVar == null ? false : androidx.compose.ui.semantics.g.j(gVar.getValue(), androidx.compose.ui.semantics.g.INSTANCE.f())) {
                info.N1(zBooleanValue2);
            } else {
                info.Z0(true);
                info.a1(zBooleanValue2);
                if (info.V() == null) {
                    info.R1(zBooleanValue2 ? this.view.getContext().getResources().getString(R.string.selected) : this.view.getContext().getResources().getString(R.string.not_selected));
                }
            }
            kotlin.b2 b2Var3 = kotlin.b2.f124493a;
        }
        if (!semanticsNode.getUnmergedConfig().getIsMergingSemanticsOfDescendants() || semanticsNode.t().isEmpty()) {
            List list = (List) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties2.c());
            info.f1(list != null ? (String) CollectionsKt___CollectionsKt.B2(list) : null);
        }
        String str2 = (String) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties2.x());
        if (str2 != null) {
            SemanticsNode semanticsNodeQ = semanticsNode;
            while (true) {
                if (semanticsNodeQ == null) {
                    zBooleanValue = false;
                    break;
                }
                androidx.compose.ui.semantics.j unmergedConfig3 = semanticsNodeQ.getUnmergedConfig();
                SemanticsPropertiesAndroid semanticsPropertiesAndroid = SemanticsPropertiesAndroid.f16066a;
                if (unmergedConfig3.e(semanticsPropertiesAndroid.a())) {
                    zBooleanValue = ((Boolean) semanticsNodeQ.getUnmergedConfig().h(semanticsPropertiesAndroid.a())).booleanValue();
                    break;
                }
                semanticsNodeQ = semanticsNodeQ.q();
            }
            if (zBooleanValue) {
                info.d2(str2);
            }
        }
        androidx.compose.ui.semantics.j unmergedConfig4 = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties3 = SemanticsProperties.f16032a;
        if (((kotlin.b2) SemanticsConfigurationKt.a(unmergedConfig4, semanticsProperties3.h())) != null) {
            info.p1(true);
            kotlin.b2 b2Var4 = kotlin.b2.f124493a;
        }
        info.H1(AndroidComposeViewAccessibilityDelegateCompat_androidKt.r(semanticsNode));
        info.k1(AndroidComposeViewAccessibilityDelegateCompat_androidKt.t(semanticsNode));
        info.l1(AndroidComposeViewAccessibilityDelegateCompat_androidKt.k(semanticsNode));
        info.n1(semanticsNode.getUnmergedConfig().e(semanticsProperties3.g()));
        if (info.t0()) {
            info.o1(((Boolean) semanticsNode.getUnmergedConfig().h(semanticsProperties3.g())).booleanValue());
            if (info.u0()) {
                info.a(2);
            } else {
                info.a(1);
            }
        }
        if (semanticsNode.getIsFake()) {
            SemanticsNode semanticsNodeQ2 = semanticsNode.q();
            nodeCoordinatorC = semanticsNodeQ2 != null ? semanticsNodeQ2.c() : null;
        } else {
            nodeCoordinatorC = semanticsNode.c();
        }
        info.e2(!(nodeCoordinatorC != null ? nodeCoordinatorC.i3() : false) && SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties3.l()) == null);
        androidx.compose.ui.semantics.e eVar = (androidx.compose.ui.semantics.e) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties3.p());
        if (eVar != null) {
            int value2 = eVar.getValue();
            androidx.compose.ui.semantics.e.Companion companion2 = androidx.compose.ui.semantics.e.INSTANCE;
            info.x1((androidx.compose.ui.semantics.e.f(value2, companion2.b()) || !androidx.compose.ui.semantics.e.f(value2, companion2.a())) ? 1 : 2);
            kotlin.b2 b2Var5 = kotlin.b2.f124493a;
        }
        info.c1(false);
        androidx.compose.ui.semantics.j unmergedConfig5 = semanticsNode.getUnmergedConfig();
        androidx.compose.ui.semantics.i iVar = androidx.compose.ui.semantics.i.f16129a;
        AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.a(unmergedConfig5, iVar.h());
        if (accessibilityAction != null) {
            boolean zG = kotlin.jvm.internal.f0.g(SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties3.v()), Boolean.TRUE);
            info.c1(!zG);
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.k(semanticsNode) && !zG) {
                info.b(new androidx.core.view.accessibility.a0.a(16, accessibilityAction.getLabel()));
            }
            kotlin.b2 b2Var6 = kotlin.b2.f124493a;
        }
        info.y1(false);
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), iVar.i());
        if (accessibilityAction2 != null) {
            info.y1(true);
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.k(semanticsNode)) {
                info.b(new androidx.core.view.accessibility.a0.a(32, accessibilityAction2.getLabel()));
            }
            kotlin.b2 b2Var7 = kotlin.b2.f124493a;
        }
        AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), iVar.b());
        if (accessibilityAction3 != null) {
            info.b(new androidx.core.view.accessibility.a0.a(16384, accessibilityAction3.getLabel()));
            kotlin.b2 b2Var8 = kotlin.b2.f124493a;
        }
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.k(semanticsNode)) {
            AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), iVar.p());
            if (accessibilityAction4 != null) {
                info.b(new androidx.core.view.accessibility.a0.a(2097152, accessibilityAction4.getLabel()));
                kotlin.b2 b2Var9 = kotlin.b2.f124493a;
            }
            AccessibilityAction accessibilityAction5 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), iVar.d());
            if (accessibilityAction5 != null) {
                info.b(new androidx.core.view.accessibility.a0.a(65536, accessibilityAction5.getLabel()));
                kotlin.b2 b2Var10 = kotlin.b2.f124493a;
            }
            AccessibilityAction accessibilityAction6 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), iVar.j());
            if (accessibilityAction6 != null) {
                if (info.u0() && this.view.getClipboardManager().b()) {
                    info.b(new androidx.core.view.accessibility.a0.a(32768, accessibilityAction6.getLabel()));
                }
                kotlin.b2 b2Var11 = kotlin.b2.f124493a;
            }
        }
        String strY = y(semanticsNode);
        if (!(strY == null || strY.length() == 0)) {
            info.V1(v(semanticsNode), u(semanticsNode));
            AccessibilityAction accessibilityAction7 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), iVar.o());
            info.b(new androidx.core.view.accessibility.a0.a(131072, accessibilityAction7 != null ? accessibilityAction7.getLabel() : null));
            info.a(256);
            info.a(512);
            info.B1(11);
            List list2 = (List) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties3.c());
            if ((list2 == null || list2.isEmpty()) && semanticsNode.getUnmergedConfig().e(iVar.g()) && !AndroidComposeViewAccessibilityDelegateCompat_androidKt.l(semanticsNode)) {
                info.B1(info.N() | 4 | 16);
            }
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 26) {
            ArrayList arrayList = new ArrayList();
            CharSequence charSequenceW = info.W();
            if (!(charSequenceW == null || charSequenceW.length() == 0) && semanticsNode.getUnmergedConfig().e(iVar.g())) {
                arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
            }
            if (semanticsNode.getUnmergedConfig().e(semanticsProperties3.x())) {
                arrayList.add(B);
            }
            if (!arrayList.isEmpty()) {
                androidx.compose.ui.platform.e eVar2 = androidx.compose.ui.platform.e.f15845a;
                AccessibilityNodeInfo accessibilityNodeInfoF2 = info.f2();
                kotlin.jvm.internal.f0.o(accessibilityNodeInfoF2, "info.unwrap()");
                eVar2.a(accessibilityNodeInfoF2, arrayList);
            }
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties3.s());
        if (progressBarRangeInfo != null) {
            if (semanticsNode.getUnmergedConfig().e(iVar.n())) {
                info.b1("android.widget.SeekBar");
            } else {
                info.b1("android.widget.ProgressBar");
            }
            if (progressBarRangeInfo != ProgressBarRangeInfo.INSTANCE.a()) {
                info.I1(androidx.core.view.accessibility.a0.f.e(1, progressBarRangeInfo.c().D().floatValue(), progressBarRangeInfo.c().e().floatValue(), progressBarRangeInfo.getCurrent()));
                if (info.V() == null) {
                    fi.f<Float> fVarC = progressBarRangeInfo.c();
                    float fH = fi.u.H(((fVarC.e().floatValue() - fVarC.D().floatValue()) > 0.0f ? 1 : ((fVarC.e().floatValue() - fVarC.D().floatValue()) == 0.0f ? 0 : -1)) == 0 ? 0.0f : (progressBarRangeInfo.getCurrent() - fVarC.D().floatValue()) / (fVarC.e().floatValue() - fVarC.D().floatValue()), 0.0f, 1.0f);
                    int I = 100;
                    if (fH == 0.0f) {
                        I = 0;
                    } else if (!(fH == 1.0f)) {
                        I = fi.u.I(di.d.L0(fH * 100), 1, 99);
                    }
                    info.R1(this.view.getContext().getResources().getString(R.string.template_percent, Integer.valueOf(I)));
                }
            } else if (info.V() == null) {
                info.R1(this.view.getContext().getResources().getString(R.string.in_progress));
            }
            if (semanticsNode.getUnmergedConfig().e(iVar.n()) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.k(semanticsNode)) {
                if (progressBarRangeInfo.getCurrent() < fi.u.t(progressBarRangeInfo.c().e().floatValue(), progressBarRangeInfo.c().D().floatValue())) {
                    info.b(androidx.core.view.accessibility.a0.a.f21388r);
                }
                if (progressBarRangeInfo.getCurrent() > fi.u.A(progressBarRangeInfo.c().D().floatValue(), progressBarRangeInfo.c().e().floatValue())) {
                    info.b(androidx.core.view.accessibility.a0.a.f21389s);
                }
            }
        }
        if (i13 >= 24) {
            b.a(info, semanticsNode);
        }
        CollectionInfoKt.d(semanticsNode, info);
        CollectionInfoKt.e(semanticsNode, info);
        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties3.i());
        AccessibilityAction accessibilityAction8 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), iVar.l());
        if (scrollAxisRange != null && accessibilityAction8 != null) {
            if (!CollectionInfoKt.b(semanticsNode)) {
                info.b1("android.widget.HorizontalScrollView");
            }
            if (scrollAxisRange.a().invoke().floatValue() > 0.0f) {
                info.M1(true);
            }
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.k(semanticsNode)) {
                if (Q(scrollAxisRange)) {
                    info.b(androidx.core.view.accessibility.a0.a.f21388r);
                    info.b(!AndroidComposeViewAccessibilityDelegateCompat_androidKt.s(semanticsNode) ? androidx.core.view.accessibility.a0.a.G : androidx.core.view.accessibility.a0.a.E);
                }
                if (P(scrollAxisRange)) {
                    info.b(androidx.core.view.accessibility.a0.a.f21389s);
                    info.b(!AndroidComposeViewAccessibilityDelegateCompat_androidKt.s(semanticsNode) ? androidx.core.view.accessibility.a0.a.E : androidx.core.view.accessibility.a0.a.G);
                }
            }
        }
        ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties3.B());
        if (scrollAxisRange2 != null && accessibilityAction8 != null) {
            if (!CollectionInfoKt.b(semanticsNode)) {
                info.b1("android.widget.ScrollView");
            }
            if (scrollAxisRange2.a().invoke().floatValue() > 0.0f) {
                info.M1(true);
            }
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.k(semanticsNode)) {
                if (Q(scrollAxisRange2)) {
                    info.b(androidx.core.view.accessibility.a0.a.f21388r);
                    info.b(androidx.core.view.accessibility.a0.a.F);
                }
                if (P(scrollAxisRange2)) {
                    info.b(androidx.core.view.accessibility.a0.a.f21389s);
                    info.b(androidx.core.view.accessibility.a0.a.D);
                }
            }
        }
        info.E1((CharSequence) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties3.q()));
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.k(semanticsNode)) {
            AccessibilityAction accessibilityAction9 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), iVar.f());
            if (accessibilityAction9 != null) {
                info.b(new androidx.core.view.accessibility.a0.a(262144, accessibilityAction9.getLabel()));
                kotlin.b2 b2Var12 = kotlin.b2.f124493a;
            }
            AccessibilityAction accessibilityAction10 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), iVar.a());
            if (accessibilityAction10 != null) {
                info.b(new androidx.core.view.accessibility.a0.a(524288, accessibilityAction10.getLabel()));
                kotlin.b2 b2Var13 = kotlin.b2.f124493a;
            }
            AccessibilityAction accessibilityAction11 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), iVar.e());
            if (accessibilityAction11 != null) {
                info.b(new androidx.core.view.accessibility.a0.a(1048576, accessibilityAction11.getLabel()));
                kotlin.b2 b2Var14 = kotlin.b2.f124493a;
            }
            if (semanticsNode.getUnmergedConfig().e(iVar.c())) {
                List list3 = (List) semanticsNode.getUnmergedConfig().h(iVar.c());
                int size2 = list3.size();
                int[] iArr = H;
                if (size2 >= iArr.length) {
                    throw new IllegalStateException("Can't have more than " + iArr.length + " custom actions for one widget");
                }
                androidx.collection.l2<CharSequence> l2Var = new androidx.collection.l2<>();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (this.labelToActionId.d(i10)) {
                    Map<CharSequence, Integer> mapG = this.labelToActionId.g(i10);
                    List<Integer> listSz = ArraysKt___ArraysKt.sz(iArr);
                    ArrayList arrayList2 = new ArrayList();
                    int size3 = list3.size();
                    for (int i14 = 0; i14 < size3; i14++) {
                        CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) list3.get(i14);
                        kotlin.jvm.internal.f0.m(mapG);
                        if (mapG.containsKey(customAccessibilityAction.getLabel())) {
                            Integer num = mapG.get(customAccessibilityAction.getLabel());
                            kotlin.jvm.internal.f0.m(num);
                            l2Var.n(num.intValue(), customAccessibilityAction.getLabel());
                            linkedHashMap.put(customAccessibilityAction.getLabel(), num);
                            listSz.remove(num);
                            info.b(new androidx.core.view.accessibility.a0.a(num.intValue(), customAccessibilityAction.getLabel()));
                        } else {
                            arrayList2.add(customAccessibilityAction);
                        }
                    }
                    int size4 = arrayList2.size();
                    for (int i15 = 0; i15 < size4; i15++) {
                        CustomAccessibilityAction customAccessibilityAction2 = (CustomAccessibilityAction) arrayList2.get(i15);
                        int iIntValue = listSz.get(i15).intValue();
                        l2Var.n(iIntValue, customAccessibilityAction2.getLabel());
                        linkedHashMap.put(customAccessibilityAction2.getLabel(), Integer.valueOf(iIntValue));
                        info.b(new androidx.core.view.accessibility.a0.a(iIntValue, customAccessibilityAction2.getLabel()));
                    }
                } else {
                    int size5 = list3.size();
                    for (int i16 = 0; i16 < size5; i16++) {
                        CustomAccessibilityAction customAccessibilityAction3 = (CustomAccessibilityAction) list3.get(i16);
                        int i17 = H[i16];
                        l2Var.n(i17, customAccessibilityAction3.getLabel());
                        linkedHashMap.put(customAccessibilityAction3.getLabel(), Integer.valueOf(i17));
                        info.b(new androidx.core.view.accessibility.a0.a(i17, customAccessibilityAction3.getLabel()));
                    }
                }
                this.actionIdToLabel.n(i10, l2Var);
                this.labelToActionId.n(i10, linkedHashMap);
            }
        }
        info.L1(semanticsNode.getUnmergedConfig().getIsMergingSemanticsOfDescendants() || (z10 && (info.A() != null || info.W() != null || info.F() != null || info.V() != null || info.l0())));
    }

    @androidx.annotation.j1
    public final void b0(@dl.d Map<Integer, r1> newSemanticsNodes) {
        boolean zU;
        String text;
        kotlin.jvm.internal.f0.p(newSemanticsNodes, "newSemanticsNodes");
        ArrayList arrayList = new ArrayList(this.scrollObservationScopes);
        this.scrollObservationScopes.clear();
        Iterator<Integer> it = newSemanticsNodes.keySet().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            g gVar = this.previousSemanticsNodes.get(Integer.valueOf(iIntValue));
            if (gVar != null) {
                r1 r1Var = newSemanticsNodes.get(Integer.valueOf(iIntValue));
                SemanticsNode semanticsNode = r1Var != null ? r1Var.getSemanticsNode() : null;
                kotlin.jvm.internal.f0.m(semanticsNode);
                Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> it2 = semanticsNode.getUnmergedConfig().iterator();
                while (true) {
                    zU = false;
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object> next = it2.next();
                        SemanticsPropertyKey<?> key = next.getKey();
                        SemanticsProperties semanticsProperties = SemanticsProperties.f16032a;
                        if (((kotlin.jvm.internal.f0.g(key, semanticsProperties.i()) || kotlin.jvm.internal.f0.g(next.getKey(), semanticsProperties.B())) ? R(iIntValue, arrayList) : false) || !kotlin.jvm.internal.f0.g(next.getValue(), SemanticsConfigurationKt.a(gVar.getUnmergedConfig(), next.getKey()))) {
                            SemanticsPropertyKey<?> key2 = next.getKey();
                            if (kotlin.jvm.internal.f0.g(key2, semanticsProperties.q())) {
                                Object value = next.getValue();
                                kotlin.jvm.internal.f0.n(value, "null cannot be cast to non-null type kotlin.String");
                                String str = (String) value;
                                if (gVar.c()) {
                                    Y(iIntValue, 8, str);
                                }
                            } else if (kotlin.jvm.internal.f0.g(key2, semanticsProperties.w()) ? true : kotlin.jvm.internal.f0.g(key2, semanticsProperties.A())) {
                                X(this, U(iIntValue), 2048, 64, null, 8, null);
                                X(this, U(iIntValue), 2048, 0, null, 8, null);
                            } else if (kotlin.jvm.internal.f0.g(key2, semanticsProperties.s())) {
                                X(this, U(iIntValue), 2048, 64, null, 8, null);
                                X(this, U(iIntValue), 2048, 0, null, 8, null);
                            } else if (kotlin.jvm.internal.f0.g(key2, semanticsProperties.v())) {
                                androidx.compose.ui.semantics.g gVar2 = (androidx.compose.ui.semantics.g) SemanticsConfigurationKt.a(semanticsNode.k(), semanticsProperties.t());
                                if (!(gVar2 == null ? false : androidx.compose.ui.semantics.g.j(gVar2.getValue(), androidx.compose.ui.semantics.g.INSTANCE.f()))) {
                                    X(this, U(iIntValue), 2048, 64, null, 8, null);
                                    X(this, U(iIntValue), 2048, 0, null, 8, null);
                                } else if (kotlin.jvm.internal.f0.g(SemanticsConfigurationKt.a(semanticsNode.k(), semanticsProperties.v()), Boolean.TRUE)) {
                                    AccessibilityEvent accessibilityEventP = p(U(iIntValue), 4);
                                    SemanticsNode semanticsNode2 = new SemanticsNode(semanticsNode.getOuterSemanticsNode(), true, null, 4, null);
                                    List list = (List) SemanticsConfigurationKt.a(semanticsNode2.k(), semanticsProperties.c());
                                    String strF = list != null ? androidx.compose.ui.s.f(list, Constants.ACCEPT_TIME_SEPARATOR_SP, null, null, 0, null, null, 62, null) : null;
                                    List list2 = (List) SemanticsConfigurationKt.a(semanticsNode2.k(), semanticsProperties.y());
                                    String strF2 = list2 != null ? androidx.compose.ui.s.f(list2, Constants.ACCEPT_TIME_SEPARATOR_SP, null, null, 0, null, null, 62, null) : null;
                                    if (strF != null) {
                                        accessibilityEventP.setContentDescription(strF);
                                        kotlin.b2 b2Var = kotlin.b2.f124493a;
                                    }
                                    if (strF2 != null) {
                                        accessibilityEventP.getText().add(strF2);
                                    }
                                    V(accessibilityEventP);
                                } else {
                                    X(this, U(iIntValue), 2048, 0, null, 8, null);
                                }
                            } else if (kotlin.jvm.internal.f0.g(key2, semanticsProperties.c())) {
                                int iU = U(iIntValue);
                                Object value2 = next.getValue();
                                kotlin.jvm.internal.f0.n(value2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                W(iU, 2048, 4, (List) value2);
                            } else {
                                String str2 = "";
                                if (kotlin.jvm.internal.f0.g(key2, semanticsProperties.e())) {
                                    if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.t(semanticsNode)) {
                                        androidx.compose.ui.text.d dVarC = C(gVar.getUnmergedConfig());
                                        if (dVarC == null) {
                                            dVarC = "";
                                        }
                                        androidx.compose.ui.text.d dVarC2 = C(semanticsNode.getUnmergedConfig());
                                        str2 = dVarC2 != null ? dVarC2 : "";
                                        int length = dVarC.length();
                                        int length2 = str2.length();
                                        int iB = fi.u.B(length, length2);
                                        int i10 = 0;
                                        while (i10 < iB && dVarC.charAt(i10) == str2.charAt(i10)) {
                                            i10++;
                                        }
                                        int i11 = 0;
                                        while (i11 < iB - i10) {
                                            int i12 = iB;
                                            if (dVarC.charAt((length - 1) - i11) != str2.charAt((length2 - 1) - i11)) {
                                                break;
                                            }
                                            i11++;
                                            iB = i12;
                                        }
                                        AccessibilityEvent accessibilityEventP2 = p(U(iIntValue), 16);
                                        accessibilityEventP2.setFromIndex(i10);
                                        accessibilityEventP2.setRemovedCount((length - i11) - i10);
                                        accessibilityEventP2.setAddedCount((length2 - i11) - i10);
                                        accessibilityEventP2.setBeforeText(dVarC);
                                        accessibilityEventP2.getText().add(m0(str2, 100000));
                                        V(accessibilityEventP2);
                                    } else {
                                        X(this, U(iIntValue), 2048, 2, null, 8, null);
                                    }
                                } else if (kotlin.jvm.internal.f0.g(key2, semanticsProperties.z())) {
                                    androidx.compose.ui.text.d dVarC3 = C(semanticsNode.getUnmergedConfig());
                                    if (dVarC3 != null && (text = dVarC3.getText()) != null) {
                                        str2 = text;
                                    }
                                    long packedValue = ((androidx.compose.ui.text.o0) semanticsNode.getUnmergedConfig().h(semanticsProperties.z())).getPackedValue();
                                    V(r(U(iIntValue), Integer.valueOf(androidx.compose.ui.text.o0.n(packedValue)), Integer.valueOf(androidx.compose.ui.text.o0.i(packedValue)), Integer.valueOf(str2.length()), (String) m0(str2, 100000)));
                                    Z(semanticsNode.getId());
                                } else if (kotlin.jvm.internal.f0.g(key2, semanticsProperties.i()) ? true : kotlin.jvm.internal.f0.g(key2, semanticsProperties.B())) {
                                    I(semanticsNode.getLayoutNode());
                                    q1 q1VarM = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m(this.scrollObservationScopes, iIntValue);
                                    kotlin.jvm.internal.f0.m(q1VarM);
                                    q1VarM.g((ScrollAxisRange) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties.i()));
                                    q1VarM.j((ScrollAxisRange) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties.B()));
                                    a0(q1VarM);
                                } else if (kotlin.jvm.internal.f0.g(key2, semanticsProperties.g())) {
                                    Object value3 = next.getValue();
                                    kotlin.jvm.internal.f0.n(value3, "null cannot be cast to non-null type kotlin.Boolean");
                                    if (((Boolean) value3).booleanValue()) {
                                        V(p(U(semanticsNode.getId()), 8));
                                    }
                                    X(this, U(semanticsNode.getId()), 2048, 0, null, 8, null);
                                } else {
                                    androidx.compose.ui.semantics.i iVar = androidx.compose.ui.semantics.i.f16129a;
                                    if (kotlin.jvm.internal.f0.g(key2, iVar.c())) {
                                        List list3 = (List) semanticsNode.getUnmergedConfig().h(iVar.c());
                                        List list4 = (List) SemanticsConfigurationKt.a(gVar.getUnmergedConfig(), iVar.c());
                                        if (list4 != null) {
                                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                                            int size = list3.size();
                                            for (int i13 = 0; i13 < size; i13++) {
                                                linkedHashSet.add(((CustomAccessibilityAction) list3.get(i13)).getLabel());
                                            }
                                            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                            int size2 = list4.size();
                                            for (int i14 = 0; i14 < size2; i14++) {
                                                linkedHashSet2.add(((CustomAccessibilityAction) list4.get(i14)).getLabel());
                                            }
                                            if (linkedHashSet.containsAll(linkedHashSet2) && linkedHashSet2.containsAll(linkedHashSet)) {
                                            }
                                        } else if (!list3.isEmpty()) {
                                        }
                                        zU = true;
                                    } else if (next.getValue() instanceof AccessibilityAction) {
                                        Object value4 = next.getValue();
                                        kotlin.jvm.internal.f0.n(value4, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                                        zU = !AndroidComposeViewAccessibilityDelegateCompat_androidKt.j((AccessibilityAction) value4, SemanticsConfigurationKt.a(gVar.getUnmergedConfig(), next.getKey()));
                                    } else {
                                        zU = true;
                                    }
                                }
                            }
                        }
                    }
                }
                if (!zU) {
                    zU = AndroidComposeViewAccessibilityDelegateCompat_androidKt.u(semanticsNode, gVar);
                }
                if (zU) {
                    X(this, U(iIntValue), 2048, 0, null, 8, null);
                }
            }
        }
    }

    public final void e0(boolean z10) {
        this.accessibilityForceEnabledForTesting = z10;
    }

    @Override // androidx.core.view.a
    @dl.d
    public androidx.core.view.accessibility.c0 getAccessibilityNodeProvider(@dl.d View host) {
        kotlin.jvm.internal.f0.p(host, "host");
        return this.nodeProvider;
    }

    public final void h0(int i10) {
        this.hoveredVirtualViewId = i10;
    }

    public final void i0(@dl.d Map<Integer, g> map) {
        kotlin.jvm.internal.f0.p(map, "<set-?>");
        this.previousSemanticsNodes = map;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0071 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    /* JADX WARN: Code duplicated, block: B:31:0x007d A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:13:0x0034, B:25:0x0063, B:29:0x0075, B:31:0x007d, B:33:0x0086, B:35:0x008f, B:36:0x00a0, B:38:0x00a7, B:39:0x00b0, B:18:0x004d), top: B:48:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0086 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:13:0x0034, B:25:0x0063, B:29:0x0075, B:31:0x007d, B:33:0x0086, B:35:0x008f, B:36:0x00a0, B:38:0x00a7, B:39:0x00b0, B:18:0x004d), top: B:48:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x008f A[Catch: all -> 0x0051, LOOP:0: B:34:0x008d->B:35:0x008f, LOOP_END, TryCatch #0 {all -> 0x0051, blocks: (B:13:0x0034, B:25:0x0063, B:29:0x0075, B:31:0x007d, B:33:0x0086, B:35:0x008f, B:36:0x00a0, B:38:0x00a7, B:39:0x00b0, B:18:0x004d), top: B:48:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a7 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:13:0x0034, B:25:0x0063, B:29:0x0075, B:31:0x007d, B:33:0x0086, B:35:0x008f, B:36:0x00a0, B:38:0x00a7, B:39:0x00b0, B:18:0x004d), top: B:48:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00c3 -> B:14:0x0037). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @dl.e
    public final java.lang.Object k(@dl.d kotlin.coroutines.c<? super kotlin.b2> r11) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.k(kotlin.coroutines.c):java.lang.Object");
    }

    public final boolean l(boolean vertical, int direction, long position) {
        return m(w().values(), vertical, direction, position);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    @androidx.annotation.j1(otherwise = 2)
    public final boolean m(@dl.d Collection<r1> currentSemanticsNodes, boolean vertical, int direction, long position) {
        SemanticsPropertyKey<ScrollAxisRange> semanticsPropertyKeyI;
        ScrollAxisRange scrollAxisRange;
        boolean z10;
        kotlin.jvm.internal.f0.p(currentSemanticsNodes, "currentSemanticsNodes");
        if (b1.f.l(position, b1.f.f30364b.c()) || !b1.f.t(position)) {
            return false;
        }
        if (vertical) {
            semanticsPropertyKeyI = SemanticsProperties.f16032a.B();
        } else {
            if (vertical) {
                throw new NoWhenBranchMatchedException();
            }
            semanticsPropertyKeyI = SemanticsProperties.f16032a.i();
        }
        if (currentSemanticsNodes.isEmpty()) {
            return false;
        }
        for (r1 r1Var : currentSemanticsNodes) {
            if (androidx.compose.ui.graphics.w1.c(r1Var.getAdjustedBounds()).f(position) && (scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.a(r1Var.getSemanticsNode().k(), semanticsPropertyKeyI)) != null) {
                int i10 = scrollAxisRange.getReverseScrolling() ? -direction : direction;
                if (direction == 0 && scrollAxisRange.getReverseScrolling()) {
                    i10 = -1;
                }
                if (i10 >= 0 ? scrollAxisRange.c().invoke().floatValue() >= scrollAxisRange.a().invoke().floatValue() : scrollAxisRange.c().invoke().floatValue() <= 0.0f) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } else {
                z10 = false;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @androidx.annotation.j1
    @dl.d
    public final AccessibilityEvent p(int virtualViewId, int eventType) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(eventType);
        kotlin.jvm.internal.f0.o(accessibilityEventObtain, "obtain(eventType)");
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName(f15475z);
        accessibilityEventObtain.setPackageName(this.view.getContext().getPackageName());
        accessibilityEventObtain.setSource(this.view, virtualViewId);
        r1 r1Var = w().get(Integer.valueOf(virtualViewId));
        if (r1Var != null) {
            accessibilityEventObtain.setPassword(AndroidComposeViewAccessibilityDelegateCompat_androidKt.r(r1Var.getSemanticsNode()));
        }
        return accessibilityEventObtain;
    }

    public final boolean s(@dl.d MotionEvent event) {
        kotlin.jvm.internal.f0.p(event, "event");
        if (!F()) {
            return false;
        }
        int action = event.getAction();
        if (action == 7 || action == 9) {
            int iE = E(event.getX(), event.getY());
            boolean zDispatchGenericMotionEvent = this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(event);
            n0(iE);
            if (iE == Integer.MIN_VALUE) {
                return zDispatchGenericMotionEvent;
            }
            return true;
        }
        if (action != 10) {
            return false;
        }
        if (this.hoveredVirtualViewId == Integer.MIN_VALUE) {
            return this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(event);
        }
        n0(Integer.MIN_VALUE);
        return true;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final boolean getAccessibilityForceEnabledForTesting() {
        return this.accessibilityForceEnabledForTesting;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final int getHoveredVirtualViewId() {
        return this.hoveredVirtualViewId;
    }
}
