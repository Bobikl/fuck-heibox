package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.focus.FocusManagerImpl;
import androidx.compose.ui.focus.FocusModifier;
import androidx.compose.ui.input.pointer.PointerInputEventData;
import androidx.compose.ui.input.rotary.RotaryInputModifierKt;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.layout.RootMeasurePolicy;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.text.input.TextInputServiceAndroid;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.ak;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000ø\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0002æ\u0002\b\u0001\u0018\u0000 µ\u00032\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0003¶\u0003RB\u0013\u0012\b\u0010²\u0003\u001a\u00030±\u0003¢\u0006\u0006\b³\u0003\u0010´\u0003J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0001H\u0002J\u0014\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\u0007H\u0002J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\tH\u0002J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\tH\u0002J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0014H\u0002J\u0010\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J \u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001f\u0010\u001bJ*\u0010$\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\f2\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020\u0016H\u0002J\u0010\u0010%\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0014H\u0002J\b\u0010&\u001a\u00020\u0007H\u0002J\u0010\u0010'\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0014H\u0002J\b\u0010(\u001a\u00020\u0007H\u0002J\b\u0010)\u001a\u00020\u0016H\u0002J\u0010\u0010*\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010+\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u001a\u0010/\u001a\u0004\u0018\u00010-2\u0006\u0010,\u001a\u00020\f2\u0006\u0010.\u001a\u00020-H\u0002J\u0010\u00102\u001a\u00020\u00072\u0006\u00101\u001a\u000200H\u0016J\u0010\u00105\u001a\u00020\u00072\u0006\u00104\u001a\u000203H\u0016J\"\u00109\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u00162\u0006\u00107\u001a\u00020\f2\b\u00108\u001a\u0004\u0018\u000100H\u0014J\u0010\u0010;\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u0016H\u0016J\u001d\u0010>\u001a\u00020\u00162\u0006\u0010=\u001a\u00020<H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b>\u0010?J\u0010\u0010A\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020@H\u0016J\u0010\u0010B\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u0010\u0010C\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u0006\u0010D\u001a\u00020\u0007J\b\u0010E\u001a\u00020\u0007H\u0016J\u0016\u0010H\u001a\u00020\u00072\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00070FH\u0016J\u0016\u0010L\u001a\u00020\u00072\u0006\u0010J\u001a\u00020I2\u0006\u0010K\u001a\u00020\tJ\u000e\u0010M\u001a\u00020\u00072\u0006\u0010J\u001a\u00020IJ\u0016\u0010P\u001a\u00020\u00072\u0006\u0010J\u001a\u00020I2\u0006\u0010O\u001a\u00020NJ\u0010\u0010R\u001a\u00020\u00072\u0006\u0010Q\u001a\u00020\u0016H\u0016J%\u0010U\u001a\u00020\u00072\u0006\u0010K\u001a\u00020\t2\u0006\u0010T\u001a\u00020SH\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bU\u0010VJ\u0010\u0010W\u001a\u00020\u00072\u0006\u0010K\u001a\u00020\tH\u0016J \u0010Z\u001a\u00020\u00072\u0006\u0010K\u001a\u00020\t2\u0006\u0010X\u001a\u00020\u00162\u0006\u0010Y\u001a\u00020\u0016H\u0016J \u0010[\u001a\u00020\u00072\u0006\u0010K\u001a\u00020\t2\u0006\u0010X\u001a\u00020\u00162\u0006\u0010Y\u001a\u00020\u0016H\u0016J\u0010\u0010\\\u001a\u00020\u00072\u0006\u0010K\u001a\u00020\tH\u0016J\u0018\u0010_\u001a\u00020\u00072\u0006\u0010]\u001a\u00020\f2\u0006\u0010^\u001a\u00020\fH\u0014J0\u0010c\u001a\u00020\u00072\u0006\u0010`\u001a\u00020\u00162\u0006\u0010a\u001a\u00020\f2\u0006\u0010b\u001a\u00020\f2\u0006\u0010[\u001a\u00020\f2\u0006\u0010R\u001a\u00020\fH\u0014J\u0010\u0010d\u001a\u00020\u00072\u0006\u0010O\u001a\u00020NH\u0014J*\u0010j\u001a\u00020i2\u0012\u0010g\u001a\u000e\u0012\u0004\u0012\u00020f\u0012\u0004\u0012\u00020\u00070e2\f\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00070FH\u0016J\u0017\u0010l\u001a\u00020\u00162\u0006\u0010k\u001a\u00020iH\u0000¢\u0006\u0004\bl\u0010mJ\b\u0010n\u001a\u00020\u0007H\u0016J\u0010\u0010b\u001a\u00020\u00072\u0006\u0010K\u001a\u00020\tH\u0016J\u0010\u0010p\u001a\u00020\u00072\u0006\u0010G\u001a\u00020oH\u0016J\u001f\u0010r\u001a\u0004\u0018\u00010q2\u0006\u0010=\u001a\u00020<H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\br\u0010sJ\u0010\u0010t\u001a\u00020\u00072\u0006\u0010O\u001a\u00020NH\u0014J\u001f\u0010v\u001a\u00020\u00072\u0006\u0010k\u001a\u00020i2\u0006\u0010u\u001a\u00020\u0016H\u0000¢\u0006\u0004\bv\u0010wJ\u001a\u0010z\u001a\u00020\u00072\u0012\u0010y\u001a\u000e\u0012\u0004\u0012\u00020x\u0012\u0004\u0012\u00020\u00070eJ\u0013\u0010{\u001a\u00020\u0007H\u0086@ø\u0001\u0002¢\u0006\u0004\b{\u0010|J\u0013\u0010}\u001a\u00020\u0007H\u0086@ø\u0001\u0002¢\u0006\u0004\b}\u0010|J\b\u0010~\u001a\u00020\u0007H\u0016J\b\u0010\u007f\u001a\u00020\u0007H\u0014J\t\u0010\u0080\u0001\u001a\u00020\u0007H\u0014J\u001e\u0010\u0084\u0001\u001a\u00020\u00072\n\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u00012\u0007\u0010\u0083\u0001\u001a\u00020\fH\u0016J\u001a\u0010\u0088\u0001\u001a\u00020\u00072\u000f\u0010\u0087\u0001\u001a\n\u0012\u0005\u0012\u00030\u0086\u00010\u0085\u0001H\u0016J\u0011\u0010\u0089\u0001\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0011\u0010\u008a\u0001\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0014H\u0016J\u0011\u0010\u008b\u0001\u001a\u00020\u00162\u0006\u00107\u001a\u00020\fH\u0016J\u0011\u0010\u008c\u0001\u001a\u00020\u00162\u0006\u00107\u001a\u00020\fH\u0016J#\u0010\u008f\u0001\u001a\u00030\u008d\u00012\b\u0010\u008e\u0001\u001a\u00030\u008d\u0001H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J#\u0010\u0092\u0001\u001a\u00030\u008d\u00012\b\u0010\u0091\u0001\u001a\u00030\u008d\u0001H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\b\u0092\u0001\u0010\u0090\u0001J\t\u0010\u0093\u0001\u001a\u00020\u0016H\u0016J\u0016\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0096\u00012\b\u0010\u0095\u0001\u001a\u00030\u0094\u0001H\u0016J#\u0010\u0099\u0001\u001a\u00030\u008d\u00012\b\u0010\u0098\u0001\u001a\u00030\u008d\u0001H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\b\u0099\u0001\u0010\u0090\u0001J#\u0010\u009a\u0001\u001a\u00030\u008d\u00012\b\u0010\u008e\u0001\u001a\u00030\u008d\u0001H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\b\u009a\u0001\u0010\u0090\u0001J\u0013\u0010\u009d\u0001\u001a\u00020\u00072\b\u0010\u009c\u0001\u001a\u00030\u009b\u0001H\u0014J\u0012\u0010\u009f\u0001\u001a\u00020\u00072\u0007\u0010\u009e\u0001\u001a\u00020\fH\u0016J\u0011\u0010 \u0001\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0011\u0010¡\u0001\u001a\u0004\u0018\u00010-2\u0006\u0010,\u001a\u00020\fJ\t\u0010¢\u0001\u001a\u00020\u0016H\u0016R\"\u0010¤\u0001\u001a\u00030\u008d\u00018\u0002@\u0002X\u0082\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0007\n\u0005\bR\u0010£\u0001R\u0017\u0010¥\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010\u001aR \u0010«\u0001\u001a\u00030¦\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001R\u0017\u0010®\u0001\u001a\u00030¬\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bp\u0010\u00ad\u0001R\u0018\u0010²\u0001\u001a\u00030¯\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u0018\u0010µ\u0001\u001a\u00030³\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010´\u0001R\u0017\u0010¸\u0001\u001a\u00030¶\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bU\u0010·\u0001R\u0017\u0010»\u0001\u001a\u00030¹\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b5\u0010º\u0001R\u0017\u0010¾\u0001\u001a\u00030¼\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b>\u0010½\u0001R\u001e\u0010Â\u0001\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\ba\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001R \u0010Ç\u0001\u001a\u00030Ã\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010Ä\u0001\u001a\u0006\bÅ\u0001\u0010Æ\u0001R\u001f\u0010Ì\u0001\u001a\u00030È\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bH\u0010É\u0001\u001a\u0006\bÊ\u0001\u0010Ë\u0001R\u0017\u0010Ï\u0001\u001a\u00030Í\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bj\u0010Î\u0001R\u001e\u0010Ó\u0001\u001a\t\u0012\u0004\u0012\u00020i0Ð\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÑ\u0001\u0010Ò\u0001R!\u0010Ô\u0001\u001a\u000b\u0012\u0004\u0012\u00020i\u0018\u00010Ð\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b[\u0010Ò\u0001R\u0018\u0010Õ\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009a\u0001\u0010\u001aR\u0017\u0010Ø\u0001\u001a\u00030Ö\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bb\u0010×\u0001R\u0017\u0010Û\u0001\u001a\u00030Ù\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bW\u0010Ú\u0001R\u0017\u0010Ü\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010\u001aR\u001f\u0010á\u0001\u001a\u00030Ý\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b~\u0010Þ\u0001\u001a\u0006\bß\u0001\u0010à\u0001R \u0010æ\u0001\u001a\u00030â\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u008f\u0001\u0010ã\u0001\u001a\u0006\bä\u0001\u0010å\u0001R\u001f\u0010ë\u0001\u001a\u00030ç\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bn\u0010è\u0001\u001a\u0006\bé\u0001\u0010ê\u0001R0\u0010ó\u0001\u001a\u00020\u00168\u0016@\u0016X\u0096\u000e¢\u0006\u001f\n\u0005\bì\u0001\u0010\u001a\u0012\u0006\bñ\u0001\u0010ò\u0001\u001a\u0006\bí\u0001\u0010î\u0001\"\u0006\bï\u0001\u0010ð\u0001R\u001c\u0010÷\u0001\u001a\u0005\u0018\u00010ô\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bõ\u0001\u0010ö\u0001R\u001c\u0010û\u0001\u001a\u0005\u0018\u00010ø\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bù\u0001\u0010ú\u0001R\u0018\u0010ý\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bü\u0001\u0010\u001aR\u0018\u0010\u0081\u0002\u001a\u00030þ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÿ\u0001\u0010\u0080\u0002R \u0010\u0087\u0002\u001a\u00030\u0082\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0083\u0002\u0010\u0084\u0002\u001a\u0006\b\u0085\u0002\u0010\u0086\u0002R#\u0010\u008a\u0002\u001a\u00030\u0088\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\b\n\u0006\b\u0089\u0002\u0010£\u0001R\u0018\u0010\u008d\u0002\u001a\u00030\u008b\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010\u008c\u0002R!\u0010\u0091\u0002\u001a\u00030\u008e\u00028\u0002X\u0082\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\b\n\u0006\b\u008f\u0002\u0010\u0090\u0002R!\u0010\u0093\u0002\u001a\u00030\u008e\u00028\u0002X\u0082\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\b\n\u0006\b\u0092\u0002\u0010\u0090\u0002R1\u0010\u009a\u0002\u001a\u00020!8\u0000@\u0000X\u0081\u000e¢\u0006 \n\u0006\b\u0094\u0002\u0010£\u0001\u0012\u0006\b\u0099\u0002\u0010ò\u0001\u001a\u0006\b\u0095\u0002\u0010\u0096\u0002\"\u0006\b\u0097\u0002\u0010\u0098\u0002R\u0018\u0010\u009c\u0002\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009b\u0002\u0010\u001aR#\u0010\u009e\u0002\u001a\u00030\u008d\u00018\u0002@\u0002X\u0082\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\b\n\u0006\b\u009d\u0002\u0010£\u0001R\u0018\u0010 \u0002\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009f\u0002\u0010\u001aR6\u0010§\u0002\u001a\u0004\u0018\u00010x2\t\u0010¡\u0002\u001a\u0004\u0018\u00010x8F@BX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\bL\u0010¢\u0002\u001a\u0006\b£\u0002\u0010¤\u0002\"\u0006\b¥\u0002\u0010¦\u0002R\u0017\u0010ª\u0002\u001a\u00030¨\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b{\u0010©\u0002R\u0017\u0010\u00ad\u0002\u001a\u00030«\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\b\u0010¬\u0002R\u0017\u0010°\u0002\u001a\u00030®\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010¯\u0002R\u0017\u0010³\u0002\u001a\u00030±\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bP\u0010²\u0002R'\u0010¹\u0002\u001a\u00030´\u00028\u0016X\u0096\u0004¢\u0006\u0017\n\u0005\b/\u0010µ\u0002\u0012\u0006\b¸\u0002\u0010ò\u0001\u001a\u0006\b¶\u0002\u0010·\u0002R'\u0010¿\u0002\u001a\u00030º\u00028\u0016X\u0097\u0004¢\u0006\u0017\n\u0005\b\u0017\u0010»\u0002\u0012\u0006\b¾\u0002\u0010ò\u0001\u001a\u0006\b¼\u0002\u0010½\u0002R4\u0010Å\u0002\u001a\u00030À\u00022\b\u0010¡\u0002\u001a\u00030À\u00028V@RX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\b\u001d\u0010¢\u0002\u001a\u0006\bÁ\u0002\u0010Â\u0002\"\u0006\bÃ\u0002\u0010Ä\u0002R\u0018\u0010Æ\u0002\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0013\u0010\u0089\u0002R5\u0010\u009e\u0001\u001a\u00030Ç\u00022\b\u0010¡\u0002\u001a\u00030Ç\u00028V@RX\u0096\u008e\u0002¢\u0006\u0018\n\u0006\bÈ\u0002\u0010¢\u0002\u001a\u0006\bÉ\u0002\u0010Ê\u0002\"\u0006\bË\u0002\u0010Ì\u0002R \u0010Ò\u0002\u001a\u00030Í\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÎ\u0002\u0010Ï\u0002\u001a\u0006\bÐ\u0002\u0010Ñ\u0002R \u0010Ø\u0002\u001a\u00030Ó\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÔ\u0002\u0010Õ\u0002\u001a\u0006\bÖ\u0002\u0010×\u0002R\u001b\u0010Û\u0002\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÙ\u0002\u0010Ú\u0002R\u0019\u0010Ý\u0002\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÜ\u0002\u0010£\u0001R\u001e\u0010á\u0002\u001a\t\u0012\u0004\u0012\u00020i0Þ\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bß\u0002\u0010à\u0002R&\u0010å\u0002\u001a\u0011\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010F0â\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bã\u0002\u0010ä\u0002R\u0018\u0010é\u0002\u001a\u00030æ\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bç\u0002\u0010è\u0002R\u0018\u0010í\u0002\u001a\u00030ê\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bë\u0002\u0010ì\u0002R\u0018\u0010ï\u0002\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bî\u0002\u0010\u001aR\u0018\u0010ó\u0002\u001a\u00030ð\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bñ\u0002\u0010ò\u0002R\u0018\u0010õ\u0002\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bô\u0002\u0010\u001aR\u001c\u0010ù\u0002\u001a\u0005\u0018\u00010ö\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b÷\u0002\u0010ø\u0002R \u0010ÿ\u0002\u001a\u00030ú\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bû\u0002\u0010ü\u0002\u001a\u0006\bý\u0002\u0010þ\u0002R\u001c\u0010\u0082\u0003\u001a\u00020\f*\u00030\u009b\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0080\u0003\u0010\u0081\u0003R\u0016\u0010J\u001a\u00020-8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0083\u0003\u0010\u0084\u0003R,\u0010\u0086\u0003\u001a\u00030\u0085\u00032\b\u0010¡\u0002\u001a\u00030\u0085\u00038\u0016@RX\u0096\u000e¢\u0006\u0010\n\u0006\b\u0086\u0003\u0010\u0087\u0003\u001a\u0006\b\u0088\u0003\u0010\u0089\u0003R\u0018\u0010\u008d\u0003\u001a\u00030\u008a\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008b\u0003\u0010\u008c\u0003R\u0018\u0010\u0091\u0003\u001a\u00030\u008e\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008f\u0003\u0010\u0090\u0003R \u0010\u0093\u0003\u001a\u00030\u0092\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0093\u0003\u0010\u0094\u0003\u001a\u0006\b\u0095\u0003\u0010\u0096\u0003R6\u0010\u0097\u0003\u001a\u000f\u0012\u0005\u0012\u00030\u009b\u0001\u0012\u0004\u0012\u00020\u00070e8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0097\u0003\u0010\u0098\u0003\u001a\u0006\b\u0099\u0003\u0010\u009a\u0003\"\u0006\b\u009b\u0003\u0010\u009c\u0003R\u001a\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u009d\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009e\u0003\u0010\u009f\u0003R\u0018\u0010¢\u0003\u001a\u00030ô\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b \u0003\u0010¡\u0003R\u0017\u0010¤\u0003\u001a\u00020!8VX\u0096\u0004¢\u0006\b\u001a\u0006\b£\u0003\u0010\u0096\u0002R\u0017\u0010¦\u0003\u001a\u00020\u00168VX\u0096\u0004¢\u0006\b\u001a\u0006\b¥\u0003\u0010î\u0001R \u0010¨\u0003\u001a\u00030§\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¨\u0003\u0010©\u0003\u001a\u0006\bª\u0003\u0010«\u0003R\u0018\u0010¯\u0003\u001a\u00030¬\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u00ad\u0003\u0010®\u0003R\u0017\u0010°\u0003\u001a\u00020\u00168VX\u0096\u0004¢\u0006\b\u001a\u0006\b°\u0001\u0010î\u0001\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006·\u0003"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/ViewGroup;", "Landroidx/compose/ui/node/b1;", "Landroidx/compose/ui/platform/l2;", "Landroidx/compose/ui/input/pointer/n0;", "Landroidx/lifecycle/j;", "viewGroup", "Lkotlin/b2;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/ui/node/LayoutNode;", "nodeToRemeasure", "q0", "", "measureSpec", "Lkotlin/Pair;", "U", "y0", "node", "d0", "c0", "Landroid/view/MotionEvent;", androidx.core.app.o0.I0, "", "a0", "motionEvent", "Landroidx/compose/ui/input/pointer/o0;", "Z", "(Landroid/view/MotionEvent;)I", "lastEvent", "b0", "f0", "u0", "action", "", "eventTime", "forceHover", "v0", "g0", "k0", "l0", "m0", "R", "e0", "h0", "accessibilityId", "Landroid/view/View;", "currentView", androidx.exifinterface.media.a.T4, "Landroid/graphics/Rect;", "rect", "getFocusedRect", "Landroidx/lifecycle/y;", "owner", "j", "gainFocus", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "previouslyFocusedRect", "onFocusChanged", "hasWindowFocus", "onWindowFocusChanged", "Landroidx/compose/ui/input/key/b;", "keyEvent", "k", "(Landroid/view/KeyEvent;)Z", "Landroid/view/KeyEvent;", "dispatchKeyEvent", RXScreenCaptureService.KEY_WIDTH, "x", "p0", "p", "Lkotlin/Function0;", com.google.android.gms.common.internal.s.a.f52543a, "n", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", sd.b.f139384b, "layoutNode", "Q", "o0", "Landroid/graphics/Canvas;", "canvas", androidx.exifinterface.media.a.X4, "sendPointerUpdate", "b", "Ls1/b;", "constraints", "i", "(Landroidx/compose/ui/node/LayoutNode;J)V", ak.aG, "affectsLookahead", "forceRequest", ak.aF, "r", "e", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "changed", "l", "t", "onLayout", "onDraw", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/d0;", "drawBlock", "invalidateParentLayer", "Landroidx/compose/ui/node/z0;", "o", "layer", "n0", "(Landroidx/compose/ui/node/z0;)Z", androidx.exifinterface.media.a.W4, "Landroidx/compose/ui/node/b1$b;", "f", "Landroidx/compose/ui/focus/b;", "v", "(Landroid/view/KeyEvent;)Landroidx/compose/ui/focus/b;", "dispatchDraw", "isDirty", "j0", "(Landroidx/compose/ui/node/z0;Z)V", "Landroidx/compose/ui/platform/AndroidComposeView$b;", "callback", "setOnViewTreeOwnersAvailable", androidx.exifinterface.media.a.R4, "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "i0", "y", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/view/ViewStructure;", "structure", Constants.KEY_FLAGS, "onProvideAutofillVirtualStructure", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "values", "autofill", "dispatchGenericMotionEvent", "dispatchTouchEvent", "canScrollHorizontally", "canScrollVertically", "Lb1/f;", "localPosition", ak.aD, "(J)J", "positionOnScreen", RXScreenCaptureService.KEY_HEIGHT, "onCheckIsTextEditor", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "onCreateInputConnection", "positionInWindow", "m", ak.aB, "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "layoutDirection", "onRtlPropertiesChanged", "dispatchHoverEvent", "findViewByAccessibilityIdTraversal", "shouldDelayChildPressedState", "J", "lastDownPointerPosition", "superclassInitComplete", "Landroidx/compose/ui/node/b0;", "d", "Landroidx/compose/ui/node/b0;", "getSharedDrawScope", "()Landroidx/compose/ui/node/b0;", "sharedDrawScope", "Landroidx/compose/ui/semantics/m;", "Landroidx/compose/ui/semantics/m;", "semanticsModifier", "Landroidx/compose/ui/focus/FocusManagerImpl;", "g", "Landroidx/compose/ui/focus/FocusManagerImpl;", "_focusManager", "Landroidx/compose/ui/platform/p2;", "Landroidx/compose/ui/platform/p2;", "_windowInfo", "Landroidx/compose/ui/input/key/e;", "Landroidx/compose/ui/input/key/e;", "keyInputModifier", "Landroidx/compose/ui/n;", "Landroidx/compose/ui/n;", "rotaryInputModifier", "Landroidx/compose/ui/graphics/e0;", "Landroidx/compose/ui/graphics/e0;", "canvasHolder", "Landroidx/compose/ui/node/LayoutNode;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "root", "Landroidx/compose/ui/node/i1;", "Landroidx/compose/ui/node/i1;", "getRootForTest", "()Landroidx/compose/ui/node/i1;", "rootForTest", "Landroidx/compose/ui/semantics/o;", "Landroidx/compose/ui/semantics/o;", "getSemanticsOwner", "()Landroidx/compose/ui/semantics/o;", "semanticsOwner", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "accessibilityDelegate", "", "q", "Ljava/util/List;", "dirtyLayers", "postponedDirtyLayers", "isDrawingContent", "Landroidx/compose/ui/input/pointer/i;", "Landroidx/compose/ui/input/pointer/i;", "motionEventAdapter", "Landroidx/compose/ui/input/pointer/c0;", "Landroidx/compose/ui/input/pointer/c0;", "pointerInputEventProcessor", "observationClearRequested", "Landroidx/compose/ui/platform/g;", "Landroidx/compose/ui/platform/g;", "getClipboardManager", "()Landroidx/compose/ui/platform/g;", "clipboardManager", "Landroidx/compose/ui/platform/f;", "Landroidx/compose/ui/platform/f;", "getAccessibilityManager", "()Landroidx/compose/ui/platform/f;", "accessibilityManager", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "B", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "(Z)V", "getShowLayoutBounds$annotations", "()V", "showLayoutBounds", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "C", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "_androidViewsHandler", "Landroidx/compose/ui/platform/DrawChildContainer;", "D", "Landroidx/compose/ui/platform/DrawChildContainer;", "viewLayersContainer", "F", "wasMeasuredWithMultipleConstraints", "Landroidx/compose/ui/node/j0;", "G", "Landroidx/compose/ui/node/j0;", "measureAndLayoutDelegate", "Landroidx/compose/ui/platform/d2;", "H", "Landroidx/compose/ui/platform/d2;", "getViewConfiguration", "()Landroidx/compose/ui/platform/d2;", "viewConfiguration", "Ls1/n;", "I", "globalPosition", "", "[I", "tmpPositionArray", "Landroidx/compose/ui/graphics/c1;", "K", "[F", "viewToWindowMatrix", "L", "windowToViewMatrix", "M", "getLastMatrixRecalculationAnimationTime$ui_release", "()J", "setLastMatrixRecalculationAnimationTime$ui_release", "(J)V", "getLastMatrixRecalculationAnimationTime$ui_release$annotations", "lastMatrixRecalculationAnimationTime", "N", "forceUseMatrixCache", "O", "windowPosition", "P", "isRenderNodeCompatible", "<set-?>", "Landroidx/compose/runtime/a1;", "getViewTreeOwners", "()Landroidx/compose/ui/platform/AndroidComposeView$b;", "setViewTreeOwners", "(Landroidx/compose/ui/platform/AndroidComposeView$b;)V", "viewTreeOwners", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "globalLayoutListener", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "scrollChangedListener", "Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;", "Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;", "touchModeChangeListener", "Landroidx/compose/ui/text/input/TextInputServiceAndroid;", "Landroidx/compose/ui/text/input/TextInputServiceAndroid;", "textInputServiceAndroid", "Landroidx/compose/ui/text/input/i0;", "Landroidx/compose/ui/text/input/i0;", "getTextInputService", "()Landroidx/compose/ui/text/input/i0;", "getTextInputService$annotations", "textInputService", "Landroidx/compose/ui/text/font/u$b;", "Landroidx/compose/ui/text/font/u$b;", "getFontLoader", "()Landroidx/compose/ui/text/font/u$b;", "getFontLoader$annotations", "fontLoader", "Landroidx/compose/ui/text/font/v$b;", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/v$b;", "setFontFamilyResolver", "(Landroidx/compose/ui/text/font/v$b;)V", "fontFamilyResolver", "currentFontWeightAdjustment", "Landroidx/compose/ui/unit/LayoutDirection;", "p1", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/modifier/ModifierLocalManager;", "p2", "Landroidx/compose/ui/modifier/ModifierLocalManager;", "getModifierLocalManager", "()Landroidx/compose/ui/modifier/ModifierLocalManager;", "modifierLocalManager", "Landroidx/compose/ui/platform/w1;", "x2", "Landroidx/compose/ui/platform/w1;", "getTextToolbar", "()Landroidx/compose/ui/platform/w1;", "textToolbar", "y2", "Landroid/view/MotionEvent;", "previousMotionEvent", "G2", "relayoutTime", "Landroidx/compose/ui/platform/m2;", "p3", "Landroidx/compose/ui/platform/m2;", "layerCache", "Landroidx/compose/runtime/collection/e;", "G3", "Landroidx/compose/runtime/collection/e;", "endApplyChangesListeners", "androidx/compose/ui/platform/AndroidComposeView$e", "J3", "Landroidx/compose/ui/platform/AndroidComposeView$e;", "resendMotionEventRunnable", "Ljava/lang/Runnable;", "K3", "Ljava/lang/Runnable;", "sendHoverExitEvent", "L3", "hoverExitReceived", "Landroidx/compose/ui/platform/g0;", "N3", "Landroidx/compose/ui/platform/g0;", "matrixToWindow", "O3", "keyboardModifiersRequireUpdate", "Landroidx/compose/ui/input/pointer/t;", "P3", "Landroidx/compose/ui/input/pointer/t;", "desiredPointerIcon", "Landroidx/compose/ui/input/pointer/v;", "Q3", "Landroidx/compose/ui/input/pointer/v;", "getPointerIconService", "()Landroidx/compose/ui/input/pointer/v;", "pointerIconService", "X", "(Landroid/content/res/Configuration;)I", "fontWeightAdjustmentCompat", "getView", "()Landroid/view/View;", "Ls1/e;", "density", "Ls1/e;", "getDensity", "()Ls1/e;", "Landroidx/compose/ui/focus/g;", "getFocusManager", "()Landroidx/compose/ui/focus/g;", "focusManager", "Landroidx/compose/ui/platform/o2;", "getWindowInfo", "()Landroidx/compose/ui/platform/o2;", "windowInfo", "La1/n;", "autofillTree", "La1/n;", "getAutofillTree", "()La1/n;", "configurationChangeObserver", "Lyh/l;", "getConfigurationChangeObserver", "()Lyh/l;", "setConfigurationChangeObserver", "(Lyh/l;)V", "La1/e;", "getAutofill", "()La1/e;", "getAndroidViewsHandler$ui_release", "()Landroidx/compose/ui/platform/AndroidViewsHandler;", "androidViewsHandler", "getMeasureIteration", "measureIteration", "getHasPendingMeasureOrLayout", "hasPendingMeasureOrLayout", "Ld1/a;", "hapticFeedBack", "Ld1/a;", "getHapticFeedBack", "()Ld1/a;", "Le1/b;", "getInputModeManager", "()Le1/b;", "inputModeManager", "isLifecycleInResumedState", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "<init>", "(Landroid/content/Context;)V", "R3", ak.av, "ui_release"}, k = 1, mv = {1, 7, 1})
@SuppressLint({"ViewConstructor", "VisibleForTests"})
public final class AndroidComposeView extends ViewGroup implements androidx.compose.ui.node.b1, l2, androidx.compose.ui.input.pointer.n0, androidx.lifecycle.j {

    /* JADX INFO: renamed from: R3, reason: from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    @dl.d
    private static final String S3 = "Compose Focus";
    private static final int T3 = 10;

    @dl.e
    private static Class<?> U3;

    @dl.e
    private static Method V3;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @dl.d
    private final OwnerSnapshotObserver snapshotObserver;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private boolean showLayoutBounds;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @dl.e
    private AndroidViewsHandler _androidViewsHandler;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @dl.e
    private DrawChildContainer viewLayersContainer;

    @dl.e
    private s1.b E;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private boolean wasMeasuredWithMultipleConstraints;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.node.j0 measureAndLayoutDelegate;

    /* JADX INFO: renamed from: G2, reason: from kotlin metadata */
    private long relayoutTime;

    /* JADX INFO: renamed from: G3, reason: from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.collection.e<yh.a<kotlin.b2>> endApplyChangesListeners;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @dl.d
    private final d2 viewConfiguration;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private long globalPosition;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @dl.d
    private final int[] tmpPositionArray;

    /* JADX INFO: renamed from: J3, reason: from kotlin metadata */
    @dl.d
    private final e resendMotionEventRunnable;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @dl.d
    private final float[] viewToWindowMatrix;

    /* JADX INFO: renamed from: K3, reason: from kotlin metadata */
    @dl.d
    private final Runnable sendHoverExitEvent;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @dl.d
    private final float[] windowToViewMatrix;

    /* JADX INFO: renamed from: L3, reason: from kotlin metadata */
    private boolean hoverExitReceived;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private long lastMatrixRecalculationAnimationTime;

    @dl.d
    private final yh.a<kotlin.b2> M3;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private boolean forceUseMatrixCache;

    /* JADX INFO: renamed from: N3, reason: from kotlin metadata */
    @dl.d
    private final g0 matrixToWindow;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private long windowPosition;

    /* JADX INFO: renamed from: O3, reason: from kotlin metadata */
    private boolean keyboardModifiersRequireUpdate;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private boolean isRenderNodeCompatible;

    /* JADX INFO: renamed from: P3, reason: from kotlin metadata */
    @dl.e
    private androidx.compose.ui.input.pointer.t desiredPointerIcon;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 viewTreeOwners;

    /* JADX INFO: renamed from: Q3, reason: from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.input.pointer.v pointerIconService;

    @dl.e
    private yh.l<? super b, kotlin.b2> R;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @dl.d
    private final ViewTreeObserver.OnGlobalLayoutListener globalLayoutListener;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @dl.d
    private final ViewTreeObserver.OnScrollChangedListener scrollChangedListener;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @dl.d
    private final ViewTreeObserver.OnTouchModeChangeListener touchModeChangeListener;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    @dl.d
    private final TextInputServiceAndroid textInputServiceAndroid;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.text.input.i0 textInputService;

    /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.text.font.u.b fontLoader;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long lastDownPointerPosition;

    /* JADX INFO: renamed from: b0, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 fontFamilyResolver;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean superclassInitComplete;

    /* JADX INFO: renamed from: c0, reason: collision with root package name and from kotlin metadata */
    private int currentFontWeightAdjustment;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.node.b0 sharedDrawScope;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private s1.e f15427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.semantics.m semanticsModifier;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final FocusManagerImpl _focusManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final p2 _windowInfo;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.input.key.e keyInputModifier;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.n rotaryInputModifier;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.graphics.e0 canvasHolder;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final LayoutNode root;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.node.i1 rootForTest;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.semantics.o semanticsOwner;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final AndroidComposeViewAccessibilityDelegateCompat accessibilityDelegate;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private final a1.n f15438p;

    /* JADX INFO: renamed from: p1, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 layoutDirection;

    /* JADX INFO: renamed from: p2, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final ModifierLocalManager modifierLocalManager;

    /* JADX INFO: renamed from: p3, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final m2<androidx.compose.ui.node.z0> layerCache;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<androidx.compose.ui.node.z0> dirtyLayers;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private List<androidx.compose.ui.node.z0> postponedDirtyLayers;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean isDrawingContent;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.input.pointer.i motionEventAdapter;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.input.pointer.c0 pointerInputEventProcessor;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private yh.l<? super Configuration, kotlin.b2> f15447v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.e
    private final a1.b f15448w;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private boolean observationClearRequested;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    @dl.d
    private final d1.a f15450x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final w1 textToolbar;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final g clipboardManager;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    @dl.d
    private final e1.c f15453y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private MotionEvent previousMotionEvent;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final f accessibilityManager;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeView$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: AndroidComposeView.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$a;", "", "", "b", "", "FocusTag", "Ljava/lang/String;", "", "MaximumLayerCacheSize", "I", "Ljava/lang/reflect/Method;", "getBooleanMethod", "Ljava/lang/reflect/Method;", "Ljava/lang/Class;", "systemPropertiesClass", "Ljava/lang/Class;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @SuppressLint({"PrivateApi", "BanUncheckedReflection"})
        public final boolean b() {
            try {
                if (AndroidComposeView.U3 == null) {
                    AndroidComposeView.U3 = Class.forName("android.os.SystemProperties");
                    Class cls = AndroidComposeView.U3;
                    AndroidComposeView.V3 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                }
                Method method = AndroidComposeView.V3;
                Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
                Boolean bool = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* JADX INFO: compiled from: AndroidComposeView.android.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$b;", "", "Landroidx/lifecycle/y;", ak.av, "Landroidx/lifecycle/y;", "()Landroidx/lifecycle/y;", "lifecycleOwner", "Landroidx/savedstate/d;", "b", "Landroidx/savedstate/d;", "()Landroidx/savedstate/d;", "savedStateRegistryOwner", "<init>", "(Landroidx/lifecycle/y;Landroidx/savedstate/d;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f15457c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final androidx.lifecycle.y lifecycleOwner;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final androidx.savedstate.d savedStateRegistryOwner;

        public b(@dl.d androidx.lifecycle.y lifecycleOwner, @dl.d androidx.savedstate.d savedStateRegistryOwner) {
            kotlin.jvm.internal.f0.p(lifecycleOwner, "lifecycleOwner");
            kotlin.jvm.internal.f0.p(savedStateRegistryOwner, "savedStateRegistryOwner");
            this.lifecycleOwner = lifecycleOwner;
            this.savedStateRegistryOwner = savedStateRegistryOwner;
        }

        @dl.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public final androidx.lifecycle.y getLifecycleOwner() {
            return this.lifecycleOwner;
        }

        @dl.d
        /* JADX INFO: renamed from: b, reason: from getter */
        public final androidx.savedstate.d getSavedStateRegistryOwner() {
            return this.savedStateRegistryOwner;
        }
    }

    /* JADX INFO: compiled from: AndroidComposeView.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/AndroidComposeView$c", "Landroidx/core/view/a;", "Landroid/view/View;", "host", "Landroidx/core/view/accessibility/a0;", "info", "Lkotlin/b2;", "onInitializeAccessibilityNodeInfo", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class c extends androidx.core.view.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ LayoutNode f15460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f15461b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f15462c;

        c(LayoutNode layoutNode, AndroidComposeView androidComposeView, AndroidComposeView androidComposeView2) {
            this.f15460a = layoutNode;
            this.f15461b = androidComposeView;
            this.f15462c = androidComposeView2;
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(@dl.d View host, @dl.d androidx.core.view.accessibility.a0 info) {
            kotlin.jvm.internal.f0.p(host, "host");
            kotlin.jvm.internal.f0.p(info, "info");
            super.onInitializeAccessibilityNodeInfo(host, info);
            androidx.compose.ui.node.j1 j1VarK = androidx.compose.ui.semantics.n.k(this.f15460a);
            kotlin.jvm.internal.f0.m(j1VarK);
            SemanticsNode semanticsNodeQ = new SemanticsNode(j1VarK, false, null, 4, null).q();
            kotlin.jvm.internal.f0.m(semanticsNodeQ);
            int id2 = semanticsNodeQ.getId();
            if (id2 == this.f15461b.getSemanticsOwner().b().getId()) {
                id2 = -1;
            }
            info.G1(this.f15462c, id2);
        }
    }

    /* JADX INFO: compiled from: AndroidComposeView.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R$\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"androidx/compose/ui/platform/AndroidComposeView$d", "Landroidx/compose/ui/input/pointer/v;", "Landroidx/compose/ui/input/pointer/t;", "value", "getCurrent", "()Landroidx/compose/ui/input/pointer/t;", ak.av, "(Landroidx/compose/ui/input/pointer/t;)V", org.apache.tools.ant.taskdefs.optional.vss.g.H2, "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class d implements androidx.compose.ui.input.pointer.v {
        d() {
        }

        @Override // androidx.compose.ui.input.pointer.v
        public void a(@dl.d androidx.compose.ui.input.pointer.t value) {
            kotlin.jvm.internal.f0.p(value, "value");
            AndroidComposeView.this.desiredPointerIcon = value;
        }

        @Override // androidx.compose.ui.input.pointer.v
        @dl.d
        public androidx.compose.ui.input.pointer.t getCurrent() {
            androidx.compose.ui.input.pointer.t tVar = AndroidComposeView.this.desiredPointerIcon;
            return tVar == null ? androidx.compose.ui.input.pointer.u.f14827a.b() : tVar;
        }
    }

    /* JADX INFO: compiled from: AndroidComposeView.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"androidx/compose/ui/platform/AndroidComposeView$e", "Ljava/lang/Runnable;", "Lkotlin/b2;", "run", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AndroidComposeView.this.removeCallbacks(this);
            MotionEvent motionEvent = AndroidComposeView.this.previousMotionEvent;
            if (motionEvent != null) {
                boolean z10 = false;
                boolean z11 = motionEvent.getToolType(0) == 3;
                int actionMasked = motionEvent.getActionMasked();
                if (!z11 ? actionMasked != 1 : !(actionMasked == 10 || actionMasked == 1)) {
                    z10 = true;
                }
                if (z10) {
                    int i10 = 7;
                    if (actionMasked != 7 && actionMasked != 9) {
                        i10 = 2;
                    }
                    AndroidComposeView androidComposeView = AndroidComposeView.this;
                    androidComposeView.v0(motionEvent, i10, androidComposeView.relayoutTime, false);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidComposeView(@dl.d Context context) {
        super(context);
        kotlin.jvm.internal.f0.p(context, "context");
        b1.f.a aVar = b1.f.f30364b;
        this.lastDownPointerPosition = aVar.c();
        int i10 = 1;
        this.superclassInitComplete = true;
        this.sharedDrawScope = new androidx.compose.ui.node.b0(null, i10, 0 == true ? 1 : 0);
        this.f15427e = s1.a.a(context);
        androidx.compose.ui.semantics.m mVar = new androidx.compose.ui.semantics.m(false, false, new yh.l<androidx.compose.ui.semantics.r, kotlin.b2>() { // from class: androidx.compose.ui.platform.AndroidComposeView$semanticsModifier$1
            public final void a(@dl.d androidx.compose.ui.semantics.r $receiver) {
                kotlin.jvm.internal.f0.p($receiver, "$this$$receiver");
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.semantics.r rVar) {
                a(rVar);
                return kotlin.b2.f124493a;
            }
        }, null, 8, null);
        this.semanticsModifier = mVar;
        FocusManagerImpl focusManagerImpl = new FocusManagerImpl(0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        this._focusManager = focusManagerImpl;
        this._windowInfo = new p2();
        androidx.compose.ui.input.key.e eVar = new androidx.compose.ui.input.key.e(new yh.l<androidx.compose.ui.input.key.b, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$keyInputModifier$1
            {
                super(1);
            }

            @dl.d
            public final Boolean a(@dl.d KeyEvent it) {
                kotlin.jvm.internal.f0.p(it, "it");
                androidx.compose.ui.focus.b bVarV = this.f15466b.v(it);
                return (bVarV == null || !androidx.compose.ui.input.key.c.g(androidx.compose.ui.input.key.d.b(it), androidx.compose.ui.input.key.c.INSTANCE.a())) ? Boolean.FALSE : Boolean.valueOf(this.f15466b.getFocusManager().a(bVarV.getValue()));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Boolean invoke(androidx.compose.ui.input.key.b bVar) {
                return a(bVar.h());
            }
        }, null);
        this.keyInputModifier = eVar;
        androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
        androidx.compose.ui.n nVarE = RotaryInputModifierKt.e(companion, new yh.l<RotaryScrollEvent, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$rotaryInputModifier$1
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@dl.d RotaryScrollEvent it) {
                kotlin.jvm.internal.f0.p(it, "it");
                return Boolean.FALSE;
            }
        });
        this.rotaryInputModifier = nVarE;
        this.canvasHolder = new androidx.compose.ui.graphics.e0();
        LayoutNode layoutNode = new LayoutNode(false, 0, 3, null);
        layoutNode.c(RootMeasurePolicy.f14946b);
        layoutNode.g(getF15427e());
        layoutNode.f(companion.s0(mVar).s0(nVarE).s0(focusManagerImpl.getModifier()).s0(eVar));
        this.root = layoutNode;
        this.rootForTest = this;
        this.semanticsOwner = new androidx.compose.ui.semantics.o(getRoot());
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.accessibilityDelegate = androidComposeViewAccessibilityDelegateCompat;
        this.f15438p = new a1.n();
        this.dirtyLayers = new ArrayList();
        this.motionEventAdapter = new androidx.compose.ui.input.pointer.i();
        this.pointerInputEventProcessor = new androidx.compose.ui.input.pointer.c0(getRoot());
        this.f15447v = new yh.l<Configuration, kotlin.b2>() { // from class: androidx.compose.ui.platform.AndroidComposeView$configurationChangeObserver$1
            public final void a(@dl.d Configuration it) {
                kotlin.jvm.internal.f0.p(it, "it");
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(Configuration configuration) {
                a(configuration);
                return kotlin.b2.f124493a;
            }
        };
        this.f15448w = R() ? new a1.b(this, getF15438p()) : null;
        this.clipboardManager = new g(context);
        this.accessibilityManager = new f(context);
        this.snapshotObserver = new OwnerSnapshotObserver(new AndroidComposeView$snapshotObserver$1(this));
        this.measureAndLayoutDelegate = new androidx.compose.ui.node.j0(getRoot());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        kotlin.jvm.internal.f0.o(viewConfiguration, "get(context)");
        this.viewConfiguration = new d0(viewConfiguration);
        this.globalPosition = s1.o.a(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.tmpPositionArray = new int[]{0, 0};
        this.viewToWindowMatrix = androidx.compose.ui.graphics.c1.c(null, 1, null);
        this.windowToViewMatrix = androidx.compose.ui.graphics.c1.c(null, 1, null);
        this.lastMatrixRecalculationAnimationTime = -1L;
        this.windowPosition = aVar.a();
        this.isRenderNodeCompatible = true;
        this.viewTreeOwners = androidx.compose.runtime.h2.g(null, null, 2, null);
        this.globalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.compose.ui.platform.i
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AndroidComposeView.Y(this.f15916b);
            }
        };
        this.scrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.compose.ui.platform.j
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                AndroidComposeView.s0(this.f15918a);
            }
        };
        this.touchModeChangeListener = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: androidx.compose.ui.platform.k
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z10) {
                AndroidComposeView.x0(this.f15924b, z10);
            }
        };
        TextInputServiceAndroid textInputServiceAndroid = new TextInputServiceAndroid(this);
        this.textInputServiceAndroid = textInputServiceAndroid;
        this.textInputService = AndroidComposeView_androidKt.e().invoke(textInputServiceAndroid);
        this.fontLoader = new y(context);
        this.fontFamilyResolver = androidx.compose.runtime.e2.j(androidx.compose.ui.text.font.z.a(context), androidx.compose.runtime.e2.s());
        Configuration configuration = context.getResources().getConfiguration();
        kotlin.jvm.internal.f0.o(configuration, "context.resources.configuration");
        this.currentFontWeightAdjustment = X(configuration);
        Configuration configuration2 = context.getResources().getConfiguration();
        kotlin.jvm.internal.f0.o(configuration2, "context.resources.configuration");
        this.layoutDirection = androidx.compose.runtime.h2.g(AndroidComposeView_androidKt.d(configuration2), null, 2, null);
        this.f15450x1 = new d1.c(this);
        this.f15453y1 = new e1.c(isInTouchMode() ? e1.a.f118531b.b() : e1.a.f118531b.a(), new yh.l<e1.a, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$_inputModeManager$1
            {
                super(1);
            }

            @dl.d
            public final Boolean a(int i11) {
                boolean zRequestFocusFromTouch;
                e1.a.C1069a c1069a = e1.a.f118531b;
                if (e1.a.f(i11, c1069a.b())) {
                    zRequestFocusFromTouch = this.f15456b.isInTouchMode();
                } else if (e1.a.f(i11, c1069a.a())) {
                    zRequestFocusFromTouch = this.f15456b.isInTouchMode() ? this.f15456b.requestFocusFromTouch() : true;
                } else {
                    zRequestFocusFromTouch = false;
                }
                return Boolean.valueOf(zRequestFocusFromTouch);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Boolean invoke(e1.a aVar2) {
                return a(aVar2.getF118534a());
            }
        }, null);
        this.modifierLocalManager = new ModifierLocalManager(this);
        this.textToolbar = new AndroidTextToolbar(this);
        this.layerCache = new m2<>();
        this.endApplyChangesListeners = new androidx.compose.runtime.collection.e<>(new yh.a[16], 0);
        this.resendMotionEventRunnable = new e();
        this.sendHoverExitEvent = new Runnable() { // from class: androidx.compose.ui.platform.l
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeView.t0(this.f15925b);
            }
        };
        this.M3 = new yh.a<kotlin.b2>() { // from class: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventOnLayout$1
            {
                super(0);
            }

            @Override // yh.a
            public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                invoke2();
                return kotlin.b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                MotionEvent motionEvent = this.f15469b.previousMotionEvent;
                if (motionEvent != null) {
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 7 || actionMasked == 9) {
                        this.f15469b.relayoutTime = SystemClock.uptimeMillis();
                        AndroidComposeView androidComposeView = this.f15469b;
                        androidComposeView.post(androidComposeView.resendMotionEventRunnable);
                    }
                }
            }
        };
        int i11 = Build.VERSION.SDK_INT;
        this.matrixToWindow = i11 >= 29 ? new j0() : new h0();
        setWillNotDraw(false);
        setFocusable(true);
        if (i11 >= 26) {
            x.f15992a.a(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        setTransitionGroup(true);
        androidx.core.view.j1.B1(this, androidComposeViewAccessibilityDelegateCompat);
        yh.l<l2, kotlin.b2> lVarA = l2.INSTANCE.a();
        if (lVarA != null) {
            lVarA.invoke(this);
        }
        getRoot().B(this);
        if (i11 >= 29) {
            r.f15978a.a(this);
        }
        this.pointerIconService = new d();
    }

    private final boolean R() {
        return Build.VERSION.SDK_INT >= 26;
    }

    private final void T(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).p();
            } else if (childAt instanceof ViewGroup) {
                T((ViewGroup) childAt);
            }
        }
    }

    private final Pair<Integer, Integer> U(int measureSpec) {
        int mode = View.MeasureSpec.getMode(measureSpec);
        int size = View.MeasureSpec.getSize(measureSpec);
        if (mode == Integer.MIN_VALUE) {
            return kotlin.c1.a(0, Integer.valueOf(size));
        }
        if (mode == 0) {
            return kotlin.c1.a(0, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return kotlin.c1.a(Integer.valueOf(size), Integer.valueOf(size));
        }
        throw new IllegalStateException();
    }

    private final View W(int accessibilityId, View currentView) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT >= 29) {
            return null;
        }
        Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", new Class[0]);
        declaredMethod.setAccessible(true);
        if (kotlin.jvm.internal.f0.g(declaredMethod.invoke(currentView, new Object[0]), Integer.valueOf(accessibilityId))) {
            return currentView;
        }
        if (!(currentView instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) currentView;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            kotlin.jvm.internal.f0.o(childAt, "currentView.getChildAt(i)");
            View viewW = W(accessibilityId, childAt);
            if (viewW != null) {
                return viewW;
            }
        }
        return null;
    }

    private final int X(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            return configuration.fontWeightAdjustment;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(AndroidComposeView this$0) {
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.y0();
    }

    private final int Z(MotionEvent motionEvent) {
        removeCallbacks(this.resendMotionEventRunnable);
        try {
            l0(motionEvent);
            boolean z10 = true;
            this.forceUseMatrixCache = true;
            b(false);
            this.desiredPointerIcon = null;
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked = motionEvent.getActionMasked();
                MotionEvent motionEvent2 = this.previousMotionEvent;
                boolean z11 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
                if (motionEvent2 != null && b0(motionEvent, motionEvent2)) {
                    if (f0(motionEvent2)) {
                        this.pointerInputEventProcessor.d();
                    } else if (motionEvent2.getActionMasked() != 10 && z11) {
                        w0(this, motionEvent2, 10, motionEvent2.getEventTime(), false, 8, null);
                    }
                }
                if (motionEvent.getToolType(0) != 3) {
                    z10 = false;
                }
                if (!z11 && z10 && actionMasked != 3 && actionMasked != 9 && g0(motionEvent)) {
                    w0(this, motionEvent, 9, motionEvent.getEventTime(), false, 8, null);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.previousMotionEvent = MotionEvent.obtainNoHistory(motionEvent);
                int iU0 = u0(motionEvent);
                Trace.endSection();
                if (Build.VERSION.SDK_INT >= 24) {
                    u.f15985a.a(this, this.desiredPointerIcon);
                }
                this.forceUseMatrixCache = false;
                return iU0;
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        } catch (Throwable th3) {
            this.forceUseMatrixCache = false;
            throw th3;
        }
    }

    private final boolean a0(MotionEvent event) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f10 = -event.getAxisValue(26);
        RotaryScrollEvent rotaryScrollEvent = new RotaryScrollEvent(androidx.core.view.v2.e(viewConfiguration, getContext()) * f10, f10 * androidx.core.view.v2.b(viewConfiguration, getContext()), event.getEventTime());
        FocusModifier focusModifierD = this._focusManager.d();
        if (focusModifierD != null) {
            return focusModifierD.H(rotaryScrollEvent);
        }
        return false;
    }

    private final boolean b0(MotionEvent event, MotionEvent lastEvent) {
        return (lastEvent.getSource() == event.getSource() && lastEvent.getToolType(0) == event.getToolType(0)) ? false : true;
    }

    private final void c0(LayoutNode layoutNode) {
        layoutNode.J0();
        androidx.compose.runtime.collection.e<LayoutNode> eVarB0 = layoutNode.B0();
        int i10 = eVarB0.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        if (i10 > 0) {
            int i11 = 0;
            LayoutNode[] layoutNodeArrG = eVarB0.G();
            kotlin.jvm.internal.f0.n(layoutNodeArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                c0(layoutNodeArrG[i11]);
                i11++;
            } while (i11 < i10);
        }
    }

    private final void d0(LayoutNode layoutNode) {
        int i10 = 0;
        androidx.compose.ui.node.j0.F(this.measureAndLayoutDelegate, layoutNode, false, 2, null);
        androidx.compose.runtime.collection.e<LayoutNode> eVarB0 = layoutNode.B0();
        int i11 = eVarB0.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        if (i11 > 0) {
            LayoutNode[] layoutNodeArrG = eVarB0.G();
            kotlin.jvm.internal.f0.n(layoutNodeArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                d0(layoutNodeArrG[i10]);
                i10++;
            } while (i10 < i11);
        }
    }

    private final boolean e0(MotionEvent event) {
        float x10 = event.getX();
        if (!((Float.isInfinite(x10) || Float.isNaN(x10)) ? false : true)) {
            return true;
        }
        float y10 = event.getY();
        if (!((Float.isInfinite(y10) || Float.isNaN(y10)) ? false : true)) {
            return true;
        }
        float rawX = event.getRawX();
        if (!((Float.isInfinite(rawX) || Float.isNaN(rawX)) ? false : true)) {
            return true;
        }
        float rawY = event.getRawY();
        return !(!Float.isInfinite(rawY) && !Float.isNaN(rawY));
    }

    private final boolean f0(MotionEvent event) {
        int actionMasked;
        return event.getButtonState() != 0 || (actionMasked = event.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6;
    }

    private final boolean g0(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (0.0f <= x10 && x10 <= ((float) getWidth())) {
            if (0.0f <= y10 && y10 <= ((float) getHeight())) {
                return true;
            }
        }
        return false;
    }

    @kotlin.k(message = "fontLoader is deprecated, use fontFamilyResolver", replaceWith = @kotlin.s0(expression = "fontFamilyResolver", imports = {}))
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    @androidx.annotation.j1
    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public static /* synthetic */ void getTextInputService$annotations() {
    }

    private final boolean h0(MotionEvent event) {
        MotionEvent motionEvent;
        if (event.getPointerCount() != 1 || (motionEvent = this.previousMotionEvent) == null) {
            return true;
        }
        if (event.getRawX() == motionEvent.getRawX()) {
            return !((event.getRawY() > motionEvent.getRawY() ? 1 : (event.getRawY() == motionEvent.getRawY() ? 0 : -1)) == 0);
        }
        return true;
    }

    private final void k0() {
        if (this.forceUseMatrixCache) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.lastMatrixRecalculationAnimationTime) {
            this.lastMatrixRecalculationAnimationTime = jCurrentAnimationTimeMillis;
            m0();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            view.getLocationOnScreen(this.tmpPositionArray);
            int[] iArr = this.tmpPositionArray;
            float f10 = iArr[0];
            float f11 = iArr[1];
            view.getLocationInWindow(iArr);
            int[] iArr2 = this.tmpPositionArray;
            this.windowPosition = b1.g.a(f10 - iArr2[0], f11 - iArr2[1]);
        }
    }

    private final void l0(MotionEvent motionEvent) {
        this.lastMatrixRecalculationAnimationTime = AnimationUtils.currentAnimationTimeMillis();
        m0();
        long j10 = androidx.compose.ui.graphics.c1.j(this.viewToWindowMatrix, b1.g.a(motionEvent.getX(), motionEvent.getY()));
        this.windowPosition = b1.g.a(motionEvent.getRawX() - b1.f.p(j10), motionEvent.getRawY() - b1.f.r(j10));
    }

    private final void m0() {
        this.matrixToWindow.a(this, this.viewToWindowMatrix);
        z0.a(this.viewToWindowMatrix, this.windowToViewMatrix);
    }

    private final void q0(LayoutNode layoutNode) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (this.wasMeasuredWithMultipleConstraints && layoutNode != null) {
            while (layoutNode != null && layoutNode.getMeasuredByParent() == LayoutNode.UsageByParent.InMeasureBlock) {
                layoutNode = layoutNode.v0();
            }
            if (layoutNode == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    static /* synthetic */ void r0(AndroidComposeView androidComposeView, LayoutNode layoutNode, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            layoutNode = null;
        }
        androidComposeView.q0(layoutNode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(AndroidComposeView this$0) {
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.y0();
    }

    private void setFontFamilyResolver(androidx.compose.ui.text.font.v.b bVar) {
        this.fontFamilyResolver.setValue(bVar);
    }

    private void setLayoutDirection(LayoutDirection layoutDirection) {
        this.layoutDirection.setValue(layoutDirection);
    }

    private final void setViewTreeOwners(b bVar) {
        this.viewTreeOwners.setValue(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0(AndroidComposeView this$0) {
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.hoverExitReceived = false;
        MotionEvent motionEvent = this$0.previousMotionEvent;
        kotlin.jvm.internal.f0.m(motionEvent);
        if (!(motionEvent.getActionMasked() == 10)) {
            throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.".toString());
        }
        this$0.u0(motionEvent);
    }

    private final int u0(MotionEvent motionEvent) {
        PointerInputEventData pointerInputEventDataPrevious;
        if (this.keyboardModifiersRequireUpdate) {
            this.keyboardModifiersRequireUpdate = false;
            this._windowInfo.e(androidx.compose.ui.input.pointer.l0.b(motionEvent.getMetaState()));
        }
        androidx.compose.ui.input.pointer.a0 a0VarC = this.motionEventAdapter.c(motionEvent, this);
        if (a0VarC == null) {
            this.pointerInputEventProcessor.d();
            return androidx.compose.ui.input.pointer.d0.a(false, false);
        }
        List<PointerInputEventData> listB = a0VarC.b();
        ListIterator<PointerInputEventData> listIterator = listB.listIterator(listB.size());
        do {
            if (!listIterator.hasPrevious()) {
                pointerInputEventDataPrevious = null;
                break;
            }
            pointerInputEventDataPrevious = listIterator.previous();
        } while (!pointerInputEventDataPrevious.m());
        PointerInputEventData pointerInputEventData = pointerInputEventDataPrevious;
        if (pointerInputEventData != null) {
            this.lastDownPointerPosition = pointerInputEventData.q();
        }
        int iB = this.pointerInputEventProcessor.b(a0VarC, this, g0(motionEvent));
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 0 && actionMasked != 5) || androidx.compose.ui.input.pointer.o0.f(iB)) {
            return iB;
        }
        this.motionEventAdapter.e(motionEvent.getPointerId(motionEvent.getActionIndex()));
        return iB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0(MotionEvent motionEvent, int i10, long j10, boolean z10) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i10 != 9 && i10 != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i11 = 0; i11 < pointerCount; i11++) {
            pointerPropertiesArr[i11] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i12 = 0; i12 < pointerCount; i12++) {
            pointerCoordsArr[i12] = new MotionEvent.PointerCoords();
        }
        int i13 = 0;
        while (i13 < pointerCount) {
            int i14 = ((actionIndex < 0 || i13 < actionIndex) ? 0 : 1) + i13;
            motionEvent.getPointerProperties(i14, pointerPropertiesArr[i13]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i13];
            motionEvent.getPointerCoords(i14, pointerCoords);
            long jZ = z(b1.g.a(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = b1.f.p(jZ);
            pointerCoords.y = b1.f.r(jZ);
            i13++;
        }
        MotionEvent event = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j10 : motionEvent.getDownTime(), j10, i10, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z10 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        androidx.compose.ui.input.pointer.i iVar = this.motionEventAdapter;
        kotlin.jvm.internal.f0.o(event, "event");
        androidx.compose.ui.input.pointer.a0 a0VarC = iVar.c(event, this);
        kotlin.jvm.internal.f0.m(a0VarC);
        this.pointerInputEventProcessor.b(a0VarC, this, true);
        event.recycle();
    }

    static /* synthetic */ void w0(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i10, long j10, boolean z10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        androidComposeView.v0(motionEvent, i10, j10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x0(AndroidComposeView this$0, boolean z10) {
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.f15453y1.c(z10 ? e1.a.f118531b.b() : e1.a.f118531b.a());
        this$0._focusManager.c();
    }

    private final void y0() {
        getLocationOnScreen(this.tmpPositionArray);
        long j10 = this.globalPosition;
        int iC = s1.n.c(j10);
        int iD = s1.n.d(j10);
        int[] iArr = this.tmpPositionArray;
        boolean z10 = false;
        int i10 = iArr[0];
        if (iC != i10 || iD != iArr[1]) {
            this.globalPosition = s1.o.a(i10, iArr[1]);
            if (iC != Integer.MAX_VALUE && iD != Integer.MAX_VALUE) {
                getRoot().getLayoutDelegate().getMeasurePassDelegate().d2();
                z10 = true;
            }
        }
        this.measureAndLayoutDelegate.d(z10);
    }

    @Override // androidx.compose.ui.node.b1
    public void A() {
        this.accessibilityDelegate.K();
    }

    public final void Q(@dl.d AndroidViewHolder view, @dl.d LayoutNode layoutNode) {
        kotlin.jvm.internal.f0.p(view, "view");
        kotlin.jvm.internal.f0.p(layoutNode, "layoutNode");
        getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(view, layoutNode);
        getAndroidViewsHandler$ui_release().addView(view);
        getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(layoutNode, view);
        androidx.core.view.j1.R1(view, 1);
        androidx.core.view.j1.B1(view, new c(layoutNode, this, this));
    }

    @dl.e
    public final Object S(@dl.d kotlin.coroutines.c<? super kotlin.b2> cVar) {
        Object objK = this.accessibilityDelegate.k(cVar);
        return objK == kotlin.coroutines.intrinsics.b.h() ? objK : kotlin.b2.f124493a;
    }

    public final void V(@dl.d AndroidViewHolder view, @dl.d Canvas canvas) {
        kotlin.jvm.internal.f0.p(view, "view");
        kotlin.jvm.internal.f0.p(canvas, "canvas");
        getAndroidViewsHandler$ui_release().a(view, canvas);
    }

    @Override // android.view.View
    public void autofill(@dl.d SparseArray<AutofillValue> values) {
        a1.b bVar;
        kotlin.jvm.internal.f0.p(values, "values");
        if (!R() || (bVar = this.f15448w) == null) {
            return;
        }
        a1.d.a(bVar, values);
    }

    @Override // androidx.compose.ui.node.b1
    public void b(boolean z10) {
        yh.a<kotlin.b2> aVar;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        if (z10) {
            try {
                aVar = this.M3;
            } finally {
                Trace.endSection();
            }
        } else {
            aVar = null;
        }
        if (this.measureAndLayoutDelegate.n(aVar)) {
            requestLayout();
        }
        androidx.compose.ui.node.j0.e(this.measureAndLayoutDelegate, false, 1, null);
        kotlin.b2 b2Var = kotlin.b2.f124493a;
    }

    @Override // androidx.compose.ui.node.b1
    public void c(@dl.d LayoutNode layoutNode, boolean z10, boolean z11) {
        kotlin.jvm.internal.f0.p(layoutNode, "layoutNode");
        if (z10) {
            if (this.measureAndLayoutDelegate.z(layoutNode, z11)) {
                q0(layoutNode);
            }
        } else if (this.measureAndLayoutDelegate.E(layoutNode, z11)) {
            q0(layoutNode);
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int direction) {
        return this.accessibilityDelegate.l(false, direction, this.lastDownPointerPosition);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int direction) {
        return this.accessibilityDelegate.l(true, direction, this.lastDownPointerPosition);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@dl.d Canvas canvas) {
        kotlin.jvm.internal.f0.p(canvas, "canvas");
        if (!isAttachedToWindow()) {
            c0(getRoot());
        }
        androidx.compose.ui.node.a1.d(this, false, 1, null);
        this.isDrawingContent = true;
        androidx.compose.ui.graphics.e0 e0Var = this.canvasHolder;
        Canvas internalCanvas = e0Var.getAndroidCanvas().getInternalCanvas();
        e0Var.getAndroidCanvas().K(canvas);
        getRoot().L(e0Var.getAndroidCanvas());
        e0Var.getAndroidCanvas().K(internalCanvas);
        if (!this.dirtyLayers.isEmpty()) {
            int size = this.dirtyLayers.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.dirtyLayers.get(i10).k();
            }
        }
        if (ViewLayer.INSTANCE.c()) {
            int iSave = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave);
        }
        this.dirtyLayers.clear();
        this.isDrawingContent = false;
        List<androidx.compose.ui.node.z0> list = this.postponedDirtyLayers;
        if (list != null) {
            kotlin.jvm.internal.f0.m(list);
            this.dirtyLayers.addAll(list);
            list.clear();
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(@dl.d MotionEvent event) {
        kotlin.jvm.internal.f0.p(event, "event");
        if (event.getActionMasked() != 8) {
            return super.dispatchGenericMotionEvent(event);
        }
        if (event.isFromSource(4194304)) {
            return a0(event);
        }
        return (e0(event) || !isAttachedToWindow()) ? super.dispatchGenericMotionEvent(event) : androidx.compose.ui.input.pointer.o0.f(Z(event));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(@dl.d MotionEvent event) {
        kotlin.jvm.internal.f0.p(event, "event");
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            this.sendHoverExitEvent.run();
        }
        if (e0(event) || !isAttachedToWindow()) {
            return false;
        }
        if (event.isFromSource(4098) && event.getToolType(0) == 1) {
            return this.accessibilityDelegate.s(event);
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && g0(event)) {
                if (event.getToolType(0) != 3) {
                    MotionEvent motionEvent = this.previousMotionEvent;
                    if (motionEvent != null) {
                        motionEvent.recycle();
                    }
                    this.previousMotionEvent = MotionEvent.obtainNoHistory(event);
                    this.hoverExitReceived = true;
                    post(this.sendHoverExitEvent);
                    return false;
                }
                if (event.getButtonState() != 0) {
                    return false;
                }
            }
        } else if (!h0(event)) {
            return false;
        }
        return androidx.compose.ui.input.pointer.o0.f(Z(event));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(@dl.d KeyEvent event) {
        kotlin.jvm.internal.f0.p(event, "event");
        if (!isFocused()) {
            return super.dispatchKeyEvent(event);
        }
        this._windowInfo.e(androidx.compose.ui.input.pointer.l0.b(event.getMetaState()));
        return k(androidx.compose.ui.input.key.b.b(event));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@dl.d MotionEvent motionEvent) {
        kotlin.jvm.internal.f0.p(motionEvent, "motionEvent");
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            MotionEvent motionEvent2 = this.previousMotionEvent;
            kotlin.jvm.internal.f0.m(motionEvent2);
            if (motionEvent.getActionMasked() != 0 || b0(motionEvent, motionEvent2)) {
                this.sendHoverExitEvent.run();
            } else {
                this.hoverExitReceived = false;
            }
        }
        if (e0(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !h0(motionEvent)) {
            return false;
        }
        int iZ = Z(motionEvent);
        if (androidx.compose.ui.input.pointer.o0.e(iZ)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return androidx.compose.ui.input.pointer.o0.f(iZ);
    }

    @Override // androidx.compose.ui.node.b1
    public void e(@dl.d LayoutNode layoutNode) {
        kotlin.jvm.internal.f0.p(layoutNode, "layoutNode");
        this.measureAndLayoutDelegate.B(layoutNode);
        r0(this, null, 1, null);
    }

    @Override // androidx.compose.ui.node.b1
    public void f(@dl.d androidx.compose.ui.node.b1.b listener) {
        kotlin.jvm.internal.f0.p(listener, "listener");
        this.measureAndLayoutDelegate.u(listener);
        r0(this, null, 1, null);
    }

    @dl.e
    public final View findViewByAccessibilityIdTraversal(int accessibilityId) throws IllegalAccessException, InvocationTargetException {
        View viewW = null;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(accessibilityId));
                if (objInvoke instanceof View) {
                    viewW = (View) objInvoke;
                }
            } else {
                viewW = W(accessibilityId, this);
            }
        } catch (NoSuchMethodException unused) {
        }
        return viewW;
    }

    @Override // androidx.compose.ui.platform.l2
    public boolean g() {
        androidx.lifecycle.y lifecycleOwner;
        Lifecycle lifecycle;
        b viewTreeOwners = getViewTreeOwners();
        return ((viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) ? null : lifecycle.b()) == Lifecycle.State.RESUMED;
    }

    @Override // androidx.compose.ui.node.b1
    @dl.d
    public f getAccessibilityManager() {
        return this.accessibilityManager;
    }

    @dl.d
    public final AndroidViewsHandler getAndroidViewsHandler$ui_release() {
        if (this._androidViewsHandler == null) {
            Context context = getContext();
            kotlin.jvm.internal.f0.o(context, "context");
            AndroidViewsHandler androidViewsHandler = new AndroidViewsHandler(context);
            this._androidViewsHandler = androidViewsHandler;
            addView(androidViewsHandler);
        }
        AndroidViewsHandler androidViewsHandler2 = this._androidViewsHandler;
        kotlin.jvm.internal.f0.m(androidViewsHandler2);
        return androidViewsHandler2;
    }

    @Override // androidx.compose.ui.node.b1
    @dl.e
    public a1.e getAutofill() {
        return this.f15448w;
    }

    @Override // androidx.compose.ui.node.b1
    @dl.d
    /* JADX INFO: renamed from: getAutofillTree, reason: from getter */
    public a1.n getF15438p() {
        return this.f15438p;
    }

    @Override // androidx.compose.ui.node.b1
    @dl.d
    public g getClipboardManager() {
        return this.clipboardManager;
    }

    @dl.d
    public final yh.l<Configuration, kotlin.b2> getConfigurationChangeObserver() {
        return this.f15447v;
    }

    @Override // androidx.compose.ui.node.b1, androidx.compose.ui.node.i1
    @dl.d
    /* JADX INFO: renamed from: getDensity, reason: from getter */
    public s1.e getF15427e() {
        return this.f15427e;
    }

    @Override // androidx.compose.ui.node.b1
    @dl.d
    public androidx.compose.ui.focus.g getFocusManager() {
        return this._focusManager;
    }

    @Override // android.view.View
    public void getFocusedRect(@dl.d Rect rect) {
        kotlin.b2 b2Var;
        b1.i iVarE;
        kotlin.jvm.internal.f0.p(rect, "rect");
        FocusModifier focusModifierD = this._focusManager.d();
        if (focusModifierD == null || (iVarE = androidx.compose.ui.focus.w.e(focusModifierD)) == null) {
            b2Var = null;
        } else {
            rect.left = di.d.L0(iVarE.t());
            rect.top = di.d.L0(iVarE.getF30372b());
            rect.right = di.d.L0(iVarE.x());
            rect.bottom = di.d.L0(iVarE.j());
            b2Var = kotlin.b2.f124493a;
        }
        if (b2Var == null) {
            super.getFocusedRect(rect);
        }
    }

    @Override // androidx.compose.ui.node.b1
    @dl.d
    public androidx.compose.ui.text.font.v.b getFontFamilyResolver() {
        return (androidx.compose.ui.text.font.v.b) this.fontFamilyResolver.getValue();
    }

    @Override // androidx.compose.ui.node.b1
    @dl.d
    public androidx.compose.ui.text.font.u.b getFontLoader() {
        return this.fontLoader;
    }

    @Override // androidx.compose.ui.node.b1
    @dl.d
    /* JADX INFO: renamed from: getHapticFeedBack, reason: from getter */
    public d1.a getF15450x1() {
        return this.f15450x1;
    }

    @Override // androidx.compose.ui.platform.l2
    public boolean getHasPendingMeasureOrLayout() {
        return this.measureAndLayoutDelegate.k();
    }

    @Override // androidx.compose.ui.node.b1
    @dl.d
    public e1.b getInputModeManager() {
        return this.f15453y1;
    }

    /* JADX INFO: renamed from: getLastMatrixRecalculationAnimationTime$ui_release, reason: from getter */
    public final long getLastMatrixRecalculationAnimationTime() {
        return this.lastMatrixRecalculationAnimationTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View, android.view.ViewParent, androidx.compose.ui.node.b1
    @dl.d
    public LayoutDirection getLayoutDirection() {
        return (LayoutDirection) this.layoutDirection.getValue();
    }

    @Override // androidx.compose.ui.node.b1
    public long getMeasureIteration() {
        return this.measureAndLayoutDelegate.m();
    }

    @Override // androidx.compose.ui.node.b1
    @dl.d
    public ModifierLocalManager getModifierLocalManager() {
        return this.modifierLocalManager;
    }

    @Override // androidx.compose.ui.node.b1
    @dl.d
    public androidx.compose.ui.input.pointer.v getPointerIconService() {
        return this.pointerIconService;
    }

    @Override // androidx.compose.ui.node.b1
    @dl.d
    public LayoutNode getRoot() {
        return this.root;
    }

    @Override // androidx.compose.ui.node.b1
    @dl.d
    public androidx.compose.ui.node.i1 getRootForTest() {
        return this.rootForTest;
    }

    @Override // androidx.compose.ui.node.i1
    @dl.d
    public androidx.compose.ui.semantics.o getSemanticsOwner() {
        return this.semanticsOwner;
    }

    @Override // androidx.compose.ui.node.b1
    @dl.d
    public androidx.compose.ui.node.b0 getSharedDrawScope() {
        return this.sharedDrawScope;
    }

    @Override // androidx.compose.ui.node.b1
    public boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    @Override // androidx.compose.ui.node.b1
    @dl.d
    public OwnerSnapshotObserver getSnapshotObserver() {
        return this.snapshotObserver;
    }

    @Override // androidx.compose.ui.node.b1, androidx.compose.ui.node.i1
    @dl.d
    public androidx.compose.ui.text.input.i0 getTextInputService() {
        return this.textInputService;
    }

    @Override // androidx.compose.ui.node.b1
    @dl.d
    public w1 getTextToolbar() {
        return this.textToolbar;
    }

    @Override // androidx.compose.ui.platform.l2
    @dl.d
    public View getView() {
        return this;
    }

    @Override // androidx.compose.ui.node.b1
    @dl.d
    public d2 getViewConfiguration() {
        return this.viewConfiguration;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.e
    public final b getViewTreeOwners() {
        return (b) this.viewTreeOwners.getValue();
    }

    @Override // androidx.compose.ui.node.b1
    @dl.d
    public o2 getWindowInfo() {
        return this._windowInfo;
    }

    @Override // androidx.compose.ui.input.pointer.n0
    public long h(long positionOnScreen) {
        k0();
        return androidx.compose.ui.graphics.c1.j(this.windowToViewMatrix, b1.g.a(b1.f.p(positionOnScreen) - b1.f.p(this.windowPosition), b1.f.r(positionOnScreen) - b1.f.r(this.windowPosition)));
    }

    @Override // androidx.compose.ui.node.b1
    public void i(@dl.d LayoutNode layoutNode, long constraints) {
        kotlin.jvm.internal.f0.p(layoutNode, "layoutNode");
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.measureAndLayoutDelegate.p(layoutNode, constraints);
            androidx.compose.ui.node.j0.e(this.measureAndLayoutDelegate, false, 1, null);
            kotlin.b2 b2Var = kotlin.b2.f124493a;
        } finally {
            Trace.endSection();
        }
    }

    @dl.e
    public final Object i0(@dl.d kotlin.coroutines.c<? super kotlin.b2> cVar) throws Throwable {
        Object objR = this.textInputServiceAndroid.r(cVar);
        return objR == kotlin.coroutines.intrinsics.b.h() ? objR : kotlin.b2.f124493a;
    }

    @Override // androidx.lifecycle.j
    public void j(@dl.d androidx.lifecycle.y owner) {
        kotlin.jvm.internal.f0.p(owner, "owner");
        setShowLayoutBounds(INSTANCE.b());
    }

    public final void j0(@dl.d androidx.compose.ui.node.z0 layer, boolean isDirty) {
        kotlin.jvm.internal.f0.p(layer, "layer");
        if (!isDirty) {
            if (!this.isDrawingContent && !this.dirtyLayers.remove(layer)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            if (!this.isDrawingContent) {
                this.dirtyLayers.add(layer);
                return;
            }
            List arrayList = this.postponedDirtyLayers;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.postponedDirtyLayers = arrayList;
            }
            arrayList.add(layer);
        }
    }

    @Override // androidx.compose.ui.node.i1
    public boolean k(@dl.d KeyEvent keyEvent) {
        kotlin.jvm.internal.f0.p(keyEvent, "keyEvent");
        return this.keyInputModifier.g(keyEvent);
    }

    @Override // androidx.lifecycle.j
    public /* synthetic */ void l(androidx.lifecycle.y yVar) {
        androidx.lifecycle.i.c(this, yVar);
    }

    @Override // androidx.compose.ui.node.b1
    public long m(long positionInWindow) {
        k0();
        return androidx.compose.ui.graphics.c1.j(this.windowToViewMatrix, positionInWindow);
    }

    @Override // androidx.compose.ui.node.b1
    public void n(@dl.d yh.a<kotlin.b2> listener) {
        kotlin.jvm.internal.f0.p(listener, "listener");
        if (this.endApplyChangesListeners.n(listener)) {
            return;
        }
        this.endApplyChangesListeners.b(listener);
    }

    public final boolean n0(@dl.d androidx.compose.ui.node.z0 layer) {
        kotlin.jvm.internal.f0.p(layer, "layer");
        if (this.viewLayersContainer != null) {
            ViewLayer.INSTANCE.c();
        }
        this.layerCache.d(layer);
        return true;
    }

    @Override // androidx.compose.ui.node.b1
    @dl.d
    public androidx.compose.ui.node.z0 o(@dl.d yh.l<? super androidx.compose.ui.graphics.d0, kotlin.b2> drawBlock, @dl.d yh.a<kotlin.b2> invalidateParentLayer) {
        DrawChildContainer viewLayerContainer;
        kotlin.jvm.internal.f0.p(drawBlock, "drawBlock");
        kotlin.jvm.internal.f0.p(invalidateParentLayer, "invalidateParentLayer");
        androidx.compose.ui.node.z0 z0VarC = this.layerCache.c();
        if (z0VarC != null) {
            z0VarC.e(drawBlock, invalidateParentLayer);
            return z0VarC;
        }
        if (isHardwareAccelerated() && this.isRenderNodeCompatible) {
            try {
                return new RenderNodeLayer(this, drawBlock, invalidateParentLayer);
            } catch (Throwable unused) {
                this.isRenderNodeCompatible = false;
            }
        }
        if (this.viewLayersContainer == null) {
            ViewLayer.Companion companion = ViewLayer.INSTANCE;
            if (!companion.a()) {
                companion.e(new View(getContext()));
            }
            if (companion.c()) {
                Context context = getContext();
                kotlin.jvm.internal.f0.o(context, "context");
                viewLayerContainer = new DrawChildContainer(context);
            } else {
                Context context2 = getContext();
                kotlin.jvm.internal.f0.o(context2, "context");
                viewLayerContainer = new ViewLayerContainer(context2);
            }
            this.viewLayersContainer = viewLayerContainer;
            addView(viewLayerContainer);
        }
        DrawChildContainer drawChildContainer = this.viewLayersContainer;
        kotlin.jvm.internal.f0.m(drawChildContainer);
        return new ViewLayer(this, drawChildContainer, drawBlock, invalidateParentLayer);
    }

    public final void o0(@dl.d final AndroidViewHolder view) {
        kotlin.jvm.internal.f0.p(view, "view");
        n(new yh.a<kotlin.b2>() { // from class: androidx.compose.ui.platform.AndroidComposeView$removeAndroidView$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                invoke2();
                return kotlin.b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f15467b.getAndroidViewsHandler$ui_release().removeViewInLayout(view);
                HashMap<LayoutNode, AndroidViewHolder> layoutNodeToHolder = this.f15467b.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder();
                kotlin.jvm.internal.w0.k(layoutNodeToHolder).remove(this.f15467b.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(view));
                androidx.core.view.j1.R1(view, 0);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        androidx.lifecycle.y lifecycleOwner;
        Lifecycle lifecycle;
        a1.b bVar;
        super.onAttachedToWindow();
        d0(getRoot());
        c0(getRoot());
        getSnapshotObserver().j();
        if (R() && (bVar = this.f15448w) != null) {
            a1.l.f1156a.a(bVar);
        }
        androidx.lifecycle.y yVarA = ViewTreeLifecycleOwner.a(this);
        androidx.savedstate.d dVarA = ViewTreeSavedStateRegistryOwner.a(this);
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || !(yVarA == null || dVarA == null || (yVarA == viewTreeOwners.getLifecycleOwner() && dVarA == viewTreeOwners.getLifecycleOwner()))) {
            if (yVarA == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (dVarA == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.d(this);
            }
            yVarA.getLifecycle().a(this);
            b bVar2 = new b(yVarA, dVarA);
            setViewTreeOwners(bVar2);
            yh.l<? super b, kotlin.b2> lVar = this.R;
            if (lVar != null) {
                lVar.invoke(bVar2);
            }
            this.R = null;
        }
        b viewTreeOwners2 = getViewTreeOwners();
        kotlin.jvm.internal.f0.m(viewTreeOwners2);
        viewTreeOwners2.getLifecycleOwner().getLifecycle().a(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.globalLayoutListener);
        getViewTreeObserver().addOnScrollChangedListener(this.scrollChangedListener);
        getViewTreeObserver().addOnTouchModeChangeListener(this.touchModeChangeListener);
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        return this.textInputServiceAndroid.getEditorHasFocus();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(@dl.d Configuration newConfig) {
        kotlin.jvm.internal.f0.p(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Context context = getContext();
        kotlin.jvm.internal.f0.o(context, "context");
        this.f15427e = s1.a.a(context);
        if (X(newConfig) != this.currentFontWeightAdjustment) {
            this.currentFontWeightAdjustment = X(newConfig);
            Context context2 = getContext();
            kotlin.jvm.internal.f0.o(context2, "context");
            setFontFamilyResolver(androidx.compose.ui.text.font.z.a(context2));
        }
        this.f15447v.invoke(newConfig);
    }

    @Override // android.view.View
    @dl.e
    public InputConnection onCreateInputConnection(@dl.d EditorInfo outAttrs) {
        kotlin.jvm.internal.f0.p(outAttrs, "outAttrs");
        return this.textInputServiceAndroid.k(outAttrs);
    }

    @Override // androidx.lifecycle.j
    public /* synthetic */ void onDestroy(androidx.lifecycle.y yVar) {
        androidx.lifecycle.i.b(this, yVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        a1.b bVar;
        androidx.lifecycle.y lifecycleOwner;
        Lifecycle lifecycle;
        super.onDetachedFromWindow();
        getSnapshotObserver().k();
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.d(this);
        }
        if (R() && (bVar = this.f15448w) != null) {
            a1.l.f1156a.b(bVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.globalLayoutListener);
        getViewTreeObserver().removeOnScrollChangedListener(this.scrollChangedListener);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.touchModeChangeListener);
    }

    @Override // android.view.View
    protected void onDraw(@dl.d Canvas canvas) {
        kotlin.jvm.internal.f0.p(canvas, "canvas");
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z10, int i10, @dl.e Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        Log.d(S3, "Owner FocusChanged(" + z10 + ')');
        FocusManagerImpl focusManagerImpl = this._focusManager;
        if (z10) {
            focusManagerImpl.i();
        } else {
            focusManagerImpl.g();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.measureAndLayoutDelegate.n(this.M3);
        this.E = null;
        y0();
        if (this._androidViewsHandler != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                d0(getRoot());
            }
            Pair<Integer, Integer> pairU = U(i10);
            int iIntValue = pairU.a().intValue();
            int iIntValue2 = pairU.b().intValue();
            Pair<Integer, Integer> pairU2 = U(i11);
            long jA = s1.c.a(iIntValue, iIntValue2, pairU2.a().intValue(), pairU2.b().intValue());
            s1.b bVar = this.E;
            boolean zG = false;
            if (bVar == null) {
                this.E = s1.b.b(jA);
                this.wasMeasuredWithMultipleConstraints = false;
            } else {
                if (bVar != null) {
                    zG = s1.b.g(bVar.getF139216a(), jA);
                }
                if (!zG) {
                    this.wasMeasuredWithMultipleConstraints = true;
                }
            }
            this.measureAndLayoutDelegate.G(jA);
            this.measureAndLayoutDelegate.q();
            setMeasuredDimension(getRoot().getWidth(), getRoot().getHeight());
            if (this._androidViewsHandler != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().getHeight(), 1073741824));
            }
            kotlin.b2 b2Var = kotlin.b2.f124493a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(@dl.e ViewStructure viewStructure, int i10) {
        a1.b bVar;
        if (!R() || viewStructure == null || (bVar = this.f15448w) == null) {
            return;
        }
        a1.d.b(bVar, viewStructure);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        if (this.superclassInitComplete) {
            LayoutDirection layoutDirectionG = AndroidComposeView_androidKt.g(i10);
            setLayoutDirection(layoutDirectionG);
            this._focusManager.h(layoutDirectionG);
        }
    }

    @Override // androidx.lifecycle.j
    public /* synthetic */ void onStart(androidx.lifecycle.y yVar) {
        androidx.lifecycle.i.e(this, yVar);
    }

    @Override // androidx.lifecycle.j
    public /* synthetic */ void onStop(androidx.lifecycle.y yVar) {
        androidx.lifecycle.i.f(this, yVar);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        boolean zB;
        this._windowInfo.f(z10);
        this.keyboardModifiersRequireUpdate = true;
        super.onWindowFocusChanged(z10);
        if (!z10 || getShowLayoutBounds() == (zB = INSTANCE.b())) {
            return;
        }
        setShowLayoutBounds(zB);
        y();
    }

    @Override // androidx.compose.ui.node.b1
    public void p() {
        if (this.observationClearRequested) {
            getSnapshotObserver().b();
            this.observationClearRequested = false;
        }
        AndroidViewsHandler androidViewsHandler = this._androidViewsHandler;
        if (androidViewsHandler != null) {
            T(androidViewsHandler);
        }
        while (this.endApplyChangesListeners.Q()) {
            int i10 = this.endApplyChangesListeners.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
            for (int i11 = 0; i11 < i10; i11++) {
                yh.a<kotlin.b2> aVar = this.endApplyChangesListeners.G()[i11];
                this.endApplyChangesListeners.l0(i11, null);
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            this.endApplyChangesListeners.h0(0, i10);
        }
    }

    public final void p0() {
        this.observationClearRequested = true;
    }

    @Override // androidx.lifecycle.j
    public /* synthetic */ void q(androidx.lifecycle.y yVar) {
        androidx.lifecycle.i.a(this, yVar);
    }

    @Override // androidx.compose.ui.node.b1
    public void r(@dl.d LayoutNode layoutNode, boolean z10, boolean z11) {
        kotlin.jvm.internal.f0.p(layoutNode, "layoutNode");
        if (z10) {
            if (this.measureAndLayoutDelegate.x(layoutNode, z11)) {
                r0(this, null, 1, null);
            }
        } else if (this.measureAndLayoutDelegate.C(layoutNode, z11)) {
            r0(this, null, 1, null);
        }
    }

    @Override // androidx.compose.ui.node.b1
    public long s(long localPosition) {
        k0();
        return androidx.compose.ui.graphics.c1.j(this.viewToWindowMatrix, localPosition);
    }

    public final void setConfigurationChangeObserver(@dl.d yh.l<? super Configuration, kotlin.b2> lVar) {
        kotlin.jvm.internal.f0.p(lVar, "<set-?>");
        this.f15447v = lVar;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j10) {
        this.lastMatrixRecalculationAnimationTime = j10;
    }

    public final void setOnViewTreeOwnersAvailable(@dl.d yh.l<? super b, kotlin.b2> callback) {
        kotlin.jvm.internal.f0.p(callback, "callback");
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            callback.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.R = callback;
    }

    @Override // androidx.compose.ui.node.b1
    public void setShowLayoutBounds(boolean z10) {
        this.showLayoutBounds = z10;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // androidx.compose.ui.node.b1
    public void t(@dl.d LayoutNode layoutNode) {
        kotlin.jvm.internal.f0.p(layoutNode, "layoutNode");
        this.accessibilityDelegate.J(layoutNode);
    }

    @Override // androidx.compose.ui.node.b1
    public void u(@dl.d LayoutNode layoutNode) {
        kotlin.jvm.internal.f0.p(layoutNode, "layoutNode");
        this.measureAndLayoutDelegate.h(layoutNode);
    }

    @Override // androidx.compose.ui.node.b1
    @dl.e
    public androidx.compose.ui.focus.b v(@dl.d KeyEvent keyEvent) {
        kotlin.jvm.internal.f0.p(keyEvent, "keyEvent");
        long jA = androidx.compose.ui.input.key.d.a(keyEvent);
        androidx.compose.ui.input.key.a.Companion companion = androidx.compose.ui.input.key.a.INSTANCE;
        if (androidx.compose.ui.input.key.a.E4(jA, companion.W7())) {
            return androidx.compose.ui.focus.b.k(androidx.compose.ui.input.key.d.g(keyEvent) ? androidx.compose.ui.focus.b.INSTANCE.l() : androidx.compose.ui.focus.b.INSTANCE.i());
        }
        if (androidx.compose.ui.input.key.a.E4(jA, companion.Q1())) {
            return androidx.compose.ui.focus.b.k(androidx.compose.ui.focus.b.INSTANCE.m());
        }
        if (androidx.compose.ui.input.key.a.E4(jA, companion.O1())) {
            return androidx.compose.ui.focus.b.k(androidx.compose.ui.focus.b.INSTANCE.h());
        }
        if (androidx.compose.ui.input.key.a.E4(jA, companion.S1())) {
            return androidx.compose.ui.focus.b.k(androidx.compose.ui.focus.b.INSTANCE.n());
        }
        if (androidx.compose.ui.input.key.a.E4(jA, companion.I1())) {
            return androidx.compose.ui.focus.b.k(androidx.compose.ui.focus.b.INSTANCE.a());
        }
        if (androidx.compose.ui.input.key.a.E4(jA, companion.G1()) ? true : androidx.compose.ui.input.key.a.E4(jA, companion.i2()) ? true : androidx.compose.ui.input.key.a.E4(jA, companion.K5())) {
            return androidx.compose.ui.focus.b.k(androidx.compose.ui.focus.b.INSTANCE.b());
        }
        if (androidx.compose.ui.input.key.a.E4(jA, companion.w()) ? true : androidx.compose.ui.input.key.a.E4(jA, companion.o2())) {
            return androidx.compose.ui.focus.b.k(androidx.compose.ui.focus.b.INSTANCE.d());
        }
        return null;
    }

    @Override // androidx.compose.ui.node.b1
    public void w(@dl.d LayoutNode node) {
        kotlin.jvm.internal.f0.p(node, "node");
    }

    @Override // androidx.compose.ui.node.b1
    public void x(@dl.d LayoutNode node) {
        kotlin.jvm.internal.f0.p(node, "node");
        this.measureAndLayoutDelegate.r(node);
        p0();
    }

    @Override // androidx.compose.ui.platform.l2
    public void y() {
        c0(getRoot());
    }

    @Override // androidx.compose.ui.input.pointer.n0
    public long z(long localPosition) {
        k0();
        long j10 = androidx.compose.ui.graphics.c1.j(this.viewToWindowMatrix, localPosition);
        return b1.g.a(b1.f.p(j10) + b1.f.p(this.windowPosition), b1.f.r(j10) + b1.f.r(this.windowPosition));
    }
}
