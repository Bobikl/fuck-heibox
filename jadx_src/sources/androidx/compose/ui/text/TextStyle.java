package androidx.compose.ui.text;

import androidx.compose.runtime.j2;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.umeng.message.common.UPushNotificationChannel;
import kotlin.Metadata;
import p1.LocaleList;

/* JADX INFO: renamed from: androidx.compose.ui.text.q0, reason: from toString */
/* JADX INFO: compiled from: TextStyle.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\bH\b\u0007\u0018\u0000 42\u00020\u0001:\u0001JB'\b\u0000\u0012\u0006\u0010N\u001a\u00020\u0002\u0012\u0006\u0010R\u001a\u00020\u0004\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001B\u001b\b\u0010\u0012\u0006\u0010N\u001a\u00020\u0002\u0012\u0006\u0010R\u001a\u00020\u0004¢\u0006\u0006\b\u0086\u0001\u0010\u0088\u0001BÜ\u0001\b\u0016\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\b\b\u0002\u0010\"\u001a\u00020\r\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\b\b\u0002\u0010+\u001a\u00020\u000f\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,ø\u0001\u0001¢\u0006\u0006\b\u0086\u0001\u0010\u0089\u0001Bô\u0001\b\u0016\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\b\b\u0002\u0010\"\u001a\u00020\r\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\b\b\u0002\u0010+\u001a\u00020\u000f\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102ø\u0001\u0001¢\u0006\u0006\b\u0086\u0001\u0010\u008a\u0001B\u008c\u0002\b\u0017\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\b\b\u0002\u0010\"\u001a\u00020\r\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\b\b\u0002\u0010+\u001a\u00020\u000f\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000106\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u000108ø\u0001\u0001¢\u0006\u0006\b\u0086\u0001\u0010\u008b\u0001B\u0096\u0002\b\u0017\u0012\b\u0010=\u001a\u0004\u0018\u00010<\u0012\b\b\u0002\u0010?\u001a\u00020>\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\b\b\u0002\u0010\"\u001a\u00020\r\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\b\b\u0002\u0010+\u001a\u00020\u000f\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000106\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u000108ø\u0001\u0001¢\u0006\u0006\b\u0086\u0001\u0010\u008c\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\u0014\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0000H\u0007J\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\u0011\u0010\n\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\u0002J\u0011\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0004H\u0087\u0002J\u0011\u0010\f\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002H\u0087\u0002Já\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u000f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010\"\u001a\u00020\r2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\b\b\u0002\u0010+\u001a\u00020\u000f2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/Jù\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u000f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010\"\u001a\u00020\r2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\b\b\u0002\u0010+\u001a\u00020\u000f2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0002\u00101\u001a\u0004\u0018\u0001002\n\b\u0002\u00103\u001a\u0004\u0018\u000102ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105J\u0093\u0002\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u000f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010\"\u001a\u00020\r2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\b\b\u0002\u0010+\u001a\u00020\u000f2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0002\u00101\u001a\u0004\u0018\u0001002\n\b\u0002\u00103\u001a\u0004\u0018\u0001022\n\b\u0002\u00107\u001a\u0004\u0018\u0001062\n\b\u0002\u00109\u001a\u0004\u0018\u000108H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b:\u0010;J\u009d\u0002\u0010@\u001a\u00020\u00002\b\u0010=\u001a\u0004\u0018\u00010<2\b\b\u0002\u0010?\u001a\u00020>2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u000f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010\"\u001a\u00020\r2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\b\b\u0002\u0010+\u001a\u00020\u000f2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0002\u00101\u001a\u0004\u0018\u0001002\n\b\u0002\u00103\u001a\u0004\u0018\u0001022\n\b\u0002\u00107\u001a\u0004\u0018\u0001062\n\b\u0002\u00109\u001a\u0004\u0018\u000108H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b@\u0010AJ\u0013\u0010C\u001a\u00020B2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u000e\u0010D\u001a\u00020B2\u0006\u0010\u0006\u001a\u00020\u0000J\b\u0010F\u001a\u00020EH\u0016J\u000f\u0010G\u001a\u00020EH\u0000¢\u0006\u0004\bG\u0010HJ\b\u0010I\u001a\u00020\u0019H\u0016R\u001a\u0010N\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001a\u0010R\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010O\u001a\u0004\bP\u0010QR\u0019\u00101\u001a\u0004\u0018\u0001008\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001c\u0010=\u001a\u0004\u0018\u00010<8GX\u0087\u0004¢\u0006\f\u0012\u0004\bY\u0010Z\u001a\u0004\bW\u0010XR\u001a\u0010\u000e\u001a\u00020\r8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u001a\u0010?\u001a\u00020>8GX\u0087\u0004¢\u0006\f\u0012\u0004\b_\u0010Z\u001a\u0004\b]\u0010^R\u001a\u0010\u0010\u001a\u00020\u000f8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b`\u0010\\R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\ba\u0010bR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bc\u0010dR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\be\u0010fR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\bi\u0010jR\u001a\u0010\u001b\u001a\u00020\u000f8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bk\u0010\\R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0013\u0010!\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\bp\u0010qR\u001a\u0010\"\u001a\u00020\r8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\br\u0010\\R\u0013\u0010$\u001a\u0004\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\bs\u0010tR\u0013\u0010&\u001a\u0004\u0018\u00010%8F¢\u0006\u0006\u001a\u0004\bu\u0010vR\u001c\u0010(\u001a\u0004\u0018\u00010'8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bw\u0010xR\u001c\u0010*\u001a\u0004\u0018\u00010)8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\by\u0010zR\u001a\u0010+\u001a\u00020\u000f8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b{\u0010\\R\u0013\u0010-\u001a\u0004\u0018\u00010,8F¢\u0006\u0006\u001a\u0004\b|\u0010}R\u0013\u00103\u001a\u0004\u0018\u0001028F¢\u0006\u0006\u001a\u0004\b~\u0010\u007fR\u001f\u00109\u001a\u0004\u0018\u0001088GX\u0087\u0004¢\u0006\u000f\u0012\u0005\b\u0082\u0001\u0010Z\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001f\u00107\u001a\u0004\u0018\u0001068GX\u0087\u0004¢\u0006\u000f\u0012\u0005\b\u0085\u0001\u0010Z\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u008d\u0001"}, d2 = {"Landroidx/compose/ui/text/q0;", "", "Landroidx/compose/ui/text/d0;", "X", "Landroidx/compose/ui/text/u;", androidx.exifinterface.media.a.T4, "other", "R", "Q", "P", androidx.exifinterface.media.a.X4, androidx.exifinterface.media.a.f23244d5, "U", "Landroidx/compose/ui/graphics/l0;", "color", "Ls1/u;", com.google.android.exoplayer2.text.ttml.d.J, "Landroidx/compose/ui/text/font/k0;", com.google.android.exoplayer2.text.ttml.d.L, "Landroidx/compose/ui/text/font/g0;", com.google.android.exoplayer2.text.ttml.d.I, "Landroidx/compose/ui/text/font/h0;", "fontSynthesis", "Landroidx/compose/ui/text/font/v;", com.google.android.exoplayer2.text.ttml.d.K, "", "fontFeatureSettings", "letterSpacing", "Landroidx/compose/ui/text/style/a;", "baselineShift", "Landroidx/compose/ui/text/style/m;", "textGeometricTransform", "Lp1/f;", "localeList", UiKitSpanObj.TYPE_BACKGROUND, "Landroidx/compose/ui/text/style/i;", com.google.android.exoplayer2.text.ttml.d.P, "Landroidx/compose/ui/graphics/e2;", "shadow", "Landroidx/compose/ui/text/style/h;", com.google.android.exoplayer2.text.ttml.d.Q, "Landroidx/compose/ui/text/style/j;", "textDirection", "lineHeight", "Landroidx/compose/ui/text/style/o;", "textIndent", "b", "(JJLandroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/g0;Landroidx/compose/ui/text/font/h0;Landroidx/compose/ui/text/font/v;Ljava/lang/String;JLandroidx/compose/ui/text/style/a;Landroidx/compose/ui/text/style/m;Lp1/f;JLandroidx/compose/ui/text/style/i;Landroidx/compose/ui/graphics/e2;Landroidx/compose/ui/text/style/h;Landroidx/compose/ui/text/style/j;JLandroidx/compose/ui/text/style/o;)Landroidx/compose/ui/text/q0;", "Landroidx/compose/ui/text/b0;", "platformStyle", "Landroidx/compose/ui/text/style/g;", "lineHeightStyle", "d", "(JJLandroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/g0;Landroidx/compose/ui/text/font/h0;Landroidx/compose/ui/text/font/v;Ljava/lang/String;JLandroidx/compose/ui/text/style/a;Landroidx/compose/ui/text/style/m;Lp1/f;JLandroidx/compose/ui/text/style/i;Landroidx/compose/ui/graphics/e2;Landroidx/compose/ui/text/style/h;Landroidx/compose/ui/text/style/j;JLandroidx/compose/ui/text/style/o;Landroidx/compose/ui/text/b0;Landroidx/compose/ui/text/style/g;)Landroidx/compose/ui/text/q0;", "Landroidx/compose/ui/text/style/f;", "lineBreak", "Landroidx/compose/ui/text/style/e;", "hyphens", "f", "(JJLandroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/g0;Landroidx/compose/ui/text/font/h0;Landroidx/compose/ui/text/font/v;Ljava/lang/String;JLandroidx/compose/ui/text/style/a;Landroidx/compose/ui/text/style/m;Lp1/f;JLandroidx/compose/ui/text/style/i;Landroidx/compose/ui/graphics/e2;Landroidx/compose/ui/text/style/h;Landroidx/compose/ui/text/style/j;JLandroidx/compose/ui/text/style/o;Landroidx/compose/ui/text/b0;Landroidx/compose/ui/text/style/g;Landroidx/compose/ui/text/style/f;Landroidx/compose/ui/text/style/e;)Landroidx/compose/ui/text/q0;", "Landroidx/compose/ui/graphics/a0;", "brush", "", "alpha", RXScreenCaptureService.KEY_HEIGHT, "(Landroidx/compose/ui/graphics/a0;FJLandroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/g0;Landroidx/compose/ui/text/font/h0;Landroidx/compose/ui/text/font/v;Ljava/lang/String;JLandroidx/compose/ui/text/style/a;Landroidx/compose/ui/text/style/m;Lp1/f;JLandroidx/compose/ui/text/style/i;Landroidx/compose/ui/graphics/e2;Landroidx/compose/ui/text/style/h;Landroidx/compose/ui/text/style/j;JLandroidx/compose/ui/text/style/o;Landroidx/compose/ui/text/b0;Landroidx/compose/ui/text/style/g;Landroidx/compose/ui/text/style/f;Landroidx/compose/ui/text/style/e;)Landroidx/compose/ui/text/q0;", "", "equals", "N", "", "hashCode", "O", "()I", "toString", ak.av, "Landroidx/compose/ui/text/d0;", "H", "()Landroidx/compose/ui/text/d0;", "spanStyle", "Landroidx/compose/ui/text/u;", androidx.exifinterface.media.a.S4, "()Landroidx/compose/ui/text/u;", "paragraphStyle", ak.aF, "Landroidx/compose/ui/text/b0;", "F", "()Landroidx/compose/ui/text/b0;", "n", "()Landroidx/compose/ui/graphics/a0;", "getBrush$annotations", "()V", "p", "()J", "j", "()F", "getAlpha$annotations", ak.aB, "v", "()Landroidx/compose/ui/text/font/k0;", "t", "()Landroidx/compose/ui/text/font/g0;", ak.aG, "()Landroidx/compose/ui/text/font/h0;", "q", "()Landroidx/compose/ui/text/font/v;", "r", "()Ljava/lang/String;", "y", "m", "()Landroidx/compose/ui/text/style/a;", "L", "()Landroidx/compose/ui/text/style/m;", "D", "()Lp1/f;", "l", "J", "()Landroidx/compose/ui/text/style/i;", "G", "()Landroidx/compose/ui/graphics/e2;", "I", "()Landroidx/compose/ui/text/style/h;", "K", "()Landroidx/compose/ui/text/style/j;", "B", "M", "()Landroidx/compose/ui/text/style/o;", "C", "()Landroidx/compose/ui/text/style/g;", RXScreenCaptureService.KEY_WIDTH, "()Landroidx/compose/ui/text/style/e;", "getHyphens$annotations", ak.aD, "()Landroidx/compose/ui/text/style/f;", "getLineBreak$annotations", "<init>", "(Landroidx/compose/ui/text/d0;Landroidx/compose/ui/text/u;Landroidx/compose/ui/text/b0;)V", "(Landroidx/compose/ui/text/d0;Landroidx/compose/ui/text/u;)V", "(JJLandroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/g0;Landroidx/compose/ui/text/font/h0;Landroidx/compose/ui/text/font/v;Ljava/lang/String;JLandroidx/compose/ui/text/style/a;Landroidx/compose/ui/text/style/m;Lp1/f;JLandroidx/compose/ui/text/style/i;Landroidx/compose/ui/graphics/e2;Landroidx/compose/ui/text/style/h;Landroidx/compose/ui/text/style/j;JLandroidx/compose/ui/text/style/o;Lkotlin/jvm/internal/u;)V", "(JJLandroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/g0;Landroidx/compose/ui/text/font/h0;Landroidx/compose/ui/text/font/v;Ljava/lang/String;JLandroidx/compose/ui/text/style/a;Landroidx/compose/ui/text/style/m;Lp1/f;JLandroidx/compose/ui/text/style/i;Landroidx/compose/ui/graphics/e2;Landroidx/compose/ui/text/style/h;Landroidx/compose/ui/text/style/j;JLandroidx/compose/ui/text/style/o;Landroidx/compose/ui/text/b0;Landroidx/compose/ui/text/style/g;Lkotlin/jvm/internal/u;)V", "(JJLandroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/g0;Landroidx/compose/ui/text/font/h0;Landroidx/compose/ui/text/font/v;Ljava/lang/String;JLandroidx/compose/ui/text/style/a;Landroidx/compose/ui/text/style/m;Lp1/f;JLandroidx/compose/ui/text/style/i;Landroidx/compose/ui/graphics/e2;Landroidx/compose/ui/text/style/h;Landroidx/compose/ui/text/style/j;JLandroidx/compose/ui/text/style/o;Landroidx/compose/ui/text/b0;Landroidx/compose/ui/text/style/g;Landroidx/compose/ui/text/style/f;Landroidx/compose/ui/text/style/e;Lkotlin/jvm/internal/u;)V", "(Landroidx/compose/ui/graphics/a0;FJLandroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/g0;Landroidx/compose/ui/text/font/h0;Landroidx/compose/ui/text/font/v;Ljava/lang/String;JLandroidx/compose/ui/text/style/a;Landroidx/compose/ui/text/style/m;Lp1/f;JLandroidx/compose/ui/text/style/i;Landroidx/compose/ui/graphics/e2;Landroidx/compose/ui/text/style/h;Landroidx/compose/ui/text/style/j;JLandroidx/compose/ui/text/style/o;Landroidx/compose/ui/text/b0;Landroidx/compose/ui/text/style/g;Landroidx/compose/ui/text/style/f;Landroidx/compose/ui/text/style/e;Lkotlin/jvm/internal/u;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class TextStyle {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final TextStyle f16876e = new TextStyle(0, 0, (FontWeight) null, (androidx.compose.ui.text.font.g0) null, (androidx.compose.ui.text.font.h0) null, (androidx.compose.ui.text.font.v) null, (String) null, 0, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0, (androidx.compose.ui.text.style.i) null, (Shadow) null, (androidx.compose.ui.text.style.h) null, (androidx.compose.ui.text.style.j) null, 0, (TextIndent) null, 262143, (kotlin.jvm.internal.u) null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final SpanStyle spanStyle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final ParagraphStyle paragraphStyle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private final PlatformTextStyle platformStyle;

    /* JADX INFO: renamed from: androidx.compose.ui.text.q0$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: TextStyle.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/q0$a;", "", "Landroidx/compose/ui/text/q0;", UPushNotificationChannel.DEFAULT_NOTIFICATION_CHANNEL_NAME, "Landroidx/compose/ui/text/q0;", ak.av, "()Landroidx/compose/ui/text/q0;", "getDefault$annotations", "()V", "<init>", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @j2
        public static /* synthetic */ void b() {
        }

        @dl.d
        public final TextStyle a() {
            return TextStyle.f16876e;
        }
    }

    private TextStyle(long j10, long j11, FontWeight fontWeight, androidx.compose.ui.text.font.g0 g0Var, androidx.compose.ui.text.font.h0 h0Var, androidx.compose.ui.text.font.v vVar, String str, long j12, androidx.compose.ui.text.style.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, androidx.compose.ui.text.style.i iVar, Shadow shadow, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.j jVar, long j14, TextIndent textIndent) {
        this(new SpanStyle(j10, j11, fontWeight, g0Var, h0Var, vVar, str, j12, aVar, textGeometricTransform, localeList, j13, iVar, shadow, (z) null, (kotlin.jvm.internal.u) null), new ParagraphStyle(hVar, jVar, j14, textIndent, null, null, null, null, null), null);
    }

    public /* synthetic */ TextStyle(long j10, long j11, FontWeight fontWeight, androidx.compose.ui.text.font.g0 g0Var, androidx.compose.ui.text.font.h0 h0Var, androidx.compose.ui.text.font.v vVar, String str, long j12, androidx.compose.ui.text.style.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, androidx.compose.ui.text.style.i iVar, Shadow shadow, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.j jVar, long j14, TextIndent textIndent, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? androidx.compose.ui.graphics.l0.INSTANCE.u() : j10, (i10 & 2) != 0 ? s1.u.f139249b.b() : j11, (i10 & 4) != 0 ? null : fontWeight, (i10 & 8) != 0 ? null : g0Var, (i10 & 16) != 0 ? null : h0Var, (i10 & 32) != 0 ? null : vVar, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? s1.u.f139249b.b() : j12, (i10 & 256) != 0 ? null : aVar, (i10 & 512) != 0 ? null : textGeometricTransform, (i10 & 1024) != 0 ? null : localeList, (i10 & 2048) != 0 ? androidx.compose.ui.graphics.l0.INSTANCE.u() : j13, (i10 & 4096) != 0 ? null : iVar, (i10 & 8192) != 0 ? null : shadow, (i10 & 16384) != 0 ? null : hVar, (i10 & 32768) != 0 ? null : jVar, (i10 & 65536) != 0 ? s1.u.f139249b.b() : j14, (i10 & 131072) != 0 ? null : textIndent, null);
    }

    private TextStyle(long j10, long j11, FontWeight fontWeight, androidx.compose.ui.text.font.g0 g0Var, androidx.compose.ui.text.font.h0 h0Var, androidx.compose.ui.text.font.v vVar, String str, long j12, androidx.compose.ui.text.style.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, androidx.compose.ui.text.style.i iVar, Shadow shadow, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.j jVar, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle) {
        this(new SpanStyle(j10, j11, fontWeight, g0Var, h0Var, vVar, str, j12, aVar, textGeometricTransform, localeList, j13, iVar, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, (kotlin.jvm.internal.u) null), new ParagraphStyle(hVar, jVar, j14, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphSyle() : null, lineHeightStyle, null, null, null), platformTextStyle);
    }

    public /* synthetic */ TextStyle(long j10, long j11, FontWeight fontWeight, androidx.compose.ui.text.font.g0 g0Var, androidx.compose.ui.text.font.h0 h0Var, androidx.compose.ui.text.font.v vVar, String str, long j12, androidx.compose.ui.text.style.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, androidx.compose.ui.text.style.i iVar, Shadow shadow, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.j jVar, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? androidx.compose.ui.graphics.l0.INSTANCE.u() : j10, (i10 & 2) != 0 ? s1.u.f139249b.b() : j11, (i10 & 4) != 0 ? null : fontWeight, (i10 & 8) != 0 ? null : g0Var, (i10 & 16) != 0 ? null : h0Var, (i10 & 32) != 0 ? null : vVar, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? s1.u.f139249b.b() : j12, (i10 & 256) != 0 ? null : aVar, (i10 & 512) != 0 ? null : textGeometricTransform, (i10 & 1024) != 0 ? null : localeList, (i10 & 2048) != 0 ? androidx.compose.ui.graphics.l0.INSTANCE.u() : j13, (i10 & 4096) != 0 ? null : iVar, (i10 & 8192) != 0 ? null : shadow, (i10 & 16384) != 0 ? null : hVar, (i10 & 32768) != 0 ? null : jVar, (i10 & 65536) != 0 ? s1.u.f139249b.b() : j14, (i10 & 131072) != 0 ? null : textIndent, (i10 & 262144) != 0 ? null : platformTextStyle, (i10 & 524288) != 0 ? null : lineHeightStyle, null);
    }

    private TextStyle(long j10, long j11, FontWeight fontWeight, androidx.compose.ui.text.font.g0 g0Var, androidx.compose.ui.text.font.h0 h0Var, androidx.compose.ui.text.font.v vVar, String str, long j12, androidx.compose.ui.text.style.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, androidx.compose.ui.text.style.i iVar, Shadow shadow, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.j jVar, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, androidx.compose.ui.text.style.e eVar) {
        this(new SpanStyle(j10, j11, fontWeight, g0Var, h0Var, vVar, str, j12, aVar, textGeometricTransform, localeList, j13, iVar, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, (kotlin.jvm.internal.u) null), new ParagraphStyle(hVar, jVar, j14, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphSyle() : null, lineHeightStyle, lineBreak, eVar, null), platformTextStyle);
    }

    public /* synthetic */ TextStyle(long j10, long j11, FontWeight fontWeight, androidx.compose.ui.text.font.g0 g0Var, androidx.compose.ui.text.font.h0 h0Var, androidx.compose.ui.text.font.v vVar, String str, long j12, androidx.compose.ui.text.style.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, androidx.compose.ui.text.style.i iVar, Shadow shadow, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.j jVar, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, androidx.compose.ui.text.style.e eVar, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? androidx.compose.ui.graphics.l0.INSTANCE.u() : j10, (i10 & 2) != 0 ? s1.u.f139249b.b() : j11, (i10 & 4) != 0 ? null : fontWeight, (i10 & 8) != 0 ? null : g0Var, (i10 & 16) != 0 ? null : h0Var, (i10 & 32) != 0 ? null : vVar, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? s1.u.f139249b.b() : j12, (i10 & 256) != 0 ? null : aVar, (i10 & 512) != 0 ? null : textGeometricTransform, (i10 & 1024) != 0 ? null : localeList, (i10 & 2048) != 0 ? androidx.compose.ui.graphics.l0.INSTANCE.u() : j13, (i10 & 4096) != 0 ? null : iVar, (i10 & 8192) != 0 ? null : shadow, (i10 & 16384) != 0 ? null : hVar, (i10 & 32768) != 0 ? null : jVar, (i10 & 65536) != 0 ? s1.u.f139249b.b() : j14, (i10 & 131072) != 0 ? null : textIndent, (i10 & 262144) != 0 ? null : platformTextStyle, (i10 & 524288) != 0 ? null : lineHeightStyle, (i10 & 1048576) != 0 ? null : lineBreak, (i10 & 2097152) != 0 ? null : eVar, (kotlin.jvm.internal.u) null);
    }

    @g
    public /* synthetic */ TextStyle(long j10, long j11, FontWeight fontWeight, androidx.compose.ui.text.font.g0 g0Var, androidx.compose.ui.text.font.h0 h0Var, androidx.compose.ui.text.font.v vVar, String str, long j12, androidx.compose.ui.text.style.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, androidx.compose.ui.text.style.i iVar, Shadow shadow, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.j jVar, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, androidx.compose.ui.text.style.e eVar, kotlin.jvm.internal.u uVar) {
        this(j10, j11, fontWeight, g0Var, h0Var, vVar, str, j12, aVar, textGeometricTransform, localeList, j13, iVar, shadow, hVar, jVar, j14, textIndent, platformTextStyle, lineHeightStyle, lineBreak, eVar);
    }

    public /* synthetic */ TextStyle(long j10, long j11, FontWeight fontWeight, androidx.compose.ui.text.font.g0 g0Var, androidx.compose.ui.text.font.h0 h0Var, androidx.compose.ui.text.font.v vVar, String str, long j12, androidx.compose.ui.text.style.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, androidx.compose.ui.text.style.i iVar, Shadow shadow, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.j jVar, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, kotlin.jvm.internal.u uVar) {
        this(j10, j11, fontWeight, g0Var, h0Var, vVar, str, j12, aVar, textGeometricTransform, localeList, j13, iVar, shadow, hVar, jVar, j14, textIndent, platformTextStyle, lineHeightStyle);
    }

    public /* synthetic */ TextStyle(long j10, long j11, FontWeight fontWeight, androidx.compose.ui.text.font.g0 g0Var, androidx.compose.ui.text.font.h0 h0Var, androidx.compose.ui.text.font.v vVar, String str, long j12, androidx.compose.ui.text.style.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, androidx.compose.ui.text.style.i iVar, Shadow shadow, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.j jVar, long j14, TextIndent textIndent, kotlin.jvm.internal.u uVar) {
        this(j10, j11, fontWeight, g0Var, h0Var, vVar, str, j12, aVar, textGeometricTransform, localeList, j13, iVar, shadow, hVar, jVar, j14, textIndent);
    }

    private TextStyle(androidx.compose.ui.graphics.a0 a0Var, float f10, long j10, FontWeight fontWeight, androidx.compose.ui.text.font.g0 g0Var, androidx.compose.ui.text.font.h0 h0Var, androidx.compose.ui.text.font.v vVar, String str, long j11, androidx.compose.ui.text.style.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j12, androidx.compose.ui.text.style.i iVar, Shadow shadow, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.j jVar, long j13, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, androidx.compose.ui.text.style.e eVar) {
        this(new SpanStyle(a0Var, f10, j10, fontWeight, g0Var, h0Var, vVar, str, j11, aVar, textGeometricTransform, localeList, j12, iVar, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, (kotlin.jvm.internal.u) null), new ParagraphStyle(hVar, jVar, j13, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphSyle() : null, lineHeightStyle, lineBreak, eVar, null), platformTextStyle);
    }

    public /* synthetic */ TextStyle(androidx.compose.ui.graphics.a0 a0Var, float f10, long j10, FontWeight fontWeight, androidx.compose.ui.text.font.g0 g0Var, androidx.compose.ui.text.font.h0 h0Var, androidx.compose.ui.text.font.v vVar, String str, long j11, androidx.compose.ui.text.style.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j12, androidx.compose.ui.text.style.i iVar, Shadow shadow, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.j jVar, long j13, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, androidx.compose.ui.text.style.e eVar, int i10, kotlin.jvm.internal.u uVar) {
        this(a0Var, (i10 & 2) != 0 ? Float.NaN : f10, (i10 & 4) != 0 ? s1.u.f139249b.b() : j10, (i10 & 8) != 0 ? null : fontWeight, (i10 & 16) != 0 ? null : g0Var, (i10 & 32) != 0 ? null : h0Var, (i10 & 64) != 0 ? null : vVar, (i10 & 128) != 0 ? null : str, (i10 & 256) != 0 ? s1.u.f139249b.b() : j11, (i10 & 512) != 0 ? null : aVar, (i10 & 1024) != 0 ? null : textGeometricTransform, (i10 & 2048) != 0 ? null : localeList, (i10 & 4096) != 0 ? androidx.compose.ui.graphics.l0.INSTANCE.u() : j12, (i10 & 8192) != 0 ? null : iVar, (i10 & 16384) != 0 ? null : shadow, (32768 & i10) != 0 ? null : hVar, (65536 & i10) != 0 ? null : jVar, (131072 & i10) != 0 ? s1.u.f139249b.b() : j13, (262144 & i10) != 0 ? null : textIndent, (524288 & i10) != 0 ? null : platformTextStyle, (1048576 & i10) != 0 ? null : lineHeightStyle, (2097152 & i10) != 0 ? null : lineBreak, (i10 & 4194304) != 0 ? null : eVar, (kotlin.jvm.internal.u) null);
    }

    @g
    public /* synthetic */ TextStyle(androidx.compose.ui.graphics.a0 a0Var, float f10, long j10, FontWeight fontWeight, androidx.compose.ui.text.font.g0 g0Var, androidx.compose.ui.text.font.h0 h0Var, androidx.compose.ui.text.font.v vVar, String str, long j11, androidx.compose.ui.text.style.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j12, androidx.compose.ui.text.style.i iVar, Shadow shadow, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.j jVar, long j13, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, androidx.compose.ui.text.style.e eVar, kotlin.jvm.internal.u uVar) {
        this(a0Var, f10, j10, fontWeight, g0Var, h0Var, vVar, str, j11, aVar, textGeometricTransform, localeList, j12, iVar, shadow, hVar, jVar, j13, textIndent, platformTextStyle, lineHeightStyle, lineBreak, eVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStyle(@dl.d SpanStyle spanStyle, @dl.d ParagraphStyle paragraphStyle) {
        this(spanStyle, paragraphStyle, r0.b(spanStyle.getPlatformStyle(), paragraphStyle.getPlatformStyle()));
        kotlin.jvm.internal.f0.p(spanStyle, "spanStyle");
        kotlin.jvm.internal.f0.p(paragraphStyle, "paragraphStyle");
    }

    public TextStyle(@dl.d SpanStyle spanStyle, @dl.d ParagraphStyle paragraphStyle, @dl.e PlatformTextStyle platformTextStyle) {
        kotlin.jvm.internal.f0.p(spanStyle, "spanStyle");
        kotlin.jvm.internal.f0.p(paragraphStyle, "paragraphStyle");
        this.spanStyle = spanStyle;
        this.paragraphStyle = paragraphStyle;
        this.platformStyle = platformTextStyle;
    }

    public /* synthetic */ TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle, PlatformTextStyle platformTextStyle, int i10, kotlin.jvm.internal.u uVar) {
        this(spanStyle, paragraphStyle, (i10 & 4) != 0 ? null : platformTextStyle);
    }

    @g
    public static /* synthetic */ void A() {
    }

    public static /* synthetic */ TextStyle S(TextStyle textStyle, TextStyle textStyle2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            textStyle2 = null;
        }
        return textStyle.R(textStyle2);
    }

    @g
    public static /* synthetic */ void k() {
    }

    @g
    public static /* synthetic */ void o() {
    }

    @g
    public static /* synthetic */ void x() {
    }

    public final long B() {
        return this.paragraphStyle.getLineHeight();
    }

    @dl.e
    public final LineHeightStyle C() {
        return this.paragraphStyle.getLineHeightStyle();
    }

    @dl.e
    public final LocaleList D() {
        return this.spanStyle.getLocaleList();
    }

    @dl.d
    /* JADX INFO: renamed from: E, reason: from getter */
    public final ParagraphStyle getParagraphStyle() {
        return this.paragraphStyle;
    }

    @dl.e
    /* JADX INFO: renamed from: F, reason: from getter */
    public final PlatformTextStyle getPlatformStyle() {
        return this.platformStyle;
    }

    @dl.e
    public final Shadow G() {
        return this.spanStyle.getShadow();
    }

    @dl.d
    /* JADX INFO: renamed from: H, reason: from getter */
    public final SpanStyle getSpanStyle() {
        return this.spanStyle;
    }

    @dl.e
    public final androidx.compose.ui.text.style.h I() {
        return this.paragraphStyle.getTextAlign();
    }

    @dl.e
    public final androidx.compose.ui.text.style.i J() {
        return this.spanStyle.getTextDecoration();
    }

    @dl.e
    public final androidx.compose.ui.text.style.j K() {
        return this.paragraphStyle.getTextDirection();
    }

    @dl.e
    public final TextGeometricTransform L() {
        return this.spanStyle.getTextGeometricTransform();
    }

    @dl.e
    public final TextIndent M() {
        return this.paragraphStyle.getTextIndent();
    }

    public final boolean N(@dl.d TextStyle other) {
        kotlin.jvm.internal.f0.p(other, "other");
        return this == other || (kotlin.jvm.internal.f0.g(this.paragraphStyle, other.paragraphStyle) && this.spanStyle.A(other.spanStyle));
    }

    public final int O() {
        int iC = ((this.spanStyle.C() * 31) + this.paragraphStyle.hashCode()) * 31;
        PlatformTextStyle platformTextStyle = this.platformStyle;
        return iC + (platformTextStyle != null ? platformTextStyle.hashCode() : 0);
    }

    @j2
    @dl.d
    public final TextStyle P(@dl.d ParagraphStyle other) {
        kotlin.jvm.internal.f0.p(other, "other");
        return new TextStyle(X(), W().q(other));
    }

    @j2
    @dl.d
    public final TextStyle Q(@dl.d SpanStyle other) {
        kotlin.jvm.internal.f0.p(other, "other");
        return new TextStyle(X().D(other), W());
    }

    @j2
    @dl.d
    public final TextStyle R(@dl.e TextStyle other) {
        return (other == null || kotlin.jvm.internal.f0.g(other, f16876e)) ? this : new TextStyle(X().D(other.X()), W().q(other.W()));
    }

    @j2
    @dl.d
    public final TextStyle T(@dl.d ParagraphStyle other) {
        kotlin.jvm.internal.f0.p(other, "other");
        return P(other);
    }

    @j2
    @dl.d
    public final TextStyle U(@dl.d SpanStyle other) {
        kotlin.jvm.internal.f0.p(other, "other");
        return Q(other);
    }

    @j2
    @dl.d
    public final TextStyle V(@dl.d TextStyle other) {
        kotlin.jvm.internal.f0.p(other, "other");
        return R(other);
    }

    @j2
    @dl.d
    public final ParagraphStyle W() {
        return this.paragraphStyle;
    }

    @j2
    @dl.d
    public final SpanStyle X() {
        return this.spanStyle;
    }

    @dl.d
    public final TextStyle b(long color, long fontSize, @dl.e FontWeight fontWeight, @dl.e androidx.compose.ui.text.font.g0 fontStyle, @dl.e androidx.compose.ui.text.font.h0 fontSynthesis, @dl.e androidx.compose.ui.text.font.v fontFamily, @dl.e String fontFeatureSettings, long letterSpacing, @dl.e androidx.compose.ui.text.style.a baselineShift, @dl.e TextGeometricTransform textGeometricTransform, @dl.e LocaleList localeList, long background, @dl.e androidx.compose.ui.text.style.i textDecoration, @dl.e Shadow shadow, @dl.e androidx.compose.ui.text.style.h textAlign, @dl.e androidx.compose.ui.text.style.j textDirection, long lineHeight, @dl.e TextIndent textIndent) {
        return new TextStyle(new SpanStyle(androidx.compose.ui.graphics.l0.y(color, this.spanStyle.m()) ? this.spanStyle.getTextForegroundStyle() : androidx.compose.ui.text.style.l.INSTANCE.b(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, this.spanStyle.getPlatformStyle(), (kotlin.jvm.internal.u) null), new ParagraphStyle(textAlign, textDirection, lineHeight, textIndent, this.paragraphStyle.getPlatformStyle(), C(), z(), w(), null), this.platformStyle);
    }

    @dl.d
    public final TextStyle d(long color, long fontSize, @dl.e FontWeight fontWeight, @dl.e androidx.compose.ui.text.font.g0 fontStyle, @dl.e androidx.compose.ui.text.font.h0 fontSynthesis, @dl.e androidx.compose.ui.text.font.v fontFamily, @dl.e String fontFeatureSettings, long letterSpacing, @dl.e androidx.compose.ui.text.style.a baselineShift, @dl.e TextGeometricTransform textGeometricTransform, @dl.e LocaleList localeList, long background, @dl.e androidx.compose.ui.text.style.i textDecoration, @dl.e Shadow shadow, @dl.e androidx.compose.ui.text.style.h textAlign, @dl.e androidx.compose.ui.text.style.j textDirection, long lineHeight, @dl.e TextIndent textIndent, @dl.e PlatformTextStyle platformStyle, @dl.e LineHeightStyle lineHeightStyle) {
        return new TextStyle(new SpanStyle(androidx.compose.ui.graphics.l0.y(color, this.spanStyle.m()) ? this.spanStyle.getTextForegroundStyle() : androidx.compose.ui.text.style.l.INSTANCE.b(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle != null ? platformStyle.getSpanStyle() : null, (kotlin.jvm.internal.u) null), new ParagraphStyle(textAlign, textDirection, lineHeight, textIndent, platformStyle != null ? platformStyle.getParagraphSyle() : null, lineHeightStyle, z(), w(), null), platformStyle);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextStyle)) {
            return false;
        }
        TextStyle textStyle = (TextStyle) other;
        return kotlin.jvm.internal.f0.g(this.spanStyle, textStyle.spanStyle) && kotlin.jvm.internal.f0.g(this.paragraphStyle, textStyle.paragraphStyle) && kotlin.jvm.internal.f0.g(this.platformStyle, textStyle.platformStyle);
    }

    @dl.d
    @g
    public final TextStyle f(long color, long fontSize, @dl.e FontWeight fontWeight, @dl.e androidx.compose.ui.text.font.g0 fontStyle, @dl.e androidx.compose.ui.text.font.h0 fontSynthesis, @dl.e androidx.compose.ui.text.font.v fontFamily, @dl.e String fontFeatureSettings, long letterSpacing, @dl.e androidx.compose.ui.text.style.a baselineShift, @dl.e TextGeometricTransform textGeometricTransform, @dl.e LocaleList localeList, long background, @dl.e androidx.compose.ui.text.style.i textDecoration, @dl.e Shadow shadow, @dl.e androidx.compose.ui.text.style.h textAlign, @dl.e androidx.compose.ui.text.style.j textDirection, long lineHeight, @dl.e TextIndent textIndent, @dl.e PlatformTextStyle platformStyle, @dl.e LineHeightStyle lineHeightStyle, @dl.e LineBreak lineBreak, @dl.e androidx.compose.ui.text.style.e hyphens) {
        return new TextStyle(new SpanStyle(androidx.compose.ui.graphics.l0.y(color, this.spanStyle.m()) ? this.spanStyle.getTextForegroundStyle() : androidx.compose.ui.text.style.l.INSTANCE.b(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle != null ? platformStyle.getSpanStyle() : null, (kotlin.jvm.internal.u) null), new ParagraphStyle(textAlign, textDirection, lineHeight, textIndent, platformStyle != null ? platformStyle.getParagraphSyle() : null, lineHeightStyle, lineBreak, hyphens, null), platformStyle);
    }

    @dl.d
    @g
    public final TextStyle h(@dl.e androidx.compose.ui.graphics.a0 brush, float alpha, long fontSize, @dl.e FontWeight fontWeight, @dl.e androidx.compose.ui.text.font.g0 fontStyle, @dl.e androidx.compose.ui.text.font.h0 fontSynthesis, @dl.e androidx.compose.ui.text.font.v fontFamily, @dl.e String fontFeatureSettings, long letterSpacing, @dl.e androidx.compose.ui.text.style.a baselineShift, @dl.e TextGeometricTransform textGeometricTransform, @dl.e LocaleList localeList, long background, @dl.e androidx.compose.ui.text.style.i textDecoration, @dl.e Shadow shadow, @dl.e androidx.compose.ui.text.style.h textAlign, @dl.e androidx.compose.ui.text.style.j textDirection, long lineHeight, @dl.e TextIndent textIndent, @dl.e PlatformTextStyle platformStyle, @dl.e LineHeightStyle lineHeightStyle, @dl.e LineBreak lineBreak, @dl.e androidx.compose.ui.text.style.e hyphens) {
        return new TextStyle(new SpanStyle(brush, alpha, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle != null ? platformStyle.getSpanStyle() : null, (kotlin.jvm.internal.u) null), new ParagraphStyle(textAlign, textDirection, lineHeight, textIndent, platformStyle != null ? platformStyle.getParagraphSyle() : null, lineHeightStyle, lineBreak, hyphens, null), platformStyle);
    }

    public int hashCode() {
        int iHashCode = ((this.spanStyle.hashCode() * 31) + this.paragraphStyle.hashCode()) * 31;
        PlatformTextStyle platformTextStyle = this.platformStyle;
        return iHashCode + (platformTextStyle != null ? platformTextStyle.hashCode() : 0);
    }

    @g
    public final float j() {
        return this.spanStyle.g();
    }

    public final long l() {
        return this.spanStyle.getBackground();
    }

    @dl.e
    public final androidx.compose.ui.text.style.a m() {
        return this.spanStyle.getBaselineShift();
    }

    @dl.e
    @g
    public final androidx.compose.ui.graphics.a0 n() {
        return this.spanStyle.k();
    }

    public final long p() {
        return this.spanStyle.m();
    }

    @dl.e
    public final androidx.compose.ui.text.font.v q() {
        return this.spanStyle.getFontFamily();
    }

    @dl.e
    public final String r() {
        return this.spanStyle.getFontFeatureSettings();
    }

    public final long s() {
        return this.spanStyle.getFontSize();
    }

    @dl.e
    public final androidx.compose.ui.text.font.g0 t() {
        return this.spanStyle.getFontStyle();
    }

    @dl.d
    public String toString() {
        return "TextStyle(color=" + ((Object) androidx.compose.ui.graphics.l0.L(p())) + ", brush=" + n() + ", alpha=" + j() + ", fontSize=" + ((Object) s1.u.u(s())) + ", fontWeight=" + v() + ", fontStyle=" + t() + ", fontSynthesis=" + u() + ", fontFamily=" + q() + ", fontFeatureSettings=" + r() + ", letterSpacing=" + ((Object) s1.u.u(y())) + ", baselineShift=" + m() + ", textGeometricTransform=" + L() + ", localeList=" + D() + ", background=" + ((Object) androidx.compose.ui.graphics.l0.L(l())) + ", textDecoration=" + J() + ", shadow=" + G() + ", textAlign=" + I() + ", textDirection=" + K() + ", lineHeight=" + ((Object) s1.u.u(B())) + ", textIndent=" + M() + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + C() + ", lineBreak=" + z() + ", hyphens=" + w() + ')';
    }

    @dl.e
    public final androidx.compose.ui.text.font.h0 u() {
        return this.spanStyle.getFontSynthesis();
    }

    @dl.e
    public final FontWeight v() {
        return this.spanStyle.getFontWeight();
    }

    @dl.e
    @g
    public final androidx.compose.ui.text.style.e w() {
        return this.paragraphStyle.getHyphens();
    }

    public final long y() {
        return this.spanStyle.getLetterSpacing();
    }

    @dl.e
    @g
    public final LineBreak z() {
        return this.paragraphStyle.getLineBreak();
    }
}
