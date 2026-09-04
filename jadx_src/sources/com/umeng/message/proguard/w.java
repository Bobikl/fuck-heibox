package com.umeng.message.proguard;

import android.text.TextUtils;
import com.umeng.message.entity.UMessage;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes4.dex */
public class w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile w f105905b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedList<ac> f105906a = new LinkedList<>();

    private w() {
    }

    public static w a() {
        if (f105905b == null) {
            synchronized (w.class) {
                if (f105905b == null) {
                    f105905b = new w();
                }
            }
        }
        return f105905b;
    }

    public final ac a(String str) {
        synchronized (this.f105906a) {
            for (ac acVar : this.f105906a) {
                UMessage uMessage = acVar.f105670b;
                if (uMessage != null && TextUtils.equals(str, uMessage.getMsgId())) {
                    return acVar;
                }
            }
            return null;
        }
    }

    public final void a(ac acVar) {
        synchronized (this.f105906a) {
            this.f105906a.addLast(acVar);
        }
    }

    public final ac b() {
        ac acVarPollFirst;
        synchronized (this.f105906a) {
            acVarPollFirst = this.f105906a.pollFirst();
        }
        return acVarPollFirst;
    }

    public final void b(ac acVar) {
        synchronized (this.f105906a) {
            this.f105906a.remove(acVar);
        }
    }

    public final int c() {
        int size;
        synchronized (this.f105906a) {
            size = this.f105906a.size();
        }
        return size;
    }
}
