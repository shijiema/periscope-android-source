// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;


// Referenced classes of package org.spongycastle.crypto.params:
//            AsymmetricKeyParameter, DSAParameters

public class DSAKeyParameters extends AsymmetricKeyParameter
{

    public DSAParameters axf;

    public DSAKeyParameters(boolean flag, DSAParameters dsaparameters)
    {
        super(flag);
        axf = dsaparameters;
    }
}
