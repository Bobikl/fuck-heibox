package androidx.compose.ui.node;

import androidx.compose.ui.unit.LayoutDirection;
import b1.MutableRect;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: NodeCoordinator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u009a\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0012\b \u0018\u0000 \u008b\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005:\u0004\u008c\u0002\u008d\u0002B\u0013\u0012\b\u0010\u0093\u0001\u001a\u00030\u008e\u0001¢\u0006\u0006\b\u0089\u0002\u0010\u008a\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0006H\u0002J\b\u0010\u000e\u001a\u00020\u0007H\u0002JY\u0010\u0019\u001a\u00020\u0007\"\b\b\u0000\u0010\u0010*\u00020\u000f*\u0004\u0018\u00018\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJa\u0010\u001d\u001a\u00020\u0007\"\b\b\u0000\u0010\u0010*\u00020\u000f*\u0004\u0018\u00018\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJa\u0010\u001f\u001a\u00020\u0007\"\b\b\u0000\u0010\u0010*\u00020\u000f*\u0004\u0018\u00018\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u001eJ\f\u0010 \u001a\u00020\u0000*\u00020\u0003H\u0002J%\u0010$\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%J%\u0010&\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010%J%\u0010(\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0013H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)J \u0010-\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\bH\u0002J\u0018\u0010/\u001a\u00020\u00072\u0006\u0010.\u001a\u00020*2\u0006\u0010,\u001a\u00020\bH\u0002J\u001d\u00100\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101J0\u00105\u001a\u00020\u00072\u0006\u00103\u001a\u0002022\u0006\u0010\t\u001a\u00020\b2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\u0005H\u0086\bø\u0001\u0002JC\u00108\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0010\u0018\u00012\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u0000062\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0086\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b8\u00109J\u001f\u0010:\u001a\u00020\b2\n\u00107\u001a\u0006\u0012\u0002\b\u000306ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b:\u0010;J.\u0010<\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0010\u0018\u00012\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u000006H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b<\u0010=J)\u0010>\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00102\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u000006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b>\u0010=J\u0006\u0010?\u001a\u00020\bJ\u000f\u0010@\u001a\u00020\u0007H\u0010¢\u0006\u0004\b@\u0010AJ\u0019\u0010D\u001a\u00020\u00072\b\u0010C\u001a\u0004\u0018\u00010BH\u0000¢\u0006\u0004\bD\u0010EJ\u0010\u0010H\u001a\u00020\u00072\u0006\u0010G\u001a\u00020FH\u0004J\u0010\u0010I\u001a\u00020F2\u0006\u0010C\u001a\u00020BH&J\u0018\u0010L\u001a\u00020\u00072\u0006\u0010J\u001a\u0002022\u0006\u0010K\u001a\u000202H\u0014J/\u0010Q\u001a\u00020P2\u0006\u0010N\u001a\u00020M2\f\u00104\u001a\b\u0012\u0004\u0012\u00020P0OH\u0084\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bQ\u0010RJ\u0006\u0010S\u001a\u00020\u0007J\u0006\u0010T\u001a\u00020\u0007J@\u0010[\u001a\u00020\u00072\u0006\u0010V\u001a\u00020U2\u0006\u0010W\u001a\u00020\u001b2\u0019\u0010Z\u001a\u0015\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\bYH\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b[\u0010\\J\u000e\u0010]\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0006J\u0010\u0010^\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0006\u0010_\u001a\u00020\u0007J\u0011\u0010`\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0006H\u0096\u0002J!\u0010a\u001a\u00020\u00072\u0019\u0010Z\u001a\u0015\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\bYJQ\u0010b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0010*\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bb\u0010cJS\u0010d\u001a\u00020\u0007\"\b\b\u0000\u0010\u0010*\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bd\u0010cJ\u0006\u0010f\u001a\u00020eJ\u001d\u0010h\u001a\u00020\u00132\u0006\u0010g\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bh\u00101J\u001d\u0010j\u001a\u00020\u00132\u0006\u0010i\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bj\u00101J%\u0010m\u001a\u00020\u00132\u0006\u0010k\u001a\u00020\u00032\u0006\u0010l\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bm\u0010nJ%\u0010o\u001a\u00020\u00072\u0006\u0010k\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\"H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bo\u0010pJ\u0018\u0010q\u001a\u00020e2\u0006\u0010k\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\bH\u0016J\u001d\u0010r\u001a\u00020\u00132\u0006\u0010i\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\br\u00101J(\u0010s\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00062\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0084\bø\u0001\u0002J\u001d\u0010t\u001a\u00020\u00132\u0006\u0010V\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bt\u00101J\u001d\u0010u\u001a\u00020\u00132\u0006\u0010V\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bu\u00101J\u0018\u0010x\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010w\u001a\u00020vH\u0004J\b\u0010y\u001a\u00020\u0007H\u0016J\b\u0010z\u001a\u00020\u0007H\u0016J)\u0010|\u001a\u00020\u00072\u0006\u0010.\u001a\u00020*2\u0006\u0010,\u001a\u00020\b2\b\b\u0002\u0010{\u001a\u00020\bH\u0000¢\u0006\u0004\b|\u0010}J\u001d\u0010~\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b~\u0010\u007fJ\u001f\u0010\u0080\u0001\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0080\u0001\u0010\u007fJ\t\u0010\u0081\u0001\u001a\u00020\u0007H\u0016J\u001e\u0010\u0082\u0001\u001a\u00020\u00072\u0006\u0010+\u001a\u00020eH\u0096@ø\u0001\u0001¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\t\u0010\u0084\u0001\u001a\u00020\u0007H\u0016J\u001b\u0010\u0086\u0001\u001a\u00020\u00002\u0007\u0010\u0085\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u0007\u0010\u0088\u0001\u001a\u00020\bJ\"\u0010\u008b\u0001\u001a\u00030\u0089\u00012\b\u0010\u008a\u0001\u001a\u00030\u0089\u0001H\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u008b\u0001\u00101J*\u0010\u008c\u0001\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u008a\u0001\u001a\u00030\u0089\u0001H\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001R \u0010\u0093\u0001\u001a\u00030\u008e\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R+\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R+\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u009b\u0001\u0010\u0095\u0001\u001a\u0006\b\u009c\u0001\u0010\u0097\u0001\"\u0006\b\u009d\u0001\u0010\u0099\u0001R\u0019\u0010¡\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u001a\u0010¥\u0001\u001a\u00030¢\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u0019\u0010¨\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u001c\u0010¬\u0001\u001a\u0005\u0018\u00010©\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R-\u0010G\u001a\u0004\u0018\u00010F2\t\u0010\u00ad\u0001\u001a\u0004\u0018\u00010F8\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001R)\u0010¶\u0001\u001a\u0012\u0012\u0005\u0012\u00030³\u0001\u0012\u0004\u0012\u000202\u0018\u00010²\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R:\u0010V\u001a\u00020U2\u0007\u0010\u00ad\u0001\u001a\u00020U8\u0016@TX\u0096\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0003¢\u0006\u0018\n\u0006\b·\u0001\u0010¸\u0001\u001a\u0006\b¹\u0001\u0010º\u0001\"\u0006\b»\u0001\u0010¼\u0001R1\u0010W\u001a\u00020\u001b2\u0007\u0010\u00ad\u0001\u001a\u00020\u001b8\u0006@DX\u0086\u000e¢\u0006\u0018\n\u0006\b½\u0001\u0010§\u0001\u001a\u0006\b¾\u0001\u0010¿\u0001\"\u0006\bÀ\u0001\u0010Á\u0001R\u001b\u0010Ä\u0001\u001a\u0005\u0018\u00010Â\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bj\u0010Ã\u0001R*\u0010È\u0001\u001a\u00020\b2\u0007\u0010\u00ad\u0001\u001a\u00020\b8\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\bÅ\u0001\u0010 \u0001\u001a\u0006\bÆ\u0001\u0010Ç\u0001R0\u0010Î\u0001\u001a\u0005\u0018\u00010É\u00012\n\u0010\u00ad\u0001\u001a\u0005\u0018\u00010É\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\bÊ\u0001\u0010Ë\u0001\u001a\u0006\bÌ\u0001\u0010Í\u0001R\u0018\u0010Ò\u0001\u001a\u00030Ï\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÐ\u0001\u0010Ñ\u0001R\u0017\u0010Õ\u0001\u001a\u00020\n8&X¦\u0004¢\u0006\b\u001a\u0006\bÓ\u0001\u0010Ô\u0001R\u0018\u0010Ø\u0001\u001a\u00030¢\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÖ\u0001\u0010×\u0001R\u0017\u0010Ú\u0001\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÙ\u0001\u0010¿\u0001R\u0017\u0010Ü\u0001\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÛ\u0001\u0010¿\u0001R\u0019\u0010ß\u0001\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÝ\u0001\u0010Þ\u0001R\u0017\u0010â\u0001\u001a\u00020\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\bà\u0001\u0010á\u0001R\u001e\u0010å\u0001\u001a\u00030ã\u00018Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0003¢\u0006\b\u001a\u0006\bä\u0001\u0010º\u0001RN\u0010Z\u001a\u0015\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\bY2\u001a\u0010\u00ad\u0001\u001a\u0015\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\bY8\u0004@BX\u0084\u000e¢\u0006\u000f\n\u0005\bZ\u0010æ\u0001\u001a\u0006\bç\u0001\u0010è\u0001R\u0018\u0010ì\u0001\u001a\u00030é\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bê\u0001\u0010ë\u0001R\u0019\u0010î\u0001\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bí\u0001\u0010Þ\u0001R\u0017\u0010ð\u0001\u001a\u00020\b8VX\u0096\u0004¢\u0006\b\u001a\u0006\bï\u0001\u0010Ç\u0001R\u0017\u0010ñ\u0001\u001a\u00020\b8VX\u0096\u0004¢\u0006\b\u001a\u0006\b¦\u0001\u0010Ç\u0001R,\u0010÷\u0001\u001a\u00030©\u00012\b\u0010ò\u0001\u001a\u00030©\u00018P@PX\u0090\u000e¢\u0006\u0010\u001a\u0006\bó\u0001\u0010ô\u0001\"\u0006\bõ\u0001\u0010ö\u0001R\u001f\u0010û\u0001\u001a\n\u0012\u0005\u0012\u00030³\u00010ø\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bù\u0001\u0010ú\u0001R\u001a\u0010ÿ\u0001\u001a\u0005\u0018\u00010ü\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bý\u0001\u0010þ\u0001R\u0016\u0010\u0081\u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\b\u001a\u0006\b\u0080\u0002\u0010á\u0001R\u0016\u0010\u0083\u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\b\u001a\u0006\b\u0082\u0002\u0010á\u0001R\u0017\u0010\u0086\u0002\u001a\u00020*8DX\u0084\u0004¢\u0006\b\u001a\u0006\b\u0084\u0002\u0010\u0085\u0002R\u0017\u0010\u0087\u0002\u001a\u00020\b8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0087\u0002\u0010Ç\u0001R\u001e\u0010\u008a\u0001\u001a\u00030\u0089\u00018Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0003¢\u0006\b\u001a\u0006\b\u0088\u0002\u0010º\u0001\u0082\u0002\u0016\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0005\b\u009920\u0001\n\u0002\b!¨\u0006\u008e\u0002"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/h0;", "Landroidx/compose/ui/layout/g0;", "Landroidx/compose/ui/layout/q;", "Landroidx/compose/ui/node/c1;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/d0;", "Lkotlin/b2;", "", "includeTail", "Landroidx/compose/ui/n$d;", "Z2", "canvas", "I2", "I3", "Landroidx/compose/ui/node/c;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/ui/node/NodeCoordinator$d;", "hitTestSource", "Lb1/f;", "pointerPosition", "Landroidx/compose/ui/node/k;", "hitTestResult", "isTouchEvent", "isInLayer", "b3", "(Landroidx/compose/ui/node/c;Landroidx/compose/ui/node/NodeCoordinator$d;JLandroidx/compose/ui/node/k;ZZ)V", "", "distanceFromEdge", "c3", "(Landroidx/compose/ui/node/c;Landroidx/compose/ui/node/NodeCoordinator$d;JLandroidx/compose/ui/node/k;ZZF)V", "C3", "D3", "ancestor", "Landroidx/compose/ui/graphics/c1;", "matrix", "H3", "(Landroidx/compose/ui/node/NodeCoordinator;[F)V", "G3", androidx.constraintlayout.core.motion.utils.w.c.R, "A2", "(Landroidx/compose/ui/node/NodeCoordinator;J)J", "Lb1/d;", "rect", "clipBounds", "z2", "bounds", "L2", "j3", "(J)J", "", "mask", "block", "L3", "Landroidx/compose/ui/node/v0;", "type", "M3", "(ILyh/l;)V", "X2", "(I)Z", "Y2", "(I)Ljava/lang/Object;", "a3", "i3", "j2", "()V", "Landroidx/compose/ui/layout/f0;", "scope", "K3", "(Landroidx/compose/ui/layout/f0;)V", "Landroidx/compose/ui/node/i0;", "lookaheadDelegate", "J3", "D2", "width", "height", "n3", "Ls1/b;", "constraints", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/e1;", "r3", "(JLyh/a;)Landroidx/compose/ui/layout/e1;", "o3", "k3", "Ls1/n;", CommonNetImpl.POSITION, "zIndex", "Landroidx/compose/ui/graphics/v0;", "Lkotlin/t;", "layerBlock", "U1", "(JFLyh/l;)V", "G2", "q3", "p3", "g3", "l3", "d3", "(Landroidx/compose/ui/node/NodeCoordinator$d;JLandroidx/compose/ui/node/k;ZZ)V", "e3", "Lb1/i;", "F3", "relativeToWindow", "i0", "relativeToLocal", RXScreenCaptureService.KEY_WIDTH, "sourceCoordinates", "relativeToSource", "a0", "(Landroidx/compose/ui/layout/q;J)J", "s0", "(Landroidx/compose/ui/layout/q;[F)V", "x", "L", "N3", "E3", "K2", "Landroidx/compose/ui/graphics/h1;", "paint", "H2", "B2", "E2", "clipToMinimumTouchTargetSize", "u3", "(Lb1/d;ZZ)V", "O3", "(J)Z", "h3", "f3", "s3", "(Lb1/i;Lkotlin/coroutines/c;)Ljava/lang/Object;", "m3", "other", "J2", "(Landroidx/compose/ui/node/NodeCoordinator;)Landroidx/compose/ui/node/NodeCoordinator;", "B3", "Lb1/m;", "minimumTouchTargetSize", "C2", "F2", "(JJ)F", "Landroidx/compose/ui/node/LayoutNode;", "i", "Landroidx/compose/ui/node/LayoutNode;", "P0", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "j", "Landroidx/compose/ui/node/NodeCoordinator;", "U2", "()Landroidx/compose/ui/node/NodeCoordinator;", "y3", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "wrapped", "k", "V2", "z3", "wrappedBy", "l", "Z", "isClipping", "Landroidx/compose/ui/unit/LayoutDirection;", "o", "Landroidx/compose/ui/unit/LayoutDirection;", "layerLayoutDirection", "p", "F", "lastLayerAlpha", "Landroidx/compose/ui/layout/j0;", "q", "Landroidx/compose/ui/layout/j0;", "_measureResult", "<set-?>", "r", "Landroidx/compose/ui/node/i0;", "P2", "()Landroidx/compose/ui/node/i0;", "", "Landroidx/compose/ui/layout/a;", ak.aB, "Ljava/util/Map;", "oldAlignmentLines", "t", "J", "f2", "()J", "x3", "(J)V", ak.aG, "W2", "()F", "A3", "(F)V", "Landroidx/compose/ui/node/r;", "Landroidx/compose/ui/node/r;", "layerPositionalProperties", "y", "M2", "()Z", "lastLayerDrawingWasSkipped", "Landroidx/compose/ui/node/z0;", ak.aD, "Landroidx/compose/ui/node/z0;", "N2", "()Landroidx/compose/ui/node/z0;", "layer", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "S2", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "T2", "()Landroidx/compose/ui/n$d;", "tail", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getDensity", "density", "C1", "fontScale", "e2", "()Landroidx/compose/ui/node/h0;", "parent", "b2", "()Landroidx/compose/ui/layout/q;", "coordinates", "Ls1/r;", ak.av, UiKitSpanObj.TYPE_SIZE, "Lyh/l;", "O2", "()Lyh/l;", "Landroidx/compose/ui/node/a;", "Z1", "()Landroidx/compose/ui/node/a;", "alignmentLinesOwner", "a2", "child", "c2", "hasMeasureResult", "isAttached", "value", "d2", "()Landroidx/compose/ui/layout/j0;", "w3", "(Landroidx/compose/ui/layout/j0;)V", "measureResult", "", "A1", "()Ljava/util/Set;", "providedAlignmentLines", "", "b", "()Ljava/lang/Object;", "parentData", "D", "parentLayoutCoordinates", "c0", "parentCoordinates", "R2", "()Lb1/d;", "rectCache", "isValid", "Q2", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", androidx.exifinterface.media.a.W4, ak.aF, "d", "ui_release"}, k = 1, mv = {1, 7, 1})
public abstract class NodeCoordinator extends h0 implements androidx.compose.ui.layout.g0, androidx.compose.ui.layout.q, c1, yh.l<androidx.compose.ui.graphics.d0, b2> {

    @dl.d
    public static final String B = "LayoutCoordinate operations are only valid when isAttached is true";

    @dl.d
    public static final String C = "Asking for measurement result of unmeasured layout modifier";

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final LayoutNode layoutNode;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private NodeCoordinator wrapped;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private NodeCoordinator wrappedBy;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private boolean isClipping;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.e
    private yh.l<? super androidx.compose.ui.graphics.v0, b2> f15237m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private s1.e f15238n;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private LayoutDirection layerLayoutDirection;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private float lastLayerAlpha;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.ui.layout.j0 _measureResult;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private i0 lookaheadDelegate;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Map<androidx.compose.ui.layout.a, Integer> oldAlignmentLines;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private long position;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private float zIndex;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.e
    private MutableRect f15246v;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private r layerPositionalProperties;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    private final yh.a<b2> f15248x;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private boolean lastLayerDrawingWasSkipped;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private z0 layer;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    @dl.d
    private static final yh.l<NodeCoordinator, b2> D = new yh.l<NodeCoordinator, b2>() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayerParams$1
        public final void a(@dl.d NodeCoordinator coordinator) {
            kotlin.jvm.internal.f0.p(coordinator, "coordinator");
            if (coordinator.isValid()) {
                r rVar = coordinator.layerPositionalProperties;
                if (rVar == null) {
                    coordinator.I3();
                    return;
                }
                NodeCoordinator.G.b(rVar);
                coordinator.I3();
                if (NodeCoordinator.G.c(rVar)) {
                    return;
                }
                LayoutNode layoutNode = coordinator.getLayoutNode();
                LayoutNodeLayoutDelegate layoutDelegate = layoutNode.getLayoutDelegate();
                if (layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
                    if (layoutDelegate.getCoordinatesAccessedDuringPlacement()) {
                        LayoutNode.o1(layoutNode, false, 1, null);
                    }
                    layoutDelegate.getMeasurePassDelegate().d2();
                }
                b1 owner = layoutNode.getOwner();
                if (owner != null) {
                    owner.e(layoutNode);
                }
            }
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ b2 invoke(NodeCoordinator nodeCoordinator) {
            a(nodeCoordinator);
            return b2.f124493a;
        }
    };

    @dl.d
    private static final yh.l<NodeCoordinator, b2> E = new yh.l<NodeCoordinator, b2>() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayer$1
        public final void a(@dl.d NodeCoordinator coordinator) {
            kotlin.jvm.internal.f0.p(coordinator, "coordinator");
            z0 layer = coordinator.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ b2 invoke(NodeCoordinator nodeCoordinator) {
            a(nodeCoordinator);
            return b2.f124493a;
        }
    };

    @dl.d
    private static final androidx.compose.ui.graphics.b2 F = new androidx.compose.ui.graphics.b2();

    @dl.d
    private static final r G = new r();

    @dl.d
    private static final float[] H = androidx.compose.ui.graphics.c1.c(null, 1, null);

    @dl.d
    private static final d<f1> I = new a();

    @dl.d
    private static final d<j1> J = new b();

    /* JADX INFO: compiled from: NodeCoordinator.kt */
    @Metadata(bv = {}, d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016JC\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"androidx/compose/ui/node/NodeCoordinator$a", "Landroidx/compose/ui/node/NodeCoordinator$d;", "Landroidx/compose/ui/node/f1;", "Landroidx/compose/ui/node/v0;", ak.av, "()I", "node", "", "e", "Landroidx/compose/ui/node/LayoutNode;", "parentLayoutNode", "d", "layoutNode", "Lb1/f;", "pointerPosition", "Landroidx/compose/ui/node/k;", "hitTestResult", "isTouchEvent", "isInLayer", "Lkotlin/b2;", "b", "(Landroidx/compose/ui/node/LayoutNode;JLandroidx/compose/ui/node/k;ZZ)V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements d<f1> {
        a() {
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.d
        public int a() {
            return x0.f15398a.i();
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.d
        public void b(@dl.d LayoutNode layoutNode, long pointerPosition, @dl.d k<f1> hitTestResult, boolean isTouchEvent, boolean isInLayer) {
            kotlin.jvm.internal.f0.p(layoutNode, "layoutNode");
            kotlin.jvm.internal.f0.p(hitTestResult, "hitTestResult");
            layoutNode.C0(pointerPosition, hitTestResult, isTouchEvent, isInLayer);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.d
        public boolean d(@dl.d LayoutNode parentLayoutNode) {
            kotlin.jvm.internal.f0.p(parentLayoutNode, "parentLayoutNode");
            return true;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean c(@dl.d f1 node) {
            kotlin.jvm.internal.f0.p(node, "node");
            return node.f();
        }
    }

    /* JADX INFO: compiled from: NodeCoordinator.kt */
    @Metadata(bv = {}, d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016JC\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"androidx/compose/ui/node/NodeCoordinator$b", "Landroidx/compose/ui/node/NodeCoordinator$d;", "Landroidx/compose/ui/node/j1;", "Landroidx/compose/ui/node/v0;", ak.av, "()I", "node", "", "e", "Landroidx/compose/ui/node/LayoutNode;", "parentLayoutNode", "d", "layoutNode", "Lb1/f;", "pointerPosition", "Landroidx/compose/ui/node/k;", "hitTestResult", "isTouchEvent", "isInLayer", "Lkotlin/b2;", "b", "(Landroidx/compose/ui/node/LayoutNode;JLandroidx/compose/ui/node/k;ZZ)V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class b implements d<j1> {
        b() {
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.d
        public int a() {
            return x0.f15398a.j();
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.d
        public void b(@dl.d LayoutNode layoutNode, long pointerPosition, @dl.d k<j1> hitTestResult, boolean isTouchEvent, boolean isInLayer) {
            kotlin.jvm.internal.f0.p(layoutNode, "layoutNode");
            kotlin.jvm.internal.f0.p(hitTestResult, "hitTestResult");
            layoutNode.E0(pointerPosition, hitTestResult, isTouchEvent, isInLayer);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.d
        public boolean d(@dl.d LayoutNode parentLayoutNode) {
            androidx.compose.ui.semantics.j jVarA;
            kotlin.jvm.internal.f0.p(parentLayoutNode, "parentLayoutNode");
            j1 j1VarK = androidx.compose.ui.semantics.n.k(parentLayoutNode);
            boolean z10 = false;
            if (j1VarK != null && (jVarA = k1.a(j1VarK)) != null && jVarA.getIsClearingSemantics()) {
                z10 = true;
            }
            return !z10;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean c(@dl.d j1 node) {
            kotlin.jvm.internal.f0.p(node, "node");
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.node.NodeCoordinator$c, reason: from kotlin metadata */
    /* JADX INFO: compiled from: NodeCoordinator.kt */
    @Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010\tR#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001d\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator$c;", "", "Landroidx/compose/ui/node/NodeCoordinator$d;", "Landroidx/compose/ui/node/f1;", "PointerInputSource", "Landroidx/compose/ui/node/NodeCoordinator$d;", ak.av, "()Landroidx/compose/ui/node/NodeCoordinator$d;", "getPointerInputSource$annotations", "()V", "Landroidx/compose/ui/node/j1;", "SemanticsSource", ak.aF, "", "ExpectAttachedLayoutCoordinates", "Ljava/lang/String;", "UnmeasuredError", "Landroidx/compose/ui/graphics/b2;", "graphicsLayerScope", "Landroidx/compose/ui/graphics/b2;", "Lkotlin/Function1;", "Landroidx/compose/ui/node/NodeCoordinator;", "Lkotlin/b2;", "onCommitAffectingLayer", "Lyh/l;", "onCommitAffectingLayerParams", "Landroidx/compose/ui/node/r;", "tmpLayerPositionalProperties", "Landroidx/compose/ui/node/r;", "Landroidx/compose/ui/graphics/c1;", "tmpMatrix", "[F", "<init>", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        public static /* synthetic */ void b() {
        }

        @dl.d
        public final d<f1> a() {
            return NodeCoordinator.I;
        }

        @dl.d
        public final d<j1> c() {
            return NodeCoordinator.J;
        }
    }

    /* JADX INFO: compiled from: NodeCoordinator.kt */
    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH&JC\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH&ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0016\u0010\u0017ø\u0001\u0003\u0082\u0002\u0015\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator$d;", "Landroidx/compose/ui/node/c;", "N", "", "Landroidx/compose/ui/node/v0;", ak.av, "()I", "node", "", ak.aF, "(Landroidx/compose/ui/node/c;)Z", "Landroidx/compose/ui/node/LayoutNode;", "parentLayoutNode", "d", "layoutNode", "Lb1/f;", "pointerPosition", "Landroidx/compose/ui/node/k;", "hitTestResult", "isTouchEvent", "isInLayer", "Lkotlin/b2;", "b", "(Landroidx/compose/ui/node/LayoutNode;JLandroidx/compose/ui/node/k;ZZ)V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public interface d<N extends c> {
        int a();

        void b(@dl.d LayoutNode layoutNode, long pointerPosition, @dl.d k<N> hitTestResult, boolean isTouchEvent, boolean isInLayer);

        boolean c(@dl.d N node);

        boolean d(@dl.d LayoutNode parentLayoutNode);
    }

    public NodeCoordinator(@dl.d LayoutNode layoutNode) {
        kotlin.jvm.internal.f0.p(layoutNode, "layoutNode");
        this.layoutNode = layoutNode;
        this.f15238n = getLayoutNode().getF15149p();
        this.layerLayoutDirection = getLayoutNode().getLayoutDirection();
        this.lastLayerAlpha = 0.8f;
        this.position = s1.n.f139237b.a();
        this.f15248x = new yh.a<b2>() { // from class: androidx.compose.ui.node.NodeCoordinator$invalidateParentLayer$1
            {
                super(0);
            }

            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                NodeCoordinator wrappedBy = this.f15268b.getWrappedBy();
                if (wrappedBy != null) {
                    wrappedBy.f3();
                }
            }
        };
    }

    private final long A2(NodeCoordinator ancestor, long offset) {
        if (ancestor == this) {
            return offset;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        return (nodeCoordinator == null || kotlin.jvm.internal.f0.g(ancestor, nodeCoordinator)) ? K2(offset) : K2(nodeCoordinator.A2(ancestor, offset));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends c> void C3(final T t10, final d<T> dVar, final long j10, final k<T> kVar, final boolean z10, final boolean z11, final float f10) {
        if (t10 == null) {
            e3(dVar, j10, kVar, z10, z11);
        } else if (dVar.c(t10)) {
            kVar.x(t10, f10, z11, new yh.a<b2>() { // from class: androidx.compose.ui.node.NodeCoordinator$speculativeHit$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/ui/node/NodeCoordinator;TT;Landroidx/compose/ui/node/NodeCoordinator$d<TT;>;JLandroidx/compose/ui/node/k<TT;>;ZZF)V */
                {
                    super(0);
                }

                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.f15271b.C3((c) u0.b(t10, dVar.a(), x0.f15398a.e()), dVar, j10, kVar, z10, z11, f10);
                }
            });
        } else {
            C3((c) u0.b(t10, dVar.a(), x0.f15398a.e()), dVar, j10, kVar, z10, z11, f10);
        }
    }

    private final NodeCoordinator D3(androidx.compose.ui.layout.q qVar) {
        NodeCoordinator nodeCoordinatorB;
        androidx.compose.ui.layout.b0 b0Var = qVar instanceof androidx.compose.ui.layout.b0 ? (androidx.compose.ui.layout.b0) qVar : null;
        if (b0Var != null && (nodeCoordinatorB = b0Var.b()) != null) {
            return nodeCoordinatorB;
        }
        kotlin.jvm.internal.f0.n(qVar, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (NodeCoordinator) qVar;
    }

    private final void G3(NodeCoordinator ancestor, float[] matrix) {
        if (kotlin.jvm.internal.f0.g(ancestor, this)) {
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        kotlin.jvm.internal.f0.m(nodeCoordinator);
        nodeCoordinator.G3(ancestor, matrix);
        if (!s1.n.j(getPosition(), s1.n.f139237b.a())) {
            float[] fArr = H;
            androidx.compose.ui.graphics.c1.m(fArr);
            androidx.compose.ui.graphics.c1.x(fArr, -s1.n.m(getPosition()), -s1.n.o(getPosition()), 0.0f, 4, null);
            androidx.compose.ui.graphics.c1.u(matrix, fArr);
        }
        z0 z0Var = this.layer;
        if (z0Var != null) {
            z0Var.i(matrix);
        }
    }

    private final void H3(NodeCoordinator ancestor, float[] matrix) {
        NodeCoordinator nodeCoordinator = this;
        while (!kotlin.jvm.internal.f0.g(nodeCoordinator, ancestor)) {
            z0 z0Var = nodeCoordinator.layer;
            if (z0Var != null) {
                z0Var.d(matrix);
            }
            long position = nodeCoordinator.getPosition();
            if (!s1.n.j(position, s1.n.f139237b.a())) {
                float[] fArr = H;
                androidx.compose.ui.graphics.c1.m(fArr);
                androidx.compose.ui.graphics.c1.x(fArr, s1.n.m(position), s1.n.o(position), 0.0f, 4, null);
                androidx.compose.ui.graphics.c1.u(matrix, fArr);
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            kotlin.jvm.internal.f0.m(nodeCoordinator);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I2(androidx.compose.ui.graphics.d0 d0Var) {
        int iB = x0.f15398a.b();
        boolean zC = w0.c(iB);
        h hVar = null;
        androidx.compose.ui.n.d dVarT2 = getTail();
        if (zC || (dVarT2 = dVarT2.getParent()) != null) {
            for (androidx.compose.ui.n.d dVarZ2 = Z2(zC); dVarZ2 != null && (dVarZ2.getAggregateChildKindSet() & iB) != 0; dVarZ2 = dVarZ2.getChild()) {
                if ((dVarZ2.getKindSet() & iB) != 0) {
                    hVar = dVarZ2 instanceof h ? dVarZ2 : null;
                    break;
                } else {
                    if (dVarZ2 == dVarT2) {
                        break;
                    }
                }
            }
        }
        h hVar2 = hVar;
        if (hVar2 == null) {
            q3(d0Var);
        } else {
            getLayoutNode().j0().b(d0Var, s1.s.f(a()), this, hVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I3() {
        z0 z0Var = this.layer;
        if (z0Var != null) {
            final yh.l<? super androidx.compose.ui.graphics.v0, b2> lVar = this.f15237m;
            if (lVar == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            androidx.compose.ui.graphics.b2 b2Var = F;
            b2Var.g();
            b2Var.h(getLayoutNode().getF15149p());
            S2().i(this, D, new yh.a<b2>() { // from class: androidx.compose.ui.node.NodeCoordinator$updateLayerParameters$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    lVar.invoke(NodeCoordinator.F);
                }
            });
            r rVar = this.layerPositionalProperties;
            if (rVar == null) {
                rVar = new r();
                this.layerPositionalProperties = rVar;
            }
            rVar.a(b2Var);
            z0Var.a(b2Var.getScaleX(), b2Var.getScaleY(), b2Var.getAlpha(), b2Var.getTranslationX(), b2Var.getTranslationY(), b2Var.getShadowElevation(), b2Var.getRotationX(), b2Var.getRotationY(), b2Var.getRotationZ(), b2Var.getCameraDistance(), b2Var.getTransformOrigin(), b2Var.getShape(), b2Var.getClip(), b2Var.getRenderEffect(), b2Var.getAmbientShadowColor(), b2Var.getSpotShadowColor(), getLayoutNode().getLayoutDirection(), getLayoutNode().getF15149p());
            this.isClipping = b2Var.getClip();
        } else {
            if (!(this.f15237m == null)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        this.lastLayerAlpha = F.getAlpha();
        b1 b1VarU0 = getLayoutNode().getOwner();
        if (b1VarU0 != null) {
            b1VarU0.t(getLayoutNode());
        }
    }

    private final void L2(MutableRect dVar, boolean z10) {
        float fM = s1.n.m(getPosition());
        dVar.m(dVar.getF30360a() - fM);
        dVar.n(dVar.getF30362c() - fM);
        float fO = s1.n.o(getPosition());
        dVar.o(dVar.getF30361b() - fO);
        dVar.l(dVar.getF30363d() - fO);
        z0 z0Var = this.layer;
        if (z0Var != null) {
            z0Var.c(dVar, true);
            if (this.isClipping && z10) {
                dVar.i(0.0f, 0.0f, s1.r.m(a()), s1.r.j(a()));
                dVar.j();
            }
        }
    }

    private final OwnerSnapshotObserver S2() {
        return d0.b(getLayoutNode()).getSnapshotObserver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.n.d Z2(boolean includeTail) {
        androidx.compose.ui.n.d dVarT2;
        if (getLayoutNode().t0() == this) {
            return getLayoutNode().getNodes().getHead();
        }
        if (!includeTail) {
            NodeCoordinator nodeCoordinator = this.wrappedBy;
            if (nodeCoordinator != null) {
                return nodeCoordinator.getTail();
            }
            return null;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        if (nodeCoordinator2 == null || (dVarT2 = nodeCoordinator2.getTail()) == null) {
            return null;
        }
        return dVarT2.getChild();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T extends c> void b3(final T t10, final d<T> dVar, final long j10, final k<T> kVar, final boolean z10, final boolean z11) {
        if (t10 == null) {
            e3(dVar, j10, kVar, z10, z11);
        } else {
            kVar.o(t10, z11, new yh.a<b2>() { // from class: androidx.compose.ui.node.NodeCoordinator$hit$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/ui/node/NodeCoordinator;TT;Landroidx/compose/ui/node/NodeCoordinator$d<TT;>;JLandroidx/compose/ui/node/k<TT;>;ZZ)V */
                {
                    super(0);
                }

                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.f15253b.b3((c) u0.b(t10, dVar.a(), x0.f15398a.e()), dVar, j10, kVar, z10, z11);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T extends c> void c3(final T t10, final d<T> dVar, final long j10, final k<T> kVar, final boolean z10, final boolean z11, final float f10) {
        if (t10 == null) {
            e3(dVar, j10, kVar, z10, z11);
        } else {
            kVar.s(t10, f10, z11, new yh.a<b2>() { // from class: androidx.compose.ui.node.NodeCoordinator$hitNear$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/ui/node/NodeCoordinator;TT;Landroidx/compose/ui/node/NodeCoordinator$d<TT;>;JLandroidx/compose/ui/node/k<TT;>;ZZF)V */
                {
                    super(0);
                }

                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.f15260b.c3((c) u0.b(t10, dVar.a(), x0.f15398a.e()), dVar, j10, kVar, z10, z11, f10);
                }
            });
        }
    }

    private final long j3(long pointerPosition) {
        float fP = b1.f.p(pointerPosition);
        float fMax = Math.max(0.0f, fP < 0.0f ? -fP : fP - k());
        float fR = b1.f.r(pointerPosition);
        return b1.g.a(fMax, Math.max(0.0f, fR < 0.0f ? -fR : fR - W()));
    }

    static /* synthetic */ Object t3(NodeCoordinator nodeCoordinator, b1.i iVar, kotlin.coroutines.c cVar) {
        Object objS3;
        NodeCoordinator nodeCoordinator2 = nodeCoordinator.wrappedBy;
        return (nodeCoordinator2 != null && (objS3 = nodeCoordinator2.s3(iVar.S(nodeCoordinator2.x(nodeCoordinator, false).E()), cVar)) == kotlin.coroutines.intrinsics.b.h()) ? objS3 : b2.f124493a;
    }

    public static /* synthetic */ void v3(NodeCoordinator nodeCoordinator, MutableRect dVar, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        nodeCoordinator.u3(dVar, z10, z11);
    }

    private final void z2(NodeCoordinator nodeCoordinator, MutableRect dVar, boolean z10) {
        if (nodeCoordinator == this) {
            return;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        if (nodeCoordinator2 != null) {
            nodeCoordinator2.z2(nodeCoordinator, dVar, z10);
        }
        L2(dVar, z10);
    }

    @Override // androidx.compose.ui.layout.q
    @dl.d
    public Set<androidx.compose.ui.layout.a> A1() {
        LinkedHashSet linkedHashSet = null;
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.wrapped) {
            androidx.compose.ui.layout.j0 j0Var = nodeCoordinator._measureResult;
            Map<androidx.compose.ui.layout.a, Integer> mapI = j0Var != null ? j0Var.i() : null;
            boolean z10 = false;
            if (mapI != null && (!mapI.isEmpty())) {
                z10 = true;
            }
            if (z10) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.addAll(mapI.keySet());
            }
        }
        return linkedHashSet == null ? kotlin.collections.d1.k() : linkedHashSet;
    }

    protected final void A3(float f10) {
        this.zIndex = f10;
    }

    public void B2() {
        l3(this.f15237m);
    }

    public final boolean B3() {
        x0 x0Var = x0.f15398a;
        androidx.compose.ui.n.d dVarZ2 = Z2(w0.c(x0Var.i()));
        if (dVarZ2 == null) {
            return false;
        }
        int i10 = x0Var.i();
        if (!dVarZ2.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        androidx.compose.ui.n.d node = dVarZ2.getNode();
        if ((node.getAggregateChildKindSet() & i10) != 0) {
            for (androidx.compose.ui.n.d child = node.getChild(); child != null; child = child.getChild()) {
                if ((child.getKindSet() & i10) != 0 && (child instanceof f1) && ((f1) child).s()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // s1.e
    /* JADX INFO: renamed from: C1 */
    public float getF139218c() {
        return getLayoutNode().getF15149p().getF139218c();
    }

    protected final long C2(long minimumTouchTargetSize) {
        return b1.n.a(Math.max(0.0f, (b1.m.t(minimumTouchTargetSize) - k()) / 2.0f), Math.max(0.0f, (b1.m.m(minimumTouchTargetSize) - W()) / 2.0f));
    }

    @Override // androidx.compose.ui.layout.q
    @dl.e
    public final androidx.compose.ui.layout.q D() {
        if (p()) {
            return getLayoutNode().t0().wrappedBy;
        }
        throw new IllegalStateException(B.toString());
    }

    @dl.d
    public abstract i0 D2(@dl.d androidx.compose.ui.layout.f0 scope);

    public void E2() {
        l3(this.f15237m);
        LayoutNode layoutNodeV0 = getLayoutNode().v0();
        if (layoutNodeV0 != null) {
            layoutNodeV0.I0();
        }
    }

    public long E3(long position) {
        z0 z0Var = this.layer;
        if (z0Var != null) {
            position = z0Var.f(position, false);
        }
        return s1.o.e(position, getPosition());
    }

    protected final float F2(long pointerPosition, long minimumTouchTargetSize) {
        if (k() >= b1.m.t(minimumTouchTargetSize) && W() >= b1.m.m(minimumTouchTargetSize)) {
            return Float.POSITIVE_INFINITY;
        }
        long jC2 = C2(minimumTouchTargetSize);
        float fT = b1.m.t(jC2);
        float fM = b1.m.m(jC2);
        long jJ3 = j3(pointerPosition);
        if ((fT > 0.0f || fM > 0.0f) && b1.f.p(jJ3) <= fT && b1.f.r(jJ3) <= fM) {
            return b1.f.n(jJ3);
        }
        return Float.POSITIVE_INFINITY;
    }

    @dl.d
    public final b1.i F3() {
        if (!p()) {
            return b1.i.f30369e.a();
        }
        androidx.compose.ui.layout.q qVarD = androidx.compose.ui.layout.r.d(this);
        MutableRect dVarR2 = R2();
        long jC2 = C2(Q2());
        dVarR2.m(-b1.m.t(jC2));
        dVarR2.o(-b1.m.m(jC2));
        dVarR2.n(k() + b1.m.t(jC2));
        dVarR2.l(W() + b1.m.m(jC2));
        NodeCoordinator nodeCoordinator = this;
        while (nodeCoordinator != qVarD) {
            nodeCoordinator.u3(dVarR2, false, true);
            if (dVarR2.j()) {
                return b1.i.f30369e.a();
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            kotlin.jvm.internal.f0.m(nodeCoordinator);
        }
        return b1.e.a(dVarR2);
    }

    public final void G2(@dl.d androidx.compose.ui.graphics.d0 canvas) {
        kotlin.jvm.internal.f0.p(canvas, "canvas");
        z0 z0Var = this.layer;
        if (z0Var != null) {
            z0Var.b(canvas);
            return;
        }
        float fM = s1.n.m(getPosition());
        float fO = s1.n.o(getPosition());
        canvas.b(fM, fO);
        I2(canvas);
        canvas.b(-fM, -fO);
    }

    protected final void H2(@dl.d androidx.compose.ui.graphics.d0 canvas, @dl.d androidx.compose.ui.graphics.h1 paint) {
        kotlin.jvm.internal.f0.p(canvas, "canvas");
        kotlin.jvm.internal.f0.p(paint, "paint");
        canvas.A(new b1.i(0.5f, 0.5f, s1.r.m(getMeasuredSize()) - 0.5f, s1.r.j(getMeasuredSize()) - 0.5f), paint);
    }

    @dl.d
    public final NodeCoordinator J2(@dl.d NodeCoordinator other) {
        kotlin.jvm.internal.f0.p(other, "other");
        LayoutNode layoutNode = other.getLayoutNode();
        LayoutNode layoutNode2 = getLayoutNode();
        if (layoutNode == layoutNode2) {
            androidx.compose.ui.n.d dVarT2 = other.getTail();
            androidx.compose.ui.n.d dVarT3 = getTail();
            int iE = x0.f15398a.e();
            if (!dVarT3.getNode().getIsAttached()) {
                throw new IllegalStateException("Check failed.".toString());
            }
            for (androidx.compose.ui.n.d parent = dVarT3.getNode().getParent(); parent != null; parent = parent.getParent()) {
                if ((parent.getKindSet() & iE) != 0 && parent == dVarT2) {
                    return other;
                }
            }
            return this;
        }
        while (layoutNode.getCom.alipay.zoloz.toyger.face.ToygerFaceAlgorithmConfig.DEPTH java.lang.String() > layoutNode2.getCom.alipay.zoloz.toyger.face.ToygerFaceAlgorithmConfig.DEPTH java.lang.String()) {
            layoutNode = layoutNode.v0();
            kotlin.jvm.internal.f0.m(layoutNode);
        }
        while (layoutNode2.getCom.alipay.zoloz.toyger.face.ToygerFaceAlgorithmConfig.DEPTH java.lang.String() > layoutNode.getCom.alipay.zoloz.toyger.face.ToygerFaceAlgorithmConfig.DEPTH java.lang.String()) {
            layoutNode2 = layoutNode2.v0();
            kotlin.jvm.internal.f0.m(layoutNode2);
        }
        while (layoutNode != layoutNode2) {
            layoutNode = layoutNode.v0();
            layoutNode2 = layoutNode2.v0();
            if (layoutNode == null || layoutNode2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (layoutNode2 == getLayoutNode()) {
            return this;
        }
        return layoutNode == other.getLayoutNode() ? other : layoutNode.Y();
    }

    protected final void J3(@dl.d i0 lookaheadDelegate) {
        kotlin.jvm.internal.f0.p(lookaheadDelegate, "lookaheadDelegate");
        this.lookaheadDelegate = lookaheadDelegate;
    }

    public long K2(long position) {
        long jC = s1.o.c(position, getPosition());
        z0 z0Var = this.layer;
        return z0Var != null ? z0Var.f(jC, true) : jC;
    }

    public final void K3(@dl.e androidx.compose.ui.layout.f0 scope) {
        i0 i0VarD2 = null;
        if (scope != null) {
            i0 i0Var = this.lookaheadDelegate;
            i0VarD2 = !kotlin.jvm.internal.f0.g(scope, i0Var != null ? i0Var.getLookaheadScope() : null) ? D2(scope) : this.lookaheadDelegate;
        }
        this.lookaheadDelegate = i0VarD2;
    }

    @Override // androidx.compose.ui.layout.q
    public long L(long relativeToLocal) {
        if (!p()) {
            throw new IllegalStateException(B.toString());
        }
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.wrappedBy) {
            relativeToLocal = nodeCoordinator.E3(relativeToLocal);
        }
        return relativeToLocal;
    }

    public final void L3(int i10, boolean z10, @dl.d yh.l<? super androidx.compose.ui.n.d, b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        androidx.compose.ui.n.d dVarT2 = getTail();
        if (!z10 && (dVarT2 = dVarT2.getParent()) == null) {
            return;
        }
        for (androidx.compose.ui.n.d dVarZ2 = Z2(z10); dVarZ2 != null && (dVarZ2.getAggregateChildKindSet() & i10) != 0; dVarZ2 = dVarZ2.getChild()) {
            if ((dVarZ2.getKindSet() & i10) != 0) {
                block.invoke(dVarZ2);
            }
            if (dVarZ2 == dVarT2) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: M2, reason: from getter */
    public final boolean getLastLayerDrawingWasSkipped() {
        return this.lastLayerDrawingWasSkipped;
    }

    public final /* synthetic */ <T> void M3(int type, yh.l<? super T, b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        boolean zC = w0.c(type);
        androidx.compose.ui.n.d dVarT2 = getTail();
        if (!zC && (dVarT2 = dVarT2.getParent()) == null) {
            return;
        }
        for (androidx.compose.ui.n.d dVarZ2 = Z2(zC); dVarZ2 != null && (dVarZ2.getAggregateChildKindSet() & type) != 0; dVarZ2 = dVarZ2.getChild()) {
            if ((dVarZ2.getKindSet() & type) != 0) {
                kotlin.jvm.internal.f0.y(3, androidx.exifinterface.media.a.f23244d5);
                block.invoke(dVarZ2);
            }
            if (dVarZ2 == dVarT2) {
                return;
            }
        }
    }

    @dl.e
    /* JADX INFO: renamed from: N2, reason: from getter */
    public final z0 getLayer() {
        return this.layer;
    }

    protected final void N3(@dl.d androidx.compose.ui.graphics.d0 canvas, @dl.d yh.l<? super androidx.compose.ui.graphics.d0, b2> block) {
        kotlin.jvm.internal.f0.p(canvas, "canvas");
        kotlin.jvm.internal.f0.p(block, "block");
        float fM = s1.n.m(getPosition());
        float fO = s1.n.o(getPosition());
        canvas.b(fM, fO);
        block.invoke(canvas);
        canvas.b(-fM, -fO);
    }

    @dl.e
    protected final yh.l<androidx.compose.ui.graphics.v0, b2> O2() {
        return this.f15237m;
    }

    protected final boolean O3(long pointerPosition) {
        if (!b1.g.b(pointerPosition)) {
            return false;
        }
        z0 z0Var = this.layer;
        return z0Var == null || !this.isClipping || z0Var.h(pointerPosition);
    }

    @Override // androidx.compose.ui.node.h0, androidx.compose.ui.node.l0
    @dl.d
    /* JADX INFO: renamed from: P0, reason: from getter */
    public LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    @dl.e
    /* JADX INFO: renamed from: P2, reason: from getter */
    public final i0 getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    public final long Q2() {
        return this.f15238n.J(getLayoutNode().getViewConfiguration().e());
    }

    @dl.d
    protected final MutableRect R2() {
        MutableRect dVar = this.f15246v;
        if (dVar != null) {
            return dVar;
        }
        MutableRect dVar2 = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
        this.f15246v = dVar2;
        return dVar2;
    }

    @dl.d
    /* JADX INFO: renamed from: T2 */
    public abstract androidx.compose.ui.n.d getTail();

    @Override // androidx.compose.ui.layout.e1
    protected void U1(long position, float zIndex, @dl.e yh.l<? super androidx.compose.ui.graphics.v0, b2> layerBlock) {
        l3(layerBlock);
        if (!s1.n.j(getPosition(), position)) {
            x3(position);
            getLayoutNode().getLayoutDelegate().getMeasurePassDelegate().d2();
            z0 z0Var = this.layer;
            if (z0Var != null) {
                z0Var.j(position);
            } else {
                NodeCoordinator nodeCoordinator = this.wrappedBy;
                if (nodeCoordinator != null) {
                    nodeCoordinator.f3();
                }
            }
            g2(this);
            b1 b1VarU0 = getLayoutNode().getOwner();
            if (b1VarU0 != null) {
                b1VarU0.t(getLayoutNode());
            }
        }
        this.zIndex = zIndex;
    }

    @dl.e
    /* JADX INFO: renamed from: U2, reason: from getter */
    public final NodeCoordinator getWrapped() {
        return this.wrapped;
    }

    @dl.e
    /* JADX INFO: renamed from: V2, reason: from getter */
    public final NodeCoordinator getWrappedBy() {
        return this.wrappedBy;
    }

    /* JADX INFO: renamed from: W2, reason: from getter */
    public final float getZIndex() {
        return this.zIndex;
    }

    public final boolean X2(int type) {
        androidx.compose.ui.n.d dVarZ2 = Z2(w0.c(type));
        return dVarZ2 != null && androidx.compose.ui.node.d.c(dVarZ2, type);
    }

    public final /* synthetic */ <T> T Y2(int type) {
        boolean zC = w0.c(type);
        androidx.compose.ui.n.d dVarT2 = getTail();
        if (!zC && (dVarT2 = dVarT2.getParent()) == null) {
            return null;
        }
        for (Object obj = (T) Z2(zC); obj != null && (((androidx.compose.ui.n.d) obj).getAggregateChildKindSet() & type) != 0; obj = (T) ((androidx.compose.ui.n.d) obj).getChild()) {
            if ((((androidx.compose.ui.n.d) obj).getKindSet() & type) != 0) {
                kotlin.jvm.internal.f0.y(2, androidx.exifinterface.media.a.f23244d5);
                return (T) obj;
            }
            if (obj == dVarT2) {
                return null;
            }
        }
        return null;
    }

    @Override // androidx.compose.ui.node.h0
    @dl.d
    public androidx.compose.ui.node.a Z1() {
        return getLayoutNode().getLayoutDelegate().l();
    }

    @Override // androidx.compose.ui.layout.q
    public final long a() {
        return getMeasuredSize();
    }

    @Override // androidx.compose.ui.layout.q
    public long a0(@dl.d androidx.compose.ui.layout.q sourceCoordinates, long relativeToSource) {
        kotlin.jvm.internal.f0.p(sourceCoordinates, "sourceCoordinates");
        NodeCoordinator nodeCoordinatorD3 = D3(sourceCoordinates);
        NodeCoordinator nodeCoordinatorJ2 = J2(nodeCoordinatorD3);
        while (nodeCoordinatorD3 != nodeCoordinatorJ2) {
            relativeToSource = nodeCoordinatorD3.E3(relativeToSource);
            nodeCoordinatorD3 = nodeCoordinatorD3.wrappedBy;
            kotlin.jvm.internal.f0.m(nodeCoordinatorD3);
        }
        return A2(nodeCoordinatorJ2, relativeToSource);
    }

    @Override // androidx.compose.ui.node.h0
    @dl.e
    public h0 a2() {
        return this.wrapped;
    }

    @dl.e
    public final <T> T a3(int type) {
        boolean zC = w0.c(type);
        androidx.compose.ui.n.d dVarT2 = getTail();
        if (!zC && (dVarT2 = dVarT2.getParent()) == null) {
            return null;
        }
        for (Object obj = (T) Z2(zC); obj != null && (((androidx.compose.ui.n.d) obj).getAggregateChildKindSet() & type) != 0; obj = (T) ((androidx.compose.ui.n.d) obj).getChild()) {
            if ((((androidx.compose.ui.n.d) obj).getKindSet() & type) != 0) {
                return (T) obj;
            }
            if (obj == dVarT2) {
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [T, java.lang.Object] */
    @Override // androidx.compose.ui.layout.e1, androidx.compose.ui.layout.n0
    @dl.e
    /* JADX INFO: renamed from: b */
    public Object getParentData() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        androidx.compose.ui.n.d dVarT2 = getTail();
        s1.e density = getLayoutNode().getF15149p();
        for (androidx.compose.ui.n.d dVarR = getLayoutNode().getNodes().getTail(); dVarR != null; dVarR = dVarR.getParent()) {
            if (dVarR != dVarT2) {
                if (((x0.f15398a.h() & dVarR.getKindSet()) != 0) && (dVarR instanceof d1)) {
                    objectRef.f124891b = ((d1) dVarR).V(density, objectRef.f124891b);
                }
            }
        }
        return objectRef.f124891b;
    }

    @Override // androidx.compose.ui.node.h0
    @dl.d
    public androidx.compose.ui.layout.q b2() {
        return this;
    }

    @Override // androidx.compose.ui.layout.q
    @dl.e
    public final androidx.compose.ui.layout.q c0() {
        if (p()) {
            return this.wrappedBy;
        }
        throw new IllegalStateException(B.toString());
    }

    @Override // androidx.compose.ui.node.h0
    public boolean c2() {
        return this._measureResult != null;
    }

    @Override // androidx.compose.ui.node.h0
    @dl.d
    public androidx.compose.ui.layout.j0 d2() {
        androidx.compose.ui.layout.j0 j0Var = this._measureResult;
        if (j0Var != null) {
            return j0Var;
        }
        throw new IllegalStateException(C.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends c> void d3(@dl.d d<T> hitTestSource, long pointerPosition, @dl.d k<T> hitTestResult, boolean isTouchEvent, boolean isInLayer) {
        kotlin.jvm.internal.f0.p(hitTestSource, "hitTestSource");
        kotlin.jvm.internal.f0.p(hitTestResult, "hitTestResult");
        c cVar = (c) a3(hitTestSource.a());
        if (!O3(pointerPosition)) {
            if (isTouchEvent) {
                float fF2 = F2(pointerPosition, Q2());
                if (((Float.isInfinite(fF2) || Float.isNaN(fF2)) ? false : true) && hitTestResult.u(fF2, false)) {
                    c3(cVar, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, false, fF2);
                    return;
                }
                return;
            }
            return;
        }
        if (cVar == null) {
            e3(hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer);
            return;
        }
        if (h3(pointerPosition)) {
            b3(cVar, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer);
            return;
        }
        float fF3 = !isTouchEvent ? Float.POSITIVE_INFINITY : F2(pointerPosition, Q2());
        if (((Float.isInfinite(fF3) || Float.isNaN(fF3)) ? false : true) && hitTestResult.u(fF3, isInLayer)) {
            c3(cVar, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer, fF3);
        } else {
            C3(cVar, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer, fF3);
        }
    }

    @Override // androidx.compose.ui.node.h0
    @dl.e
    public h0 e2() {
        return this.wrappedBy;
    }

    public <T extends c> void e3(@dl.d d<T> hitTestSource, long pointerPosition, @dl.d k<T> hitTestResult, boolean isTouchEvent, boolean isInLayer) {
        kotlin.jvm.internal.f0.p(hitTestSource, "hitTestSource");
        kotlin.jvm.internal.f0.p(hitTestResult, "hitTestResult");
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.d3(hitTestSource, nodeCoordinator.K2(pointerPosition), hitTestResult, isTouchEvent, isInLayer);
        }
    }

    @Override // androidx.compose.ui.node.h0
    /* JADX INFO: renamed from: f2, reason: from getter */
    public long getPosition() {
        return this.position;
    }

    public void f3() {
        z0 z0Var = this.layer;
        if (z0Var != null) {
            z0Var.invalidate();
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            nodeCoordinator.f3();
        }
    }

    public void g3(@dl.d final androidx.compose.ui.graphics.d0 canvas) {
        kotlin.jvm.internal.f0.p(canvas, "canvas");
        if (!getLayoutNode().getIsPlaced()) {
            this.lastLayerDrawingWasSkipped = true;
        } else {
            S2().i(this, E, new yh.a<b2>() { // from class: androidx.compose.ui.node.NodeCoordinator.invoke.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    NodeCoordinator.this.I2(canvas);
                }
            });
            this.lastLayerDrawingWasSkipped = false;
        }
    }

    @Override // s1.e
    /* JADX INFO: renamed from: getDensity */
    public float getF139217b() {
        return getLayoutNode().getF15149p().getF139217b();
    }

    @Override // androidx.compose.ui.layout.n
    @dl.d
    public LayoutDirection getLayoutDirection() {
        return getLayoutNode().getLayoutDirection();
    }

    protected final boolean h3(long pointerPosition) {
        float fP = b1.f.p(pointerPosition);
        float fR = b1.f.r(pointerPosition);
        return fP >= 0.0f && fR >= 0.0f && fP < ((float) k()) && fR < ((float) W());
    }

    @Override // androidx.compose.ui.layout.q
    public long i0(long relativeToWindow) {
        if (!p()) {
            throw new IllegalStateException(B.toString());
        }
        androidx.compose.ui.layout.q qVarD = androidx.compose.ui.layout.r.d(this);
        return a0(qVarD, b1.f.u(d0.b(getLayoutNode()).m(relativeToWindow), androidx.compose.ui.layout.r.f(qVarD)));
    }

    public final boolean i3() {
        if (this.layer != null && this.lastLayerAlpha <= 0.0f) {
            return true;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            return nodeCoordinator.i3();
        }
        return false;
    }

    @Override // yh.l
    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.graphics.d0 d0Var) {
        g3(d0Var);
        return b2.f124493a;
    }

    @Override // androidx.compose.ui.node.c1
    public boolean isValid() {
        return this.layer != null && p();
    }

    @Override // androidx.compose.ui.node.h0
    public void j2() {
        U1(getPosition(), this.zIndex, this.f15237m);
    }

    public final void k3() {
        z0 z0Var = this.layer;
        if (z0Var != null) {
            z0Var.invalidate();
        }
    }

    public final void l3(@dl.e yh.l<? super androidx.compose.ui.graphics.v0, b2> lVar) {
        b1 b1VarU0;
        boolean z10 = (this.f15237m == lVar && kotlin.jvm.internal.f0.g(this.f15238n, getLayoutNode().getF15149p()) && this.layerLayoutDirection == getLayoutNode().getLayoutDirection()) ? false : true;
        this.f15237m = lVar;
        this.f15238n = getLayoutNode().getF15149p();
        this.layerLayoutDirection = getLayoutNode().getLayoutDirection();
        if (!p() || lVar == null) {
            z0 z0Var = this.layer;
            if (z0Var != null) {
                z0Var.destroy();
                getLayoutNode().v1(true);
                this.f15248x.invoke();
                if (p() && (b1VarU0 = getLayoutNode().getOwner()) != null) {
                    b1VarU0.t(getLayoutNode());
                }
            }
            this.layer = null;
            this.lastLayerDrawingWasSkipped = false;
            return;
        }
        if (this.layer != null) {
            if (z10) {
                I3();
                return;
            }
            return;
        }
        z0 z0VarO = d0.b(getLayoutNode()).o(this, this.f15248x);
        z0VarO.g(getMeasuredSize());
        z0VarO.j(getPosition());
        this.layer = z0VarO;
        I3();
        getLayoutNode().v1(true);
        this.f15248x.invoke();
    }

    public void m3() {
        z0 z0Var = this.layer;
        if (z0Var != null) {
            z0Var.invalidate();
        }
    }

    protected void n3(int i10, int i11) {
        z0 z0Var = this.layer;
        if (z0Var != null) {
            z0Var.g(s1.s.a(i10, i11));
        } else {
            NodeCoordinator nodeCoordinator = this.wrappedBy;
            if (nodeCoordinator != null) {
                nodeCoordinator.f3();
            }
        }
        b1 b1VarU0 = getLayoutNode().getOwner();
        if (b1VarU0 != null) {
            b1VarU0.t(getLayoutNode());
        }
        W1(s1.s.a(i10, i11));
        int iB = x0.f15398a.b();
        boolean zC = w0.c(iB);
        androidx.compose.ui.n.d dVarT2 = getTail();
        if (!zC && (dVarT2 = dVarT2.getParent()) == null) {
            return;
        }
        for (androidx.compose.ui.n.d dVarZ2 = Z2(zC); dVarZ2 != null && (dVarZ2.getAggregateChildKindSet() & iB) != 0; dVarZ2 = dVarZ2.getChild()) {
            if ((dVarZ2.getKindSet() & iB) != 0 && (dVarZ2 instanceof h)) {
                ((h) dVarZ2).n();
            }
            if (dVarZ2 == dVarT2) {
                return;
            }
        }
    }

    public final void o3() {
        androidx.compose.ui.n.d parent;
        x0 x0Var = x0.f15398a;
        if (X2(x0Var.f())) {
            androidx.compose.runtime.snapshots.f fVarA = androidx.compose.runtime.snapshots.f.INSTANCE.a();
            try {
                androidx.compose.runtime.snapshots.f fVarP = fVarA.p();
                try {
                    int iF = x0Var.f();
                    boolean zC = w0.c(iF);
                    if (!zC) {
                        parent = getTail().getParent();
                        if (parent == null) {
                        }
                        b2 b2Var = b2.f124493a;
                        fVarA.w(fVarP);
                        fVarA.d();
                    }
                    parent = getTail();
                    for (androidx.compose.ui.n.d dVarZ2 = Z2(zC); dVarZ2 != null && (dVarZ2.getAggregateChildKindSet() & iF) != 0; dVarZ2 = dVarZ2.getChild()) {
                        if ((dVarZ2.getKindSet() & iF) != 0 && (dVarZ2 instanceof t)) {
                            ((t) dVarZ2).L(getMeasuredSize());
                        }
                        if (dVarZ2 == parent) {
                            break;
                        }
                    }
                    b2 b2Var2 = b2.f124493a;
                    fVarA.w(fVarP);
                    fVarA.d();
                } catch (Throwable th2) {
                    fVarA.w(fVarP);
                    throw th2;
                }
            } catch (Throwable th3) {
                fVarA.d();
                throw th3;
            }
        }
    }

    @Override // androidx.compose.ui.layout.q
    public boolean p() {
        return getTail().getIsAttached();
    }

    public final void p3() {
        i0 i0Var = this.lookaheadDelegate;
        if (i0Var != null) {
            int iF = x0.f15398a.f();
            boolean zC = w0.c(iF);
            androidx.compose.ui.n.d dVarT2 = getTail();
            if (zC || (dVarT2 = dVarT2.getParent()) != null) {
                for (androidx.compose.ui.n.d dVarZ2 = Z2(zC); dVarZ2 != null && (dVarZ2.getAggregateChildKindSet() & iF) != 0; dVarZ2 = dVarZ2.getChild()) {
                    if ((dVarZ2.getKindSet() & iF) != 0 && (dVarZ2 instanceof t)) {
                        ((t) dVarZ2).q(i0Var.getLookaheadLayoutCoordinates());
                    }
                    if (dVarZ2 == dVarT2) {
                        break;
                    }
                }
            }
        }
        int iF2 = x0.f15398a.f();
        boolean zC2 = w0.c(iF2);
        androidx.compose.ui.n.d dVarT3 = getTail();
        if (!zC2 && (dVarT3 = dVarT3.getParent()) == null) {
            return;
        }
        for (androidx.compose.ui.n.d dVarZ3 = Z2(zC2); dVarZ3 != null && (dVarZ3.getAggregateChildKindSet() & iF2) != 0; dVarZ3 = dVarZ3.getChild()) {
            if ((dVarZ3.getKindSet() & iF2) != 0 && (dVarZ3 instanceof t)) {
                ((t) dVarZ3).p(this);
            }
            if (dVarZ3 == dVarT3) {
                return;
            }
        }
    }

    public void q3(@dl.d androidx.compose.ui.graphics.d0 canvas) {
        kotlin.jvm.internal.f0.p(canvas, "canvas");
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.G2(canvas);
        }
    }

    @dl.d
    protected final androidx.compose.ui.layout.e1 r3(long constraints, @dl.d yh.a<? extends androidx.compose.ui.layout.e1> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        X1(constraints);
        androidx.compose.ui.layout.e1 e1VarInvoke = block.invoke();
        z0 layer = getLayer();
        if (layer != null) {
            layer.g(getMeasuredSize());
        }
        return e1VarInvoke;
    }

    @Override // androidx.compose.ui.layout.q
    public void s0(@dl.d androidx.compose.ui.layout.q sourceCoordinates, @dl.d float[] matrix) {
        kotlin.jvm.internal.f0.p(sourceCoordinates, "sourceCoordinates");
        kotlin.jvm.internal.f0.p(matrix, "matrix");
        NodeCoordinator nodeCoordinatorD3 = D3(sourceCoordinates);
        NodeCoordinator nodeCoordinatorJ2 = J2(nodeCoordinatorD3);
        androidx.compose.ui.graphics.c1.m(matrix);
        nodeCoordinatorD3.H3(nodeCoordinatorJ2, matrix);
        G3(nodeCoordinatorJ2, matrix);
    }

    @dl.e
    public Object s3(@dl.d b1.i iVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        return t3(this, iVar, cVar);
    }

    public final void u3(@dl.d MutableRect bounds, boolean clipBounds, boolean clipToMinimumTouchTargetSize) {
        kotlin.jvm.internal.f0.p(bounds, "bounds");
        z0 z0Var = this.layer;
        if (z0Var != null) {
            if (this.isClipping) {
                if (clipToMinimumTouchTargetSize) {
                    long jQ2 = Q2();
                    float fT = b1.m.t(jQ2) / 2.0f;
                    float fM = b1.m.m(jQ2) / 2.0f;
                    bounds.i(-fT, -fM, s1.r.m(a()) + fT, s1.r.j(a()) + fM);
                } else if (clipBounds) {
                    bounds.i(0.0f, 0.0f, s1.r.m(a()), s1.r.j(a()));
                }
                if (bounds.j()) {
                    return;
                }
            }
            z0Var.c(bounds, false);
        }
        float fM2 = s1.n.m(getPosition());
        bounds.m(bounds.getF30360a() + fM2);
        bounds.n(bounds.getF30362c() + fM2);
        float fO = s1.n.o(getPosition());
        bounds.o(bounds.getF30361b() + fO);
        bounds.l(bounds.getF30363d() + fO);
    }

    @Override // androidx.compose.ui.layout.q
    public long w(long relativeToLocal) {
        return d0.b(getLayoutNode()).s(L(relativeToLocal));
    }

    public void w3(@dl.d androidx.compose.ui.layout.j0 value) {
        kotlin.jvm.internal.f0.p(value, "value");
        androidx.compose.ui.layout.j0 j0Var = this._measureResult;
        if (value != j0Var) {
            this._measureResult = value;
            if (j0Var == null || value.getWidth() != j0Var.getWidth() || value.getHeight() != j0Var.getHeight()) {
                n3(value.getWidth(), value.getHeight());
            }
            Map<androidx.compose.ui.layout.a, Integer> map = this.oldAlignmentLines;
            if ((!(map == null || map.isEmpty()) || (!value.i().isEmpty())) && !kotlin.jvm.internal.f0.g(value.i(), this.oldAlignmentLines)) {
                Z1().getAlignmentLines().q();
                Map linkedHashMap = this.oldAlignmentLines;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                    this.oldAlignmentLines = linkedHashMap;
                }
                linkedHashMap.clear();
                linkedHashMap.putAll(value.i());
            }
        }
    }

    @Override // androidx.compose.ui.layout.q
    @dl.d
    public b1.i x(@dl.d androidx.compose.ui.layout.q sourceCoordinates, boolean clipBounds) {
        kotlin.jvm.internal.f0.p(sourceCoordinates, "sourceCoordinates");
        if (!p()) {
            throw new IllegalStateException(B.toString());
        }
        if (!sourceCoordinates.p()) {
            throw new IllegalStateException(("LayoutCoordinates " + sourceCoordinates + " is not attached!").toString());
        }
        NodeCoordinator nodeCoordinatorD3 = D3(sourceCoordinates);
        NodeCoordinator nodeCoordinatorJ2 = J2(nodeCoordinatorD3);
        MutableRect dVarR2 = R2();
        dVarR2.m(0.0f);
        dVarR2.o(0.0f);
        dVarR2.n(s1.r.m(sourceCoordinates.a()));
        dVarR2.l(s1.r.j(sourceCoordinates.a()));
        while (nodeCoordinatorD3 != nodeCoordinatorJ2) {
            v3(nodeCoordinatorD3, dVarR2, clipBounds, false, 4, null);
            if (dVarR2.j()) {
                return b1.i.f30369e.a();
            }
            nodeCoordinatorD3 = nodeCoordinatorD3.wrappedBy;
            kotlin.jvm.internal.f0.m(nodeCoordinatorD3);
        }
        z2(nodeCoordinatorJ2, dVarR2, clipBounds);
        return b1.e.a(dVarR2);
    }

    protected void x3(long j10) {
        this.position = j10;
    }

    public final void y3(@dl.e NodeCoordinator nodeCoordinator) {
        this.wrapped = nodeCoordinator;
    }

    public final void z3(@dl.e NodeCoordinator nodeCoordinator) {
        this.wrappedBy = nodeCoordinator;
    }
}
