package com.umeng.analytics.pro;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: TDeserializer.java */
/* JADX INFO: loaded from: classes4.dex */
public class aw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bs f104548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final cf f104549b;

    public aw() {
        this(new bm.a());
    }

    public aw(bu buVar) {
        cf cfVar = new cf();
        this.f104549b = cfVar;
        this.f104548a = buVar.a(cfVar);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x009e  */
    private Object a(byte b10, byte[] bArr, ba baVar, ba... baVarArr) throws az {
        Object objValueOf;
        try {
            try {
                bn bnVarJ = j(bArr, baVar, baVarArr);
                if (bnVarJ == null) {
                    objValueOf = null;
                } else if (b10 != 2) {
                    if (b10 != 3) {
                        if (b10 != 4) {
                            if (b10 != 6) {
                                if (b10 != 8) {
                                    if (b10 != 100) {
                                        if (b10 != 10) {
                                            if (b10 == 11 && bnVarJ.f104628b == 11) {
                                                objValueOf = this.f104548a.z();
                                            } else {
                                                objValueOf = null;
                                            }
                                        } else if (bnVarJ.f104628b == 10) {
                                            objValueOf = Long.valueOf(this.f104548a.x());
                                        } else {
                                            objValueOf = null;
                                        }
                                    } else if (bnVarJ.f104628b == 11) {
                                        objValueOf = this.f104548a.A();
                                    } else {
                                        objValueOf = null;
                                    }
                                } else if (bnVarJ.f104628b == 8) {
                                    objValueOf = Integer.valueOf(this.f104548a.w());
                                } else {
                                    objValueOf = null;
                                }
                            } else if (bnVarJ.f104628b == 6) {
                                objValueOf = Short.valueOf(this.f104548a.v());
                            } else {
                                objValueOf = null;
                            }
                        } else if (bnVarJ.f104628b == 4) {
                            objValueOf = Double.valueOf(this.f104548a.y());
                        } else {
                            objValueOf = null;
                        }
                    } else if (bnVarJ.f104628b == 3) {
                        objValueOf = Byte.valueOf(this.f104548a.u());
                    } else {
                        objValueOf = null;
                    }
                } else if (bnVarJ.f104628b == 2) {
                    objValueOf = Boolean.valueOf(this.f104548a.t());
                } else {
                    objValueOf = null;
                }
                this.f104549b.e();
                this.f104548a.B();
                return objValueOf;
            } catch (Exception e10) {
                throw new az(e10);
            }
        } catch (Throwable th2) {
            this.f104549b.e();
            this.f104548a.B();
            throw th2;
        }
    }

    private bn j(byte[] bArr, ba baVar, ba... baVarArr) throws az {
        this.f104549b.a(bArr);
        int length = baVarArr.length + 1;
        ba[] baVarArr2 = new ba[length];
        int i10 = 0;
        baVarArr2[0] = baVar;
        int i11 = 0;
        while (i11 < baVarArr.length) {
            int i12 = i11 + 1;
            baVarArr2[i12] = baVarArr[i11];
            i11 = i12;
        }
        this.f104548a.j();
        bn bnVarL = null;
        while (i10 < length) {
            bnVarL = this.f104548a.l();
            if (bnVarL.f104628b == 0 || bnVarL.f104629c > baVarArr2[i10].a()) {
                return null;
            }
            if (bnVarL.f104629c != baVarArr2[i10].a()) {
                bv.a(this.f104548a, bnVarL.f104628b);
                this.f104548a.m();
            } else {
                i10++;
                if (i10 < length) {
                    this.f104548a.j();
                }
            }
        }
        return bnVarL;
    }

    public Boolean a(byte[] bArr, ba baVar, ba... baVarArr) throws az {
        return (Boolean) a((byte) 2, bArr, baVar, baVarArr);
    }

    public void a(at atVar, String str) throws az {
        a(atVar, str.getBytes());
    }

    public void a(at atVar, String str, String str2) throws az {
        try {
            try {
                a(atVar, str.getBytes(str2));
                this.f104548a.B();
            } catch (UnsupportedEncodingException unused) {
                throw new az("JVM DOES NOT SUPPORT ENCODING: " + str2);
            }
        } catch (Throwable th2) {
            this.f104548a.B();
            throw th2;
        }
    }

    public void a(at atVar, byte[] bArr) throws az {
        try {
            this.f104549b.a(bArr);
            atVar.read(this.f104548a);
        } finally {
            this.f104549b.e();
            this.f104548a.B();
        }
    }

    public void a(at atVar, byte[] bArr, ba baVar, ba... baVarArr) throws az {
        try {
            try {
                if (j(bArr, baVar, baVarArr) != null) {
                    atVar.read(this.f104548a);
                }
                this.f104549b.e();
                this.f104548a.B();
            } catch (Exception e10) {
                throw new az(e10);
            }
        } catch (Throwable th2) {
            this.f104549b.e();
            this.f104548a.B();
            throw th2;
        }
    }

    public Byte b(byte[] bArr, ba baVar, ba... baVarArr) throws az {
        return (Byte) a((byte) 3, bArr, baVar, baVarArr);
    }

    public Double c(byte[] bArr, ba baVar, ba... baVarArr) throws az {
        return (Double) a((byte) 4, bArr, baVar, baVarArr);
    }

    public Short d(byte[] bArr, ba baVar, ba... baVarArr) throws az {
        return (Short) a((byte) 6, bArr, baVar, baVarArr);
    }

    public Integer e(byte[] bArr, ba baVar, ba... baVarArr) throws az {
        return (Integer) a((byte) 8, bArr, baVar, baVarArr);
    }

    public Long f(byte[] bArr, ba baVar, ba... baVarArr) throws az {
        return (Long) a((byte) 10, bArr, baVar, baVarArr);
    }

    public String g(byte[] bArr, ba baVar, ba... baVarArr) throws az {
        return (String) a((byte) 11, bArr, baVar, baVarArr);
    }

    public ByteBuffer h(byte[] bArr, ba baVar, ba... baVarArr) throws az {
        return (ByteBuffer) a((byte) 100, bArr, baVar, baVarArr);
    }

    public Short i(byte[] bArr, ba baVar, ba... baVarArr) throws az {
        Short shValueOf;
        try {
            try {
                if (j(bArr, baVar, baVarArr) != null) {
                    this.f104548a.j();
                    shValueOf = Short.valueOf(this.f104548a.l().f104629c);
                } else {
                    shValueOf = null;
                }
                this.f104549b.e();
                this.f104548a.B();
                return shValueOf;
            } catch (Exception e10) {
                throw new az(e10);
            }
        } catch (Throwable th2) {
            this.f104549b.e();
            this.f104548a.B();
            throw th2;
        }
    }
}
