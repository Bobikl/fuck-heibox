package kotlinx.coroutines.channels;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.r0;
import kotlin.t0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.v1;

/* JADX INFO: compiled from: Deprecated.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u009e\u0001\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001aL\u0010\n\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003j\u0002`\t2\u001a\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u0000\"\u0006\u0012\u0002\b\u00030\u0001H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0087@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a-\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0010\u001a#\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a%\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0013\u001a+\u0010\u0016\u001a\u00020\r\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0015\u001a\u00028\u0000H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a#\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0013\u001a+\u0010\u0019\u001a\u00020\r\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0015\u001a\u00028\u0000H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0017\u001a%\u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0013\u001a#\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0013\u001a%\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0013\u001a0\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007\u001aV\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\"\u0010%\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001aV\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\"\u0010%\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010'\u001ak\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e27\u0010%\u001a3\b\u0001\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0012\u0006\u0012\u0004\u0018\u00010$0(H\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001aV\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\"\u0010%\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010'\u001a$\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\f*\u00020$*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001H\u0001\u001aC\u0010/\u001a\u00028\u0001\"\b\b\u0000\u0010\f*\u00020$\"\u0010\b\u0001\u0010\u0019*\n\u0012\u0006\b\u0000\u0012\u00028\u00000-*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00012\u0006\u0010.\u001a\u00028\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001aA\u00102\u001a\u00028\u0001\"\b\b\u0000\u0010\f*\u00020$\"\u000e\b\u0001\u0010\u0019*\b\u0012\u0004\u0012\u00028\u000001*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00012\u0006\u0010.\u001a\u00028\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001a0\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007\u001aV\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\"\u0010%\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0007ø\u0001\u0000¢\u0006\u0004\b5\u0010'\u001a;\u00106\u001a\u00028\u0001\"\u0004\b\u0000\u0010\f\"\u000e\b\u0001\u0010\u0019*\b\u0012\u0004\u0012\u00028\u000001*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010.\u001a\u00028\u0001H\u0081@ø\u0001\u0000¢\u0006\u0004\b6\u00103\u001a=\u00107\u001a\u00028\u0001\"\u0004\b\u0000\u0010\f\"\u0010\b\u0001\u0010\u0019*\n\u0012\u0006\b\u0000\u0012\u00028\u00000-*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010.\u001a\u00028\u0001H\u0081@ø\u0001\u0000¢\u0006\u0004\b7\u00100\u001aA\u0010<\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010;\"\u0004\b\u0000\u00108\"\u0004\b\u0001\u00109*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010:0\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b<\u0010\u0013\u001aW\u0010?\u001a\u00028\u0002\"\u0004\b\u0000\u00108\"\u0004\b\u0001\u00109\"\u0018\b\u0002\u0010>*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010=*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010:0\u00012\u0006\u0010.\u001a\u00028\u0002H\u0081@ø\u0001\u0000¢\u0006\u0004\b?\u0010@\u001a)\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000A\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\bB\u0010\u0013\u001a)\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000C\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\bD\u0010\u0013\u001ab\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\u001c*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2(\u0010E\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0007ø\u0001\u0000¢\u0006\u0004\bF\u0010'\u001a\\\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\u001c*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\"\u0010E\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010'\u001aq\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\u001c*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e27\u0010E\u001a3\b\u0001\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010$0(H\u0001ø\u0001\u0000¢\u0006\u0004\bG\u0010*\u001aw\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\f\"\b\b\u0001\u0010\u001c*\u00020$*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e29\u0010E\u001a5\b\u0001\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010$0(H\u0007ø\u0001\u0000¢\u0006\u0004\bH\u0010*\u001ab\u00108\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\f\"\b\b\u0001\u0010\u001c*\u00020$*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2$\u0010E\u001a \b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0007ø\u0001\u0000¢\u0006\u0004\b8\u0010'\u001a.\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000I0\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007\u001a\u001e\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007\u001a\\\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u00108*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\"\u0010L\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0001ø\u0001\u0000¢\u0006\u0004\bM\u0010'\u001a)\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00000N\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0081@ø\u0001\u0000¢\u0006\u0004\bO\u0010\u0013\u001a#\u0010P\u001a\u00020#\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\bP\u0010\u0013\u001a#\u0010Q\u001a\u00020\r\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\bQ\u0010\u0013\u001aA\u0010>\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010T\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000Rj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`SH\u0087@ø\u0001\u0000¢\u0006\u0004\b>\u0010U\u001aA\u0010V\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010T\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000Rj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`SH\u0087@ø\u0001\u0000¢\u0006\u0004\bV\u0010U\u001a#\u0010W\u001a\u00020#\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\bW\u0010\u0013\u001a$\u0010X\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\f*\u00020$*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001H\u0007\u001a?\u0010Z\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010:0\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\u001c*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u0087\u0004\u001az\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00020\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\u001c\"\u0004\b\u0002\u00109*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00010\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e26\u0010E\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(P\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b([\u0012\u0004\u0012\u00028\u00020!H\u0001\u001a1\u0010[\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003j\u0002`\t*\u0006\u0012\u0002\b\u00030\u0001H\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006]"}, d2 = {"", "Lkotlinx/coroutines/channels/ReceiveChannel;", com.max.xiaoheihe.module.bbs.utils.b.f83401f, "Lkotlin/Function1;", "", "Lkotlin/m0;", "name", "cause", "Lkotlin/b2;", "Lkotlinx/coroutines/CompletionHandler;", ak.aF, "([Lkotlinx/coroutines/channels/ReceiveChannel;)Lyh/l;", androidx.exifinterface.media.a.S4, "", UCropPlusActivity.ARG_INDEX, "l", "(Lkotlinx/coroutines/channels/ReceiveChannel;ILkotlin/coroutines/c;)Ljava/lang/Object;", "m", RXScreenCaptureService.KEY_WIDTH, "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/c;)Ljava/lang/Object;", "x", "element", androidx.exifinterface.media.a.W4, "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "B", "C", "D", "Q", "R", "n", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, RXScreenCaptureService.KEY_HEIGHT, "Lkotlin/Function2;", "Lkotlin/coroutines/c;", "", "", "predicate", "j", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/CoroutineContext;Lyh/p;)Lkotlinx/coroutines/channels/ReceiveChannel;", "Lkotlin/Function3;", "p", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/CoroutineContext;Lyh/q;)Lkotlinx/coroutines/channels/ReceiveChannel;", "r", "t", "", "destination", ak.aG, "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/util/Collection;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/b0;", "v", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlinx/coroutines/channels/b0;Lkotlin/coroutines/c;)Ljava/lang/Object;", androidx.exifinterface.media.a.R4, "U", androidx.exifinterface.media.a.T4, "X", "K", androidx.exifinterface.media.a.X4, "Lkotlin/Pair;", "", "Z", "", "M", "Y", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/util/Map;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "a0", "", "c0", "transform", "y", "G", "I", "Lkotlin/collections/h0;", "d0", "e", "selector", "f", "", "b0", ak.av, "d", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/util/Comparator;Lkotlin/coroutines/c;)Ljava/lang/Object;", "N", "O", "P", "other", "f0", "b", "g0", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/channels/ChannelsKt")
public final /* synthetic */ class ChannelsKt__DeprecatedKt {
    /* JADX WARN: Code duplicated, block: B:23:0x0063 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0064  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:12:0x0033, B:25:0x0067, B:27:0x0070, B:29:0x007a, B:32:0x0084, B:21:0x0053, B:33:0x008b), top: B:44:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x007a A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #1 {all -> 0x0037, blocks: (B:12:0x0033, B:25:0x0067, B:27:0x0070, B:29:0x007a, B:32:0x0084, B:21:0x0053, B:33:0x008b), top: B:44:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0084 A[Catch: all -> 0x0037, TRY_ENTER, TryCatch #1 {all -> 0x0037, blocks: (B:12:0x0033, B:25:0x0067, B:27:0x0070, B:29:0x007a, B:32:0x0084, B:21:0x0053, B:33:0x008b), top: B:44:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x008b A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #1 {all -> 0x0037, blocks: (B:12:0x0033, B:25:0x0067, B:27:0x0070, B:29:0x007a, B:32:0x0084, B:21:0x0053, B:33:0x008b), top: B:44:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0064 -> B:25:0x0067). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.k(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object A(kotlinx.coroutines.channels.ReceiveChannel r7, java.lang.Object r8, kotlin.coroutines.c r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1) r0
            int r1 = r0.f128892g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f128892g = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f128891f
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.h()
            int r2 = r0.f128892g
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r7 = r0.f128890e
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r8 = r0.f128889d
            kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
            java.lang.Object r2 = r0.f128888c
            kotlin.jvm.internal.Ref$IntRef r2 = (kotlin.jvm.internal.Ref.IntRef) r2
            java.lang.Object r4 = r0.f128887b
            kotlin.t0.n(r9)     // Catch: java.lang.Throwable -> L37
            goto L67
        L37:
            r7 = move-exception
            goto L9a
        L3a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L42:
            kotlin.t0.n(r9)
            kotlin.jvm.internal.Ref$IntRef r9 = new kotlin.jvm.internal.Ref$IntRef
            r9.<init>()
            kotlinx.coroutines.channels.ChannelIterator r2 = r7.iterator()     // Catch: java.lang.Throwable -> L96
            r6 = r8
            r8 = r7
            r7 = r2
            r2 = r9
            r9 = r6
        L53:
            r0.f128887b = r9     // Catch: java.lang.Throwable -> L37
            r0.f128888c = r2     // Catch: java.lang.Throwable -> L37
            r0.f128889d = r8     // Catch: java.lang.Throwable -> L37
            r0.f128890e = r7     // Catch: java.lang.Throwable -> L37
            r0.f128892g = r3     // Catch: java.lang.Throwable -> L37
            java.lang.Object r4 = r7.b(r0)     // Catch: java.lang.Throwable -> L37
            if (r4 != r1) goto L64
            return r1
        L64:
            r6 = r4
            r4 = r9
            r9 = r6
        L67:
            r5 = 0
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L37
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r9 == 0) goto L8b
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L37
            boolean r9 = kotlin.jvm.internal.f0.g(r4, r9)     // Catch: java.lang.Throwable -> L37
            if (r9 == 0) goto L84
            int r7 = r2.f124889b     // Catch: java.lang.Throwable -> L37
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.a.f(r7)     // Catch: java.lang.Throwable -> L37
            kotlinx.coroutines.channels.o.b(r8, r5)
            return r7
        L84:
            int r9 = r2.f124889b     // Catch: java.lang.Throwable -> L37
            int r9 = r9 + r3
            r2.f124889b = r9     // Catch: java.lang.Throwable -> L37
            r9 = r4
            goto L53
        L8b:
            kotlin.b2 r7 = kotlin.b2.f124493a     // Catch: java.lang.Throwable -> L37
            kotlinx.coroutines.channels.o.b(r8, r5)
            r7 = -1
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.a.f(r7)
            return r7
        L96:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L9a:
            throw r7     // Catch: java.lang.Throwable -> L9b
        L9b:
            r9 = move-exception
            kotlinx.coroutines.channels.o.b(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.A(kotlinx.coroutines.channels.ReceiveChannel, java.lang.Object, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0085 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0086  */
    /* JADX WARN: Code duplicated, block: B:40:0x0093 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x0032, B:38:0x008b, B:40:0x0093), top: B:54:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0086 -> B:37:0x008a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.k(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object B(kotlinx.coroutines.channels.ReceiveChannel r7, kotlin.coroutines.c r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1) r0
            int r1 = r0.f128897f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f128897f = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f128896e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.h()
            int r2 = r0.f128897f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L50
            if (r2 == r4) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r7 = r0.f128895d
            java.lang.Object r2 = r0.f128894c
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r4 = r0.f128893b
            kotlinx.coroutines.channels.ReceiveChannel r4 = (kotlinx.coroutines.channels.ReceiveChannel) r4
            kotlin.t0.n(r8)     // Catch: java.lang.Throwable -> L36
            goto L8a
        L36:
            r7 = move-exception
            r2 = r4
            goto La8
        L3a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L42:
            java.lang.Object r7 = r0.f128894c
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r2 = r0.f128893b
            kotlinx.coroutines.channels.ReceiveChannel r2 = (kotlinx.coroutines.channels.ReceiveChannel) r2
            kotlin.t0.n(r8)     // Catch: java.lang.Throwable -> L4e
            goto L68
        L4e:
            r7 = move-exception
            goto La8
        L50:
            kotlin.t0.n(r8)
            kotlinx.coroutines.channels.ChannelIterator r8 = r7.iterator()     // Catch: java.lang.Throwable -> La5
            r0.f128893b = r7     // Catch: java.lang.Throwable -> La5
            r0.f128894c = r8     // Catch: java.lang.Throwable -> La5
            r0.f128897f = r4     // Catch: java.lang.Throwable -> La5
            java.lang.Object r2 = r8.b(r0)     // Catch: java.lang.Throwable -> La5
            if (r2 != r1) goto L64
            return r1
        L64:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L68:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L4e
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L4e
            if (r8 == 0) goto L9d
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L4e
            r6 = r2
            r2 = r7
            r7 = r6
        L77:
            r0.f128893b = r7     // Catch: java.lang.Throwable -> La5
            r0.f128894c = r2     // Catch: java.lang.Throwable -> La5
            r0.f128895d = r8     // Catch: java.lang.Throwable -> La5
            r0.f128897f = r3     // Catch: java.lang.Throwable -> La5
            java.lang.Object r4 = r2.b(r0)     // Catch: java.lang.Throwable -> La5
            if (r4 != r1) goto L86
            return r1
        L86:
            r6 = r4
            r4 = r7
            r7 = r8
            r8 = r6
        L8a:
            r5 = 0
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L36
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r8 == 0) goto L99
            java.lang.Object r8 = r2.next()     // Catch: java.lang.Throwable -> L36
            r7 = r4
            goto L77
        L99:
            kotlinx.coroutines.channels.o.b(r4, r5)
            return r7
        L9d:
            java.util.NoSuchElementException r7 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L4e
            java.lang.String r8 = "ReceiveChannel is empty."
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L4e
            throw r7     // Catch: java.lang.Throwable -> L4e
        La5:
            r8 = move-exception
            r2 = r7
            r7 = r8
        La8:
            throw r7     // Catch: java.lang.Throwable -> La9
        La9:
            r8 = move-exception
            kotlinx.coroutines.channels.o.b(r2, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.B(kotlinx.coroutines.channels.ReceiveChannel, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0071 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x007e A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:12:0x0037, B:25:0x0075, B:27:0x007e, B:29:0x0088, B:30:0x008c, B:21:0x005f, B:31:0x0093), top: B:42:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0088 A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:12:0x0037, B:25:0x0075, B:27:0x007e, B:29:0x0088, B:30:0x008c, B:21:0x005f, B:31:0x0093), top: B:42:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0093 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:12:0x0037, B:25:0x0075, B:27:0x007e, B:29:0x0088, B:30:0x008c, B:21:0x005f, B:31:0x0093), top: B:42:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0072 -> B:25:0x0075). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.k(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object C(kotlinx.coroutines.channels.ReceiveChannel r8, java.lang.Object r9, kotlin.coroutines.c r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1) r0
            int r1 = r0.f128904h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f128904h = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f128903g
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.h()
            int r2 = r0.f128904h
            r3 = 1
            if (r2 == 0) goto L46
            if (r2 != r3) goto L3e
            java.lang.Object r8 = r0.f128902f
            kotlinx.coroutines.channels.ChannelIterator r8 = (kotlinx.coroutines.channels.ChannelIterator) r8
            java.lang.Object r9 = r0.f128901e
            kotlinx.coroutines.channels.ReceiveChannel r9 = (kotlinx.coroutines.channels.ReceiveChannel) r9
            java.lang.Object r2 = r0.f128900d
            kotlin.jvm.internal.Ref$IntRef r2 = (kotlin.jvm.internal.Ref.IntRef) r2
            java.lang.Object r4 = r0.f128899c
            kotlin.jvm.internal.Ref$IntRef r4 = (kotlin.jvm.internal.Ref.IntRef) r4
            java.lang.Object r5 = r0.f128898b
            kotlin.t0.n(r10)     // Catch: java.lang.Throwable -> L3b
            goto L75
        L3b:
            r8 = move-exception
            goto La3
        L3e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L46:
            kotlin.t0.n(r10)
            kotlin.jvm.internal.Ref$IntRef r10 = new kotlin.jvm.internal.Ref$IntRef
            r10.<init>()
            r2 = -1
            r10.f124889b = r2
            kotlin.jvm.internal.Ref$IntRef r2 = new kotlin.jvm.internal.Ref$IntRef
            r2.<init>()
            kotlinx.coroutines.channels.ChannelIterator r4 = r8.iterator()     // Catch: java.lang.Throwable -> L9f
            r7 = r9
            r9 = r8
            r8 = r4
            r4 = r10
            r10 = r7
        L5f:
            r0.f128898b = r10     // Catch: java.lang.Throwable -> L3b
            r0.f128899c = r4     // Catch: java.lang.Throwable -> L3b
            r0.f128900d = r2     // Catch: java.lang.Throwable -> L3b
            r0.f128901e = r9     // Catch: java.lang.Throwable -> L3b
            r0.f128902f = r8     // Catch: java.lang.Throwable -> L3b
            r0.f128904h = r3     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r5 = r8.b(r0)     // Catch: java.lang.Throwable -> L3b
            if (r5 != r1) goto L72
            return r1
        L72:
            r7 = r5
            r5 = r10
            r10 = r7
        L75:
            r6 = 0
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L3b
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L3b
            if (r10 == 0) goto L93
            java.lang.Object r10 = r8.next()     // Catch: java.lang.Throwable -> L3b
            boolean r10 = kotlin.jvm.internal.f0.g(r5, r10)     // Catch: java.lang.Throwable -> L3b
            if (r10 == 0) goto L8c
            int r10 = r2.f124889b     // Catch: java.lang.Throwable -> L3b
            r4.f124889b = r10     // Catch: java.lang.Throwable -> L3b
        L8c:
            int r10 = r2.f124889b     // Catch: java.lang.Throwable -> L3b
            int r10 = r10 + r3
            r2.f124889b = r10     // Catch: java.lang.Throwable -> L3b
            r10 = r5
            goto L5f
        L93:
            kotlin.b2 r8 = kotlin.b2.f124493a     // Catch: java.lang.Throwable -> L3b
            kotlinx.coroutines.channels.o.b(r9, r6)
            int r8 = r4.f124889b
            java.lang.Integer r8 = kotlin.coroutines.jvm.internal.a.f(r8)
            return r8
        L9f:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        La3:
            throw r8     // Catch: java.lang.Throwable -> La4
        La4:
            r10 = move-exception
            kotlinx.coroutines.channels.o.b(r9, r8)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C(kotlinx.coroutines.channels.ReceiveChannel, java.lang.Object, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x008b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0097 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #2 {all -> 0x0037, blocks: (B:13:0x0033, B:39:0x008f, B:41:0x0097), top: B:55:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x008b -> B:39:0x008f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.k(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object D(kotlinx.coroutines.channels.ReceiveChannel r7, kotlin.coroutines.c r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1) r0
            int r1 = r0.f128909f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f128909f = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f128908e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.h()
            int r2 = r0.f128909f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L51
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r7 = r0.f128907d
            java.lang.Object r2 = r0.f128906c
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r4 = r0.f128905b
            kotlinx.coroutines.channels.ReceiveChannel r4 = (kotlinx.coroutines.channels.ReceiveChannel) r4
            kotlin.t0.n(r8)     // Catch: java.lang.Throwable -> L37
            goto L8f
        L37:
            r7 = move-exception
            r2 = r4
            goto La4
        L3b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L43:
            java.lang.Object r7 = r0.f128906c
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r2 = r0.f128905b
            kotlinx.coroutines.channels.ReceiveChannel r2 = (kotlinx.coroutines.channels.ReceiveChannel) r2
            kotlin.t0.n(r8)     // Catch: java.lang.Throwable -> L4f
            goto L69
        L4f:
            r7 = move-exception
            goto La4
        L51:
            kotlin.t0.n(r8)
            kotlinx.coroutines.channels.ChannelIterator r8 = r7.iterator()     // Catch: java.lang.Throwable -> La1
            r0.f128905b = r7     // Catch: java.lang.Throwable -> La1
            r0.f128906c = r8     // Catch: java.lang.Throwable -> La1
            r0.f128909f = r4     // Catch: java.lang.Throwable -> La1
            java.lang.Object r2 = r8.b(r0)     // Catch: java.lang.Throwable -> La1
            if (r2 != r1) goto L65
            return r1
        L65:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L69:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L4f
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L4f
            if (r8 != 0) goto L75
            kotlinx.coroutines.channels.o.b(r2, r5)
            return r5
        L75:
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L4f
            r6 = r2
            r2 = r7
            r7 = r6
        L7c:
            r0.f128905b = r7     // Catch: java.lang.Throwable -> La1
            r0.f128906c = r2     // Catch: java.lang.Throwable -> La1
            r0.f128907d = r8     // Catch: java.lang.Throwable -> La1
            r0.f128909f = r3     // Catch: java.lang.Throwable -> La1
            java.lang.Object r4 = r2.b(r0)     // Catch: java.lang.Throwable -> La1
            if (r4 != r1) goto L8b
            return r1
        L8b:
            r6 = r4
            r4 = r7
            r7 = r8
            r8 = r6
        L8f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L37
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r8 == 0) goto L9d
            java.lang.Object r8 = r2.next()     // Catch: java.lang.Throwable -> L37
            r7 = r4
            goto L7c
        L9d:
            kotlinx.coroutines.channels.o.b(r4, r5)
            return r7
        La1:
            r8 = move-exception
            r2 = r7
            r7 = r8
        La4:
            throw r7     // Catch: java.lang.Throwable -> La5
        La5:
            r8 = move-exception
            kotlinx.coroutines.channels.o.b(r2, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.D(kotlinx.coroutines.channels.ReceiveChannel, kotlin.coroutines.c):java.lang.Object");
    }

    @dl.d
    @r0
    public static final <E, R> ReceiveChannel<R> E(@dl.d ReceiveChannel<? extends E> receiveChannel, @dl.d CoroutineContext coroutineContext, @dl.d yh.p<? super E, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
        return ProduceKt.f(v1.f130503b, coroutineContext, 0, null, o.g(receiveChannel), new ChannelsKt__DeprecatedKt$map$1(receiveChannel, pVar, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel F(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, yh.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = e1.g();
        }
        return o.J(receiveChannel, coroutineContext, pVar);
    }

    @dl.d
    @r0
    public static final <E, R> ReceiveChannel<R> G(@dl.d ReceiveChannel<? extends E> receiveChannel, @dl.d CoroutineContext coroutineContext, @dl.d yh.q<? super Integer, ? super E, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar) {
        return ProduceKt.f(v1.f130503b, coroutineContext, 0, null, o.g(receiveChannel), new ChannelsKt__DeprecatedKt$mapIndexed$1(receiveChannel, qVar, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel H(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, yh.q qVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = e1.g();
        }
        return o.L(receiveChannel, coroutineContext, qVar);
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel I(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, yh.q qVar) {
        return o.y(o.L(receiveChannel, coroutineContext, qVar));
    }

    public static /* synthetic */ ReceiveChannel J(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, yh.q qVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = e1.g();
        }
        return I(receiveChannel, coroutineContext, qVar);
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel K(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, yh.p pVar) {
        return o.y(o.J(receiveChannel, coroutineContext, pVar));
    }

    public static /* synthetic */ ReceiveChannel L(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, yh.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = e1.g();
        }
        return K(receiveChannel, coroutineContext, pVar);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ac A[Catch: all -> 0x00bf, TRY_LEAVE, TryCatch #3 {all -> 0x00bf, blocks: (B:40:0x00a4, B:42:0x00ac, B:36:0x008f, B:26:0x0063), top: B:61:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00a0 -> B:15:0x003d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.k(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object M(kotlinx.coroutines.channels.ReceiveChannel r8, java.util.Comparator r9, kotlin.coroutines.c r10) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.M(kotlinx.coroutines.channels.ReceiveChannel, java.util.Comparator, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ac A[Catch: all -> 0x00bf, TRY_LEAVE, TryCatch #3 {all -> 0x00bf, blocks: (B:40:0x00a4, B:42:0x00ac, B:36:0x008f, B:26:0x0063), top: B:61:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00a0 -> B:15:0x003d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.k(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object N(kotlinx.coroutines.channels.ReceiveChannel r8, java.util.Comparator r9, kotlin.coroutines.c r10) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.N(kotlinx.coroutines.channels.ReceiveChannel, java.util.Comparator, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object O(ReceiveChannel receiveChannel, kotlin.coroutines.c cVar) throws Throwable {
        ChannelsKt__DeprecatedKt$none$1 channelsKt__DeprecatedKt$none$1;
        if (cVar instanceof ChannelsKt__DeprecatedKt$none$1) {
            channelsKt__DeprecatedKt$none$1 = (ChannelsKt__DeprecatedKt$none$1) cVar;
            int i10 = channelsKt__DeprecatedKt$none$1.f128939d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$none$1.f128939d = i10 - Integer.MIN_VALUE;
            } else {
                channelsKt__DeprecatedKt$none$1 = new ChannelsKt__DeprecatedKt$none$1(cVar);
            }
        } else {
            channelsKt__DeprecatedKt$none$1 = new ChannelsKt__DeprecatedKt$none$1(cVar);
        }
        Object objB = channelsKt__DeprecatedKt$none$1.f128938c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = channelsKt__DeprecatedKt$none$1.f128939d;
        boolean z10 = true;
        try {
            if (i11 == 0) {
                t0.n(objB);
                ChannelIterator it = receiveChannel.iterator();
                channelsKt__DeprecatedKt$none$1.f128937b = receiveChannel;
                channelsKt__DeprecatedKt$none$1.f128939d = 1;
                objB = it.b(channelsKt__DeprecatedKt$none$1);
                if (objB == objH) {
                    return objH;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                receiveChannel = (ReceiveChannel) channelsKt__DeprecatedKt$none$1.f128937b;
                t0.n(objB);
            }
            if (((Boolean) objB).booleanValue()) {
                z10 = false;
            }
            Boolean boolA = kotlin.coroutines.jvm.internal.a.a(z10);
            o.b(receiveChannel, null);
            return boolA;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                o.b(receiveChannel, th2);
                throw th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006c A[Catch: all -> 0x004a, TRY_LEAVE, TryCatch #2 {all -> 0x004a, blocks: (B:20:0x0046, B:29:0x0064, B:31:0x006c, B:42:0x0096, B:43:0x009d), top: B:54:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x007c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x007d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0096 A[Catch: all -> 0x004a, TRY_ENTER, TryCatch #2 {all -> 0x004a, blocks: (B:20:0x0046, B:29:0x0064, B:31:0x006c, B:42:0x0096, B:43:0x009d), top: B:54:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object Q(ReceiveChannel receiveChannel, kotlin.coroutines.c cVar) throws Throwable {
        ChannelsKt__DeprecatedKt$single$1 channelsKt__DeprecatedKt$single$1;
        ReceiveChannel receiveChannel2;
        Throwable th2;
        ChannelIterator channelIterator;
        Object next;
        Object objB;
        ReceiveChannel receiveChannel3;
        Object obj;
        if (cVar instanceof ChannelsKt__DeprecatedKt$single$1) {
            channelsKt__DeprecatedKt$single$1 = (ChannelsKt__DeprecatedKt$single$1) cVar;
            int i10 = channelsKt__DeprecatedKt$single$1.f128946e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$single$1.f128946e = i10 - Integer.MIN_VALUE;
            } else {
                channelsKt__DeprecatedKt$single$1 = new ChannelsKt__DeprecatedKt$single$1(cVar);
            }
        } else {
            channelsKt__DeprecatedKt$single$1 = new ChannelsKt__DeprecatedKt$single$1(cVar);
        }
        Object obj2 = channelsKt__DeprecatedKt$single$1.f128945d;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = channelsKt__DeprecatedKt$single$1.f128946e;
        if (i11 == 0) {
            t0.n(obj2);
            try {
                ChannelIterator it = receiveChannel.iterator();
                channelsKt__DeprecatedKt$single$1.f128943b = receiveChannel;
                channelsKt__DeprecatedKt$single$1.f128944c = it;
                channelsKt__DeprecatedKt$single$1.f128946e = 1;
                Object objB2 = it.b(channelsKt__DeprecatedKt$single$1);
                if (objB2 == objH) {
                    return objH;
                }
                receiveChannel2 = receiveChannel;
                channelIterator = it;
                obj2 = objB2;
                if (((Boolean) obj2).booleanValue()) {
                    throw new NoSuchElementException("ReceiveChannel is empty.");
                }
                next = channelIterator.next();
                channelsKt__DeprecatedKt$single$1.f128943b = receiveChannel2;
                channelsKt__DeprecatedKt$single$1.f128944c = next;
                channelsKt__DeprecatedKt$single$1.f128946e = 2;
                objB = channelIterator.b(channelsKt__DeprecatedKt$single$1);
                if (objB == objH) {
                    return objH;
                }
                receiveChannel3 = receiveChannel2;
                obj2 = objB;
                obj = next;
            } catch (Throwable th3) {
                receiveChannel2 = receiveChannel;
                th2 = th3;
                throw th2;
            }
        } else if (i11 == 1) {
            channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$single$1.f128944c;
            receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$single$1.f128943b;
            try {
                t0.n(obj2);
                if (((Boolean) obj2).booleanValue()) {
                    throw new NoSuchElementException("ReceiveChannel is empty.");
                }
                next = channelIterator.next();
                channelsKt__DeprecatedKt$single$1.f128943b = receiveChannel2;
                channelsKt__DeprecatedKt$single$1.f128944c = next;
                channelsKt__DeprecatedKt$single$1.f128946e = 2;
                objB = channelIterator.b(channelsKt__DeprecatedKt$single$1);
                if (objB == objH) {
                    return objH;
                }
                receiveChannel3 = receiveChannel2;
                obj2 = objB;
                obj = next;
            } catch (Throwable th4) {
                th2 = th4;
                throw th2;
            }
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = channelsKt__DeprecatedKt$single$1.f128944c;
            receiveChannel3 = (ReceiveChannel) channelsKt__DeprecatedKt$single$1.f128943b;
            try {
                t0.n(obj2);
            } catch (Throwable th5) {
                th2 = th5;
                receiveChannel2 = receiveChannel3;
                try {
                    throw th2;
                } catch (Throwable th6) {
                    o.b(receiveChannel2, th2);
                    throw th6;
                }
            }
        }
        if (((Boolean) obj2).booleanValue()) {
            throw new IllegalArgumentException("ReceiveChannel has more than one element.");
        }
        o.b(receiveChannel3, null);
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0092  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object R(ReceiveChannel receiveChannel, kotlin.coroutines.c cVar) throws Throwable {
        ChannelsKt__DeprecatedKt$singleOrNull$1 channelsKt__DeprecatedKt$singleOrNull$1;
        ReceiveChannel receiveChannel2;
        Throwable th2;
        ChannelIterator channelIterator;
        ReceiveChannel receiveChannel3;
        Object obj;
        if (cVar instanceof ChannelsKt__DeprecatedKt$singleOrNull$1) {
            channelsKt__DeprecatedKt$singleOrNull$1 = (ChannelsKt__DeprecatedKt$singleOrNull$1) cVar;
            int i10 = channelsKt__DeprecatedKt$singleOrNull$1.f128950e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$singleOrNull$1.f128950e = i10 - Integer.MIN_VALUE;
            } else {
                channelsKt__DeprecatedKt$singleOrNull$1 = new ChannelsKt__DeprecatedKt$singleOrNull$1(cVar);
            }
        } else {
            channelsKt__DeprecatedKt$singleOrNull$1 = new ChannelsKt__DeprecatedKt$singleOrNull$1(cVar);
        }
        Object obj2 = channelsKt__DeprecatedKt$singleOrNull$1.f128949d;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = channelsKt__DeprecatedKt$singleOrNull$1.f128950e;
        if (i11 == 0) {
            t0.n(obj2);
            try {
                ChannelIterator it = receiveChannel.iterator();
                channelsKt__DeprecatedKt$singleOrNull$1.f128947b = receiveChannel;
                channelsKt__DeprecatedKt$singleOrNull$1.f128948c = it;
                channelsKt__DeprecatedKt$singleOrNull$1.f128950e = 1;
                Object objB = it.b(channelsKt__DeprecatedKt$singleOrNull$1);
                if (objB == objH) {
                    return objH;
                }
                receiveChannel2 = receiveChannel;
                channelIterator = it;
                obj2 = objB;
            } catch (Throwable th3) {
                receiveChannel2 = receiveChannel;
                th2 = th3;
                throw th2;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = channelsKt__DeprecatedKt$singleOrNull$1.f128948c;
                receiveChannel3 = (ReceiveChannel) channelsKt__DeprecatedKt$singleOrNull$1.f128947b;
                try {
                    t0.n(obj2);
                    if (((Boolean) obj2).booleanValue()) {
                        o.b(receiveChannel3, null);
                        return null;
                    }
                    o.b(receiveChannel3, null);
                    return obj;
                } catch (Throwable th4) {
                    th2 = th4;
                    receiveChannel2 = receiveChannel3;
                    try {
                        throw th2;
                    } catch (Throwable th5) {
                        o.b(receiveChannel2, th2);
                        throw th5;
                    }
                }
            }
            channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$singleOrNull$1.f128948c;
            receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$singleOrNull$1.f128947b;
            try {
                t0.n(obj2);
            } catch (Throwable th6) {
                th2 = th6;
                throw th2;
            }
        }
        if (!((Boolean) obj2).booleanValue()) {
            o.b(receiveChannel2, null);
            return null;
        }
        Object next = channelIterator.next();
        channelsKt__DeprecatedKt$singleOrNull$1.f128947b = receiveChannel2;
        channelsKt__DeprecatedKt$singleOrNull$1.f128948c = next;
        channelsKt__DeprecatedKt$singleOrNull$1.f128950e = 2;
        Object objB2 = channelIterator.b(channelsKt__DeprecatedKt$singleOrNull$1);
        if (objB2 == objH) {
            return objH;
        }
        receiveChannel3 = receiveChannel2;
        obj2 = objB2;
        obj = next;
        if (((Boolean) obj2).booleanValue()) {
            o.b(receiveChannel3, null);
            return null;
        }
        o.b(receiveChannel3, null);
        return obj;
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel S(ReceiveChannel receiveChannel, int i10, CoroutineContext coroutineContext) {
        return ProduceKt.f(v1.f130503b, coroutineContext, 0, null, o.g(receiveChannel), new ChannelsKt__DeprecatedKt$take$1(i10, receiveChannel, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel T(ReceiveChannel receiveChannel, int i10, CoroutineContext coroutineContext, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            coroutineContext = e1.g();
        }
        return S(receiveChannel, i10, coroutineContext);
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel U(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, yh.p pVar) {
        return ProduceKt.f(v1.f130503b, coroutineContext, 0, null, o.g(receiveChannel), new ChannelsKt__DeprecatedKt$takeWhile$1(receiveChannel, pVar, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel V(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, yh.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = e1.g();
        }
        return U(receiveChannel, coroutineContext, pVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0079 A[Catch: all -> 0x0053, TryCatch #1 {all -> 0x0053, blocks: (B:13:0x0034, B:29:0x0071, B:31:0x0079, B:34:0x008c, B:18:0x004f), top: B:45:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x008b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlinx.coroutines.channels.b0] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r8v0, types: [C extends kotlinx.coroutines.channels.b0<? super E>] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v2, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0089 -> B:14:0x0037). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.r0
    @dl.e
    public static final <E, C extends kotlinx.coroutines.channels.b0<? super E>> java.lang.Object W(@dl.d kotlinx.coroutines.channels.ReceiveChannel<? extends E> r7, @dl.d C r8, @dl.d kotlin.coroutines.c<? super C> r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1) r0
            int r1 = r0.f128967f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f128967f = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f128966e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.h()
            int r2 = r0.f128967f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L55
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r7 = r0.f128965d
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r8 = r0.f128964c
            kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
            java.lang.Object r2 = r0.f128963b
            kotlinx.coroutines.channels.b0 r2 = (kotlinx.coroutines.channels.b0) r2
            kotlin.t0.n(r9)     // Catch: java.lang.Throwable -> L53
        L37:
            r9 = r7
            r7 = r8
            r8 = r2
            goto L5c
        L3b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L43:
            java.lang.Object r7 = r0.f128965d
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r8 = r0.f128964c
            kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
            java.lang.Object r2 = r0.f128963b
            kotlinx.coroutines.channels.b0 r2 = (kotlinx.coroutines.channels.b0) r2
            kotlin.t0.n(r9)     // Catch: java.lang.Throwable -> L53
            goto L70
        L53:
            r7 = move-exception
            goto L96
        L55:
            kotlin.t0.n(r9)
            kotlinx.coroutines.channels.ChannelIterator r9 = r7.iterator()     // Catch: java.lang.Throwable -> L92
        L5c:
            r0.f128963b = r8     // Catch: java.lang.Throwable -> L92
            r0.f128964c = r7     // Catch: java.lang.Throwable -> L92
            r0.f128965d = r9     // Catch: java.lang.Throwable -> L92
            r0.f128967f = r4     // Catch: java.lang.Throwable -> L92
            java.lang.Object r2 = r9.b(r0)     // Catch: java.lang.Throwable -> L92
            if (r2 != r1) goto L6b
            return r1
        L6b:
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r2
            r2 = r6
        L70:
            r5 = 0
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L53
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L53
            if (r9 == 0) goto L8c
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L53
            r0.f128963b = r2     // Catch: java.lang.Throwable -> L53
            r0.f128964c = r8     // Catch: java.lang.Throwable -> L53
            r0.f128965d = r7     // Catch: java.lang.Throwable -> L53
            r0.f128967f = r3     // Catch: java.lang.Throwable -> L53
            java.lang.Object r9 = r2.X(r9, r0)     // Catch: java.lang.Throwable -> L53
            if (r9 != r1) goto L37
            return r1
        L8c:
            kotlin.b2 r7 = kotlin.b2.f124493a     // Catch: java.lang.Throwable -> L53
            kotlinx.coroutines.channels.o.b(r8, r5)
            return r2
        L92:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L96:
            throw r7     // Catch: java.lang.Throwable -> L97
        L97:
            r9 = move-exception
            kotlinx.coroutines.channels.o.b(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.W(kotlinx.coroutines.channels.ReceiveChannel, kotlinx.coroutines.channels.b0, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0058 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    /* JADX WARN: Code duplicated, block: B:27:0x0065 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:12:0x0031, B:25:0x005c, B:27:0x0065, B:21:0x004a, B:28:0x006e), top: B:39:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0059 -> B:25:0x005c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.r0
    @dl.e
    public static final <E, C extends java.util.Collection<? super E>> java.lang.Object X(@dl.d kotlinx.coroutines.channels.ReceiveChannel<? extends E> r6, @dl.d C r7, @dl.d kotlin.coroutines.c<? super C> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1) r0
            int r1 = r0.f128972f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f128972f = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f128971e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.h()
            int r2 = r0.f128972f
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r6 = r0.f128970d
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.f128969c
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r2 = r0.f128968b
            java.util.Collection r2 = (java.util.Collection) r2
            kotlin.t0.n(r8)     // Catch: java.lang.Throwable -> L35
            goto L5c
        L35:
            r6 = move-exception
            goto L78
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3f:
            kotlin.t0.n(r8)
            kotlinx.coroutines.channels.ChannelIterator r8 = r6.iterator()     // Catch: java.lang.Throwable -> L74
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L4a:
            r0.f128968b = r8     // Catch: java.lang.Throwable -> L35
            r0.f128969c = r7     // Catch: java.lang.Throwable -> L35
            r0.f128970d = r6     // Catch: java.lang.Throwable -> L35
            r0.f128972f = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r6.b(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L59
            return r1
        L59:
            r5 = r2
            r2 = r8
            r8 = r5
        L5c:
            r4 = 0
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L35
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r8 == 0) goto L6e
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L35
            r2.add(r8)     // Catch: java.lang.Throwable -> L35
            r8 = r2
            goto L4a
        L6e:
            kotlin.b2 r6 = kotlin.b2.f124493a     // Catch: java.lang.Throwable -> L35
            kotlinx.coroutines.channels.o.b(r7, r4)
            return r2
        L74:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L78:
            throw r6     // Catch: java.lang.Throwable -> L79
        L79:
            r8 = move-exception
            kotlinx.coroutines.channels.o.b(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.X(kotlinx.coroutines.channels.ReceiveChannel, java.util.Collection, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0058 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    /* JADX WARN: Code duplicated, block: B:27:0x0065 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:12:0x0031, B:25:0x005c, B:27:0x0065, B:21:0x004a, B:28:0x0078), top: B:39:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0059 -> B:25:0x005c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.r0
    @dl.e
    public static final <K, V, M extends java.util.Map<? super K, ? super V>> java.lang.Object Y(@dl.d kotlinx.coroutines.channels.ReceiveChannel<? extends kotlin.Pair<? extends K, ? extends V>> r6, @dl.d M r7, @dl.d kotlin.coroutines.c<? super M> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2) r0
            int r1 = r0.f128977f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f128977f = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f128976e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.h()
            int r2 = r0.f128977f
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r6 = r0.f128975d
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.f128974c
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r2 = r0.f128973b
            java.util.Map r2 = (java.util.Map) r2
            kotlin.t0.n(r8)     // Catch: java.lang.Throwable -> L35
            goto L5c
        L35:
            r6 = move-exception
            goto L82
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3f:
            kotlin.t0.n(r8)
            kotlinx.coroutines.channels.ChannelIterator r8 = r6.iterator()     // Catch: java.lang.Throwable -> L7e
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L4a:
            r0.f128973b = r8     // Catch: java.lang.Throwable -> L35
            r0.f128974c = r7     // Catch: java.lang.Throwable -> L35
            r0.f128975d = r6     // Catch: java.lang.Throwable -> L35
            r0.f128977f = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r6.b(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L59
            return r1
        L59:
            r5 = r2
            r2 = r8
            r8 = r5
        L5c:
            r4 = 0
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L35
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r8 == 0) goto L78
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L35
            kotlin.Pair r8 = (kotlin.Pair) r8     // Catch: java.lang.Throwable -> L35
            java.lang.Object r4 = r8.e()     // Catch: java.lang.Throwable -> L35
            java.lang.Object r8 = r8.f()     // Catch: java.lang.Throwable -> L35
            r2.put(r4, r8)     // Catch: java.lang.Throwable -> L35
            r8 = r2
            goto L4a
        L78:
            kotlin.b2 r6 = kotlin.b2.f124493a     // Catch: java.lang.Throwable -> L35
            kotlinx.coroutines.channels.o.b(r7, r4)
            return r2
        L7e:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L82:
            throw r6     // Catch: java.lang.Throwable -> L83
        L83:
            r8 = move-exception
            kotlinx.coroutines.channels.o.b(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.Y(kotlinx.coroutines.channels.ReceiveChannel, java.util.Map, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object a(ReceiveChannel receiveChannel, kotlin.coroutines.c cVar) throws Throwable {
        ChannelsKt__DeprecatedKt$any$1 channelsKt__DeprecatedKt$any$1;
        if (cVar instanceof ChannelsKt__DeprecatedKt$any$1) {
            channelsKt__DeprecatedKt$any$1 = (ChannelsKt__DeprecatedKt$any$1) cVar;
            int i10 = channelsKt__DeprecatedKt$any$1.f128805d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$any$1.f128805d = i10 - Integer.MIN_VALUE;
            } else {
                channelsKt__DeprecatedKt$any$1 = new ChannelsKt__DeprecatedKt$any$1(cVar);
            }
        } else {
            channelsKt__DeprecatedKt$any$1 = new ChannelsKt__DeprecatedKt$any$1(cVar);
        }
        Object objB = channelsKt__DeprecatedKt$any$1.f128804c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = channelsKt__DeprecatedKt$any$1.f128805d;
        try {
            if (i11 == 0) {
                t0.n(objB);
                ChannelIterator it = receiveChannel.iterator();
                channelsKt__DeprecatedKt$any$1.f128803b = receiveChannel;
                channelsKt__DeprecatedKt$any$1.f128805d = 1;
                objB = it.b(channelsKt__DeprecatedKt$any$1);
                if (objB == objH) {
                    return objH;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                receiveChannel = (ReceiveChannel) channelsKt__DeprecatedKt$any$1.f128803b;
                t0.n(objB);
            }
            o.b(receiveChannel, null);
            return objB;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                o.b(receiveChannel, th2);
                throw th3;
            }
        }
    }

    @dl.d
    @r0
    public static final yh.l<Throwable, b2> b(@dl.d final ReceiveChannel<?> receiveChannel) {
        return new yh.l<Throwable, b2>() { // from class: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumes$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
                invoke2(th2);
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@dl.e Throwable th2) {
                o.b(receiveChannel, th2);
            }
        };
    }

    @r0
    @dl.e
    public static final <E> Object b0(@dl.d ReceiveChannel<? extends E> receiveChannel, @dl.d kotlin.coroutines.c<? super Set<E>> cVar) {
        return o.f0(receiveChannel, new LinkedHashSet(), cVar);
    }

    @dl.d
    @r0
    public static final yh.l<Throwable, b2> c(@dl.d final ReceiveChannel<?>... receiveChannelArr) {
        return new yh.l<Throwable, b2>() { // from class: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumesAll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) throws Throwable {
                invoke2(th2);
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@dl.e Throwable th2) throws Throwable {
                Throwable th3 = null;
                for (ReceiveChannel<?> receiveChannel : receiveChannelArr) {
                    try {
                        o.b(receiveChannel, th2);
                    } catch (Throwable th4) {
                        if (th3 == null) {
                            th3 = th4;
                        } else {
                            kotlin.o.a(th3, th4);
                        }
                    }
                }
                if (th3 != null) {
                    throw th3;
                }
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x005d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0069 A[Catch: all -> 0x0035, TryCatch #1 {, blocks: (B:12:0x0031, B:26:0x0061, B:28:0x0069, B:29:0x0073), top: B:42:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005d -> B:25:0x0060). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.k(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object d(kotlinx.coroutines.channels.ReceiveChannel r7, kotlin.coroutines.c r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1) r0
            int r1 = r0.f128812f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f128812f = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f128811e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.h()
            int r2 = r0.f128812f
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r7 = r0.f128810d
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r2 = r0.f128809c
            kotlinx.coroutines.channels.ReceiveChannel r2 = (kotlinx.coroutines.channels.ReceiveChannel) r2
            java.lang.Object r4 = r0.f128808b
            kotlin.jvm.internal.Ref$IntRef r4 = (kotlin.jvm.internal.Ref.IntRef) r4
            kotlin.t0.n(r8)     // Catch: java.lang.Throwable -> L35
            goto L60
        L35:
            r7 = move-exception
            goto L85
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            kotlin.t0.n(r8)
            kotlin.jvm.internal.Ref$IntRef r8 = new kotlin.jvm.internal.Ref$IntRef
            r8.<init>()
            kotlinx.coroutines.channels.ChannelIterator r2 = r7.iterator()     // Catch: java.lang.Throwable -> L82
            r4 = r8
            r8 = r7
            r7 = r2
        L4e:
            r0.f128808b = r4     // Catch: java.lang.Throwable -> L7f
            r0.f128809c = r8     // Catch: java.lang.Throwable -> L7f
            r0.f128810d = r7     // Catch: java.lang.Throwable -> L7f
            r0.f128812f = r3     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r2 = r7.b(r0)     // Catch: java.lang.Throwable -> L7f
            if (r2 != r1) goto L5d
            return r1
        L5d:
            r6 = r2
            r2 = r8
            r8 = r6
        L60:
            r5 = 0
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L35
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r8 == 0) goto L73
            r7.next()     // Catch: java.lang.Throwable -> L35
            int r8 = r4.f124889b     // Catch: java.lang.Throwable -> L35
            int r8 = r8 + r3
            r4.f124889b = r8     // Catch: java.lang.Throwable -> L35
            r8 = r2
            goto L4e
        L73:
            kotlin.b2 r7 = kotlin.b2.f124493a     // Catch: java.lang.Throwable -> L35
            kotlinx.coroutines.channels.o.b(r2, r5)
            int r7 = r4.f124889b
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.a.f(r7)
            return r7
        L7f:
            r7 = move-exception
            r2 = r8
            goto L85
        L82:
            r8 = move-exception
            r2 = r7
            r7 = r8
        L85:
            throw r7     // Catch: java.lang.Throwable -> L86
        L86:
            r8 = move-exception
            kotlinx.coroutines.channels.o.b(r2, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.d(kotlinx.coroutines.channels.ReceiveChannel, kotlin.coroutines.c):java.lang.Object");
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel d0(ReceiveChannel receiveChannel, CoroutineContext coroutineContext) {
        return ProduceKt.f(v1.f130503b, coroutineContext, 0, null, o.g(receiveChannel), new ChannelsKt__DeprecatedKt$withIndex$1(receiveChannel, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel e0(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = e1.g();
        }
        return d0(receiveChannel, coroutineContext);
    }

    @dl.d
    @r0
    public static final <E, K> ReceiveChannel<E> f(@dl.d ReceiveChannel<? extends E> receiveChannel, @dl.d CoroutineContext coroutineContext, @dl.d yh.p<? super E, ? super kotlin.coroutines.c<? super K>, ? extends Object> pVar) {
        return ProduceKt.f(v1.f130503b, coroutineContext, 0, null, o.g(receiveChannel), new ChannelsKt__DeprecatedKt$distinctBy$1(receiveChannel, pVar, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel g(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, yh.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = e1.g();
        }
        return o.k(receiveChannel, coroutineContext, pVar);
    }

    @dl.d
    @r0
    public static final <E, R, V> ReceiveChannel<V> g0(@dl.d ReceiveChannel<? extends E> receiveChannel, @dl.d ReceiveChannel<? extends R> receiveChannel2, @dl.d CoroutineContext coroutineContext, @dl.d yh.p<? super E, ? super R, ? extends V> pVar) {
        return ProduceKt.f(v1.f130503b, coroutineContext, 0, null, o.h(receiveChannel, receiveChannel2), new ChannelsKt__DeprecatedKt$zip$2(receiveChannel2, receiveChannel, pVar, null), 6, null);
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel h(ReceiveChannel receiveChannel, int i10, CoroutineContext coroutineContext) {
        return ProduceKt.f(v1.f130503b, coroutineContext, 0, null, o.g(receiveChannel), new ChannelsKt__DeprecatedKt$drop$1(i10, receiveChannel, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel h0(ReceiveChannel receiveChannel, ReceiveChannel receiveChannel2, CoroutineContext coroutineContext, yh.p pVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            coroutineContext = e1.g();
        }
        return o.q0(receiveChannel, receiveChannel2, coroutineContext, pVar);
    }

    public static /* synthetic */ ReceiveChannel i(ReceiveChannel receiveChannel, int i10, CoroutineContext coroutineContext, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            coroutineContext = e1.g();
        }
        return h(receiveChannel, i10, coroutineContext);
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel j(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, yh.p pVar) {
        return ProduceKt.f(v1.f130503b, coroutineContext, 0, null, o.g(receiveChannel), new ChannelsKt__DeprecatedKt$dropWhile$1(receiveChannel, pVar, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel k(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, yh.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = e1.g();
        }
        return j(receiveChannel, coroutineContext, pVar);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    /* JADX WARN: Code duplicated, block: B:29:0x006c A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #2 {all -> 0x0039, blocks: (B:12:0x0035, B:27:0x0064, B:29:0x006c, B:35:0x007b, B:36:0x0092), top: B:48:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    /* JADX WARN: Code duplicated, block: B:34:0x0078  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x005f -> B:26:0x0063). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.k(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object l(kotlinx.coroutines.channels.ReceiveChannel r10, int r11, kotlin.coroutines.c r12) {
        /*
            boolean r0 = r12 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1
            if (r0 == 0) goto L13
            r0 = r12
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1) r0
            int r1 = r0.f128839g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f128839g = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f128838f
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.h()
            int r2 = r0.f128839g
            r3 = 46
            java.lang.String r4 = "ReceiveChannel doesn't contain element at index "
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 != r5) goto L3c
            int r10 = r0.f128835c
            int r11 = r0.f128834b
            java.lang.Object r2 = r0.f128837e
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r6 = r0.f128836d
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            kotlin.t0.n(r12)     // Catch: java.lang.Throwable -> L39
            goto L63
        L39:
            r10 = move-exception
            goto Laf
        L3c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L44:
            kotlin.t0.n(r12)
            if (r11 < 0) goto L97
            r12 = 0
            kotlinx.coroutines.channels.ChannelIterator r2 = r10.iterator()     // Catch: java.lang.Throwable -> L93
        L4e:
            r0.f128836d = r10     // Catch: java.lang.Throwable -> L93
            r0.f128837e = r2     // Catch: java.lang.Throwable -> L93
            r0.f128834b = r11     // Catch: java.lang.Throwable -> L93
            r0.f128835c = r12     // Catch: java.lang.Throwable -> L93
            r0.f128839g = r5     // Catch: java.lang.Throwable -> L93
            java.lang.Object r6 = r2.b(r0)     // Catch: java.lang.Throwable -> L93
            if (r6 != r1) goto L5f
            return r1
        L5f:
            r9 = r6
            r6 = r10
            r10 = r12
            r12 = r9
        L63:
            r7 = 0
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> L39
            boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> L39
            if (r12 == 0) goto L7b
            java.lang.Object r12 = r2.next()     // Catch: java.lang.Throwable -> L39
            int r8 = r10 + 1
            if (r11 != r10) goto L78
            kotlinx.coroutines.channels.o.b(r6, r7)
            return r12
        L78:
            r10 = r6
            r12 = r8
            goto L4e
        L7b:
            java.lang.IndexOutOfBoundsException r10 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> L39
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
            r12.<init>()     // Catch: java.lang.Throwable -> L39
            r12.append(r4)     // Catch: java.lang.Throwable -> L39
            r12.append(r11)     // Catch: java.lang.Throwable -> L39
            r12.append(r3)     // Catch: java.lang.Throwable -> L39
            java.lang.String r11 = r12.toString()     // Catch: java.lang.Throwable -> L39
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L39
            throw r10     // Catch: java.lang.Throwable -> L39
        L93:
            r11 = move-exception
            r6 = r10
            r10 = r11
            goto Laf
        L97:
            java.lang.IndexOutOfBoundsException r12 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> L93
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L93
            r0.<init>()     // Catch: java.lang.Throwable -> L93
            r0.append(r4)     // Catch: java.lang.Throwable -> L93
            r0.append(r11)     // Catch: java.lang.Throwable -> L93
            r0.append(r3)     // Catch: java.lang.Throwable -> L93
            java.lang.String r11 = r0.toString()     // Catch: java.lang.Throwable -> L93
            r12.<init>(r11)     // Catch: java.lang.Throwable -> L93
            throw r12     // Catch: java.lang.Throwable -> L93
        Laf:
            throw r10     // Catch: java.lang.Throwable -> Lb0
        Lb0:
            r11 = move-exception
            kotlinx.coroutines.channels.o.b(r6, r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.l(kotlinx.coroutines.channels.ReceiveChannel, int, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0062 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x006b A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #2 {all -> 0x007d, blocks: (B:27:0x0063, B:29:0x006b, B:24:0x0052, B:23:0x004e), top: B:47:0x004e }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0073  */
    /* JADX WARN: Code duplicated, block: B:34:0x0077  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0060 -> B:27:0x0063). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.k(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object m(kotlinx.coroutines.channels.ReceiveChannel r8, int r9, kotlin.coroutines.c r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1) r0
            int r1 = r0.f128845g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f128845g = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f128844f
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.h()
            int r2 = r0.f128845g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L44
            if (r2 != r3) goto L3c
            int r8 = r0.f128841c
            int r9 = r0.f128840b
            java.lang.Object r2 = r0.f128843e
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r5 = r0.f128842d
            kotlinx.coroutines.channels.ReceiveChannel r5 = (kotlinx.coroutines.channels.ReceiveChannel) r5
            kotlin.t0.n(r10)     // Catch: java.lang.Throwable -> L3a
            r7 = r10
            r10 = r8
            r8 = r5
            r5 = r7
            goto L63
        L3a:
            r8 = move-exception
            goto L80
        L3c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L44:
            kotlin.t0.n(r10)
            if (r9 >= 0) goto L4d
            kotlinx.coroutines.channels.o.b(r8, r4)
            return r4
        L4d:
            r10 = 0
            kotlinx.coroutines.channels.ChannelIterator r2 = r8.iterator()     // Catch: java.lang.Throwable -> L7d
        L52:
            r0.f128842d = r8     // Catch: java.lang.Throwable -> L7d
            r0.f128843e = r2     // Catch: java.lang.Throwable -> L7d
            r0.f128840b = r9     // Catch: java.lang.Throwable -> L7d
            r0.f128841c = r10     // Catch: java.lang.Throwable -> L7d
            r0.f128845g = r3     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r5 = r2.b(r0)     // Catch: java.lang.Throwable -> L7d
            if (r5 != r1) goto L63
            return r1
        L63:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L7d
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L7d
            if (r5 == 0) goto L79
            java.lang.Object r5 = r2.next()     // Catch: java.lang.Throwable -> L7d
            int r6 = r10 + 1
            if (r9 != r10) goto L77
            kotlinx.coroutines.channels.o.b(r8, r4)
            return r5
        L77:
            r10 = r6
            goto L52
        L79:
            kotlinx.coroutines.channels.o.b(r8, r4)
            return r4
        L7d:
            r9 = move-exception
            r5 = r8
            r8 = r9
        L80:
            throw r8     // Catch: java.lang.Throwable -> L81
        L81:
            r9 = move-exception
            kotlinx.coroutines.channels.o.b(r5, r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.m(kotlinx.coroutines.channels.ReceiveChannel, int, kotlin.coroutines.c):java.lang.Object");
    }

    @dl.d
    @r0
    public static final <E> ReceiveChannel<E> n(@dl.d ReceiveChannel<? extends E> receiveChannel, @dl.d CoroutineContext coroutineContext, @dl.d yh.p<? super E, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar) {
        return ProduceKt.f(v1.f130503b, coroutineContext, 0, null, o.g(receiveChannel), new ChannelsKt__DeprecatedKt$filter$1(receiveChannel, pVar, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel o(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, yh.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = e1.g();
        }
        return o.s(receiveChannel, coroutineContext, pVar);
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel p(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, yh.q qVar) {
        return ProduceKt.f(v1.f130503b, coroutineContext, 0, null, o.g(receiveChannel), new ChannelsKt__DeprecatedKt$filterIndexed$1(receiveChannel, qVar, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel q(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, yh.q qVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = e1.g();
        }
        return p(receiveChannel, coroutineContext, qVar);
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel r(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, yh.p pVar) {
        return o.s(receiveChannel, coroutineContext, new ChannelsKt__DeprecatedKt$filterNot$1(pVar, null));
    }

    public static /* synthetic */ ReceiveChannel s(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, yh.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = e1.g();
        }
        return r(receiveChannel, coroutineContext, pVar);
    }

    @dl.d
    @r0
    public static final <E> ReceiveChannel<E> t(@dl.d ReceiveChannel<? extends E> receiveChannel) {
        return o(receiveChannel, null, new ChannelsKt__DeprecatedKt$filterNotNull$1(null), 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0058 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    /* JADX WARN: Code duplicated, block: B:27:0x0065 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x0031, B:25:0x005c, B:27:0x0065, B:29:0x006b, B:21:0x004a, B:31:0x0070), top: B:40:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x006b A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x0031, B:25:0x005c, B:27:0x0065, B:29:0x006b, B:21:0x004a, B:31:0x0070), top: B:40:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0070 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x0031, B:25:0x005c, B:27:0x0065, B:29:0x006b, B:21:0x004a, B:31:0x0070), top: B:40:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0059 -> B:25:0x005c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.k(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object u(kotlinx.coroutines.channels.ReceiveChannel r6, java.util.Collection r7, kotlin.coroutines.c r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1) r0
            int r1 = r0.f128868f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f128868f = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f128867e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.h()
            int r2 = r0.f128868f
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r6 = r0.f128866d
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.f128865c
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r2 = r0.f128864b
            java.util.Collection r2 = (java.util.Collection) r2
            kotlin.t0.n(r8)     // Catch: java.lang.Throwable -> L35
            goto L5c
        L35:
            r6 = move-exception
            goto L7a
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3f:
            kotlin.t0.n(r8)
            kotlinx.coroutines.channels.ChannelIterator r8 = r6.iterator()     // Catch: java.lang.Throwable -> L76
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L4a:
            r0.f128864b = r8     // Catch: java.lang.Throwable -> L35
            r0.f128865c = r7     // Catch: java.lang.Throwable -> L35
            r0.f128866d = r6     // Catch: java.lang.Throwable -> L35
            r0.f128868f = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r6.b(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L59
            return r1
        L59:
            r5 = r2
            r2 = r8
            r8 = r5
        L5c:
            r4 = 0
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L35
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r8 == 0) goto L70
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L35
            if (r8 == 0) goto L6e
            r2.add(r8)     // Catch: java.lang.Throwable -> L35
        L6e:
            r8 = r2
            goto L4a
        L70:
            kotlin.b2 r6 = kotlin.b2.f124493a     // Catch: java.lang.Throwable -> L35
            kotlinx.coroutines.channels.o.b(r7, r4)
            return r2
        L76:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L7a:
            throw r6     // Catch: java.lang.Throwable -> L7b
        L7b:
            r8 = move-exception
            kotlinx.coroutines.channels.o.b(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.u(kotlinx.coroutines.channels.ReceiveChannel, java.util.Collection, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0070 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:31:0x007e A[Catch: all -> 0x009d, TryCatch #2 {all -> 0x009d, blocks: (B:25:0x0062, B:29:0x0075, B:31:0x007e, B:33:0x0084, B:37:0x0097, B:24:0x005e), top: B:49:0x005e }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0084 A[Catch: all -> 0x009d, TryCatch #2 {all -> 0x009d, blocks: (B:25:0x0062, B:29:0x0075, B:31:0x007e, B:33:0x0084, B:37:0x0097, B:24:0x005e), top: B:49:0x005e }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0092 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Code duplicated, block: B:37:0x0097 A[Catch: all -> 0x009d, TRY_LEAVE, TryCatch #2 {all -> 0x009d, blocks: (B:25:0x0062, B:29:0x0075, B:31:0x007e, B:33:0x0084, B:37:0x0097, B:24:0x005e), top: B:49:0x005e }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlinx.coroutines.channels.b0] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object, kotlinx.coroutines.channels.b0] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.k(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object v(kotlinx.coroutines.channels.ReceiveChannel r7, kotlinx.coroutines.channels.b0 r8, kotlin.coroutines.c r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3) r0
            int r1 = r0.f128873f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f128873f = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f128872e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.h()
            int r2 = r0.f128873f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L5b
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r7 = r0.f128871d
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r8 = r0.f128870c
            kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
            java.lang.Object r2 = r0.f128869b
            kotlinx.coroutines.channels.b0 r2 = (kotlinx.coroutines.channels.b0) r2
            kotlin.t0.n(r9)     // Catch: java.lang.Throwable -> L59
            r9 = r7
            r7 = r8
            r8 = r2
            goto L62
        L3b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L43:
            java.lang.Object r7 = r0.f128871d
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r8 = r0.f128870c
            kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
            java.lang.Object r2 = r0.f128869b
            kotlinx.coroutines.channels.b0 r2 = (kotlinx.coroutines.channels.b0) r2
            kotlin.t0.n(r9)     // Catch: java.lang.Throwable -> L59
            r6 = r0
            r0 = r7
            r7 = r8
            r8 = r2
        L56:
            r2 = r1
            r1 = r6
            goto L75
        L59:
            r7 = move-exception
            goto La1
        L5b:
            kotlin.t0.n(r9)
            kotlinx.coroutines.channels.ChannelIterator r9 = r7.iterator()     // Catch: java.lang.Throwable -> L9d
        L62:
            r0.f128869b = r8     // Catch: java.lang.Throwable -> L9d
            r0.f128870c = r7     // Catch: java.lang.Throwable -> L9d
            r0.f128871d = r9     // Catch: java.lang.Throwable -> L9d
            r0.f128873f = r4     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r2 = r9.b(r0)     // Catch: java.lang.Throwable -> L9d
            if (r2 != r1) goto L71
            return r1
        L71:
            r6 = r0
            r0 = r9
            r9 = r2
            goto L56
        L75:
            r5 = 0
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L9d
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L9d
            if (r9 == 0) goto L97
            java.lang.Object r9 = r0.next()     // Catch: java.lang.Throwable -> L9d
            if (r9 == 0) goto L93
            r1.f128869b = r8     // Catch: java.lang.Throwable -> L9d
            r1.f128870c = r7     // Catch: java.lang.Throwable -> L9d
            r1.f128871d = r0     // Catch: java.lang.Throwable -> L9d
            r1.f128873f = r3     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r9 = r8.X(r9, r1)     // Catch: java.lang.Throwable -> L9d
            if (r9 != r2) goto L93
            return r2
        L93:
            r9 = r0
            r0 = r1
            r1 = r2
            goto L62
        L97:
            kotlin.b2 r9 = kotlin.b2.f124493a     // Catch: java.lang.Throwable -> L9d
            kotlinx.coroutines.channels.o.b(r7, r5)
            return r8
        L9d:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        La1:
            throw r7     // Catch: java.lang.Throwable -> La2
        La2:
            r9 = move-exception
            kotlinx.coroutines.channels.o.b(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.v(kotlinx.coroutines.channels.ReceiveChannel, kotlinx.coroutines.channels.b0, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005c A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #1 {all -> 0x0031, blocks: (B:12:0x002d, B:24:0x0054, B:26:0x005c, B:29:0x0064, B:30:0x006b), top: B:39:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0064 A[Catch: all -> 0x0031, TRY_ENTER, TryCatch #1 {all -> 0x0031, blocks: (B:12:0x002d, B:24:0x0054, B:26:0x005c, B:29:0x0064, B:30:0x006b), top: B:39:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object w(ReceiveChannel receiveChannel, kotlin.coroutines.c cVar) throws Throwable {
        ChannelsKt__DeprecatedKt$first$1 channelsKt__DeprecatedKt$first$1;
        ReceiveChannel receiveChannel2;
        Throwable th2;
        ChannelIterator channelIterator;
        if (cVar instanceof ChannelsKt__DeprecatedKt$first$1) {
            channelsKt__DeprecatedKt$first$1 = (ChannelsKt__DeprecatedKt$first$1) cVar;
            int i10 = channelsKt__DeprecatedKt$first$1.f128877e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$first$1.f128877e = i10 - Integer.MIN_VALUE;
            } else {
                channelsKt__DeprecatedKt$first$1 = new ChannelsKt__DeprecatedKt$first$1(cVar);
            }
        } else {
            channelsKt__DeprecatedKt$first$1 = new ChannelsKt__DeprecatedKt$first$1(cVar);
        }
        Object obj = channelsKt__DeprecatedKt$first$1.f128876d;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = channelsKt__DeprecatedKt$first$1.f128877e;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$first$1.f128875c;
            receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$first$1.f128874b;
            try {
                t0.n(obj);
                if (((Boolean) obj).booleanValue()) {
                    throw new NoSuchElementException("ReceiveChannel is empty.");
                }
                Object next = channelIterator.next();
                o.b(receiveChannel2, null);
                return next;
            } catch (Throwable th3) {
                th2 = th3;
                try {
                    throw th2;
                } catch (Throwable th4) {
                    o.b(receiveChannel2, th2);
                    throw th4;
                }
            }
        }
        t0.n(obj);
        try {
            ChannelIterator it = receiveChannel.iterator();
            channelsKt__DeprecatedKt$first$1.f128874b = receiveChannel;
            channelsKt__DeprecatedKt$first$1.f128875c = it;
            channelsKt__DeprecatedKt$first$1.f128877e = 1;
            Object objB = it.b(channelsKt__DeprecatedKt$first$1);
            if (objB == objH) {
                return objH;
            }
            receiveChannel2 = receiveChannel;
            channelIterator = it;
            obj = objB;
            if (((Boolean) obj).booleanValue()) {
                throw new NoSuchElementException("ReceiveChannel is empty.");
            }
            Object next2 = channelIterator.next();
            o.b(receiveChannel2, null);
            return next2;
        } catch (Throwable th5) {
            receiveChannel2 = receiveChannel;
            th2 = th5;
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object x(ReceiveChannel receiveChannel, kotlin.coroutines.c cVar) throws Throwable {
        ChannelsKt__DeprecatedKt$firstOrNull$1 channelsKt__DeprecatedKt$firstOrNull$1;
        ReceiveChannel receiveChannel2;
        Throwable th2;
        ChannelIterator channelIterator;
        if (cVar instanceof ChannelsKt__DeprecatedKt$firstOrNull$1) {
            channelsKt__DeprecatedKt$firstOrNull$1 = (ChannelsKt__DeprecatedKt$firstOrNull$1) cVar;
            int i10 = channelsKt__DeprecatedKt$firstOrNull$1.f128881e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$firstOrNull$1.f128881e = i10 - Integer.MIN_VALUE;
            } else {
                channelsKt__DeprecatedKt$firstOrNull$1 = new ChannelsKt__DeprecatedKt$firstOrNull$1(cVar);
            }
        } else {
            channelsKt__DeprecatedKt$firstOrNull$1 = new ChannelsKt__DeprecatedKt$firstOrNull$1(cVar);
        }
        Object obj = channelsKt__DeprecatedKt$firstOrNull$1.f128880d;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = channelsKt__DeprecatedKt$firstOrNull$1.f128881e;
        if (i11 == 0) {
            t0.n(obj);
            try {
                ChannelIterator it = receiveChannel.iterator();
                channelsKt__DeprecatedKt$firstOrNull$1.f128878b = receiveChannel;
                channelsKt__DeprecatedKt$firstOrNull$1.f128879c = it;
                channelsKt__DeprecatedKt$firstOrNull$1.f128881e = 1;
                Object objB = it.b(channelsKt__DeprecatedKt$firstOrNull$1);
                if (objB == objH) {
                    return objH;
                }
                receiveChannel2 = receiveChannel;
                channelIterator = it;
                obj = objB;
            } catch (Throwable th3) {
                receiveChannel2 = receiveChannel;
                th2 = th3;
                throw th2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$firstOrNull$1.f128879c;
            receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$firstOrNull$1.f128878b;
            try {
                t0.n(obj);
            } catch (Throwable th4) {
                th2 = th4;
                try {
                    throw th2;
                } catch (Throwable th5) {
                    o.b(receiveChannel2, th2);
                    throw th5;
                }
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            o.b(receiveChannel2, null);
            return null;
        }
        Object next = channelIterator.next();
        o.b(receiveChannel2, null);
        return next;
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel y(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, yh.p pVar) {
        return ProduceKt.f(v1.f130503b, coroutineContext, 0, null, o.g(receiveChannel), new ChannelsKt__DeprecatedKt$flatMap$1(receiveChannel, pVar, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel z(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, yh.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = e1.g();
        }
        return y(receiveChannel, coroutineContext, pVar);
    }
}
