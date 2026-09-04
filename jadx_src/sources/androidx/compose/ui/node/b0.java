package androidx.compose.ui.node;

import androidx.compose.runtime.j2;
import androidx.compose.ui.unit.LayoutDirection;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import s1.DpRect;

/* JADX INFO: compiled from: LayoutNodeDrawScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\b\b\u0002\u0010~\u001a\u00020|¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001Jt\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017Jt\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\\\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\\\u0010 \u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!JR\u0010$\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%Jp\u0010,\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020(2\b\b\u0002\u0010*\u001a\u00020&2\b\b\u0002\u0010+\u001a\u00020(2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-Jz\u00100\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020(2\b\b\u0002\u0010*\u001a\u00020&2\b\b\u0002\u0010+\u001a\u00020(2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010/\u001a\u00020.H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101Jn\u00109\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u00102\u001a\u00020\n2\u0006\u00103\u001a\u00020\n2\b\b\u0002\u00104\u001a\u00020\u00052\b\b\u0002\u00106\u001a\u0002052\n\b\u0002\u00108\u001a\u0004\u0018\u0001072\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b9\u0010:Jn\u0010;\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u00102\u001a\u00020\n2\u0006\u00103\u001a\u00020\n2\b\b\u0002\u00104\u001a\u00020\u00052\b\b\u0002\u00106\u001a\u0002052\n\b\u0002\u00108\u001a\u0004\u0018\u0001072\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b;\u0010<J\\\u0010=\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b=\u0010>J\\\u0010?\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b?\u0010@JP\u0010C\u001a\u00020\u00152\u0006\u0010B\u001a\u00020A2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bC\u0010DJP\u0010E\u001a\u00020\u00152\u0006\u0010B\u001a\u00020A2\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bE\u0010FJt\u0010K\u001a\u00020\u00152\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\n0G2\u0006\u0010J\u001a\u00020I2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u00104\u001a\u00020\u00052\b\b\u0002\u00106\u001a\u0002052\n\b\u0002\u00108\u001a\u0004\u0018\u0001072\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bK\u0010LJt\u0010M\u001a\u00020\u00152\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\n0G2\u0006\u0010J\u001a\u00020I2\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u00104\u001a\u00020\u00052\b\b\u0002\u00106\u001a\u0002052\n\b\u0002\u00108\u001a\u0004\u0018\u0001072\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bM\u0010NJ\\\u0010O\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bO\u0010>J\\\u0010P\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bP\u0010@Jf\u0010S\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010R\u001a\u00020Q2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bS\u0010TJf\u0010U\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010R\u001a\u00020Q2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bU\u0010VJ\u001a\u0010Y\u001a\u00020X*\u00020WH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bY\u0010ZJ\u001a\u0010\\\u001a\u00020X*\u00020[H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\\\u0010]J\u001a\u0010^\u001a\u00020W*\u00020[H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b^\u0010_J\u001d\u0010`\u001a\u00020W*\u00020\u0005H\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b`\u0010aJ\u001d\u0010b\u001a\u00020W*\u00020XH\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bb\u0010cJ\u001a\u0010e\u001a\u00020d*\u00020\fH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\be\u0010fJ\u001a\u0010g\u001a\u00020\u0005*\u00020WH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bg\u0010aJ\u001a\u0010h\u001a\u00020\u0005*\u00020[H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bh\u0010_J\r\u0010k\u001a\u00020j*\u00020iH\u0097\u0001J\u001a\u0010l\u001a\u00020\f*\u00020dH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bl\u0010fJ\u001a\u0010m\u001a\u00020[*\u00020WH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bm\u0010nJ\u001d\u0010o\u001a\u00020[*\u00020\u0005H\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bo\u0010nJ\u001d\u0010p\u001a\u00020[*\u00020XH\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bp\u0010qJ\b\u0010r\u001a\u00020\u0015H\u0016J\u0012\u0010v\u001a\u00020\u0015*\u00020s2\u0006\u0010u\u001a\u00020tJ5\u0010z\u001a\u00020\u00152\u0006\u0010u\u001a\u00020t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010x\u001a\u00020w2\u0006\u0010y\u001a\u00020sH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bz\u0010{R\u0014\u0010~\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010}R\u0019\u0010y\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u001f\u0010\u001d\u001a\u00020\n8VX\u0096\u0005ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0017\u0010\u0085\u0001\u001a\u00020\u00058\u0016X\u0097\u0005¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0086\u00018\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0017\u0010\u008b\u0001\u001a\u00020\u00058\u0016X\u0097\u0005¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u0084\u0001R\u0018\u0010\u008f\u0001\u001a\u00030\u008c\u00018\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001e\u0010\r\u001a\u00020\f8VX\u0096\u0005ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0082\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0092\u0001"}, d2 = {"Landroidx/compose/ui/node/b0;", "Landroidx/compose/ui/graphics/drawscope/g;", "Landroidx/compose/ui/graphics/drawscope/d;", "Landroidx/compose/ui/graphics/a0;", "brush", "", "startAngle", "sweepAngle", "", "useCenter", "Lb1/f;", "topLeft", "Lb1/m;", UiKitSpanObj.TYPE_SIZE, "alpha", "Landroidx/compose/ui/graphics/drawscope/j;", "style", "Landroidx/compose/ui/graphics/m0;", "colorFilter", "Landroidx/compose/ui/graphics/x;", "blendMode", "Lkotlin/b2;", "y0", "(Landroidx/compose/ui/graphics/a0;FFZJJFLandroidx/compose/ui/graphics/drawscope/j;Landroidx/compose/ui/graphics/m0;I)V", "Landroidx/compose/ui/graphics/l0;", "color", "G0", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/j;Landroidx/compose/ui/graphics/m0;I)V", "radius", com.google.android.exoplayer2.text.ttml.d.f49794m0, "M1", "(Landroidx/compose/ui/graphics/a0;FJFLandroidx/compose/ui/graphics/drawscope/j;Landroidx/compose/ui/graphics/m0;I)V", "D0", "(JFJFLandroidx/compose/ui/graphics/drawscope/j;Landroidx/compose/ui/graphics/m0;I)V", "Landroidx/compose/ui/graphics/y0;", "image", "t0", "(Landroidx/compose/ui/graphics/y0;JFLandroidx/compose/ui/graphics/drawscope/j;Landroidx/compose/ui/graphics/m0;I)V", "Ls1/n;", "srcOffset", "Ls1/r;", "srcSize", "dstOffset", "dstSize", "q1", "(Landroidx/compose/ui/graphics/y0;JJJJFLandroidx/compose/ui/graphics/drawscope/j;Landroidx/compose/ui/graphics/m0;I)V", "Landroidx/compose/ui/graphics/r0;", "filterQuality", "N1", "(Landroidx/compose/ui/graphics/y0;JJJJFLandroidx/compose/ui/graphics/drawscope/j;Landroidx/compose/ui/graphics/m0;II)V", com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "strokeWidth", "Landroidx/compose/ui/graphics/j2;", "cap", "Landroidx/compose/ui/graphics/m1;", "pathEffect", "I1", "(Landroidx/compose/ui/graphics/a0;JJFILandroidx/compose/ui/graphics/m1;FLandroidx/compose/ui/graphics/m0;I)V", "x0", "(JJJFILandroidx/compose/ui/graphics/m1;FLandroidx/compose/ui/graphics/m0;I)V", "D1", "(Landroidx/compose/ui/graphics/a0;JJFLandroidx/compose/ui/graphics/drawscope/j;Landroidx/compose/ui/graphics/m0;I)V", "E0", "(JJJFLandroidx/compose/ui/graphics/drawscope/j;Landroidx/compose/ui/graphics/m0;I)V", "Landroidx/compose/ui/graphics/l1;", FlutterActivityLaunchConfigs.EXTRA_PATH, "m0", "(Landroidx/compose/ui/graphics/l1;Landroidx/compose/ui/graphics/a0;FLandroidx/compose/ui/graphics/drawscope/j;Landroidx/compose/ui/graphics/m0;I)V", "z0", "(Landroidx/compose/ui/graphics/l1;JFLandroidx/compose/ui/graphics/drawscope/j;Landroidx/compose/ui/graphics/m0;I)V", "", "points", "Landroidx/compose/ui/graphics/t1;", "pointMode", "j0", "(Ljava/util/List;ILandroidx/compose/ui/graphics/a0;FILandroidx/compose/ui/graphics/m1;FLandroidx/compose/ui/graphics/m0;I)V", "G1", "(Ljava/util/List;IJFILandroidx/compose/ui/graphics/m1;FLandroidx/compose/ui/graphics/m0;I)V", "w0", "u1", "Lb1/a;", "cornerRadius", "B1", "(Landroidx/compose/ui/graphics/a0;JJJFLandroidx/compose/ui/graphics/drawscope/j;Landroidx/compose/ui/graphics/m0;I)V", "i1", "(JJJJLandroidx/compose/ui/graphics/drawscope/j;FLandroidx/compose/ui/graphics/m0;I)V", "Ls1/h;", "", "e1", "(F)I", "Ls1/u;", "J1", "(J)I", "q", "(J)F", "F", "(F)F", androidx.exifinterface.media.a.S4, "(I)F", "Ls1/l;", "n", "(J)J", "E1", "k1", "Ls1/k;", "Lb1/i;", "h0", "J", "M", "(F)J", ak.aB, "r", "(I)J", "T0", "Landroidx/compose/ui/node/h;", "Landroidx/compose/ui/graphics/d0;", "canvas", "g", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "drawNode", "b", "(Landroidx/compose/ui/graphics/d0;JLandroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/node/h;)V", "Landroidx/compose/ui/graphics/drawscope/a;", "Landroidx/compose/ui/graphics/drawscope/a;", "canvasDrawScope", ak.aF, "Landroidx/compose/ui/node/h;", "I", "()J", "getDensity", "()F", "density", "Landroidx/compose/ui/graphics/drawscope/e;", "M0", "()Landroidx/compose/ui/graphics/drawscope/e;", "drawContext", "C1", "fontScale", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "<init>", "(Landroidx/compose/ui/graphics/drawscope/a;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class b0 implements androidx.compose.ui.graphics.drawscope.g, androidx.compose.ui.graphics.drawscope.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.graphics.drawscope.a canvasDrawScope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private h drawNode;

    /* JADX WARN: Multi-variable type inference failed */
    public b0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public b0(@dl.d androidx.compose.ui.graphics.drawscope.a canvasDrawScope) {
        kotlin.jvm.internal.f0.p(canvasDrawScope, "canvasDrawScope");
        this.canvasDrawScope = canvasDrawScope;
    }

    public /* synthetic */ b0(androidx.compose.ui.graphics.drawscope.a aVar, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? new androidx.compose.ui.graphics.drawscope.a() : aVar);
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public void B1(@dl.d androidx.compose.ui.graphics.a0 brush, long topLeft, long size, long cornerRadius, float alpha, @dl.d androidx.compose.ui.graphics.drawscope.j style, @dl.e androidx.compose.ui.graphics.m0 colorFilter, int blendMode) {
        kotlin.jvm.internal.f0.p(brush, "brush");
        kotlin.jvm.internal.f0.p(style, "style");
        this.canvasDrawScope.B1(brush, topLeft, size, cornerRadius, alpha, style, colorFilter, blendMode);
    }

    @Override // s1.e
    /* JADX INFO: renamed from: C1 */
    public float getF139218c() {
        return this.canvasDrawScope.getF139218c();
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public void D0(long color, float radius, long center, float alpha, @dl.d androidx.compose.ui.graphics.drawscope.j style, @dl.e androidx.compose.ui.graphics.m0 colorFilter, int blendMode) {
        kotlin.jvm.internal.f0.p(style, "style");
        this.canvasDrawScope.D0(color, radius, center, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public void D1(@dl.d androidx.compose.ui.graphics.a0 brush, long topLeft, long size, float alpha, @dl.d androidx.compose.ui.graphics.drawscope.j style, @dl.e androidx.compose.ui.graphics.m0 colorFilter, int blendMode) {
        kotlin.jvm.internal.f0.p(brush, "brush");
        kotlin.jvm.internal.f0.p(style, "style");
        this.canvasDrawScope.D1(brush, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // s1.e
    @j2
    public float E(int i10) {
        return this.canvasDrawScope.E(i10);
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public void E0(long color, long topLeft, long size, float alpha, @dl.d androidx.compose.ui.graphics.drawscope.j style, @dl.e androidx.compose.ui.graphics.m0 colorFilter, int blendMode) {
        kotlin.jvm.internal.f0.p(style, "style");
        this.canvasDrawScope.E0(color, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // s1.e
    @j2
    public float E1(float f10) {
        return this.canvasDrawScope.E1(f10);
    }

    @Override // s1.e
    @j2
    public float F(float f10) {
        return this.canvasDrawScope.F(f10);
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public void G0(long color, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, @dl.d androidx.compose.ui.graphics.drawscope.j style, @dl.e androidx.compose.ui.graphics.m0 colorFilter, int blendMode) {
        kotlin.jvm.internal.f0.p(style, "style");
        this.canvasDrawScope.G0(color, startAngle, sweepAngle, useCenter, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public void G1(@dl.d List<b1.f> points, int pointMode, long color, float strokeWidth, int cap, @dl.e androidx.compose.ui.graphics.m1 pathEffect, float alpha, @dl.e androidx.compose.ui.graphics.m0 colorFilter, int blendMode) {
        kotlin.jvm.internal.f0.p(points, "points");
        this.canvasDrawScope.G1(points, pointMode, color, strokeWidth, cap, pathEffect, alpha, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public long I() {
        return this.canvasDrawScope.I();
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public void I1(@dl.d androidx.compose.ui.graphics.a0 brush, long start, long end, float strokeWidth, int cap, @dl.e androidx.compose.ui.graphics.m1 pathEffect, float alpha, @dl.e androidx.compose.ui.graphics.m0 colorFilter, int blendMode) {
        kotlin.jvm.internal.f0.p(brush, "brush");
        this.canvasDrawScope.I1(brush, start, end, strokeWidth, cap, pathEffect, alpha, colorFilter, blendMode);
    }

    @Override // s1.e
    @j2
    public long J(long j10) {
        return this.canvasDrawScope.J(j10);
    }

    @Override // s1.e
    @j2
    public int J1(long j10) {
        return this.canvasDrawScope.J1(j10);
    }

    @Override // s1.e
    @j2
    public long M(float f10) {
        return this.canvasDrawScope.M(f10);
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    @dl.d
    /* JADX INFO: renamed from: M0 */
    public androidx.compose.ui.graphics.drawscope.e getDrawContext() {
        return this.canvasDrawScope.getDrawContext();
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public void M1(@dl.d androidx.compose.ui.graphics.a0 brush, float radius, long center, float alpha, @dl.d androidx.compose.ui.graphics.drawscope.j style, @dl.e androidx.compose.ui.graphics.m0 colorFilter, int blendMode) {
        kotlin.jvm.internal.f0.p(brush, "brush");
        kotlin.jvm.internal.f0.p(style, "style");
        this.canvasDrawScope.M1(brush, radius, center, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public void N1(@dl.d androidx.compose.ui.graphics.y0 image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, @dl.d androidx.compose.ui.graphics.drawscope.j style, @dl.e androidx.compose.ui.graphics.m0 colorFilter, int blendMode, int filterQuality) {
        kotlin.jvm.internal.f0.p(image, "image");
        kotlin.jvm.internal.f0.p(style, "style");
        this.canvasDrawScope.N1(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, filterQuality);
    }

    @Override // androidx.compose.ui.graphics.drawscope.d
    public void T0() {
        androidx.compose.ui.graphics.d0 d0VarA = getDrawContext().a();
        h hVar = this.drawNode;
        kotlin.jvm.internal.f0.m(hVar);
        h hVarB = c0.b(hVar);
        if (hVarB != null) {
            g(hVarB, d0VarA);
            return;
        }
        NodeCoordinator nodeCoordinatorJ = d.j(hVar, x0.f15398a.b());
        if (nodeCoordinatorJ.getTail() == hVar) {
            nodeCoordinatorJ = nodeCoordinatorJ.getWrapped();
            kotlin.jvm.internal.f0.m(nodeCoordinatorJ);
        }
        nodeCoordinatorJ.q3(d0VarA);
    }

    public final void b(@dl.d androidx.compose.ui.graphics.d0 canvas, long size, @dl.d NodeCoordinator coordinator, @dl.d h drawNode) {
        kotlin.jvm.internal.f0.p(canvas, "canvas");
        kotlin.jvm.internal.f0.p(coordinator, "coordinator");
        kotlin.jvm.internal.f0.p(drawNode, "drawNode");
        h hVar = this.drawNode;
        this.drawNode = drawNode;
        androidx.compose.ui.graphics.drawscope.a aVar = this.canvasDrawScope;
        LayoutDirection layoutDirection = coordinator.getLayoutDirection();
        androidx.compose.ui.graphics.drawscope.a.DrawParams c0083aV = aVar.getDrawParams();
        s1.e eVarA = c0083aV.getDensity();
        LayoutDirection layoutDirectionB = c0083aV.getLayoutDirection();
        androidx.compose.ui.graphics.d0 d0VarC = c0083aV.getCanvas();
        long jD = c0083aV.getSize();
        androidx.compose.ui.graphics.drawscope.a.DrawParams c0083aV2 = aVar.getDrawParams();
        c0083aV2.l(coordinator);
        c0083aV2.m(layoutDirection);
        c0083aV2.k(canvas);
        c0083aV2.n(size);
        canvas.f();
        drawNode.w(this);
        canvas.u();
        androidx.compose.ui.graphics.drawscope.a.DrawParams c0083aV3 = aVar.getDrawParams();
        c0083aV3.l(eVarA);
        c0083aV3.m(layoutDirectionB);
        c0083aV3.k(d0VarC);
        c0083aV3.n(jD);
        this.drawNode = hVar;
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public long c() {
        return this.canvasDrawScope.c();
    }

    @Override // s1.e
    @j2
    public int e1(float f10) {
        return this.canvasDrawScope.e1(f10);
    }

    public final void g(@dl.d h hVar, @dl.d androidx.compose.ui.graphics.d0 canvas) {
        kotlin.jvm.internal.f0.p(hVar, "<this>");
        kotlin.jvm.internal.f0.p(canvas, "canvas");
        NodeCoordinator nodeCoordinatorJ = d.j(hVar, x0.f15398a.b());
        nodeCoordinatorJ.getLayoutNode().j0().b(canvas, s1.s.f(nodeCoordinatorJ.a()), nodeCoordinatorJ, hVar);
    }

    @Override // s1.e
    /* JADX INFO: renamed from: getDensity */
    public float getF139217b() {
        return this.canvasDrawScope.getF139217b();
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    @dl.d
    public LayoutDirection getLayoutDirection() {
        return this.canvasDrawScope.getLayoutDirection();
    }

    @Override // s1.e
    @j2
    @dl.d
    public b1.i h0(@dl.d DpRect dpRect) {
        kotlin.jvm.internal.f0.p(dpRect, "<this>");
        return this.canvasDrawScope.h0(dpRect);
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public void i1(long color, long topLeft, long size, long cornerRadius, @dl.d androidx.compose.ui.graphics.drawscope.j style, float alpha, @dl.e androidx.compose.ui.graphics.m0 colorFilter, int blendMode) {
        kotlin.jvm.internal.f0.p(style, "style");
        this.canvasDrawScope.i1(color, topLeft, size, cornerRadius, style, alpha, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public void j0(@dl.d List<b1.f> points, int pointMode, @dl.d androidx.compose.ui.graphics.a0 brush, float strokeWidth, int cap, @dl.e androidx.compose.ui.graphics.m1 pathEffect, float alpha, @dl.e androidx.compose.ui.graphics.m0 colorFilter, int blendMode) {
        kotlin.jvm.internal.f0.p(points, "points");
        kotlin.jvm.internal.f0.p(brush, "brush");
        this.canvasDrawScope.j0(points, pointMode, brush, strokeWidth, cap, pathEffect, alpha, colorFilter, blendMode);
    }

    @Override // s1.e
    @j2
    public float k1(long j10) {
        return this.canvasDrawScope.k1(j10);
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public void m0(@dl.d androidx.compose.ui.graphics.l1 path, @dl.d androidx.compose.ui.graphics.a0 brush, float alpha, @dl.d androidx.compose.ui.graphics.drawscope.j style, @dl.e androidx.compose.ui.graphics.m0 colorFilter, int blendMode) {
        kotlin.jvm.internal.f0.p(path, "path");
        kotlin.jvm.internal.f0.p(brush, "brush");
        kotlin.jvm.internal.f0.p(style, "style");
        this.canvasDrawScope.m0(path, brush, alpha, style, colorFilter, blendMode);
    }

    @Override // s1.e
    @j2
    public long n(long j10) {
        return this.canvasDrawScope.n(j10);
    }

    @Override // s1.e
    @j2
    public float q(long j10) {
        return this.canvasDrawScope.q(j10);
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @kotlin.s0(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    public /* synthetic */ void q1(androidx.compose.ui.graphics.y0 image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, androidx.compose.ui.graphics.drawscope.j style, androidx.compose.ui.graphics.m0 colorFilter, int blendMode) {
        kotlin.jvm.internal.f0.p(image, "image");
        kotlin.jvm.internal.f0.p(style, "style");
        this.canvasDrawScope.q1(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode);
    }

    @Override // s1.e
    @j2
    public long r(int i10) {
        return this.canvasDrawScope.r(i10);
    }

    @Override // s1.e
    @j2
    public long s(float f10) {
        return this.canvasDrawScope.s(f10);
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public void t0(@dl.d androidx.compose.ui.graphics.y0 image, long topLeft, float alpha, @dl.d androidx.compose.ui.graphics.drawscope.j style, @dl.e androidx.compose.ui.graphics.m0 colorFilter, int blendMode) {
        kotlin.jvm.internal.f0.p(image, "image");
        kotlin.jvm.internal.f0.p(style, "style");
        this.canvasDrawScope.t0(image, topLeft, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public void u1(long color, long topLeft, long size, float alpha, @dl.d androidx.compose.ui.graphics.drawscope.j style, @dl.e androidx.compose.ui.graphics.m0 colorFilter, int blendMode) {
        kotlin.jvm.internal.f0.p(style, "style");
        this.canvasDrawScope.u1(color, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public void w0(@dl.d androidx.compose.ui.graphics.a0 brush, long topLeft, long size, float alpha, @dl.d androidx.compose.ui.graphics.drawscope.j style, @dl.e androidx.compose.ui.graphics.m0 colorFilter, int blendMode) {
        kotlin.jvm.internal.f0.p(brush, "brush");
        kotlin.jvm.internal.f0.p(style, "style");
        this.canvasDrawScope.w0(brush, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public void x0(long color, long start, long end, float strokeWidth, int cap, @dl.e androidx.compose.ui.graphics.m1 pathEffect, float alpha, @dl.e androidx.compose.ui.graphics.m0 colorFilter, int blendMode) {
        this.canvasDrawScope.x0(color, start, end, strokeWidth, cap, pathEffect, alpha, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public void y0(@dl.d androidx.compose.ui.graphics.a0 brush, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, @dl.d androidx.compose.ui.graphics.drawscope.j style, @dl.e androidx.compose.ui.graphics.m0 colorFilter, int blendMode) {
        kotlin.jvm.internal.f0.p(brush, "brush");
        kotlin.jvm.internal.f0.p(style, "style");
        this.canvasDrawScope.y0(brush, startAngle, sweepAngle, useCenter, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public void z0(@dl.d androidx.compose.ui.graphics.l1 path, long color, float alpha, @dl.d androidx.compose.ui.graphics.drawscope.j style, @dl.e androidx.compose.ui.graphics.m0 colorFilter, int blendMode) {
        kotlin.jvm.internal.f0.p(path, "path");
        kotlin.jvm.internal.f0.p(style, "style");
        this.canvasDrawScope.z0(path, color, alpha, style, colorFilter, blendMode);
    }
}
