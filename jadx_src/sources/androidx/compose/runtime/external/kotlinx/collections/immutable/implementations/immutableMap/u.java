package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import y0.DeltaCounter;

/* JADX INFO: compiled from: TrieNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b'\b\u0000\u0018\u0000 \u0006*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0002[uB1\u0012\u0006\u0010W\u001a\u00020\u0007\u0012\u0006\u0010X\u001a\u00020\u0007\u0012\u000e\u0010{\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030'\u0012\b\u0010|\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b}\u0010~B)\b\u0016\u0012\u0006\u0010W\u001a\u00020\u0007\u0012\u0006\u0010X\u001a\u00020\u0007\u0012\u000e\u0010{\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030'¢\u0006\u0004\b}\u0010\u007fJ\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0002J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0017\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\rJ3\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00012\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J?\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00028\u00012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ8\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002J8\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001d\u001a\u00020\u00072\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J&\u0010!\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002J.\u0010\"\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002JQ\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030'2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00028\u00002\u0006\u0010%\u001a\u00028\u00012\u0006\u0010&\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b(\u0010)JK\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00028\u00002\u0006\u0010%\u001a\u00028\u00012\u0006\u0010&\u001a\u00020\u0007H\u0002¢\u0006\u0004\b*\u0010+JS\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00028\u00002\u0006\u0010%\u001a\u00028\u00012\u0006\u0010&\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b,\u0010-J]\u00104\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00028\u00002\u0006\u00100\u001a\u00028\u00012\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00028\u00002\u0006\u00103\u001a\u00028\u00012\u0006\u0010&\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b4\u00105J&\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002J:\u00106\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019H\u0002J\u001e\u00108\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u00107\u001a\u00020\u0007H\u0002J2\u00109\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u00107\u001a\u00020\u00072\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019H\u0002J\u0017\u0010:\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b:\u0010;J\u0019\u00107\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b7\u0010<J-\u0010=\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0001H\u0002¢\u0006\u0004\b=\u0010>J?\u0010?\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019H\u0002¢\u0006\u0004\b?\u0010@J%\u0010A\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\bA\u0010BJ9\u0010C\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u000f\u001a\u00028\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019H\u0002¢\u0006\u0004\bC\u0010DJ-\u0010E\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0001H\u0002¢\u0006\u0004\bE\u0010FJA\u0010G\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019H\u0002¢\u0006\u0004\bG\u0010@J8\u0010K\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010J\u001a\u00020I2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002JT\u0010L\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\u0006\u0010J\u001a\u00020I2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019H\u0002J\b\u0010M\u001a\u00020\u0007H\u0002J\u001c\u0010N\u001a\u00020\t2\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002JP\u0010P\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0012\u0010O\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002JX\u0010Q\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0012\u0010O\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u009c\u0001\u0010[\u001a\u00020Y2\u0081\u0001\u0010Z\u001a}\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(U\u0012\u0013\u0012\u00110\u0007¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(&\u0012\u0013\u0012\u00110\u0007¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(V\u0012\u0013\u0012\u00110\u0007¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(W\u0012\u0013\u0012\u00110\u0007¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(X\u0012\u0004\u0012\u00020Y0R2\u0006\u0010V\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0007H\u0002J\u000f\u0010\\\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\\\u0010]J\u0017\u0010^\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b^\u0010_J\u0017\u0010`\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b`\u0010aJ\u0017\u0010b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\bb\u0010aJ#\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001d\u001a\u00020\u0007H\u0000¢\u0006\u0004\bc\u0010dJ%\u0010f\u001a\u00020\t2\u0006\u0010e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\u0007¢\u0006\u0004\bf\u0010gJ'\u0010h\u001a\u0004\u0018\u00018\u00012\u0006\u0010e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\u0007¢\u0006\u0004\bh\u0010iJJ\u0010j\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010&\u001a\u00020\u00072\u0006\u0010J\u001a\u00020I2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019J;\u0010k\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u0006\u0010e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00012\u0006\u0010&\u001a\u00020\u0007¢\u0006\u0004\bk\u0010lJM\u0010m\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00012\u0006\u0010&\u001a\u00020\u00072\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019¢\u0006\u0004\bm\u0010nJ3\u0010o\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\u0007¢\u0006\u0004\bo\u0010pJG\u0010q\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\u00072\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019¢\u0006\u0004\bq\u0010rJ;\u0010s\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00012\u0006\u0010&\u001a\u00020\u0007¢\u0006\u0004\bs\u0010tJO\u0010\u0001\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00012\u0006\u0010&\u001a\u00020\u00072\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019¢\u0006\u0004\b\u0001\u0010nJ\u0093\u0001\u0010u\u001a\u00020Y2\u0081\u0001\u0010Z\u001a}\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(U\u0012\u0013\u0012\u00110\u0007¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(&\u0012\u0013\u0012\u00110\u0007¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(V\u0012\u0013\u0012\u00110\u0007¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(W\u0012\u0013\u0012\u00110\u0007¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(X\u0012\u0004\u0012\u00020Y0RH\u0000¢\u0006\u0004\bu\u0010vR\u0016\u0010W\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010LR\u0016\u0010X\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010LR4\u0010{\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030'2\u000e\u0010w\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030'8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0005\u0010x\u001a\u0004\by\u0010z¨\u0006\u0080\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "K", androidx.exifinterface.media.a.X4, "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u$b;", "d", "e", "", "positionMask", "", ak.aG, "keyIndex", RXScreenCaptureService.KEY_WIDTH, "(I)Ljava/lang/Object;", "a0", "key", "value", "v", "(ILjava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "Ly0/f;", "owner", androidx.exifinterface.media.a.S4, "(ILjava/lang/Object;Ljava/lang/Object;Ly0/f;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "Z", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/f;", "mutator", "P", "(ILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/f;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "nodeIndex", "newNode", "Y", "O", androidx.exifinterface.media.a.T4, "M", "newKeyHash", "newKey", "newValue", "shift", "", "f", "(IIILjava/lang/Object;Ljava/lang/Object;ILy0/f;)[Ljava/lang/Object;", "y", "(IIILjava/lang/Object;Ljava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "F", "(IIILjava/lang/Object;Ljava/lang/Object;ILy0/f;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "keyHash1", "key1", "value1", "keyHash2", "key2", "value2", "x", "(ILjava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;ILy0/f;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "L", "i", "m", "D", RXScreenCaptureService.KEY_HEIGHT, "(Ljava/lang/Object;)Z", "(Ljava/lang/Object;)Ljava/lang/Object;", "j", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u$b;", ak.aD, "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/f;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "k", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "B", "(Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/f;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "C", "otherNode", "Ly0/b;", "intersectionCounter", androidx.exifinterface.media.a.W4, "I", "g", "o", "targetNode", "X", "N", "Lkotlin/Function5;", "Lkotlin/m0;", "name", "node", "hash", "dataMap", "nodeMap", "Lkotlin/b2;", "visitor", ak.av, "p", "()I", "t", "(I)Z", "q", "(I)I", "R", "Q", "(I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "keyHash", "n", "(ILjava/lang/Object;I)Z", "r", "(ILjava/lang/Object;I)Ljava/lang/Object;", "H", androidx.exifinterface.media.a.R4, "(ILjava/lang/Object;Ljava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u$b;", "G", "(ILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/f;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", androidx.exifinterface.media.a.f23244d5, "(ILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "J", "(ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/f;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "U", "(ILjava/lang/Object;Ljava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "b", "(Lyh/s;)V", "<set-?>", "[Ljava/lang/Object;", ak.aB, "()[Ljava/lang/Object;", "buffer", "ownedBy", "<init>", "(II[Ljava/lang/Object;Ly0/f;)V", "(II[Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class u<K, V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final u f12724f = new u(0, 0, new Object[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int dataMap;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int nodeMap;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final y0.f f12727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private Object[] buffer;

    /* JADX INFO: renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.u$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: TrieNode.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u$a;", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", ak.av, "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final u a() {
            return u.f12724f;
        }
    }

    /* JADX INFO: compiled from: TrieNode.kt */
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B#\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014JD\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002*\u0010\u0006\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00050\u0004H\u0086\bø\u0001\u0000R.\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u$b;", "K", androidx.exifinterface.media.a.X4, "", "Lkotlin/Function1;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "operation", ak.aF, ak.av, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "d", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;)V", "node", "", "b", "I", "()I", "sizeDelta", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;I)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class b<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private u<K, V> node;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int sizeDelta;

        public b(@dl.d u<K, V> node, int i10) {
            f0.p(node, "node");
            this.node = node;
            this.sizeDelta = i10;
        }

        @dl.d
        public final u<K, V> a() {
            return this.node;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getSizeDelta() {
            return this.sizeDelta;
        }

        @dl.d
        public final b<K, V> c(@dl.d yh.l<? super u<K, V>, u<K, V>> operation) {
            f0.p(operation, "operation");
            d(operation.invoke(a()));
            return this;
        }

        public final void d(@dl.d u<K, V> uVar) {
            f0.p(uVar, "<set-?>");
            this.node = uVar;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(int i10, int i11, @dl.d Object[] buffer) {
        this(i10, i11, buffer, null);
        f0.p(buffer, "buffer");
    }

    public u(int i10, int i11, @dl.d Object[] buffer, @dl.e y0.f fVar) {
        f0.p(buffer, "buffer");
        this.dataMap = i10;
        this.nodeMap = i11;
        this.f12727c = fVar;
        this.buffer = buffer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final u<K, V> A(u<K, V> otherNode, DeltaCounter intersectionCounter, y0.f owner) {
        y0.a.a(this.nodeMap == 0);
        y0.a.a(this.dataMap == 0);
        y0.a.a(otherNode.nodeMap == 0);
        y0.a.a(otherNode.dataMap == 0);
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + otherNode.buffer.length);
        f0.o(objArrCopyOf, "copyOf(this, newSize)");
        int length = this.buffer.length;
        fi.j jVarB1 = fi.u.B1(fi.u.W1(0, otherNode.buffer.length), 2);
        int iH = jVarB1.h();
        int i10 = jVarB1.i();
        int iJ = jVarB1.j();
        if ((iJ > 0 && iH <= i10) || (iJ < 0 && i10 <= iH)) {
            while (true) {
                if (h(otherNode.buffer[iH])) {
                    intersectionCounter.f(intersectionCounter.d() + 1);
                } else {
                    Object[] objArr2 = otherNode.buffer;
                    objArrCopyOf[length] = objArr2[iH];
                    objArrCopyOf[length + 1] = objArr2[iH + 1];
                    length += 2;
                }
                if (iH == i10) {
                    break;
                }
                iH += iJ;
            }
        }
        if (length == this.buffer.length) {
            return this;
        }
        if (length == otherNode.buffer.length) {
            return otherNode;
        }
        if (length == objArrCopyOf.length) {
            return new u<>(0, 0, objArrCopyOf, owner);
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
        f0.o(objArrCopyOf2, "copyOf(this, newSize)");
        return new u<>(0, 0, objArrCopyOf2, owner);
    }

    private final u<K, V> B(K key, f<K, V> mutator) {
        fi.j jVarB1 = fi.u.B1(fi.u.W1(0, this.buffer.length), 2);
        int iH = jVarB1.h();
        int i10 = jVarB1.i();
        int iJ = jVarB1.j();
        if ((iJ > 0 && iH <= i10) || (iJ < 0 && i10 <= iH)) {
            while (!f0.g(key, w(iH))) {
                if (iH != i10) {
                    iH += iJ;
                }
            }
            return D(iH, mutator);
        }
        return this;
    }

    private final u<K, V> C(K key, V value, f<K, V> mutator) {
        fi.j jVarB1 = fi.u.B1(fi.u.W1(0, this.buffer.length), 2);
        int iH = jVarB1.h();
        int i10 = jVarB1.i();
        int iJ = jVarB1.j();
        if ((iJ > 0 && iH <= i10) || (iJ < 0 && i10 <= iH)) {
            while (true) {
                if (f0.g(key, w(iH)) && f0.g(value, a0(iH))) {
                    return D(iH, mutator);
                }
                if (iH != i10) {
                    iH += iJ;
                }
            }
        }
        return this;
    }

    private final u<K, V> D(int i10, f<K, V> mutator) {
        mutator.r(mutator.size() - 1);
        mutator.p(a0(i10));
        if (this.buffer.length == 2) {
            return null;
        }
        if (this.f12727c != mutator.getF12706c()) {
            return new u<>(0, 0, y.h(this.buffer, i10), mutator.getF12706c());
        }
        this.buffer = y.h(this.buffer, i10);
        return this;
    }

    private final u<K, V> E(int positionMask, K key, V value, y0.f owner) {
        int iQ = q(positionMask);
        if (this.f12727c != owner) {
            return new u<>(positionMask | this.dataMap, this.nodeMap, y.g(this.buffer, iQ, key, value), owner);
        }
        this.buffer = y.g(this.buffer, iQ, key, value);
        this.dataMap = positionMask | this.dataMap;
        return this;
    }

    private final u<K, V> F(int keyIndex, int positionMask, int newKeyHash, K newKey, V newValue, int shift, y0.f owner) {
        if (this.f12727c != owner) {
            return new u<>(this.dataMap ^ positionMask, positionMask | this.nodeMap, f(keyIndex, positionMask, newKeyHash, newKey, newValue, shift, owner), owner);
        }
        this.buffer = f(keyIndex, positionMask, newKeyHash, newKey, newValue, shift, owner);
        this.dataMap ^= positionMask;
        this.nodeMap |= positionMask;
        return this;
    }

    private final u<K, V> I(u<K, V> otherNode, int positionMask, int shift, DeltaCounter intersectionCounter, f<K, V> mutator) {
        if (u(positionMask)) {
            u<K, V> uVarQ = Q(R(positionMask));
            if (otherNode.u(positionMask)) {
                return uVarQ.H(otherNode.Q(otherNode.R(positionMask)), shift + 5, intersectionCounter, mutator);
            }
            if (!otherNode.t(positionMask)) {
                return uVarQ;
            }
            int iQ = otherNode.q(positionMask);
            K kW = otherNode.w(iQ);
            V vA0 = otherNode.a0(iQ);
            int size = mutator.size();
            u<K, V> uVarG = uVarQ.G(kW != null ? kW.hashCode() : 0, kW, vA0, shift + 5, mutator);
            if (mutator.size() != size) {
                return uVarG;
            }
            intersectionCounter.f(intersectionCounter.d() + 1);
            return uVarG;
        }
        if (!otherNode.u(positionMask)) {
            int iQ2 = q(positionMask);
            K kW2 = w(iQ2);
            V vA1 = a0(iQ2);
            int iQ3 = otherNode.q(positionMask);
            K kW3 = otherNode.w(iQ3);
            return x(kW2 != null ? kW2.hashCode() : 0, kW2, vA1, kW3 != null ? kW3.hashCode() : 0, kW3, otherNode.a0(iQ3), shift + 5, mutator.getF12706c());
        }
        u<K, V> uVarQ2 = otherNode.Q(otherNode.R(positionMask));
        if (t(positionMask)) {
            int iQ4 = q(positionMask);
            K kW4 = w(iQ4);
            int i10 = shift + 5;
            if (!uVarQ2.n(kW4 != null ? kW4.hashCode() : 0, kW4, i10)) {
                return uVarQ2.G(kW4 != null ? kW4.hashCode() : 0, kW4, a0(iQ4), i10, mutator);
            }
            intersectionCounter.f(intersectionCounter.d() + 1);
        }
        return uVarQ2;
    }

    private final u<K, V> L(int keyIndex, int positionMask, f<K, V> mutator) {
        mutator.r(mutator.size() - 1);
        mutator.p(a0(keyIndex));
        if (this.buffer.length == 2) {
            return null;
        }
        if (this.f12727c != mutator.getF12706c()) {
            return new u<>(positionMask ^ this.dataMap, this.nodeMap, y.h(this.buffer, keyIndex), mutator.getF12706c());
        }
        this.buffer = y.h(this.buffer, keyIndex);
        this.dataMap ^= positionMask;
        return this;
    }

    private final u<K, V> M(int nodeIndex, int positionMask, y0.f owner) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        if (this.f12727c != owner) {
            return new u<>(this.dataMap, positionMask ^ this.nodeMap, y.i(objArr, nodeIndex), owner);
        }
        this.buffer = y.i(objArr, nodeIndex);
        this.nodeMap ^= positionMask;
        return this;
    }

    private final u<K, V> N(u<K, V> targetNode, u<K, V> newNode, int nodeIndex, int positionMask, y0.f owner) {
        if (newNode == null) {
            return M(nodeIndex, positionMask, owner);
        }
        return (this.f12727c == owner || targetNode != newNode) ? O(nodeIndex, newNode, owner) : this;
    }

    private final u<K, V> O(int nodeIndex, u<K, V> newNode, y0.f owner) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1 && newNode.buffer.length == 2 && newNode.nodeMap == 0) {
            newNode.dataMap = this.nodeMap;
            return newNode;
        }
        if (this.f12727c == owner) {
            objArr[nodeIndex] = newNode;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        f0.o(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[nodeIndex] = newNode;
        return new u<>(this.dataMap, this.nodeMap, objArrCopyOf, owner);
    }

    private final u<K, V> P(int keyIndex, V value, f<K, V> mutator) {
        if (this.f12727c == mutator.getF12706c()) {
            this.buffer[keyIndex + 1] = value;
            return this;
        }
        mutator.l(mutator.getModCount() + 1);
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        f0.o(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[keyIndex + 1] = value;
        return new u<>(this.dataMap, this.nodeMap, objArrCopyOf, mutator.getF12706c());
    }

    private final u<K, V> V(int keyIndex, int positionMask) {
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        return new u<>(positionMask ^ this.dataMap, this.nodeMap, y.h(objArr, keyIndex));
    }

    private final u<K, V> W(int nodeIndex, int positionMask) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        return new u<>(this.dataMap, positionMask ^ this.nodeMap, y.i(objArr, nodeIndex));
    }

    private final u<K, V> X(u<K, V> targetNode, u<K, V> newNode, int nodeIndex, int positionMask) {
        if (newNode == null) {
            return W(nodeIndex, positionMask);
        }
        return targetNode != newNode ? Y(nodeIndex, positionMask, newNode) : this;
    }

    private final u<K, V> Y(int nodeIndex, int positionMask, u<K, V> newNode) {
        Object[] objArr = newNode.buffer;
        if (objArr.length != 2 || newNode.nodeMap != 0) {
            Object[] objArr2 = this.buffer;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            f0.o(objArrCopyOf, "copyOf(this, newSize)");
            objArrCopyOf[nodeIndex] = newNode;
            return new u<>(this.dataMap, this.nodeMap, objArrCopyOf);
        }
        if (this.buffer.length == 1) {
            newNode.dataMap = this.nodeMap;
            return newNode;
        }
        return new u<>(this.dataMap ^ positionMask, positionMask ^ this.nodeMap, y.k(this.buffer, nodeIndex, q(positionMask), objArr[0], objArr[1]));
    }

    private final u<K, V> Z(int keyIndex, V value) {
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        f0.o(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[keyIndex + 1] = value;
        return new u<>(this.dataMap, this.nodeMap, objArrCopyOf);
    }

    private final void a(yh.s<? super u<K, V>, ? super Integer, ? super Integer, ? super Integer, ? super Integer, b2> sVar, int i10, int i11) {
        sVar.N0(this, Integer.valueOf(i11), Integer.valueOf(i10), Integer.valueOf(this.dataMap), Integer.valueOf(this.nodeMap));
        int i12 = this.nodeMap;
        while (i12 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i12);
            Q(R(iLowestOneBit)).a(sVar, (Integer.numberOfTrailingZeros(iLowestOneBit) << i11) + i10, i11 + 5);
            i12 -= iLowestOneBit;
        }
    }

    private final V a0(int keyIndex) {
        return (V) this.buffer[keyIndex + 1];
    }

    private final b<K, V> d() {
        return new b<>(this, 1);
    }

    private final b<K, V> e() {
        return new b<>(this, 0);
    }

    private final Object[] f(int keyIndex, int positionMask, int newKeyHash, K newKey, V newValue, int shift, y0.f owner) {
        K kW = w(keyIndex);
        return y.j(this.buffer, keyIndex, R(positionMask) + 1, x(kW != null ? kW.hashCode() : 0, kW, a0(keyIndex), newKeyHash, newKey, newValue, shift + 5, owner));
    }

    private final int g() {
        if (this.nodeMap == 0) {
            return this.buffer.length / 2;
        }
        int iBitCount = Integer.bitCount(this.dataMap);
        int length = this.buffer.length;
        for (int i10 = iBitCount * 2; i10 < length; i10++) {
            iBitCount += Q(i10).g();
        }
        return iBitCount;
    }

    private final boolean h(K key) {
        fi.j jVarB1 = fi.u.B1(fi.u.W1(0, this.buffer.length), 2);
        int iH = jVarB1.h();
        int i10 = jVarB1.i();
        int iJ = jVarB1.j();
        if ((iJ > 0 && iH <= i10) || (iJ < 0 && i10 <= iH)) {
            while (!f0.g(key, this.buffer[iH])) {
                if (iH != i10) {
                    iH += iJ;
                }
            }
            return true;
        }
        return false;
    }

    private final V i(K key) {
        fi.j jVarB1 = fi.u.B1(fi.u.W1(0, this.buffer.length), 2);
        int iH = jVarB1.h();
        int i10 = jVarB1.i();
        int iJ = jVarB1.j();
        if ((iJ <= 0 || iH > i10) && (iJ >= 0 || i10 > iH)) {
            return null;
        }
        while (!f0.g(key, w(iH))) {
            if (iH == i10) {
                return null;
            }
            iH += iJ;
        }
        return a0(iH);
    }

    private final b<K, V> j(K key, V value) {
        fi.j jVarB1 = fi.u.B1(fi.u.W1(0, this.buffer.length), 2);
        int iH = jVarB1.h();
        int i10 = jVarB1.i();
        int iJ = jVarB1.j();
        if ((iJ > 0 && iH <= i10) || (iJ < 0 && i10 <= iH)) {
            while (!f0.g(key, w(iH))) {
                if (iH != i10) {
                    iH += iJ;
                }
            }
            if (value == a0(iH)) {
                return null;
            }
            Object[] objArr = this.buffer;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            f0.o(objArrCopyOf, "copyOf(this, size)");
            objArrCopyOf[iH + 1] = value;
            return new u(0, 0, objArrCopyOf).e();
        }
        return new u(0, 0, y.g(this.buffer, 0, key, value)).d();
    }

    private final u<K, V> k(K key) {
        fi.j jVarB1 = fi.u.B1(fi.u.W1(0, this.buffer.length), 2);
        int iH = jVarB1.h();
        int i10 = jVarB1.i();
        int iJ = jVarB1.j();
        if ((iJ > 0 && iH <= i10) || (iJ < 0 && i10 <= iH)) {
            while (!f0.g(key, w(iH))) {
                if (iH != i10) {
                    iH += iJ;
                }
            }
            return m(iH);
        }
        return this;
    }

    private final u<K, V> l(K key, V value) {
        fi.j jVarB1 = fi.u.B1(fi.u.W1(0, this.buffer.length), 2);
        int iH = jVarB1.h();
        int i10 = jVarB1.i();
        int iJ = jVarB1.j();
        if ((iJ > 0 && iH <= i10) || (iJ < 0 && i10 <= iH)) {
            while (true) {
                if (f0.g(key, w(iH)) && f0.g(value, a0(iH))) {
                    return m(iH);
                }
                if (iH != i10) {
                    iH += iJ;
                }
            }
        }
        return this;
    }

    private final u<K, V> m(int i10) {
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        return new u<>(0, 0, y.h(objArr, i10));
    }

    private final boolean o(u<K, V> otherNode) {
        if (this == otherNode) {
            return true;
        }
        if (this.nodeMap != otherNode.nodeMap || this.dataMap != otherNode.dataMap) {
            return false;
        }
        int length = this.buffer.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.buffer[i10] != otherNode.buffer[i10]) {
                return false;
            }
        }
        return true;
    }

    private final boolean u(int positionMask) {
        return (positionMask & this.nodeMap) != 0;
    }

    private final u<K, V> v(int positionMask, K key, V value) {
        return new u<>(positionMask | this.dataMap, this.nodeMap, y.g(this.buffer, q(positionMask), key, value));
    }

    private final K w(int keyIndex) {
        return (K) this.buffer[keyIndex];
    }

    private final u<K, V> x(int keyHash1, K key1, V value1, int keyHash2, K key2, V value2, int shift, y0.f owner) {
        if (shift > 30) {
            return new u<>(0, 0, new Object[]{key1, value1, key2, value2}, owner);
        }
        int iF = y.f(keyHash1, shift);
        int iF2 = y.f(keyHash2, shift);
        if (iF != iF2) {
            return new u<>((1 << iF) | (1 << iF2), 0, iF < iF2 ? new Object[]{key1, value1, key2, value2} : new Object[]{key2, value2, key1, value1}, owner);
        }
        return new u<>(0, 1 << iF, new Object[]{x(keyHash1, key1, value1, keyHash2, key2, value2, shift + 5, owner)}, owner);
    }

    private final u<K, V> y(int keyIndex, int positionMask, int newKeyHash, K newKey, V newValue, int shift) {
        return new u<>(this.dataMap ^ positionMask, positionMask | this.nodeMap, f(keyIndex, positionMask, newKeyHash, newKey, newValue, shift, null));
    }

    private final u<K, V> z(K key, V value, f<K, V> mutator) {
        fi.j jVarB1 = fi.u.B1(fi.u.W1(0, this.buffer.length), 2);
        int iH = jVarB1.h();
        int i10 = jVarB1.i();
        int iJ = jVarB1.j();
        if ((iJ > 0 && iH <= i10) || (iJ < 0 && i10 <= iH)) {
            while (!f0.g(key, w(iH))) {
                if (iH != i10) {
                    iH += iJ;
                }
            }
            mutator.p(a0(iH));
            if (this.f12727c == mutator.getF12706c()) {
                this.buffer[iH + 1] = value;
                return this;
            }
            mutator.l(mutator.getModCount() + 1);
            Object[] objArr = this.buffer;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            f0.o(objArrCopyOf, "copyOf(this, size)");
            objArrCopyOf[iH + 1] = value;
            return new u<>(0, 0, objArrCopyOf, mutator.getF12706c());
        }
        mutator.r(mutator.size() + 1);
        return new u<>(0, 0, y.g(this.buffer, 0, key, value), mutator.getF12706c());
    }

    @dl.d
    public final u<K, V> G(int keyHash, K key, V value, int shift, @dl.d f<K, V> mutator) {
        f0.p(mutator, "mutator");
        int iF = 1 << y.f(keyHash, shift);
        if (t(iF)) {
            int iQ = q(iF);
            if (f0.g(key, w(iQ))) {
                mutator.p(a0(iQ));
                return a0(iQ) == value ? this : P(iQ, value, mutator);
            }
            mutator.r(mutator.size() + 1);
            return F(iQ, iF, keyHash, key, value, shift, mutator.getF12706c());
        }
        if (!u(iF)) {
            mutator.r(mutator.size() + 1);
            return E(iF, key, value, mutator.getF12706c());
        }
        int iR = R(iF);
        u<K, V> uVarQ = Q(iR);
        u<K, V> uVarZ = shift == 30 ? uVarQ.z(key, value, mutator) : uVarQ.G(keyHash, key, value, shift + 5, mutator);
        return uVarQ == uVarZ ? this : O(iR, uVarZ, mutator.getF12706c());
    }

    @dl.d
    public final u<K, V> H(@dl.d u<K, V> otherNode, int shift, @dl.d DeltaCounter intersectionCounter, @dl.d f<K, V> mutator) {
        f0.p(otherNode, "otherNode");
        f0.p(intersectionCounter, "intersectionCounter");
        f0.p(mutator, "mutator");
        if (this == otherNode) {
            intersectionCounter.e(g());
            return this;
        }
        if (shift > 30) {
            return A(otherNode, intersectionCounter, mutator.getF12706c());
        }
        int i10 = this.nodeMap | otherNode.nodeMap;
        int i11 = this.dataMap;
        int i12 = otherNode.dataMap;
        int i13 = (i11 ^ i12) & (~i10);
        int i14 = i11 & i12;
        int i15 = i13;
        while (i14 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i14);
            if (f0.g(w(q(iLowestOneBit)), otherNode.w(otherNode.q(iLowestOneBit)))) {
                i15 |= iLowestOneBit;
            } else {
                i10 |= iLowestOneBit;
            }
            i14 ^= iLowestOneBit;
        }
        int i16 = 0;
        if (!((i10 & i15) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        u<K, V> uVar = (f0.g(this.f12727c, mutator.getF12706c()) && this.dataMap == i15 && this.nodeMap == i10) ? this : new u<>(i15, i10, new Object[(Integer.bitCount(i15) * 2) + Integer.bitCount(i10)]);
        int i17 = i10;
        int i18 = 0;
        while (i17 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i17);
            Object[] objArr = uVar.buffer;
            objArr[(objArr.length - 1) - i18] = I(otherNode, iLowestOneBit2, shift, intersectionCounter, mutator);
            i18++;
            i17 ^= iLowestOneBit2;
        }
        while (i15 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i15);
            int i19 = i16 * 2;
            if (otherNode.t(iLowestOneBit3)) {
                int iQ = otherNode.q(iLowestOneBit3);
                uVar.buffer[i19] = otherNode.w(iQ);
                uVar.buffer[i19 + 1] = otherNode.a0(iQ);
                if (t(iLowestOneBit3)) {
                    intersectionCounter.f(intersectionCounter.d() + 1);
                }
            } else {
                int iQ2 = q(iLowestOneBit3);
                uVar.buffer[i19] = w(iQ2);
                uVar.buffer[i19 + 1] = a0(iQ2);
            }
            i16++;
            i15 ^= iLowestOneBit3;
        }
        if (o(uVar)) {
            return this;
        }
        return otherNode.o(uVar) ? otherNode : uVar;
    }

    @dl.e
    public final u<K, V> J(int keyHash, K key, int shift, @dl.d f<K, V> mutator) {
        f0.p(mutator, "mutator");
        int iF = 1 << y.f(keyHash, shift);
        if (t(iF)) {
            int iQ = q(iF);
            return f0.g(key, w(iQ)) ? L(iQ, iF, mutator) : this;
        }
        if (!u(iF)) {
            return this;
        }
        int iR = R(iF);
        u<K, V> uVarQ = Q(iR);
        return N(uVarQ, shift == 30 ? uVarQ.B(key, mutator) : uVarQ.J(keyHash, key, shift + 5, mutator), iR, iF, mutator.getF12706c());
    }

    @dl.e
    public final u<K, V> K(int keyHash, K key, V value, int shift, @dl.d f<K, V> mutator) {
        f0.p(mutator, "mutator");
        int iF = 1 << y.f(keyHash, shift);
        if (t(iF)) {
            int iQ = q(iF);
            return (f0.g(key, w(iQ)) && f0.g(value, a0(iQ))) ? L(iQ, iF, mutator) : this;
        }
        if (!u(iF)) {
            return this;
        }
        int iR = R(iF);
        u<K, V> uVarQ = Q(iR);
        return N(uVarQ, shift == 30 ? uVarQ.C(key, value, mutator) : uVarQ.K(keyHash, key, value, shift + 5, mutator), iR, iF, mutator.getF12706c());
    }

    @dl.d
    public final u<K, V> Q(int nodeIndex) {
        Object obj = this.buffer[nodeIndex];
        f0.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (u) obj;
    }

    public final int R(int positionMask) {
        return (this.buffer.length - 1) - Integer.bitCount((positionMask - 1) & this.nodeMap);
    }

    @dl.e
    public final b<K, V> S(int keyHash, K key, V value, int shift) {
        b<K, V> bVarS;
        int iF = 1 << y.f(keyHash, shift);
        if (t(iF)) {
            int iQ = q(iF);
            if (!f0.g(key, w(iQ))) {
                return y(iQ, iF, keyHash, key, value, shift).d();
            }
            if (a0(iQ) == value) {
                return null;
            }
            return Z(iQ, value).e();
        }
        if (!u(iF)) {
            return v(iF, key, value).d();
        }
        int iR = R(iF);
        u<K, V> uVarQ = Q(iR);
        if (shift == 30) {
            bVarS = uVarQ.j(key, value);
            if (bVarS == null) {
                return null;
            }
        } else {
            bVarS = uVarQ.S(keyHash, key, value, shift + 5);
            if (bVarS == null) {
                return null;
            }
        }
        bVarS.d(Y(iR, iF, bVarS.a()));
        return bVarS;
    }

    @dl.e
    public final u<K, V> T(int keyHash, K key, int shift) {
        int iF = 1 << y.f(keyHash, shift);
        if (t(iF)) {
            int iQ = q(iF);
            return f0.g(key, w(iQ)) ? V(iQ, iF) : this;
        }
        if (!u(iF)) {
            return this;
        }
        int iR = R(iF);
        u<K, V> uVarQ = Q(iR);
        return X(uVarQ, shift == 30 ? uVarQ.k(key) : uVarQ.T(keyHash, key, shift + 5), iR, iF);
    }

    @dl.e
    public final u<K, V> U(int keyHash, K key, V value, int shift) {
        int iF = 1 << y.f(keyHash, shift);
        if (t(iF)) {
            int iQ = q(iF);
            return (f0.g(key, w(iQ)) && f0.g(value, a0(iQ))) ? V(iQ, iF) : this;
        }
        if (!u(iF)) {
            return this;
        }
        int iR = R(iF);
        u<K, V> uVarQ = Q(iR);
        return X(uVarQ, shift == 30 ? uVarQ.l(key, value) : uVarQ.U(keyHash, key, value, shift + 5), iR, iF);
    }

    public final void b(@dl.d yh.s<? super u<K, V>, ? super Integer, ? super Integer, ? super Integer, ? super Integer, b2> visitor) {
        f0.p(visitor, "visitor");
        a(visitor, 0, 0);
    }

    public final boolean n(int keyHash, K key, int shift) {
        int iF = 1 << y.f(keyHash, shift);
        if (t(iF)) {
            return f0.g(key, w(q(iF)));
        }
        if (!u(iF)) {
            return false;
        }
        u<K, V> uVarQ = Q(R(iF));
        return shift == 30 ? uVarQ.h(key) : uVarQ.n(keyHash, key, shift + 5);
    }

    public final int p() {
        return Integer.bitCount(this.dataMap);
    }

    public final int q(int positionMask) {
        return Integer.bitCount((positionMask - 1) & this.dataMap) * 2;
    }

    @dl.e
    public final V r(int keyHash, K key, int shift) {
        int iF = 1 << y.f(keyHash, shift);
        if (t(iF)) {
            int iQ = q(iF);
            if (f0.g(key, w(iQ))) {
                return a0(iQ);
            }
            return null;
        }
        if (!u(iF)) {
            return null;
        }
        u<K, V> uVarQ = Q(R(iF));
        return shift == 30 ? uVarQ.i(key) : uVarQ.r(keyHash, key, shift + 5);
    }

    @dl.d
    /* JADX INFO: renamed from: s, reason: from getter */
    public final Object[] getBuffer() {
        return this.buffer;
    }

    public final boolean t(int positionMask) {
        return (positionMask & this.dataMap) != 0;
    }
}
