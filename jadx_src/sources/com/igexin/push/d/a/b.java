package com.igexin.push.d.a;

import com.igexin.a.a.b.a.a.o;
import com.igexin.a.a.b.c;
import com.igexin.a.a.b.d;
import com.igexin.a.a.d.a.e;
import com.igexin.push.d.c.f;
import com.igexin.push.util.EncryptUtils;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class b extends com.igexin.a.a.b.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f63800a = "com.igexin.push.d.a.b";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f63801b = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f63802g;

    b(String str) {
        super(str, true);
    }

    private byte a(o oVar) throws IOException {
        return (byte) b(oVar, 1);
    }

    public static com.igexin.a.a.b.b a() {
        b bVar = new b("socketProtocol");
        new a("command", bVar);
        return bVar;
    }

    private e a(d dVar, o oVar, com.igexin.push.d.c.e eVar) throws Exception {
        if (eVar.f63841h == 48) {
            return null;
        }
        byte bA = a(oVar);
        if (bA > 0) {
            a(oVar, bA);
        }
        eVar.f63839f = a(oVar);
        byte bA2 = a(oVar);
        eVar.f63848o = bA2;
        if (bA2 > 0) {
            eVar.f63847n = a(oVar, bA2);
        }
        if (eVar.f63838e == 0) {
            c.b().a(new f());
            c.b().c();
            return null;
        }
        byte[] bArrA = a(oVar, 11);
        int iD = com.igexin.a.a.b.e.d(bArrA, 0);
        if (iD <= f63801b) {
            f63801b = -1;
            throw new Exception("server packetId can't be less than previous");
        }
        f63801b = iD;
        int iD2 = com.igexin.a.a.b.e.d(bArrA, 4);
        short sB = com.igexin.a.a.b.e.b(bArrA, 8);
        int iA = com.igexin.a.a.b.e.a(bArrA, 10);
        com.igexin.push.d.c.a aVar = new com.igexin.push.d.c.a();
        aVar.f63812a = sB;
        aVar.f63813b = (byte) iA;
        aVar.f63817f = eVar.f63836c;
        aVar.f63818g = eVar.f63841h;
        if (sB > 0) {
            byte[] bArrA2 = a(oVar, sB);
            byte b10 = eVar.f63841h;
            if (b10 == 16) {
                bArrA2 = EncryptUtils.aesDecSocket(bArrA2, EncryptUtils.getIV(com.igexin.a.a.b.e.b(iD2)));
            } else {
                if (b10 != 32) {
                    if (b10 == 0) {
                    }
                    return null;
                }
                if (iA != 26) {
                    return null;
                }
                bArrA2 = EncryptUtils.altAesDecSocket(bArrA2, com.igexin.a.a.b.e.b(iD2));
            }
            byte b11 = eVar.f63840g;
            if (b11 != -128) {
                if (b11 == 0) {
                }
                return null;
            }
            bArrA2 = com.igexin.a.a.b.e.d(bArrA2);
            aVar.a(bArrA2);
            if (!Arrays.equals(eVar.f63847n, EncryptUtils.getSocketSignature(aVar, iD, iD2))) {
                com.igexin.a.a.c.b.a(f63800a + "|decode signature error!!!!", new Object[0]);
                return null;
            }
        } else if (sB < 0) {
            com.igexin.a.a.c.b.a(f63800a + "|data len < 0, error", new Object[0]);
            return null;
        }
        if (this.f63180d != null) {
            c.b().a(this.f63180d.c(dVar, aVar));
        }
        c.b().c();
        return null;
    }

    static com.igexin.push.d.c.e a(com.igexin.push.d.c.a aVar) {
        int i10;
        com.igexin.push.d.c.e eVar = new com.igexin.push.d.c.e();
        eVar.f63834a = 1944742139;
        eVar.a(aVar.f63814c);
        eVar.f63838e = aVar.f63813b > 0 ? 1 : 0;
        eVar.f63836c = 7;
        eVar.f63835b = 11;
        eVar.f63839f = aVar.f63815d;
        int length = 11 + EncryptUtils.getRSAKeyId().length;
        eVar.f63835b = length;
        if (aVar.f63812a <= 0) {
            if (eVar.f63841h == 0) {
                eVar.f63848o = 0;
                i10 = length + 0;
            }
            c.d();
            return eVar;
        }
        eVar.f63849p = EncryptUtils.getPacketId();
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        eVar.f63850q = iCurrentTimeMillis;
        byte[] socketSignature = EncryptUtils.getSocketSignature(aVar, eVar.f63849p, iCurrentTimeMillis);
        eVar.f63847n = socketSignature;
        int length2 = socketSignature.length;
        eVar.f63848o = length2;
        i10 = eVar.f63835b + length2;
        eVar.f63835b = i10;
        c.d();
        return eVar;
    }

    private byte[] a(o oVar, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        oVar.a(bArr);
        return bArr;
    }

    private int b(o oVar, int i10) throws IOException {
        byte[] bArrA = a(oVar, i10);
        if (i10 == 1) {
            return com.igexin.a.a.b.e.a(bArrA, 0);
        }
        if (i10 == 2) {
            return com.igexin.a.a.b.e.b(bArrA, 0);
        }
        if (i10 == 4) {
            return com.igexin.a.a.b.e.d(bArrA, 0);
        }
        return 0;
    }

    private e b(d dVar, o oVar, com.igexin.push.d.c.e eVar) throws Exception {
        byte bA;
        if (eVar.f63841h == 48 && (bA = a(oVar)) > 0) {
            this.f63802g = a(oVar, bA);
        }
        if (eVar.f63838e == 0) {
            c.b().a(new f());
        } else {
            byte[] bArrA = a(oVar, 3);
            short sB = com.igexin.a.a.b.e.b(bArrA, 0);
            int iA = com.igexin.a.a.b.e.a(bArrA, 2);
            com.igexin.push.d.c.a aVar = new com.igexin.push.d.c.a();
            aVar.f63812a = sB;
            aVar.f63813b = (byte) iA;
            aVar.f63817f = eVar.f63836c;
            if (iA != 26) {
                return null;
            }
            if (sB > 0) {
                byte[] bArrA2 = a(oVar, sB);
                if (eVar.f63841h == 48) {
                    byte[] bArr = this.f63802g;
                    bArrA2 = com.igexin.a.a.a.a.a(bArrA2, bArr == null ? c.b().a() : com.igexin.a.b.a.a(bArr));
                }
                byte b10 = eVar.f63840g;
                if (b10 == -128) {
                    bArrA2 = com.igexin.a.a.b.e.d(bArrA2);
                } else if (b10 != 0) {
                    return null;
                }
                aVar.a(bArrA2);
            }
            if (this.f63180d != null) {
                c.b().a(this.f63180d.c(dVar, aVar));
            }
        }
        c.b().c();
        return null;
    }

    @Override // com.igexin.a.a.b.b
    public Object a(d dVar, Object obj) throws Exception {
        int iC;
        byte[] bArr = null;
        if (obj instanceof com.igexin.push.d.c.a) {
            com.igexin.push.d.c.a aVar = (com.igexin.push.d.c.a) obj;
            com.igexin.push.d.c.e eVarA = a(aVar);
            if (aVar.f63813b > 0 && aVar.f63812a > 0) {
                if ((eVarA.f63840g & 192) == 128) {
                    aVar.a(com.igexin.a.a.b.e.c(aVar.f63816e));
                }
                byte b10 = eVarA.f63841h;
                if ((b10 & org.apache.tools.tar.c.F) == 16) {
                    byte[] iv = EncryptUtils.getIV(com.igexin.a.a.b.e.b(eVarA.f63850q));
                    if ((eVarA.f63839f & 16) != 16) {
                        aVar.a(EncryptUtils.aesEncSocket(aVar.f63816e, iv));
                    }
                } else if ((b10 & org.apache.tools.tar.c.F) != 0) {
                    if ((b10 & org.apache.tools.tar.c.F) == 48) {
                        com.igexin.a.a.c.b.a(f63800a + "|encry type = 0x30 not support", new Object[0]);
                        return null;
                    }
                    if ((b10 & org.apache.tools.tar.c.F) != 32) {
                        com.igexin.a.a.c.b.a(f63800a + "|encry type = " + (eVarA.f63841h & org.apache.tools.tar.c.F) + " not support", new Object[0]);
                        return null;
                    }
                    com.igexin.a.a.c.b.a(f63800a + "|encry type = 0x20 reserved", new Object[0]);
                }
            }
            bArr = new byte[eVarA.f63835b + (aVar.f63813b > 0 ? aVar.f63812a + 11 : 0)];
            int iA = com.igexin.a.a.b.e.a(1944742139, bArr, 0);
            int iC2 = iA + com.igexin.a.a.b.e.c(eVarA.f63835b, bArr, iA);
            int iC3 = iC2 + com.igexin.a.a.b.e.c(eVarA.f63836c, bArr, iC2);
            int iC4 = iC3 + com.igexin.a.a.b.e.c(eVarA.a(), bArr, iC3);
            int iC5 = iC4 + com.igexin.a.a.b.e.c(eVarA.f63838e, bArr, iC4);
            byte[] rSAKeyId = EncryptUtils.getRSAKeyId();
            int iC6 = iC5 + com.igexin.a.a.b.e.c(rSAKeyId.length, bArr, iC5);
            int iA2 = iC6 + com.igexin.a.a.b.e.a(rSAKeyId, 0, bArr, iC6, rSAKeyId.length);
            int iC7 = iA2 + com.igexin.a.a.b.e.c(eVarA.b(), bArr, iA2);
            if (aVar.f63812a > 0) {
                iC7 += com.igexin.a.a.b.e.c(eVarA.f63848o, bArr, iC7);
                iC = com.igexin.a.a.b.e.a(eVarA.f63847n, 0, bArr, iC7, eVarA.f63848o);
            } else {
                iC = com.igexin.a.a.b.e.c(0, bArr, iC7);
            }
            int i10 = iC7 + iC;
            if (aVar.f63813b > 0) {
                int iA3 = i10 + com.igexin.a.a.b.e.a(eVarA.f63849p, bArr, i10);
                int iA4 = iA3 + com.igexin.a.a.b.e.a(eVarA.f63850q, bArr, iA3);
                int iB = iA4 + com.igexin.a.a.b.e.b(aVar.f63812a, bArr, iA4);
                int iC8 = iB + com.igexin.a.a.b.e.c(aVar.f63813b, bArr, iB);
                int i11 = aVar.f63812a;
                if (i11 > 0) {
                    com.igexin.a.a.b.e.a(aVar.f63816e, 0, bArr, iC8, i11);
                }
            }
        }
        return bArr;
    }

    @Override // com.igexin.a.a.b.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e c(d dVar, Object obj) throws Exception {
        o oVar = obj instanceof o ? (o) obj : null;
        if (oVar == null) {
            com.igexin.a.a.c.b.a(f63800a + "|syncIns is null", new Object[0]);
            return null;
        }
        byte[] bArrA = a(oVar, 8);
        if (com.igexin.a.a.b.e.d(bArrA, 0) != 1944742139) {
            return null;
        }
        com.igexin.push.d.c.e eVar = new com.igexin.push.d.c.e();
        eVar.f63835b = bArrA[4] & 255;
        eVar.f63836c = bArrA[5] & 255;
        eVar.a(bArrA[6]);
        eVar.f63838e = bArrA[7] & 255;
        int i10 = eVar.f63836c;
        if (i10 == 7) {
            return a(dVar, oVar, eVar);
        }
        if (i10 == 1) {
            return b(dVar, oVar, eVar);
        }
        com.igexin.a.a.c.b.a(f63800a + "|server socket resp version = " + eVar.f63836c + ", not support !!!", new Object[0]);
        return null;
    }
}
