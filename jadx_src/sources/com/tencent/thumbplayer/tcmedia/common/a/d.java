package com.tencent.thumbplayer.tcmedia.common.a;

import com.taobao.accs.common.Constants;

/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f102558a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f102559b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e f102560c = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f102561d = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C1017d f102562e = new C1017d();

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f102563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f102564b;

        public a() {
            a();
        }

        public void a() {
            this.f102563a = -1;
            this.f102564b = -1;
        }

        public void a(com.tencent.thumbplayer.tcmedia.common.a.a aVar) {
            aVar.a("av1hwdecoderprofile", this.f102563a);
            aVar.a("av1hwdecoderlevel", this.f102564b);
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f102566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f102567b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f102568c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f102569d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f102570e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f102571f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f102572g;

        public b() {
            a();
        }

        public void a() {
            this.f102566a = "";
            this.f102567b = -1;
            this.f102568c = -1;
            this.f102569d = "";
            this.f102570e = "";
            this.f102571f = "";
            this.f102572g = "";
        }

        public void a(com.tencent.thumbplayer.tcmedia.common.a.a aVar) {
            aVar.a("flowid", this.f102566a);
            aVar.a("appplatform", this.f102567b);
            aVar.a("apilevel", this.f102568c);
            aVar.a("osver", this.f102569d);
            aVar.a(Constants.KEY_MODEL, this.f102570e);
            aVar.a("serialno", this.f102571f);
            aVar.a("cpuname", this.f102572g);
        }
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f102574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f102575b;

        public c() {
            a();
        }

        public void a() {
            this.f102574a = -1;
            this.f102575b = -1;
        }

        public void a(com.tencent.thumbplayer.tcmedia.common.a.a aVar) {
            aVar.a("hevchwdecoderprofile", this.f102574a);
            aVar.a("hevchwdecoderlevel", this.f102575b);
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.common.a.d$d, reason: collision with other inner class name */
    public class C1017d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f102577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f102578b;

        public C1017d() {
            a();
        }

        public void a() {
            this.f102577a = -1;
            this.f102578b = -1;
        }

        public void a(com.tencent.thumbplayer.tcmedia.common.a.a aVar) {
            aVar.a("vp8hwdecoderprofile", this.f102577a);
            aVar.a("vp8hwdecoderlevel", this.f102578b);
        }
    }

    public class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f102580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f102581b;

        public e() {
            a();
        }

        public void a() {
            this.f102580a = -1;
            this.f102581b = -1;
        }

        public void a(com.tencent.thumbplayer.tcmedia.common.a.a aVar) {
            aVar.a("vp9hwdecoderprofile", this.f102580a);
            aVar.a("vp9hwdecoderlevel", this.f102581b);
        }
    }

    public b a() {
        return this.f102558a;
    }

    public a b() {
        return this.f102559b;
    }

    public e c() {
        return this.f102560c;
    }

    public C1017d d() {
        return this.f102562e;
    }

    public c e() {
        return this.f102561d;
    }
}
