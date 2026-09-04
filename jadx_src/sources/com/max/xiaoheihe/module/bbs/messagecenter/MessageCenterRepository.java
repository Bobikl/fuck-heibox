package com.max.xiaoheihe.module.bbs.messagecenter;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.LazyThreadSafetyMode;
import kotlin.b0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.z;

/* JADX INFO: compiled from: MessageCenterRepository.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class MessageCenterRepository {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final z f81321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final a f81318b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f81319c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final z<MessageCenterRepository> f81320d = b0.b(LazyThreadSafetyMode.SYNCHRONIZED, new yh.a<MessageCenterRepository>() { // from class: com.max.xiaoheihe.module.bbs.messagecenter.MessageCenterRepository$Companion$instance$2
        public static ChangeQuickRedirect changeQuickRedirect;

        @dl.d
        public final MessageCenterRepository a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28373, new Class[0], MessageCenterRepository.class);
            return patchProxyResultProxy.isSupported ? (MessageCenterRepository) patchProxyResultProxy.result : new MessageCenterRepository(null);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.max.xiaoheihe.module.bbs.messagecenter.MessageCenterRepository, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ MessageCenterRepository invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28374, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }
    });

    /* JADX INFO: compiled from: MessageCenterRepository.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final MessageCenterRepository a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28372, new Class[0], MessageCenterRepository.class);
            return patchProxyResultProxy.isSupported ? (MessageCenterRepository) patchProxyResultProxy.result : (MessageCenterRepository) MessageCenterRepository.f81320d.getValue();
        }
    }

    private MessageCenterRepository() {
        this.f81321a = b0.b(LazyThreadSafetyMode.SYNCHRONIZED, new yh.a<jf.c>() { // from class: com.max.xiaoheihe.module.bbs.messagecenter.MessageCenterRepository$dataSource$2
            public static ChangeQuickRedirect changeQuickRedirect;

            @dl.d
            public final jf.c a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28375, new Class[0], jf.c.class);
                return patchProxyResultProxy.isSupported ? (jf.c) patchProxyResultProxy.result : new jf.c();
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, jf.c] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ jf.c invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28376, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
    }

    public /* synthetic */ MessageCenterRepository(u uVar) {
        this();
    }

    private final jf.c b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28370, new Class[0], jf.c.class);
        return patchProxyResultProxy.isSupported ? (jf.c) patchProxyResultProxy.result : (jf.c) this.f81321a.getValue();
    }

    public final void c(@dl.d String type) {
        if (PatchProxy.proxy(new Object[]{type}, this, changeQuickRedirect, false, 28371, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(type, "type");
        b().k(type);
    }
}
