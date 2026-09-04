package xyz.luan.audioplayers;

import androidx.core.app.o0;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.ak;
import io.flutter.plugin.common.EventChannel;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.s0;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AudioplayersPlugin.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J$\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\u000bJ$\u0010\u0010\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0011\u001a\u00020\u0006R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0015¨\u0006\u0019"}, d2 = {"Lxyz/luan/audioplayers/g;", "Lio/flutter/plugin/common/EventChannel$StreamHandler;", "", com.tekartik.sqflite.b.f98603v, "Lio/flutter/plugin/common/EventChannel$EventSink;", com.umeng.analytics.pro.d.ar, "Lkotlin/b2;", "onListen", "onCancel", "", "method", "", ak.aF, Constants.KEY_ERROR_CODE, "errorMessage", "errorDetails", "b", ak.av, "Lio/flutter/plugin/common/EventChannel;", "Lio/flutter/plugin/common/EventChannel;", "eventChannel", "Lio/flutter/plugin/common/EventChannel$EventSink;", "eventSink", "<init>", "(Lio/flutter/plugin/common/EventChannel;)V", "audioplayers_android_release"}, k = 1, mv = {1, 7, 1})
public final class g implements EventChannel.StreamHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final EventChannel eventChannel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private EventChannel.EventSink eventSink;

    public g(@dl.d EventChannel eventChannel) {
        f0.p(eventChannel, "eventChannel");
        this.eventChannel = eventChannel;
        eventChannel.setStreamHandler(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void d(g gVar, String str, Map map, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            map = new HashMap();
        }
        gVar.c(str, map);
    }

    public final void a() {
        EventChannel.EventSink eventSink = this.eventSink;
        if (eventSink != null) {
            eventSink.endOfStream();
            onCancel(null);
        }
        this.eventChannel.setStreamHandler(null);
    }

    public final void b(@dl.e String str, @dl.e String str2, @dl.e Object obj) {
        EventChannel.EventSink eventSink = this.eventSink;
        if (eventSink != null) {
            eventSink.error(str, str2, obj);
        }
    }

    public final void c(@dl.d String method, @dl.d Map<String, ? extends Object> arguments) {
        f0.p(method, "method");
        f0.p(arguments, "arguments");
        EventChannel.EventSink eventSink = this.eventSink;
        if (eventSink != null) {
            eventSink.success(s0.o0(arguments, new Pair(o0.I0, method)));
        }
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(@dl.e Object obj) {
        this.eventSink = null;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(@dl.e Object obj, @dl.e EventChannel.EventSink eventSink) {
        this.eventSink = eventSink;
    }
}
