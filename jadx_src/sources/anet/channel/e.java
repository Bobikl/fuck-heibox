package anet.channel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<SessionRequest, List<Session>> f29670a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ReentrantReadWriteLock f29671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ReentrantReadWriteLock.ReadLock f29672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ReentrantReadWriteLock.WriteLock f29673d;

    e() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f29671b = reentrantReadWriteLock;
        this.f29672c = reentrantReadWriteLock.readLock();
        this.f29673d = reentrantReadWriteLock.writeLock();
    }

    public Session a(SessionRequest sessionRequest, int i10) {
        this.f29672c.lock();
        try {
            List<Session> list = this.f29670a.get(sessionRequest);
            Session session = null;
            if (list != null && !list.isEmpty()) {
                for (Session session2 : list) {
                    if (session2 != null && session2.isAvailable() && (i10 == anet.channel.entity.c.f29702c || session2.f29549j.getType() == i10)) {
                        session = session2;
                        break;
                    }
                }
                return session;
            }
            return null;
        } finally {
            this.f29672c.unlock();
        }
    }

    public List<SessionRequest> a() {
        List<SessionRequest> list = Collections.EMPTY_LIST;
        this.f29672c.lock();
        try {
            return this.f29670a.isEmpty() ? list : new ArrayList(this.f29670a.keySet());
        } finally {
            this.f29672c.unlock();
        }
    }

    public List<Session> a(SessionRequest sessionRequest) {
        this.f29672c.lock();
        try {
            List<Session> list = this.f29670a.get(sessionRequest);
            return list != null ? new ArrayList(list) : Collections.EMPTY_LIST;
        } finally {
            this.f29672c.unlock();
        }
    }

    public void a(SessionRequest sessionRequest, Session session) {
        if (sessionRequest == null || sessionRequest.a() == null || session == null) {
            return;
        }
        this.f29673d.lock();
        try {
            List<Session> arrayList = this.f29670a.get(sessionRequest);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f29670a.put(sessionRequest, arrayList);
            }
            if (arrayList.indexOf(session) != -1) {
                return;
            }
            arrayList.add(session);
            Collections.sort(arrayList);
        } finally {
            this.f29673d.unlock();
        }
    }

    public void b(SessionRequest sessionRequest, Session session) {
        this.f29673d.lock();
        try {
            List<Session> list = this.f29670a.get(sessionRequest);
            if (list == null) {
                return;
            }
            list.remove(session);
            if (list.size() == 0) {
                this.f29670a.remove(sessionRequest);
            }
        } finally {
            this.f29673d.unlock();
        }
    }

    public boolean c(SessionRequest sessionRequest, Session session) {
        this.f29672c.lock();
        try {
            List<Session> list = this.f29670a.get(sessionRequest);
            boolean z10 = false;
            if (list != null && list.indexOf(session) != -1) {
                z10 = true;
            }
            return z10;
        } finally {
            this.f29672c.unlock();
        }
    }
}
