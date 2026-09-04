package androidx.compose.foundation.lazy;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.m0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.u1;
import com.max.xiaoheihe.module.bbs.ChannelListActivity;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyDsl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0088\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a®\u0001\u0010\u0011\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022%\b\n\u0010\t\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00042%\b\n\u0010\n\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000423\b\u0004\u0010\u0010\u001a-\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0087\u0001\u0010\u0013\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022%\b\n\u0010\t\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u000423\b\u0004\u0010\u0010\u001a-\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001aí\u0001\u0010\u0018\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022:\b\n\u0010\t\u001a4\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b2:\b\u0006\u0010\n\u001a4\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000b2H\b\u0004\u0010\u0010\u001aB\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a±\u0001\u0010\u001a\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022:\b\n\u0010\t\u001a4\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b2H\b\u0004\u0010\u0010\u001aB\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a®\u0001\u0010\u001d\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2%\b\n\u0010\t\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00042%\b\n\u0010\n\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000423\b\u0004\u0010\u0010\u001a-\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0087\u0001\u0010\u001f\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2%\b\n\u0010\t\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u000423\b\u0004\u0010\u0010\u001a-\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001aí\u0001\u0010!\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2:\b\n\u0010\t\u001a4\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b2:\b\u0006\u0010\n\u001a4\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000b2H\b\u0004\u0010\u0010\u001aB\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0086\bø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a±\u0001\u0010#\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2:\b\n\u0010\t\u001a4\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b2H\b\u0004\u0010\u0010\u001aB\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0087\bø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001ax\u00105\u001a\u00020\r2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u00102\u001a\u0002012\b\b\u0002\u00103\u001a\u00020+2\u0017\u00104\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b5\u00106\u001ax\u0010;\u001a\u00020\r2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u00108\u001a\u0002072\b\b\u0002\u0010:\u001a\u0002092\b\b\u0002\u00102\u001a\u0002012\b\b\u0002\u00103\u001a\u00020+2\u0017\u00104\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b;\u0010<\u001an\u0010=\u001a\u00020\r2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u00108\u001a\u0002072\b\b\u0002\u0010:\u001a\u0002092\b\b\u0002\u00102\u001a\u0002012\u0017\u00104\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b=\u0010>\u001an\u0010?\u001a\u00020\r2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u00102\u001a\u0002012\u0017\u00104\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b?\u0010@\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006A"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/foundation/lazy/w;", "", "items", "Lkotlin/Function1;", "Lkotlin/m0;", "name", ChannelListActivity.q.f79586f, "", "key", "contentType", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/g;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "Lkotlin/t;", "itemContent", "e", "(Landroidx/compose/foundation/lazy/w;Ljava/util/List;Lyh/l;Lyh/l;Lyh/r;)V", "f", "(Landroidx/compose/foundation/lazy/w;Ljava/util/List;Lyh/l;Lyh/r;)V", "", UCropPlusActivity.ARG_INDEX, "Lkotlin/Function3;", "m", "(Landroidx/compose/foundation/lazy/w;Ljava/util/List;Lyh/p;Lyh/p;Lyh/s;)V", "n", "(Landroidx/compose/foundation/lazy/w;Ljava/util/List;Lyh/p;Lyh/s;)V", "", "g", "(Landroidx/compose/foundation/lazy/w;[Ljava/lang/Object;Lyh/l;Lyh/l;Lyh/r;)V", RXScreenCaptureService.KEY_HEIGHT, "(Landroidx/compose/foundation/lazy/w;[Ljava/lang/Object;Lyh/l;Lyh/r;)V", "o", "(Landroidx/compose/foundation/lazy/w;[Ljava/lang/Object;Lyh/p;Lyh/p;Lyh/s;)V", "p", "(Landroidx/compose/foundation/lazy/w;[Ljava/lang/Object;Lyh/p;Lyh/s;)V", "Landroidx/compose/ui/n;", "modifier", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "Landroidx/compose/foundation/layout/m0;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/layout/Arrangement$d;", "horizontalArrangement", "Landroidx/compose/ui/c$c;", "verticalAlignment", "Landroidx/compose/foundation/gestures/g;", "flingBehavior", "userScrollEnabled", "content", "d", "(Landroidx/compose/ui/n;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/m0;ZLandroidx/compose/foundation/layout/Arrangement$d;Landroidx/compose/ui/c$c;Landroidx/compose/foundation/gestures/g;ZLyh/l;Landroidx/compose/runtime/p;II)V", "Landroidx/compose/foundation/layout/Arrangement$l;", "verticalArrangement", "Landroidx/compose/ui/c$b;", "horizontalAlignment", "b", "(Landroidx/compose/ui/n;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/m0;ZLandroidx/compose/foundation/layout/Arrangement$l;Landroidx/compose/ui/c$b;Landroidx/compose/foundation/gestures/g;ZLyh/l;Landroidx/compose/runtime/p;II)V", ak.av, "(Landroidx/compose/ui/n;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/m0;ZLandroidx/compose/foundation/layout/Arrangement$l;Landroidx/compose/ui/c$b;Landroidx/compose/foundation/gestures/g;Lyh/l;Landroidx/compose/runtime/p;II)V", ak.aF, "(Landroidx/compose/ui/n;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/m0;ZLandroidx/compose/foundation/layout/Arrangement$d;Landroidx/compose/ui/c$c;Landroidx/compose/foundation/gestures/g;Lyh/l;Landroidx/compose/runtime/p;II)V", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class LazyDslKt {
    /* JADX WARN: Code duplicated, block: B:109:0x0150 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x0152  */
    /* JADX WARN: Code duplicated, block: B:111:0x0155  */
    /* JADX WARN: Code duplicated, block: B:114:0x015e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0165  */
    /* JADX WARN: Code duplicated, block: B:117:0x0168  */
    /* JADX WARN: Code duplicated, block: B:119:0x0174  */
    /* JADX WARN: Code duplicated, block: B:122:0x0179  */
    /* JADX WARN: Code duplicated, block: B:124:0x017d  */
    /* JADX WARN: Code duplicated, block: B:125:0x0182  */
    /* JADX WARN: Code duplicated, block: B:128:0x018b  */
    /* JADX WARN: Code duplicated, block: B:131:0x0196  */
    /* JADX WARN: Code duplicated, block: B:132:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:136:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:139:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:144:0x0212  */
    /* JADX WARN: Code duplicated, block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:89:0x0102  */
    /* JADX WARN: Code duplicated, block: B:93:0x0117  */
    /* JADX WARN: Code duplicated, block: B:95:0x0122  */
    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    @androidx.compose.runtime.h
    public static final /* synthetic */ void a(androidx.compose.ui.n nVar, LazyListState lazyListState, m0 m0Var, boolean z10, Arrangement.l lVar, androidx.compose.ui.c.b bVar, androidx.compose.foundation.gestures.g gVar, final yh.l content, androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        LazyListState lazyListState2;
        m0 m0VarA;
        int i13;
        boolean z11;
        int i14;
        Arrangement.l lVar2;
        int i15;
        androidx.compose.ui.c.b bVarU;
        int i16;
        int i17;
        androidx.compose.ui.n nVar2;
        androidx.compose.ui.n nVar3;
        LazyListState lazyListStateA;
        androidx.compose.foundation.gestures.g gVarA;
        LazyListState lazyListState3;
        Arrangement arrangement;
        Arrangement.l lVarD;
        final androidx.compose.ui.n nVar4;
        final LazyListState lazyListState4;
        final m0 m0Var2;
        final boolean z12;
        final Arrangement.l lVar3;
        final androidx.compose.ui.c.b bVar2;
        final androidx.compose.foundation.gestures.g gVar2;
        u1 u1VarH;
        int i18;
        f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(-563353797);
        int i19 = i11 & 1;
        if (i19 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.s(nVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            if ((i11 & 2) == 0) {
                lazyListState2 = lazyListState;
                int i20 = pVarF.s(lazyListState2) ? 32 : 16;
                i12 |= i20;
            } else {
                lazyListState2 = lazyListState;
            }
            i12 |= i20;
        } else {
            lazyListState2 = lazyListState;
        }
        int i21 = i11 & 4;
        if (i21 == 0) {
            if ((i10 & bb.c.b.f30796me) == 0) {
                m0VarA = m0Var;
                i12 |= pVarF.s(m0VarA) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & bb.c.g.f32954lc) == 0) {
                    z11 = z10;
                    if (pVarF.u(z11)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((i10 & 57344) == 0) {
                    if ((i11 & 16) == 0) {
                        lVar2 = lVar;
                        int i22 = pVarF.s(lVar2) ? 16384 : 8192;
                        i12 |= i22;
                    } else {
                        lVar2 = lVar;
                    }
                    i12 |= i22;
                } else {
                    lVar2 = lVar;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    i12 |= androidx.profileinstaller.o.c.f26824k;
                    bVarU = bVar;
                } else {
                    bVarU = bVar;
                    if ((i10 & 458752) == 0) {
                        if (pVarF.s(bVarU)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0 || !pVarF.s(gVar)) {
                        i18 = 524288;
                    } else {
                        i18 = 1048576;
                    }
                    i12 |= i18;
                }
                if ((i11 & 128) != 0) {
                    i12 |= 12582912;
                } else if ((29360128 & i10) == 0) {
                    if (pVarF.s(content)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i12 |= i17;
                }
                if ((23967451 & i12) == 4793490 || !pVarF.b()) {
                    pVarF.W();
                    if ((i10 & 1) != 0 || pVarF.o()) {
                        if (i19 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        nVar3 = nVar2;
                        if ((i11 & 2) != 0) {
                            lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= com.ss.android.ttvecamera.o.f97695q;
                        } else {
                            lazyListStateA = lazyListState2;
                        }
                        if (i21 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        }
                        if (i13 != 0) {
                            z11 = false;
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z11) {
                                lVarD = arrangement.d();
                            } else {
                                lVarD = arrangement.r();
                            }
                            i12 &= -57345;
                            lVar2 = lVarD;
                        }
                        if (i15 != 0) {
                            bVarU = androidx.compose.ui.c.INSTANCE.u();
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        } else {
                            gVarA = gVar;
                        }
                        lazyListState3 = lazyListStateA;
                    } else {
                        pVarF.l();
                        if ((i11 & 2) != 0) {
                            i12 &= com.ss.android.ttvecamera.o.f97695q;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                        }
                        nVar3 = nVar;
                        gVarA = gVar;
                        lazyListState3 = lazyListState2;
                    }
                    m0 m0Var3 = m0VarA;
                    boolean z13 = z11;
                    androidx.compose.ui.c.b bVar3 = bVarU;
                    Arrangement.l lVar4 = lVar2;
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-563353797, i12, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:373)");
                    }
                    b(nVar3, lazyListState3, m0Var3, z13, lVar4, bVar3, gVarA, true, content, pVarF, (i12 & 14) | 12582912 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (234881024 & (i12 << 3)), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    lazyListState4 = lazyListState3;
                    m0Var2 = m0Var3;
                    z12 = z13;
                    lVar3 = lVar4;
                    bVar2 = bVar3;
                    gVar2 = gVarA;
                } else {
                    pVarF.l();
                    nVar4 = nVar;
                    gVar2 = gVar;
                    lazyListState4 = lazyListState2;
                    m0Var2 = m0VarA;
                    z12 = z11;
                    bVar2 = bVarU;
                    lVar3 = lVar2;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i23) {
                        LazyDslKt.a(nVar4, lazyListState4, m0Var2, z12, lVar3, bVar2, gVar2, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= bb.c.d.f31193dj;
            z11 = z10;
            if ((i10 & 57344) == 0) {
                if ((i11 & 16) == 0) {
                    lVar2 = lVar;
                    if (pVarF.s(lVar2)) {
                    }
                    i12 |= i22;
                } else {
                    lVar2 = lVar;
                }
                i12 |= i22;
            } else {
                lVar2 = lVar;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                i12 |= androidx.profileinstaller.o.c.f26824k;
                bVarU = bVar;
            } else {
                bVarU = bVar;
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(bVarU)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
            }
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i18 = 524288;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            if ((i11 & 128) != 0) {
                i12 |= 12582912;
            } else if ((29360128 & i10) == 0) {
                if (pVarF.s(content)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i12 |= i17;
            }
            if ((23967451 & i12) == 4793490) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    nVar3 = nVar2;
                    if ((i11 & 2) != 0) {
                        lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    } else {
                        lazyListStateA = lazyListState2;
                    }
                    if (i21 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z11) {
                            lVarD = arrangement.r();
                        } else {
                            lVarD = arrangement.d();
                        }
                        i12 &= -57345;
                        lVar2 = lVarD;
                    }
                    if (i15 != 0) {
                        bVarU = androidx.compose.ui.c.INSTANCE.u();
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    } else {
                        gVarA = gVar;
                    }
                    lazyListState3 = lazyListStateA;
                } else {
                    if (i19 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    nVar3 = nVar2;
                    if ((i11 & 2) != 0) {
                        lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    } else {
                        lazyListStateA = lazyListState2;
                    }
                    if (i21 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z11) {
                            lVarD = arrangement.r();
                        } else {
                            lVarD = arrangement.d();
                        }
                        i12 &= -57345;
                        lVar2 = lVarD;
                    }
                    if (i15 != 0) {
                        bVarU = androidx.compose.ui.c.INSTANCE.u();
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    } else {
                        gVarA = gVar;
                    }
                    lazyListState3 = lazyListStateA;
                }
                m0 m0Var4 = m0VarA;
                boolean z14 = z11;
                androidx.compose.ui.c.b bVar4 = bVarU;
                Arrangement.l lVar5 = lVar2;
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-563353797, i12, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:373)");
                }
                b(nVar3, lazyListState3, m0Var4, z14, lVar5, bVar4, gVarA, true, content, pVarF, (i12 & 14) | 12582912 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (234881024 & (i12 << 3)), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                lazyListState4 = lazyListState3;
                m0Var2 = m0Var4;
                z12 = z14;
                lVar3 = lVar5;
                bVar2 = bVar4;
                gVar2 = gVarA;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    nVar3 = nVar2;
                    if ((i11 & 2) != 0) {
                        lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    } else {
                        lazyListStateA = lazyListState2;
                    }
                    if (i21 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z11) {
                            lVarD = arrangement.r();
                        } else {
                            lVarD = arrangement.d();
                        }
                        i12 &= -57345;
                        lVar2 = lVarD;
                    }
                    if (i15 != 0) {
                        bVarU = androidx.compose.ui.c.INSTANCE.u();
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    } else {
                        gVarA = gVar;
                    }
                    lazyListState3 = lazyListStateA;
                } else {
                    if (i19 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    nVar3 = nVar2;
                    if ((i11 & 2) != 0) {
                        lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    } else {
                        lazyListStateA = lazyListState2;
                    }
                    if (i21 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z11) {
                            lVarD = arrangement.r();
                        } else {
                            lVarD = arrangement.d();
                        }
                        i12 &= -57345;
                        lVar2 = lVarD;
                    }
                    if (i15 != 0) {
                        bVarU = androidx.compose.ui.c.INSTANCE.u();
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    } else {
                        gVarA = gVar;
                    }
                    lazyListState3 = lazyListStateA;
                }
                m0 m0Var5 = m0VarA;
                boolean z15 = z11;
                androidx.compose.ui.c.b bVar5 = bVarU;
                Arrangement.l lVar6 = lVar2;
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-563353797, i12, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:373)");
                }
                b(nVar3, lazyListState3, m0Var5, z15, lVar6, bVar5, gVarA, true, content, pVarF, (i12 & 14) | 12582912 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (234881024 & (i12 << 3)), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                lazyListState4 = lazyListState3;
                m0Var2 = m0Var5;
                z12 = z15;
                lVar3 = lVar6;
                bVar2 = bVar5;
                gVar2 = gVarA;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i23) {
                    LazyDslKt.a(nVar4, lazyListState4, m0Var2, z12, lVar3, bVar2, gVar2, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= bb.c.b.f30966u4;
        m0VarA = m0Var;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & bb.c.g.f32954lc) == 0) {
                z11 = z10;
                if (pVarF.u(z11)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((i10 & 57344) == 0) {
                if ((i11 & 16) == 0) {
                    lVar2 = lVar;
                    if (pVarF.s(lVar2)) {
                    }
                    i12 |= i22;
                } else {
                    lVar2 = lVar;
                }
                i12 |= i22;
            } else {
                lVar2 = lVar;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                i12 |= androidx.profileinstaller.o.c.f26824k;
                bVarU = bVar;
            } else {
                bVarU = bVar;
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(bVarU)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
            }
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i18 = 524288;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            if ((i11 & 128) != 0) {
                i12 |= 12582912;
            } else if ((29360128 & i10) == 0) {
                if (pVarF.s(content)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i12 |= i17;
            }
            if ((23967451 & i12) == 4793490) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    nVar3 = nVar2;
                    if ((i11 & 2) != 0) {
                        lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    } else {
                        lazyListStateA = lazyListState2;
                    }
                    if (i21 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z11) {
                            lVarD = arrangement.r();
                        } else {
                            lVarD = arrangement.d();
                        }
                        i12 &= -57345;
                        lVar2 = lVarD;
                    }
                    if (i15 != 0) {
                        bVarU = androidx.compose.ui.c.INSTANCE.u();
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    } else {
                        gVarA = gVar;
                    }
                    lazyListState3 = lazyListStateA;
                } else {
                    if (i19 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    nVar3 = nVar2;
                    if ((i11 & 2) != 0) {
                        lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    } else {
                        lazyListStateA = lazyListState2;
                    }
                    if (i21 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z11) {
                            lVarD = arrangement.r();
                        } else {
                            lVarD = arrangement.d();
                        }
                        i12 &= -57345;
                        lVar2 = lVarD;
                    }
                    if (i15 != 0) {
                        bVarU = androidx.compose.ui.c.INSTANCE.u();
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    } else {
                        gVarA = gVar;
                    }
                    lazyListState3 = lazyListStateA;
                }
                m0 m0Var6 = m0VarA;
                boolean z16 = z11;
                androidx.compose.ui.c.b bVar6 = bVarU;
                Arrangement.l lVar7 = lVar2;
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-563353797, i12, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:373)");
                }
                b(nVar3, lazyListState3, m0Var6, z16, lVar7, bVar6, gVarA, true, content, pVarF, (i12 & 14) | 12582912 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (234881024 & (i12 << 3)), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                lazyListState4 = lazyListState3;
                m0Var2 = m0Var6;
                z12 = z16;
                lVar3 = lVar7;
                bVar2 = bVar6;
                gVar2 = gVarA;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    nVar3 = nVar2;
                    if ((i11 & 2) != 0) {
                        lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    } else {
                        lazyListStateA = lazyListState2;
                    }
                    if (i21 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z11) {
                            lVarD = arrangement.r();
                        } else {
                            lVarD = arrangement.d();
                        }
                        i12 &= -57345;
                        lVar2 = lVarD;
                    }
                    if (i15 != 0) {
                        bVarU = androidx.compose.ui.c.INSTANCE.u();
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    } else {
                        gVarA = gVar;
                    }
                    lazyListState3 = lazyListStateA;
                } else {
                    if (i19 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    nVar3 = nVar2;
                    if ((i11 & 2) != 0) {
                        lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    } else {
                        lazyListStateA = lazyListState2;
                    }
                    if (i21 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z11) {
                            lVarD = arrangement.r();
                        } else {
                            lVarD = arrangement.d();
                        }
                        i12 &= -57345;
                        lVar2 = lVarD;
                    }
                    if (i15 != 0) {
                        bVarU = androidx.compose.ui.c.INSTANCE.u();
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    } else {
                        gVarA = gVar;
                    }
                    lazyListState3 = lazyListStateA;
                }
                m0 m0Var7 = m0VarA;
                boolean z17 = z11;
                androidx.compose.ui.c.b bVar7 = bVarU;
                Arrangement.l lVar8 = lVar2;
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-563353797, i12, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:373)");
                }
                b(nVar3, lazyListState3, m0Var7, z17, lVar8, bVar7, gVarA, true, content, pVarF, (i12 & 14) | 12582912 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (234881024 & (i12 << 3)), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                lazyListState4 = lazyListState3;
                m0Var2 = m0Var7;
                z12 = z17;
                lVar3 = lVar8;
                bVar2 = bVar7;
                gVar2 = gVarA;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i23) {
                    LazyDslKt.a(nVar4, lazyListState4, m0Var2, z12, lVar3, bVar2, gVar2, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= bb.c.d.f31193dj;
        z11 = z10;
        if ((i10 & 57344) == 0) {
            if ((i11 & 16) == 0) {
                lVar2 = lVar;
                if (pVarF.s(lVar2)) {
                }
                i12 |= i22;
            } else {
                lVar2 = lVar;
            }
            i12 |= i22;
        } else {
            lVar2 = lVar;
        }
        i15 = i11 & 32;
        if (i15 != 0) {
            i12 |= androidx.profileinstaller.o.c.f26824k;
            bVarU = bVar;
        } else {
            bVarU = bVar;
            if ((i10 & 458752) == 0) {
                if (pVarF.s(bVarU)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
        }
        if ((i10 & 3670016) != 0) {
            if ((i11 & 64) == 0) {
                i18 = 524288;
            } else {
                i18 = 524288;
            }
            i12 |= i18;
        }
        if ((i11 & 128) != 0) {
            i12 |= 12582912;
        } else if ((29360128 & i10) == 0) {
            if (pVarF.s(content)) {
                i17 = 8388608;
            } else {
                i17 = 4194304;
            }
            i12 |= i17;
        }
        if ((23967451 & i12) == 4793490) {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i19 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                nVar3 = nVar2;
                if ((i11 & 2) != 0) {
                    lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                    i12 &= com.ss.android.ttvecamera.o.f97695q;
                } else {
                    lazyListStateA = lazyListState2;
                }
                if (i21 != 0) {
                    m0VarA = PaddingKt.a(s1.h.g(0));
                }
                if (i13 != 0) {
                    z11 = false;
                }
                if ((i11 & 16) != 0) {
                    arrangement = Arrangement.f5896a;
                    if (z11) {
                        lVarD = arrangement.r();
                    } else {
                        lVarD = arrangement.d();
                    }
                    i12 &= -57345;
                    lVar2 = lVarD;
                }
                if (i15 != 0) {
                    bVarU = androidx.compose.ui.c.INSTANCE.u();
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                } else {
                    gVarA = gVar;
                }
                lazyListState3 = lazyListStateA;
            } else {
                if (i19 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                nVar3 = nVar2;
                if ((i11 & 2) != 0) {
                    lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                    i12 &= com.ss.android.ttvecamera.o.f97695q;
                } else {
                    lazyListStateA = lazyListState2;
                }
                if (i21 != 0) {
                    m0VarA = PaddingKt.a(s1.h.g(0));
                }
                if (i13 != 0) {
                    z11 = false;
                }
                if ((i11 & 16) != 0) {
                    arrangement = Arrangement.f5896a;
                    if (z11) {
                        lVarD = arrangement.r();
                    } else {
                        lVarD = arrangement.d();
                    }
                    i12 &= -57345;
                    lVar2 = lVarD;
                }
                if (i15 != 0) {
                    bVarU = androidx.compose.ui.c.INSTANCE.u();
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                } else {
                    gVarA = gVar;
                }
                lazyListState3 = lazyListStateA;
            }
            m0 m0Var8 = m0VarA;
            boolean z18 = z11;
            androidx.compose.ui.c.b bVar8 = bVarU;
            Arrangement.l lVar9 = lVar2;
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-563353797, i12, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:373)");
            }
            b(nVar3, lazyListState3, m0Var8, z18, lVar9, bVar8, gVarA, true, content, pVarF, (i12 & 14) | 12582912 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (234881024 & (i12 << 3)), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            lazyListState4 = lazyListState3;
            m0Var2 = m0Var8;
            z12 = z18;
            lVar3 = lVar9;
            bVar2 = bVar8;
            gVar2 = gVarA;
        } else {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i19 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                nVar3 = nVar2;
                if ((i11 & 2) != 0) {
                    lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                    i12 &= com.ss.android.ttvecamera.o.f97695q;
                } else {
                    lazyListStateA = lazyListState2;
                }
                if (i21 != 0) {
                    m0VarA = PaddingKt.a(s1.h.g(0));
                }
                if (i13 != 0) {
                    z11 = false;
                }
                if ((i11 & 16) != 0) {
                    arrangement = Arrangement.f5896a;
                    if (z11) {
                        lVarD = arrangement.r();
                    } else {
                        lVarD = arrangement.d();
                    }
                    i12 &= -57345;
                    lVar2 = lVarD;
                }
                if (i15 != 0) {
                    bVarU = androidx.compose.ui.c.INSTANCE.u();
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                } else {
                    gVarA = gVar;
                }
                lazyListState3 = lazyListStateA;
            } else {
                if (i19 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                nVar3 = nVar2;
                if ((i11 & 2) != 0) {
                    lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                    i12 &= com.ss.android.ttvecamera.o.f97695q;
                } else {
                    lazyListStateA = lazyListState2;
                }
                if (i21 != 0) {
                    m0VarA = PaddingKt.a(s1.h.g(0));
                }
                if (i13 != 0) {
                    z11 = false;
                }
                if ((i11 & 16) != 0) {
                    arrangement = Arrangement.f5896a;
                    if (z11) {
                        lVarD = arrangement.r();
                    } else {
                        lVarD = arrangement.d();
                    }
                    i12 &= -57345;
                    lVar2 = lVarD;
                }
                if (i15 != 0) {
                    bVarU = androidx.compose.ui.c.INSTANCE.u();
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                } else {
                    gVarA = gVar;
                }
                lazyListState3 = lazyListStateA;
            }
            m0 m0Var9 = m0VarA;
            boolean z19 = z11;
            androidx.compose.ui.c.b bVar9 = bVarU;
            Arrangement.l lVar10 = lVar2;
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-563353797, i12, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:373)");
            }
            b(nVar3, lazyListState3, m0Var9, z19, lVar10, bVar9, gVarA, true, content, pVarF, (i12 & 14) | 12582912 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (234881024 & (i12 << 3)), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            lazyListState4 = lazyListState3;
            m0Var2 = m0Var9;
            z12 = z19;
            lVar3 = lVar10;
            bVar2 = bVar9;
            gVar2 = gVarA;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i23) {
                LazyDslKt.a(nVar4, lazyListState4, m0Var2, z12, lVar3, bVar2, gVar2, content, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:103:0x013b  */
    /* JADX WARN: Code duplicated, block: B:105:0x0145  */
    /* JADX WARN: Code duplicated, block: B:118:0x0174 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0176  */
    /* JADX WARN: Code duplicated, block: B:120:0x0179  */
    /* JADX WARN: Code duplicated, block: B:123:0x0180  */
    /* JADX WARN: Code duplicated, block: B:124:0x0188  */
    /* JADX WARN: Code duplicated, block: B:126:0x018c  */
    /* JADX WARN: Code duplicated, block: B:127:0x0196  */
    /* JADX WARN: Code duplicated, block: B:130:0x019a  */
    /* JADX WARN: Code duplicated, block: B:133:0x019f  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:138:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:141:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:145:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:147:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:148:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:152:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:155:0x0243  */
    /* JADX WARN: Code duplicated, block: B:160:0x025d  */
    /* JADX WARN: Code duplicated, block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00af  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00be  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:89:0x0104  */
    /* JADX WARN: Code duplicated, block: B:91:0x0108  */
    /* JADX WARN: Code duplicated, block: B:93:0x010c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0112  */
    /* JADX WARN: Code duplicated, block: B:96:0x0115  */
    /* JADX WARN: Code duplicated, block: B:99:0x0121  */
    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public static final void b(@dl.e androidx.compose.ui.n nVar, @dl.e LazyListState lazyListState, @dl.e m0 m0Var, boolean z10, @dl.e Arrangement.l lVar, @dl.e androidx.compose.ui.c.b bVar, @dl.e androidx.compose.foundation.gestures.g gVar, boolean z11, @dl.d final yh.l<? super w, b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        m0 m0Var2;
        int i13;
        boolean z12;
        int i14;
        Arrangement.l lVar2;
        int i15;
        androidx.compose.ui.c.b bVar2;
        int i16;
        int i17;
        int i18;
        int i19;
        androidx.compose.ui.n nVar2;
        LazyListState lazyListStateA;
        m0 m0VarA;
        boolean z13;
        Arrangement.l lVarD;
        androidx.compose.ui.c.b bVarU;
        androidx.compose.foundation.gestures.g gVarA;
        boolean z14;
        androidx.compose.ui.n nVar3;
        LazyListState lazyListState2;
        boolean z15;
        m0 m0Var3;
        Arrangement.l lVar3;
        androidx.compose.ui.c.b bVar3;
        androidx.compose.foundation.gestures.g gVar2;
        Arrangement arrangement;
        final androidx.compose.ui.n nVar4;
        final LazyListState lazyListState3;
        final m0 m0Var4;
        final boolean z16;
        final Arrangement.l lVar4;
        final androidx.compose.ui.c.b bVar4;
        final androidx.compose.foundation.gestures.g gVar3;
        final boolean z17;
        u1 u1VarH;
        int i20;
        f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(-740714857);
        int i21 = i11 & 1;
        if (i21 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.s(nVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            i12 |= ((i11 & 2) == 0 && pVarF.s(lazyListState)) ? 32 : 16;
        }
        int i22 = i11 & 4;
        if (i22 == 0) {
            if ((i10 & bb.c.b.f30796me) == 0) {
                m0Var2 = m0Var;
                i12 |= pVarF.s(m0Var2) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & bb.c.g.f32954lc) == 0) {
                    z12 = z10;
                    if (pVarF.u(z12)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((57344 & i10) == 0) {
                    if ((i11 & 16) == 0) {
                        lVar2 = lVar;
                        int i23 = pVarF.s(lVar2) ? 16384 : 8192;
                        i12 |= i23;
                    } else {
                        lVar2 = lVar;
                    }
                    i12 |= i23;
                } else {
                    lVar2 = lVar;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    i12 |= androidx.profileinstaller.o.c.f26824k;
                    bVar2 = bVar;
                } else {
                    bVar2 = bVar;
                    if ((i10 & 458752) == 0) {
                        if (pVarF.s(bVar2)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0 || !pVarF.s(gVar)) {
                        i20 = 524288;
                    } else {
                        i20 = 1048576;
                    }
                    i12 |= i20;
                }
                i17 = i11 & 128;
                if (i17 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (pVarF.u(z11)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
                if ((i11 & 256) != 0) {
                    if ((i10 & 234881024) == 0) {
                        if (pVarF.s(content)) {
                            i19 = 67108864;
                        } else {
                            i19 = 33554432;
                        }
                    }
                    if ((191739611 & i12) == 38347922 || !pVarF.b()) {
                        pVarF.W();
                        if ((i10 & 1) != 0 || pVarF.o()) {
                            if (i21 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i11 & 2) != 0) {
                                lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= com.ss.android.ttvecamera.o.f97695q;
                            } else {
                                lazyListStateA = lazyListState;
                            }
                            if (i22 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            z13 = i13 == 0 ? z12 : false;
                            if ((i11 & 16) != 0) {
                                arrangement = Arrangement.f5896a;
                                if (z13) {
                                    lVarD = arrangement.d();
                                } else {
                                    lVarD = arrangement.r();
                                }
                                i12 &= -57345;
                            } else {
                                lVarD = lVar2;
                            }
                            if (i15 != 0) {
                                bVarU = androidx.compose.ui.c.INSTANCE.u();
                            } else {
                                bVarU = bVar2;
                            }
                            if ((i11 & 64) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 &= -3670017;
                            } else {
                                gVarA = gVar;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            nVar3 = nVar2;
                            lazyListState2 = lazyListStateA;
                            z15 = z13;
                            m0Var3 = m0VarA;
                            lVar3 = lVarD;
                            bVar3 = bVarU;
                            gVar2 = gVarA;
                        } else {
                            pVarF.l();
                            if ((i11 & 2) != 0) {
                                i12 &= com.ss.android.ttvecamera.o.f97695q;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                            }
                            nVar3 = nVar;
                            lazyListState2 = lazyListState;
                            gVar2 = gVar;
                            z14 = z11;
                            m0Var3 = m0Var2;
                            z15 = z12;
                            lVar3 = lVar2;
                            bVar3 = bVar2;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-740714857, i12, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
                        }
                        int i24 = i12 >> 3;
                        LazyListKt.a(nVar3, lazyListState2, m0Var3, z15, true, gVar2, z14, bVar3, lVar3, null, null, content, pVarF, (i12 & 14) | 24576 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (458752 & i24) | (i24 & 3670016) | ((i12 << 6) & 29360128) | ((i12 << 12) & 234881024), (i12 >> 21) & 112, bb.c.b.Cq);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        lazyListState3 = lazyListState2;
                        m0Var4 = m0Var3;
                        z16 = z15;
                        lVar4 = lVar3;
                        bVar4 = bVar3;
                        gVar3 = gVar2;
                        z17 = z14;
                    } else {
                        pVarF.l();
                        nVar4 = nVar;
                        lazyListState3 = lazyListState;
                        gVar3 = gVar;
                        m0Var4 = m0Var2;
                        z16 = z12;
                        lVar4 = lVar2;
                        bVar4 = bVar2;
                        z17 = z11;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i25) {
                            LazyDslKt.b(nVar4, lazyListState3, m0Var4, z16, lVar4, bVar4, gVar3, z17, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i19 = 100663296;
                i12 |= i19;
                if ((191739611 & i12) == 38347922) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= com.ss.android.ttvecamera.o.f97695q;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                lVarD = arrangement.r();
                            } else {
                                lVarD = arrangement.d();
                            }
                            i12 &= -57345;
                        } else {
                            lVarD = lVar2;
                        }
                        if (i15 != 0) {
                            bVarU = androidx.compose.ui.c.INSTANCE.u();
                        } else {
                            bVarU = bVar2;
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            gVarA = gVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        nVar3 = nVar2;
                        lazyListState2 = lazyListStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        lVar3 = lVarD;
                        bVar3 = bVarU;
                        gVar2 = gVarA;
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= com.ss.android.ttvecamera.o.f97695q;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                lVarD = arrangement.r();
                            } else {
                                lVarD = arrangement.d();
                            }
                            i12 &= -57345;
                        } else {
                            lVarD = lVar2;
                        }
                        if (i15 != 0) {
                            bVarU = androidx.compose.ui.c.INSTANCE.u();
                        } else {
                            bVarU = bVar2;
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            gVarA = gVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        nVar3 = nVar2;
                        lazyListState2 = lazyListStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        lVar3 = lVarD;
                        bVar3 = bVarU;
                        gVar2 = gVarA;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-740714857, i12, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
                    }
                    int i25 = i12 >> 3;
                    LazyListKt.a(nVar3, lazyListState2, m0Var3, z15, true, gVar2, z14, bVar3, lVar3, null, null, content, pVarF, (i12 & 14) | 24576 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (458752 & i25) | (i25 & 3670016) | ((i12 << 6) & 29360128) | ((i12 << 12) & 234881024), (i12 >> 21) & 112, bb.c.b.Cq);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    lazyListState3 = lazyListState2;
                    m0Var4 = m0Var3;
                    z16 = z15;
                    lVar4 = lVar3;
                    bVar4 = bVar3;
                    gVar3 = gVar2;
                    z17 = z14;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= com.ss.android.ttvecamera.o.f97695q;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                lVarD = arrangement.r();
                            } else {
                                lVarD = arrangement.d();
                            }
                            i12 &= -57345;
                        } else {
                            lVarD = lVar2;
                        }
                        if (i15 != 0) {
                            bVarU = androidx.compose.ui.c.INSTANCE.u();
                        } else {
                            bVarU = bVar2;
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            gVarA = gVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        nVar3 = nVar2;
                        lazyListState2 = lazyListStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        lVar3 = lVarD;
                        bVar3 = bVarU;
                        gVar2 = gVarA;
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= com.ss.android.ttvecamera.o.f97695q;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                lVarD = arrangement.r();
                            } else {
                                lVarD = arrangement.d();
                            }
                            i12 &= -57345;
                        } else {
                            lVarD = lVar2;
                        }
                        if (i15 != 0) {
                            bVarU = androidx.compose.ui.c.INSTANCE.u();
                        } else {
                            bVarU = bVar2;
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            gVarA = gVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        nVar3 = nVar2;
                        lazyListState2 = lazyListStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        lVar3 = lVarD;
                        bVar3 = bVarU;
                        gVar2 = gVarA;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-740714857, i12, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
                    }
                    int i26 = i12 >> 3;
                    LazyListKt.a(nVar3, lazyListState2, m0Var3, z15, true, gVar2, z14, bVar3, lVar3, null, null, content, pVarF, (i12 & 14) | 24576 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (458752 & i26) | (i26 & 3670016) | ((i12 << 6) & 29360128) | ((i12 << 12) & 234881024), (i12 >> 21) & 112, bb.c.b.Cq);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    lazyListState3 = lazyListState2;
                    m0Var4 = m0Var3;
                    z16 = z15;
                    lVar4 = lVar3;
                    bVar4 = bVar3;
                    gVar3 = gVar2;
                    z17 = z14;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i27) {
                        LazyDslKt.b(nVar4, lazyListState3, m0Var4, z16, lVar4, bVar4, gVar3, z17, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= bb.c.d.f31193dj;
            z12 = z10;
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    lVar2 = lVar;
                    if (pVarF.s(lVar2)) {
                    }
                    i12 |= i23;
                } else {
                    lVar2 = lVar;
                }
                i12 |= i23;
            } else {
                lVar2 = lVar;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                i12 |= androidx.profileinstaller.o.c.f26824k;
                bVar2 = bVar;
            } else {
                bVar2 = bVar;
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(bVar2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
            }
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            }
            i17 = i11 & 128;
            if (i17 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (pVarF.u(z11)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            }
            if ((i11 & 256) != 0) {
                if ((i10 & 234881024) == 0) {
                    if (pVarF.s(content)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                }
                if ((191739611 & i12) == 38347922) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= com.ss.android.ttvecamera.o.f97695q;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                lVarD = arrangement.r();
                            } else {
                                lVarD = arrangement.d();
                            }
                            i12 &= -57345;
                        } else {
                            lVarD = lVar2;
                        }
                        if (i15 != 0) {
                            bVarU = androidx.compose.ui.c.INSTANCE.u();
                        } else {
                            bVarU = bVar2;
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            gVarA = gVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        nVar3 = nVar2;
                        lazyListState2 = lazyListStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        lVar3 = lVarD;
                        bVar3 = bVarU;
                        gVar2 = gVarA;
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= com.ss.android.ttvecamera.o.f97695q;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                lVarD = arrangement.r();
                            } else {
                                lVarD = arrangement.d();
                            }
                            i12 &= -57345;
                        } else {
                            lVarD = lVar2;
                        }
                        if (i15 != 0) {
                            bVarU = androidx.compose.ui.c.INSTANCE.u();
                        } else {
                            bVarU = bVar2;
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            gVarA = gVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        nVar3 = nVar2;
                        lazyListState2 = lazyListStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        lVar3 = lVarD;
                        bVar3 = bVarU;
                        gVar2 = gVarA;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-740714857, i12, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
                    }
                    int i27 = i12 >> 3;
                    LazyListKt.a(nVar3, lazyListState2, m0Var3, z15, true, gVar2, z14, bVar3, lVar3, null, null, content, pVarF, (i12 & 14) | 24576 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (458752 & i27) | (i27 & 3670016) | ((i12 << 6) & 29360128) | ((i12 << 12) & 234881024), (i12 >> 21) & 112, bb.c.b.Cq);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    lazyListState3 = lazyListState2;
                    m0Var4 = m0Var3;
                    z16 = z15;
                    lVar4 = lVar3;
                    bVar4 = bVar3;
                    gVar3 = gVar2;
                    z17 = z14;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= com.ss.android.ttvecamera.o.f97695q;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                lVarD = arrangement.r();
                            } else {
                                lVarD = arrangement.d();
                            }
                            i12 &= -57345;
                        } else {
                            lVarD = lVar2;
                        }
                        if (i15 != 0) {
                            bVarU = androidx.compose.ui.c.INSTANCE.u();
                        } else {
                            bVarU = bVar2;
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            gVarA = gVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        nVar3 = nVar2;
                        lazyListState2 = lazyListStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        lVar3 = lVarD;
                        bVar3 = bVarU;
                        gVar2 = gVarA;
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= com.ss.android.ttvecamera.o.f97695q;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                lVarD = arrangement.r();
                            } else {
                                lVarD = arrangement.d();
                            }
                            i12 &= -57345;
                        } else {
                            lVarD = lVar2;
                        }
                        if (i15 != 0) {
                            bVarU = androidx.compose.ui.c.INSTANCE.u();
                        } else {
                            bVarU = bVar2;
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            gVarA = gVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        nVar3 = nVar2;
                        lazyListState2 = lazyListStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        lVar3 = lVarD;
                        bVar3 = bVarU;
                        gVar2 = gVarA;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-740714857, i12, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
                    }
                    int i28 = i12 >> 3;
                    LazyListKt.a(nVar3, lazyListState2, m0Var3, z15, true, gVar2, z14, bVar3, lVar3, null, null, content, pVarF, (i12 & 14) | 24576 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (458752 & i28) | (i28 & 3670016) | ((i12 << 6) & 29360128) | ((i12 << 12) & 234881024), (i12 >> 21) & 112, bb.c.b.Cq);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    lazyListState3 = lazyListState2;
                    m0Var4 = m0Var3;
                    z16 = z15;
                    lVar4 = lVar3;
                    bVar4 = bVar3;
                    gVar3 = gVar2;
                    z17 = z14;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i29) {
                        LazyDslKt.b(nVar4, lazyListState3, m0Var4, z16, lVar4, bVar4, gVar3, z17, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i19 = 100663296;
            i12 |= i19;
            if ((191739611 & i12) == 38347922) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            lVarD = arrangement.r();
                        } else {
                            lVarD = arrangement.d();
                        }
                        i12 &= -57345;
                    } else {
                        lVarD = lVar2;
                    }
                    if (i15 != 0) {
                        bVarU = androidx.compose.ui.c.INSTANCE.u();
                    } else {
                        bVarU = bVar2;
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -3670017;
                    } else {
                        gVarA = gVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    nVar3 = nVar2;
                    lazyListState2 = lazyListStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    lVar3 = lVarD;
                    bVar3 = bVarU;
                    gVar2 = gVarA;
                } else {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            lVarD = arrangement.r();
                        } else {
                            lVarD = arrangement.d();
                        }
                        i12 &= -57345;
                    } else {
                        lVarD = lVar2;
                    }
                    if (i15 != 0) {
                        bVarU = androidx.compose.ui.c.INSTANCE.u();
                    } else {
                        bVarU = bVar2;
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -3670017;
                    } else {
                        gVarA = gVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    nVar3 = nVar2;
                    lazyListState2 = lazyListStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    lVar3 = lVarD;
                    bVar3 = bVarU;
                    gVar2 = gVarA;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-740714857, i12, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
                }
                int i29 = i12 >> 3;
                LazyListKt.a(nVar3, lazyListState2, m0Var3, z15, true, gVar2, z14, bVar3, lVar3, null, null, content, pVarF, (i12 & 14) | 24576 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (458752 & i29) | (i29 & 3670016) | ((i12 << 6) & 29360128) | ((i12 << 12) & 234881024), (i12 >> 21) & 112, bb.c.b.Cq);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                lazyListState3 = lazyListState2;
                m0Var4 = m0Var3;
                z16 = z15;
                lVar4 = lVar3;
                bVar4 = bVar3;
                gVar3 = gVar2;
                z17 = z14;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            lVarD = arrangement.r();
                        } else {
                            lVarD = arrangement.d();
                        }
                        i12 &= -57345;
                    } else {
                        lVarD = lVar2;
                    }
                    if (i15 != 0) {
                        bVarU = androidx.compose.ui.c.INSTANCE.u();
                    } else {
                        bVarU = bVar2;
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -3670017;
                    } else {
                        gVarA = gVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    nVar3 = nVar2;
                    lazyListState2 = lazyListStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    lVar3 = lVarD;
                    bVar3 = bVarU;
                    gVar2 = gVarA;
                } else {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            lVarD = arrangement.r();
                        } else {
                            lVarD = arrangement.d();
                        }
                        i12 &= -57345;
                    } else {
                        lVarD = lVar2;
                    }
                    if (i15 != 0) {
                        bVarU = androidx.compose.ui.c.INSTANCE.u();
                    } else {
                        bVarU = bVar2;
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -3670017;
                    } else {
                        gVarA = gVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    nVar3 = nVar2;
                    lazyListState2 = lazyListStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    lVar3 = lVarD;
                    bVar3 = bVarU;
                    gVar2 = gVarA;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-740714857, i12, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
                }
                int i210 = i12 >> 3;
                LazyListKt.a(nVar3, lazyListState2, m0Var3, z15, true, gVar2, z14, bVar3, lVar3, null, null, content, pVarF, (i12 & 14) | 24576 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (458752 & i210) | (i210 & 3670016) | ((i12 << 6) & 29360128) | ((i12 << 12) & 234881024), (i12 >> 21) & 112, bb.c.b.Cq);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                lazyListState3 = lazyListState2;
                m0Var4 = m0Var3;
                z16 = z15;
                lVar4 = lVar3;
                bVar4 = bVar3;
                gVar3 = gVar2;
                z17 = z14;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i211) {
                    LazyDslKt.b(nVar4, lazyListState3, m0Var4, z16, lVar4, bVar4, gVar3, z17, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= bb.c.b.f30966u4;
        m0Var2 = m0Var;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & bb.c.g.f32954lc) == 0) {
                z12 = z10;
                if (pVarF.u(z12)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    lVar2 = lVar;
                    if (pVarF.s(lVar2)) {
                    }
                    i12 |= i23;
                } else {
                    lVar2 = lVar;
                }
                i12 |= i23;
            } else {
                lVar2 = lVar;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                i12 |= androidx.profileinstaller.o.c.f26824k;
                bVar2 = bVar;
            } else {
                bVar2 = bVar;
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(bVar2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
            }
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            }
            i17 = i11 & 128;
            if (i17 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (pVarF.u(z11)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            }
            if ((i11 & 256) != 0) {
                if ((i10 & 234881024) == 0) {
                    if (pVarF.s(content)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                }
                if ((191739611 & i12) == 38347922) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= com.ss.android.ttvecamera.o.f97695q;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                lVarD = arrangement.r();
                            } else {
                                lVarD = arrangement.d();
                            }
                            i12 &= -57345;
                        } else {
                            lVarD = lVar2;
                        }
                        if (i15 != 0) {
                            bVarU = androidx.compose.ui.c.INSTANCE.u();
                        } else {
                            bVarU = bVar2;
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            gVarA = gVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        nVar3 = nVar2;
                        lazyListState2 = lazyListStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        lVar3 = lVarD;
                        bVar3 = bVarU;
                        gVar2 = gVarA;
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= com.ss.android.ttvecamera.o.f97695q;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                lVarD = arrangement.r();
                            } else {
                                lVarD = arrangement.d();
                            }
                            i12 &= -57345;
                        } else {
                            lVarD = lVar2;
                        }
                        if (i15 != 0) {
                            bVarU = androidx.compose.ui.c.INSTANCE.u();
                        } else {
                            bVarU = bVar2;
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            gVarA = gVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        nVar3 = nVar2;
                        lazyListState2 = lazyListStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        lVar3 = lVarD;
                        bVar3 = bVarU;
                        gVar2 = gVarA;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-740714857, i12, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
                    }
                    int i211 = i12 >> 3;
                    LazyListKt.a(nVar3, lazyListState2, m0Var3, z15, true, gVar2, z14, bVar3, lVar3, null, null, content, pVarF, (i12 & 14) | 24576 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (458752 & i211) | (i211 & 3670016) | ((i12 << 6) & 29360128) | ((i12 << 12) & 234881024), (i12 >> 21) & 112, bb.c.b.Cq);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    lazyListState3 = lazyListState2;
                    m0Var4 = m0Var3;
                    z16 = z15;
                    lVar4 = lVar3;
                    bVar4 = bVar3;
                    gVar3 = gVar2;
                    z17 = z14;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= com.ss.android.ttvecamera.o.f97695q;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                lVarD = arrangement.r();
                            } else {
                                lVarD = arrangement.d();
                            }
                            i12 &= -57345;
                        } else {
                            lVarD = lVar2;
                        }
                        if (i15 != 0) {
                            bVarU = androidx.compose.ui.c.INSTANCE.u();
                        } else {
                            bVarU = bVar2;
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            gVarA = gVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        nVar3 = nVar2;
                        lazyListState2 = lazyListStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        lVar3 = lVarD;
                        bVar3 = bVarU;
                        gVar2 = gVarA;
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= com.ss.android.ttvecamera.o.f97695q;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                lVarD = arrangement.r();
                            } else {
                                lVarD = arrangement.d();
                            }
                            i12 &= -57345;
                        } else {
                            lVarD = lVar2;
                        }
                        if (i15 != 0) {
                            bVarU = androidx.compose.ui.c.INSTANCE.u();
                        } else {
                            bVarU = bVar2;
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            gVarA = gVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        nVar3 = nVar2;
                        lazyListState2 = lazyListStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        lVar3 = lVarD;
                        bVar3 = bVarU;
                        gVar2 = gVarA;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-740714857, i12, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
                    }
                    int i212 = i12 >> 3;
                    LazyListKt.a(nVar3, lazyListState2, m0Var3, z15, true, gVar2, z14, bVar3, lVar3, null, null, content, pVarF, (i12 & 14) | 24576 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (458752 & i212) | (i212 & 3670016) | ((i12 << 6) & 29360128) | ((i12 << 12) & 234881024), (i12 >> 21) & 112, bb.c.b.Cq);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    lazyListState3 = lazyListState2;
                    m0Var4 = m0Var3;
                    z16 = z15;
                    lVar4 = lVar3;
                    bVar4 = bVar3;
                    gVar3 = gVar2;
                    z17 = z14;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i213) {
                        LazyDslKt.b(nVar4, lazyListState3, m0Var4, z16, lVar4, bVar4, gVar3, z17, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i19 = 100663296;
            i12 |= i19;
            if ((191739611 & i12) == 38347922) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            lVarD = arrangement.r();
                        } else {
                            lVarD = arrangement.d();
                        }
                        i12 &= -57345;
                    } else {
                        lVarD = lVar2;
                    }
                    if (i15 != 0) {
                        bVarU = androidx.compose.ui.c.INSTANCE.u();
                    } else {
                        bVarU = bVar2;
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -3670017;
                    } else {
                        gVarA = gVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    nVar3 = nVar2;
                    lazyListState2 = lazyListStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    lVar3 = lVarD;
                    bVar3 = bVarU;
                    gVar2 = gVarA;
                } else {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            lVarD = arrangement.r();
                        } else {
                            lVarD = arrangement.d();
                        }
                        i12 &= -57345;
                    } else {
                        lVarD = lVar2;
                    }
                    if (i15 != 0) {
                        bVarU = androidx.compose.ui.c.INSTANCE.u();
                    } else {
                        bVarU = bVar2;
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -3670017;
                    } else {
                        gVarA = gVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    nVar3 = nVar2;
                    lazyListState2 = lazyListStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    lVar3 = lVarD;
                    bVar3 = bVarU;
                    gVar2 = gVarA;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-740714857, i12, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
                }
                int i213 = i12 >> 3;
                LazyListKt.a(nVar3, lazyListState2, m0Var3, z15, true, gVar2, z14, bVar3, lVar3, null, null, content, pVarF, (i12 & 14) | 24576 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (458752 & i213) | (i213 & 3670016) | ((i12 << 6) & 29360128) | ((i12 << 12) & 234881024), (i12 >> 21) & 112, bb.c.b.Cq);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                lazyListState3 = lazyListState2;
                m0Var4 = m0Var3;
                z16 = z15;
                lVar4 = lVar3;
                bVar4 = bVar3;
                gVar3 = gVar2;
                z17 = z14;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            lVarD = arrangement.r();
                        } else {
                            lVarD = arrangement.d();
                        }
                        i12 &= -57345;
                    } else {
                        lVarD = lVar2;
                    }
                    if (i15 != 0) {
                        bVarU = androidx.compose.ui.c.INSTANCE.u();
                    } else {
                        bVarU = bVar2;
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -3670017;
                    } else {
                        gVarA = gVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    nVar3 = nVar2;
                    lazyListState2 = lazyListStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    lVar3 = lVarD;
                    bVar3 = bVarU;
                    gVar2 = gVarA;
                } else {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            lVarD = arrangement.r();
                        } else {
                            lVarD = arrangement.d();
                        }
                        i12 &= -57345;
                    } else {
                        lVarD = lVar2;
                    }
                    if (i15 != 0) {
                        bVarU = androidx.compose.ui.c.INSTANCE.u();
                    } else {
                        bVarU = bVar2;
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -3670017;
                    } else {
                        gVarA = gVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    nVar3 = nVar2;
                    lazyListState2 = lazyListStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    lVar3 = lVarD;
                    bVar3 = bVarU;
                    gVar2 = gVarA;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-740714857, i12, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
                }
                int i214 = i12 >> 3;
                LazyListKt.a(nVar3, lazyListState2, m0Var3, z15, true, gVar2, z14, bVar3, lVar3, null, null, content, pVarF, (i12 & 14) | 24576 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (458752 & i214) | (i214 & 3670016) | ((i12 << 6) & 29360128) | ((i12 << 12) & 234881024), (i12 >> 21) & 112, bb.c.b.Cq);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                lazyListState3 = lazyListState2;
                m0Var4 = m0Var3;
                z16 = z15;
                lVar4 = lVar3;
                bVar4 = bVar3;
                gVar3 = gVar2;
                z17 = z14;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i215) {
                    LazyDslKt.b(nVar4, lazyListState3, m0Var4, z16, lVar4, bVar4, gVar3, z17, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= bb.c.d.f31193dj;
        z12 = z10;
        if ((57344 & i10) == 0) {
            if ((i11 & 16) == 0) {
                lVar2 = lVar;
                if (pVarF.s(lVar2)) {
                }
                i12 |= i23;
            } else {
                lVar2 = lVar;
            }
            i12 |= i23;
        } else {
            lVar2 = lVar;
        }
        i15 = i11 & 32;
        if (i15 != 0) {
            i12 |= androidx.profileinstaller.o.c.f26824k;
            bVar2 = bVar;
        } else {
            bVar2 = bVar;
            if ((i10 & 458752) == 0) {
                if (pVarF.s(bVar2)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
        }
        if ((i10 & 3670016) != 0) {
            if ((i11 & 64) == 0) {
                i20 = 524288;
            } else {
                i20 = 524288;
            }
            i12 |= i20;
        }
        i17 = i11 & 128;
        if (i17 != 0) {
            i12 |= 12582912;
        } else if ((i10 & 29360128) == 0) {
            if (pVarF.u(z11)) {
                i18 = 8388608;
            } else {
                i18 = 4194304;
            }
            i12 |= i18;
        }
        if ((i11 & 256) != 0) {
            if ((i10 & 234881024) == 0) {
                if (pVarF.s(content)) {
                    i19 = 67108864;
                } else {
                    i19 = 33554432;
                }
            }
            if ((191739611 & i12) == 38347922) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            lVarD = arrangement.r();
                        } else {
                            lVarD = arrangement.d();
                        }
                        i12 &= -57345;
                    } else {
                        lVarD = lVar2;
                    }
                    if (i15 != 0) {
                        bVarU = androidx.compose.ui.c.INSTANCE.u();
                    } else {
                        bVarU = bVar2;
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -3670017;
                    } else {
                        gVarA = gVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    nVar3 = nVar2;
                    lazyListState2 = lazyListStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    lVar3 = lVarD;
                    bVar3 = bVarU;
                    gVar2 = gVarA;
                } else {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            lVarD = arrangement.r();
                        } else {
                            lVarD = arrangement.d();
                        }
                        i12 &= -57345;
                    } else {
                        lVarD = lVar2;
                    }
                    if (i15 != 0) {
                        bVarU = androidx.compose.ui.c.INSTANCE.u();
                    } else {
                        bVarU = bVar2;
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -3670017;
                    } else {
                        gVarA = gVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    nVar3 = nVar2;
                    lazyListState2 = lazyListStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    lVar3 = lVarD;
                    bVar3 = bVarU;
                    gVar2 = gVarA;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-740714857, i12, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
                }
                int i215 = i12 >> 3;
                LazyListKt.a(nVar3, lazyListState2, m0Var3, z15, true, gVar2, z14, bVar3, lVar3, null, null, content, pVarF, (i12 & 14) | 24576 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (458752 & i215) | (i215 & 3670016) | ((i12 << 6) & 29360128) | ((i12 << 12) & 234881024), (i12 >> 21) & 112, bb.c.b.Cq);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                lazyListState3 = lazyListState2;
                m0Var4 = m0Var3;
                z16 = z15;
                lVar4 = lVar3;
                bVar4 = bVar3;
                gVar3 = gVar2;
                z17 = z14;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            lVarD = arrangement.r();
                        } else {
                            lVarD = arrangement.d();
                        }
                        i12 &= -57345;
                    } else {
                        lVarD = lVar2;
                    }
                    if (i15 != 0) {
                        bVarU = androidx.compose.ui.c.INSTANCE.u();
                    } else {
                        bVarU = bVar2;
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -3670017;
                    } else {
                        gVarA = gVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    nVar3 = nVar2;
                    lazyListState2 = lazyListStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    lVar3 = lVarD;
                    bVar3 = bVarU;
                    gVar2 = gVarA;
                } else {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            lVarD = arrangement.r();
                        } else {
                            lVarD = arrangement.d();
                        }
                        i12 &= -57345;
                    } else {
                        lVarD = lVar2;
                    }
                    if (i15 != 0) {
                        bVarU = androidx.compose.ui.c.INSTANCE.u();
                    } else {
                        bVarU = bVar2;
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -3670017;
                    } else {
                        gVarA = gVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    nVar3 = nVar2;
                    lazyListState2 = lazyListStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    lVar3 = lVarD;
                    bVar3 = bVarU;
                    gVar2 = gVarA;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-740714857, i12, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
                }
                int i216 = i12 >> 3;
                LazyListKt.a(nVar3, lazyListState2, m0Var3, z15, true, gVar2, z14, bVar3, lVar3, null, null, content, pVarF, (i12 & 14) | 24576 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (458752 & i216) | (i216 & 3670016) | ((i12 << 6) & 29360128) | ((i12 << 12) & 234881024), (i12 >> 21) & 112, bb.c.b.Cq);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                lazyListState3 = lazyListState2;
                m0Var4 = m0Var3;
                z16 = z15;
                lVar4 = lVar3;
                bVar4 = bVar3;
                gVar3 = gVar2;
                z17 = z14;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i217) {
                    LazyDslKt.b(nVar4, lazyListState3, m0Var4, z16, lVar4, bVar4, gVar3, z17, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i19 = 100663296;
        i12 |= i19;
        if ((191739611 & i12) == 38347922) {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i21 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if ((i11 & 2) != 0) {
                    lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                    i12 &= com.ss.android.ttvecamera.o.f97695q;
                } else {
                    lazyListStateA = lazyListState;
                }
                if (i22 != 0) {
                    m0VarA = PaddingKt.a(s1.h.g(0));
                } else {
                    m0VarA = m0Var2;
                }
                if (i13 == 0) {
                }
                if ((i11 & 16) != 0) {
                    arrangement = Arrangement.f5896a;
                    if (z13) {
                        lVarD = arrangement.r();
                    } else {
                        lVarD = arrangement.d();
                    }
                    i12 &= -57345;
                } else {
                    lVarD = lVar2;
                }
                if (i15 != 0) {
                    bVarU = androidx.compose.ui.c.INSTANCE.u();
                } else {
                    bVarU = bVar2;
                }
                if ((i11 & 64) != 0) {
                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    i12 &= -3670017;
                } else {
                    gVarA = gVar;
                }
                if (i17 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                nVar3 = nVar2;
                lazyListState2 = lazyListStateA;
                z15 = z13;
                m0Var3 = m0VarA;
                lVar3 = lVarD;
                bVar3 = bVarU;
                gVar2 = gVarA;
            } else {
                if (i21 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if ((i11 & 2) != 0) {
                    lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                    i12 &= com.ss.android.ttvecamera.o.f97695q;
                } else {
                    lazyListStateA = lazyListState;
                }
                if (i22 != 0) {
                    m0VarA = PaddingKt.a(s1.h.g(0));
                } else {
                    m0VarA = m0Var2;
                }
                if (i13 == 0) {
                }
                if ((i11 & 16) != 0) {
                    arrangement = Arrangement.f5896a;
                    if (z13) {
                        lVarD = arrangement.r();
                    } else {
                        lVarD = arrangement.d();
                    }
                    i12 &= -57345;
                } else {
                    lVarD = lVar2;
                }
                if (i15 != 0) {
                    bVarU = androidx.compose.ui.c.INSTANCE.u();
                } else {
                    bVarU = bVar2;
                }
                if ((i11 & 64) != 0) {
                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    i12 &= -3670017;
                } else {
                    gVarA = gVar;
                }
                if (i17 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                nVar3 = nVar2;
                lazyListState2 = lazyListStateA;
                z15 = z13;
                m0Var3 = m0VarA;
                lVar3 = lVarD;
                bVar3 = bVarU;
                gVar2 = gVarA;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-740714857, i12, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
            }
            int i217 = i12 >> 3;
            LazyListKt.a(nVar3, lazyListState2, m0Var3, z15, true, gVar2, z14, bVar3, lVar3, null, null, content, pVarF, (i12 & 14) | 24576 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (458752 & i217) | (i217 & 3670016) | ((i12 << 6) & 29360128) | ((i12 << 12) & 234881024), (i12 >> 21) & 112, bb.c.b.Cq);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            lazyListState3 = lazyListState2;
            m0Var4 = m0Var3;
            z16 = z15;
            lVar4 = lVar3;
            bVar4 = bVar3;
            gVar3 = gVar2;
            z17 = z14;
        } else {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i21 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if ((i11 & 2) != 0) {
                    lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                    i12 &= com.ss.android.ttvecamera.o.f97695q;
                } else {
                    lazyListStateA = lazyListState;
                }
                if (i22 != 0) {
                    m0VarA = PaddingKt.a(s1.h.g(0));
                } else {
                    m0VarA = m0Var2;
                }
                if (i13 == 0) {
                }
                if ((i11 & 16) != 0) {
                    arrangement = Arrangement.f5896a;
                    if (z13) {
                        lVarD = arrangement.r();
                    } else {
                        lVarD = arrangement.d();
                    }
                    i12 &= -57345;
                } else {
                    lVarD = lVar2;
                }
                if (i15 != 0) {
                    bVarU = androidx.compose.ui.c.INSTANCE.u();
                } else {
                    bVarU = bVar2;
                }
                if ((i11 & 64) != 0) {
                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    i12 &= -3670017;
                } else {
                    gVarA = gVar;
                }
                if (i17 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                nVar3 = nVar2;
                lazyListState2 = lazyListStateA;
                z15 = z13;
                m0Var3 = m0VarA;
                lVar3 = lVarD;
                bVar3 = bVarU;
                gVar2 = gVarA;
            } else {
                if (i21 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if ((i11 & 2) != 0) {
                    lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                    i12 &= com.ss.android.ttvecamera.o.f97695q;
                } else {
                    lazyListStateA = lazyListState;
                }
                if (i22 != 0) {
                    m0VarA = PaddingKt.a(s1.h.g(0));
                } else {
                    m0VarA = m0Var2;
                }
                if (i13 == 0) {
                }
                if ((i11 & 16) != 0) {
                    arrangement = Arrangement.f5896a;
                    if (z13) {
                        lVarD = arrangement.r();
                    } else {
                        lVarD = arrangement.d();
                    }
                    i12 &= -57345;
                } else {
                    lVarD = lVar2;
                }
                if (i15 != 0) {
                    bVarU = androidx.compose.ui.c.INSTANCE.u();
                } else {
                    bVarU = bVar2;
                }
                if ((i11 & 64) != 0) {
                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    i12 &= -3670017;
                } else {
                    gVarA = gVar;
                }
                if (i17 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                nVar3 = nVar2;
                lazyListState2 = lazyListStateA;
                z15 = z13;
                m0Var3 = m0VarA;
                lVar3 = lVarD;
                bVar3 = bVarU;
                gVar2 = gVarA;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-740714857, i12, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
            }
            int i218 = i12 >> 3;
            LazyListKt.a(nVar3, lazyListState2, m0Var3, z15, true, gVar2, z14, bVar3, lVar3, null, null, content, pVarF, (i12 & 14) | 24576 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (458752 & i218) | (i218 & 3670016) | ((i12 << 6) & 29360128) | ((i12 << 12) & 234881024), (i12 >> 21) & 112, bb.c.b.Cq);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            lazyListState3 = lazyListState2;
            m0Var4 = m0Var3;
            z16 = z15;
            lVar4 = lVar3;
            bVar4 = bVar3;
            gVar3 = gVar2;
            z17 = z14;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i219) {
                LazyDslKt.b(nVar4, lazyListState3, m0Var4, z16, lVar4, bVar4, gVar3, z17, content, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0150 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x0152  */
    /* JADX WARN: Code duplicated, block: B:111:0x0155  */
    /* JADX WARN: Code duplicated, block: B:114:0x015e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0165  */
    /* JADX WARN: Code duplicated, block: B:117:0x0168  */
    /* JADX WARN: Code duplicated, block: B:119:0x0174  */
    /* JADX WARN: Code duplicated, block: B:122:0x0179  */
    /* JADX WARN: Code duplicated, block: B:124:0x017d  */
    /* JADX WARN: Code duplicated, block: B:125:0x0182  */
    /* JADX WARN: Code duplicated, block: B:128:0x018b  */
    /* JADX WARN: Code duplicated, block: B:131:0x0196  */
    /* JADX WARN: Code duplicated, block: B:132:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:136:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:139:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:144:0x0212  */
    /* JADX WARN: Code duplicated, block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:89:0x0102  */
    /* JADX WARN: Code duplicated, block: B:93:0x0117  */
    /* JADX WARN: Code duplicated, block: B:95:0x0122  */
    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    @androidx.compose.runtime.h
    public static final /* synthetic */ void c(androidx.compose.ui.n nVar, LazyListState lazyListState, m0 m0Var, boolean z10, Arrangement.d dVar, androidx.compose.ui.c.InterfaceC0079c interfaceC0079c, androidx.compose.foundation.gestures.g gVar, final yh.l content, androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        LazyListState lazyListState2;
        m0 m0VarA;
        int i13;
        boolean z11;
        int i14;
        Arrangement.d dVar2;
        int i15;
        androidx.compose.ui.c.InterfaceC0079c interfaceC0079cW;
        int i16;
        int i17;
        androidx.compose.ui.n nVar2;
        androidx.compose.ui.n nVar3;
        LazyListState lazyListStateA;
        androidx.compose.foundation.gestures.g gVarA;
        LazyListState lazyListState3;
        Arrangement arrangement;
        Arrangement.d dVarH;
        final androidx.compose.ui.n nVar4;
        final LazyListState lazyListState4;
        final m0 m0Var2;
        final boolean z12;
        final Arrangement.d dVar3;
        final androidx.compose.ui.c.InterfaceC0079c interfaceC0079c2;
        final androidx.compose.foundation.gestures.g gVar2;
        u1 u1VarH;
        int i18;
        f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(407929823);
        int i19 = i11 & 1;
        if (i19 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.s(nVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            if ((i11 & 2) == 0) {
                lazyListState2 = lazyListState;
                int i20 = pVarF.s(lazyListState2) ? 32 : 16;
                i12 |= i20;
            } else {
                lazyListState2 = lazyListState;
            }
            i12 |= i20;
        } else {
            lazyListState2 = lazyListState;
        }
        int i21 = i11 & 4;
        if (i21 == 0) {
            if ((i10 & bb.c.b.f30796me) == 0) {
                m0VarA = m0Var;
                i12 |= pVarF.s(m0VarA) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & bb.c.g.f32954lc) == 0) {
                    z11 = z10;
                    if (pVarF.u(z11)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((i10 & 57344) == 0) {
                    if ((i11 & 16) == 0) {
                        dVar2 = dVar;
                        int i22 = pVarF.s(dVar2) ? 16384 : 8192;
                        i12 |= i22;
                    } else {
                        dVar2 = dVar;
                    }
                    i12 |= i22;
                } else {
                    dVar2 = dVar;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    i12 |= androidx.profileinstaller.o.c.f26824k;
                    interfaceC0079cW = interfaceC0079c;
                } else {
                    interfaceC0079cW = interfaceC0079c;
                    if ((i10 & 458752) == 0) {
                        if (pVarF.s(interfaceC0079cW)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0 || !pVarF.s(gVar)) {
                        i18 = 524288;
                    } else {
                        i18 = 1048576;
                    }
                    i12 |= i18;
                }
                if ((i11 & 128) != 0) {
                    i12 |= 12582912;
                } else if ((29360128 & i10) == 0) {
                    if (pVarF.s(content)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i12 |= i17;
                }
                if ((23967451 & i12) == 4793490 || !pVarF.b()) {
                    pVarF.W();
                    if ((i10 & 1) != 0 || pVarF.o()) {
                        if (i19 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        nVar3 = nVar2;
                        if ((i11 & 2) != 0) {
                            lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= com.ss.android.ttvecamera.o.f97695q;
                        } else {
                            lazyListStateA = lazyListState2;
                        }
                        if (i21 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        }
                        if (i13 != 0) {
                            z11 = false;
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z11) {
                                dVarH = arrangement.h();
                            } else {
                                dVarH = arrangement.p();
                            }
                            i12 &= -57345;
                            dVar2 = dVarH;
                        }
                        if (i15 != 0) {
                            interfaceC0079cW = androidx.compose.ui.c.INSTANCE.w();
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        } else {
                            gVarA = gVar;
                        }
                        lazyListState3 = lazyListStateA;
                    } else {
                        pVarF.l();
                        if ((i11 & 2) != 0) {
                            i12 &= com.ss.android.ttvecamera.o.f97695q;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                        }
                        nVar3 = nVar;
                        gVarA = gVar;
                        lazyListState3 = lazyListState2;
                    }
                    m0 m0Var3 = m0VarA;
                    boolean z13 = z11;
                    androidx.compose.ui.c.InterfaceC0079c interfaceC0079c3 = interfaceC0079cW;
                    Arrangement.d dVar4 = dVar2;
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(407929823, i12, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:399)");
                    }
                    d(nVar3, lazyListState3, m0Var3, z13, dVar4, interfaceC0079c3, gVarA, true, content, pVarF, (i12 & 14) | 12582912 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (234881024 & (i12 << 3)), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    lazyListState4 = lazyListState3;
                    m0Var2 = m0Var3;
                    z12 = z13;
                    dVar3 = dVar4;
                    interfaceC0079c2 = interfaceC0079c3;
                    gVar2 = gVarA;
                } else {
                    pVarF.l();
                    nVar4 = nVar;
                    gVar2 = gVar;
                    lazyListState4 = lazyListState2;
                    m0Var2 = m0VarA;
                    z12 = z11;
                    interfaceC0079c2 = interfaceC0079cW;
                    dVar3 = dVar2;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i23) {
                        LazyDslKt.c(nVar4, lazyListState4, m0Var2, z12, dVar3, interfaceC0079c2, gVar2, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= bb.c.d.f31193dj;
            z11 = z10;
            if ((i10 & 57344) == 0) {
                if ((i11 & 16) == 0) {
                    dVar2 = dVar;
                    if (pVarF.s(dVar2)) {
                    }
                    i12 |= i22;
                } else {
                    dVar2 = dVar;
                }
                i12 |= i22;
            } else {
                dVar2 = dVar;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                i12 |= androidx.profileinstaller.o.c.f26824k;
                interfaceC0079cW = interfaceC0079c;
            } else {
                interfaceC0079cW = interfaceC0079c;
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(interfaceC0079cW)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
            }
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i18 = 524288;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            if ((i11 & 128) != 0) {
                i12 |= 12582912;
            } else if ((29360128 & i10) == 0) {
                if (pVarF.s(content)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i12 |= i17;
            }
            if ((23967451 & i12) == 4793490) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    nVar3 = nVar2;
                    if ((i11 & 2) != 0) {
                        lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    } else {
                        lazyListStateA = lazyListState2;
                    }
                    if (i21 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z11) {
                            dVarH = arrangement.p();
                        } else {
                            dVarH = arrangement.h();
                        }
                        i12 &= -57345;
                        dVar2 = dVarH;
                    }
                    if (i15 != 0) {
                        interfaceC0079cW = androidx.compose.ui.c.INSTANCE.w();
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    } else {
                        gVarA = gVar;
                    }
                    lazyListState3 = lazyListStateA;
                } else {
                    if (i19 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    nVar3 = nVar2;
                    if ((i11 & 2) != 0) {
                        lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    } else {
                        lazyListStateA = lazyListState2;
                    }
                    if (i21 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z11) {
                            dVarH = arrangement.p();
                        } else {
                            dVarH = arrangement.h();
                        }
                        i12 &= -57345;
                        dVar2 = dVarH;
                    }
                    if (i15 != 0) {
                        interfaceC0079cW = androidx.compose.ui.c.INSTANCE.w();
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    } else {
                        gVarA = gVar;
                    }
                    lazyListState3 = lazyListStateA;
                }
                m0 m0Var4 = m0VarA;
                boolean z14 = z11;
                androidx.compose.ui.c.InterfaceC0079c interfaceC0079c4 = interfaceC0079cW;
                Arrangement.d dVar5 = dVar2;
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(407929823, i12, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:399)");
                }
                d(nVar3, lazyListState3, m0Var4, z14, dVar5, interfaceC0079c4, gVarA, true, content, pVarF, (i12 & 14) | 12582912 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (234881024 & (i12 << 3)), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                lazyListState4 = lazyListState3;
                m0Var2 = m0Var4;
                z12 = z14;
                dVar3 = dVar5;
                interfaceC0079c2 = interfaceC0079c4;
                gVar2 = gVarA;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    nVar3 = nVar2;
                    if ((i11 & 2) != 0) {
                        lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    } else {
                        lazyListStateA = lazyListState2;
                    }
                    if (i21 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z11) {
                            dVarH = arrangement.p();
                        } else {
                            dVarH = arrangement.h();
                        }
                        i12 &= -57345;
                        dVar2 = dVarH;
                    }
                    if (i15 != 0) {
                        interfaceC0079cW = androidx.compose.ui.c.INSTANCE.w();
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    } else {
                        gVarA = gVar;
                    }
                    lazyListState3 = lazyListStateA;
                } else {
                    if (i19 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    nVar3 = nVar2;
                    if ((i11 & 2) != 0) {
                        lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    } else {
                        lazyListStateA = lazyListState2;
                    }
                    if (i21 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z11) {
                            dVarH = arrangement.p();
                        } else {
                            dVarH = arrangement.h();
                        }
                        i12 &= -57345;
                        dVar2 = dVarH;
                    }
                    if (i15 != 0) {
                        interfaceC0079cW = androidx.compose.ui.c.INSTANCE.w();
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    } else {
                        gVarA = gVar;
                    }
                    lazyListState3 = lazyListStateA;
                }
                m0 m0Var5 = m0VarA;
                boolean z15 = z11;
                androidx.compose.ui.c.InterfaceC0079c interfaceC0079c5 = interfaceC0079cW;
                Arrangement.d dVar6 = dVar2;
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(407929823, i12, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:399)");
                }
                d(nVar3, lazyListState3, m0Var5, z15, dVar6, interfaceC0079c5, gVarA, true, content, pVarF, (i12 & 14) | 12582912 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (234881024 & (i12 << 3)), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                lazyListState4 = lazyListState3;
                m0Var2 = m0Var5;
                z12 = z15;
                dVar3 = dVar6;
                interfaceC0079c2 = interfaceC0079c5;
                gVar2 = gVarA;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i23) {
                    LazyDslKt.c(nVar4, lazyListState4, m0Var2, z12, dVar3, interfaceC0079c2, gVar2, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= bb.c.b.f30966u4;
        m0VarA = m0Var;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & bb.c.g.f32954lc) == 0) {
                z11 = z10;
                if (pVarF.u(z11)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((i10 & 57344) == 0) {
                if ((i11 & 16) == 0) {
                    dVar2 = dVar;
                    if (pVarF.s(dVar2)) {
                    }
                    i12 |= i22;
                } else {
                    dVar2 = dVar;
                }
                i12 |= i22;
            } else {
                dVar2 = dVar;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                i12 |= androidx.profileinstaller.o.c.f26824k;
                interfaceC0079cW = interfaceC0079c;
            } else {
                interfaceC0079cW = interfaceC0079c;
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(interfaceC0079cW)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
            }
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i18 = 524288;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            if ((i11 & 128) != 0) {
                i12 |= 12582912;
            } else if ((29360128 & i10) == 0) {
                if (pVarF.s(content)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i12 |= i17;
            }
            if ((23967451 & i12) == 4793490) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    nVar3 = nVar2;
                    if ((i11 & 2) != 0) {
                        lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    } else {
                        lazyListStateA = lazyListState2;
                    }
                    if (i21 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z11) {
                            dVarH = arrangement.p();
                        } else {
                            dVarH = arrangement.h();
                        }
                        i12 &= -57345;
                        dVar2 = dVarH;
                    }
                    if (i15 != 0) {
                        interfaceC0079cW = androidx.compose.ui.c.INSTANCE.w();
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    } else {
                        gVarA = gVar;
                    }
                    lazyListState3 = lazyListStateA;
                } else {
                    if (i19 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    nVar3 = nVar2;
                    if ((i11 & 2) != 0) {
                        lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    } else {
                        lazyListStateA = lazyListState2;
                    }
                    if (i21 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z11) {
                            dVarH = arrangement.p();
                        } else {
                            dVarH = arrangement.h();
                        }
                        i12 &= -57345;
                        dVar2 = dVarH;
                    }
                    if (i15 != 0) {
                        interfaceC0079cW = androidx.compose.ui.c.INSTANCE.w();
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    } else {
                        gVarA = gVar;
                    }
                    lazyListState3 = lazyListStateA;
                }
                m0 m0Var6 = m0VarA;
                boolean z16 = z11;
                androidx.compose.ui.c.InterfaceC0079c interfaceC0079c6 = interfaceC0079cW;
                Arrangement.d dVar7 = dVar2;
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(407929823, i12, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:399)");
                }
                d(nVar3, lazyListState3, m0Var6, z16, dVar7, interfaceC0079c6, gVarA, true, content, pVarF, (i12 & 14) | 12582912 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (234881024 & (i12 << 3)), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                lazyListState4 = lazyListState3;
                m0Var2 = m0Var6;
                z12 = z16;
                dVar3 = dVar7;
                interfaceC0079c2 = interfaceC0079c6;
                gVar2 = gVarA;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    nVar3 = nVar2;
                    if ((i11 & 2) != 0) {
                        lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    } else {
                        lazyListStateA = lazyListState2;
                    }
                    if (i21 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z11) {
                            dVarH = arrangement.p();
                        } else {
                            dVarH = arrangement.h();
                        }
                        i12 &= -57345;
                        dVar2 = dVarH;
                    }
                    if (i15 != 0) {
                        interfaceC0079cW = androidx.compose.ui.c.INSTANCE.w();
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    } else {
                        gVarA = gVar;
                    }
                    lazyListState3 = lazyListStateA;
                } else {
                    if (i19 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    nVar3 = nVar2;
                    if ((i11 & 2) != 0) {
                        lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    } else {
                        lazyListStateA = lazyListState2;
                    }
                    if (i21 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z11) {
                            dVarH = arrangement.p();
                        } else {
                            dVarH = arrangement.h();
                        }
                        i12 &= -57345;
                        dVar2 = dVarH;
                    }
                    if (i15 != 0) {
                        interfaceC0079cW = androidx.compose.ui.c.INSTANCE.w();
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    } else {
                        gVarA = gVar;
                    }
                    lazyListState3 = lazyListStateA;
                }
                m0 m0Var7 = m0VarA;
                boolean z17 = z11;
                androidx.compose.ui.c.InterfaceC0079c interfaceC0079c7 = interfaceC0079cW;
                Arrangement.d dVar8 = dVar2;
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(407929823, i12, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:399)");
                }
                d(nVar3, lazyListState3, m0Var7, z17, dVar8, interfaceC0079c7, gVarA, true, content, pVarF, (i12 & 14) | 12582912 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (234881024 & (i12 << 3)), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                lazyListState4 = lazyListState3;
                m0Var2 = m0Var7;
                z12 = z17;
                dVar3 = dVar8;
                interfaceC0079c2 = interfaceC0079c7;
                gVar2 = gVarA;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i23) {
                    LazyDslKt.c(nVar4, lazyListState4, m0Var2, z12, dVar3, interfaceC0079c2, gVar2, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= bb.c.d.f31193dj;
        z11 = z10;
        if ((i10 & 57344) == 0) {
            if ((i11 & 16) == 0) {
                dVar2 = dVar;
                if (pVarF.s(dVar2)) {
                }
                i12 |= i22;
            } else {
                dVar2 = dVar;
            }
            i12 |= i22;
        } else {
            dVar2 = dVar;
        }
        i15 = i11 & 32;
        if (i15 != 0) {
            i12 |= androidx.profileinstaller.o.c.f26824k;
            interfaceC0079cW = interfaceC0079c;
        } else {
            interfaceC0079cW = interfaceC0079c;
            if ((i10 & 458752) == 0) {
                if (pVarF.s(interfaceC0079cW)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
        }
        if ((i10 & 3670016) != 0) {
            if ((i11 & 64) == 0) {
                i18 = 524288;
            } else {
                i18 = 524288;
            }
            i12 |= i18;
        }
        if ((i11 & 128) != 0) {
            i12 |= 12582912;
        } else if ((29360128 & i10) == 0) {
            if (pVarF.s(content)) {
                i17 = 8388608;
            } else {
                i17 = 4194304;
            }
            i12 |= i17;
        }
        if ((23967451 & i12) == 4793490) {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i19 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                nVar3 = nVar2;
                if ((i11 & 2) != 0) {
                    lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                    i12 &= com.ss.android.ttvecamera.o.f97695q;
                } else {
                    lazyListStateA = lazyListState2;
                }
                if (i21 != 0) {
                    m0VarA = PaddingKt.a(s1.h.g(0));
                }
                if (i13 != 0) {
                    z11 = false;
                }
                if ((i11 & 16) != 0) {
                    arrangement = Arrangement.f5896a;
                    if (z11) {
                        dVarH = arrangement.p();
                    } else {
                        dVarH = arrangement.h();
                    }
                    i12 &= -57345;
                    dVar2 = dVarH;
                }
                if (i15 != 0) {
                    interfaceC0079cW = androidx.compose.ui.c.INSTANCE.w();
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                } else {
                    gVarA = gVar;
                }
                lazyListState3 = lazyListStateA;
            } else {
                if (i19 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                nVar3 = nVar2;
                if ((i11 & 2) != 0) {
                    lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                    i12 &= com.ss.android.ttvecamera.o.f97695q;
                } else {
                    lazyListStateA = lazyListState2;
                }
                if (i21 != 0) {
                    m0VarA = PaddingKt.a(s1.h.g(0));
                }
                if (i13 != 0) {
                    z11 = false;
                }
                if ((i11 & 16) != 0) {
                    arrangement = Arrangement.f5896a;
                    if (z11) {
                        dVarH = arrangement.p();
                    } else {
                        dVarH = arrangement.h();
                    }
                    i12 &= -57345;
                    dVar2 = dVarH;
                }
                if (i15 != 0) {
                    interfaceC0079cW = androidx.compose.ui.c.INSTANCE.w();
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                } else {
                    gVarA = gVar;
                }
                lazyListState3 = lazyListStateA;
            }
            m0 m0Var8 = m0VarA;
            boolean z18 = z11;
            androidx.compose.ui.c.InterfaceC0079c interfaceC0079c8 = interfaceC0079cW;
            Arrangement.d dVar9 = dVar2;
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(407929823, i12, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:399)");
            }
            d(nVar3, lazyListState3, m0Var8, z18, dVar9, interfaceC0079c8, gVarA, true, content, pVarF, (i12 & 14) | 12582912 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (234881024 & (i12 << 3)), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            lazyListState4 = lazyListState3;
            m0Var2 = m0Var8;
            z12 = z18;
            dVar3 = dVar9;
            interfaceC0079c2 = interfaceC0079c8;
            gVar2 = gVarA;
        } else {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i19 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                nVar3 = nVar2;
                if ((i11 & 2) != 0) {
                    lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                    i12 &= com.ss.android.ttvecamera.o.f97695q;
                } else {
                    lazyListStateA = lazyListState2;
                }
                if (i21 != 0) {
                    m0VarA = PaddingKt.a(s1.h.g(0));
                }
                if (i13 != 0) {
                    z11 = false;
                }
                if ((i11 & 16) != 0) {
                    arrangement = Arrangement.f5896a;
                    if (z11) {
                        dVarH = arrangement.p();
                    } else {
                        dVarH = arrangement.h();
                    }
                    i12 &= -57345;
                    dVar2 = dVarH;
                }
                if (i15 != 0) {
                    interfaceC0079cW = androidx.compose.ui.c.INSTANCE.w();
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                } else {
                    gVarA = gVar;
                }
                lazyListState3 = lazyListStateA;
            } else {
                if (i19 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                nVar3 = nVar2;
                if ((i11 & 2) != 0) {
                    lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                    i12 &= com.ss.android.ttvecamera.o.f97695q;
                } else {
                    lazyListStateA = lazyListState2;
                }
                if (i21 != 0) {
                    m0VarA = PaddingKt.a(s1.h.g(0));
                }
                if (i13 != 0) {
                    z11 = false;
                }
                if ((i11 & 16) != 0) {
                    arrangement = Arrangement.f5896a;
                    if (z11) {
                        dVarH = arrangement.p();
                    } else {
                        dVarH = arrangement.h();
                    }
                    i12 &= -57345;
                    dVar2 = dVarH;
                }
                if (i15 != 0) {
                    interfaceC0079cW = androidx.compose.ui.c.INSTANCE.w();
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                } else {
                    gVarA = gVar;
                }
                lazyListState3 = lazyListStateA;
            }
            m0 m0Var9 = m0VarA;
            boolean z19 = z11;
            androidx.compose.ui.c.InterfaceC0079c interfaceC0079c9 = interfaceC0079cW;
            Arrangement.d dVar10 = dVar2;
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(407929823, i12, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:399)");
            }
            d(nVar3, lazyListState3, m0Var9, z19, dVar10, interfaceC0079c9, gVarA, true, content, pVarF, (i12 & 14) | 12582912 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (234881024 & (i12 << 3)), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            lazyListState4 = lazyListState3;
            m0Var2 = m0Var9;
            z12 = z19;
            dVar3 = dVar10;
            interfaceC0079c2 = interfaceC0079c9;
            gVar2 = gVarA;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i23) {
                LazyDslKt.c(nVar4, lazyListState4, m0Var2, z12, dVar3, interfaceC0079c2, gVar2, content, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:103:0x013a  */
    /* JADX WARN: Code duplicated, block: B:105:0x0147  */
    /* JADX WARN: Code duplicated, block: B:118:0x0174 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0176  */
    /* JADX WARN: Code duplicated, block: B:120:0x0179  */
    /* JADX WARN: Code duplicated, block: B:123:0x0180  */
    /* JADX WARN: Code duplicated, block: B:124:0x0188  */
    /* JADX WARN: Code duplicated, block: B:126:0x018c  */
    /* JADX WARN: Code duplicated, block: B:127:0x0196  */
    /* JADX WARN: Code duplicated, block: B:130:0x019a  */
    /* JADX WARN: Code duplicated, block: B:133:0x019f  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:138:0x01af  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:144:0x01be  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:147:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:148:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:152:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:155:0x0243  */
    /* JADX WARN: Code duplicated, block: B:160:0x025d  */
    /* JADX WARN: Code duplicated, block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00af  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00be  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:89:0x0102  */
    /* JADX WARN: Code duplicated, block: B:91:0x0106  */
    /* JADX WARN: Code duplicated, block: B:93:0x010b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0111  */
    /* JADX WARN: Code duplicated, block: B:96:0x0114  */
    /* JADX WARN: Code duplicated, block: B:99:0x0120  */
    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public static final void d(@dl.e androidx.compose.ui.n nVar, @dl.e LazyListState lazyListState, @dl.e m0 m0Var, boolean z10, @dl.e Arrangement.d dVar, @dl.e androidx.compose.ui.c.InterfaceC0079c interfaceC0079c, @dl.e androidx.compose.foundation.gestures.g gVar, boolean z11, @dl.d final yh.l<? super w, b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        m0 m0Var2;
        int i13;
        boolean z12;
        int i14;
        Arrangement.d dVar2;
        int i15;
        androidx.compose.ui.c.InterfaceC0079c interfaceC0079c2;
        int i16;
        int i17;
        int i18;
        int i19;
        androidx.compose.ui.n nVar2;
        LazyListState lazyListStateA;
        m0 m0VarA;
        boolean z13;
        Arrangement.d dVarH;
        androidx.compose.ui.c.InterfaceC0079c interfaceC0079cW;
        androidx.compose.foundation.gestures.g gVarA;
        boolean z14;
        androidx.compose.ui.n nVar3;
        LazyListState lazyListState2;
        boolean z15;
        m0 m0Var3;
        Arrangement.d dVar3;
        androidx.compose.ui.c.InterfaceC0079c interfaceC0079c3;
        androidx.compose.foundation.gestures.g gVar2;
        Arrangement arrangement;
        final androidx.compose.ui.n nVar4;
        final LazyListState lazyListState3;
        final m0 m0Var4;
        final boolean z16;
        final Arrangement.d dVar4;
        final androidx.compose.ui.c.InterfaceC0079c interfaceC0079c4;
        final androidx.compose.foundation.gestures.g gVar3;
        final boolean z17;
        u1 u1VarH;
        int i20;
        f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(-1724297413);
        int i21 = i11 & 1;
        if (i21 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.s(nVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            i12 |= ((i11 & 2) == 0 && pVarF.s(lazyListState)) ? 32 : 16;
        }
        int i22 = i11 & 4;
        if (i22 == 0) {
            if ((i10 & bb.c.b.f30796me) == 0) {
                m0Var2 = m0Var;
                i12 |= pVarF.s(m0Var2) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & bb.c.g.f32954lc) == 0) {
                    z12 = z10;
                    if (pVarF.u(z12)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((57344 & i10) == 0) {
                    if ((i11 & 16) == 0) {
                        dVar2 = dVar;
                        int i23 = pVarF.s(dVar2) ? 16384 : 8192;
                        i12 |= i23;
                    } else {
                        dVar2 = dVar;
                    }
                    i12 |= i23;
                } else {
                    dVar2 = dVar;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    i12 |= androidx.profileinstaller.o.c.f26824k;
                    interfaceC0079c2 = interfaceC0079c;
                } else {
                    interfaceC0079c2 = interfaceC0079c;
                    if ((i10 & 458752) == 0) {
                        if (pVarF.s(interfaceC0079c2)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0 || !pVarF.s(gVar)) {
                        i20 = 524288;
                    } else {
                        i20 = 1048576;
                    }
                    i12 |= i20;
                }
                i17 = i11 & 128;
                if (i17 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (pVarF.u(z11)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
                if ((i11 & 256) != 0) {
                    if ((234881024 & i10) == 0) {
                        if (pVarF.s(content)) {
                            i19 = 67108864;
                        } else {
                            i19 = 33554432;
                        }
                    }
                    if ((191739611 & i12) == 38347922 || !pVarF.b()) {
                        pVarF.W();
                        if ((i10 & 1) != 0 || pVarF.o()) {
                            if (i21 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i11 & 2) != 0) {
                                lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= com.ss.android.ttvecamera.o.f97695q;
                            } else {
                                lazyListStateA = lazyListState;
                            }
                            if (i22 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            z13 = i13 == 0 ? z12 : false;
                            if ((i11 & 16) != 0) {
                                arrangement = Arrangement.f5896a;
                                if (z13) {
                                    dVarH = arrangement.h();
                                } else {
                                    dVarH = arrangement.p();
                                }
                                i12 &= -57345;
                            } else {
                                dVarH = dVar2;
                            }
                            if (i15 != 0) {
                                interfaceC0079cW = androidx.compose.ui.c.INSTANCE.w();
                            } else {
                                interfaceC0079cW = interfaceC0079c2;
                            }
                            if ((i11 & 64) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 &= -3670017;
                            } else {
                                gVarA = gVar;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            nVar3 = nVar2;
                            lazyListState2 = lazyListStateA;
                            z15 = z13;
                            m0Var3 = m0VarA;
                            dVar3 = dVarH;
                            interfaceC0079c3 = interfaceC0079cW;
                            gVar2 = gVarA;
                        } else {
                            pVarF.l();
                            if ((i11 & 2) != 0) {
                                i12 &= com.ss.android.ttvecamera.o.f97695q;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                            }
                            nVar3 = nVar;
                            lazyListState2 = lazyListState;
                            gVar2 = gVar;
                            z14 = z11;
                            m0Var3 = m0Var2;
                            z15 = z12;
                            dVar3 = dVar2;
                            interfaceC0079c3 = interfaceC0079c2;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1724297413, i12, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
                        }
                        int i24 = i12 >> 3;
                        LazyListKt.a(nVar3, lazyListState2, m0Var3, z15, false, gVar2, z14, null, null, interfaceC0079c3, dVar3, content, pVarF, (i12 & 14) | 24576 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (458752 & i24) | (i24 & 3670016) | (1879048192 & (i12 << 12)), ((i12 >> 12) & 14) | ((i12 >> 21) & 112), bb.c.b.f30966u4);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        lazyListState3 = lazyListState2;
                        m0Var4 = m0Var3;
                        z16 = z15;
                        dVar4 = dVar3;
                        interfaceC0079c4 = interfaceC0079c3;
                        gVar3 = gVar2;
                        z17 = z14;
                    } else {
                        pVarF.l();
                        nVar4 = nVar;
                        lazyListState3 = lazyListState;
                        gVar3 = gVar;
                        m0Var4 = m0Var2;
                        z16 = z12;
                        dVar4 = dVar2;
                        interfaceC0079c4 = interfaceC0079c2;
                        z17 = z11;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i25) {
                            LazyDslKt.d(nVar4, lazyListState3, m0Var4, z16, dVar4, interfaceC0079c4, gVar3, z17, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i19 = 100663296;
                i12 |= i19;
                if ((191739611 & i12) == 38347922) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= com.ss.android.ttvecamera.o.f97695q;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                dVarH = arrangement.p();
                            } else {
                                dVarH = arrangement.h();
                            }
                            i12 &= -57345;
                        } else {
                            dVarH = dVar2;
                        }
                        if (i15 != 0) {
                            interfaceC0079cW = androidx.compose.ui.c.INSTANCE.w();
                        } else {
                            interfaceC0079cW = interfaceC0079c2;
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            gVarA = gVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        nVar3 = nVar2;
                        lazyListState2 = lazyListStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        dVar3 = dVarH;
                        interfaceC0079c3 = interfaceC0079cW;
                        gVar2 = gVarA;
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= com.ss.android.ttvecamera.o.f97695q;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                dVarH = arrangement.p();
                            } else {
                                dVarH = arrangement.h();
                            }
                            i12 &= -57345;
                        } else {
                            dVarH = dVar2;
                        }
                        if (i15 != 0) {
                            interfaceC0079cW = androidx.compose.ui.c.INSTANCE.w();
                        } else {
                            interfaceC0079cW = interfaceC0079c2;
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            gVarA = gVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        nVar3 = nVar2;
                        lazyListState2 = lazyListStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        dVar3 = dVarH;
                        interfaceC0079c3 = interfaceC0079cW;
                        gVar2 = gVarA;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1724297413, i12, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
                    }
                    int i25 = i12 >> 3;
                    LazyListKt.a(nVar3, lazyListState2, m0Var3, z15, false, gVar2, z14, null, null, interfaceC0079c3, dVar3, content, pVarF, (i12 & 14) | 24576 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (458752 & i25) | (i25 & 3670016) | (1879048192 & (i12 << 12)), ((i12 >> 12) & 14) | ((i12 >> 21) & 112), bb.c.b.f30966u4);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    lazyListState3 = lazyListState2;
                    m0Var4 = m0Var3;
                    z16 = z15;
                    dVar4 = dVar3;
                    interfaceC0079c4 = interfaceC0079c3;
                    gVar3 = gVar2;
                    z17 = z14;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= com.ss.android.ttvecamera.o.f97695q;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                dVarH = arrangement.p();
                            } else {
                                dVarH = arrangement.h();
                            }
                            i12 &= -57345;
                        } else {
                            dVarH = dVar2;
                        }
                        if (i15 != 0) {
                            interfaceC0079cW = androidx.compose.ui.c.INSTANCE.w();
                        } else {
                            interfaceC0079cW = interfaceC0079c2;
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            gVarA = gVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        nVar3 = nVar2;
                        lazyListState2 = lazyListStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        dVar3 = dVarH;
                        interfaceC0079c3 = interfaceC0079cW;
                        gVar2 = gVarA;
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= com.ss.android.ttvecamera.o.f97695q;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                dVarH = arrangement.p();
                            } else {
                                dVarH = arrangement.h();
                            }
                            i12 &= -57345;
                        } else {
                            dVarH = dVar2;
                        }
                        if (i15 != 0) {
                            interfaceC0079cW = androidx.compose.ui.c.INSTANCE.w();
                        } else {
                            interfaceC0079cW = interfaceC0079c2;
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            gVarA = gVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        nVar3 = nVar2;
                        lazyListState2 = lazyListStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        dVar3 = dVarH;
                        interfaceC0079c3 = interfaceC0079cW;
                        gVar2 = gVarA;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1724297413, i12, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
                    }
                    int i26 = i12 >> 3;
                    LazyListKt.a(nVar3, lazyListState2, m0Var3, z15, false, gVar2, z14, null, null, interfaceC0079c3, dVar3, content, pVarF, (i12 & 14) | 24576 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (458752 & i26) | (i26 & 3670016) | (1879048192 & (i12 << 12)), ((i12 >> 12) & 14) | ((i12 >> 21) & 112), bb.c.b.f30966u4);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    lazyListState3 = lazyListState2;
                    m0Var4 = m0Var3;
                    z16 = z15;
                    dVar4 = dVar3;
                    interfaceC0079c4 = interfaceC0079c3;
                    gVar3 = gVar2;
                    z17 = z14;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i27) {
                        LazyDslKt.d(nVar4, lazyListState3, m0Var4, z16, dVar4, interfaceC0079c4, gVar3, z17, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= bb.c.d.f31193dj;
            z12 = z10;
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    dVar2 = dVar;
                    if (pVarF.s(dVar2)) {
                    }
                    i12 |= i23;
                } else {
                    dVar2 = dVar;
                }
                i12 |= i23;
            } else {
                dVar2 = dVar;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                i12 |= androidx.profileinstaller.o.c.f26824k;
                interfaceC0079c2 = interfaceC0079c;
            } else {
                interfaceC0079c2 = interfaceC0079c;
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(interfaceC0079c2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
            }
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            }
            i17 = i11 & 128;
            if (i17 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (pVarF.u(z11)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            }
            if ((i11 & 256) != 0) {
                if ((234881024 & i10) == 0) {
                    if (pVarF.s(content)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                }
                if ((191739611 & i12) == 38347922) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= com.ss.android.ttvecamera.o.f97695q;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                dVarH = arrangement.p();
                            } else {
                                dVarH = arrangement.h();
                            }
                            i12 &= -57345;
                        } else {
                            dVarH = dVar2;
                        }
                        if (i15 != 0) {
                            interfaceC0079cW = androidx.compose.ui.c.INSTANCE.w();
                        } else {
                            interfaceC0079cW = interfaceC0079c2;
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            gVarA = gVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        nVar3 = nVar2;
                        lazyListState2 = lazyListStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        dVar3 = dVarH;
                        interfaceC0079c3 = interfaceC0079cW;
                        gVar2 = gVarA;
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= com.ss.android.ttvecamera.o.f97695q;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                dVarH = arrangement.p();
                            } else {
                                dVarH = arrangement.h();
                            }
                            i12 &= -57345;
                        } else {
                            dVarH = dVar2;
                        }
                        if (i15 != 0) {
                            interfaceC0079cW = androidx.compose.ui.c.INSTANCE.w();
                        } else {
                            interfaceC0079cW = interfaceC0079c2;
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            gVarA = gVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        nVar3 = nVar2;
                        lazyListState2 = lazyListStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        dVar3 = dVarH;
                        interfaceC0079c3 = interfaceC0079cW;
                        gVar2 = gVarA;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1724297413, i12, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
                    }
                    int i27 = i12 >> 3;
                    LazyListKt.a(nVar3, lazyListState2, m0Var3, z15, false, gVar2, z14, null, null, interfaceC0079c3, dVar3, content, pVarF, (i12 & 14) | 24576 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (458752 & i27) | (i27 & 3670016) | (1879048192 & (i12 << 12)), ((i12 >> 12) & 14) | ((i12 >> 21) & 112), bb.c.b.f30966u4);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    lazyListState3 = lazyListState2;
                    m0Var4 = m0Var3;
                    z16 = z15;
                    dVar4 = dVar3;
                    interfaceC0079c4 = interfaceC0079c3;
                    gVar3 = gVar2;
                    z17 = z14;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= com.ss.android.ttvecamera.o.f97695q;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                dVarH = arrangement.p();
                            } else {
                                dVarH = arrangement.h();
                            }
                            i12 &= -57345;
                        } else {
                            dVarH = dVar2;
                        }
                        if (i15 != 0) {
                            interfaceC0079cW = androidx.compose.ui.c.INSTANCE.w();
                        } else {
                            interfaceC0079cW = interfaceC0079c2;
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            gVarA = gVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        nVar3 = nVar2;
                        lazyListState2 = lazyListStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        dVar3 = dVarH;
                        interfaceC0079c3 = interfaceC0079cW;
                        gVar2 = gVarA;
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= com.ss.android.ttvecamera.o.f97695q;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                dVarH = arrangement.p();
                            } else {
                                dVarH = arrangement.h();
                            }
                            i12 &= -57345;
                        } else {
                            dVarH = dVar2;
                        }
                        if (i15 != 0) {
                            interfaceC0079cW = androidx.compose.ui.c.INSTANCE.w();
                        } else {
                            interfaceC0079cW = interfaceC0079c2;
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            gVarA = gVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        nVar3 = nVar2;
                        lazyListState2 = lazyListStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        dVar3 = dVarH;
                        interfaceC0079c3 = interfaceC0079cW;
                        gVar2 = gVarA;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1724297413, i12, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
                    }
                    int i28 = i12 >> 3;
                    LazyListKt.a(nVar3, lazyListState2, m0Var3, z15, false, gVar2, z14, null, null, interfaceC0079c3, dVar3, content, pVarF, (i12 & 14) | 24576 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (458752 & i28) | (i28 & 3670016) | (1879048192 & (i12 << 12)), ((i12 >> 12) & 14) | ((i12 >> 21) & 112), bb.c.b.f30966u4);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    lazyListState3 = lazyListState2;
                    m0Var4 = m0Var3;
                    z16 = z15;
                    dVar4 = dVar3;
                    interfaceC0079c4 = interfaceC0079c3;
                    gVar3 = gVar2;
                    z17 = z14;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i29) {
                        LazyDslKt.d(nVar4, lazyListState3, m0Var4, z16, dVar4, interfaceC0079c4, gVar3, z17, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i19 = 100663296;
            i12 |= i19;
            if ((191739611 & i12) == 38347922) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            dVarH = arrangement.p();
                        } else {
                            dVarH = arrangement.h();
                        }
                        i12 &= -57345;
                    } else {
                        dVarH = dVar2;
                    }
                    if (i15 != 0) {
                        interfaceC0079cW = androidx.compose.ui.c.INSTANCE.w();
                    } else {
                        interfaceC0079cW = interfaceC0079c2;
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -3670017;
                    } else {
                        gVarA = gVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    nVar3 = nVar2;
                    lazyListState2 = lazyListStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    dVar3 = dVarH;
                    interfaceC0079c3 = interfaceC0079cW;
                    gVar2 = gVarA;
                } else {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            dVarH = arrangement.p();
                        } else {
                            dVarH = arrangement.h();
                        }
                        i12 &= -57345;
                    } else {
                        dVarH = dVar2;
                    }
                    if (i15 != 0) {
                        interfaceC0079cW = androidx.compose.ui.c.INSTANCE.w();
                    } else {
                        interfaceC0079cW = interfaceC0079c2;
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -3670017;
                    } else {
                        gVarA = gVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    nVar3 = nVar2;
                    lazyListState2 = lazyListStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    dVar3 = dVarH;
                    interfaceC0079c3 = interfaceC0079cW;
                    gVar2 = gVarA;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1724297413, i12, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
                }
                int i29 = i12 >> 3;
                LazyListKt.a(nVar3, lazyListState2, m0Var3, z15, false, gVar2, z14, null, null, interfaceC0079c3, dVar3, content, pVarF, (i12 & 14) | 24576 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (458752 & i29) | (i29 & 3670016) | (1879048192 & (i12 << 12)), ((i12 >> 12) & 14) | ((i12 >> 21) & 112), bb.c.b.f30966u4);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                lazyListState3 = lazyListState2;
                m0Var4 = m0Var3;
                z16 = z15;
                dVar4 = dVar3;
                interfaceC0079c4 = interfaceC0079c3;
                gVar3 = gVar2;
                z17 = z14;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            dVarH = arrangement.p();
                        } else {
                            dVarH = arrangement.h();
                        }
                        i12 &= -57345;
                    } else {
                        dVarH = dVar2;
                    }
                    if (i15 != 0) {
                        interfaceC0079cW = androidx.compose.ui.c.INSTANCE.w();
                    } else {
                        interfaceC0079cW = interfaceC0079c2;
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -3670017;
                    } else {
                        gVarA = gVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    nVar3 = nVar2;
                    lazyListState2 = lazyListStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    dVar3 = dVarH;
                    interfaceC0079c3 = interfaceC0079cW;
                    gVar2 = gVarA;
                } else {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            dVarH = arrangement.p();
                        } else {
                            dVarH = arrangement.h();
                        }
                        i12 &= -57345;
                    } else {
                        dVarH = dVar2;
                    }
                    if (i15 != 0) {
                        interfaceC0079cW = androidx.compose.ui.c.INSTANCE.w();
                    } else {
                        interfaceC0079cW = interfaceC0079c2;
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -3670017;
                    } else {
                        gVarA = gVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    nVar3 = nVar2;
                    lazyListState2 = lazyListStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    dVar3 = dVarH;
                    interfaceC0079c3 = interfaceC0079cW;
                    gVar2 = gVarA;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1724297413, i12, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
                }
                int i210 = i12 >> 3;
                LazyListKt.a(nVar3, lazyListState2, m0Var3, z15, false, gVar2, z14, null, null, interfaceC0079c3, dVar3, content, pVarF, (i12 & 14) | 24576 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (458752 & i210) | (i210 & 3670016) | (1879048192 & (i12 << 12)), ((i12 >> 12) & 14) | ((i12 >> 21) & 112), bb.c.b.f30966u4);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                lazyListState3 = lazyListState2;
                m0Var4 = m0Var3;
                z16 = z15;
                dVar4 = dVar3;
                interfaceC0079c4 = interfaceC0079c3;
                gVar3 = gVar2;
                z17 = z14;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i211) {
                    LazyDslKt.d(nVar4, lazyListState3, m0Var4, z16, dVar4, interfaceC0079c4, gVar3, z17, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= bb.c.b.f30966u4;
        m0Var2 = m0Var;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & bb.c.g.f32954lc) == 0) {
                z12 = z10;
                if (pVarF.u(z12)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    dVar2 = dVar;
                    if (pVarF.s(dVar2)) {
                    }
                    i12 |= i23;
                } else {
                    dVar2 = dVar;
                }
                i12 |= i23;
            } else {
                dVar2 = dVar;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                i12 |= androidx.profileinstaller.o.c.f26824k;
                interfaceC0079c2 = interfaceC0079c;
            } else {
                interfaceC0079c2 = interfaceC0079c;
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(interfaceC0079c2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
            }
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            }
            i17 = i11 & 128;
            if (i17 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (pVarF.u(z11)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            }
            if ((i11 & 256) != 0) {
                if ((234881024 & i10) == 0) {
                    if (pVarF.s(content)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                }
                if ((191739611 & i12) == 38347922) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= com.ss.android.ttvecamera.o.f97695q;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                dVarH = arrangement.p();
                            } else {
                                dVarH = arrangement.h();
                            }
                            i12 &= -57345;
                        } else {
                            dVarH = dVar2;
                        }
                        if (i15 != 0) {
                            interfaceC0079cW = androidx.compose.ui.c.INSTANCE.w();
                        } else {
                            interfaceC0079cW = interfaceC0079c2;
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            gVarA = gVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        nVar3 = nVar2;
                        lazyListState2 = lazyListStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        dVar3 = dVarH;
                        interfaceC0079c3 = interfaceC0079cW;
                        gVar2 = gVarA;
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= com.ss.android.ttvecamera.o.f97695q;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                dVarH = arrangement.p();
                            } else {
                                dVarH = arrangement.h();
                            }
                            i12 &= -57345;
                        } else {
                            dVarH = dVar2;
                        }
                        if (i15 != 0) {
                            interfaceC0079cW = androidx.compose.ui.c.INSTANCE.w();
                        } else {
                            interfaceC0079cW = interfaceC0079c2;
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            gVarA = gVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        nVar3 = nVar2;
                        lazyListState2 = lazyListStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        dVar3 = dVarH;
                        interfaceC0079c3 = interfaceC0079cW;
                        gVar2 = gVarA;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1724297413, i12, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
                    }
                    int i211 = i12 >> 3;
                    LazyListKt.a(nVar3, lazyListState2, m0Var3, z15, false, gVar2, z14, null, null, interfaceC0079c3, dVar3, content, pVarF, (i12 & 14) | 24576 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (458752 & i211) | (i211 & 3670016) | (1879048192 & (i12 << 12)), ((i12 >> 12) & 14) | ((i12 >> 21) & 112), bb.c.b.f30966u4);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    lazyListState3 = lazyListState2;
                    m0Var4 = m0Var3;
                    z16 = z15;
                    dVar4 = dVar3;
                    interfaceC0079c4 = interfaceC0079c3;
                    gVar3 = gVar2;
                    z17 = z14;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= com.ss.android.ttvecamera.o.f97695q;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                dVarH = arrangement.p();
                            } else {
                                dVarH = arrangement.h();
                            }
                            i12 &= -57345;
                        } else {
                            dVarH = dVar2;
                        }
                        if (i15 != 0) {
                            interfaceC0079cW = androidx.compose.ui.c.INSTANCE.w();
                        } else {
                            interfaceC0079cW = interfaceC0079c2;
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            gVarA = gVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        nVar3 = nVar2;
                        lazyListState2 = lazyListStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        dVar3 = dVarH;
                        interfaceC0079c3 = interfaceC0079cW;
                        gVar2 = gVarA;
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= com.ss.android.ttvecamera.o.f97695q;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                dVarH = arrangement.p();
                            } else {
                                dVarH = arrangement.h();
                            }
                            i12 &= -57345;
                        } else {
                            dVarH = dVar2;
                        }
                        if (i15 != 0) {
                            interfaceC0079cW = androidx.compose.ui.c.INSTANCE.w();
                        } else {
                            interfaceC0079cW = interfaceC0079c2;
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            gVarA = gVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        nVar3 = nVar2;
                        lazyListState2 = lazyListStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        dVar3 = dVarH;
                        interfaceC0079c3 = interfaceC0079cW;
                        gVar2 = gVarA;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1724297413, i12, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
                    }
                    int i212 = i12 >> 3;
                    LazyListKt.a(nVar3, lazyListState2, m0Var3, z15, false, gVar2, z14, null, null, interfaceC0079c3, dVar3, content, pVarF, (i12 & 14) | 24576 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (458752 & i212) | (i212 & 3670016) | (1879048192 & (i12 << 12)), ((i12 >> 12) & 14) | ((i12 >> 21) & 112), bb.c.b.f30966u4);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    lazyListState3 = lazyListState2;
                    m0Var4 = m0Var3;
                    z16 = z15;
                    dVar4 = dVar3;
                    interfaceC0079c4 = interfaceC0079c3;
                    gVar3 = gVar2;
                    z17 = z14;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i213) {
                        LazyDslKt.d(nVar4, lazyListState3, m0Var4, z16, dVar4, interfaceC0079c4, gVar3, z17, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i19 = 100663296;
            i12 |= i19;
            if ((191739611 & i12) == 38347922) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            dVarH = arrangement.p();
                        } else {
                            dVarH = arrangement.h();
                        }
                        i12 &= -57345;
                    } else {
                        dVarH = dVar2;
                    }
                    if (i15 != 0) {
                        interfaceC0079cW = androidx.compose.ui.c.INSTANCE.w();
                    } else {
                        interfaceC0079cW = interfaceC0079c2;
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -3670017;
                    } else {
                        gVarA = gVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    nVar3 = nVar2;
                    lazyListState2 = lazyListStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    dVar3 = dVarH;
                    interfaceC0079c3 = interfaceC0079cW;
                    gVar2 = gVarA;
                } else {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            dVarH = arrangement.p();
                        } else {
                            dVarH = arrangement.h();
                        }
                        i12 &= -57345;
                    } else {
                        dVarH = dVar2;
                    }
                    if (i15 != 0) {
                        interfaceC0079cW = androidx.compose.ui.c.INSTANCE.w();
                    } else {
                        interfaceC0079cW = interfaceC0079c2;
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -3670017;
                    } else {
                        gVarA = gVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    nVar3 = nVar2;
                    lazyListState2 = lazyListStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    dVar3 = dVarH;
                    interfaceC0079c3 = interfaceC0079cW;
                    gVar2 = gVarA;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1724297413, i12, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
                }
                int i213 = i12 >> 3;
                LazyListKt.a(nVar3, lazyListState2, m0Var3, z15, false, gVar2, z14, null, null, interfaceC0079c3, dVar3, content, pVarF, (i12 & 14) | 24576 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (458752 & i213) | (i213 & 3670016) | (1879048192 & (i12 << 12)), ((i12 >> 12) & 14) | ((i12 >> 21) & 112), bb.c.b.f30966u4);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                lazyListState3 = lazyListState2;
                m0Var4 = m0Var3;
                z16 = z15;
                dVar4 = dVar3;
                interfaceC0079c4 = interfaceC0079c3;
                gVar3 = gVar2;
                z17 = z14;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            dVarH = arrangement.p();
                        } else {
                            dVarH = arrangement.h();
                        }
                        i12 &= -57345;
                    } else {
                        dVarH = dVar2;
                    }
                    if (i15 != 0) {
                        interfaceC0079cW = androidx.compose.ui.c.INSTANCE.w();
                    } else {
                        interfaceC0079cW = interfaceC0079c2;
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -3670017;
                    } else {
                        gVarA = gVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    nVar3 = nVar2;
                    lazyListState2 = lazyListStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    dVar3 = dVarH;
                    interfaceC0079c3 = interfaceC0079cW;
                    gVar2 = gVarA;
                } else {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            dVarH = arrangement.p();
                        } else {
                            dVarH = arrangement.h();
                        }
                        i12 &= -57345;
                    } else {
                        dVarH = dVar2;
                    }
                    if (i15 != 0) {
                        interfaceC0079cW = androidx.compose.ui.c.INSTANCE.w();
                    } else {
                        interfaceC0079cW = interfaceC0079c2;
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -3670017;
                    } else {
                        gVarA = gVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    nVar3 = nVar2;
                    lazyListState2 = lazyListStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    dVar3 = dVarH;
                    interfaceC0079c3 = interfaceC0079cW;
                    gVar2 = gVarA;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1724297413, i12, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
                }
                int i214 = i12 >> 3;
                LazyListKt.a(nVar3, lazyListState2, m0Var3, z15, false, gVar2, z14, null, null, interfaceC0079c3, dVar3, content, pVarF, (i12 & 14) | 24576 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (458752 & i214) | (i214 & 3670016) | (1879048192 & (i12 << 12)), ((i12 >> 12) & 14) | ((i12 >> 21) & 112), bb.c.b.f30966u4);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                lazyListState3 = lazyListState2;
                m0Var4 = m0Var3;
                z16 = z15;
                dVar4 = dVar3;
                interfaceC0079c4 = interfaceC0079c3;
                gVar3 = gVar2;
                z17 = z14;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i215) {
                    LazyDslKt.d(nVar4, lazyListState3, m0Var4, z16, dVar4, interfaceC0079c4, gVar3, z17, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= bb.c.d.f31193dj;
        z12 = z10;
        if ((57344 & i10) == 0) {
            if ((i11 & 16) == 0) {
                dVar2 = dVar;
                if (pVarF.s(dVar2)) {
                }
                i12 |= i23;
            } else {
                dVar2 = dVar;
            }
            i12 |= i23;
        } else {
            dVar2 = dVar;
        }
        i15 = i11 & 32;
        if (i15 != 0) {
            i12 |= androidx.profileinstaller.o.c.f26824k;
            interfaceC0079c2 = interfaceC0079c;
        } else {
            interfaceC0079c2 = interfaceC0079c;
            if ((i10 & 458752) == 0) {
                if (pVarF.s(interfaceC0079c2)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
        }
        if ((i10 & 3670016) != 0) {
            if ((i11 & 64) == 0) {
                i20 = 524288;
            } else {
                i20 = 524288;
            }
            i12 |= i20;
        }
        i17 = i11 & 128;
        if (i17 != 0) {
            i12 |= 12582912;
        } else if ((i10 & 29360128) == 0) {
            if (pVarF.u(z11)) {
                i18 = 8388608;
            } else {
                i18 = 4194304;
            }
            i12 |= i18;
        }
        if ((i11 & 256) != 0) {
            if ((234881024 & i10) == 0) {
                if (pVarF.s(content)) {
                    i19 = 67108864;
                } else {
                    i19 = 33554432;
                }
            }
            if ((191739611 & i12) == 38347922) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            dVarH = arrangement.p();
                        } else {
                            dVarH = arrangement.h();
                        }
                        i12 &= -57345;
                    } else {
                        dVarH = dVar2;
                    }
                    if (i15 != 0) {
                        interfaceC0079cW = androidx.compose.ui.c.INSTANCE.w();
                    } else {
                        interfaceC0079cW = interfaceC0079c2;
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -3670017;
                    } else {
                        gVarA = gVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    nVar3 = nVar2;
                    lazyListState2 = lazyListStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    dVar3 = dVarH;
                    interfaceC0079c3 = interfaceC0079cW;
                    gVar2 = gVarA;
                } else {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            dVarH = arrangement.p();
                        } else {
                            dVarH = arrangement.h();
                        }
                        i12 &= -57345;
                    } else {
                        dVarH = dVar2;
                    }
                    if (i15 != 0) {
                        interfaceC0079cW = androidx.compose.ui.c.INSTANCE.w();
                    } else {
                        interfaceC0079cW = interfaceC0079c2;
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -3670017;
                    } else {
                        gVarA = gVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    nVar3 = nVar2;
                    lazyListState2 = lazyListStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    dVar3 = dVarH;
                    interfaceC0079c3 = interfaceC0079cW;
                    gVar2 = gVarA;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1724297413, i12, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
                }
                int i215 = i12 >> 3;
                LazyListKt.a(nVar3, lazyListState2, m0Var3, z15, false, gVar2, z14, null, null, interfaceC0079c3, dVar3, content, pVarF, (i12 & 14) | 24576 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (458752 & i215) | (i215 & 3670016) | (1879048192 & (i12 << 12)), ((i12 >> 12) & 14) | ((i12 >> 21) & 112), bb.c.b.f30966u4);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                lazyListState3 = lazyListState2;
                m0Var4 = m0Var3;
                z16 = z15;
                dVar4 = dVar3;
                interfaceC0079c4 = interfaceC0079c3;
                gVar3 = gVar2;
                z17 = z14;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            dVarH = arrangement.p();
                        } else {
                            dVarH = arrangement.h();
                        }
                        i12 &= -57345;
                    } else {
                        dVarH = dVar2;
                    }
                    if (i15 != 0) {
                        interfaceC0079cW = androidx.compose.ui.c.INSTANCE.w();
                    } else {
                        interfaceC0079cW = interfaceC0079c2;
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -3670017;
                    } else {
                        gVarA = gVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    nVar3 = nVar2;
                    lazyListState2 = lazyListStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    dVar3 = dVarH;
                    interfaceC0079c3 = interfaceC0079cW;
                    gVar2 = gVarA;
                } else {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            dVarH = arrangement.p();
                        } else {
                            dVarH = arrangement.h();
                        }
                        i12 &= -57345;
                    } else {
                        dVarH = dVar2;
                    }
                    if (i15 != 0) {
                        interfaceC0079cW = androidx.compose.ui.c.INSTANCE.w();
                    } else {
                        interfaceC0079cW = interfaceC0079c2;
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -3670017;
                    } else {
                        gVarA = gVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    nVar3 = nVar2;
                    lazyListState2 = lazyListStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    dVar3 = dVarH;
                    interfaceC0079c3 = interfaceC0079cW;
                    gVar2 = gVarA;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1724297413, i12, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
                }
                int i216 = i12 >> 3;
                LazyListKt.a(nVar3, lazyListState2, m0Var3, z15, false, gVar2, z14, null, null, interfaceC0079c3, dVar3, content, pVarF, (i12 & 14) | 24576 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (458752 & i216) | (i216 & 3670016) | (1879048192 & (i12 << 12)), ((i12 >> 12) & 14) | ((i12 >> 21) & 112), bb.c.b.f30966u4);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                lazyListState3 = lazyListState2;
                m0Var4 = m0Var3;
                z16 = z15;
                dVar4 = dVar3;
                interfaceC0079c4 = interfaceC0079c3;
                gVar3 = gVar2;
                z17 = z14;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i217) {
                    LazyDslKt.d(nVar4, lazyListState3, m0Var4, z16, dVar4, interfaceC0079c4, gVar3, z17, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i19 = 100663296;
        i12 |= i19;
        if ((191739611 & i12) == 38347922) {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i21 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if ((i11 & 2) != 0) {
                    lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                    i12 &= com.ss.android.ttvecamera.o.f97695q;
                } else {
                    lazyListStateA = lazyListState;
                }
                if (i22 != 0) {
                    m0VarA = PaddingKt.a(s1.h.g(0));
                } else {
                    m0VarA = m0Var2;
                }
                if (i13 == 0) {
                }
                if ((i11 & 16) != 0) {
                    arrangement = Arrangement.f5896a;
                    if (z13) {
                        dVarH = arrangement.p();
                    } else {
                        dVarH = arrangement.h();
                    }
                    i12 &= -57345;
                } else {
                    dVarH = dVar2;
                }
                if (i15 != 0) {
                    interfaceC0079cW = androidx.compose.ui.c.INSTANCE.w();
                } else {
                    interfaceC0079cW = interfaceC0079c2;
                }
                if ((i11 & 64) != 0) {
                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    i12 &= -3670017;
                } else {
                    gVarA = gVar;
                }
                if (i17 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                nVar3 = nVar2;
                lazyListState2 = lazyListStateA;
                z15 = z13;
                m0Var3 = m0VarA;
                dVar3 = dVarH;
                interfaceC0079c3 = interfaceC0079cW;
                gVar2 = gVarA;
            } else {
                if (i21 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if ((i11 & 2) != 0) {
                    lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                    i12 &= com.ss.android.ttvecamera.o.f97695q;
                } else {
                    lazyListStateA = lazyListState;
                }
                if (i22 != 0) {
                    m0VarA = PaddingKt.a(s1.h.g(0));
                } else {
                    m0VarA = m0Var2;
                }
                if (i13 == 0) {
                }
                if ((i11 & 16) != 0) {
                    arrangement = Arrangement.f5896a;
                    if (z13) {
                        dVarH = arrangement.p();
                    } else {
                        dVarH = arrangement.h();
                    }
                    i12 &= -57345;
                } else {
                    dVarH = dVar2;
                }
                if (i15 != 0) {
                    interfaceC0079cW = androidx.compose.ui.c.INSTANCE.w();
                } else {
                    interfaceC0079cW = interfaceC0079c2;
                }
                if ((i11 & 64) != 0) {
                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    i12 &= -3670017;
                } else {
                    gVarA = gVar;
                }
                if (i17 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                nVar3 = nVar2;
                lazyListState2 = lazyListStateA;
                z15 = z13;
                m0Var3 = m0VarA;
                dVar3 = dVarH;
                interfaceC0079c3 = interfaceC0079cW;
                gVar2 = gVarA;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1724297413, i12, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
            }
            int i217 = i12 >> 3;
            LazyListKt.a(nVar3, lazyListState2, m0Var3, z15, false, gVar2, z14, null, null, interfaceC0079c3, dVar3, content, pVarF, (i12 & 14) | 24576 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (458752 & i217) | (i217 & 3670016) | (1879048192 & (i12 << 12)), ((i12 >> 12) & 14) | ((i12 >> 21) & 112), bb.c.b.f30966u4);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            lazyListState3 = lazyListState2;
            m0Var4 = m0Var3;
            z16 = z15;
            dVar4 = dVar3;
            interfaceC0079c4 = interfaceC0079c3;
            gVar3 = gVar2;
            z17 = z14;
        } else {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i21 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if ((i11 & 2) != 0) {
                    lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                    i12 &= com.ss.android.ttvecamera.o.f97695q;
                } else {
                    lazyListStateA = lazyListState;
                }
                if (i22 != 0) {
                    m0VarA = PaddingKt.a(s1.h.g(0));
                } else {
                    m0VarA = m0Var2;
                }
                if (i13 == 0) {
                }
                if ((i11 & 16) != 0) {
                    arrangement = Arrangement.f5896a;
                    if (z13) {
                        dVarH = arrangement.p();
                    } else {
                        dVarH = arrangement.h();
                    }
                    i12 &= -57345;
                } else {
                    dVarH = dVar2;
                }
                if (i15 != 0) {
                    interfaceC0079cW = androidx.compose.ui.c.INSTANCE.w();
                } else {
                    interfaceC0079cW = interfaceC0079c2;
                }
                if ((i11 & 64) != 0) {
                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    i12 &= -3670017;
                } else {
                    gVarA = gVar;
                }
                if (i17 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                nVar3 = nVar2;
                lazyListState2 = lazyListStateA;
                z15 = z13;
                m0Var3 = m0VarA;
                dVar3 = dVarH;
                interfaceC0079c3 = interfaceC0079cW;
                gVar2 = gVarA;
            } else {
                if (i21 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if ((i11 & 2) != 0) {
                    lazyListStateA = LazyListStateKt.a(0, 0, pVarF, 0, 3);
                    i12 &= com.ss.android.ttvecamera.o.f97695q;
                } else {
                    lazyListStateA = lazyListState;
                }
                if (i22 != 0) {
                    m0VarA = PaddingKt.a(s1.h.g(0));
                } else {
                    m0VarA = m0Var2;
                }
                if (i13 == 0) {
                }
                if ((i11 & 16) != 0) {
                    arrangement = Arrangement.f5896a;
                    if (z13) {
                        dVarH = arrangement.p();
                    } else {
                        dVarH = arrangement.h();
                    }
                    i12 &= -57345;
                } else {
                    dVarH = dVar2;
                }
                if (i15 != 0) {
                    interfaceC0079cW = androidx.compose.ui.c.INSTANCE.w();
                } else {
                    interfaceC0079cW = interfaceC0079c2;
                }
                if ((i11 & 64) != 0) {
                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    i12 &= -3670017;
                } else {
                    gVarA = gVar;
                }
                if (i17 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                nVar3 = nVar2;
                lazyListState2 = lazyListStateA;
                z15 = z13;
                m0Var3 = m0VarA;
                dVar3 = dVarH;
                interfaceC0079c3 = interfaceC0079cW;
                gVar2 = gVarA;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1724297413, i12, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
            }
            int i218 = i12 >> 3;
            LazyListKt.a(nVar3, lazyListState2, m0Var3, z15, false, gVar2, z14, null, null, interfaceC0079c3, dVar3, content, pVarF, (i12 & 14) | 24576 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (458752 & i218) | (i218 & 3670016) | (1879048192 & (i12 << 12)), ((i12 >> 12) & 14) | ((i12 >> 21) & 112), bb.c.b.f30966u4);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            lazyListState3 = lazyListState2;
            m0Var4 = m0Var3;
            z16 = z15;
            dVar4 = dVar3;
            interfaceC0079c4 = interfaceC0079c3;
            gVar3 = gVar2;
            z17 = z14;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i219) {
                LazyDslKt.d(nVar4, lazyListState3, m0Var4, z16, dVar4, interfaceC0079c4, gVar3, z17, content, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    @androidx.compose.runtime.i(scheme = "[0[0]]")
    public static final <T> void e(@dl.d w wVar, @dl.d List<? extends T> items, @dl.e yh.l<? super T, ? extends Object> lVar, @dl.d yh.l<? super T, ? extends Object> contentType, @dl.d yh.r<? super g, ? super T, ? super androidx.compose.runtime.p, ? super Integer, b2> itemContent) {
        f0.p(wVar, "<this>");
        f0.p(items, "items");
        f0.p(contentType, "contentType");
        f0.p(itemContent, "itemContent");
        wVar.b(items.size(), lVar != null ? new LazyDslKt$items$2(lVar, items) : null, new LazyDslKt$items$3(contentType, items), androidx.compose.runtime.internal.b.c(-632812321, true, new LazyDslKt$items$4(itemContent, items)));
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    @androidx.compose.runtime.i(scheme = "[0[0]]")
    public static final /* synthetic */ <T> void f(w wVar, List<? extends T> items, yh.l<? super T, ? extends Object> lVar, yh.r<? super g, ? super T, ? super androidx.compose.runtime.p, ? super Integer, b2> itemContent) {
        f0.p(wVar, "<this>");
        f0.p(items, "items");
        f0.p(itemContent, "itemContent");
        wVar.b(items.size(), lVar != null ? new LazyDslKt$items$2(lVar, items) : null, new LazyDslKt$items$3(LazyDslKt$items$1.f6461b, items), androidx.compose.runtime.internal.b.c(-632812321, true, new LazyDslKt$items$4(itemContent, items)));
    }

    @androidx.compose.runtime.i(scheme = "[0[0]]")
    public static final <T> void g(@dl.d w wVar, @dl.d T[] items, @dl.e yh.l<? super T, ? extends Object> lVar, @dl.d yh.l<? super T, ? extends Object> contentType, @dl.d yh.r<? super g, ? super T, ? super androidx.compose.runtime.p, ? super Integer, b2> itemContent) {
        f0.p(wVar, "<this>");
        f0.p(items, "items");
        f0.p(contentType, "contentType");
        f0.p(itemContent, "itemContent");
        wVar.b(items.length, lVar != null ? new LazyDslKt$items$6(lVar, items) : null, new LazyDslKt$items$7(contentType, items), androidx.compose.runtime.internal.b.c(-1043393750, true, new LazyDslKt$items$8(itemContent, items)));
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    @androidx.compose.runtime.i(scheme = "[0[0]]")
    public static final /* synthetic */ <T> void h(w wVar, T[] items, yh.l<? super T, ? extends Object> lVar, yh.r<? super g, ? super T, ? super androidx.compose.runtime.p, ? super Integer, b2> itemContent) {
        f0.p(wVar, "<this>");
        f0.p(items, "items");
        f0.p(itemContent, "itemContent");
        wVar.b(items.length, lVar != null ? new LazyDslKt$items$6(lVar, items) : null, new LazyDslKt$items$7(LazyDslKt$items$5.f6468b, items), androidx.compose.runtime.internal.b.c(-1043393750, true, new LazyDslKt$items$8(itemContent, items)));
    }

    public static /* synthetic */ void i(w wVar, List items, yh.l lVar, yh.l contentType, yh.r itemContent, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        if ((i10 & 4) != 0) {
            contentType = LazyDslKt$items$1.f6461b;
        }
        f0.p(wVar, "<this>");
        f0.p(items, "items");
        f0.p(contentType, "contentType");
        f0.p(itemContent, "itemContent");
        wVar.b(items.size(), lVar != null ? new LazyDslKt$items$2(lVar, items) : null, new LazyDslKt$items$3(contentType, items), androidx.compose.runtime.internal.b.c(-632812321, true, new LazyDslKt$items$4(itemContent, items)));
    }

    public static /* synthetic */ void j(w wVar, List items, yh.l lVar, yh.r itemContent, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        f0.p(wVar, "<this>");
        f0.p(items, "items");
        f0.p(itemContent, "itemContent");
        wVar.b(items.size(), lVar != null ? new LazyDslKt$items$2(lVar, items) : null, new LazyDslKt$items$3(LazyDslKt$items$1.f6461b, items), androidx.compose.runtime.internal.b.c(-632812321, true, new LazyDslKt$items$4(itemContent, items)));
    }

    public static /* synthetic */ void k(w wVar, Object[] items, yh.l lVar, yh.l contentType, yh.r itemContent, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        if ((i10 & 4) != 0) {
            contentType = LazyDslKt$items$5.f6468b;
        }
        f0.p(wVar, "<this>");
        f0.p(items, "items");
        f0.p(contentType, "contentType");
        f0.p(itemContent, "itemContent");
        wVar.b(items.length, lVar != null ? new LazyDslKt$items$6(lVar, items) : null, new LazyDslKt$items$7(contentType, items), androidx.compose.runtime.internal.b.c(-1043393750, true, new LazyDslKt$items$8(itemContent, items)));
    }

    public static /* synthetic */ void l(w wVar, Object[] items, yh.l lVar, yh.r itemContent, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        f0.p(wVar, "<this>");
        f0.p(items, "items");
        f0.p(itemContent, "itemContent");
        wVar.b(items.length, lVar != null ? new LazyDslKt$items$6(lVar, items) : null, new LazyDslKt$items$7(LazyDslKt$items$5.f6468b, items), androidx.compose.runtime.internal.b.c(-1043393750, true, new LazyDslKt$items$8(itemContent, items)));
    }

    @androidx.compose.runtime.i(scheme = "[0[0]]")
    public static final <T> void m(@dl.d w wVar, @dl.d List<? extends T> items, @dl.e yh.p<? super Integer, ? super T, ? extends Object> pVar, @dl.d yh.p<? super Integer, ? super T, ? extends Object> contentType, @dl.d yh.s<? super g, ? super Integer, ? super T, ? super androidx.compose.runtime.p, ? super Integer, b2> itemContent) {
        f0.p(wVar, "<this>");
        f0.p(items, "items");
        f0.p(contentType, "contentType");
        f0.p(itemContent, "itemContent");
        wVar.b(items.size(), pVar != null ? new LazyDslKt$itemsIndexed$2(pVar, items) : null, new LazyDslKt$itemsIndexed$3(contentType, items), androidx.compose.runtime.internal.b.c(-1091073711, true, new LazyDslKt$itemsIndexed$4(itemContent, items)));
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    @androidx.compose.runtime.i(scheme = "[0[0]]")
    public static final /* synthetic */ <T> void n(w wVar, List<? extends T> items, yh.p<? super Integer, ? super T, ? extends Object> pVar, yh.s<? super g, ? super Integer, ? super T, ? super androidx.compose.runtime.p, ? super Integer, b2> itemContent) {
        f0.p(wVar, "<this>");
        f0.p(items, "items");
        f0.p(itemContent, "itemContent");
        wVar.b(items.size(), pVar != null ? new LazyDslKt$itemsIndexed$2(pVar, items) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$1(items), androidx.compose.runtime.internal.b.c(-1091073711, true, new LazyDslKt$itemsIndexed$4(itemContent, items)));
    }

    @androidx.compose.runtime.i(scheme = "[0[0]]")
    public static final <T> void o(@dl.d w wVar, @dl.d T[] items, @dl.e yh.p<? super Integer, ? super T, ? extends Object> pVar, @dl.d yh.p<? super Integer, ? super T, ? extends Object> contentType, @dl.d yh.s<? super g, ? super Integer, ? super T, ? super androidx.compose.runtime.p, ? super Integer, b2> itemContent) {
        f0.p(wVar, "<this>");
        f0.p(items, "items");
        f0.p(contentType, "contentType");
        f0.p(itemContent, "itemContent");
        wVar.b(items.length, pVar != null ? new LazyDslKt$itemsIndexed$6(pVar, items) : null, new LazyDslKt$itemsIndexed$7(contentType, items), androidx.compose.runtime.internal.b.c(1600639390, true, new LazyDslKt$itemsIndexed$8(itemContent, items)));
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    @androidx.compose.runtime.i(scheme = "[0[0]]")
    public static final /* synthetic */ <T> void p(w wVar, T[] items, yh.p<? super Integer, ? super T, ? extends Object> pVar, yh.s<? super g, ? super Integer, ? super T, ? super androidx.compose.runtime.p, ? super Integer, b2> itemContent) {
        f0.p(wVar, "<this>");
        f0.p(items, "items");
        f0.p(itemContent, "itemContent");
        wVar.b(items.length, pVar != null ? new LazyDslKt$itemsIndexed$6(pVar, items) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$2(items), androidx.compose.runtime.internal.b.c(1600639390, true, new LazyDslKt$itemsIndexed$8(itemContent, items)));
    }

    public static /* synthetic */ void q(w wVar, List items, yh.p pVar, yh.p contentType, yh.s itemContent, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            pVar = null;
        }
        if ((i10 & 4) != 0) {
            contentType = new yh.p() { // from class: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$1
                @dl.e
                public final Void a(int i11, Object obj2) {
                    return null;
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return a(((Number) obj2).intValue(), obj3);
                }
            };
        }
        f0.p(wVar, "<this>");
        f0.p(items, "items");
        f0.p(contentType, "contentType");
        f0.p(itemContent, "itemContent");
        wVar.b(items.size(), pVar != null ? new LazyDslKt$itemsIndexed$2(pVar, items) : null, new LazyDslKt$itemsIndexed$3(contentType, items), androidx.compose.runtime.internal.b.c(-1091073711, true, new LazyDslKt$itemsIndexed$4(itemContent, items)));
    }

    public static /* synthetic */ void r(w wVar, List items, yh.p pVar, yh.s itemContent, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            pVar = null;
        }
        f0.p(wVar, "<this>");
        f0.p(items, "items");
        f0.p(itemContent, "itemContent");
        wVar.b(items.size(), pVar != null ? new LazyDslKt$itemsIndexed$2(pVar, items) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$1(items), androidx.compose.runtime.internal.b.c(-1091073711, true, new LazyDslKt$itemsIndexed$4(itemContent, items)));
    }

    public static /* synthetic */ void s(w wVar, Object[] items, yh.p pVar, yh.p contentType, yh.s itemContent, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            pVar = null;
        }
        if ((i10 & 4) != 0) {
            contentType = new yh.p() { // from class: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$5
                @dl.e
                public final Void a(int i11, Object obj2) {
                    return null;
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return a(((Number) obj2).intValue(), obj3);
                }
            };
        }
        f0.p(wVar, "<this>");
        f0.p(items, "items");
        f0.p(contentType, "contentType");
        f0.p(itemContent, "itemContent");
        wVar.b(items.length, pVar != null ? new LazyDslKt$itemsIndexed$6(pVar, items) : null, new LazyDslKt$itemsIndexed$7(contentType, items), androidx.compose.runtime.internal.b.c(1600639390, true, new LazyDslKt$itemsIndexed$8(itemContent, items)));
    }

    public static /* synthetic */ void t(w wVar, Object[] items, yh.p pVar, yh.s itemContent, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            pVar = null;
        }
        f0.p(wVar, "<this>");
        f0.p(items, "items");
        f0.p(itemContent, "itemContent");
        wVar.b(items.length, pVar != null ? new LazyDslKt$itemsIndexed$6(pVar, items) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$2(items), androidx.compose.runtime.internal.b.c(1600639390, true, new LazyDslKt$itemsIndexed$8(itemContent, items)));
    }
}
