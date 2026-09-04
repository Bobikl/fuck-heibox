package t0;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: PaletteTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0003\b¤\u0001\bÀ\u0002\u0018\u00002\u00020\u0001B\u000b\b\u0002¢\u0006\u0006\b¤\u0001\u0010¥\u0001R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R \u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R \u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R \u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R \u0010\u0011\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R \u0010\u0013\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R \u0010\u0015\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006R \u0010\u0017\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R \u0010\u0019\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006R \u0010\u001b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u001c\u0010\u0006R \u0010\u001d\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R \u0010\u001f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b \u0010\u0006R \u0010!\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006R \u0010#\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006R \u0010%\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010\u0006R \u0010'\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b'\u0010\u0004\u001a\u0004\b(\u0010\u0006R \u0010)\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b)\u0010\u0004\u001a\u0004\b*\u0010\u0006R \u0010+\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b+\u0010\u0004\u001a\u0004\b,\u0010\u0006R \u0010-\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b-\u0010\u0004\u001a\u0004\b.\u0010\u0006R \u0010/\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b/\u0010\u0004\u001a\u0004\b0\u0010\u0006R \u00101\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b1\u0010\u0004\u001a\u0004\b2\u0010\u0006R \u00103\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b3\u0010\u0004\u001a\u0004\b4\u0010\u0006R \u00105\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b5\u0010\u0004\u001a\u0004\b6\u0010\u0006R \u00107\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b7\u0010\u0004\u001a\u0004\b8\u0010\u0006R \u00109\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b9\u0010\u0004\u001a\u0004\b:\u0010\u0006R \u0010;\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b;\u0010\u0004\u001a\u0004\b<\u0010\u0006R \u0010=\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b=\u0010\u0004\u001a\u0004\b>\u0010\u0006R \u0010?\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b?\u0010\u0004\u001a\u0004\b@\u0010\u0006R \u0010A\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bA\u0010\u0004\u001a\u0004\bB\u0010\u0006R \u0010C\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bC\u0010\u0004\u001a\u0004\bD\u0010\u0006R \u0010E\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bE\u0010\u0004\u001a\u0004\bF\u0010\u0006R \u0010G\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bG\u0010\u0004\u001a\u0004\bH\u0010\u0006R \u0010I\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bI\u0010\u0004\u001a\u0004\bJ\u0010\u0006R \u0010K\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bK\u0010\u0004\u001a\u0004\b\u0004\u0010\u0006R \u0010L\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bL\u0010\u0004\u001a\u0004\bM\u0010\u0006R \u0010N\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bN\u0010\u0004\u001a\u0004\bO\u0010\u0006R \u0010P\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bP\u0010\u0004\u001a\u0004\bQ\u0010\u0006R \u0010R\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bR\u0010\u0004\u001a\u0004\bS\u0010\u0006R \u0010T\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bT\u0010\u0004\u001a\u0004\bU\u0010\u0006R \u0010V\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bV\u0010\u0004\u001a\u0004\bW\u0010\u0006R \u0010X\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bX\u0010\u0004\u001a\u0004\bY\u0010\u0006R \u0010Z\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bZ\u0010\u0004\u001a\u0004\b[\u0010\u0006R \u0010\\\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\\\u0010\u0004\u001a\u0004\b]\u0010\u0006R \u0010^\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b^\u0010\u0004\u001a\u0004\b_\u0010\u0006R \u0010`\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b`\u0010\u0004\u001a\u0004\ba\u0010\u0006R \u0010b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bb\u0010\u0004\u001a\u0004\bc\u0010\u0006R \u0010d\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bd\u0010\u0004\u001a\u0004\be\u0010\u0006R \u0010f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bf\u0010\u0004\u001a\u0004\bg\u0010\u0006R \u0010h\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bh\u0010\u0004\u001a\u0004\bi\u0010\u0006R \u0010j\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bj\u0010\u0004\u001a\u0004\bk\u0010\u0006R \u0010l\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bl\u0010\u0004\u001a\u0004\bm\u0010\u0006R \u0010n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bn\u0010\u0004\u001a\u0004\bo\u0010\u0006R \u0010p\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bp\u0010\u0004\u001a\u0004\bq\u0010\u0006R \u0010r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\br\u0010\u0004\u001a\u0004\bs\u0010\u0006R \u0010t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bt\u0010\u0004\u001a\u0004\bu\u0010\u0006R \u0010v\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bv\u0010\u0004\u001a\u0004\bw\u0010\u0006R \u0010x\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bx\u0010\u0004\u001a\u0004\by\u0010\u0006R \u0010z\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bz\u0010\u0004\u001a\u0004\b{\u0010\u0006R \u0010|\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b|\u0010\u0004\u001a\u0004\b}\u0010\u0006R \u0010~\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b~\u0010\u0004\u001a\u0004\b\u007f\u0010\u0006R#\u0010\u0080\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010\u0004\u001a\u0005\b\u0081\u0001\u0010\u0006R#\u0010\u0082\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010\u0004\u001a\u0005\b\u0083\u0001\u0010\u0006R#\u0010\u0084\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010\u0004\u001a\u0005\b\u0085\u0001\u0010\u0006R#\u0010\u0086\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010\u0004\u001a\u0005\b\u0087\u0001\u0010\u0006R#\u0010\u0088\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010\u0004\u001a\u0005\b\u0089\u0001\u0010\u0006R#\u0010\u008a\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010\u0004\u001a\u0005\b\u008b\u0001\u0010\u0006R#\u0010\u008c\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010\u0004\u001a\u0005\b\u008d\u0001\u0010\u0006R#\u0010\u008e\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010\u0004\u001a\u0005\b\u008f\u0001\u0010\u0006R#\u0010\u0090\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0090\u0001\u0010\u0004\u001a\u0005\b\u0091\u0001\u0010\u0006R#\u0010\u0092\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010\u0004\u001a\u0005\b\u0093\u0001\u0010\u0006R#\u0010\u0094\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010\u0004\u001a\u0005\b\u0095\u0001\u0010\u0006R#\u0010\u0096\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0096\u0001\u0010\u0004\u001a\u0005\b\u0097\u0001\u0010\u0006R#\u0010\u0098\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0098\u0001\u0010\u0004\u001a\u0005\b\u0099\u0001\u0010\u0006R#\u0010\u009a\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u009a\u0001\u0010\u0004\u001a\u0005\b\u009b\u0001\u0010\u0006R#\u0010\u009c\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u009c\u0001\u0010\u0004\u001a\u0005\b\u009d\u0001\u0010\u0006R#\u0010\u009e\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u009e\u0001\u0010\u0004\u001a\u0005\b\u009f\u0001\u0010\u0006R#\u0010 \u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b \u0001\u0010\u0004\u001a\u0005\b¡\u0001\u0010\u0006R#\u0010¢\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b¢\u0001\u0010\u0004\u001a\u0005\b£\u0001\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006¦\u0001"}, d2 = {"Lt0/n0;", "", "Landroidx/compose/ui/graphics/l0;", "Black", "J", ak.av, "()J", "Error0", "b", "Error10", ak.aF, "Error100", "d", "Error20", "e", "Error30", "f", "Error40", "g", "Error50", RXScreenCaptureService.KEY_HEIGHT, "Error60", "i", "Error70", "j", "Error80", "k", "Error90", "l", "Error95", "m", "Error99", "n", "Neutral0", "o", "Neutral10", "p", "Neutral100", "q", "Neutral20", "r", "Neutral30", ak.aB, "Neutral40", "t", "Neutral50", ak.aG, "Neutral60", "v", "Neutral70", RXScreenCaptureService.KEY_WIDTH, "Neutral80", "x", "Neutral90", "y", "Neutral95", ak.aD, "Neutral99", androidx.exifinterface.media.a.W4, "NeutralVariant0", "B", "NeutralVariant10", "C", "NeutralVariant100", "D", "NeutralVariant20", androidx.exifinterface.media.a.S4, "NeutralVariant30", "F", "NeutralVariant40", "G", "NeutralVariant50", "H", "NeutralVariant60", "I", "NeutralVariant70", "NeutralVariant80", "K", "NeutralVariant90", "L", "NeutralVariant95", "M", "NeutralVariant99", "N", "Primary0", "O", "Primary10", "P", "Primary100", "Q", "Primary20", "R", "Primary30", androidx.exifinterface.media.a.R4, "Primary40", androidx.exifinterface.media.a.f23244d5, "Primary50", "U", "Primary60", androidx.exifinterface.media.a.X4, "Primary70", androidx.exifinterface.media.a.T4, "Primary80", "X", "Primary90", "Y", "Primary95", "Z", "Primary99", "a0", "Secondary0", "b0", "Secondary10", "c0", "Secondary100", "d0", "Secondary20", "e0", "Secondary30", "f0", "Secondary40", "g0", "Secondary50", "h0", "Secondary60", "i0", "Secondary70", "j0", "Secondary80", "k0", "Secondary90", "l0", "Secondary95", "m0", "Secondary99", "n0", "Tertiary0", "o0", "Tertiary10", "p0", "Tertiary100", "q0", "Tertiary20", "r0", "Tertiary30", "s0", "Tertiary40", "t0", "Tertiary50", "u0", "Tertiary60", "v0", "Tertiary70", "w0", "Tertiary80", "x0", "Tertiary90", "y0", "Tertiary95", "z0", "Tertiary99", "A0", "White", "B0", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final n0 f140087a = new n0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f140089b = androidx.compose.ui.graphics.n0.f(0, 0, 0, 0, 8, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f140091c = androidx.compose.ui.graphics.n0.f(0, 0, 0, 0, 8, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f140093d = androidx.compose.ui.graphics.n0.f(65, 14, 11, 0, 8, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f140095e = androidx.compose.ui.graphics.n0.f(255, 255, 255, 0, 8, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f140097f = androidx.compose.ui.graphics.n0.f(96, 20, 16, 0, 8, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f140099g = androidx.compose.ui.graphics.n0.f(140, 29, 24, 0, 8, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f140101h = androidx.compose.ui.graphics.n0.f(bb.c.b.f31028x0, 38, 30, 0, 8, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f140103i = androidx.compose.ui.graphics.n0.f(220, 54, 46, 0, 8, null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f140105j = androidx.compose.ui.graphics.n0.f(bb.c.b.f30963u1, 105, 98, 0, 8, null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f140107k = androidx.compose.ui.graphics.n0.f(bb.c.b.C1, 146, 142, 0, 8, null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f140109l = androidx.compose.ui.graphics.n0.f(bb.c.b.I1, 184, 181, 0, 8, null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f140111m = androidx.compose.ui.graphics.n0.f(bb.c.b.P1, bb.c.b.f30829o1, 220, 0, 8, null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f140113n = androidx.compose.ui.graphics.n0.f(252, bb.c.b.E1, bb.c.b.E1, 0, 8, null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f140115o = androidx.compose.ui.graphics.n0.f(255, 251, bb.c.b.P1, 0, 8, null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f140117p = androidx.compose.ui.graphics.n0.f(0, 0, 0, 0, 8, null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f140119q = androidx.compose.ui.graphics.n0.f(28, 27, 31, 0, 8, null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f140121r = androidx.compose.ui.graphics.n0.f(255, 255, 255, 0, 8, null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f140123s = androidx.compose.ui.graphics.n0.f(49, 48, 51, 0, 8, null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f140125t = androidx.compose.ui.graphics.n0.f(72, 70, 73, 0, 8, null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f140127u = androidx.compose.ui.graphics.n0.f(96, 93, 98, 0, 8, null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final long f140129v = androidx.compose.ui.graphics.n0.f(120, 117, 121, 0, 8, null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final long f140131w = androidx.compose.ui.graphics.n0.f(147, 144, 148, 0, 8, null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final long f140133x = androidx.compose.ui.graphics.n0.f(bb.c.b.f30918s0, bb.c.b.f30828o0, bb.c.b.f30918s0, 0, 8, null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final long f140135y = androidx.compose.ui.graphics.n0.f(201, bb.c.b.P0, 202, 0, 8, null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final long f140137z = androidx.compose.ui.graphics.n0.f(bb.c.b.f31007w1, bb.c.b.f30897r1, bb.c.b.f30985v1, 0, 8, null);
    private static final long A = androidx.compose.ui.graphics.n0.f(244, bb.c.b.F1, 244, 0, 8, null);
    private static final long B = androidx.compose.ui.graphics.n0.f(255, 251, 254, 0, 8, null);
    private static final long C = androidx.compose.ui.graphics.n0.f(0, 0, 0, 0, 8, null);
    private static final long D = androidx.compose.ui.graphics.n0.f(29, 26, 34, 0, 8, null);
    private static final long E = androidx.compose.ui.graphics.n0.f(255, 255, 255, 0, 8, null);
    private static final long F = androidx.compose.ui.graphics.n0.f(50, 47, 55, 0, 8, null);
    private static final long G = androidx.compose.ui.graphics.n0.f(73, 69, 79, 0, 8, null);
    private static final long H = androidx.compose.ui.graphics.n0.f(96, 93, 102, 0, 8, null);
    private static final long I = androidx.compose.ui.graphics.n0.f(121, 116, 126, 0, 8, null);
    private static final long J = androidx.compose.ui.graphics.n0.f(147, 143, 153, 0, 8, null);
    private static final long K = androidx.compose.ui.graphics.n0.f(bb.c.b.f30918s0, 169, 180, 0, 8, null);
    private static final long L = androidx.compose.ui.graphics.n0.f(202, bb.c.b.O0, 208, 0, 8, null);
    private static final long M = androidx.compose.ui.graphics.n0.f(bb.c.b.f31029x1, 224, bb.c.b.C1, 0, 8, null);
    private static final long N = androidx.compose.ui.graphics.n0.f(bb.c.b.L1, bb.c.b.E1, 250, 0, 8, null);
    private static final long O = androidx.compose.ui.graphics.n0.f(255, 251, 254, 0, 8, null);
    private static final long P = androidx.compose.ui.graphics.n0.f(0, 0, 0, 0, 8, null);
    private static final long Q = androidx.compose.ui.graphics.n0.f(33, 0, 93, 0, 8, null);
    private static final long R = androidx.compose.ui.graphics.n0.f(255, 255, 255, 0, 8, null);
    private static final long S = androidx.compose.ui.graphics.n0.f(56, 30, 114, 0, 8, null);
    private static final long T = androidx.compose.ui.graphics.n0.f(79, 55, 139, 0, 8, null);
    private static final long U = androidx.compose.ui.graphics.n0.f(103, 80, bb.c.b.f30690i0, 0, 8, null);
    private static final long V = androidx.compose.ui.graphics.n0.f(127, 103, bb.c.b.I0, 0, 8, null);
    private static final long W = androidx.compose.ui.graphics.n0.f(154, 130, 219, 0, 8, null);
    private static final long X = androidx.compose.ui.graphics.n0.f(182, bb.c.b.f30528b0, bb.c.b.O1, 0, 8, null);
    private static final long Y = androidx.compose.ui.graphics.n0.f(208, 188, 255, 0, 8, null);
    private static final long Z = androidx.compose.ui.graphics.n0.f(bb.c.b.A1, 221, 255, 0, 8, null);

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final long f140088a0 = androidx.compose.ui.graphics.n0.f(bb.c.b.M1, bb.c.b.D1, 255, 0, 8, null);

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final long f140090b0 = androidx.compose.ui.graphics.n0.f(255, 251, 254, 0, 8, null);

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final long f140092c0 = androidx.compose.ui.graphics.n0.f(0, 0, 0, 0, 8, null);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final long f140094d0 = androidx.compose.ui.graphics.n0.f(29, 25, 43, 0, 8, null);

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final long f140096e0 = androidx.compose.ui.graphics.n0.f(255, 255, 255, 0, 8, null);

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final long f140098f0 = androidx.compose.ui.graphics.n0.f(51, 45, 65, 0, 8, null);

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final long f140100g0 = androidx.compose.ui.graphics.n0.f(74, 68, 88, 0, 8, null);

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final long f140102h0 = androidx.compose.ui.graphics.n0.f(98, 91, 113, 0, 8, null);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final long f140104i0 = androidx.compose.ui.graphics.n0.f(122, 114, 137, 0, 8, null);

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final long f140106j0 = androidx.compose.ui.graphics.n0.f(149, 141, 165, 0, 8, null);

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final long f140108k0 = androidx.compose.ui.graphics.n0.f(176, 167, 192, 0, 8, null);

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final long f140110l0 = androidx.compose.ui.graphics.n0.f(204, 194, 220, 0, 8, null);

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final long f140112m0 = androidx.compose.ui.graphics.n0.f(bb.c.b.f31051y1, bb.c.b.f30829o1, bb.c.b.O1, 0, 8, null);

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final long f140114n0 = androidx.compose.ui.graphics.n0.f(bb.c.b.M1, bb.c.b.D1, 255, 0, 8, null);

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final long f140116o0 = androidx.compose.ui.graphics.n0.f(255, 251, 254, 0, 8, null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final long f140118p0 = androidx.compose.ui.graphics.n0.f(0, 0, 0, 0, 8, null);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final long f140120q0 = androidx.compose.ui.graphics.n0.f(49, 17, 29, 0, 8, null);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final long f140122r0 = androidx.compose.ui.graphics.n0.f(255, 255, 255, 0, 8, null);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final long f140124s0 = androidx.compose.ui.graphics.n0.f(73, 37, 50, 0, 8, null);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final long f140126t0 = androidx.compose.ui.graphics.n0.f(99, 59, 72, 0, 8, null);

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final long f140128u0 = androidx.compose.ui.graphics.n0.f(125, 82, 96, 0, 8, null);

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final long f140130v0 = androidx.compose.ui.graphics.n0.f(152, 105, 119, 0, 8, null);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private static final long f140132w0 = androidx.compose.ui.graphics.n0.f(181, 131, 146, 0, 8, null);

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private static final long f140134x0 = androidx.compose.ui.graphics.n0.f(210, bb.c.b.f30528b0, 172, 0, 8, null);

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private static final long f140136y0 = androidx.compose.ui.graphics.n0.f(bb.c.b.F1, 184, 200, 0, 8, null);

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private static final long f140138z0 = androidx.compose.ui.graphics.n0.f(255, 216, bb.c.b.f30963u1, 0, 8, null);
    private static final long A0 = androidx.compose.ui.graphics.n0.f(255, bb.c.b.C1, bb.c.b.H1, 0, 8, null);
    private static final long B0 = androidx.compose.ui.graphics.n0.f(255, 251, 250, 0, 8, null);
    private static final long C0 = androidx.compose.ui.graphics.n0.f(255, 255, 255, 0, 8, null);

    private n0() {
    }

    public final long A() {
        return B;
    }

    public final long A0() {
        return B0;
    }

    public final long B() {
        return C;
    }

    public final long B0() {
        return C0;
    }

    public final long C() {
        return D;
    }

    public final long D() {
        return E;
    }

    public final long E() {
        return F;
    }

    public final long F() {
        return G;
    }

    public final long G() {
        return H;
    }

    public final long H() {
        return I;
    }

    public final long I() {
        return J;
    }

    public final long J() {
        return K;
    }

    public final long K() {
        return L;
    }

    public final long L() {
        return M;
    }

    public final long M() {
        return N;
    }

    public final long N() {
        return O;
    }

    public final long O() {
        return P;
    }

    public final long P() {
        return Q;
    }

    public final long Q() {
        return R;
    }

    public final long R() {
        return S;
    }

    public final long S() {
        return T;
    }

    public final long T() {
        return U;
    }

    public final long U() {
        return V;
    }

    public final long V() {
        return W;
    }

    public final long W() {
        return X;
    }

    public final long X() {
        return Y;
    }

    public final long Y() {
        return Z;
    }

    public final long Z() {
        return f140088a0;
    }

    public final long a() {
        return f140089b;
    }

    public final long a0() {
        return f140090b0;
    }

    public final long b() {
        return f140091c;
    }

    public final long b0() {
        return f140092c0;
    }

    public final long c() {
        return f140093d;
    }

    public final long c0() {
        return f140094d0;
    }

    public final long d() {
        return f140095e;
    }

    public final long d0() {
        return f140096e0;
    }

    public final long e() {
        return f140097f;
    }

    public final long e0() {
        return f140098f0;
    }

    public final long f() {
        return f140099g;
    }

    public final long f0() {
        return f140100g0;
    }

    public final long g() {
        return f140101h;
    }

    public final long g0() {
        return f140102h0;
    }

    public final long h() {
        return f140103i;
    }

    public final long h0() {
        return f140104i0;
    }

    public final long i() {
        return f140105j;
    }

    public final long i0() {
        return f140106j0;
    }

    public final long j() {
        return f140107k;
    }

    public final long j0() {
        return f140108k0;
    }

    public final long k() {
        return f140109l;
    }

    public final long k0() {
        return f140110l0;
    }

    public final long l() {
        return f140111m;
    }

    public final long l0() {
        return f140112m0;
    }

    public final long m() {
        return f140113n;
    }

    public final long m0() {
        return f140114n0;
    }

    public final long n() {
        return f140115o;
    }

    public final long n0() {
        return f140116o0;
    }

    public final long o() {
        return f140117p;
    }

    public final long o0() {
        return f140118p0;
    }

    public final long p() {
        return f140119q;
    }

    public final long p0() {
        return f140120q0;
    }

    public final long q() {
        return f140121r;
    }

    public final long q0() {
        return f140122r0;
    }

    public final long r() {
        return f140123s;
    }

    public final long r0() {
        return f140124s0;
    }

    public final long s() {
        return f140125t;
    }

    public final long s0() {
        return f140126t0;
    }

    public final long t() {
        return f140127u;
    }

    public final long t0() {
        return f140128u0;
    }

    public final long u() {
        return f140129v;
    }

    public final long u0() {
        return f140130v0;
    }

    public final long v() {
        return f140131w;
    }

    public final long v0() {
        return f140132w0;
    }

    public final long w() {
        return f140133x;
    }

    public final long w0() {
        return f140134x0;
    }

    public final long x() {
        return f140135y;
    }

    public final long x0() {
        return f140136y0;
    }

    public final long y() {
        return f140137z;
    }

    public final long y0() {
        return f140138z0;
    }

    public final long z() {
        return A;
    }

    public final long z0() {
        return A0;
    }
}
