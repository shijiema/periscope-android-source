// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.pqc.jcajce.provider.mceliece;

import org.spongycastle.crypto.digests.SHA512Digest;
import org.spongycastle.pqc.crypto.mceliece.McEliecePointchevalCipher;

// Referenced classes of package org.spongycastle.pqc.jcajce.provider.mceliece:
//            McEliecePointchevalCipherSpi

public static class  extends McEliecePointchevalCipherSpi
{

    public ()
    {
        super(new SHA512Digest(), new McEliecePointchevalCipher());
    }
}
