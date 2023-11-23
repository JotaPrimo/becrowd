package br.com.classes;


import org.junit.Assert;
import org.junit.Test;

public class ExtremelyBasicTest {

   @Test
    public void somarValores() {
    ExtremelyBasic extremelyBasic = new ExtremelyBasic(10, 9);
       Assert.assertEquals("X = 19", extremelyBasic.getX());
   }

   @Test
   public void somarValoresCaseTwo() {
        ExtremelyBasic extremelyBasic = new ExtremelyBasic(-10, 4);
        Assert.assertEquals("X = -6", extremelyBasic.getX());
    }

    @Test
    public void somarValoresTree() {
        ExtremelyBasic extremelyBasic = new ExtremelyBasic(15, -7);
        Assert.assertEquals("X = 8", extremelyBasic.getX());
    }

}