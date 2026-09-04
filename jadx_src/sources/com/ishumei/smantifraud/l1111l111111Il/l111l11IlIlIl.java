package com.ishumei.smantifraud.l1111l111111Il;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.google.android.exoplayer2.text.ttml.d;
import com.ishumei.smantifraud.AbsDetector;
import com.ishumei.smantifraud.SmAntiFraud;
import com.ishumei.smantifraud.VDataListener;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class l111l11IlIlIl {
    private static final String l1111l111111Il = "eventId";
    private static final String l111l11111I1l = "screenrecord";
    private static final String l111l11111Il = "screenshot";
    private static final String l111l11111lIl = "wevent";
    private static final String l111l1111l1Il = "gpsevent";
    private static final String l111l1111lI1l = "mem";
    private static final int l111l1111lIl = 0;
    private static final String l111l1111llIl = "textinput";
    private static final int l11l1111I11l = 2;
    private static final int l11l1111I1l = 0;
    private static final int l11l1111I1ll = 1;
    private static final int l11l1111Il = 2;
    private static final int l11l1111Il1l = 3;
    private static final int l11l1111Ill = 10;
    private static final int l11l1111lIIl = 1;
    private static l111l11IlIlIl l11l111l11Il = null;
    private static final int l11l11IlIIll = 50;
    private int l111l111lIlll;
    private final com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il<JSONObject> l111l111llIl;
    private HandlerThread l111l11IlIlIl;
    private final l11l1111I1l l11l111I111l;
    private final Handler l11l111l1I1l;
    private final HandlerThread l11l111l1Il;
    private Handler l11l111l1lll;
    private final List<AbsDetector> l11l111lI1l;
    private final int l11l111lIll;
    private final com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il<JSONObject> l11l111ll11l;
    private final com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il<JSONObject> l11l111ll1Il;
    private final com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il<JSONObject> l11l111llI1l;
    private final com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il<JSONObject> l11l111lll;
    private final com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il<JSONObject> l11l111lllIl;
    private final int l11l11l1lIl;
    private final VDataListener l11l111I11l = new VDataListener() { // from class: com.ishumei.smantifraud.l1111l111111Il.l111l11IlIlIl.2
        @Override // com.ishumei.smantifraud.VDataListener
        public final void onResult(JSONObject jSONObject, boolean z10) {
            synchronized (l111l11IlIlIl.class) {
                l111l11IlIlIl.l111l11111lIl(l111l11IlIlIl.this, jSONObject, z10);
            }
        }
    };
    private final Runnable l111l111I1l = new Runnable() { // from class: com.ishumei.smantifraud.l1111l111111Il.l111l11IlIlIl.3
        @Override // java.lang.Runnable
        public final void run() {
            try {
                l111l11IlIlIl.this.l11l111l1lll.postDelayed(l111l11IlIlIl.this.l111l111I1l, l111l11IlIlIl.this.l11l11l1lIl);
                l111l11IlIlIl.this.l111l11111I1l();
            } catch (Exception unused) {
            }
        }
    };

    private l111l11IlIlIl() {
        HandlerThread handlerThread = new HandlerThread("sm-vd-work");
        this.l11l111l1Il = handlerThread;
        handlerThread.start();
        this.l11l111l1I1l = new Handler(handlerThread.getLooper()) { // from class: com.ishumei.smantifraud.l1111l111111Il.l111l11IlIlIl.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                try {
                    int i10 = message.what;
                    boolean z10 = true;
                    if (i10 == 0) {
                        l111l11IlIlIl l111l11ililil = l111l11IlIlIl.this;
                        JSONObject jSONObject = (JSONObject) message.obj;
                        if (message.arg1 != 1) {
                            z10 = false;
                        }
                        l111l11IlIlIl.l1111l111111Il(l111l11ililil, jSONObject, z10);
                        return;
                    }
                    if (i10 == 1) {
                        l111l11IlIlIl.l1111l111111Il(l111l11IlIlIl.this, (Set) message.obj);
                        return;
                    }
                    if (i10 == 2) {
                        l111l11IlIlIl.l111l11111lIl(l111l11IlIlIl.this, (Set) message.obj);
                    } else {
                        if (i10 != 3) {
                            return;
                        }
                        l111l11IlIlIl l111l11ililil2 = l111l11IlIlIl.this;
                        l111l11ililil2.l111l11111I1l((Set<JSONObject>) l111l11ililil2.l111l1111l1Il());
                    }
                } catch (Exception unused) {
                }
            }
        };
        this.l11l111lI1l = new LinkedList();
        l111l11111Il l111l11111ilL111l11111lIl = l111l1111l1Il.l1111l111111Il().l111l11111lIl();
        this.l11l111lIll = l111l11111ilL111l11111lIl.l11l1111I11l();
        this.l11l11l1lIl = l111l11111ilL111l11111lIl.l11l1111lIIl() * 1000;
        this.l11l111I111l = new l11l1111I1l();
        this.l11l111ll11l = new com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il<>(50);
        this.l11l111ll1Il = new com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il<>(10);
        this.l11l111lll = new com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il<>(10);
        this.l11l111lllIl = new com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il<>(10);
        this.l11l111llI1l = new com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il<>(10);
        this.l111l111llIl = new com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il<>(10);
    }

    public static synchronized l111l11IlIlIl l1111l111111Il() {
        if (l11l111l11Il == null) {
            l11l111l11Il = new l111l11IlIlIl();
        }
        return l11l111l11Il;
    }

    static /* synthetic */ void l1111l111111Il(l111l11IlIlIl l111l11ililil, Set set) {
        if (set.isEmpty()) {
            return;
        }
        l111l11ililil.l11l111ll11l.l1111l111111Il((Set<JSONObject>) set, 2);
        l111l11ililil.l11l111ll1Il.l1111l111111Il((Set<JSONObject>) set, 2);
        l111l11ililil.l11l111lll.l1111l111111Il((Set<JSONObject>) set, 2);
        l111l11ililil.l11l111lllIl.l1111l111111Il((Set<JSONObject>) set, 2);
        l111l11ililil.l11l111llI1l.l1111l111111Il((Set<JSONObject>) set, 2);
        l111l11ililil.l111l111llIl.l1111l111111Il((Set<JSONObject>) set, 2);
    }

    static /* synthetic */ void l1111l111111Il(l111l11IlIlIl l111l11ililil, JSONObject jSONObject, boolean z10) {
        if (jSONObject != null) {
            if (z10 || l111l11ililil.l111l111lIlll < l111l11ililil.l11l111lIll) {
                String strOptString = jSONObject.optString("eventId", "");
                strOptString.hashCode();
                switch (strOptString) {
                    case "gpsevent":
                        l111l11ililil.l11l111lllIl.l1111l111111Il(jSONObject, 0);
                        if (!z10 && l111l11ililil.l11l111lllIl.l1111l111111Il(0, 2) < 10) {
                            return;
                        }
                        break;
                    case "textinput":
                        l111l11ililil.l11l111llI1l.l1111l111111Il(jSONObject, 0);
                        if (!z10 && l111l11ililil.l11l111llI1l.l1111l111111Il(0, 2) < 10) {
                            return;
                        }
                        break;
                    case "screenrecord":
                        l111l11ililil.l11l111ll1Il.l1111l111111Il(jSONObject, 0);
                        if (!z10 && l111l11ililil.l11l111ll1Il.l1111l111111Il(0, 2) < 10) {
                            return;
                        }
                        break;
                    case "wevent":
                        l111l11ililil.l11l111ll11l.l1111l111111Il(jSONObject, 0);
                        if (!z10 && l111l11ililil.l11l111ll11l.l1111l111111Il(0, 2) < 50) {
                            return;
                        }
                        break;
                    case "screenshot":
                        l111l11ililil.l11l111lll.l1111l111111Il(jSONObject, 0);
                        if (!z10 && l111l11ililil.l11l111lll.l1111l111111Il(0, 2) < 10) {
                            return;
                        }
                        break;
                    case "mem":
                        l111l11ililil.l111l111llIl.l1111l111111Il(jSONObject, 0);
                        if (z10 || l111l11ililil.l111l111llIl.l1111l111111Il(0, 2) >= 10) {
                            l111l11ililil.l111l11111I1l(l111l11ililil.l111l1111l1Il());
                            return;
                        }
                        return;
                    default:
                        return;
                }
                l111l11ililil.l111l11111I1l(l111l11ililil.l111l1111l1Il());
            }
        }
    }

    private void l1111l111111Il(Set<JSONObject> set) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        messageObtain.obj = set;
        this.l11l111l1I1l.sendMessage(messageObtain);
    }

    private void l1111l111111Il(JSONObject jSONObject, boolean z10) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 0;
        messageObtain.obj = jSONObject;
        messageObtain.arg1 = z10 ? 1 : 0;
        this.l11l111l1I1l.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l111l11111I1l() {
        Message messageObtain = Message.obtain();
        messageObtain.what = 3;
        this.l11l111l1I1l.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l111l11111I1l(final Set<JSONObject> set) {
        if (set.isEmpty()) {
            return;
        }
        try {
            String strL1111l111111Il = l11l111l11Il.l1111l111111Il(set, null, true);
            if (!set.isEmpty()) {
                this.l11l111ll11l.l1111l111111Il(set, 1);
                this.l11l111ll1Il.l1111l111111Il(set, 1);
                this.l11l111lll.l1111l111111Il(set, 1);
                this.l11l111lllIl.l1111l111111Il(set, 1);
                this.l11l111llI1l.l1111l111111Il(set, 1);
                this.l111l111llIl.l1111l111111Il(set, 1);
            }
            this.l111l111lIlll++;
            com.ishumei.smantifraud.l111l11111Il.l111l1111llIl<Object> l111l1111llil = new com.ishumei.smantifraud.l111l11111Il.l111l1111llIl<Object>(1, SmAntiFraud.option.l11l1111Il(), SmAntiFraud.option.l11l1111Il1l(), strL1111l111111Il, new com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l11l1111lIIl.l111l11111lIl<Object>() { // from class: com.ishumei.smantifraud.l1111l111111Il.l111l11IlIlIl.4
                @Override // com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l11l1111lIIl.l111l11111lIl
                public final void l1111l111111Il(Object obj) {
                    l111l11IlIlIl.this.l11l111l1lll.removeCallbacksAndMessages(null);
                    l111l11IlIlIl.this.l11l111l1lll.postDelayed(l111l11IlIlIl.this.l111l111I1l, l111l11IlIlIl.this.l11l11l1lIl);
                    l111l11IlIlIl.l111l11111Il(l111l11IlIlIl.this, set);
                }
            }, new com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l11l1111lIIl.l1111l111111Il() { // from class: com.ishumei.smantifraud.l1111l111111Il.l111l11IlIlIl.5
                @Override // com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l11l1111lIIl.l1111l111111Il
                public final void l1111l111111Il(com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l11l1111I1ll l11l1111i1ll) {
                    l111l11IlIlIl.l111l1111l1Il(l111l11IlIlIl.this, set);
                }
            }) { // from class: com.ishumei.smantifraud.l1111l111111Il.l111l11IlIlIl.6
                {
                    super(1, str, str, strL1111l111111Il, l111l11111lil, l1111l111111il);
                }

                @Override // com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l1111l111111Il.l111l1111llIl, com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111lI1l
                public final com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l11l1111lIIl<Object> l1111l111111Il(com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111llIl l111l1111llil2) {
                    return com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l11l1111lIIl.l1111l111111Il(new Object());
                }
            };
            l111l1111llil.l1111l111111Il((com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l11l1111I1l) new com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l1111l111111Il(2000, 1, 1.0f));
            com.ishumei.smantifraud.l111l11111Il.l111l1111l1Il.l1111l111111Il().l1111l111111Il(l111l1111llil);
        } catch (Exception unused) {
        }
    }

    private Set<JSONObject> l111l11111Il() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.l11l111ll11l.l1111l111111Il());
        hashSet.addAll(this.l11l111ll1Il.l1111l111111Il());
        hashSet.addAll(this.l11l111lll.l1111l111111Il());
        hashSet.addAll(this.l11l111lllIl.l1111l111111Il());
        hashSet.addAll(this.l11l111llI1l.l1111l111111Il());
        hashSet.addAll(this.l111l111llIl.l1111l111111Il());
        return hashSet;
    }

    static /* synthetic */ void l111l11111Il(l111l11IlIlIl l111l11ililil, Set set) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        messageObtain.obj = set;
        l111l11ililil.l11l111l1I1l.sendMessage(messageObtain);
    }

    private void l111l11111Il(Set<JSONObject> set) {
        if (set.isEmpty()) {
            return;
        }
        this.l11l111ll11l.l1111l111111Il(set, 1);
        this.l11l111ll1Il.l1111l111111Il(set, 1);
        this.l11l111lll.l1111l111111Il(set, 1);
        this.l11l111lllIl.l1111l111111Il(set, 1);
        this.l11l111llI1l.l1111l111111Il(set, 1);
        this.l111l111llIl.l1111l111111Il(set, 1);
    }

    static /* synthetic */ void l111l11111lIl(l111l11IlIlIl l111l11ililil, Set set) {
        if (set.isEmpty()) {
            return;
        }
        l111l11ililil.l11l111ll11l.l1111l111111Il((Set<JSONObject>) set);
        l111l11ililil.l11l111ll1Il.l1111l111111Il((Set<JSONObject>) set);
        l111l11ililil.l11l111lll.l1111l111111Il((Set<JSONObject>) set);
        l111l11ililil.l11l111lllIl.l1111l111111Il((Set<JSONObject>) set);
        l111l11ililil.l11l111llI1l.l1111l111111Il((Set<JSONObject>) set);
        l111l11ililil.l111l111llIl.l1111l111111Il((Set<JSONObject>) set);
    }

    static /* synthetic */ void l111l11111lIl(l111l11IlIlIl l111l11ililil, JSONObject jSONObject, boolean z10) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 0;
        messageObtain.obj = jSONObject;
        messageObtain.arg1 = z10 ? 1 : 0;
        l111l11ililil.l11l111l1I1l.sendMessage(messageObtain);
    }

    private void l111l11111lIl(Set<JSONObject> set) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = set;
        this.l11l111l1I1l.sendMessage(messageObtain);
    }

    private void l111l11111lIl(JSONObject jSONObject, boolean z10) {
        if (jSONObject == null) {
            return;
        }
        if (z10 || this.l111l111lIlll < this.l11l111lIll) {
            String strOptString = jSONObject.optString("eventId", "");
            strOptString.hashCode();
            switch (strOptString) {
                case "gpsevent":
                    this.l11l111lllIl.l1111l111111Il(jSONObject, 0);
                    if (!z10 && this.l11l111lllIl.l1111l111111Il(0, 2) < 10) {
                        return;
                    }
                    break;
                case "textinput":
                    this.l11l111llI1l.l1111l111111Il(jSONObject, 0);
                    if (!z10 && this.l11l111llI1l.l1111l111111Il(0, 2) < 10) {
                        return;
                    }
                    break;
                case "screenrecord":
                    this.l11l111ll1Il.l1111l111111Il(jSONObject, 0);
                    if (!z10 && this.l11l111ll1Il.l1111l111111Il(0, 2) < 10) {
                        return;
                    }
                    break;
                case "wevent":
                    this.l11l111ll11l.l1111l111111Il(jSONObject, 0);
                    if (!z10 && this.l11l111ll11l.l1111l111111Il(0, 2) < 50) {
                        return;
                    }
                    break;
                case "screenshot":
                    this.l11l111lll.l1111l111111Il(jSONObject, 0);
                    if (!z10 && this.l11l111lll.l1111l111111Il(0, 2) < 10) {
                        return;
                    }
                    break;
                case "mem":
                    this.l111l111llIl.l1111l111111Il(jSONObject, 0);
                    if (z10 || this.l111l111llIl.l1111l111111Il(0, 2) >= 10) {
                        l111l11111I1l(l111l1111l1Il());
                        return;
                    }
                    return;
                default:
                    return;
            }
            l111l11111I1l(l111l1111l1Il());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Set<JSONObject> l111l1111l1Il() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.l11l111ll11l.l111l11111lIl(0, 2));
        hashSet.addAll(this.l11l111ll1Il.l111l11111lIl(0, 2));
        hashSet.addAll(this.l11l111lll.l111l11111lIl(0, 2));
        hashSet.addAll(this.l11l111lllIl.l111l11111lIl(0, 2));
        hashSet.addAll(this.l11l111llI1l.l111l11111lIl(0, 2));
        hashSet.addAll(this.l111l111llIl.l111l11111lIl(0, 2));
        return hashSet;
    }

    static /* synthetic */ void l111l1111l1Il(l111l11IlIlIl l111l11ililil, Set set) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = set;
        l111l11ililil.l11l111l1I1l.sendMessage(messageObtain);
    }

    private void l111l1111l1Il(Set<JSONObject> set) {
        if (set.isEmpty()) {
            return;
        }
        this.l11l111ll11l.l1111l111111Il(set);
        this.l11l111ll1Il.l1111l111111Il(set);
        this.l11l111lll.l1111l111111Il(set);
        this.l11l111lllIl.l1111l111111Il(set);
        this.l11l111llI1l.l1111l111111Il(set);
        this.l111l111llIl.l1111l111111Il(set);
    }

    private synchronized void l111l1111lI1l() {
        try {
            if (this.l111l11IlIlIl == null) {
                return;
            }
            Handler handler = this.l11l111l1lll;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.l111l11IlIlIl.quitSafely();
            this.l111l11IlIlIl = null;
        } catch (Exception unused) {
        }
    }

    private synchronized void l111l1111llIl() {
        if (this.l111l11IlIlIl != null) {
            return;
        }
        HandlerThread handlerThread = new HandlerThread("sm-vd-thread");
        this.l111l11IlIlIl = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(this.l111l11IlIlIl.getLooper());
        this.l11l111l1lll = handler;
        handler.postDelayed(this.l111l111I1l, this.l11l11l1lIl);
    }

    private void l111l1111llIl(Set<JSONObject> set) {
        if (set.isEmpty()) {
            return;
        }
        this.l11l111ll11l.l1111l111111Il(set, 2);
        this.l11l111ll1Il.l1111l111111Il(set, 2);
        this.l11l111lll.l1111l111111Il(set, 2);
        this.l11l111lllIl.l1111l111111Il(set, 2);
        this.l11l111llI1l.l1111l111111Il(set, 2);
        this.l111l111llIl.l1111l111111Il(set, 2);
    }

    public final void l1111l111111Il(AbsDetector absDetector) {
        if (absDetector == null) {
            return;
        }
        absDetector.register(this.l11l111I11l);
        try {
            Method declaredMethod = AbsDetector.class.getDeclaredMethod(d.f49798o0, new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(absDetector, new Object[0]);
            this.l111l111lIlll = 0;
        } catch (Exception unused) {
        }
        l111l1111llIl();
        this.l11l111lI1l.add(absDetector);
    }

    public final String l111l11111lIl() {
        l111l11111I1l();
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.l11l111ll11l.l1111l111111Il());
        hashSet.addAll(this.l11l111ll1Il.l1111l111111Il());
        hashSet.addAll(this.l11l111lll.l1111l111111Il());
        hashSet.addAll(this.l11l111lllIl.l1111l111111Il());
        hashSet.addAll(this.l11l111llI1l.l1111l111111Il());
        hashSet.addAll(this.l111l111llIl.l1111l111111Il());
        return l11l111l11Il.l1111l111111Il(hashSet, this.l11l111I111l.l1111l111111Il(), false);
    }

    public final void l111l11111lIl(AbsDetector absDetector) {
        if (absDetector == null) {
            return;
        }
        absDetector.unregister();
        try {
            Method declaredMethod = AbsDetector.class.getDeclaredMethod("stop", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(absDetector, new Object[0]);
        } catch (Exception unused) {
        }
        this.l11l111lI1l.remove(absDetector);
        if (this.l11l111lI1l.isEmpty()) {
            l111l1111lI1l();
        }
    }
}
