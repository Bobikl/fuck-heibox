package androidx.compose.ui.node;

import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.ui.platform.d2;
import androidx.compose.ui.unit.LayoutDirection;
import com.alipay.zoloz.toyger.face.ToygerFaceAlgorithmConfig;
import com.meituan.robust.Constants;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: LayoutNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000²\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0000\u0018\u0000 \u00152\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0006mÉ\u0002fÊ\u0002B\u001d\u0012\b\b\u0002\u0010l\u001a\u00020\u0018\u0012\b\b\u0002\u0010q\u001a\u00020\u000b¢\u0006\u0006\bÇ\u0002\u0010È\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0000H\u0002J\u0012\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000f\u001a\u00020\u0006H\u0002J\b\u0010\u0010\u001a\u00020\u0006H\u0002J\b\u0010\u0011\u001a\u00020\u0006H\u0002J\u001d\u0010\u0015\u001a\u00020\u00062\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u0012H\u0082\bJ\u001d\u0010\u0017\u001a\u00020\u00062\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u0012H\u0082\bJ\b\u0010\u0019\u001a\u00020\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u0006H\u0002J\u000f\u0010\u001b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u001d\u001a\u00020\u00062\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0012H\u0086\bø\u0001\u0000J&\u0010\u001f\u001a\u00020\u00062\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u001eH\u0086\bø\u0001\u0000J\u001f\u0010\"\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0006H\u0000¢\u0006\u0004\b$\u0010\u001cJ\u001f\u0010&\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u000bH\u0000¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0006H\u0000¢\u0006\u0004\b(\u0010\u001cJ'\u0010+\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u000bH\u0000¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u00062\u0006\u0010.\u001a\u00020-H\u0000¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0006H\u0000¢\u0006\u0004\b1\u0010\u001cJ\b\u00102\u001a\u00020\rH\u0016J\u000f\u00103\u001a\u00020\u0006H\u0000¢\u0006\u0004\b3\u0010\u001cJ\u001f\u00106\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u000bH\u0000¢\u0006\u0004\b6\u0010'J\u000f\u00107\u001a\u00020\u0006H\u0000¢\u0006\u0004\b7\u0010\u001cJ\u000f\u00108\u001a\u00020\u0006H\u0000¢\u0006\u0004\b8\u0010\u001cJ\u0017\u0010;\u001a\u00020\u00062\u0006\u0010:\u001a\u000209H\u0000¢\u0006\u0004\b;\u0010<J?\u0010D\u001a\u00020\u00062\u0006\u0010>\u001a\u00020=2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020@0?2\b\b\u0002\u0010B\u001a\u00020\u00182\b\b\u0002\u0010C\u001a\u00020\u0018H\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bD\u0010EJ?\u0010H\u001a\u00020\u00062\u0006\u0010>\u001a\u00020=2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020F0?2\b\b\u0002\u0010B\u001a\u00020\u00182\b\b\u0002\u0010C\u001a\u00020\u0018H\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bH\u0010EJ\u000f\u0010I\u001a\u00020\u0006H\u0000¢\u0006\u0004\bI\u0010\u001cJ\u000f\u0010J\u001a\u00020\u0006H\u0000¢\u0006\u0004\bJ\u0010\u001cJ\u000f\u0010K\u001a\u00020\u0006H\u0000¢\u0006\u0004\bK\u0010\u001cJ\u0017\u0010M\u001a\u00020\u00062\u0006\u0010L\u001a\u00020\u0000H\u0000¢\u0006\u0004\bM\u0010NJ\u0019\u0010P\u001a\u00020\u00062\b\b\u0002\u0010O\u001a\u00020\u0018H\u0000¢\u0006\u0004\bP\u0010QJ\u0019\u0010R\u001a\u00020\u00062\b\b\u0002\u0010O\u001a\u00020\u0018H\u0000¢\u0006\u0004\bR\u0010QJ\u000f\u0010S\u001a\u00020\u0006H\u0000¢\u0006\u0004\bS\u0010\u001cJ!\u0010U\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060TH\u0080\bø\u0001\u0000¢\u0006\u0004\bU\u0010VJ\u0019\u0010W\u001a\u00020\u00062\b\b\u0002\u0010O\u001a\u00020\u0018H\u0000¢\u0006\u0004\bW\u0010QJ\u0019\u0010X\u001a\u00020\u00062\b\b\u0002\u0010O\u001a\u00020\u0018H\u0000¢\u0006\u0004\bX\u0010QJ\u000f\u0010Y\u001a\u00020\u0006H\u0000¢\u0006\u0004\bY\u0010\u001cJ\u000e\u00104\u001a\b\u0012\u0004\u0012\u00020[0ZH\u0016J\u000f\u0010\\\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\\\u0010\u001cJ!\u0010_\u001a\u00020\u00182\n\b\u0002\u0010^\u001a\u0004\u0018\u00010]H\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b_\u0010`J!\u0010a\u001a\u00020\u00182\n\b\u0002\u0010^\u001a\u0004\u0018\u00010]H\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\ba\u0010`J\u000f\u0010b\u001a\u00020\u0006H\u0000¢\u0006\u0004\bb\u0010\u001cJ\u000f\u0010c\u001a\u00020\u0006H\u0000¢\u0006\u0004\bc\u0010\u001cJ\u000f\u0010d\u001a\u00020\u0006H\u0000¢\u0006\u0004\bd\u0010\u001cJ\u000f\u0010e\u001a\u00020\u0006H\u0000¢\u0006\u0004\be\u0010\u001cJ\b\u0010f\u001a\u00020\u0006H\u0016J\b\u0010g\u001a\u00020\u0006H\u0016J\u000f\u0010h\u001a\u00020\u0006H\u0000¢\u0006\u0004\bh\u0010\u001cJ\u000f\u0010i\u001a\u00020\u0006H\u0000¢\u0006\u0004\bi\u0010\u001cR\u0014\u0010l\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u001a\u0010q\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\u0016\u0010r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010nR\u001a\u0010v\u001a\b\u0012\u0004\u0012\u00020\u00000s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u001e\u0010z\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u0016\u0010|\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010kR\u0018\u0010\u007f\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R-\u0010.\u001a\u0004\u0018\u00010-2\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010-8\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R&\u0010\f\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b\u0085\u0001\u0010n\u001a\u0005\b\u0086\u0001\u0010p\"\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008a\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010kR\u001c\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000w8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010yR\u0018\u0010\u008e\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010kR2\u0010\u0095\u0001\u001a\u00030\u008f\u00012\b\u0010\u0090\u0001\u001a\u00030\u008f\u00018\u0016@VX\u0096\u000e¢\u0006\u0016\n\u0005\bg\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0005\bm\u0010\u0094\u0001R \u0010\u009a\u0001\u001a\u00030\u0096\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R8\u0010£\u0001\u001a\u0005\u0018\u00010\u009b\u00012\n\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u009b\u00018\u0000@BX\u0080\u000e¢\u0006\u0018\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001R4\u0010«\u0001\u001a\u00030¤\u00012\b\u0010\u0090\u0001\u001a\u00030¤\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\b¥\u0001\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001\"\u0006\b©\u0001\u0010ª\u0001R*\u0010²\u0001\u001a\u00030¬\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b\u00ad\u0001\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001\"\u0006\b\u008d\u0001\u0010±\u0001R)\u0010µ\u0001\u001a\u00020\u00182\u0007\u0010\u0080\u0001\u001a\u00020\u00188\u0016@RX\u0096\u000e¢\u0006\u000f\n\u0005\b³\u0001\u0010k\u001a\u0006\b³\u0001\u0010´\u0001R(\u0010¸\u0001\u001a\u00020\u000b2\u0007\u0010\u0080\u0001\u001a\u00020\u000b8\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0005\b¶\u0001\u0010n\u001a\u0005\b·\u0001\u0010pR'\u0010º\u0001\u001a\u00020\u000b2\u0007\u0010\u0080\u0001\u001a\u00020\u000b8\u0000@BX\u0080\u000e¢\u0006\r\n\u0004\bo\u0010n\u001a\u0005\b¹\u0001\u0010pR\u0018\u0010¼\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b»\u0001\u0010nR)\u0010Ã\u0001\u001a\u00030½\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b4\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010À\u0001\"\u0006\bÁ\u0001\u0010Â\u0001R)\u0010Æ\u0001\u001a\u00030½\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b5\u0010¾\u0001\u001a\u0006\bÄ\u0001\u0010À\u0001\"\u0006\bÅ\u0001\u0010Â\u0001R*\u0010Ê\u0001\u001a\u00030½\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÇ\u0001\u0010¾\u0001\u001a\u0006\bÈ\u0001\u0010À\u0001\"\u0006\bÉ\u0001\u0010Â\u0001R\u001a\u0010Ì\u0001\u001a\u00030½\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bË\u0001\u0010¾\u0001R-\u0010Ð\u0001\u001a\u00020\u00188\u0000@\u0000X\u0081\u000e¢\u0006\u001c\n\u0004\b/\u0010k\u0012\u0005\bÏ\u0001\u0010\u001c\u001a\u0006\bÍ\u0001\u0010´\u0001\"\u0005\bÎ\u0001\u0010QR/\u0010Ó\u0001\u001a\u00020\u00182\u0007\u0010\u0090\u0001\u001a\u00020\u00188\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0004\bK\u0010k\u001a\u0006\bÑ\u0001\u0010´\u0001\"\u0005\bÒ\u0001\u0010QR \u0010Ù\u0001\u001a\u00030Ô\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bÕ\u0001\u0010Ö\u0001\u001a\u0006\b×\u0001\u0010Ø\u0001R\u001f\u0010Þ\u0001\u001a\u00030Ú\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\bJ\u0010Û\u0001\u001a\u0006\bÜ\u0001\u0010Ý\u0001R\u0018\u0010à\u0001\u001a\u00030ß\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010hR+\u0010ç\u0001\u001a\u0005\u0018\u00010á\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u001a\u0010â\u0001\u001a\u0006\bã\u0001\u0010ä\u0001\"\u0006\bå\u0001\u0010æ\u0001R\u001a\u0010é\u0001\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u000e\u0010è\u0001R&\u0010ì\u0001\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\bn\u0010k\u001a\u0006\bê\u0001\u0010´\u0001\"\u0005\bë\u0001\u0010QR1\u0010ñ\u0001\u001a\u00030í\u00012\b\u0010\u0090\u0001\u001a\u00030í\u00018\u0016@VX\u0096\u000e¢\u0006\u0015\n\u0005\b1\u0010î\u0001\u001a\u0005\bt\u0010ï\u0001\"\u0005\bx\u0010ð\u0001R&\u0010ô\u0001\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b\u001d\u0010k\u001a\u0006\bò\u0001\u0010´\u0001\"\u0005\bó\u0001\u0010QR\u0017\u0010õ\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010kR\u001f\u0010ù\u0001\u001a\n\u0018\u00010ö\u0001R\u00030Ú\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b÷\u0001\u0010ø\u0001R\u001d\u0010ý\u0001\u001a\b0ú\u0001R\u00030Ú\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bû\u0001\u0010ü\u0001R\u0018\u0010ÿ\u0001\u001a\u0004\u0018\u00010\u00168BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bk\u0010þ\u0001R\u0016\u0010\u0082\u0002\u001a\u0004\u0018\u00010\u00188F¢\u0006\b\u001a\u0006\b\u0080\u0002\u0010\u0081\u0002R\u001d\u0010\u0085\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000Z8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0083\u0002\u0010\u0084\u0002R\u001e\u0010\u0088\u0002\u001a\t\u0012\u0005\u0012\u00030\u0086\u00020Z8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0087\u0002\u0010\u0084\u0002R\u001e\u0010\u008a\u0002\u001a\t\u0012\u0005\u0012\u00030\u0086\u00020Z8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0089\u0002\u0010\u0084\u0002R\u001d\u0010\u008d\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000w8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008b\u0002\u0010\u008c\u0002R\u001d\u0010\u008f\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000Z8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008e\u0002\u0010\u0084\u0002R\u0019\u0010\u0092\u0002\u001a\u0004\u0018\u00010\u00008@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0090\u0002\u0010\u0091\u0002R\u0017\u0010\u0094\u0002\u001a\u00020\u00188VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0093\u0002\u0010´\u0001R\u0018\u0010\u0098\u0002\u001a\u00030\u0095\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0096\u0002\u0010\u0097\u0002R$\u0010\u009b\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000w8@X\u0081\u0004¢\u0006\u000f\u0012\u0005\b\u009a\u0002\u0010\u001c\u001a\u0006\b\u0099\u0002\u0010\u008c\u0002R\u0017\u0010\u009c\u0002\u001a\u00020\u00188VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009c\u0002\u0010´\u0001R3\u0010\u009e\u0002\u001a\u00030\u009d\u00022\b\u0010\u0090\u0001\u001a\u00030\u009d\u00028\u0016@VX\u0096\u000e¢\u0006\u0017\n\u0006\b\u009e\u0002\u0010\u009f\u0002\u001a\u0006\b \u0002\u0010¡\u0002\"\u0005\b{\u0010¢\u0002R\u0016\u0010¤\u0002\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b£\u0002\u0010pR\u0016\u0010¦\u0002\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¥\u0002\u0010pR\u0017\u0010¨\u0002\u001a\u00020\u00188@X\u0080\u0004¢\u0006\b\u001a\u0006\b§\u0002\u0010´\u0001R\u0018\u0010¬\u0002\u001a\u00030©\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bª\u0002\u0010«\u0002R\u0017\u0010®\u0002\u001a\u00020\u00168@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u00ad\u0002\u0010þ\u0001R\u0017\u0010°\u0002\u001a\u00020\u00168@X\u0080\u0004¢\u0006\b\u001a\u0006\b¯\u0002\u0010þ\u0001R\u0018\u0010³\u0002\u001a\u00030±\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b¶\u0001\u0010²\u0002R7\u0010´\u0002\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b´\u0002\u0010µ\u0002\u001a\u0006\b¶\u0002\u0010·\u0002\"\u0006\b¸\u0002\u0010¹\u0002R7\u0010º\u0002\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bº\u0002\u0010µ\u0002\u001a\u0006\b»\u0002\u0010·\u0002\"\u0006\b¼\u0002\u0010¹\u0002R\u0017\u0010¾\u0002\u001a\u00020\u00188@X\u0080\u0004¢\u0006\b\u001a\u0006\b½\u0002\u0010´\u0001R\u0017\u0010À\u0002\u001a\u00020\u00188@X\u0080\u0004¢\u0006\b\u001a\u0006\b¿\u0002\u0010´\u0001R\u0017\u0010Â\u0002\u001a\u00020\u00188@X\u0080\u0004¢\u0006\b\u001a\u0006\bÁ\u0002\u0010´\u0001R\u0017\u0010Ä\u0002\u001a\u00020\u00188@X\u0080\u0004¢\u0006\b\u001a\u0006\bÃ\u0002\u0010´\u0001R\u0019\u0010Æ\u0002\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\b»\u0001\u0010Å\u0002\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006Ë\u0002"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/layout/k1;", "Landroidx/compose/ui/node/c1;", "Landroidx/compose/ui/layout/u;", "Landroidx/compose/ui/node/ComposeUiNode;", "Landroidx/compose/ui/node/b1$b;", "Lkotlin/b2;", "d1", "L0", "child", "Y0", "", ToygerFaceAlgorithmConfig.DEPTH, "", "H", "Z0", "V0", "W0", "Lkotlin/Function1;", "Landroidx/compose/ui/node/w;", "block", "O", "Landroidx/compose/ui/node/NodeCoordinator;", "P", "", "F1", "G", "G1", "()V", "M", "Lkotlin/Function2;", "N", UCropPlusActivity.ARG_INDEX, "instance", "H0", "(ILandroidx/compose/ui/node/LayoutNode;)V", "b1", "count", "h1", "(II)V", "g1", "from", "to", "X0", "(III)V", "Landroidx/compose/ui/node/b1;", "owner", "B", "(Landroidx/compose/ui/node/b1;)V", "J", "toString", "I0", "x", "y", "c1", "i1", "Q0", "Landroidx/compose/ui/graphics/d0;", "canvas", "L", "(Landroidx/compose/ui/graphics/d0;)V", "Lb1/f;", "pointerPosition", "Landroidx/compose/ui/node/k;", "Landroidx/compose/ui/node/f1;", "hitTestResult", "isTouchEvent", "isInLayer", "C0", "(JLandroidx/compose/ui/node/k;ZZ)V", "Landroidx/compose/ui/node/j1;", "hitSemanticsEntities", "E0", "a1", androidx.exifinterface.media.a.S4, "C", "it", "r1", "(Landroidx/compose/ui/node/LayoutNode;)V", "forceRequest", "p1", "(Z)V", "l1", "K0", "Lkotlin/Function0;", "G0", "(Lyh/a;)V", "n1", "j1", "K", "", "Landroidx/compose/ui/layout/o0;", "J0", "Ls1/b;", "constraints", "O0", "(Ls1/b;)Z", "e1", "R0", "U0", "S0", "T0", "d", "n", "F", "s1", "b", "Z", "isVirtual", ak.aF, "I", "v", "()I", "semanticsId", "virtualChildrenCount", "Landroidx/compose/ui/node/q0;", "e", "Landroidx/compose/ui/node/q0;", "_foldedChildren", "Landroidx/compose/runtime/collection/e;", "f", "Landroidx/compose/runtime/collection/e;", "_unfoldedChildren", "g", "unfoldedVirtualChildrenListDirty", RXScreenCaptureService.KEY_HEIGHT, "Landroidx/compose/ui/node/LayoutNode;", "_foldedParent", "<set-?>", "i", "Landroidx/compose/ui/node/b1;", "u0", "()Landroidx/compose/ui/node/b1;", "j", androidx.exifinterface.media.a.T4, "u1", "(I)V", "k", "ignoreRemeasureRequests", "l", "_zSortedChildren", "m", "zSortedChildrenInvalidated", "Landroidx/compose/ui/layout/i0;", "value", "Landroidx/compose/ui/layout/i0;", "o", "()Landroidx/compose/ui/layout/i0;", "(Landroidx/compose/ui/layout/i0;)V", "measurePolicy", "Landroidx/compose/ui/node/q;", "Landroidx/compose/ui/node/q;", "b0", "()Landroidx/compose/ui/node/q;", "intrinsicsPolicy", "Landroidx/compose/ui/layout/f0;", "newScope", "q", "Landroidx/compose/ui/layout/f0;", "k0", "()Landroidx/compose/ui/layout/f0;", "y1", "(Landroidx/compose/ui/layout/f0;)V", "mLookaheadScope", "Landroidx/compose/ui/unit/LayoutDirection;", "r", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", ak.av, "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutDirection", "Landroidx/compose/ui/platform/d2;", ak.aB, "Landroidx/compose/ui/platform/d2;", "getViewConfiguration", "()Landroidx/compose/ui/platform/d2;", "(Landroidx/compose/ui/platform/d2;)V", "viewConfiguration", "t", "()Z", "isPlaced", ak.aG, "w0", "placeOrder", "x0", "previousPlaceOrder", RXScreenCaptureService.KEY_WIDTH, "nextChildPlaceOrder", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "n0", "()Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "z1", "(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V", "measuredByParent", "o0", "A1", "measuredByParentInLookahead", ak.aD, "c0", "w1", "intrinsicsUsageByParent", androidx.exifinterface.media.a.W4, "previousIntrinsicsUsageByParent", "R", "t1", "getCanMultiMeasure$ui_release$annotations", "canMultiMeasure", "M0", "x1", "isLookaheadRoot", "Landroidx/compose/ui/node/t0;", "D", "Landroidx/compose/ui/node/t0;", "q0", "()Landroidx/compose/ui/node/t0;", "nodes", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "d0", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "layoutDelegate", "", "zIndex", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "y0", "()Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "E1", "(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;)V", "subcompositionsState", "Landroidx/compose/ui/node/NodeCoordinator;", "_innerLayerCoordinator", "a0", com.alipay.sdk.m.x.c.f39529d, "innerLayerCoordinatorIsDirty", "Landroidx/compose/ui/n;", "Landroidx/compose/ui/n;", "()Landroidx/compose/ui/n;", "(Landroidx/compose/ui/n;)V", "modifier", "p0", "B1", "needsOnPositionedDispatch", "relayoutWithoutParentInProgress", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "i0", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "lookaheadPassDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "l0", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "measurePassDelegate", "()Landroidx/compose/ui/node/NodeCoordinator;", "innerLayerCoordinator", "N0", "()Ljava/lang/Boolean;", "isPlacedInLookahead", "X", "()Ljava/util/List;", "foldedChildren", "Landroidx/compose/ui/layout/g0;", "U", "childMeasurables", androidx.exifinterface.media.a.f23244d5, "childLookaheadMeasurables", "B0", "()Landroidx/compose/runtime/collection/e;", "_children", androidx.exifinterface.media.a.X4, "children", "v0", "()Landroidx/compose/ui/node/LayoutNode;", "parent", "p", "isAttached", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "f0", "()Landroidx/compose/ui/node/LayoutNode$LayoutState;", "layoutState", "z0", "getZSortedChildren$annotations", "zSortedChildren", "isValid", "Ls1/e;", "density", "Ls1/e;", "getDensity", "()Ls1/e;", "(Ls1/e;)V", "getWidth", "width", "getHeight", "height", "Q", "alignmentLinesRequired", "Landroidx/compose/ui/node/b0;", "j0", "()Landroidx/compose/ui/node/b0;", "mDrawScope", "Y", "innerCoordinator", "t0", "outerCoordinator", "Landroidx/compose/ui/layout/q;", "()Landroidx/compose/ui/layout/q;", "coordinates", "onAttach", "Lyh/l;", "r0", "()Lyh/l;", "C1", "(Lyh/l;)V", "onDetach", "s0", "D1", "m0", "measurePending", "e0", "layoutPending", "h0", "lookaheadMeasurePending", "g0", "lookaheadLayoutPending", "()Landroidx/compose/ui/layout/u;", "parentInfo", "<init>", "(ZI)V", "LayoutState", "UsageByParent", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class LayoutNode implements androidx.compose.ui.layout.k1, c1, androidx.compose.ui.layout.u, ComposeUiNode, b1.b {
    public static final int Q = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @dl.d
    private UsageByParent previousIntrinsicsUsageByParent;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private boolean canMultiMeasure;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private boolean isLookaheadRoot;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @dl.d
    private final t0 nodes;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @dl.d
    private final LayoutNodeLayoutDelegate layoutDelegate;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private float zIndex;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @dl.e
    private LayoutNodeSubcompositionsState subcompositionsState;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @dl.e
    private NodeCoordinator _innerLayerCoordinator;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private boolean innerLayerCoordinatorIsDirty;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @dl.d
    private androidx.compose.ui.n modifier;

    @dl.e
    private yh.l<? super b1, b2> K;

    @dl.e
    private yh.l<? super b1, b2> L;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private boolean needsOnPositionedDispatch;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private boolean relayoutWithoutParentInProgress;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isVirtual;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int semanticsId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int virtualChildrenCount;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final q0<LayoutNode> _foldedChildren;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.runtime.collection.e<LayoutNode> _unfoldedChildren;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean unfoldedVirtualChildrenListDirty;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private LayoutNode _foldedParent;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private b1 owner;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int depth;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean ignoreRemeasureRequests;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.collection.e<LayoutNode> _zSortedChildren;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean zSortedChildrenInvalidated;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private androidx.compose.ui.layout.i0 measurePolicy;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final q intrinsicsPolicy;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private s1.e f15149p;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.ui.layout.f0 mLookaheadScope;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private LayoutDirection layoutDirection;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private d2 viewConfiguration;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean isPlaced;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private int placeOrder;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private int previousPlaceOrder;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private int nextChildPlaceOrder;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private UsageByParent measuredByParent;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private UsageByParent measuredByParentInLookahead;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private UsageByParent intrinsicsUsageByParent;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    @dl.d
    private static final d P = new b();

    @dl.d
    private static final yh.a<LayoutNode> R = new yh.a<LayoutNode>() { // from class: androidx.compose.ui.node.LayoutNode$Companion$Constructor$1
        /* JADX WARN: Multi-variable type inference failed */
        @Override // yh.a
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LayoutNode invoke() {
            return new LayoutNode(false, 0 == true ? 1 : 0, 3, null);
        }
    };

    @dl.d
    private static final d2 S = new a();

    @dl.d
    private static final Comparator<LayoutNode> T = new Comparator() { // from class: androidx.compose.ui.node.z
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return LayoutNode.r((LayoutNode) obj, (LayoutNode) obj2);
        }
    };

    /* JADX INFO: compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$LayoutState;", "", "(Ljava/lang/String;I)V", "Measuring", "LookaheadMeasuring", "LayingOut", "LookaheadLayingOut", "Idle", "ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum LayoutState {
        Measuring,
        LookaheadMeasuring,
        LayingOut,
        LookaheadLayingOut,
        Idle
    }

    /* JADX INFO: compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "", "(Ljava/lang/String;I)V", "InMeasureBlock", "InLayoutBlock", "NotUsed", "ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum UsageByParent {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed
    }

    /* JADX INFO: compiled from: LayoutNode.kt */
    @Metadata(bv = {}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0010\u001a\u00020\u000e8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0004\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"androidx/compose/ui/node/LayoutNode$a", "Landroidx/compose/ui/platform/d2;", "", "d", "()J", "longPressTimeoutMillis", ak.aF, "doubleTapTimeoutMillis", ak.av, "doubleTapMinTimeMillis", "", "b", "()F", "touchSlop", "Ls1/l;", "e", "minimumTouchTargetSize", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements d2 {
        a() {
        }

        @Override // androidx.compose.ui.platform.d2
        public long a() {
            return 40L;
        }

        @Override // androidx.compose.ui.platform.d2
        public float b() {
            return 16.0f;
        }

        @Override // androidx.compose.ui.platform.d2
        public long c() {
            return 300L;
        }

        @Override // androidx.compose.ui.platform.d2
        public long d() {
            return 400L;
        }

        @Override // androidx.compose.ui.platform.d2
        public long e() {
            return s1.l.f139233b.b();
        }
    }

    /* JADX INFO: compiled from: LayoutNode.kt */
    @Metadata(bv = {}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"androidx/compose/ui/node/LayoutNode$b", "Landroidx/compose/ui/node/LayoutNode$d;", "Landroidx/compose/ui/layout/l0;", "", "Landroidx/compose/ui/layout/g0;", "measurables", "Ls1/b;", "constraints", "", "j", "(Landroidx/compose/ui/layout/l0;Ljava/util/List;J)Ljava/lang/Void;", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class b extends d {
        b() {
            super("Undefined intrinsics block and it is required");
        }

        @Override // androidx.compose.ui.layout.i0
        public /* bridge */ /* synthetic */ androidx.compose.ui.layout.j0 a(androidx.compose.ui.layout.l0 l0Var, List list, long j10) {
            return (androidx.compose.ui.layout.j0) j(l0Var, list, j10);
        }

        @dl.d
        public Void j(@dl.d androidx.compose.ui.layout.l0 measure, @dl.d List<? extends androidx.compose.ui.layout.g0> measurables, long j10) {
            kotlin.jvm.internal.f0.p(measure, "$this$measure");
            kotlin.jvm.internal.f0.p(measurables, "measurables");
            throw new IllegalStateException("Undefined measure and it is required".toString());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.node.LayoutNode$c, reason: from kotlin metadata */
    /* JADX INFO: compiled from: LayoutNode.kt */
    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$c;", "", "Lkotlin/Function0;", "Landroidx/compose/ui/node/LayoutNode;", Constants.CONSTRUCTOR, "Lyh/a;", ak.av, "()Lyh/a;", "Landroidx/compose/ui/platform/d2;", "DummyViewConfiguration", "Landroidx/compose/ui/platform/d2;", "b", "()Landroidx/compose/ui/platform/d2;", "Ljava/util/Comparator;", "ZComparator", "Ljava/util/Comparator;", ak.aF, "()Ljava/util/Comparator;", "Landroidx/compose/ui/node/LayoutNode$d;", "ErrorMeasurePolicy", "Landroidx/compose/ui/node/LayoutNode$d;", "", "NotPlacedPlaceOrder", "I", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final yh.a<LayoutNode> a() {
            return LayoutNode.R;
        }

        @dl.d
        public final d2 b() {
            return LayoutNode.S;
        }

        @dl.d
        public final Comparator<LayoutNode> c() {
            return LayoutNode.T;
        }
    }

    /* JADX INFO: compiled from: LayoutNode.kt */
    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\"\u0010\u000b\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016J\"\u0010\f\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\"\u0010\r\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$d;", "Landroidx/compose/ui/layout/i0;", "Landroidx/compose/ui/layout/n;", "", "Landroidx/compose/ui/layout/m;", "measurables", "", "height", "", "i", "width", RXScreenCaptureService.KEY_HEIGHT, "g", "f", "", ak.av, "Ljava/lang/String;", "error", "<init>", "(Ljava/lang/String;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static abstract class d implements androidx.compose.ui.layout.i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final String error;

        public d(@dl.d String error) {
            kotlin.jvm.internal.f0.p(error, "error");
            this.error = error;
        }

        @Override // androidx.compose.ui.layout.i0
        public /* bridge */ /* synthetic */ int b(androidx.compose.ui.layout.n nVar, List list, int i10) {
            return ((Number) h(nVar, list, i10)).intValue();
        }

        @Override // androidx.compose.ui.layout.i0
        public /* bridge */ /* synthetic */ int c(androidx.compose.ui.layout.n nVar, List list, int i10) {
            return ((Number) i(nVar, list, i10)).intValue();
        }

        @Override // androidx.compose.ui.layout.i0
        public /* bridge */ /* synthetic */ int d(androidx.compose.ui.layout.n nVar, List list, int i10) {
            return ((Number) f(nVar, list, i10)).intValue();
        }

        @Override // androidx.compose.ui.layout.i0
        public /* bridge */ /* synthetic */ int e(androidx.compose.ui.layout.n nVar, List list, int i10) {
            return ((Number) g(nVar, list, i10)).intValue();
        }

        @dl.d
        public Void f(@dl.d androidx.compose.ui.layout.n nVar, @dl.d List<? extends androidx.compose.ui.layout.m> measurables, int i10) {
            kotlin.jvm.internal.f0.p(nVar, "<this>");
            kotlin.jvm.internal.f0.p(measurables, "measurables");
            throw new IllegalStateException(this.error.toString());
        }

        @dl.d
        public Void g(@dl.d androidx.compose.ui.layout.n nVar, @dl.d List<? extends androidx.compose.ui.layout.m> measurables, int i10) {
            kotlin.jvm.internal.f0.p(nVar, "<this>");
            kotlin.jvm.internal.f0.p(measurables, "measurables");
            throw new IllegalStateException(this.error.toString());
        }

        @dl.d
        public Void h(@dl.d androidx.compose.ui.layout.n nVar, @dl.d List<? extends androidx.compose.ui.layout.m> measurables, int i10) {
            kotlin.jvm.internal.f0.p(nVar, "<this>");
            kotlin.jvm.internal.f0.p(measurables, "measurables");
            throw new IllegalStateException(this.error.toString());
        }

        @dl.d
        public Void i(@dl.d androidx.compose.ui.layout.n nVar, @dl.d List<? extends androidx.compose.ui.layout.m> measurables, int i10) {
            kotlin.jvm.internal.f0.p(nVar, "<this>");
            kotlin.jvm.internal.f0.p(measurables, "measurables");
            throw new IllegalStateException(this.error.toString());
        }
    }

    /* JADX INFO: compiled from: LayoutNode.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15163a;

        static {
            int[] iArr = new int[LayoutState.values().length];
            iArr[LayoutState.Idle.ordinal()] = 1;
            f15163a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutNode() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    public LayoutNode(boolean z10, int i10) {
        this.isVirtual = z10;
        this.semanticsId = i10;
        this._foldedChildren = new q0<>(new androidx.compose.runtime.collection.e(new LayoutNode[16], 0), new yh.a<b2>() { // from class: androidx.compose.ui.node.LayoutNode$_foldedChildren$1
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
                this.f15161b.getLayoutDelegate().C();
            }
        });
        this._zSortedChildren = new androidx.compose.runtime.collection.e<>(new LayoutNode[16], 0);
        this.zSortedChildrenInvalidated = true;
        this.measurePolicy = P;
        this.intrinsicsPolicy = new q(this);
        this.f15149p = s1.g.b(1.0f, 0.0f, 2, null);
        this.layoutDirection = LayoutDirection.Ltr;
        this.viewConfiguration = S;
        this.placeOrder = Integer.MAX_VALUE;
        this.previousPlaceOrder = Integer.MAX_VALUE;
        UsageByParent usageByParent = UsageByParent.NotUsed;
        this.measuredByParent = usageByParent;
        this.measuredByParentInLookahead = usageByParent;
        this.intrinsicsUsageByParent = usageByParent;
        this.previousIntrinsicsUsageByParent = usageByParent;
        this.nodes = new t0(this);
        this.layoutDelegate = new LayoutNodeLayoutDelegate(this);
        this.innerLayerCoordinatorIsDirty = true;
        this.modifier = androidx.compose.ui.n.INSTANCE;
    }

    public /* synthetic */ LayoutNode(boolean z10, int i10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? androidx.compose.ui.semantics.m.INSTANCE.a() : i10);
    }

    @kotlin.r0
    public static /* synthetic */ void A0() {
    }

    public static /* synthetic */ void D0(LayoutNode layoutNode, long j10, k kVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        layoutNode.C0(j10, kVar, z12, z11);
    }

    private final boolean F1() {
        t0 t0Var = this.nodes;
        x0 x0Var = x0.f15398a;
        if (t0Var.s(x0Var.b()) && !this.nodes.s(x0Var.e())) {
            return true;
        }
        for (androidx.compose.ui.n.d head = this.nodes.getHead(); head != null; head = head.getChild()) {
            x0 x0Var2 = x0.f15398a;
            if (((x0Var2.e() & head.getKindSet()) != 0) && (head instanceof v) && androidx.compose.ui.node.d.j(head, x0Var2.e()).getLayer() != null) {
                return false;
            }
            if ((x0Var2.b() & head.getKindSet()) != 0) {
                return true;
            }
        }
        return true;
    }

    private final void G() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        androidx.compose.runtime.collection.e<LayoutNode> eVarB0 = B0();
        int iK = eVarB0.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        if (iK > 0) {
            int i10 = 0;
            LayoutNode[] layoutNodeArrG = eVarB0.G();
            kotlin.jvm.internal.f0.n(layoutNodeArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                LayoutNode layoutNode = layoutNodeArrG[i10];
                if (layoutNode.intrinsicsUsageByParent == UsageByParent.InLayoutBlock) {
                    layoutNode.G();
                }
                i10++;
            } while (i10 < iK);
        }
    }

    private final String H(int depth) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < depth; i10++) {
            sb2.append("  ");
        }
        sb2.append("|-");
        sb2.append(toString());
        sb2.append('\n');
        androidx.compose.runtime.collection.e<LayoutNode> eVarB0 = B0();
        int iK = eVarB0.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        if (iK > 0) {
            LayoutNode[] layoutNodeArrG = eVarB0.G();
            kotlin.jvm.internal.f0.n(layoutNodeArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i11 = 0;
            do {
                sb2.append(layoutNodeArrG[i11].H(depth + 1));
                i11++;
            } while (i11 < iK);
        }
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "tree.toString()");
        if (depth != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        kotlin.jvm.internal.f0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    static /* synthetic */ String I(LayoutNode layoutNode, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return layoutNode.H(i10);
    }

    private final void L0() {
        LayoutNode layoutNodeV0;
        if (this.virtualChildrenCount > 0) {
            this.unfoldedVirtualChildrenListDirty = true;
        }
        if (!this.isVirtual || (layoutNodeV0 = v0()) == null) {
            return;
        }
        layoutNodeV0.unfoldedVirtualChildrenListDirty = true;
    }

    private final void O(yh.l<? super w, b2> lVar) {
        NodeCoordinator nodeCoordinatorT0 = t0();
        NodeCoordinator nodeCoordinatorY = Y();
        while (nodeCoordinatorT0 != nodeCoordinatorY) {
            kotlin.jvm.internal.f0.n(nodeCoordinatorT0, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            w wVar = (w) nodeCoordinatorT0;
            lVar.invoke(wVar);
            nodeCoordinatorT0 = wVar.getWrapped();
        }
    }

    private final void P(yh.l<? super NodeCoordinator, b2> lVar) {
        NodeCoordinator wrapped = Y().getWrapped();
        for (NodeCoordinator nodeCoordinatorT0 = t0(); !kotlin.jvm.internal.f0.g(nodeCoordinatorT0, wrapped) && nodeCoordinatorT0 != null; nodeCoordinatorT0 = nodeCoordinatorT0.getWrapped()) {
            lVar.invoke(nodeCoordinatorT0);
        }
    }

    public static /* synthetic */ boolean P0(LayoutNode layoutNode, s1.b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = layoutNode.layoutDelegate.q();
        }
        return layoutNode.O0(bVar);
    }

    @kotlin.k(message = "Temporary API to support ConstraintLayout prototyping.")
    public static /* synthetic */ void S() {
    }

    private final void V0() {
        boolean isPlaced = getIsPlaced();
        this.isPlaced = true;
        if (!isPlaced) {
            if (m0()) {
                p1(true);
            } else if (h0()) {
                l1(true);
            }
        }
        NodeCoordinator wrapped = Y().getWrapped();
        for (NodeCoordinator nodeCoordinatorT0 = t0(); !kotlin.jvm.internal.f0.g(nodeCoordinatorT0, wrapped) && nodeCoordinatorT0 != null; nodeCoordinatorT0 = nodeCoordinatorT0.getWrapped()) {
            if (nodeCoordinatorT0.getLastLayerDrawingWasSkipped()) {
                nodeCoordinatorT0.f3();
            }
        }
        androidx.compose.runtime.collection.e<LayoutNode> eVarB0 = B0();
        int iK = eVarB0.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        if (iK > 0) {
            int i10 = 0;
            LayoutNode[] layoutNodeArrG = eVarB0.G();
            kotlin.jvm.internal.f0.n(layoutNodeArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                LayoutNode layoutNode = layoutNodeArrG[i10];
                if (layoutNode.placeOrder != Integer.MAX_VALUE) {
                    layoutNode.V0();
                    r1(layoutNode);
                }
                i10++;
            } while (i10 < iK);
        }
    }

    private final void W0() {
        if (getIsPlaced()) {
            int i10 = 0;
            this.isPlaced = false;
            androidx.compose.runtime.collection.e<LayoutNode> eVarB0 = B0();
            int iK = eVarB0.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
            if (iK > 0) {
                LayoutNode[] layoutNodeArrG = eVarB0.G();
                kotlin.jvm.internal.f0.n(layoutNodeArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                do {
                    layoutNodeArrG[i10].W0();
                    i10++;
                } while (i10 < iK);
            }
        }
    }

    private final void Y0(LayoutNode layoutNode) {
        if (layoutNode.layoutDelegate.m() > 0) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
            layoutNodeLayoutDelegate.L(layoutNodeLayoutDelegate.m() - 1);
        }
        if (this.owner != null) {
            layoutNode.J();
        }
        layoutNode._foldedParent = null;
        layoutNode.t0().z3(null);
        if (layoutNode.isVirtual) {
            this.virtualChildrenCount--;
            androidx.compose.runtime.collection.e<LayoutNode> eVarH = layoutNode._foldedChildren.h();
            int iK = eVarH.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
            if (iK > 0) {
                int i10 = 0;
                LayoutNode[] layoutNodeArrG = eVarH.G();
                kotlin.jvm.internal.f0.n(layoutNodeArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                do {
                    layoutNodeArrG[i10].t0().z3(null);
                    i10++;
                } while (i10 < iK);
            }
        }
        L0();
        b1();
    }

    private final NodeCoordinator Z() {
        if (this.innerLayerCoordinatorIsDirty) {
            NodeCoordinator nodeCoordinatorY = Y();
            NodeCoordinator wrappedBy = t0().getWrappedBy();
            this._innerLayerCoordinator = null;
            while (!kotlin.jvm.internal.f0.g(nodeCoordinatorY, wrappedBy)) {
                if ((nodeCoordinatorY != null ? nodeCoordinatorY.getLayer() : null) != null) {
                    this._innerLayerCoordinator = nodeCoordinatorY;
                    break;
                }
                nodeCoordinatorY = nodeCoordinatorY != null ? nodeCoordinatorY.getWrappedBy() : null;
            }
        }
        NodeCoordinator nodeCoordinator = this._innerLayerCoordinator;
        if (nodeCoordinator == null || nodeCoordinator.getLayer() != null) {
            return nodeCoordinator;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    private final void Z0() {
        K0();
        LayoutNode layoutNodeV0 = v0();
        if (layoutNodeV0 != null) {
            layoutNodeV0.I0();
        }
        J0();
    }

    private final void d1() {
        if (this.unfoldedVirtualChildrenListDirty) {
            int i10 = 0;
            this.unfoldedVirtualChildrenListDirty = false;
            androidx.compose.runtime.collection.e<LayoutNode> eVar = this._unfoldedChildren;
            if (eVar == null) {
                androidx.compose.runtime.collection.e<LayoutNode> eVar2 = new androidx.compose.runtime.collection.e<>(new LayoutNode[16], 0);
                this._unfoldedChildren = eVar2;
                eVar = eVar2;
            }
            eVar.m();
            androidx.compose.runtime.collection.e<LayoutNode> eVarH = this._foldedChildren.h();
            int iK = eVarH.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
            if (iK > 0) {
                LayoutNode[] layoutNodeArrG = eVarH.G();
                kotlin.jvm.internal.f0.n(layoutNodeArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                do {
                    LayoutNode layoutNode = layoutNodeArrG[i10];
                    if (layoutNode.isVirtual) {
                        eVar.c(eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String(), layoutNode.B0());
                    } else {
                        eVar.b(layoutNode);
                    }
                    i10++;
                } while (i10 < iK);
            }
            this.layoutDelegate.C();
        }
    }

    public static /* synthetic */ boolean f1(LayoutNode layoutNode, s1.b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = layoutNode.layoutDelegate.p();
        }
        return layoutNode.e1(bVar);
    }

    private final LayoutNodeLayoutDelegate.LookaheadPassDelegate i0() {
        return this.layoutDelegate.w();
    }

    public static /* synthetic */ void k1(LayoutNode layoutNode, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        layoutNode.j1(z10);
    }

    private final LayoutNodeLayoutDelegate.MeasurePassDelegate l0() {
        return this.layoutDelegate.x();
    }

    public static /* synthetic */ void m1(LayoutNode layoutNode, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        layoutNode.l1(z10);
    }

    public static /* synthetic */ void o1(LayoutNode layoutNode, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        layoutNode.n1(z10);
    }

    public static /* synthetic */ void q1(LayoutNode layoutNode, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        layoutNode.p1(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int r(LayoutNode layoutNode, LayoutNode layoutNode2) {
        float f10 = layoutNode.zIndex;
        float f11 = layoutNode2.zIndex;
        return (f10 > f11 ? 1 : (f10 == f11 ? 0 : -1)) == 0 ? kotlin.jvm.internal.f0.t(layoutNode.placeOrder, layoutNode2.placeOrder) : Float.compare(f10, f11);
    }

    private final void y1(androidx.compose.ui.layout.f0 f0Var) {
        if (kotlin.jvm.internal.f0.g(f0Var, this.mLookaheadScope)) {
            return;
        }
        this.mLookaheadScope = f0Var;
        this.layoutDelegate.H(f0Var);
        NodeCoordinator wrapped = Y().getWrapped();
        for (NodeCoordinator nodeCoordinatorT0 = t0(); !kotlin.jvm.internal.f0.g(nodeCoordinatorT0, wrapped) && nodeCoordinatorT0 != null; nodeCoordinatorT0 = nodeCoordinatorT0.getWrapped()) {
            nodeCoordinatorT0.K3(f0Var);
        }
    }

    public final void A1(@dl.d UsageByParent usageByParent) {
        kotlin.jvm.internal.f0.p(usageByParent, "<set-?>");
        this.measuredByParentInLookahead = usageByParent;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0024  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void B(@dl.d b1 owner) {
        Object[] objArr;
        androidx.compose.ui.layout.f0 f0Var;
        kotlin.jvm.internal.f0.p(owner, "owner");
        int i10 = 0;
        androidx.compose.ui.layout.f0 f0Var2 = null;
        if ((this.owner == null) != true) {
            throw new IllegalStateException(("Cannot attach " + this + " as it already is attached.  Tree: " + I(this, 0, 1, null)).toString());
        }
        LayoutNode layoutNode = this._foldedParent;
        if (layoutNode == null) {
            objArr = true;
        } else if (kotlin.jvm.internal.f0.g(layoutNode != null ? layoutNode.owner : null, owner)) {
            objArr = true;
        } else {
            objArr = false;
        }
        if (objArr != true) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Attaching to a different owner(");
            sb2.append(owner);
            sb2.append(") than the parent's owner(");
            LayoutNode layoutNodeV0 = v0();
            sb2.append(layoutNodeV0 != null ? layoutNodeV0.owner : null);
            sb2.append("). This tree: ");
            sb2.append(I(this, 0, 1, null));
            sb2.append(" Parent tree: ");
            LayoutNode layoutNode2 = this._foldedParent;
            sb2.append(layoutNode2 != null ? I(layoutNode2, 0, 1, null) : null);
            throw new IllegalStateException(sb2.toString().toString());
        }
        LayoutNode layoutNodeV1 = v0();
        if (layoutNodeV1 == null) {
            this.isPlaced = true;
        }
        this.owner = owner;
        this.depth = (layoutNodeV1 != null ? layoutNodeV1.depth : -1) + 1;
        if (androidx.compose.ui.semantics.n.k(this) != null) {
            owner.A();
        }
        owner.w(this);
        if (layoutNodeV1 != null && (f0Var = layoutNodeV1.mLookaheadScope) != null) {
            f0Var2 = f0Var;
        } else if (this.isLookaheadRoot) {
            f0Var2 = new androidx.compose.ui.layout.f0(this);
        }
        y1(f0Var2);
        this.nodes.f();
        androidx.compose.runtime.collection.e<LayoutNode> eVarH = this._foldedChildren.h();
        int iK = eVarH.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        if (iK > 0) {
            LayoutNode[] layoutNodeArrG = eVarH.G();
            kotlin.jvm.internal.f0.n(layoutNodeArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                layoutNodeArrG[i10].B(owner);
                i10++;
            } while (i10 < iK);
        }
        K0();
        if (layoutNodeV1 != null) {
            layoutNodeV1.K0();
        }
        NodeCoordinator wrapped = Y().getWrapped();
        for (NodeCoordinator nodeCoordinatorT0 = t0(); !kotlin.jvm.internal.f0.g(nodeCoordinatorT0, wrapped) && nodeCoordinatorT0 != null; nodeCoordinatorT0 = nodeCoordinatorT0.getWrapped()) {
            nodeCoordinatorT0.B2();
        }
        yh.l<? super b1, b2> lVar = this.K;
        if (lVar != null) {
            lVar.invoke(owner);
        }
    }

    @dl.d
    public final androidx.compose.runtime.collection.e<LayoutNode> B0() {
        G1();
        if (this.virtualChildrenCount == 0) {
            return this._foldedChildren.h();
        }
        androidx.compose.runtime.collection.e<LayoutNode> eVar = this._unfoldedChildren;
        kotlin.jvm.internal.f0.m(eVar);
        return eVar;
    }

    public final void B1(boolean z10) {
        this.needsOnPositionedDispatch = z10;
    }

    public final void C() {
        androidx.compose.runtime.collection.e<LayoutNode> eVarB0 = B0();
        int iK = eVarB0.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        if (iK > 0) {
            int i10 = 0;
            LayoutNode[] layoutNodeArrG = eVarB0.G();
            kotlin.jvm.internal.f0.n(layoutNodeArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                LayoutNode layoutNode = layoutNodeArrG[i10];
                if (layoutNode.previousPlaceOrder != layoutNode.placeOrder) {
                    b1();
                    I0();
                    if (layoutNode.placeOrder == Integer.MAX_VALUE) {
                        layoutNode.W0();
                    }
                }
                i10++;
            } while (i10 < iK);
        }
    }

    public final void C0(long pointerPosition, @dl.d k<f1> hitTestResult, boolean isTouchEvent, boolean isInLayer) {
        kotlin.jvm.internal.f0.p(hitTestResult, "hitTestResult");
        t0().d3(NodeCoordinator.INSTANCE.a(), t0().K2(pointerPosition), hitTestResult, isTouchEvent, isInLayer);
    }

    public final void C1(@dl.e yh.l<? super b1, b2> lVar) {
        this.K = lVar;
    }

    public final void D1(@dl.e yh.l<? super b1, b2> lVar) {
        this.L = lVar;
    }

    public final void E() {
        int i10 = 0;
        this.nextChildPlaceOrder = 0;
        androidx.compose.runtime.collection.e<LayoutNode> eVarB0 = B0();
        int iK = eVarB0.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        if (iK > 0) {
            LayoutNode[] layoutNodeArrG = eVarB0.G();
            kotlin.jvm.internal.f0.n(layoutNodeArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                LayoutNode layoutNode = layoutNodeArrG[i10];
                layoutNode.previousPlaceOrder = layoutNode.placeOrder;
                layoutNode.placeOrder = Integer.MAX_VALUE;
                if (layoutNode.measuredByParent == UsageByParent.InLayoutBlock) {
                    layoutNode.measuredByParent = UsageByParent.NotUsed;
                }
                i10++;
            } while (i10 < iK);
        }
    }

    public final void E0(long pointerPosition, @dl.d k<j1> hitSemanticsEntities, boolean isTouchEvent, boolean isInLayer) {
        kotlin.jvm.internal.f0.p(hitSemanticsEntities, "hitSemanticsEntities");
        t0().d3(NodeCoordinator.INSTANCE.c(), t0().K2(pointerPosition), hitSemanticsEntities, true, isInLayer);
    }

    public final void E1(@dl.e LayoutNodeSubcompositionsState layoutNodeSubcompositionsState) {
        this.subcompositionsState = layoutNodeSubcompositionsState;
    }

    public final void F() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        androidx.compose.runtime.collection.e<LayoutNode> eVarB0 = B0();
        int iK = eVarB0.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        if (iK > 0) {
            int i10 = 0;
            LayoutNode[] layoutNodeArrG = eVarB0.G();
            kotlin.jvm.internal.f0.n(layoutNodeArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                LayoutNode layoutNode = layoutNodeArrG[i10];
                if (layoutNode.intrinsicsUsageByParent != UsageByParent.NotUsed) {
                    layoutNode.F();
                }
                i10++;
            } while (i10 < iK);
        }
    }

    public final void G0(@dl.d yh.a<b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        this.ignoreRemeasureRequests = true;
        block.invoke();
        this.ignoreRemeasureRequests = false;
    }

    public final void G1() {
        if (this.virtualChildrenCount > 0) {
            d1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H0(int index, @dl.d LayoutNode instance) {
        androidx.compose.runtime.collection.e<LayoutNode> eVarH;
        int iK;
        kotlin.jvm.internal.f0.p(instance, "instance");
        int i10 = 0;
        NodeCoordinator nodeCoordinatorY = null;
        if ((instance._foldedParent == null) != true) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot insert ");
            sb2.append(instance);
            sb2.append(" because it already has a parent. This tree: ");
            sb2.append(I(this, 0, 1, null));
            sb2.append(" Other tree: ");
            LayoutNode layoutNode = instance._foldedParent;
            sb2.append(layoutNode != null ? I(layoutNode, 0, 1, null) : null);
            throw new IllegalStateException(sb2.toString().toString());
        }
        if ((instance.owner == null) != true) {
            throw new IllegalStateException(("Cannot insert " + instance + " because it already has an owner. This tree: " + I(this, 0, 1, null) + " Other tree: " + I(instance, 0, 1, null)).toString());
        }
        instance._foldedParent = this;
        this._foldedChildren.a(index, instance);
        b1();
        if (instance.isVirtual) {
            if (!(!this.isVirtual)) {
                throw new IllegalArgumentException("Virtual LayoutNode can't be added into a virtual parent".toString());
            }
            this.virtualChildrenCount++;
        }
        L0();
        NodeCoordinator nodeCoordinatorT0 = instance.t0();
        if (this.isVirtual) {
            LayoutNode layoutNode2 = this._foldedParent;
            if (layoutNode2 != null) {
                nodeCoordinatorY = layoutNode2.Y();
            }
        } else {
            nodeCoordinatorY = Y();
        }
        nodeCoordinatorT0.z3(nodeCoordinatorY);
        if (instance.isVirtual && (iK = (eVarH = instance._foldedChildren.h()).getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String()) > 0) {
            LayoutNode[] layoutNodeArrG = eVarH.G();
            kotlin.jvm.internal.f0.n(layoutNodeArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                layoutNodeArrG[i10].t0().z3(Y());
                i10++;
            } while (i10 < iK);
        }
        b1 b1Var = this.owner;
        if (b1Var != null) {
            instance.B(b1Var);
        }
        if (instance.layoutDelegate.m() > 0) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
            layoutNodeLayoutDelegate.L(layoutNodeLayoutDelegate.m() + 1);
        }
    }

    public final void I0() {
        NodeCoordinator nodeCoordinatorZ = Z();
        if (nodeCoordinatorZ != null) {
            nodeCoordinatorZ.f3();
            return;
        }
        LayoutNode layoutNodeV0 = v0();
        if (layoutNodeV0 != null) {
            layoutNodeV0.I0();
        }
    }

    public final void J() {
        b1 b1Var = this.owner;
        if (b1Var == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot detach node that is already detached!  Tree: ");
            LayoutNode layoutNodeV0 = v0();
            sb2.append(layoutNodeV0 != null ? I(layoutNodeV0, 0, 1, null) : null);
            throw new IllegalStateException(sb2.toString().toString());
        }
        LayoutNode layoutNodeV1 = v0();
        if (layoutNodeV1 != null) {
            layoutNodeV1.I0();
            layoutNodeV1.K0();
            this.measuredByParent = UsageByParent.NotUsed;
        }
        this.layoutDelegate.K();
        yh.l<? super b1, b2> lVar = this.L;
        if (lVar != null) {
            lVar.invoke(b1Var);
        }
        NodeCoordinator wrapped = Y().getWrapped();
        for (NodeCoordinator nodeCoordinatorT0 = t0(); !kotlin.jvm.internal.f0.g(nodeCoordinatorT0, wrapped) && nodeCoordinatorT0 != null; nodeCoordinatorT0 = nodeCoordinatorT0.getWrapped()) {
            nodeCoordinatorT0.E2();
        }
        if (androidx.compose.ui.semantics.n.k(this) != null) {
            b1Var.A();
        }
        this.nodes.h();
        b1Var.x(this);
        this.owner = null;
        this.depth = 0;
        androidx.compose.runtime.collection.e<LayoutNode> eVarH = this._foldedChildren.h();
        int iK = eVarH.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        if (iK > 0) {
            LayoutNode[] layoutNodeArrG = eVarH.G();
            kotlin.jvm.internal.f0.n(layoutNodeArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i10 = 0;
            do {
                layoutNodeArrG[i10].J();
                i10++;
            } while (i10 < iK);
        }
        this.placeOrder = Integer.MAX_VALUE;
        this.previousPlaceOrder = Integer.MAX_VALUE;
        this.isPlaced = false;
    }

    public final void J0() {
        NodeCoordinator nodeCoordinatorT0 = t0();
        NodeCoordinator nodeCoordinatorY = Y();
        while (nodeCoordinatorT0 != nodeCoordinatorY) {
            kotlin.jvm.internal.f0.n(nodeCoordinatorT0, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            w wVar = (w) nodeCoordinatorT0;
            z0 layer = wVar.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
            nodeCoordinatorT0 = wVar.getWrapped();
        }
        z0 layer2 = Y().getLayer();
        if (layer2 != null) {
            layer2.invalidate();
        }
    }

    public final void K() {
        if (f0() != LayoutState.Idle || e0() || m0() || !getIsPlaced()) {
            return;
        }
        t0 t0Var = this.nodes;
        int iC = x0.f15398a.c();
        if ((t0Var.k() & iC) != 0) {
            for (androidx.compose.ui.n.d head = t0Var.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & iC) != 0 && (head instanceof j)) {
                    j jVar = (j) head;
                    jVar.W(androidx.compose.ui.node.d.j(jVar, x0.f15398a.c()));
                }
                if ((head.getAggregateChildKindSet() & iC) == 0) {
                    return;
                }
            }
        }
    }

    public final void K0() {
        if (this.mLookaheadScope != null) {
            m1(this, false, 1, null);
        } else {
            q1(this, false, 1, null);
        }
    }

    public final void L(@dl.d androidx.compose.ui.graphics.d0 canvas) {
        kotlin.jvm.internal.f0.p(canvas, "canvas");
        t0().G2(canvas);
    }

    public final void M(@dl.d yh.l<? super LayoutNode, b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        androidx.compose.runtime.collection.e<LayoutNode> eVarB0 = B0();
        int iK = eVarB0.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        if (iK > 0) {
            int i10 = 0;
            LayoutNode[] layoutNodeArrG = eVarB0.G();
            kotlin.jvm.internal.f0.n(layoutNodeArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                block.invoke(layoutNodeArrG[i10]);
                i10++;
            } while (i10 < iK);
        }
    }

    /* JADX INFO: renamed from: M0, reason: from getter */
    public final boolean getIsLookaheadRoot() {
        return this.isLookaheadRoot;
    }

    public final void N(@dl.d yh.p<? super Integer, ? super LayoutNode, b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        androidx.compose.runtime.collection.e<LayoutNode> eVarB0 = B0();
        int iK = eVarB0.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        if (iK > 0) {
            int i10 = 0;
            LayoutNode[] layoutNodeArrG = eVarB0.G();
            kotlin.jvm.internal.f0.n(layoutNodeArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                block.invoke(Integer.valueOf(i10), layoutNodeArrG[i10]);
                i10++;
            } while (i10 < iK);
        }
    }

    @dl.e
    public final Boolean N0() {
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegateI0 = i0();
        if (lookaheadPassDelegateI0 != null) {
            return Boolean.valueOf(lookaheadPassDelegateI0.t());
        }
        return null;
    }

    public final boolean O0(@dl.e s1.b constraints) {
        if (constraints == null || this.mLookaheadScope == null) {
            return false;
        }
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegateI0 = i0();
        kotlin.jvm.internal.f0.m(lookaheadPassDelegateI0);
        return lookaheadPassDelegateI0.l2(constraints.getF139216a());
    }

    public final boolean Q() {
        AlignmentLines alignmentLinesI;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
        if (!layoutNodeLayoutDelegate.l().i().l()) {
            androidx.compose.ui.node.a aVarT = layoutNodeLayoutDelegate.t();
            if (!((aVarT == null || (alignmentLinesI = aVarT.i()) == null || !alignmentLinesI.l()) ? false : true)) {
                return false;
            }
        }
        return true;
    }

    public final void Q0() {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            G();
        }
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegateI0 = i0();
        kotlin.jvm.internal.f0.m(lookaheadPassDelegateI0);
        lookaheadPassDelegateI0.m2();
    }

    /* JADX INFO: renamed from: R, reason: from getter */
    public final boolean getCanMultiMeasure() {
        return this.canMultiMeasure;
    }

    public final void R0() {
        this.layoutDelegate.D();
    }

    public final void S0() {
        this.layoutDelegate.E();
    }

    @dl.d
    public final List<androidx.compose.ui.layout.g0> T() {
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegateI0 = i0();
        kotlin.jvm.internal.f0.m(lookaheadPassDelegateI0);
        return lookaheadPassDelegateI0.b2();
    }

    public final void T0() {
        this.layoutDelegate.F();
    }

    @dl.d
    public final List<androidx.compose.ui.layout.g0> U() {
        return l0().Y1();
    }

    public final void U0() {
        this.layoutDelegate.G();
    }

    @dl.d
    public final List<LayoutNode> V() {
        return B0().l();
    }

    /* JADX INFO: renamed from: W, reason: from getter */
    public final int getDepth() {
        return this.depth;
    }

    @dl.d
    public final List<LayoutNode> X() {
        return this._foldedChildren.b();
    }

    public final void X0(int from, int to, int count) {
        if (from == to) {
            return;
        }
        for (int i10 = 0; i10 < count; i10++) {
            this._foldedChildren.a(from > to ? to + i10 : (to + count) - 2, this._foldedChildren.i(from > to ? from + i10 : from));
        }
        b1();
        L0();
        K0();
    }

    @dl.d
    public final NodeCoordinator Y() {
        return this.nodes.getInnerCoordinator();
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void a(@dl.d LayoutDirection value) {
        kotlin.jvm.internal.f0.p(value, "value");
        if (this.layoutDirection != value) {
            this.layoutDirection = value;
            Z0();
        }
    }

    /* JADX INFO: renamed from: a0, reason: from getter */
    public final boolean getInnerLayerCoordinatorIsDirty() {
        return this.innerLayerCoordinatorIsDirty;
    }

    public final void a1() {
        LayoutNode layoutNodeV0 = v0();
        float zIndex = Y().getZIndex();
        NodeCoordinator nodeCoordinatorT0 = t0();
        NodeCoordinator nodeCoordinatorY = Y();
        while (nodeCoordinatorT0 != nodeCoordinatorY) {
            kotlin.jvm.internal.f0.n(nodeCoordinatorT0, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            w wVar = (w) nodeCoordinatorT0;
            zIndex += wVar.getZIndex();
            nodeCoordinatorT0 = wVar.getWrapped();
        }
        if (!(zIndex == this.zIndex)) {
            this.zIndex = zIndex;
            if (layoutNodeV0 != null) {
                layoutNodeV0.b1();
            }
            if (layoutNodeV0 != null) {
                layoutNodeV0.I0();
            }
        }
        if (!getIsPlaced()) {
            if (layoutNodeV0 != null) {
                layoutNodeV0.I0();
            }
            V0();
        }
        if (layoutNodeV0 == null) {
            this.placeOrder = 0;
        } else if (!this.relayoutWithoutParentInProgress && layoutNodeV0.f0() == LayoutState.LayingOut) {
            if (!(this.placeOrder == Integer.MAX_VALUE)) {
                throw new IllegalStateException("Place was called on a node which was placed already".toString());
            }
            int i10 = layoutNodeV0.nextChildPlaceOrder;
            this.placeOrder = i10;
            layoutNodeV0.nextChildPlaceOrder = i10 + 1;
        }
        this.layoutDelegate.l().I0();
    }

    @dl.d
    /* JADX INFO: renamed from: b0, reason: from getter */
    public final q getIntrinsicsPolicy() {
        return this.intrinsicsPolicy;
    }

    public final void b1() {
        if (!this.isVirtual) {
            this.zSortedChildrenInvalidated = true;
            return;
        }
        LayoutNode layoutNodeV0 = v0();
        if (layoutNodeV0 != null) {
            layoutNodeV0.b1();
        }
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void c(@dl.d androidx.compose.ui.layout.i0 value) {
        kotlin.jvm.internal.f0.p(value, "value");
        if (kotlin.jvm.internal.f0.g(this.measurePolicy, value)) {
            return;
        }
        this.measurePolicy = value;
        this.intrinsicsPolicy.m(getMeasurePolicy());
        K0();
    }

    @dl.d
    /* JADX INFO: renamed from: c0, reason: from getter */
    public final UsageByParent getIntrinsicsUsageByParent() {
        return this.intrinsicsUsageByParent;
    }

    public final void c1(int x10, int y10) {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            G();
        }
        LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegateL0 = l0();
        androidx.compose.ui.layout.e1.a.Companion companion = androidx.compose.ui.layout.e1.a.INSTANCE;
        int iK = measurePassDelegateL0.k();
        LayoutDirection layoutDirection = getLayoutDirection();
        LayoutNode layoutNodeV0 = v0();
        NodeCoordinator nodeCoordinatorY = layoutNodeV0 != null ? layoutNodeV0.Y() : null;
        androidx.compose.ui.layout.q qVar = androidx.compose.ui.layout.e1.a.f15015e;
        int iN = companion.n();
        LayoutDirection layoutDirectionM = companion.m();
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = androidx.compose.ui.layout.e1.a.f15016f;
        androidx.compose.ui.layout.e1.a.f15014d = iK;
        androidx.compose.ui.layout.e1.a.f15013c = layoutDirection;
        boolean zJ = companion.J(nodeCoordinatorY);
        androidx.compose.ui.layout.e1.a.v(companion, measurePassDelegateL0, x10, y10, 0.0f, 4, null);
        if (nodeCoordinatorY != null) {
            nodeCoordinatorY.k2(zJ);
        }
        androidx.compose.ui.layout.e1.a.f15014d = iN;
        androidx.compose.ui.layout.e1.a.f15013c = layoutDirectionM;
        androidx.compose.ui.layout.e1.a.f15015e = qVar;
        androidx.compose.ui.layout.e1.a.f15016f = layoutNodeLayoutDelegate;
    }

    @Override // androidx.compose.ui.layout.k1
    public void d() {
        q1(this, false, 1, null);
        s1.b bVarP = this.layoutDelegate.p();
        if (bVarP != null) {
            b1 b1Var = this.owner;
            if (b1Var != null) {
                b1Var.i(this, bVarP.getF139216a());
                return;
            }
            return;
        }
        b1 b1Var2 = this.owner;
        if (b1Var2 != null) {
            a1.d(b1Var2, false, 1, null);
        }
    }

    @dl.d
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final LayoutNodeLayoutDelegate getLayoutDelegate() {
        return this.layoutDelegate;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    @dl.d
    /* JADX INFO: renamed from: e, reason: from getter */
    public androidx.compose.ui.n getModifier() {
        return this.modifier;
    }

    public final boolean e0() {
        return this.layoutDelegate.r();
    }

    public final boolean e1(@dl.e s1.b constraints) {
        if (constraints == null) {
            return false;
        }
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            F();
        }
        return l0().h2(constraints.getF139216a());
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void f(@dl.d androidx.compose.ui.n value) {
        LayoutNode layoutNodeV0;
        kotlin.jvm.internal.f0.p(value, "value");
        if (kotlin.jvm.internal.f0.g(value, this.modifier)) {
            return;
        }
        if (!(!this.isVirtual || getModifier() == androidx.compose.ui.n.INSTANCE)) {
            throw new IllegalArgumentException("Modifiers are not supported on virtual LayoutNodes".toString());
        }
        this.modifier = value;
        boolean zF1 = F1();
        NodeCoordinator nodeCoordinatorT0 = t0();
        this.nodes.K(value);
        NodeCoordinator wrapped = Y().getWrapped();
        for (NodeCoordinator nodeCoordinatorT1 = t0(); !kotlin.jvm.internal.f0.g(nodeCoordinatorT1, wrapped) && nodeCoordinatorT1 != null; nodeCoordinatorT1 = nodeCoordinatorT1.getWrapped()) {
            nodeCoordinatorT1.k3();
            nodeCoordinatorT1.K3(this.mLookaheadScope);
        }
        this.layoutDelegate.N();
        if ((zF1 || F1()) && (layoutNodeV0 = v0()) != null) {
            layoutNodeV0.I0();
        }
        if (kotlin.jvm.internal.f0.g(nodeCoordinatorT0, Y()) && kotlin.jvm.internal.f0.g(t0(), Y())) {
            return;
        }
        K0();
    }

    @dl.d
    public final LayoutState f0() {
        return this.layoutDelegate.s();
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void g(@dl.d s1.e value) {
        kotlin.jvm.internal.f0.p(value, "value");
        if (kotlin.jvm.internal.f0.g(this.f15149p, value)) {
            return;
        }
        this.f15149p = value;
        Z0();
    }

    public final boolean g0() {
        return this.layoutDelegate.u();
    }

    public final void g1() {
        int iG = this._foldedChildren.g();
        while (true) {
            iG--;
            if (-1 >= iG) {
                this._foldedChildren.c();
                return;
            }
            Y0(this._foldedChildren.e(iG));
        }
    }

    @Override // androidx.compose.ui.layout.u, androidx.compose.ui.node.ComposeUiNode
    @dl.d
    /* JADX INFO: renamed from: getDensity, reason: from getter */
    public s1.e getF15149p() {
        return this.f15149p;
    }

    @Override // androidx.compose.ui.layout.u
    public int getHeight() {
        return this.layoutDelegate.o();
    }

    @Override // androidx.compose.ui.layout.u, androidx.compose.ui.node.ComposeUiNode
    @dl.d
    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    @Override // androidx.compose.ui.layout.u, androidx.compose.ui.node.ComposeUiNode
    @dl.d
    public d2 getViewConfiguration() {
        return this.viewConfiguration;
    }

    @Override // androidx.compose.ui.layout.u
    public int getWidth() {
        return this.layoutDelegate.A();
    }

    public final boolean h0() {
        return this.layoutDelegate.v();
    }

    public final void h1(int index, int count) {
        if (!(count >= 0)) {
            throw new IllegalArgumentException(("count (" + count + ") must be greater than 0").toString());
        }
        int i10 = (count + index) - 1;
        if (index > i10) {
            return;
        }
        while (true) {
            Y0(this._foldedChildren.i(i10));
            if (i10 == index) {
                return;
            } else {
                i10--;
            }
        }
    }

    public final void i1() {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            G();
        }
        try {
            this.relayoutWithoutParentInProgress = true;
            l0().i2();
        } finally {
            this.relayoutWithoutParentInProgress = false;
        }
    }

    @Override // androidx.compose.ui.node.c1
    public boolean isValid() {
        return p();
    }

    @dl.d
    public final b0 j0() {
        return d0.b(this).getSharedDrawScope();
    }

    public final void j1(boolean forceRequest) {
        b1 b1Var;
        if (this.isVirtual || (b1Var = this.owner) == null) {
            return;
        }
        b1Var.r(this, true, forceRequest);
    }

    @dl.e
    /* JADX INFO: renamed from: k0, reason: from getter */
    public final androidx.compose.ui.layout.f0 getMLookaheadScope() {
        return this.mLookaheadScope;
    }

    public final void l1(boolean forceRequest) {
        if (!(this.mLookaheadScope != null)) {
            throw new IllegalStateException("Lookahead measure cannot be requested on a node that is not a part of theLookaheadLayout".toString());
        }
        b1 b1Var = this.owner;
        if (b1Var == null || this.ignoreRemeasureRequests || this.isVirtual) {
            return;
        }
        b1Var.c(this, true, forceRequest);
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegateI0 = i0();
        kotlin.jvm.internal.f0.m(lookaheadPassDelegateI0);
        lookaheadPassDelegateI0.f2(forceRequest);
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void m(@dl.d d2 d2Var) {
        kotlin.jvm.internal.f0.p(d2Var, "<set-?>");
        this.viewConfiguration = d2Var;
    }

    public final boolean m0() {
        return this.layoutDelegate.y();
    }

    @Override // androidx.compose.ui.node.b1.b
    public void n() {
        NodeCoordinator nodeCoordinatorY = Y();
        int iF = x0.f15398a.f();
        boolean zC = w0.c(iF);
        androidx.compose.ui.n.d dVarT2 = nodeCoordinatorY.getTail();
        if (!zC && (dVarT2 = dVarT2.getParent()) == null) {
            return;
        }
        for (androidx.compose.ui.n.d dVarZ2 = nodeCoordinatorY.Z2(zC); dVarZ2 != null && (dVarZ2.getAggregateChildKindSet() & iF) != 0; dVarZ2 = dVarZ2.getChild()) {
            if ((dVarZ2.getKindSet() & iF) != 0 && (dVarZ2 instanceof t)) {
                ((t) dVarZ2).p(Y());
            }
            if (dVarZ2 == dVarT2) {
                return;
            }
        }
    }

    @dl.d
    /* JADX INFO: renamed from: n0, reason: from getter */
    public final UsageByParent getMeasuredByParent() {
        return this.measuredByParent;
    }

    public final void n1(boolean forceRequest) {
        b1 b1Var;
        if (this.isVirtual || (b1Var = this.owner) == null) {
            return;
        }
        a1.f(b1Var, this, false, forceRequest, 2, null);
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    @dl.d
    /* JADX INFO: renamed from: o, reason: from getter */
    public androidx.compose.ui.layout.i0 getMeasurePolicy() {
        return this.measurePolicy;
    }

    @dl.d
    /* JADX INFO: renamed from: o0, reason: from getter */
    public final UsageByParent getMeasuredByParentInLookahead() {
        return this.measuredByParentInLookahead;
    }

    @Override // androidx.compose.ui.layout.u
    public boolean p() {
        return this.owner != null;
    }

    /* JADX INFO: renamed from: p0, reason: from getter */
    public final boolean getNeedsOnPositionedDispatch() {
        return this.needsOnPositionedDispatch;
    }

    public final void p1(boolean forceRequest) {
        b1 b1Var;
        if (this.ignoreRemeasureRequests || this.isVirtual || (b1Var = this.owner) == null) {
            return;
        }
        a1.e(b1Var, this, false, forceRequest, 2, null);
        l0().c2(forceRequest);
    }

    @dl.d
    /* JADX INFO: renamed from: q0, reason: from getter */
    public final t0 getNodes() {
        return this.nodes;
    }

    @dl.e
    public final yh.l<b1, b2> r0() {
        return this.K;
    }

    public final void r1(@dl.d LayoutNode it) {
        kotlin.jvm.internal.f0.p(it, "it");
        if (e.f15163a[it.f0().ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + it.f0());
        }
        if (it.m0()) {
            it.p1(true);
            return;
        }
        if (it.e0()) {
            it.n1(true);
        } else if (it.h0()) {
            it.l1(true);
        } else if (it.g0()) {
            it.j1(true);
        }
    }

    @dl.e
    public final yh.l<b1, b2> s0() {
        return this.L;
    }

    public final void s1() {
        androidx.compose.runtime.collection.e<LayoutNode> eVarB0 = B0();
        int iK = eVarB0.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        if (iK > 0) {
            int i10 = 0;
            LayoutNode[] layoutNodeArrG = eVarB0.G();
            kotlin.jvm.internal.f0.n(layoutNodeArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                LayoutNode layoutNode = layoutNodeArrG[i10];
                UsageByParent usageByParent = layoutNode.previousIntrinsicsUsageByParent;
                layoutNode.intrinsicsUsageByParent = usageByParent;
                if (usageByParent != UsageByParent.NotUsed) {
                    layoutNode.s1();
                }
                i10++;
            } while (i10 < iK);
        }
    }

    @Override // androidx.compose.ui.layout.u
    /* JADX INFO: renamed from: t, reason: from getter */
    public boolean getIsPlaced() {
        return this.isPlaced;
    }

    @dl.d
    public final NodeCoordinator t0() {
        return this.nodes.getOuterCoordinator();
    }

    public final void t1(boolean z10) {
        this.canMultiMeasure = z10;
    }

    @dl.d
    public String toString() {
        return androidx.compose.ui.platform.a1.b(this, null) + " children: " + V().size() + " measurePolicy: " + getMeasurePolicy();
    }

    @Override // androidx.compose.ui.layout.u
    @dl.d
    public androidx.compose.ui.layout.q u() {
        return Y();
    }

    @dl.e
    /* JADX INFO: renamed from: u0, reason: from getter */
    public final b1 getOwner() {
        return this.owner;
    }

    public final void u1(int i10) {
        this.depth = i10;
    }

    @Override // androidx.compose.ui.layout.u
    /* JADX INFO: renamed from: v, reason: from getter */
    public int getSemanticsId() {
        return this.semanticsId;
    }

    @dl.e
    public final LayoutNode v0() {
        LayoutNode layoutNode = this._foldedParent;
        if (!(layoutNode != null && layoutNode.isVirtual)) {
            return layoutNode;
        }
        if (layoutNode != null) {
            return layoutNode.v0();
        }
        return null;
    }

    public final void v1(boolean z10) {
        this.innerLayerCoordinatorIsDirty = z10;
    }

    @Override // androidx.compose.ui.layout.u
    @dl.e
    public androidx.compose.ui.layout.u w() {
        return v0();
    }

    /* JADX INFO: renamed from: w0, reason: from getter */
    public final int getPlaceOrder() {
        return this.placeOrder;
    }

    public final void w1(@dl.d UsageByParent usageByParent) {
        kotlin.jvm.internal.f0.p(usageByParent, "<set-?>");
        this.intrinsicsUsageByParent = usageByParent;
    }

    @Override // androidx.compose.ui.layout.u
    @dl.d
    public List<androidx.compose.ui.layout.o0> x() {
        return this.nodes.p();
    }

    /* JADX INFO: renamed from: x0, reason: from getter */
    public final int getPreviousPlaceOrder() {
        return this.previousPlaceOrder;
    }

    public final void x1(boolean z10) {
        if (z10 != this.isLookaheadRoot) {
            if (z10) {
                y1(new androidx.compose.ui.layout.f0(this));
            } else {
                y1(null);
            }
            this.isLookaheadRoot = z10;
        }
    }

    @dl.e
    /* JADX INFO: renamed from: y0, reason: from getter */
    public final LayoutNodeSubcompositionsState getSubcompositionsState() {
        return this.subcompositionsState;
    }

    @dl.d
    public final androidx.compose.runtime.collection.e<LayoutNode> z0() {
        if (this.zSortedChildrenInvalidated) {
            this._zSortedChildren.m();
            androidx.compose.runtime.collection.e<LayoutNode> eVar = this._zSortedChildren;
            eVar.c(eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String(), B0());
            this._zSortedChildren.n0(T);
            this.zSortedChildrenInvalidated = false;
        }
        return this._zSortedChildren;
    }

    public final void z1(@dl.d UsageByParent usageByParent) {
        kotlin.jvm.internal.f0.p(usageByParent, "<set-?>");
        this.measuredByParent = usageByParent;
    }
}
