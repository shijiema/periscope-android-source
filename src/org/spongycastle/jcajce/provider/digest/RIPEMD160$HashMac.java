// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.digests.RIPEMD160Digest;
import org.spongycastle.crypto.macs.HMac;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;

// Referenced classes of package org.spongycastle.jcajce.provider.digest:
//            RIPEMD160

public static class nit> extends BaseMac
{

    public ()
    {
        super(new HMac(new RIPEMD160Digest()));
    }
}
