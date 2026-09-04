package com.google.android.exoplayer2.source.dash.manifest;

import android.net.Uri;
import androidx.annotation.p0;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.offline.z;
import com.google.android.exoplayer2.util.u0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: DashManifest.java */
/* JADX INFO: loaded from: classes7.dex */
public class c implements z<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f47873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f47874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f47875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f47876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f47877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f47878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f47879g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f47880h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    public final o f47881i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    public final l f47882j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    public final Uri f47883k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    public final h f47884l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List<g> f47885m;

    public c(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, @p0 h hVar, @p0 o oVar, @p0 l lVar, @p0 Uri uri, List<g> list) {
        this.f47873a = j10;
        this.f47874b = j11;
        this.f47875c = j12;
        this.f47876d = z10;
        this.f47877e = j13;
        this.f47878f = j14;
        this.f47879g = j15;
        this.f47880h = j16;
        this.f47884l = hVar;
        this.f47881i = oVar;
        this.f47883k = uri;
        this.f47882j = lVar;
        this.f47885m = list == null ? Collections.emptyList() : list;
    }

    private static ArrayList<a> c(List<a> list, LinkedList<StreamKey> linkedList) {
        StreamKey streamKeyPoll = linkedList.poll();
        int i10 = streamKeyPoll.f47146b;
        ArrayList<a> arrayList = new ArrayList<>();
        do {
            int i11 = streamKeyPoll.f47147c;
            a aVar = list.get(i11);
            List<j> list2 = aVar.f47863c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add(list2.get(streamKeyPoll.f47148d));
                streamKeyPoll = linkedList.poll();
                if (streamKeyPoll.f47146b != i10) {
                    break;
                }
            } while (streamKeyPoll.f47147c == i11);
            arrayList.add(new a(aVar.f47861a, aVar.f47862b, arrayList2, aVar.f47864d, aVar.f47865e, aVar.f47866f));
        } while (streamKeyPoll.f47146b == i10);
        linkedList.addFirst(streamKeyPoll);
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.offline.z
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final c a(List<StreamKey> list) {
        long j10;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new StreamKey(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j11 = 0;
        int i10 = 0;
        while (true) {
            int iE = e();
            j10 = com.google.android.exoplayer2.j.f46377b;
            if (i10 >= iE) {
                break;
            }
            if (((StreamKey) linkedList.peek()).f47146b != i10) {
                long jF = f(i10);
                if (jF != com.google.android.exoplayer2.j.f46377b) {
                    j11 += jF;
                }
            } else {
                g gVarD = d(i10);
                arrayList.add(new g(gVarD.f47907a, gVarD.f47908b - j11, c(gVarD.f47909c, linkedList), gVarD.f47910d));
            }
            i10++;
        }
        long j12 = this.f47874b;
        if (j12 != com.google.android.exoplayer2.j.f46377b) {
            j10 = j12 - j11;
        }
        return new c(this.f47873a, j10, this.f47875c, this.f47876d, this.f47877e, this.f47878f, this.f47879g, this.f47880h, this.f47884l, this.f47881i, this.f47882j, this.f47883k, arrayList);
    }

    public final g d(int i10) {
        return this.f47885m.get(i10);
    }

    public final int e() {
        return this.f47885m.size();
    }

    public final long f(int i10) {
        if (i10 != this.f47885m.size() - 1) {
            return this.f47885m.get(i10 + 1).f47908b - this.f47885m.get(i10).f47908b;
        }
        long j10 = this.f47874b;
        return j10 == com.google.android.exoplayer2.j.f46377b ? com.google.android.exoplayer2.j.f46377b : j10 - this.f47885m.get(i10).f47908b;
    }

    public final long g(int i10) {
        return u0.U0(f(i10));
    }
}
