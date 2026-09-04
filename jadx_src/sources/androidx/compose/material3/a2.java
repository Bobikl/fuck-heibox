package androidx.compose.material3;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: TonalPalette.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0003\b\u0086\u0001\b\u0000\u0018\u00002\u00020\u0001B\u009a\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\u0002\u0012\u0006\u0010)\u001a\u00020\u0002\u0012\u0006\u0010,\u001a\u00020\u0002\u0012\u0006\u0010/\u001a\u00020\u0002\u0012\u0006\u00102\u001a\u00020\u0002\u0012\u0006\u00103\u001a\u00020\u0002\u0012\u0006\u00104\u001a\u00020\u0002\u0012\u0006\u00105\u001a\u00020\u0002\u0012\u0006\u00106\u001a\u00020\u0002\u0012\u0006\u00107\u001a\u00020\u0002\u0012\u0006\u00108\u001a\u00020\u0002\u0012\u0006\u0010;\u001a\u00020\u0002\u0012\u0006\u0010>\u001a\u00020\u0002\u0012\u0006\u0010@\u001a\u00020\u0002\u0012\u0006\u0010C\u001a\u00020\u0002\u0012\u0006\u0010E\u001a\u00020\u0002\u0012\u0006\u0010H\u001a\u00020\u0002\u0012\u0006\u0010K\u001a\u00020\u0002\u0012\u0006\u0010L\u001a\u00020\u0002\u0012\u0006\u0010M\u001a\u00020\u0002\u0012\u0006\u0010N\u001a\u00020\u0002\u0012\u0006\u0010O\u001a\u00020\u0002\u0012\u0006\u0010P\u001a\u00020\u0002\u0012\u0006\u0010Q\u001a\u00020\u0002\u0012\u0006\u0010T\u001a\u00020\u0002\u0012\u0006\u0010W\u001a\u00020\u0002\u0012\u0006\u0010Y\u001a\u00020\u0002\u0012\u0006\u0010\\\u001a\u00020\u0002\u0012\u0006\u0010_\u001a\u00020\u0002\u0012\u0006\u0010b\u001a\u00020\u0002\u0012\u0006\u0010e\u001a\u00020\u0002\u0012\u0006\u0010f\u001a\u00020\u0002\u0012\u0006\u0010g\u001a\u00020\u0002\u0012\u0006\u0010h\u001a\u00020\u0002\u0012\u0006\u0010i\u001a\u00020\u0002\u0012\u0006\u0010j\u001a\u00020\u0002\u0012\u0006\u0010k\u001a\u00020\u0002\u0012\u0006\u0010n\u001a\u00020\u0002\u0012\u0006\u0010q\u001a\u00020\u0002\u0012\u0006\u0010s\u001a\u00020\u0002\u0012\u0006\u0010v\u001a\u00020\u0002\u0012\u0006\u0010y\u001a\u00020\u0002\u0012\u0006\u0010|\u001a\u00020\u0002\u0012\u0006\u0010\u007f\u001a\u00020\u0002\u0012\u0007\u0010\u0080\u0001\u001a\u00020\u0002\u0012\u0007\u0010\u0081\u0001\u001a\u00020\u0002\u0012\u0007\u0010\u0082\u0001\u001a\u00020\u0002\u0012\u0007\u0010\u0083\u0001\u001a\u00020\u0002\u0012\u0007\u0010\u0084\u0001\u001a\u00020\u0002\u0012\u0007\u0010\u0085\u0001\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R \u0010\f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006R \u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R \u0010\u0012\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006R \u0010\u0015\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R \u0010\u0018\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006R \u0010\u0019\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006R \u0010\u001a\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006R \u0010\u001b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R \u0010\u001c\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\r\u0010\u0006R \u0010\u001d\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\u001e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R \u0010!\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b \u0010\u0006R \u0010$\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\"\u0010\u0004\u001a\u0004\b#\u0010\u0006R \u0010&\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b \u0010\u0004\u001a\u0004\b%\u0010\u0006R \u0010)\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b'\u0010\u0004\u001a\u0004\b(\u0010\u0006R \u0010,\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b*\u0010\u0004\u001a\u0004\b+\u0010\u0006R \u0010/\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b-\u0010\u0004\u001a\u0004\b.\u0010\u0006R \u00102\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b0\u0010\u0004\u001a\u0004\b1\u0010\u0006R \u00103\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b1\u0010\u0004\u001a\u0004\b0\u0010\u0006R \u00104\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b.\u0010\u0004\u001a\u0004\b-\u0010\u0006R \u00105\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b+\u0010\u0004\u001a\u0004\b*\u0010\u0006R \u00106\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b(\u0010\u0004\u001a\u0004\b'\u0010\u0006R \u00107\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b%\u0010\u0004\u001a\u0004\b\"\u0010\u0006R \u00108\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b#\u0010\u0004\u001a\u0004\b\u001f\u0010\u0006R \u0010;\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b9\u0010\u0004\u001a\u0004\b:\u0010\u0006R \u0010>\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b<\u0010\u0004\u001a\u0004\b=\u0010\u0006R \u0010@\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b:\u0010\u0004\u001a\u0004\b?\u0010\u0006R \u0010C\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bA\u0010\u0004\u001a\u0004\bB\u0010\u0006R \u0010E\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bD\u0010\u0004\u001a\u0004\b\u0004\u0010\u0006R \u0010H\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bF\u0010\u0004\u001a\u0004\bG\u0010\u0006R \u0010K\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bI\u0010\u0004\u001a\u0004\bJ\u0010\u0006R \u0010L\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bJ\u0010\u0004\u001a\u0004\bI\u0010\u0006R \u0010M\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bG\u0010\u0004\u001a\u0004\bF\u0010\u0006R \u0010N\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0004\u001a\u0004\bD\u0010\u0006R \u0010O\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bB\u0010\u0004\u001a\u0004\bA\u0010\u0006R \u0010P\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b?\u0010\u0004\u001a\u0004\b<\u0010\u0006R \u0010Q\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b=\u0010\u0004\u001a\u0004\b9\u0010\u0006R \u0010T\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bR\u0010\u0004\u001a\u0004\bS\u0010\u0006R \u0010W\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bU\u0010\u0004\u001a\u0004\bV\u0010\u0006R \u0010Y\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bS\u0010\u0004\u001a\u0004\bX\u0010\u0006R \u0010\\\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bZ\u0010\u0004\u001a\u0004\b[\u0010\u0006R \u0010_\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b]\u0010\u0004\u001a\u0004\b^\u0010\u0006R \u0010b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b`\u0010\u0004\u001a\u0004\ba\u0010\u0006R \u0010e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bc\u0010\u0004\u001a\u0004\bd\u0010\u0006R \u0010f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bd\u0010\u0004\u001a\u0004\bc\u0010\u0006R \u0010g\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\ba\u0010\u0004\u001a\u0004\b`\u0010\u0006R \u0010h\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b^\u0010\u0004\u001a\u0004\b]\u0010\u0006R \u0010i\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b[\u0010\u0004\u001a\u0004\bZ\u0010\u0006R \u0010j\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bX\u0010\u0004\u001a\u0004\bU\u0010\u0006R \u0010k\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bV\u0010\u0004\u001a\u0004\bR\u0010\u0006R \u0010n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bl\u0010\u0004\u001a\u0004\bm\u0010\u0006R \u0010q\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bo\u0010\u0004\u001a\u0004\bp\u0010\u0006R \u0010s\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bm\u0010\u0004\u001a\u0004\br\u0010\u0006R \u0010v\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bt\u0010\u0004\u001a\u0004\bu\u0010\u0006R \u0010y\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bw\u0010\u0004\u001a\u0004\bx\u0010\u0006R \u0010|\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bz\u0010\u0004\u001a\u0004\b{\u0010\u0006R \u0010\u007f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b}\u0010\u0004\u001a\u0004\b~\u0010\u0006R!\u0010\u0080\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b~\u0010\u0004\u001a\u0004\b}\u0010\u0006R!\u0010\u0081\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b{\u0010\u0004\u001a\u0004\bz\u0010\u0006R!\u0010\u0082\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bx\u0010\u0004\u001a\u0004\bw\u0010\u0006R!\u0010\u0083\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bu\u0010\u0004\u001a\u0004\bt\u0010\u0006R!\u0010\u0084\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\br\u0010\u0004\u001a\u0004\bo\u0010\u0006R!\u0010\u0085\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bp\u0010\u0004\u001a\u0004\bl\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0088\u0001"}, d2 = {"Landroidx/compose/material3/a2;", "", "Landroidx/compose/ui/graphics/l0;", ak.av, "J", ak.aF, "()J", "neutral100", "b", "m", "neutral99", "l", "neutral95", "d", "k", "neutral90", "e", "j", "neutral80", "f", "i", "neutral70", "g", RXScreenCaptureService.KEY_HEIGHT, "neutral60", "neutral50", "neutral40", "neutral30", "neutral20", "neutral10", "neutral0", "n", "p", "neutralVariant100", "o", ak.aD, "neutralVariant99", "y", "neutralVariant95", "q", "x", "neutralVariant90", "r", RXScreenCaptureService.KEY_WIDTH, "neutralVariant80", ak.aB, "v", "neutralVariant70", "t", ak.aG, "neutralVariant60", "neutralVariant50", "neutralVariant40", "neutralVariant30", "neutralVariant20", "neutralVariant10", "neutralVariant0", androidx.exifinterface.media.a.W4, "C", "primary100", "B", "M", "primary99", "L", "primary95", "D", "K", "primary90", androidx.exifinterface.media.a.S4, "primary80", "F", "I", "primary70", "G", "H", "primary60", "primary50", "primary40", "primary30", "primary20", "primary10", "primary0", "N", "P", "secondary100", "O", "Z", "secondary99", "Y", "secondary95", "Q", "X", "secondary90", "R", androidx.exifinterface.media.a.T4, "secondary80", androidx.exifinterface.media.a.R4, androidx.exifinterface.media.a.X4, "secondary70", androidx.exifinterface.media.a.f23244d5, "U", "secondary60", "secondary50", "secondary40", "secondary30", "secondary20", "secondary10", "secondary0", "a0", "c0", "tertiary100", "b0", "m0", "tertiary99", "l0", "tertiary95", "d0", "k0", "tertiary90", "e0", "j0", "tertiary80", "f0", "i0", "tertiary70", "g0", "h0", "tertiary60", "tertiary50", "tertiary40", "tertiary30", "tertiary20", "tertiary10", "tertiary0", "<init>", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/u;)V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class a2 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final long primary100;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final long primary99;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final long primary95;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final long primary90;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final long primary80;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final long primary70;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final long primary60;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final long primary50;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final long primary40;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final long primary30;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final long primary20;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final long primary10;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final long primary0;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final long secondary100;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final long secondary99;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final long secondary95;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final long secondary90;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private final long secondary80;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private final long secondary70;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private final long secondary60;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private final long secondary50;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private final long secondary40;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private final long secondary30;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private final long secondary20;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private final long secondary10;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private final long secondary0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long neutral100;

    /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private final long tertiary100;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long neutral99;

    /* JADX INFO: renamed from: b0, reason: collision with root package name and from kotlin metadata */
    private final long tertiary99;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long neutral95;

    /* JADX INFO: renamed from: c0, reason: collision with root package name and from kotlin metadata */
    private final long tertiary95;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long neutral90;

    /* JADX INFO: renamed from: d0, reason: collision with root package name and from kotlin metadata */
    private final long tertiary90;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long neutral80;

    /* JADX INFO: renamed from: e0, reason: collision with root package name and from kotlin metadata */
    private final long tertiary80;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long neutral70;

    /* JADX INFO: renamed from: f0, reason: collision with root package name and from kotlin metadata */
    private final long tertiary70;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long neutral60;

    /* JADX INFO: renamed from: g0, reason: collision with root package name and from kotlin metadata */
    private final long tertiary60;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long neutral50;

    /* JADX INFO: renamed from: h0, reason: collision with root package name and from kotlin metadata */
    private final long tertiary50;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long neutral40;

    /* JADX INFO: renamed from: i0, reason: collision with root package name and from kotlin metadata */
    private final long tertiary40;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long neutral30;

    /* JADX INFO: renamed from: j0, reason: collision with root package name and from kotlin metadata */
    private final long tertiary30;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final long neutral20;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    private final long tertiary20;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final long neutral10;

    /* JADX INFO: renamed from: l0, reason: collision with root package name and from kotlin metadata */
    private final long tertiary10;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final long neutral0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name and from kotlin metadata */
    private final long tertiary0;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long neutralVariant100;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final long neutralVariant99;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final long neutralVariant95;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final long neutralVariant90;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final long neutralVariant80;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final long neutralVariant70;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final long neutralVariant60;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final long neutralVariant50;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final long neutralVariant40;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final long neutralVariant30;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final long neutralVariant20;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final long neutralVariant10;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final long neutralVariant0;

    private a2(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51, long j52, long j53, long j54, long j55, long j56, long j57, long j58, long j59, long j60, long j61, long j62, long j63, long j64, long j65, long j66, long j67, long j68, long j69, long j70, long j71, long j72, long j73, long j74) {
        this.neutral100 = j10;
        this.neutral99 = j11;
        this.neutral95 = j12;
        this.neutral90 = j13;
        this.neutral80 = j14;
        this.neutral70 = j15;
        this.neutral60 = j16;
        this.neutral50 = j17;
        this.neutral40 = j18;
        this.neutral30 = j19;
        this.neutral20 = j20;
        this.neutral10 = j21;
        this.neutral0 = j22;
        this.neutralVariant100 = j23;
        this.neutralVariant99 = j24;
        this.neutralVariant95 = j25;
        this.neutralVariant90 = j26;
        this.neutralVariant80 = j27;
        this.neutralVariant70 = j28;
        this.neutralVariant60 = j29;
        this.neutralVariant50 = j30;
        this.neutralVariant40 = j31;
        this.neutralVariant30 = j32;
        this.neutralVariant20 = j33;
        this.neutralVariant10 = j34;
        this.neutralVariant0 = j35;
        this.primary100 = j36;
        this.primary99 = j37;
        this.primary95 = j38;
        this.primary90 = j39;
        this.primary80 = j40;
        this.primary70 = j41;
        this.primary60 = j42;
        this.primary50 = j43;
        this.primary40 = j44;
        this.primary30 = j45;
        this.primary20 = j46;
        this.primary10 = j47;
        this.primary0 = j48;
        this.secondary100 = j49;
        this.secondary99 = j50;
        this.secondary95 = j51;
        this.secondary90 = j52;
        this.secondary80 = j53;
        this.secondary70 = j54;
        this.secondary60 = j55;
        this.secondary50 = j56;
        this.secondary40 = j57;
        this.secondary30 = j58;
        this.secondary20 = j59;
        this.secondary10 = j60;
        this.secondary0 = j61;
        this.tertiary100 = j62;
        this.tertiary99 = j63;
        this.tertiary95 = j64;
        this.tertiary90 = j65;
        this.tertiary80 = j66;
        this.tertiary70 = j67;
        this.tertiary60 = j68;
        this.tertiary50 = j69;
        this.tertiary40 = j70;
        this.tertiary30 = j71;
        this.tertiary20 = j72;
        this.tertiary10 = j73;
        this.tertiary0 = j74;
    }

    public /* synthetic */ a2(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51, long j52, long j53, long j54, long j55, long j56, long j57, long j58, long j59, long j60, long j61, long j62, long j63, long j64, long j65, long j66, long j67, long j68, long j69, long j70, long j71, long j72, long j73, long j74, kotlin.jvm.internal.u uVar) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42, j43, j44, j45, j46, j47, j48, j49, j50, j51, j52, j53, j54, j55, j56, j57, j58, j59, j60, j61, j62, j63, j64, j65, j66, j67, j68, j69, j70, j71, j72, j73, j74);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final long getPrimary0() {
        return this.primary0;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final long getPrimary10() {
        return this.primary10;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final long getPrimary100() {
        return this.primary100;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final long getPrimary20() {
        return this.primary20;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final long getPrimary30() {
        return this.primary30;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final long getPrimary40() {
        return this.primary40;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final long getPrimary50() {
        return this.primary50;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final long getPrimary60() {
        return this.primary60;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final long getPrimary70() {
        return this.primary70;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final long getPrimary80() {
        return this.primary80;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final long getPrimary90() {
        return this.primary90;
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final long getPrimary95() {
        return this.primary95;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final long getPrimary99() {
        return this.primary99;
    }

    /* JADX INFO: renamed from: N, reason: from getter */
    public final long getSecondary0() {
        return this.secondary0;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final long getSecondary10() {
        return this.secondary10;
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public final long getSecondary100() {
        return this.secondary100;
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final long getSecondary20() {
        return this.secondary20;
    }

    /* JADX INFO: renamed from: R, reason: from getter */
    public final long getSecondary30() {
        return this.secondary30;
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public final long getSecondary40() {
        return this.secondary40;
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public final long getSecondary50() {
        return this.secondary50;
    }

    /* JADX INFO: renamed from: U, reason: from getter */
    public final long getSecondary60() {
        return this.secondary60;
    }

    /* JADX INFO: renamed from: V, reason: from getter */
    public final long getSecondary70() {
        return this.secondary70;
    }

    /* JADX INFO: renamed from: W, reason: from getter */
    public final long getSecondary80() {
        return this.secondary80;
    }

    /* JADX INFO: renamed from: X, reason: from getter */
    public final long getSecondary90() {
        return this.secondary90;
    }

    /* JADX INFO: renamed from: Y, reason: from getter */
    public final long getSecondary95() {
        return this.secondary95;
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final long getSecondary99() {
        return this.secondary99;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getNeutral0() {
        return this.neutral0;
    }

    /* JADX INFO: renamed from: a0, reason: from getter */
    public final long getTertiary0() {
        return this.tertiary0;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getNeutral10() {
        return this.neutral10;
    }

    /* JADX INFO: renamed from: b0, reason: from getter */
    public final long getTertiary10() {
        return this.tertiary10;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getNeutral100() {
        return this.neutral100;
    }

    /* JADX INFO: renamed from: c0, reason: from getter */
    public final long getTertiary100() {
        return this.tertiary100;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getNeutral20() {
        return this.neutral20;
    }

    /* JADX INFO: renamed from: d0, reason: from getter */
    public final long getTertiary20() {
        return this.tertiary20;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getNeutral30() {
        return this.neutral30;
    }

    /* JADX INFO: renamed from: e0, reason: from getter */
    public final long getTertiary30() {
        return this.tertiary30;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getNeutral40() {
        return this.neutral40;
    }

    /* JADX INFO: renamed from: f0, reason: from getter */
    public final long getTertiary40() {
        return this.tertiary40;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getNeutral50() {
        return this.neutral50;
    }

    /* JADX INFO: renamed from: g0, reason: from getter */
    public final long getTertiary50() {
        return this.tertiary50;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getNeutral60() {
        return this.neutral60;
    }

    /* JADX INFO: renamed from: h0, reason: from getter */
    public final long getTertiary60() {
        return this.tertiary60;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getNeutral70() {
        return this.neutral70;
    }

    /* JADX INFO: renamed from: i0, reason: from getter */
    public final long getTertiary70() {
        return this.tertiary70;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final long getNeutral80() {
        return this.neutral80;
    }

    /* JADX INFO: renamed from: j0, reason: from getter */
    public final long getTertiary80() {
        return this.tertiary80;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getNeutral90() {
        return this.neutral90;
    }

    /* JADX INFO: renamed from: k0, reason: from getter */
    public final long getTertiary90() {
        return this.tertiary90;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final long getNeutral95() {
        return this.neutral95;
    }

    /* JADX INFO: renamed from: l0, reason: from getter */
    public final long getTertiary95() {
        return this.tertiary95;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final long getNeutral99() {
        return this.neutral99;
    }

    /* JADX INFO: renamed from: m0, reason: from getter */
    public final long getTertiary99() {
        return this.tertiary99;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final long getNeutralVariant0() {
        return this.neutralVariant0;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final long getNeutralVariant10() {
        return this.neutralVariant10;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final long getNeutralVariant100() {
        return this.neutralVariant100;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final long getNeutralVariant20() {
        return this.neutralVariant20;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final long getNeutralVariant30() {
        return this.neutralVariant30;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final long getNeutralVariant40() {
        return this.neutralVariant40;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final long getNeutralVariant50() {
        return this.neutralVariant50;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final long getNeutralVariant60() {
        return this.neutralVariant60;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final long getNeutralVariant70() {
        return this.neutralVariant70;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final long getNeutralVariant80() {
        return this.neutralVariant80;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final long getNeutralVariant90() {
        return this.neutralVariant90;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final long getNeutralVariant95() {
        return this.neutralVariant95;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final long getNeutralVariant99() {
        return this.neutralVariant99;
    }
}
