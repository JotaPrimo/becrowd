package br.com.classes;

import org.junit.Assert;
import org.junit.Test;

public class AreaOfCircleTest {

    @Test
    public void deve_ser_igual() {
        AreaOfCircle areaOfCircle = new AreaOfCircle(2.00);
        Assert.assertEquals(areaOfCircle.calculateArea(), "A=12.5664\n");
    }

    @Test
    public void deve_ser_igual_case_2() {
        AreaOfCircle areaOfCircle = new AreaOfCircle(100.64);
        Assert.assertEquals(areaOfCircle.calculateArea(), "A=31819.3103\n");
    }

    @Test
    public void deve_ser_igual_case_3() {
        AreaOfCircle areaOfCircle = new AreaOfCircle(150.00);
        Assert.assertEquals(areaOfCircle.calculateArea(), "A=70685.7750\n");
    }

    @Test
    public void nao_deve_ser_igual() {
        AreaOfCircle areaOfCircle = new AreaOfCircle(2.50);
        Assert.assertEquals(areaOfCircle.calculateArea(), "A=12.5664\n");
    }

    @Test
    public void deve_ser_igual_case_4() {
        AreaOfCircle areaOfCircle = new AreaOfCircle(2.008);
        Assert.assertEquals("A=12.5664\n", areaOfCircle.calculateArea());
    }


}