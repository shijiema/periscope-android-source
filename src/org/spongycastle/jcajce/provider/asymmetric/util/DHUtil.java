// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.util;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import org.spongycastle.crypto.params.DHParameters;
import org.spongycastle.crypto.params.DHPrivateKeyParameters;
import org.spongycastle.crypto.params.DHPublicKeyParameters;

public class DHUtil
{

    public DHUtil()
    {
    }

    public static DHPrivateKeyParameters _mth02CE(PrivateKey privatekey)
    {
        if (privatekey instanceof DHPrivateKey)
        {
            privatekey = (DHPrivateKey)privatekey;
            return new DHPrivateKeyParameters(privatekey.getX(), new DHParameters(privatekey.getParams().getP(), privatekey.getParams().getG(), null, privatekey.getParams().getL()));
        } else
        {
            throw new InvalidKeyException("can't identify DH private key.");
        }
    }

    public static DHPublicKeyParameters _mth02CE(PublicKey publickey)
    {
        if (publickey instanceof DHPublicKey)
        {
            publickey = (DHPublicKey)publickey;
            return new DHPublicKeyParameters(publickey.getY(), new DHParameters(publickey.getParams().getP(), publickey.getParams().getG(), null, publickey.getParams().getL()));
        } else
        {
            throw new InvalidKeyException("can't identify DH public key.");
        }
    }
}
