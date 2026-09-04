package kotlinx.coroutines;

import com.max.hblogistics.AddressListActivity;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.k(level = DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
@Metadata(bv = {}, d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0005Î\u0001~Ï\u0001B\u0012\u0012\u0007\u0010Ë\u0001\u001a\u00020\u001b¢\u0006\u0006\bÌ\u0001\u0010Í\u0001J&\u0010\n\u001a\u00020\t2\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0082\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010#\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0012H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u0012H\u0002¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u00020\u0007*\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b'\u0010$J.\u0010*\u001a\u00020\u0007\"\n\b\u0000\u0010)\u0018\u0001*\u00020(2\u0006\u0010!\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0082\b¢\u0006\u0004\b*\u0010$J\u0019\u0010,\u001a\u00020+2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b,\u0010-J@\u00103\u001a\u00020(2'\u00101\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`02\u0006\u00102\u001a\u00020\u001bH\u0002¢\u0006\u0004\b3\u00104J'\u00107\u001a\u00020\u001b2\u0006\u00105\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u00106\u001a\u00020(H\u0002¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u00072\u0006\u0010\r\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020(H\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u001bH\u0002¢\u0006\u0004\b>\u0010?J\u0013\u0010@\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ\u001b\u0010B\u001a\u0004\u0018\u00010\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bB\u0010CJ\u0019\u0010D\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bD\u0010EJ\u001b\u0010F\u001a\u0004\u0018\u00010\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bF\u0010CJ\u0019\u0010G\u001a\u0004\u0018\u00010 2\u0006\u0010\r\u001a\u00020\u0019H\u0002¢\u0006\u0004\bG\u0010HJ\u001f\u0010I\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\bI\u0010JJ%\u0010K\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bK\u0010LJ#\u0010M\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u00192\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bM\u0010NJ\u0019\u0010P\u001a\u0004\u0018\u00010O2\u0006\u0010\r\u001a\u00020\u0019H\u0002¢\u0006\u0004\bP\u0010QJ*\u0010S\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010R\u001a\u00020O2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0082\u0010¢\u0006\u0004\bS\u0010TJ)\u0010V\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010U\u001a\u00020O2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bV\u0010WJ\u0015\u0010Y\u001a\u0004\u0018\u00010O*\u00020XH\u0002¢\u0006\u0004\bY\u0010ZJ\u0019\u0010\\\u001a\u00020[2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\\\u0010]J\u0015\u0010^\u001a\u0004\u0018\u00010\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b^\u0010AJ\u0019\u0010`\u001a\u00020\u00072\b\u0010_\u001a\u0004\u0018\u00010\u0001H\u0004¢\u0006\u0004\b`\u0010aJ\r\u0010b\u001a\u00020\u001b¢\u0006\u0004\bb\u0010?J\u000f\u0010c\u001a\u00020\u0007H\u0014¢\u0006\u0004\bc\u0010dJ\u0011\u0010g\u001a\u00060ej\u0002`f¢\u0006\u0004\bg\u0010hJ#\u0010j\u001a\u00060ej\u0002`f*\u00020\u00122\n\b\u0002\u0010i\u001a\u0004\u0018\u00010[H\u0004¢\u0006\u0004\bj\u0010kJ6\u0010m\u001a\u00020l2'\u00101\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`0¢\u0006\u0004\bm\u0010nJF\u0010p\u001a\u00020l2\u0006\u00102\u001a\u00020\u001b2\u0006\u0010o\u001a\u00020\u001b2'\u00101\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`0¢\u0006\u0004\bp\u0010qJ\u0013\u0010r\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\br\u0010AJB\u0010w\u001a\u00020\u0007\"\u0004\b\u0000\u0010s2\f\u0010u\u001a\b\u0012\u0004\u0012\u00028\u00000t2\u001c\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000v\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005ø\u0001\u0000¢\u0006\u0004\bw\u0010xJ\u0017\u0010y\u001a\u00020\u00072\u0006\u00106\u001a\u00020(H\u0000¢\u0006\u0004\by\u0010=J\u001f\u0010z\u001a\u00020\u00072\u000e\u0010\"\u001a\n\u0018\u00010ej\u0004\u0018\u0001`fH\u0016¢\u0006\u0004\bz\u0010{J\u000f\u0010|\u001a\u00020[H\u0014¢\u0006\u0004\b|\u0010}J\u0019\u0010~\u001a\u00020\u001b2\b\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0017¢\u0006\u0004\b~\u0010&J\u0018\u0010\u007f\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0019\u0010\u0082\u0001\u001a\u00020\u00072\u0007\u0010\u0081\u0001\u001a\u00020\u0003¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0019\u0010\u0084\u0001\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u0084\u0001\u0010&J\u0019\u0010\u0085\u0001\u001a\u00020\u001b2\b\u0010\"\u001a\u0004\u0018\u00010\u0012¢\u0006\u0005\b\u0085\u0001\u0010&J\u001c\u0010\u0086\u0001\u001a\u00020\u001b2\b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J,\u0010\u0089\u0001\u001a\u00030\u0088\u00012\n\b\u0002\u0010i\u001a\u0004\u0018\u00010[2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0080\b¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u0015\u0010\u008b\u0001\u001a\u00060ej\u0002`fH\u0016¢\u0006\u0005\b\u008b\u0001\u0010hJ\u001c\u0010\u008c\u0001\u001a\u00020\u001b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0006\b\u008c\u0001\u0010\u0087\u0001J\u001d\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0005\b\u008d\u0001\u0010CJ\u0019\u0010\u008f\u0001\u001a\u00030\u008e\u00012\u0006\u0010R\u001a\u00020\u0002¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001b\u0010\u0092\u0001\u001a\u00020\u00072\u0007\u0010\u0091\u0001\u001a\u00020\u0012H\u0010¢\u0006\u0006\b\u0092\u0001\u0010\u0080\u0001J\u001c\u0010\u0093\u0001\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0006\b\u0093\u0001\u0010\u0080\u0001J\u001a\u0010\u0094\u0001\u001a\u00020\u001b2\u0007\u0010\u0091\u0001\u001a\u00020\u0012H\u0014¢\u0006\u0005\b\u0094\u0001\u0010&J\u001c\u0010\u0095\u0001\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u001c\u0010\u0097\u0001\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0006\b\u0097\u0001\u0010\u0096\u0001J\u0011\u0010\u0098\u0001\u001a\u00020[H\u0016¢\u0006\u0005\b\u0098\u0001\u0010}J\u0011\u0010\u0099\u0001\u001a\u00020[H\u0007¢\u0006\u0005\b\u0099\u0001\u0010}J\u0011\u0010\u009a\u0001\u001a\u00020[H\u0010¢\u0006\u0005\b\u009a\u0001\u0010}J\u0012\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0012¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u0014\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u0017\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0006H\u0080@ø\u0001\u0000¢\u0006\u0005\b\u009f\u0001\u0010AJT\u0010¡\u0001\u001a\u00020\u0007\"\u0004\b\u0000\u0010)\"\u0004\b\u0001\u0010s2\f\u0010u\u001a\b\u0012\u0004\u0012\u00028\u00010t2#\u0010\b\u001a\u001f\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010v\u0012\u0006\u0012\u0004\u0018\u00010\u00060 \u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b¡\u0001\u0010¢\u0001JT\u0010£\u0001\u001a\u00020\u0007\"\u0004\b\u0000\u0010)\"\u0004\b\u0001\u0010s2\f\u0010u\u001a\b\u0012\u0004\u0012\u00028\u00010t2#\u0010\b\u001a\u001f\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010v\u0012\u0006\u0012\u0004\u0018\u00010\u00060 \u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b£\u0001\u0010¢\u0001R\u001e\u0010¥\u0001\u001a\u0004\u0018\u00010\u0012*\u0004\u0018\u00010\u00068BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010ER\u001b\u0010¨\u0001\u001a\u00020\u001b*\u00020\u00198BX\u0082\u0004¢\u0006\b\u001a\u0006\b¦\u0001\u0010§\u0001R\u0019\u0010¬\u0001\u001a\u0007\u0012\u0002\b\u00030©\u00018F¢\u0006\b\u001a\u0006\bª\u0001\u0010«\u0001R0\u0010²\u0001\u001a\u0005\u0018\u00010\u008e\u00012\n\u0010\u00ad\u0001\u001a\u0005\u0018\u00010\u008e\u00018@@@X\u0080\u000e¢\u0006\u0010\u001a\u0006\b®\u0001\u0010¯\u0001\"\u0006\b°\u0001\u0010±\u0001R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068@X\u0080\u0004¢\u0006\b\u001a\u0006\b³\u0001\u0010\u009e\u0001R\u0016\u0010´\u0001\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b´\u0001\u0010?R\u0013\u0010¶\u0001\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\bµ\u0001\u0010?R\u0013\u0010·\u0001\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\b·\u0001\u0010?R\u0019\u0010¹\u0001\u001a\u0004\u0018\u00010\u00128DX\u0084\u0004¢\u0006\b\u001a\u0006\b¸\u0001\u0010\u009c\u0001R\u0016\u0010»\u0001\u001a\u00020\u001b8DX\u0084\u0004¢\u0006\u0007\u001a\u0005\bº\u0001\u0010?R\u0014\u0010¾\u0001\u001a\u00020\u00048F¢\u0006\b\u001a\u0006\b¼\u0001\u0010½\u0001R\u0016\u0010À\u0001\u001a\u00020\u001b8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b¿\u0001\u0010?R\u001b\u0010Ä\u0001\u001a\t\u0012\u0004\u0012\u00020\u00010Á\u00018F¢\u0006\b\u001a\u0006\bÂ\u0001\u0010Ã\u0001R\u0016\u0010Æ\u0001\u001a\u00020\u001b8TX\u0094\u0004¢\u0006\u0007\u001a\u0005\bÅ\u0001\u0010?R\u0016\u0010È\u0001\u001a\u00020\u001b8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bÇ\u0001\u0010?R\u0013\u0010Ê\u0001\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\bÉ\u0001\u0010?\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Ð\u0001"}, d2 = {"Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/d2;", "Lkotlinx/coroutines/x;", "Lkotlinx/coroutines/t2;", "Lkotlinx/coroutines/selects/c;", "Lkotlin/Function1;", "", "Lkotlin/b2;", "block", "", "c1", "(Lyh/l;)Ljava/lang/Void;", "Lkotlinx/coroutines/JobSupport$c;", "state", "proposedUpdate", "H0", "(Lkotlinx/coroutines/JobSupport$c;Ljava/lang/Object;)Ljava/lang/Object;", "", "", "exceptions", "O0", "(Lkotlinx/coroutines/JobSupport$c;Ljava/util/List;)Ljava/lang/Throwable;", "rootCause", "p0", "(Ljava/lang/Throwable;Ljava/util/List;)V", "Lkotlinx/coroutines/x1;", "update", "", "A1", "(Lkotlinx/coroutines/x1;Ljava/lang/Object;)Z", "B0", "(Lkotlinx/coroutines/x1;Ljava/lang/Object;)V", "Lkotlinx/coroutines/o2;", "list", "cause", "j1", "(Lkotlinx/coroutines/o2;Ljava/lang/Throwable;)V", "y0", "(Ljava/lang/Throwable;)Z", "k1", "Lkotlinx/coroutines/j2;", androidx.exifinterface.media.a.f23244d5, "l1", "", com.alipay.sdk.m.x.c.f39529d, "(Ljava/lang/Object;)I", "Lkotlin/m0;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "onCancelling", "g1", "(Lyh/l;Z)Lkotlinx/coroutines/j2;", "expect", "node", "n0", "(Ljava/lang/Object;Lkotlinx/coroutines/o2;Lkotlinx/coroutines/j2;)Z", "Lkotlinx/coroutines/k1;", "p1", "(Lkotlinx/coroutines/k1;)V", "q1", "(Lkotlinx/coroutines/j2;)V", "a1", "()Z", "b1", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "x0", "(Ljava/lang/Object;)Ljava/lang/Object;", "D0", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "d1", "R0", "(Lkotlinx/coroutines/x1;)Lkotlinx/coroutines/o2;", "B1", "(Lkotlinx/coroutines/x1;Ljava/lang/Throwable;)Z", "C1", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "D1", "(Lkotlinx/coroutines/x1;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/w;", "J0", "(Lkotlinx/coroutines/x1;)Lkotlinx/coroutines/w;", "child", "E1", "(Lkotlinx/coroutines/JobSupport$c;Lkotlinx/coroutines/w;Ljava/lang/Object;)Z", "lastChild", "C0", "(Lkotlinx/coroutines/JobSupport$c;Lkotlinx/coroutines/w;Ljava/lang/Object;)V", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "i1", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Lkotlinx/coroutines/w;", "", "w1", "(Ljava/lang/Object;)Ljava/lang/String;", "t0", "parent", "W0", "(Lkotlinx/coroutines/d2;)V", com.google.android.exoplayer2.text.ttml.d.f49798o0, "o1", "()V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Z", "()Ljava/util/concurrent/CancellationException;", "message", "x1", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/h1;", "K", "(Lyh/l;)Lkotlinx/coroutines/h1;", "invokeImmediately", "i0", "(ZZLyh/l;)Lkotlinx/coroutines/h1;", "g0", "R", "Lkotlinx/coroutines/selects/f;", AddressListActivity.N, "Lkotlin/coroutines/c;", RXScreenCaptureService.KEY_WIDTH, "(Lkotlinx/coroutines/selects/f;Lyh/l;)V", "s1", "e", "(Ljava/util/concurrent/CancellationException;)V", "z0", "()Ljava/lang/String;", "b", "w0", "(Ljava/lang/Throwable;)V", "parentJob", "q", "(Lkotlinx/coroutines/t2;)V", "A0", "u0", "v0", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/JobCancellationException;", "E0", "(Ljava/lang/String;Ljava/lang/Throwable;)Lkotlinx/coroutines/JobCancellationException;", "e0", "e1", "f1", "Lkotlinx/coroutines/v;", "P", "(Lkotlinx/coroutines/x;)Lkotlinx/coroutines/v;", "exception", "V0", "m1", "U0", "n1", "(Ljava/lang/Object;)V", "q0", "toString", "z1", "h1", "Y", "()Ljava/lang/Throwable;", "K0", "()Ljava/lang/Object;", "r0", "Lkotlin/Function2;", "r1", "(Lkotlinx/coroutines/selects/f;Lyh/p;)V", "t1", "N0", "exceptionOrNull", "X0", "(Lkotlinx/coroutines/x1;)Z", "isCancelling", "Lkotlin/coroutines/CoroutineContext$b;", "getKey", "()Lkotlin/coroutines/CoroutineContext$b;", "key", "value", "S0", "()Lkotlinx/coroutines/v;", "u1", "(Lkotlinx/coroutines/v;)V", "parentHandle", "T0", "isActive", "x", "isCompleted", "isCancelled", "L0", "completionCause", "M0", "completionCauseHandled", "M", "()Lkotlinx/coroutines/selects/c;", "onJoin", "Q0", "onCancelComplete", "Lkotlin/sequences/m;", androidx.exifinterface.media.a.R4, "()Lkotlin/sequences/m;", "children", "Z0", "isScopedCoroutine", "P0", "handlesException", "Y0", "isCompletedExceptionally", "active", "<init>", "(Z)V", ak.av, ak.aF, "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class JobSupport implements d2, x, t2, kotlinx.coroutines.selects.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f128697b = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_state");

    @dl.d
    private volatile /* synthetic */ Object _parentHandle;

    @dl.d
    private volatile /* synthetic */ Object _state;

    /* JADX INFO: compiled from: JobSupport.kt */
    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0014R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/JobSupport$a;", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/q;", "Lkotlinx/coroutines/d2;", "parent", "", ak.aB, "", "B", "Lkotlinx/coroutines/JobSupport;", "j", "Lkotlinx/coroutines/JobSupport;", "job", "Lkotlin/coroutines/c;", "delegate", "<init>", "(Lkotlin/coroutines/c;Lkotlinx/coroutines/JobSupport;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a<T> extends q<T> {

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final JobSupport job;

        public a(@dl.d kotlin.coroutines.c<? super T> cVar, @dl.d JobSupport jobSupport) {
            super(cVar, 1);
            this.job = jobSupport;
        }

        @Override // kotlinx.coroutines.q
        @dl.d
        protected String B() {
            return "AwaitContinuation";
        }

        @Override // kotlinx.coroutines.q
        @dl.d
        public Throwable s(@dl.d d2 parent) {
            Throwable thE;
            Object objT0 = this.job.T0();
            if (!(objT0 instanceof c) || (thE = ((c) objT0).e()) == null) {
                return objT0 instanceof d0 ? ((d0) objT0).cause : parent.Z();
            }
            return thE;
        }
    }

    /* JADX INFO: compiled from: JobSupport.kt */
    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/JobSupport$b;", "Lkotlinx/coroutines/j2;", "", "cause", "Lkotlin/b2;", "j0", "Lkotlinx/coroutines/JobSupport;", "f", "Lkotlinx/coroutines/JobSupport;", "parent", "Lkotlinx/coroutines/JobSupport$c;", "g", "Lkotlinx/coroutines/JobSupport$c;", "state", "Lkotlinx/coroutines/w;", RXScreenCaptureService.KEY_HEIGHT, "Lkotlinx/coroutines/w;", "child", "", "i", "Ljava/lang/Object;", "proposedUpdate", "<init>", "(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/JobSupport$c;Lkotlinx/coroutines/w;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class b extends j2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final JobSupport parent;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final c state;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final w child;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private final Object proposedUpdate;

        public b(@dl.d JobSupport jobSupport, @dl.d c cVar, @dl.d w wVar, @dl.e Object obj) {
            this.parent = jobSupport;
            this.state = cVar;
            this.child = wVar;
            this.proposedUpdate = obj;
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ kotlin.b2 invoke(Throwable th2) {
            j0(th2);
            return kotlin.b2.f124493a;
        }

        @Override // kotlinx.coroutines.f0
        public void j0(@dl.e Throwable th2) {
            this.parent.C0(this.state, this.child, this.proposedUpdate);
        }
    }

    /* JADX INFO: compiled from: JobSupport.kt */
    @Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B!\u0012\u0006\u0010\u0018\u001a\u00020\u0014\u0012\u0006\u0010$\u001a\u00020\u001f\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b.\u0010/J\u001f\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R(\u0010\u001e\u001a\u0004\u0018\u00010\u00012\b\u0010\u0019\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010$\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u001f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R(\u0010(\u001a\u0004\u0018\u00010\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010\u0010R\u0011\u0010*\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b)\u0010!R\u0011\u0010,\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b+\u0010!R\u0014\u0010-\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010!¨\u00060"}, d2 = {"Lkotlinx/coroutines/JobSupport$c;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lkotlinx/coroutines/x1;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "b", "()Ljava/util/ArrayList;", "proposedException", "", "i", "(Ljava/lang/Throwable;)Ljava/util/List;", "exception", "Lkotlin/b2;", ak.av, "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/o2;", "Lkotlinx/coroutines/o2;", "d", "()Lkotlinx/coroutines/o2;", "list", "value", ak.aF, "()Ljava/lang/Object;", "k", "(Ljava/lang/Object;)V", "exceptionsHolder", "", "g", "()Z", "j", "(Z)V", "isCompleting", "e", "()Ljava/lang/Throwable;", "l", "rootCause", RXScreenCaptureService.KEY_HEIGHT, "isSealed", "f", "isCancelling", "isActive", "<init>", "(Lkotlinx/coroutines/o2;ZLjava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class c implements x1 {

        @dl.d
        private volatile /* synthetic */ Object _exceptionsHolder = null;

        @dl.d
        private volatile /* synthetic */ int _isCompleting;

        @dl.d
        private volatile /* synthetic */ Object _rootCause;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final o2 list;

        public c(@dl.d o2 o2Var, boolean z10, @dl.e Throwable th2) {
            this.list = o2Var;
            this._isCompleting = z10 ? 1 : 0;
            this._rootCause = th2;
        }

        private final ArrayList<Throwable> b() {
            return new ArrayList<>(4);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        private final Object get_exceptionsHolder() {
            return this._exceptionsHolder;
        }

        private final void k(Object obj) {
            this._exceptionsHolder = obj;
        }

        public final void a(@dl.d Throwable exception) {
            Throwable thE = e();
            if (thE == null) {
                l(exception);
                return;
            }
            if (exception == thE) {
                return;
            }
            Object obj = get_exceptionsHolder();
            if (obj == null) {
                k(exception);
                return;
            }
            if (obj instanceof Throwable) {
                if (exception == obj) {
                    return;
                }
                ArrayList<Throwable> arrayListB = b();
                arrayListB.add(obj);
                arrayListB.add(exception);
                k(arrayListB);
                return;
            }
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(exception);
                return;
            }
            throw new IllegalStateException(("State is " + obj).toString());
        }

        @Override // kotlinx.coroutines.x1
        @dl.d
        /* JADX INFO: renamed from: d, reason: from getter */
        public o2 getList() {
            return this.list;
        }

        @dl.e
        public final Throwable e() {
            return (Throwable) this._rootCause;
        }

        public final boolean f() {
            return e() != null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
        public final boolean g() {
            return this._isCompleting;
        }

        public final boolean h() {
            return get_exceptionsHolder() == k2.f130257h;
        }

        @dl.d
        public final List<Throwable> i(@dl.e Throwable proposedException) {
            ArrayList<Throwable> arrayListB;
            Object obj = get_exceptionsHolder();
            if (obj == null) {
                arrayListB = b();
            } else if (obj instanceof Throwable) {
                ArrayList<Throwable> arrayListB2 = b();
                arrayListB2.add(obj);
                arrayListB = arrayListB2;
            } else {
                if (!(obj instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
                arrayListB = (ArrayList) obj;
            }
            Throwable thE = e();
            if (thE != null) {
                arrayListB.add(0, thE);
            }
            if (proposedException != null && !kotlin.jvm.internal.f0.g(proposedException, thE)) {
                arrayListB.add(proposedException);
            }
            k(k2.f130257h);
            return arrayListB;
        }

        @Override // kotlinx.coroutines.x1
        /* JADX INFO: renamed from: isActive */
        public boolean getIsActive() {
            return e() == null;
        }

        public final void j(boolean z10) {
            this._isCompleting = z10 ? 1 : 0;
        }

        public final void l(@dl.e Throwable th2) {
            this._rootCause = th2;
        }

        @dl.d
        public String toString() {
            return "Finishing[cancelling=" + f() + ", completing=" + g() + ", rootCause=" + e() + ", exceptions=" + get_exceptionsHolder() + ", list=" + getList() + ']';
        }
    }

    /* JADX INFO: compiled from: LockFreeLinkedList.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/internal/LockFreeLinkedListNode$f", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$c;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "k", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class d extends LockFreeLinkedListNode.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ JobSupport f128709d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f128710e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(LockFreeLinkedListNode lockFreeLinkedListNode, JobSupport jobSupport, Object obj) {
            super(lockFreeLinkedListNode);
            this.f128709d = jobSupport;
            this.f128710e = obj;
        }

        @Override // kotlinx.coroutines.internal.d
        @dl.e
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Object i(@dl.d LockFreeLinkedListNode affected) {
            if (this.f128709d.T0() == this.f128710e) {
                return null;
            }
            return kotlinx.coroutines.internal.w.a();
        }
    }

    public JobSupport(boolean z10) {
        this._state = z10 ? k2.f130259j : k2.f130258i;
        this._parentHandle = null;
    }

    private final boolean A1(x1 state, Object update) throws Throwable {
        if (!androidx.concurrent.futures.a.a(f128697b, this, state, k2.g(update))) {
            return false;
        }
        m1(null);
        n1(update);
        B0(state, update);
        return true;
    }

    private final void B0(x1 state, Object update) throws Throwable {
        v vVarS0 = S0();
        if (vVarS0 != null) {
            vVarS0.dispose();
            u1(q2.f130305b);
        }
        d0 d0Var = update instanceof d0 ? (d0) update : null;
        Throwable th2 = d0Var != null ? d0Var.cause : null;
        if (!(state instanceof j2)) {
            o2 list = state.getList();
            if (list != null) {
                k1(list, th2);
                return;
            }
            return;
        }
        try {
            ((j2) state).j0(th2);
        } catch (Throwable th3) {
            V0(new CompletionHandlerException("Exception in completion handler " + state + " for " + this, th3));
        }
    }

    private final boolean B1(x1 state, Throwable rootCause) throws Throwable {
        o2 o2VarR0 = R0(state);
        if (o2VarR0 == null) {
            return false;
        }
        if (!androidx.concurrent.futures.a.a(f128697b, this, state, new c(o2VarR0, false, rootCause))) {
            return false;
        }
        j1(o2VarR0, rootCause);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C0(c state, w lastChild, Object proposedUpdate) {
        w wVarI1 = i1(lastChild);
        if (wVarI1 == null || !E1(state, wVarI1, proposedUpdate)) {
            q0(H0(state, proposedUpdate));
        }
    }

    private final Object C1(Object state, Object proposedUpdate) {
        if (!(state instanceof x1)) {
            return k2.f130250a;
        }
        if ((!(state instanceof k1) && !(state instanceof j2)) || (state instanceof w) || (proposedUpdate instanceof d0)) {
            return D1((x1) state, proposedUpdate);
        }
        return A1((x1) state, proposedUpdate) ? proposedUpdate : k2.f130252c;
    }

    private final Throwable D0(Object cause) {
        if (cause == null ? true : cause instanceof Throwable) {
            Throwable th2 = (Throwable) cause;
            return th2 == null ? new JobCancellationException(z0(), null, this) : th2;
        }
        if (cause != null) {
            return ((t2) cause).e0();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlinx.coroutines.JobSupport] */
    private final Object D1(x1 state, Object proposedUpdate) throws Throwable {
        o2 o2VarR0 = R0(state);
        if (o2VarR0 == null) {
            return k2.f130252c;
        }
        c cVar = state instanceof c ? (c) state : null;
        if (cVar == null) {
            cVar = new c(o2VarR0, false, null);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (cVar) {
            if (cVar.g()) {
                return k2.f130250a;
            }
            cVar.j(true);
            if (cVar != state && !androidx.concurrent.futures.a.a(f128697b, this, state, cVar)) {
                return k2.f130252c;
            }
            boolean zF = cVar.f();
            d0 d0Var = proposedUpdate instanceof d0 ? (d0) proposedUpdate : null;
            if (d0Var != null) {
                cVar.a(d0Var.cause);
            }
            ?? E = Boolean.valueOf(zF ? false : true).booleanValue() ? cVar.e() : 0;
            objectRef.f124891b = E;
            kotlin.b2 b2Var = kotlin.b2.f124493a;
            if (E != 0) {
                j1(o2VarR0, E);
            }
            w wVarJ0 = J0(state);
            return (wVarJ0 == null || !E1(cVar, wVarJ0, proposedUpdate)) ? H0(cVar, proposedUpdate) : k2.f130251b;
        }
    }

    private final boolean E1(c state, w child, Object proposedUpdate) {
        while (d2.a.f(child.childJob, false, false, new b(this, state, child, proposedUpdate), 1, null) == q2.f130305b) {
            child = i1(child);
            if (child == null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ JobCancellationException G0(JobSupport jobSupport, String str, Throwable th2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defaultCancellationException");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        if (str == null) {
            str = jobSupport.z0();
        }
        return new JobCancellationException(str, th2, jobSupport);
    }

    private final Object H0(c state, Object proposedUpdate) throws Throwable {
        boolean zF;
        Throwable thO0;
        d0 d0Var = proposedUpdate instanceof d0 ? (d0) proposedUpdate : null;
        Throwable th2 = d0Var != null ? d0Var.cause : null;
        synchronized (state) {
            zF = state.f();
            List<Throwable> listI = state.i(th2);
            thO0 = O0(state, listI);
            if (thO0 != null) {
                p0(thO0, listI);
            }
        }
        if (thO0 != null && thO0 != th2) {
            proposedUpdate = new d0(thO0, false, 2, null);
        }
        if (thO0 != null) {
            if (y0(thO0) || U0(thO0)) {
                if (proposedUpdate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                }
                ((d0) proposedUpdate).b();
            }
        }
        if (!zF) {
            m1(thO0);
        }
        n1(proposedUpdate);
        androidx.concurrent.futures.a.a(f128697b, this, state, k2.g(proposedUpdate));
        B0(state, proposedUpdate);
        return proposedUpdate;
    }

    private final w J0(x1 state) {
        w wVar = state instanceof w ? (w) state : null;
        if (wVar != null) {
            return wVar;
        }
        o2 list = state.getList();
        if (list != null) {
            return i1(list);
        }
        return null;
    }

    private final Throwable N0(Object obj) {
        d0 d0Var = obj instanceof d0 ? (d0) obj : null;
        if (d0Var != null) {
            return d0Var.cause;
        }
        return null;
    }

    private final Throwable O0(c state, List<? extends Throwable> exceptions) {
        Object next;
        Object obj = null;
        if (exceptions.isEmpty()) {
            if (state.f()) {
                return new JobCancellationException(z0(), null, this);
            }
            return null;
        }
        Iterator<T> it = exceptions.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(!(((Throwable) next) instanceof CancellationException)));
        Throwable th2 = (Throwable) next;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = exceptions.get(0);
        if (th3 instanceof TimeoutCancellationException) {
            for (Object obj2 : exceptions) {
                Throwable th4 = (Throwable) obj2;
                if (th4 != th3 && (th4 instanceof TimeoutCancellationException)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    private final o2 R0(x1 state) {
        o2 list = state.getList();
        if (list != null) {
            return list;
        }
        if (state instanceof k1) {
            return new o2();
        }
        if (state instanceof j2) {
            q1((j2) state);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + state).toString());
    }

    private final boolean X0(x1 x1Var) {
        return (x1Var instanceof c) && ((c) x1Var).f();
    }

    private final boolean a1() {
        Object objT0;
        do {
            objT0 = T0();
            if (!(objT0 instanceof x1)) {
                return false;
            }
        } while (v1(objT0) < 0);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object b1(kotlin.coroutines.c<? super kotlin.b2> cVar) {
        q qVar = new q(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        qVar.F0();
        s.a(qVar, K(new w2(qVar)));
        Object objT = qVar.t();
        if (objT == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objT == kotlin.coroutines.intrinsics.b.h() ? objT : kotlin.b2.f124493a;
    }

    private final Void c1(yh.l<Object, kotlin.b2> block) {
        while (true) {
            block.invoke(T0());
        }
    }

    private final Object d1(Object cause) throws Throwable {
        Throwable thD0 = null;
        while (true) {
            Object objT0 = T0();
            if (objT0 instanceof c) {
                synchronized (objT0) {
                    if (((c) objT0).h()) {
                        return k2.f130253d;
                    }
                    boolean zF = ((c) objT0).f();
                    if (cause != null || !zF) {
                        if (thD0 == null) {
                            thD0 = D0(cause);
                        }
                        ((c) objT0).a(thD0);
                    }
                    Throwable thE = zF ^ true ? ((c) objT0).e() : null;
                    if (thE != null) {
                        j1(((c) objT0).getList(), thE);
                    }
                    return k2.f130250a;
                }
            }
            if (!(objT0 instanceof x1)) {
                return k2.f130253d;
            }
            if (thD0 == null) {
                thD0 = D0(cause);
            }
            x1 x1Var = (x1) objT0;
            if (!x1Var.getIsActive()) {
                Object objC1 = C1(objT0, new d0(thD0, false, 2, null));
                if (objC1 == k2.f130250a) {
                    throw new IllegalStateException(("Cannot happen in " + objT0).toString());
                }
                if (objC1 != k2.f130252c) {
                    return objC1;
                }
            } else if (B1(x1Var, thD0)) {
                return k2.f130250a;
            }
        }
    }

    private final j2 g1(yh.l<? super Throwable, kotlin.b2> handler, boolean onCancelling) {
        j2 c2Var;
        if (onCancelling) {
            c2Var = handler instanceof e2 ? (e2) handler : null;
            if (c2Var == null) {
                c2Var = new b2(handler);
            }
        } else {
            c2Var = handler instanceof j2 ? (j2) handler : null;
            if (c2Var == null) {
                c2Var = new c2(handler);
            }
        }
        c2Var.m0(this);
        return c2Var;
    }

    private final w i1(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.S()) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.P();
        }
        while (true) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.O();
            if (!lockFreeLinkedListNode.S()) {
                if (lockFreeLinkedListNode instanceof w) {
                    return (w) lockFreeLinkedListNode;
                }
                if (lockFreeLinkedListNode instanceof o2) {
                    return null;
                }
            }
        }
    }

    private final void j1(o2 list, Throwable cause) throws Throwable {
        m1(cause);
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNodeO = (LockFreeLinkedListNode) list.N(); !kotlin.jvm.internal.f0.g(lockFreeLinkedListNodeO, list); lockFreeLinkedListNodeO = lockFreeLinkedListNodeO.O()) {
            if (lockFreeLinkedListNodeO instanceof e2) {
                j2 j2Var = (j2) lockFreeLinkedListNodeO;
                try {
                    j2Var.j0(cause);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        kotlin.o.a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + j2Var + " for " + this, th2);
                        kotlin.b2 b2Var = kotlin.b2.f124493a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            V0(completionHandlerException);
        }
        y0(cause);
    }

    private final void k1(o2 o2Var, Throwable th2) throws Throwable {
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNodeO = (LockFreeLinkedListNode) o2Var.N(); !kotlin.jvm.internal.f0.g(lockFreeLinkedListNodeO, o2Var); lockFreeLinkedListNodeO = lockFreeLinkedListNodeO.O()) {
            if (lockFreeLinkedListNodeO instanceof j2) {
                j2 j2Var = (j2) lockFreeLinkedListNodeO;
                try {
                    j2Var.j0(th2);
                } catch (Throwable th3) {
                    if (completionHandlerException != null) {
                        kotlin.o.a(completionHandlerException, th3);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + j2Var + " for " + this, th3);
                        kotlin.b2 b2Var = kotlin.b2.f124493a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            V0(completionHandlerException);
        }
    }

    private final /* synthetic */ <T extends j2> void l1(o2 list, Throwable cause) throws Throwable {
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNodeO = (LockFreeLinkedListNode) list.N(); !kotlin.jvm.internal.f0.g(lockFreeLinkedListNodeO, list); lockFreeLinkedListNodeO = lockFreeLinkedListNodeO.O()) {
            kotlin.jvm.internal.f0.y(3, androidx.exifinterface.media.a.f23244d5);
            if (lockFreeLinkedListNodeO instanceof LockFreeLinkedListNode) {
                j2 j2Var = (j2) lockFreeLinkedListNodeO;
                try {
                    j2Var.j0(cause);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        kotlin.o.a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + j2Var + " for " + this, th2);
                        kotlin.b2 b2Var = kotlin.b2.f124493a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            V0(completionHandlerException);
        }
    }

    private final boolean n0(Object expect, o2 list, j2 node) {
        int iH0;
        d dVar = new d(node, this, expect);
        do {
            iH0 = list.P().h0(node, list, dVar);
            if (iH0 == 1) {
                return true;
            }
        } while (iH0 != 2);
        return false;
    }

    private final void p0(Throwable rootCause, List<? extends Throwable> exceptions) throws IllegalAccessException, InvocationTargetException {
        if (exceptions.size() <= 1) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(exceptions.size()));
        for (Throwable th2 : exceptions) {
            if (th2 != rootCause && th2 != rootCause && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                kotlin.o.a(rootCause, th2);
            }
        }
    }

    private final void p1(k1 state) {
        o2 o2Var = new o2();
        Object w1Var = o2Var;
        if (!state.getIsActive()) {
            w1Var = new w1(o2Var);
        }
        androidx.concurrent.futures.a.a(f128697b, this, state, w1Var);
    }

    private final void q1(j2 state) {
        state.F(new o2());
        androidx.concurrent.futures.a.a(f128697b, this, state, state.O());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t0(kotlin.coroutines.c<Object> cVar) {
        a aVar = new a(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), this);
        aVar.F0();
        s.a(aVar, K(new v2(aVar)));
        Object objT = aVar.t();
        if (objT == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objT;
    }

    private final int v1(Object state) {
        if (state instanceof k1) {
            if (((k1) state).getIsActive()) {
                return 0;
            }
            if (!androidx.concurrent.futures.a.a(f128697b, this, state, k2.f130259j)) {
                return -1;
            }
            o1();
            return 1;
        }
        if (!(state instanceof w1)) {
            return 0;
        }
        if (!androidx.concurrent.futures.a.a(f128697b, this, state, ((w1) state).getList())) {
            return -1;
        }
        o1();
        return 1;
    }

    private final String w1(Object state) {
        if (!(state instanceof c)) {
            if (state instanceof x1) {
                return ((x1) state).getIsActive() ? "Active" : "New";
            }
            return state instanceof d0 ? "Cancelled" : "Completed";
        }
        c cVar = (c) state;
        if (cVar.f()) {
            return "Cancelling";
        }
        return cVar.g() ? "Completing" : "Active";
    }

    private final Object x0(Object cause) {
        Object objC1;
        do {
            Object objT0 = T0();
            if (!(objT0 instanceof x1) || ((objT0 instanceof c) && ((c) objT0).g())) {
                return k2.f130250a;
            }
            objC1 = C1(objT0, new d0(D0(cause), false, 2, null));
        } while (objC1 == k2.f130252c);
        return objC1;
    }

    private final boolean y0(Throwable cause) {
        if (Z0()) {
            return true;
        }
        boolean z10 = cause instanceof CancellationException;
        v vVarS0 = S0();
        if (vVarS0 == null || vVarS0 == q2.f130305b) {
            return z10;
        }
        return vVarS0.c(cause) || z10;
    }

    public static /* synthetic */ CancellationException y1(JobSupport jobSupport, Throwable th2, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        return jobSupport.x1(th2, str);
    }

    public boolean A0(@dl.d Throwable cause) {
        if (cause instanceof CancellationException) {
            return true;
        }
        return v0(cause) && getHandlesException();
    }

    @dl.d
    public final JobCancellationException E0(@dl.e String message, @dl.e Throwable cause) {
        if (message == null) {
            message = z0();
        }
        return new JobCancellationException(message, cause, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @dl.d
    public CoroutineContext I(@dl.d CoroutineContext coroutineContext) {
        return d2.a.h(this, coroutineContext);
    }

    @Override // kotlinx.coroutines.d2
    @dl.d
    public final h1 K(@dl.d yh.l<? super Throwable, kotlin.b2> handler) {
        return i0(false, true, handler);
    }

    @dl.e
    public final Object K0() throws Throwable {
        Object objT0 = T0();
        if (!(!(objT0 instanceof x1))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        }
        if (objT0 instanceof d0) {
            throw ((d0) objT0).cause;
        }
        return k2.o(objT0);
    }

    @dl.e
    protected final Throwable L0() {
        Object objT0 = T0();
        if (objT0 instanceof c) {
            Throwable thE = ((c) objT0).e();
            if (thE != null) {
                return thE;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (!(objT0 instanceof x1)) {
            if (objT0 instanceof d0) {
                return ((d0) objT0).cause;
            }
            return null;
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    @Override // kotlinx.coroutines.d2
    @dl.d
    public final kotlinx.coroutines.selects.c M() {
        return this;
    }

    protected final boolean M0() {
        Object objT0 = T0();
        return (objT0 instanceof d0) && ((d0) objT0).a();
    }

    @Override // kotlinx.coroutines.d2
    @dl.d
    public final v P(@dl.d x child) {
        return (v) d2.a.f(this, true, false, new w(child), 2, null);
    }

    /* JADX INFO: renamed from: P0 */
    public boolean getHandlesException() {
        return true;
    }

    public boolean Q0() {
        return false;
    }

    @Override // kotlinx.coroutines.d2
    @dl.d
    public final kotlin.sequences.m<d2> S() {
        return kotlin.sequences.q.b(new JobSupport$children$1(this, null));
    }

    @dl.e
    public final v S0() {
        return (v) this._parentHandle;
    }

    @dl.e
    public final Object T0() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof kotlinx.coroutines.internal.g0)) {
                return obj;
            }
            ((kotlinx.coroutines.internal.g0) obj).c(this);
        }
    }

    protected boolean U0(@dl.d Throwable exception) {
        return false;
    }

    public void V0(@dl.d Throwable exception) throws Throwable {
        throw exception;
    }

    protected final void W0(@dl.e d2 parent) {
        if (parent == null) {
            u1(q2.f130305b);
            return;
        }
        parent.start();
        v vVarP = parent.P(this);
        u1(vVarP);
        if (x()) {
            vVarP.dispose();
            u1(q2.f130305b);
        }
    }

    @dl.e
    public final Throwable Y() {
        Object objT0 = T0();
        if (!(objT0 instanceof x1)) {
            return N0(objT0);
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    public final boolean Y0() {
        return T0() instanceof d0;
    }

    @Override // kotlinx.coroutines.d2
    @dl.d
    public final CancellationException Z() {
        Object objT0 = T0();
        if (!(objT0 instanceof c)) {
            if (objT0 instanceof x1) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (objT0 instanceof d0) {
                return y1(this, ((d0) objT0).cause, null, 1, null);
            }
            return new JobCancellationException(t0.a(this) + " has completed normally", null, this);
        }
        Throwable thE = ((c) objT0).e();
        if (thE != null) {
            CancellationException cancellationExceptionX1 = x1(thE, t0.a(this) + " is cancelling");
            if (cancellationExceptionX1 != null) {
                return cancellationExceptionX1;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    protected boolean Z0() {
        return false;
    }

    @Override // kotlinx.coroutines.d2
    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Added since 1.2.0 for binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean b(Throwable cause) throws Throwable {
        Throwable jobCancellationException;
        if (cause == null || (jobCancellationException = y1(this, cause, null, 1, null)) == null) {
            jobCancellationException = new JobCancellationException(z0(), null, this);
        }
        w0(jobCancellationException);
        return true;
    }

    @Override // kotlinx.coroutines.d2
    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        e(null);
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    @dl.d
    public CoroutineContext d(@dl.d CoroutineContext.b<?> bVar) {
        return d2.a.g(this, bVar);
    }

    @Override // kotlinx.coroutines.d2
    public void e(@dl.e CancellationException cause) throws Throwable {
        if (cause == null) {
            cause = new JobCancellationException(z0(), null, this);
        }
        w0(cause);
    }

    @Override // kotlinx.coroutines.t2
    @dl.d
    public CancellationException e0() {
        Throwable thE;
        Object objT0 = T0();
        if (objT0 instanceof c) {
            thE = ((c) objT0).e();
        } else if (objT0 instanceof d0) {
            thE = ((d0) objT0).cause;
        } else {
            if (objT0 instanceof x1) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objT0).toString());
            }
            thE = null;
        }
        CancellationException cancellationException = thE instanceof CancellationException ? (CancellationException) thE : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        return new JobCancellationException("Parent job is " + w1(objT0), thE, this);
    }

    public final boolean e1(@dl.e Object proposedUpdate) {
        Object objC1;
        do {
            objC1 = C1(T0(), proposedUpdate);
            if (objC1 == k2.f130250a) {
                return false;
            }
            if (objC1 == k2.f130251b) {
                return true;
            }
        } while (objC1 == k2.f130252c);
        q0(objC1);
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    @dl.e
    public <E extends CoroutineContext.a> E f(@dl.d CoroutineContext.b<E> bVar) {
        return (E) d2.a.e(this, bVar);
    }

    @dl.e
    public final Object f1(@dl.e Object proposedUpdate) {
        Object objC1;
        do {
            objC1 = C1(T0(), proposedUpdate);
            if (objC1 == k2.f130250a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + proposedUpdate, N0(proposedUpdate));
            }
        } while (objC1 == k2.f130252c);
        return objC1;
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    public <R> R g(R r10, @dl.d yh.p<? super R, ? super CoroutineContext.a, ? extends R> pVar) {
        return (R) d2.a.d(this, r10, pVar);
    }

    @Override // kotlinx.coroutines.d2
    @dl.e
    public final Object g0(@dl.d kotlin.coroutines.c<? super kotlin.b2> cVar) {
        if (a1()) {
            Object objB1 = b1(cVar);
            return objB1 == kotlin.coroutines.intrinsics.b.h() ? objB1 : kotlin.b2.f124493a;
        }
        g2.z(cVar.getContext());
        return kotlin.b2.f124493a;
    }

    @Override // kotlin.coroutines.CoroutineContext.a
    @dl.d
    public final CoroutineContext.b<?> getKey() {
        return d2.INSTANCE;
    }

    @dl.d
    public String h1() {
        return t0.a(this);
    }

    @Override // kotlinx.coroutines.d2
    @dl.d
    public final h1 i0(boolean onCancelling, boolean invokeImmediately, @dl.d yh.l<? super Throwable, kotlin.b2> handler) {
        j2 j2VarG1 = g1(handler, onCancelling);
        while (true) {
            Object objT0 = T0();
            if (objT0 instanceof k1) {
                k1 k1Var = (k1) objT0;
                if (!k1Var.getIsActive()) {
                    p1(k1Var);
                } else if (androidx.concurrent.futures.a.a(f128697b, this, objT0, j2VarG1)) {
                    return j2VarG1;
                }
            } else {
                Throwable thE = null;
                if (!(objT0 instanceof x1)) {
                    if (invokeImmediately) {
                        d0 d0Var = objT0 instanceof d0 ? (d0) objT0 : null;
                        handler.invoke(d0Var != null ? d0Var.cause : null);
                    }
                    return q2.f130305b;
                }
                o2 list = ((x1) objT0).getList();
                if (list != null) {
                    h1 h1Var = q2.f130305b;
                    if (onCancelling && (objT0 instanceof c)) {
                        synchronized (objT0) {
                            thE = ((c) objT0).e();
                            if (thE == null || ((handler instanceof w) && !((c) objT0).g())) {
                                if (n0(objT0, list, j2VarG1)) {
                                    if (thE == null) {
                                        return j2VarG1;
                                    }
                                    h1Var = j2VarG1;
                                }
                            }
                            kotlin.b2 b2Var = kotlin.b2.f124493a;
                        }
                    }
                    if (thE != null) {
                        if (invokeImmediately) {
                            handler.invoke(thE);
                        }
                        return h1Var;
                    }
                    if (n0(objT0, list, j2VarG1)) {
                        return j2VarG1;
                    }
                } else {
                    if (objT0 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    }
                    q1((j2) objT0);
                }
            }
        }
    }

    @Override // kotlinx.coroutines.d2
    public boolean isActive() {
        Object objT0 = T0();
        return (objT0 instanceof x1) && ((x1) objT0).getIsActive();
    }

    @Override // kotlinx.coroutines.d2
    public final boolean isCancelled() {
        Object objT0 = T0();
        return (objT0 instanceof d0) || ((objT0 instanceof c) && ((c) objT0).f());
    }

    protected void m1(@dl.e Throwable cause) {
    }

    protected void n1(@dl.e Object state) {
    }

    protected void o1() {
    }

    @Override // kotlinx.coroutines.x
    public final void q(@dl.d t2 parentJob) throws Throwable {
        v0(parentJob);
    }

    protected void q0(@dl.e Object state) {
    }

    @dl.e
    public final Object r0(@dl.d kotlin.coroutines.c<Object> cVar) throws Throwable {
        Object objT0;
        do {
            objT0 = T0();
            if (!(objT0 instanceof x1)) {
                if (objT0 instanceof d0) {
                    throw ((d0) objT0).cause;
                }
                return k2.o(objT0);
            }
        } while (v1(objT0) < 0);
        return t0(cVar);
    }

    public final <T, R> void r1(@dl.d kotlinx.coroutines.selects.f<? super R> select, @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> block) {
        Object objT0;
        do {
            objT0 = T0();
            if (select.o()) {
                return;
            }
            if (!(objT0 instanceof x1)) {
                if (select.q()) {
                    if (objT0 instanceof d0) {
                        select.s(((d0) objT0).cause);
                        return;
                    } else {
                        bj.b.d(block, k2.o(objT0), select.r());
                        return;
                    }
                }
                return;
            }
        } while (v1(objT0) != 0);
        select.p(K(new a3(select, block)));
    }

    @Override // kotlinx.coroutines.d2
    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    public d2 s(@dl.d d2 d2Var) {
        return d2.a.i(this, d2Var);
    }

    public final void s1(@dl.d j2 node) {
        Object objT0;
        do {
            objT0 = T0();
            if (!(objT0 instanceof j2)) {
                if (!(objT0 instanceof x1) || ((x1) objT0).getList() == null) {
                    return;
                }
                node.Z();
                return;
            }
            if (objT0 != node) {
                return;
            }
        } while (!androidx.concurrent.futures.a.a(f128697b, this, objT0, k2.f130259j));
    }

    @Override // kotlinx.coroutines.d2
    public final boolean start() {
        int iV1;
        do {
            iV1 = v1(T0());
            if (iV1 == 0) {
                return false;
            }
        } while (iV1 != 1);
        return true;
    }

    public final <T, R> void t1(@dl.d kotlinx.coroutines.selects.f<? super R> select, @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> block) throws Throwable {
        Object objT0 = T0();
        if (objT0 instanceof d0) {
            select.s(((d0) objT0).cause);
        } else {
            bj.a.f(block, k2.o(objT0), select.r(), null, 4, null);
        }
    }

    @dl.d
    public String toString() {
        return z1() + '@' + t0.b(this);
    }

    public final boolean u0(@dl.e Throwable cause) {
        return v0(cause);
    }

    public final void u1(@dl.e v vVar) {
        this._parentHandle = vVar;
    }

    public final boolean v0(@dl.e Object cause) throws Throwable {
        Object objD1 = k2.f130250a;
        if (Q0() && (objD1 = x0(cause)) == k2.f130251b) {
            return true;
        }
        if (objD1 == k2.f130250a) {
            objD1 = d1(cause);
        }
        if (objD1 == k2.f130250a || objD1 == k2.f130251b) {
            return true;
        }
        if (objD1 == k2.f130253d) {
            return false;
        }
        q0(objD1);
        return true;
    }

    @Override // kotlinx.coroutines.selects.c
    public final <R> void w(@dl.d kotlinx.coroutines.selects.f<? super R> select, @dl.d yh.l<? super kotlin.coroutines.c<? super R>, ? extends Object> block) {
        Object objT0;
        do {
            objT0 = T0();
            if (select.o()) {
                return;
            }
            if (!(objT0 instanceof x1)) {
                if (select.q()) {
                    bj.b.c(block, select.r());
                    return;
                }
                return;
            }
        } while (v1(objT0) != 0);
        select.p(K(new b3(select, block)));
    }

    public void w0(@dl.d Throwable cause) throws Throwable {
        v0(cause);
    }

    @Override // kotlinx.coroutines.d2
    public final boolean x() {
        return !(T0() instanceof x1);
    }

    @dl.d
    protected final CancellationException x1(@dl.d Throwable th2, @dl.e String str) {
        CancellationException jobCancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
        if (jobCancellationException == null) {
            if (str == null) {
                str = z0();
            }
            jobCancellationException = new JobCancellationException(str, th2, this);
        }
        return jobCancellationException;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @dl.d
    public String z0() {
        return "Job was cancelled";
    }

    @dl.d
    @z1
    public final String z1() {
        return h1() + '{' + w1(T0()) + '}';
    }
}
