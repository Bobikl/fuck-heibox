package com.max.hbcommon.analytics;

import android.content.Context;
import androidx.room.RoomDatabase;
import androidx.room.t1;
import com.max.hbcommon.bean.analytics.PageEventEntity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: EventDataBase.kt */
/* JADX INFO: loaded from: classes9.dex */
@androidx.room.i(entities = {PageEventEntity.class}, exportSchema = false, version = 2)
public abstract class EventDataBase extends RoomDatabase {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    public static final a f66502q = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.e
    private static volatile EventDataBase f66503r;

    /* JADX INFO: compiled from: EventDataBase.kt */
    @t0({"SMAP\nEventDataBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventDataBase.kt\ncom/max/hbcommon/analytics/EventDataBase$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n1#2:50\n*E\n"})
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.hbcommon.analytics.EventDataBase$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: EventDataBase.kt */
        public static final class C0534a extends RoomDatabase.b {
            public static ChangeQuickRedirect changeQuickRedirect;

            C0534a() {
            }

            @Override // androidx.room.RoomDatabase.b
            public void a(@dl.d j3.g db2) {
                if (PatchProxy.proxy(new Object[]{db2}, this, changeQuickRedirect, false, bb.c.b.Hr, new Class[]{j3.g.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(db2, "db");
                super.a(db2);
                com.max.heybox.hblog.g.f74531b.q("EventDataBase, onCreate");
            }

            @Override // androidx.room.RoomDatabase.b
            public void c(@dl.d j3.g db2) {
                if (PatchProxy.proxy(new Object[]{db2}, this, changeQuickRedirect, false, bb.c.b.Gr, new Class[]{j3.g.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(db2, "db");
                super.c(db2);
                com.max.heybox.hblog.g.f74531b.q("EventDataBase, onOpen");
            }
        }

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        private final EventDataBase a(Context context) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.b.Fr, new Class[]{Context.class}, EventDataBase.class);
            return patchProxyResultProxy.isSupported ? (EventDataBase) patchProxyResultProxy.result : (EventDataBase) t1.a(context, EventDataBase.class, c.f66537a).n().e().b(new C0534a()).f();
        }

        @dl.d
        public final EventDataBase b(@dl.d Context context) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.b.Er, new Class[]{Context.class}, EventDataBase.class);
            if (patchProxyResultProxy.isSupported) {
                return (EventDataBase) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            EventDataBase eventDataBase = EventDataBase.f66503r;
            if (eventDataBase == null) {
                synchronized (this) {
                    eventDataBase = EventDataBase.f66503r;
                    if (eventDataBase == null) {
                        EventDataBase eventDataBaseA = EventDataBase.f66502q.a(context);
                        EventDataBase.f66503r = eventDataBaseA;
                        eventDataBase = eventDataBaseA;
                    }
                }
            }
            return eventDataBase;
        }
    }

    @dl.d
    public abstract com.max.hbcommon.analytics.a S();
}
