// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.rsa;

import java.security.spec.PSSParameterSpec;
import org.spongycastle.crypto.engines.RSABlindedEngine;

// Referenced classes of package org.spongycastle.jcajce.provider.asymmetric.rsa:
//            PSSSignatureSpi

public static class Q extends PSSSignatureSpi
{

    public Q()
    {
        super(new RSABlindedEngine(), PSSParameterSpec.DEFAULT);
    }
}
