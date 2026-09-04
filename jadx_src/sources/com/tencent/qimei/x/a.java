package com.tencent.qimei.x;

import com.tencent.qimei.strategy.terminal.ITerminalStrategy;

/* JADX INFO: compiled from: DefaultTerminalStrategy.java */
/* JADX INFO: loaded from: classes4.dex */
public class a implements ITerminalStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f101509a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f101510b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f101511c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f101512d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f101513e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f101514f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f101515g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f101516h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f101517i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f101518j = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f101519k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f101520l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f101521m = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f101522n = "";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f101523o = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f101524p = "";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f101525q = "";

    public String a() {
        return this.f101522n;
    }

    public String b() {
        return this.f101525q;
    }

    public String c() {
        return this.f101524p;
    }

    public String d() {
        return this.f101520l;
    }

    public String e() {
        return this.f101521m;
    }

    @Override // com.tencent.qimei.strategy.terminal.ITerminalStrategy
    public ITerminalStrategy enableAndroidId(boolean z10) {
        this.f101512d = z10;
        return this;
    }

    @Override // com.tencent.qimei.strategy.terminal.ITerminalStrategy
    public ITerminalStrategy enableAudit(boolean z10) {
        this.f101516h = z10;
        return this;
    }

    @Override // com.tencent.qimei.strategy.terminal.ITerminalStrategy
    public ITerminalStrategy enableBuildModel(boolean z10) {
        this.f101517i = z10;
        return this;
    }

    @Override // com.tencent.qimei.strategy.terminal.ITerminalStrategy
    public ITerminalStrategy enableCid(boolean z10) {
        this.f101514f = z10;
        return this;
    }

    @Override // com.tencent.qimei.strategy.terminal.ITerminalStrategy
    public ITerminalStrategy enableIMEI(boolean z10) {
        this.f101510b = z10;
        return this;
    }

    @Override // com.tencent.qimei.strategy.terminal.ITerminalStrategy
    public ITerminalStrategy enableIMSI(boolean z10) {
        this.f101511c = z10;
        return this;
    }

    @Override // com.tencent.qimei.strategy.terminal.ITerminalStrategy
    public ITerminalStrategy enableMAC(boolean z10) {
        this.f101513e = z10;
        return this;
    }

    @Override // com.tencent.qimei.strategy.terminal.ITerminalStrategy
    public ITerminalStrategy enableOAID(boolean z10) {
        this.f101509a = z10;
        return this;
    }

    @Override // com.tencent.qimei.strategy.terminal.ITerminalStrategy
    public ITerminalStrategy enableProcessInfo(boolean z10) {
        this.f101515g = z10;
        return this;
    }

    public String f() {
        return this.f101523o;
    }

    public String g() {
        return this.f101519k;
    }

    public String h() {
        return this.f101518j;
    }

    public boolean i() {
        return this.f101512d;
    }

    public boolean j() {
        return this.f101516h;
    }

    public boolean k() {
        return this.f101517i;
    }

    public boolean l() {
        return this.f101514f;
    }

    public boolean m() {
        return this.f101510b;
    }

    public boolean n() {
        return this.f101511c;
    }

    public boolean o() {
        return this.f101513e;
    }

    public boolean p() {
        return this.f101509a;
    }

    public boolean q() {
        return this.f101515g;
    }

    @Override // com.tencent.qimei.strategy.terminal.ITerminalStrategy
    public ITerminalStrategy setAndroidId(String str) {
        this.f101522n = str;
        return this;
    }

    @Override // com.tencent.qimei.strategy.terminal.ITerminalStrategy
    public ITerminalStrategy setBuildModel(String str) {
        this.f101525q = str;
        return this;
    }

    @Override // com.tencent.qimei.strategy.terminal.ITerminalStrategy
    public ITerminalStrategy setCid(String str) {
        this.f101524p = str;
        return this;
    }

    @Override // com.tencent.qimei.strategy.terminal.ITerminalStrategy
    public ITerminalStrategy setIMEI(String str) {
        this.f101520l = str;
        return this;
    }

    @Override // com.tencent.qimei.strategy.terminal.ITerminalStrategy
    public ITerminalStrategy setIMSI(String str) {
        this.f101521m = str;
        return this;
    }

    @Override // com.tencent.qimei.strategy.terminal.ITerminalStrategy
    public ITerminalStrategy setMAC(String str) {
        this.f101523o = str;
        return this;
    }

    @Override // com.tencent.qimei.strategy.terminal.ITerminalStrategy
    public ITerminalStrategy setOAID(String str) {
        this.f101519k = str;
        return this;
    }

    @Override // com.tencent.qimei.strategy.terminal.ITerminalStrategy
    public ITerminalStrategy setReportDomain(String str) {
        this.f101518j = str;
        return this;
    }
}
