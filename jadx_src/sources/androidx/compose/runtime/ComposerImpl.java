package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import com.max.xiaoheihe.module.mall.MallPurchaseDetailDialogFragment;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000ø\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001:\u0004æ\u0001û\u0001Bû\u0001\u0012\n\u0010U\u001a\u0006\u0012\u0002\b\u00030R\u0012\b\u0010\u0080\u0002\u001a\u00030Ü\u0001\u0012\b\u0010\u0083\u0002\u001a\u00030\u0081\u0002\u0012\u000f\u0010\u0087\u0002\u001a\n\u0012\u0005\u0012\u00030\u0085\u00020\u0084\u0002\u0012Z\u0010\u0089\u0002\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030R¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(U\u0012\u0013\u0012\u00110V¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(W\u0012\u0013\u0012\u00110X¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(Y\u0012\u0004\u0012\u00020\u00020Qj\u0002`Z0P\u0012Z\u0010\u008a\u0002\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030R¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(U\u0012\u0013\u0012\u00110V¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(W\u0012\u0013\u0012\u00110X¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(Y\u0012\u0004\u0012\u00020\u00020Qj\u0002`Z0P\u0012\u0007\u0010\u008e\u0002\u001a\u00020c¢\u0006\u0006\bô\u0002\u0010õ\u0002J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001a\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J;\u0010\u0013\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00110\u000fj\u0002`\u00122\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014Jx\u0010\u0017\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00110\u000fj\u0002`\u00122&\u0010\u0015\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00110\u000fj\u0002`\u00122&\u0010\u0016\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00110\u000fj\u0002`\u0012H\u0002JK\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00182\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102&\u0010\u0019\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00110\u000fj\u0002`\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u0002H\u0002J\b\u0010\u001d\u001a\u00020\u0002H\u0002J\u001a\u0010!\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\tH\u0002J,\u0010#\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\tH\u0002J\u001a\u0010&\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010%\u001a\u0004\u0018\u00010$H\u0002J\u0018\u0010)\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u001eH\u0002J\u0010\u0010*\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J\b\u0010+\u001a\u00020\u0002H\u0002J\u0010\u0010-\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0006H\u0002J\u0018\u0010/\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u0006H\u0002J(\u00103\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u0006H\u0002J\u0010\u00104\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\u0018\u00106\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u0006H\u0002J\b\u00107\u001a\u00020\u0002H\u0002J \u0010;\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u0006H\u0002J\u0018\u0010=\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u0006H\u0002J \u0010?\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u0006H\u0002J\u0014\u0010A\u001a\u00020\u0006*\u00020@2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\b\u0010B\u001a\u00020\u0002H\u0002J\b\u0010C\u001a\u00020\u0002H\u0002JR\u0010I\u001a\u00020\u00022\u000e\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0D2&\u0010F\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00110\u000fj\u0002`\u00122\b\u0010G\u001a\u0004\u0018\u00010\t2\u0006\u0010H\u001a\u00020\u001eH\u0002J$\u0010N\u001a\u00020\u00022\u001a\u0010M\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020L\u0012\u0006\u0012\u0004\u0018\u00010L0K0JH\u0002J\u007f\u0010^\u001a\u00028\u0000\"\u0004\b\u0000\u0010O2Y\u0010[\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030R¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(U\u0012\u0013\u0012\u00110V¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(W\u0012\u0013\u0012\u00110X¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(Y\u0012\u0004\u0012\u00020\u00020Qj\u0002`Z0P2\f\u0010]\u001a\b\u0012\u0004\u0012\u00028\u00000\\H\u0082\b¢\u0006\u0004\b^\u0010_J,\u0010a\u001a\u00028\u0000\"\u0004\b\u0000\u0010O2\u0006\u0010`\u001a\u00020@2\f\u0010]\u001a\b\u0012\u0004\u0012\u00028\u00000\\H\u0082\b¢\u0006\u0004\ba\u0010bJk\u0010i\u001a\u00028\u0000\"\u0004\b\u0000\u0010O2\n\b\u0002\u0010d\u001a\u0004\u0018\u00010c2\n\b\u0002\u0010e\u001a\u0004\u0018\u00010c2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00062\"\b\u0002\u0010h\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020f\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010g0K0J2\f\u0010]\u001a\b\u0012\u0004\u0012\u00028\u00000\\H\u0002¢\u0006\u0004\bi\u0010jJ@\u0010n\u001a\u00020\u00022\u001a\u0010l\u001a\u0016\u0012\u0004\u0012\u00020f\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010g0k2\u0013\u0010E\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\\¢\u0006\u0002\bmH\u0002¢\u0006\u0004\bn\u0010oJ\u0016\u0010p\u001a\u0004\u0018\u00010\t*\u00020@2\u0006\u0010,\u001a\u00020\u0006H\u0002J\b\u0010q\u001a\u00020\u0002H\u0002J\b\u0010r\u001a\u00020\u0002H\u0002J]\u0010t\u001a\u00020\u00022S\u0010s\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030R¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(U\u0012\u0013\u0012\u00110V¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(W\u0012\u0013\u0012\u00110X¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(Y\u0012\u0004\u0012\u00020\u00020Qj\u0002`ZH\u0002J]\u0010u\u001a\u00020\u00022S\u0010s\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030R¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(U\u0012\u0013\u0012\u00110V¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(W\u0012\u0013\u0012\u00110X¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(Y\u0012\u0004\u0012\u00020\u00020Qj\u0002`ZH\u0002J]\u0010v\u001a\u00020\u00022S\u0010s\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030R¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(U\u0012\u0013\u0012\u00110V¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(W\u0012\u0013\u0012\u00110X¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(Y\u0012\u0004\u0012\u00020\u00020Qj\u0002`ZH\u0002Jg\u0010x\u001a\u00020\u00022\b\b\u0002\u0010w\u001a\u00020\u001e2S\u0010s\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030R¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(U\u0012\u0013\u0012\u00110V¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(W\u0012\u0013\u0012\u00110X¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(Y\u0012\u0004\u0012\u00020\u00020Qj\u0002`ZH\u0002J\b\u0010y\u001a\u00020\u0002H\u0002J\u001f\u0010|\u001a\u00020\u00022\u000e\u0010{\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0zH\u0002¢\u0006\u0004\b|\u0010}J\b\u0010~\u001a\u00020\u0002H\u0002J\u0013\u0010\u0080\u0001\u001a\u00020\u00022\b\u0010\u007f\u001a\u0004\u0018\u00010\tH\u0002J\t\u0010\u0081\u0001\u001a\u00020\u0002H\u0002J\u0013\u0010\u0082\u0001\u001a\u00020\u00022\b\b\u0002\u0010w\u001a\u00020\u001eH\u0002J\u0013\u0010\u0085\u0001\u001a\u00020\u00022\b\u0010\u0084\u0001\u001a\u00030\u0083\u0001H\u0002J^\u0010\u0086\u0001\u001a\u00020\u00022S\u0010s\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030R¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(U\u0012\u0013\u0012\u00110V¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(W\u0012\u0013\u0012\u00110X¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(Y\u0012\u0004\u0012\u00020\u00020Qj\u0002`ZH\u0002J^\u0010\u0087\u0001\u001a\u00020\u00022S\u0010s\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030R¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(U\u0012\u0013\u0012\u00110V¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(W\u0012\u0013\u0012\u00110X¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(Y\u0012\u0004\u0012\u00020\u00020Qj\u0002`ZH\u0002J\t\u0010\u0088\u0001\u001a\u00020\u0002H\u0002J\t\u0010\u0089\u0001\u001a\u00020\u0002H\u0002J\u0012\u0010\u008b\u0001\u001a\u00020\u00022\u0007\u0010\u008a\u0001\u001a\u00020\u0006H\u0002J\u001a\u0010\u008d\u0001\u001a\u00020\u00022\u0007\u0010\u008c\u0001\u001a\u00020L2\u0006\u0010W\u001a\u00020VH\u0002J\t\u0010\u008e\u0001\u001a\u00020\u0002H\u0002J\u0012\u0010\u0090\u0001\u001a\u00020\u00022\u0007\u0010\u008f\u0001\u001a\u00020\u0006H\u0002J\t\u0010\u0091\u0001\u001a\u00020\u0002H\u0002J\t\u0010\u0092\u0001\u001a\u00020\u0002H\u0002J\t\u0010\u0093\u0001\u001a\u00020\u0002H\u0002J\t\u0010\u0094\u0001\u001a\u00020\u0002H\u0002J\t\u0010\u0095\u0001\u001a\u00020\u0002H\u0002J\u001a\u0010\u0097\u0001\u001a\u00020\u00022\u0007\u0010\u0096\u0001\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u0006H\u0002J!\u0010\u0098\u0001\u001a\u00020\u00022\u0006\u0010d\u001a\u00020\u00062\u0006\u0010e\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u0006H\u0002J\t\u0010\u0099\u0001\u001a\u00020\u0002H\u0002J&\u0010\u009b\u0001\u001a\u00020\u00022\u0007\u0010\u009a\u0001\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010 \u001a\u0004\u0018\u00010\tH\u0002J\u0012\u0010\u009d\u0001\u001a\u00020\u00022\u0007\u0010\u009c\u0001\u001a\u00020\u0006H\u0002J&\u0010\u009e\u0001\u001a\u00020\u00022\u0007\u0010\u009a\u0001\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010 \u001a\u0004\u0018\u00010\tH\u0002J\u0012\u0010\u009f\u0001\u001a\u00020\u00022\u0007\u0010\u009a\u0001\u001a\u00020\u0006H\u0002J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0017J\t\u0010 \u0001\u001a\u00020\u0002H\u0017J\t\u0010¡\u0001\u001a\u00020\u0002H\u0017J\t\u0010¢\u0001\u001a\u00020\u0002H\u0017J\u001b\u0010£\u0001\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0017J\t\u0010¤\u0001\u001a\u00020\u0002H\u0017J\u0012\u0010¥\u0001\u001a\u00020\u0002H\u0000¢\u0006\u0006\b¥\u0001\u0010¦\u0001J\t\u0010§\u0001\u001a\u00020\u0002H\u0016J\u0012\u0010¨\u0001\u001a\u00020\u0002H\u0000¢\u0006\u0006\b¨\u0001\u0010¦\u0001J\u0012\u0010©\u0001\u001a\u00020\u001eH\u0000¢\u0006\u0006\b©\u0001\u0010ª\u0001J\t\u0010«\u0001\u001a\u00020\u0002H\u0016J\t\u0010¬\u0001\u001a\u00020\u0002H\u0016J\u001e\u0010®\u0001\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00182\r\u0010\u00ad\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\\H\u0016J\t\u0010¯\u0001\u001a\u00020\u0002H\u0016J\t\u0010°\u0001\u001a\u00020\u0002H\u0016J\u001b\u0010±\u0001\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\t\u0010²\u0001\u001a\u00020\u0002H\u0016J\t\u0010³\u0001\u001a\u00020\u0002H\u0016J\t\u0010´\u0001\u001a\u00020\u0002H\u0016JI\u0010¹\u0001\u001a\u00020\u0002\"\u0005\b\u0000\u0010µ\u0001\"\u0004\b\u0001\u0010\u00182\u0007\u0010¶\u0001\u001a\u00028\u00002\u001f\u0010]\u001a\u001b\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020·\u0001¢\u0006\u0003\b¸\u0001H\u0016¢\u0006\u0006\b¹\u0001\u0010º\u0001J\u001f\u0010½\u0001\u001a\u00020\t2\t\u0010»\u0001\u001a\u0004\u0018\u00010\t2\t\u0010¼\u0001\u001a\u0004\u0018\u00010\tH\u0017J\u000b\u0010¾\u0001\u001a\u0004\u0018\u00010\tH\u0001J\u0014\u0010¿\u0001\u001a\u00020\u001e2\t\u0010¶\u0001\u001a\u0004\u0018\u00010\tH\u0017J\u0013\u0010Á\u0001\u001a\u00020\u001e2\b\u0010¶\u0001\u001a\u00030À\u0001H\u0017J\u0013\u0010Ã\u0001\u001a\u00020\u001e2\b\u0010¶\u0001\u001a\u00030Â\u0001H\u0017J\u0013\u0010Å\u0001\u001a\u00020\u001e2\b\u0010¶\u0001\u001a\u00030Ä\u0001H\u0017J\u0012\u0010Æ\u0001\u001a\u00020\u001e2\u0007\u0010¶\u0001\u001a\u00020\u001eH\u0017J\u0013\u0010È\u0001\u001a\u00020\u001e2\b\u0010¶\u0001\u001a\u00030Ç\u0001H\u0017J\u0013\u0010Ê\u0001\u001a\u00020\u001e2\b\u0010¶\u0001\u001a\u00030É\u0001H\u0017J\u0013\u0010Ì\u0001\u001a\u00020\u001e2\b\u0010¶\u0001\u001a\u00030Ë\u0001H\u0017J\u0012\u0010Í\u0001\u001a\u00020\u001e2\u0007\u0010¶\u0001\u001a\u00020\u0006H\u0017J3\u0010Ï\u0001\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00182\u0007\u0010Î\u0001\u001a\u00020\u001e2\f\u0010]\u001a\b\u0012\u0004\u0012\u00028\u00000\\H\u0087\bø\u0001\u0000¢\u0006\u0006\bÏ\u0001\u0010Ð\u0001J\u0014\u0010Ñ\u0001\u001a\u00020\u00022\t\u0010¶\u0001\u001a\u0004\u0018\u00010\tH\u0001J\u0014\u0010Ò\u0001\u001a\u00020\u00022\t\u0010¶\u0001\u001a\u0004\u0018\u00010\tH\u0001J\u0018\u0010Ô\u0001\u001a\u00020\u00022\r\u0010Ó\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020\\H\u0016J(\u0010×\u0001\u001a\u00020\u00022\u0014\u0010Ö\u0001\u001a\u000f\u0012\u000b\b\u0001\u0012\u0007\u0012\u0002\b\u00030Õ\u00010zH\u0017¢\u0006\u0006\b×\u0001\u0010Ø\u0001J\t\u0010Ù\u0001\u001a\u00020\u0002H\u0017J&\u0010Ú\u0001\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00182\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0017¢\u0006\u0006\bÚ\u0001\u0010Û\u0001J\n\u0010Ý\u0001\u001a\u00030Ü\u0001H\u0016J%\u0010ß\u0001\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020f2\t\u0010Þ\u0001\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0006\bß\u0001\u0010à\u0001J\u0012\u0010á\u0001\u001a\u00020\u0006H\u0000¢\u0006\u0006\bá\u0001\u0010â\u0001J\t\u0010ã\u0001\u001a\u00020\u0002H\u0017J\t\u0010ä\u0001\u001a\u00020\u0002H\u0017J\u0012\u0010æ\u0001\u001a\u00020\u00022\u0007\u0010å\u0001\u001a\u00020\u001eH\u0017J\u0011\u0010ç\u0001\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0017J\f\u0010é\u0001\u001a\u0005\u0018\u00010è\u0001H\u0017J \u0010ê\u0001\u001a\u00020\u00022\u000b\u0010¶\u0001\u001a\u0006\u0012\u0002\b\u00030D2\b\u0010G\u001a\u0004\u0018\u00010\tH\u0017J%\u0010ë\u0001\u001a\u00020\u00022\u001a\u0010M\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020L\u0012\u0006\u0012\u0004\u0018\u00010L0K0JH\u0017J\u0013\u0010î\u0001\u001a\u00020\u00022\b\u0010í\u0001\u001a\u00030ì\u0001H\u0017J\u001b\u0010ï\u0001\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010í\u0001\u001a\u00030ì\u0001H\u0017J\t\u0010ð\u0001\u001a\u00020\u0002H\u0017J@\u0010ñ\u0001\u001a\u00020\u00022\u001a\u0010l\u001a\u0016\u0012\u0004\u0012\u00020f\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010g0k2\u0011\u0010E\u001a\r\u0012\u0004\u0012\u00020\u00020\\¢\u0006\u0002\bmH\u0000¢\u0006\u0005\bñ\u0001\u0010oJ \u0010ò\u0001\u001a\u00020\u00022\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00020\\H\u0000¢\u0006\u0006\bò\u0001\u0010ó\u0001J.\u0010ô\u0001\u001a\u00020\u001e2\u001a\u0010l\u001a\u0016\u0012\u0004\u0012\u00020f\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010g0kH\u0000¢\u0006\u0006\bô\u0001\u0010õ\u0001J\u0012\u0010ö\u0001\u001a\u00020\u0002H\u0000¢\u0006\u0006\bö\u0001\u0010¦\u0001J\u000b\u0010÷\u0001\u001a\u0004\u0018\u00010\tH\u0016J\u0014\u0010ø\u0001\u001a\u00020\u00022\t\u0010¶\u0001\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010ú\u0001\u001a\u00020\u00022\u0007\u0010\u0019\u001a\u00030ù\u0001H\u0016R\"\u0010U\u001a\u0006\u0012\u0002\b\u00030R8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bû\u0001\u0010ü\u0001\u001a\u0006\bý\u0001\u0010þ\u0001R\u0018\u0010\u0080\u0002\u001a\u00030Ü\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bë\u0001\u0010ÿ\u0001R\u0018\u0010\u0083\u0002\u001a\u00030\u0081\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¯\u0001\u0010\u0082\u0002R\u001f\u0010\u0087\u0002\u001a\n\u0012\u0005\u0012\u00030\u0085\u00020\u0084\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010\u0086\u0002Rl\u0010\u0089\u0002\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030R¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(U\u0012\u0013\u0012\u00110V¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(W\u0012\u0013\u0012\u00110X¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(Y\u0012\u0004\u0012\u00020\u00020Qj\u0002`Z0P8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010\u0088\u0002Rl\u0010\u008a\u0002\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030R¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(U\u0012\u0013\u0012\u00110V¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(W\u0012\u0013\u0012\u00110X¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(Y\u0012\u0004\u0012\u00020\u00020Qj\u0002`Z0P8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÔ\u0001\u0010\u0088\u0002R\u001f\u0010\u008e\u0002\u001a\u00020c8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¬\u0001\u0010\u008b\u0002\u001a\u0006\b\u008c\u0002\u0010\u008d\u0002R \u0010\u0091\u0002\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010$0\u008f\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0001\u0010\u0090\u0002R\u001b\u0010\u0094\u0002\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0002\u0010\u0093\u0002R\u0019\u0010\u0096\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bî\u0001\u0010½\u0001R\u001a\u0010\u0097\u0002\u001a\u00030\u0095\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bä\u0001\u0010\u0096\u0002R\u0019\u0010\u0098\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bï\u0001\u0010½\u0001R\u001a\u0010\u0099\u0002\u001a\u00030\u0095\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0002\u0010\u0096\u0002R\u001c\u0010\u009d\u0002\u001a\u0005\u0018\u00010\u009a\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0002\u0010\u009c\u0002R;\u0010¡\u0002\u001a$\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u009e\u0002j\u0011\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u009f\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bú\u0001\u0010 \u0002R\u0019\u0010¢\u0002\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÝ\u0001\u0010Ù\u0001R\u0019\u0010£\u0002\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bð\u0001\u0010Ù\u0001R\u0019\u0010¤\u0002\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0001\u0010Ù\u0001R\u001d\u0010h\u001a\t\u0012\u0005\u0012\u00030¥\u00020P8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b×\u0001\u0010\u0088\u0002R\u0018\u0010¦\u0002\u001a\u00030\u0095\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0001\u0010\u0096\u0002Ru\u0010§\u0002\u001a`\u0012\u0004\u0012\u00020\u0006\u0012$\u0012\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00110\u000fj\u0002`\u00120\u009e\u0002j/\u0012\u0004\u0012\u00020\u0006\u0012$\u0012\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00110\u000fj\u0002`\u0012`\u009f\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÈ\u0001\u0010 \u0002R\u0019\u0010¨\u0002\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0001\u0010Ù\u0001R\u0018\u0010©\u0002\u001a\u00030\u0095\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÍ\u0001\u0010\u0096\u0002R\u0019\u0010ª\u0002\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÊ\u0001\u0010Ù\u0001R\u0019\u0010«\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0001\u0010½\u0001R\u0019\u0010¬\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010½\u0001R\u001a\u0010¯\u0002\u001a\u00030\u00ad\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÌ\u0001\u0010®\u0002R\u0019\u0010±\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0002\u0010½\u0001R\u001e\u0010²\u0002\u001a\t\u0012\u0004\u0012\u00020f0\u008f\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bã\u0001\u0010\u0090\u0002R*\u0010µ\u0002\u001a\u00020\u001e2\u0007\u0010³\u0002\u001a\u00020\u001e8\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\bç\u0001\u0010Ù\u0001\u001a\u0006\b´\u0002\u0010ª\u0001R*\u0010·\u0002\u001a\u00020\u001e2\u0007\u0010³\u0002\u001a\u00020\u001e8\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\bý\u0001\u0010Ù\u0001\u001a\u0006\b¶\u0002\u0010ª\u0001R\u0018\u0010`\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bé\u0001\u0010¸\u0002R*\u0010½\u0002\u001a\u00030\u0081\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b½\u0001\u0010\u0082\u0002\u001a\u0006\b¹\u0002\u0010º\u0002\"\u0006\b»\u0002\u0010¼\u0002R\u0019\u0010¿\u0002\u001a\u00020V8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010¾\u0002R\u0019\u0010À\u0002\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÚ\u0001\u0010Ù\u0001R~\u0010Æ\u0002\u001aW\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030R¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(U\u0012\u0013\u0012\u00110V¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(W\u0012\u0013\u0012\u00110X¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(Y\u0012\u0004\u0012\u00020\u00020Qj\u0002`Z\u0018\u00010P8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÁ\u0002\u0010\u0088\u0002\u001a\u0006\bÂ\u0002\u0010Ã\u0002\"\u0006\bÄ\u0002\u0010Å\u0002R\u001a\u0010È\u0002\u001a\u00030\u0083\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bø\u0001\u0010Ç\u0002Rj\u0010É\u0002\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030R¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(U\u0012\u0013\u0012\u00110V¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(W\u0012\u0013\u0012\u00110X¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(Y\u0012\u0004\u0012\u00020\u00020Qj\u0002`Z0P8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010\u0088\u0002R1\u0010(\u001a\u00020\u001e2\u0007\u0010³\u0002\u001a\u00020\u001e8\u0016@RX\u0097\u000e¢\u0006\u0018\n\u0006\bê\u0001\u0010Ù\u0001\u0012\u0006\bÊ\u0002\u0010¦\u0001\u001a\u0006\b°\u0002\u0010ª\u0001R2\u0010Í\u0002\u001a\u00020\u00062\u0007\u0010³\u0002\u001a\u00020\u00068\u0016@RX\u0097\u000e¢\u0006\u0018\n\u0006\b§\u0001\u0010½\u0001\u0012\u0006\bÌ\u0002\u0010¦\u0001\u001a\u0006\bË\u0002\u0010â\u0001R\u0018\u0010Î\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bO\u0010½\u0001R\"\u0010Ï\u0002\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u008f\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0001\u0010\u0090\u0002R\u0018\u0010Ð\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0018\u0010½\u0001R\u0019\u0010Ñ\u0002\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b÷\u0001\u0010Ù\u0001R\u0019\u0010Ò\u0002\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010Ù\u0001R\u0018\u0010Ó\u0002\u001a\u00030\u0095\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010\u0096\u0002Rk\u0010Ô\u0002\u001aV\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030R¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(U\u0012\u0013\u0012\u00110V¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(W\u0012\u0013\u0012\u00110X¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(Y\u0012\u0004\u0012\u00020\u00020Qj\u0002`Z0\u008f\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010\u0090\u0002R\u0019\u0010Õ\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010½\u0001R\u0019\u0010Ö\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÙ\u0001\u0010½\u0001R\u0019\u0010×\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bË\u0002\u0010½\u0001R\u0019\u0010Ø\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010½\u0001R\u001c\u0010\u007f\u001a\u0004\u0018\u00010\t*\u00020@8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÙ\u0002\u0010Ú\u0002R\u0017\u0010Ü\u0002\u001a\u00020\u001e8@X\u0080\u0004¢\u0006\b\u001a\u0006\bÛ\u0002\u0010ª\u0001R\u0017\u0010Þ\u0002\u001a\u00020\u001e8@X\u0080\u0004¢\u0006\b\u001a\u0006\bÝ\u0002\u0010ª\u0001R\u0018\u0010á\u0002\u001a\u00030ß\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bÁ\u0002\u0010à\u0002R\u001f\u0010ã\u0002\u001a\u00020\u001e8VX\u0097\u0004¢\u0006\u0010\u0012\u0006\bâ\u0002\u0010¦\u0001\u001a\u0006\b\u009b\u0002\u0010ª\u0001R\u001f\u0010å\u0002\u001a\u00020\u001e8VX\u0097\u0004¢\u0006\u0010\u0012\u0006\bä\u0002\u0010¦\u0001\u001a\u0006\bû\u0001\u0010ª\u0001R\u0018\u0010è\u0002\u001a\u00030æ\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bµ\u0001\u0010ç\u0002R\u0017\u0010ê\u0002\u001a\u00020\u00068@X\u0080\u0004¢\u0006\b\u001a\u0006\bé\u0002\u0010â\u0001R\u0019\u0010í\u0002\u001a\u0004\u0018\u00010f8@X\u0080\u0004¢\u0006\b\u001a\u0006\bë\u0002\u0010ì\u0002R\u0014\u0010ï\u0002\u001a\u00020\u001e8F¢\u0006\b\u001a\u0006\bî\u0002\u0010ª\u0001R\u0019\u0010ñ\u0002\u001a\u0005\u0018\u00010ù\u00018VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bO\u0010ð\u0002R\u0019\u0010ó\u0002\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0092\u0002\u0010ò\u0002\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006ö\u0002"}, d2 = {"Landroidx/compose/runtime/ComposerImpl;", "Landroidx/compose/runtime/p;", "Lkotlin/b2;", "g2", "K0", "d0", "", "key", "d2", "", "dataKey", "e2", "J0", "a2", MallPurchaseDetailDialogFragment.f89681y1, "Lu0/i;", "Landroidx/compose/runtime/v;", "Landroidx/compose/runtime/m2;", "Landroidx/compose/runtime/CompositionLocalMap;", "D0", "(Ljava/lang/Integer;)Lu0/i;", "parentScope", "currentProviders", "p2", androidx.exifinterface.media.a.f23244d5, "scope", "X1", "(Landroidx/compose/runtime/v;Lu0/i;)Ljava/lang/Object;", "L0", "C0", "", "isNode", "data", "f2", "objectKey", "c2", "Landroidx/compose/runtime/Pending;", "newPending", "M0", "expectedNodeCount", "inserting", "N0", "I0", "z1", UCropPlusActivity.ARG_INDEX, "h1", "newCount", "o2", "groupLocation", "recomposeGroup", "recomposeIndex", "n1", "r2", "count", "n2", "z0", "oldGroup", "newGroup", "commonRoot", "R1", "nearestCommonRoot", "H0", "recomposeKey", "B0", "Landroidx/compose/runtime/w1;", "c1", "b2", "v0", "Landroidx/compose/runtime/x0;", "content", "locals", "parameter", "force", "i1", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/z0;", "references", "d1", "R", "", "Lkotlin/Function3;", "Landroidx/compose/runtime/e;", "Lkotlin/m0;", "name", "applier", "Landroidx/compose/runtime/a2;", "slots", "Landroidx/compose/runtime/s1;", "rememberManager", "Landroidx/compose/runtime/Change;", "newChanges", "Lkotlin/Function0;", "block", "v2", "(Ljava/util/List;Lyh/a;)Ljava/lang/Object;", "reader", "w2", "(Landroidx/compose/runtime/w1;Lyh/a;)Ljava/lang/Object;", "Landroidx/compose/runtime/z;", "from", "to", "Landroidx/compose/runtime/RecomposeScopeImpl;", "Landroidx/compose/runtime/collection/c;", "invalidations", "x1", "(Landroidx/compose/runtime/z;Landroidx/compose/runtime/z;Ljava/lang/Integer;Ljava/util/List;Lyh/a;)Ljava/lang/Object;", "Landroidx/compose/runtime/collection/b;", "invalidationsRequested", "Landroidx/compose/runtime/h;", "G0", "(Landroidx/compose/runtime/collection/b;Lyh/p;)V", "m1", "s2", "t2", "change", "A1", "B1", "N1", "forParent", "O1", com.alipay.sdk.m.x.c.f39529d, "", "nodes", "r1", "([Ljava/lang/Object;)V", "q1", "node", "D1", "Q1", "t1", "Landroidx/compose/runtime/c;", "anchor", "H1", "G1", "I1", "S1", "C1", "groupBeingRemoved", "V1", "reference", "T1", "U1", "location", "K1", "M1", "E1", "F1", "O0", "y0", "nodeIndex", "L1", "J1", "s1", "groupKey", "j2", "keyHash", "k2", "l2", "m2", "c0", androidx.exifinterface.media.a.T4, "O", "X", "b0", "x0", "()V", "Q", "F0", "P0", "()Z", "J", RXScreenCaptureService.KEY_HEIGHT, "factory", "L", "d", "f", "i", androidx.exifinterface.media.a.R4, "Y", "x", androidx.exifinterface.media.a.X4, "value", "Lkotlin/Function2;", "Lkotlin/t;", "e", "(Ljava/lang/Object;Lyh/p;)V", com.google.android.exoplayer2.text.ttml.d.f49793l0, com.google.android.exoplayer2.text.ttml.d.f49796n0, "I", "l1", ak.aB, "", "B", "", androidx.exifinterface.media.a.W4, "", "v", ak.aG, "", RXScreenCaptureService.KEY_WIDTH, "", ak.aD, "", "C", "y", "invalid", "w0", "(ZLyh/a;)Ljava/lang/Object;", "q2", "i2", "effect", "g", "Landroidx/compose/runtime/k1;", "values", "t", "([Landroidx/compose/runtime/k1;)V", "Z", "K", "(Landroidx/compose/runtime/v;)Ljava/lang/Object;", "Landroidx/compose/runtime/r;", "q", "instance", "h2", "(Landroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)Z", "o1", "()I", androidx.exifinterface.media.a.S4, "l", "changed", ak.av, "F", "Landroidx/compose/runtime/u1;", "H", "P", ak.aF, "", "sourceInformation", "k", "m", "r", "A0", "p1", "(Lyh/a;)V", "w1", "(Landroidx/compose/runtime/collection/b;)Z", "u2", "U", "N", "Landroidx/compose/runtime/n1;", "p", "b", "Landroidx/compose/runtime/e;", "G", "()Landroidx/compose/runtime/e;", "Landroidx/compose/runtime/r;", "parentContext", "Landroidx/compose/runtime/x1;", "Landroidx/compose/runtime/x1;", "slotTable", "", "Landroidx/compose/runtime/t1;", "Ljava/util/Set;", "abandonSet", "Ljava/util/List;", "changes", "lateChanges", "Landroidx/compose/runtime/z;", "n", "()Landroidx/compose/runtime/z;", "composition", "Landroidx/compose/runtime/l2;", "Landroidx/compose/runtime/l2;", "pendingStack", "j", "Landroidx/compose/runtime/Pending;", "pending", "Landroidx/compose/runtime/n0;", "Landroidx/compose/runtime/n0;", "nodeIndexStack", "groupNodeCount", "groupNodeCountStack", "", "o", "[I", "nodeCountOverrides", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "nodeCountVirtualOverrides", "forceRecomposeScopes", "forciblyRecompose", "nodeExpected", "Landroidx/compose/runtime/q0;", "entersStack", "providerUpdates", "providersInvalid", "providersInvalidStack", "reusing", "reusingGroup", "childrenComposing", "Landroidx/compose/runtime/snapshots/f;", "Landroidx/compose/runtime/snapshots/f;", "snapshot", "D", "compositionToken", "invalidateStack", "<set-?>", "j1", "isComposing", "k1", "isDisposed", "Landroidx/compose/runtime/w1;", "Y0", "()Landroidx/compose/runtime/x1;", "Z1", "(Landroidx/compose/runtime/x1;)V", "insertTable", "Landroidx/compose/runtime/a2;", "writer", "writerHasAProvider", "M", "V0", "()Ljava/util/List;", "Y1", "(Ljava/util/List;)V", "deferredChanges", "Landroidx/compose/runtime/c;", "insertAnchor", "insertFixups", "getInserting$annotations", "a0", "getCompoundKeyHash$annotations", "compoundKeyHash", "pendingUps", "downNodes", "writersReaderDelta", "startedGroup", "implicitRootStart", "startedGroups", "insertUpFixups", "previousRemove", "previousMoveFrom", "previousMoveTo", "previousCount", "a1", "(Landroidx/compose/runtime/w1;)Ljava/lang/Object;", "Q0", "areChildrenComposing", "X0", "hasPendingChanges", "Lkotlin/coroutines/CoroutineContext;", "()Lkotlin/coroutines/CoroutineContext;", "applyCoroutineContext", "getDefaultsInvalid$annotations", "defaultsInvalid", "getSkipping$annotations", "skipping", "Landroidx/compose/runtime/tooling/b;", "()Landroidx/compose/runtime/tooling/b;", "compositionData", "R0", "changeCount", "T0", "()Landroidx/compose/runtime/RecomposeScopeImpl;", "currentRecomposeScope", "W0", "hasInvalidations", "()Landroidx/compose/runtime/n1;", "recomposeScope", "()Ljava/lang/Object;", "recomposeScopeIdentity", "<init>", "(Landroidx/compose/runtime/e;Landroidx/compose/runtime/r;Landroidx/compose/runtime/x1;Ljava/util/Set;Ljava/util/List;Ljava/util/List;Landroidx/compose/runtime/z;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class ComposerImpl implements p {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private int reusingGroup;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private int childrenComposing;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @dl.d
    private androidx.compose.runtime.snapshots.f snapshot;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private int compositionToken;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @dl.d
    private final l2<RecomposeScopeImpl> invalidateStack;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private boolean isComposing;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private boolean isDisposed;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @dl.d
    private SlotReader reader;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @dl.d
    private x1 insertTable;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @dl.d
    private SlotWriter writer;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private boolean writerHasAProvider;

    @dl.e
    private u0.i<v<Object>, ? extends m2<? extends Object>> L;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @dl.e
    private List<yh.q<e<?>, SlotWriter, s1, kotlin.b2>> deferredChanges;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @dl.d
    private androidx.compose.runtime.c insertAnchor;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @dl.d
    private final List<yh.q<e<?>, SlotWriter, s1, kotlin.b2>> insertFixups;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private boolean inserting;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private int compoundKeyHash;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private int pendingUps;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @dl.d
    private l2<Object> downNodes;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private int writersReaderDelta;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private boolean startedGroup;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private boolean implicitRootStart;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    @dl.d
    private final n0 startedGroups;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    @dl.d
    private final l2<yh.q<e<?>, SlotWriter, s1, kotlin.b2>> insertUpFixups;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private int previousRemove;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private int previousMoveFrom;

    /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private int previousMoveTo;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final e<?> applier;

    /* JADX INFO: renamed from: b0, reason: collision with root package name and from kotlin metadata */
    private int previousCount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final r parentContext;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final x1 slotTable;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Set<t1> abandonSet;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private List<yh.q<e<?>, SlotWriter, s1, kotlin.b2>> changes;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private List<yh.q<e<?>, SlotWriter, s1, kotlin.b2>> lateChanges;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final z composition;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final l2<Pending> pendingStack;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Pending pending;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int nodeIndex;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private n0 nodeIndexStack;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int groupNodeCount;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private n0 groupNodeCountStack;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private int[] nodeCountOverrides;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private HashMap<Integer, Integer> nodeCountVirtualOverrides;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean forceRecomposeScopes;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean forciblyRecompose;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean nodeExpected;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<q0> invalidations;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final n0 entersStack;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private u0.i<v<Object>, ? extends m2<? extends Object>> f12241v;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final HashMap<Integer, u0.i<v<Object>, m2<Object>>> providerUpdates;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private boolean providersInvalid;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final n0 providersInvalidStack;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private boolean reusing;

    /* JADX INFO: compiled from: Composer.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u000b\u001a\u00060\u0006R\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016R\u001b\u0010\u000b\u001a\u00060\u0006R\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/ComposerImpl$a;", "Landroidx/compose/runtime/t1;", "Lkotlin/b2;", "b", ak.aF, "d", "Landroidx/compose/runtime/ComposerImpl$b;", "Landroidx/compose/runtime/ComposerImpl;", "Landroidx/compose/runtime/ComposerImpl$b;", ak.av, "()Landroidx/compose/runtime/ComposerImpl$b;", "ref", "<init>", "(Landroidx/compose/runtime/ComposerImpl$b;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements t1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final b ref;

        public a(@dl.d b ref) {
            kotlin.jvm.internal.f0.p(ref, "ref");
            this.ref = ref;
        }

        @dl.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public final b getRef() {
            return this.ref;
        }

        @Override // androidx.compose.runtime.t1
        public void b() {
        }

        @Override // androidx.compose.runtime.t1
        public void c() {
            this.ref.t();
        }

        @Override // androidx.compose.runtime.t1
        public void d() {
            this.ref.t();
        }
    }

    /* JADX INFO: compiled from: Composer.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u00107\u001a\u000203\u0012\u0006\u0010<\u001a\u000208¢\u0006\u0004\bR\u0010SJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b\r\u0010\fJ*\u0010\u0011\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00020\u000e¢\u0006\u0002\b\u000fH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0013\u0010\fJ\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0010¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001d\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u001b0\u0018j\u0002`\u001cH\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ.\u0010\u001f\u001a\u00020\u00022&\u0010\u0015\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u001b0\u0018j\u0002`\u001cJ\u001d\u0010#\u001a\u00020\u00022\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0010¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0002H\u0010¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0002H\u0010¢\u0006\u0004\b'\u0010&J\u0017\u0010*\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(H\u0010¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(H\u0010¢\u0006\u0004\b,\u0010+J\u0019\u0010.\u001a\u0004\u0018\u00010-2\u0006\u0010)\u001a\u00020(H\u0010¢\u0006\u0004\b.\u0010/J\u001f\u00101\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(2\u0006\u00100\u001a\u00020-H\u0010¢\u0006\u0004\b1\u00102R\u001a\u00107\u001a\u0002038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b,\u00104\u001a\u0004\b5\u00106R\u001a\u0010<\u001a\u0002088\u0010X\u0090\u0004¢\u0006\f\n\u0004\b'\u00109\u001a\u0004\b:\u0010;R0\u0010A\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 \u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010$R\u001d\u0010D\u001a\b\u0012\u0004\u0012\u00020B0 8\u0006¢\u0006\f\n\u0004\b\u001d\u0010=\u001a\u0004\bC\u0010?Rk\u0010J\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u001b0\u0018j\u0002`\u001c2&\u0010E\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u001b0\u0018j\u0002`\u001c8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010F\u001a\u0004\bG\u0010\u001e\"\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u001a\u0010Q\u001a\u00020K8PX\u0090\u0004¢\u0006\f\u0012\u0004\bP\u0010&\u001a\u0004\bO\u0010M¨\u0006T"}, d2 = {"Landroidx/compose/runtime/ComposerImpl$b;", "Landroidx/compose/runtime/r;", "Lkotlin/b2;", "t", "Landroidx/compose/runtime/p;", "composer", "o", "(Landroidx/compose/runtime/p;)V", "r", "Landroidx/compose/runtime/z;", "composition", "p", "(Landroidx/compose/runtime/z;)V", ak.aB, "Lkotlin/Function0;", "Landroidx/compose/runtime/h;", "content", ak.av, "(Landroidx/compose/runtime/z;Lyh/p;)V", "j", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "k", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "Lu0/i;", "Landroidx/compose/runtime/v;", "", "Landroidx/compose/runtime/m2;", "Landroidx/compose/runtime/CompositionLocalMap;", "e", "()Lu0/i;", androidx.exifinterface.media.a.W4, "", "Landroidx/compose/runtime/tooling/b;", "table", "n", "(Ljava/util/Set;)V", "q", "()V", ak.aF, "Landroidx/compose/runtime/z0;", "reference", "i", "(Landroidx/compose/runtime/z0;)V", "b", "Landroidx/compose/runtime/y0;", "m", "(Landroidx/compose/runtime/z0;)Landroidx/compose/runtime/y0;", "data", "l", "(Landroidx/compose/runtime/z0;Landroidx/compose/runtime/y0;)V", "", "I", "f", "()I", "compoundHashKey", "", "Z", "d", "()Z", "collectingParameterInformation", "Ljava/util/Set;", RXScreenCaptureService.KEY_WIDTH, "()Ljava/util/Set;", ak.aD, "inspectionTables", "Landroidx/compose/runtime/ComposerImpl;", ak.aG, "composers", "<set-?>", "Landroidx/compose/runtime/a1;", "v", "y", "(Lu0/i;)V", "compositionLocalScope", "Lkotlin/coroutines/CoroutineContext;", "g", "()Lkotlin/coroutines/CoroutineContext;", "effectCoroutineContext", RXScreenCaptureService.KEY_HEIGHT, "getRecomposeCoroutineContext$runtime_release$annotations", "recomposeCoroutineContext", "<init>", "(Landroidx/compose/runtime/ComposerImpl;IZ)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
    public final class b extends r {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int compoundHashKey;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean collectingParameterInformation;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private Set<Set<androidx.compose.runtime.tooling.b>> inspectionTables;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final Set<ComposerImpl> composers = new LinkedHashSet();

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final a1 compositionLocalScope = h2.g(u0.a.C(), null, 2, null);

        public b(int i10, boolean z10) {
            this.compoundHashKey = i10;
            this.collectingParameterInformation = z10;
        }

        private final u0.i<v<Object>, m2<Object>> v() {
            return (u0.i) this.compositionLocalScope.getValue();
        }

        public static /* synthetic */ void x() {
        }

        private final void y(u0.i<v<Object>, ? extends m2<? extends Object>> iVar) {
            this.compositionLocalScope.setValue(iVar);
        }

        public final void A(@dl.d u0.i<v<Object>, ? extends m2<? extends Object>> scope) {
            kotlin.jvm.internal.f0.p(scope, "scope");
            y(scope);
        }

        @Override // androidx.compose.runtime.r
        @i(scheme = "[0[0]]")
        public void a(@dl.d z composition, @dl.d yh.p<? super p, ? super Integer, kotlin.b2> content) {
            kotlin.jvm.internal.f0.p(composition, "composition");
            kotlin.jvm.internal.f0.p(content, "content");
            ComposerImpl.this.parentContext.a(composition, content);
        }

        @Override // androidx.compose.runtime.r
        public void b(@dl.d z0 reference) {
            kotlin.jvm.internal.f0.p(reference, "reference");
            ComposerImpl.this.parentContext.b(reference);
        }

        @Override // androidx.compose.runtime.r
        public void c() {
            ComposerImpl.this.childrenComposing--;
        }

        @Override // androidx.compose.runtime.r
        /* JADX INFO: renamed from: d, reason: from getter */
        public boolean getCollectingParameterInformation() {
            return this.collectingParameterInformation;
        }

        @Override // androidx.compose.runtime.r
        @dl.d
        public u0.i<v<Object>, m2<Object>> e() {
            return v();
        }

        @Override // androidx.compose.runtime.r
        /* JADX INFO: renamed from: f, reason: from getter */
        public int getCompoundHashKey() {
            return this.compoundHashKey;
        }

        @Override // androidx.compose.runtime.r
        @dl.d
        /* JADX INFO: renamed from: g */
        public CoroutineContext getEffectCoroutineContext() {
            return ComposerImpl.this.parentContext.getEffectCoroutineContext();
        }

        @Override // androidx.compose.runtime.r
        @dl.d
        public CoroutineContext h() {
            return u.j(ComposerImpl.this.getComposition());
        }

        @Override // androidx.compose.runtime.r
        public void i(@dl.d z0 reference) {
            kotlin.jvm.internal.f0.p(reference, "reference");
            ComposerImpl.this.parentContext.i(reference);
        }

        @Override // androidx.compose.runtime.r
        public void j(@dl.d z composition) {
            kotlin.jvm.internal.f0.p(composition, "composition");
            ComposerImpl.this.parentContext.j(ComposerImpl.this.getComposition());
            ComposerImpl.this.parentContext.j(composition);
        }

        @Override // androidx.compose.runtime.r
        public void k(@dl.d RecomposeScopeImpl scope) {
            kotlin.jvm.internal.f0.p(scope, "scope");
            ComposerImpl.this.parentContext.k(scope);
        }

        @Override // androidx.compose.runtime.r
        public void l(@dl.d z0 reference, @dl.d y0 data) {
            kotlin.jvm.internal.f0.p(reference, "reference");
            kotlin.jvm.internal.f0.p(data, "data");
            ComposerImpl.this.parentContext.l(reference, data);
        }

        @Override // androidx.compose.runtime.r
        @dl.e
        public y0 m(@dl.d z0 reference) {
            kotlin.jvm.internal.f0.p(reference, "reference");
            return ComposerImpl.this.parentContext.m(reference);
        }

        @Override // androidx.compose.runtime.r
        public void n(@dl.d Set<androidx.compose.runtime.tooling.b> table) {
            kotlin.jvm.internal.f0.p(table, "table");
            Set hashSet = this.inspectionTables;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.inspectionTables = hashSet;
            }
            hashSet.add(table);
        }

        @Override // androidx.compose.runtime.r
        public void o(@dl.d p composer) {
            kotlin.jvm.internal.f0.p(composer, "composer");
            super.o((ComposerImpl) composer);
            this.composers.add(composer);
        }

        @Override // androidx.compose.runtime.r
        public void p(@dl.d z composition) {
            kotlin.jvm.internal.f0.p(composition, "composition");
            ComposerImpl.this.parentContext.p(composition);
        }

        @Override // androidx.compose.runtime.r
        public void q() {
            ComposerImpl.this.childrenComposing++;
        }

        @Override // androidx.compose.runtime.r
        public void r(@dl.d p composer) {
            kotlin.jvm.internal.f0.p(composer, "composer");
            Set<Set<androidx.compose.runtime.tooling.b>> set = this.inspectionTables;
            if (set != null) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(((ComposerImpl) composer).slotTable);
                }
            }
            kotlin.jvm.internal.w0.a(this.composers).remove(composer);
        }

        @Override // androidx.compose.runtime.r
        public void s(@dl.d z composition) {
            kotlin.jvm.internal.f0.p(composition, "composition");
            ComposerImpl.this.parentContext.s(composition);
        }

        public final void t() {
            if (!this.composers.isEmpty()) {
                Set<Set<androidx.compose.runtime.tooling.b>> set = this.inspectionTables;
                if (set != null) {
                    for (ComposerImpl composerImpl : this.composers) {
                        Iterator<Set<androidx.compose.runtime.tooling.b>> it = set.iterator();
                        while (it.hasNext()) {
                            it.next().remove(composerImpl.slotTable);
                        }
                    }
                }
                this.composers.clear();
            }
        }

        @dl.d
        public final Set<ComposerImpl> u() {
            return this.composers;
        }

        @dl.e
        public final Set<Set<androidx.compose.runtime.tooling.b>> w() {
            return this.inspectionTables;
        }

        public final void z(@dl.e Set<Set<androidx.compose.runtime.tooling.b>> set) {
            this.inspectionTables = set;
        }
    }

    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {androidx.exifinterface.media.a.f23244d5, "kotlin.jvm.PlatformType", ak.av, "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/g$a", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return kotlin.comparisons.g.l(Integer.valueOf(((q0) t10).getLocation()), Integer.valueOf(((q0) t11).getLocation()));
        }
    }

    public ComposerImpl(@dl.d e<?> applier, @dl.d r parentContext, @dl.d x1 slotTable, @dl.d Set<t1> abandonSet, @dl.d List<yh.q<e<?>, SlotWriter, s1, kotlin.b2>> changes, @dl.d List<yh.q<e<?>, SlotWriter, s1, kotlin.b2>> lateChanges, @dl.d z composition) {
        kotlin.jvm.internal.f0.p(applier, "applier");
        kotlin.jvm.internal.f0.p(parentContext, "parentContext");
        kotlin.jvm.internal.f0.p(slotTable, "slotTable");
        kotlin.jvm.internal.f0.p(abandonSet, "abandonSet");
        kotlin.jvm.internal.f0.p(changes, "changes");
        kotlin.jvm.internal.f0.p(lateChanges, "lateChanges");
        kotlin.jvm.internal.f0.p(composition, "composition");
        this.applier = applier;
        this.parentContext = parentContext;
        this.slotTable = slotTable;
        this.abandonSet = abandonSet;
        this.changes = changes;
        this.lateChanges = lateChanges;
        this.composition = composition;
        this.pendingStack = new l2<>();
        this.nodeIndexStack = new n0();
        this.groupNodeCountStack = new n0();
        this.invalidations = new ArrayList();
        this.entersStack = new n0();
        this.f12241v = u0.a.C();
        this.providerUpdates = new HashMap<>();
        this.providersInvalidStack = new n0();
        this.reusingGroup = -1;
        this.snapshot = SnapshotKt.C();
        this.invalidateStack = new l2<>();
        SlotReader slotReaderU = slotTable.U();
        slotReaderU.e();
        this.reader = slotReaderU;
        x1 x1Var = new x1();
        this.insertTable = x1Var;
        SlotWriter slotWriterV = x1Var.V();
        slotWriterV.I();
        this.writer = slotWriterV;
        SlotReader slotReaderU2 = this.insertTable.U();
        try {
            androidx.compose.runtime.c cVarA = slotReaderU2.a(0);
            slotReaderU2.e();
            this.insertAnchor = cVarA;
            this.insertFixups = new ArrayList();
            this.downNodes = new l2<>();
            this.implicitRootStart = true;
            this.startedGroups = new n0();
            this.insertUpFixups = new l2<>();
            this.previousRemove = -1;
            this.previousMoveFrom = -1;
            this.previousMoveTo = -1;
        } catch (Throwable th2) {
            slotReaderU2.e();
            throw th2;
        }
    }

    private final void A1(yh.q<? super e<?>, ? super SlotWriter, ? super s1, kotlin.b2> qVar) {
        this.changes.add(qVar);
    }

    private final int B0(int group, int recomposeGroup, int recomposeKey) {
        if (group == recomposeGroup) {
            return recomposeKey;
        }
        int iC1 = c1(this.reader, group);
        return iC1 == 126665345 ? iC1 : Integer.rotateLeft(B0(this.reader.V(group), recomposeGroup, recomposeKey), 3) ^ iC1;
    }

    private final void B1(yh.q<? super e<?>, ? super SlotWriter, ? super s1, kotlin.b2> qVar) {
        v1();
        q1();
        A1(qVar);
    }

    private final void C0() {
        ComposerKt.q0(this.writer.getClosed());
        x1 x1Var = new x1();
        this.insertTable = x1Var;
        SlotWriter slotWriterV = x1Var.V();
        slotWriterV.I();
        this.writer = slotWriterV;
    }

    private final void C1() {
        V1(this.reader.getCurrent());
        N1(ComposerKt.f12321b);
        this.writersReaderDelta += this.reader.t();
    }

    private final u0.i<v<Object>, m2<Object>> D0(Integer group) {
        u0.i iVar;
        if (group == null && (iVar = this.L) != null) {
            return iVar;
        }
        if (getInserting() && this.writerHasAProvider) {
            int parent = this.writer.getParent();
            while (parent > 0) {
                if (this.writer.g0(parent) == 202 && kotlin.jvm.internal.f0.g(this.writer.h0(parent), ComposerKt.I())) {
                    Object objE0 = this.writer.e0(parent);
                    kotlin.jvm.internal.f0.n(objE0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                    u0.i<v<Object>, m2<Object>> iVar2 = (u0.i) objE0;
                    this.L = iVar2;
                    return iVar2;
                }
                parent = this.writer.J0(parent);
            }
        }
        if (this.reader.getGroupsSize() > 0) {
            int iIntValue = group != null ? group.intValue() : this.reader.getParent();
            while (iIntValue > 0) {
                if (this.reader.H(iIntValue) == 202 && kotlin.jvm.internal.f0.g(this.reader.J(iIntValue), ComposerKt.I())) {
                    u0.i<v<Object>, m2<Object>> iVar3 = this.providerUpdates.get(Integer.valueOf(iIntValue));
                    if (iVar3 == null) {
                        Object objD = this.reader.D(iIntValue);
                        kotlin.jvm.internal.f0.n(objD, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                        iVar3 = (u0.i) objD;
                    }
                    this.L = iVar3;
                    return iVar3;
                }
                iIntValue = this.reader.V(iIntValue);
            }
        }
        u0.i iVar4 = this.f12241v;
        this.L = iVar4;
        return iVar4;
    }

    private final void D1(Object obj) {
        this.downNodes.h(obj);
    }

    static /* synthetic */ u0.i E0(ComposerImpl composerImpl, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        return composerImpl.D0(num);
    }

    private final void E1() {
        int parent = this.reader.getParent();
        if (!(this.startedGroups.h(-1) <= parent)) {
            ComposerKt.A("Missed recording an endGroup".toString());
            throw new KotlinNothingValueException();
        }
        if (this.startedGroups.h(-1) == parent) {
            this.startedGroups.i();
            P1(this, false, ComposerKt.f12323d, 1, null);
        }
    }

    private final void F1() {
        if (this.startedGroup) {
            P1(this, false, ComposerKt.f12323d, 1, null);
            this.startedGroup = false;
        }
    }

    private final void G0(androidx.compose.runtime.collection.b<RecomposeScopeImpl, androidx.compose.runtime.collection.c<Object>> invalidationsRequested, final yh.p<? super p, ? super Integer, kotlin.b2> content) {
        if (!(!this.isComposing)) {
            ComposerKt.A("Reentrant composition is not supported".toString());
            throw new KotlinNothingValueException();
        }
        Object objA = r2.f13058a.a("Compose:recompose");
        try {
            androidx.compose.runtime.snapshots.f fVarC = SnapshotKt.C();
            this.snapshot = fVarC;
            this.compositionToken = fVarC.getId();
            this.providerUpdates.clear();
            int size = invalidationsRequested.getSize();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = invalidationsRequested.getKeys()[i10];
                kotlin.jvm.internal.f0.n(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                androidx.compose.runtime.collection.c cVar = (androidx.compose.runtime.collection.c) invalidationsRequested.getValues()[i10];
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                androidx.compose.runtime.c anchor = recomposeScopeImpl.getAnchor();
                if (anchor == null) {
                    r2.f13058a.b(objA);
                    return;
                }
                this.invalidations.add(new q0(recomposeScopeImpl, anchor.getLocation(), cVar));
            }
            List<q0> list = this.invalidations;
            if (list.size() > 1) {
                kotlin.collections.w.m0(list, new c());
            }
            this.nodeIndex = 0;
            this.isComposing = true;
            try {
                g2();
                final Object objL1 = l1();
                if (objL1 != content && content != null) {
                    q2(content);
                }
                e2.m(new yh.l<m2<?>, kotlin.b2>() { // from class: androidx.compose.runtime.ComposerImpl$doCompose$2$3
                    {
                        super(1);
                    }

                    public final void a(@dl.d m2<?> it) {
                        kotlin.jvm.internal.f0.p(it, "it");
                        this.f12268b.childrenComposing++;
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(m2<?> m2Var) {
                        a(m2Var);
                        return kotlin.b2.f124493a;
                    }
                }, new yh.l<m2<?>, kotlin.b2>() { // from class: androidx.compose.runtime.ComposerImpl$doCompose$2$4
                    {
                        super(1);
                    }

                    public final void a(@dl.d m2<?> it) {
                        kotlin.jvm.internal.f0.p(it, "it");
                        this.f12269b.childrenComposing--;
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(m2<?> m2Var) {
                        a(m2Var);
                        return kotlin.b2.f124493a;
                    }
                }, new yh.a<kotlin.b2>() { // from class: androidx.compose.runtime.ComposerImpl$doCompose$2$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
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
                        Object obj2;
                        if (content != null) {
                            this.e2(200, ComposerKt.M());
                            b.c(this, content);
                            this.J0();
                        } else {
                            if (!this.forciblyRecompose || (obj2 = objL1) == null || kotlin.jvm.internal.f0.g(obj2, p.INSTANCE.a())) {
                                this.E();
                                return;
                            }
                            this.e2(200, ComposerKt.M());
                            ComposerImpl composerImpl = this;
                            Object obj3 = objL1;
                            kotlin.jvm.internal.f0.n(obj3, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
                            b.c(composerImpl, (yh.p) kotlin.jvm.internal.w0.q(obj3, 2));
                            this.J0();
                        }
                    }
                });
                K0();
                this.isComposing = false;
                this.invalidations.clear();
                kotlin.b2 b2Var = kotlin.b2.f124493a;
                r2.f13058a.b(objA);
            } catch (Throwable th2) {
                this.isComposing = false;
                this.invalidations.clear();
                d0();
                throw th2;
            }
        } catch (Throwable th3) {
            r2.f13058a.b(objA);
            throw th3;
        }
    }

    private final void G1(yh.q<? super e<?>, ? super SlotWriter, ? super s1, kotlin.b2> qVar) {
        this.insertFixups.add(qVar);
    }

    private final void H0(int i10, int i11) {
        if (i10 <= 0 || i10 == i11) {
            return;
        }
        H0(this.reader.V(i10), i11);
        if (this.reader.P(i10)) {
            D1(m1(this.reader, i10));
        }
    }

    private final void H1(final androidx.compose.runtime.c cVar) {
        if (this.insertFixups.isEmpty()) {
            final x1 x1Var = this.insertTable;
            N1(new yh.q<e<?>, SlotWriter, s1, kotlin.b2>() { // from class: androidx.compose.runtime.ComposerImpl$recordInsert$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                public final void a(@dl.d e<?> eVar, @dl.d SlotWriter slots, @dl.d s1 s1Var) {
                    kotlin.jvm.internal.f0.p(eVar, "<anonymous parameter 0>");
                    kotlin.jvm.internal.f0.p(slots, "slots");
                    kotlin.jvm.internal.f0.p(s1Var, "<anonymous parameter 2>");
                    slots.G();
                    x1 x1Var2 = x1Var;
                    slots.z0(x1Var2, cVar.d(x1Var2));
                    slots.S();
                }

                @Override // yh.q
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(e<?> eVar, SlotWriter slotWriter, s1 s1Var) {
                    a(eVar, slotWriter, s1Var);
                    return kotlin.b2.f124493a;
                }
            });
            return;
        }
        final List listT5 = CollectionsKt___CollectionsKt.T5(this.insertFixups);
        this.insertFixups.clear();
        v1();
        q1();
        final x1 x1Var2 = this.insertTable;
        N1(new yh.q<e<?>, SlotWriter, s1, kotlin.b2>() { // from class: androidx.compose.runtime.ComposerImpl$recordInsert$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public final void a(@dl.d e<?> applier, @dl.d SlotWriter slots, @dl.d s1 rememberManager) {
                kotlin.jvm.internal.f0.p(applier, "applier");
                kotlin.jvm.internal.f0.p(slots, "slots");
                kotlin.jvm.internal.f0.p(rememberManager, "rememberManager");
                x1 x1Var3 = x1Var2;
                List<yh.q<e<?>, SlotWriter, s1, kotlin.b2>> list = listT5;
                SlotWriter slotWriterV = x1Var3.V();
                try {
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        list.get(i10).invoke(applier, slotWriterV, rememberManager);
                    }
                    kotlin.b2 b2Var = kotlin.b2.f124493a;
                    slotWriterV.I();
                    slots.G();
                    x1 x1Var4 = x1Var2;
                    slots.z0(x1Var4, cVar.d(x1Var4));
                    slots.S();
                } catch (Throwable th2) {
                    slotWriterV.I();
                    throw th2;
                }
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(e<?> eVar, SlotWriter slotWriter, s1 s1Var) {
                a(eVar, slotWriter, s1Var);
                return kotlin.b2.f124493a;
            }
        });
    }

    private final void I0(boolean z10) {
        if (getInserting()) {
            int parent = this.writer.getParent();
            l2(this.writer.g0(parent), this.writer.h0(parent), this.writer.e0(parent));
        } else {
            int parent2 = this.reader.getParent();
            l2(this.reader.H(parent2), this.reader.J(parent2), this.reader.D(parent2));
        }
        int i10 = this.groupNodeCount;
        Pending pending = this.pending;
        int i11 = 0;
        if (pending != null && pending.b().size() > 0) {
            List<s0> listB = pending.b();
            List<s0> listF = pending.f();
            Set setN = androidx.compose.runtime.snapshots.a.n(listF);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = listF.size();
            int size2 = listB.size();
            int i12 = 0;
            int i13 = 0;
            int iO = 0;
            while (i12 < size2) {
                s0 s0Var = listB.get(i12);
                if (setN.contains(s0Var)) {
                    if (!linkedHashSet.contains(s0Var)) {
                        if (i13 < size) {
                            s0 s0Var2 = listF.get(i13);
                            if (s0Var2 != s0Var) {
                                int iG = pending.g(s0Var2);
                                linkedHashSet.add(s0Var2);
                                if (iG != iO) {
                                    int iO2 = pending.o(s0Var2);
                                    J1(pending.getIo.flutter.plugin.editing.SpellCheckPlugin.START_INDEX_KEY java.lang.String() + iG, iO + pending.getIo.flutter.plugin.editing.SpellCheckPlugin.START_INDEX_KEY java.lang.String(), iO2);
                                    pending.j(iG, iO, iO2);
                                }
                            } else {
                                i12++;
                            }
                            i13++;
                            iO += pending.o(s0Var2);
                            listF = listF;
                        }
                    }
                    i11 = 0;
                } else {
                    L1(pending.g(s0Var) + pending.getIo.flutter.plugin.editing.SpellCheckPlugin.START_INDEX_KEY java.lang.String(), s0Var.getNodes());
                    pending.n(s0Var.getLocation(), i11);
                    K1(s0Var.getLocation());
                    this.reader.X(s0Var.getLocation());
                    C1();
                    this.reader.Z();
                    ComposerKt.p0(this.invalidations, s0Var.getLocation(), s0Var.getLocation() + this.reader.K(s0Var.getLocation()));
                }
                i12++;
                i11 = 0;
            }
            s1();
            if (listB.size() > 0) {
                K1(this.reader.p());
                this.reader.a0();
            }
        }
        int i14 = this.nodeIndex;
        while (!this.reader.N()) {
            int current = this.reader.getCurrent();
            C1();
            L1(i14, this.reader.Z());
            ComposerKt.p0(this.invalidations, current, this.reader.getCurrent());
        }
        boolean inserting = getInserting();
        if (inserting) {
            if (z10) {
                S1();
                i10 = 1;
            }
            this.reader.g();
            int parent3 = this.writer.getParent();
            this.writer.R();
            if (!this.reader.w()) {
                int iH1 = h1(parent3);
                this.writer.S();
                this.writer.I();
                H1(this.insertAnchor);
                this.inserting = false;
                if (!this.slotTable.isEmpty()) {
                    n2(iH1, 0);
                    o2(iH1, i10);
                }
            }
        } else {
            if (z10) {
                Q1();
            }
            E1();
            int parent4 = this.reader.getParent();
            if (i10 != r2(parent4)) {
                o2(parent4, i10);
            }
            if (z10) {
                i10 = 1;
            }
            this.reader.h();
            s1();
        }
        N0(i10, inserting);
    }

    private final void I1(yh.q<? super e<?>, ? super SlotWriter, ? super s1, kotlin.b2> qVar) {
        this.insertUpFixups.h(qVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J0() {
        I0(false);
    }

    private final void J1(int i10, int i11, int i12) {
        if (i12 > 0) {
            int i13 = this.previousCount;
            if (i13 > 0 && this.previousMoveFrom == i10 - i13 && this.previousMoveTo == i11 - i13) {
                this.previousCount = i13 + i12;
                return;
            }
            s1();
            this.previousMoveFrom = i10;
            this.previousMoveTo = i11;
            this.previousCount = i12;
        }
    }

    private final void K0() {
        J0();
        this.parentContext.c();
        J0();
        F1();
        O0();
        this.reader.e();
        this.forciblyRecompose = false;
    }

    private final void K1(int i10) {
        this.writersReaderDelta = i10 - (this.reader.getCurrent() - this.writersReaderDelta);
    }

    private final void L0() {
        if (this.writer.getClosed()) {
            SlotWriter slotWriterV = this.insertTable.V();
            this.writer = slotWriterV;
            slotWriterV.b1();
            this.writerHasAProvider = false;
            this.L = null;
        }
    }

    private final void L1(int i10, int i11) {
        if (i11 > 0) {
            if (!(i10 >= 0)) {
                ComposerKt.A(("Invalid remove index " + i10).toString());
                throw new KotlinNothingValueException();
            }
            if (this.previousRemove == i10) {
                this.previousCount += i11;
                return;
            }
            s1();
            this.previousRemove = i10;
            this.previousCount = i11;
        }
    }

    private final void M0(boolean z10, Pending pending) {
        this.pendingStack.h(this.pending);
        this.pending = pending;
        this.nodeIndexStack.j(this.nodeIndex);
        if (z10) {
            this.nodeIndex = 0;
        }
        this.groupNodeCountStack.j(this.groupNodeCount);
        this.groupNodeCount = 0;
    }

    private final void M1() {
        SlotReader slotReader;
        int parent;
        if (this.reader.getGroupsSize() <= 0 || this.startedGroups.h(-2) == (parent = (slotReader = this.reader).getParent())) {
            return;
        }
        if (!this.startedGroup && this.implicitRootStart) {
            P1(this, false, ComposerKt.f12324e, 1, null);
            this.startedGroup = true;
        }
        if (parent > 0) {
            final androidx.compose.runtime.c cVarA = slotReader.a(parent);
            this.startedGroups.j(parent);
            P1(this, false, new yh.q<e<?>, SlotWriter, s1, kotlin.b2>() { // from class: androidx.compose.runtime.ComposerImpl$recordSlotEditing$1
                {
                    super(3);
                }

                public final void a(@dl.d e<?> eVar, @dl.d SlotWriter slots, @dl.d s1 s1Var) {
                    kotlin.jvm.internal.f0.p(eVar, "<anonymous parameter 0>");
                    kotlin.jvm.internal.f0.p(slots, "slots");
                    kotlin.jvm.internal.f0.p(s1Var, "<anonymous parameter 2>");
                    slots.U(cVarA);
                }

                @Override // yh.q
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(e<?> eVar, SlotWriter slotWriter, s1 s1Var) {
                    a(eVar, slotWriter, s1Var);
                    return kotlin.b2.f124493a;
                }
            }, 1, null);
        }
    }

    private final void N0(int i10, boolean z10) {
        Pending pendingG = this.pendingStack.g();
        if (pendingG != null && !z10) {
            pendingG.l(pendingG.getGroupIndex() + 1);
        }
        this.pending = pendingG;
        this.nodeIndex = this.nodeIndexStack.i() + i10;
        this.groupNodeCount = this.groupNodeCountStack.i() + i10;
    }

    private final void N1(yh.q<? super e<?>, ? super SlotWriter, ? super s1, kotlin.b2> qVar) {
        u1(this, false, 1, null);
        M1();
        A1(qVar);
    }

    private final void O0() {
        v1();
        if (!this.pendingStack.c()) {
            ComposerKt.A("Start/end imbalance".toString());
            throw new KotlinNothingValueException();
        }
        if (this.startedGroups.d()) {
            y0();
        } else {
            ComposerKt.A("Missed recording an endGroup()".toString());
            throw new KotlinNothingValueException();
        }
    }

    private final void O1(boolean z10, yh.q<? super e<?>, ? super SlotWriter, ? super s1, kotlin.b2> qVar) {
        t1(z10);
        A1(qVar);
    }

    static /* synthetic */ void P1(ComposerImpl composerImpl, boolean z10, yh.q qVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        composerImpl.O1(z10, qVar);
    }

    private final void Q1() {
        if (this.downNodes.d()) {
            this.downNodes.g();
        } else {
            this.pendingUps++;
        }
    }

    private final void R1(int i10, int i11, int i12) {
        SlotReader slotReader = this.reader;
        int iJ0 = ComposerKt.j0(slotReader, i10, i11, i12);
        while (i10 > 0 && i10 != iJ0) {
            if (slotReader.P(i10)) {
                Q1();
            }
            i10 = slotReader.V(i10);
        }
        H0(i11, iJ0);
    }

    @o0
    public static /* synthetic */ void S0() {
    }

    private final void S1() {
        this.insertFixups.add(this.insertUpFixups.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T1(z0 z0Var, SlotWriter slotWriter) {
        x1 x1Var = new x1();
        SlotWriter slotWriterV = x1Var.V();
        try {
            slotWriterV.G();
            slotWriterV.j1(MovableContentKt.f12387a, z0Var.c());
            SlotWriter.x0(slotWriterV, 0, 1, null);
            slotWriterV.n1(z0Var.getParameter());
            slotWriter.E0(z0Var.getAnchor(), 1, slotWriterV);
            slotWriterV.a1();
            slotWriterV.R();
            slotWriterV.S();
            kotlin.b2 b2Var = kotlin.b2.f124493a;
            slotWriterV.I();
            this.parentContext.l(z0Var, new y0(x1Var));
        } catch (Throwable th2) {
            slotWriterV.I();
            throw th2;
        }
    }

    @m
    public static /* synthetic */ void U0() {
    }

    private final void U1() {
        if (this.slotTable.u()) {
            ArrayList arrayList = new ArrayList();
            this.deferredChanges = arrayList;
            SlotReader slotReaderU = this.slotTable.U();
            try {
                this.reader = slotReaderU;
                List list = this.changes;
                try {
                    this.changes = arrayList;
                    V1(0);
                    v1();
                    if (this.startedGroup) {
                        A1(ComposerKt.f12322c);
                        F1();
                    }
                    kotlin.b2 b2Var = kotlin.b2.f124493a;
                    this.changes = list;
                    slotReaderU.e();
                } catch (Throwable th2) {
                    this.changes = list;
                    throw th2;
                }
            } catch (Throwable th3) {
                slotReaderU.e();
                throw th3;
            }
        }
    }

    private final void V1(int i10) {
        W1(this, i10, false, 0);
        s1();
    }

    private static final int W1(final ComposerImpl composerImpl, int i10, boolean z10, int i11) {
        if (!composerImpl.reader.L(i10)) {
            if (!composerImpl.reader.f(i10)) {
                return composerImpl.reader.T(i10);
            }
            int iK = composerImpl.reader.K(i10) + i10;
            int iK2 = i10 + 1;
            int iW1 = 0;
            while (iK2 < iK) {
                boolean zP = composerImpl.reader.P(iK2);
                if (zP) {
                    composerImpl.s1();
                    composerImpl.D1(composerImpl.reader.R(iK2));
                }
                iW1 += W1(composerImpl, iK2, zP || z10, zP ? 0 : i11 + iW1);
                if (zP) {
                    composerImpl.s1();
                    composerImpl.Q1();
                }
                iK2 += composerImpl.reader.K(iK2);
            }
            return iW1;
        }
        int iH = composerImpl.reader.H(i10);
        Object objJ = composerImpl.reader.J(i10);
        if (iH != 126665345 || !(objJ instanceof x0)) {
            if (iH != 206 || !kotlin.jvm.internal.f0.g(objJ, ComposerKt.a0())) {
                return composerImpl.reader.T(i10);
            }
            Object objG = composerImpl.reader.G(i10, 0);
            a aVar = objG instanceof a ? (a) objG : null;
            if (aVar != null) {
                Iterator<T> it = aVar.getRef().u().iterator();
                while (it.hasNext()) {
                    ((ComposerImpl) it.next()).U1();
                }
            }
            return composerImpl.reader.T(i10);
        }
        x0 x0Var = (x0) objJ;
        Object objG2 = composerImpl.reader.G(i10, 0);
        androidx.compose.runtime.c cVarA = composerImpl.reader.a(i10);
        List listE = ComposerKt.E(composerImpl.invalidations, i10, composerImpl.reader.K(i10) + i10);
        ArrayList arrayList = new ArrayList(listE.size());
        int size = listE.size();
        for (int i12 = 0; i12 < size; i12++) {
            q0 q0Var = (q0) listE.get(i12);
            arrayList.add(kotlin.c1.a(q0Var.getScope(), q0Var.a()));
        }
        final z0 z0Var = new z0(x0Var, objG2, composerImpl.getComposition(), composerImpl.slotTable, cVarA, arrayList, composerImpl.D0(Integer.valueOf(i10)));
        composerImpl.parentContext.b(z0Var);
        composerImpl.M1();
        composerImpl.A1(new yh.q<e<?>, SlotWriter, s1, kotlin.b2>() { // from class: androidx.compose.runtime.ComposerImpl$reportFreeMovableContent$reportGroup$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public final void a(@dl.d e<?> eVar, @dl.d SlotWriter slots, @dl.d s1 s1Var) {
                kotlin.jvm.internal.f0.p(eVar, "<anonymous parameter 0>");
                kotlin.jvm.internal.f0.p(slots, "slots");
                kotlin.jvm.internal.f0.p(s1Var, "<anonymous parameter 2>");
                this.f12311b.T1(z0Var, slots);
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(e<?> eVar, SlotWriter slotWriter, s1 s1Var) {
                a(eVar, slotWriter, s1Var);
                return kotlin.b2.f124493a;
            }
        });
        if (!z10) {
            return composerImpl.reader.T(i10);
        }
        composerImpl.s1();
        composerImpl.v1();
        composerImpl.q1();
        int iT = composerImpl.reader.P(i10) ? 1 : composerImpl.reader.T(i10);
        if (iT <= 0) {
            return 0;
        }
        composerImpl.L1(i11, iT);
        return 0;
    }

    private final <T> T X1(v<T> key, u0.i<v<Object>, ? extends m2<? extends Object>> scope) {
        return ComposerKt.C(scope, key) ? (T) ComposerKt.e0(scope, key) : key.c().getValue();
    }

    @m
    public static /* synthetic */ void Z0() {
    }

    private final Object a1(SlotReader slotReader) {
        return slotReader.R(slotReader.getParent());
    }

    private final void a2() {
        this.groupNodeCount += this.reader.Z();
    }

    @m
    public static /* synthetic */ void b1() {
    }

    private final void b2() {
        this.groupNodeCount = this.reader.z();
        this.reader.a0();
    }

    private final int c1(SlotReader slotReader, int i10) {
        Object objD;
        if (slotReader.M(i10)) {
            Object objJ = slotReader.J(i10);
            if (objJ == null) {
                return 0;
            }
            if (objJ instanceof Enum) {
                return ((Enum) objJ).ordinal();
            }
            return objJ instanceof x0 ? MovableContentKt.f12387a : objJ.hashCode();
        }
        int iH = slotReader.H(i10);
        if (iH == 207 && (objD = slotReader.D(i10)) != null && !kotlin.jvm.internal.f0.g(objD, p.INSTANCE.a())) {
            iH = objD.hashCode();
        }
        return iH;
    }

    private final void c2(int i10, Object obj, boolean z10, Object obj2) {
        t2();
        j2(i10, obj, obj2);
        Pending pending = null;
        if (getInserting()) {
            this.reader.d();
            int currentGroup = this.writer.getCurrentGroup();
            if (z10) {
                this.writer.l1(p.INSTANCE.a());
            } else if (obj2 != null) {
                SlotWriter slotWriter = this.writer;
                if (obj == null) {
                    obj = p.INSTANCE.a();
                }
                slotWriter.g1(i10, obj, obj2);
            } else {
                SlotWriter slotWriter2 = this.writer;
                if (obj == null) {
                    obj = p.INSTANCE.a();
                }
                slotWriter2.j1(i10, obj);
            }
            Pending pending2 = this.pending;
            if (pending2 != null) {
                s0 s0Var = new s0(i10, -1, h1(currentGroup), -1, 0);
                pending2.i(s0Var, this.nodeIndex - pending2.getIo.flutter.plugin.editing.SpellCheckPlugin.START_INDEX_KEY java.lang.String());
                pending2.h(s0Var);
            }
            M0(z10, null);
            return;
        }
        if (this.pending == null) {
            if (this.reader.q() == i10 && kotlin.jvm.internal.f0.g(obj, this.reader.s())) {
                f2(z10, obj2);
            } else {
                this.pending = new Pending(this.reader.i(), this.nodeIndex);
            }
        }
        Pending pending3 = this.pending;
        if (pending3 != null) {
            s0 s0VarD = pending3.d(i10, obj);
            if (s0VarD != null) {
                pending3.h(s0VarD);
                int location = s0VarD.getLocation();
                this.nodeIndex = pending3.g(s0VarD) + pending3.getIo.flutter.plugin.editing.SpellCheckPlugin.START_INDEX_KEY java.lang.String();
                int iM = pending3.m(s0VarD);
                final int groupIndex = iM - pending3.getGroupIndex();
                pending3.k(iM, pending3.getGroupIndex());
                K1(location);
                this.reader.X(location);
                if (groupIndex > 0) {
                    N1(new yh.q<e<?>, SlotWriter, s1, kotlin.b2>() { // from class: androidx.compose.runtime.ComposerImpl$start$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        public final void a(@dl.d e<?> eVar, @dl.d SlotWriter slots, @dl.d s1 s1Var) {
                            kotlin.jvm.internal.f0.p(eVar, "<anonymous parameter 0>");
                            kotlin.jvm.internal.f0.p(slots, "slots");
                            kotlin.jvm.internal.f0.p(s1Var, "<anonymous parameter 2>");
                            slots.A0(groupIndex);
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(e<?> eVar, SlotWriter slotWriter3, s1 s1Var) {
                            a(eVar, slotWriter3, s1Var);
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                f2(z10, obj2);
            } else {
                this.reader.d();
                this.inserting = true;
                this.L = null;
                L0();
                this.writer.G();
                int currentGroup2 = this.writer.getCurrentGroup();
                if (z10) {
                    this.writer.l1(p.INSTANCE.a());
                } else if (obj2 != null) {
                    SlotWriter slotWriter3 = this.writer;
                    if (obj == null) {
                        obj = p.INSTANCE.a();
                    }
                    slotWriter3.g1(i10, obj, obj2);
                } else {
                    SlotWriter slotWriter4 = this.writer;
                    if (obj == null) {
                        obj = p.INSTANCE.a();
                    }
                    slotWriter4.j1(i10, obj);
                }
                this.insertAnchor = this.writer.B(currentGroup2);
                s0 s0Var2 = new s0(i10, -1, h1(currentGroup2), -1, 0);
                pending3.i(s0Var2, this.nodeIndex - pending3.getIo.flutter.plugin.editing.SpellCheckPlugin.START_INDEX_KEY java.lang.String());
                pending3.h(s0Var2);
                pending = new Pending(new ArrayList(), z10 ? 0 : this.nodeIndex);
            }
        }
        M0(z10, pending);
    }

    private final void d0() {
        y0();
        this.pendingStack.a();
        this.nodeIndexStack.a();
        this.groupNodeCountStack.a();
        this.entersStack.a();
        this.providersInvalidStack.a();
        this.providerUpdates.clear();
        if (!this.reader.getClosed()) {
            this.reader.e();
        }
        if (!this.writer.getClosed()) {
            this.writer.I();
        }
        C0();
        this.compoundKeyHash = 0;
        this.childrenComposing = 0;
        this.nodeExpected = false;
        this.inserting = false;
        this.reusing = false;
        this.isComposing = false;
        this.forciblyRecompose = false;
    }

    private final void d1(List<Pair<z0, z0>> list) {
        x1 slotTable;
        androidx.compose.runtime.c anchor;
        List list2;
        x1 slotTable2;
        List<yh.q<e<?>, SlotWriter, s1, kotlin.b2>> list3 = this.lateChanges;
        List list4 = this.changes;
        try {
            this.changes = list3;
            A1(ComposerKt.f12325f);
            int size = list.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                Pair<z0, z0> pair = list.get(i11);
                final z0 z0VarA = pair.a();
                final z0 z0VarB = pair.b();
                final androidx.compose.runtime.c anchor2 = z0VarA.getAnchor();
                int iJ = z0VarA.getSlotTable().j(anchor2);
                final Ref.IntRef intRef = new Ref.IntRef();
                v1();
                A1(new yh.q<e<?>, SlotWriter, s1, kotlin.b2>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    public final void a(@dl.d e<?> applier, @dl.d SlotWriter slots, @dl.d s1 s1Var) {
                        kotlin.jvm.internal.f0.p(applier, "applier");
                        kotlin.jvm.internal.f0.p(slots, "slots");
                        kotlin.jvm.internal.f0.p(s1Var, "<anonymous parameter 2>");
                        intRef.f124889b = ComposerImpl.f1(slots, anchor2, applier);
                    }

                    @Override // yh.q
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(e<?> eVar, SlotWriter slotWriter, s1 s1Var) {
                        a(eVar, slotWriter, s1Var);
                        return kotlin.b2.f124493a;
                    }
                });
                if (z0VarB == null) {
                    if (kotlin.jvm.internal.f0.g(z0VarA.getSlotTable(), this.insertTable)) {
                        C0();
                    }
                    final SlotReader slotReaderU = z0VarA.getSlotTable().U();
                    try {
                        slotReaderU.X(iJ);
                        this.writersReaderDelta = iJ;
                        final ArrayList arrayList = new ArrayList();
                        y1(this, null, null, null, null, new yh.a<kotlin.b2>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$2$1
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
                                ComposerImpl composerImpl = this.f12277b;
                                List<yh.q<e<?>, SlotWriter, s1, kotlin.b2>> list5 = arrayList;
                                SlotReader slotReader = slotReaderU;
                                z0 z0Var = z0VarA;
                                List list6 = composerImpl.changes;
                                try {
                                    composerImpl.changes = list5;
                                    SlotReader slotReader2 = composerImpl.reader;
                                    int[] iArr = composerImpl.nodeCountOverrides;
                                    composerImpl.nodeCountOverrides = null;
                                    try {
                                        composerImpl.reader = slotReader;
                                        composerImpl.i1(z0Var.c(), z0Var.e(), z0Var.getParameter(), true);
                                        kotlin.b2 b2Var = kotlin.b2.f124493a;
                                        composerImpl.reader = slotReader2;
                                        composerImpl.nodeCountOverrides = iArr;
                                        composerImpl.changes = list6;
                                    } catch (Throwable th2) {
                                        composerImpl.reader = slotReader2;
                                        composerImpl.nodeCountOverrides = iArr;
                                        throw th2;
                                    }
                                } catch (Throwable th3) {
                                    composerImpl.changes = list6;
                                    throw th3;
                                }
                            }
                        }, 15, null);
                        if (!arrayList.isEmpty()) {
                            A1(new yh.q<e<?>, SlotWriter, s1, kotlin.b2>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$2$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                public final void a(@dl.d e<?> applier, @dl.d SlotWriter slots, @dl.d s1 rememberManager) {
                                    kotlin.jvm.internal.f0.p(applier, "applier");
                                    kotlin.jvm.internal.f0.p(slots, "slots");
                                    kotlin.jvm.internal.f0.p(rememberManager, "rememberManager");
                                    int i12 = intRef.f124889b;
                                    if (i12 > 0) {
                                        applier = new e1(applier, i12);
                                    }
                                    List<yh.q<e<?>, SlotWriter, s1, kotlin.b2>> list5 = arrayList;
                                    int size2 = list5.size();
                                    for (int i13 = 0; i13 < size2; i13++) {
                                        list5.get(i13).invoke(applier, slots, rememberManager);
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(e<?> eVar, SlotWriter slotWriter, s1 s1Var) {
                                    a(eVar, slotWriter, s1Var);
                                    return kotlin.b2.f124493a;
                                }
                            });
                        }
                        kotlin.b2 b2Var = kotlin.b2.f124493a;
                        slotReaderU.e();
                    } catch (Throwable th2) {
                        slotReaderU.e();
                        throw th2;
                    }
                } else {
                    final y0 y0VarM = this.parentContext.m(z0VarB);
                    if (y0VarM == null || (slotTable = y0VarM.getSlotTable()) == null) {
                        slotTable = z0VarB.getSlotTable();
                    }
                    if (y0VarM == null || (slotTable2 = y0VarM.getSlotTable()) == null || (anchor = slotTable2.i(i10)) == null) {
                        anchor = z0VarB.getAnchor();
                    }
                    final List listY = ComposerKt.y(slotTable, anchor);
                    if (!listY.isEmpty()) {
                        A1(new yh.q<e<?>, SlotWriter, s1, kotlin.b2>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            public final void a(@dl.d e<?> applier, @dl.d SlotWriter slotWriter, @dl.d s1 s1Var) {
                                kotlin.jvm.internal.f0.p(applier, "applier");
                                kotlin.jvm.internal.f0.p(slotWriter, "<anonymous parameter 1>");
                                kotlin.jvm.internal.f0.p(s1Var, "<anonymous parameter 2>");
                                int i12 = intRef.f124889b;
                                List<Object> list5 = listY;
                                int size2 = list5.size();
                                for (int i13 = 0; i13 < size2; i13++) {
                                    Object obj = list5.get(i13);
                                    int i14 = i12 + i13;
                                    applier.g(i14, obj);
                                    applier.f(i14, obj);
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(e<?> eVar, SlotWriter slotWriter, s1 s1Var) {
                                a(eVar, slotWriter, s1Var);
                                return kotlin.b2.f124493a;
                            }
                        });
                        if (kotlin.jvm.internal.f0.g(z0VarA.getSlotTable(), this.slotTable)) {
                            int iJ2 = this.slotTable.j(anchor2);
                            n2(iJ2, r2(iJ2) + listY.size());
                        }
                    }
                    A1(new yh.q<e<?>, SlotWriter, s1, kotlin.b2>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        public final void a(@dl.d e<?> eVar, @dl.d SlotWriter slots, @dl.d s1 s1Var) {
                            kotlin.jvm.internal.f0.p(eVar, "<anonymous parameter 0>");
                            kotlin.jvm.internal.f0.p(slots, "slots");
                            kotlin.jvm.internal.f0.p(s1Var, "<anonymous parameter 2>");
                            y0 y0VarM2 = y0VarM;
                            if (y0VarM2 == null && (y0VarM2 = this.parentContext.m(z0VarB)) == null) {
                                ComposerKt.A("Could not resolve state for movable content");
                                throw new KotlinNothingValueException();
                            }
                            List<c> listC0 = slots.C0(1, y0VarM2.getSlotTable(), 2);
                            if (!listC0.isEmpty()) {
                                z composition = z0VarA.getComposition();
                                kotlin.jvm.internal.f0.n(composition, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
                                t tVar = (t) composition;
                                int size2 = listC0.size();
                                for (int i12 = 0; i12 < size2; i12++) {
                                    Object objD1 = slots.d1(listC0.get(i12), 0);
                                    RecomposeScopeImpl recomposeScopeImpl = objD1 instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) objD1 : null;
                                    if (recomposeScopeImpl != null) {
                                        recomposeScopeImpl.g(tVar);
                                    }
                                }
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(e<?> eVar, SlotWriter slotWriter, s1 s1Var) {
                            a(eVar, slotWriter, s1Var);
                            return kotlin.b2.f124493a;
                        }
                    });
                    SlotReader slotReaderU2 = slotTable.U();
                    try {
                        SlotReader slotReader = this.reader;
                        int[] iArr = this.nodeCountOverrides;
                        this.nodeCountOverrides = null;
                        try {
                            this.reader = slotReaderU2;
                            int iJ3 = slotTable.j(anchor);
                            slotReaderU2.X(iJ3);
                            this.writersReaderDelta = iJ3;
                            final ArrayList arrayList2 = new ArrayList();
                            List list5 = this.changes;
                            try {
                                this.changes = arrayList2;
                                list2 = list5;
                                try {
                                    x1(z0VarB.getComposition(), z0VarA.getComposition(), Integer.valueOf(slotReaderU2.getCurrent()), z0VarB.d(), new yh.a<kotlin.b2>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$5$1$1$1
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
                                            this.f12289b.i1(z0VarA.c(), z0VarA.e(), z0VarA.getParameter(), true);
                                        }
                                    });
                                    kotlin.b2 b2Var2 = kotlin.b2.f124493a;
                                    this.changes = list2;
                                    if (!arrayList2.isEmpty()) {
                                        A1(new yh.q<e<?>, SlotWriter, s1, kotlin.b2>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$5$1$2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(3);
                                            }

                                            public final void a(@dl.d e<?> applier, @dl.d SlotWriter slots, @dl.d s1 rememberManager) {
                                                kotlin.jvm.internal.f0.p(applier, "applier");
                                                kotlin.jvm.internal.f0.p(slots, "slots");
                                                kotlin.jvm.internal.f0.p(rememberManager, "rememberManager");
                                                int i12 = intRef.f124889b;
                                                if (i12 > 0) {
                                                    applier = new e1(applier, i12);
                                                }
                                                List<yh.q<e<?>, SlotWriter, s1, kotlin.b2>> list6 = arrayList2;
                                                int size2 = list6.size();
                                                for (int i13 = 0; i13 < size2; i13++) {
                                                    list6.get(i13).invoke(applier, slots, rememberManager);
                                                }
                                            }

                                            @Override // yh.q
                                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(e<?> eVar, SlotWriter slotWriter, s1 s1Var) {
                                                a(eVar, slotWriter, s1Var);
                                                return kotlin.b2.f124493a;
                                            }
                                        });
                                    }
                                    this.reader = slotReader;
                                    this.nodeCountOverrides = iArr;
                                    slotReaderU2.e();
                                } catch (Throwable th3) {
                                    th = th3;
                                    this.changes = list2;
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                list2 = list5;
                            }
                        } catch (Throwable th5) {
                            this.reader = slotReader;
                            this.nodeCountOverrides = iArr;
                            throw th5;
                        }
                    } catch (Throwable th6) {
                        slotReaderU2.e();
                        throw th6;
                    }
                }
                A1(ComposerKt.f12322c);
                i11++;
                i10 = 0;
            }
            A1(new yh.q<e<?>, SlotWriter, s1, kotlin.b2>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$2
                public final void a(@dl.d e<?> applier, @dl.d SlotWriter slots, @dl.d s1 s1Var) {
                    kotlin.jvm.internal.f0.p(applier, "applier");
                    kotlin.jvm.internal.f0.p(slots, "slots");
                    kotlin.jvm.internal.f0.p(s1Var, "<anonymous parameter 2>");
                    ComposerImpl.g1(slots, applier, 0);
                    slots.R();
                }

                @Override // yh.q
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(e<?> eVar, SlotWriter slotWriter, s1 s1Var) {
                    a(eVar, slotWriter, s1Var);
                    return kotlin.b2.f124493a;
                }
            });
            this.writersReaderDelta = 0;
            kotlin.b2 b2Var3 = kotlin.b2.f124493a;
            this.changes = list4;
        } catch (Throwable th7) {
            this.changes = list4;
            throw th7;
        }
    }

    private final void d2(int i10) {
        c2(i10, null, false, null);
    }

    private static final int e1(SlotWriter slotWriter) {
        int currentGroup = slotWriter.getCurrentGroup();
        int parent = slotWriter.getParent();
        while (parent >= 0 && !slotWriter.u0(parent)) {
            parent = slotWriter.J0(parent);
        }
        int iI0 = parent + 1;
        int iH0 = 0;
        while (iI0 < currentGroup) {
            if (slotWriter.m0(currentGroup, iI0)) {
                if (slotWriter.u0(iI0)) {
                    iH0 = 0;
                }
                iI0++;
            } else {
                iH0 += slotWriter.u0(iI0) ? 1 : slotWriter.H0(iI0);
                iI0 += slotWriter.i0(iI0);
            }
        }
        return iH0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e2(int i10, Object obj) {
        c2(i10, obj, false, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int f1(SlotWriter slotWriter, androidx.compose.runtime.c cVar, e<Object> eVar) {
        int iD = slotWriter.D(cVar);
        ComposerKt.q0(slotWriter.getCurrentGroup() < iD);
        g1(slotWriter, eVar, iD);
        int iE1 = e1(slotWriter);
        while (slotWriter.getCurrentGroup() < iD) {
            if (slotWriter.l0(iD)) {
                if (slotWriter.t0()) {
                    eVar.h(slotWriter.F0(slotWriter.getCurrentGroup()));
                    iE1 = 0;
                }
                slotWriter.h1();
            } else {
                iE1 += slotWriter.a1();
            }
        }
        ComposerKt.q0(slotWriter.getCurrentGroup() == iD);
        return iE1;
    }

    private final void f2(boolean z10, final Object obj) {
        if (z10) {
            this.reader.c0();
            return;
        }
        if (obj != null && this.reader.o() != obj) {
            P1(this, false, new yh.q<e<?>, SlotWriter, s1, kotlin.b2>() { // from class: androidx.compose.runtime.ComposerImpl$startReaderGroup$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                public final void a(@dl.d e<?> eVar, @dl.d SlotWriter slots, @dl.d s1 s1Var) {
                    kotlin.jvm.internal.f0.p(eVar, "<anonymous parameter 0>");
                    kotlin.jvm.internal.f0.p(slots, "slots");
                    kotlin.jvm.internal.f0.p(s1Var, "<anonymous parameter 2>");
                    slots.p1(obj);
                }

                @Override // yh.q
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(e<?> eVar, SlotWriter slotWriter, s1 s1Var) {
                    a(eVar, slotWriter, s1Var);
                    return kotlin.b2.f124493a;
                }
            }, 1, null);
        }
        this.reader.b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g1(SlotWriter slotWriter, e<Object> eVar, int i10) {
        while (!slotWriter.n0(i10)) {
            slotWriter.b1();
            if (slotWriter.u0(slotWriter.getParent())) {
                eVar.a();
            }
            slotWriter.R();
        }
    }

    private final void g2() {
        this.reader = this.slotTable.U();
        d2(100);
        this.parentContext.q();
        this.f12241v = this.parentContext.e();
        this.providersInvalidStack.j(ComposerKt.w(this.providersInvalid));
        this.providersInvalid = s(this.f12241v);
        this.L = null;
        if (!this.forceRecomposeScopes) {
            this.forceRecomposeScopes = this.parentContext.getCollectingParameterInformation();
        }
        Set<androidx.compose.runtime.tooling.b> set = (Set) X1(InspectionTablesKt.a(), this.f12241v);
        if (set != null) {
            set.add(this.slotTable);
            this.parentContext.n(set);
        }
        d2(this.parentContext.getCompoundHashKey());
    }

    private final int h1(int index) {
        return (-2) - index;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i1(final x0<Object> x0Var, u0.i<v<Object>, ? extends m2<? extends Object>> iVar, final Object obj, boolean z10) {
        X(MovableContentKt.f12387a, x0Var);
        s(obj);
        int compoundKeyHash = getCompoundKeyHash();
        try {
            this.compoundKeyHash = MovableContentKt.f12387a;
            if (getInserting()) {
                SlotWriter.x0(this.writer, 0, 1, null);
            }
            boolean z11 = (getInserting() || kotlin.jvm.internal.f0.g(this.reader.o(), iVar)) ? false : true;
            if (z11) {
                this.providerUpdates.put(Integer.valueOf(this.reader.getCurrent()), iVar);
            }
            c2(202, ComposerKt.I(), false, iVar);
            if (!getInserting() || z10) {
                boolean z12 = this.providersInvalid;
                this.providersInvalid = z11;
                androidx.compose.runtime.b.c(this, androidx.compose.runtime.internal.b.c(694380496, true, new yh.p<p, Integer, kotlin.b2>() { // from class: androidx.compose.runtime.ComposerImpl$invokeMovableContentLambda$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @h
                    public final void a(@dl.e p pVar, int i10) {
                        if ((i10 & 11) == 2 && pVar.b()) {
                            pVar.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(694380496, i10, -1, "androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda.<anonymous> (Composer.kt:2848)");
                        }
                        x0Var.a().invoke(obj, pVar, 8);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(p pVar, Integer num) {
                        a(pVar, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }));
                this.providersInvalid = z12;
            } else {
                this.writerHasAProvider = true;
                this.L = null;
                SlotWriter slotWriter = this.writer;
                this.parentContext.i(new z0(x0Var, obj, getComposition(), this.insertTable, slotWriter.B(slotWriter.J0(slotWriter.getParent())), CollectionsKt__CollectionsKt.E(), E0(this, null, 1, null)));
            }
        } finally {
            J0();
            this.compoundKeyHash = compoundKeyHash;
            b0();
        }
    }

    private final void j2(int i10, Object obj, Object obj2) {
        if (obj != null) {
            if (obj instanceof Enum) {
                k2(((Enum) obj).ordinal());
                return;
            } else {
                k2(obj.hashCode());
                return;
            }
        }
        if (obj2 == null || i10 != 207 || kotlin.jvm.internal.f0.g(obj2, p.INSTANCE.a())) {
            k2(i10);
        } else {
            k2(obj2.hashCode());
        }
    }

    private final void k2(int i10) {
        this.compoundKeyHash = i10 ^ Integer.rotateLeft(getCompoundKeyHash(), 3);
    }

    private final void l2(int i10, Object obj, Object obj2) {
        if (obj != null) {
            if (obj instanceof Enum) {
                m2(((Enum) obj).ordinal());
                return;
            } else {
                m2(obj.hashCode());
                return;
            }
        }
        if (obj2 == null || i10 != 207 || kotlin.jvm.internal.f0.g(obj2, p.INSTANCE.a())) {
            m2(i10);
        } else {
            m2(obj2.hashCode());
        }
    }

    private final Object m1(SlotReader slotReader, int i10) {
        return slotReader.R(i10);
    }

    private final void m2(int i10) {
        this.compoundKeyHash = Integer.rotateRight(i10 ^ getCompoundKeyHash(), 3);
    }

    private final int n1(int groupLocation, int group, int recomposeGroup, int recomposeIndex) {
        int iV = this.reader.V(group);
        while (iV != recomposeGroup && !this.reader.P(iV)) {
            iV = this.reader.V(iV);
        }
        if (this.reader.P(iV)) {
            recomposeIndex = 0;
        }
        if (iV == group) {
            return recomposeIndex;
        }
        int iR2 = (r2(iV) - this.reader.T(group)) + recomposeIndex;
        loop1: while (recomposeIndex < iR2 && iV != groupLocation) {
            iV++;
            while (iV < groupLocation) {
                int iK = this.reader.K(iV) + iV;
                if (groupLocation >= iK) {
                    recomposeIndex += r2(iV);
                    iV = iK;
                }
            }
            break loop1;
        }
        return recomposeIndex;
    }

    private final void n2(int i10, int i11) {
        if (r2(i10) != i11) {
            if (i10 < 0) {
                HashMap<Integer, Integer> map = this.nodeCountVirtualOverrides;
                if (map == null) {
                    map = new HashMap<>();
                    this.nodeCountVirtualOverrides = map;
                }
                map.put(Integer.valueOf(i10), Integer.valueOf(i11));
                return;
            }
            int[] iArr = this.nodeCountOverrides;
            if (iArr == null) {
                iArr = new int[this.reader.getGroupsSize()];
                kotlin.collections.m.u2(iArr, -1, 0, 0, 6, null);
                this.nodeCountOverrides = iArr;
            }
            iArr[i10] = i11;
        }
    }

    private final void o2(int i10, int i11) {
        int iR2 = r2(i10);
        if (iR2 != i11) {
            int i12 = i11 - iR2;
            int iB = this.pendingStack.b() - 1;
            while (i10 != -1) {
                int iR3 = r2(i10) + i12;
                n2(i10, iR3);
                for (int i13 = iB; -1 < i13; i13--) {
                    Pending pendingF = this.pendingStack.f(i13);
                    if (pendingF != null && pendingF.n(i10, iR3)) {
                        iB = i13 - 1;
                        break;
                    }
                }
                if (i10 < 0) {
                    i10 = this.reader.getParent();
                } else if (this.reader.P(i10)) {
                    return;
                } else {
                    i10 = this.reader.V(i10);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final u0.i<v<Object>, m2<Object>> p2(u0.i<v<Object>, ? extends m2<? extends Object>> parentScope, u0.i<v<Object>, ? extends m2<? extends Object>> currentProviders) {
        u0.i.a<v<Object>, ? extends m2<? extends Object>> aVarBuilder = parentScope.builder();
        aVarBuilder.putAll(currentProviders);
        u0.i iVarBuild = aVarBuilder.build();
        e2(204, ComposerKt.U());
        s(iVarBuild);
        s(currentProviders);
        J0();
        return iVarBuild;
    }

    private final void q1() {
        if (this.downNodes.d()) {
            r1(this.downNodes.i());
            this.downNodes.a();
        }
    }

    private final void r1(final Object[] nodes) {
        A1(new yh.q<e<?>, SlotWriter, s1, kotlin.b2>() { // from class: androidx.compose.runtime.ComposerImpl$realizeDowns$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public final void a(@dl.d e<?> applier, @dl.d SlotWriter slotWriter, @dl.d s1 s1Var) {
                kotlin.jvm.internal.f0.p(applier, "applier");
                kotlin.jvm.internal.f0.p(slotWriter, "<anonymous parameter 1>");
                kotlin.jvm.internal.f0.p(s1Var, "<anonymous parameter 2>");
                int length = nodes.length;
                for (int i10 = 0; i10 < length; i10++) {
                    applier.h(nodes[i10]);
                }
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(e<?> eVar, SlotWriter slotWriter, s1 s1Var) {
                a(eVar, slotWriter, s1Var);
                return kotlin.b2.f124493a;
            }
        });
    }

    private final int r2(int group) {
        int i10;
        Integer num;
        if (group >= 0) {
            int[] iArr = this.nodeCountOverrides;
            return (iArr == null || (i10 = iArr[group]) < 0) ? this.reader.T(group) : i10;
        }
        HashMap<Integer, Integer> map = this.nodeCountVirtualOverrides;
        if (map == null || (num = map.get(Integer.valueOf(group))) == null) {
            return 0;
        }
        return num.intValue();
    }

    private final void s1() {
        final int i10 = this.previousCount;
        this.previousCount = 0;
        if (i10 > 0) {
            final int i11 = this.previousRemove;
            if (i11 >= 0) {
                this.previousRemove = -1;
                B1(new yh.q<e<?>, SlotWriter, s1, kotlin.b2>() { // from class: androidx.compose.runtime.ComposerImpl$realizeMovement$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    public final void a(@dl.d e<?> applier, @dl.d SlotWriter slotWriter, @dl.d s1 s1Var) {
                        kotlin.jvm.internal.f0.p(applier, "applier");
                        kotlin.jvm.internal.f0.p(slotWriter, "<anonymous parameter 1>");
                        kotlin.jvm.internal.f0.p(s1Var, "<anonymous parameter 2>");
                        applier.b(i11, i10);
                    }

                    @Override // yh.q
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(e<?> eVar, SlotWriter slotWriter, s1 s1Var) {
                        a(eVar, slotWriter, s1Var);
                        return kotlin.b2.f124493a;
                    }
                });
                return;
            }
            final int i12 = this.previousMoveFrom;
            this.previousMoveFrom = -1;
            final int i13 = this.previousMoveTo;
            this.previousMoveTo = -1;
            B1(new yh.q<e<?>, SlotWriter, s1, kotlin.b2>() { // from class: androidx.compose.runtime.ComposerImpl$realizeMovement$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                public final void a(@dl.d e<?> applier, @dl.d SlotWriter slotWriter, @dl.d s1 s1Var) {
                    kotlin.jvm.internal.f0.p(applier, "applier");
                    kotlin.jvm.internal.f0.p(slotWriter, "<anonymous parameter 1>");
                    kotlin.jvm.internal.f0.p(s1Var, "<anonymous parameter 2>");
                    applier.e(i12, i13, i10);
                }

                @Override // yh.q
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(e<?> eVar, SlotWriter slotWriter, s1 s1Var) {
                    a(eVar, slotWriter, s1Var);
                    return kotlin.b2.f124493a;
                }
            });
        }
    }

    private final void s2() {
        if (this.nodeExpected) {
            this.nodeExpected = false;
        } else {
            ComposerKt.A("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
            throw new KotlinNothingValueException();
        }
    }

    private final void t1(boolean z10) {
        int parent = z10 ? this.reader.getParent() : this.reader.getCurrent();
        final int i10 = parent - this.writersReaderDelta;
        if (!(i10 >= 0)) {
            ComposerKt.A("Tried to seek backward".toString());
            throw new KotlinNothingValueException();
        }
        if (i10 > 0) {
            A1(new yh.q<e<?>, SlotWriter, s1, kotlin.b2>() { // from class: androidx.compose.runtime.ComposerImpl$realizeOperationLocation$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                public final void a(@dl.d e<?> eVar, @dl.d SlotWriter slots, @dl.d s1 s1Var) {
                    kotlin.jvm.internal.f0.p(eVar, "<anonymous parameter 0>");
                    kotlin.jvm.internal.f0.p(slots, "slots");
                    kotlin.jvm.internal.f0.p(s1Var, "<anonymous parameter 2>");
                    slots.A(i10);
                }

                @Override // yh.q
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(e<?> eVar, SlotWriter slotWriter, s1 s1Var) {
                    a(eVar, slotWriter, s1Var);
                    return kotlin.b2.f124493a;
                }
            });
            this.writersReaderDelta = parent;
        }
    }

    private final void t2() {
        if (!this.nodeExpected) {
            return;
        }
        ComposerKt.A("A call to createNode(), emitNode() or useNode() expected".toString());
        throw new KotlinNothingValueException();
    }

    static /* synthetic */ void u1(ComposerImpl composerImpl, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        composerImpl.t1(z10);
    }

    private final void v0() {
        RecomposeScopeImpl recomposeScopeImpl;
        if (getInserting()) {
            z composition = getComposition();
            kotlin.jvm.internal.f0.n(composition, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            RecomposeScopeImpl recomposeScopeImpl2 = new RecomposeScopeImpl((t) composition);
            this.invalidateStack.h(recomposeScopeImpl2);
            q2(recomposeScopeImpl2);
            recomposeScopeImpl2.H(this.compositionToken);
            return;
        }
        q0 q0VarO0 = ComposerKt.o0(this.invalidations, this.reader.getParent());
        Object objQ = this.reader.Q();
        if (kotlin.jvm.internal.f0.g(objQ, p.INSTANCE.a())) {
            z composition2 = getComposition();
            kotlin.jvm.internal.f0.n(composition2, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            recomposeScopeImpl = new RecomposeScopeImpl((t) composition2);
            q2(recomposeScopeImpl);
        } else {
            kotlin.jvm.internal.f0.n(objQ, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
            recomposeScopeImpl = (RecomposeScopeImpl) objQ;
        }
        recomposeScopeImpl.D(q0VarO0 != null);
        this.invalidateStack.h(recomposeScopeImpl);
        recomposeScopeImpl.H(this.compositionToken);
    }

    private final void v1() {
        final int i10 = this.pendingUps;
        if (i10 > 0) {
            this.pendingUps = 0;
            A1(new yh.q<e<?>, SlotWriter, s1, kotlin.b2>() { // from class: androidx.compose.runtime.ComposerImpl$realizeUps$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                public final void a(@dl.d e<?> applier, @dl.d SlotWriter slotWriter, @dl.d s1 s1Var) {
                    kotlin.jvm.internal.f0.p(applier, "applier");
                    kotlin.jvm.internal.f0.p(slotWriter, "<anonymous parameter 1>");
                    kotlin.jvm.internal.f0.p(s1Var, "<anonymous parameter 2>");
                    int i11 = i10;
                    for (int i12 = 0; i12 < i11; i12++) {
                        applier.a();
                    }
                }

                @Override // yh.q
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(e<?> eVar, SlotWriter slotWriter, s1 s1Var) {
                    a(eVar, slotWriter, s1Var);
                    return kotlin.b2.f124493a;
                }
            });
        }
    }

    private final <R> R v2(List<yh.q<e<?>, SlotWriter, s1, kotlin.b2>> newChanges, yh.a<? extends R> block) {
        List list = this.changes;
        try {
            this.changes = newChanges;
            return block.invoke();
        } finally {
            kotlin.jvm.internal.c0.d(1);
            this.changes = list;
            kotlin.jvm.internal.c0.c(1);
        }
    }

    private final <R> R w2(SlotReader reader, yh.a<? extends R> block) {
        SlotReader slotReader = this.reader;
        int[] iArr = this.nodeCountOverrides;
        this.nodeCountOverrides = null;
        try {
            this.reader = reader;
            return block.invoke();
        } finally {
            kotlin.jvm.internal.c0.d(1);
            this.reader = slotReader;
            this.nodeCountOverrides = iArr;
            kotlin.jvm.internal.c0.c(1);
        }
    }

    private final <R> R x1(z from, z to, Integer index, List<Pair<RecomposeScopeImpl, androidx.compose.runtime.collection.c<Object>>> invalidations, yh.a<? extends R> block) {
        R rInvoke;
        boolean z10 = this.implicitRootStart;
        boolean z11 = this.isComposing;
        int i10 = this.nodeIndex;
        try {
            this.implicitRootStart = false;
            this.isComposing = true;
            this.nodeIndex = 0;
            int size = invalidations.size();
            for (int i11 = 0; i11 < size; i11++) {
                Pair<RecomposeScopeImpl, androidx.compose.runtime.collection.c<Object>> pair = invalidations.get(i11);
                RecomposeScopeImpl recomposeScopeImplA = pair.a();
                androidx.compose.runtime.collection.c<Object> cVarB = pair.b();
                if (cVarB != null) {
                    int size2 = cVarB.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        h2(recomposeScopeImplA, cVarB.get(i12));
                    }
                } else {
                    h2(recomposeScopeImplA, null);
                }
            }
            if (from != null) {
                rInvoke = (R) from.M(to, index != null ? index.intValue() : -1, block);
                if (rInvoke == null) {
                }
                return rInvoke;
            }
            rInvoke = block.invoke();
            return rInvoke;
        } finally {
            this.implicitRootStart = z10;
            this.isComposing = z11;
            this.nodeIndex = i10;
        }
    }

    private final void y0() {
        this.pending = null;
        this.nodeIndex = 0;
        this.groupNodeCount = 0;
        this.writersReaderDelta = 0;
        this.compoundKeyHash = 0;
        this.nodeExpected = false;
        this.startedGroup = false;
        this.startedGroups.a();
        this.invalidateStack.a();
        z0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object y1(ComposerImpl composerImpl, z zVar, z zVar2, Integer num, List list, yh.a aVar, int i10, Object obj) {
        z zVar3 = (i10 & 1) != 0 ? null : zVar;
        z zVar4 = (i10 & 2) != 0 ? null : zVar2;
        Integer num2 = (i10 & 4) != 0 ? null : num;
        if ((i10 & 8) != 0) {
            list = CollectionsKt__CollectionsKt.E();
        }
        return composerImpl.x1(zVar3, zVar4, num2, list, aVar);
    }

    private final void z0() {
        this.nodeCountOverrides = null;
        this.nodeCountVirtualOverrides = null;
    }

    private final void z1() {
        boolean z10 = this.isComposing;
        this.isComposing = true;
        int parent = this.reader.getParent();
        int iK = this.reader.K(parent) + parent;
        int i10 = this.nodeIndex;
        int compoundKeyHash = getCompoundKeyHash();
        int i11 = this.groupNodeCount;
        q0 q0VarH = ComposerKt.H(this.invalidations, this.reader.getCurrent(), iK);
        boolean z11 = false;
        int i12 = parent;
        while (q0VarH != null) {
            int location = q0VarH.getLocation();
            ComposerKt.o0(this.invalidations, location);
            if (q0VarH.d()) {
                this.reader.X(location);
                int current = this.reader.getCurrent();
                R1(i12, current, parent);
                this.nodeIndex = n1(location, current, parent, i10);
                this.compoundKeyHash = B0(this.reader.V(current), parent, compoundKeyHash);
                this.L = null;
                q0VarH.getScope().h(this);
                this.L = null;
                this.reader.Y(parent);
                i12 = current;
                z11 = true;
            } else {
                this.invalidateStack.h(q0VarH.getScope());
                q0VarH.getScope().y();
                this.invalidateStack.g();
            }
            q0VarH = ComposerKt.H(this.invalidations, this.reader.getCurrent(), iK);
        }
        if (z11) {
            R1(i12, parent, parent);
            this.reader.a0();
            int iR2 = r2(parent);
            this.nodeIndex = i10 + iR2;
            this.groupNodeCount = i11 + iR2;
        } else {
            b2();
        }
        this.compoundKeyHash = compoundKeyHash;
        this.isComposing = z10;
    }

    @Override // androidx.compose.runtime.p
    @m
    public boolean A(byte value) {
        Object objL1 = l1();
        if ((objL1 instanceof Byte) && value == ((Number) objL1).byteValue()) {
            return false;
        }
        q2(Byte.valueOf(value));
        return true;
    }

    public final void A0(@dl.d androidx.compose.runtime.collection.b<RecomposeScopeImpl, androidx.compose.runtime.collection.c<Object>> invalidationsRequested, @dl.d yh.p<? super p, ? super Integer, kotlin.b2> content) {
        kotlin.jvm.internal.f0.p(invalidationsRequested, "invalidationsRequested");
        kotlin.jvm.internal.f0.p(content, "content");
        if (this.changes.isEmpty()) {
            G0(invalidationsRequested, content);
        } else {
            ComposerKt.A("Expected applyChanges() to have been called".toString());
            throw new KotlinNothingValueException();
        }
    }

    @Override // androidx.compose.runtime.p
    @m
    public boolean B(char value) {
        Object objL1 = l1();
        if ((objL1 instanceof Character) && value == ((Character) objL1).charValue()) {
            return false;
        }
        q2(Character.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.p
    @m
    public boolean C(double value) {
        Object objL1 = l1();
        if (objL1 instanceof Double) {
            if (value == ((Number) objL1).doubleValue()) {
                return false;
            }
        }
        q2(Double.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.p
    /* JADX INFO: renamed from: D, reason: from getter */
    public boolean getInserting() {
        return this.inserting;
    }

    @Override // androidx.compose.runtime.p
    @m
    public void E() {
        if (this.invalidations.isEmpty()) {
            a2();
            return;
        }
        SlotReader slotReader = this.reader;
        int iQ = slotReader.q();
        Object objS = slotReader.s();
        Object objO = slotReader.o();
        j2(iQ, objS, objO);
        f2(slotReader.O(), null);
        z1();
        slotReader.h();
        l2(iQ, objS, objO);
    }

    @Override // androidx.compose.runtime.p
    @dl.d
    @m
    public p F(int key) {
        c2(key, null, false, null);
        v0();
        return this;
    }

    public final void F0() {
        Object objA = r2.f13058a.a("Compose:Composer.dispose");
        try {
            this.parentContext.r(this);
            this.invalidateStack.a();
            this.invalidations.clear();
            this.changes.clear();
            this.providerUpdates.clear();
            G().clear();
            this.isDisposed = true;
            kotlin.b2 b2Var = kotlin.b2.f124493a;
        } finally {
            r2.f13058a.b(objA);
        }
    }

    @Override // androidx.compose.runtime.p
    @dl.d
    public e<?> G() {
        return this.applier;
    }

    @Override // androidx.compose.runtime.p
    @m
    @dl.e
    public u1 H() {
        androidx.compose.runtime.c cVarA;
        final yh.l<q, kotlin.b2> lVarI;
        RecomposeScopeImpl recomposeScopeImpl = null;
        RecomposeScopeImpl recomposeScopeImplG = this.invalidateStack.d() ? this.invalidateStack.g() : null;
        if (recomposeScopeImplG != null) {
            recomposeScopeImplG.D(false);
        }
        if (recomposeScopeImplG != null && (lVarI = recomposeScopeImplG.i(this.compositionToken)) != null) {
            A1(new yh.q<e<?>, SlotWriter, s1, kotlin.b2>() { // from class: androidx.compose.runtime.ComposerImpl$endRestartGroup$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                public final void a(@dl.d e<?> eVar, @dl.d SlotWriter slotWriter, @dl.d s1 s1Var) {
                    kotlin.jvm.internal.f0.p(eVar, "<anonymous parameter 0>");
                    kotlin.jvm.internal.f0.p(slotWriter, "<anonymous parameter 1>");
                    kotlin.jvm.internal.f0.p(s1Var, "<anonymous parameter 2>");
                    lVarI.invoke(this.getComposition());
                }

                @Override // yh.q
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(e<?> eVar, SlotWriter slotWriter, s1 s1Var) {
                    a(eVar, slotWriter, s1Var);
                    return kotlin.b2.f124493a;
                }
            });
        }
        if (recomposeScopeImplG != null && !recomposeScopeImplG.q() && (recomposeScopeImplG.r() || this.forceRecomposeScopes)) {
            if (recomposeScopeImplG.getAnchor() == null) {
                if (getInserting()) {
                    SlotWriter slotWriter = this.writer;
                    cVarA = slotWriter.B(slotWriter.getParent());
                } else {
                    SlotReader slotReader = this.reader;
                    cVarA = slotReader.a(slotReader.getParent());
                }
                recomposeScopeImplG.A(cVarA);
            }
            recomposeScopeImplG.C(false);
            recomposeScopeImpl = recomposeScopeImplG;
        }
        I0(false);
        return recomposeScopeImpl;
    }

    @Override // androidx.compose.runtime.p
    @dl.d
    @m
    public Object I(@dl.e Object left, @dl.e Object right) {
        Object objQ = ComposerKt.Q(this.reader.s(), left, right);
        return objQ == null ? new JoinedKey(left, right) : objQ;
    }

    @Override // androidx.compose.runtime.p
    public void J() {
        int i10 = 126;
        if (getInserting() || (!this.reusing ? this.reader.q() != 126 : this.reader.q() != 125)) {
            i10 = 125;
        }
        c2(i10, null, true, null);
        this.nodeExpected = true;
    }

    @Override // androidx.compose.runtime.p
    @o0
    public <T> T K(@dl.d v<T> key) {
        kotlin.jvm.internal.f0.p(key, "key");
        return (T) X1(key, E0(this, null, 1, null));
    }

    @Override // androidx.compose.runtime.p
    public <T> void L(@dl.d final yh.a<? extends T> factory) {
        kotlin.jvm.internal.f0.p(factory, "factory");
        s2();
        if (!getInserting()) {
            ComposerKt.A("createNode() can only be called when inserting".toString());
            throw new KotlinNothingValueException();
        }
        final int iF = this.nodeIndexStack.f();
        SlotWriter slotWriter = this.writer;
        final androidx.compose.runtime.c cVarB = slotWriter.B(slotWriter.getParent());
        this.groupNodeCount++;
        G1(new yh.q<e<?>, SlotWriter, s1, kotlin.b2>() { // from class: androidx.compose.runtime.ComposerImpl$createNode$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            public final void a(@dl.d e<?> applier, @dl.d SlotWriter slots, @dl.d s1 s1Var) {
                kotlin.jvm.internal.f0.p(applier, "applier");
                kotlin.jvm.internal.f0.p(slots, "slots");
                kotlin.jvm.internal.f0.p(s1Var, "<anonymous parameter 2>");
                Object objInvoke = factory.invoke();
                slots.t1(cVarB, objInvoke);
                applier.f(iF, objInvoke);
                applier.h(objInvoke);
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(e<?> eVar, SlotWriter slotWriter2, s1 s1Var) {
                a(eVar, slotWriter2, s1Var);
                return kotlin.b2.f124493a;
            }
        });
        I1(new yh.q<e<?>, SlotWriter, s1, kotlin.b2>() { // from class: androidx.compose.runtime.ComposerImpl$createNode$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public final void a(@dl.d e<?> applier, @dl.d SlotWriter slots, @dl.d s1 s1Var) {
                kotlin.jvm.internal.f0.p(applier, "applier");
                kotlin.jvm.internal.f0.p(slots, "slots");
                kotlin.jvm.internal.f0.p(s1Var, "<anonymous parameter 2>");
                Object objG0 = slots.G0(cVarB);
                applier.a();
                applier.g(iF, objG0);
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(e<?> eVar, SlotWriter slotWriter2, s1 s1Var) {
                a(eVar, slotWriter2, s1Var);
                return kotlin.b2.f124493a;
            }
        });
    }

    @Override // androidx.compose.runtime.p
    @dl.d
    public CoroutineContext M() {
        return this.parentContext.getEffectCoroutineContext();
    }

    @Override // androidx.compose.runtime.p
    public void N(@dl.e Object obj) {
        q2(obj);
    }

    @Override // androidx.compose.runtime.p
    @m
    public void O() {
        J0();
        RecomposeScopeImpl recomposeScopeImplT0 = T0();
        if (recomposeScopeImplT0 == null || !recomposeScopeImplT0.r()) {
            return;
        }
        recomposeScopeImplT0.B(true);
    }

    @Override // androidx.compose.runtime.p
    @o0
    public void P(@dl.d x0<?> value, @dl.e Object obj) {
        kotlin.jvm.internal.f0.p(value, "value");
        i1(value, E0(this, null, 1, null), obj, false);
    }

    public final boolean P0() {
        if (this.forceRecomposeScopes) {
            return false;
        }
        this.forceRecomposeScopes = true;
        this.forciblyRecompose = true;
        return true;
    }

    @Override // androidx.compose.runtime.p
    public void Q() {
        this.forceRecomposeScopes = true;
    }

    public final boolean Q0() {
        return this.childrenComposing > 0;
    }

    @Override // androidx.compose.runtime.p
    @dl.e
    public n1 R() {
        return T0();
    }

    public final int R0() {
        return this.changes.size();
    }

    @Override // androidx.compose.runtime.p
    public void S() {
        if (this.reusing && this.reader.getParent() == this.reusingGroup) {
            this.reusingGroup = -1;
            this.reusing = false;
        }
        I0(false);
    }

    @Override // androidx.compose.runtime.p
    @m
    public void T(int i10) {
        c2(i10, null, false, null);
    }

    @dl.e
    public final RecomposeScopeImpl T0() {
        l2<RecomposeScopeImpl> l2Var = this.invalidateStack;
        if (this.childrenComposing == 0 && l2Var.d()) {
            return l2Var.e();
        }
        return null;
    }

    @Override // androidx.compose.runtime.p
    @dl.e
    public Object U() {
        return l1();
    }

    @Override // androidx.compose.runtime.p
    @dl.d
    public androidx.compose.runtime.tooling.b V() {
        return this.slotTable;
    }

    @dl.e
    public final List<yh.q<e<?>, SlotWriter, s1, kotlin.b2>> V0() {
        return this.deferredChanges;
    }

    @Override // androidx.compose.runtime.p
    @m
    public void W() {
        c2(-127, null, false, null);
    }

    public final boolean W0() {
        return !this.invalidations.isEmpty();
    }

    @Override // androidx.compose.runtime.p
    @m
    public void X(int i10, @dl.e Object obj) {
        c2(i10, obj, false, null);
    }

    public final boolean X0() {
        return !this.changes.isEmpty();
    }

    @Override // androidx.compose.runtime.p
    public void Y() {
        this.reusing = false;
    }

    @dl.d
    /* JADX INFO: renamed from: Y0, reason: from getter */
    public final x1 getInsertTable() {
        return this.insertTable;
    }

    public final void Y1(@dl.e List<yh.q<e<?>, SlotWriter, s1, kotlin.b2>> list) {
        this.deferredChanges = list;
    }

    @Override // androidx.compose.runtime.p
    @o0
    public void Z() {
        J0();
        J0();
        this.providersInvalid = ComposerKt.v(this.providersInvalidStack.i());
        this.L = null;
    }

    public final void Z1(@dl.d x1 x1Var) {
        kotlin.jvm.internal.f0.p(x1Var, "<set-?>");
        this.insertTable = x1Var;
    }

    @Override // androidx.compose.runtime.p
    @m
    public void a(boolean z10) {
        if (!(this.groupNodeCount == 0)) {
            ComposerKt.A("No nodes can be emitted before calling dactivateToEndGroup".toString());
            throw new KotlinNothingValueException();
        }
        if (getInserting()) {
            return;
        }
        if (!z10) {
            b2();
            return;
        }
        int current = this.reader.getCurrent();
        int end = this.reader.getEnd();
        for (final int i10 = current; i10 < end; i10++) {
            this.reader.j(i10, new yh.p<Integer, Object, kotlin.b2>() { // from class: androidx.compose.runtime.ComposerImpl$deactivateToEndGroup$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(final int i11, @dl.e final Object obj) {
                    if (obj instanceof t1) {
                        this.f12260b.reader.X(i10);
                        ComposerImpl composerImpl = this.f12260b;
                        final int i12 = i10;
                        ComposerImpl.P1(composerImpl, false, new yh.q<e<?>, SlotWriter, s1, kotlin.b2>() { // from class: androidx.compose.runtime.ComposerImpl$deactivateToEndGroup$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            public final void a(@dl.d e<?> eVar, @dl.d SlotWriter slots, @dl.d s1 rememberManager) {
                                kotlin.jvm.internal.f0.p(eVar, "<anonymous parameter 0>");
                                kotlin.jvm.internal.f0.p(slots, "slots");
                                kotlin.jvm.internal.f0.p(rememberManager, "rememberManager");
                                if (!kotlin.jvm.internal.f0.g(obj, slots.c1(i12, i11))) {
                                    ComposerKt.A("Slot table is out of sync".toString());
                                    throw new KotlinNothingValueException();
                                }
                                rememberManager.a((t1) obj);
                                slots.X0(i11, p.INSTANCE.a());
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(e<?> eVar, SlotWriter slotWriter, s1 s1Var) {
                                a(eVar, slotWriter, s1Var);
                                return kotlin.b2.f124493a;
                            }
                        }, 1, null);
                        return;
                    }
                    if (obj instanceof RecomposeScopeImpl) {
                        RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                        t composition = recomposeScopeImpl.getComposition();
                        if (composition != null) {
                            composition.S(true);
                            recomposeScopeImpl.x();
                        }
                        this.f12260b.reader.X(i10);
                        ComposerImpl composerImpl2 = this.f12260b;
                        final int i13 = i10;
                        ComposerImpl.P1(composerImpl2, false, new yh.q<e<?>, SlotWriter, s1, kotlin.b2>() { // from class: androidx.compose.runtime.ComposerImpl$deactivateToEndGroup$2.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            public final void a(@dl.d e<?> eVar, @dl.d SlotWriter slots, @dl.d s1 s1Var) {
                                kotlin.jvm.internal.f0.p(eVar, "<anonymous parameter 0>");
                                kotlin.jvm.internal.f0.p(slots, "slots");
                                kotlin.jvm.internal.f0.p(s1Var, "<anonymous parameter 2>");
                                if (kotlin.jvm.internal.f0.g(obj, slots.c1(i13, i11))) {
                                    slots.X0(i11, p.INSTANCE.a());
                                } else {
                                    ComposerKt.A("Slot table is out of sync".toString());
                                    throw new KotlinNothingValueException();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(e<?> eVar, SlotWriter slotWriter, s1 s1Var) {
                                a(eVar, slotWriter, s1Var);
                                return kotlin.b2.f124493a;
                            }
                        }, 1, null);
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(Integer num, Object obj) {
                    a(num.intValue(), obj);
                    return kotlin.b2.f124493a;
                }
            });
        }
        ComposerKt.p0(this.invalidations, current, end);
        this.reader.X(current);
        this.reader.a0();
    }

    @Override // androidx.compose.runtime.p
    /* JADX INFO: renamed from: a0, reason: from getter */
    public int getCompoundKeyHash() {
        return this.compoundKeyHash;
    }

    @Override // androidx.compose.runtime.p
    public boolean b() {
        if (!getInserting() && !this.reusing && !this.providersInvalid) {
            RecomposeScopeImpl recomposeScopeImplT0 = T0();
            if (((recomposeScopeImplT0 == null || recomposeScopeImplT0.o()) ? false : true) && !this.forciblyRecompose) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.runtime.p
    @m
    public void b0() {
        J0();
    }

    @Override // androidx.compose.runtime.p
    @o0
    public void c(@dl.d List<Pair<z0, z0>> references) {
        kotlin.jvm.internal.f0.p(references, "references");
        try {
            d1(references);
            y0();
        } catch (Throwable th2) {
            d0();
            throw th2;
        }
    }

    @Override // androidx.compose.runtime.p
    @m
    public void c0() {
        J0();
    }

    @Override // androidx.compose.runtime.p
    public void d() {
        s2();
        if (!getInserting()) {
            D1(a1(this.reader));
        } else {
            ComposerKt.A("useNode() called while inserting".toString());
            throw new KotlinNothingValueException();
        }
    }

    @Override // androidx.compose.runtime.p
    public <V, T> void e(final V value, @dl.d final yh.p<? super T, ? super V, kotlin.b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        yh.q<e<?>, SlotWriter, s1, kotlin.b2> qVar = new yh.q<e<?>, SlotWriter, s1, kotlin.b2>() { // from class: androidx.compose.runtime.ComposerImpl$apply$operation$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
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
            /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v2 boolean
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
                */
            public final void a(@dl.d androidx.compose.runtime.e<?> r2, @dl.d androidx.compose.runtime.SlotWriter r3, @dl.d androidx.compose.runtime.s1 r4) {
                /*
                    r1 = this;
                    java.lang.String r0 = "applier"
                    kotlin.jvm.internal.f0.p(r2, r0)
                    java.lang.String r0 = "<anonymous parameter 1>"
                    kotlin.jvm.internal.f0.p(r3, r0)
                    java.lang.String r3 = "<anonymous parameter 2>"
                    kotlin.jvm.internal.f0.p(r4, r3)
                    yh.p<T, V, kotlin.b2> r3 = r1
                    java.lang.Object r2 = r2.getCurrent()
                    V r4 = r2
                    r3.invoke(r2, r4)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl$apply$operation$1.a(androidx.compose.runtime.e, androidx.compose.runtime.a2, androidx.compose.runtime.s1):void");
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(e<?> eVar, SlotWriter slotWriter, s1 s1Var) {
                a(eVar, slotWriter, s1Var);
                return kotlin.b2.f124493a;
            }
        };
        if (getInserting()) {
            G1(qVar);
        } else {
            B1(qVar);
        }
    }

    @Override // androidx.compose.runtime.p
    public void f() {
        I0(true);
    }

    @Override // androidx.compose.runtime.p
    public void g(@dl.d final yh.a<kotlin.b2> effect) {
        kotlin.jvm.internal.f0.p(effect, "effect");
        A1(new yh.q<e<?>, SlotWriter, s1, kotlin.b2>() { // from class: androidx.compose.runtime.ComposerImpl$recordSideEffect$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public final void a(@dl.d e<?> eVar, @dl.d SlotWriter slotWriter, @dl.d s1 rememberManager) {
                kotlin.jvm.internal.f0.p(eVar, "<anonymous parameter 0>");
                kotlin.jvm.internal.f0.p(slotWriter, "<anonymous parameter 1>");
                kotlin.jvm.internal.f0.p(rememberManager, "rememberManager");
                rememberManager.b(effect);
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(e<?> eVar, SlotWriter slotWriter, s1 s1Var) {
                a(eVar, slotWriter, s1Var);
                return kotlin.b2.f124493a;
            }
        });
    }

    @Override // androidx.compose.runtime.p
    public void h() {
        c2(125, null, true, null);
        this.nodeExpected = true;
    }

    public final boolean h2(@dl.d RecomposeScopeImpl scope, @dl.e Object instance) {
        kotlin.jvm.internal.f0.p(scope, "scope");
        androidx.compose.runtime.c anchor = scope.getAnchor();
        if (anchor == null) {
            return false;
        }
        int iD = anchor.d(this.slotTable);
        if (!this.isComposing || iD < this.reader.getCurrent()) {
            return false;
        }
        ComposerKt.f0(this.invalidations, iD, scope, instance);
        return true;
    }

    @Override // androidx.compose.runtime.p
    public void i(int i10, @dl.e Object obj) {
        if (this.reader.q() == i10 && !kotlin.jvm.internal.f0.g(this.reader.o(), obj) && this.reusingGroup < 0) {
            this.reusingGroup = this.reader.getCurrent();
            this.reusing = true;
        }
        c2(i10, null, false, obj);
    }

    @kotlin.r0
    public final void i2(@dl.e Object obj) {
        q2(obj);
    }

    @Override // androidx.compose.runtime.p
    @dl.e
    public Object j() {
        RecomposeScopeImpl recomposeScopeImplT0 = T0();
        if (recomposeScopeImplT0 != null) {
            return recomposeScopeImplT0.getAnchor();
        }
        return null;
    }

    /* JADX INFO: renamed from: j1, reason: from getter */
    public final boolean getIsComposing() {
        return this.isComposing;
    }

    @Override // androidx.compose.runtime.p
    @m
    public void k(@dl.d String sourceInformation) {
        kotlin.jvm.internal.f0.p(sourceInformation, "sourceInformation");
        if (getInserting()) {
            this.writer.o0(sourceInformation);
        }
    }

    /* JADX INFO: renamed from: k1, reason: from getter */
    public final boolean getIsDisposed() {
        return this.isDisposed;
    }

    @Override // androidx.compose.runtime.p
    @m
    public void l() {
        if (!(this.groupNodeCount == 0)) {
            ComposerKt.A("No nodes can be emitted before calling skipAndEndGroup".toString());
            throw new KotlinNothingValueException();
        }
        RecomposeScopeImpl recomposeScopeImplT0 = T0();
        if (recomposeScopeImplT0 != null) {
            recomposeScopeImplT0.z();
        }
        if (this.invalidations.isEmpty()) {
            b2();
        } else {
            z1();
        }
    }

    @kotlin.r0
    @dl.e
    public final Object l1() {
        if (!getInserting()) {
            return this.reusing ? p.INSTANCE.a() : this.reader.Q();
        }
        t2();
        return p.INSTANCE.a();
    }

    @Override // androidx.compose.runtime.p
    @m
    public void m(int i10, @dl.d String sourceInformation) {
        kotlin.jvm.internal.f0.p(sourceInformation, "sourceInformation");
        c2(i10, null, false, sourceInformation);
    }

    @Override // androidx.compose.runtime.p
    @dl.d
    /* JADX INFO: renamed from: n, reason: from getter */
    public z getComposition() {
        return this.composition;
    }

    @Override // androidx.compose.runtime.p
    public boolean o() {
        if (!this.providersInvalid) {
            RecomposeScopeImpl recomposeScopeImplT0 = T0();
            if (!(recomposeScopeImplT0 != null && recomposeScopeImplT0.n())) {
                return false;
            }
        }
        return true;
    }

    public final int o1() {
        if (getInserting()) {
            SlotWriter slotWriter = this.writer;
            return slotWriter.g0(slotWriter.getParent());
        }
        SlotReader slotReader = this.reader;
        return slotReader.H(slotReader.getParent());
    }

    @Override // androidx.compose.runtime.p
    public void p(@dl.d n1 scope) {
        kotlin.jvm.internal.f0.p(scope, "scope");
        RecomposeScopeImpl recomposeScopeImpl = scope instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) scope : null;
        if (recomposeScopeImpl == null) {
            return;
        }
        recomposeScopeImpl.G(true);
    }

    public final void p1(@dl.d yh.a<kotlin.b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        if (!(!this.isComposing)) {
            ComposerKt.A("Preparing a composition while composing is not supported".toString());
            throw new KotlinNothingValueException();
        }
        this.isComposing = true;
        try {
            block.invoke();
        } finally {
            this.isComposing = false;
        }
    }

    @Override // androidx.compose.runtime.p
    @dl.d
    public r q() {
        e2(206, ComposerKt.a0());
        if (getInserting()) {
            SlotWriter.x0(this.writer, 0, 1, null);
        }
        Object objL1 = l1();
        a aVar = objL1 instanceof a ? (a) objL1 : null;
        if (aVar == null) {
            aVar = new a(new b(getCompoundKeyHash(), this.forceRecomposeScopes));
            q2(aVar);
        }
        aVar.getRef().A(E0(this, null, 1, null));
        J0();
        return aVar.getRef();
    }

    @kotlin.r0
    public final void q2(@dl.e final Object obj) {
        if (!getInserting()) {
            final int iV = this.reader.v() - 1;
            if (obj instanceof t1) {
                this.abandonSet.add(obj);
            }
            O1(true, new yh.q<e<?>, SlotWriter, s1, kotlin.b2>() { // from class: androidx.compose.runtime.ComposerImpl$updateValue$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                public final void a(@dl.d e<?> eVar, @dl.d SlotWriter slots, @dl.d s1 rememberManager) {
                    RecomposeScopeImpl recomposeScopeImpl;
                    t composition;
                    kotlin.jvm.internal.f0.p(eVar, "<anonymous parameter 0>");
                    kotlin.jvm.internal.f0.p(slots, "slots");
                    kotlin.jvm.internal.f0.p(rememberManager, "rememberManager");
                    Object obj2 = obj;
                    if (obj2 instanceof t1) {
                        rememberManager.c((t1) obj2);
                    }
                    Object objX0 = slots.X0(iV, obj);
                    if (objX0 instanceof t1) {
                        rememberManager.a((t1) objX0);
                    } else {
                        if (!(objX0 instanceof RecomposeScopeImpl) || (composition = (recomposeScopeImpl = (RecomposeScopeImpl) objX0).getComposition()) == null) {
                            return;
                        }
                        recomposeScopeImpl.x();
                        composition.S(true);
                    }
                }

                @Override // yh.q
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(e<?> eVar, SlotWriter slotWriter, s1 s1Var) {
                    a(eVar, slotWriter, s1Var);
                    return kotlin.b2.f124493a;
                }
            });
            return;
        }
        this.writer.n1(obj);
        if (obj instanceof t1) {
            A1(new yh.q<e<?>, SlotWriter, s1, kotlin.b2>() { // from class: androidx.compose.runtime.ComposerImpl$updateValue$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                public final void a(@dl.d e<?> eVar, @dl.d SlotWriter slotWriter, @dl.d s1 rememberManager) {
                    kotlin.jvm.internal.f0.p(eVar, "<anonymous parameter 0>");
                    kotlin.jvm.internal.f0.p(slotWriter, "<anonymous parameter 1>");
                    kotlin.jvm.internal.f0.p(rememberManager, "rememberManager");
                    rememberManager.c((t1) obj);
                }

                @Override // yh.q
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(e<?> eVar, SlotWriter slotWriter, s1 s1Var) {
                    a(eVar, slotWriter, s1Var);
                    return kotlin.b2.f124493a;
                }
            });
            this.abandonSet.add(obj);
        }
    }

    @Override // androidx.compose.runtime.p
    @m
    public void r() {
        I0(false);
    }

    @Override // androidx.compose.runtime.p
    @m
    public boolean s(@dl.e Object value) {
        if (kotlin.jvm.internal.f0.g(l1(), value)) {
            return false;
        }
        q2(value);
        return true;
    }

    @Override // androidx.compose.runtime.p
    @o0
    public void t(@dl.d final k1<?>[] values) {
        u0.i<v<Object>, m2<Object>> iVarP2;
        boolean z10;
        kotlin.jvm.internal.f0.p(values, "values");
        final u0.i<v<Object>, ? extends m2<? extends Object>> iVarE0 = E0(this, null, 1, null);
        e2(201, ComposerKt.R());
        e2(203, ComposerKt.X());
        u0.i<v<Object>, ? extends m2<? extends Object>> iVar = (u0.i) androidx.compose.runtime.b.d(this, new yh.p<p, Integer, u0.i<v<Object>, ? extends m2<? extends Object>>>() { // from class: androidx.compose.runtime.ComposerImpl$startProviders$currentProviders$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @dl.d
            @h
            public final u0.i<v<Object>, m2<Object>> a(@dl.e p pVar, int i10) {
                pVar.T(935231726);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(935231726, i10, -1, "androidx.compose.runtime.ComposerImpl.startProviders.<anonymous> (Composer.kt:1893)");
                }
                u0.i<v<Object>, m2<Object>> iVarB = ComposerKt.B(values, iVarE0, pVar, 8);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return iVarB;
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ u0.i<v<Object>, ? extends m2<? extends Object>> invoke(p pVar, Integer num) {
                return a(pVar, num.intValue());
            }
        });
        J0();
        if (!getInserting()) {
            Object objF = this.reader.F(0);
            kotlin.jvm.internal.f0.n(objF, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            u0.i<v<Object>, m2<Object>> iVar2 = (u0.i) objF;
            Object objF2 = this.reader.F(1);
            kotlin.jvm.internal.f0.n(objF2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            u0.i iVar3 = (u0.i) objF2;
            if (b() && kotlin.jvm.internal.f0.g(iVar3, iVar)) {
                a2();
                iVarP2 = iVar2;
            } else {
                iVarP2 = p2(iVarE0, iVar);
                z10 = !kotlin.jvm.internal.f0.g(iVarP2, iVar2);
            }
            if (z10 && !getInserting()) {
                this.providerUpdates.put(Integer.valueOf(this.reader.getCurrent()), iVarP2);
            }
            this.providersInvalidStack.j(ComposerKt.w(this.providersInvalid));
            this.providersInvalid = z10;
            this.L = iVarP2;
            c2(202, ComposerKt.I(), false, iVarP2);
        }
        iVarP2 = p2(iVarE0, iVar);
        this.writerHasAProvider = true;
        z10 = false;
        if (z10) {
            this.providerUpdates.put(Integer.valueOf(this.reader.getCurrent()), iVarP2);
        }
        this.providersInvalidStack.j(ComposerKt.w(this.providersInvalid));
        this.providersInvalid = z10;
        this.L = iVarP2;
        c2(202, ComposerKt.I(), false, iVarP2);
    }

    @Override // androidx.compose.runtime.p
    @m
    public boolean u(boolean value) {
        Object objL1 = l1();
        if ((objL1 instanceof Boolean) && value == ((Boolean) objL1).booleanValue()) {
            return false;
        }
        q2(Boolean.valueOf(value));
        return true;
    }

    public final void u2() {
        this.insertTable.h0();
    }

    @Override // androidx.compose.runtime.p
    @m
    public boolean v(short value) {
        Object objL1 = l1();
        if ((objL1 instanceof Short) && value == ((Number) objL1).shortValue()) {
            return false;
        }
        q2(Short.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.p
    @m
    public boolean w(float value) {
        Object objL1 = l1();
        if (objL1 instanceof Float) {
            if (value == ((Number) objL1).floatValue()) {
                return false;
            }
        }
        q2(Float.valueOf(value));
        return true;
    }

    @m
    public final <T> T w0(boolean invalid, @dl.d yh.a<? extends T> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        T t10 = (T) l1();
        if (t10 != p.INSTANCE.a() && !invalid) {
            return t10;
        }
        T tInvoke = block.invoke();
        q2(tInvoke);
        return tInvoke;
    }

    public final boolean w1(@dl.d androidx.compose.runtime.collection.b<RecomposeScopeImpl, androidx.compose.runtime.collection.c<Object>> invalidationsRequested) {
        kotlin.jvm.internal.f0.p(invalidationsRequested, "invalidationsRequested");
        if (!this.changes.isEmpty()) {
            ComposerKt.A("Expected applyChanges() to have been called".toString());
            throw new KotlinNothingValueException();
        }
        if (!invalidationsRequested.k() && !(!this.invalidations.isEmpty()) && !this.forciblyRecompose) {
            return false;
        }
        G0(invalidationsRequested, null);
        return !this.changes.isEmpty();
    }

    @Override // androidx.compose.runtime.p
    public void x() {
        this.reusing = this.reusingGroup >= 0;
    }

    public final void x0() {
        this.providerUpdates.clear();
    }

    @Override // androidx.compose.runtime.p
    @m
    public boolean y(int value) {
        Object objL1 = l1();
        if ((objL1 instanceof Integer) && value == ((Number) objL1).intValue()) {
            return false;
        }
        q2(Integer.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.p
    @m
    public boolean z(long value) {
        Object objL1 = l1();
        if ((objL1 instanceof Long) && value == ((Number) objL1).longValue()) {
            return false;
        }
        q2(Long.valueOf(value));
        return true;
    }
}
