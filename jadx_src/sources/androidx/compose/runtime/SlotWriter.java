package androidx.compose.runtime;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.max.xiaoheihe.module.mall.MallPurchaseDetailDialogFragment;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: renamed from: androidx.compose.runtime.a2, reason: from toString */
/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0000\u0018\u0000 Í\u00012\u00020\u0001:\u0002\u008c\u0001B\u0011\u0012\u0006\u0010\u007f\u001a\u00020~¢\u0006\u0006\bË\u0001\u0010Ì\u0001J,\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\bH\u0002J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u0013\u001a\u00020\bH\u0002J\b\u0010\u0014\u001a\u00020\u0002H\u0002J \u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0002J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\u0018\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0002H\u0002J\u0018\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0018\u0010!\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0002H\u0002J \u0010\"\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u001a\u0010$\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u0002J\u0018\u0010'\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0002H\u0002J\u0018\u0010)\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H\u0002J \u0010,\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H\u0002J\u0018\u0010/\u001a\u00020\b*\u00060-j\u0002`.2\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\u0010\u00100\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\u0010\u00102\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u0002H\u0002J\u0014\u00104\u001a\u00020\u0002*\u0002032\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\u0010\u00105\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\u0014\u00107\u001a\u00020\u0002*\u0002032\u0006\u00106\u001a\u00020\u0002H\u0002J\u0014\u00108\u001a\u00020\u0002*\u0002032\u0006\u00106\u001a\u00020\u0002H\u0002J\u001c\u00109\u001a\u00020\b*\u0002032\u0006\u00106\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u0002H\u0002J\u0014\u0010:\u001a\u00020\u0002*\u0002032\u0006\u00106\u001a\u00020\u0002H\u0002J\u0014\u0010;\u001a\u00020\u0002*\u0002032\u0006\u00106\u001a\u00020\u0002H\u0002J\u0012\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00020<*\u000203H\u0002J\u000e\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00020<H\u0002J(\u0010A\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\u00022\u0006\u0010@\u001a\u00020\u0002H\u0002J \u0010C\u001a\u00020\u00022\u0006\u0010B\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\u00022\u0006\u0010@\u001a\u00020\u0002H\u0002J\u0018\u0010D\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0002H\u0002J\u0010\u0010E\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\u000e\u0010F\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0002J\u000e\u0010G\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002J\u000e\u0010H\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002J\u0010\u0010I\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0019\u001a\u00020\u0002J\u000e\u0010J\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002J\u0010\u0010K\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0019\u001a\u00020\u0002J\u000e\u0010L\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0002J\u000e\u0010M\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0002J\u0016\u0010N\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002J\u0010\u0010O\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0019\u001a\u00020\u0002J\u0010\u0010Q\u001a\u0004\u0018\u00010\u00012\u0006\u0010B\u001a\u00020PJ\u000e\u0010R\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002J\u000e\u0010S\u001a\u00020\u00022\u0006\u0010B\u001a\u00020PJ\u0006\u0010T\u001a\u00020\bJ\u0006\u0010U\u001a\u00020\bJ\u0012\u0010V\u001a\u0004\u0018\u00010\u00012\b\u0010#\u001a\u0004\u0018\u00010\u0001J\u0010\u0010W\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\u0001J\u0010\u0010X\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\u0001J\u0010\u0010Y\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\u0001J\u0018\u0010Z\u001a\u00020\b2\u0006\u0010B\u001a\u00020P2\b\u0010#\u001a\u0004\u0018\u00010\u0001J\u0010\u0010[\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\\\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\u0001J\u001a\u0010]\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u0001J\b\u0010^\u001a\u0004\u0018\u00010\u0001J\u0018\u0010_\u001a\u0004\u0018\u00010\u00012\u0006\u0010B\u001a\u00020P2\u0006\u0010\u0019\u001a\u00020\u0002J\u0018\u0010a\u001a\u0004\u0018\u00010\u00012\u0006\u0010`\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002J\u000e\u0010c\u001a\u00020\b2\u0006\u0010b\u001a\u00020\u0002J\u000e\u0010d\u001a\u00020\b2\u0006\u0010B\u001a\u00020PJ\u0006\u0010e\u001a\u00020\bJ\u0006\u0010f\u001a\u00020\bJ\u0006\u0010g\u001a\u00020\bJ\u0006\u0010h\u001a\u00020\bJ\u000e\u0010i\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010k\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010j\u001a\u0004\u0018\u00010\u0001J\u0010\u0010l\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001J\u001a\u0010n\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010m\u001a\u0004\u0018\u00010\u0001J\"\u0010o\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001J\u0018\u0010p\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001J\u0006\u0010q\u001a\u00020\u0002J\u000f\u0010r\u001a\u00020\bH\u0000¢\u0006\u0004\br\u0010sJ\u000e\u0010t\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0002J\u000e\u0010u\u001a\u00020\b2\u0006\u0010B\u001a\u00020PJ\u0006\u0010v\u001a\u00020\u0002J\u0006\u0010w\u001a\u00020\u0005J\u000e\u0010y\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010xJ\u000e\u0010{\u001a\u00020\b2\u0006\u0010z\u001a\u00020\u0002J$\u0010}\u001a\b\u0012\u0004\u0012\u00020P0<2\u0006\u0010B\u001a\u00020P2\u0006\u0010z\u001a\u00020\u00022\u0006\u0010|\u001a\u00020\u0000J\u001d\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020P0<2\u0006\u0010\u007f\u001a\u00020~2\u0006\u0010\u0019\u001a\u00020\u0002J\u000f\u0010\u0081\u0001\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u0010\u0082\u0001\u001a\u00020\b2\u0006\u00106\u001a\u00020\u00022\u0006\u0010b\u001a\u00020\u0002J%\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020P0<2\u0006\u0010z\u001a\u00020\u00022\u0006\u0010\u007f\u001a\u00020~2\u0006\u0010\u0019\u001a\u00020\u0002J\u0011\u0010\u0084\u0001\u001a\u00020P2\b\b\u0002\u0010\u0019\u001a\u00020\u0002J\u0011\u0010\u0085\u0001\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0002J\u000f\u0010\u0086\u0001\u001a\u00020\u00022\u0006\u0010B\u001a\u00020PJ\n\u0010\u0088\u0001\u001a\u00030\u0087\u0001H\u0016J\b\u0010\u0089\u0001\u001a\u00030\u0087\u0001J\u0011\u0010\u008a\u0001\u001a\u00020\bH\u0000¢\u0006\u0005\b\u008a\u0001\u0010sJ\u0011\u0010\u008b\u0001\u001a\u00020\bH\u0000¢\u0006\u0005\b\u008b\u0001\u0010sR\u001e\u0010\u007f\u001a\u00020~8\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0019\u0010\u0092\u0001\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\"\u0010\u0096\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0093\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R+\u0010\u009b\u0001\u001a\u0014\u0012\u0004\u0012\u00020P0\u0097\u0001j\t\u0012\u0004\u0012\u00020P`\u0098\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0018\u0010\u009d\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009c\u0001\u0010TR\u0018\u0010\u009f\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009e\u0001\u0010TR\u0018\u0010¡\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b \u0001\u0010TR\u0018\u0010£\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¢\u0001\u0010TR\u0018\u0010¥\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¤\u0001\u0010TR\u0018\u0010§\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¦\u0001\u0010TR\u0018\u0010©\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¨\u0001\u0010TR\u0018\u0010«\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bª\u0001\u0010TR\u0018\u0010\u00ad\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¬\u0001\u0010TR\u0018\u0010¯\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b®\u0001\u0010TR\u0018\u0010³\u0001\u001a\u00030°\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u0018\u0010µ\u0001\u001a\u00030°\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0001\u0010²\u0001R\u0018\u0010·\u0001\u001a\u00030°\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010²\u0001R)\u0010¼\u0001\u001a\u00020\u00022\u0007\u0010¸\u0001\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b¹\u0001\u0010T\u001a\u0006\bº\u0001\u0010»\u0001R(\u0010\u0015\u001a\u00020\u00022\u0007\u0010¸\u0001\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b½\u0001\u0010T\u001a\u0006\b¾\u0001\u0010»\u0001R*\u0010Â\u0001\u001a\u00020\u00052\u0007\u0010¸\u0001\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b¿\u0001\u0010¾\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001R\u001b\u0010Å\u0001\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0001\u0010Ä\u0001R\u0016\u0010@\u001a\u00020\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\bÆ\u0001\u0010»\u0001R\u0014\u0010È\u0001\u001a\u00020\u00058F¢\u0006\b\u001a\u0006\bÇ\u0001\u0010Á\u0001R\u0013\u0010\u0006\u001a\u00020\u00058F¢\u0006\b\u001a\u0006\bÉ\u0001\u0010Á\u0001R\u0016\u0010\u001c\u001a\u00020\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bÊ\u0001\u0010»\u0001¨\u0006Î\u0001"}, d2 = {"Landroidx/compose/runtime/a2;", "", "", "key", "objectKey", "", "isNode", "aux", "Lkotlin/b2;", "k1", MallPurchaseDetailDialogFragment.f89681y1, "K", "J", "O0", "q1", "Landroidx/compose/runtime/g1;", "set", "r1", "H", "V0", "U0", "parent", "endGroup", "firstChild", androidx.exifinterface.media.a.X4, UCropPlusActivity.ARG_INDEX, "B0", "D0", UiKitSpanObj.TYPE_SIZE, "p0", "r0", com.google.android.exoplayer2.text.ttml.d.f49798o0, "len", "R0", "S0", "value", com.alipay.sdk.m.x.c.f39529d, "previousGapStart", "newGapStart", "o1", "gapStart", "P0", "originalLocation", "newLocation", "y0", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "c0", "f0", "dataIndex", "O", "", "L0", "M", "address", "N", "e1", "s1", "I0", androidx.exifinterface.media.a.S4, "", "Q", "v0", "gapLen", "capacity", "P", "anchor", "L", "N0", "M0", "u0", "H0", "g0", "h0", "i0", "e0", "n0", "l0", "m0", "F0", "Landroidx/compose/runtime/c;", "G0", "J0", "K0", "I", "T0", "n1", "p1", "o0", "u1", "t1", "w1", "Y0", "X0", "Z0", "d1", "groupIndex", "c1", "amount", androidx.exifinterface.media.a.W4, "W0", "b1", "G", androidx.exifinterface.media.a.R4, "h1", "i1", "dataKey", "j1", "l1", "node", "m1", "g1", "f1", "R", "F", "()V", androidx.exifinterface.media.a.f23244d5, "U", "a1", "Q0", "", "j0", androidx.constraintlayout.core.motion.utils.w.c.R, "A0", "writer", "E0", "Landroidx/compose/runtime/x1;", "table", "z0", "q0", ak.aD, "C0", "B", "w0", "D", "", "toString", "k0", "x1", "y1", ak.av, "Landroidx/compose/runtime/x1;", "b0", "()Landroidx/compose/runtime/x1;", "b", "[I", "groups", "", ak.aF, "[Ljava/lang/Object;", "slots", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "d", "Ljava/util/ArrayList;", "anchors", "e", "groupGapStart", "f", "groupGapLen", "g", "currentGroupEnd", RXScreenCaptureService.KEY_HEIGHT, "currentSlot", "i", "currentSlotEnd", "j", "slotsGapStart", "k", "slotsGapLen", "l", "slotsGapOwner", "m", "insertCount", "n", "nodeCount", "Landroidx/compose/runtime/n0;", "o", "Landroidx/compose/runtime/n0;", "startStack", "p", "endStack", "q", "nodeCountStack", "<set-?>", "r", "Y", "()I", "currentGroup", ak.aB, "Z", "t", "X", "()Z", "closed", ak.aG, "Landroidx/compose/runtime/g1;", "pendingRecalculateMarks", androidx.exifinterface.media.a.T4, "s0", "isGroupEnd", "t0", "a0", "<init>", "(Landroidx/compose/runtime/x1;)V", "v", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class SlotWriter {

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final x1 table;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private int[] groups;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private Object[] slots;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private ArrayList<c> anchors;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int groupGapStart;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int groupGapLen;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int currentGroupEnd;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int currentSlot;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int currentSlotEnd;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int slotsGapStart;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int slotsGapLen;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int slotsGapOwner;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int insertCount;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int nodeCount;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final n0 startStack;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final n0 endStack;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final n0 nodeCountStack;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int currentGroup;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private int parent;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private g1 pendingRecalculateMarks;

    /* JADX INFO: renamed from: androidx.compose.runtime.a2$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: SlotTable.kt */
    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ6\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/a2$a;", "", "Landroidx/compose/runtime/a2;", "fromWriter", "", "fromIndex", "toWriter", "", "updateFromCursor", "updateToCursor", "", "Landroidx/compose/runtime/c;", "b", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<c> b(SlotWriter fromWriter, int fromIndex, SlotWriter toWriter, boolean updateFromCursor, boolean updateToCursor) {
            List<c> listE;
            boolean zQ0;
            int iI0 = fromWriter.i0(fromIndex);
            int i10 = fromIndex + iI0;
            int iM = fromWriter.M(fromIndex);
            int iM2 = fromWriter.M(i10);
            int i11 = iM2 - iM;
            boolean zJ = fromWriter.J(fromIndex);
            toWriter.p0(iI0);
            toWriter.r0(i11, toWriter.getCurrentGroup());
            if (fromWriter.groupGapStart < i10) {
                fromWriter.B0(i10);
            }
            if (fromWriter.slotsGapStart < iM2) {
                fromWriter.D0(iM2, i10);
            }
            int[] iArr = toWriter.groups;
            int currentGroup = toWriter.getCurrentGroup();
            kotlin.collections.m.a1(fromWriter.groups, iArr, currentGroup * 5, fromIndex * 5, i10 * 5);
            Object[] objArr = toWriter.slots;
            int i12 = toWriter.currentSlot;
            kotlin.collections.m.c1(fromWriter.slots, objArr, i12, iM, iM2);
            int parent = toWriter.getParent();
            z1.t0(iArr, currentGroup, parent);
            int i13 = currentGroup - fromIndex;
            int i14 = currentGroup + iI0;
            int iN = i12 - toWriter.N(iArr, currentGroup);
            int i15 = toWriter.slotsGapOwner;
            int i16 = toWriter.slotsGapLen;
            int length = objArr.length;
            int i17 = i15;
            int i18 = currentGroup;
            while (true) {
                if (i18 >= i14) {
                    break;
                }
                if (i18 != currentGroup) {
                    z1.t0(iArr, i18, z1.h0(iArr, i18) + i13);
                }
                int i19 = iN;
                z1.o0(iArr, i18, toWriter.P(toWriter.N(iArr, i18) + iN, i17 >= i18 ? toWriter.slotsGapStart : 0, i16, length));
                if (i18 == i17) {
                    i17++;
                }
                i18++;
                iN = i19;
                i14 = i14;
            }
            int i20 = i14;
            toWriter.slotsGapOwner = i17;
            int iB0 = z1.b0(fromWriter.anchors, fromIndex, fromWriter.a0());
            int iB1 = z1.b0(fromWriter.anchors, i10, fromWriter.a0());
            if (iB0 < iB1) {
                ArrayList arrayList = fromWriter.anchors;
                ArrayList arrayList2 = new ArrayList(iB1 - iB0);
                for (int i21 = iB0; i21 < iB1; i21++) {
                    Object obj = arrayList.get(i21);
                    kotlin.jvm.internal.f0.o(obj, "sourceAnchors[anchorIndex]");
                    c cVar = (c) obj;
                    cVar.c(cVar.getLocation() + i13);
                    arrayList2.add(cVar);
                }
                toWriter.anchors.addAll(z1.b0(toWriter.anchors, toWriter.getCurrentGroup(), toWriter.a0()), arrayList2);
                arrayList.subList(iB0, iB1).clear();
                listE = arrayList2;
            } else {
                listE = CollectionsKt__CollectionsKt.E();
            }
            int iJ0 = fromWriter.J0(fromIndex);
            if (updateFromCursor) {
                int i22 = iJ0 >= 0 ? 1 : 0;
                if (i22 != 0) {
                    fromWriter.h1();
                    fromWriter.A(iJ0 - fromWriter.getCurrentGroup());
                    fromWriter.h1();
                }
                fromWriter.A(fromIndex - fromWriter.getCurrentGroup());
                zQ0 = fromWriter.Q0();
                if (i22 != 0) {
                    fromWriter.b1();
                    fromWriter.R();
                    fromWriter.b1();
                    fromWriter.R();
                }
            } else {
                boolean zR0 = fromWriter.R0(fromIndex, iI0);
                fromWriter.S0(iM, i11, fromIndex - 1);
                zQ0 = zR0;
            }
            if (!(!zQ0)) {
                ComposerKt.A("Unexpectedly removed anchors".toString());
                throw new KotlinNothingValueException();
            }
            toWriter.nodeCount += z1.X(iArr, currentGroup) ? 1 : z1.c0(iArr, currentGroup);
            if (updateToCursor) {
                toWriter.currentGroup = i20;
                toWriter.currentSlot = i12 + i11;
            }
            if (zJ) {
                toWriter.q1(parent);
            }
            return listE;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.a2$b */
    /* JADX INFO: compiled from: SlotTable.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\"\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u0007\u0010\u000b¨\u0006\r"}, d2 = {"androidx/compose/runtime/a2$b", "", "", "", "hasNext", "next", "", "b", "I", ak.av, "()I", "(I)V", org.apache.tools.ant.taskdefs.optional.vss.g.H2, "runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class b implements Iterator<Object>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int current;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f12624c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ SlotWriter f12625d;

        b(int i10, int i11, SlotWriter slotWriter) {
            this.f12624c = i11;
            this.f12625d = slotWriter;
            this.current = i10;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getCurrent() {
            return this.current;
        }

        public final void b(int i10) {
            this.current = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.current < this.f12624c;
        }

        @Override // java.util.Iterator
        @dl.e
        public Object next() {
            if (!hasNext()) {
                return null;
            }
            Object[] objArr = this.f12625d.slots;
            SlotWriter slotWriter = this.f12625d;
            int i10 = this.current;
            this.current = i10 + 1;
            return objArr[slotWriter.O(i10)];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public SlotWriter(@dl.d x1 table) {
        kotlin.jvm.internal.f0.p(table, "table");
        this.table = table;
        this.groups = table.getGroups();
        this.slots = table.getSlots();
        this.anchors = table.A();
        this.groupGapStart = table.getGroupsSize();
        this.groupGapLen = (this.groups.length / 5) - table.getGroupsSize();
        this.currentGroupEnd = table.getGroupsSize();
        this.slotsGapStart = table.getSlotsSize();
        this.slotsGapLen = this.slots.length - table.getSlotsSize();
        this.slotsGapOwner = table.getGroupsSize();
        this.startStack = new n0();
        this.endStack = new n0();
        this.nodeCountStack = new n0();
        this.parent = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B0(int i10) {
        int i11 = this.groupGapLen;
        int i12 = this.groupGapStart;
        if (i12 != i10) {
            if (!this.anchors.isEmpty()) {
                o1(i12, i10);
            }
            if (i11 > 0) {
                int[] iArr = this.groups;
                int i13 = i10 * 5;
                int i14 = i11 * 5;
                int i15 = i12 * 5;
                if (i10 < i12) {
                    kotlin.collections.m.a1(iArr, iArr, i14 + i13, i13, i15);
                } else {
                    kotlin.collections.m.a1(iArr, iArr, i15, i15 + i14, i13 + i14);
                }
            }
            if (i10 < i12) {
                i12 = i10 + i11;
            }
            int iW = W();
            ComposerKt.q0(i12 < iW);
            while (i12 < iW) {
                int iH0 = z1.h0(this.groups, i12);
                int iN0 = N0(M0(iH0), i10);
                if (iN0 != iH0) {
                    z1.t0(this.groups, i12, iN0);
                }
                i12++;
                if (i12 == i10) {
                    i12 += i11;
                }
            }
        }
        this.groupGapStart = i10;
    }

    public static /* synthetic */ c C(SlotWriter slotWriter, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = slotWriter.currentGroup;
        }
        return slotWriter.B(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D0(int i10, int i11) {
        int i12 = this.slotsGapLen;
        int i13 = this.slotsGapStart;
        int i14 = this.slotsGapOwner;
        if (i13 != i10) {
            Object[] objArr = this.slots;
            if (i10 < i13) {
                kotlin.collections.m.c1(objArr, objArr, i10 + i12, i10, i13);
            } else {
                kotlin.collections.m.c1(objArr, objArr, i13, i13 + i12, i10 + i12);
            }
            kotlin.collections.m.n2(objArr, null, i10, i10 + i12);
        }
        int iMin = Math.min(i11 + 1, a0());
        if (i14 != iMin) {
            int length = this.slots.length - i12;
            if (iMin < i14) {
                int iF0 = f0(iMin);
                int iF1 = f0(i14);
                int i15 = this.groupGapStart;
                while (iF0 < iF1) {
                    int iL = z1.L(this.groups, iF0);
                    if (!(iL >= 0)) {
                        ComposerKt.A("Unexpected anchor value, expected a positive anchor".toString());
                        throw new KotlinNothingValueException();
                    }
                    z1.o0(this.groups, iF0, -((length - iL) + 1));
                    iF0++;
                    if (iF0 == i15) {
                        iF0 += this.groupGapLen;
                    }
                }
            } else {
                int iF2 = f0(i14);
                int iF3 = f0(iMin);
                while (iF2 < iF3) {
                    int iL2 = z1.L(this.groups, iF2);
                    if (!(iL2 < 0)) {
                        ComposerKt.A("Unexpected anchor value, expected a negative anchor".toString());
                        throw new KotlinNothingValueException();
                    }
                    z1.o0(this.groups, iF2, iL2 + length + 1);
                    iF2++;
                    if (iF2 == this.groupGapStart) {
                        iF2 += this.groupGapLen;
                    }
                }
            }
            this.slotsGapOwner = iMin;
        }
        this.slotsGapStart = i10;
    }

    private final int E(int[] iArr, int i10) {
        return N(iArr, i10) + z1.K(z1.P(iArr, i10) >> 29);
    }

    private final boolean H(int group) {
        int iI0 = group + 1;
        int iI1 = group + i0(group);
        while (iI0 < iI1) {
            if (z1.I(this.groups, f0(iI0))) {
                return true;
            }
            iI0 += i0(iI0);
        }
        return false;
    }

    private final int I0(int[] iArr, int i10) {
        return N(iArr, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean J(int group) {
        return group >= 0 && z1.I(this.groups, f0(group));
    }

    private final boolean K(int group) {
        return group >= 0 && z1.J(this.groups, f0(group));
    }

    private final int L(int anchor, int gapLen, int capacity) {
        return anchor < 0 ? (capacity - gapLen) + anchor + 1 : anchor;
    }

    private final int L0(int[] iArr, int i10) {
        return M0(z1.h0(iArr, f0(i10)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int M(int index) {
        return N(this.groups, f0(index));
    }

    private final int M0(int index) {
        return index > -2 ? index : a0() + index + 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int N(int[] iArr, int i10) {
        return i10 >= W() ? this.slots.length - this.slotsGapLen : L(z1.L(iArr, i10), this.slotsGapLen, this.slots.length);
    }

    private final int N0(int index, int gapStart) {
        return index < gapStart ? index : -((a0() - index) + 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int O(int dataIndex) {
        return dataIndex < this.slotsGapStart ? dataIndex : dataIndex + this.slotsGapLen;
    }

    private final void O0() {
        g1 g1Var = this.pendingRecalculateMarks;
        if (g1Var != null) {
            while (g1Var.c()) {
                r1(g1Var.e(), g1Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int P(int index, int gapStart, int gapLen, int capacity) {
        return index > gapStart ? -(((capacity - gapLen) - index) + 1) : index;
    }

    private final boolean P0(int gapStart, int size) {
        int i10 = size + gapStart;
        int iB0 = z1.b0(this.anchors, i10, W() - this.groupGapLen);
        if (iB0 >= this.anchors.size()) {
            iB0--;
        }
        int i11 = iB0 + 1;
        int i12 = 0;
        while (iB0 >= 0) {
            c cVar = this.anchors.get(iB0);
            kotlin.jvm.internal.f0.o(cVar, "anchors[index]");
            c cVar2 = cVar;
            int iD = D(cVar2);
            if (iD < gapStart) {
                break;
            }
            if (iD < i10) {
                cVar2.c(Integer.MIN_VALUE);
                if (i12 == 0) {
                    i12 = iB0 + 1;
                }
                i11 = iB0;
            }
            iB0--;
        }
        boolean z10 = i11 < i12;
        if (z10) {
            this.anchors.subList(i11, i12).clear();
        }
        return z10;
    }

    private final List<Integer> Q(int[] iArr) {
        List listN = z1.N(this.groups, 0, 1, null);
        List listY4 = CollectionsKt___CollectionsKt.y4(CollectionsKt___CollectionsKt.g5(listN, fi.u.W1(0, this.groupGapStart)), CollectionsKt___CollectionsKt.g5(listN, fi.u.W1(this.groupGapStart + this.groupGapLen, iArr.length / 5)));
        ArrayList arrayList = new ArrayList(listY4.size());
        int size = listY4.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(Integer.valueOf(L(((Number) listY4.get(i10)).intValue(), this.slotsGapLen, this.slots.length)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean R0(int start, int len) {
        boolean zP0 = false;
        if (len > 0) {
            ArrayList<c> arrayList = this.anchors;
            B0(start);
            zP0 = arrayList.isEmpty() ^ true ? P0(start, len) : false;
            this.groupGapStart = start;
            this.groupGapLen += len;
            int i10 = this.slotsGapOwner;
            if (i10 > start) {
                this.slotsGapOwner = Math.max(start, i10 - len);
            }
            int i11 = this.currentGroupEnd;
            if (i11 >= this.groupGapStart) {
                this.currentGroupEnd = i11 - len;
            }
            if (K(this.parent)) {
                q1(this.parent);
            }
        }
        return zP0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S0(int i10, int i11, int i12) {
        if (i11 > 0) {
            int i13 = this.slotsGapLen;
            int i14 = i10 + i11;
            D0(i14, i12);
            this.slotsGapStart = i10;
            this.slotsGapLen = i13 + i11;
            kotlin.collections.m.n2(this.slots, null, i10, i14);
            int i15 = this.currentSlotEnd;
            if (i15 >= i10) {
                this.currentSlotEnd = i15 - i11;
            }
        }
    }

    private final int U0() {
        int iW = (W() - this.groupGapLen) - this.endStack.i();
        this.currentGroupEnd = iW;
        return iW;
    }

    private final void V(int i10, int i11, int i12) {
        int iN0 = N0(i10, this.groupGapStart);
        while (i12 < i11) {
            z1.t0(this.groups, f0(i12), iN0);
            int iQ = z1.Q(this.groups, f0(i12)) + i12;
            V(i12, iQ, i12 + 1);
            i12 = iQ;
        }
    }

    private final void V0() {
        this.endStack.j((W() - this.groupGapLen) - this.currentGroupEnd);
    }

    private final int W() {
        return this.groups.length / 5;
    }

    private final void c0(StringBuilder sb2, int i10) {
        int iF0 = f0(i10);
        sb2.append("Group(");
        if (i10 < 10) {
            sb2.append(' ');
        }
        if (i10 < 100) {
            sb2.append(' ');
        }
        if (i10 < 1000) {
            sb2.append(' ');
        }
        sb2.append(i10);
        if (iF0 != i10) {
            sb2.append("(");
            sb2.append(iF0);
            sb2.append(")");
        }
        sb2.append('#');
        sb2.append(z1.Q(this.groups, iF0));
        boolean zD0 = d0(this, i10);
        if (zD0) {
            sb2.append('?');
        }
        sb2.append('^');
        sb2.append(M0(z1.h0(this.groups, iF0)));
        sb2.append(": key=");
        sb2.append(z1.Y(this.groups, iF0));
        sb2.append(", nodes=");
        sb2.append(z1.c0(this.groups, iF0));
        if (zD0) {
            sb2.append('?');
        }
        sb2.append(", dataAnchor=");
        sb2.append(z1.L(this.groups, iF0));
        sb2.append(", parentAnchor=");
        sb2.append(z1.h0(this.groups, iF0));
        if (z1.X(this.groups, iF0)) {
            sb2.append(", node=" + this.slots[O(I0(this.groups, iF0))]);
        }
        int iE1 = e1(this.groups, iF0);
        int iN = N(this.groups, iF0 + 1);
        if (iN > iE1) {
            sb2.append(", [");
            for (int i11 = iE1; i11 < iN; i11++) {
                if (i11 != iE1) {
                    sb2.append(", ");
                }
                sb2.append(String.valueOf(this.slots[O(i11)]));
            }
            sb2.append(']');
        }
        sb2.append(")");
    }

    private static final boolean d0(SlotWriter slotWriter, int i10) {
        return i10 < slotWriter.currentGroup && (i10 == slotWriter.parent || slotWriter.startStack.c(i10) >= 0 || d0(slotWriter, slotWriter.J0(i10)));
    }

    private final int e1(int[] iArr, int i10) {
        return i10 >= W() ? this.slots.length - this.slotsGapLen : L(z1.m0(iArr, i10), this.slotsGapLen, this.slots.length);
    }

    private final int f0(int index) {
        return index < this.groupGapStart ? index : index + this.groupGapLen;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void k1(int i10, Object obj, boolean z10, Object obj2) {
        int iQ;
        Object[] objArr = this.insertCount > 0;
        this.nodeCountStack.j(this.nodeCount);
        if (objArr == true) {
            p0(1);
            int i11 = this.currentGroup;
            int iF0 = f0(i11);
            p.Companion companion = p.INSTANCE;
            int i12 = obj != companion.a() ? 1 : 0;
            int i13 = (z10 || obj2 == companion.a()) ? 0 : 1;
            z1.W(this.groups, iF0, i10, z10, i12, i13, this.parent, this.currentSlot);
            this.currentSlotEnd = this.currentSlot;
            int i14 = (z10 ? 1 : 0) + i12 + i13;
            if (i14 > 0) {
                r0(i14, i11);
                Object[] objArr2 = this.slots;
                int i15 = this.currentSlot;
                if (z10) {
                    objArr2[i15] = obj2;
                    i15++;
                }
                if (i12 != 0) {
                    objArr2[i15] = obj;
                    i15++;
                }
                if (i13 != 0) {
                    objArr2[i15] = obj2;
                    i15++;
                }
                this.currentSlot = i15;
            }
            this.nodeCount = 0;
            iQ = i11 + 1;
            this.parent = i11;
            this.currentGroup = iQ;
        } else {
            this.startStack.j(this.parent);
            V0();
            int i16 = this.currentGroup;
            int iF1 = f0(i16);
            if (!kotlin.jvm.internal.f0.g(obj2, p.INSTANCE.a())) {
                if (z10) {
                    u1(obj2);
                } else {
                    p1(obj2);
                }
            }
            this.currentSlot = e1(this.groups, iF1);
            this.currentSlotEnd = N(this.groups, f0(this.currentGroup + 1));
            this.nodeCount = z1.c0(this.groups, iF1);
            this.parent = i16;
            this.currentGroup = i16 + 1;
            iQ = i16 + z1.Q(this.groups, iF1);
        }
        this.currentGroupEnd = iQ;
    }

    private final void o1(int i10, int i11) {
        int i12;
        int iW = W() - this.groupGapLen;
        if (i10 >= i11) {
            for (int iB0 = z1.b0(this.anchors, i11, iW); iB0 < this.anchors.size(); iB0++) {
                c cVar = this.anchors.get(iB0);
                kotlin.jvm.internal.f0.o(cVar, "anchors[index]");
                c cVar2 = cVar;
                int location = cVar2.getLocation();
                if (location < 0) {
                    return;
                }
                cVar2.c(-(iW - location));
            }
            return;
        }
        for (int iB1 = z1.b0(this.anchors, i10, iW); iB1 < this.anchors.size(); iB1++) {
            c cVar3 = this.anchors.get(iB1);
            kotlin.jvm.internal.f0.o(cVar3, "anchors[index]");
            c cVar4 = cVar3;
            int location2 = cVar4.getLocation();
            if (location2 >= 0 || (i12 = location2 + iW) >= i11) {
                return;
            }
            cVar4.c(i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p0(int i10) {
        if (i10 > 0) {
            int i11 = this.currentGroup;
            B0(i11);
            int i12 = this.groupGapStart;
            int i13 = this.groupGapLen;
            int[] iArr = this.groups;
            int length = iArr.length / 5;
            int i14 = length - i13;
            if (i13 < i10) {
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                int[] iArr2 = new int[iMax * 5];
                int i15 = iMax - i14;
                kotlin.collections.m.a1(iArr, iArr2, 0, 0, i12 * 5);
                kotlin.collections.m.a1(iArr, iArr2, (i12 + i15) * 5, (i13 + i12) * 5, length * 5);
                this.groups = iArr2;
                i13 = i15;
            }
            int i16 = this.currentGroupEnd;
            if (i16 >= i12) {
                this.currentGroupEnd = i16 + i10;
            }
            int i17 = i12 + i10;
            this.groupGapStart = i17;
            this.groupGapLen = i13 - i10;
            int iP = P(i14 > 0 ? M(i11 + i10) : 0, this.slotsGapOwner >= i12 ? this.slotsGapStart : 0, this.slotsGapLen, this.slots.length);
            for (int i18 = i12; i18 < i17; i18++) {
                z1.o0(this.groups, i18, iP);
            }
            int i19 = this.slotsGapOwner;
            if (i19 >= i12) {
                this.slotsGapOwner = i19 + i10;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void q1(int i10) {
        if (i10 >= 0) {
            g1 g1Var = this.pendingRecalculateMarks;
            if (g1Var == null) {
                g1Var = new g1(null, 1, 0 == true ? 1 : 0);
                this.pendingRecalculateMarks = g1Var;
            }
            g1Var.a(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r0(int i10, int i11) {
        if (i10 > 0) {
            D0(this.currentSlot, i11);
            int i12 = this.slotsGapStart;
            int i13 = this.slotsGapLen;
            if (i13 < i10) {
                Object[] objArr = this.slots;
                int length = objArr.length;
                int i14 = length - i13;
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i15 = 0; i15 < iMax; i15++) {
                    objArr2[i15] = null;
                }
                int i16 = iMax - i14;
                kotlin.collections.m.c1(objArr, objArr2, 0, 0, i12);
                kotlin.collections.m.c1(objArr, objArr2, i12 + i16, i13 + i12, length);
                this.slots = objArr2;
                i13 = i16;
            }
            int i17 = this.currentSlotEnd;
            if (i17 >= i12) {
                this.currentSlotEnd = i17 + i10;
            }
            this.slotsGapStart = i12 + i10;
            this.slotsGapLen = i13 - i10;
        }
    }

    private final void r1(int i10, g1 g1Var) {
        int iF0 = f0(i10);
        boolean zH = H(i10);
        if (z1.J(this.groups, iF0) != zH) {
            z1.n0(this.groups, iF0, zH);
            int iJ0 = J0(i10);
            if (iJ0 >= 0) {
                g1Var.a(iJ0);
            }
        }
    }

    private final void s1(int[] iArr, int i10, int i11) {
        z1.o0(iArr, i10, P(i11, this.slotsGapStart, this.slotsGapLen, this.slots.length));
    }

    private final List<Integer> v0() {
        List listA0 = z1.a0(this.groups, 0, 1, null);
        ArrayList arrayList = new ArrayList(listA0.size());
        int size = listA0.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = listA0.get(i10);
            ((Number) obj).intValue();
            int i11 = this.groupGapStart;
            if (i10 < i11 || i10 >= i11 + this.groupGapLen) {
                arrayList.add(obj);
            }
            i10++;
        }
        return arrayList;
    }

    private final void v1(int i10, Object obj) {
        int iF0 = f0(i10);
        int[] iArr = this.groups;
        if (iF0 < iArr.length && z1.X(iArr, iF0)) {
            this.slots[O(I0(this.groups, iF0))] = obj;
            return;
        }
        ComposerKt.A(("Updating the node of a group at " + i10 + " that was not created with as a node group").toString());
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ void x0(SlotWriter slotWriter, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = slotWriter.parent;
        }
        slotWriter.w0(i10);
    }

    private final void y0(int i10, int i11, int i12) {
        int i13 = i12 + i10;
        int iA0 = a0();
        int iB0 = z1.b0(this.anchors, i10, iA0);
        ArrayList arrayList = new ArrayList();
        if (iB0 >= 0) {
            while (iB0 < this.anchors.size()) {
                c cVar = this.anchors.get(iB0);
                kotlin.jvm.internal.f0.o(cVar, "anchors[index]");
                c cVar2 = cVar;
                int iD = D(cVar2);
                if (iD < i10 || iD >= i13) {
                    break;
                }
                arrayList.add(cVar2);
                this.anchors.remove(iB0);
            }
        }
        int i14 = i11 - i10;
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            c cVar3 = (c) arrayList.get(i15);
            int iD2 = D(cVar3) + i14;
            if (iD2 >= this.groupGapStart) {
                cVar3.c(-(iA0 - iD2));
            } else {
                cVar3.c(iD2);
            }
            this.anchors.add(z1.b0(this.anchors, iD2, iA0), cVar3);
        }
    }

    public final void A(int i10) {
        if (!(i10 >= 0)) {
            ComposerKt.A("Cannot seek backwards".toString());
            throw new KotlinNothingValueException();
        }
        if (!(this.insertCount <= 0)) {
            throw new IllegalStateException("Cannot call seek() while inserting".toString());
        }
        if (i10 == 0) {
            return;
        }
        int i11 = this.currentGroup + i10;
        if (i11 >= this.parent && i11 <= this.currentGroupEnd) {
            this.currentGroup = i11;
            int iN = N(this.groups, f0(i11));
            this.currentSlot = iN;
            this.currentSlotEnd = iN;
            return;
        }
        ComposerKt.A(("Cannot seek outside the current group (" + this.parent + '-' + this.currentGroupEnd + ')').toString());
        throw new KotlinNothingValueException();
    }

    public final void A0(int i10) {
        if (!(this.insertCount == 0)) {
            ComposerKt.A("Cannot move a group while inserting".toString());
            throw new KotlinNothingValueException();
        }
        if (!(i10 >= 0)) {
            ComposerKt.A("Parameter offset is out of bounds".toString());
            throw new KotlinNothingValueException();
        }
        if (i10 == 0) {
            return;
        }
        int i11 = this.currentGroup;
        int i12 = this.parent;
        int i13 = this.currentGroupEnd;
        int iQ = i11;
        for (int i14 = i10; i14 > 0; i14--) {
            iQ += z1.Q(this.groups, f0(iQ));
            if (!(iQ <= i13)) {
                ComposerKt.A("Parameter offset is out of bounds".toString());
                throw new KotlinNothingValueException();
            }
        }
        int iQ2 = z1.Q(this.groups, f0(iQ));
        int i15 = this.currentSlot;
        int iN = N(this.groups, f0(iQ));
        int i16 = iQ + iQ2;
        int iN2 = N(this.groups, f0(i16));
        int i17 = iN2 - iN;
        r0(i17, Math.max(this.currentGroup - 1, 0));
        p0(iQ2);
        int[] iArr = this.groups;
        int iF0 = f0(i16) * 5;
        kotlin.collections.m.a1(iArr, iArr, f0(i11) * 5, iF0, (iQ2 * 5) + iF0);
        if (i17 > 0) {
            Object[] objArr = this.slots;
            kotlin.collections.m.c1(objArr, objArr, i15, O(iN + i17), O(iN2 + i17));
        }
        int i18 = iN + i17;
        int i19 = i18 - i15;
        int i20 = this.slotsGapStart;
        int i21 = this.slotsGapLen;
        int length = this.slots.length;
        int i22 = this.slotsGapOwner;
        int i23 = i11 + iQ2;
        int i24 = i11;
        while (i24 < i23) {
            int iF1 = f0(i24);
            int i25 = i20;
            int i26 = i19;
            s1(iArr, iF1, P(N(iArr, iF1) - i19, i22 < iF1 ? 0 : i25, i21, length));
            i24++;
            i20 = i25;
            i19 = i26;
        }
        y0(i16, i11, iQ2);
        if (!(!R0(i16, iQ2))) {
            ComposerKt.A("Unexpectedly removed anchors".toString());
            throw new KotlinNothingValueException();
        }
        V(i12, this.currentGroupEnd, i11);
        if (i17 > 0) {
            S0(i18, i17, i16 - 1);
        }
    }

    @dl.d
    public final c B(int index) {
        ArrayList<c> arrayList = this.anchors;
        int iK0 = z1.k0(arrayList, index, a0());
        if (iK0 >= 0) {
            c cVar = arrayList.get(iK0);
            kotlin.jvm.internal.f0.o(cVar, "get(location)");
            return cVar;
        }
        if (index > this.groupGapStart) {
            index = -(a0() - index);
        }
        c cVar2 = new c(index);
        arrayList.add(-(iK0 + 1), cVar2);
        return cVar2;
    }

    @dl.d
    public final List<c> C0(int offset, @dl.d x1 table, int index) {
        kotlin.jvm.internal.f0.p(table, "table");
        ComposerKt.q0(this.insertCount <= 0 && i0(this.currentGroup + offset) == 1);
        int i10 = this.currentGroup;
        int i11 = this.currentSlot;
        int i12 = this.currentSlotEnd;
        A(offset);
        h1();
        G();
        SlotWriter slotWriterV = table.V();
        try {
            List<c> listB = INSTANCE.b(slotWriterV, index, this, false, true);
            slotWriterV.I();
            S();
            R();
            this.currentGroup = i10;
            this.currentSlot = i11;
            this.currentSlotEnd = i12;
            return listB;
        } catch (Throwable th2) {
            slotWriterV.I();
            throw th2;
        }
    }

    public final int D(@dl.d c anchor) {
        kotlin.jvm.internal.f0.p(anchor, "anchor");
        int location = anchor.getLocation();
        return location < 0 ? location + a0() : location;
    }

    @dl.d
    public final List<c> E0(@dl.d c anchor, int offset, @dl.d SlotWriter writer) {
        kotlin.jvm.internal.f0.p(anchor, "anchor");
        kotlin.jvm.internal.f0.p(writer, "writer");
        ComposerKt.q0(writer.insertCount > 0);
        ComposerKt.q0(this.insertCount == 0);
        ComposerKt.q0(anchor.b());
        int iD = D(anchor) + offset;
        int i10 = this.currentGroup;
        ComposerKt.q0(i10 <= iD && iD < this.currentGroupEnd);
        int iJ0 = J0(iD);
        int iI0 = i0(iD);
        int iH0 = u0(iD) ? 1 : H0(iD);
        List<c> listB = INSTANCE.b(this, iD, writer, false, false);
        q1(iJ0);
        boolean z10 = iH0 > 0;
        while (iJ0 >= i10) {
            int iF0 = f0(iJ0);
            int[] iArr = this.groups;
            z1.q0(iArr, iF0, z1.Q(iArr, iF0) - iI0);
            if (z10) {
                if (z1.X(this.groups, iF0)) {
                    z10 = false;
                } else {
                    int[] iArr2 = this.groups;
                    z1.s0(iArr2, iF0, z1.c0(iArr2, iF0) - iH0);
                }
            }
            iJ0 = J0(iJ0);
        }
        if (z10) {
            ComposerKt.q0(this.nodeCount >= iH0);
            this.nodeCount -= iH0;
        }
        return listB;
    }

    public final void F() {
        h1();
        while (!s0()) {
            q0(-3);
            a1();
        }
        R();
    }

    @dl.e
    public final Object F0(int index) {
        int iF0 = f0(index);
        if (z1.X(this.groups, iF0)) {
            return this.slots[O(I0(this.groups, iF0))];
        }
        return null;
    }

    public final void G() {
        int i10 = this.insertCount;
        this.insertCount = i10 + 1;
        if (i10 == 0) {
            V0();
        }
    }

    @dl.e
    public final Object G0(@dl.d c anchor) {
        kotlin.jvm.internal.f0.p(anchor, "anchor");
        return F0(anchor.e(this));
    }

    public final int H0(int index) {
        return z1.c0(this.groups, f0(index));
    }

    public final void I() {
        this.closed = true;
        if (this.startStack.d()) {
            B0(a0());
            D0(this.slots.length - this.slotsGapLen, this.groupGapStart);
            O0();
        }
        this.table.s(this, this.groups, this.groupGapStart, this.slots, this.slotsGapStart, this.anchors);
    }

    public final int J0(int index) {
        return L0(this.groups, index);
    }

    public final int K0(@dl.d c anchor) {
        kotlin.jvm.internal.f0.p(anchor, "anchor");
        if (anchor.b()) {
            return L0(this.groups, D(anchor));
        }
        return -1;
    }

    public final boolean Q0() {
        if (!(this.insertCount == 0)) {
            ComposerKt.A("Cannot remove group while inserting".toString());
            throw new KotlinNothingValueException();
        }
        int i10 = this.currentGroup;
        int i11 = this.currentSlot;
        int iA1 = a1();
        g1 g1Var = this.pendingRecalculateMarks;
        if (g1Var != null) {
            while (g1Var.c() && g1Var.d() >= i10) {
                g1Var.e();
            }
        }
        boolean zR0 = R0(i10, this.currentGroup - i10);
        S0(i11, this.currentSlot - i11, i10 - 1);
        this.currentGroup = i10;
        this.currentSlot = i11;
        this.nodeCount -= iA1;
        return zR0;
    }

    public final int R() {
        boolean z10 = this.insertCount > 0;
        int i10 = this.currentGroup;
        int i11 = this.currentGroupEnd;
        int i12 = this.parent;
        int iF0 = f0(i12);
        int i13 = this.nodeCount;
        int i14 = i10 - i12;
        boolean zX = z1.X(this.groups, iF0);
        if (z10) {
            z1.q0(this.groups, iF0, i14);
            z1.s0(this.groups, iF0, i13);
            this.nodeCount = this.nodeCountStack.i() + (zX ? 1 : i13);
            this.parent = L0(this.groups, i12);
        } else {
            if ((i10 != i11 ? 0 : 1) == 0) {
                ComposerKt.A("Expected to be at the end of a group".toString());
                throw new KotlinNothingValueException();
            }
            int iQ = z1.Q(this.groups, iF0);
            int iC0 = z1.c0(this.groups, iF0);
            z1.q0(this.groups, iF0, i14);
            z1.s0(this.groups, iF0, i13);
            int i15 = this.startStack.i();
            U0();
            this.parent = i15;
            int iL0 = L0(this.groups, i12);
            int i16 = this.nodeCountStack.i();
            this.nodeCount = i16;
            if (iL0 == i15) {
                this.nodeCount = i16 + (zX ? 0 : i13 - iC0);
            } else {
                int i17 = i14 - iQ;
                int i18 = zX ? 0 : i13 - iC0;
                if (i17 != 0 || i18 != 0) {
                    while (iL0 != 0 && iL0 != i15 && (i18 != 0 || i17 != 0)) {
                        int iF1 = f0(iL0);
                        if (i17 != 0) {
                            z1.q0(this.groups, iF1, z1.Q(this.groups, iF1) + i17);
                        }
                        if (i18 != 0) {
                            int[] iArr = this.groups;
                            z1.s0(iArr, iF1, z1.c0(iArr, iF1) + i18);
                        }
                        if (z1.X(this.groups, iF1)) {
                            i18 = 0;
                        }
                        iL0 = L0(this.groups, iL0);
                    }
                }
                this.nodeCount += i18;
            }
        }
        return i13;
    }

    public final void S() {
        int i10 = this.insertCount;
        if (!(i10 > 0)) {
            throw new IllegalStateException("Unbalanced begin/end insert".toString());
        }
        int i11 = i10 - 1;
        this.insertCount = i11;
        if (i11 == 0) {
            if (this.nodeCountStack.getTos() == this.startStack.getTos()) {
                U0();
            } else {
                ComposerKt.A("startGroup/endGroup mismatch while inserting".toString());
                throw new KotlinNothingValueException();
            }
        }
    }

    public final void T(int i10) {
        if (!(this.insertCount <= 0)) {
            ComposerKt.A("Cannot call ensureStarted() while inserting".toString());
            throw new KotlinNothingValueException();
        }
        int i11 = this.parent;
        if (i11 != i10) {
            if (!(i10 >= i11 && i10 < this.currentGroupEnd)) {
                ComposerKt.A(("Started group at " + i10 + " must be a subgroup of the group at " + i11).toString());
                throw new KotlinNothingValueException();
            }
            int i12 = this.currentGroup;
            int i13 = this.currentSlot;
            int i14 = this.currentSlotEnd;
            this.currentGroup = i10;
            h1();
            this.currentGroup = i12;
            this.currentSlot = i13;
            this.currentSlotEnd = i14;
        }
    }

    public final void T0() {
        if (!(this.insertCount == 0)) {
            ComposerKt.A("Cannot reset when inserting".toString());
            throw new KotlinNothingValueException();
        }
        O0();
        this.currentGroup = 0;
        this.currentGroupEnd = W() - this.groupGapLen;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
        this.nodeCount = 0;
    }

    public final void U(@dl.d c anchor) {
        kotlin.jvm.internal.f0.p(anchor, "anchor");
        T(anchor.e(this));
    }

    public final void W0(@dl.d c anchor) {
        kotlin.jvm.internal.f0.p(anchor, "anchor");
        A(anchor.e(this) - this.currentGroup);
    }

    /* JADX INFO: renamed from: X, reason: from getter */
    public final boolean getClosed() {
        return this.closed;
    }

    @dl.e
    public final Object X0(int index, @dl.e Object value) {
        int iE1 = e1(this.groups, f0(this.currentGroup));
        int i10 = iE1 + index;
        if (i10 >= iE1 && i10 < N(this.groups, f0(this.currentGroup + 1))) {
            int iO = O(i10);
            Object[] objArr = this.slots;
            Object obj = objArr[iO];
            objArr[iO] = value;
            return obj;
        }
        ComposerKt.A(("Write to an invalid slot index " + index + " for group " + this.currentGroup).toString());
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: Y, reason: from getter */
    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final void Y0(@dl.e Object obj) {
        int i10 = this.currentSlot;
        if (i10 <= this.currentSlotEnd) {
            this.slots[O(i10 - 1)] = obj;
        } else {
            ComposerKt.A("Writing to an invalid slot".toString());
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final int getParent() {
        return this.parent;
    }

    @dl.e
    public final Object Z0() {
        if (this.insertCount > 0) {
            r0(1, this.parent);
        }
        Object[] objArr = this.slots;
        int i10 = this.currentSlot;
        this.currentSlot = i10 + 1;
        return objArr[O(i10)];
    }

    public final int a0() {
        return W() - this.groupGapLen;
    }

    public final int a1() {
        int iF0 = f0(this.currentGroup);
        int iQ = this.currentGroup + z1.Q(this.groups, iF0);
        this.currentGroup = iQ;
        this.currentSlot = N(this.groups, f0(iQ));
        if (z1.X(this.groups, iF0)) {
            return 1;
        }
        return z1.c0(this.groups, iF0);
    }

    @dl.d
    /* JADX INFO: renamed from: b0, reason: from getter */
    public final x1 getTable() {
        return this.table;
    }

    public final void b1() {
        int i10 = this.currentGroupEnd;
        this.currentGroup = i10;
        this.currentSlot = N(this.groups, f0(i10));
    }

    @dl.e
    public final Object c1(int groupIndex, int index) {
        int iE1 = e1(this.groups, f0(groupIndex));
        int i10 = index + iE1;
        if (iE1 <= i10 && i10 < N(this.groups, f0(groupIndex + 1))) {
            return this.slots[O(i10)];
        }
        return p.INSTANCE.a();
    }

    @dl.e
    public final Object d1(@dl.d c anchor, int index) {
        kotlin.jvm.internal.f0.p(anchor, "anchor");
        return c1(D(anchor), index);
    }

    @dl.e
    public final Object e0(int index) {
        int iF0 = f0(index);
        return z1.T(this.groups, iF0) ? this.slots[E(this.groups, iF0)] : p.INSTANCE.a();
    }

    public final void f1(int i10, @dl.e Object obj) {
        k1(i10, p.INSTANCE.a(), false, obj);
    }

    public final int g0(int index) {
        return z1.Y(this.groups, f0(index));
    }

    public final void g1(int i10, @dl.e Object obj, @dl.e Object obj2) {
        k1(i10, obj, false, obj2);
    }

    @dl.e
    public final Object h0(int index) {
        int iF0 = f0(index);
        if (z1.V(this.groups, iF0)) {
            return this.slots[z1.g0(this.groups, iF0)];
        }
        return null;
    }

    public final void h1() {
        if (!(this.insertCount == 0)) {
            ComposerKt.A("Key must be supplied when inserting".toString());
            throw new KotlinNothingValueException();
        }
        p.Companion companion = p.INSTANCE;
        k1(0, companion.a(), false, companion.a());
    }

    public final int i0(int index) {
        return z1.Q(this.groups, f0(index));
    }

    public final void i1(int i10) {
        p.Companion companion = p.INSTANCE;
        k1(i10, companion.a(), false, companion.a());
    }

    @dl.d
    public final Iterator<Object> j0() {
        int iN = N(this.groups, f0(this.currentGroup));
        int[] iArr = this.groups;
        int i10 = this.currentGroup;
        return new b(iN, N(iArr, f0(i10 + i0(i10))), this);
    }

    public final void j1(int i10, @dl.e Object obj) {
        k1(i10, obj, false, p.INSTANCE.a());
    }

    @dl.d
    public final String k0() {
        StringBuilder sb2 = new StringBuilder();
        int iA0 = a0();
        for (int i10 = 0; i10 < iA0; i10++) {
            c0(sb2, i10);
            sb2.append('\n');
        }
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final boolean l0(int index) {
        return m0(index, this.currentGroup);
    }

    public final void l1(@dl.e Object obj) {
        k1(125, obj, true, p.INSTANCE.a());
    }

    public final boolean m0(int index, int group) {
        int iC;
        int iW;
        if (group == this.parent) {
            iW = this.currentGroupEnd;
        } else if (group <= this.startStack.h(0) && (iC = this.startStack.c(group)) >= 0) {
            iW = (W() - this.groupGapLen) - this.endStack.g(iC);
        } else {
            int iI0 = i0(group);
            iW = iI0 + group;
        }
        return index > group && index < iW;
    }

    public final void m1(@dl.e Object obj, @dl.e Object obj2) {
        k1(125, obj, true, obj2);
    }

    public final boolean n0(int index) {
        int i10 = this.parent;
        return (index > i10 && index < this.currentGroupEnd) || (i10 == 0 && index == 0);
    }

    @dl.e
    public final Object n1(@dl.e Object value) {
        Object objZ0 = Z0();
        Y0(value);
        return objZ0;
    }

    public final void o0(@dl.e Object obj) {
        if (!(this.insertCount >= 0)) {
            ComposerKt.A("Cannot insert auxiliary data when not inserting".toString());
            throw new KotlinNothingValueException();
        }
        int i10 = this.parent;
        int iF0 = f0(i10);
        if (!(!z1.T(this.groups, iF0))) {
            ComposerKt.A("Group already has auxiliary data".toString());
            throw new KotlinNothingValueException();
        }
        r0(1, i10);
        int iE = E(this.groups, iF0);
        int iO = O(iE);
        int i11 = this.currentSlot;
        if (i11 > iE) {
            int i12 = i11 - iE;
            if (!(i12 < 3)) {
                throw new IllegalStateException("Moving more than two slot not supported".toString());
            }
            if (i12 > 1) {
                Object[] objArr = this.slots;
                objArr[iO + 2] = objArr[iO + 1];
            }
            Object[] objArr2 = this.slots;
            objArr2[iO + 1] = objArr2[iO];
        }
        z1.G(this.groups, iF0);
        this.slots[iO] = obj;
        this.currentSlot++;
    }

    public final void p1(@dl.e Object obj) {
        int iF0 = f0(this.currentGroup);
        if (z1.T(this.groups, iF0)) {
            this.slots[O(E(this.groups, iF0))] = obj;
        } else {
            ComposerKt.A("Updating the data of a group that was not created with a data slot".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final void q0(int i10) {
        int iC0 = 0;
        if (!(this.insertCount == 0)) {
            ComposerKt.A("Writer cannot be inserting".toString());
            throw new KotlinNothingValueException();
        }
        if (s0()) {
            G();
            i1(i10);
            R();
            S();
            return;
        }
        int i11 = this.currentGroup;
        int iL0 = L0(this.groups, i11);
        int iI0 = iL0 + i0(iL0);
        int i12 = iI0 - i11;
        int iQ = i11;
        while (iQ < iI0) {
            int iF0 = f0(iQ);
            iC0 += z1.c0(this.groups, iF0);
            iQ += z1.Q(this.groups, iF0);
        }
        int iL = z1.L(this.groups, f0(i11));
        G();
        p0(1);
        S();
        int iF1 = f0(i11);
        z1.W(this.groups, iF1, i10, false, false, false, iL0, iL);
        z1.q0(this.groups, iF1, i12 + 1);
        z1.s0(this.groups, iF1, iC0);
        z(f0(iL0), 1);
        V(iL0, iI0, i11);
        this.currentGroup = iI0;
    }

    public final boolean s0() {
        return this.currentGroup == this.currentGroupEnd;
    }

    public final boolean t0() {
        int i10 = this.currentGroup;
        return i10 < this.currentGroupEnd && z1.X(this.groups, f0(i10));
    }

    public final void t1(@dl.d c anchor, @dl.e Object obj) {
        kotlin.jvm.internal.f0.p(anchor, "anchor");
        v1(anchor.e(this), obj);
    }

    @dl.d
    public String toString() {
        return "SlotWriter(current = " + this.currentGroup + " end=" + this.currentGroupEnd + " size = " + a0() + " gap=" + this.groupGapStart + '-' + (this.groupGapStart + this.groupGapLen) + ')';
    }

    public final boolean u0(int index) {
        return z1.X(this.groups, f0(index));
    }

    public final void u1(@dl.e Object obj) {
        v1(this.currentGroup, obj);
    }

    public final void w0(int i10) {
        int iF0 = f0(i10);
        if (z1.U(this.groups, iF0)) {
            return;
        }
        z1.r0(this.groups, iF0, true);
        if (z1.J(this.groups, iF0)) {
            return;
        }
        q1(J0(i10));
    }

    public final void w1(@dl.e Object obj) {
        v1(this.parent, obj);
    }

    public final void x1() {
        int i10 = this.slotsGapOwner;
        int length = this.slots.length - this.slotsGapLen;
        int iA0 = a0();
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        while (i11 < iA0) {
            int iF0 = f0(i11);
            int iL = z1.L(this.groups, iF0);
            int iN = N(this.groups, iF0);
            if (!(iN >= i12)) {
                throw new IllegalStateException(("Data index out of order at " + i11 + ", previous = " + i12 + ", current = " + iN).toString());
            }
            if (!(iN <= length)) {
                throw new IllegalStateException(("Data index, " + iN + ", out of bound at " + i11).toString());
            }
            if (iL < 0 && !z10) {
                if (!(i10 == i11)) {
                    throw new IllegalStateException(("Expected the slot gap owner to be " + i10 + " found gap at " + i11).toString());
                }
                z10 = true;
            }
            i11++;
            i12 = iN;
        }
    }

    public final void y1() {
        int i10 = this.groupGapStart;
        int i11 = this.groupGapLen;
        int iW = W();
        int i12 = 0;
        while (true) {
            if (i12 >= i10) {
                for (int i13 = i11 + i10; i13 < iW; i13++) {
                    int iH0 = z1.h0(this.groups, i13);
                    if (M0(iH0) < i10) {
                        if (!(iH0 > -2)) {
                            throw new IllegalStateException(("Expected a start relative anchor at " + i13).toString());
                        }
                    } else {
                        if (!(iH0 <= -2)) {
                            throw new IllegalStateException(("Expected an end relative anchor at " + i13).toString());
                        }
                    }
                }
                return;
            }
            if (!(z1.h0(this.groups, i12) > -2)) {
                throw new IllegalStateException(("Expected a start relative anchor at " + i12).toString());
            }
            i12++;
        }
    }

    public final void z(int i10, int i11) {
        while (i10 > 0) {
            int[] iArr = this.groups;
            z1.q0(iArr, i10, z1.Q(iArr, i10) + i11);
            i10 = f0(M0(z1.h0(this.groups, i10)));
        }
    }

    @dl.d
    public final List<c> z0(@dl.d x1 table, int index) {
        kotlin.jvm.internal.f0.p(table, "table");
        ComposerKt.q0(this.insertCount > 0);
        if (index != 0 || this.currentGroup != 0 || this.table.getGroupsSize() != 0) {
            SlotWriter slotWriterV = table.V();
            try {
                return INSTANCE.b(slotWriterV, index, this, true, true);
            } finally {
                slotWriterV.I();
            }
        }
        int[] iArr = this.groups;
        Object[] objArr = this.slots;
        ArrayList<c> arrayList = this.anchors;
        int[] iArrB = table.getGroups();
        int iD = table.getGroupsSize();
        Object[] objArrE = table.getSlots();
        int iF = table.getSlotsSize();
        this.groups = iArrB;
        this.slots = objArrE;
        this.anchors = table.A();
        this.groupGapStart = iD;
        this.groupGapLen = (iArrB.length / 5) - iD;
        this.slotsGapStart = iF;
        this.slotsGapLen = objArrE.length - iF;
        this.slotsGapOwner = iD;
        table.a0(iArr, 0, objArr, 0, arrayList);
        return this.anchors;
    }
}
