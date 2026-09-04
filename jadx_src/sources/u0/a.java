package u0;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.taobao.aranger.constant.Constants;
import com.umeng.analytics.pro.ak;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b2;
import kotlin.collections.m;
import kotlin.collections.s0;
import kotlin.collections.x;
import kotlin.jvm.internal.f0;
import kotlin.k;
import kotlin.text.StringsKt___StringsKt;
import yh.l;

/* JADX INFO: compiled from: extensions.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0082\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a<\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0080\bø\u0001\u0000\u001a<\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0080\bø\u0001\u0000\u001aV\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u000b*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f2\u001e\u0010\u0005\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\u0012\u0004\u0012\u00020\u00040\u0002H\u0080\bø\u0001\u0000\u001a.\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0011\u001a\u00028\u0000H\u0080\n¢\u0006\u0004\b\u0012\u0010\u0013\u001a.\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0011\u001a\u00028\u0000H\u0080\n¢\u0006\u0004\b\u0014\u0010\u0013\u001a-\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0080\u0002\u001a6\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00102\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0018H\u0080\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a-\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0080\u0002\u001a-\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0080\u0002\u001a6\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00102\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0018H\u0080\u0002¢\u0006\u0004\b\u001e\u0010\u001a\u001a-\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0080\u0002\u001a.\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0011\u001a\u00028\u0000H\u0080\n¢\u0006\u0004\b \u0010!\u001a.\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0011\u001a\u00028\u0000H\u0080\n¢\u0006\u0004\b\"\u0010!\u001a-\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0080\u0002\u001a6\u0010\u0000\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00072\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0018H\u0080\u0002¢\u0006\u0004\b\u0000\u0010$\u001a-\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0080\u0002\u001a-\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0080\u0002\u001a6\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00072\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0018H\u0080\u0002¢\u0006\u0004\b'\u0010$\u001a-\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0080\u0002\u001a.\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0011\u001a\u00028\u0000H\u0080\n¢\u0006\u0004\b)\u0010*\u001a.\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0011\u001a\u00028\u0000H\u0080\n¢\u0006\u0004\b+\u0010*\u001a-\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0080\u0002\u001a6\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0018H\u0080\u0002¢\u0006\u0004\b-\u0010.\u001a-\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0080\u0002\u001a-\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0080\u0002\u001a6\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0018H\u0080\u0002¢\u0006\u0004\b1\u0010.\u001a-\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0080\u0002\u001a-\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0080\u0004\u001a-\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0080\u0004\u001aG\u00107\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u000b*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f2\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000105H\u0080\n\u001aM\u00109\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u000b*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f2\u0018\u00108\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001050\u0015H\u0080\n\u001aV\u0010:\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u000b*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f2\u001a\u00108\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001050\u0018H\u0080\n¢\u0006\u0004\b:\u0010;\u001aM\u0010<\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u000b*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f2\u0018\u00108\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001050\u001bH\u0080\n\u001aI\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u000b*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f2\u0014\u0010>\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010=H\u0080\n\u001aH\u0010?\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u000b*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f2\u0014\u0010>\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010=H\u0000\u001aL\u0010@\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u000b*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f2\u0018\u00108\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001050\u0015H\u0000\u001aU\u0010A\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u000b*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f2\u001a\u00108\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001050\u0018H\u0000¢\u0006\u0004\bA\u0010;\u001aL\u0010B\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u000b*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f2\u0018\u00108\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001050\u001bH\u0000\u001aB\u0010D\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u000b*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f2\u0006\u0010C\u001a\u00028\u0000H\u0080\u0002¢\u0006\u0004\bD\u0010E\u001aA\u0010G\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u000b*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f2\f\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0080\u0002\u001aJ\u0010H\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u000b*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f2\u000e\u0010F\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0018H\u0080\u0002¢\u0006\u0004\bH\u0010I\u001aA\u0010J\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u000b*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f2\f\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0080\u0002\u001a/\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u000f2\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0018\"\u00028\u0000H\u0000¢\u0006\u0004\bK\u0010L\u001a\u0014\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u000fH\u0000\u001a/\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u000f2\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0018\"\u00028\u0000H\u0000¢\u0006\u0004\bN\u0010O\u001a\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u000fH\u0000\u001a/\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u000f2\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0018\"\u00028\u0000H\u0000¢\u0006\u0004\bP\u0010O\u001a\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u000fH\u0000\u001aS\u0010Q\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u000b2*\u00108\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001050\u0018\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000105H\u0000¢\u0006\u0004\bQ\u0010R\u001a \u0010S\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u000bH\u0000\u001aS\u0010T\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u000b2*\u00108\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001050\u0018\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000105H\u0000¢\u0006\u0004\bT\u0010R\u001a \u0010U\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u000bH\u0000\u001a/\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u000f2\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0018\"\u00028\u0000H\u0001¢\u0006\u0004\bV\u0010L\u001a\u0014\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u000fH\u0001\u001a/\u0010X\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u000f2\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0018\"\u00028\u0000H\u0001¢\u0006\u0004\bX\u0010O\u001a\u0014\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u000fH\u0001\u001a/\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u000f2\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0018\"\u00028\u0000H\u0001¢\u0006\u0004\bZ\u0010O\u001aS\u0010[\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u000b2*\u00108\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001050\u0018\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000105H\u0001¢\u0006\u0004\b[\u0010R\u001aS\u0010\\\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u000b2*\u00108\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001050\u0018\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000105H\u0001¢\u0006\u0004\b\\\u0010R\u001a\u001e\u0010^\u001a\b\u0012\u0004\u0012\u00028\u00000]\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0000\u001a\u001e\u0010_\u001a\b\u0012\u0004\u0012\u00028\u00000]\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0000\u001a\u0012\u0010b\u001a\b\u0012\u0004\u0012\u00020a0]*\u00020`H\u0000\u001a\u001e\u0010c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0000\u001a\u001e\u0010d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0000\u001a\u0012\u0010e\u001a\b\u0012\u0004\u0012\u00020a0\u0007*\u00020`H\u0000\u001a\u001e\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0000\u001a\u001e\u0010h\u001a\b\u0012\u0004\u0012\u00028\u00000f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0000\u001a\u0012\u0010i\u001a\b\u0012\u0004\u0012\u00020a0\u0001*\u00020`H\u0000\u001a\u001e\u0010j\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0000\u001a\u001e\u0010k\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0000\u001a\u0012\u0010l\u001a\b\u0012\u0004\u0012\u00020a0\u0001*\u00020`H\u0000\u001a\u001e\u0010m\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0000\u001a\u001e\u0010n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0000\u001a\u0012\u0010o\u001a\b\u0012\u0004\u0012\u00020a0\u0001*\u00020`H\u0000\u001a0\u0010q\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010p\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u000b*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010=H\u0000\u001a0\u0010r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u000b*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010=H\u0000\u001a0\u0010s\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u000b*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010=H\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006t"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lu0/j;", "Lkotlin/Function1;", "", "Lkotlin/b2;", "mutator", "B", "Lu0/h;", "", ak.aD, "K", androidx.exifinterface.media.a.X4, "Lu0/i;", "", androidx.exifinterface.media.a.W4, androidx.exifinterface.media.a.S4, "Lu0/g;", "element", "N", "(Lu0/g;Ljava/lang/Object;)Lu0/g;", "k", "", "elements", "M", "", "P", "(Lu0/g;[Ljava/lang/Object;)Lu0/g;", "Lkotlin/sequences/m;", "O", "j", "m", "l", "R", "(Lu0/h;Ljava/lang/Object;)Lu0/h;", "o", "Q", "(Lu0/h;[Ljava/lang/Object;)Lu0/h;", androidx.exifinterface.media.a.R4, "n", "q", "p", "a0", "(Lu0/j;Ljava/lang/Object;)Lu0/j;", RXScreenCaptureService.KEY_WIDTH, "Z", "c0", "(Lu0/j;[Ljava/lang/Object;)Lu0/j;", "b0", "v", "y", "x", "i", RXScreenCaptureService.KEY_HEIGHT, "Lkotlin/Pair;", "pair", androidx.exifinterface.media.a.T4, "pairs", "U", "Y", "(Lu0/i;[Lkotlin/Pair;)Lu0/i;", "X", "", "map", "e0", "d0", "g0", "f0", "key", ak.aB, "(Lu0/i;Ljava/lang/Object;)Lu0/i;", Constants.PARAM_KEYS, "r", ak.aG, "(Lu0/i;[Ljava/lang/Object;)Lu0/i;", "t", "H", "([Ljava/lang/Object;)Lu0/h;", "G", "L", "([Ljava/lang/Object;)Lu0/j;", "F", "J", "([Lkotlin/Pair;)Lu0/i;", "I", "D", "C", "d", ak.aF, "g", "f", "b", "e", ak.av, "Lu0/d;", "i0", "j0", "", "", "h0", "t0", "u0", "s0", "Lu0/f;", "l0", "m0", "n0", "x0", "y0", "w0", "q0", "r0", "p0", "Lu0/e;", "k0", "v0", "o0", "runtime_release"}, k = 2, mv = {1, 7, 1})
public final class a {
    @dl.d
    public static final <K, V> i<K, V> A(@dl.d i<? extends K, ? extends V> iVar, @dl.d l<? super Map<K, V>, b2> mutator) {
        f0.p(iVar, "<this>");
        f0.p(mutator, "mutator");
        i.a<? extends K, ? extends V> aVarBuilder = iVar.builder();
        mutator.invoke(aVarBuilder);
        return aVarBuilder.build();
    }

    @dl.d
    public static final <T> j<T> B(@dl.d j<? extends T> jVar, @dl.d l<? super Set<T>, b2> mutator) {
        f0.p(jVar, "<this>");
        f0.p(mutator, "mutator");
        j.a<? extends T> aVarBuilder = jVar.builder();
        mutator.invoke(aVarBuilder);
        return aVarBuilder.build();
    }

    @dl.d
    public static final <K, V> i<K, V> C() {
        return androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d.INSTANCE.a();
    }

    @dl.d
    public static final <K, V> i<K, V> D(@dl.d Pair<? extends K, ? extends V>... pairs) {
        f0.p(pairs, "pairs");
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<K, V> dVarA = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d.INSTANCE.a();
        f0.n(dVarA, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        i.a<K, V> aVarBuilder = dVarA.builder();
        s0.y0(aVarBuilder, pairs);
        return aVarBuilder.build();
    }

    @dl.d
    public static final <E> j<E> E() {
        return androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.a.INSTANCE.a();
    }

    @dl.d
    public static final <E> j<E> F(@dl.d E... elements) {
        f0.p(elements, "elements");
        return androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.a.INSTANCE.a().addAll((Collection) m.t(elements));
    }

    @dl.d
    public static final <E> h<E> G() {
        return androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.j.b();
    }

    @dl.d
    public static final <E> h<E> H(@dl.d E... elements) {
        f0.p(elements, "elements");
        return androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.j.b().addAll((Collection) m.t(elements));
    }

    @dl.d
    public static final <K, V> i<K, V> I() {
        return w0.c.f140924h.a();
    }

    @dl.d
    public static final <K, V> i<K, V> J(@dl.d Pair<? extends K, ? extends V>... pairs) {
        f0.p(pairs, "pairs");
        w0.c<K, V> cVarA = w0.c.f140924h.a();
        f0.n(cVarA, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        i.a<K, V> aVarBuilder = cVarA.builder();
        s0.y0(aVarBuilder, pairs);
        return aVarBuilder.build();
    }

    @dl.d
    public static final <E> j<E> K() {
        return x0.b.f141048f.a();
    }

    @dl.d
    public static final <E> j<E> L(@dl.d E... elements) {
        f0.p(elements, "elements");
        return x0.b.f141048f.a().addAll((Collection) m.t(elements));
    }

    @dl.d
    public static final <E> g<E> M(@dl.d g<? extends E> gVar, @dl.d Iterable<? extends E> elements) {
        f0.p(gVar, "<this>");
        f0.p(elements, "elements");
        if (elements instanceof Collection) {
            return gVar.addAll((Collection<? extends Object>) elements);
        }
        g.a<? extends E> aVarBuilder = gVar.builder();
        x.n0(aVarBuilder, elements);
        return aVarBuilder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final <E> g<E> N(@dl.d g<? extends E> gVar, E e10) {
        f0.p(gVar, "<this>");
        return gVar.add((Object) e10);
    }

    @dl.d
    public static final <E> g<E> O(@dl.d g<? extends E> gVar, @dl.d kotlin.sequences.m<? extends E> elements) {
        f0.p(gVar, "<this>");
        f0.p(elements, "elements");
        g.a<? extends E> aVarBuilder = gVar.builder();
        x.o0(aVarBuilder, elements);
        return aVarBuilder.build();
    }

    @dl.d
    public static final <E> g<E> P(@dl.d g<? extends E> gVar, @dl.d E[] elements) {
        f0.p(gVar, "<this>");
        f0.p(elements, "elements");
        g.a<? extends E> aVarBuilder = gVar.builder();
        x.p0(aVarBuilder, elements);
        return aVarBuilder.build();
    }

    @dl.d
    public static final <E> h<E> Q(@dl.d h<? extends E> hVar, @dl.d Iterable<? extends E> elements) {
        f0.p(hVar, "<this>");
        f0.p(elements, "elements");
        if (elements instanceof Collection) {
            return hVar.addAll((Collection<? extends Object>) elements);
        }
        h.a<? extends E> aVarBuilder = hVar.builder();
        x.n0(aVarBuilder, elements);
        return aVarBuilder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final <E> h<E> R(@dl.d h<? extends E> hVar, E e10) {
        f0.p(hVar, "<this>");
        return hVar.add((Object) e10);
    }

    @dl.d
    public static final <E> h<E> S(@dl.d h<? extends E> hVar, @dl.d kotlin.sequences.m<? extends E> elements) {
        f0.p(hVar, "<this>");
        f0.p(elements, "elements");
        h.a<? extends E> aVarBuilder = hVar.builder();
        x.o0(aVarBuilder, elements);
        return aVarBuilder.build();
    }

    @dl.d
    public static final <E> h<E> T(@dl.d h<? extends E> hVar, @dl.d E[] elements) {
        f0.p(hVar, "<this>");
        f0.p(elements, "elements");
        h.a<? extends E> aVarBuilder = hVar.builder();
        x.p0(aVarBuilder, elements);
        return aVarBuilder.build();
    }

    @dl.d
    public static final <K, V> i<K, V> U(@dl.d i<? extends K, ? extends V> iVar, @dl.d Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        f0.p(iVar, "<this>");
        f0.p(pairs, "pairs");
        return d0(iVar, pairs);
    }

    @dl.d
    public static final <K, V> i<K, V> V(@dl.d i<? extends K, ? extends V> iVar, @dl.d Map<? extends K, ? extends V> map) {
        f0.p(iVar, "<this>");
        f0.p(map, "map");
        return e0(iVar, map);
    }

    @dl.d
    public static final <K, V> i<K, V> W(@dl.d i<? extends K, ? extends V> iVar, @dl.d Pair<? extends K, ? extends V> pair) {
        f0.p(iVar, "<this>");
        f0.p(pair, "pair");
        return iVar.put((Object) pair.e(), (Object) pair.f());
    }

    @dl.d
    public static final <K, V> i<K, V> X(@dl.d i<? extends K, ? extends V> iVar, @dl.d kotlin.sequences.m<? extends Pair<? extends K, ? extends V>> pairs) {
        f0.p(iVar, "<this>");
        f0.p(pairs, "pairs");
        return f0(iVar, pairs);
    }

    @dl.d
    public static final <K, V> i<K, V> Y(@dl.d i<? extends K, ? extends V> iVar, @dl.d Pair<? extends K, ? extends V>[] pairs) {
        f0.p(iVar, "<this>");
        f0.p(pairs, "pairs");
        return g0(iVar, pairs);
    }

    @dl.d
    public static final <E> j<E> Z(@dl.d j<? extends E> jVar, @dl.d Iterable<? extends E> elements) {
        f0.p(jVar, "<this>");
        f0.p(elements, "elements");
        if (elements instanceof Collection) {
            return jVar.addAll((Collection<? extends Object>) elements);
        }
        j.a<? extends E> aVarBuilder = jVar.builder();
        x.n0(aVarBuilder, elements);
        return aVarBuilder.build();
    }

    @dl.d
    @k(message = "Use persistentHashMapOf instead.", replaceWith = @kotlin.s0(expression = "persistentHashMapOf(*pairs)", imports = {}))
    public static final <K, V> i<K, V> a(@dl.d Pair<? extends K, ? extends V>... pairs) {
        f0.p(pairs, "pairs");
        return D((Pair[]) Arrays.copyOf(pairs, pairs.length));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final <E> j<E> a0(@dl.d j<? extends E> jVar, E e10) {
        f0.p(jVar, "<this>");
        return jVar.add((Object) e10);
    }

    @dl.d
    @k(message = "Use persistentHashSetOf instead.", replaceWith = @kotlin.s0(expression = "persistentHashSetOf(*elements)", imports = {}))
    public static final <E> j<E> b(@dl.d E... elements) {
        f0.p(elements, "elements");
        return F(Arrays.copyOf(elements, elements.length));
    }

    @dl.d
    public static final <E> j<E> b0(@dl.d j<? extends E> jVar, @dl.d kotlin.sequences.m<? extends E> elements) {
        f0.p(jVar, "<this>");
        f0.p(elements, "elements");
        j.a<? extends E> aVarBuilder = jVar.builder();
        x.o0(aVarBuilder, elements);
        return aVarBuilder.build();
    }

    @dl.d
    @k(message = "Use persistentListOf instead.", replaceWith = @kotlin.s0(expression = "persistentListOf()", imports = {}))
    public static final <E> h<E> c() {
        return G();
    }

    @dl.d
    public static final <E> j<E> c0(@dl.d j<? extends E> jVar, @dl.d E[] elements) {
        f0.p(jVar, "<this>");
        f0.p(elements, "elements");
        j.a<? extends E> aVarBuilder = jVar.builder();
        x.p0(aVarBuilder, elements);
        return aVarBuilder.build();
    }

    @dl.d
    @k(message = "Use persistentListOf instead.", replaceWith = @kotlin.s0(expression = "persistentListOf(*elements)", imports = {}))
    public static final <E> h<E> d(@dl.d E... elements) {
        f0.p(elements, "elements");
        return H(Arrays.copyOf(elements, elements.length));
    }

    @dl.d
    public static final <K, V> i<K, V> d0(@dl.d i<? extends K, ? extends V> iVar, @dl.d Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        f0.p(iVar, "<this>");
        f0.p(pairs, "pairs");
        i.a<? extends K, ? extends V> aVarBuilder = iVar.builder();
        s0.w0(aVarBuilder, pairs);
        return aVarBuilder.build();
    }

    @dl.d
    @k(message = "Use persistentMapOf instead.", replaceWith = @kotlin.s0(expression = "persistentMapOf(*pairs)", imports = {}))
    public static final <K, V> i<K, V> e(@dl.d Pair<? extends K, ? extends V>... pairs) {
        f0.p(pairs, "pairs");
        return J((Pair[]) Arrays.copyOf(pairs, pairs.length));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final <K, V> i<K, V> e0(@dl.d i<? extends K, ? extends V> iVar, @dl.d Map<? extends K, ? extends V> map) {
        f0.p(iVar, "<this>");
        f0.p(map, "map");
        return iVar.putAll((Map<? extends Object, ? extends Object>) map);
    }

    @dl.d
    @k(message = "Use persistentSetOf instead.", replaceWith = @kotlin.s0(expression = "persistentSetOf()", imports = {}))
    public static final <E> j<E> f() {
        return K();
    }

    @dl.d
    public static final <K, V> i<K, V> f0(@dl.d i<? extends K, ? extends V> iVar, @dl.d kotlin.sequences.m<? extends Pair<? extends K, ? extends V>> pairs) {
        f0.p(iVar, "<this>");
        f0.p(pairs, "pairs");
        i.a<? extends K, ? extends V> aVarBuilder = iVar.builder();
        s0.x0(aVarBuilder, pairs);
        return aVarBuilder.build();
    }

    @dl.d
    @k(message = "Use persistentSetOf instead.", replaceWith = @kotlin.s0(expression = "persistentSetOf(*elements)", imports = {}))
    public static final <E> j<E> g(@dl.d E... elements) {
        f0.p(elements, "elements");
        return L(Arrays.copyOf(elements, elements.length));
    }

    @dl.d
    public static final <K, V> i<K, V> g0(@dl.d i<? extends K, ? extends V> iVar, @dl.d Pair<? extends K, ? extends V>[] pairs) {
        f0.p(iVar, "<this>");
        f0.p(pairs, "pairs");
        i.a<? extends K, ? extends V> aVarBuilder = iVar.builder();
        s0.y0(aVarBuilder, pairs);
        return aVarBuilder.build();
    }

    @dl.d
    public static final <E> j<E> h(@dl.d g<? extends E> gVar, @dl.d Iterable<? extends E> elements) {
        f0.p(gVar, "<this>");
        f0.p(elements, "elements");
        return i(x0(gVar), elements);
    }

    @dl.d
    public static final d<Character> h0(@dl.d CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        return s0(charSequence);
    }

    @dl.d
    public static final <E> j<E> i(@dl.d j<? extends E> jVar, @dl.d Iterable<? extends E> elements) {
        f0.p(jVar, "<this>");
        f0.p(elements, "elements");
        if (elements instanceof Collection) {
            return jVar.retainAll((Collection<? extends Object>) elements);
        }
        j.a<? extends E> aVarBuilder = jVar.builder();
        x.O0(aVarBuilder, elements);
        return aVarBuilder.build();
    }

    @dl.d
    public static final <T> d<T> i0(@dl.d Iterable<? extends T> iterable) {
        f0.p(iterable, "<this>");
        d<T> dVar = iterable instanceof d ? (d) iterable : null;
        return dVar == null ? t0(iterable) : dVar;
    }

    @dl.d
    public static final <E> g<E> j(@dl.d g<? extends E> gVar, @dl.d Iterable<? extends E> elements) {
        f0.p(gVar, "<this>");
        f0.p(elements, "elements");
        if (elements instanceof Collection) {
            return gVar.removeAll((Collection<? extends Object>) elements);
        }
        g.a<? extends E> aVarBuilder = gVar.builder();
        x.E0(aVarBuilder, elements);
        return aVarBuilder.build();
    }

    @dl.d
    public static final <T> d<T> j0(@dl.d kotlin.sequences.m<? extends T> mVar) {
        f0.p(mVar, "<this>");
        return u0(mVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final <E> g<E> k(@dl.d g<? extends E> gVar, E e10) {
        f0.p(gVar, "<this>");
        return gVar.remove((Object) e10);
    }

    @dl.d
    public static final <K, V> e<K, V> k0(@dl.d Map<K, ? extends V> map) {
        f0.p(map, "<this>");
        e<K, V> eVar = map instanceof e ? (e) map : null;
        if (eVar != null) {
            return eVar;
        }
        i.a aVar = map instanceof i.a ? (i.a) map : null;
        i<K, V> iVarBuild = aVar != null ? aVar.build() : null;
        return iVarBuild != null ? iVarBuild : I().putAll((Map) map);
    }

    @dl.d
    public static final <E> g<E> l(@dl.d g<? extends E> gVar, @dl.d kotlin.sequences.m<? extends E> elements) {
        f0.p(gVar, "<this>");
        f0.p(elements, "elements");
        g.a<? extends E> aVarBuilder = gVar.builder();
        x.G0(aVarBuilder, elements);
        return aVarBuilder.build();
    }

    @dl.d
    public static final <T> f<T> l0(@dl.d Iterable<? extends T> iterable) {
        f0.p(iterable, "<this>");
        f<T> fVar = iterable instanceof f ? (f) iterable : null;
        if (fVar != null) {
            return fVar;
        }
        j.a aVar = iterable instanceof j.a ? (j.a) iterable : null;
        j jVarBuild = aVar != null ? aVar.build() : null;
        return jVarBuild != null ? jVarBuild : Z(K(), iterable);
    }

    @dl.d
    public static final <E> g<E> m(@dl.d g<? extends E> gVar, @dl.d E[] elements) {
        f0.p(gVar, "<this>");
        f0.p(elements, "elements");
        g.a<? extends E> aVarBuilder = gVar.builder();
        x.H0(aVarBuilder, elements);
        return aVarBuilder.build();
    }

    @dl.d
    public static final <T> f<T> m0(@dl.d kotlin.sequences.m<? extends T> mVar) {
        f0.p(mVar, "<this>");
        return y0(mVar);
    }

    @dl.d
    public static final <E> h<E> n(@dl.d h<? extends E> hVar, @dl.d Iterable<? extends E> elements) {
        f0.p(hVar, "<this>");
        f0.p(elements, "elements");
        if (elements instanceof Collection) {
            return hVar.removeAll((Collection<? extends Object>) elements);
        }
        h.a<? extends E> aVarBuilder = hVar.builder();
        x.E0(aVarBuilder, elements);
        return aVarBuilder.build();
    }

    @dl.d
    public static final j<Character> n0(@dl.d CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        return w0(charSequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final <E> h<E> o(@dl.d h<? extends E> hVar, E e10) {
        f0.p(hVar, "<this>");
        return hVar.remove((Object) e10);
    }

    @dl.d
    public static final <K, V> i<K, V> o0(@dl.d Map<K, ? extends V> map) {
        f0.p(map, "<this>");
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d dVar = map instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d ? (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d) map : null;
        if (dVar != null) {
            return dVar;
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.f fVar = map instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.f ? (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.f) map : null;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<K, V> dVarBuild = fVar != null ? fVar.build() : null;
        return dVarBuild != null ? dVarBuild : androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d.INSTANCE.a().putAll((Map) map);
    }

    @dl.d
    public static final <E> h<E> p(@dl.d h<? extends E> hVar, @dl.d kotlin.sequences.m<? extends E> elements) {
        f0.p(hVar, "<this>");
        f0.p(elements, "elements");
        h.a<? extends E> aVarBuilder = hVar.builder();
        x.G0(aVarBuilder, elements);
        return aVarBuilder.build();
    }

    @dl.d
    public static final j<Character> p0(@dl.d CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        j.a aVarBuilder = E().builder();
        StringsKt___StringsKt.f9(charSequence, aVarBuilder);
        return aVarBuilder.build();
    }

    @dl.d
    public static final <E> h<E> q(@dl.d h<? extends E> hVar, @dl.d E[] elements) {
        f0.p(hVar, "<this>");
        f0.p(elements, "elements");
        h.a<? extends E> aVarBuilder = hVar.builder();
        x.H0(aVarBuilder, elements);
        return aVarBuilder.build();
    }

    @dl.d
    public static final <T> j<T> q0(@dl.d Iterable<? extends T> iterable) {
        f0.p(iterable, "<this>");
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.a aVar = iterable instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.a ? (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.a) iterable : null;
        if (aVar != null) {
            return aVar;
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.b bVar = iterable instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.b ? (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.b) iterable : null;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.a aVarBuild = bVar != null ? bVar.build() : null;
        return aVarBuild != null ? aVarBuild : Z(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.a.INSTANCE.a(), iterable);
    }

    @dl.d
    public static final <K, V> i<K, V> r(@dl.d i<? extends K, ? extends V> iVar, @dl.d Iterable<? extends K> keys) {
        f0.p(iVar, "<this>");
        f0.p(keys, "keys");
        i.a<? extends K, ? extends V> aVarBuilder = iVar.builder();
        x.E0(aVarBuilder.keySet(), keys);
        return aVarBuilder.build();
    }

    @dl.d
    public static final <T> j<T> r0(@dl.d kotlin.sequences.m<? extends T> mVar) {
        f0.p(mVar, "<this>");
        return b0(E(), mVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final <K, V> i<K, V> s(@dl.d i<? extends K, ? extends V> iVar, K k10) {
        f0.p(iVar, "<this>");
        return iVar.remove((Object) k10);
    }

    @dl.d
    public static final h<Character> s0(@dl.d CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        h.a aVarBuilder = G().builder();
        StringsKt___StringsKt.f9(charSequence, aVarBuilder);
        return aVarBuilder.build();
    }

    @dl.d
    public static final <K, V> i<K, V> t(@dl.d i<? extends K, ? extends V> iVar, @dl.d kotlin.sequences.m<? extends K> keys) {
        f0.p(iVar, "<this>");
        f0.p(keys, "keys");
        i.a<? extends K, ? extends V> aVarBuilder = iVar.builder();
        x.G0(aVarBuilder.keySet(), keys);
        return aVarBuilder.build();
    }

    @dl.d
    public static final <T> h<T> t0(@dl.d Iterable<? extends T> iterable) {
        f0.p(iterable, "<this>");
        h<T> hVar = iterable instanceof h ? (h) iterable : null;
        if (hVar != null) {
            return hVar;
        }
        h.a aVar = iterable instanceof h.a ? (h.a) iterable : null;
        h<T> hVarBuild = aVar != null ? aVar.build() : null;
        return hVarBuild == null ? Q(G(), iterable) : hVarBuild;
    }

    @dl.d
    public static final <K, V> i<K, V> u(@dl.d i<? extends K, ? extends V> iVar, @dl.d K[] keys) {
        f0.p(iVar, "<this>");
        f0.p(keys, "keys");
        i.a<? extends K, ? extends V> aVarBuilder = iVar.builder();
        x.H0(aVarBuilder.keySet(), keys);
        return aVarBuilder.build();
    }

    @dl.d
    public static final <T> h<T> u0(@dl.d kotlin.sequences.m<? extends T> mVar) {
        f0.p(mVar, "<this>");
        return S(G(), mVar);
    }

    @dl.d
    public static final <E> j<E> v(@dl.d j<? extends E> jVar, @dl.d Iterable<? extends E> elements) {
        f0.p(jVar, "<this>");
        f0.p(elements, "elements");
        if (elements instanceof Collection) {
            return jVar.removeAll((Collection<? extends Object>) elements);
        }
        j.a<? extends E> aVarBuilder = jVar.builder();
        x.E0(aVarBuilder, elements);
        return aVarBuilder.build();
    }

    @dl.d
    public static final <K, V> i<K, V> v0(@dl.d Map<K, ? extends V> map) {
        f0.p(map, "<this>");
        w0.c cVar = map instanceof w0.c ? (w0.c) map : null;
        if (cVar != null) {
            return cVar;
        }
        w0.d dVar = map instanceof w0.d ? (w0.d) map : null;
        i<K, V> iVarBuild = dVar != null ? dVar.build() : null;
        return iVarBuild == null ? w0.c.f140924h.a().putAll((Map) map) : iVarBuild;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final <E> j<E> w(@dl.d j<? extends E> jVar, E e10) {
        f0.p(jVar, "<this>");
        return jVar.remove((Object) e10);
    }

    @dl.d
    public static final j<Character> w0(@dl.d CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        j.a aVarBuilder = K().builder();
        StringsKt___StringsKt.f9(charSequence, aVarBuilder);
        return aVarBuilder.build();
    }

    @dl.d
    public static final <E> j<E> x(@dl.d j<? extends E> jVar, @dl.d kotlin.sequences.m<? extends E> elements) {
        f0.p(jVar, "<this>");
        f0.p(elements, "elements");
        j.a<? extends E> aVarBuilder = jVar.builder();
        x.G0(aVarBuilder, elements);
        return aVarBuilder.build();
    }

    @dl.d
    public static final <T> j<T> x0(@dl.d Iterable<? extends T> iterable) {
        f0.p(iterable, "<this>");
        x0.b bVar = iterable instanceof x0.b ? (x0.b) iterable : null;
        if (bVar != null) {
            return bVar;
        }
        x0.c cVar = iterable instanceof x0.c ? (x0.c) iterable : null;
        j<T> jVarBuild = cVar != null ? cVar.build() : null;
        return jVarBuild == null ? Z(x0.b.f141048f.a(), iterable) : jVarBuild;
    }

    @dl.d
    public static final <E> j<E> y(@dl.d j<? extends E> jVar, @dl.d E[] elements) {
        f0.p(jVar, "<this>");
        f0.p(elements, "elements");
        j.a<? extends E> aVarBuilder = jVar.builder();
        x.H0(aVarBuilder, elements);
        return aVarBuilder.build();
    }

    @dl.d
    public static final <T> j<T> y0(@dl.d kotlin.sequences.m<? extends T> mVar) {
        f0.p(mVar, "<this>");
        return b0(K(), mVar);
    }

    @dl.d
    public static final <T> h<T> z(@dl.d h<? extends T> hVar, @dl.d l<? super List<T>, b2> mutator) {
        f0.p(hVar, "<this>");
        f0.p(mutator, "mutator");
        h.a<? extends T> aVarBuilder = hVar.builder();
        mutator.invoke(aVarBuilder);
        return aVarBuilder.build();
    }
}
