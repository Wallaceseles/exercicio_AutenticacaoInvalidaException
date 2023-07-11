
package br.edu.ifba.saj.ads.poo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestContas {

    @Test
    public void testDeposita() { 
        Conta c = new Conta();
        c.deposita(1000);
        assertEquals(c.getSaldo(), 1000, 0);
    }
    @Test
    public void testSaca() throws SaldoInsufucienteException { 
        Conta c = new Conta();
        c.deposita(1000);
        c.saca(100);
        assertEquals(c.getSaldo(), 900, 0);
        
    }
    @Test(expected = IllegalArgumentException.class)
    public void testDepositaIllegalArgumentException() { 
        Conta c = new Conta();
        c.deposita(-1);
    }
    @Test(expected = SaldoInsufucienteException.class)
    public void testSacaSaldoInsufucienteException() throws SaldoInsufucienteException { 
        Conta c = new Conta();
        c.saca(1);
    }
    
}
