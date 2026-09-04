package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.m0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.u1;
import androidx.compose.ui.unit.LayoutDirection;
import com.max.xiaoheihe.module.bbs.ChannelListActivity;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyGridDsl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\u001a\u0080\u0001\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0080\u0001\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001aG\u0010 \u001a\u001f\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001b¢\u0006\u0002\b\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001aG\u0010\"\u001a\u001f\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001b¢\u0006\u0002\b\u00142\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a&\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u001fH\u0002\u001aã\u0001\u00106\u001a\u00020\u0013\"\u0004\b\u0000\u0010(*\u00020\u00122\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2%\b\n\u0010.\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020-\u0018\u00010\u001120\b\n\u00101\u001a*\u0012\u0004\u0012\u00020/\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u000200\u0018\u00010\u001b¢\u0006\u0002\b\u00142%\b\n\u00102\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0006\u0012\u0004\u0018\u00010-0\u001123\b\u0004\u00105\u001a-\u0012\u0004\u0012\u000203\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u00130\u001b¢\u0006\u0002\b4¢\u0006\u0002\b\u0014H\u0086\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b6\u00107\u001a·\u0002\u0010:\u001a\u00020\u0013\"\u0004\b\u0000\u0010(*\u00020\u00122\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2:\b\n\u0010.\u001a4\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(8\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020-\u0018\u00010\u001b2E\b\n\u00101\u001a?\u0012\u0004\u0012\u00020/\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(8\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u000200\u0018\u000109¢\u0006\u0002\b\u00142:\b\u0006\u00102\u001a4\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(8\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0006\u0012\u0004\u0018\u00010-0\u001b2H\b\u0004\u00105\u001aB\u0012\u0004\u0012\u000203\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(8\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u001309¢\u0006\u0002\b4¢\u0006\u0002\b\u0014H\u0086\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b:\u0010;\u001aã\u0001\u0010=\u001a\u00020\u0013\"\u0004\b\u0000\u0010(*\u00020\u00122\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000<2%\b\n\u0010.\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020-\u0018\u00010\u001120\b\n\u00101\u001a*\u0012\u0004\u0012\u00020/\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u000200\u0018\u00010\u001b¢\u0006\u0002\b\u00142%\b\n\u00102\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0006\u0012\u0004\u0018\u00010-0\u001123\b\u0004\u00105\u001a-\u0012\u0004\u0012\u000203\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u00130\u001b¢\u0006\u0002\b4¢\u0006\u0002\b\u0014H\u0086\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b=\u0010>\u001a·\u0002\u0010?\u001a\u00020\u0013\"\u0004\b\u0000\u0010(*\u00020\u00122\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000<2:\b\n\u0010.\u001a4\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(8\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020-\u0018\u00010\u001b2E\b\n\u00101\u001a?\u0012\u0004\u0012\u00020/\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(8\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u000200\u0018\u000109¢\u0006\u0002\b\u00142:\b\u0006\u00102\u001a4\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(8\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0006\u0012\u0004\u0018\u00010-0\u001b2H\b\u0004\u00105\u001aB\u0012\u0004\u0012\u000203\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(8\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u001309¢\u0006\u0002\b4¢\u0006\u0002\b\u0014H\u0086\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010@\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006A"}, d2 = {"Landroidx/compose/foundation/lazy/grid/c;", com.tekartik.sqflite.b.f98606y, "Landroidx/compose/ui/n;", "modifier", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "state", "Landroidx/compose/foundation/layout/m0;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/layout/Arrangement$l;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$d;", "horizontalArrangement", "Landroidx/compose/foundation/gestures/g;", "flingBehavior", "userScrollEnabled", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/s;", "Lkotlin/b2;", "Lkotlin/t;", "content", "b", "(Landroidx/compose/foundation/lazy/grid/c;Landroidx/compose/ui/n;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/m0;ZLandroidx/compose/foundation/layout/Arrangement$l;Landroidx/compose/foundation/layout/Arrangement$d;Landroidx/compose/foundation/gestures/g;ZLyh/l;Landroidx/compose/runtime/p;II)V", com.tekartik.sqflite.b.f98607z, ak.av, "(Landroidx/compose/foundation/lazy/grid/c;Landroidx/compose/ui/n;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/m0;ZLandroidx/compose/foundation/layout/Arrangement$d;Landroidx/compose/foundation/layout/Arrangement$l;Landroidx/compose/foundation/gestures/g;ZLyh/l;Landroidx/compose/runtime/p;II)V", "Lkotlin/Function2;", "Ls1/e;", "Ls1/b;", "", "", "m", "(Landroidx/compose/foundation/lazy/grid/c;Landroidx/compose/foundation/layout/Arrangement$d;Landroidx/compose/foundation/layout/m0;Landroidx/compose/runtime/p;I)Lyh/p;", "n", "(Landroidx/compose/foundation/lazy/grid/c;Landroidx/compose/foundation/layout/Arrangement$l;Landroidx/compose/foundation/layout/m0;Landroidx/compose/runtime/p;I)Lyh/p;", "gridSize", "slotCount", "spacing", "d", androidx.exifinterface.media.a.f23244d5, "items", "Lkotlin/m0;", "name", ChannelListActivity.q.f79586f, "", "key", "Landroidx/compose/foundation/lazy/grid/m;", "Landroidx/compose/foundation/lazy/grid/d;", com.google.android.exoplayer2.text.ttml.d.f49805s, "contentType", "Landroidx/compose/foundation/lazy/grid/l;", "Landroidx/compose/runtime/h;", "itemContent", "e", "(Landroidx/compose/foundation/lazy/grid/s;Ljava/util/List;Lyh/l;Lyh/p;Lyh/l;Lyh/r;)V", UCropPlusActivity.ARG_INDEX, "Lkotlin/Function3;", "i", "(Landroidx/compose/foundation/lazy/grid/s;Ljava/util/List;Lyh/p;Lyh/q;Lyh/p;Lyh/s;)V", "", "f", "(Landroidx/compose/foundation/lazy/grid/s;[Ljava/lang/Object;Lyh/l;Lyh/p;Lyh/l;Lyh/r;)V", "j", "(Landroidx/compose/foundation/lazy/grid/s;[Ljava/lang/Object;Lyh/p;Lyh/q;Lyh/p;Lyh/s;)V", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class LazyGridDslKt {
    /* JADX WARN: Code duplicated, block: B:101:0x0125  */
    /* JADX WARN: Code duplicated, block: B:103:0x0129  */
    /* JADX WARN: Code duplicated, block: B:105:0x012d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0133  */
    /* JADX WARN: Code duplicated, block: B:108:0x0136  */
    /* JADX WARN: Code duplicated, block: B:111:0x0142  */
    /* JADX WARN: Code duplicated, block: B:115:0x015b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0165  */
    /* JADX WARN: Code duplicated, block: B:130:0x0192 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x0194  */
    /* JADX WARN: Code duplicated, block: B:132:0x0197  */
    /* JADX WARN: Code duplicated, block: B:135:0x019e  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:145:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:150:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:152:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:156:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:157:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:159:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:160:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:164:0x0206  */
    /* JADX WARN: Code duplicated, block: B:167:0x026c  */
    /* JADX WARN: Code duplicated, block: B:172:0x0285  */
    /* JADX WARN: Code duplicated, block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:54:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00da  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:91:0x0105  */
    /* JADX WARN: Code duplicated, block: B:92:0x010c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0112  */
    /* JADX WARN: Code duplicated, block: B:96:0x0118  */
    /* JADX WARN: Code duplicated, block: B:97:0x011b  */
    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public static final void a(@dl.d final c rows, @dl.e androidx.compose.ui.n nVar, @dl.e LazyGridState lazyGridState, @dl.e m0 m0Var, boolean z10, @dl.e Arrangement.d dVar, @dl.e Arrangement.l lVar, @dl.e androidx.compose.foundation.gestures.g gVar, boolean z11, @dl.d final yh.l<? super s, b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        LazyGridState lazyGridState2;
        int i13;
        m0 m0Var2;
        int i14;
        int i15;
        boolean z12;
        int i16;
        Arrangement.d dVar2;
        int i17;
        Arrangement.l lVar2;
        int i18;
        int i19;
        int i20;
        int i21;
        androidx.compose.ui.n nVar2;
        LazyGridState lazyGridStateA;
        m0 m0VarA;
        boolean z13;
        Arrangement.d dVarH;
        Arrangement.l lVarR;
        androidx.compose.foundation.gestures.g gVarA;
        boolean z14;
        LazyGridState lazyGridState3;
        boolean z15;
        m0 m0Var3;
        Arrangement.d dVar3;
        Arrangement.l lVar3;
        androidx.compose.foundation.gestures.g gVar2;
        Arrangement arrangement;
        final androidx.compose.ui.n nVar3;
        final Arrangement.l lVar4;
        final m0 m0Var4;
        final LazyGridState lazyGridState4;
        final boolean z16;
        final Arrangement.d dVar4;
        final androidx.compose.foundation.gestures.g gVar3;
        final boolean z17;
        u1 u1VarH;
        f0.p(rows, "rows");
        f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(2123608858);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.s(rows) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i22 = i11 & 2;
        if (i22 == 0) {
            if ((i10 & 112) == 0) {
                i12 |= pVarF.s(nVar) ? 32 : 16;
            }
            if ((i10 & bb.c.b.f30796me) == 0) {
                if ((i11 & 4) == 0) {
                    lazyGridState2 = lazyGridState;
                    int i23 = pVarF.s(lazyGridState2) ? 256 : 128;
                    i12 |= i23;
                } else {
                    lazyGridState2 = lazyGridState;
                }
                i12 |= i23;
            } else {
                lazyGridState2 = lazyGridState;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & bb.c.g.f32954lc) == 0) {
                    m0Var2 = m0Var;
                    if (pVarF.s(m0Var2)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    if ((i10 & 57344) == 0) {
                        z12 = z10;
                        if (pVarF.u(z12)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    if ((458752 & i10) == 0) {
                        if ((i11 & 32) == 0) {
                            dVar2 = dVar;
                            int i24 = pVarF.s(dVar2) ? 131072 : 65536;
                            i12 |= i24;
                        } else {
                            dVar2 = dVar;
                        }
                        i12 |= i24;
                    } else {
                        dVar2 = dVar;
                    }
                    i17 = i11 & 64;
                    if (i17 != 0) {
                        i12 |= 1572864;
                        lVar2 = lVar;
                    } else {
                        lVar2 = lVar;
                        if ((i10 & 3670016) == 0) {
                            if (pVarF.s(lVar2)) {
                                i18 = 1048576;
                            } else {
                                i18 = 524288;
                            }
                            i12 |= i18;
                        }
                    }
                    if ((i10 & 29360128) != 0) {
                        i12 |= ((i11 & 128) == 0 || !pVarF.s(gVar)) ? 4194304 : 8388608;
                    }
                    i19 = i11 & 256;
                    if (i19 != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 234881024) == 0) {
                        if (pVarF.u(z11)) {
                            i20 = 67108864;
                        } else {
                            i20 = 33554432;
                        }
                        i12 |= i20;
                    }
                    if ((i11 & 512) != 0) {
                        if ((i10 & 1879048192) == 0) {
                            if (pVarF.s(content)) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                        }
                        if ((1533916891 & i12) == 306783378 || !pVarF.b()) {
                            pVarF.W();
                            if ((i10 & 1) != 0 || pVarF.o()) {
                                if (i22 != 0) {
                                    nVar2 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar2 = nVar;
                                }
                                if ((i11 & 4) != 0) {
                                    lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                                    i12 &= -897;
                                } else {
                                    lazyGridStateA = lazyGridState2;
                                }
                                if (i13 != 0) {
                                    m0VarA = PaddingKt.a(s1.h.g(0));
                                } else {
                                    m0VarA = m0Var2;
                                }
                                z13 = i15 == 0 ? z12 : false;
                                if ((i11 & 32) != 0) {
                                    arrangement = Arrangement.f5896a;
                                    if (z13) {
                                        dVarH = arrangement.h();
                                    } else {
                                        dVarH = arrangement.p();
                                    }
                                    i12 &= -458753;
                                } else {
                                    dVarH = dVar2;
                                }
                                if (i17 != 0) {
                                    lVarR = Arrangement.f5896a.r();
                                } else {
                                    lVarR = lVar2;
                                }
                                if ((i11 & 128) != 0) {
                                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                    i12 &= -29360129;
                                } else {
                                    gVarA = gVar;
                                }
                                if (i19 != 0) {
                                    z14 = true;
                                } else {
                                    z14 = z11;
                                }
                                lazyGridState3 = lazyGridStateA;
                                z15 = z13;
                                m0Var3 = m0VarA;
                                dVar3 = dVarH;
                                lVar3 = lVarR;
                                gVar2 = gVarA;
                            } else {
                                pVarF.l();
                                if ((i11 & 4) != 0) {
                                    i12 &= -897;
                                }
                                if ((i11 & 32) != 0) {
                                    i12 &= -458753;
                                }
                                if ((i11 & 128) != 0) {
                                    i12 &= -29360129;
                                }
                                nVar2 = nVar;
                                gVar2 = gVar;
                                z14 = z11;
                                lazyGridState3 = lazyGridState2;
                                z15 = z12;
                                dVar3 = dVar2;
                                m0Var3 = m0Var2;
                                lVar3 = lVar2;
                            }
                            pVarF.O();
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(2123608858, i12, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:116)");
                            }
                            int i25 = i12 >> 3;
                            Arrangement.l lVar5 = lVar3;
                            m0 m0Var5 = m0Var3;
                            LazyGridKt.a(nVar2, lazyGridState3, n(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i25 & bb.c.b.f30796me)), m0Var3, z15, false, gVar2, z14, lVar3, dVar3, content, pVarF, 196608 | (i25 & 14) | (i25 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i25 & 3670016) | (i25 & 29360128) | ((i12 << 6) & 234881024) | ((i12 << 12) & 1879048192), (i12 >> 27) & 14, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            nVar3 = nVar2;
                            lVar4 = lVar5;
                            m0Var4 = m0Var5;
                            lazyGridState4 = lazyGridState3;
                            z16 = z15;
                            dVar4 = dVar3;
                            gVar3 = gVar2;
                            z17 = z14;
                        } else {
                            pVarF.l();
                            nVar3 = nVar;
                            z17 = z11;
                            lazyGridState4 = lazyGridState2;
                            m0Var4 = m0Var2;
                            lVar4 = lVar2;
                            z16 = z12;
                            dVar4 = dVar2;
                            gVar3 = gVar;
                        }
                        u1VarH = pVarF.H();
                        if (u1VarH == null) {
                            return;
                        }
                        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyHorizontalGrid$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i26) {
                                LazyGridDslKt.a(rows, nVar3, lazyGridState4, m0Var4, z16, dVar4, lVar4, gVar3, z17, content, pVar2, i10 | 1, i11);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return b2.f124493a;
                            }
                        });
                    }
                    i21 = com.google.android.exoplayer2.j.G;
                    i12 |= i21;
                    if ((1533916891 & i12) == 306783378) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState2;
                            }
                            if (i13 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.f5896a;
                                if (z13) {
                                    dVarH = arrangement.p();
                                } else {
                                    dVarH = arrangement.h();
                                }
                                i12 &= -458753;
                            } else {
                                dVarH = dVar2;
                            }
                            if (i17 != 0) {
                                lVarR = Arrangement.f5896a.r();
                            } else {
                                lVarR = lVar2;
                            }
                            if ((i11 & 128) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                gVarA = gVar;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            lazyGridState3 = lazyGridStateA;
                            z15 = z13;
                            m0Var3 = m0VarA;
                            dVar3 = dVarH;
                            lVar3 = lVarR;
                            gVar2 = gVarA;
                        } else {
                            if (i22 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState2;
                            }
                            if (i13 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.f5896a;
                                if (z13) {
                                    dVarH = arrangement.p();
                                } else {
                                    dVarH = arrangement.h();
                                }
                                i12 &= -458753;
                            } else {
                                dVarH = dVar2;
                            }
                            if (i17 != 0) {
                                lVarR = Arrangement.f5896a.r();
                            } else {
                                lVarR = lVar2;
                            }
                            if ((i11 & 128) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                gVarA = gVar;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            lazyGridState3 = lazyGridStateA;
                            z15 = z13;
                            m0Var3 = m0VarA;
                            dVar3 = dVarH;
                            lVar3 = lVarR;
                            gVar2 = gVarA;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(2123608858, i12, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:116)");
                        }
                        int i26 = i12 >> 3;
                        Arrangement.l lVar6 = lVar3;
                        m0 m0Var6 = m0Var3;
                        LazyGridKt.a(nVar2, lazyGridState3, n(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i26 & bb.c.b.f30796me)), m0Var3, z15, false, gVar2, z14, lVar3, dVar3, content, pVarF, 196608 | (i26 & 14) | (i26 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i26 & 3670016) | (i26 & 29360128) | ((i12 << 6) & 234881024) | ((i12 << 12) & 1879048192), (i12 >> 27) & 14, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar3 = nVar2;
                        lVar4 = lVar6;
                        m0Var4 = m0Var6;
                        lazyGridState4 = lazyGridState3;
                        z16 = z15;
                        dVar4 = dVar3;
                        gVar3 = gVar2;
                        z17 = z14;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState2;
                            }
                            if (i13 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.f5896a;
                                if (z13) {
                                    dVarH = arrangement.p();
                                } else {
                                    dVarH = arrangement.h();
                                }
                                i12 &= -458753;
                            } else {
                                dVarH = dVar2;
                            }
                            if (i17 != 0) {
                                lVarR = Arrangement.f5896a.r();
                            } else {
                                lVarR = lVar2;
                            }
                            if ((i11 & 128) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                gVarA = gVar;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            lazyGridState3 = lazyGridStateA;
                            z15 = z13;
                            m0Var3 = m0VarA;
                            dVar3 = dVarH;
                            lVar3 = lVarR;
                            gVar2 = gVarA;
                        } else {
                            if (i22 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState2;
                            }
                            if (i13 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.f5896a;
                                if (z13) {
                                    dVarH = arrangement.p();
                                } else {
                                    dVarH = arrangement.h();
                                }
                                i12 &= -458753;
                            } else {
                                dVarH = dVar2;
                            }
                            if (i17 != 0) {
                                lVarR = Arrangement.f5896a.r();
                            } else {
                                lVarR = lVar2;
                            }
                            if ((i11 & 128) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                gVarA = gVar;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            lazyGridState3 = lazyGridStateA;
                            z15 = z13;
                            m0Var3 = m0VarA;
                            dVar3 = dVarH;
                            lVar3 = lVarR;
                            gVar2 = gVarA;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(2123608858, i12, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:116)");
                        }
                        int i27 = i12 >> 3;
                        Arrangement.l lVar7 = lVar3;
                        m0 m0Var7 = m0Var3;
                        LazyGridKt.a(nVar2, lazyGridState3, n(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i27 & bb.c.b.f30796me)), m0Var3, z15, false, gVar2, z14, lVar3, dVar3, content, pVarF, 196608 | (i27 & 14) | (i27 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i27 & 3670016) | (i27 & 29360128) | ((i12 << 6) & 234881024) | ((i12 << 12) & 1879048192), (i12 >> 27) & 14, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar3 = nVar2;
                        lVar4 = lVar7;
                        m0Var4 = m0Var7;
                        lazyGridState4 = lazyGridState3;
                        z16 = z15;
                        dVar4 = dVar3;
                        gVar3 = gVar2;
                        z17 = z14;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyHorizontalGrid$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i28) {
                            LazyGridDslKt.a(rows, nVar3, lazyGridState4, m0Var4, z16, dVar4, lVar4, gVar3, z17, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i12 |= 24576;
                z12 = z10;
                if ((458752 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        dVar2 = dVar;
                        if (pVarF.s(dVar2)) {
                        }
                        i12 |= i24;
                    } else {
                        dVar2 = dVar;
                    }
                    i12 |= i24;
                } else {
                    dVar2 = dVar;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                    lVar2 = lVar;
                } else {
                    lVar2 = lVar;
                    if ((i10 & 3670016) == 0) {
                        if (pVarF.s(lVar2)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !pVarF.s(gVar)) ? 4194304 : 8388608;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (pVarF.u(z11)) {
                        i20 = 67108864;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i11 & 512) != 0) {
                    if ((i10 & 1879048192) == 0) {
                        if (pVarF.s(content)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                    }
                    if ((1533916891 & i12) == 306783378) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState2;
                            }
                            if (i13 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.f5896a;
                                if (z13) {
                                    dVarH = arrangement.p();
                                } else {
                                    dVarH = arrangement.h();
                                }
                                i12 &= -458753;
                            } else {
                                dVarH = dVar2;
                            }
                            if (i17 != 0) {
                                lVarR = Arrangement.f5896a.r();
                            } else {
                                lVarR = lVar2;
                            }
                            if ((i11 & 128) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                gVarA = gVar;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            lazyGridState3 = lazyGridStateA;
                            z15 = z13;
                            m0Var3 = m0VarA;
                            dVar3 = dVarH;
                            lVar3 = lVarR;
                            gVar2 = gVarA;
                        } else {
                            if (i22 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState2;
                            }
                            if (i13 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.f5896a;
                                if (z13) {
                                    dVarH = arrangement.p();
                                } else {
                                    dVarH = arrangement.h();
                                }
                                i12 &= -458753;
                            } else {
                                dVarH = dVar2;
                            }
                            if (i17 != 0) {
                                lVarR = Arrangement.f5896a.r();
                            } else {
                                lVarR = lVar2;
                            }
                            if ((i11 & 128) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                gVarA = gVar;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            lazyGridState3 = lazyGridStateA;
                            z15 = z13;
                            m0Var3 = m0VarA;
                            dVar3 = dVarH;
                            lVar3 = lVarR;
                            gVar2 = gVarA;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(2123608858, i12, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:116)");
                        }
                        int i28 = i12 >> 3;
                        Arrangement.l lVar8 = lVar3;
                        m0 m0Var8 = m0Var3;
                        LazyGridKt.a(nVar2, lazyGridState3, n(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i28 & bb.c.b.f30796me)), m0Var3, z15, false, gVar2, z14, lVar3, dVar3, content, pVarF, 196608 | (i28 & 14) | (i28 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i28 & 3670016) | (i28 & 29360128) | ((i12 << 6) & 234881024) | ((i12 << 12) & 1879048192), (i12 >> 27) & 14, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar3 = nVar2;
                        lVar4 = lVar8;
                        m0Var4 = m0Var8;
                        lazyGridState4 = lazyGridState3;
                        z16 = z15;
                        dVar4 = dVar3;
                        gVar3 = gVar2;
                        z17 = z14;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState2;
                            }
                            if (i13 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.f5896a;
                                if (z13) {
                                    dVarH = arrangement.p();
                                } else {
                                    dVarH = arrangement.h();
                                }
                                i12 &= -458753;
                            } else {
                                dVarH = dVar2;
                            }
                            if (i17 != 0) {
                                lVarR = Arrangement.f5896a.r();
                            } else {
                                lVarR = lVar2;
                            }
                            if ((i11 & 128) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                gVarA = gVar;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            lazyGridState3 = lazyGridStateA;
                            z15 = z13;
                            m0Var3 = m0VarA;
                            dVar3 = dVarH;
                            lVar3 = lVarR;
                            gVar2 = gVarA;
                        } else {
                            if (i22 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState2;
                            }
                            if (i13 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.f5896a;
                                if (z13) {
                                    dVarH = arrangement.p();
                                } else {
                                    dVarH = arrangement.h();
                                }
                                i12 &= -458753;
                            } else {
                                dVarH = dVar2;
                            }
                            if (i17 != 0) {
                                lVarR = Arrangement.f5896a.r();
                            } else {
                                lVarR = lVar2;
                            }
                            if ((i11 & 128) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                gVarA = gVar;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            lazyGridState3 = lazyGridStateA;
                            z15 = z13;
                            m0Var3 = m0VarA;
                            dVar3 = dVarH;
                            lVar3 = lVarR;
                            gVar2 = gVarA;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(2123608858, i12, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:116)");
                        }
                        int i29 = i12 >> 3;
                        Arrangement.l lVar9 = lVar3;
                        m0 m0Var9 = m0Var3;
                        LazyGridKt.a(nVar2, lazyGridState3, n(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i29 & bb.c.b.f30796me)), m0Var3, z15, false, gVar2, z14, lVar3, dVar3, content, pVarF, 196608 | (i29 & 14) | (i29 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i29 & 3670016) | (i29 & 29360128) | ((i12 << 6) & 234881024) | ((i12 << 12) & 1879048192), (i12 >> 27) & 14, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar3 = nVar2;
                        lVar4 = lVar9;
                        m0Var4 = m0Var9;
                        lazyGridState4 = lazyGridState3;
                        z16 = z15;
                        dVar4 = dVar3;
                        gVar3 = gVar2;
                        z17 = z14;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyHorizontalGrid$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i210) {
                            LazyGridDslKt.a(rows, nVar3, lazyGridState4, m0Var4, z16, dVar4, lVar4, gVar3, z17, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i21 = com.google.android.exoplayer2.j.G;
                i12 |= i21;
                if ((1533916891 & i12) == 306783378) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                dVarH = arrangement.p();
                            } else {
                                dVarH = arrangement.h();
                            }
                            i12 &= -458753;
                        } else {
                            dVarH = dVar2;
                        }
                        if (i17 != 0) {
                            lVarR = Arrangement.f5896a.r();
                        } else {
                            lVarR = lVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        dVar3 = dVarH;
                        lVar3 = lVarR;
                        gVar2 = gVarA;
                    } else {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                dVarH = arrangement.p();
                            } else {
                                dVarH = arrangement.h();
                            }
                            i12 &= -458753;
                        } else {
                            dVarH = dVar2;
                        }
                        if (i17 != 0) {
                            lVarR = Arrangement.f5896a.r();
                        } else {
                            lVarR = lVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        dVar3 = dVarH;
                        lVar3 = lVarR;
                        gVar2 = gVarA;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(2123608858, i12, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:116)");
                    }
                    int i210 = i12 >> 3;
                    Arrangement.l lVar10 = lVar3;
                    m0 m0Var10 = m0Var3;
                    LazyGridKt.a(nVar2, lazyGridState3, n(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i210 & bb.c.b.f30796me)), m0Var3, z15, false, gVar2, z14, lVar3, dVar3, content, pVarF, 196608 | (i210 & 14) | (i210 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i210 & 3670016) | (i210 & 29360128) | ((i12 << 6) & 234881024) | ((i12 << 12) & 1879048192), (i12 >> 27) & 14, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar3 = nVar2;
                    lVar4 = lVar10;
                    m0Var4 = m0Var10;
                    lazyGridState4 = lazyGridState3;
                    z16 = z15;
                    dVar4 = dVar3;
                    gVar3 = gVar2;
                    z17 = z14;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                dVarH = arrangement.p();
                            } else {
                                dVarH = arrangement.h();
                            }
                            i12 &= -458753;
                        } else {
                            dVarH = dVar2;
                        }
                        if (i17 != 0) {
                            lVarR = Arrangement.f5896a.r();
                        } else {
                            lVarR = lVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        dVar3 = dVarH;
                        lVar3 = lVarR;
                        gVar2 = gVarA;
                    } else {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                dVarH = arrangement.p();
                            } else {
                                dVarH = arrangement.h();
                            }
                            i12 &= -458753;
                        } else {
                            dVarH = dVar2;
                        }
                        if (i17 != 0) {
                            lVarR = Arrangement.f5896a.r();
                        } else {
                            lVarR = lVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        dVar3 = dVarH;
                        lVar3 = lVarR;
                        gVar2 = gVarA;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(2123608858, i12, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:116)");
                    }
                    int i211 = i12 >> 3;
                    Arrangement.l lVar11 = lVar3;
                    m0 m0Var11 = m0Var3;
                    LazyGridKt.a(nVar2, lazyGridState3, n(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i211 & bb.c.b.f30796me)), m0Var3, z15, false, gVar2, z14, lVar3, dVar3, content, pVarF, 196608 | (i211 & 14) | (i211 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i211 & 3670016) | (i211 & 29360128) | ((i12 << 6) & 234881024) | ((i12 << 12) & 1879048192), (i12 >> 27) & 14, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar3 = nVar2;
                    lVar4 = lVar11;
                    m0Var4 = m0Var11;
                    lazyGridState4 = lazyGridState3;
                    z16 = z15;
                    dVar4 = dVar3;
                    gVar3 = gVar2;
                    z17 = z14;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyHorizontalGrid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i212) {
                        LazyGridDslKt.a(rows, nVar3, lazyGridState4, m0Var4, z16, dVar4, lVar4, gVar3, z17, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= bb.c.d.f31193dj;
            m0Var2 = m0Var;
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 57344) == 0) {
                    z12 = z10;
                    if (pVarF.u(z12)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((458752 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        dVar2 = dVar;
                        if (pVarF.s(dVar2)) {
                        }
                        i12 |= i24;
                    } else {
                        dVar2 = dVar;
                    }
                    i12 |= i24;
                } else {
                    dVar2 = dVar;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                    lVar2 = lVar;
                } else {
                    lVar2 = lVar;
                    if ((i10 & 3670016) == 0) {
                        if (pVarF.s(lVar2)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !pVarF.s(gVar)) ? 4194304 : 8388608;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (pVarF.u(z11)) {
                        i20 = 67108864;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i11 & 512) != 0) {
                    if ((i10 & 1879048192) == 0) {
                        if (pVarF.s(content)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                    }
                    if ((1533916891 & i12) == 306783378) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState2;
                            }
                            if (i13 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.f5896a;
                                if (z13) {
                                    dVarH = arrangement.p();
                                } else {
                                    dVarH = arrangement.h();
                                }
                                i12 &= -458753;
                            } else {
                                dVarH = dVar2;
                            }
                            if (i17 != 0) {
                                lVarR = Arrangement.f5896a.r();
                            } else {
                                lVarR = lVar2;
                            }
                            if ((i11 & 128) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                gVarA = gVar;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            lazyGridState3 = lazyGridStateA;
                            z15 = z13;
                            m0Var3 = m0VarA;
                            dVar3 = dVarH;
                            lVar3 = lVarR;
                            gVar2 = gVarA;
                        } else {
                            if (i22 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState2;
                            }
                            if (i13 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.f5896a;
                                if (z13) {
                                    dVarH = arrangement.p();
                                } else {
                                    dVarH = arrangement.h();
                                }
                                i12 &= -458753;
                            } else {
                                dVarH = dVar2;
                            }
                            if (i17 != 0) {
                                lVarR = Arrangement.f5896a.r();
                            } else {
                                lVarR = lVar2;
                            }
                            if ((i11 & 128) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                gVarA = gVar;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            lazyGridState3 = lazyGridStateA;
                            z15 = z13;
                            m0Var3 = m0VarA;
                            dVar3 = dVarH;
                            lVar3 = lVarR;
                            gVar2 = gVarA;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(2123608858, i12, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:116)");
                        }
                        int i212 = i12 >> 3;
                        Arrangement.l lVar12 = lVar3;
                        m0 m0Var12 = m0Var3;
                        LazyGridKt.a(nVar2, lazyGridState3, n(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i212 & bb.c.b.f30796me)), m0Var3, z15, false, gVar2, z14, lVar3, dVar3, content, pVarF, 196608 | (i212 & 14) | (i212 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i212 & 3670016) | (i212 & 29360128) | ((i12 << 6) & 234881024) | ((i12 << 12) & 1879048192), (i12 >> 27) & 14, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar3 = nVar2;
                        lVar4 = lVar12;
                        m0Var4 = m0Var12;
                        lazyGridState4 = lazyGridState3;
                        z16 = z15;
                        dVar4 = dVar3;
                        gVar3 = gVar2;
                        z17 = z14;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState2;
                            }
                            if (i13 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.f5896a;
                                if (z13) {
                                    dVarH = arrangement.p();
                                } else {
                                    dVarH = arrangement.h();
                                }
                                i12 &= -458753;
                            } else {
                                dVarH = dVar2;
                            }
                            if (i17 != 0) {
                                lVarR = Arrangement.f5896a.r();
                            } else {
                                lVarR = lVar2;
                            }
                            if ((i11 & 128) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                gVarA = gVar;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            lazyGridState3 = lazyGridStateA;
                            z15 = z13;
                            m0Var3 = m0VarA;
                            dVar3 = dVarH;
                            lVar3 = lVarR;
                            gVar2 = gVarA;
                        } else {
                            if (i22 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState2;
                            }
                            if (i13 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.f5896a;
                                if (z13) {
                                    dVarH = arrangement.p();
                                } else {
                                    dVarH = arrangement.h();
                                }
                                i12 &= -458753;
                            } else {
                                dVarH = dVar2;
                            }
                            if (i17 != 0) {
                                lVarR = Arrangement.f5896a.r();
                            } else {
                                lVarR = lVar2;
                            }
                            if ((i11 & 128) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                gVarA = gVar;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            lazyGridState3 = lazyGridStateA;
                            z15 = z13;
                            m0Var3 = m0VarA;
                            dVar3 = dVarH;
                            lVar3 = lVarR;
                            gVar2 = gVarA;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(2123608858, i12, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:116)");
                        }
                        int i213 = i12 >> 3;
                        Arrangement.l lVar13 = lVar3;
                        m0 m0Var13 = m0Var3;
                        LazyGridKt.a(nVar2, lazyGridState3, n(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i213 & bb.c.b.f30796me)), m0Var3, z15, false, gVar2, z14, lVar3, dVar3, content, pVarF, 196608 | (i213 & 14) | (i213 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i213 & 3670016) | (i213 & 29360128) | ((i12 << 6) & 234881024) | ((i12 << 12) & 1879048192), (i12 >> 27) & 14, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar3 = nVar2;
                        lVar4 = lVar13;
                        m0Var4 = m0Var13;
                        lazyGridState4 = lazyGridState3;
                        z16 = z15;
                        dVar4 = dVar3;
                        gVar3 = gVar2;
                        z17 = z14;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyHorizontalGrid$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i214) {
                            LazyGridDslKt.a(rows, nVar3, lazyGridState4, m0Var4, z16, dVar4, lVar4, gVar3, z17, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i21 = com.google.android.exoplayer2.j.G;
                i12 |= i21;
                if ((1533916891 & i12) == 306783378) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                dVarH = arrangement.p();
                            } else {
                                dVarH = arrangement.h();
                            }
                            i12 &= -458753;
                        } else {
                            dVarH = dVar2;
                        }
                        if (i17 != 0) {
                            lVarR = Arrangement.f5896a.r();
                        } else {
                            lVarR = lVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        dVar3 = dVarH;
                        lVar3 = lVarR;
                        gVar2 = gVarA;
                    } else {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                dVarH = arrangement.p();
                            } else {
                                dVarH = arrangement.h();
                            }
                            i12 &= -458753;
                        } else {
                            dVarH = dVar2;
                        }
                        if (i17 != 0) {
                            lVarR = Arrangement.f5896a.r();
                        } else {
                            lVarR = lVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        dVar3 = dVarH;
                        lVar3 = lVarR;
                        gVar2 = gVarA;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(2123608858, i12, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:116)");
                    }
                    int i214 = i12 >> 3;
                    Arrangement.l lVar14 = lVar3;
                    m0 m0Var14 = m0Var3;
                    LazyGridKt.a(nVar2, lazyGridState3, n(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i214 & bb.c.b.f30796me)), m0Var3, z15, false, gVar2, z14, lVar3, dVar3, content, pVarF, 196608 | (i214 & 14) | (i214 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i214 & 3670016) | (i214 & 29360128) | ((i12 << 6) & 234881024) | ((i12 << 12) & 1879048192), (i12 >> 27) & 14, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar3 = nVar2;
                    lVar4 = lVar14;
                    m0Var4 = m0Var14;
                    lazyGridState4 = lazyGridState3;
                    z16 = z15;
                    dVar4 = dVar3;
                    gVar3 = gVar2;
                    z17 = z14;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                dVarH = arrangement.p();
                            } else {
                                dVarH = arrangement.h();
                            }
                            i12 &= -458753;
                        } else {
                            dVarH = dVar2;
                        }
                        if (i17 != 0) {
                            lVarR = Arrangement.f5896a.r();
                        } else {
                            lVarR = lVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        dVar3 = dVarH;
                        lVar3 = lVarR;
                        gVar2 = gVarA;
                    } else {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                dVarH = arrangement.p();
                            } else {
                                dVarH = arrangement.h();
                            }
                            i12 &= -458753;
                        } else {
                            dVarH = dVar2;
                        }
                        if (i17 != 0) {
                            lVarR = Arrangement.f5896a.r();
                        } else {
                            lVarR = lVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        dVar3 = dVarH;
                        lVar3 = lVarR;
                        gVar2 = gVarA;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(2123608858, i12, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:116)");
                    }
                    int i215 = i12 >> 3;
                    Arrangement.l lVar15 = lVar3;
                    m0 m0Var15 = m0Var3;
                    LazyGridKt.a(nVar2, lazyGridState3, n(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i215 & bb.c.b.f30796me)), m0Var3, z15, false, gVar2, z14, lVar3, dVar3, content, pVarF, 196608 | (i215 & 14) | (i215 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i215 & 3670016) | (i215 & 29360128) | ((i12 << 6) & 234881024) | ((i12 << 12) & 1879048192), (i12 >> 27) & 14, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar3 = nVar2;
                    lVar4 = lVar15;
                    m0Var4 = m0Var15;
                    lazyGridState4 = lazyGridState3;
                    z16 = z15;
                    dVar4 = dVar3;
                    gVar3 = gVar2;
                    z17 = z14;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyHorizontalGrid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i216) {
                        LazyGridDslKt.a(rows, nVar3, lazyGridState4, m0Var4, z16, dVar4, lVar4, gVar3, z17, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= 24576;
            z12 = z10;
            if ((458752 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    dVar2 = dVar;
                    if (pVarF.s(dVar2)) {
                    }
                    i12 |= i24;
                } else {
                    dVar2 = dVar;
                }
                i12 |= i24;
            } else {
                dVar2 = dVar;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
                lVar2 = lVar;
            } else {
                lVar2 = lVar;
                if ((i10 & 3670016) == 0) {
                    if (pVarF.s(lVar2)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
            }
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !pVarF.s(gVar)) ? 4194304 : 8388608;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (pVarF.u(z11)) {
                    i20 = 67108864;
                } else {
                    i20 = 33554432;
                }
                i12 |= i20;
            }
            if ((i11 & 512) != 0) {
                if ((i10 & 1879048192) == 0) {
                    if (pVarF.s(content)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                }
                if ((1533916891 & i12) == 306783378) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                dVarH = arrangement.p();
                            } else {
                                dVarH = arrangement.h();
                            }
                            i12 &= -458753;
                        } else {
                            dVarH = dVar2;
                        }
                        if (i17 != 0) {
                            lVarR = Arrangement.f5896a.r();
                        } else {
                            lVarR = lVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        dVar3 = dVarH;
                        lVar3 = lVarR;
                        gVar2 = gVarA;
                    } else {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                dVarH = arrangement.p();
                            } else {
                                dVarH = arrangement.h();
                            }
                            i12 &= -458753;
                        } else {
                            dVarH = dVar2;
                        }
                        if (i17 != 0) {
                            lVarR = Arrangement.f5896a.r();
                        } else {
                            lVarR = lVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        dVar3 = dVarH;
                        lVar3 = lVarR;
                        gVar2 = gVarA;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(2123608858, i12, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:116)");
                    }
                    int i216 = i12 >> 3;
                    Arrangement.l lVar16 = lVar3;
                    m0 m0Var16 = m0Var3;
                    LazyGridKt.a(nVar2, lazyGridState3, n(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i216 & bb.c.b.f30796me)), m0Var3, z15, false, gVar2, z14, lVar3, dVar3, content, pVarF, 196608 | (i216 & 14) | (i216 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i216 & 3670016) | (i216 & 29360128) | ((i12 << 6) & 234881024) | ((i12 << 12) & 1879048192), (i12 >> 27) & 14, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar3 = nVar2;
                    lVar4 = lVar16;
                    m0Var4 = m0Var16;
                    lazyGridState4 = lazyGridState3;
                    z16 = z15;
                    dVar4 = dVar3;
                    gVar3 = gVar2;
                    z17 = z14;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                dVarH = arrangement.p();
                            } else {
                                dVarH = arrangement.h();
                            }
                            i12 &= -458753;
                        } else {
                            dVarH = dVar2;
                        }
                        if (i17 != 0) {
                            lVarR = Arrangement.f5896a.r();
                        } else {
                            lVarR = lVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        dVar3 = dVarH;
                        lVar3 = lVarR;
                        gVar2 = gVarA;
                    } else {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                dVarH = arrangement.p();
                            } else {
                                dVarH = arrangement.h();
                            }
                            i12 &= -458753;
                        } else {
                            dVarH = dVar2;
                        }
                        if (i17 != 0) {
                            lVarR = Arrangement.f5896a.r();
                        } else {
                            lVarR = lVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        dVar3 = dVarH;
                        lVar3 = lVarR;
                        gVar2 = gVarA;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(2123608858, i12, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:116)");
                    }
                    int i217 = i12 >> 3;
                    Arrangement.l lVar17 = lVar3;
                    m0 m0Var17 = m0Var3;
                    LazyGridKt.a(nVar2, lazyGridState3, n(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i217 & bb.c.b.f30796me)), m0Var3, z15, false, gVar2, z14, lVar3, dVar3, content, pVarF, 196608 | (i217 & 14) | (i217 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i217 & 3670016) | (i217 & 29360128) | ((i12 << 6) & 234881024) | ((i12 << 12) & 1879048192), (i12 >> 27) & 14, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar3 = nVar2;
                    lVar4 = lVar17;
                    m0Var4 = m0Var17;
                    lazyGridState4 = lazyGridState3;
                    z16 = z15;
                    dVar4 = dVar3;
                    gVar3 = gVar2;
                    z17 = z14;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyHorizontalGrid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i218) {
                        LazyGridDslKt.a(rows, nVar3, lazyGridState4, m0Var4, z16, dVar4, lVar4, gVar3, z17, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i21 = com.google.android.exoplayer2.j.G;
            i12 |= i21;
            if ((1533916891 & i12) == 306783378) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateA = lazyGridState2;
                    }
                    if (i13 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            dVarH = arrangement.p();
                        } else {
                            dVarH = arrangement.h();
                        }
                        i12 &= -458753;
                    } else {
                        dVarH = dVar2;
                    }
                    if (i17 != 0) {
                        lVarR = Arrangement.f5896a.r();
                    } else {
                        lVarR = lVar2;
                    }
                    if ((i11 & 128) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        gVarA = gVar;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    lazyGridState3 = lazyGridStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    dVar3 = dVarH;
                    lVar3 = lVarR;
                    gVar2 = gVarA;
                } else {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateA = lazyGridState2;
                    }
                    if (i13 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            dVarH = arrangement.p();
                        } else {
                            dVarH = arrangement.h();
                        }
                        i12 &= -458753;
                    } else {
                        dVarH = dVar2;
                    }
                    if (i17 != 0) {
                        lVarR = Arrangement.f5896a.r();
                    } else {
                        lVarR = lVar2;
                    }
                    if ((i11 & 128) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        gVarA = gVar;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    lazyGridState3 = lazyGridStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    dVar3 = dVarH;
                    lVar3 = lVarR;
                    gVar2 = gVarA;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(2123608858, i12, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:116)");
                }
                int i218 = i12 >> 3;
                Arrangement.l lVar18 = lVar3;
                m0 m0Var18 = m0Var3;
                LazyGridKt.a(nVar2, lazyGridState3, n(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i218 & bb.c.b.f30796me)), m0Var3, z15, false, gVar2, z14, lVar3, dVar3, content, pVarF, 196608 | (i218 & 14) | (i218 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i218 & 3670016) | (i218 & 29360128) | ((i12 << 6) & 234881024) | ((i12 << 12) & 1879048192), (i12 >> 27) & 14, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar3 = nVar2;
                lVar4 = lVar18;
                m0Var4 = m0Var18;
                lazyGridState4 = lazyGridState3;
                z16 = z15;
                dVar4 = dVar3;
                gVar3 = gVar2;
                z17 = z14;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateA = lazyGridState2;
                    }
                    if (i13 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            dVarH = arrangement.p();
                        } else {
                            dVarH = arrangement.h();
                        }
                        i12 &= -458753;
                    } else {
                        dVarH = dVar2;
                    }
                    if (i17 != 0) {
                        lVarR = Arrangement.f5896a.r();
                    } else {
                        lVarR = lVar2;
                    }
                    if ((i11 & 128) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        gVarA = gVar;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    lazyGridState3 = lazyGridStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    dVar3 = dVarH;
                    lVar3 = lVarR;
                    gVar2 = gVarA;
                } else {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateA = lazyGridState2;
                    }
                    if (i13 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            dVarH = arrangement.p();
                        } else {
                            dVarH = arrangement.h();
                        }
                        i12 &= -458753;
                    } else {
                        dVarH = dVar2;
                    }
                    if (i17 != 0) {
                        lVarR = Arrangement.f5896a.r();
                    } else {
                        lVarR = lVar2;
                    }
                    if ((i11 & 128) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        gVarA = gVar;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    lazyGridState3 = lazyGridStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    dVar3 = dVarH;
                    lVar3 = lVarR;
                    gVar2 = gVarA;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(2123608858, i12, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:116)");
                }
                int i219 = i12 >> 3;
                Arrangement.l lVar19 = lVar3;
                m0 m0Var19 = m0Var3;
                LazyGridKt.a(nVar2, lazyGridState3, n(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i219 & bb.c.b.f30796me)), m0Var3, z15, false, gVar2, z14, lVar3, dVar3, content, pVarF, 196608 | (i219 & 14) | (i219 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i219 & 3670016) | (i219 & 29360128) | ((i12 << 6) & 234881024) | ((i12 << 12) & 1879048192), (i12 >> 27) & 14, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar3 = nVar2;
                lVar4 = lVar19;
                m0Var4 = m0Var19;
                lazyGridState4 = lazyGridState3;
                z16 = z15;
                dVar4 = dVar3;
                gVar3 = gVar2;
                z17 = z14;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyHorizontalGrid$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2110) {
                    LazyGridDslKt.a(rows, nVar3, lazyGridState4, m0Var4, z16, dVar4, lVar4, gVar3, z17, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= 48;
        if ((i10 & bb.c.b.f30796me) == 0) {
            if ((i11 & 4) == 0) {
                lazyGridState2 = lazyGridState;
                if (pVarF.s(lazyGridState2)) {
                }
                i12 |= i23;
            } else {
                lazyGridState2 = lazyGridState;
            }
            i12 |= i23;
        } else {
            lazyGridState2 = lazyGridState;
        }
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & bb.c.g.f32954lc) == 0) {
                m0Var2 = m0Var;
                if (pVarF.s(m0Var2)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 57344) == 0) {
                    z12 = z10;
                    if (pVarF.u(z12)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((458752 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        dVar2 = dVar;
                        if (pVarF.s(dVar2)) {
                        }
                        i12 |= i24;
                    } else {
                        dVar2 = dVar;
                    }
                    i12 |= i24;
                } else {
                    dVar2 = dVar;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                    lVar2 = lVar;
                } else {
                    lVar2 = lVar;
                    if ((i10 & 3670016) == 0) {
                        if (pVarF.s(lVar2)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !pVarF.s(gVar)) ? 4194304 : 8388608;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (pVarF.u(z11)) {
                        i20 = 67108864;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i11 & 512) != 0) {
                    if ((i10 & 1879048192) == 0) {
                        if (pVarF.s(content)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                    }
                    if ((1533916891 & i12) == 306783378) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState2;
                            }
                            if (i13 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.f5896a;
                                if (z13) {
                                    dVarH = arrangement.p();
                                } else {
                                    dVarH = arrangement.h();
                                }
                                i12 &= -458753;
                            } else {
                                dVarH = dVar2;
                            }
                            if (i17 != 0) {
                                lVarR = Arrangement.f5896a.r();
                            } else {
                                lVarR = lVar2;
                            }
                            if ((i11 & 128) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                gVarA = gVar;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            lazyGridState3 = lazyGridStateA;
                            z15 = z13;
                            m0Var3 = m0VarA;
                            dVar3 = dVarH;
                            lVar3 = lVarR;
                            gVar2 = gVarA;
                        } else {
                            if (i22 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState2;
                            }
                            if (i13 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.f5896a;
                                if (z13) {
                                    dVarH = arrangement.p();
                                } else {
                                    dVarH = arrangement.h();
                                }
                                i12 &= -458753;
                            } else {
                                dVarH = dVar2;
                            }
                            if (i17 != 0) {
                                lVarR = Arrangement.f5896a.r();
                            } else {
                                lVarR = lVar2;
                            }
                            if ((i11 & 128) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                gVarA = gVar;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            lazyGridState3 = lazyGridStateA;
                            z15 = z13;
                            m0Var3 = m0VarA;
                            dVar3 = dVarH;
                            lVar3 = lVarR;
                            gVar2 = gVarA;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(2123608858, i12, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:116)");
                        }
                        int i2110 = i12 >> 3;
                        Arrangement.l lVar110 = lVar3;
                        m0 m0Var110 = m0Var3;
                        LazyGridKt.a(nVar2, lazyGridState3, n(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i2110 & bb.c.b.f30796me)), m0Var3, z15, false, gVar2, z14, lVar3, dVar3, content, pVarF, 196608 | (i2110 & 14) | (i2110 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i2110 & 3670016) | (i2110 & 29360128) | ((i12 << 6) & 234881024) | ((i12 << 12) & 1879048192), (i12 >> 27) & 14, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar3 = nVar2;
                        lVar4 = lVar110;
                        m0Var4 = m0Var110;
                        lazyGridState4 = lazyGridState3;
                        z16 = z15;
                        dVar4 = dVar3;
                        gVar3 = gVar2;
                        z17 = z14;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState2;
                            }
                            if (i13 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.f5896a;
                                if (z13) {
                                    dVarH = arrangement.p();
                                } else {
                                    dVarH = arrangement.h();
                                }
                                i12 &= -458753;
                            } else {
                                dVarH = dVar2;
                            }
                            if (i17 != 0) {
                                lVarR = Arrangement.f5896a.r();
                            } else {
                                lVarR = lVar2;
                            }
                            if ((i11 & 128) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                gVarA = gVar;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            lazyGridState3 = lazyGridStateA;
                            z15 = z13;
                            m0Var3 = m0VarA;
                            dVar3 = dVarH;
                            lVar3 = lVarR;
                            gVar2 = gVarA;
                        } else {
                            if (i22 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState2;
                            }
                            if (i13 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.f5896a;
                                if (z13) {
                                    dVarH = arrangement.p();
                                } else {
                                    dVarH = arrangement.h();
                                }
                                i12 &= -458753;
                            } else {
                                dVarH = dVar2;
                            }
                            if (i17 != 0) {
                                lVarR = Arrangement.f5896a.r();
                            } else {
                                lVarR = lVar2;
                            }
                            if ((i11 & 128) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                gVarA = gVar;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            lazyGridState3 = lazyGridStateA;
                            z15 = z13;
                            m0Var3 = m0VarA;
                            dVar3 = dVarH;
                            lVar3 = lVarR;
                            gVar2 = gVarA;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(2123608858, i12, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:116)");
                        }
                        int i2111 = i12 >> 3;
                        Arrangement.l lVar111 = lVar3;
                        m0 m0Var111 = m0Var3;
                        LazyGridKt.a(nVar2, lazyGridState3, n(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i2111 & bb.c.b.f30796me)), m0Var3, z15, false, gVar2, z14, lVar3, dVar3, content, pVarF, 196608 | (i2111 & 14) | (i2111 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i2111 & 3670016) | (i2111 & 29360128) | ((i12 << 6) & 234881024) | ((i12 << 12) & 1879048192), (i12 >> 27) & 14, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar3 = nVar2;
                        lVar4 = lVar111;
                        m0Var4 = m0Var111;
                        lazyGridState4 = lazyGridState3;
                        z16 = z15;
                        dVar4 = dVar3;
                        gVar3 = gVar2;
                        z17 = z14;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyHorizontalGrid$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2112) {
                            LazyGridDslKt.a(rows, nVar3, lazyGridState4, m0Var4, z16, dVar4, lVar4, gVar3, z17, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i21 = com.google.android.exoplayer2.j.G;
                i12 |= i21;
                if ((1533916891 & i12) == 306783378) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                dVarH = arrangement.p();
                            } else {
                                dVarH = arrangement.h();
                            }
                            i12 &= -458753;
                        } else {
                            dVarH = dVar2;
                        }
                        if (i17 != 0) {
                            lVarR = Arrangement.f5896a.r();
                        } else {
                            lVarR = lVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        dVar3 = dVarH;
                        lVar3 = lVarR;
                        gVar2 = gVarA;
                    } else {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                dVarH = arrangement.p();
                            } else {
                                dVarH = arrangement.h();
                            }
                            i12 &= -458753;
                        } else {
                            dVarH = dVar2;
                        }
                        if (i17 != 0) {
                            lVarR = Arrangement.f5896a.r();
                        } else {
                            lVarR = lVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        dVar3 = dVarH;
                        lVar3 = lVarR;
                        gVar2 = gVarA;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(2123608858, i12, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:116)");
                    }
                    int i2112 = i12 >> 3;
                    Arrangement.l lVar112 = lVar3;
                    m0 m0Var112 = m0Var3;
                    LazyGridKt.a(nVar2, lazyGridState3, n(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i2112 & bb.c.b.f30796me)), m0Var3, z15, false, gVar2, z14, lVar3, dVar3, content, pVarF, 196608 | (i2112 & 14) | (i2112 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i2112 & 3670016) | (i2112 & 29360128) | ((i12 << 6) & 234881024) | ((i12 << 12) & 1879048192), (i12 >> 27) & 14, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar3 = nVar2;
                    lVar4 = lVar112;
                    m0Var4 = m0Var112;
                    lazyGridState4 = lazyGridState3;
                    z16 = z15;
                    dVar4 = dVar3;
                    gVar3 = gVar2;
                    z17 = z14;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                dVarH = arrangement.p();
                            } else {
                                dVarH = arrangement.h();
                            }
                            i12 &= -458753;
                        } else {
                            dVarH = dVar2;
                        }
                        if (i17 != 0) {
                            lVarR = Arrangement.f5896a.r();
                        } else {
                            lVarR = lVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        dVar3 = dVarH;
                        lVar3 = lVarR;
                        gVar2 = gVarA;
                    } else {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                dVarH = arrangement.p();
                            } else {
                                dVarH = arrangement.h();
                            }
                            i12 &= -458753;
                        } else {
                            dVarH = dVar2;
                        }
                        if (i17 != 0) {
                            lVarR = Arrangement.f5896a.r();
                        } else {
                            lVarR = lVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        dVar3 = dVarH;
                        lVar3 = lVarR;
                        gVar2 = gVarA;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(2123608858, i12, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:116)");
                    }
                    int i2113 = i12 >> 3;
                    Arrangement.l lVar113 = lVar3;
                    m0 m0Var113 = m0Var3;
                    LazyGridKt.a(nVar2, lazyGridState3, n(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i2113 & bb.c.b.f30796me)), m0Var3, z15, false, gVar2, z14, lVar3, dVar3, content, pVarF, 196608 | (i2113 & 14) | (i2113 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i2113 & 3670016) | (i2113 & 29360128) | ((i12 << 6) & 234881024) | ((i12 << 12) & 1879048192), (i12 >> 27) & 14, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar3 = nVar2;
                    lVar4 = lVar113;
                    m0Var4 = m0Var113;
                    lazyGridState4 = lazyGridState3;
                    z16 = z15;
                    dVar4 = dVar3;
                    gVar3 = gVar2;
                    z17 = z14;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyHorizontalGrid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2114) {
                        LazyGridDslKt.a(rows, nVar3, lazyGridState4, m0Var4, z16, dVar4, lVar4, gVar3, z17, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= 24576;
            z12 = z10;
            if ((458752 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    dVar2 = dVar;
                    if (pVarF.s(dVar2)) {
                    }
                    i12 |= i24;
                } else {
                    dVar2 = dVar;
                }
                i12 |= i24;
            } else {
                dVar2 = dVar;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
                lVar2 = lVar;
            } else {
                lVar2 = lVar;
                if ((i10 & 3670016) == 0) {
                    if (pVarF.s(lVar2)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
            }
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !pVarF.s(gVar)) ? 4194304 : 8388608;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (pVarF.u(z11)) {
                    i20 = 67108864;
                } else {
                    i20 = 33554432;
                }
                i12 |= i20;
            }
            if ((i11 & 512) != 0) {
                if ((i10 & 1879048192) == 0) {
                    if (pVarF.s(content)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                }
                if ((1533916891 & i12) == 306783378) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                dVarH = arrangement.p();
                            } else {
                                dVarH = arrangement.h();
                            }
                            i12 &= -458753;
                        } else {
                            dVarH = dVar2;
                        }
                        if (i17 != 0) {
                            lVarR = Arrangement.f5896a.r();
                        } else {
                            lVarR = lVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        dVar3 = dVarH;
                        lVar3 = lVarR;
                        gVar2 = gVarA;
                    } else {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                dVarH = arrangement.p();
                            } else {
                                dVarH = arrangement.h();
                            }
                            i12 &= -458753;
                        } else {
                            dVarH = dVar2;
                        }
                        if (i17 != 0) {
                            lVarR = Arrangement.f5896a.r();
                        } else {
                            lVarR = lVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        dVar3 = dVarH;
                        lVar3 = lVarR;
                        gVar2 = gVarA;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(2123608858, i12, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:116)");
                    }
                    int i2114 = i12 >> 3;
                    Arrangement.l lVar114 = lVar3;
                    m0 m0Var114 = m0Var3;
                    LazyGridKt.a(nVar2, lazyGridState3, n(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i2114 & bb.c.b.f30796me)), m0Var3, z15, false, gVar2, z14, lVar3, dVar3, content, pVarF, 196608 | (i2114 & 14) | (i2114 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i2114 & 3670016) | (i2114 & 29360128) | ((i12 << 6) & 234881024) | ((i12 << 12) & 1879048192), (i12 >> 27) & 14, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar3 = nVar2;
                    lVar4 = lVar114;
                    m0Var4 = m0Var114;
                    lazyGridState4 = lazyGridState3;
                    z16 = z15;
                    dVar4 = dVar3;
                    gVar3 = gVar2;
                    z17 = z14;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                dVarH = arrangement.p();
                            } else {
                                dVarH = arrangement.h();
                            }
                            i12 &= -458753;
                        } else {
                            dVarH = dVar2;
                        }
                        if (i17 != 0) {
                            lVarR = Arrangement.f5896a.r();
                        } else {
                            lVarR = lVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        dVar3 = dVarH;
                        lVar3 = lVarR;
                        gVar2 = gVarA;
                    } else {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                dVarH = arrangement.p();
                            } else {
                                dVarH = arrangement.h();
                            }
                            i12 &= -458753;
                        } else {
                            dVarH = dVar2;
                        }
                        if (i17 != 0) {
                            lVarR = Arrangement.f5896a.r();
                        } else {
                            lVarR = lVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        dVar3 = dVarH;
                        lVar3 = lVarR;
                        gVar2 = gVarA;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(2123608858, i12, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:116)");
                    }
                    int i2115 = i12 >> 3;
                    Arrangement.l lVar115 = lVar3;
                    m0 m0Var115 = m0Var3;
                    LazyGridKt.a(nVar2, lazyGridState3, n(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i2115 & bb.c.b.f30796me)), m0Var3, z15, false, gVar2, z14, lVar3, dVar3, content, pVarF, 196608 | (i2115 & 14) | (i2115 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i2115 & 3670016) | (i2115 & 29360128) | ((i12 << 6) & 234881024) | ((i12 << 12) & 1879048192), (i12 >> 27) & 14, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar3 = nVar2;
                    lVar4 = lVar115;
                    m0Var4 = m0Var115;
                    lazyGridState4 = lazyGridState3;
                    z16 = z15;
                    dVar4 = dVar3;
                    gVar3 = gVar2;
                    z17 = z14;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyHorizontalGrid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2116) {
                        LazyGridDslKt.a(rows, nVar3, lazyGridState4, m0Var4, z16, dVar4, lVar4, gVar3, z17, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i21 = com.google.android.exoplayer2.j.G;
            i12 |= i21;
            if ((1533916891 & i12) == 306783378) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateA = lazyGridState2;
                    }
                    if (i13 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            dVarH = arrangement.p();
                        } else {
                            dVarH = arrangement.h();
                        }
                        i12 &= -458753;
                    } else {
                        dVarH = dVar2;
                    }
                    if (i17 != 0) {
                        lVarR = Arrangement.f5896a.r();
                    } else {
                        lVarR = lVar2;
                    }
                    if ((i11 & 128) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        gVarA = gVar;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    lazyGridState3 = lazyGridStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    dVar3 = dVarH;
                    lVar3 = lVarR;
                    gVar2 = gVarA;
                } else {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateA = lazyGridState2;
                    }
                    if (i13 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            dVarH = arrangement.p();
                        } else {
                            dVarH = arrangement.h();
                        }
                        i12 &= -458753;
                    } else {
                        dVarH = dVar2;
                    }
                    if (i17 != 0) {
                        lVarR = Arrangement.f5896a.r();
                    } else {
                        lVarR = lVar2;
                    }
                    if ((i11 & 128) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        gVarA = gVar;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    lazyGridState3 = lazyGridStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    dVar3 = dVarH;
                    lVar3 = lVarR;
                    gVar2 = gVarA;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(2123608858, i12, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:116)");
                }
                int i2116 = i12 >> 3;
                Arrangement.l lVar116 = lVar3;
                m0 m0Var116 = m0Var3;
                LazyGridKt.a(nVar2, lazyGridState3, n(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i2116 & bb.c.b.f30796me)), m0Var3, z15, false, gVar2, z14, lVar3, dVar3, content, pVarF, 196608 | (i2116 & 14) | (i2116 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i2116 & 3670016) | (i2116 & 29360128) | ((i12 << 6) & 234881024) | ((i12 << 12) & 1879048192), (i12 >> 27) & 14, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar3 = nVar2;
                lVar4 = lVar116;
                m0Var4 = m0Var116;
                lazyGridState4 = lazyGridState3;
                z16 = z15;
                dVar4 = dVar3;
                gVar3 = gVar2;
                z17 = z14;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateA = lazyGridState2;
                    }
                    if (i13 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            dVarH = arrangement.p();
                        } else {
                            dVarH = arrangement.h();
                        }
                        i12 &= -458753;
                    } else {
                        dVarH = dVar2;
                    }
                    if (i17 != 0) {
                        lVarR = Arrangement.f5896a.r();
                    } else {
                        lVarR = lVar2;
                    }
                    if ((i11 & 128) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        gVarA = gVar;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    lazyGridState3 = lazyGridStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    dVar3 = dVarH;
                    lVar3 = lVarR;
                    gVar2 = gVarA;
                } else {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateA = lazyGridState2;
                    }
                    if (i13 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            dVarH = arrangement.p();
                        } else {
                            dVarH = arrangement.h();
                        }
                        i12 &= -458753;
                    } else {
                        dVarH = dVar2;
                    }
                    if (i17 != 0) {
                        lVarR = Arrangement.f5896a.r();
                    } else {
                        lVarR = lVar2;
                    }
                    if ((i11 & 128) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        gVarA = gVar;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    lazyGridState3 = lazyGridStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    dVar3 = dVarH;
                    lVar3 = lVarR;
                    gVar2 = gVarA;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(2123608858, i12, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:116)");
                }
                int i2117 = i12 >> 3;
                Arrangement.l lVar117 = lVar3;
                m0 m0Var117 = m0Var3;
                LazyGridKt.a(nVar2, lazyGridState3, n(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i2117 & bb.c.b.f30796me)), m0Var3, z15, false, gVar2, z14, lVar3, dVar3, content, pVarF, 196608 | (i2117 & 14) | (i2117 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i2117 & 3670016) | (i2117 & 29360128) | ((i12 << 6) & 234881024) | ((i12 << 12) & 1879048192), (i12 >> 27) & 14, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar3 = nVar2;
                lVar4 = lVar117;
                m0Var4 = m0Var117;
                lazyGridState4 = lazyGridState3;
                z16 = z15;
                dVar4 = dVar3;
                gVar3 = gVar2;
                z17 = z14;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyHorizontalGrid$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2118) {
                    LazyGridDslKt.a(rows, nVar3, lazyGridState4, m0Var4, z16, dVar4, lVar4, gVar3, z17, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= bb.c.d.f31193dj;
        m0Var2 = m0Var;
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((i10 & 57344) == 0) {
                z12 = z10;
                if (pVarF.u(z12)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            if ((458752 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    dVar2 = dVar;
                    if (pVarF.s(dVar2)) {
                    }
                    i12 |= i24;
                } else {
                    dVar2 = dVar;
                }
                i12 |= i24;
            } else {
                dVar2 = dVar;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
                lVar2 = lVar;
            } else {
                lVar2 = lVar;
                if ((i10 & 3670016) == 0) {
                    if (pVarF.s(lVar2)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
            }
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !pVarF.s(gVar)) ? 4194304 : 8388608;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (pVarF.u(z11)) {
                    i20 = 67108864;
                } else {
                    i20 = 33554432;
                }
                i12 |= i20;
            }
            if ((i11 & 512) != 0) {
                if ((i10 & 1879048192) == 0) {
                    if (pVarF.s(content)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                }
                if ((1533916891 & i12) == 306783378) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                dVarH = arrangement.p();
                            } else {
                                dVarH = arrangement.h();
                            }
                            i12 &= -458753;
                        } else {
                            dVarH = dVar2;
                        }
                        if (i17 != 0) {
                            lVarR = Arrangement.f5896a.r();
                        } else {
                            lVarR = lVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        dVar3 = dVarH;
                        lVar3 = lVarR;
                        gVar2 = gVarA;
                    } else {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                dVarH = arrangement.p();
                            } else {
                                dVarH = arrangement.h();
                            }
                            i12 &= -458753;
                        } else {
                            dVarH = dVar2;
                        }
                        if (i17 != 0) {
                            lVarR = Arrangement.f5896a.r();
                        } else {
                            lVarR = lVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        dVar3 = dVarH;
                        lVar3 = lVarR;
                        gVar2 = gVarA;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(2123608858, i12, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:116)");
                    }
                    int i2118 = i12 >> 3;
                    Arrangement.l lVar118 = lVar3;
                    m0 m0Var118 = m0Var3;
                    LazyGridKt.a(nVar2, lazyGridState3, n(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i2118 & bb.c.b.f30796me)), m0Var3, z15, false, gVar2, z14, lVar3, dVar3, content, pVarF, 196608 | (i2118 & 14) | (i2118 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i2118 & 3670016) | (i2118 & 29360128) | ((i12 << 6) & 234881024) | ((i12 << 12) & 1879048192), (i12 >> 27) & 14, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar3 = nVar2;
                    lVar4 = lVar118;
                    m0Var4 = m0Var118;
                    lazyGridState4 = lazyGridState3;
                    z16 = z15;
                    dVar4 = dVar3;
                    gVar3 = gVar2;
                    z17 = z14;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                dVarH = arrangement.p();
                            } else {
                                dVarH = arrangement.h();
                            }
                            i12 &= -458753;
                        } else {
                            dVarH = dVar2;
                        }
                        if (i17 != 0) {
                            lVarR = Arrangement.f5896a.r();
                        } else {
                            lVarR = lVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        dVar3 = dVarH;
                        lVar3 = lVarR;
                        gVar2 = gVarA;
                    } else {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                dVarH = arrangement.p();
                            } else {
                                dVarH = arrangement.h();
                            }
                            i12 &= -458753;
                        } else {
                            dVarH = dVar2;
                        }
                        if (i17 != 0) {
                            lVarR = Arrangement.f5896a.r();
                        } else {
                            lVarR = lVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        dVar3 = dVarH;
                        lVar3 = lVarR;
                        gVar2 = gVarA;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(2123608858, i12, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:116)");
                    }
                    int i2119 = i12 >> 3;
                    Arrangement.l lVar119 = lVar3;
                    m0 m0Var119 = m0Var3;
                    LazyGridKt.a(nVar2, lazyGridState3, n(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i2119 & bb.c.b.f30796me)), m0Var3, z15, false, gVar2, z14, lVar3, dVar3, content, pVarF, 196608 | (i2119 & 14) | (i2119 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i2119 & 3670016) | (i2119 & 29360128) | ((i12 << 6) & 234881024) | ((i12 << 12) & 1879048192), (i12 >> 27) & 14, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar3 = nVar2;
                    lVar4 = lVar119;
                    m0Var4 = m0Var119;
                    lazyGridState4 = lazyGridState3;
                    z16 = z15;
                    dVar4 = dVar3;
                    gVar3 = gVar2;
                    z17 = z14;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyHorizontalGrid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21110) {
                        LazyGridDslKt.a(rows, nVar3, lazyGridState4, m0Var4, z16, dVar4, lVar4, gVar3, z17, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i21 = com.google.android.exoplayer2.j.G;
            i12 |= i21;
            if ((1533916891 & i12) == 306783378) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateA = lazyGridState2;
                    }
                    if (i13 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            dVarH = arrangement.p();
                        } else {
                            dVarH = arrangement.h();
                        }
                        i12 &= -458753;
                    } else {
                        dVarH = dVar2;
                    }
                    if (i17 != 0) {
                        lVarR = Arrangement.f5896a.r();
                    } else {
                        lVarR = lVar2;
                    }
                    if ((i11 & 128) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        gVarA = gVar;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    lazyGridState3 = lazyGridStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    dVar3 = dVarH;
                    lVar3 = lVarR;
                    gVar2 = gVarA;
                } else {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateA = lazyGridState2;
                    }
                    if (i13 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            dVarH = arrangement.p();
                        } else {
                            dVarH = arrangement.h();
                        }
                        i12 &= -458753;
                    } else {
                        dVarH = dVar2;
                    }
                    if (i17 != 0) {
                        lVarR = Arrangement.f5896a.r();
                    } else {
                        lVarR = lVar2;
                    }
                    if ((i11 & 128) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        gVarA = gVar;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    lazyGridState3 = lazyGridStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    dVar3 = dVarH;
                    lVar3 = lVarR;
                    gVar2 = gVarA;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(2123608858, i12, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:116)");
                }
                int i21110 = i12 >> 3;
                Arrangement.l lVar1110 = lVar3;
                m0 m0Var1110 = m0Var3;
                LazyGridKt.a(nVar2, lazyGridState3, n(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i21110 & bb.c.b.f30796me)), m0Var3, z15, false, gVar2, z14, lVar3, dVar3, content, pVarF, 196608 | (i21110 & 14) | (i21110 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i21110 & 3670016) | (i21110 & 29360128) | ((i12 << 6) & 234881024) | ((i12 << 12) & 1879048192), (i12 >> 27) & 14, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar3 = nVar2;
                lVar4 = lVar1110;
                m0Var4 = m0Var1110;
                lazyGridState4 = lazyGridState3;
                z16 = z15;
                dVar4 = dVar3;
                gVar3 = gVar2;
                z17 = z14;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateA = lazyGridState2;
                    }
                    if (i13 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            dVarH = arrangement.p();
                        } else {
                            dVarH = arrangement.h();
                        }
                        i12 &= -458753;
                    } else {
                        dVarH = dVar2;
                    }
                    if (i17 != 0) {
                        lVarR = Arrangement.f5896a.r();
                    } else {
                        lVarR = lVar2;
                    }
                    if ((i11 & 128) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        gVarA = gVar;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    lazyGridState3 = lazyGridStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    dVar3 = dVarH;
                    lVar3 = lVarR;
                    gVar2 = gVarA;
                } else {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateA = lazyGridState2;
                    }
                    if (i13 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            dVarH = arrangement.p();
                        } else {
                            dVarH = arrangement.h();
                        }
                        i12 &= -458753;
                    } else {
                        dVarH = dVar2;
                    }
                    if (i17 != 0) {
                        lVarR = Arrangement.f5896a.r();
                    } else {
                        lVarR = lVar2;
                    }
                    if ((i11 & 128) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        gVarA = gVar;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    lazyGridState3 = lazyGridStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    dVar3 = dVarH;
                    lVar3 = lVarR;
                    gVar2 = gVarA;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(2123608858, i12, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:116)");
                }
                int i21111 = i12 >> 3;
                Arrangement.l lVar1111 = lVar3;
                m0 m0Var1111 = m0Var3;
                LazyGridKt.a(nVar2, lazyGridState3, n(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i21111 & bb.c.b.f30796me)), m0Var3, z15, false, gVar2, z14, lVar3, dVar3, content, pVarF, 196608 | (i21111 & 14) | (i21111 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i21111 & 3670016) | (i21111 & 29360128) | ((i12 << 6) & 234881024) | ((i12 << 12) & 1879048192), (i12 >> 27) & 14, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar3 = nVar2;
                lVar4 = lVar1111;
                m0Var4 = m0Var1111;
                lazyGridState4 = lazyGridState3;
                z16 = z15;
                dVar4 = dVar3;
                gVar3 = gVar2;
                z17 = z14;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyHorizontalGrid$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21112) {
                    LazyGridDslKt.a(rows, nVar3, lazyGridState4, m0Var4, z16, dVar4, lVar4, gVar3, z17, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= 24576;
        z12 = z10;
        if ((458752 & i10) == 0) {
            if ((i11 & 32) == 0) {
                dVar2 = dVar;
                if (pVarF.s(dVar2)) {
                }
                i12 |= i24;
            } else {
                dVar2 = dVar;
            }
            i12 |= i24;
        } else {
            dVar2 = dVar;
        }
        i17 = i11 & 64;
        if (i17 != 0) {
            i12 |= 1572864;
            lVar2 = lVar;
        } else {
            lVar2 = lVar;
            if ((i10 & 3670016) == 0) {
                if (pVarF.s(lVar2)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
        }
        if ((i10 & 29360128) != 0) {
            i12 |= ((i11 & 128) == 0 || !pVarF.s(gVar)) ? 4194304 : 8388608;
        }
        i19 = i11 & 256;
        if (i19 != 0) {
            i12 |= 100663296;
        } else if ((i10 & 234881024) == 0) {
            if (pVarF.u(z11)) {
                i20 = 67108864;
            } else {
                i20 = 33554432;
            }
            i12 |= i20;
        }
        if ((i11 & 512) != 0) {
            if ((i10 & 1879048192) == 0) {
                if (pVarF.s(content)) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
            }
            if ((1533916891 & i12) == 306783378) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateA = lazyGridState2;
                    }
                    if (i13 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            dVarH = arrangement.p();
                        } else {
                            dVarH = arrangement.h();
                        }
                        i12 &= -458753;
                    } else {
                        dVarH = dVar2;
                    }
                    if (i17 != 0) {
                        lVarR = Arrangement.f5896a.r();
                    } else {
                        lVarR = lVar2;
                    }
                    if ((i11 & 128) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        gVarA = gVar;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    lazyGridState3 = lazyGridStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    dVar3 = dVarH;
                    lVar3 = lVarR;
                    gVar2 = gVarA;
                } else {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateA = lazyGridState2;
                    }
                    if (i13 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            dVarH = arrangement.p();
                        } else {
                            dVarH = arrangement.h();
                        }
                        i12 &= -458753;
                    } else {
                        dVarH = dVar2;
                    }
                    if (i17 != 0) {
                        lVarR = Arrangement.f5896a.r();
                    } else {
                        lVarR = lVar2;
                    }
                    if ((i11 & 128) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        gVarA = gVar;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    lazyGridState3 = lazyGridStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    dVar3 = dVarH;
                    lVar3 = lVarR;
                    gVar2 = gVarA;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(2123608858, i12, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:116)");
                }
                int i21112 = i12 >> 3;
                Arrangement.l lVar1112 = lVar3;
                m0 m0Var1112 = m0Var3;
                LazyGridKt.a(nVar2, lazyGridState3, n(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i21112 & bb.c.b.f30796me)), m0Var3, z15, false, gVar2, z14, lVar3, dVar3, content, pVarF, 196608 | (i21112 & 14) | (i21112 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i21112 & 3670016) | (i21112 & 29360128) | ((i12 << 6) & 234881024) | ((i12 << 12) & 1879048192), (i12 >> 27) & 14, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar3 = nVar2;
                lVar4 = lVar1112;
                m0Var4 = m0Var1112;
                lazyGridState4 = lazyGridState3;
                z16 = z15;
                dVar4 = dVar3;
                gVar3 = gVar2;
                z17 = z14;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateA = lazyGridState2;
                    }
                    if (i13 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            dVarH = arrangement.p();
                        } else {
                            dVarH = arrangement.h();
                        }
                        i12 &= -458753;
                    } else {
                        dVarH = dVar2;
                    }
                    if (i17 != 0) {
                        lVarR = Arrangement.f5896a.r();
                    } else {
                        lVarR = lVar2;
                    }
                    if ((i11 & 128) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        gVarA = gVar;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    lazyGridState3 = lazyGridStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    dVar3 = dVarH;
                    lVar3 = lVarR;
                    gVar2 = gVarA;
                } else {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateA = lazyGridState2;
                    }
                    if (i13 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            dVarH = arrangement.p();
                        } else {
                            dVarH = arrangement.h();
                        }
                        i12 &= -458753;
                    } else {
                        dVarH = dVar2;
                    }
                    if (i17 != 0) {
                        lVarR = Arrangement.f5896a.r();
                    } else {
                        lVarR = lVar2;
                    }
                    if ((i11 & 128) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        gVarA = gVar;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    lazyGridState3 = lazyGridStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    dVar3 = dVarH;
                    lVar3 = lVarR;
                    gVar2 = gVarA;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(2123608858, i12, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:116)");
                }
                int i21113 = i12 >> 3;
                Arrangement.l lVar1113 = lVar3;
                m0 m0Var1113 = m0Var3;
                LazyGridKt.a(nVar2, lazyGridState3, n(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i21113 & bb.c.b.f30796me)), m0Var3, z15, false, gVar2, z14, lVar3, dVar3, content, pVarF, 196608 | (i21113 & 14) | (i21113 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i21113 & 3670016) | (i21113 & 29360128) | ((i12 << 6) & 234881024) | ((i12 << 12) & 1879048192), (i12 >> 27) & 14, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar3 = nVar2;
                lVar4 = lVar1113;
                m0Var4 = m0Var1113;
                lazyGridState4 = lazyGridState3;
                z16 = z15;
                dVar4 = dVar3;
                gVar3 = gVar2;
                z17 = z14;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyHorizontalGrid$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21114) {
                    LazyGridDslKt.a(rows, nVar3, lazyGridState4, m0Var4, z16, dVar4, lVar4, gVar3, z17, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i21 = com.google.android.exoplayer2.j.G;
        i12 |= i21;
        if ((1533916891 & i12) == 306783378) {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i22 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if ((i11 & 4) != 0) {
                    lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                    i12 &= -897;
                } else {
                    lazyGridStateA = lazyGridState2;
                }
                if (i13 != 0) {
                    m0VarA = PaddingKt.a(s1.h.g(0));
                } else {
                    m0VarA = m0Var2;
                }
                if (i15 == 0) {
                }
                if ((i11 & 32) != 0) {
                    arrangement = Arrangement.f5896a;
                    if (z13) {
                        dVarH = arrangement.p();
                    } else {
                        dVarH = arrangement.h();
                    }
                    i12 &= -458753;
                } else {
                    dVarH = dVar2;
                }
                if (i17 != 0) {
                    lVarR = Arrangement.f5896a.r();
                } else {
                    lVarR = lVar2;
                }
                if ((i11 & 128) != 0) {
                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    i12 &= -29360129;
                } else {
                    gVarA = gVar;
                }
                if (i19 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                lazyGridState3 = lazyGridStateA;
                z15 = z13;
                m0Var3 = m0VarA;
                dVar3 = dVarH;
                lVar3 = lVarR;
                gVar2 = gVarA;
            } else {
                if (i22 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if ((i11 & 4) != 0) {
                    lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                    i12 &= -897;
                } else {
                    lazyGridStateA = lazyGridState2;
                }
                if (i13 != 0) {
                    m0VarA = PaddingKt.a(s1.h.g(0));
                } else {
                    m0VarA = m0Var2;
                }
                if (i15 == 0) {
                }
                if ((i11 & 32) != 0) {
                    arrangement = Arrangement.f5896a;
                    if (z13) {
                        dVarH = arrangement.p();
                    } else {
                        dVarH = arrangement.h();
                    }
                    i12 &= -458753;
                } else {
                    dVarH = dVar2;
                }
                if (i17 != 0) {
                    lVarR = Arrangement.f5896a.r();
                } else {
                    lVarR = lVar2;
                }
                if ((i11 & 128) != 0) {
                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    i12 &= -29360129;
                } else {
                    gVarA = gVar;
                }
                if (i19 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                lazyGridState3 = lazyGridStateA;
                z15 = z13;
                m0Var3 = m0VarA;
                dVar3 = dVarH;
                lVar3 = lVarR;
                gVar2 = gVarA;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(2123608858, i12, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:116)");
            }
            int i21114 = i12 >> 3;
            Arrangement.l lVar1114 = lVar3;
            m0 m0Var1114 = m0Var3;
            LazyGridKt.a(nVar2, lazyGridState3, n(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i21114 & bb.c.b.f30796me)), m0Var3, z15, false, gVar2, z14, lVar3, dVar3, content, pVarF, 196608 | (i21114 & 14) | (i21114 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i21114 & 3670016) | (i21114 & 29360128) | ((i12 << 6) & 234881024) | ((i12 << 12) & 1879048192), (i12 >> 27) & 14, 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar3 = nVar2;
            lVar4 = lVar1114;
            m0Var4 = m0Var1114;
            lazyGridState4 = lazyGridState3;
            z16 = z15;
            dVar4 = dVar3;
            gVar3 = gVar2;
            z17 = z14;
        } else {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i22 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if ((i11 & 4) != 0) {
                    lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                    i12 &= -897;
                } else {
                    lazyGridStateA = lazyGridState2;
                }
                if (i13 != 0) {
                    m0VarA = PaddingKt.a(s1.h.g(0));
                } else {
                    m0VarA = m0Var2;
                }
                if (i15 == 0) {
                }
                if ((i11 & 32) != 0) {
                    arrangement = Arrangement.f5896a;
                    if (z13) {
                        dVarH = arrangement.p();
                    } else {
                        dVarH = arrangement.h();
                    }
                    i12 &= -458753;
                } else {
                    dVarH = dVar2;
                }
                if (i17 != 0) {
                    lVarR = Arrangement.f5896a.r();
                } else {
                    lVarR = lVar2;
                }
                if ((i11 & 128) != 0) {
                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    i12 &= -29360129;
                } else {
                    gVarA = gVar;
                }
                if (i19 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                lazyGridState3 = lazyGridStateA;
                z15 = z13;
                m0Var3 = m0VarA;
                dVar3 = dVarH;
                lVar3 = lVarR;
                gVar2 = gVarA;
            } else {
                if (i22 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if ((i11 & 4) != 0) {
                    lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                    i12 &= -897;
                } else {
                    lazyGridStateA = lazyGridState2;
                }
                if (i13 != 0) {
                    m0VarA = PaddingKt.a(s1.h.g(0));
                } else {
                    m0VarA = m0Var2;
                }
                if (i15 == 0) {
                }
                if ((i11 & 32) != 0) {
                    arrangement = Arrangement.f5896a;
                    if (z13) {
                        dVarH = arrangement.p();
                    } else {
                        dVarH = arrangement.h();
                    }
                    i12 &= -458753;
                } else {
                    dVarH = dVar2;
                }
                if (i17 != 0) {
                    lVarR = Arrangement.f5896a.r();
                } else {
                    lVarR = lVar2;
                }
                if ((i11 & 128) != 0) {
                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    i12 &= -29360129;
                } else {
                    gVarA = gVar;
                }
                if (i19 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                lazyGridState3 = lazyGridStateA;
                z15 = z13;
                m0Var3 = m0VarA;
                dVar3 = dVarH;
                lVar3 = lVarR;
                gVar2 = gVarA;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(2123608858, i12, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:116)");
            }
            int i21115 = i12 >> 3;
            Arrangement.l lVar1115 = lVar3;
            m0 m0Var1115 = m0Var3;
            LazyGridKt.a(nVar2, lazyGridState3, n(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i21115 & bb.c.b.f30796me)), m0Var3, z15, false, gVar2, z14, lVar3, dVar3, content, pVarF, 196608 | (i21115 & 14) | (i21115 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i21115 & 3670016) | (i21115 & 29360128) | ((i12 << 6) & 234881024) | ((i12 << 12) & 1879048192), (i12 >> 27) & 14, 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar3 = nVar2;
            lVar4 = lVar1115;
            m0Var4 = m0Var1115;
            lazyGridState4 = lazyGridState3;
            z16 = z15;
            dVar4 = dVar3;
            gVar3 = gVar2;
            z17 = z14;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyHorizontalGrid$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21116) {
                LazyGridDslKt.a(rows, nVar3, lazyGridState4, m0Var4, z16, dVar4, lVar4, gVar3, z17, content, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0125  */
    /* JADX WARN: Code duplicated, block: B:103:0x0129  */
    /* JADX WARN: Code duplicated, block: B:105:0x012d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0133  */
    /* JADX WARN: Code duplicated, block: B:108:0x0136  */
    /* JADX WARN: Code duplicated, block: B:111:0x0142  */
    /* JADX WARN: Code duplicated, block: B:115:0x015b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0165  */
    /* JADX WARN: Code duplicated, block: B:130:0x0192 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x0194  */
    /* JADX WARN: Code duplicated, block: B:132:0x0197  */
    /* JADX WARN: Code duplicated, block: B:135:0x019e  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:145:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:150:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:152:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:156:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:157:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:159:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:160:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:164:0x0206  */
    /* JADX WARN: Code duplicated, block: B:167:0x0269  */
    /* JADX WARN: Code duplicated, block: B:172:0x0282  */
    /* JADX WARN: Code duplicated, block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:54:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00da  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:91:0x0105  */
    /* JADX WARN: Code duplicated, block: B:92:0x010c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0112  */
    /* JADX WARN: Code duplicated, block: B:96:0x0118  */
    /* JADX WARN: Code duplicated, block: B:97:0x011b  */
    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public static final void b(@dl.d final c columns, @dl.e androidx.compose.ui.n nVar, @dl.e LazyGridState lazyGridState, @dl.e m0 m0Var, boolean z10, @dl.e Arrangement.l lVar, @dl.e Arrangement.d dVar, @dl.e androidx.compose.foundation.gestures.g gVar, boolean z11, @dl.d final yh.l<? super s, b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        LazyGridState lazyGridState2;
        int i13;
        m0 m0Var2;
        int i14;
        int i15;
        boolean z12;
        int i16;
        Arrangement.l lVar2;
        int i17;
        Arrangement.d dVar2;
        int i18;
        int i19;
        int i20;
        int i21;
        androidx.compose.ui.n nVar2;
        LazyGridState lazyGridStateA;
        m0 m0VarA;
        boolean z13;
        Arrangement.l lVarD;
        Arrangement.d dVarP;
        androidx.compose.foundation.gestures.g gVarA;
        boolean z14;
        LazyGridState lazyGridState3;
        boolean z15;
        m0 m0Var3;
        Arrangement.l lVar3;
        Arrangement.d dVar3;
        androidx.compose.foundation.gestures.g gVar2;
        Arrangement arrangement;
        final androidx.compose.ui.n nVar3;
        final Arrangement.d dVar4;
        final m0 m0Var4;
        final LazyGridState lazyGridState4;
        final boolean z16;
        final Arrangement.l lVar4;
        final androidx.compose.foundation.gestures.g gVar3;
        final boolean z17;
        u1 u1VarH;
        f0.p(columns, "columns");
        f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(1485410512);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.s(columns) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i22 = i11 & 2;
        if (i22 == 0) {
            if ((i10 & 112) == 0) {
                i12 |= pVarF.s(nVar) ? 32 : 16;
            }
            if ((i10 & bb.c.b.f30796me) == 0) {
                if ((i11 & 4) == 0) {
                    lazyGridState2 = lazyGridState;
                    int i23 = pVarF.s(lazyGridState2) ? 256 : 128;
                    i12 |= i23;
                } else {
                    lazyGridState2 = lazyGridState;
                }
                i12 |= i23;
            } else {
                lazyGridState2 = lazyGridState;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & bb.c.g.f32954lc) == 0) {
                    m0Var2 = m0Var;
                    if (pVarF.s(m0Var2)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    if ((i10 & 57344) == 0) {
                        z12 = z10;
                        if (pVarF.u(z12)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    if ((458752 & i10) == 0) {
                        if ((i11 & 32) == 0) {
                            lVar2 = lVar;
                            int i24 = pVarF.s(lVar2) ? 131072 : 65536;
                            i12 |= i24;
                        } else {
                            lVar2 = lVar;
                        }
                        i12 |= i24;
                    } else {
                        lVar2 = lVar;
                    }
                    i17 = i11 & 64;
                    if (i17 != 0) {
                        i12 |= 1572864;
                        dVar2 = dVar;
                    } else {
                        dVar2 = dVar;
                        if ((i10 & 3670016) == 0) {
                            if (pVarF.s(dVar2)) {
                                i18 = 1048576;
                            } else {
                                i18 = 524288;
                            }
                            i12 |= i18;
                        }
                    }
                    if ((i10 & 29360128) != 0) {
                        i12 |= ((i11 & 128) == 0 || !pVarF.s(gVar)) ? 4194304 : 8388608;
                    }
                    i19 = i11 & 256;
                    if (i19 != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 234881024) == 0) {
                        if (pVarF.u(z11)) {
                            i20 = 67108864;
                        } else {
                            i20 = 33554432;
                        }
                        i12 |= i20;
                    }
                    if ((i11 & 512) != 0) {
                        if ((i10 & 1879048192) == 0) {
                            if (pVarF.s(content)) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                        }
                        if ((1533916891 & i12) == 306783378 || !pVarF.b()) {
                            pVarF.W();
                            if ((i10 & 1) != 0 || pVarF.o()) {
                                if (i22 != 0) {
                                    nVar2 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar2 = nVar;
                                }
                                if ((i11 & 4) != 0) {
                                    lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                                    i12 &= -897;
                                } else {
                                    lazyGridStateA = lazyGridState2;
                                }
                                if (i13 != 0) {
                                    m0VarA = PaddingKt.a(s1.h.g(0));
                                } else {
                                    m0VarA = m0Var2;
                                }
                                z13 = i15 == 0 ? z12 : false;
                                if ((i11 & 32) != 0) {
                                    arrangement = Arrangement.f5896a;
                                    if (z13) {
                                        lVarD = arrangement.d();
                                    } else {
                                        lVarD = arrangement.r();
                                    }
                                    i12 &= -458753;
                                } else {
                                    lVarD = lVar2;
                                }
                                if (i17 != 0) {
                                    dVarP = Arrangement.f5896a.p();
                                } else {
                                    dVarP = dVar2;
                                }
                                if ((i11 & 128) != 0) {
                                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                    i12 &= -29360129;
                                } else {
                                    gVarA = gVar;
                                }
                                if (i19 != 0) {
                                    z14 = true;
                                } else {
                                    z14 = z11;
                                }
                                lazyGridState3 = lazyGridStateA;
                                z15 = z13;
                                m0Var3 = m0VarA;
                                lVar3 = lVarD;
                                dVar3 = dVarP;
                                gVar2 = gVarA;
                            } else {
                                pVarF.l();
                                if ((i11 & 4) != 0) {
                                    i12 &= -897;
                                }
                                if ((i11 & 32) != 0) {
                                    i12 &= -458753;
                                }
                                if ((i11 & 128) != 0) {
                                    i12 &= -29360129;
                                }
                                nVar2 = nVar;
                                gVar2 = gVar;
                                z14 = z11;
                                lazyGridState3 = lazyGridState2;
                                z15 = z12;
                                lVar3 = lVar2;
                                m0Var3 = m0Var2;
                                dVar3 = dVar2;
                            }
                            pVarF.O();
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1485410512, i12, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:62)");
                            }
                            int i25 = i12 >> 3;
                            yh.p<s1.e, s1.b, List<Integer>> pVarM = m(columns, dVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i25 & bb.c.b.f30796me));
                            int i26 = 196608 | (i25 & 14) | (i25 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i25 & 3670016) | (i25 & 29360128);
                            int i27 = i12 << 9;
                            Arrangement.d dVar5 = dVar3;
                            m0 m0Var5 = m0Var3;
                            LazyGridKt.a(nVar2, lazyGridState3, pVarM, m0Var3, z15, true, gVar2, z14, lVar3, dVar3, content, pVarF, i26 | (i27 & 234881024) | (i27 & 1879048192), (i12 >> 27) & 14, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            nVar3 = nVar2;
                            dVar4 = dVar5;
                            m0Var4 = m0Var5;
                            lazyGridState4 = lazyGridState3;
                            z16 = z15;
                            lVar4 = lVar3;
                            gVar3 = gVar2;
                            z17 = z14;
                        } else {
                            pVarF.l();
                            nVar3 = nVar;
                            z17 = z11;
                            lazyGridState4 = lazyGridState2;
                            m0Var4 = m0Var2;
                            dVar4 = dVar2;
                            z16 = z12;
                            lVar4 = lVar2;
                            gVar3 = gVar;
                        }
                        u1VarH = pVarF.H();
                        if (u1VarH == null) {
                            return;
                        }
                        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i28) {
                                LazyGridDslKt.b(columns, nVar3, lazyGridState4, m0Var4, z16, lVar4, dVar4, gVar3, z17, content, pVar2, i10 | 1, i11);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return b2.f124493a;
                            }
                        });
                    }
                    i21 = com.google.android.exoplayer2.j.G;
                    i12 |= i21;
                    if ((1533916891 & i12) == 306783378) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState2;
                            }
                            if (i13 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.f5896a;
                                if (z13) {
                                    lVarD = arrangement.r();
                                } else {
                                    lVarD = arrangement.d();
                                }
                                i12 &= -458753;
                            } else {
                                lVarD = lVar2;
                            }
                            if (i17 != 0) {
                                dVarP = Arrangement.f5896a.p();
                            } else {
                                dVarP = dVar2;
                            }
                            if ((i11 & 128) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                gVarA = gVar;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            lazyGridState3 = lazyGridStateA;
                            z15 = z13;
                            m0Var3 = m0VarA;
                            lVar3 = lVarD;
                            dVar3 = dVarP;
                            gVar2 = gVarA;
                        } else {
                            if (i22 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState2;
                            }
                            if (i13 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.f5896a;
                                if (z13) {
                                    lVarD = arrangement.r();
                                } else {
                                    lVarD = arrangement.d();
                                }
                                i12 &= -458753;
                            } else {
                                lVarD = lVar2;
                            }
                            if (i17 != 0) {
                                dVarP = Arrangement.f5896a.p();
                            } else {
                                dVarP = dVar2;
                            }
                            if ((i11 & 128) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                gVarA = gVar;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            lazyGridState3 = lazyGridStateA;
                            z15 = z13;
                            m0Var3 = m0VarA;
                            lVar3 = lVarD;
                            dVar3 = dVarP;
                            gVar2 = gVarA;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1485410512, i12, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:62)");
                        }
                        int i28 = i12 >> 3;
                        yh.p<s1.e, s1.b, List<Integer>> pVarM2 = m(columns, dVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i28 & bb.c.b.f30796me));
                        int i29 = 196608 | (i28 & 14) | (i28 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i28 & 3670016) | (i28 & 29360128);
                        int i210 = i12 << 9;
                        Arrangement.d dVar6 = dVar3;
                        m0 m0Var6 = m0Var3;
                        LazyGridKt.a(nVar2, lazyGridState3, pVarM2, m0Var3, z15, true, gVar2, z14, lVar3, dVar3, content, pVarF, i29 | (i210 & 234881024) | (i210 & 1879048192), (i12 >> 27) & 14, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar3 = nVar2;
                        dVar4 = dVar6;
                        m0Var4 = m0Var6;
                        lazyGridState4 = lazyGridState3;
                        z16 = z15;
                        lVar4 = lVar3;
                        gVar3 = gVar2;
                        z17 = z14;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState2;
                            }
                            if (i13 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.f5896a;
                                if (z13) {
                                    lVarD = arrangement.r();
                                } else {
                                    lVarD = arrangement.d();
                                }
                                i12 &= -458753;
                            } else {
                                lVarD = lVar2;
                            }
                            if (i17 != 0) {
                                dVarP = Arrangement.f5896a.p();
                            } else {
                                dVarP = dVar2;
                            }
                            if ((i11 & 128) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                gVarA = gVar;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            lazyGridState3 = lazyGridStateA;
                            z15 = z13;
                            m0Var3 = m0VarA;
                            lVar3 = lVarD;
                            dVar3 = dVarP;
                            gVar2 = gVarA;
                        } else {
                            if (i22 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState2;
                            }
                            if (i13 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.f5896a;
                                if (z13) {
                                    lVarD = arrangement.r();
                                } else {
                                    lVarD = arrangement.d();
                                }
                                i12 &= -458753;
                            } else {
                                lVarD = lVar2;
                            }
                            if (i17 != 0) {
                                dVarP = Arrangement.f5896a.p();
                            } else {
                                dVarP = dVar2;
                            }
                            if ((i11 & 128) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                gVarA = gVar;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            lazyGridState3 = lazyGridStateA;
                            z15 = z13;
                            m0Var3 = m0VarA;
                            lVar3 = lVarD;
                            dVar3 = dVarP;
                            gVar2 = gVarA;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1485410512, i12, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:62)");
                        }
                        int i211 = i12 >> 3;
                        yh.p<s1.e, s1.b, List<Integer>> pVarM3 = m(columns, dVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i211 & bb.c.b.f30796me));
                        int i212 = 196608 | (i211 & 14) | (i211 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i211 & 3670016) | (i211 & 29360128);
                        int i213 = i12 << 9;
                        Arrangement.d dVar7 = dVar3;
                        m0 m0Var7 = m0Var3;
                        LazyGridKt.a(nVar2, lazyGridState3, pVarM3, m0Var3, z15, true, gVar2, z14, lVar3, dVar3, content, pVarF, i212 | (i213 & 234881024) | (i213 & 1879048192), (i12 >> 27) & 14, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar3 = nVar2;
                        dVar4 = dVar7;
                        m0Var4 = m0Var7;
                        lazyGridState4 = lazyGridState3;
                        z16 = z15;
                        lVar4 = lVar3;
                        gVar3 = gVar2;
                        z17 = z14;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i214) {
                            LazyGridDslKt.b(columns, nVar3, lazyGridState4, m0Var4, z16, lVar4, dVar4, gVar3, z17, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i12 |= 24576;
                z12 = z10;
                if ((458752 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        lVar2 = lVar;
                        if (pVarF.s(lVar2)) {
                        }
                        i12 |= i24;
                    } else {
                        lVar2 = lVar;
                    }
                    i12 |= i24;
                } else {
                    lVar2 = lVar;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                    dVar2 = dVar;
                } else {
                    dVar2 = dVar;
                    if ((i10 & 3670016) == 0) {
                        if (pVarF.s(dVar2)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !pVarF.s(gVar)) ? 4194304 : 8388608;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (pVarF.u(z11)) {
                        i20 = 67108864;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i11 & 512) != 0) {
                    if ((i10 & 1879048192) == 0) {
                        if (pVarF.s(content)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                    }
                    if ((1533916891 & i12) == 306783378) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState2;
                            }
                            if (i13 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.f5896a;
                                if (z13) {
                                    lVarD = arrangement.r();
                                } else {
                                    lVarD = arrangement.d();
                                }
                                i12 &= -458753;
                            } else {
                                lVarD = lVar2;
                            }
                            if (i17 != 0) {
                                dVarP = Arrangement.f5896a.p();
                            } else {
                                dVarP = dVar2;
                            }
                            if ((i11 & 128) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                gVarA = gVar;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            lazyGridState3 = lazyGridStateA;
                            z15 = z13;
                            m0Var3 = m0VarA;
                            lVar3 = lVarD;
                            dVar3 = dVarP;
                            gVar2 = gVarA;
                        } else {
                            if (i22 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState2;
                            }
                            if (i13 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.f5896a;
                                if (z13) {
                                    lVarD = arrangement.r();
                                } else {
                                    lVarD = arrangement.d();
                                }
                                i12 &= -458753;
                            } else {
                                lVarD = lVar2;
                            }
                            if (i17 != 0) {
                                dVarP = Arrangement.f5896a.p();
                            } else {
                                dVarP = dVar2;
                            }
                            if ((i11 & 128) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                gVarA = gVar;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            lazyGridState3 = lazyGridStateA;
                            z15 = z13;
                            m0Var3 = m0VarA;
                            lVar3 = lVarD;
                            dVar3 = dVarP;
                            gVar2 = gVarA;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1485410512, i12, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:62)");
                        }
                        int i214 = i12 >> 3;
                        yh.p<s1.e, s1.b, List<Integer>> pVarM4 = m(columns, dVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i214 & bb.c.b.f30796me));
                        int i215 = 196608 | (i214 & 14) | (i214 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i214 & 3670016) | (i214 & 29360128);
                        int i216 = i12 << 9;
                        Arrangement.d dVar8 = dVar3;
                        m0 m0Var8 = m0Var3;
                        LazyGridKt.a(nVar2, lazyGridState3, pVarM4, m0Var3, z15, true, gVar2, z14, lVar3, dVar3, content, pVarF, i215 | (i216 & 234881024) | (i216 & 1879048192), (i12 >> 27) & 14, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar3 = nVar2;
                        dVar4 = dVar8;
                        m0Var4 = m0Var8;
                        lazyGridState4 = lazyGridState3;
                        z16 = z15;
                        lVar4 = lVar3;
                        gVar3 = gVar2;
                        z17 = z14;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState2;
                            }
                            if (i13 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.f5896a;
                                if (z13) {
                                    lVarD = arrangement.r();
                                } else {
                                    lVarD = arrangement.d();
                                }
                                i12 &= -458753;
                            } else {
                                lVarD = lVar2;
                            }
                            if (i17 != 0) {
                                dVarP = Arrangement.f5896a.p();
                            } else {
                                dVarP = dVar2;
                            }
                            if ((i11 & 128) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                gVarA = gVar;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            lazyGridState3 = lazyGridStateA;
                            z15 = z13;
                            m0Var3 = m0VarA;
                            lVar3 = lVarD;
                            dVar3 = dVarP;
                            gVar2 = gVarA;
                        } else {
                            if (i22 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState2;
                            }
                            if (i13 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.f5896a;
                                if (z13) {
                                    lVarD = arrangement.r();
                                } else {
                                    lVarD = arrangement.d();
                                }
                                i12 &= -458753;
                            } else {
                                lVarD = lVar2;
                            }
                            if (i17 != 0) {
                                dVarP = Arrangement.f5896a.p();
                            } else {
                                dVarP = dVar2;
                            }
                            if ((i11 & 128) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                gVarA = gVar;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            lazyGridState3 = lazyGridStateA;
                            z15 = z13;
                            m0Var3 = m0VarA;
                            lVar3 = lVarD;
                            dVar3 = dVarP;
                            gVar2 = gVarA;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1485410512, i12, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:62)");
                        }
                        int i217 = i12 >> 3;
                        yh.p<s1.e, s1.b, List<Integer>> pVarM5 = m(columns, dVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i217 & bb.c.b.f30796me));
                        int i218 = 196608 | (i217 & 14) | (i217 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i217 & 3670016) | (i217 & 29360128);
                        int i219 = i12 << 9;
                        Arrangement.d dVar9 = dVar3;
                        m0 m0Var9 = m0Var3;
                        LazyGridKt.a(nVar2, lazyGridState3, pVarM5, m0Var3, z15, true, gVar2, z14, lVar3, dVar3, content, pVarF, i218 | (i219 & 234881024) | (i219 & 1879048192), (i12 >> 27) & 14, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar3 = nVar2;
                        dVar4 = dVar9;
                        m0Var4 = m0Var9;
                        lazyGridState4 = lazyGridState3;
                        z16 = z15;
                        lVar4 = lVar3;
                        gVar3 = gVar2;
                        z17 = z14;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2110) {
                            LazyGridDslKt.b(columns, nVar3, lazyGridState4, m0Var4, z16, lVar4, dVar4, gVar3, z17, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i21 = com.google.android.exoplayer2.j.G;
                i12 |= i21;
                if ((1533916891 & i12) == 306783378) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                lVarD = arrangement.r();
                            } else {
                                lVarD = arrangement.d();
                            }
                            i12 &= -458753;
                        } else {
                            lVarD = lVar2;
                        }
                        if (i17 != 0) {
                            dVarP = Arrangement.f5896a.p();
                        } else {
                            dVarP = dVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        lVar3 = lVarD;
                        dVar3 = dVarP;
                        gVar2 = gVarA;
                    } else {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                lVarD = arrangement.r();
                            } else {
                                lVarD = arrangement.d();
                            }
                            i12 &= -458753;
                        } else {
                            lVarD = lVar2;
                        }
                        if (i17 != 0) {
                            dVarP = Arrangement.f5896a.p();
                        } else {
                            dVarP = dVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        lVar3 = lVarD;
                        dVar3 = dVarP;
                        gVar2 = gVarA;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1485410512, i12, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:62)");
                    }
                    int i2110 = i12 >> 3;
                    yh.p<s1.e, s1.b, List<Integer>> pVarM6 = m(columns, dVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i2110 & bb.c.b.f30796me));
                    int i2111 = 196608 | (i2110 & 14) | (i2110 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i2110 & 3670016) | (i2110 & 29360128);
                    int i2112 = i12 << 9;
                    Arrangement.d dVar10 = dVar3;
                    m0 m0Var10 = m0Var3;
                    LazyGridKt.a(nVar2, lazyGridState3, pVarM6, m0Var3, z15, true, gVar2, z14, lVar3, dVar3, content, pVarF, i2111 | (i2112 & 234881024) | (i2112 & 1879048192), (i12 >> 27) & 14, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar3 = nVar2;
                    dVar4 = dVar10;
                    m0Var4 = m0Var10;
                    lazyGridState4 = lazyGridState3;
                    z16 = z15;
                    lVar4 = lVar3;
                    gVar3 = gVar2;
                    z17 = z14;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                lVarD = arrangement.r();
                            } else {
                                lVarD = arrangement.d();
                            }
                            i12 &= -458753;
                        } else {
                            lVarD = lVar2;
                        }
                        if (i17 != 0) {
                            dVarP = Arrangement.f5896a.p();
                        } else {
                            dVarP = dVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        lVar3 = lVarD;
                        dVar3 = dVarP;
                        gVar2 = gVarA;
                    } else {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                lVarD = arrangement.r();
                            } else {
                                lVarD = arrangement.d();
                            }
                            i12 &= -458753;
                        } else {
                            lVarD = lVar2;
                        }
                        if (i17 != 0) {
                            dVarP = Arrangement.f5896a.p();
                        } else {
                            dVarP = dVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        lVar3 = lVarD;
                        dVar3 = dVarP;
                        gVar2 = gVarA;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1485410512, i12, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:62)");
                    }
                    int i2113 = i12 >> 3;
                    yh.p<s1.e, s1.b, List<Integer>> pVarM7 = m(columns, dVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i2113 & bb.c.b.f30796me));
                    int i2114 = 196608 | (i2113 & 14) | (i2113 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i2113 & 3670016) | (i2113 & 29360128);
                    int i2115 = i12 << 9;
                    Arrangement.d dVar11 = dVar3;
                    m0 m0Var11 = m0Var3;
                    LazyGridKt.a(nVar2, lazyGridState3, pVarM7, m0Var3, z15, true, gVar2, z14, lVar3, dVar3, content, pVarF, i2114 | (i2115 & 234881024) | (i2115 & 1879048192), (i12 >> 27) & 14, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar3 = nVar2;
                    dVar4 = dVar11;
                    m0Var4 = m0Var11;
                    lazyGridState4 = lazyGridState3;
                    z16 = z15;
                    lVar4 = lVar3;
                    gVar3 = gVar2;
                    z17 = z14;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2116) {
                        LazyGridDslKt.b(columns, nVar3, lazyGridState4, m0Var4, z16, lVar4, dVar4, gVar3, z17, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= bb.c.d.f31193dj;
            m0Var2 = m0Var;
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 57344) == 0) {
                    z12 = z10;
                    if (pVarF.u(z12)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((458752 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        lVar2 = lVar;
                        if (pVarF.s(lVar2)) {
                        }
                        i12 |= i24;
                    } else {
                        lVar2 = lVar;
                    }
                    i12 |= i24;
                } else {
                    lVar2 = lVar;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                    dVar2 = dVar;
                } else {
                    dVar2 = dVar;
                    if ((i10 & 3670016) == 0) {
                        if (pVarF.s(dVar2)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !pVarF.s(gVar)) ? 4194304 : 8388608;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (pVarF.u(z11)) {
                        i20 = 67108864;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i11 & 512) != 0) {
                    if ((i10 & 1879048192) == 0) {
                        if (pVarF.s(content)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                    }
                    if ((1533916891 & i12) == 306783378) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState2;
                            }
                            if (i13 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.f5896a;
                                if (z13) {
                                    lVarD = arrangement.r();
                                } else {
                                    lVarD = arrangement.d();
                                }
                                i12 &= -458753;
                            } else {
                                lVarD = lVar2;
                            }
                            if (i17 != 0) {
                                dVarP = Arrangement.f5896a.p();
                            } else {
                                dVarP = dVar2;
                            }
                            if ((i11 & 128) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                gVarA = gVar;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            lazyGridState3 = lazyGridStateA;
                            z15 = z13;
                            m0Var3 = m0VarA;
                            lVar3 = lVarD;
                            dVar3 = dVarP;
                            gVar2 = gVarA;
                        } else {
                            if (i22 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState2;
                            }
                            if (i13 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.f5896a;
                                if (z13) {
                                    lVarD = arrangement.r();
                                } else {
                                    lVarD = arrangement.d();
                                }
                                i12 &= -458753;
                            } else {
                                lVarD = lVar2;
                            }
                            if (i17 != 0) {
                                dVarP = Arrangement.f5896a.p();
                            } else {
                                dVarP = dVar2;
                            }
                            if ((i11 & 128) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                gVarA = gVar;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            lazyGridState3 = lazyGridStateA;
                            z15 = z13;
                            m0Var3 = m0VarA;
                            lVar3 = lVarD;
                            dVar3 = dVarP;
                            gVar2 = gVarA;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1485410512, i12, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:62)");
                        }
                        int i2116 = i12 >> 3;
                        yh.p<s1.e, s1.b, List<Integer>> pVarM8 = m(columns, dVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i2116 & bb.c.b.f30796me));
                        int i2117 = 196608 | (i2116 & 14) | (i2116 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i2116 & 3670016) | (i2116 & 29360128);
                        int i2118 = i12 << 9;
                        Arrangement.d dVar12 = dVar3;
                        m0 m0Var12 = m0Var3;
                        LazyGridKt.a(nVar2, lazyGridState3, pVarM8, m0Var3, z15, true, gVar2, z14, lVar3, dVar3, content, pVarF, i2117 | (i2118 & 234881024) | (i2118 & 1879048192), (i12 >> 27) & 14, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar3 = nVar2;
                        dVar4 = dVar12;
                        m0Var4 = m0Var12;
                        lazyGridState4 = lazyGridState3;
                        z16 = z15;
                        lVar4 = lVar3;
                        gVar3 = gVar2;
                        z17 = z14;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState2;
                            }
                            if (i13 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.f5896a;
                                if (z13) {
                                    lVarD = arrangement.r();
                                } else {
                                    lVarD = arrangement.d();
                                }
                                i12 &= -458753;
                            } else {
                                lVarD = lVar2;
                            }
                            if (i17 != 0) {
                                dVarP = Arrangement.f5896a.p();
                            } else {
                                dVarP = dVar2;
                            }
                            if ((i11 & 128) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                gVarA = gVar;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            lazyGridState3 = lazyGridStateA;
                            z15 = z13;
                            m0Var3 = m0VarA;
                            lVar3 = lVarD;
                            dVar3 = dVarP;
                            gVar2 = gVarA;
                        } else {
                            if (i22 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState2;
                            }
                            if (i13 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.f5896a;
                                if (z13) {
                                    lVarD = arrangement.r();
                                } else {
                                    lVarD = arrangement.d();
                                }
                                i12 &= -458753;
                            } else {
                                lVarD = lVar2;
                            }
                            if (i17 != 0) {
                                dVarP = Arrangement.f5896a.p();
                            } else {
                                dVarP = dVar2;
                            }
                            if ((i11 & 128) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                gVarA = gVar;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            lazyGridState3 = lazyGridStateA;
                            z15 = z13;
                            m0Var3 = m0VarA;
                            lVar3 = lVarD;
                            dVar3 = dVarP;
                            gVar2 = gVarA;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1485410512, i12, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:62)");
                        }
                        int i2119 = i12 >> 3;
                        yh.p<s1.e, s1.b, List<Integer>> pVarM9 = m(columns, dVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i2119 & bb.c.b.f30796me));
                        int i21110 = 196608 | (i2119 & 14) | (i2119 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i2119 & 3670016) | (i2119 & 29360128);
                        int i21111 = i12 << 9;
                        Arrangement.d dVar13 = dVar3;
                        m0 m0Var13 = m0Var3;
                        LazyGridKt.a(nVar2, lazyGridState3, pVarM9, m0Var3, z15, true, gVar2, z14, lVar3, dVar3, content, pVarF, i21110 | (i21111 & 234881024) | (i21111 & 1879048192), (i12 >> 27) & 14, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar3 = nVar2;
                        dVar4 = dVar13;
                        m0Var4 = m0Var13;
                        lazyGridState4 = lazyGridState3;
                        z16 = z15;
                        lVar4 = lVar3;
                        gVar3 = gVar2;
                        z17 = z14;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21112) {
                            LazyGridDslKt.b(columns, nVar3, lazyGridState4, m0Var4, z16, lVar4, dVar4, gVar3, z17, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i21 = com.google.android.exoplayer2.j.G;
                i12 |= i21;
                if ((1533916891 & i12) == 306783378) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                lVarD = arrangement.r();
                            } else {
                                lVarD = arrangement.d();
                            }
                            i12 &= -458753;
                        } else {
                            lVarD = lVar2;
                        }
                        if (i17 != 0) {
                            dVarP = Arrangement.f5896a.p();
                        } else {
                            dVarP = dVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        lVar3 = lVarD;
                        dVar3 = dVarP;
                        gVar2 = gVarA;
                    } else {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                lVarD = arrangement.r();
                            } else {
                                lVarD = arrangement.d();
                            }
                            i12 &= -458753;
                        } else {
                            lVarD = lVar2;
                        }
                        if (i17 != 0) {
                            dVarP = Arrangement.f5896a.p();
                        } else {
                            dVarP = dVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        lVar3 = lVarD;
                        dVar3 = dVarP;
                        gVar2 = gVarA;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1485410512, i12, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:62)");
                    }
                    int i21112 = i12 >> 3;
                    yh.p<s1.e, s1.b, List<Integer>> pVarM10 = m(columns, dVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i21112 & bb.c.b.f30796me));
                    int i21113 = 196608 | (i21112 & 14) | (i21112 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i21112 & 3670016) | (i21112 & 29360128);
                    int i21114 = i12 << 9;
                    Arrangement.d dVar14 = dVar3;
                    m0 m0Var14 = m0Var3;
                    LazyGridKt.a(nVar2, lazyGridState3, pVarM10, m0Var3, z15, true, gVar2, z14, lVar3, dVar3, content, pVarF, i21113 | (i21114 & 234881024) | (i21114 & 1879048192), (i12 >> 27) & 14, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar3 = nVar2;
                    dVar4 = dVar14;
                    m0Var4 = m0Var14;
                    lazyGridState4 = lazyGridState3;
                    z16 = z15;
                    lVar4 = lVar3;
                    gVar3 = gVar2;
                    z17 = z14;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                lVarD = arrangement.r();
                            } else {
                                lVarD = arrangement.d();
                            }
                            i12 &= -458753;
                        } else {
                            lVarD = lVar2;
                        }
                        if (i17 != 0) {
                            dVarP = Arrangement.f5896a.p();
                        } else {
                            dVarP = dVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        lVar3 = lVarD;
                        dVar3 = dVarP;
                        gVar2 = gVarA;
                    } else {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                lVarD = arrangement.r();
                            } else {
                                lVarD = arrangement.d();
                            }
                            i12 &= -458753;
                        } else {
                            lVarD = lVar2;
                        }
                        if (i17 != 0) {
                            dVarP = Arrangement.f5896a.p();
                        } else {
                            dVarP = dVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        lVar3 = lVarD;
                        dVar3 = dVarP;
                        gVar2 = gVarA;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1485410512, i12, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:62)");
                    }
                    int i21115 = i12 >> 3;
                    yh.p<s1.e, s1.b, List<Integer>> pVarM11 = m(columns, dVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i21115 & bb.c.b.f30796me));
                    int i21116 = 196608 | (i21115 & 14) | (i21115 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i21115 & 3670016) | (i21115 & 29360128);
                    int i21117 = i12 << 9;
                    Arrangement.d dVar15 = dVar3;
                    m0 m0Var15 = m0Var3;
                    LazyGridKt.a(nVar2, lazyGridState3, pVarM11, m0Var3, z15, true, gVar2, z14, lVar3, dVar3, content, pVarF, i21116 | (i21117 & 234881024) | (i21117 & 1879048192), (i12 >> 27) & 14, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar3 = nVar2;
                    dVar4 = dVar15;
                    m0Var4 = m0Var15;
                    lazyGridState4 = lazyGridState3;
                    z16 = z15;
                    lVar4 = lVar3;
                    gVar3 = gVar2;
                    z17 = z14;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21118) {
                        LazyGridDslKt.b(columns, nVar3, lazyGridState4, m0Var4, z16, lVar4, dVar4, gVar3, z17, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= 24576;
            z12 = z10;
            if ((458752 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    lVar2 = lVar;
                    if (pVarF.s(lVar2)) {
                    }
                    i12 |= i24;
                } else {
                    lVar2 = lVar;
                }
                i12 |= i24;
            } else {
                lVar2 = lVar;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
                dVar2 = dVar;
            } else {
                dVar2 = dVar;
                if ((i10 & 3670016) == 0) {
                    if (pVarF.s(dVar2)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
            }
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !pVarF.s(gVar)) ? 4194304 : 8388608;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (pVarF.u(z11)) {
                    i20 = 67108864;
                } else {
                    i20 = 33554432;
                }
                i12 |= i20;
            }
            if ((i11 & 512) != 0) {
                if ((i10 & 1879048192) == 0) {
                    if (pVarF.s(content)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                }
                if ((1533916891 & i12) == 306783378) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                lVarD = arrangement.r();
                            } else {
                                lVarD = arrangement.d();
                            }
                            i12 &= -458753;
                        } else {
                            lVarD = lVar2;
                        }
                        if (i17 != 0) {
                            dVarP = Arrangement.f5896a.p();
                        } else {
                            dVarP = dVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        lVar3 = lVarD;
                        dVar3 = dVarP;
                        gVar2 = gVarA;
                    } else {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                lVarD = arrangement.r();
                            } else {
                                lVarD = arrangement.d();
                            }
                            i12 &= -458753;
                        } else {
                            lVarD = lVar2;
                        }
                        if (i17 != 0) {
                            dVarP = Arrangement.f5896a.p();
                        } else {
                            dVarP = dVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        lVar3 = lVarD;
                        dVar3 = dVarP;
                        gVar2 = gVarA;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1485410512, i12, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:62)");
                    }
                    int i21118 = i12 >> 3;
                    yh.p<s1.e, s1.b, List<Integer>> pVarM12 = m(columns, dVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i21118 & bb.c.b.f30796me));
                    int i21119 = 196608 | (i21118 & 14) | (i21118 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i21118 & 3670016) | (i21118 & 29360128);
                    int i211110 = i12 << 9;
                    Arrangement.d dVar16 = dVar3;
                    m0 m0Var16 = m0Var3;
                    LazyGridKt.a(nVar2, lazyGridState3, pVarM12, m0Var3, z15, true, gVar2, z14, lVar3, dVar3, content, pVarF, i21119 | (i211110 & 234881024) | (i211110 & 1879048192), (i12 >> 27) & 14, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar3 = nVar2;
                    dVar4 = dVar16;
                    m0Var4 = m0Var16;
                    lazyGridState4 = lazyGridState3;
                    z16 = z15;
                    lVar4 = lVar3;
                    gVar3 = gVar2;
                    z17 = z14;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                lVarD = arrangement.r();
                            } else {
                                lVarD = arrangement.d();
                            }
                            i12 &= -458753;
                        } else {
                            lVarD = lVar2;
                        }
                        if (i17 != 0) {
                            dVarP = Arrangement.f5896a.p();
                        } else {
                            dVarP = dVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        lVar3 = lVarD;
                        dVar3 = dVarP;
                        gVar2 = gVarA;
                    } else {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                lVarD = arrangement.r();
                            } else {
                                lVarD = arrangement.d();
                            }
                            i12 &= -458753;
                        } else {
                            lVarD = lVar2;
                        }
                        if (i17 != 0) {
                            dVarP = Arrangement.f5896a.p();
                        } else {
                            dVarP = dVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        lVar3 = lVarD;
                        dVar3 = dVarP;
                        gVar2 = gVarA;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1485410512, i12, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:62)");
                    }
                    int i211111 = i12 >> 3;
                    yh.p<s1.e, s1.b, List<Integer>> pVarM13 = m(columns, dVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i211111 & bb.c.b.f30796me));
                    int i211112 = 196608 | (i211111 & 14) | (i211111 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i211111 & 3670016) | (i211111 & 29360128);
                    int i211113 = i12 << 9;
                    Arrangement.d dVar17 = dVar3;
                    m0 m0Var17 = m0Var3;
                    LazyGridKt.a(nVar2, lazyGridState3, pVarM13, m0Var3, z15, true, gVar2, z14, lVar3, dVar3, content, pVarF, i211112 | (i211113 & 234881024) | (i211113 & 1879048192), (i12 >> 27) & 14, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar3 = nVar2;
                    dVar4 = dVar17;
                    m0Var4 = m0Var17;
                    lazyGridState4 = lazyGridState3;
                    z16 = z15;
                    lVar4 = lVar3;
                    gVar3 = gVar2;
                    z17 = z14;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i211114) {
                        LazyGridDslKt.b(columns, nVar3, lazyGridState4, m0Var4, z16, lVar4, dVar4, gVar3, z17, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i21 = com.google.android.exoplayer2.j.G;
            i12 |= i21;
            if ((1533916891 & i12) == 306783378) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateA = lazyGridState2;
                    }
                    if (i13 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            lVarD = arrangement.r();
                        } else {
                            lVarD = arrangement.d();
                        }
                        i12 &= -458753;
                    } else {
                        lVarD = lVar2;
                    }
                    if (i17 != 0) {
                        dVarP = Arrangement.f5896a.p();
                    } else {
                        dVarP = dVar2;
                    }
                    if ((i11 & 128) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        gVarA = gVar;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    lazyGridState3 = lazyGridStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    lVar3 = lVarD;
                    dVar3 = dVarP;
                    gVar2 = gVarA;
                } else {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateA = lazyGridState2;
                    }
                    if (i13 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            lVarD = arrangement.r();
                        } else {
                            lVarD = arrangement.d();
                        }
                        i12 &= -458753;
                    } else {
                        lVarD = lVar2;
                    }
                    if (i17 != 0) {
                        dVarP = Arrangement.f5896a.p();
                    } else {
                        dVarP = dVar2;
                    }
                    if ((i11 & 128) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        gVarA = gVar;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    lazyGridState3 = lazyGridStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    lVar3 = lVarD;
                    dVar3 = dVarP;
                    gVar2 = gVarA;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1485410512, i12, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:62)");
                }
                int i211114 = i12 >> 3;
                yh.p<s1.e, s1.b, List<Integer>> pVarM14 = m(columns, dVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i211114 & bb.c.b.f30796me));
                int i211115 = 196608 | (i211114 & 14) | (i211114 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i211114 & 3670016) | (i211114 & 29360128);
                int i211116 = i12 << 9;
                Arrangement.d dVar18 = dVar3;
                m0 m0Var18 = m0Var3;
                LazyGridKt.a(nVar2, lazyGridState3, pVarM14, m0Var3, z15, true, gVar2, z14, lVar3, dVar3, content, pVarF, i211115 | (i211116 & 234881024) | (i211116 & 1879048192), (i12 >> 27) & 14, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar3 = nVar2;
                dVar4 = dVar18;
                m0Var4 = m0Var18;
                lazyGridState4 = lazyGridState3;
                z16 = z15;
                lVar4 = lVar3;
                gVar3 = gVar2;
                z17 = z14;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateA = lazyGridState2;
                    }
                    if (i13 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            lVarD = arrangement.r();
                        } else {
                            lVarD = arrangement.d();
                        }
                        i12 &= -458753;
                    } else {
                        lVarD = lVar2;
                    }
                    if (i17 != 0) {
                        dVarP = Arrangement.f5896a.p();
                    } else {
                        dVarP = dVar2;
                    }
                    if ((i11 & 128) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        gVarA = gVar;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    lazyGridState3 = lazyGridStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    lVar3 = lVarD;
                    dVar3 = dVarP;
                    gVar2 = gVarA;
                } else {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateA = lazyGridState2;
                    }
                    if (i13 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            lVarD = arrangement.r();
                        } else {
                            lVarD = arrangement.d();
                        }
                        i12 &= -458753;
                    } else {
                        lVarD = lVar2;
                    }
                    if (i17 != 0) {
                        dVarP = Arrangement.f5896a.p();
                    } else {
                        dVarP = dVar2;
                    }
                    if ((i11 & 128) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        gVarA = gVar;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    lazyGridState3 = lazyGridStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    lVar3 = lVarD;
                    dVar3 = dVarP;
                    gVar2 = gVarA;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1485410512, i12, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:62)");
                }
                int i211117 = i12 >> 3;
                yh.p<s1.e, s1.b, List<Integer>> pVarM15 = m(columns, dVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i211117 & bb.c.b.f30796me));
                int i211118 = 196608 | (i211117 & 14) | (i211117 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i211117 & 3670016) | (i211117 & 29360128);
                int i211119 = i12 << 9;
                Arrangement.d dVar19 = dVar3;
                m0 m0Var19 = m0Var3;
                LazyGridKt.a(nVar2, lazyGridState3, pVarM15, m0Var3, z15, true, gVar2, z14, lVar3, dVar3, content, pVarF, i211118 | (i211119 & 234881024) | (i211119 & 1879048192), (i12 >> 27) & 14, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar3 = nVar2;
                dVar4 = dVar19;
                m0Var4 = m0Var19;
                lazyGridState4 = lazyGridState3;
                z16 = z15;
                lVar4 = lVar3;
                gVar3 = gVar2;
                z17 = z14;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2111110) {
                    LazyGridDslKt.b(columns, nVar3, lazyGridState4, m0Var4, z16, lVar4, dVar4, gVar3, z17, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= 48;
        if ((i10 & bb.c.b.f30796me) == 0) {
            if ((i11 & 4) == 0) {
                lazyGridState2 = lazyGridState;
                if (pVarF.s(lazyGridState2)) {
                }
                i12 |= i23;
            } else {
                lazyGridState2 = lazyGridState;
            }
            i12 |= i23;
        } else {
            lazyGridState2 = lazyGridState;
        }
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & bb.c.g.f32954lc) == 0) {
                m0Var2 = m0Var;
                if (pVarF.s(m0Var2)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 57344) == 0) {
                    z12 = z10;
                    if (pVarF.u(z12)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((458752 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        lVar2 = lVar;
                        if (pVarF.s(lVar2)) {
                        }
                        i12 |= i24;
                    } else {
                        lVar2 = lVar;
                    }
                    i12 |= i24;
                } else {
                    lVar2 = lVar;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                    dVar2 = dVar;
                } else {
                    dVar2 = dVar;
                    if ((i10 & 3670016) == 0) {
                        if (pVarF.s(dVar2)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !pVarF.s(gVar)) ? 4194304 : 8388608;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (pVarF.u(z11)) {
                        i20 = 67108864;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i11 & 512) != 0) {
                    if ((i10 & 1879048192) == 0) {
                        if (pVarF.s(content)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                    }
                    if ((1533916891 & i12) == 306783378) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState2;
                            }
                            if (i13 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.f5896a;
                                if (z13) {
                                    lVarD = arrangement.r();
                                } else {
                                    lVarD = arrangement.d();
                                }
                                i12 &= -458753;
                            } else {
                                lVarD = lVar2;
                            }
                            if (i17 != 0) {
                                dVarP = Arrangement.f5896a.p();
                            } else {
                                dVarP = dVar2;
                            }
                            if ((i11 & 128) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                gVarA = gVar;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            lazyGridState3 = lazyGridStateA;
                            z15 = z13;
                            m0Var3 = m0VarA;
                            lVar3 = lVarD;
                            dVar3 = dVarP;
                            gVar2 = gVarA;
                        } else {
                            if (i22 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState2;
                            }
                            if (i13 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.f5896a;
                                if (z13) {
                                    lVarD = arrangement.r();
                                } else {
                                    lVarD = arrangement.d();
                                }
                                i12 &= -458753;
                            } else {
                                lVarD = lVar2;
                            }
                            if (i17 != 0) {
                                dVarP = Arrangement.f5896a.p();
                            } else {
                                dVarP = dVar2;
                            }
                            if ((i11 & 128) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                gVarA = gVar;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            lazyGridState3 = lazyGridStateA;
                            z15 = z13;
                            m0Var3 = m0VarA;
                            lVar3 = lVarD;
                            dVar3 = dVarP;
                            gVar2 = gVarA;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1485410512, i12, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:62)");
                        }
                        int i2111110 = i12 >> 3;
                        yh.p<s1.e, s1.b, List<Integer>> pVarM16 = m(columns, dVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i2111110 & bb.c.b.f30796me));
                        int i2111111 = 196608 | (i2111110 & 14) | (i2111110 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i2111110 & 3670016) | (i2111110 & 29360128);
                        int i2111112 = i12 << 9;
                        Arrangement.d dVar110 = dVar3;
                        m0 m0Var110 = m0Var3;
                        LazyGridKt.a(nVar2, lazyGridState3, pVarM16, m0Var3, z15, true, gVar2, z14, lVar3, dVar3, content, pVarF, i2111111 | (i2111112 & 234881024) | (i2111112 & 1879048192), (i12 >> 27) & 14, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar3 = nVar2;
                        dVar4 = dVar110;
                        m0Var4 = m0Var110;
                        lazyGridState4 = lazyGridState3;
                        z16 = z15;
                        lVar4 = lVar3;
                        gVar3 = gVar2;
                        z17 = z14;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState2;
                            }
                            if (i13 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.f5896a;
                                if (z13) {
                                    lVarD = arrangement.r();
                                } else {
                                    lVarD = arrangement.d();
                                }
                                i12 &= -458753;
                            } else {
                                lVarD = lVar2;
                            }
                            if (i17 != 0) {
                                dVarP = Arrangement.f5896a.p();
                            } else {
                                dVarP = dVar2;
                            }
                            if ((i11 & 128) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                gVarA = gVar;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            lazyGridState3 = lazyGridStateA;
                            z15 = z13;
                            m0Var3 = m0VarA;
                            lVar3 = lVarD;
                            dVar3 = dVarP;
                            gVar2 = gVarA;
                        } else {
                            if (i22 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState2;
                            }
                            if (i13 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.f5896a;
                                if (z13) {
                                    lVarD = arrangement.r();
                                } else {
                                    lVarD = arrangement.d();
                                }
                                i12 &= -458753;
                            } else {
                                lVarD = lVar2;
                            }
                            if (i17 != 0) {
                                dVarP = Arrangement.f5896a.p();
                            } else {
                                dVarP = dVar2;
                            }
                            if ((i11 & 128) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                gVarA = gVar;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            lazyGridState3 = lazyGridStateA;
                            z15 = z13;
                            m0Var3 = m0VarA;
                            lVar3 = lVarD;
                            dVar3 = dVarP;
                            gVar2 = gVarA;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1485410512, i12, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:62)");
                        }
                        int i2111113 = i12 >> 3;
                        yh.p<s1.e, s1.b, List<Integer>> pVarM17 = m(columns, dVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i2111113 & bb.c.b.f30796me));
                        int i2111114 = 196608 | (i2111113 & 14) | (i2111113 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i2111113 & 3670016) | (i2111113 & 29360128);
                        int i2111115 = i12 << 9;
                        Arrangement.d dVar111 = dVar3;
                        m0 m0Var111 = m0Var3;
                        LazyGridKt.a(nVar2, lazyGridState3, pVarM17, m0Var3, z15, true, gVar2, z14, lVar3, dVar3, content, pVarF, i2111114 | (i2111115 & 234881024) | (i2111115 & 1879048192), (i12 >> 27) & 14, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar3 = nVar2;
                        dVar4 = dVar111;
                        m0Var4 = m0Var111;
                        lazyGridState4 = lazyGridState3;
                        z16 = z15;
                        lVar4 = lVar3;
                        gVar3 = gVar2;
                        z17 = z14;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2111116) {
                            LazyGridDslKt.b(columns, nVar3, lazyGridState4, m0Var4, z16, lVar4, dVar4, gVar3, z17, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i21 = com.google.android.exoplayer2.j.G;
                i12 |= i21;
                if ((1533916891 & i12) == 306783378) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                lVarD = arrangement.r();
                            } else {
                                lVarD = arrangement.d();
                            }
                            i12 &= -458753;
                        } else {
                            lVarD = lVar2;
                        }
                        if (i17 != 0) {
                            dVarP = Arrangement.f5896a.p();
                        } else {
                            dVarP = dVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        lVar3 = lVarD;
                        dVar3 = dVarP;
                        gVar2 = gVarA;
                    } else {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                lVarD = arrangement.r();
                            } else {
                                lVarD = arrangement.d();
                            }
                            i12 &= -458753;
                        } else {
                            lVarD = lVar2;
                        }
                        if (i17 != 0) {
                            dVarP = Arrangement.f5896a.p();
                        } else {
                            dVarP = dVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        lVar3 = lVarD;
                        dVar3 = dVarP;
                        gVar2 = gVarA;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1485410512, i12, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:62)");
                    }
                    int i2111116 = i12 >> 3;
                    yh.p<s1.e, s1.b, List<Integer>> pVarM18 = m(columns, dVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i2111116 & bb.c.b.f30796me));
                    int i2111117 = 196608 | (i2111116 & 14) | (i2111116 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i2111116 & 3670016) | (i2111116 & 29360128);
                    int i2111118 = i12 << 9;
                    Arrangement.d dVar112 = dVar3;
                    m0 m0Var112 = m0Var3;
                    LazyGridKt.a(nVar2, lazyGridState3, pVarM18, m0Var3, z15, true, gVar2, z14, lVar3, dVar3, content, pVarF, i2111117 | (i2111118 & 234881024) | (i2111118 & 1879048192), (i12 >> 27) & 14, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar3 = nVar2;
                    dVar4 = dVar112;
                    m0Var4 = m0Var112;
                    lazyGridState4 = lazyGridState3;
                    z16 = z15;
                    lVar4 = lVar3;
                    gVar3 = gVar2;
                    z17 = z14;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                lVarD = arrangement.r();
                            } else {
                                lVarD = arrangement.d();
                            }
                            i12 &= -458753;
                        } else {
                            lVarD = lVar2;
                        }
                        if (i17 != 0) {
                            dVarP = Arrangement.f5896a.p();
                        } else {
                            dVarP = dVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        lVar3 = lVarD;
                        dVar3 = dVarP;
                        gVar2 = gVarA;
                    } else {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                lVarD = arrangement.r();
                            } else {
                                lVarD = arrangement.d();
                            }
                            i12 &= -458753;
                        } else {
                            lVarD = lVar2;
                        }
                        if (i17 != 0) {
                            dVarP = Arrangement.f5896a.p();
                        } else {
                            dVarP = dVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        lVar3 = lVarD;
                        dVar3 = dVarP;
                        gVar2 = gVarA;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1485410512, i12, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:62)");
                    }
                    int i2111119 = i12 >> 3;
                    yh.p<s1.e, s1.b, List<Integer>> pVarM19 = m(columns, dVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i2111119 & bb.c.b.f30796me));
                    int i21111110 = 196608 | (i2111119 & 14) | (i2111119 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i2111119 & 3670016) | (i2111119 & 29360128);
                    int i21111111 = i12 << 9;
                    Arrangement.d dVar113 = dVar3;
                    m0 m0Var113 = m0Var3;
                    LazyGridKt.a(nVar2, lazyGridState3, pVarM19, m0Var3, z15, true, gVar2, z14, lVar3, dVar3, content, pVarF, i21111110 | (i21111111 & 234881024) | (i21111111 & 1879048192), (i12 >> 27) & 14, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar3 = nVar2;
                    dVar4 = dVar113;
                    m0Var4 = m0Var113;
                    lazyGridState4 = lazyGridState3;
                    z16 = z15;
                    lVar4 = lVar3;
                    gVar3 = gVar2;
                    z17 = z14;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21111112) {
                        LazyGridDslKt.b(columns, nVar3, lazyGridState4, m0Var4, z16, lVar4, dVar4, gVar3, z17, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= 24576;
            z12 = z10;
            if ((458752 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    lVar2 = lVar;
                    if (pVarF.s(lVar2)) {
                    }
                    i12 |= i24;
                } else {
                    lVar2 = lVar;
                }
                i12 |= i24;
            } else {
                lVar2 = lVar;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
                dVar2 = dVar;
            } else {
                dVar2 = dVar;
                if ((i10 & 3670016) == 0) {
                    if (pVarF.s(dVar2)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
            }
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !pVarF.s(gVar)) ? 4194304 : 8388608;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (pVarF.u(z11)) {
                    i20 = 67108864;
                } else {
                    i20 = 33554432;
                }
                i12 |= i20;
            }
            if ((i11 & 512) != 0) {
                if ((i10 & 1879048192) == 0) {
                    if (pVarF.s(content)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                }
                if ((1533916891 & i12) == 306783378) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                lVarD = arrangement.r();
                            } else {
                                lVarD = arrangement.d();
                            }
                            i12 &= -458753;
                        } else {
                            lVarD = lVar2;
                        }
                        if (i17 != 0) {
                            dVarP = Arrangement.f5896a.p();
                        } else {
                            dVarP = dVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        lVar3 = lVarD;
                        dVar3 = dVarP;
                        gVar2 = gVarA;
                    } else {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                lVarD = arrangement.r();
                            } else {
                                lVarD = arrangement.d();
                            }
                            i12 &= -458753;
                        } else {
                            lVarD = lVar2;
                        }
                        if (i17 != 0) {
                            dVarP = Arrangement.f5896a.p();
                        } else {
                            dVarP = dVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        lVar3 = lVarD;
                        dVar3 = dVarP;
                        gVar2 = gVarA;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1485410512, i12, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:62)");
                    }
                    int i21111112 = i12 >> 3;
                    yh.p<s1.e, s1.b, List<Integer>> pVarM110 = m(columns, dVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i21111112 & bb.c.b.f30796me));
                    int i21111113 = 196608 | (i21111112 & 14) | (i21111112 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i21111112 & 3670016) | (i21111112 & 29360128);
                    int i21111114 = i12 << 9;
                    Arrangement.d dVar114 = dVar3;
                    m0 m0Var114 = m0Var3;
                    LazyGridKt.a(nVar2, lazyGridState3, pVarM110, m0Var3, z15, true, gVar2, z14, lVar3, dVar3, content, pVarF, i21111113 | (i21111114 & 234881024) | (i21111114 & 1879048192), (i12 >> 27) & 14, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar3 = nVar2;
                    dVar4 = dVar114;
                    m0Var4 = m0Var114;
                    lazyGridState4 = lazyGridState3;
                    z16 = z15;
                    lVar4 = lVar3;
                    gVar3 = gVar2;
                    z17 = z14;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                lVarD = arrangement.r();
                            } else {
                                lVarD = arrangement.d();
                            }
                            i12 &= -458753;
                        } else {
                            lVarD = lVar2;
                        }
                        if (i17 != 0) {
                            dVarP = Arrangement.f5896a.p();
                        } else {
                            dVarP = dVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        lVar3 = lVarD;
                        dVar3 = dVarP;
                        gVar2 = gVarA;
                    } else {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                lVarD = arrangement.r();
                            } else {
                                lVarD = arrangement.d();
                            }
                            i12 &= -458753;
                        } else {
                            lVarD = lVar2;
                        }
                        if (i17 != 0) {
                            dVarP = Arrangement.f5896a.p();
                        } else {
                            dVarP = dVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        lVar3 = lVarD;
                        dVar3 = dVarP;
                        gVar2 = gVarA;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1485410512, i12, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:62)");
                    }
                    int i21111115 = i12 >> 3;
                    yh.p<s1.e, s1.b, List<Integer>> pVarM111 = m(columns, dVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i21111115 & bb.c.b.f30796me));
                    int i21111116 = 196608 | (i21111115 & 14) | (i21111115 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i21111115 & 3670016) | (i21111115 & 29360128);
                    int i21111117 = i12 << 9;
                    Arrangement.d dVar115 = dVar3;
                    m0 m0Var115 = m0Var3;
                    LazyGridKt.a(nVar2, lazyGridState3, pVarM111, m0Var3, z15, true, gVar2, z14, lVar3, dVar3, content, pVarF, i21111116 | (i21111117 & 234881024) | (i21111117 & 1879048192), (i12 >> 27) & 14, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar3 = nVar2;
                    dVar4 = dVar115;
                    m0Var4 = m0Var115;
                    lazyGridState4 = lazyGridState3;
                    z16 = z15;
                    lVar4 = lVar3;
                    gVar3 = gVar2;
                    z17 = z14;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21111118) {
                        LazyGridDslKt.b(columns, nVar3, lazyGridState4, m0Var4, z16, lVar4, dVar4, gVar3, z17, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i21 = com.google.android.exoplayer2.j.G;
            i12 |= i21;
            if ((1533916891 & i12) == 306783378) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateA = lazyGridState2;
                    }
                    if (i13 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            lVarD = arrangement.r();
                        } else {
                            lVarD = arrangement.d();
                        }
                        i12 &= -458753;
                    } else {
                        lVarD = lVar2;
                    }
                    if (i17 != 0) {
                        dVarP = Arrangement.f5896a.p();
                    } else {
                        dVarP = dVar2;
                    }
                    if ((i11 & 128) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        gVarA = gVar;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    lazyGridState3 = lazyGridStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    lVar3 = lVarD;
                    dVar3 = dVarP;
                    gVar2 = gVarA;
                } else {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateA = lazyGridState2;
                    }
                    if (i13 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            lVarD = arrangement.r();
                        } else {
                            lVarD = arrangement.d();
                        }
                        i12 &= -458753;
                    } else {
                        lVarD = lVar2;
                    }
                    if (i17 != 0) {
                        dVarP = Arrangement.f5896a.p();
                    } else {
                        dVarP = dVar2;
                    }
                    if ((i11 & 128) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        gVarA = gVar;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    lazyGridState3 = lazyGridStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    lVar3 = lVarD;
                    dVar3 = dVarP;
                    gVar2 = gVarA;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1485410512, i12, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:62)");
                }
                int i21111118 = i12 >> 3;
                yh.p<s1.e, s1.b, List<Integer>> pVarM112 = m(columns, dVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i21111118 & bb.c.b.f30796me));
                int i21111119 = 196608 | (i21111118 & 14) | (i21111118 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i21111118 & 3670016) | (i21111118 & 29360128);
                int i211111110 = i12 << 9;
                Arrangement.d dVar116 = dVar3;
                m0 m0Var116 = m0Var3;
                LazyGridKt.a(nVar2, lazyGridState3, pVarM112, m0Var3, z15, true, gVar2, z14, lVar3, dVar3, content, pVarF, i21111119 | (i211111110 & 234881024) | (i211111110 & 1879048192), (i12 >> 27) & 14, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar3 = nVar2;
                dVar4 = dVar116;
                m0Var4 = m0Var116;
                lazyGridState4 = lazyGridState3;
                z16 = z15;
                lVar4 = lVar3;
                gVar3 = gVar2;
                z17 = z14;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateA = lazyGridState2;
                    }
                    if (i13 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            lVarD = arrangement.r();
                        } else {
                            lVarD = arrangement.d();
                        }
                        i12 &= -458753;
                    } else {
                        lVarD = lVar2;
                    }
                    if (i17 != 0) {
                        dVarP = Arrangement.f5896a.p();
                    } else {
                        dVarP = dVar2;
                    }
                    if ((i11 & 128) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        gVarA = gVar;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    lazyGridState3 = lazyGridStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    lVar3 = lVarD;
                    dVar3 = dVarP;
                    gVar2 = gVarA;
                } else {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateA = lazyGridState2;
                    }
                    if (i13 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            lVarD = arrangement.r();
                        } else {
                            lVarD = arrangement.d();
                        }
                        i12 &= -458753;
                    } else {
                        lVarD = lVar2;
                    }
                    if (i17 != 0) {
                        dVarP = Arrangement.f5896a.p();
                    } else {
                        dVarP = dVar2;
                    }
                    if ((i11 & 128) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        gVarA = gVar;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    lazyGridState3 = lazyGridStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    lVar3 = lVarD;
                    dVar3 = dVarP;
                    gVar2 = gVarA;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1485410512, i12, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:62)");
                }
                int i211111111 = i12 >> 3;
                yh.p<s1.e, s1.b, List<Integer>> pVarM113 = m(columns, dVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i211111111 & bb.c.b.f30796me));
                int i211111112 = 196608 | (i211111111 & 14) | (i211111111 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i211111111 & 3670016) | (i211111111 & 29360128);
                int i211111113 = i12 << 9;
                Arrangement.d dVar117 = dVar3;
                m0 m0Var117 = m0Var3;
                LazyGridKt.a(nVar2, lazyGridState3, pVarM113, m0Var3, z15, true, gVar2, z14, lVar3, dVar3, content, pVarF, i211111112 | (i211111113 & 234881024) | (i211111113 & 1879048192), (i12 >> 27) & 14, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar3 = nVar2;
                dVar4 = dVar117;
                m0Var4 = m0Var117;
                lazyGridState4 = lazyGridState3;
                z16 = z15;
                lVar4 = lVar3;
                gVar3 = gVar2;
                z17 = z14;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i211111114) {
                    LazyGridDslKt.b(columns, nVar3, lazyGridState4, m0Var4, z16, lVar4, dVar4, gVar3, z17, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= bb.c.d.f31193dj;
        m0Var2 = m0Var;
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((i10 & 57344) == 0) {
                z12 = z10;
                if (pVarF.u(z12)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            if ((458752 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    lVar2 = lVar;
                    if (pVarF.s(lVar2)) {
                    }
                    i12 |= i24;
                } else {
                    lVar2 = lVar;
                }
                i12 |= i24;
            } else {
                lVar2 = lVar;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
                dVar2 = dVar;
            } else {
                dVar2 = dVar;
                if ((i10 & 3670016) == 0) {
                    if (pVarF.s(dVar2)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
            }
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !pVarF.s(gVar)) ? 4194304 : 8388608;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (pVarF.u(z11)) {
                    i20 = 67108864;
                } else {
                    i20 = 33554432;
                }
                i12 |= i20;
            }
            if ((i11 & 512) != 0) {
                if ((i10 & 1879048192) == 0) {
                    if (pVarF.s(content)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                }
                if ((1533916891 & i12) == 306783378) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                lVarD = arrangement.r();
                            } else {
                                lVarD = arrangement.d();
                            }
                            i12 &= -458753;
                        } else {
                            lVarD = lVar2;
                        }
                        if (i17 != 0) {
                            dVarP = Arrangement.f5896a.p();
                        } else {
                            dVarP = dVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        lVar3 = lVarD;
                        dVar3 = dVarP;
                        gVar2 = gVarA;
                    } else {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                lVarD = arrangement.r();
                            } else {
                                lVarD = arrangement.d();
                            }
                            i12 &= -458753;
                        } else {
                            lVarD = lVar2;
                        }
                        if (i17 != 0) {
                            dVarP = Arrangement.f5896a.p();
                        } else {
                            dVarP = dVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        lVar3 = lVarD;
                        dVar3 = dVarP;
                        gVar2 = gVarA;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1485410512, i12, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:62)");
                    }
                    int i211111114 = i12 >> 3;
                    yh.p<s1.e, s1.b, List<Integer>> pVarM114 = m(columns, dVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i211111114 & bb.c.b.f30796me));
                    int i211111115 = 196608 | (i211111114 & 14) | (i211111114 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i211111114 & 3670016) | (i211111114 & 29360128);
                    int i211111116 = i12 << 9;
                    Arrangement.d dVar118 = dVar3;
                    m0 m0Var118 = m0Var3;
                    LazyGridKt.a(nVar2, lazyGridState3, pVarM114, m0Var3, z15, true, gVar2, z14, lVar3, dVar3, content, pVarF, i211111115 | (i211111116 & 234881024) | (i211111116 & 1879048192), (i12 >> 27) & 14, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar3 = nVar2;
                    dVar4 = dVar118;
                    m0Var4 = m0Var118;
                    lazyGridState4 = lazyGridState3;
                    z16 = z15;
                    lVar4 = lVar3;
                    gVar3 = gVar2;
                    z17 = z14;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                lVarD = arrangement.r();
                            } else {
                                lVarD = arrangement.d();
                            }
                            i12 &= -458753;
                        } else {
                            lVarD = lVar2;
                        }
                        if (i17 != 0) {
                            dVarP = Arrangement.f5896a.p();
                        } else {
                            dVarP = dVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        lVar3 = lVarD;
                        dVar3 = dVarP;
                        gVar2 = gVarA;
                    } else {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState2;
                        }
                        if (i13 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.f5896a;
                            if (z13) {
                                lVarD = arrangement.r();
                            } else {
                                lVarD = arrangement.d();
                            }
                            i12 &= -458753;
                        } else {
                            lVarD = lVar2;
                        }
                        if (i17 != 0) {
                            dVarP = Arrangement.f5896a.p();
                        } else {
                            dVarP = dVar2;
                        }
                        if ((i11 & 128) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            gVarA = gVar;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        lazyGridState3 = lazyGridStateA;
                        z15 = z13;
                        m0Var3 = m0VarA;
                        lVar3 = lVarD;
                        dVar3 = dVarP;
                        gVar2 = gVarA;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1485410512, i12, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:62)");
                    }
                    int i211111117 = i12 >> 3;
                    yh.p<s1.e, s1.b, List<Integer>> pVarM115 = m(columns, dVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i211111117 & bb.c.b.f30796me));
                    int i211111118 = 196608 | (i211111117 & 14) | (i211111117 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i211111117 & 3670016) | (i211111117 & 29360128);
                    int i211111119 = i12 << 9;
                    Arrangement.d dVar119 = dVar3;
                    m0 m0Var119 = m0Var3;
                    LazyGridKt.a(nVar2, lazyGridState3, pVarM115, m0Var3, z15, true, gVar2, z14, lVar3, dVar3, content, pVarF, i211111118 | (i211111119 & 234881024) | (i211111119 & 1879048192), (i12 >> 27) & 14, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar3 = nVar2;
                    dVar4 = dVar119;
                    m0Var4 = m0Var119;
                    lazyGridState4 = lazyGridState3;
                    z16 = z15;
                    lVar4 = lVar3;
                    gVar3 = gVar2;
                    z17 = z14;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2111111110) {
                        LazyGridDslKt.b(columns, nVar3, lazyGridState4, m0Var4, z16, lVar4, dVar4, gVar3, z17, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i21 = com.google.android.exoplayer2.j.G;
            i12 |= i21;
            if ((1533916891 & i12) == 306783378) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateA = lazyGridState2;
                    }
                    if (i13 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            lVarD = arrangement.r();
                        } else {
                            lVarD = arrangement.d();
                        }
                        i12 &= -458753;
                    } else {
                        lVarD = lVar2;
                    }
                    if (i17 != 0) {
                        dVarP = Arrangement.f5896a.p();
                    } else {
                        dVarP = dVar2;
                    }
                    if ((i11 & 128) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        gVarA = gVar;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    lazyGridState3 = lazyGridStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    lVar3 = lVarD;
                    dVar3 = dVarP;
                    gVar2 = gVarA;
                } else {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateA = lazyGridState2;
                    }
                    if (i13 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            lVarD = arrangement.r();
                        } else {
                            lVarD = arrangement.d();
                        }
                        i12 &= -458753;
                    } else {
                        lVarD = lVar2;
                    }
                    if (i17 != 0) {
                        dVarP = Arrangement.f5896a.p();
                    } else {
                        dVarP = dVar2;
                    }
                    if ((i11 & 128) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        gVarA = gVar;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    lazyGridState3 = lazyGridStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    lVar3 = lVarD;
                    dVar3 = dVarP;
                    gVar2 = gVarA;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1485410512, i12, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:62)");
                }
                int i2111111110 = i12 >> 3;
                yh.p<s1.e, s1.b, List<Integer>> pVarM116 = m(columns, dVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i2111111110 & bb.c.b.f30796me));
                int i2111111111 = 196608 | (i2111111110 & 14) | (i2111111110 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i2111111110 & 3670016) | (i2111111110 & 29360128);
                int i2111111112 = i12 << 9;
                Arrangement.d dVar1110 = dVar3;
                m0 m0Var1110 = m0Var3;
                LazyGridKt.a(nVar2, lazyGridState3, pVarM116, m0Var3, z15, true, gVar2, z14, lVar3, dVar3, content, pVarF, i2111111111 | (i2111111112 & 234881024) | (i2111111112 & 1879048192), (i12 >> 27) & 14, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar3 = nVar2;
                dVar4 = dVar1110;
                m0Var4 = m0Var1110;
                lazyGridState4 = lazyGridState3;
                z16 = z15;
                lVar4 = lVar3;
                gVar3 = gVar2;
                z17 = z14;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateA = lazyGridState2;
                    }
                    if (i13 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            lVarD = arrangement.r();
                        } else {
                            lVarD = arrangement.d();
                        }
                        i12 &= -458753;
                    } else {
                        lVarD = lVar2;
                    }
                    if (i17 != 0) {
                        dVarP = Arrangement.f5896a.p();
                    } else {
                        dVarP = dVar2;
                    }
                    if ((i11 & 128) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        gVarA = gVar;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    lazyGridState3 = lazyGridStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    lVar3 = lVarD;
                    dVar3 = dVarP;
                    gVar2 = gVarA;
                } else {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateA = lazyGridState2;
                    }
                    if (i13 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            lVarD = arrangement.r();
                        } else {
                            lVarD = arrangement.d();
                        }
                        i12 &= -458753;
                    } else {
                        lVarD = lVar2;
                    }
                    if (i17 != 0) {
                        dVarP = Arrangement.f5896a.p();
                    } else {
                        dVarP = dVar2;
                    }
                    if ((i11 & 128) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        gVarA = gVar;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    lazyGridState3 = lazyGridStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    lVar3 = lVarD;
                    dVar3 = dVarP;
                    gVar2 = gVarA;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1485410512, i12, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:62)");
                }
                int i2111111113 = i12 >> 3;
                yh.p<s1.e, s1.b, List<Integer>> pVarM117 = m(columns, dVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i2111111113 & bb.c.b.f30796me));
                int i2111111114 = 196608 | (i2111111113 & 14) | (i2111111113 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i2111111113 & 3670016) | (i2111111113 & 29360128);
                int i2111111115 = i12 << 9;
                Arrangement.d dVar1111 = dVar3;
                m0 m0Var1111 = m0Var3;
                LazyGridKt.a(nVar2, lazyGridState3, pVarM117, m0Var3, z15, true, gVar2, z14, lVar3, dVar3, content, pVarF, i2111111114 | (i2111111115 & 234881024) | (i2111111115 & 1879048192), (i12 >> 27) & 14, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar3 = nVar2;
                dVar4 = dVar1111;
                m0Var4 = m0Var1111;
                lazyGridState4 = lazyGridState3;
                z16 = z15;
                lVar4 = lVar3;
                gVar3 = gVar2;
                z17 = z14;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2111111116) {
                    LazyGridDslKt.b(columns, nVar3, lazyGridState4, m0Var4, z16, lVar4, dVar4, gVar3, z17, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= 24576;
        z12 = z10;
        if ((458752 & i10) == 0) {
            if ((i11 & 32) == 0) {
                lVar2 = lVar;
                if (pVarF.s(lVar2)) {
                }
                i12 |= i24;
            } else {
                lVar2 = lVar;
            }
            i12 |= i24;
        } else {
            lVar2 = lVar;
        }
        i17 = i11 & 64;
        if (i17 != 0) {
            i12 |= 1572864;
            dVar2 = dVar;
        } else {
            dVar2 = dVar;
            if ((i10 & 3670016) == 0) {
                if (pVarF.s(dVar2)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
        }
        if ((i10 & 29360128) != 0) {
            i12 |= ((i11 & 128) == 0 || !pVarF.s(gVar)) ? 4194304 : 8388608;
        }
        i19 = i11 & 256;
        if (i19 != 0) {
            i12 |= 100663296;
        } else if ((i10 & 234881024) == 0) {
            if (pVarF.u(z11)) {
                i20 = 67108864;
            } else {
                i20 = 33554432;
            }
            i12 |= i20;
        }
        if ((i11 & 512) != 0) {
            if ((i10 & 1879048192) == 0) {
                if (pVarF.s(content)) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
            }
            if ((1533916891 & i12) == 306783378) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateA = lazyGridState2;
                    }
                    if (i13 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            lVarD = arrangement.r();
                        } else {
                            lVarD = arrangement.d();
                        }
                        i12 &= -458753;
                    } else {
                        lVarD = lVar2;
                    }
                    if (i17 != 0) {
                        dVarP = Arrangement.f5896a.p();
                    } else {
                        dVarP = dVar2;
                    }
                    if ((i11 & 128) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        gVarA = gVar;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    lazyGridState3 = lazyGridStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    lVar3 = lVarD;
                    dVar3 = dVarP;
                    gVar2 = gVarA;
                } else {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateA = lazyGridState2;
                    }
                    if (i13 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            lVarD = arrangement.r();
                        } else {
                            lVarD = arrangement.d();
                        }
                        i12 &= -458753;
                    } else {
                        lVarD = lVar2;
                    }
                    if (i17 != 0) {
                        dVarP = Arrangement.f5896a.p();
                    } else {
                        dVarP = dVar2;
                    }
                    if ((i11 & 128) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        gVarA = gVar;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    lazyGridState3 = lazyGridStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    lVar3 = lVarD;
                    dVar3 = dVarP;
                    gVar2 = gVarA;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1485410512, i12, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:62)");
                }
                int i2111111116 = i12 >> 3;
                yh.p<s1.e, s1.b, List<Integer>> pVarM118 = m(columns, dVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i2111111116 & bb.c.b.f30796me));
                int i2111111117 = 196608 | (i2111111116 & 14) | (i2111111116 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i2111111116 & 3670016) | (i2111111116 & 29360128);
                int i2111111118 = i12 << 9;
                Arrangement.d dVar1112 = dVar3;
                m0 m0Var1112 = m0Var3;
                LazyGridKt.a(nVar2, lazyGridState3, pVarM118, m0Var3, z15, true, gVar2, z14, lVar3, dVar3, content, pVarF, i2111111117 | (i2111111118 & 234881024) | (i2111111118 & 1879048192), (i12 >> 27) & 14, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar3 = nVar2;
                dVar4 = dVar1112;
                m0Var4 = m0Var1112;
                lazyGridState4 = lazyGridState3;
                z16 = z15;
                lVar4 = lVar3;
                gVar3 = gVar2;
                z17 = z14;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateA = lazyGridState2;
                    }
                    if (i13 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            lVarD = arrangement.r();
                        } else {
                            lVarD = arrangement.d();
                        }
                        i12 &= -458753;
                    } else {
                        lVarD = lVar2;
                    }
                    if (i17 != 0) {
                        dVarP = Arrangement.f5896a.p();
                    } else {
                        dVarP = dVar2;
                    }
                    if ((i11 & 128) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        gVarA = gVar;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    lazyGridState3 = lazyGridStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    lVar3 = lVarD;
                    dVar3 = dVarP;
                    gVar2 = gVarA;
                } else {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateA = lazyGridState2;
                    }
                    if (i13 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.f5896a;
                        if (z13) {
                            lVarD = arrangement.r();
                        } else {
                            lVarD = arrangement.d();
                        }
                        i12 &= -458753;
                    } else {
                        lVarD = lVar2;
                    }
                    if (i17 != 0) {
                        dVarP = Arrangement.f5896a.p();
                    } else {
                        dVarP = dVar2;
                    }
                    if ((i11 & 128) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        gVarA = gVar;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    lazyGridState3 = lazyGridStateA;
                    z15 = z13;
                    m0Var3 = m0VarA;
                    lVar3 = lVarD;
                    dVar3 = dVarP;
                    gVar2 = gVarA;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1485410512, i12, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:62)");
                }
                int i2111111119 = i12 >> 3;
                yh.p<s1.e, s1.b, List<Integer>> pVarM119 = m(columns, dVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i2111111119 & bb.c.b.f30796me));
                int i21111111110 = 196608 | (i2111111119 & 14) | (i2111111119 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i2111111119 & 3670016) | (i2111111119 & 29360128);
                int i21111111111 = i12 << 9;
                Arrangement.d dVar1113 = dVar3;
                m0 m0Var1113 = m0Var3;
                LazyGridKt.a(nVar2, lazyGridState3, pVarM119, m0Var3, z15, true, gVar2, z14, lVar3, dVar3, content, pVarF, i21111111110 | (i21111111111 & 234881024) | (i21111111111 & 1879048192), (i12 >> 27) & 14, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar3 = nVar2;
                dVar4 = dVar1113;
                m0Var4 = m0Var1113;
                lazyGridState4 = lazyGridState3;
                z16 = z15;
                lVar4 = lVar3;
                gVar3 = gVar2;
                z17 = z14;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21111111112) {
                    LazyGridDslKt.b(columns, nVar3, lazyGridState4, m0Var4, z16, lVar4, dVar4, gVar3, z17, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i21 = com.google.android.exoplayer2.j.G;
        i12 |= i21;
        if ((1533916891 & i12) == 306783378) {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i22 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if ((i11 & 4) != 0) {
                    lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                    i12 &= -897;
                } else {
                    lazyGridStateA = lazyGridState2;
                }
                if (i13 != 0) {
                    m0VarA = PaddingKt.a(s1.h.g(0));
                } else {
                    m0VarA = m0Var2;
                }
                if (i15 == 0) {
                }
                if ((i11 & 32) != 0) {
                    arrangement = Arrangement.f5896a;
                    if (z13) {
                        lVarD = arrangement.r();
                    } else {
                        lVarD = arrangement.d();
                    }
                    i12 &= -458753;
                } else {
                    lVarD = lVar2;
                }
                if (i17 != 0) {
                    dVarP = Arrangement.f5896a.p();
                } else {
                    dVarP = dVar2;
                }
                if ((i11 & 128) != 0) {
                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    i12 &= -29360129;
                } else {
                    gVarA = gVar;
                }
                if (i19 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                lazyGridState3 = lazyGridStateA;
                z15 = z13;
                m0Var3 = m0VarA;
                lVar3 = lVarD;
                dVar3 = dVarP;
                gVar2 = gVarA;
            } else {
                if (i22 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if ((i11 & 4) != 0) {
                    lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                    i12 &= -897;
                } else {
                    lazyGridStateA = lazyGridState2;
                }
                if (i13 != 0) {
                    m0VarA = PaddingKt.a(s1.h.g(0));
                } else {
                    m0VarA = m0Var2;
                }
                if (i15 == 0) {
                }
                if ((i11 & 32) != 0) {
                    arrangement = Arrangement.f5896a;
                    if (z13) {
                        lVarD = arrangement.r();
                    } else {
                        lVarD = arrangement.d();
                    }
                    i12 &= -458753;
                } else {
                    lVarD = lVar2;
                }
                if (i17 != 0) {
                    dVarP = Arrangement.f5896a.p();
                } else {
                    dVarP = dVar2;
                }
                if ((i11 & 128) != 0) {
                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    i12 &= -29360129;
                } else {
                    gVarA = gVar;
                }
                if (i19 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                lazyGridState3 = lazyGridStateA;
                z15 = z13;
                m0Var3 = m0VarA;
                lVar3 = lVarD;
                dVar3 = dVarP;
                gVar2 = gVarA;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(1485410512, i12, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:62)");
            }
            int i21111111112 = i12 >> 3;
            yh.p<s1.e, s1.b, List<Integer>> pVarM1110 = m(columns, dVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i21111111112 & bb.c.b.f30796me));
            int i21111111113 = 196608 | (i21111111112 & 14) | (i21111111112 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i21111111112 & 3670016) | (i21111111112 & 29360128);
            int i21111111114 = i12 << 9;
            Arrangement.d dVar1114 = dVar3;
            m0 m0Var1114 = m0Var3;
            LazyGridKt.a(nVar2, lazyGridState3, pVarM1110, m0Var3, z15, true, gVar2, z14, lVar3, dVar3, content, pVarF, i21111111113 | (i21111111114 & 234881024) | (i21111111114 & 1879048192), (i12 >> 27) & 14, 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar3 = nVar2;
            dVar4 = dVar1114;
            m0Var4 = m0Var1114;
            lazyGridState4 = lazyGridState3;
            z16 = z15;
            lVar4 = lVar3;
            gVar3 = gVar2;
            z17 = z14;
        } else {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i22 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if ((i11 & 4) != 0) {
                    lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                    i12 &= -897;
                } else {
                    lazyGridStateA = lazyGridState2;
                }
                if (i13 != 0) {
                    m0VarA = PaddingKt.a(s1.h.g(0));
                } else {
                    m0VarA = m0Var2;
                }
                if (i15 == 0) {
                }
                if ((i11 & 32) != 0) {
                    arrangement = Arrangement.f5896a;
                    if (z13) {
                        lVarD = arrangement.r();
                    } else {
                        lVarD = arrangement.d();
                    }
                    i12 &= -458753;
                } else {
                    lVarD = lVar2;
                }
                if (i17 != 0) {
                    dVarP = Arrangement.f5896a.p();
                } else {
                    dVarP = dVar2;
                }
                if ((i11 & 128) != 0) {
                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    i12 &= -29360129;
                } else {
                    gVarA = gVar;
                }
                if (i19 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                lazyGridState3 = lazyGridStateA;
                z15 = z13;
                m0Var3 = m0VarA;
                lVar3 = lVarD;
                dVar3 = dVarP;
                gVar2 = gVarA;
            } else {
                if (i22 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if ((i11 & 4) != 0) {
                    lazyGridStateA = LazyGridStateKt.a(0, 0, pVarF, 0, 3);
                    i12 &= -897;
                } else {
                    lazyGridStateA = lazyGridState2;
                }
                if (i13 != 0) {
                    m0VarA = PaddingKt.a(s1.h.g(0));
                } else {
                    m0VarA = m0Var2;
                }
                if (i15 == 0) {
                }
                if ((i11 & 32) != 0) {
                    arrangement = Arrangement.f5896a;
                    if (z13) {
                        lVarD = arrangement.r();
                    } else {
                        lVarD = arrangement.d();
                    }
                    i12 &= -458753;
                } else {
                    lVarD = lVar2;
                }
                if (i17 != 0) {
                    dVarP = Arrangement.f5896a.p();
                } else {
                    dVarP = dVar2;
                }
                if ((i11 & 128) != 0) {
                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    i12 &= -29360129;
                } else {
                    gVarA = gVar;
                }
                if (i19 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                lazyGridState3 = lazyGridStateA;
                z15 = z13;
                m0Var3 = m0VarA;
                lVar3 = lVarD;
                dVar3 = dVarP;
                gVar2 = gVarA;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(1485410512, i12, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:62)");
            }
            int i21111111115 = i12 >> 3;
            yh.p<s1.e, s1.b, List<Integer>> pVarM1111 = m(columns, dVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 15) & 112) | (i21111111115 & bb.c.b.f30796me));
            int i21111111116 = 196608 | (i21111111115 & 14) | (i21111111115 & 112) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i21111111115 & 3670016) | (i21111111115 & 29360128);
            int i21111111117 = i12 << 9;
            Arrangement.d dVar1115 = dVar3;
            m0 m0Var1115 = m0Var3;
            LazyGridKt.a(nVar2, lazyGridState3, pVarM1111, m0Var3, z15, true, gVar2, z14, lVar3, dVar3, content, pVarF, i21111111116 | (i21111111117 & 234881024) | (i21111111117 & 1879048192), (i12 >> 27) & 14, 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar3 = nVar2;
            dVar4 = dVar1115;
            m0Var4 = m0Var1115;
            lazyGridState4 = lazyGridState3;
            z16 = z15;
            lVar4 = lVar3;
            gVar3 = gVar2;
            z17 = z14;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21111111118) {
                LazyGridDslKt.b(columns, nVar3, lazyGridState4, m0Var4, z16, lVar4, dVar4, gVar3, z17, content, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> d(int i10, int i11, int i12) {
        int i13 = i10 - (i12 * (i11 - 1));
        int i14 = i13 / i11;
        int i15 = i13 % i11;
        ArrayList arrayList = new ArrayList(i11);
        int i16 = 0;
        while (i16 < i11) {
            arrayList.add(Integer.valueOf((i16 < i15 ? 1 : 0) + i14));
            i16++;
        }
        return arrayList;
    }

    @androidx.compose.runtime.i(scheme = "[0[0]]")
    public static final <T> void e(@dl.d s sVar, @dl.d List<? extends T> items, @dl.e yh.l<? super T, ? extends Object> lVar, @dl.e yh.p<? super m, ? super T, d> pVar, @dl.d yh.l<? super T, ? extends Object> contentType, @dl.d yh.r<? super l, ? super T, ? super androidx.compose.runtime.p, ? super Integer, b2> itemContent) {
        f0.p(sVar, "<this>");
        f0.p(items, "items");
        f0.p(contentType, "contentType");
        f0.p(itemContent, "itemContent");
        sVar.a(items.size(), lVar != null ? new LazyGridDslKt$items$2(lVar, items) : null, pVar != null ? new LazyGridDslKt$items$3(pVar, items) : null, new LazyGridDslKt$items$4(contentType, items), androidx.compose.runtime.internal.b.c(699646206, true, new LazyGridDslKt$items$5(itemContent, items)));
    }

    @androidx.compose.runtime.i(scheme = "[0[0]]")
    public static final <T> void f(@dl.d s sVar, @dl.d T[] items, @dl.e yh.l<? super T, ? extends Object> lVar, @dl.e yh.p<? super m, ? super T, d> pVar, @dl.d yh.l<? super T, ? extends Object> contentType, @dl.d yh.r<? super l, ? super T, ? super androidx.compose.runtime.p, ? super Integer, b2> itemContent) {
        f0.p(sVar, "<this>");
        f0.p(items, "items");
        f0.p(contentType, "contentType");
        f0.p(itemContent, "itemContent");
        sVar.a(items.length, lVar != null ? new LazyGridDslKt$items$7(lVar, items) : null, pVar != null ? new LazyGridDslKt$items$8(pVar, items) : null, new LazyGridDslKt$items$9(contentType, items), androidx.compose.runtime.internal.b.c(407562193, true, new LazyGridDslKt$items$10(itemContent, items)));
    }

    public static /* synthetic */ void g(s sVar, List items, yh.l lVar, yh.p pVar, yh.l contentType, yh.r itemContent, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        if ((i10 & 4) != 0) {
            pVar = null;
        }
        if ((i10 & 8) != 0) {
            contentType = new yh.l() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$1
                @Override // yh.l
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Void invoke(Object obj2) {
                    return null;
                }
            };
        }
        f0.p(sVar, "<this>");
        f0.p(items, "items");
        f0.p(contentType, "contentType");
        f0.p(itemContent, "itemContent");
        sVar.a(items.size(), lVar != null ? new LazyGridDslKt$items$2(lVar, items) : null, pVar != null ? new LazyGridDslKt$items$3(pVar, items) : null, new LazyGridDslKt$items$4(contentType, items), androidx.compose.runtime.internal.b.c(699646206, true, new LazyGridDslKt$items$5(itemContent, items)));
    }

    public static /* synthetic */ void h(s sVar, Object[] items, yh.l lVar, yh.p pVar, yh.l contentType, yh.r itemContent, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        if ((i10 & 4) != 0) {
            pVar = null;
        }
        if ((i10 & 8) != 0) {
            contentType = new yh.l() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$6
                @Override // yh.l
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Void invoke(Object obj2) {
                    return null;
                }
            };
        }
        f0.p(sVar, "<this>");
        f0.p(items, "items");
        f0.p(contentType, "contentType");
        f0.p(itemContent, "itemContent");
        sVar.a(items.length, lVar != null ? new LazyGridDslKt$items$7(lVar, items) : null, pVar != null ? new LazyGridDslKt$items$8(pVar, items) : null, new LazyGridDslKt$items$9(contentType, items), androidx.compose.runtime.internal.b.c(407562193, true, new LazyGridDslKt$items$10(itemContent, items)));
    }

    @androidx.compose.runtime.i(scheme = "[0[0]]")
    public static final <T> void i(@dl.d s sVar, @dl.d List<? extends T> items, @dl.e yh.p<? super Integer, ? super T, ? extends Object> pVar, @dl.e yh.q<? super m, ? super Integer, ? super T, d> qVar, @dl.d yh.p<? super Integer, ? super T, ? extends Object> contentType, @dl.d yh.s<? super l, ? super Integer, ? super T, ? super androidx.compose.runtime.p, ? super Integer, b2> itemContent) {
        f0.p(sVar, "<this>");
        f0.p(items, "items");
        f0.p(contentType, "contentType");
        f0.p(itemContent, "itemContent");
        sVar.a(items.size(), pVar != null ? new LazyGridDslKt$itemsIndexed$2(pVar, items) : null, qVar != null ? new LazyGridDslKt$itemsIndexed$3(qVar, items) : null, new LazyGridDslKt$itemsIndexed$4(contentType, items), androidx.compose.runtime.internal.b.c(1229287273, true, new LazyGridDslKt$itemsIndexed$5(itemContent, items)));
    }

    @androidx.compose.runtime.i(scheme = "[0[0]]")
    public static final <T> void j(@dl.d s sVar, @dl.d T[] items, @dl.e yh.p<? super Integer, ? super T, ? extends Object> pVar, @dl.e yh.q<? super m, ? super Integer, ? super T, d> qVar, @dl.d yh.p<? super Integer, ? super T, ? extends Object> contentType, @dl.d yh.s<? super l, ? super Integer, ? super T, ? super androidx.compose.runtime.p, ? super Integer, b2> itemContent) {
        f0.p(sVar, "<this>");
        f0.p(items, "items");
        f0.p(contentType, "contentType");
        f0.p(itemContent, "itemContent");
        sVar.a(items.length, pVar != null ? new LazyGridDslKt$itemsIndexed$7(pVar, items) : null, qVar != null ? new LazyGridDslKt$itemsIndexed$8(qVar, items) : null, new LazyGridDslKt$itemsIndexed$9(contentType, items), androidx.compose.runtime.internal.b.c(-911455938, true, new LazyGridDslKt$itemsIndexed$10(itemContent, items)));
    }

    public static /* synthetic */ void k(s sVar, List items, yh.p pVar, yh.q qVar, yh.p contentType, yh.s itemContent, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            pVar = null;
        }
        if ((i10 & 4) != 0) {
            qVar = null;
        }
        if ((i10 & 8) != 0) {
            contentType = new yh.p() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$1
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
        f0.p(sVar, "<this>");
        f0.p(items, "items");
        f0.p(contentType, "contentType");
        f0.p(itemContent, "itemContent");
        sVar.a(items.size(), pVar != null ? new LazyGridDslKt$itemsIndexed$2(pVar, items) : null, qVar != null ? new LazyGridDslKt$itemsIndexed$3(qVar, items) : null, new LazyGridDslKt$itemsIndexed$4(contentType, items), androidx.compose.runtime.internal.b.c(1229287273, true, new LazyGridDslKt$itemsIndexed$5(itemContent, items)));
    }

    public static /* synthetic */ void l(s sVar, Object[] items, yh.p pVar, yh.q qVar, yh.p contentType, yh.s itemContent, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            pVar = null;
        }
        if ((i10 & 4) != 0) {
            qVar = null;
        }
        if ((i10 & 8) != 0) {
            contentType = new yh.p() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$6
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
        f0.p(sVar, "<this>");
        f0.p(items, "items");
        f0.p(contentType, "contentType");
        f0.p(itemContent, "itemContent");
        sVar.a(items.length, pVar != null ? new LazyGridDslKt$itemsIndexed$7(pVar, items) : null, qVar != null ? new LazyGridDslKt$itemsIndexed$8(qVar, items) : null, new LazyGridDslKt$itemsIndexed$9(contentType, items), androidx.compose.runtime.internal.b.c(-911455938, true, new LazyGridDslKt$itemsIndexed$10(itemContent, items)));
    }

    @androidx.compose.runtime.h
    private static final yh.p<s1.e, s1.b, List<Integer>> m(final c cVar, final Arrangement.d dVar, final m0 m0Var, androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-1355301804);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1355301804, i10, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:148)");
        }
        pVar.T(1618982084);
        boolean zS = pVar.s(cVar) | pVar.s(dVar) | pVar.s(m0Var);
        Object objU = pVar.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = new yh.p<s1.e, s1.b, List<Integer>>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$rememberColumnWidthSums$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @dl.d
                public final List<Integer> a(@dl.d s1.e eVar, long j10) {
                    f0.p(eVar, "$this$null");
                    if (!(s1.b.p(j10) != Integer.MAX_VALUE)) {
                        throw new IllegalArgumentException("LazyVerticalGrid's width should be bound by parent.".toString());
                    }
                    m0 m0Var2 = m0Var;
                    LayoutDirection layoutDirection = LayoutDirection.Ltr;
                    List<Integer> listT5 = CollectionsKt___CollectionsKt.T5(cVar.a(eVar, s1.b.p(j10) - eVar.e1(s1.h.g(PaddingKt.i(m0Var2, layoutDirection) + PaddingKt.h(m0Var, layoutDirection))), eVar.e1(dVar.getSpacing())));
                    int size = listT5.size();
                    for (int i11 = 1; i11 < size; i11++) {
                        listT5.set(i11, Integer.valueOf(listT5.get(i11).intValue() + listT5.get(i11 - 1).intValue()));
                    }
                    return listT5;
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ List<Integer> invoke(s1.e eVar, s1.b bVar) {
                    return a(eVar, bVar.getF139216a());
                }
            };
            pVar.N(objU);
        }
        pVar.c0();
        yh.p<s1.e, s1.b, List<Integer>> pVar2 = (yh.p) objU;
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return pVar2;
    }

    @androidx.compose.runtime.h
    private static final yh.p<s1.e, s1.b, List<Integer>> n(final c cVar, final Arrangement.l lVar, final m0 m0Var, androidx.compose.runtime.p pVar, int i10) {
        pVar.T(239683573);
        if (ComposerKt.g0()) {
            ComposerKt.w0(239683573, i10, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:180)");
        }
        pVar.T(1618982084);
        boolean zS = pVar.s(cVar) | pVar.s(lVar) | pVar.s(m0Var);
        Object objU = pVar.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = new yh.p<s1.e, s1.b, List<Integer>>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$rememberRowHeightSums$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @dl.d
                public final List<Integer> a(@dl.d s1.e eVar, long j10) {
                    f0.p(eVar, "$this$null");
                    if (!(s1.b.o(j10) != Integer.MAX_VALUE)) {
                        throw new IllegalArgumentException("LazyHorizontalGrid's height should be bound by parent.".toString());
                    }
                    List<Integer> listT5 = CollectionsKt___CollectionsKt.T5(cVar.a(eVar, s1.b.o(j10) - eVar.e1(s1.h.g(m0Var.getTop() + m0Var.getBottom())), eVar.e1(lVar.a())));
                    int size = listT5.size();
                    for (int i11 = 1; i11 < size; i11++) {
                        listT5.set(i11, Integer.valueOf(listT5.get(i11).intValue() + listT5.get(i11 - 1).intValue()));
                    }
                    return listT5;
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ List<Integer> invoke(s1.e eVar, s1.b bVar) {
                    return a(eVar, bVar.getF139216a());
                }
            };
            pVar.N(objU);
        }
        pVar.c0();
        yh.p<s1.e, s1.b, List<Integer>> pVar2 = (yh.p) objU;
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return pVar2;
    }
}
